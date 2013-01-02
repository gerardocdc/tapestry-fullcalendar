package com.diazcanejaconsultores.tapestry.fullcalendar.data;

/**
 * Types of displaying items in calendar header
 */
public enum CalendarHeaderItemDisplay
{
	/*-------------------------
	|       V A L U E S       |
	==========================*/

	/**
	 * Items are displayed with a gap between them
	 */
	GAP(" "),

	/**
	 * Items are displayed adjacent one to another
	 */
	ADJACENT(",");

	/*-------------------------
	|       F I E L D S       |
	==========================*/

	/**
	 * Value of the types of displaying items in calendar header
	 */
	private String value;

	/*-------------------------
	|  C O N S T R U C T O R  |
	==========================*/

	/**
	 * Constructor
	 */
	private CalendarHeaderItemDisplay(String value)
	{
		this.value = value;
	}

	/*-------------------------
	|      M E T H O D S      |
	==========================*/

	/**
	 * Obtains the value of the types of displaying items in calendar header
	 *
	 * @return  value of the types of displaying items in calendar header
	 */
	public String getValue()
	{
		return value;
	}

	/**
	 * Sets the value of the types of displaying items in calendar header
	 *
	 * @param value New value of the types of displaying items in calendar header
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
