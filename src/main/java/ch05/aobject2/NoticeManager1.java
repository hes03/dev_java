package ch05.aobject2;
//NoticeVO에는 main 선언하지 않는다. - 왜?
public class NoticeManager1 {
    public static void main(String[] args) {
        //변수 이름은 같지만 주소번지는 서로 다르다. 왜?
        NoticeVO[] nvos = new NoticeVO[3];
        NoticeVO nvo1 = new NoticeVO();
        nvo1.setN_title("금연");

        NoticeVO nvo2 = new NoticeVO();
        nvo2.setN_title("단수");

        NoticeVO nvo3 = new NoticeVO();
        nvo3.setN_title("난방");
        nvos[0] = nvo1;
        nvos[1] = nvo2;
        nvos[2] = nvo3;
        for(int i=0;i<nvos.length;i++){
            //금연, 단수, 난방
            //난방, 난방, 난방
            System.out.println("공지사항 제목 출력하기 " + nvos[i].getN_title());
        }
        System.out.println("여기");
    }
}
