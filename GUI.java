import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class GUI extends JFrame {
    private List<String> players = new ArrayList<>();
    private String host;

    public GUI() {
        setTitle("Simple Game Application");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel playersLabel = new JLabel("Current Players: " + String.join(", ", players));
        add(playersLabel);
        JButton addPlayerButton = new JButton("Add Player");
        addPlayerButton.addActionListener(e -> {
            String playerName = JOptionPane.showInputDialog("Enter player name:");
            players.add(playerName);
            playersLabel.setText("Current Players: " + String.join(", ", players));
        });
        add(addPlayerButton);
        JLabel hostLabel = new JLabel("Host: " + host);
        add(hostLabel);
        JButton addHostButton = new JButton("Add Host");
        addHostButton.addActionListener(e -> {
            String hostName = JOptionPane.showInputDialog("Enter host name:");
            String gamePhrase = JOptionPane.showInputDialog("Enter game phrase:");
            host = hostName + " - " + gamePhrase;
            hostLabel.setText("Host: " + host);
        });
        add(addHostButton);
        JLabel playingPhraseLabel = new JLabel("Playing Phrase: _______________");
        add(playingPhraseLabel);
        JButton startTurnButton = new JButton("Start Turns");
        startTurnButton.addActionListener(e -> {
        });
        add(startTurnButton);

        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(GUI::new);
    }
}