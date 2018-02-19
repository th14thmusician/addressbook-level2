package seedu.addressbook.commands;

import org.junit.Test;
import seedu.addressbook.data.AddressBook;
import seedu.addressbook.data.person.*;
import seedu.addressbook.data.tag.UniqueTagList;
import seedu.addressbook.util.TestUtil;

import java.util.Collections;
import java.util.List;
import java.util.Set;

import static org.junit.Assert.*;

public class SortCommandTest {
    private static final List<ReadOnlyPerson> EMPTY_PERSON_LIST = Collections.emptyList();

    @Test
    public void sortPersons_validData_correctlyConstructed() throws Exception {
        Person p = TestUtil.generateTestPerson();
        AddressBook book = new AddressBook();
        book.addPerson(p);
        book.addPerson(new Person(new Name("Ahmad"), new Phone(Phone.EXAMPLE, false),
                new Email(Email.EXAMPLE, true), new Address(Address.EXAMPLE, false), new UniqueTagList()));
        AddCommand command = new AddCommand(p);
        command.setData(book, EMPTY_PERSON_LIST);
        SortCommand sc = new SortCommand(book);

    }
}