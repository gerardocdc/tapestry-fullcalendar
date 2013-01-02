package com.diazcanejaconsultores.tapestry.fullcalendar.utils;

import com.diazcanejaconsultores.tapestry.fullcalendar.CalendarConstants;
import com.diazcanejaconsultores.tapestry.fullcalendar.data.*;
import org.apache.tapestry5.ioc.Messages;
import org.apache.tapestry5.json.JSONObject;

import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * Calendar utils
 */
public class CalendarUtils
{
	/**
	 * Default date and hour format
	 */
	public static final String DEFAULT_DATE_HOUR_FORMAT = "yyyy/MM/dd HH:mm:ss";

	/**
	 * Delimiters for day and months names in calendar configuration
	 */
	public static final String CALENDAR_NAMES_SEPARATOR = ",";
	public static final String CALENDAR_NAME_DELIMITER = "'";
	public static final String CALENDAR_NAMES_BRACKET_INITIAL = "[";
	public static final String CALENDAR_NAMES_BRACKET_END = "]";

	/**
	 * Obtains the configuration item for calendar month names in the corresponding locale
	 *
	 * @param messages  Messages catalog
	 * @return  calendar month names configuration item
	 */
	public static String calendarMonthNames(Messages messages)
	{
		StringBuffer names = new StringBuffer();

		names.append(CALENDAR_NAMES_BRACKET_INITIAL);
		names.append(CALENDAR_NAME_DELIMITER).append(messages.get("calendar.monthNames.january")).append(CALENDAR_NAME_DELIMITER);
		names.append(CALENDAR_NAMES_SEPARATOR);
		names.append(CALENDAR_NAME_DELIMITER).append(messages.get("calendar.monthNames.february")).append(CALENDAR_NAME_DELIMITER);
		names.append(CALENDAR_NAMES_SEPARATOR);
		names.append(CALENDAR_NAME_DELIMITER).append(messages.get("calendar.monthNames.march")).append(CALENDAR_NAME_DELIMITER);
		names.append(CALENDAR_NAMES_SEPARATOR);
		names.append(CALENDAR_NAME_DELIMITER).append(messages.get("calendar.monthNames.april")).append(CALENDAR_NAME_DELIMITER);
		names.append(CALENDAR_NAMES_SEPARATOR);
		names.append(CALENDAR_NAME_DELIMITER).append(messages.get("calendar.monthNames.may")).append(CALENDAR_NAME_DELIMITER);
		names.append(CALENDAR_NAMES_SEPARATOR);
		names.append(CALENDAR_NAME_DELIMITER).append(messages.get("calendar.monthNames.june")).append(CALENDAR_NAME_DELIMITER);
		names.append(CALENDAR_NAMES_SEPARATOR);
		names.append(CALENDAR_NAME_DELIMITER).append(messages.get("calendar.monthNames.july")).append(CALENDAR_NAME_DELIMITER);
		names.append(CALENDAR_NAMES_SEPARATOR);
		names.append(CALENDAR_NAME_DELIMITER).append(messages.get("calendar.monthNames.august")).append(CALENDAR_NAME_DELIMITER);
		names.append(CALENDAR_NAMES_SEPARATOR);
		names.append(CALENDAR_NAME_DELIMITER).append(messages.get("calendar.monthNames.september")).append(CALENDAR_NAME_DELIMITER);
		names.append(CALENDAR_NAMES_SEPARATOR);
		names.append(CALENDAR_NAME_DELIMITER).append(messages.get("calendar.monthNames.october")).append(CALENDAR_NAME_DELIMITER);
		names.append(CALENDAR_NAMES_SEPARATOR);
		names.append(CALENDAR_NAME_DELIMITER).append(messages.get("calendar.monthNames.november")).append(CALENDAR_NAME_DELIMITER);
		names.append(CALENDAR_NAMES_SEPARATOR);
		names.append(CALENDAR_NAME_DELIMITER).append(messages.get("calendar.monthNames.december")).append(CALENDAR_NAME_DELIMITER);
		names.append(CALENDAR_NAMES_BRACKET_END);

		return names.toString();
	}

