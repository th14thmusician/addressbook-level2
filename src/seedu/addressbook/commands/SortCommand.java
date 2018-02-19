package seedu.addressbook.commands;

import seedu.addressbook.common.Messages;
import seedu.addressbook.data.AddressBook;

public class SortCommand extends Command{
    public static final String COMMAND_WORD = "sort";
    public static final String MESSAGE_SORT_COMPLETE = "Address book has been sorted in alphabetical order";


    public SortCommand(AddressBook addressBook){
        addressBook.sortPerson();
        addressBook.printAddresBook();
    }
}
