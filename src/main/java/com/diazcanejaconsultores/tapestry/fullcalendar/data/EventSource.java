package com.diazcanejaconsultores.tapestry.fullcalendar.data;

import org.apache.tapestry5.beaneditor.Validate;

import javax.validation.constraints.NotNull;

/**
 * Event source
 */
public class EventSource extends AbstractEvent
{
	/*--------------------------------------------
	|         C L A S S    F I E L D S          |
	============================================*/

	/**
	 * Event title
	 */
	private String title;

	/**
	 * URL of the source of events
	 */
	@NotNull
	@Validate("required")
	private String url;

	/*--------------------------------------------
	|          C O N S T R U C T O R            |
	============================================*/

	/**
	 * Constructor
	 *
	 * @param url url of the source of events
	 */
	public EventSource(String url)
	{
		this.url = url;
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

		EventSource event = (EventSource) o;

		if (getId() != null ? !getId().equals(event.getId()) : event.getId() != null) return false;
		if (!url.equals(event.url)) return false;

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
		result = 31 * result + url.hashCode();
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
		return getUrl();
	}
}
