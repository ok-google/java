package gui;

import java.awt.event.*;
import javax.swing.*;
import manipulation.*;

import static manipulation.jumlahHuruf.*;

public class Component{
    private JFrame mainFrame = new JFrame();
    private JLabel kalimat = new JLabel("Kalimat");
    private JTextField kalimatField = new JTextField();
    private JTextArea resultArea = new JTextArea();
    private JButton jumlahHurufButton = new JButton("Jumlah Huruf");
    private JButton balikKalimatButton = new JButton("Balik Kalimat");
    private JButton hurufBesarButton = new JButton("Huruf Besar");
    private JButton sortingHurufButton = new JButton("Sorting Huruf");
    private JButton vokalButton = new JButton("Vocal");
    private JButton konsonanButton = new JButton("Konsonan");
    private JButton hurufKecilButton = new JButton("Huruf Kecil");
    private Word kata = new Word();
    private jumlahHuruf jumlah = new jumlahHuruf();
    private balikKalimat balik = new balikKalimat();
    private hurufBesar besar = new hurufBesar();
    private hurufKecil kecil = new hurufKecil();
    private Konsonan konsonan = new Konsonan();
    private sortingHuruf sorting = new sortingHuruf();
    private Vokal vokal = new Vokal();

    public void setComponent(){
        kalimat.setBounds(10, 10, 100, 30);
        kalimatField.setBounds(110, 10, 480, 30);
        resultArea.setBounds(10, 50, 580, 150);
        jumlahHurufButton.setBounds(10, 210, 200, 30);
        balikKalimatButton.setBounds(220, 210, 200, 30);
        hurufBesarButton.setBounds(430, 210, 150, 30);
        sortingHurufButton.setBounds(10, 250, 150, 30);
        vokalButton.setBounds(170, 250, 100, 30);
        konsonanButton.setBounds(280, 250, 150, 30);
        hurufKecilButton.setBounds(440, 250, 150, 30);

        mainFrame.setSize(650, 400);
        mainFrame.add(kalimat);
        mainFrame.add(kalimatField);
        mainFrame.add(resultArea);
        mainFrame.add(jumlahHurufButton);
        mainFrame.add(balikKalimatButton);
        mainFrame.add(hurufBesarButton);
        mainFrame.add(sortingHurufButton);
        mainFrame.add(vokalButton);
        mainFrame.add(konsonanButton);
        mainFrame.add(hurufKecilButton);

        jumlahHurufButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                kata.setKata(kalimatField.getText().toString());
                jumlah.Action(kata);

                resultArea.setText(Integer.toString(jumlah.getHasil()));
            }
        });

        balikKalimatButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                kata.setKata(kalimatField.getText().toString());
                balik.Action(kata);

                resultArea.setText(balik.getHasil().toString());
            }
        });

        hurufBesarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                kata.setKata(kalimatField.getText().toString());
                besar.Action(kata);

                resultArea.setText(besar.getHasil().toString());
            }
        });

        hurufKecilButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                kata.setKata(kalimatField.getText().toString());
                kecil.Action(kata);

                resultArea.setText(kecil.getHasil().toString());
            }
        });

        sortingHurufButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                kata.setKata(kalimatField.getText().toString());
                sorting.Action(kata);

                resultArea.setText(sorting.getHasil().toString());
            }
        });

        vokalButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                kata.setKata(kalimatField.getText().toString());
                vokal.Action(kata);

                resultArea.setText(vokal.getHasil().toString());
            }
        });

        konsonanButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                kata.setKata(kalimatField.getText().toString());
                konsonan.Action(kata);

                resultArea.setText(konsonan.getHasil().toString());
            }
        });

        mainFrame.setLayout(null);
        mainFrame.setLocationRelativeTo(null);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setVisible(true);
    }
}
