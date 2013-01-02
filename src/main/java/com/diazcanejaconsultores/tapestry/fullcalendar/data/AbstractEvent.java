package com.diazcanejaconsultores.tapestry.fullcalendar.data;

import org.apache.tapestry5.beaneditor.Validate;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import java.awt.*;
import java.util.Calendar;

/**
 * Abstract event class
 */
public abstract class AbstractEvent
{
	/*--------------------------------------------
	|         C L A S S    F I E L D S          |
	============================================*/

	/**
	 * Event Unique id number
	 */
	private Long id;

	/**
	 * Event occurs all-day long. <code>true</code> means the event occurs all-day long and <code>false</code> means the
	 * event occurs at a specific time-of-day.
	 */
	private Boolean allDay = false;

	/**
	 * Date/time an event begins
	 */
	@NotNull
	@Validate("required")
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar start;

	/**
	 * Date/time an event ends
	 * If an event is all-day the end date is inclusive. This means an event with start Nov 10 and end Nov 12 will
	 * span 3 days on the calendar. If an event is NOT all-day the end date is exclusive. This is only a gotcha when
	 * your end has time 00:00. It means your event ends on midnight, and it will not span through the next day.
	 */
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar end;

	/**
	 * Determines whether the events on the calendar can be modified. <code>true</code> means the events on the calendar
	 * can be modified and <code>false</code> means the events on the calendar cannot be modified
	 */
	private Boolean editable = false;

	/**
	 * CSS class (or array of classes) that will be attached to this event's element.
	 */
	private String className;

	/**
	 * Background and border colors for the event. It can be used CSS color formats such #f00, #ff0000, rgb(255,0,0), or red.
	 */
	private Color color;

	/**
	 * Background color for the event. It can be used CSS color formats such #f00, #ff0000, rgb(255,0,0), or red.
	 */
	private Color backgroundColor;

	/**
	 * Border color for the event. It can be used CSS color formats such #f00, #ff0000, rgb(255,0,0), or red.
	 */
	private Color borderColor;

	/**
	 * Text color for the event. It can be used CSS color formats such #f00, #ff0000, rgb(255,0,0), or red.
	 */
	private Color textColor;

	/*--------------------------------------------
	|  A C C E S S O R S / M O D I F I E R S    |
	============================================*/

	public Long getId()
	{
		return id;
	}

	public void setId(Long id)
	{
		this.id = id;
	}

	public Boolean getAllDay()
	{
		return allDay;
	}

	public void setAllDay(Boolean allDay)
	{
		this.allDay = allDay;
	}

	public Calendar getStart()
	{
		return start;
	}

	public void setStart(Calendar start)
	{
		this.start = start;
	}

	public Calendar getEnd()
	{
		return end;
	}

	public void setEnd(Calendar end)
	{
		this.end = end;
	}

	public Boolean getEditable()
	{
		return editable;
	}

	public void setEditable(Boolean editable)
	{
		this.editable = editable;
	}

	public String getClassName()
	{
		return className;
	}

	public void setClassName(String className)
	{
		this.className = className;
	}

	public Color getColor()
	{
		return color;
	}

	public void setColor(Color color)
	{
		this.color = color;
	}

	public Color getBackgroundColor()
	{
		return backgroundColor;
	}

	public void setBackgroundColor(Color backgroundColor)
	{
		this.backgroundColor = backgroundColor;
	}

	public Color getBorderColor()
	{
		return borderColor;
	}

	public void setBorderColor(Color borderColor)
	{
		this.borderColor = borderColor;
	}

	public Color getTextColor()
	{
		return textColor;
	}

	public void setTextColor(Color textColor)
	{
		this.textColor = textColor;
	}

	/**
	 * Indicates whether some other object is "equal to" this one.
	 *
	 * @param o the reference object with which to compare.
	 * @return  <code>true</code> if this object is the same as the obj argument; <code>false</code> otherwise
	 */
	@Override
	public abstract boolean equals(Object o);

	/**
	 * Returns a hash code value for the object.
	 *
	 * @return  a hash code value for this object.
	 */
	@Override
	public abstract int hashCode();

	/**
	 * Returns a string representation of the object.
	 *
	 * @return  a string representation of the object.
	 */
	@Override
	public abstract String toString();
}
