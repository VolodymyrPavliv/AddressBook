package com.mushroom;

import java.util.LinkedList;
import java.util.List;

public class AddressBook {
    List<Rec> records = new LinkedList<>();

    private static AddressBook addressBookInstance = null;

    private AddressBook() {
    }

    public static AddressBook getInstance() {
        if(addressBookInstance == null){
            addressBookInstance = new AddressBook();
            return addressBookInstance;
        }
        return addressBookInstance;
    }

    public boolean creat(Rec rec){
        boolean result = true;
        for(Rec rec1 : records){
            if(rec1.getFirstName().equals(rec.getFirstName())
                    && rec1.getLastName().equals(rec.getLastName())){
                result = false;
            }
        }
        if(rec == null ){
            result = false;
        }
        return result?records.add(rec):result;
    }

    public Rec read(String firstName, String lastName){
        return records.stream()
                .filter(rec -> rec.getFirstName().equals(firstName) && rec.getLastName().equals(lastName)).findFirst().orElse(null);
    }

    public boolean update(String firstName, String lastName, Rec rec){
        int index = records.indexOf(read(firstName, lastName));
        return records.set(index,rec) != null;
    }

    public boolean delete(String firstName, String lastName){
        return records.remove(read(firstName, lastName));
    }

    public List<Rec> readAll(){
        return records;
    }

    public void sortByAsc() {
        records.sort((r1, r2)->{
            if (r1 == null || r2 == null) return 0;
            return r1.getFirstName().compareTo(r2.getFirstName())==0?
                    r1.getLastName().compareTo(r2.getLastName()) :
                    r1.getFirstName().compareTo(r2.getFirstName());
        });
    }

    public void sortByDesc(){
        records.sort((r1, r2)->{
            if (r1 == null || r2 == null) return 0;
            return r1.getFirstName().compareTo(r2.getFirstName())==0?
                    -r1.getLastName().compareTo(r2.getLastName()) :
                    -r1.getFirstName().compareTo(r2.getFirstName());
        });
    }
}
