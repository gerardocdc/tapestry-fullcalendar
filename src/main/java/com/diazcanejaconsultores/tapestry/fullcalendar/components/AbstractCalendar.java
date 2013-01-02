package com.diazcanejaconsultores.tapestry.fullcalendar.components;

import com.diazcanejaconsultores.tapestry.fullcalendar.CalendarConstants;
import com.diazcanejaconsultores.tapestry.fullcalendar.data.*;
import com.diazcanejaconsultores.tapestry.fullcalendar.utils.CalendarUtils;
import org.apache.tapestry5.BindingConstants;
import org.apache.tapestry5.MarkupWriter;
import org.apache.tapestry5.annotations.*;
import org.apache.tapestry5.ioc.Messages;
import org.apache.tapestry5.ioc.annotations.Inject;
import org.apache.tapestry5.ioc.annotations.Symbol;
import org.apache.tapestry5.json.JSONArray;
import org.apache.tapestry5.json.JSONObject;
import org.apache.tapestry5.services.javascript.JavaScriptSupport;
import org.got5.tapestry5.jquery.JQuerySymbolConstants;

import java.util.Calendar;
import java.util.List;

/**
 * Abstract calendar based in FullCalendar jQuery plugin {@link: http://arshaw.com/fullcalendar/}
 */
@Import(library={"js/fullcalendar/fullcalendar.min.js","js/fullcalendar/gcal.js"},stylesheet = {"js/fullcalendar/fullcalendar.css","calendar.css"})
public abstract class AbstractCalendar
{
	/*-------------------------
	|   P A R A M E T E R S   |
	==========================*/

	/*----------------
	  Identification
	----------------*/

	/**
	 * The id used to generate a page-unique client-side identifier for the
	 * component. If a component renders multiple times, a suffix will be
	 * appended to the to id to ensure uniqueness.
	 */
	@Parameter(name = "clientId", required = true, value = "prop:componentResources.id", defaultPrefix = BindingConstants.LITERAL)
	private String clientId;

	/*----------------
	  Date
	----------------*/

	/**
	 * Day
	 */
	@Parameter(name = "day", required = false, defaultPrefix = BindingConstants.LITERAL)
	private Integer day;

	/**
	 * Month
	 */
	@Parameter(name = "month", required = false, defaultPrefix = BindingConstants.LITERAL)
	private Integer month;

	/**
	 * Year
	 */
	@Parameter(name = "year", required = false, defaultPrefix = BindingConstants.LITERAL)
	private Integer year;

	/*----------------
	  Options
	----------------*/

	/**
	 * Options of the calendar
	 */
	@Parameter(name = "options", required = false)
	private CalendarOptions options;

	/**
	 * Header of the calendar
	 */
	@Parameter(name = "header", required = false)
	private CalendarHeader header;

	/*----------------
	  Events
	----------------*/

	/**
	 * Events to be displayed in the calendar
	 */
	@Parameter(name = "events", required = false)
	private List<Event> events;

	/**
	 * Events sources to be displayed in the calendar
	 */
	@Parameter(name = "eventSources", required = false)
	private List<EventSource> eventSources;

	/*-------------------------
	|    C O N S T A N T S    |
	==========================*/

