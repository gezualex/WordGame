import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.File;

public class GUI extends JFrame implements ActionListener {

  private JButton imageButton, soundButton, animationButton;
  private JMenuItem imageAttribution, soundAttribution;

  public GUI() {
    setTitle("Game with Image, Sound, and Animation");
    setSize(800, 600);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JMenuBar menuBar = new JMenuBar();
    JMenu aboutMenu = new JMenu("About");

    imageAttribution = new JMenuItem("Image Attribution");
    soundAttribution = new JMenuItem("Sound Attribution");

    aboutMenu.add(imageAttribution);
    aboutMenu.add(soundAttribution);
    menuBar.add(aboutMenu);

    setJMenuBar(menuBar);

    setLayout(new FlowLayout());

    imageButton = new JButton("Show Prize Image");
    soundButton = new JButton("Play Sound");
    animationButton = new JButton("Play Animation");

    add(imageButton);
    add(soundButton);
    add(animationButton);

    imageButton.addActionListener(this);
    soundButton.addActionListener(this);
    animationButton.addActionListener(this);

    setVisible(true);
  }

  @Override
  public void actionPerformed(ActionEvent e) {
    if (e.getSource() == imageButton) {
      ImageIcon icon = new ImageIcon("C:\\Users\\GEZU\\Downloads\\walia (2).jpg");
      JLabel label = new JLabel();
      label.setIcon(icon);
      add(label);
      revalidate();
      repaint();
    } else if (e.getSource() == soundButton) {
      playSound("C:\\Users\\GEZU\\Downloads\\sunflower-street-drumloop-85bpm-163900.mp3");
    } else if (e.getSource() == animationButton) {
      playAnimation();
    }
  }

  private void playSound(String soundFile) {
    try {
      Clip clip = AudioSystem.getClip();
      clip.open(AudioSystem.getAudioInputStream(new File(soundFile)));
      clip.start();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  private void playAnimation() {
  }

  public static void main(String[] args) {
    new GUI();
  }
}