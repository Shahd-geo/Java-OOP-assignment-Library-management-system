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

    }


    }
