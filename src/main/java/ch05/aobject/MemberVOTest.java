package ch05.aobject;

public class MemberVOTest {
    public static void main(String[] args) {
        MemberVO mvo = new MemberVO();
        //접근제한자(access modifier)가 private - 캡슐화
        //mvo.mem_id = "kiwi";
        mvo.setMem_id("kiwi");
        //System.out.println(mvo.mem_id);
        String mem_id = mvo.getMem_id();
        System.out.println(mem_id);
        mvo.setMem_pw("123");
        System.out.println(mvo.getMem_pw());
        mvo.setMem_name("키위");
        System.out.println(mvo.getMem_name());
        mvo.setMem_nick("키위나무");
        System.out.println(mvo.getMem_nick());
    }
}
