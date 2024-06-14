package Phone;

import java.util.*;

public class Phonebook {
    private Map<String, List<String>> phonebook = new HashMap<>();

    // Метод для добавления записи в справочник
    public void add(String lastName, String phoneNumber) {
        List<String> phones = phonebook.getOrDefault(lastName, new ArrayList<>());
        phones.add(phoneNumber);
        phonebook.put(lastName, phones);
    }

    // Метод для поиска номеров телефонов по фамилии
    public List<String> get(String lastName) {
        return phonebook.getOrDefault(lastName, new ArrayList<>());
    }

    public static void main(String[] args) {
        Phonebook phonebook = new Phonebook();

        // Добавляем некоторые записи в справочник
        phonebook.add("Прохоров", "+7-983-145-63-21");
        phonebook.add("Кузнецов", "+7-909-502-63-65");
        phonebook.add("Фролов", "+7-902-141-98-73");
        phonebook.add("Смирнов", "+7-911-140-30-73");
        phonebook.add("Фролов", "+7-915-123-90-71");

        // Поиск номеров телефонов по фамилии
        System.out.println("Номера телефонов для фамилии Фролов:");
        List<String> frolovPhones = phonebook.get("Фролов");
        for (String phone : frolovPhones) {
            System.out.println(phone);
        }

        System.out.println("\nНомера телефонов для фамилии Прохоров:");
        List<String> prokhorovPhones = phonebook.get("Прохоров");
        for (String phone : prokhorovPhones) {
            System.out.println(phone);
        }
        System.out.println("\nНомера телефонов для фамилии Кузнецов:");
        List<String> kuznetsovPhones = phonebook.get("Кузнецов");
        for (String phone : kuznetsovPhones) {
            System.out.println(phone);
        }
        System.out.println("\nНомера телефонов для фамилии Смирнов:");
        List<String> smirnovPhones = phonebook.get("Смирнов");
        for (String phone : smirnovPhones) {
            System.out.println(phone);
        }

        // Попытка поиска несуществующей фамилии
        System.out.println("\nНомера телефонов для фамилии Леонов:");
        List<String> leonovPhones = phonebook.get("Леонов");
        if (leonovPhones.isEmpty()) {
            System.out.println("Фамилия Леонов не найдена в справочнике.");
        }
    }
}