	/**
	 * Obtains the configuration item for calendar month short names in the corresponding locale
	 *
	 * @param messages  Messages catalog
	 * @return  calendar month short names configuration item
	 */
	public static String calendarMonthShortNames(Messages messages)
	{
		StringBuffer names = new StringBuffer();

		names.append(CALENDAR_NAMES_BRACKET_INITIAL);
		names.append(CALENDAR_NAME_DELIMITER).append(messages.get("calendar.monthNamesShort.january")).append(CALENDAR_NAME_DELIMITER);
		names.append(CALENDAR_NAMES_SEPARATOR);
		names.append(CALENDAR_NAME_DELIMITER).append(messages.get("calendar.monthNamesShort.february")).append(CALENDAR_NAME_DELIMITER);
		names.append(CALENDAR_NAMES_SEPARATOR);
		names.append(CALENDAR_NAME_DELIMITER).append(messages.get("calendar.monthNamesShort.march")).append(CALENDAR_NAME_DELIMITER);
		names.append(CALENDAR_NAMES_SEPARATOR);
		names.append(CALENDAR_NAME_DELIMITER).append(messages.get("calendar.monthNamesShort.april")).append(CALENDAR_NAME_DELIMITER);
		names.append(CALENDAR_NAMES_SEPARATOR);
		names.append(CALENDAR_NAME_DELIMITER).append(messages.get("calendar.monthNamesShort.may")).append(CALENDAR_NAME_DELIMITER);
		names.append(CALENDAR_NAMES_SEPARATOR);
		names.append(CALENDAR_NAME_DELIMITER).append(messages.get("calendar.monthNamesShort.june")).append(CALENDAR_NAME_DELIMITER);
		names.append(CALENDAR_NAMES_SEPARATOR);
		names.append(CALENDAR_NAME_DELIMITER).append(messages.get("calendar.monthNamesShort.july")).append(CALENDAR_NAME_DELIMITER);
		names.append(CALENDAR_NAMES_SEPARATOR);
		names.append(CALENDAR_NAME_DELIMITER).append(messages.get("calendar.monthNamesShort.august")).append(CALENDAR_NAME_DELIMITER);
		names.append(CALENDAR_NAMES_SEPARATOR);
		names.append(CALENDAR_NAME_DELIMITER).append(messages.get("calendar.monthNamesShort.september")).append(CALENDAR_NAME_DELIMITER);
		names.append(CALENDAR_NAMES_SEPARATOR);
		names.append(CALENDAR_NAME_DELIMITER).append(messages.get("calendar.monthNamesShort.october")).append(CALENDAR_NAME_DELIMITER);
		names.append(CALENDAR_NAMES_SEPARATOR);
		names.append(CALENDAR_NAME_DELIMITER).append(messages.get("calendar.monthNamesShort.november")).append(CALENDAR_NAME_DELIMITER);
		names.append(CALENDAR_NAMES_SEPARATOR);
		names.append(CALENDAR_NAME_DELIMITER).append(messages.get("calendar.monthNamesShort.december")).append(CALENDAR_NAME_DELIMITER);
		names.append(CALENDAR_NAMES_BRACKET_END);

		return names.toString();
	}

	/**
	 * Obtains the configuration item for calendar day names in the corresponding locale
	 *
	 * @param messages  Messages catalog
	 * @return  calendar day names configuration item
	 */
	public static String calendarDayNames(Messages messages)
	{
		StringBuffer names = new StringBuffer();

		names.append(CALENDAR_NAMES_BRACKET_INITIAL);
		names.append(CALENDAR_NAME_DELIMITER).append(messages.get("calendar.dayNames.sunday")).append(CALENDAR_NAME_DELIMITER);
		names.append(CALENDAR_NAMES_SEPARATOR);
		names.append(CALENDAR_NAME_DELIMITER).append(messages.get("calendar.dayNames.monday")).append(CALENDAR_NAME_DELIMITER);
		names.append(CALENDAR_NAMES_SEPARATOR);
		names.append(CALENDAR_NAME_DELIMITER).append(messages.get("calendar.dayNames.tuesday")).append(CALENDAR_NAME_DELIMITER);
		names.append(CALENDAR_NAMES_SEPARATOR);
		names.append(CALENDAR_NAME_DELIMITER).append(messages.get("calendar.dayNames.wednesday")).append(CALENDAR_NAME_DELIMITER);
		names.append(CALENDAR_NAMES_SEPARATOR);
		names.append(CALENDAR_NAME_DELIMITER).append(messages.get("calendar.dayNames.thursday")).append(CALENDAR_NAME_DELIMITER);
		names.append(CALENDAR_NAMES_SEPARATOR);
		names.append(CALENDAR_NAME_DELIMITER).append(messages.get("calendar.dayNames.friday")).append(CALENDAR_NAME_DELIMITER);
		names.append(CALENDAR_NAMES_SEPARATOR);
		names.append(CALENDAR_NAME_DELIMITER).append(messages.get("calendar.dayNames.saturday")).append(CALENDAR_NAME_DELIMITER);
		names.append(CALENDAR_NAMES_BRACKET_END);

		return names.toString();
	}

