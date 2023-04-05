package phonebook.hillel;

public class Main {
    public static void main(String[] args) {
        PhoneBook book = new PhoneBook();
        book.addRecord(new Record("Ivan", "+13412312312"));
        book.addRecord(new Record("Ivan", "+13412312312"));
        book.addRecord(new Record("Ivan3", "+13412312312"));
        book.find("Ivan2");
        System.out.println(book);
        System.out.println(book.findAll("Ivan"));
    }


}
