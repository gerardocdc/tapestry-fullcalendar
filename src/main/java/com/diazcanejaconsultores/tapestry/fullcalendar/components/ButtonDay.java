package com.diazcanejaconsultores.tapestry.fullcalendar.components;

import com.diazcanejaconsultores.tapestry.fullcalendar.CalendarConstants;

/**
 * Day calendar button
 *
 * Shows the day calendar
 */
public class ButtonDay extends AbstractButton
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
		return CalendarConstants.CALENDAR_BUTTON_FUNCTION_DAY;
	}

	/**
	 * Obtains the text of the button. In case there is no value, a default message will be used
	 *
	 * @return  text of the button
	 */
	@Override
	protected String getButtonText()
	{
		return (getText() != null) ? getText() : getMessages().get("calendar.button.day");
	}
}
