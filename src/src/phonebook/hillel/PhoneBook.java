package phonebook.hillel;

import java.util.ArrayList;
import java.util.List;


public class PhoneBook {
    private List<Record> records;

    public PhoneBook() {
        this.records = new ArrayList<>();
    }

    public void addRecord(Record record) {
        records.add(record);
    }

    public Record find(String name) {
        for (Record record : records) {
            if (record.getName().equals(name)) {
                return record;
            }
        }
        return null;
    }

    public List<Record> findAll(String name) {
        List<Record> findRecord = new ArrayList<>();
        for (Record rec : records) {
            if (rec.getName().equals(name)) {
                findRecord.add(rec);
            }
        }
        if (findRecord.isEmpty()) {
            return null;
        } else {
            return findRecord;
        }
    }


    @Override
    public String toString() {
        return "PhoneBook{" +
                "records=" + records +
                '}';
    }
}
