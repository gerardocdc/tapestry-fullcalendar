package com.diazcanejaconsultores.tapestry.fullcalendar.data;

import org.apache.tapestry5.beaneditor.Validate;

import javax.validation.constraints.NotNull;
import java.util.Calendar;

/**
 * Event
 */
public class Event extends AbstractEvent
{
	/*--------------------------------------------
	|         C L A S S    F I E L D S          |
	============================================*/

	/**
	 * Event title
	 */
	@NotNull
	@Validate("required")
	private String title;

	/**
	 * URL that will be visited when this event is clicked by the user
	 */
	private String url;

	/*--------------------------------------------
	|          C O N S T R U C T O R            |
	============================================*/

	/**
	 * Constructor
	 *
	 * @param title title of the event
	 * @param start date/time an event begins
	 */
	public Event(String title, Calendar start)
	{
		this.title = title;
		super.setStart(start);
	}

/*--------------------------------------------
	|  A C C E S S O R S / M O D I F I E R S    |
	============================================*/

	public String getTitle()
	{
		return title;
	}

	public void setTitle(String title)
	{
		this.title = title;
	}

	public String getUrl()
	{
		return url;
	}

	public void setUrl(String url)
	{
		this.url = url;
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

		Event event = (Event) o;

		if (getId() != null ? !getId().equals(event.getId()) : event.getId() != null) return false;
		if (!getStart().equals(event.getStart())) return false;
		if (!title.equals(event.title)) return false;

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
		int result = getId() != null ? getId().hashCode() : 0;
		result = 31 * result + title.hashCode();
		result = 31 * result + getStart().hashCode();
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
		return getTitle() + ' ' + getStart().toString();
	}
}
