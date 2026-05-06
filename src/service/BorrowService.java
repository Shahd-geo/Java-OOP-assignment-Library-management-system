package service;

import Data.LibraryItem;
import Data.Member;

public class BorrowService {
    private LibraryService libraryService;
    private MemberService memberService;
    public BorrowService(LibraryService newLibraryService,
                         MemberService newMemberService) {

        libraryService = newLibraryService;
        memberService = newMemberService;
    }
    public void borrowItem(int memberId, int itemId) {

        Member member = memberService.findMemberById(memberId);

        LibraryItem item = libraryService.findItemById(itemId);

        if (member == null || item == null) {
            System.out.println("Member or Item not found");
            return;
        }

        if (!item.isAvailable()) {
            System.out.println("Item already borrowed");
            return;
        }

        item.borrowItem();

        member.borrowItem(item);

        System.out.println("Borrow successful");
    }


}
