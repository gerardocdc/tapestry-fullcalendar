package com.diazcanejaconsultores.tapestry.fullcalendar.data;

/**
 * Week mode display
 */
public enum CalendarWeekMode
{
	/*-------------------------
	|       V A L U E S       |
	==========================*/

	/**
	 * The calendar will always be 6 weeks tall. The height will always be the same.
	 */
	FIXED("fixed"),

	/**
	 * The calendar will have either 4, 5, or 6 weeks, depending on the month. The height of the weeks will stretch to fill the available height.
	 */
	LIQUID("liquid"),

	/**
	 * The calendar will have either 4, 5, or 6 weeks, depending on the month. Each week will have the same constant height.
	 */
	VARIABLE("variable");

	/*-------------------------
	|       F I E L D S       |
	==========================*/

	/**
	 * Value of the week mode display (according to FullCalendar jQuery plugin)
	 */
	private String value;

	/*-------------------------
	|  C O N S T R U C T O R  |
	==========================*/

	/**
	 * Constructor
	 */
	private CalendarWeekMode(String value)
	{
		this.value = value;
	}

	/*-------------------------
	|      M E T H O D S      |
	==========================*/

	/**
	 * Obtains the value of the week mode display
	 *
	 * @return  value of the week mode display
	 */
	public String getValue()
	{
		return value;
	}

	/**
	 * Sets the value of the week mode display
	 *
	 * @param value New value of the week mode display
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
