import Data.Address;
import Data.Magazine;
import Data.Member;
import service.BorrowService;
import service.LibraryService;
import service.MemberService;
import Data.Book;
import java.util.Scanner;

public class Menu {

    private LibraryService libraryService;

    private MemberService memberService;

    private BorrowService borrowService;

    public Menu() {

        libraryService = new LibraryService();

        memberService = new MemberService();

        borrowService =
                new BorrowService(libraryService, memberService);
    }

    public void start() {
        Scanner input = new Scanner(System.in);
        boolean running = true;

        while (running) {

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

                    System.out.println("Enter Book ID:");
                    int id = input.nextInt();

                    input.nextLine();

                    System.out.println("Enter Book Title:");
                    String title = input.nextLine();

                    System.out.println("Enter Author Name:");
                    String author = input.nextLine();

                    Book book = new Book(id, title, author);

                    libraryService.addItem(book);

                    System.out.println("Book Added Successfully");

                    break;
                case 2:

                    System.out.println("Enter Magazine ID:");
                    int magId = input.nextInt();

                    input.nextLine();

                    System.out.println("Enter Magazine Title:");
                    String magTitle = input.nextLine();

                    System.out.println("Enter Issue Number:");
                    int issue = input.nextInt();

                    Magazine magazine =
                            new Magazine(magId, magTitle, issue);

                    libraryService.addItem(magazine);

                    System.out.println("Magazine Added Successfully");

                    break;
                default:

                    System.out.println("Invalid Option");
            case 3:

                libraryService.showAvailableItems();

                break;
                case 4:

                    System.out.println("Enter Member ID:");
                    int memberId = input.nextInt();

                    input.nextLine();

                    System.out.println("Enter Member Name:");
                    String memberName = input.nextLine();

                    System.out.println("Enter Street Name:");
                    String street = input.nextLine();

                    System.out.println("Enter City Name:");
                    String city = input.nextLine();

                    Address address =
                            new Address(street, city);

                    Member member =
                            new Member(memberId, memberName, address);

                    memberService.addMember(member);

                    System.out.println("Member Added Successfully");

                    break;
                case 5:

                    memberService.showAllMembers();

                    break;
                case 6:

                    System.out.println("Enter Member ID:");
                    int borrowMemberId = input.nextInt();

                    System.out.println("Enter Item ID:");
                    int borrowItemId = input.nextInt();

                    borrowService.borrowItem(borrowMemberId, borrowItemId);

                    break;
                case 7:

                    System.out.println("Enter Member ID:");
                    int returnMemberId = input.nextInt();

                    System.out.println("Enter Item ID:");
                    int returnItemId = input.nextInt();

                    borrowService.returnItem(returnMemberId, returnItemId);

                    break;
                case 8:

                    running = false;

                    System.out.println("Program Ended");

                    break;
        }

    }
}
