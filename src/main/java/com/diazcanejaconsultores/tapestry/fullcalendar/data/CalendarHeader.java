package com.diazcanejaconsultores.tapestry.fullcalendar.data;

import java.util.ArrayList;
import java.util.List;

/**
 * Header of the calendar
 */
public class CalendarHeader
{
	/*--------------------------------------------
	|         C L A S S    F I E L D S          |
	============================================*/

	/**
	 * Items in the header of the calendar
	 *
	 * @see com.diazcanejaconsultores.tapestry.fullcalendar.data.CalendarHeaderItem
	 */
	private List<CalendarHeaderItem> items = new ArrayList<CalendarHeaderItem>();

	/*--------------------------------------------
	|  A C C E S S O R S / M O D I F I E R S    |
	============================================*/

	public List<CalendarHeaderItem> getItems()
	{
		return items;
	}

	public void setItems(List<CalendarHeaderItem> items)
	{
		this.items = items;
	}

	/*--------------------------------------------
	|          C L A S S  M E T H O D S         |
	============================================*/

	/**
	 * Adds a header item to the calendar header
	 *
	 * @param item  header item to be added
	 * @see com.diazcanejaconsultores.tapestry.fullcalendar.data.CalendarHeaderItem
	 */
	public void addItem(CalendarHeaderItem item)
	{
		items.add(item);
	}

	/**
	 * Obtains the header items of a specified position
	 *
	 * @param position  position of the header item
	 * @return  list of header items of a specified position
	 *
	 * @see com.diazcanejaconsultores.tapestry.fullcalendar.data.CalendarHeaderItem
	 * @see com.diazcanejaconsultores.tapestry.fullcalendar.data.CalendarHeaderPosition
	 */
	public List<CalendarHeaderItem> getHeaderItemByPosition(CalendarHeaderPosition position)
	{
		List<CalendarHeaderItem> results = new ArrayList<CalendarHeaderItem>();

		for (CalendarHeaderItem item : items)
		{
			if (item.getPosition() == position) results.add(item);
		}

		return results;
	}
}
