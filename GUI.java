import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GUI extends JFrame implements ActionListener {
    private JTextArea messageArea;
    private JCheckBox saveMessagesCheckBox;

    public GUI() {
        setTitle("Game Menu GUI");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);

        JMenuBar menuBar = new JMenuBar();

        JMenu gameMenu = new JMenu("Game");
        gameMenu.setMnemonic(KeyEvent.VK_G);

        JMenuItem addPlayerMenuItem = new JMenuItem("Add Player");
        addPlayerMenuItem.addActionListener(this);
        gameMenu.add(addPlayerMenuItem);

        JMenuItem addHostMenuItem = new JMenuItem("Add Host");
        addHostMenuItem.addActionListener(this);
        gameMenu.add(addHostMenuItem);

        menuBar.add(gameMenu);
        JMenu aboutMenu = new JMenu("About");
        aboutMenu.setMnemonic(KeyEvent.VK_A);

        JMenuItem layoutMenuItem = new JMenuItem("Layout");
        layoutMenuItem.addActionListener(this);
        aboutMenu.add(layoutMenuItem);

        menuBar.add(aboutMenu);

        setJMenuBar(menuBar);
        JPanel mainPanel = new JPanel(new BorderLayout());
        messageArea = new JTextArea();
        messageArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(messageArea);
        mainPanel.add(scrollPane, BorderLayout.CENTER);
        saveMessagesCheckBox = new JCheckBox("Save Messages");
        saveMessagesCheckBox.setToolTipText("Check to save messages");
        saveMessagesCheckBox.addActionListener(this);
        mainPanel.add(saveMessagesCheckBox, BorderLayout.SOUTH);

        add(mainPanel);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();

        if (command.equals("Add Player")) {
            appendMessage("Player added.");
        } else if (command.equals("Add Host")) {
            appendMessage("Host added.");
        } else if (command.equals("Layout")) {
            JOptionPane.showMessageDialog(this, "I chose this layout for its simplicity and ease of use.");
        } else if (e.getSource() == saveMessagesCheckBox) {
            if (saveMessagesCheckBox.isSelected()) {
                appendMessage("Save messages checked.");
            } else {
                messageArea.setText("");
                appendMessage("Save messages unchecked.");
            }
        }
    }

    private void appendMessage(String message) {
        if (saveMessagesCheckBox.isSelected()) {
            messageArea.append(message + "\n");
        } else {
            messageArea.setText(message + "\n");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new GUI());
    }
}