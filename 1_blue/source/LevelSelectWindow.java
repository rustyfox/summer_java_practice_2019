import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class LevelSelectWindow extends JFrame {
    private static LevelSelectWindow selectWindow = new LevelSelectWindow();
    private class levelButton extends JButton{
        int levelNumber;
        public levelButton(int levelNumber, String name) {
            super(name);
            this.levelNumber = levelNumber;
        }
        public  levelButton(){
            super();
            this.levelNumber = 0;
        }
    }


    private LevelWindow  levelWindow = new LevelWindow();
    private levelButton levelButton = new levelButton(0, "Level 1");


    public static LevelSelectWindow getSelectWindow() {
        return selectWindow;
    }

    private LevelSelectWindow() {
        super("Пятнашки");
        this.setSize(300,400);
        this.setResizable(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        JPanel mainPanel = new JPanel();
        JPanel buttonsPanel = new JPanel();
        this.setContentPane(mainPanel);
        mainPanel.setLayout(null);
        mainPanel.setSize(this.getSize());
        buttonsPanel.setLayout(null);
        buttonsPanel.setLocation(mainPanel.getX() + 10,mainPanel.getY() + 20);
        buttonsPanel.setSize(mainPanel.getWidth() - 10, mainPanel.getHeight() - 50);
        buttonsPanel.add(levelButton);

        levelButton.setSize(buttonsPanel.getWidth() - 50, buttonsPanel.getHeight()/2 - 40);
        levelButton.setLocation(buttonsPanel.getX(),0);
        mainPanel.add(buttonsPanel);
        levelButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                selectWindow.setVisible(false);
                levelWindow.setVisible(true);
            }
        });




    }
}
