package phonebook.hillel;

public class Record {
    private String name;
    private String numberPhone;

    public Record(String name, String numberPhone) {
        this.name = name;
        this.numberPhone = numberPhone;
    }

    public String getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(String numberPhone) {
        this.numberPhone = numberPhone;
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
        return numberPhone.equals(record.numberPhone);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + numberPhone.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Record{" +
                "name='" + name + '\'' +
                ", numberPhone='" + numberPhone + '\'' +
                '}';
    }
}
