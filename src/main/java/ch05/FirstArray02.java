package ch05;

public class FirstArray02 {
    public static void main(String[] args) {
        String is [] = new String[]{"국어", "영어", "수학"};
        for (String s : is){
            System.out.println(s);
        }
        for(int i=0;i<is.length;i++){
            System.out.println(is[i]);
        }
    }
}
