import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class LevelWindow extends JFrame {

    private JButton closeButton = new JButton("Close");
    private JButton randomButton = new JButton("Random");
    private JButton buildButton = new JButton("Show Solution");
    public LevelWindow() {
        super("Пятнашки");
        setSize(600,500);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        JPanel mainPanel = new JPanel();
        JPanel tilesPanel = new JPanel();
        this.setContentPane(mainPanel);
        mainPanel.setLayout(null);
        mainPanel.setSize(this.getSize());
        tilesPanel.setLayout(new GridLayout(4,4,10,10));
        tilesPanel.setLocation(mainPanel.getWidth()/16,mainPanel.getHeight()/6 );
        tilesPanel.setSize(270, 270);
        for (int i = 0; i < 16; i++)
        {
            tilesPanel.add(new JButton(Integer.toString(i)));
        }

        tilesPanel.getComponents()[0].setVisible(false);
        mainPanel.add(tilesPanel);
        JPanel buttonsPanel = new JPanel();
        buttonsPanel.setLocation(tilesPanel.getWidth() + 100, tilesPanel.getY() -10);
        buttonsPanel.setSize(200,300);
        buttonsPanel.setLayout(new GridLayout(4,1,10,10));
        buttonsPanel.add(randomButton);
        buttonsPanel.add(buildButton);
        buttonsPanel.add(new JButton("1"));
        buttonsPanel.getComponents()[buttonsPanel.getComponents().length - 1].setVisible(false);
        buttonsPanel.add(closeButton);
        mainPanel.add(buttonsPanel);
        closeButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                System.exit(0);
            }
        });

    }
}

/*
class MyBtn extends JButton implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

    }
}*/
