package Data;

public class LibraryItem {
        private int IteamId;
        private String title;
        private boolean isAvailable;

        public LibraryItem(int newId, String newTitle) {
                IteamId = newId;
                title = newTitle;
                isAvailable = true;
        }

        public int getId() {
                return IteamId;
        }

        public String getTitle() {
                return title;
        }

        public boolean isAvailable() {
                return isAvailable;
        }

        public void borrowItem() {
                isAvailable = false;
        }

        public void returnItem() {
                isAvailable = true;
        }

        public String getDetails() {
                return "Item: " + title;
   }
}


