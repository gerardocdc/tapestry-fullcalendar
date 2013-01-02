package com.diazcanejaconsultores.tapestry.fullcalendar.data;

/**
 * Type of calendars
 */
public enum CalendarType
{
	/*-------------------------
	|       V A L U E S       |
	==========================*/

	/**
	 * Month view
	 */
	MONTH("month"),

	/**
	 * Week view (only events list)
	 */
	WEEK_BASIC("basicWeek"),

	/**
	 * Week view (agenda events list)
	 */
	WEEK_AGENDA("agendaWeek"),

	/**
	 * Day view (only events list)
	 */
	DAY_BASIC("basicDay"),

	/**
	 * Week view (agenda events list)
	 */
	DAY_AGENDA("agendaDay");

	/*-------------------------
	|       F I E L D S       |
	==========================*/

	/**
	 * Value of the calendar type (according to FullCalendar jQuery plugin)
	 */
	private String value;

	/*-------------------------
	|  C O N S T R U C T O R  |
	==========================*/

	/**
	 * Constructor
	 */
	private CalendarType(String value)
	{
		this.value = value;
	}

	/*-------------------------
	|      M E T H O D S      |
	==========================*/

	/**
	 * Obtains the value of the calendar type
	 *
	 * @return  value of the calendar type
	 */
	public String getValue()
	{
		return value;
	}

	/**
	 * Sets the value of the calendar type
	 *
	 * @param value New value of the calendar type
	 */
	public void setValue(String value)
	{
		this.value = value;
	}

	/**
	 * Returns a string representation of the object.
	 *
	 * @return  a string representation of the object.
	 */
	public String toString()
	{
		return this.value;
	}
}
