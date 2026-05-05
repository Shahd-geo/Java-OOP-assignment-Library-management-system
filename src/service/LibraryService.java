package service;

import Data.LibraryItem;
import java.util.ArrayList;

public class LibraryService {

    private ArrayList<LibraryItem> items;

    public LibraryService() {
        items = new ArrayList<>();
    }

    public void addItem(LibraryItem item) {
        items.add(item);
    }

    public LibraryItem findItemById(int id) {
        for (LibraryItem item : items) {
            if (item.getId() == id) {
                return item;
            }
        }
        return null;
    }
    public void showAvailableItems(){

    }
}