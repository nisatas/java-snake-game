import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class OyunGiris extends JFrame {

    JButton startButton;

    OyunGiris() {
        setTitle("Oyun Giriş Ekranı");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false); 

        
        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Dimension arcs = new Dimension(15,15);
                int width = getWidth();
                int height = getHeight();
                Graphics2D graphics = (Graphics2D) g;
                graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
                graphics.setColor(getBackground());
                graphics.fillRoundRect(0, 0, width-1, height-1, arcs.width, arcs.height); 
                graphics.setColor(getForeground());
                graphics.drawRoundRect(0, 0, width-1, height-1, arcs.width, arcs.height); 
            }
        };
        panel.setBackground(Color.LIGHT_GRAY);
        panel.setLayout(new BorderLayout());
        panel.setBorder(BorderFactory.createEmptyBorder(50, 100, 50, 100));

        
        JLabel rulesLabel = new JLabel("<html><center><h2 style='color: blue; font-family: Verdana; font-size:  20px;'>Oyun Kuralları</h2>" +
                "<ul class='rule-list'>" +
                "<li style='background-color: ; font-family: Sans; font-size: 15px;'>Yılanı kontrol etmek için yön tuşlarını kullanın.</li>" +
                "<li style='background-color: ; font-family: Sans; font-size: 15px;'>Yılanın başını ve vücudunu bombalardan koruyun.Siyah daire bombayı, kırmızı daire ise elmayı temsil ediyor.</li>" +
                "<li style='background-color: ; font-family: Sans; font-size: 15px;'>Yılanın kuyruğuna çarpmadan mümkün olduğunca çok elma yiyin. BOL ŞANS...</li></ul></center></html>");
        rulesLabel.setHorizontalAlignment(SwingConstants.CENTER);
        panel.add(rulesLabel, BorderLayout.NORTH);

        
        startButton = new JButton("Oyuna Başla");
        startButton.setForeground(Color.WHITE);
        startButton.setBackground(new Color(30, 144, 255)); 
        startButton.setFocusPainted(false);
        startButton.setPreferredSize(new Dimension(150, 40)); 
        startButton.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2)); 
        startButton.setFont(new Font("Verdana", Font.BOLD, 20)); 
        startButton.setCursor(new Cursor(Cursor.HAND_CURSOR)); 

        startButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                
                dispose(); 
                new OyunCercevesi(); 
            }
        });

        
        panel.add(startButton, BorderLayout.CENTER);

        
        getContentPane().add(panel, BorderLayout.CENTER);

        
        panel.setPreferredSize(new Dimension(700, 600)); 

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new OyunGiris();
    }
}
