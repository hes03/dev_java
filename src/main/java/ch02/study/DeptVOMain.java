package ch02.study;
//클래스 구성요소 = 메서드와 필드(변수)
//VO(Value Object)패턴 또는 DTO(Data Transfer Object)패턴
class DeptVO{ //ERP시스템
    int deptno; //부서번호 담기 - number(2) - int(4byte-32bit) or long(8byte-64bit)
    String dname; //부서이름 varchar2 -> String
    String loc; //지역 varchar2 -> String
}
class DeptDTO{

}
public class DeptVOMain {
    public static void main(String[] args) {
        //클래스 선언과 생성하기
        //RAM을 stack 영역과 heap 영역으로 나누어 관리함
        //클래스는 heap영역에 로딩
        DeptVO dvo = new DeptVO(); //인스턴스화
        //다른 클래스에 선언된 전변을 접근할 때는 인스턴스변수.전변이름 으로 접근함
        dvo.deptno = 10;
        dvo.dname = "ACCOUNTING";
        dvo.loc = "NEW YORK";
        //dvo.deptno = "10";  문법에러 -> 타입 에러
        //DeptVOMain 클래스에서 DeptVO클래스에 선언된 deptno변수를 사용할 수 없다.
        //main메서드가 있는 클래스에서 다른 클래스에 선언된 변수를 접근하려면 인스턴스화를 해야한다
        System.out.println(dvo.deptno); //10
        System.out.println(dvo.dname);
        System.out.println(dvo.loc);
        dvo.deptno = 20; //이와 같이 하면 기존의 값은 덮어쓰기가 됨 - 유지가 안됨
        //변수는 한번에 한가지만 담을 수 있다.
        dvo.dname = "RESEARCH";
        dvo.loc = "DALLAS";
        System.out.println(dvo.deptno); //20


    }
}
