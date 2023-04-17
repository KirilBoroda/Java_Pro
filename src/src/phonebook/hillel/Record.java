package phonebook.hillel;

public class Record {
    private String name;
    private String phoneNumber;

    public Record(String name, String numberPhone) {
        this.name = name;
        this.phoneNumber = numberPhone;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Record record = (Record) o;

        if (!name.equals(record.name)) return false;
        return phoneNumber.equals(record.phoneNumber);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + phoneNumber.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Record{" +
                "name='" + name + '\'' +
                ", numberPhone='" + phoneNumber + '\'' +
                '}';
    }
}