	public static final String SCRIPT_CALENDAR_SEPARATOR = ",\n";
	public static final String SCRIPT_CALENDAR_JQUERY_READY_INITIAL = "(document).ready(function() {";
	public static final String SCRIPT_CALENDAR_JQUERY_INSTANTIATE_INITIAL_INITIAL = "('#";
	public static final String SCRIPT_CALENDAR_JQUERY_INSTANTIATE_INITIAL_END = "').fullCalendar({";
	public static final String SCRIPT_CALENDAR_VIEW_INITIAL = "defaultView: '";
	public static final String SCRIPT_CALENDAR_VIEW_END = "'";
	public static final String SCRIPT_CALENDAR_YEAR = "year: ";
	public static final String SCRIPT_CALENDAR_MONTH = "month: ";
	public static final String SCRIPT_CALENDAR_DAY = "day: ";
	public static final String SCRIPT_CALENDAR_FIRSTDAY = "firstDay: ";
	public static final String SCRIPT_CALENDAR_MINTIME = "minTime: ";
	public static final String SCRIPT_CALENDAR_MAXTIME = "maxTime: ";
	public static final String SCRIPT_CALENDAR_RTL = "isRTL: ";
	public static final String SCRIPT_CALENDAR_WEEKENDS = "weekends: ";
	public static final String SCRIPT_CALENDAR_WEEKMODE_INITIAL = "weekMode: '";
	public static final String SCRIPT_CALENDAR_WEEKMODE_END = "'";
	public static final String SCRIPT_CALENDAR_ALLDAYSLOT = "allDaySlot: ";
	public static final String SCRIPT_CALENDAR_ALLDAYTEXT_INITIAL = "allDayText: '";
	public static final String SCRIPT_CALENDAR_ALLDAYTEXT_END = "'";
	public static final String SCRIPT_CALENDAR_SLOTMINUTES = "slotMinutes: ";
	public static final String SCRIPT_CALENDAR_DEFAULTEVENTMINUTES = "defaultEventMinutes: ";
	public static final String SCRIPT_CALENDAR_TIMEFORMAT = "timeFormat: " + CalendarConstants.CALENDAR_FORMAT_TIME;
	public static final String SCRIPT_CALENDAR_COLUMNFORMAT = "columnFormat: " + CalendarConstants.CALENDAR_FORMAT_COLUMN;
	public static final String SCRIPT_CALENDAR_TITLEFORMAT = "titleFormat: " + CalendarConstants.CALENDAR_FORMAT_TITLE;
	public static final String SCRIPT_CALENDAR_AXISFORMAT = "axisFormat: " + CalendarConstants.CALENDAR_FORMAT_AXIS;
	public static final String SCRIPT_CALENDAR_MONTHNAMES = "monthNames: ";
	public static final String SCRIPT_CALENDAR_MONTHNAMESSHORT = "monthNamesShort: ";
	public static final String SCRIPT_CALENDAR_DAYNAMES = "dayNames: ";
	public static final String SCRIPT_CALENDAR_DAYNAMESSHORT = "dayNamesShort: ";
	public static final String SCRIPT_CALENDAR_EDITABLE = "editable: ";

	public static final String SCRIPT_CALENDAR_HEADER = "header: ";
	public static final String SCRIPT_CALENDAR_HEADER_BLANK = "header: false";

	public static final String SCRIPT_CALENDAR_EVENTS = "events: ";
	public static final String SCRIPT_CALENDAR_EVENTSOURCES = "eventSources: ";

	public static final String SCRIPT_CALENDAR_LOADING_INITIAL = "loading: function(bool) {";
	public static final String SCRIPT_CALENDAR_LOADING_SHOW_INITIAL = "if (bool) ";
	public static final String SCRIPT_CALENDAR_LOADING_SHOW_END = "('#calendar-ajax-indicator').show();";
	public static final String SCRIPT_CALENDAR_LOADING_HIDE_INITIAL = "else ";
	public static final String SCRIPT_CALENDAR_LOADING_HIDE_END = "('#calendar-ajax-indicator').hide();";
	public static final String SCRIPT_CALENDAR_LOADING_END = "}";

	public static final String SCRIPT_CALENDAR_JQUERY_INSTANTIATE_END = "})";
	public static final String SCRIPT_CALENDAR_JQUERY_READY_END = "});";

	/*-------------------------
	|       F I E L D S       |
	==========================*/

	/**
	 * JavaScript service
	 */
	@Inject
	private JavaScriptSupport javaScriptSupport;

	/**
	 * Assigned client id (for identification purposes)
	 */
	@Property
	private String assignedClientId;

	/**
	 * Messages catalog.
	 */
	@Inject
	private Messages messages;

	/**
	 * jQuery alias
	 */
	@Inject
	@Symbol(JQuerySymbolConstants.JQUERY_ALIAS)
	private String jqueryAlias;

	/*-------------------------
	|      M E T H O D S      |
	==========================*/

	/**
	 * Event called when the component starts its render
	 */
	@SetupRender
	void setupRender()
	{
		// Identification
		assignedClientId = javaScriptSupport.allocateClientId(clientId);

		// Date
		final Calendar today = Calendar.getInstance();
		if (day == null) day = today.get(Calendar.DAY_OF_MONTH);
		if (month == null) month = today.get(Calendar.MONTH);
		if (year == null) year = today.get(Calendar.YEAR);

		// Options
		if (options == null)
		{
			options = new CalendarOptions(messages);
		}
	}

