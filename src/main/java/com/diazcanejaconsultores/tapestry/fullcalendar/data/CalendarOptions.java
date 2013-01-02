package com.diazcanejaconsultores.tapestry.fullcalendar.data;

import com.diazcanejaconsultores.tapestry.fullcalendar.CalendarConstants;
import org.apache.tapestry5.ioc.Messages;

/**
 * Options of the calendar view
 */
public class CalendarOptions
{
	/*--------------------------------------------
	|         C L A S S    F I E L D S          |
	============================================*/

	/**
	 * Messages catalog.
	 */
	private Messages messages;

	/*----------------
	  Display options
	----------------*/

	/**
	 * Displays the calendar header. <code>true</code> means the calendar displays the header and <code>false</code>
	 * means the calendar does not display the header.
	 */
	private Boolean headerShow = CalendarConstants.CALENDAR_HEADER_SHOW;

	/**
	 * Day that each week begins
	 */
	private Integer firstDay = CalendarConstants.CALENDAR_FIRST_DAY;

	/**
	 * Displays the calendar in right-to-left mode. <code>true</code> means the calendar is displayed from right-to left
	 * and <code>false</code> means the calendar is displayed from left-to-right.
	 */
	private Boolean rtl = CalendarConstants.CALENDAR_RTL;

	/**
	 * Includes Saturday/Sunday columns in any of the calendar views. <code>true</code> means the calendar views includes
	 * Saturday/Sunday columns and <code>false</code> means means the calendar views does not include Saturday/Sunday columns.
	 */
	private Boolean weekends = CalendarConstants.CALENDAR_WEEKENDS;

	/**
	 * Determines the number of weeks displayed in a month view.
	 *
	 * @see com.diazcanejaconsultores.tapestry.fullcalendar.data.CalendarWeekMode
	 */
	private CalendarWeekMode weekmode = CalendarConstants.CALENDAR_WEEKMODE;

	/*----------------
	  Agenda options
	----------------*/

	/**
	 * Calendar views (day and week) are agenda type. <code>true</code> means day and week views are agenda type and
	 * <code>false</code> means day and week views are list type
	 */
	private Boolean agenda = CalendarConstants.CALENDAR_AGENDA;

	/**
	 * Determines if the "all-day" slot is displayed at the top of the calendar. <code>true</code> means the "all-day"
	 * slot is displayed at the top of the calendar and <code>false</code> means the "all-day" slot is not  displayed
	 * at the top of the calendar.
	 */
	private Boolean allDaySlot = CalendarConstants.CALENDAR_ALLDAYSLOT;

	/**
	 * Text titling the "all-day" slot at the top of the calendar.
	 */
	private String allDayText; //= messages.get(CalendarConstants.CALENDAR_ALLDAYTEXT);

	/**
	 * Time slot size (in minutes).
	 */
	private Integer slotMinutes = CalendarConstants.CALENDAR_SLOTMINUTES;

	/**
	 * Length (in minutes) an event appears to be when it has an unspecified end date.
	 */
	private Integer defaultEventMinutes = CalendarConstants.CALENDAR_DEFAULTEVENTMINUTES;

	/**
	 * First hour that will be displayed
	 */
	private String minTime = CalendarConstants.CALENDAR_MIN_TIME;

	/**
	 * Last hour (exclusively) that will be displayed
	 */
	private String maxTime = CalendarConstants.CALENDAR_MAX_TIME;

	/*----------------
	  Event options
	----------------*/

	/**
	 * Calendar events are editable and may be clicked. <code>true</code> means events are editable and <code>false</code>
	 * means events are not evitable.
	 */
	private Boolean editable = CalendarConstants.CALENDAR_EDITABLE;

	/*--------------------------------------------
	|          C O N S T R U C T O R            |
	============================================*/

	/**
	 * Constructor
	 *
	 * @param messagesCatalog   messages catalog
	 */
	public CalendarOptions(Messages messagesCatalog)
	{
		messages = messagesCatalog;
		this.allDayText = messages.get(CalendarConstants.CALENDAR_ALLDAYTEXT);
	}

	/*--------------------------------------------
	|  A C C E S S O R S / M O D I F I E R S    |
	============================================*/

	public Boolean getHeaderShow()
	{
		return headerShow;
	}

	public void setHeaderShow(Boolean headerShow)
	{
		this.headerShow = headerShow;
	}

	public Integer getFirstDay()
	{
		return firstDay;
	}

	public void setFirstDay(Integer firstDay)
	{
		this.firstDay = firstDay;
	}

	public Boolean getRtl()
	{
		return rtl;
	}

	public void setRtl(Boolean rtl)
	{
		this.rtl = rtl;
	}

	public Boolean getWeekends()
	{
		return weekends;
	}

	public void setWeekends(Boolean weekends)
	{
		this.weekends = weekends;
	}

	public CalendarWeekMode getWeekmode()
	{
		return weekmode;
	}

	public void setWeekmode(CalendarWeekMode weekmode)
	{
		this.weekmode = weekmode;
	}

	public Boolean getAgenda()
	{
		return agenda;
	}

	public void setAgenda(Boolean agenda)
	{
		this.agenda = agenda;
	}

	public Boolean getAllDaySlot()
	{
		return allDaySlot;
	}

	public void setAllDaySlot(Boolean allDaySlot)
	{
		this.allDaySlot = allDaySlot;
	}

	public String getAllDayText()
	{
		return allDayText;
	}

	public void setAllDayText(String allDayText)
	{
		this.allDayText = allDayText;
	}

	public Integer getSlotMinutes()
	{
		return slotMinutes;
	}

	public void setSlotMinutes(Integer slotMinutes)
	{
		this.slotMinutes = slotMinutes;
	}

	public Integer getDefaultEventMinutes()
	{
		return defaultEventMinutes;
	}

	public void setDefaultEventMinutes(Integer defaultEventMinutes)
	{
		this.defaultEventMinutes = defaultEventMinutes;
	}

	public String getMinTime()
	{
		return minTime;
	}

	public void setMinTime(String minTime)
	{
		this.minTime = minTime;
	}

	public String getMaxTime()
	{
		return maxTime;
	}

	public void setMaxTime(String maxTime)
	{
		this.maxTime = maxTime;
	}

	public Boolean getEditable()
	{
		return editable;
	}

	public void setEditable(Boolean editable)
	{
		this.editable = editable;
	}
}
