import service.BorrowService;
import service.LibraryService;
import service.MemberService;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        LibraryService libraryService = new LibraryService();

        MemberService memberService = new MemberService();

        BorrowService borrowService =
                new BorrowService(libraryService, memberService);

        while (true) {

            System.out.println("====== Library System ======");
            System.out.println("1. Add Book");
            System.out.println("2. Add Magazine");
            System.out.println("3. Show Available Items");
            System.out.println("4. Add Member");
            System.out.println("5. Show Members");
            System.out.println("6. Borrow Item");
            System.out.println("7. Return Item");
            System.out.println("8. Exit");
            int choice = input.nextInt();
            switch (choice) {

                case 1:

                    Book book =
                            new Book(1, "Java Basics", "Ali");

                    libraryService.addItem(book);

                    System.out.println("Book Added");

                    break;

                case 2:

                    Magazine magazine =
                            new Magazine(2, "Tech", 5);

                    libraryService.addItem(magazine);

                    System.out.println("Magazine Added");

                    break;

                case 3:

                    libraryService.showAvailableItems();

                    break;

                case 4:

                    Address address =
                            new Address("Muscat", "Oman");

                    Member member =
                            new Member(1, "Shahd", address);

                    memberService.addMember(member);

                    System.out.println("Member Added");

                    break;

                case 5:

                    memberService.showAllMembers();

                    break;

                case 6:

                    borrowService.borrowItem(1, 1);

                    break;

                case 7:

                    borrowService.returnItem(1, 1);

                    break;

                case 8:

                    System.out.println("Program Ended");

                    return;

                default:

                    System.out.println("Invalid Choice");
            }
        }
    }



}
