import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class newNotepad {
    static int WIDTH = 800;
    static int HEIGHT = 600;
    static JFrame frame;
    static JPanel panel;
    static JTextArea text;
    static JButton button;
    static JMenuBar menuBar;
    static JMenu menu;
    static JMenuItem menuItem;



    public static void main(String[] args) {
    frame = new JFrame("New Notepad");
    panel = new JPanel();
    text = new JTextArea(20, 20);
    button = new JButton("Clear");
        String string = "help";

        try {
            BufferedWriter writer = new BufferedWriter( new FileWriter(".\\test.txt"));
        writer.write(string);

        writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        menuBar = new JMenuBar();
    menu = new JMenu("Helo");
    menuItem = new JMenuItem("AAA");

    menu.add(menuItem);
    menuBar.add(menu);
    menuItem.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            text.append("AAAAAAAAAA");
        }
    });

    panel.add(text);
    panel.add(button);
    frame.add(panel);

    button.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            text.setText("");
        }
    });



        Dimension dim = new Dimension(WIDTH, HEIGHT);

        frame.setPreferredSize(dim);
        frame.pack();
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
