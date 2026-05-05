package Data;

public class Magazine extends LibraryItem {

        private int issueNumber;

        public Magazine(int newId, String newTitle, int newIssue) {
            super(newId, newTitle);
            issueNumber = newIssue;
        }

