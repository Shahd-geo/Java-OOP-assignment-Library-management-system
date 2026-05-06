import service.BorrowService;
import service.LibraryService;
import service.MemberService;

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

    }
