package service;

import Data.Member;

import java.util.ArrayList;

public class MemberService {
    private ArrayList<Member> members;
    public MemberService() {
        members = new ArrayList<>();
    }
    public void addMember(Member member) {
        members.add(member);
    }
    public Member findMemberById(int id) {
}
