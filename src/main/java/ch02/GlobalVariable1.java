package ch02;

public class GlobalVariable1 {
    int empno = 7566;
    public static void main(String[] args) {
        //여기에서 사원번호 7566을 출력하려고 한다. 어떻게 하나요
        //--> 인스턴스화
        GlobalVariable1 gv1 = new GlobalVariable1();
        System.out.println("변경 전 사원번호 : "+gv1.empno);
        //사원번호를 7499로 변경하기
        gv1.empno = 7499;
        System.out.println("원본 사원번호 : "+gv1.empno);
        gv1 = new GlobalVariable1();
        gv1.empno = 8000;
        System.out.println("복사본 사원번호 : "+gv1.empno);
    }
}
