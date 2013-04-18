# tapestry-fullcalendar

## Description

This module provides a calendar in Tapestry 5 apps, based in in jQuery Fullcalendar plugin [http://arshaw.com/fullcalendar/](http://arshaw.com/fullcalendar/) & [Github](https://github.com/arshaw/fullcalendar)

## Maven dependency

To use this module, you must firstly clone the project and compile it:

	$ git clone --progress git@github.com:gerardocdc/tapestry-fullcalendar.git

	$ cd tapestry-fullcalendar

	$ mvn clean install

Add the following dependency in your `pom.xml`.

	<dependencies>
		...
		<dependency>
			<groupId>com.diazcanejaconsultores</groupId>
			<artifactId>tapestry-fullcalendar</artifactId>
			<version>1.0.0</version>
		</dependency>
		...
	</dependencies>

## Components

The module provides two sets of components, for generating calendar and buttons to control calendar actions.

### Calendars

**Day Calendar**

	<t:fullcalendar.day t:clientId="calendarDummy" />

**Week Calendar**

	<t:fullcalendar.week t:clientId="calendarDummy" />

**Month Calendar**

	<t:fullcalendar.month t:clientId="calendarDummy" />

**Parameters**

All of these calendar components have the following parameters:

* clientId: an unique id for the component (mandatory). It can be used for button components.
* day: value of the day to display in the calendar (mandatory in day calendars).
* month: value of the month to display in the calendar (mandatory in day and month calendars). See [Calendar values]
* year: value of the year to display in the calendar (mandatory in day, month and year calendars).
* options: options of the calendar (optional). See [How to customize the calendar]
* header: header of the calendar (optional). See [How to create a header for the calendar]
* events: events to be shown in the calendar (optional). See [How to show events in the calendar]
* eventSources: events sources to be shown in the calendar (optional). See [How to show event sources in the calendar]

### Buttons

**Previous month/week/day calendar button**

Moves the calendar one step back (either by a month, week, or day).
If the calendar is in month view, will move the calendar back one month.
If the calendar is in basicWeek or agendaWeek, will move the calendar back one week.
If the calendar is in basicDay or agendaDay, will move the calendar back one day.

	<t:buttonPrev t:clientId="calendar_button_prev" t:calendarId="calendarDummy" />

**Next month/week/day calendar button**

Moves the calendar one step forward (either by a month, week, or day).
If the calendar is in month view, will move the calendar forward one month.
If the calendar is in basicWeek or agendaWeek, will move the calendar forward one week.
If the calendar is in basicDay or agendaDay, will move the calendar forward one day.

	<t:buttonNext t:clientId="calendar_button_next" t:calendarId="calendarDummy" />

**Previous year calendar button**

Moves the calendar back one year

	<t:buttonPrevYear t:clientId="calendar_button_prevyear" t:calendarId="calendarDummy" />

**Next year calendar button**

Moves the calendar forward one year

	<t:buttonNextYear t:clientId="calendar_button_nextyear" t:calendarId="calendarDummy" />

**Today calendar button**

Moves the calendar to today's date

	<t:buttonToday t:clientId="calendar_button_today" t:calendarId="calendarDummy" />

**Month calendar button**

Shows the month calendar

	<t:buttonMonth t:clientId="calendar_button_month" t:calendarId="calendarDummy" />

**Week calendar button**

Shows the week calendar

	<t:buttonWeek t:clientId="calendar_button_week" t:calendarId="calendarDummy" />

**Day calendar button**

Shows the day calendar

	<t:buttonDay t:clientId="calendar_button_day" t:calendarId="calendarDummy" />

**Parameters**

All of these button components have the following parameters:

* clientID: an unique id for the component (mandatory).
* calendarId: the id of the calendar controlled with the button (mandatory).
* styleClass: name of the style class for the button. Button will have the structure <div class="stylexteClass"><span>Text</span></div> (optional).
* text: text inside the button. In case there is no value, a default message will be used (optional).
* image: image asset inside the button, replacing the text. In case there is no value, the text will be used (optional).

## Calendar values

There are several enums to allow an easier way to reference to calendar values:

### Days of the weeks

* Sunday:		CalendarDay.SUNDAY
* Monday:		CalendarDay.MONDAY
* Tuesday:	CalendarDay.TUESDAY
* Wednesday:	CalendarDay.WEDNESDAY
* Thursday:	CalendarDay.THURSDAY
* Friday:		CalendarDay.FRIDAY
* Saturday:	CalendarDay.SATURDAY

### Month

* January:	CalendarMonth.JANUARY
* February:	CalendarMonth.FEBRUARY
* March:		CalendarMonth.MARCH
* April:		CalendarMonth.APRIL
* May:		CalendarMonth.MAY
* June:		CalendarMonth.JUNE
* July:		CalendarMonth.JULY
* August:		CalendarMonth.AUGUST
* September:	CalendarMonth.SEPTEMBER
* October:	CalendarMonth.OCTOBER
* November:	CalendarMonth.NOVEMBER
* December:	CalendarMonth.DECEMBER

## How to customize the calendar

You can customize the calendar with several options, passing a `CalendarOption` to the `t:options` parameter of the calendar.

The options that can be modified are:

### Display options

* headerShow (Boolean): Displays the calendar header. By default the value is true.
* firstDay (Integer): Day that each week begins. By default the value is Monday. See [Calendar values]
* rtl (Boolean): Displays the calendar in right-to-left mode. By default the value is false.
* weekends (Boolean): Includes Saturday/Sunday columns in any of the calendar views. By default the value is true.
* weekmode (CalendarWeekMode): Determines the number of weeks displayed in a month view. By default the value is fixed. There are three possibilities:
	* CalendarWeekMode.FIXED: he calendar will always be 6 weeks tall. The height will always be the same.
	* CalendarWeekMode.LIQUID: The calendar will have either 4, 5, or 6 weeks, depending on the month. The height of the weeks will stretch to fill the available height.
	* CalendarWeekMode.VARIABLE: The calendar will have either 4, 5, or 6 weeks, depending on the month. Each week will have the same constant height.

### Agenda options

* agenda (Boolean): Calendar views (day and week) are agenda type. By default the value is true.
* allDaySlot (Boolean): Determines if the "all-day" slot is displayed at the top of the calendar. By default the value is true.
* allDayText (String): Text titling the "all-day" slot at the top of the calendar. By default the value is "All-day".
* slotMinutes (Integer): Time slot size (in minutes). By default the value is 30.
* defaultEventMinutes (Integer): Length (in minutes) an event appears to be when it has an unspecified end date. By default the value is 60.
* minTime (String): First hour that will be displayed. By default the value is 8.
* maxTime (String): Last hour (exclusively) that will be displayed. By default the value is 22.

### Event options

* editable (Boolean): Calendar events are editable and may be clicked. The default the value is false.

### Example

In your page tml you must include:

	<t:month t:clientId="calendarDummy" t:options="options" />

In your page class you must include:

	@Inject
	private Messages messages;

	@Property
	private CalendarOptions options;

	@OnEvent(EventConstants.ACTIVATE)
	{
		options = new CalendarOptions(messages);
		options.setHeaderShow(true);
		options.setFirstDay(CalendarDay.SUNDAY);
		options.setRtl(false);
		options.setWeekends(true);
		options.setWeekmode(CalendarWeekMode.FIXED);
		options.setAgenda(true);
		options.setAllDaySlot(true);
		options.setAllDayText("All day");
		options.setSlotMinutes(30);
		options.setDefaultEventMinutes(60);
		options.setMinTime(8);
		options.setMaxTime(22);
		options.setEditable(false);
	}

## How to create a header for the calendar

You can create a fully customized header for the calendar, passing a `CalendarHeader` to the `t:header parameter of the calendar, selecting for each item its position, type and and form of display.

### Position of calendar header items

* CalendarHeaderPosition.LEFT: Left position in header
* CalendarHeaderPosition.CENTER: Center position in header
* CalendarHeaderPosition.RIGHT: Right position in header

### Type of element items of the calendar header

* CalendarHeaderItemType.TITLE: Text containing the current month/week/day
* CalendarHeaderItemType.PREV: Button for moving the calendar back one month/week/day
* CalendarHeaderItemType.NEXT: Button for moving the calendar forward one month/week/day
* CalendarHeaderItemType.PREVYEAR: Button for moving the calendar back on year
* CalendarHeaderItemType.NEXTYEAR: Button for moving the calendar forward one year
* CalendarHeaderItemType.TODAY: Button for moving the calendar to the current month/week/day
* CalendarHeaderItemType.MONTH: Button for displaying the month view
* CalendarHeaderItemType.WEEK_BASIC: Button for displaying the week view (only events list)
* CalendarHeaderItemType.WEEK_AGENDA: Button for displaying the week view (agenda events list)
* CalendarHeaderItemType.DAY_BASIC: Button for displaying the day view (only events list)
* CalendarHeaderItemType.DAY_AGENDA: Button for displaying the week view (agenda events list)

### Types of displaying items in calendar header

* CalendarHeaderItemDisplay.GAP: Items are displayed with a gap between them
* CalendarHeaderItemDisplay.ADJACENT: Items are displayed adjacent one to another

### Example

In your page tml you must include:

	<t:month t:clientId="calendarDummy" t:header="header" />

In your page class you must include:

	@Property
	private CalendarHeader header;

	@OnEvent(EventConstants.ACTIVATE)
	{
		CalendarHeaderItem item = new CalendarHeaderItem();
		item.setPosition(CalendarHeaderPosition.LEFT);
		item.setType(CalendarHeaderItemType.TITLE);
		item.setDisplay(CalendarHeaderItemDisplay.ADJACENT);

		header = new CalendarHeader();
		header.addItem(item);
	}

## How to show events in the calendar

The events to be shown can be created through a list of `Event objects, passing the list to the `t:events` parameter of the calendar.

Each event can have the following values:

* title (String): Title of the event (mandatory).
* start (Calendar): Date/time the event begins (mandatory).
* allDay (Boolean): Event occurs all-day long. By default the value is false (optional).
* end (Calendar): Date/time an event ends. If an event is all-day the end date is inclusive. This means an event with start Nov 10 and end Nov 12 will span 3 days on the calendar. If an event is NOT all-day the end date is exclusive. This is only a gotcha when your end has time 00:00. It means your event ends on midnight, and it will not span through the next day (optional).
* editable (Boolean): Determines whether the events on the calendar can be modified. By default the value is false (optional).
* url (String): URL that will be visited when this event is clicked by the user (optional).
* id (Long): Event Unique id number (optional).
* className (String): CSS class (or array of classes) that will be attached to this event's element (optional).
* color (Color): Background and border colors for the event (optional).
* backgroundColor (Color): Background color for the event (optional).
* borderColor (Color): Border color for the event (optional).
* textColor (Color): Text color for the event (optional).

### Example

In your page tml you must include:

	<t:month t:clientId="calendarDummy" t:events="events" />

In your page class you must include:

	@Property
	private java.util.List<Event> events = new ArrayList<Event>();

	@OnEvent(EventConstants.ACTIVATE)
	{
		// All-day event
		final Event eventA = new Event("TITLE 1",Calendar.getInstance());
		eventA.setAllDay(true);

		events.add(eventA);

		// Event with an end date
		final Event eventB = new Event("TITLE 2",Calendar.getInstance());
		Calendar startB = Calendar.getInstance();
		startB.set(Calendar.HOUR_OF_DAY,12);
		startB.set(Calendar.MINUTE,0);
		startB.set(Calendar.SECOND,0);
		eventB.setAllDay(false);
		Calendar endB = Calendar.getInstance();
		endB.set(Calendar.HOUR_OF_DAY,13);
		endB.set(Calendar.MINUTE,30);
		endB.set(Calendar.SECOND,0);
		eventB.setStart(startB);
		eventB.setEnd(endB);

		eventB.setEditable(true);
		eventB.setUrl("http://domain.com");
		eventB.setId(123456789);

		eventB.setClassName("eventStyle");
		Color colorB = new Color(255,160,255);
		eventB.setColor(colorB);
		eventB.setBackgroundColor(colorB);
		eventB.setBorderColor(colorB);
		eventB.setTextColor(colorB);
		events.add(eventB);
	}

## How to show event sources in the calendar

The events to be shown can be obtained from an external source, passing a list of sources to the `t:eventSources` parameter of the calendar. Event sources can be a simple array, an event-generating function that you define, a URL to a json feed, or a Google Calendar feed.

Each event source can have the following values:

* url (String): URL that will be visited when this event is clicked by the user (mandatory).
* title (String): Title of the event (optional).
* start (Calendar): Date/time the event begins (optional).
* allDay (Boolean): Event occurs all-day long. By default the value is false (optional).
* end (Calendar): Date/time an event ends. If an event is all-day the end date is inclusive. This means an event with start Nov 10 and end Nov 12 will span 3 days on the calendar. If an event is NOT all-day the end date is exclusive. This is only a gotcha when your end has time 00:00. It means your event ends on midnight, and it will not span through the next day (optional).
* editable (Boolean): Determines whether the events on the calendar can be modified. By default the value is false (optional).
* id (Long): Event Unique id number (optional).
* className (String): CSS class (or array of classes) that will be attached to this event's element (optional).
* color (Color): Background and border colors for the event (optional).
* backgroundColor (Color): Background color for the event (optional).
* borderColor (Color): Border color for the event (optional).
* textColor (Color): Text color for the event (optional).

### Example

In your page tml you must include:

	<t:month t:clientId="calendarDummy" t:eventSources="eventSources" />

In your page class you must include:

	@Property
	private java.util.List<EventSource> eventSources = new ArrayList<EventSource>();

	@OnEvent(EventConstants.ACTIVATE)
	{
		final EventSource sourceA = new EventSource("https://www.google.com/calendar/feeds/mygooglecalendaraccount/public/basic");
		sourceA.setClassName("gcal-event");
		sourceA.setEditable(false);

		eventSources.add(sourceA);
	}

## Note about jQuery

jQuery uses `$` alias to select elements. In order to avoid collisions in JavaScript, and allow compability with other JavaScript frameworks, tapestry-fullcalendar uses the alias `jq` If you need to customize it in your FullCalendarModule in the contributeApplicationDefaults method.



## Copyright

Creative Commons CC-BY-SA License (http://creativecommons.org/licenses/by-sa/3.0/)

Copyright (c) 2012 Diaz-Caneja Consultores

## Contact

Gerardo Colorado Diaz-Caneja   gcdiazcaneja@diaz-caneja-consultores.com

Github: https://github.com/gerardocdc/tapestry-fullcalendar (feel free to contribute)