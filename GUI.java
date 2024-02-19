import javax.swing.*;
<<<<<<< Updated upstream
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
=======
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class GUI extends JFrame {
    private JLabel playersLabel;
    private JLabel hostLabel;
    private JLabel playingPhraseLabel;
    private JButton addPlayerButton;
    private JButton addHostButton;
    private JButton startTurnsButton;

    private ArrayList<Player> players;
    private Host host;
    private String playingPhrase;

    public GUI() {
        players = new ArrayList<>();
        host = new Host();
        playingPhrase = "_________";

        setTitle("Game Interface");
        setLayout(null);

        playersLabel = new JLabel("Players: ");
        playersLabel.setBounds(10, 10, 200, 30);
        add(playersLabel);

        addPlayerButton = new JButton("Add Player");
        addPlayerButton.setBounds(220, 10, 150, 30);
        add(addPlayerButton);

        addPlayerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Player newPlayer = new Player();
                players.add(newPlayer);

                updatePlayersLabel();
            }
        });

        hostLabel = new JLabel("Host: " + host.getName());
        hostLabel.setBounds(10, 50, 200, 30);
        add(hostLabel);

        addHostButton = new JButton("Add Host");
        addHostButton.setBounds(220, 50, 150, 30);
        add(addHostButton);

        addHostButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String hostName = JOptionPane.showInputDialog("Enter host name:");
                String gamePhrase = JOptionPane.showInputDialog("Enter game phrase:");
                host.setName(hostName);
                host.setGamePhrase(gamePhrase);

                updateHostLabel();
                updatePlayingPhraseLabel();
            }
        });

        playingPhraseLabel = new JLabel("Playing Phrase: " + playingPhrase);
        playingPhraseLabel.setBounds(10, 90, 300, 30);
        add(playingPhraseLabel);

        startTurnsButton = new JButton("Start Turns");
        startTurnsButton.setBounds(10, 130, 150, 30);
        add(startTurnsButton);

        startTurnsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Implement game logic for player turns
                // Display results using JOptionPane
                // Check for winner and prizes
                // Ask player if they want to play again
            }
        });

        setSize(400, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    private void updatePlayersLabel() {
        StringBuilder playersStr = new StringBuilder("Players: ");
        for (Player player : players) {
            playersStr.append(player.getName()).append(", ");
        }
        playersLabel.setText(playersStr.toString());
    }

    private void updateHostLabel() {
        hostLabel.setText("Host: " + host.getName());
    }

    private void updatePlayingPhraseLabel() {
        playingPhraseLabel.setText("Playing Phrase: " + host.getGamePhrase());
    }

    public static void main(String[] args) {
        new GUI();
    }
}
>>>>>>> Stashed changes
