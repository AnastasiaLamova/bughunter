package Phone;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class PhoneDirectory {
    private Map<String, Set<String>> phoneBook;

    public PhoneDirectory() {
        this.phoneBook = new HashMap<>();
    }

    public void add(String surname, String phoneNumber) {
        Set<String> phoneNumbers = phoneBook.getOrDefault(surname, new HashSet<>());
        phoneNumbers.add(phoneNumber);
        phoneBook.put(surname, phoneNumbers);
    }

    public Set<String> get(String surname) {
        return phoneBook.getOrDefault(surname, new HashSet<>());
    }

    public void printPhoneBook() {
        for (Map.Entry<String, Set<String>> entry : phoneBook.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