	/**
	 * Obtains the configuration item for calendar day short names in the corresponding locale
	 *
	 * @param messages  Messages catalog
	 * @return  calendar day short names configuration item
	 */
	public static String calendarDayShortNames(Messages messages)
	{
		StringBuffer names = new StringBuffer();

		names.append(CALENDAR_NAMES_BRACKET_INITIAL);
		names.append(CALENDAR_NAME_DELIMITER).append(messages.get("calendar.dayNamesShort.sunday")).append(CALENDAR_NAME_DELIMITER);
		names.append(CALENDAR_NAMES_SEPARATOR);
		names.append(CALENDAR_NAME_DELIMITER).append(messages.get("calendar.dayNamesShort.monday")).append(CALENDAR_NAME_DELIMITER);
		names.append(CALENDAR_NAMES_SEPARATOR);
		names.append(CALENDAR_NAME_DELIMITER).append(messages.get("calendar.dayNamesShort.tuesday")).append(CALENDAR_NAME_DELIMITER);
		names.append(CALENDAR_NAMES_SEPARATOR);
		names.append(CALENDAR_NAME_DELIMITER).append(messages.get("calendar.dayNamesShort.wednesday")).append(CALENDAR_NAME_DELIMITER);
		names.append(CALENDAR_NAMES_SEPARATOR);
		names.append(CALENDAR_NAME_DELIMITER).append(messages.get("calendar.dayNamesShort.thursday")).append(CALENDAR_NAME_DELIMITER);
		names.append(CALENDAR_NAMES_SEPARATOR);
		names.append(CALENDAR_NAME_DELIMITER).append(messages.get("calendar.dayNamesShort.friday")).append(CALENDAR_NAME_DELIMITER);
		names.append(CALENDAR_NAMES_SEPARATOR);
		names.append(CALENDAR_NAME_DELIMITER).append(messages.get("calendar.dayNamesShort.saturday")).append(CALENDAR_NAME_DELIMITER);
		names.append(CALENDAR_NAMES_BRACKET_END);

		return names.toString();
	}

	/**
	 * Formats date with default date format
	 *
	 * @param date  date to format
	 * @return  date formatted
	 */
	public static String formatCalendar(Calendar date)
	{
		SimpleDateFormat formatter = new SimpleDateFormat(DEFAULT_DATE_HOUR_FORMAT);
		String str = formatter.format(date.getTime());
		return str;
	}

	/**
	 * Converts a color based in RGB into its hexadecimal value
	 *
	 * @param color color based in RGB
	 * @return  hexadecimal value of the color
	 */
	public static String convertHexColor(Color color)
	{
		return String.format("#%02x%02x%02x", color.getRed(), color.getGreen(), color.getBlue());
	}

