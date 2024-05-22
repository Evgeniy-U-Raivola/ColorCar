import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame ww=new JFrame();
        ww.add(new Design());
        ww.setBounds(50,50,800,550);
        ww.setBackground(Color.WHITE);
        ww.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ww.setResizable(true);//изменение размеров
        ww.setLocationRelativeTo(null);//окно по центру
        ww.setVisible(true);

    }
}