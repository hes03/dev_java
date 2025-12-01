package ch03;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Oper03_3 implements ActionListener {
    JFrame jf = new JFrame();
    JTextField jtf_first = new JTextField(5);
    JTextField jtf_second = new JTextField(5);
    JButton btn_account = new JButton("계산");
    JTextField jtf_result = new JTextField(10);

    public static void main(String[] args) {
        Oper03_3 op033 = new Oper03_3();
        op033.btn_account.addActionListener(op033);
        op033.jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        op033.jf.setLayout(new FlowLayout(FlowLayout.LEFT));
        op033.jf.add(op033.jtf_first);
        op033.jf.add(op033.jtf_second);
        op033.jf.add(op033.btn_account);
        op033.jf.add(op033.jtf_result);
        op033.jf.setSize(400,300);
        op033.jf.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //이벤트가 감지된 주소번지를 가져온다.
        Object obj = e.getSource();
        //버튼을 클릭한거야?
        //이벤트 소스와 버튼의 주소번지가 같은지
        if (obj == btn_account){
            System.out.println("계산버튼 클릭");

        }
        String sFirst = jtf_first.getText();
        int iFirst = Integer.parseInt(sFirst);
        String sSecond = jtf_second.getText();
        int iSecond = Integer.parseInt(sSecond);

        jtf_result.setText(String.valueOf(iFirst+iSecond));
    }
}
