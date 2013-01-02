package com.diazcanejaconsultores.tapestry.fullcalendar;

import com.diazcanejaconsultores.tapestry.fullcalendar.data.CalendarDay;
import com.diazcanejaconsultores.tapestry.fullcalendar.data.CalendarWeekMode;

/**
 * Calendar constants
 */
public class CalendarConstants
{
	/*----------------
	  Options
	----------------*/

	/**
	 * Displays the calendar header. <code>true</code> means the calendar displays the header and <code>false</code>
	 * means the calendar does not display the header.
	 */
	public static final Boolean CALENDAR_HEADER_SHOW = true;

	/**
	 * Day that each week begins
	 */
	public static final Integer CALENDAR_FIRST_DAY = CalendarDay.MONDAY;

	/**
	 * Displays the calendar in right-to-left mode. <code>true</code> means the calendar is displayed from right-to left
	 * and <code>false</code> means the calendar is displayed from left-to-right.
	 */
	public static final Boolean CALENDAR_RTL = false;

	/**
	 * Includes Saturday/Sunday columns in any of the calendar views. <code>true</code> means the calendar views includes
	 * Saturday/Sunday columns and <code>false</code> means means the calendar views does not include Saturday/Sunday columns.
	 */
	public static final Boolean CALENDAR_WEEKENDS = true;

	/**
	 * Determines the number of weeks displayed in a month view.
	 *
	 * @see com.diazcanejaconsultores.tapestry.fullcalendar.data.CalendarWeekMode
	 */
	public static final CalendarWeekMode CALENDAR_WEEKMODE = CalendarWeekMode.FIXED;

	/**
	 * Calendar views (day and week) are agenda type. <code>true</code> means day and week views are agenda type and
	 * <code>false</code> means day and week views are list type
	 */
	public static final Boolean CALENDAR_AGENDA = true;

	/**
	 * Determines if the "all-day" slot is displayed at the top of the calendar. <code>true</code> means the "all-day"
	 * slot is displayed at the top of the calendar and <code>false</code> means the "all-day" slot is not  displayed
	 * at the top of the calendar.
	 */
	public static final Boolean CALENDAR_ALLDAYSLOT = true;

	/**
	 * Text titling the "all-day" slot at the top of the calendar.
	 */
	public static final String CALENDAR_ALLDAYTEXT = "calendar.allday";

	/**
	 * Time slot size (in minutes).
	 */
	public static final Integer CALENDAR_SLOTMINUTES = 30;

	/**
	 * Length (in minutes) an event appears to be when it has an unspecified end date.
	 */
	public static final Integer CALENDAR_DEFAULTEVENTMINUTES = 60;

	/**
	 * First hour that will be displayed, even when the scrollbars have been scrolled all the way up.
	 * This can be a number like 5 (which means 5am), a string like '5:30' (which means 5:30am) or a string like '5:30am'
	 */
	public static final String CALENDAR_MIN_TIME = "8";

	/**
	 * Last hour (exclusively) that will be displayed, even when the scrollbars have been scrolled all the way down.
	 * This can be a number like 22 (which means 10pm), a string like '22:30' (which means 10:30pm) or a string like '10:30pm'.
	 */
	public static final String CALENDAR_MAX_TIME = "22";

	/**
	 * Calendar events are editable and may be clicked. <code>true</code> means events are editable and <code>false</code>
	 * means events are not evitable.
	 */
	public static final Boolean CALENDAR_EDITABLE = false;

	/*----------------
	  Format
	----------------*/

	public static final String CALENDAR_HEADER_DEFAULT = "{" +
			"left: 'prev,next'," +
			"center: 'title'," +
			"right: 'month,agendaWeek,agendaDay'" +
			"}";

	/*----------------
	  Format
	----------------*/

	/**
	 * Text that will be displayed in the header's title
	 */
	public static final String CALENDAR_FORMAT_TITLE = "{day: 'dddd, d MMMM  yyyy', month: 'MMMM yyyy', week: \"d[ yyyy]{ '&#8212;'[ MMMM] d MMMM yyyy}\"}";
	/**
	 * Time-text that will be displayed on each event
	 */
	public static final String CALENDAR_FORMAT_TIME = "\"H:mm '-' {H:mm}\"";

	/**
	 * Time-text that will be displayed on the calendar's column headings
	 */
	public static final String CALENDAR_FORMAT_COLUMN = "{day: 'dddd d', week: 'dddd d',month: 'dddd'}";

	/**
	 * Time-text that will be displayed on the vertical axis of the agenda views
	 */
	public static final String CALENDAR_FORMAT_AXIS = "\"h(:mm) tt\"";

	/*----------------
	  Events
	----------------*/

	/**
	 * Event Unique id number
	 */
	public static final String EVENT_ID = "id";

	/**
	 * Event title
	 */
	public static final String EVENT_TITLE = "title";

	/**
	 * Event occurs all-day long
	 */
	public static final String EVENT_ALLDAY = "allDay";

	/**
	 * Date/time an event begins
	 */
	public static final String EVENT_START = "start";

	/**
	 * Date/time an event ends
	 */
	public static final String EVENT_END = "end";

	/**
	 * URL that will be visited when this event is clicked by the user
	 */
	public static final String EVENT_URL = "url";

	/**
	 * Determines whether the events on the calendar can be modified
	 */
	public static final String EVENT_EDITABLE = "editable";

	/**
	 * CSS class (or array of classes) that will be attached to this event's element
	 */
	public static final String EVENT_CLASSNAME = "className";

	/**
	 * Background and border colors for the event
	 */
	public static final String EVENT_COLOR = "color";

	/**
	 * Background color for the event
	 */
	public static final String EVENT_BACKGROUNDCOLOR = "backgroundColor";

	/**
	 * Border color for the event
	 */
	public static final String EVENT_BORDERCOLOR = "borderColor";

	/**
	 * Text color for the event
	 */
	public static final String EVENT_TEXTCOLOR = "textColor";

	/*----------------
	  Events
	----------------*/

	/**
	 * Function of previous button
	 */
	public static final String CALENDAR_BUTTON_FUNCTION_PREV = "prev";

	/**
	 * Function of next button
	 */
	public static final String CALENDAR_BUTTON_FUNCTION_NEXT = "next";

	/**
	 * Function of previous year button
	 */
	public static final String CALENDAR_BUTTON_FUNCTION_PREVYEAR = "prevYear";

	/**
	 * Function of next year button
	 */
	public static final String CALENDAR_BUTTON_FUNCTION_NEXTYEAR = "nextYear";

	/**
	 * Function of today button
	 */
	public static final String CALENDAR_BUTTON_FUNCTION_TODAY = "today";

	/**
	 * Function of month calendar view button
	 */
	public static final String CALENDAR_BUTTON_FUNCTION_MONTH = "month";

	/**
	 * Function of week calendar view button
	 */
	public static final String CALENDAR_BUTTON_FUNCTION_WEEK = "agendaWeek";

	/**
	 * Function of day calendar view button
	 */
	public static final String CALENDAR_BUTTON_FUNCTION_DAY = "agendaDay";

	/**
	 * Button image size (height and width)
	 */
	public static final String CALENDAR_BUTTON_IMAGE_SIZE = "16px";

	/**
	 * Button image style
	 */
	public static final String CALENDAR_BUTTON_IMAGE_STYLE = "margin-top: 5px;";
}
