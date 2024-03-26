import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class myFrame extends JFrame {

    JTextField textField;
    JButton button;
    myFrame() {

        ImageIcon logo = new ImageIcon("C:\\Users\\HsKim\\Documents\\GitHub\\Georgia_Kendo_Club_Tournament_Bracket\\src\\gkc_logo.png");

        //Title Text "Georgia Kendo Club"
        JLabel title = new JLabel();
        title.setText("Georgia Kendo Club");
        title.setIcon(logo);
        title.setHorizontalTextPosition(JLabel.CENTER);
        title.setVerticalTextPosition(JLabel.BOTTOM);
        title.setForeground(Color.WHITE);
        title.setFont(new Font("Aerial", Font.PLAIN, 85));
        title.setHorizontalAlignment(JLabel.CENTER);
        title.setBounds(0, -150, 1920, 1080);
        this.add(title);

        //Sub Title "Tournament Bracket"
        JLabel subTitle = new JLabel();
        subTitle.setText("Tournament Bracket");
        subTitle.setForeground(Color.WHITE);
        subTitle.setFont(new Font("Arial", Font.PLAIN, 40));
        subTitle.setHorizontalAlignment(JLabel.CENTER);
        subTitle.setBounds(0, 100, 1920, 1080);
        this.add(subTitle);

        //Player number Input
        JLabel numGuide = new JLabel();
        numGuide.setText("Enter Rounds Number:");
        numGuide.setForeground(Color.WHITE);
        numGuide.setFont(new Font("Arial", Font.PLAIN, 20));
        numGuide.setHorizontalAlignment(JLabel.CENTER);
        numGuide.setBounds(-175, 275, 1920, 1080);
        this.add(numGuide);

        //Player number Input
        JLabel num = new JLabel();
        num.setText("Rounds - (4, 8, 16)");
        num.setForeground(Color.WHITE);
        num.setFont(new Font("Arial", Font.PLAIN, 15));
        num.setHorizontalAlignment(JLabel.CENTER);
        num.setBounds(-175, 300, 1920, 1080);
        this.add(num);

        //Internal use only
        JLabel internalUseOnly = new JLabel();
        internalUseOnly.setText("Internal Use Only");
        internalUseOnly.setForeground(Color.WHITE);
        internalUseOnly.setFont(new Font("Arial", Font.PLAIN, 15));
        internalUseOnly.setHorizontalAlignment(JLabel.CENTER);
        internalUseOnly.setBounds(850, 460, 1920, 1080);
        this.add(internalUseOnly);

        // Text Field
        textField = new JTextField();
        textField.setBounds(900, 800, 100, 30);
        this.add(textField);

        // Button
        button = new JButton("Generate");
        button.setBounds(1020, 800, 150, 30);
        button.setSize(90,30);
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                RoundOf4();
            }
        });
        this.add(button);

        //Head title
        this.setTitle("GKC Tournament Bracket");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setSize(1920, 1080);
        this.setLayout(null);
        this.setVisible(true);

        ImageIcon image = new ImageIcon("C:\\Users\\HsKim\\Documents\\GitHub\\Georgia_Kendo_Club_Tournament_Bracket\\src\\gkc_logo_black.png");
        this.setIconImage(image.getImage());

        this.getContentPane().setBackground(Color.BLACK);
    }
    private void RoundOf4() {
        String input = textField.getText();
        if(!input.isEmpty() && input.matches("\\d+")) {
            int playerNumber = Integer.parseInt(input);
            if(playerNumber == 4) {
                JFrame playerPage = new JFrame();

                ImageIcon logoLeft = new ImageIcon("C:\\Users\\HsKim\\Documents\\GitHub\\Georgia_Kendo_Club_Tournament_Bracket\\src\\gkc_logo.png");
                Image logoPage = logoLeft.getImage();
                Image scaledImage = logoPage.getScaledInstance(120, 100, Image.SCALE_SMOOTH);
                logoLeft = new ImageIcon(scaledImage);

                //Title Text "Georgia Kendo Club"
                JLabel titleLeft = new JLabel();
                titleLeft.setText("Georgia Kendo Club");
                titleLeft.setIcon(logoLeft);
                titleLeft.setHorizontalTextPosition(JLabel.RIGHT);
                titleLeft.setVerticalTextPosition(JLabel.CENTER);
                titleLeft.setForeground(Color.WHITE);
                titleLeft.setFont(new Font("Aerial", Font.PLAIN, 50));
                titleLeft.setHorizontalAlignment(JLabel.LEFT);
                titleLeft.setBounds(40, -450, 1920, 1080);
                playerPage.add(titleLeft);

                //Total Participants
                JLabel participant = new JLabel("Max Participants: " + playerNumber);
                participant.setForeground(Color.WHITE);
                participant.setFont(new Font("Arial", Font.PLAIN, 15));
                participant.setBounds(50,200,200,20);

                //winner
                JLabel winnerText = new JLabel("WINNER");
                winnerText.setForeground(Color.WHITE);
                winnerText.setFont(new Font("Arial", Font.PLAIN, 20));
                winnerText.setBounds(883,370,200,18);

                //Name Left
                JLabel nameLeft = new JLabel("NAME");
                nameLeft.setForeground(Color.WHITE);
                nameLeft.setFont(new Font("Arial", Font.PLAIN, 20));
                nameLeft.setBounds(250,270,200,15);

                //Name Right
                JLabel nameRight = new JLabel("NAME");
                nameRight.setForeground(Color.WHITE);
                nameRight.setFont(new Font("Arial", Font.PLAIN, 20));
                nameRight.setBounds(1544,270,200,15);

                //Final
                JLabel finalText = new JLabel("FINAL MATCH");
                finalText.setForeground(Color.WHITE);
                finalText.setFont(new Font("Arial", Font.PLAIN, 20));
                finalText.setBounds(855,700,200,18);

                //semiFinal
                JLabel semiFinalText = new JLabel("SEMI - FINAL");
                semiFinalText.setForeground(Color.WHITE);
                semiFinalText.setFont(new Font("Arial", Font.PLAIN, 60));
                semiFinalText.setBounds(750,200,600,50);

                //Internal use only
                JLabel internalUseOnly = new JLabel();
                internalUseOnly.setText("Internal Use Only");
                internalUseOnly.setForeground(Color.WHITE);
                internalUseOnly.setFont(new Font("Arial", Font.PLAIN, 15));
                internalUseOnly.setHorizontalAlignment(JLabel.CENTER);
                internalUseOnly.setBounds(850, 460, 1920, 1080);
                playerPage.add(internalUseOnly);

                int xPositionLeft = 250; // X position for text fields
                int yPositionLeft = 300; // Y position for text fields
                int xPositionRight = 1500; // X position for text fields
                int yPositionRight = 300; // Y position for text fields
                int xPositionMid = 870; // X position for text fields
                int yPositionMid = 400; // Y position for text fields

                // Generate pairs of text fields on the left side
                int spaceLeft = 0;
                for(int i = 0; i < 2; i++) {
                    JTextField textField1 = new JTextField();
                    textField1.setBounds(xPositionLeft, yPositionLeft + spaceLeft, 100, 30);
                    playerPage.add(textField1);
                    spaceLeft = spaceLeft + 500;
                }

                // Generate pairs of text fields on the right side
                int spaceRight = 0;
                for(int i = 0; i < 2; i++) {
                    JTextField textField2 = new JTextField();
                    textField2.setBounds(xPositionRight, yPositionRight + spaceRight, 100, 30);
                    playerPage.add(textField2);
                    spaceRight = spaceRight + 500;
                }

                //Final Left
                JTextField textField3 = new JTextField();
                textField3.setBounds(xPositionLeft + 450, yPositionLeft + 350, 100, 30);
                playerPage.add(textField3);

                //Final Right
                JTextField textField4 = new JTextField();
                textField4.setBounds(xPositionRight - 450, yPositionRight + 350, 100, 30);
                playerPage.add(textField4);

                //Winner
                JTextField textField7 = new JTextField();
                textField7.setBounds(xPositionMid, yPositionMid, 100, 30);
                playerPage.add(textField7);

                //Line
                JPanel linePanel = new JPanel() {
                    @Override
                    protected void paintComponent(Graphics g) {
                        super.paintComponent(g);
                        g.setColor(Color.WHITE);
                        int xLeft1 = 300;
                        int xLeft2 = 450;
                        int yLeft1 = 315;

                        int lineCount = 0;
                        for(int i = 0; i < 2; i++) {
                            g.drawLine(xLeft1, yLeft1 + lineCount, xLeft2, yLeft1 + lineCount);

                            lineCount = lineCount + 500;
                        }
                        g.drawLine(xLeft2, yLeft1 + 500, xLeft2, yLeft1);
                        g.drawLine(xLeft2, yLeft1 + 350, xLeft2 + 300, yLeft1 + 350);

                        g.drawLine(800, 665, 1100, 665);
                        g.drawLine(920, 400, 920, 665);

                        int xRight1 = 1400;
                        int xRight2 = 1595;
                        int yRight1 = 315;

                        int lineCount2 = 0;
                        for(int i = 0; i < 2; i++) {
                            g.drawLine(xRight1, yRight1 + lineCount2, xRight2, yRight1 + lineCount2);

                            lineCount2 = lineCount2 + 500;
                        }
                        g.drawLine(xRight1, yRight1 + 500, xRight1, yRight1);
                        g.drawLine(xRight1 - 400, yRight1 + 350, xRight1, yRight1 + 350);
                    }
                };
                // Set the bounds for the linePanel
                linePanel.setBounds(0, 0, 1920, 1080);
                linePanel.setBackground(Color.BLACK);

                // Save Button
                JButton saveButton = new JButton("Save");
                saveButton.setBounds(840, 900, 150, 30);
                playerPage.add(saveButton);
                saveButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        try {
                            // Capture screenshot of the JFrame content
                            BufferedImage image = new BufferedImage(playerPage.getWidth(), playerPage.getHeight(), BufferedImage.TYPE_INT_RGB);
                            Graphics2D graphics2D = image.createGraphics();
                            playerPage.paint(graphics2D);

                            // Specify the file path to save the screenshot
                            File file = new File("C:\\Users\\HsKim\\Documents\\GitHub\\Georgia_Kendo_Club_Tournament_Bracket\\tournament_bracket.jpg");

                            // Write the screenshot to the file as JPG
                            ImageIO.write(image, "jpg", file);

                            JOptionPane.showMessageDialog(playerPage, "Screenshot saved successfully.");
                        } catch (IOException ex) {
                            JOptionPane.showMessageDialog(playerPage, "Error while saving screenshot: " + ex.getMessage());
                        }
                    }
                });

                //Head Title for Second page
                playerPage.setTitle("GKC Tournament Bracket");
                playerPage.setResizable(false);
                playerPage.add(participant);
                playerPage.add(winnerText);
                playerPage.add(semiFinalText);
                playerPage.add(finalText);
                playerPage.add(nameLeft);
                playerPage.add(nameRight);
                playerPage.setSize(1920, 1080);
                playerPage.setLayout(null);
                playerPage.setVisible(true);
                playerPage.add(linePanel);

                ImageIcon image = new ImageIcon("C:\\Users\\HsKim\\Documents\\GitHub\\Georgia_Kendo_Club_Tournament_Bracket\\src\\gkc_logo_black.png");
                playerPage.setIconImage(image.getImage());

                //playerPage.getContentPane().setBackground(Color.BLACK);
            } else if(playerNumber == 8) {
                RoundOf8();
            } else if(playerNumber == 16) {
                RoundOf16();
            } else {
                JOptionPane.showMessageDialog(this, "Only 4, 8 and 16 are allowed");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Invalid input");
        }
    }
    private void RoundOf16() {
        String input = textField.getText();
        if(!input.isEmpty() && input.matches("\\d+")) {
            int playerNumber = Integer.parseInt(input);
            if(playerNumber == 16) {
                JFrame playerPage = new JFrame();

                ImageIcon logoLeft = new ImageIcon("C:\\Users\\HsKim\\Documents\\GitHub\\Georgia_Kendo_Club_Tournament_Bracket\\src\\gkc_logo.png");
                Image logoPage = logoLeft.getImage();
                Image scaledImage = logoPage.getScaledInstance(120, 100, Image.SCALE_SMOOTH);
                logoLeft = new ImageIcon(scaledImage);

                //Title Text "Georgia Kendo Club"
                JLabel titleLeft = new JLabel();
                titleLeft.setText("Georgia Kendo Club");
                titleLeft.setIcon(logoLeft);
                titleLeft.setHorizontalTextPosition(JLabel.RIGHT);
                titleLeft.setVerticalTextPosition(JLabel.CENTER);
                titleLeft.setForeground(Color.WHITE);
                titleLeft.setFont(new Font("Aerial", Font.PLAIN, 50));
                titleLeft.setHorizontalAlignment(JLabel.LEFT);
                titleLeft.setBounds(40, -450, 1920, 1080);
                playerPage.add(titleLeft);

                //Total Participants
                JLabel participant = new JLabel("Max Participants: " + playerNumber);
                participant.setForeground(Color.WHITE);
                participant.setFont(new Font("Arial", Font.PLAIN, 15));
                participant.setBounds(50,200,200,20);

                //winner
                JLabel winnerText = new JLabel("WINNER");
                winnerText.setForeground(Color.WHITE);
                winnerText.setFont(new Font("Arial", Font.PLAIN, 20));
                winnerText.setBounds(913,450,200,18);

                //Name Left
                JLabel nameLeft = new JLabel("NAME");
                nameLeft.setForeground(Color.WHITE);
                nameLeft.setFont(new Font("Arial", Font.PLAIN, 20));
                nameLeft.setBounds(100,300,200,15);

                //Name Right
                JLabel nameRight = new JLabel("NAME");
                nameRight.setForeground(Color.WHITE);
                nameRight.setFont(new Font("Arial", Font.PLAIN, 20));
                nameRight.setBounds(1745,300,200,15);

                //Final
                JLabel finalText = new JLabel("FINAL MATCH");
                finalText.setForeground(Color.WHITE);
                finalText.setFont(new Font("Arial", Font.PLAIN, 20));
                finalText.setBounds(875,670,200,18);

                //semiFinal
                JLabel semiFinalText = new JLabel("ROUND OF 16");
                semiFinalText.setForeground(Color.WHITE);
                semiFinalText.setFont(new Font("Arial", Font.PLAIN, 60));
                semiFinalText.setBounds(745,200,600,50);

                //Internal use only
                JLabel internalUseOnly = new JLabel();
                internalUseOnly.setText("Internal Use Only");
                internalUseOnly.setForeground(Color.WHITE);
                internalUseOnly.setFont(new Font("Arial", Font.PLAIN, 15));
                internalUseOnly.setHorizontalAlignment(JLabel.CENTER);
                internalUseOnly.setBounds(850, 460, 1920, 1080);
                playerPage.add(internalUseOnly);

                /////////LEFT

                int xPositionLeft = 100; // X position for text fields
                int yPositionLeft = 350; // Y position for text fields

                int verticalValue = 0;
                for(int i = 0; i < 4; i++) {
                    // 2 pairs left top side
                    JTextField textPairField1 = new JTextField();
                    JTextField textPairField2 = new JTextField();

                    textPairField1.setBounds(xPositionLeft, yPositionLeft - 20 + verticalValue, 100, 30);
                    textPairField2.setBounds(xPositionLeft, yPositionLeft + 20 + verticalValue, 100, 30);

                    playerPage.add(textPairField1);
                    playerPage.add(textPairField2);

                    // quarter
                    JTextField textFieldLeft1 = new JTextField();
                    textFieldLeft1.setBounds(xPositionLeft + 200, yPositionLeft + verticalValue, 100, 30);
                    playerPage.add(textFieldLeft1);

                    verticalValue = verticalValue + 150;
                }

                int forSemi = 0;
                for(int i = 0; i < 2; i++) {
                    JTextField textFieldSemi = new JTextField();
                    textFieldSemi.setBounds(500, 425 + forSemi, 100, 30);
                    playerPage.add(textFieldSemi);

                    forSemi = forSemi + 300;
                }

                JTextField finalManLeft = new JTextField();
                finalManLeft.setBounds(675, 580, 100, 30);
                playerPage.add(finalManLeft);

                JTextField finalManRight = new JTextField();
                finalManRight.setBounds(1125, 580, 100, 30);
                playerPage.add(finalManRight);

                JTextField winner = new JTextField();
                winner.setBounds(900, 480, 100, 30);
                playerPage.add(winner);



                /////RIGHT
                int xPositionRight = 1700; // X position for text fields
                int yPositionRight = 350; // Y position for text fields

                int xLeft = xPositionRight - 40;
                int xRight = xPositionRight + 90;
                int yup = yPositionRight - 5;
                int ydown = yPositionRight + 35;
                int midLeft = xPositionRight - 250;
                int midVert = yPositionRight + 15;


                int space = 0;
                for(int i = 0; i < 4; i++) {
                    // 2 pairs right top side
                    JTextField textPairField5 = new JTextField();
                    JTextField textPairField6 = new JTextField();

                    textPairField5.setBounds(xPositionRight, yPositionRight - 20 + space, 100, 30);
                    textPairField6.setBounds(xPositionRight, yPositionRight + 20 + space, 100, 30);

                    playerPage.add(textPairField5);
                    playerPage.add(textPairField6);

                    // Generate pairs of text fields on the right side
                    JTextField textField3 = new JTextField();
                    textField3.setBounds(xPositionRight - 200, yPositionRight + space, 100, 30);
                    playerPage.add(textField3);

                    space = space + 150;
                }


                //Line
                JPanel linePanel = new JPanel() {
                    @Override
                    protected void paintComponent(Graphics g) {
                        super.paintComponent(g);
                        g.setColor(Color.WHITE);

                        /////LEFT

                        int XLeftP = 100;
                        int XRightP = 240;
                        int YupP = 345;
                        int YdownP = 385;

                        int vertValue = 0;
                        for(int i = 0; i < 4; i++) {
                            //2 pair line top left
                            g.drawLine(XRightP, YdownP - 20 + vertValue, 450, YdownP - 20 + vertValue); //left mid
                            g.drawLine(XLeftP, YupP + vertValue, XRightP, YupP + vertValue); //first
                            g.drawLine(XLeftP, YdownP + vertValue, XRightP, YdownP + vertValue); //second
                            g.drawLine(XRightP, YupP + vertValue, XRightP, YdownP + vertValue); //vertical

                            vertValue = vertValue + 150;
                        }

                        int for2Vert = 0;
                        for(int i = 0; i < 2; i++) {
                            g.drawLine(450, YdownP - 20 + for2Vert, 450, YdownP + 130 + for2Vert); //vertical
                            g.drawLine(450, YdownP + 55 + for2Vert, 625, YdownP + 55 + for2Vert); //horizontal

                            for2Vert = for2Vert + 300;
                        }
                        g.drawLine(625, 440, 625, 740); //vertical
                        g.drawLine(625, 595, 1275, 595); //horizontal


                        /////////RIGHT
                        int space = 0;
                        for(int i = 0; i < 4; i++) {
                            //2 pair line top right
                            g.drawLine(midLeft, midVert + space, xLeft, midVert + space);//right mid
                            g.drawLine(xLeft, yup + space, xRight, yup + space); //first
                            g.drawLine(xLeft, ydown + space, xRight, ydown + space); //second
                            g.drawLine(xLeft, yup + space, xLeft, ydown + space); //vertical

                            space = space + 150;
                        }
                        int for2VertRight = 0;
                        for(int i = 0; i < 2; i++) {
                            g.drawLine(midLeft, YdownP - 20 + for2VertRight, midLeft, YdownP + 130 + for2VertRight); //vertical
                            g.drawLine(midLeft, YdownP + 55 + for2VertRight, 1275, YdownP + 55 + for2VertRight); //horizontal

                            for2VertRight = for2VertRight + 300;
                        }
                        g.drawLine(1275, 440, 1275, 740); //vertical
                        g.drawLine(945, 480, 945, 595); //vertical final
                    }
                };
                // Set the bounds for the linePanel
                linePanel.setBounds(0, 0, 1920, 1080);
                linePanel.setBackground(Color.BLACK);

                // Save Button
                JButton saveButton = new JButton("Save");
                saveButton.setBounds(865, 900, 150, 30);
                playerPage.add(saveButton);
                saveButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        try {
                            // Capture screenshot of the JFrame content
                            BufferedImage image = new BufferedImage(playerPage.getWidth(), playerPage.getHeight(), BufferedImage.TYPE_INT_RGB);
                            Graphics2D graphics2D = image.createGraphics();
                            playerPage.paint(graphics2D);

                            // Specify the file path to save the screenshot
                            File file = new File("C:\\Users\\HsKim\\Documents\\GitHub\\Georgia_Kendo_Club_Tournament_Bracket\\tournament_bracket.jpg");

                            // Write the screenshot to the file as JPG
                            ImageIO.write(image, "jpg", file);

                            JOptionPane.showMessageDialog(playerPage, "Screenshot saved successfully.");
                        } catch (IOException ex) {
                            JOptionPane.showMessageDialog(playerPage, "Error while saving screenshot: " + ex.getMessage());
                        }
                    }
                });

                //Head Title for Second page
                playerPage.setTitle("GKC Tournament Bracket");
                playerPage.setResizable(false);
                playerPage.add(participant);
                playerPage.add(winnerText);
                playerPage.add(semiFinalText);
                playerPage.add(finalText);
                playerPage.add(nameLeft);
                playerPage.add(nameRight);
                playerPage.setSize(1920, 1080);
                playerPage.setLayout(null);
                playerPage.setVisible(true);
                playerPage.add(linePanel);

                ImageIcon image = new ImageIcon("C:\\Users\\HsKim\\Documents\\GitHub\\Georgia_Kendo_Club_Tournament_Bracket\\src\\gkc_logo_black.png");
                playerPage.setIconImage(image.getImage());

                //playerPage.getContentPane().setBackground(Color.BLACK);
            } else {
                JOptionPane.showMessageDialog(this, "Only 4, 8 and 16 are allowed");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Invalid input");
        }
    }
    private void RoundOf8() {
        String input = textField.getText();
        if(!input.isEmpty() && input.matches("\\d+")) {
            int playerNumber = Integer.parseInt(input);
            if(playerNumber == 8) {
                JFrame playerPage = new JFrame();

                ImageIcon logoLeft = new ImageIcon("C:\\Users\\HsKim\\Documents\\GitHub\\Georgia_Kendo_Club_Tournament_Bracket\\src\\gkc_logo.png");
                Image logoPage = logoLeft.getImage();
                Image scaledImage = logoPage.getScaledInstance(120, 100, Image.SCALE_SMOOTH);
                logoLeft = new ImageIcon(scaledImage);

                //Title Text "Georgia Kendo Club"
                JLabel titleLeft = new JLabel();
                titleLeft.setText("Georgia Kendo Club");
                titleLeft.setIcon(logoLeft);
                titleLeft.setHorizontalTextPosition(JLabel.RIGHT);
                titleLeft.setVerticalTextPosition(JLabel.CENTER);
                titleLeft.setForeground(Color.WHITE);
                titleLeft.setFont(new Font("Aerial", Font.PLAIN, 50));
                titleLeft.setHorizontalAlignment(JLabel.LEFT);
                titleLeft.setBounds(40, -450, 1920, 1080);
                playerPage.add(titleLeft);

                //Total Participants
                JLabel participant = new JLabel("Max Participants: " + playerNumber);
                participant.setForeground(Color.WHITE);
                participant.setFont(new Font("Arial", Font.PLAIN, 15));
                participant.setBounds(50,200,200,20);

                //winner
                JLabel winnerText = new JLabel("WINNER");
                winnerText.setForeground(Color.WHITE);
                winnerText.setFont(new Font("Arial", Font.PLAIN, 20));
                winnerText.setBounds(883,370,200,18);

                //Name Left
                JLabel nameLeft = new JLabel("NAME");
                nameLeft.setForeground(Color.WHITE);
                nameLeft.setFont(new Font("Arial", Font.PLAIN, 20));
                nameLeft.setBounds(250,245,200,15);

                //Name Right
                JLabel nameRight = new JLabel("NAME");
                nameRight.setForeground(Color.WHITE);
                nameRight.setFont(new Font("Arial", Font.PLAIN, 20));
                nameRight.setBounds(1544,245,200,15);

                //Final
                JLabel finalText = new JLabel("FINAL MATCH");
                finalText.setForeground(Color.WHITE);
                finalText.setFont(new Font("Arial", Font.PLAIN, 20));
                finalText.setBounds(855,700,200,18);

                //semiFinal
                JLabel semiFinalText = new JLabel("QUARTER - FINAL");
                semiFinalText.setForeground(Color.WHITE);
                semiFinalText.setFont(new Font("Arial", Font.PLAIN, 60));
                semiFinalText.setBounds(660,200,600,50);

                //Internal use only
                JLabel internalUseOnly = new JLabel();
                internalUseOnly.setText("Internal Use Only");
                internalUseOnly.setForeground(Color.WHITE);
                internalUseOnly.setFont(new Font("Arial", Font.PLAIN, 15));
                internalUseOnly.setHorizontalAlignment(JLabel.CENTER);
                internalUseOnly.setBounds(850, 460, 1920, 1080);
                playerPage.add(internalUseOnly);

                int xPositionLeft = 250; // X position for text fields
                int yPositionLeft = 300; // Y position for text fields
                int xPositionRight = 1500; // X position for text fields
                int yPositionRight = 300; // Y position for text fields
                int xPositionMid = 870; // X position for text fields
                int yPositionMid = 400; // Y position for text fields

                // 2 pairs
                int counting = 0;
                int for200 = 200;
                for(int i = 0; i < 2; i++) {
                    //left
                    JTextField textPairField1 = new JTextField();
                    JTextField textPairField2 = new JTextField();

                    textPairField1.setBounds(xPositionLeft, yPositionLeft + counting - 20, 100, 30);
                    textPairField2.setBounds(xPositionLeft, yPositionLeft + counting + 20, 100, 30);

                    playerPage.add(textPairField1);
                    playerPage.add(textPairField2);

                    //right
                    JTextField textPairField3 = new JTextField();
                    JTextField textPairField4 = new JTextField();

                    textPairField3.setBounds(xPositionRight, yPositionLeft + counting  - 20, 100, 30);
                    textPairField4.setBounds(xPositionRight, yPositionLeft + counting  + 20, 100, 30);

                    playerPage.add(textPairField3);
                    playerPage.add(textPairField4);

                    //////
                    JTextField textFieldLeft1 = new JTextField();
                    JTextField textFieldLeft2 = new JTextField();

                    textFieldLeft1.setBounds(xPositionLeft + for200, yPositionLeft, 100, 30);
                    textFieldLeft2.setBounds(xPositionLeft + for200, yPositionLeft + counting, 100, 30);

                    playerPage.add(textFieldLeft1);
                    playerPage.add(textFieldLeft2);

                    for200 = -400;

                    counting = counting + 500;
                }

                //Final Left
                JTextField textField5 = new JTextField();
                textField5.setBounds(xPositionLeft + 450, yPositionLeft + 350, 100, 30);
                playerPage.add(textField5);

                //Final Right
                JTextField textField6 = new JTextField();
                textField6.setBounds(xPositionRight - 450, yPositionRight + 350, 100, 30);
                playerPage.add(textField6);

                //Winner
                JTextField textField7 = new JTextField();
                textField7.setBounds(xPositionMid, yPositionMid, 100, 30);
                playerPage.add(textField7);

                //Line
                JPanel linePanel = new JPanel() {
                    @Override
                    protected void paintComponent(Graphics g) {
                        super.paintComponent(g);
                        g.setColor(Color.WHITE);
                        //
                        int xPoint1 = 390;
                        int xPoint2 = 600;
                        int yPoint1 = 315;

                        int xPointRight1 = 1250;
                        int xPointRight2 = 1460;

                        int ySpace = 0;
                        for(int i = 0; i < 2; i++) {
                            g.drawLine(xPoint1, yPoint1 + ySpace, xPoint2, yPoint1 + ySpace);

                            g.drawLine(xPointRight1, yPoint1 + ySpace, xPointRight2, yPoint1 + ySpace);

                            ySpace = ySpace + 500;
                        }
                        g.drawLine(xPoint2, yPoint1 + 500, xPoint2, yPoint1); //vertical
                        g.drawLine(600, 665, 750, 665);

                        g.drawLine(800, 665, 1100, 665);
                        g.drawLine(920, 400, 920, 665);


                        g.drawLine(xPointRight1, yPoint1 + 500, xPointRight1, yPoint1);
                        g.drawLine(1000, 665, 1250, 665);

                        int xPairLeft1 = 250;
                        int xPairLeft2 = 390;
                        int yPairLeft1 = 295;
                        int yPairLeft2 = 335;

                        int xPairRight1 = 1460;
                        int xPairRight2 = 1590;
                        int yPairRight1 = 295;
                        int yPairRight2 = 335;

                        int adding = 0;
                        for(int i = 0; i < 2; i++) {
                            g.drawLine(xPairLeft1, yPairLeft1 + adding, xPairLeft2, yPairLeft1 + adding);
                            g.drawLine(xPairLeft1, yPairLeft2 + adding, xPairLeft2, yPairLeft2 + adding);
                            g.drawLine(xPairLeft2, yPairLeft1 + adding, xPairLeft2, yPairLeft2 + adding);

                            g.drawLine(xPairRight1, yPairRight1 + adding, xPairRight2, yPairRight1 + adding);
                            g.drawLine(xPairRight1, yPairRight2 + adding, xPairRight2, yPairRight2 + adding);
                            g.drawLine(xPairRight1, yPairRight1 + adding, xPairRight1, yPairRight2 + adding);

                            adding = adding + 500;
                        }
                    }
                };
                // Set the bounds for the linePanel
                linePanel.setBounds(0, 0, 1920, 1080);
                linePanel.setBackground(Color.BLACK);

                // Save Button
                JButton saveButton = new JButton("Save");
                saveButton.setBounds(840, 900, 150, 30);
                playerPage.add(saveButton);
                saveButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        try {
                            // Capture screenshot of the JFrame content
                            BufferedImage image = new BufferedImage(playerPage.getWidth(), playerPage.getHeight(), BufferedImage.TYPE_INT_RGB);
                            Graphics2D graphics2D = image.createGraphics();
                            playerPage.paint(graphics2D);

                            // Specify the file path to save the screenshot
                            File file = new File("C:\\Users\\HsKim\\Documents\\GitHub\\Georgia_Kendo_Club_Tournament_Bracket\\tournament_bracket.jpg");

                            // Write the screenshot to the file as JPG
                            ImageIO.write(image, "jpg", file);

                            JOptionPane.showMessageDialog(playerPage, "Screenshot saved successfully.");
                        } catch (IOException ex) {
                            JOptionPane.showMessageDialog(playerPage, "Error while saving screenshot: " + ex.getMessage());
                        }
                    }
                });

                //Head Title for Second page
                playerPage.setTitle("GKC Tournament Bracket");
                playerPage.setResizable(false);
                playerPage.add(participant);
                playerPage.add(winnerText);
                playerPage.add(semiFinalText);
                playerPage.add(finalText);
                playerPage.add(nameLeft);
                playerPage.add(nameRight);
                playerPage.setSize(1920, 1080);
                playerPage.setLayout(null);
                playerPage.setVisible(true);
                playerPage.add(linePanel);

                ImageIcon image = new ImageIcon("C:\\Users\\HsKim\\Documents\\GitHub\\Georgia_Kendo_Club_Tournament_Bracket\\src\\gkc_logo_black.png");
                playerPage.setIconImage(image.getImage());

                //playerPage.getContentPane().setBackground(Color.BLACK);
            } else {
                JOptionPane.showMessageDialog(this, "Only 4, 8 and 16 are allowed");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Invalid input");
        }
    }
}