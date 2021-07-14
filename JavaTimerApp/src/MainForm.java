import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;



public class MainForm extends JFrame {
    private JPanel mainPanel;
    private JPanel secondaryPanel;
    private JRadioButton rb1;
    private JRadioButton rb2;
    private JColorChooser selectorCuloare;
    private JButton cc;
    private JSpinner spinner1;
    private JLabel setSpeed;
    private JButton startButton;
    private JButton stopButton;
    private JTextField textField2;
    private JLabel colorLabel;
    private JTextField selectOra;
    private Color color;
    JFrame frame;
    boolean showNormalColor = true;


    public MainForm() {
        this.setContentPane(mainPanel);
        JColorChooser selectorCuloare = new JColorChooser();
        frame = new JFrame();
        frame.setLocationRelativeTo(null);
        frame.setContentPane(secondaryPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        mainPanel.add(selectorCuloare);
        selectorCuloare.setVisible(false);
        secondaryPanel.setVisible(false);

        spinner1.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                JSpinner jSpinner = (JSpinner) e.getSource();
            }
        });
        stopButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        selectOra.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        cc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JColorChooser selectorCuloare = new JColorChooser();
                selectorCuloare.setVisible(true);
                color = JColorChooser.showDialog(selectorCuloare, "SHOW THE COLOR",
                        selectorCuloare.getColor());

                int blue = color.getBlue();
                int red = color.getRed();
                int green = color.getGreen();

                colorLabel.setText("rgb(" + red +"," + green +"," + blue + ")");
                colorLabel.setForeground(color);
                selectorCuloare.setVisible(false);


            }
        });
        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String countDown = "";
                int speed = 1;
                int elapsedTime = 0;
                String textOra = selectOra.getText();
                String[] ora = textOra.split(":");

                DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
                LocalTime localTime = LocalTime.now();
                String time = dtf.format(localTime);




                if (rb2.isSelected()){
                    countDown = textField2.getText();
                    try {
                        Thread.sleep((Long.parseLong(countDown)*1000));
                    } catch (InterruptedException interruptedException) {
                        interruptedException.printStackTrace();
                    }
                }
                else {
                    String[] timeToCompare = time.split(":");

                    String ore = ora[0];
                    String minute = ora[1];
                    String secunde = ora[2];

                    double oreInt = Integer.parseInt(ore);
                    double minuteInt = Integer.parseInt(minute);
                    double secundeInt = Integer.parseInt(secunde);

                    String oraCurenta = timeToCompare[0];
                    String minuteCurente = timeToCompare[1];
                    String secundeCurente = timeToCompare[2];

                    double oraCurentaInt = Integer.parseInt(oraCurenta);
                    double minuteCurenteInt = Integer.parseInt(minuteCurente);
                    double secundeCurenteInt = Integer.parseInt(secundeCurente);

                    double hToSecForInput = oreInt*60*60;
                    double mToSecForInput = minuteInt*60;

                    double hToSecCurrent = oraCurentaInt*60*60;
                    double mToSecCurrent = minuteCurenteInt*60;

                    double valFinalinSforInput = hToSecForInput + mToSecForInput + secundeInt;
                    double valFinalSCurrent = hToSecCurrent + mToSecCurrent + secundeCurenteInt;

                    double sleep = valFinalinSforInput - valFinalSCurrent;

                    if (sleep > 0){
                        try {
                            Thread.sleep((long) (sleep * 1000));
                        } catch (InterruptedException interruptedException) {
                            interruptedException.printStackTrace();
                        }
                    }else {
                        JOptionPane.showMessageDialog(null,"Time setted is before current time", "ERROR", JOptionPane.ERROR_MESSAGE);
                    }
                }


                speed = (Integer) spinner1.getValue();



                if (speed > 0 ){
                    Timer timer = new Timer(200*speed, new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent ev) {
                            showNormalColor = !showNormalColor;
                            AfiseazaPatrat(color, showNormalColor);
                        }
                    });
                    timer.start();
                }
                else {
                    JOptionPane.showMessageDialog(null,"Speed cannot be 0","Error", JOptionPane.ERROR_MESSAGE);
                }

            }


            public void AfiseazaPatrat(Color color, boolean showNormalCore) {
                if (showNormalCore) {
                    secondaryPanel.setBackground(color);
                } else {
                    secondaryPanel.setBackground(Color.white);
                }
                frame.setVisible(true);
                secondaryPanel.setVisible(true);
            }
        });
    }

    public static void main(String[] args) {

        MainForm f = new MainForm();
        f.setTitle("Settings");
        f.setSize(600, 400);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(EXIT_ON_CLOSE);



        String[] buttons = {"Settings", "Cancel"};

        int response = JOptionPane.showOptionDialog(null, "Choose an option", "Option Dialog", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, buttons, buttons[0]);

        if (response == 0){
            f.setVisible(true);
        }
        if (response != 0){
            JOptionPane.showMessageDialog(null, "You canceled");
        }
    }
}