package com.diazcanejaconsultores.tapestry.fullcalendar.services;

import org.apache.tapestry5.ioc.*;
import org.apache.tapestry5.ioc.annotations.Value;
import org.apache.tapestry5.services.LibraryMapping;
import org.got5.tapestry5.jquery.JQuerySymbolConstants;

/**
 * IoC of the module
 */
public class FullCalendarModule
{
	public static void bind(ServiceBinder binder)
	{
		// Make bind() calls on the binder object to define most IoC services.
		// Use service builder methods (example below) when the implementation
		// is provided inline, or requires more initialization than simply
		// invoking the constructor.
	}

	/**
	 * Contributions to ApplicationDefaults will override any contributions
	 * to FactoryDefaults (with the same key).
	 */
	public static void contributeApplicationDefaults(MappedConfiguration<String, String> configuration)
	{
		// Tapestry's jQuery cnfiguration
		configuration.add(JQuerySymbolConstants.SUPPRESS_PROTOTYPE, "false");
		configuration.add(JQuerySymbolConstants.JQUERY_ALIAS, "jq");
	}

	/**
	 * Add components and pages in non standard locations to the project
	 * library.
	 */
	public static void contributeComponentClassResolver(Configuration<LibraryMapping> configuration)
	{
		configuration.add(new LibraryMapping("fullcalendar", "com.diazcanejaconsultores.tapestry.fullcalendar"));
	}

	/**
	 * Contributions to the RESTeasy main Application, insert all your
	 * singletons RESTeasy services here.
	 */
	public static void contributeApplication(Configuration<Object> singletons, ObjectLocator locator)
	{
	}

	/**
	 * Contributes the AppCatalog properties
	 */
	public static void contributeComponentMessagesSource(@Value("moduleFullCalendar.properties") Resource moduleResource,
	                                                     OrderedConfiguration<Resource> configuration)
	{
		configuration.add("moduleFullCalendar", moduleResource, "before:AppCatalog");
	}
}
