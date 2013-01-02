package com.diazcanejaconsultores.tapestry.fullcalendar.data;

/**
 * Type of element items of the calendar header
 */
public enum CalendarHeaderItemType
{
	/*-------------------------
	|       V A L U E S       |
	==========================*/

	/**
	 * Text containing the current month/week/day
	 */
	TITLE("title"),

	/**
	 * Button for moving the calendar back one month/week/day
	 */
	PREV("prev"),

	/**
	 * Button for moving the calendar forward one month/week/day
	 */
	NEXT("next"),

	/**
	 * Button for moving the calendar back on year
	 */
	PREVYEAR("prevYear"),

	/**
	 * Button for moving the calendar forward one year
	 */
	NEXTYEAR("nextYear"),

	/**
	 * Button for moving the calendar to the current month/week/day
	 */
	TODAY("today"),

	/**
	 * Button for displaying the month view
	 */
	MONTH("month"),

	/**
	 * Button for displaying the week view (only events list)
	 */
	WEEK_BASIC("basicWeek"),

	/**
	 * Button for displaying the week view (agenda events list)
	 */
	WEEK_AGENDA("agendaWeek"),

	/**
	 * Button for displaying the day view (only events list)
	 */
	DAY_BASIC("basicDay"),

	/**
	 * Button for displaying the week view (agenda events list)
	 */
	DAY_AGENDA("agendaDay");

	/*-------------------------
	|       F I E L D S       |
	==========================*/

	/**
	 * Value of the type of element items of the calendar header
	 */
	private String value;

	/*-------------------------
	|  C O N S T R U C T O R  |
	==========================*/

	/**
	 * Constructor
	 */
	private CalendarHeaderItemType(String value)
	{
		this.value = value;
	}

	/*-------------------------
	|      M E T H O D S      |
	==========================*/

	/**
	 * Obtains the value of the type of element items of the calendar header
	 *
	 * @return  value of the type of element items of the calendar header
	 */
	public String getValue()
	{
		return value;
	}

	/**
	 * Sets the value of the type of element items of the calendar header
	 *
	 * @param value New value of the type of element items of the calendar header
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
