package com.diazcanejaconsultores.tapestry.fullcalendar.components;

import com.diazcanejaconsultores.tapestry.fullcalendar.data.CalendarType;

/**
 * Weely calendar
 */
public class Week extends AbstractCalendar
{
	/*-------------------------
	|      M E T H O D S      |
	==========================*/

	/**
	 * Obtains the type of calendar
	 *
	 * @see com.diazcanejaconsultores.tapestry.fullcalendar.data.CalendarType
	 *
	 * @return  type of calendar
	 */
	@Override
	protected CalendarType getCalendarType()
	{
		return (isAgenda()) ? CalendarType.WEEK_AGENDA : CalendarType.WEEK_BASIC;
	}

	/**
	 * Sets the script for the selected date showing in the calendar
	 *
	 * @return  javascript for selecting the date
	 */
	@Override
	protected String getJavaScriptSetDate()
	{
		StringBuffer script = new StringBuffer();
		script.append(SCRIPT_CALENDAR_YEAR).append(getYear());
		script.append(SCRIPT_CALENDAR_SEPARATOR);
		script.append(SCRIPT_CALENDAR_MONTH).append(getMonth());
		script.append(SCRIPT_CALENDAR_SEPARATOR);
		script.append(SCRIPT_CALENDAR_DAY).append(getDay());
		script.append(SCRIPT_CALENDAR_SEPARATOR);
		return script.toString();
	}
}