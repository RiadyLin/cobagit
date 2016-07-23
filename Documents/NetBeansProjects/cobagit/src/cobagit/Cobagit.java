package cobagit;

import java.awt.EventQueue;
import javax.swing.JFrame;

public class Cobagit extends JFrame {

    private static final long serialVersionUID = 1L;

    public Cobagit() {
        initUI();
    }

    private void initUI() {
        setTitle("Simple example");
        setSize(9000, 9000);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
           int i = 1;
            int j = 5;
            int x = i+j;
        EventQueue.invokeLater(new Runnable() {
         
            
            @Override
            public void run() {
                Cobagit ex = new Cobagit();
                ex.setVisible(true);
            }
        });
    }
}
