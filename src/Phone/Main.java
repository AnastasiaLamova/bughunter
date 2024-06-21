package Phone;

public class Main {
    public static void main(String[] args) {
        PhoneDirectory phoneDirectory = new PhoneDirectory();

        phoneDirectory.add("Прохоров", "+7-983-145-63-21");
        phoneDirectory.add("Кузнецов", "+7-909-502-63-65");
        phoneDirectory.add("Фролов", "+7-902-141-98-73");
        phoneDirectory.add("Смирнов", "+7-911-140-30-73");
        phoneDirectory.add("Фролов", "+7-915-123-90-71");

        System.out.println("Номера телефонов для фамилии Прохоров: " + phoneDirectory.get("Прохоров"));
        System.out.println("Номера телефонов для фамилии Кузнецов: " + phoneDirectory.get("Кузнецов"));
        System.out.println("Номера телефонов для фамилии Фролов: " + phoneDirectory.get("Фролов"));
        System.out.println("Номера телефонов для фамилии Смирнов: " + phoneDirectory.get("Смирнов"));
        System.out.println("Номера телефонов для фамилии Козлов: " + phoneDirectory.get("Козлов"));

        System.out.println("\nСправочник телефонов:");
        phoneDirectory.printPhoneBook();
    }
}