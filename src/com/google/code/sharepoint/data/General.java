package com.google.code.sharepoint.data;

public class General {
	public enum SpFieldTypeEnum {
		/**
		 * Specifies an all day event. Corresponds to the SPFieldAllDayEvent
		 * class and to the AllDayEvent field type that is specified on the
		 * Field element. Value = 29.
		 */
		AllDayEvent,
		/**
		 * Specifies attachments. Corresponds to the SPFieldAttachments class
		 * and to the Attachments field type that is specified on the Field
		 * element. Value = 19.
		 */
		Attachments,
		/**
		 * Specifies Boolean values that are stored in the database as 1 or 0.
		 * Corresponds to the SPFieldBoolean class and to the Boolean field type
		 * that is specified on the Field element. Value = 8.
		 */
		Boolean,
		/**
		 * Specifies calculated values. Corresponds to the SPFieldCalculated
		 * class and to the Calculated field type that is specified on the Field
		 * element. Value = 17.
		 */
		Calculated,
		/**
		 * Specifies a predetermined set of values that can be used to enter
		 * data into the field. Corresponds to the SPFieldChoice class and to
		 * the Choice field type that is specified on the Field element. Value =
		 * 6.
		 */
		Choice,
		/**
		 * Specifies an abstract field type that depends on other fields for its
		 * content and definition. Corresponds to the SPFieldComputed class and
		 * to the Computed field type that is specified on the Field element.
		 * Value = 12.
		 */
		Computed,
		/**
		 * Specifies a content type ID. Corresponds to the ContentTypeId field
		 * type that is specified on the Field element. Value = 25.
		 */
		ContentTypeId,
		/**
		 * Specifies an integer used for internal ID fields. Corresponds to the
		 * Counter field type that is specified on the Field element. Value = 5.
		 */
		Counter,
		/**
		 * Specifies a link between projects in a Meetings Workspace site.
		 * Corresponds to the SPFieldCrossProjectLink class and to the
		 * CrossProjectLink field type that is specified on the Field element.
		 * Value = 22.
		 */
		CrossProjectLin,
		/**
		 * Specifies currency values formatted based on a specific locale.
		 * Corresponds to the SPFieldCurrency class and to the Currency field
		 * type that is specified on the Field element. Value = 10.
		 */
		Currency,
		/**
		 * Specifies date and time values. Corresponds to the SPFieldDateTime
		 * class and to the DateTime field type that is specified on the Field
		 * element. Value = 4.
		 */
		DateTime,
		/** Specifies errors. Value = 24 */
		Error,
		/**
		 * Specifies files. Corresponds to the SPFieldFile class and to the File
		 * field type that is specified on the Field element. Value = 18.
		 */
		File,
		/**
		 * Specifies a Choice field for a data sheet. Corresponds to the
		 * SPFieldRatingScale class and to the GridChoice field type that is
		 * specified on the Field element. Value = 16.
		 */
		GridChoice,
		/**
		 * Specifies GUIDs. Corresponds to the Guid field type that is specified
		 * on the Field element. Value = 14.
		 */
		Guid,
		/**
		 * Specifies positive or negative integer values. Corresponds to the
		 * Integer field type that is specified on the Field element. Value = 1.
		 */
		Integer,
		/** Not used. Value = 0. */
		Invalid,
		/**
		 * Specifies references to values in other lists. Corresponds to the
		 * SPFieldLookup class and to the Lookup field type that is specified on
		 * the Field element. Value = 7.
		 */
		Lookup,
		/** Specifies the maximum number of items. Value = 31. */
		MaxItems,
		/**
		 * Specifies Content Approval status. Corresponds to the SPFieldModStat
		 * class and to the ModStat field type that is specified on the Field
		 * element. Value = 23.
		 */
		ModStat,
		/**
		 * Specifies multiple values per list item. Corresponds to the
		 * SPFieldMultiChoice class and to the MultiChoice field type that is
		 * specified on the Field element. Value = 15.
		 */
		MultiChoice,
		/**
		 * Specifies a field that can contain multiple lines of text.
		 * Corresponds to the SPFieldMultiLineText class and to the Note field
		 * type that is specified on the Field element. Value = 3.
		 */
		Note,
		/**
		 * Specifies floating point numbers. Corresponds to the SPFieldNumber
		 * class and to the Number field type that is specified on the Field
		 * element. Value = 9.
		 */
		Number,
		/**
		 * Inserts a page break in a survey list. Corresponds to the
		 * SPFieldPageSeparator class and to the PageSeparator field type that
		 * is specified on the Field element. Value = 26.
		 */
		PageSeparator,
		/**
		 * Specifies a field that is used in calendars for recurring events and
		 * abstract field type that, like computed fields, depends on other
		 * fields for its content and definition. Corresponds to the
		 * SPFieldRecurrence class and to the Recurrence field type that is
		 * specified on the Field element. Value = 21.
		 */
		Recurrence,
		/**
		 * Specifies a single line of text. Corresponds to the SPFieldText class
		 * and to the Text field type that is specified on the Field element.
		 * Value = 2.
		 */
		Text,
		/**
		 * Specifies the ID that indicates the relative position of a message
		 * within a conversation thread. Corresponds to the ThreadIndex field
		 * type that is specified on the Field element. Value = 27.
		 */
		ThreadIndex,
		/**
		 * Specifies a field that is used in the creation and display of
		 * threaded Web discussions. Corresponds to the Threading field type
		 * that is specified on the Field element. Value = 13.
		 */
		Threading,
		/**
		 * Specifies hyperlinks. Corresponds to the SPFieldUrl class and to the
		 * URL field type that is specified on the Field element. Value = 11.
		 */
		URL,
		/**
		 * Specifies users of a SharePoint site. Corresponds to the SPFieldUser
		 * class and to the User field type that is specified on the Field
		 * element. Value = 20.
		 */
		User,
		/**
		 * Specifies a workflow event type. Corresponds to the WorkflowEventType
		 * field type that is specified on the Field element. Value = 30.
		 */
		WorkflowEventType,
		/**
		 * Specifies workflow status. Corresponds to the SPFieldWorkflowStatus
		 * class and to the WorkflowStatus field type that is specified on the
		 * Field element. Value = 28.
		 */
		WorkflowStatus
	}

	enum AggregationEnum {
		sum, count, average, min, max, merge, plaintext, first, last
	}

	enum SpBaseTypeEnum {
		// No base type specified.
		UnspecifiedBaseType,
		// Generic type of list template used for most lists.
		GenericList,
		// Document library.
		DocumentLibrary,
		// Unused
		Unused,
		// Discussion board
		DiscussionBoard,
		// Survey list.
		Survey,
		// Issue-tracking list.
		Issue
	}

	enum NegativeFormatEnum {
		MinusSign, Parens
	}

	enum StorageTZEnum {
		// TODO have to understand the case TRUE
		UTC, Abstract, TRUE;
	}	
	
	enum ShowFieldEnum{
		Text,
		Choice,
		Counter
	}
}
