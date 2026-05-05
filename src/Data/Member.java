package Data;
import java.util.ArrayList;


public class Member {
    private int id;
    private String name;
    private Address address;
    private ArrayList<LibraryItem> borrowedItems;


    public Member(int newId, String newName, Address newAddress) {
        id = newId;
        name = newName;
        address = newAddress;
        borrowedItems = new ArrayList<>();
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }

    public String getDetails() {
        return name + " " + address.getFullAddress();
    }
    public void borrowItem(LibraryItem item) {
        borrowedItems.add(item);
    }
    public void returnItem(LibraryItem item) {
        borrowedItems.remove(item);
    }

}
