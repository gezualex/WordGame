import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;

public class GUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Game Application");
        JMenuBar menuBar = new JMenuBar();
        JMenu gameMenu = new JMenu("Game");
        gameMenu.setMnemonic(KeyEvent.VK_G);
        JMenuItem addPlayerItem = new JMenuItem("Add Player");
        gameMenu.add(addPlayerItem);
        JMenuItem addHostItem = new JMenuItem("Add Host");
        gameMenu.add(addHostItem);

        menuBar.add(gameMenu);
        JMenu aboutMenu = new JMenu("About");
        aboutMenu.setMnemonic(KeyEvent.VK_A);
        JMenuItem layoutItem = new JMenuItem("Layout");
        layoutItem.addActionListener(e -> JOptionPane.showMessageDialog(frame,
                "I chose this layout for its simplicity and ease of navigation.",
                "Layout Information", JOptionPane.INFORMATION_MESSAGE));
        aboutMenu.add(layoutItem);

        menuBar.add(aboutMenu);

        frame.setJMenuBar(menuBar);
        JPanel mainPanel = new JPanel(new BorderLayout());
        JPanel playerPanel = new JPanel();
        playerPanel.add(new JLabel("Player Panel"));
        mainPanel.add(playerPanel, BorderLayout.NORTH);

        JPanel hostPanel = new JPanel();
        hostPanel.add(new JLabel("Host Panel"));
        mainPanel.add(hostPanel, BorderLayout.CENTER);

        frame.add(mainPanel);

        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}