	/**
	 * Event called at the start of rendering the component
	 * @param writer    Markup write of the component
	 */
	@BeginRender
	void beginRender(MarkupWriter writer)
	{
	}

	/**
	 * Event called at the end of rendering the component
	 * @param writer    Markup write of the component
	 */
	@AfterRender
	void afterRender(MarkupWriter writer)
	{
		// Events
		JSONArray eventsJSON = new JSONArray();
		if (events != null)
		{
			for (Event event : events)
			{
				eventsJSON.put(CalendarUtils.eventFormatJSON(event));
			}
		}

		// Event sources
		JSONArray eventSourcesJSON = new JSONArray();
		if (eventSources != null)
		{
			for (EventSource source: eventSources)
			{
				eventSourcesJSON.put(CalendarUtils.eventSourceFormatJSON(source));
			}
		}

		// Header
		JSONObject headerJSON = new JSONObject();
		if (header != null)
		{
			headerJSON = CalendarUtils.headerFormatJSON(header);
		}

		StringBuffer script = new StringBuffer();

		script.append(jqueryAlias).append(SCRIPT_CALENDAR_JQUERY_READY_INITIAL);
		script.append(jqueryAlias).append(SCRIPT_CALENDAR_JQUERY_INSTANTIATE_INITIAL_INITIAL).append(assignedClientId).append(SCRIPT_CALENDAR_JQUERY_INSTANTIATE_INITIAL_END);

		script.append(SCRIPT_CALENDAR_VIEW_INITIAL).append(getCalendarType().toString()).append(SCRIPT_CALENDAR_VIEW_END);
		script.append(SCRIPT_CALENDAR_SEPARATOR);

		script.append(getJavaScriptSetDate());

		script.append(SCRIPT_CALENDAR_FIRSTDAY).append(options.getFirstDay());
		script.append(SCRIPT_CALENDAR_SEPARATOR);
		script.append(SCRIPT_CALENDAR_MINTIME).append(options.getMinTime());
		script.append(SCRIPT_CALENDAR_SEPARATOR);
		script.append(SCRIPT_CALENDAR_MAXTIME).append(options.getMaxTime());
		script.append(SCRIPT_CALENDAR_SEPARATOR);

		script.append(SCRIPT_CALENDAR_RTL).append(options.getRtl());
		script.append(SCRIPT_CALENDAR_SEPARATOR);

		script.append(SCRIPT_CALENDAR_WEEKENDS).append(options.getWeekends());
		script.append(SCRIPT_CALENDAR_SEPARATOR);

		script.append(SCRIPT_CALENDAR_WEEKMODE_INITIAL).append(options.getWeekmode().toString()).append(SCRIPT_CALENDAR_WEEKMODE_END);
		script.append(SCRIPT_CALENDAR_SEPARATOR);

		script.append(SCRIPT_CALENDAR_ALLDAYSLOT).append(options.getAllDaySlot());
		script.append(SCRIPT_CALENDAR_SEPARATOR);

		script.append(SCRIPT_CALENDAR_ALLDAYTEXT_INITIAL).append(options.getAllDayText()).append(SCRIPT_CALENDAR_ALLDAYTEXT_END);
		script.append(SCRIPT_CALENDAR_SEPARATOR);

		script.append(SCRIPT_CALENDAR_SLOTMINUTES).append(options.getSlotMinutes());
		script.append(SCRIPT_CALENDAR_SEPARATOR);

		script.append(SCRIPT_CALENDAR_DEFAULTEVENTMINUTES).append(options.getDefaultEventMinutes());
		script.append(SCRIPT_CALENDAR_SEPARATOR);

		script.append(SCRIPT_CALENDAR_TIMEFORMAT);
		script.append(SCRIPT_CALENDAR_SEPARATOR);
		script.append(SCRIPT_CALENDAR_COLUMNFORMAT);
		script.append(SCRIPT_CALENDAR_SEPARATOR);
		script.append(SCRIPT_CALENDAR_TITLEFORMAT);
		script.append(SCRIPT_CALENDAR_SEPARATOR);
		script.append(SCRIPT_CALENDAR_AXISFORMAT);
		script.append(SCRIPT_CALENDAR_SEPARATOR);

		script.append(SCRIPT_CALENDAR_MONTHNAMES).append(CalendarUtils.calendarMonthNames(messages));
		script.append(SCRIPT_CALENDAR_SEPARATOR);
		script.append(SCRIPT_CALENDAR_MONTHNAMESSHORT).append(CalendarUtils.calendarMonthShortNames(messages));
		script.append(SCRIPT_CALENDAR_SEPARATOR);
		script.append(SCRIPT_CALENDAR_DAYNAMES).append(CalendarUtils.calendarDayNames(messages));
		script.append(SCRIPT_CALENDAR_SEPARATOR);
		script.append(SCRIPT_CALENDAR_DAYNAMESSHORT).append(CalendarUtils.calendarDayShortNames(messages));
		script.append(SCRIPT_CALENDAR_SEPARATOR);

		script.append(SCRIPT_CALENDAR_EDITABLE).append(options.getEditable());
		script.append(SCRIPT_CALENDAR_SEPARATOR);

		if (options.getHeaderShow())
		{
			script.append(SCRIPT_CALENDAR_HEADER);
			if (header == null)
			{
				script.append(CalendarConstants.CALENDAR_HEADER_DEFAULT);
			} else {
				script.append(headerJSON);
			}
		} else {
			script.append(SCRIPT_CALENDAR_HEADER_BLANK);
		}
		script.append(SCRIPT_CALENDAR_SEPARATOR);

		script.append(SCRIPT_CALENDAR_EVENTSOURCES).append(eventSourcesJSON.toString());
		script.append(SCRIPT_CALENDAR_SEPARATOR);

		script.append(SCRIPT_CALENDAR_EVENTS).append(eventsJSON.toString());
		script.append(SCRIPT_CALENDAR_SEPARATOR);

		script.append(SCRIPT_CALENDAR_LOADING_INITIAL);
		script.append(SCRIPT_CALENDAR_LOADING_SHOW_INITIAL);
		script.append(jqueryAlias);
		script.append(SCRIPT_CALENDAR_LOADING_SHOW_END);
		script.append(SCRIPT_CALENDAR_LOADING_HIDE_INITIAL);
		script.append(jqueryAlias);
		script.append(SCRIPT_CALENDAR_LOADING_HIDE_END);
		script.append(SCRIPT_CALENDAR_LOADING_END);

		script.append(SCRIPT_CALENDAR_JQUERY_INSTANTIATE_END);
		script.append(SCRIPT_CALENDAR_JQUERY_READY_END);

		getJavaScriptSupport().addScript(script.toString());
	}

