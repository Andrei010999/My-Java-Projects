import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame{
    private JPanel mainPanel;
    private JTextField fn;
    private JTextField ln;
    private JButton cancel;
    private JButton OK;
    private JLabel lastName;
    private JLabel name;

    public Main() {
        this.setContentPane(mainPanel);

        OK.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String fn1 = fn.getText();
                String ln1 = ln.getText();

                if (fn1.length() == 0 && ln1.length() == 0) {
                    return;
                }

                JOptionPane.showMessageDialog(mainPanel, "Hello " + fn1 + " " + ln1);
            }
        });
        cancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fn.setText("");
                ln.setText("");
            }
        });
    }

    public static void main(String[] args) {
        Main f = new Main();

        f.setSize(400,150);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        f.setVisible(true);
    }
}
