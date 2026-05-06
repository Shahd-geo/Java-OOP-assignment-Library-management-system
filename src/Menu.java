import service.BorrowService;
import service.LibraryService;
import service.MemberService;

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

    }


    }