	/**
	 * Formats the event entity into a JSON object representation
	 *
	 * @param event event to format
	 * @return  JSON representation of the event
	 */
	public static JSONObject eventFormatJSON(Event event)
	{
		JSONObject eventJSON = new JSONObject();
		if (event.getId() != null) eventJSON.put(CalendarConstants.EVENT_ID,event.getId());
		eventJSON.put(CalendarConstants.EVENT_TITLE,event.getTitle());
		if (event.getAllDay() != null) eventJSON.put(CalendarConstants.EVENT_ALLDAY,event.getAllDay());
		eventJSON.put(CalendarConstants.EVENT_START,CalendarUtils.formatCalendar(event.getStart()));
		if (event.getEnd() != null) eventJSON.put(CalendarConstants.EVENT_END,CalendarUtils.formatCalendar(event.getEnd()));
		if (event.getUrl() != null) eventJSON.put(CalendarConstants.EVENT_URL,event.getUrl());
		if (event.getEditable() != null) eventJSON.put(CalendarConstants.EVENT_EDITABLE,event.getEditable());
		if (event.getClassName() != null) eventJSON.put(CalendarConstants.EVENT_CLASSNAME,event.getClassName());
		if (event.getColor() != null) eventJSON.put(CalendarConstants.EVENT_COLOR,CalendarUtils.convertHexColor(event.getColor()));
		if (event.getBackgroundColor() != null) eventJSON.put(CalendarConstants.EVENT_BACKGROUNDCOLOR,CalendarUtils.convertHexColor(event.getBackgroundColor()));
		if (event.getBorderColor() != null) eventJSON.put(CalendarConstants.EVENT_BORDERCOLOR,CalendarUtils.convertHexColor(event.getBorderColor()));
		if (event.getTextColor() != null) eventJSON.put(CalendarConstants.EVENT_TEXTCOLOR,CalendarUtils.convertHexColor(event.getTextColor()));

		return eventJSON;
	}

	/**
	 * Formats the event source entity into a JSON object representation
	 *
	 * @param event event source to format
	 * @return  JSON representation of the event
	 */
	public static JSONObject eventSourceFormatJSON(EventSource event)
	{
		JSONObject eventJSON = new JSONObject();
		if (event.getId() != null) eventJSON.put(CalendarConstants.EVENT_ID,event.getId());
		if (event.getTitle() != null) eventJSON.put(CalendarConstants.EVENT_TITLE,event.getTitle());
		if (event.getAllDay() != null) eventJSON.put(CalendarConstants.EVENT_ALLDAY,event.getAllDay());
		if (event.getStart() != null) eventJSON.put(CalendarConstants.EVENT_START,CalendarUtils.formatCalendar(event.getStart()));
		if (event.getEnd() != null) eventJSON.put(CalendarConstants.EVENT_END,CalendarUtils.formatCalendar(event.getEnd()));
		eventJSON.put(CalendarConstants.EVENT_URL,event.getUrl());
		if (event.getEditable() != null) eventJSON.put(CalendarConstants.EVENT_EDITABLE,event.getEditable());
		if (event.getClassName() != null) eventJSON.put(CalendarConstants.EVENT_CLASSNAME,event.getClassName());
		if (event.getColor() != null) eventJSON.put(CalendarConstants.EVENT_COLOR,CalendarUtils.convertHexColor(event.getColor()));
		if (event.getBackgroundColor() != null) eventJSON.put(CalendarConstants.EVENT_BACKGROUNDCOLOR,CalendarUtils.convertHexColor(event.getBackgroundColor()));
		if (event.getBorderColor() != null) eventJSON.put(CalendarConstants.EVENT_BORDERCOLOR,CalendarUtils.convertHexColor(event.getBorderColor()));
		if (event.getTextColor() != null) eventJSON.put(CalendarConstants.EVENT_TEXTCOLOR,CalendarUtils.convertHexColor(event.getTextColor()));

		return eventJSON;
	}

	/**
	 * Formats the calendar header into a JSON object representation
	 *
	 * @param header    header source to formar
	 * @return  JSON representation of the header
	 */
	public static JSONObject headerFormatJSON(CalendarHeader header)
	{
		JSONObject headerJSON = new JSONObject();

		for (CalendarHeaderPosition position : CalendarHeaderPosition.values())
		{
			StringBuffer script = new StringBuffer();
			java.util.List<CalendarHeaderItem> items = header.getHeaderItemByPosition(position);
			for (CalendarHeaderItem item : items)
			{
				script.append(item.getType()).append(item.getDisplay());
			}
			if (script.length() != 0 )
			{
				script.deleteCharAt(script.length()-1);
			}
			headerJSON.put(position.getValue(),script.toString());
		}
		return headerJSON;
	}
}
