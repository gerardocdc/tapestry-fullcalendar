package com.diazcanejaconsultores.tapestry.fullcalendar.data;

/**
 * Items in calendar header
 */
public class CalendarHeaderItem
{
	/*--------------------------------------------
	|         C L A S S    F I E L D S          |
	============================================*/

	/**
	 * Position of calendar header item
	 */
	private CalendarHeaderPosition position;

	/**
	 * Type of element item of the calendar header
	 */
	private CalendarHeaderItemType type;

	/**
	 * Types of displaying item in calendar header
	 */
	private CalendarHeaderItemDisplay display;

	/*--------------------------------------------
	|          C O N S T R U C T O R            |
	============================================*/

	/**
	 * Constructor
	 */
	public CalendarHeaderItem(CalendarHeaderPosition position, CalendarHeaderItemType type, CalendarHeaderItemDisplay display)
	{
		this.position = position;
		this.type = type;
		this.display = display;
	}

	/*--------------------------------------------
	|  A C C E S S O R S / M O D I F I E R S    |
	============================================*/

	public CalendarHeaderPosition getPosition()
	{
		return position;
	}

	public void setPosition(CalendarHeaderPosition position)
	{
		this.position = position;
	}

	public CalendarHeaderItemType getType()
	{
		return type;
	}

	public void setType(CalendarHeaderItemType type)
	{
		this.type = type;
	}

	public CalendarHeaderItemDisplay getDisplay()
	{
		return display;
	}

	public void setDisplay(CalendarHeaderItemDisplay display)
	{
		this.display = display;
	}

	/**
	 * Indicates whether some other object is "equal to" this one.
	 *
	 * @param o the reference object with which to compare.
	 * @return  <code>true</code> if this object is the same as the obj argument; <code>false</code> otherwise
	 */
	@Override
	public boolean equals(Object o)
	{
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		CalendarHeaderItem that = (CalendarHeaderItem) o;

		if (display != that.display) return false;
		if (position != that.position) return false;
		if (type != that.type) return false;

		return true;
	}

	/**
	 * Returns a hash code value for the object.
	 *
	 * @return  a hash code value for this object.
	 */
	@Override
	public int hashCode()
	{
		int result = position.hashCode();
		result = 31 * result + type.hashCode();
		result = 31 * result + display.hashCode();
		return result;
	}

	/**
	 * Returns a string representation of the object.
	 *
	 * @return  a string representation of the object.
	 */
	@Override
	public String toString()
	{
		return position.toString() + ' ' + type.toString() + ' ' + display.toString();
	}
}
