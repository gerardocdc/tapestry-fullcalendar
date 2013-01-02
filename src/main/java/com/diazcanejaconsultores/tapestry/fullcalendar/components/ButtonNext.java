package com.diazcanejaconsultores.tapestry.fullcalendar.components;

import com.diazcanejaconsultores.tapestry.fullcalendar.CalendarConstants;

/**
 * Next month/week/day calendar button
 *
 * Moves the calendar one step forward (either by a month, week, or day).
 * If the calendar is in month view, will move the calendar forward one month.
 * If the calendar is in basicWeek or agendaWeek, will move the calendar forward one week.
 * If the calendar is in basicDay or agendaDay, will move the calendar forward one day.
 */
public class ButtonNext extends AbstractButton
{
	/*-------------------------
	|      M E T H O D S      |
	==========================*/

	/**
	 * Obtains the function of the button
	 *
	 * @return  function of the button
	 */
	@Override
	protected String getButtonFunction()
	{
		return CalendarConstants.CALENDAR_BUTTON_FUNCTION_NEXT;
	}

	/**
	 * Obtains the text of the button. In case there is no value, a default message will be used
	 *
	 * @return  text of the button
	 */
	@Override
	protected String getButtonText()
	{
		return (getText() != null) ? getText() : getMessages().get("calendar.button.next");
	}
}
