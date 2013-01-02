package com.diazcanejaconsultores.tapestry.fullcalendar.data;

/**
 * Position of calendar header items
 */
public enum CalendarHeaderPosition
{
	/*-------------------------
	|       V A L U E S       |
	==========================*/

	/**
	 * Left position in header
	 */
	LEFT("left"),

	/**
	 * Center position in header
	 */
	CENTER("center"),

	/**
	 * Right position in header
	 */
	RIGHT("right");

	/*-------------------------
	|       F I E L D S       |
	==========================*/

	/**
	 * Value of the position of calendar header items
	 */
	private String value;

	/*-------------------------
	|  C O N S T R U C T O R  |
	==========================*/

	/**
	 * Constructor
	 */
	private CalendarHeaderPosition(String value)
	{
		this.value = value;
	}

	/*-------------------------
	|      M E T H O D S      |
	==========================*/

	/**
	 * Obtains the value of the position of calendar header items
	 *
	 * @return  value of the position of calendar header items
	 */
	public String getValue()
	{
		return value;
	}

	/**
	 * Sets the value of the position of calendar header items
	 *
	 * @param value New value of the position of calendar header items
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
