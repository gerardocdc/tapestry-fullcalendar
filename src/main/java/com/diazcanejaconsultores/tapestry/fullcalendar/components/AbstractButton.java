package com.diazcanejaconsultores.tapestry.fullcalendar.components;

import com.diazcanejaconsultores.tapestry.fullcalendar.CalendarConstants;
import org.apache.tapestry5.Asset;
import org.apache.tapestry5.BindingConstants;
import org.apache.tapestry5.ComponentResources;
import org.apache.tapestry5.MarkupWriter;
import org.apache.tapestry5.annotations.*;
import org.apache.tapestry5.ioc.Messages;
import org.apache.tapestry5.ioc.annotations.Inject;
import org.apache.tapestry5.ioc.annotations.Symbol;
import org.apache.tapestry5.services.javascript.JavaScriptSupport;
import org.got5.tapestry5.jquery.JQuerySymbolConstants;

/**
 * Abstract calendar button
 */
@SupportsInformalParameters
public abstract class AbstractButton
{
	/*-------------------------
	|   P A R A M E T E R S   |
	==========================*/

	/**
	 * The id used to generate a page-unique client-side identifier for the
	 * component. If a component renders multiple times, a suffix will be
	 * appended to the to id to ensure uniqueness.
	 */
	@Parameter(name = "clientId", value = "prop:componentResources.id", defaultPrefix = BindingConstants.LITERAL, required = true)
	private String clientId;

	/**
	 * Id identifier of the calendar to control with the button
	 */
	@Parameter(name = "calendarId", required = true, defaultPrefix = BindingConstants.LITERAL)
	private String calendarId;

	/**
	 * Name of the style class for the button. Button will have the structure <div class="stylexteClass"><span>Text</span></div>
	 */
	@Parameter(name = "styleClass", defaultPrefix = BindingConstants.LITERAL, required = false)
	private String styleClass;

	/**
	 * Button text. In case there is no value, a default message will be used
	 */
	@Parameter(name = "text", defaultPrefix = BindingConstants.LITERAL, required = false)
	private String text;

	/**
	 * Button image instead of the text. In case there is no value, the text will be used
	 */
	@Parameter(name= "image", defaultPrefix = BindingConstants.ASSET)
	private Asset image;

	/*-------------------------
	|       F I E L D S       |
	==========================*/

	/**
	 * JavaScript service
	 */
	@Environmental
	private JavaScriptSupport javaScriptSupport;

	/**
	 * Assigned client id (for identification purposes)
	 */
	private String assignedClientId;

	/**
	 * Messages catalog.
	 */
	@Inject
	private Messages messages;

	/**
	 * Component resources
	 */
	@Inject
	private ComponentResources resources;

	/**
	 * jQuery alias
	 */
	@Inject
	@Symbol(JQuerySymbolConstants.JQUERY_ALIAS)
	private String jqueryAlias;

	/*-------------------------
	|      M E T H O D S      |
	==========================*/

	/**
	 * Event called when the component starts its render
	 */
	@SetupRender
	void setupRender()
	{
		// Identification
		assignedClientId = javaScriptSupport.allocateClientId(clientId);
	}

	/**
	 * Event called at the start of rendering the component
	 *
	 * @param writer    Markup write of the component
	 */
	@BeginRender
	void beginRender(MarkupWriter writer)
	{
		if (hasSelectedStyle())
		{
			writer.element("div","id",assignedClientId,"class",styleClass);
			writer.element("span");
			getButtonTextImage(writer);
			writer.end();
			writer.end();
		} else {
			writer.element("span","id",assignedClientId,"class","fc-button fc-state-default");
			writer.element("span","class","fc-button-inner");
			writer.element("span","class","fc-button-content");
			getButtonTextImage(writer);
			writer.element("span","class","fc-button-effect");
			writer.element("span");
			writer.end();
			writer.end();
			writer.end();
			writer.end();
			writer.end();
		}
	}

	/**
	 * Event called at the end of rendering the component
	 *
	 * @param writer    Markup write of the component
	 */
	@AfterRender
	void afterRender(MarkupWriter writer)
	{
		StringBuffer script = new StringBuffer();
		script.append("%s('#%s').click(function() {\n");
		if (getButtonFunction() == CalendarConstants.CALENDAR_BUTTON_FUNCTION_DAY || getButtonFunction() == CalendarConstants.CALENDAR_BUTTON_FUNCTION_WEEK || getButtonFunction() == CalendarConstants.CALENDAR_BUTTON_FUNCTION_MONTH)
		{
			script.append("%s('#%s').fullCalendar('changeView','%s');\n");
		} else {
			script.append("%s('#%s').fullCalendar('%s');\n");
		}
		script.append("});");

		javaScriptSupport.addScript(script.toString(),jqueryAlias,assignedClientId,jqueryAlias,calendarId,getButtonFunction());
	}

	/**
	 * Determines if an style class has going to be used
	 *
	 * @return  <code>true</code> means there is a style class to be used and
	 * <code>false</code> means the default style class will be used.
	 */
	public Boolean hasSelectedStyle()
	{
		return (styleClass != null) ? true : false;
	}

	/**
	 * Obtains the button text parameter value
	 *
	 * @return  buttons text parameter value
	 */
	public String getText()
	{
		return text;
	}

	/**
	 * Obtains the messages catalog
	 *
	 * @return  messages catalog
	 */
	public Messages getMessages()
	{
		return messages;
	}

	/**
	 *  Obtains the text or image of the button. It display's the text in case there is no image
	 *
	 * @param writer    Markup write of the component
	 */
	void getButtonTextImage(MarkupWriter writer)
	{
		if (image != null)
		{
			writer.element("img", "src", image,"alt", getButtonText(),"width", CalendarConstants.CALENDAR_BUTTON_IMAGE_SIZE,"height",CalendarConstants.CALENDAR_BUTTON_IMAGE_SIZE,"style",CalendarConstants.CALENDAR_BUTTON_IMAGE_STYLE);
			resources.renderInformalParameters(writer);
			writer.end();
		} else {
			writer.write(getButtonText());
		}
	}

	/**
	 * Obtains the function of the button
	 *
	 * @return  function of the button
	 */
	protected abstract String getButtonFunction();

	/**
	 * Obtains the text of the button. In case there is no value, a default message will be used
	 *
	 * @return  text of the button
	 */
	protected abstract String getButtonText();
}