	/**
	 * Obtains the JavaScript service
	 *
	 * @return JavaScript service
	 */
	public JavaScriptSupport getJavaScriptSupport()
	{
		return javaScriptSupport;
	}

	/**
	 * Returns a unique id for the element. This value will be unique for any
	 * given rendering of a page. This value is intended for use as the id
	 * attribute of the client-side element, and will be used with any
	 * DHTML/Ajax related JavaScript.
	 *
	 * @return  client id
	 */
	public String getClientId()
	{
		return assignedClientId;
	}

	/**
	 * Obtains the day of the calendar
	 *
	 * @return  day of the calendar
	 */
	public Integer getDay()
	{
		return day;
	}

	/**
	 * Obtains the month of the calendar
	 *
	 * @return  month of the calendar
	 */
	public Integer getMonth()
	{
		return month;
	}

	/**
	 * Obtains the year of the calendar
	 *
	 * @return  year of the calendar
	 */
	public Integer getYear()
	{
		return year;
	}

	/**
	 * Calendar views (day and week) are agenda type
	 *
	 * @return  <code>true</code> means day and week views are agenda type and <code>false</code> means day and week views are list type
	 */
	public boolean isAgenda()
	{
		return options.getAgenda();
	}

	/**
	 * Obtains the type of calendar
	 *
	 * @see com.diazcanejaconsultores.tapestry.fullcalendar.data.CalendarType
	 *
	 * @return  type of calendar
	 */
	protected abstract CalendarType getCalendarType();

	/**
	 * Sets the script for the selected date showing in the calendar
	 *
	 * @return  javascript for selecting the date
	 */
	protected abstract String getJavaScriptSetDate();
}
