package service;

public class BorrowService {
    private LibraryService libraryService;
    private MemberService memberService;
    public BorrowService(LibraryService newLibraryService,
                         MemberService newMemberService) {

        libraryService = newLibraryService;
        memberService = newMemberService;
    }


}
