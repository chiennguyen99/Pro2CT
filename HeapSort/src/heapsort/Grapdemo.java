package heapsort;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Grapdemo extends javax.swing.JFrame {

    heapsort HEAP = new heapsort(7);
    int num = 0, numPage = 1;

    Timer TimeNextPage0To3 = new Timer(5000, new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {

            EffectMovedOnPage(numPage);
            
            if (numPage == 3) {
                TimePage4.start();
                TimeNextPage0To3.stop();
            } else {
                numPage++;
            }

        }

    });
    int count1 = 0;
    Timer TimePage4 = new Timer(10000, new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (count1 == 0) {
                EffectMovedOnPage(4);
                count1++;
            } else if (count1 == 1) {
                EffectMoveOnEachPageShift(4);
                count1++;
            } else if (count1 == 2) {
                EffectMoveOnEachPageDelete(4);
                count1++;
            } else {
                TimePage5.start();
                TimePage4.stop();
            }
        }
    });
    int count2 = 0;
    Timer TimePage5 = new Timer(5000, new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (count2 == 0) {
                EffectMovedOnPage(5);
                count2++;
            } else if (count2 == 1) {
                EffectMoveOnEachPageShift(5);
                count2++;
            } else if (count2 == 2) {
                EffectMoveOnEachPageDelete(5);
                count2++;
            } else {
                TimePage6.start();
                TimePage5.stop();
            }
        }
    });

    int count3 = 0;
    Timer TimePage6 = new Timer(5000, new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (count3 == 0) {
                EffectMovedOnPage(6);
                count3++;
            } else if (count3 == 1) {
                EffectMoveOnEachPageShift(6);
                count3++;
            } else if (count3 == 2) {
                EffectMoveOnEachPageDelete(6);
                count3++;
            } else {
                TimePage7.start();
                TimePage6.stop();
            }
        }
    });

    int count4 = 0;
    Timer TimePage7 = new Timer(5000, new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (count4 == 0) {
                EffectMovedOnPage(7);
                count4++;
            } else if (count4 == 1) {
                EffectMoveOnEachPageShift(7);
                count4++;
            } else if (count4 == 2) {
                EffectMoveOnEachPageDelete(7);
                count4++;
            } else {
                TimePage8.start();
                TimePage7.stop();
            }
        }
    });

    int count5 = 0;
    Timer TimePage8 = new Timer(5000, new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (count5 == 0) {
                EffectMovedOnPage(8);
                count5++;
            } else if (count5 == 1) {
                EffectMoveOnEachPageShift(8);
                count5++;
            } else if (count5 == 2) {
                EffectMoveOnEachPageDelete(8);
                count5++;
            } else {
                TimePage9.start();
                TimePage8.stop();
            }
        }
    });

    int count6 = 0;
    Timer TimePage9 = new Timer(5000, new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (count6 == 0) {
                EffectMovedOnPage(9);
                count6++;
            } else if (count6 == 1) {
                EffectMoveOnEachPageShift(9);
                count6++;
            } else if (count6 == 2) {
                EffectMoveOnEachPageDelete(9);
                count6++;
            } else if (count6 == 3) {
                OUTPUTA0.setText(String.valueOf(HEAP.Arr[14].GetIndex(0)));
                setColor(D1_9, 0, 0, 0);
                D1_9.setText("");
                indexA0.setText("");
                setColor(OUTPUTA0, 0, 0, 102);
                count6++;
            } else {
                TimePage9.stop();
            }
        }
    });

    Timer t0 = new Timer(2000, new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {

            setColorPAN(0, num);
            if (num == 7) {
                setPan6.stop();
                setColor(pt6, 0, 0, 102);
                TimeNextPage0To3.start();
                // cho them hieu ung.
                TimeEqual = new Timer(20, new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        setColor(pt2, numcl1, numcl2, numcl3);
                        setColor(pt5, numcl1, numcl2, numcl3);
                        setColor(pt6, numcl1, numcl2, numcl3);
                        if (numcl1 > 1)numcl1 -= 1;
                        else numcl1 = 255;
                        if (numcl2 > 2)numcl2 -= 2;
                        else numcl2 = 255;
                        if (numcl3 > 3)numcl3 -= 3;
                        else numcl3 = 255;
                    }
                });
                TimeEqual.start();
                titleP1.setText("Chuẩn hóa node A2(A2 >= A5 && A2 >= A6)");
                t0.stop();
                
            } else {
                num++;
            }
        }
    });

    public Grapdemo() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jPanel11 = new javax.swing.JPanel();
        jPanel29 = new javax.swing.JPanel();
        jLabel144 = new javax.swing.JLabel();
        jLabel145 = new javax.swing.JLabel();
        jPanel30 = new javax.swing.JPanel();
        PANPAGE0 = new javax.swing.JPanel();
        pt0 = new javax.swing.JLabel();
        pt1 = new javax.swing.JLabel();
        pt2 = new javax.swing.JLabel();
        pt3 = new javax.swing.JLabel();
        pt4 = new javax.swing.JLabel();
        pt5 = new javax.swing.JLabel();
        pt6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        filler37 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 10), new java.awt.Dimension(0, 10), new java.awt.Dimension(32767, 10));
        filler38 = new javax.swing.Box.Filler(new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 32767));
        filler39 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 10), new java.awt.Dimension(0, 10), new java.awt.Dimension(32767, 10));
        filler40 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 10), new java.awt.Dimension(0, 10), new java.awt.Dimension(32767, 10));
        filler41 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 10), new java.awt.Dimension(0, 10), new java.awt.Dimension(32767, 10));
        filler42 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 10), new java.awt.Dimension(0, 10), new java.awt.Dimension(32767, 10));
        filler43 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 10), new java.awt.Dimension(0, 10), new java.awt.Dimension(32767, 10));
        filler44 = new javax.swing.Box.Filler(new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 32767));
        filler45 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 10), new java.awt.Dimension(0, 10), new java.awt.Dimension(32767, 10));
        filler46 = new javax.swing.Box.Filler(new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 32767));
        filler47 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 10), new java.awt.Dimension(0, 10), new java.awt.Dimension(32767, 10));
        filler48 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 10), new java.awt.Dimension(0, 10), new java.awt.Dimension(32767, 10));
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        titleP1 = new javax.swing.JLabel();
        PANPAGE1 = new javax.swing.JPanel();
        La1P1 = new javax.swing.JLabel();
        La2P1 = new javax.swing.JLabel();
        La3P1 = new javax.swing.JLabel();
        La4P1 = new javax.swing.JLabel();
        La5P1 = new javax.swing.JLabel();
        La6P1 = new javax.swing.JLabel();
        La7P1 = new javax.swing.JLabel();
        JL1 = new javax.swing.JLabel();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 20), new java.awt.Dimension(0, 20), new java.awt.Dimension(32767, 20));
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 32767));
        filler3 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 10), new java.awt.Dimension(0, 10), new java.awt.Dimension(32767, 10));
        filler4 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 10), new java.awt.Dimension(0, 10), new java.awt.Dimension(32767, 10));
        filler5 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 10), new java.awt.Dimension(0, 10), new java.awt.Dimension(32767, 10));
        filler6 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 10), new java.awt.Dimension(0, 10), new java.awt.Dimension(32767, 10));
        filler7 = new javax.swing.Box.Filler(new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 32767));
        filler8 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 10), new java.awt.Dimension(0, 10), new java.awt.Dimension(32767, 10));
        filler9 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 10), new java.awt.Dimension(0, 10), new java.awt.Dimension(32767, 10));
        filler10 = new javax.swing.Box.Filler(new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 32767));
        filler11 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 10), new java.awt.Dimension(0, 10), new java.awt.Dimension(32767, 10));
        filler12 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 10), new java.awt.Dimension(0, 10), new java.awt.Dimension(32767, 10));
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel125 = new javax.swing.JLabel();
        PANPAGE2 = new javax.swing.JPanel();
        La1P2 = new javax.swing.JLabel();
        La2P2 = new javax.swing.JLabel();
        La3P2 = new javax.swing.JLabel();
        La4P2 = new javax.swing.JLabel();
        La5P2 = new javax.swing.JLabel();
        La6P2 = new javax.swing.JLabel();
        La7P2 = new javax.swing.JLabel();
        JL2 = new javax.swing.JLabel();
        filler13 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 10), new java.awt.Dimension(0, 10), new java.awt.Dimension(32767, 10));
        filler14 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 10), new java.awt.Dimension(0, 10), new java.awt.Dimension(32767, 10));
        filler15 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 10), new java.awt.Dimension(0, 10), new java.awt.Dimension(32767, 10));
        filler16 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 10), new java.awt.Dimension(0, 10), new java.awt.Dimension(32767, 10));
        filler17 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 10), new java.awt.Dimension(0, 10), new java.awt.Dimension(32767, 10));
        filler18 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 10), new java.awt.Dimension(0, 10), new java.awt.Dimension(32767, 10));
        filler19 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 10), new java.awt.Dimension(0, 10), new java.awt.Dimension(32767, 10));
        filler20 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 10), new java.awt.Dimension(0, 10), new java.awt.Dimension(32767, 10));
        filler22 = new javax.swing.Box.Filler(new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 32767));
        filler23 = new javax.swing.Box.Filler(new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 32767));
        filler24 = new javax.swing.Box.Filler(new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 32767));
        filler25 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 10), new java.awt.Dimension(0, 10), new java.awt.Dimension(32767, 10));
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel126 = new javax.swing.JLabel();
        PANPAGE3 = new javax.swing.JPanel();
        La1P3 = new javax.swing.JLabel();
        La2P3 = new javax.swing.JLabel();
        La3P3 = new javax.swing.JLabel();
        La4P3 = new javax.swing.JLabel();
        La5P3 = new javax.swing.JLabel();
        La6P3 = new javax.swing.JLabel();
        La7P3 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        filler21 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 10), new java.awt.Dimension(0, 10), new java.awt.Dimension(32767, 10));
        filler26 = new javax.swing.Box.Filler(new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 32767));
        filler27 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 10), new java.awt.Dimension(0, 10), new java.awt.Dimension(32767, 10));
        filler28 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 10), new java.awt.Dimension(0, 10), new java.awt.Dimension(32767, 10));
        filler29 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 10), new java.awt.Dimension(0, 10), new java.awt.Dimension(32767, 10));
        filler30 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 10), new java.awt.Dimension(0, 10), new java.awt.Dimension(32767, 10));
        filler31 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 10), new java.awt.Dimension(0, 10), new java.awt.Dimension(32767, 10));
        filler32 = new javax.swing.Box.Filler(new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 32767));
        filler33 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 10), new java.awt.Dimension(0, 10), new java.awt.Dimension(32767, 10));
        filler34 = new javax.swing.Box.Filler(new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 32767));
        filler35 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 10), new java.awt.Dimension(0, 10), new java.awt.Dimension(32767, 10));
        filler36 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 10), new java.awt.Dimension(0, 10), new java.awt.Dimension(32767, 10));
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel124 = new javax.swing.JLabel();
        PANPAGE4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        PAN4SW = new javax.swing.JPanel();
        SW1_4 = new javax.swing.JLabel();
        SW2_4 = new javax.swing.JLabel();
        SW3_4 = new javax.swing.JLabel();
        SW4_4 = new javax.swing.JLabel();
        SW5_4 = new javax.swing.JLabel();
        SW6_4 = new javax.swing.JLabel();
        SW7_4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        filler49 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 10), new java.awt.Dimension(0, 10), new java.awt.Dimension(32767, 10));
        filler50 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 10), new java.awt.Dimension(0, 10), new java.awt.Dimension(32767, 10));
        filler51 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 10), new java.awt.Dimension(0, 10), new java.awt.Dimension(32767, 10));
        filler52 = new javax.swing.Box.Filler(new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 32767));
        filler53 = new javax.swing.Box.Filler(new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 32767));
        filler54 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 10), new java.awt.Dimension(0, 10), new java.awt.Dimension(32767, 10));
        filler55 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 10), new java.awt.Dimension(0, 10), new java.awt.Dimension(32767, 10));
        filler56 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 10), new java.awt.Dimension(0, 10), new java.awt.Dimension(32767, 10));
        filler57 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 10), new java.awt.Dimension(0, 10), new java.awt.Dimension(32767, 10));
        filler58 = new javax.swing.Box.Filler(new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 32767));
        filler59 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 10), new java.awt.Dimension(0, 10), new java.awt.Dimension(32767, 10));
        filler60 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 10), new java.awt.Dimension(0, 10), new java.awt.Dimension(32767, 10));
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel127 = new javax.swing.JLabel();
        PAN4ShiftDown = new javax.swing.JPanel();
        SD1_4 = new javax.swing.JLabel();
        SD2_4 = new javax.swing.JLabel();
        SD3_4 = new javax.swing.JLabel();
        SD4_4 = new javax.swing.JLabel();
        SD5_4 = new javax.swing.JLabel();
        SD6_4 = new javax.swing.JLabel();
        SD7_4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        filler61 = new javax.swing.Box.Filler(new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 32767));
        filler62 = new javax.swing.Box.Filler(new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 32767));
        filler63 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 10), new java.awt.Dimension(0, 10), new java.awt.Dimension(32767, 10));
        filler64 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 10), new java.awt.Dimension(0, 10), new java.awt.Dimension(32767, 10));
        filler65 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 10), new java.awt.Dimension(0, 10), new java.awt.Dimension(32767, 10));
        filler66 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 10), new java.awt.Dimension(0, 10), new java.awt.Dimension(32767, 10));
        filler67 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 10), new java.awt.Dimension(0, 10), new java.awt.Dimension(32767, 10));
        filler68 = new javax.swing.Box.Filler(new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 32767));
        filler69 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 10), new java.awt.Dimension(0, 10), new java.awt.Dimension(32767, 10));
        filler70 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 10), new java.awt.Dimension(0, 10), new java.awt.Dimension(32767, 10));
        filler71 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 10), new java.awt.Dimension(0, 10), new java.awt.Dimension(32767, 10));
        filler72 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 10), new java.awt.Dimension(0, 10), new java.awt.Dimension(32767, 10));
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabel133 = new javax.swing.JLabel();
        PAN4Delete = new javax.swing.JPanel();
        D1_4 = new javax.swing.JLabel();
        D2_4 = new javax.swing.JLabel();
        D3_4 = new javax.swing.JLabel();
        D4_4 = new javax.swing.JLabel();
        D5_4 = new javax.swing.JLabel();
        D6_4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        filler73 = new javax.swing.Box.Filler(new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 32767));
        filler74 = new javax.swing.Box.Filler(new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 32767));
        filler75 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 10), new java.awt.Dimension(0, 10), new java.awt.Dimension(32767, 10));
        filler76 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 10), new java.awt.Dimension(0, 10), new java.awt.Dimension(32767, 10));
        filler77 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 10), new java.awt.Dimension(0, 10), new java.awt.Dimension(32767, 10));
        filler78 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 10), new java.awt.Dimension(0, 10), new java.awt.Dimension(32767, 10));
        filler79 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 10), new java.awt.Dimension(0, 10), new java.awt.Dimension(32767, 10));
        filler80 = new javax.swing.Box.Filler(new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 32767));
        filler81 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 10), new java.awt.Dimension(0, 10), new java.awt.Dimension(32767, 10));
        filler82 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 10), new java.awt.Dimension(0, 10), new java.awt.Dimension(32767, 10));
        filler84 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 10), new java.awt.Dimension(0, 10), new java.awt.Dimension(32767, 10));
        jLabel64 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jLabel139 = new javax.swing.JLabel();
        PANPAGE5 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        PAN5SW = new javax.swing.JPanel();
        SW1_5 = new javax.swing.JLabel();
        SW2_5 = new javax.swing.JLabel();
        SW3_5 = new javax.swing.JLabel();
        SW4_5 = new javax.swing.JLabel();
        SW5_5 = new javax.swing.JLabel();
        SW6_5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        filler85 = new javax.swing.Box.Filler(new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 32767));
        filler86 = new javax.swing.Box.Filler(new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 32767));
        filler87 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 10), new java.awt.Dimension(0, 10), new java.awt.Dimension(32767, 10));
        filler88 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 10), new java.awt.Dimension(0, 10), new java.awt.Dimension(32767, 10));
        filler89 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 10), new java.awt.Dimension(0, 10), new java.awt.Dimension(32767, 10));
        filler90 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 10), new java.awt.Dimension(0, 10), new java.awt.Dimension(32767, 10));
        filler91 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 10), new java.awt.Dimension(0, 10), new java.awt.Dimension(32767, 10));
        filler92 = new javax.swing.Box.Filler(new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 32767));
        filler93 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 10), new java.awt.Dimension(0, 10), new java.awt.Dimension(32767, 10));
        filler94 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 10), new java.awt.Dimension(0, 10), new java.awt.Dimension(32767, 10));
        filler96 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 10), new java.awt.Dimension(0, 10), new java.awt.Dimension(32767, 10));
        jLabel65 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        jLabel128 = new javax.swing.JLabel();
        PAN5ShiftDown = new javax.swing.JPanel();
        SD1_5 = new javax.swing.JLabel();
        SD2_5 = new javax.swing.JLabel();
        SD3_5 = new javax.swing.JLabel();
        SD4_5 = new javax.swing.JLabel();
        SD5_5 = new javax.swing.JLabel();
        SD6_5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        filler97 = new javax.swing.Box.Filler(new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 32767));
        filler98 = new javax.swing.Box.Filler(new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 32767));
        filler99 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 10), new java.awt.Dimension(0, 10), new java.awt.Dimension(32767, 10));
        filler100 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 10), new java.awt.Dimension(0, 10), new java.awt.Dimension(32767, 10));
        filler101 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 10), new java.awt.Dimension(0, 10), new java.awt.Dimension(32767, 10));
        filler102 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 10), new java.awt.Dimension(0, 10), new java.awt.Dimension(32767, 10));
        filler103 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 10), new java.awt.Dimension(0, 10), new java.awt.Dimension(32767, 10));
        filler104 = new javax.swing.Box.Filler(new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 32767));
        filler105 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 10), new java.awt.Dimension(0, 10), new java.awt.Dimension(32767, 10));
        filler106 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 10), new java.awt.Dimension(0, 10), new java.awt.Dimension(32767, 10));
        filler108 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 10), new java.awt.Dimension(0, 10), new java.awt.Dimension(32767, 10));
        jLabel71 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        jLabel82 = new javax.swing.JLabel();
        jLabel134 = new javax.swing.JLabel();
        PAN5Delete = new javax.swing.JPanel();
        D1_5 = new javax.swing.JLabel();
        D2_5 = new javax.swing.JLabel();
        D3_5 = new javax.swing.JLabel();
        D4_5 = new javax.swing.JLabel();
        D5_5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        filler109 = new javax.swing.Box.Filler(new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 32767));
        filler110 = new javax.swing.Box.Filler(new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 32767));
        filler111 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 10), new java.awt.Dimension(0, 10), new java.awt.Dimension(32767, 10));
        filler112 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 10), new java.awt.Dimension(0, 10), new java.awt.Dimension(32767, 10));
        filler113 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 10), new java.awt.Dimension(0, 10), new java.awt.Dimension(32767, 10));
        filler114 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 10), new java.awt.Dimension(0, 10), new java.awt.Dimension(32767, 10));
        filler115 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 10), new java.awt.Dimension(0, 10), new java.awt.Dimension(32767, 10));
        filler117 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 10), new java.awt.Dimension(0, 10), new java.awt.Dimension(32767, 10));
        jLabel77 = new javax.swing.JLabel();
        jLabel84 = new javax.swing.JLabel();
        jLabel85 = new javax.swing.JLabel();
        jLabel86 = new javax.swing.JLabel();
        jLabel87 = new javax.swing.JLabel();
        jLabel140 = new javax.swing.JLabel();
        PANPAGE6 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        PAN6SW = new javax.swing.JPanel();
        SW1_6 = new javax.swing.JLabel();
        SW2_6 = new javax.swing.JLabel();
        SW3_6 = new javax.swing.JLabel();
        SW4_6 = new javax.swing.JLabel();
        SW5_6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        filler121 = new javax.swing.Box.Filler(new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 32767));
        filler122 = new javax.swing.Box.Filler(new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 32767));
        filler123 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 10), new java.awt.Dimension(0, 10), new java.awt.Dimension(32767, 10));
        filler124 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 10), new java.awt.Dimension(0, 10), new java.awt.Dimension(32767, 10));
        filler125 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 10), new java.awt.Dimension(0, 10), new java.awt.Dimension(32767, 10));
        filler126 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 10), new java.awt.Dimension(0, 10), new java.awt.Dimension(32767, 10));
        filler127 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 10), new java.awt.Dimension(0, 10), new java.awt.Dimension(32767, 10));
        filler129 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 10), new java.awt.Dimension(0, 10), new java.awt.Dimension(32767, 10));
        jLabel83 = new javax.swing.JLabel();
        jLabel89 = new javax.swing.JLabel();
        jLabel90 = new javax.swing.JLabel();
        jLabel91 = new javax.swing.JLabel();
        jLabel92 = new javax.swing.JLabel();
        jLabel129 = new javax.swing.JLabel();
        PAN6ShiftDown = new javax.swing.JPanel();
        SD1_6 = new javax.swing.JLabel();
        SD2_6 = new javax.swing.JLabel();
        SD3_6 = new javax.swing.JLabel();
        SD4_6 = new javax.swing.JLabel();
        SD5_6 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        filler133 = new javax.swing.Box.Filler(new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 32767));
        filler134 = new javax.swing.Box.Filler(new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 32767));
        filler135 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 10), new java.awt.Dimension(0, 10), new java.awt.Dimension(32767, 10));
        filler136 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 10), new java.awt.Dimension(0, 10), new java.awt.Dimension(32767, 10));
        filler137 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 10), new java.awt.Dimension(0, 10), new java.awt.Dimension(32767, 10));
        filler138 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 10), new java.awt.Dimension(0, 10), new java.awt.Dimension(32767, 10));
        filler139 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 10), new java.awt.Dimension(0, 10), new java.awt.Dimension(32767, 10));
        filler141 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 10), new java.awt.Dimension(0, 10), new java.awt.Dimension(32767, 10));
        jLabel88 = new javax.swing.JLabel();
        jLabel94 = new javax.swing.JLabel();
        jLabel95 = new javax.swing.JLabel();
        jLabel96 = new javax.swing.JLabel();
        jLabel97 = new javax.swing.JLabel();
        jLabel135 = new javax.swing.JLabel();
        PAN6Delete = new javax.swing.JPanel();
        D1_6 = new javax.swing.JLabel();
        D2_6 = new javax.swing.JLabel();
        D3_6 = new javax.swing.JLabel();
        D4_6 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        filler145 = new javax.swing.Box.Filler(new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 32767));
        filler146 = new javax.swing.Box.Filler(new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 32767));
        filler147 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 10), new java.awt.Dimension(0, 10), new java.awt.Dimension(32767, 10));
        filler148 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 10), new java.awt.Dimension(0, 10), new java.awt.Dimension(32767, 10));
        filler150 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 10), new java.awt.Dimension(0, 10), new java.awt.Dimension(32767, 10));
        filler151 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 10), new java.awt.Dimension(0, 10), new java.awt.Dimension(32767, 10));
        filler153 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 10), new java.awt.Dimension(0, 10), new java.awt.Dimension(32767, 10));
        jLabel93 = new javax.swing.JLabel();
        jLabel99 = new javax.swing.JLabel();
        jLabel100 = new javax.swing.JLabel();
        jLabel101 = new javax.swing.JLabel();
        jLabel141 = new javax.swing.JLabel();
        PANPAGE7 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        PAN7SW = new javax.swing.JPanel();
        SW1_7 = new javax.swing.JLabel();
        SW2_7 = new javax.swing.JLabel();
        SW3_7 = new javax.swing.JLabel();
        SW4_7 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        filler157 = new javax.swing.Box.Filler(new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 32767));
        filler158 = new javax.swing.Box.Filler(new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 32767));
        filler159 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 10), new java.awt.Dimension(0, 10), new java.awt.Dimension(32767, 10));
        filler160 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 10), new java.awt.Dimension(0, 10), new java.awt.Dimension(32767, 10));
        filler162 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 10), new java.awt.Dimension(0, 10), new java.awt.Dimension(32767, 10));
        filler163 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 10), new java.awt.Dimension(0, 10), new java.awt.Dimension(32767, 10));
        filler165 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 10), new java.awt.Dimension(0, 10), new java.awt.Dimension(32767, 10));
        jLabel98 = new javax.swing.JLabel();
        jLabel103 = new javax.swing.JLabel();
        jLabel104 = new javax.swing.JLabel();
        jLabel105 = new javax.swing.JLabel();
        jLabel130 = new javax.swing.JLabel();
        PAN7ShiftDown = new javax.swing.JPanel();
        SD1_7 = new javax.swing.JLabel();
        SD2_7 = new javax.swing.JLabel();
        SD3_7 = new javax.swing.JLabel();
        SD4_7 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        filler169 = new javax.swing.Box.Filler(new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 32767));
        filler170 = new javax.swing.Box.Filler(new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 32767));
        filler171 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 10), new java.awt.Dimension(0, 10), new java.awt.Dimension(32767, 10));
        filler172 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 10), new java.awt.Dimension(0, 10), new java.awt.Dimension(32767, 10));
        filler174 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 10), new java.awt.Dimension(0, 10), new java.awt.Dimension(32767, 10));
        filler175 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 10), new java.awt.Dimension(0, 10), new java.awt.Dimension(32767, 10));
        filler177 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 10), new java.awt.Dimension(0, 10), new java.awt.Dimension(32767, 10));
        jLabel102 = new javax.swing.JLabel();
        jLabel107 = new javax.swing.JLabel();
        jLabel108 = new javax.swing.JLabel();
        jLabel109 = new javax.swing.JLabel();
        jLabel136 = new javax.swing.JLabel();
        PAN7Delete = new javax.swing.JPanel();
        D1_7 = new javax.swing.JLabel();
        D2_7 = new javax.swing.JLabel();
        D3_7 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        filler181 = new javax.swing.Box.Filler(new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 32767));
        filler183 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 10), new java.awt.Dimension(0, 10), new java.awt.Dimension(32767, 10));
        filler184 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 10), new java.awt.Dimension(0, 10), new java.awt.Dimension(32767, 10));
        filler187 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 10), new java.awt.Dimension(0, 10), new java.awt.Dimension(32767, 10));
        jLabel106 = new javax.swing.JLabel();
        jLabel111 = new javax.swing.JLabel();
        jLabel112 = new javax.swing.JLabel();
        jLabel142 = new javax.swing.JLabel();
        PANPAGE8 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        PAN8SW = new javax.swing.JPanel();
        SW1_8 = new javax.swing.JLabel();
        SW2_8 = new javax.swing.JLabel();
        SW3_8 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        filler193 = new javax.swing.Box.Filler(new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 32767));
        filler195 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 10), new java.awt.Dimension(0, 10), new java.awt.Dimension(32767, 10));
        filler196 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 10), new java.awt.Dimension(0, 10), new java.awt.Dimension(32767, 10));
        filler199 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 10), new java.awt.Dimension(0, 10), new java.awt.Dimension(32767, 10));
        jLabel110 = new javax.swing.JLabel();
        jLabel114 = new javax.swing.JLabel();
        jLabel115 = new javax.swing.JLabel();
        jLabel131 = new javax.swing.JLabel();
        PAN8ShiftDown = new javax.swing.JPanel();
        SD1_8 = new javax.swing.JLabel();
        SD2_8 = new javax.swing.JLabel();
        SD3_8 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        filler205 = new javax.swing.Box.Filler(new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 32767));
        filler207 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 10), new java.awt.Dimension(0, 10), new java.awt.Dimension(32767, 10));
        filler208 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 10), new java.awt.Dimension(0, 10), new java.awt.Dimension(32767, 10));
        filler211 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 10), new java.awt.Dimension(0, 10), new java.awt.Dimension(32767, 10));
        jLabel113 = new javax.swing.JLabel();
        jLabel116 = new javax.swing.JLabel();
        jLabel117 = new javax.swing.JLabel();
        jLabel137 = new javax.swing.JLabel();
        PAN8Delete = new javax.swing.JPanel();
        D1_8 = new javax.swing.JLabel();
        D2_8 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        filler217 = new javax.swing.Box.Filler(new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 32767));
        filler219 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 10), new java.awt.Dimension(0, 10), new java.awt.Dimension(32767, 10));
        filler223 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 10), new java.awt.Dimension(0, 10), new java.awt.Dimension(32767, 10));
        jLabel118 = new javax.swing.JLabel();
        jLabel119 = new javax.swing.JLabel();
        jLabel143 = new javax.swing.JLabel();
        PANPAGE9 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        PAN9SW = new javax.swing.JPanel();
        SW1_9 = new javax.swing.JLabel();
        SW2_9 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        filler229 = new javax.swing.Box.Filler(new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 32767));
        filler231 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 10), new java.awt.Dimension(0, 10), new java.awt.Dimension(32767, 10));
        filler235 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 10), new java.awt.Dimension(0, 10), new java.awt.Dimension(32767, 10));
        jLabel120 = new javax.swing.JLabel();
        jLabel121 = new javax.swing.JLabel();
        jLabel132 = new javax.swing.JLabel();
        PAN9ShiftDown = new javax.swing.JPanel();
        SD1_9 = new javax.swing.JLabel();
        SD2_9 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        filler241 = new javax.swing.Box.Filler(new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 32767));
        filler243 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 10), new java.awt.Dimension(0, 10), new java.awt.Dimension(32767, 10));
        filler247 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 10), new java.awt.Dimension(0, 10), new java.awt.Dimension(32767, 10));
        jLabel122 = new javax.swing.JLabel();
        jLabel123 = new javax.swing.JLabel();
        jLabel138 = new javax.swing.JLabel();
        PAN9Delete = new javax.swing.JPanel();
        D1_9 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        indexA0 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        ptA6 = new javax.swing.JTextField();
        ptA0 = new javax.swing.JTextField();
        ptA1 = new javax.swing.JTextField();
        ptA2 = new javax.swing.JTextField();
        ptA3 = new javax.swing.JTextField();
        ptA4 = new javax.swing.JTextField();
        ptA5 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        OUTPUTA6 = new javax.swing.JLabel();
        OUTPUTA5 = new javax.swing.JLabel();
        OUTPUTA4 = new javax.swing.JLabel();
        OUTPUTA3 = new javax.swing.JLabel();
        OUTPUTA2 = new javax.swing.JLabel();
        OUTPUTA1 = new javax.swing.JLabel();
        OUTPUTA0 = new javax.swing.JLabel();

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel29.setBackground(new java.awt.Color(0, 0, 0));

        jLabel144.setBackground(new java.awt.Color(0, 0, 0));
        jLabel144.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel144.setForeground(new java.awt.Color(255, 255, 255));
        jLabel144.setText(" Heap Sort");

        jLabel145.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel145.setForeground(new java.awt.Color(255, 255, 255));
        jLabel145.setText(" Mô Phỏng");
        jLabel145.setToolTipText("");

        javax.swing.GroupLayout jPanel29Layout = new javax.swing.GroupLayout(jPanel29);
        jPanel29.setLayout(jPanel29Layout);
        jPanel29Layout.setHorizontalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel144, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel145, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
        );
        jPanel29Layout.setVerticalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel29Layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(jLabel145, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addComponent(jLabel144, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(187, 187, 187))
        );

        jPanel11.add(jPanel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 460));

        jPanel30.setLayout(new java.awt.CardLayout());

        PANPAGE0.setBackground(new java.awt.Color(0, 0, 0));
        PANPAGE0.setForeground(new java.awt.Color(255, 255, 255));
        PANPAGE0.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pt0.setBackground(new java.awt.Color(238, 238, 238));
        pt0.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        pt0.setForeground(new java.awt.Color(242, 241, 241));
        pt0.setText("La1P0");
        pt0.setOpaque(true);
        PANPAGE0.add(pt0, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 68, 40, 40));

        pt1.setBackground(new java.awt.Color(238, 238, 238));
        pt1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        pt1.setForeground(new java.awt.Color(242, 241, 241));
        pt1.setText("La2P0");
        pt1.setOpaque(true);
        PANPAGE0.add(pt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 156, 40, 40));

        pt2.setBackground(new java.awt.Color(238, 238, 238));
        pt2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        pt2.setForeground(new java.awt.Color(242, 241, 241));
        pt2.setText("La3P0");
        pt2.setOpaque(true);
        PANPAGE0.add(pt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(525, 156, 40, 40));

        pt3.setBackground(new java.awt.Color(238, 238, 238));
        pt3.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        pt3.setForeground(new java.awt.Color(242, 241, 241));
        pt3.setText("La4P0");
        pt3.setOpaque(true);
        PANPAGE0.add(pt3, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 244, 40, 40));

        pt4.setBackground(new java.awt.Color(238, 238, 238));
        pt4.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        pt4.setForeground(new java.awt.Color(242, 241, 241));
        pt4.setText("La5P0");
        pt4.setOpaque(true);
        PANPAGE0.add(pt4, new org.netbeans.lib.awtextra.AbsoluteConstraints(262, 244, 40, 40));

        pt5.setBackground(new java.awt.Color(238, 238, 238));
        pt5.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        pt5.setForeground(new java.awt.Color(242, 241, 241));
        pt5.setText("La6P0");
        pt5.setOpaque(true);
        PANPAGE0.add(pt5, new org.netbeans.lib.awtextra.AbsoluteConstraints(438, 244, 40, 40));

        pt6.setBackground(new java.awt.Color(238, 238, 238));
        pt6.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        pt6.setForeground(new java.awt.Color(242, 241, 241));
        pt6.setText("La7P0");
        pt6.setOpaque(true);
        PANPAGE0.add(pt6, new org.netbeans.lib.awtextra.AbsoluteConstraints(612, 244, 40, 40));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 0));
        jLabel4.setText("=> Cây. ");
        PANPAGE0.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 90, 40));

        filler37.setBackground(new java.awt.Color(255, 255, 255));
        filler37.setOpaque(true);
        PANPAGE0.add(filler37, new org.netbeans.lib.awtextra.AbsoluteConstraints(369, 108, 2, 20));

        filler38.setBackground(new java.awt.Color(255, 255, 255));
        filler38.setOpaque(true);
        PANPAGE0.add(filler38, new org.netbeans.lib.awtextra.AbsoluteConstraints(194, 128, 350, 2));

        filler39.setBackground(new java.awt.Color(255, 255, 255));
        filler39.setOpaque(true);
        PANPAGE0.add(filler39, new org.netbeans.lib.awtextra.AbsoluteConstraints(544, 128, 2, 28));

        filler40.setBackground(new java.awt.Color(255, 255, 255));
        filler40.setOpaque(true);
        PANPAGE0.add(filler40, new org.netbeans.lib.awtextra.AbsoluteConstraints(631, 218, 2, 26));

        filler41.setBackground(new java.awt.Color(255, 255, 255));
        filler41.setOpaque(true);
        PANPAGE0.add(filler41, new org.netbeans.lib.awtextra.AbsoluteConstraints(194, 196, 2, 20));

        filler42.setBackground(new java.awt.Color(255, 255, 255));
        filler42.setOpaque(true);
        PANPAGE0.add(filler42, new org.netbeans.lib.awtextra.AbsoluteConstraints(457, 218, 2, 26));

        filler43.setBackground(new java.awt.Color(255, 255, 255));
        filler43.setOpaque(true);
        PANPAGE0.add(filler43, new org.netbeans.lib.awtextra.AbsoluteConstraints(194, 128, 2, 28));

        filler44.setBackground(new java.awt.Color(255, 255, 255));
        filler44.setOpaque(true);
        PANPAGE0.add(filler44, new org.netbeans.lib.awtextra.AbsoluteConstraints(106, 216, 177, 2));

        filler45.setBackground(new java.awt.Color(255, 255, 255));
        filler45.setOpaque(true);
        PANPAGE0.add(filler45, new org.netbeans.lib.awtextra.AbsoluteConstraints(544, 196, 2, 20));

        filler46.setBackground(new java.awt.Color(255, 255, 255));
        filler46.setOpaque(true);
        PANPAGE0.add(filler46, new org.netbeans.lib.awtextra.AbsoluteConstraints(457, 216, 176, 2));

        filler47.setBackground(new java.awt.Color(255, 255, 255));
        filler47.setOpaque(true);
        PANPAGE0.add(filler47, new org.netbeans.lib.awtextra.AbsoluteConstraints(106, 218, 2, 26));

        filler48.setBackground(new java.awt.Color(255, 255, 255));
        filler48.setOpaque(true);
        PANPAGE0.add(filler48, new org.netbeans.lib.awtextra.AbsoluteConstraints(281, 218, 2, 26));

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("A0");
        PANPAGE0.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 78, 20, 20));

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("A6");
        PANPAGE0.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(592, 254, 20, 20));

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("A1");
        PANPAGE0.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 166, 20, 20));

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("A2");
        PANPAGE0.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(505, 166, 20, 20));

        jLabel26.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("A3");
        PANPAGE0.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 254, 20, 20));

        jLabel27.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("A4");
        PANPAGE0.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(242, 254, 20, 20));

        jLabel28.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("A5");
        PANPAGE0.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(418, 254, 20, 20));

        titleP1.setBackground(new java.awt.Color(0, 0, 0));
        titleP1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        titleP1.setForeground(new java.awt.Color(255, 255, 255));
        titleP1.setOpaque(true);
        PANPAGE0.add(titleP1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 156, 260, 20));

        jPanel30.add(PANPAGE0, "card2");

        PANPAGE1.setBackground(new java.awt.Color(0, 0, 0));
        PANPAGE1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        La1P1.setBackground(new java.awt.Color(0, 0, 102));
        La1P1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        La1P1.setForeground(new java.awt.Color(255, 255, 255));
        La1P1.setText("La1P1");
        La1P1.setOpaque(true);
        PANPAGE1.add(La1P1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 68, 40, 40));

        La2P1.setBackground(new java.awt.Color(0, 0, 102));
        La2P1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        La2P1.setForeground(new java.awt.Color(255, 255, 255));
        La2P1.setText("La2P1");
        La2P1.setOpaque(true);
        PANPAGE1.add(La2P1, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 156, 40, 40));

        La3P1.setBackground(new java.awt.Color(0, 0, 102));
        La3P1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        La3P1.setForeground(new java.awt.Color(255, 255, 255));
        La3P1.setText("La3P1");
        La3P1.setOpaque(true);
        PANPAGE1.add(La3P1, new org.netbeans.lib.awtextra.AbsoluteConstraints(525, 156, 40, 40));

        La4P1.setBackground(new java.awt.Color(0, 0, 102));
        La4P1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        La4P1.setForeground(new java.awt.Color(255, 255, 255));
        La4P1.setText("La4P1");
        La4P1.setOpaque(true);
        PANPAGE1.add(La4P1, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 244, 40, 40));

        La5P1.setBackground(new java.awt.Color(0, 0, 102));
        La5P1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        La5P1.setForeground(new java.awt.Color(255, 255, 255));
        La5P1.setText("La5P1");
        La5P1.setOpaque(true);
        PANPAGE1.add(La5P1, new org.netbeans.lib.awtextra.AbsoluteConstraints(262, 244, 40, 40));

        La6P1.setBackground(new java.awt.Color(0, 0, 102));
        La6P1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        La6P1.setForeground(new java.awt.Color(255, 255, 255));
        La6P1.setText("La6P1");
        La6P1.setOpaque(true);
        PANPAGE1.add(La6P1, new org.netbeans.lib.awtextra.AbsoluteConstraints(438, 244, 40, 40));

        La7P1.setBackground(new java.awt.Color(0, 0, 102));
        La7P1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        La7P1.setForeground(new java.awt.Color(255, 255, 255));
        La7P1.setText("La7P1");
        La7P1.setOpaque(true);
        PANPAGE1.add(La7P1, new org.netbeans.lib.awtextra.AbsoluteConstraints(612, 244, 40, 40));

        JL1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        JL1.setForeground(new java.awt.Color(255, 0, 0));
        JL1.setText("Bước 1.");
        PANPAGE1.add(JL1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 90, 40));

        filler1.setBackground(new java.awt.Color(255, 255, 255));
        filler1.setOpaque(true);
        PANPAGE1.add(filler1, new org.netbeans.lib.awtextra.AbsoluteConstraints(369, 108, 2, 20));

        filler2.setBackground(new java.awt.Color(255, 255, 255));
        filler2.setOpaque(true);
        PANPAGE1.add(filler2, new org.netbeans.lib.awtextra.AbsoluteConstraints(194, 128, 350, 2));

        filler3.setBackground(new java.awt.Color(255, 255, 255));
        filler3.setOpaque(true);
        PANPAGE1.add(filler3, new org.netbeans.lib.awtextra.AbsoluteConstraints(194, 128, 2, 28));

        filler4.setBackground(new java.awt.Color(255, 255, 255));
        filler4.setOpaque(true);
        PANPAGE1.add(filler4, new org.netbeans.lib.awtextra.AbsoluteConstraints(544, 128, 2, 28));

        filler5.setBackground(new java.awt.Color(255, 255, 255));
        filler5.setOpaque(true);
        PANPAGE1.add(filler5, new org.netbeans.lib.awtextra.AbsoluteConstraints(194, 196, 2, 20));

        filler6.setBackground(new java.awt.Color(255, 255, 255));
        filler6.setOpaque(true);
        PANPAGE1.add(filler6, new org.netbeans.lib.awtextra.AbsoluteConstraints(544, 196, 2, 20));

        filler7.setBackground(new java.awt.Color(255, 255, 255));
        filler7.setOpaque(true);
        PANPAGE1.add(filler7, new org.netbeans.lib.awtextra.AbsoluteConstraints(106, 216, 177, 2));

        filler8.setBackground(new java.awt.Color(255, 255, 255));
        filler8.setOpaque(true);
        PANPAGE1.add(filler8, new org.netbeans.lib.awtextra.AbsoluteConstraints(106, 218, 2, 26));

        filler9.setBackground(new java.awt.Color(255, 255, 255));
        filler9.setOpaque(true);
        PANPAGE1.add(filler9, new org.netbeans.lib.awtextra.AbsoluteConstraints(281, 218, 2, 26));

        filler10.setBackground(new java.awt.Color(255, 255, 255));
        filler10.setOpaque(true);
        PANPAGE1.add(filler10, new org.netbeans.lib.awtextra.AbsoluteConstraints(457, 216, 176, 2));

        filler11.setBackground(new java.awt.Color(255, 255, 255));
        filler11.setOpaque(true);
        PANPAGE1.add(filler11, new org.netbeans.lib.awtextra.AbsoluteConstraints(457, 218, 2, 26));

        filler12.setBackground(new java.awt.Color(255, 255, 255));
        filler12.setOpaque(true);
        PANPAGE1.add(filler12, new org.netbeans.lib.awtextra.AbsoluteConstraints(631, 218, 2, 26));

        jLabel29.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("A0");
        PANPAGE1.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 78, 20, 20));

        jLabel30.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("A6");
        PANPAGE1.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(592, 254, 20, 20));

        jLabel31.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setText("A1");
        PANPAGE1.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 166, 20, 20));

        jLabel32.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setText("A2");
        PANPAGE1.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(505, 166, 20, 20));

        jLabel33.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setText("A3");
        PANPAGE1.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 254, 20, 20));

        jLabel34.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(255, 255, 255));
        jLabel34.setText("A4");
        PANPAGE1.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(242, 254, 20, 20));

        jLabel35.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 255, 255));
        jLabel35.setText("A5");
        PANPAGE1.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(418, 254, 20, 20));

        jLabel125.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel125.setForeground(new java.awt.Color(255, 255, 255));
        jLabel125.setText("Chuẩn hóa node A1(A1 >= A3 && A1 >= A4)");
        PANPAGE1.add(jLabel125, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 156, 260, 20));

        jPanel30.add(PANPAGE1, "card2");

        PANPAGE2.setBackground(new java.awt.Color(0, 0, 0));
        PANPAGE2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        La1P2.setBackground(new java.awt.Color(0, 0, 102));
        La1P2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        La1P2.setForeground(new java.awt.Color(255, 255, 255));
        La1P2.setText("La1P2");
        La1P2.setOpaque(true);
        PANPAGE2.add(La1P2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 68, 40, 40));

        La2P2.setBackground(new java.awt.Color(0, 0, 102));
        La2P2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        La2P2.setForeground(new java.awt.Color(255, 255, 255));
        La2P2.setText("La2P2");
        La2P2.setOpaque(true);
        PANPAGE2.add(La2P2, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 156, 40, 40));

        La3P2.setBackground(new java.awt.Color(0, 0, 102));
        La3P2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        La3P2.setForeground(new java.awt.Color(255, 255, 255));
        La3P2.setText("La3P2");
        La3P2.setOpaque(true);
        PANPAGE2.add(La3P2, new org.netbeans.lib.awtextra.AbsoluteConstraints(525, 156, 40, 40));

        La4P2.setBackground(new java.awt.Color(0, 0, 102));
        La4P2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        La4P2.setForeground(new java.awt.Color(255, 255, 255));
        La4P2.setText("La4P2");
        La4P2.setOpaque(true);
        PANPAGE2.add(La4P2, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 244, 40, 40));

        La5P2.setBackground(new java.awt.Color(0, 0, 102));
        La5P2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        La5P2.setForeground(new java.awt.Color(255, 255, 255));
        La5P2.setText("La5P2");
        La5P2.setOpaque(true);
        PANPAGE2.add(La5P2, new org.netbeans.lib.awtextra.AbsoluteConstraints(262, 244, 40, 40));

        La6P2.setBackground(new java.awt.Color(0, 0, 102));
        La6P2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        La6P2.setForeground(new java.awt.Color(255, 255, 255));
        La6P2.setText("La6P2");
        La6P2.setOpaque(true);
        PANPAGE2.add(La6P2, new org.netbeans.lib.awtextra.AbsoluteConstraints(438, 244, 40, 40));

        La7P2.setBackground(new java.awt.Color(0, 0, 102));
        La7P2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        La7P2.setForeground(new java.awt.Color(255, 255, 255));
        La7P2.setText("La7P2");
        La7P2.setOpaque(true);
        PANPAGE2.add(La7P2, new org.netbeans.lib.awtextra.AbsoluteConstraints(612, 244, 40, 40));

        JL2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        JL2.setForeground(new java.awt.Color(255, 0, 0));
        JL2.setText("Bước 2. ");
        PANPAGE2.add(JL2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, 40));

        filler13.setBackground(new java.awt.Color(255, 255, 255));
        filler13.setOpaque(true);
        PANPAGE2.add(filler13, new org.netbeans.lib.awtextra.AbsoluteConstraints(631, 218, 2, 26));

        filler14.setBackground(new java.awt.Color(255, 255, 255));
        filler14.setOpaque(true);
        PANPAGE2.add(filler14, new org.netbeans.lib.awtextra.AbsoluteConstraints(369, 108, 2, 20));

        filler15.setBackground(new java.awt.Color(255, 255, 255));
        filler15.setOpaque(true);
        PANPAGE2.add(filler15, new org.netbeans.lib.awtextra.AbsoluteConstraints(194, 128, 2, 28));

        filler16.setBackground(new java.awt.Color(255, 255, 255));
        filler16.setOpaque(true);
        PANPAGE2.add(filler16, new org.netbeans.lib.awtextra.AbsoluteConstraints(544, 128, 2, 28));

        filler17.setBackground(new java.awt.Color(255, 255, 255));
        filler17.setOpaque(true);
        PANPAGE2.add(filler17, new org.netbeans.lib.awtextra.AbsoluteConstraints(281, 218, 2, 26));

        filler18.setBackground(new java.awt.Color(255, 255, 255));
        filler18.setOpaque(true);
        PANPAGE2.add(filler18, new org.netbeans.lib.awtextra.AbsoluteConstraints(106, 218, 2, 26));

        filler19.setBackground(new java.awt.Color(255, 255, 255));
        filler19.setOpaque(true);
        PANPAGE2.add(filler19, new org.netbeans.lib.awtextra.AbsoluteConstraints(457, 218, 2, 26));

        filler20.setBackground(new java.awt.Color(255, 255, 255));
        filler20.setOpaque(true);
        PANPAGE2.add(filler20, new org.netbeans.lib.awtextra.AbsoluteConstraints(194, 196, 2, 20));

        filler22.setBackground(new java.awt.Color(255, 255, 255));
        filler22.setOpaque(true);
        PANPAGE2.add(filler22, new org.netbeans.lib.awtextra.AbsoluteConstraints(194, 128, 350, 2));

        filler23.setBackground(new java.awt.Color(255, 255, 255));
        filler23.setOpaque(true);
        PANPAGE2.add(filler23, new org.netbeans.lib.awtextra.AbsoluteConstraints(106, 216, 177, 2));

        filler24.setBackground(new java.awt.Color(255, 255, 255));
        filler24.setOpaque(true);
        PANPAGE2.add(filler24, new org.netbeans.lib.awtextra.AbsoluteConstraints(457, 216, 176, 2));

        filler25.setBackground(new java.awt.Color(255, 255, 255));
        filler25.setOpaque(true);
        PANPAGE2.add(filler25, new org.netbeans.lib.awtextra.AbsoluteConstraints(544, 196, 2, 20));

        jLabel36.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(255, 255, 255));
        jLabel36.setText("A0");
        PANPAGE2.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 78, 20, 20));

        jLabel37.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(255, 255, 255));
        jLabel37.setText("A6");
        PANPAGE2.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(592, 254, 20, 20));

        jLabel38.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(255, 255, 255));
        jLabel38.setText("A1");
        PANPAGE2.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 166, 20, 20));

        jLabel39.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(255, 255, 255));
        jLabel39.setText("A2");
        PANPAGE2.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(505, 166, 20, 20));

        jLabel40.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(255, 255, 255));
        jLabel40.setText("A3");
        PANPAGE2.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 254, 20, 20));

        jLabel41.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(255, 255, 255));
        jLabel41.setText("A4");
        PANPAGE2.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(242, 254, 20, 20));

        jLabel42.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(255, 255, 255));
        jLabel42.setText("A5");
        PANPAGE2.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(418, 254, 20, 20));

        jLabel126.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel126.setForeground(new java.awt.Color(255, 255, 255));
        jLabel126.setText("Chuẩn hóa node A0(A0 >= A1 && A0 >= A2)");
        PANPAGE2.add(jLabel126, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 156, 260, 20));

        jPanel30.add(PANPAGE2, "card2");

        PANPAGE3.setBackground(new java.awt.Color(0, 0, 0));
        PANPAGE3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        La1P3.setBackground(new java.awt.Color(0, 0, 102));
        La1P3.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        La1P3.setForeground(new java.awt.Color(255, 255, 255));
        La1P3.setText("La1P3");
        La1P3.setOpaque(true);
        PANPAGE3.add(La1P3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 68, 40, 40));

        La2P3.setBackground(new java.awt.Color(0, 0, 102));
        La2P3.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        La2P3.setForeground(new java.awt.Color(255, 255, 255));
        La2P3.setText("La2P3");
        La2P3.setOpaque(true);
        PANPAGE3.add(La2P3, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 156, 40, 40));

        La3P3.setBackground(new java.awt.Color(0, 0, 102));
        La3P3.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        La3P3.setForeground(new java.awt.Color(255, 255, 255));
        La3P3.setText("La3P3");
        La3P3.setOpaque(true);
        PANPAGE3.add(La3P3, new org.netbeans.lib.awtextra.AbsoluteConstraints(525, 156, 40, 40));

        La4P3.setBackground(new java.awt.Color(0, 0, 102));
        La4P3.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        La4P3.setForeground(new java.awt.Color(255, 255, 255));
        La4P3.setText("La4P3");
        La4P3.setOpaque(true);
        PANPAGE3.add(La4P3, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 244, 40, 40));

        La5P3.setBackground(new java.awt.Color(0, 0, 102));
        La5P3.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        La5P3.setForeground(new java.awt.Color(255, 255, 255));
        La5P3.setText("La5P3");
        La5P3.setOpaque(true);
        PANPAGE3.add(La5P3, new org.netbeans.lib.awtextra.AbsoluteConstraints(262, 244, 40, 40));

        La6P3.setBackground(new java.awt.Color(0, 0, 102));
        La6P3.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        La6P3.setForeground(new java.awt.Color(255, 255, 255));
        La6P3.setText("La6P3");
        La6P3.setOpaque(true);
        PANPAGE3.add(La6P3, new org.netbeans.lib.awtextra.AbsoluteConstraints(438, 244, 40, 40));

        La7P3.setBackground(new java.awt.Color(0, 0, 102));
        La7P3.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        La7P3.setForeground(new java.awt.Color(255, 255, 255));
        La7P3.setText("La7P3");
        La7P3.setOpaque(true);
        PANPAGE3.add(La7P3, new org.netbeans.lib.awtextra.AbsoluteConstraints(612, 244, 40, 40));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setText("Bước 3.");
        PANPAGE3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 90, 40));

        filler21.setBackground(new java.awt.Color(255, 255, 255));
        filler21.setOpaque(true);
        PANPAGE3.add(filler21, new org.netbeans.lib.awtextra.AbsoluteConstraints(369, 108, 2, 20));

        filler26.setBackground(new java.awt.Color(255, 255, 255));
        filler26.setOpaque(true);
        PANPAGE3.add(filler26, new org.netbeans.lib.awtextra.AbsoluteConstraints(194, 128, 350, 2));

        filler27.setBackground(new java.awt.Color(255, 255, 255));
        filler27.setOpaque(true);
        PANPAGE3.add(filler27, new org.netbeans.lib.awtextra.AbsoluteConstraints(544, 128, 2, 28));

        filler28.setBackground(new java.awt.Color(255, 255, 255));
        filler28.setOpaque(true);
        PANPAGE3.add(filler28, new org.netbeans.lib.awtextra.AbsoluteConstraints(631, 218, 2, 26));

        filler29.setBackground(new java.awt.Color(255, 255, 255));
        filler29.setOpaque(true);
        PANPAGE3.add(filler29, new org.netbeans.lib.awtextra.AbsoluteConstraints(194, 196, 2, 20));

        filler30.setBackground(new java.awt.Color(255, 255, 255));
        filler30.setOpaque(true);
        PANPAGE3.add(filler30, new org.netbeans.lib.awtextra.AbsoluteConstraints(457, 218, 2, 26));

        filler31.setBackground(new java.awt.Color(255, 255, 255));
        filler31.setOpaque(true);
        PANPAGE3.add(filler31, new org.netbeans.lib.awtextra.AbsoluteConstraints(194, 128, 2, 28));

        filler32.setBackground(new java.awt.Color(255, 255, 255));
        filler32.setOpaque(true);
        PANPAGE3.add(filler32, new org.netbeans.lib.awtextra.AbsoluteConstraints(106, 216, 177, 2));

        filler33.setBackground(new java.awt.Color(255, 255, 255));
        filler33.setOpaque(true);
        PANPAGE3.add(filler33, new org.netbeans.lib.awtextra.AbsoluteConstraints(544, 196, 2, 20));

        filler34.setBackground(new java.awt.Color(255, 255, 255));
        filler34.setOpaque(true);
        PANPAGE3.add(filler34, new org.netbeans.lib.awtextra.AbsoluteConstraints(457, 216, 176, 2));

        filler35.setBackground(new java.awt.Color(255, 255, 255));
        filler35.setOpaque(true);
        PANPAGE3.add(filler35, new org.netbeans.lib.awtextra.AbsoluteConstraints(106, 218, 2, 26));

        filler36.setBackground(new java.awt.Color(255, 255, 255));
        filler36.setOpaque(true);
        PANPAGE3.add(filler36, new org.netbeans.lib.awtextra.AbsoluteConstraints(281, 218, 2, 26));

        jLabel43.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(255, 255, 255));
        jLabel43.setText("A0");
        PANPAGE3.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 78, 20, 20));

        jLabel44.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(255, 255, 255));
        jLabel44.setText("A6");
        PANPAGE3.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(592, 254, 20, 20));

        jLabel45.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(255, 255, 255));
        jLabel45.setText("A1");
        PANPAGE3.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 166, 20, 20));

        jLabel46.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(255, 255, 255));
        jLabel46.setText("A2");
        PANPAGE3.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(505, 166, 20, 20));

        jLabel47.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(255, 255, 255));
        jLabel47.setText("A3");
        PANPAGE3.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 254, 20, 20));

        jLabel48.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(255, 255, 255));
        jLabel48.setText("A4");
        PANPAGE3.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(242, 254, 20, 20));

        jLabel49.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(255, 255, 255));
        jLabel49.setText("A5");
        PANPAGE3.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(418, 254, 20, 20));

        jLabel124.setBackground(new java.awt.Color(0, 0, 0));
        jLabel124.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel124.setForeground(new java.awt.Color(255, 255, 255));
        jLabel124.setText("       Swap A0 <-> A6");
        jLabel124.setOpaque(true);
        PANPAGE3.add(jLabel124, new org.netbeans.lib.awtextra.AbsoluteConstraints(285, 156, 170, 20));

        jPanel30.add(PANPAGE3, "card2");

        PANPAGE4.setBackground(new java.awt.Color(0, 0, 0));
        PANPAGE4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new java.awt.CardLayout());

        PAN4SW.setBackground(new java.awt.Color(0, 0, 0));
        PAN4SW.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SW1_4.setBackground(new java.awt.Color(0, 0, 102));
        SW1_4.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        SW1_4.setForeground(new java.awt.Color(255, 255, 255));
        SW1_4.setText("W1_4");
        SW1_4.setOpaque(true);
        PAN4SW.add(SW1_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 28, 40, 40));

        SW2_4.setBackground(new java.awt.Color(0, 0, 102));
        SW2_4.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        SW2_4.setForeground(new java.awt.Color(255, 255, 255));
        SW2_4.setText("W2_4");
        SW2_4.setOpaque(true);
        PAN4SW.add(SW2_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 116, 40, 40));

        SW3_4.setBackground(new java.awt.Color(0, 0, 102));
        SW3_4.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        SW3_4.setForeground(new java.awt.Color(255, 255, 255));
        SW3_4.setText("W3_4");
        SW3_4.setOpaque(true);
        PAN4SW.add(SW3_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(525, 116, 40, 40));

        SW4_4.setBackground(new java.awt.Color(0, 0, 102));
        SW4_4.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        SW4_4.setForeground(new java.awt.Color(255, 255, 255));
        SW4_4.setText("W4_4");
        SW4_4.setOpaque(true);
        PAN4SW.add(SW4_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 204, 40, 40));

        SW5_4.setBackground(new java.awt.Color(0, 0, 102));
        SW5_4.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        SW5_4.setForeground(new java.awt.Color(255, 255, 255));
        SW5_4.setText("W5_4");
        SW5_4.setOpaque(true);
        PAN4SW.add(SW5_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(262, 204, 40, 40));

        SW6_4.setBackground(new java.awt.Color(0, 0, 102));
        SW6_4.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        SW6_4.setForeground(new java.awt.Color(255, 255, 255));
        SW6_4.setText("W6_4");
        SW6_4.setOpaque(true);
        PAN4SW.add(SW6_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(438, 204, 40, 40));

        SW7_4.setBackground(new java.awt.Color(0, 0, 102));
        SW7_4.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        SW7_4.setForeground(new java.awt.Color(255, 255, 255));
        SW7_4.setText("W7_4");
        SW7_4.setOpaque(true);
        PAN4SW.add(SW7_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(612, 204, 40, 40));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("B4-1");
        PAN4SW.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 40));

        filler49.setBackground(new java.awt.Color(255, 255, 255));
        filler49.setOpaque(true);
        PAN4SW.add(filler49, new org.netbeans.lib.awtextra.AbsoluteConstraints(194, 156, 2, 20));

        filler50.setBackground(new java.awt.Color(255, 255, 255));
        filler50.setOpaque(true);
        PAN4SW.add(filler50, new org.netbeans.lib.awtextra.AbsoluteConstraints(281, 178, 2, 26));

        filler51.setBackground(new java.awt.Color(255, 255, 255));
        filler51.setOpaque(true);
        PAN4SW.add(filler51, new org.netbeans.lib.awtextra.AbsoluteConstraints(106, 178, 2, 26));

        filler52.setBackground(new java.awt.Color(255, 255, 255));
        filler52.setOpaque(true);
        PAN4SW.add(filler52, new org.netbeans.lib.awtextra.AbsoluteConstraints(457, 176, 176, 2));

        filler53.setBackground(new java.awt.Color(255, 255, 255));
        filler53.setOpaque(true);
        PAN4SW.add(filler53, new org.netbeans.lib.awtextra.AbsoluteConstraints(106, 176, 177, 2));

        filler54.setBackground(new java.awt.Color(255, 255, 255));
        filler54.setOpaque(true);
        PAN4SW.add(filler54, new org.netbeans.lib.awtextra.AbsoluteConstraints(457, 178, 2, 26));

        filler55.setBackground(new java.awt.Color(255, 255, 255));
        filler55.setOpaque(true);
        PAN4SW.add(filler55, new org.netbeans.lib.awtextra.AbsoluteConstraints(631, 178, 2, 26));

        filler56.setBackground(new java.awt.Color(255, 255, 255));
        filler56.setOpaque(true);
        PAN4SW.add(filler56, new org.netbeans.lib.awtextra.AbsoluteConstraints(544, 88, 2, 28));

        filler57.setBackground(new java.awt.Color(255, 255, 255));
        filler57.setOpaque(true);
        PAN4SW.add(filler57, new org.netbeans.lib.awtextra.AbsoluteConstraints(369, 68, 2, 20));

        filler58.setBackground(new java.awt.Color(255, 255, 255));
        filler58.setOpaque(true);
        PAN4SW.add(filler58, new org.netbeans.lib.awtextra.AbsoluteConstraints(194, 88, 350, 2));

        filler59.setBackground(new java.awt.Color(255, 255, 255));
        filler59.setOpaque(true);
        PAN4SW.add(filler59, new org.netbeans.lib.awtextra.AbsoluteConstraints(544, 156, 2, 20));

        filler60.setBackground(new java.awt.Color(255, 255, 255));
        filler60.setOpaque(true);
        PAN4SW.add(filler60, new org.netbeans.lib.awtextra.AbsoluteConstraints(194, 88, 2, 28));

        jLabel50.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(255, 255, 255));
        jLabel50.setText("A0");
        PAN4SW.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 38, 20, 20));

        jLabel51.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(255, 255, 255));
        jLabel51.setText("A6");
        PAN4SW.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(592, 214, 20, 20));

        jLabel52.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(255, 255, 255));
        jLabel52.setText("A1");
        PAN4SW.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 126, 20, 20));

        jLabel53.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel53.setForeground(new java.awt.Color(255, 255, 255));
        jLabel53.setText("A2");
        PAN4SW.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(505, 126, 20, 20));

        jLabel54.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel54.setForeground(new java.awt.Color(255, 255, 255));
        jLabel54.setText("A3");
        PAN4SW.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 214, 20, 20));

        jLabel55.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel55.setForeground(new java.awt.Color(255, 255, 255));
        jLabel55.setText("A4");
        PAN4SW.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(242, 214, 20, 20));

        jLabel56.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel56.setForeground(new java.awt.Color(255, 255, 255));
        jLabel56.setText("A5");
        PAN4SW.add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(418, 214, 20, 20));

        jLabel127.setBackground(new java.awt.Color(0, 0, 0));
        jLabel127.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel127.setForeground(new java.awt.Color(255, 255, 255));
        jLabel127.setText("  Đưa phần còn lại về Heap");
        jLabel127.setOpaque(true);
        PAN4SW.add(jLabel127, new org.netbeans.lib.awtextra.AbsoluteConstraints(285, 116, 170, 20));
        jLabel127.getAccessibleContext().setAccessibleName("");

        jPanel1.add(PAN4SW, "card2");

        PAN4ShiftDown.setBackground(new java.awt.Color(0, 0, 0));
        PAN4ShiftDown.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SD1_4.setBackground(new java.awt.Color(0, 0, 102));
        SD1_4.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        SD1_4.setForeground(new java.awt.Color(255, 255, 255));
        SD1_4.setText("S1_4");
        SD1_4.setOpaque(true);
        PAN4ShiftDown.add(SD1_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 28, 40, 40));

        SD2_4.setBackground(new java.awt.Color(0, 0, 102));
        SD2_4.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        SD2_4.setForeground(new java.awt.Color(255, 255, 255));
        SD2_4.setText("S2_4");
        SD2_4.setOpaque(true);
        PAN4ShiftDown.add(SD2_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 116, 40, 40));

        SD3_4.setBackground(new java.awt.Color(0, 0, 102));
        SD3_4.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        SD3_4.setForeground(new java.awt.Color(255, 255, 255));
        SD3_4.setText("S3_4");
        SD3_4.setOpaque(true);
        PAN4ShiftDown.add(SD3_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(525, 116, 40, 40));

        SD4_4.setBackground(new java.awt.Color(0, 0, 102));
        SD4_4.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        SD4_4.setForeground(new java.awt.Color(255, 255, 255));
        SD4_4.setText("S4_4");
        SD4_4.setOpaque(true);
        PAN4ShiftDown.add(SD4_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 204, 40, 40));

        SD5_4.setBackground(new java.awt.Color(0, 0, 102));
        SD5_4.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        SD5_4.setForeground(new java.awt.Color(255, 255, 255));
        SD5_4.setText("S5_4");
        SD5_4.setOpaque(true);
        PAN4ShiftDown.add(SD5_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(262, 204, 40, 40));

        SD6_4.setBackground(new java.awt.Color(0, 0, 102));
        SD6_4.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        SD6_4.setForeground(new java.awt.Color(255, 255, 255));
        SD6_4.setText("S6_4");
        SD6_4.setOpaque(true);
        PAN4ShiftDown.add(SD6_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(438, 204, 40, 40));

        SD7_4.setBackground(new java.awt.Color(0, 0, 102));
        SD7_4.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        SD7_4.setForeground(new java.awt.Color(255, 255, 255));
        SD7_4.setText("S7_4");
        SD7_4.setOpaque(true);
        PAN4ShiftDown.add(SD7_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(612, 204, 40, 40));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 0, 0));
        jLabel5.setText("B4-2");
        PAN4ShiftDown.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 40));

        filler61.setBackground(new java.awt.Color(255, 255, 255));
        filler61.setOpaque(true);
        PAN4ShiftDown.add(filler61, new org.netbeans.lib.awtextra.AbsoluteConstraints(194, 88, 350, 2));

        filler62.setBackground(new java.awt.Color(255, 255, 255));
        filler62.setOpaque(true);
        PAN4ShiftDown.add(filler62, new org.netbeans.lib.awtextra.AbsoluteConstraints(106, 176, 177, 2));

        filler63.setBackground(new java.awt.Color(255, 255, 255));
        filler63.setOpaque(true);
        PAN4ShiftDown.add(filler63, new org.netbeans.lib.awtextra.AbsoluteConstraints(194, 88, 2, 28));

        filler64.setBackground(new java.awt.Color(255, 255, 255));
        filler64.setOpaque(true);
        PAN4ShiftDown.add(filler64, new org.netbeans.lib.awtextra.AbsoluteConstraints(544, 88, 2, 28));

        filler65.setBackground(new java.awt.Color(255, 255, 255));
        filler65.setOpaque(true);
        PAN4ShiftDown.add(filler65, new org.netbeans.lib.awtextra.AbsoluteConstraints(281, 178, 2, 26));

        filler66.setBackground(new java.awt.Color(255, 255, 255));
        filler66.setOpaque(true);
        PAN4ShiftDown.add(filler66, new org.netbeans.lib.awtextra.AbsoluteConstraints(106, 178, 2, 26));

        filler67.setBackground(new java.awt.Color(255, 255, 255));
        filler67.setOpaque(true);
        PAN4ShiftDown.add(filler67, new org.netbeans.lib.awtextra.AbsoluteConstraints(369, 68, 2, 20));

        filler68.setBackground(new java.awt.Color(255, 255, 255));
        filler68.setOpaque(true);
        PAN4ShiftDown.add(filler68, new org.netbeans.lib.awtextra.AbsoluteConstraints(457, 176, 176, 2));

        filler69.setBackground(new java.awt.Color(255, 255, 255));
        filler69.setOpaque(true);
        PAN4ShiftDown.add(filler69, new org.netbeans.lib.awtextra.AbsoluteConstraints(194, 156, 2, 20));

        filler70.setBackground(new java.awt.Color(255, 255, 255));
        filler70.setOpaque(true);
        PAN4ShiftDown.add(filler70, new org.netbeans.lib.awtextra.AbsoluteConstraints(457, 178, 2, 26));

        filler71.setBackground(new java.awt.Color(255, 255, 255));
        filler71.setOpaque(true);
        PAN4ShiftDown.add(filler71, new org.netbeans.lib.awtextra.AbsoluteConstraints(631, 178, 2, 26));

        filler72.setBackground(new java.awt.Color(255, 255, 255));
        filler72.setOpaque(true);
        PAN4ShiftDown.add(filler72, new org.netbeans.lib.awtextra.AbsoluteConstraints(544, 156, 2, 20));

        jLabel57.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel57.setForeground(new java.awt.Color(255, 255, 255));
        jLabel57.setText("A0");
        PAN4ShiftDown.add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 38, 20, 20));

        jLabel58.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel58.setForeground(new java.awt.Color(255, 255, 255));
        jLabel58.setText("A6");
        PAN4ShiftDown.add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(592, 214, 20, 20));

        jLabel59.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel59.setForeground(new java.awt.Color(255, 255, 255));
        jLabel59.setText("A1");
        PAN4ShiftDown.add(jLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 126, 20, 20));

        jLabel60.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel60.setForeground(new java.awt.Color(255, 255, 255));
        jLabel60.setText("A2");
        PAN4ShiftDown.add(jLabel60, new org.netbeans.lib.awtextra.AbsoluteConstraints(505, 126, 20, 20));

        jLabel61.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel61.setForeground(new java.awt.Color(255, 255, 255));
        jLabel61.setText("A3");
        PAN4ShiftDown.add(jLabel61, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 214, 20, 20));

        jLabel62.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel62.setForeground(new java.awt.Color(255, 255, 255));
        jLabel62.setText("A4");
        PAN4ShiftDown.add(jLabel62, new org.netbeans.lib.awtextra.AbsoluteConstraints(242, 214, 20, 20));

        jLabel63.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel63.setForeground(new java.awt.Color(255, 255, 255));
        jLabel63.setText("A5");
        PAN4ShiftDown.add(jLabel63, new org.netbeans.lib.awtextra.AbsoluteConstraints(418, 214, 20, 20));

        jLabel133.setBackground(new java.awt.Color(0, 0, 0));
        jLabel133.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel133.setForeground(new java.awt.Color(255, 255, 255));
        jLabel133.setText("            Xóa Node A6");
        jLabel133.setOpaque(true);
        PAN4ShiftDown.add(jLabel133, new org.netbeans.lib.awtextra.AbsoluteConstraints(285, 116, 170, 20));

        jPanel1.add(PAN4ShiftDown, "card2");

        PAN4Delete.setBackground(new java.awt.Color(0, 0, 0));
        PAN4Delete.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        D1_4.setBackground(new java.awt.Color(0, 0, 102));
        D1_4.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        D1_4.setForeground(new java.awt.Color(255, 255, 255));
        D1_4.setText("D1_4");
        D1_4.setOpaque(true);
        PAN4Delete.add(D1_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 28, 40, 40));

        D2_4.setBackground(new java.awt.Color(0, 0, 102));
        D2_4.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        D2_4.setForeground(new java.awt.Color(255, 255, 255));
        D2_4.setText("D2_4");
        D2_4.setOpaque(true);
        PAN4Delete.add(D2_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 116, 40, 40));

        D3_4.setBackground(new java.awt.Color(0, 0, 102));
        D3_4.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        D3_4.setForeground(new java.awt.Color(255, 255, 255));
        D3_4.setText("D3_4");
        D3_4.setOpaque(true);
        PAN4Delete.add(D3_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(525, 116, 40, 40));

        D4_4.setBackground(new java.awt.Color(0, 0, 102));
        D4_4.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        D4_4.setForeground(new java.awt.Color(255, 255, 255));
        D4_4.setText("D4_4");
        D4_4.setOpaque(true);
        PAN4Delete.add(D4_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 204, 40, 40));

        D5_4.setBackground(new java.awt.Color(0, 0, 102));
        D5_4.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        D5_4.setForeground(new java.awt.Color(255, 255, 255));
        D5_4.setText("D5_4");
        D5_4.setOpaque(true);
        PAN4Delete.add(D5_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(262, 204, 40, 40));

        D6_4.setBackground(new java.awt.Color(0, 0, 102));
        D6_4.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        D6_4.setForeground(new java.awt.Color(255, 255, 255));
        D6_4.setText("D6_4");
        D6_4.setOpaque(true);
        PAN4Delete.add(D6_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(438, 204, 40, 40));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 0, 0));
        jLabel6.setText("B4-3");
        PAN4Delete.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 40));

        filler73.setBackground(new java.awt.Color(255, 255, 255));
        filler73.setOpaque(true);
        PAN4Delete.add(filler73, new org.netbeans.lib.awtextra.AbsoluteConstraints(194, 88, 350, 2));

        filler74.setBackground(new java.awt.Color(255, 255, 255));
        filler74.setOpaque(true);
        PAN4Delete.add(filler74, new org.netbeans.lib.awtextra.AbsoluteConstraints(106, 176, 177, 2));

        filler75.setBackground(new java.awt.Color(255, 255, 255));
        filler75.setOpaque(true);
        PAN4Delete.add(filler75, new org.netbeans.lib.awtextra.AbsoluteConstraints(194, 88, 2, 28));

        filler76.setBackground(new java.awt.Color(255, 255, 255));
        filler76.setOpaque(true);
        PAN4Delete.add(filler76, new org.netbeans.lib.awtextra.AbsoluteConstraints(544, 88, 2, 28));

        filler77.setBackground(new java.awt.Color(255, 255, 255));
        filler77.setOpaque(true);
        PAN4Delete.add(filler77, new org.netbeans.lib.awtextra.AbsoluteConstraints(281, 178, 2, 26));

        filler78.setBackground(new java.awt.Color(255, 255, 255));
        filler78.setOpaque(true);
        PAN4Delete.add(filler78, new org.netbeans.lib.awtextra.AbsoluteConstraints(106, 178, 2, 26));

        filler79.setBackground(new java.awt.Color(255, 255, 255));
        filler79.setOpaque(true);
        PAN4Delete.add(filler79, new org.netbeans.lib.awtextra.AbsoluteConstraints(369, 68, 2, 20));

        filler80.setBackground(new java.awt.Color(255, 255, 255));
        filler80.setOpaque(true);
        PAN4Delete.add(filler80, new org.netbeans.lib.awtextra.AbsoluteConstraints(457, 176, 89, 2));

        filler81.setBackground(new java.awt.Color(255, 255, 255));
        filler81.setOpaque(true);
        PAN4Delete.add(filler81, new org.netbeans.lib.awtextra.AbsoluteConstraints(194, 156, 2, 20));

        filler82.setBackground(new java.awt.Color(255, 255, 255));
        filler82.setOpaque(true);
        PAN4Delete.add(filler82, new org.netbeans.lib.awtextra.AbsoluteConstraints(457, 178, 2, 26));

        filler84.setBackground(new java.awt.Color(255, 255, 255));
        filler84.setOpaque(true);
        PAN4Delete.add(filler84, new org.netbeans.lib.awtextra.AbsoluteConstraints(544, 156, 2, 20));

        jLabel64.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel64.setForeground(new java.awt.Color(255, 255, 255));
        jLabel64.setText("A0");
        PAN4Delete.add(jLabel64, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 38, 20, 20));

        jLabel66.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel66.setForeground(new java.awt.Color(255, 255, 255));
        jLabel66.setText("A1");
        PAN4Delete.add(jLabel66, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 126, 20, 20));

        jLabel67.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel67.setForeground(new java.awt.Color(255, 255, 255));
        jLabel67.setText("A2");
        PAN4Delete.add(jLabel67, new org.netbeans.lib.awtextra.AbsoluteConstraints(505, 126, 20, 20));

        jLabel68.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel68.setForeground(new java.awt.Color(255, 255, 255));
        jLabel68.setText("A3");
        PAN4Delete.add(jLabel68, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 214, 20, 20));

        jLabel69.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel69.setForeground(new java.awt.Color(255, 255, 255));
        jLabel69.setText("A4");
        PAN4Delete.add(jLabel69, new org.netbeans.lib.awtextra.AbsoluteConstraints(242, 214, 20, 20));

        jLabel70.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel70.setForeground(new java.awt.Color(255, 255, 255));
        jLabel70.setText("A5");
        PAN4Delete.add(jLabel70, new org.netbeans.lib.awtextra.AbsoluteConstraints(418, 214, 20, 20));

        jLabel139.setBackground(new java.awt.Color(0, 0, 0));
        jLabel139.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel139.setForeground(new java.awt.Color(255, 255, 255));
        jLabel139.setText("        Swap A0 <-> A5");
        jLabel139.setOpaque(true);
        PAN4Delete.add(jLabel139, new org.netbeans.lib.awtextra.AbsoluteConstraints(285, 116, 170, 20));

        jPanel1.add(PAN4Delete, "card2");

        PANPAGE4.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 700, 300));

        jPanel30.add(PANPAGE4, "card2");

        PANPAGE5.setBackground(new java.awt.Color(0, 0, 0));
        PANPAGE5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setLayout(new java.awt.CardLayout());

        PAN5SW.setBackground(new java.awt.Color(0, 0, 0));
        PAN5SW.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SW1_5.setBackground(new java.awt.Color(0, 0, 102));
        SW1_5.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        SW1_5.setForeground(new java.awt.Color(255, 255, 255));
        SW1_5.setText("W1_5");
        SW1_5.setOpaque(true);
        PAN5SW.add(SW1_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 28, 40, 40));

        SW2_5.setBackground(new java.awt.Color(0, 0, 102));
        SW2_5.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        SW2_5.setForeground(new java.awt.Color(255, 255, 255));
        SW2_5.setText("W2_5");
        SW2_5.setOpaque(true);
        PAN5SW.add(SW2_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 116, 40, 40));

        SW3_5.setBackground(new java.awt.Color(0, 0, 102));
        SW3_5.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        SW3_5.setForeground(new java.awt.Color(255, 255, 255));
        SW3_5.setText("W3_5");
        SW3_5.setOpaque(true);
        PAN5SW.add(SW3_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(525, 116, 40, 40));

        SW4_5.setBackground(new java.awt.Color(0, 0, 102));
        SW4_5.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        SW4_5.setForeground(new java.awt.Color(255, 255, 255));
        SW4_5.setText("W4_5");
        SW4_5.setOpaque(true);
        PAN5SW.add(SW4_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 204, 40, 40));

        SW5_5.setBackground(new java.awt.Color(0, 0, 102));
        SW5_5.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        SW5_5.setForeground(new java.awt.Color(255, 255, 255));
        SW5_5.setText("W5_5");
        SW5_5.setOpaque(true);
        PAN5SW.add(SW5_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(262, 204, 40, 40));

        SW6_5.setBackground(new java.awt.Color(0, 0, 102));
        SW6_5.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        SW6_5.setForeground(new java.awt.Color(255, 255, 255));
        SW6_5.setText("W6_5");
        SW6_5.setOpaque(true);
        PAN5SW.add(SW6_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(438, 204, 40, 40));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 0, 0));
        jLabel7.setText("5-1");
        PAN5SW.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 40));

        filler85.setBackground(new java.awt.Color(255, 255, 255));
        filler85.setOpaque(true);
        PAN5SW.add(filler85, new org.netbeans.lib.awtextra.AbsoluteConstraints(194, 88, 350, 2));

        filler86.setBackground(new java.awt.Color(255, 255, 255));
        filler86.setOpaque(true);
        PAN5SW.add(filler86, new org.netbeans.lib.awtextra.AbsoluteConstraints(106, 176, 177, 2));

        filler87.setBackground(new java.awt.Color(255, 255, 255));
        filler87.setOpaque(true);
        PAN5SW.add(filler87, new org.netbeans.lib.awtextra.AbsoluteConstraints(194, 88, 2, 28));

        filler88.setBackground(new java.awt.Color(255, 255, 255));
        filler88.setOpaque(true);
        PAN5SW.add(filler88, new org.netbeans.lib.awtextra.AbsoluteConstraints(544, 88, 2, 28));

        filler89.setBackground(new java.awt.Color(255, 255, 255));
        filler89.setOpaque(true);
        PAN5SW.add(filler89, new org.netbeans.lib.awtextra.AbsoluteConstraints(281, 178, 2, 26));

        filler90.setBackground(new java.awt.Color(255, 255, 255));
        filler90.setOpaque(true);
        PAN5SW.add(filler90, new org.netbeans.lib.awtextra.AbsoluteConstraints(106, 178, 2, 26));

        filler91.setBackground(new java.awt.Color(255, 255, 255));
        filler91.setOpaque(true);
        PAN5SW.add(filler91, new org.netbeans.lib.awtextra.AbsoluteConstraints(369, 68, 2, 20));

        filler92.setBackground(new java.awt.Color(255, 255, 255));
        filler92.setOpaque(true);
        PAN5SW.add(filler92, new org.netbeans.lib.awtextra.AbsoluteConstraints(457, 176, 89, 2));

        filler93.setBackground(new java.awt.Color(255, 255, 255));
        filler93.setOpaque(true);
        PAN5SW.add(filler93, new org.netbeans.lib.awtextra.AbsoluteConstraints(194, 156, 2, 20));

        filler94.setBackground(new java.awt.Color(255, 255, 255));
        filler94.setOpaque(true);
        PAN5SW.add(filler94, new org.netbeans.lib.awtextra.AbsoluteConstraints(457, 178, 2, 26));

        filler96.setBackground(new java.awt.Color(255, 255, 255));
        filler96.setOpaque(true);
        PAN5SW.add(filler96, new org.netbeans.lib.awtextra.AbsoluteConstraints(544, 156, 2, 20));

        jLabel65.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel65.setForeground(new java.awt.Color(255, 255, 255));
        jLabel65.setText("A0");
        PAN5SW.add(jLabel65, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 38, 20, 20));

        jLabel72.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel72.setForeground(new java.awt.Color(255, 255, 255));
        jLabel72.setText("A1");
        PAN5SW.add(jLabel72, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 126, 20, 20));

        jLabel73.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel73.setForeground(new java.awt.Color(255, 255, 255));
        jLabel73.setText("A2");
        PAN5SW.add(jLabel73, new org.netbeans.lib.awtextra.AbsoluteConstraints(505, 126, 20, 20));

        jLabel74.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel74.setForeground(new java.awt.Color(255, 255, 255));
        jLabel74.setText("A3");
        PAN5SW.add(jLabel74, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 214, 20, 20));

        jLabel75.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel75.setForeground(new java.awt.Color(255, 255, 255));
        jLabel75.setText("A4");
        PAN5SW.add(jLabel75, new org.netbeans.lib.awtextra.AbsoluteConstraints(242, 214, 20, 20));

        jLabel76.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel76.setForeground(new java.awt.Color(255, 255, 255));
        jLabel76.setText("A5");
        PAN5SW.add(jLabel76, new org.netbeans.lib.awtextra.AbsoluteConstraints(418, 214, 20, 20));

        jLabel128.setBackground(new java.awt.Color(0, 0, 0));
        jLabel128.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel128.setForeground(new java.awt.Color(255, 255, 255));
        jLabel128.setText("  Đưa phần còn lại về Heap");
        jLabel128.setOpaque(true);
        PAN5SW.add(jLabel128, new org.netbeans.lib.awtextra.AbsoluteConstraints(285, 116, 170, 20));

        jPanel2.add(PAN5SW, "card2");

        PAN5ShiftDown.setBackground(new java.awt.Color(0, 0, 0));
        PAN5ShiftDown.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SD1_5.setBackground(new java.awt.Color(0, 0, 102));
        SD1_5.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        SD1_5.setForeground(new java.awt.Color(255, 255, 255));
        SD1_5.setText("S1_5");
        SD1_5.setOpaque(true);
        PAN5ShiftDown.add(SD1_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 28, 40, 40));

        SD2_5.setBackground(new java.awt.Color(0, 0, 102));
        SD2_5.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        SD2_5.setForeground(new java.awt.Color(255, 255, 255));
        SD2_5.setText("S2_5");
        SD2_5.setOpaque(true);
        PAN5ShiftDown.add(SD2_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 116, 40, 40));

        SD3_5.setBackground(new java.awt.Color(0, 0, 102));
        SD3_5.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        SD3_5.setForeground(new java.awt.Color(255, 255, 255));
        SD3_5.setText("S3_5");
        SD3_5.setOpaque(true);
        PAN5ShiftDown.add(SD3_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(525, 116, 40, 40));

        SD4_5.setBackground(new java.awt.Color(0, 0, 102));
        SD4_5.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        SD4_5.setForeground(new java.awt.Color(255, 255, 255));
        SD4_5.setText("S4_5");
        SD4_5.setOpaque(true);
        PAN5ShiftDown.add(SD4_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 204, 40, 40));

        SD5_5.setBackground(new java.awt.Color(0, 0, 102));
        SD5_5.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        SD5_5.setForeground(new java.awt.Color(255, 255, 255));
        SD5_5.setText("S5_5");
        SD5_5.setOpaque(true);
        PAN5ShiftDown.add(SD5_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(262, 204, 40, 40));

        SD6_5.setBackground(new java.awt.Color(0, 0, 102));
        SD6_5.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        SD6_5.setForeground(new java.awt.Color(255, 255, 255));
        SD6_5.setText("S6_5");
        SD6_5.setOpaque(true);
        PAN5ShiftDown.add(SD6_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(438, 204, 40, 40));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 0, 0));
        jLabel8.setText("5-2");
        PAN5ShiftDown.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 40));

        filler97.setBackground(new java.awt.Color(255, 255, 255));
        filler97.setOpaque(true);
        PAN5ShiftDown.add(filler97, new org.netbeans.lib.awtextra.AbsoluteConstraints(194, 88, 350, 2));

        filler98.setBackground(new java.awt.Color(255, 255, 255));
        filler98.setOpaque(true);
        PAN5ShiftDown.add(filler98, new org.netbeans.lib.awtextra.AbsoluteConstraints(106, 176, 177, 2));

        filler99.setBackground(new java.awt.Color(255, 255, 255));
        filler99.setOpaque(true);
        PAN5ShiftDown.add(filler99, new org.netbeans.lib.awtextra.AbsoluteConstraints(194, 88, 2, 28));

        filler100.setBackground(new java.awt.Color(255, 255, 255));
        filler100.setOpaque(true);
        PAN5ShiftDown.add(filler100, new org.netbeans.lib.awtextra.AbsoluteConstraints(544, 88, 2, 28));

        filler101.setBackground(new java.awt.Color(255, 255, 255));
        filler101.setOpaque(true);
        PAN5ShiftDown.add(filler101, new org.netbeans.lib.awtextra.AbsoluteConstraints(281, 178, 2, 26));

        filler102.setBackground(new java.awt.Color(255, 255, 255));
        filler102.setOpaque(true);
        PAN5ShiftDown.add(filler102, new org.netbeans.lib.awtextra.AbsoluteConstraints(106, 178, 2, 26));

        filler103.setBackground(new java.awt.Color(255, 255, 255));
        filler103.setOpaque(true);
        PAN5ShiftDown.add(filler103, new org.netbeans.lib.awtextra.AbsoluteConstraints(369, 68, 2, 20));

        filler104.setBackground(new java.awt.Color(255, 255, 255));
        filler104.setOpaque(true);
        PAN5ShiftDown.add(filler104, new org.netbeans.lib.awtextra.AbsoluteConstraints(457, 176, 89, 2));

        filler105.setBackground(new java.awt.Color(255, 255, 255));
        filler105.setOpaque(true);
        PAN5ShiftDown.add(filler105, new org.netbeans.lib.awtextra.AbsoluteConstraints(194, 156, 2, 20));

        filler106.setBackground(new java.awt.Color(255, 255, 255));
        filler106.setOpaque(true);
        PAN5ShiftDown.add(filler106, new org.netbeans.lib.awtextra.AbsoluteConstraints(457, 178, 2, 26));

        filler108.setBackground(new java.awt.Color(255, 255, 255));
        filler108.setOpaque(true);
        PAN5ShiftDown.add(filler108, new org.netbeans.lib.awtextra.AbsoluteConstraints(544, 156, 2, 20));

        jLabel71.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel71.setForeground(new java.awt.Color(255, 255, 255));
        jLabel71.setText("A0");
        PAN5ShiftDown.add(jLabel71, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 38, 20, 20));

        jLabel78.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel78.setForeground(new java.awt.Color(255, 255, 255));
        jLabel78.setText("A1");
        PAN5ShiftDown.add(jLabel78, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 126, 20, 20));

        jLabel79.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel79.setForeground(new java.awt.Color(255, 255, 255));
        jLabel79.setText("A2");
        PAN5ShiftDown.add(jLabel79, new org.netbeans.lib.awtextra.AbsoluteConstraints(505, 126, 20, 20));

        jLabel80.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel80.setForeground(new java.awt.Color(255, 255, 255));
        jLabel80.setText("A3");
        PAN5ShiftDown.add(jLabel80, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 214, 20, 20));

        jLabel81.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel81.setForeground(new java.awt.Color(255, 255, 255));
        jLabel81.setText("A4");
        PAN5ShiftDown.add(jLabel81, new org.netbeans.lib.awtextra.AbsoluteConstraints(242, 214, 20, 20));

        jLabel82.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel82.setForeground(new java.awt.Color(255, 255, 255));
        jLabel82.setText("A5");
        PAN5ShiftDown.add(jLabel82, new org.netbeans.lib.awtextra.AbsoluteConstraints(418, 214, 20, 20));

        jLabel134.setBackground(new java.awt.Color(0, 0, 0));
        jLabel134.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel134.setForeground(new java.awt.Color(255, 255, 255));
        jLabel134.setText("            Xóa Node A5");
        jLabel134.setOpaque(true);
        PAN5ShiftDown.add(jLabel134, new org.netbeans.lib.awtextra.AbsoluteConstraints(285, 116, 170, 20));

        jPanel2.add(PAN5ShiftDown, "card2");

        PAN5Delete.setBackground(new java.awt.Color(0, 0, 0));
        PAN5Delete.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        D1_5.setBackground(new java.awt.Color(0, 0, 102));
        D1_5.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        D1_5.setForeground(new java.awt.Color(255, 255, 255));
        D1_5.setText("D1_5");
        D1_5.setOpaque(true);
        PAN5Delete.add(D1_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 28, 40, 40));

        D2_5.setBackground(new java.awt.Color(0, 0, 102));
        D2_5.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        D2_5.setForeground(new java.awt.Color(255, 255, 255));
        D2_5.setText("D2_5");
        D2_5.setOpaque(true);
        PAN5Delete.add(D2_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 116, 40, 40));

        D3_5.setBackground(new java.awt.Color(0, 0, 102));
        D3_5.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        D3_5.setForeground(new java.awt.Color(255, 255, 255));
        D3_5.setText("D3_5");
        D3_5.setOpaque(true);
        PAN5Delete.add(D3_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(525, 116, 40, 40));

        D4_5.setBackground(new java.awt.Color(0, 0, 102));
        D4_5.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        D4_5.setForeground(new java.awt.Color(255, 255, 255));
        D4_5.setText("D4_5");
        D4_5.setOpaque(true);
        PAN5Delete.add(D4_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 204, 40, 40));

        D5_5.setBackground(new java.awt.Color(0, 0, 102));
        D5_5.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        D5_5.setForeground(new java.awt.Color(255, 255, 255));
        D5_5.setText("D5_5");
        D5_5.setOpaque(true);
        PAN5Delete.add(D5_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(262, 204, 40, 40));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 0, 0));
        jLabel9.setText("5-3");
        PAN5Delete.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 40));

        filler109.setBackground(new java.awt.Color(255, 255, 255));
        filler109.setOpaque(true);
        PAN5Delete.add(filler109, new org.netbeans.lib.awtextra.AbsoluteConstraints(194, 88, 350, 2));

        filler110.setBackground(new java.awt.Color(255, 255, 255));
        filler110.setOpaque(true);
        PAN5Delete.add(filler110, new org.netbeans.lib.awtextra.AbsoluteConstraints(106, 176, 177, 2));

        filler111.setBackground(new java.awt.Color(255, 255, 255));
        filler111.setOpaque(true);
        PAN5Delete.add(filler111, new org.netbeans.lib.awtextra.AbsoluteConstraints(194, 88, 2, 28));

        filler112.setBackground(new java.awt.Color(255, 255, 255));
        filler112.setOpaque(true);
        PAN5Delete.add(filler112, new org.netbeans.lib.awtextra.AbsoluteConstraints(544, 88, 2, 28));

        filler113.setBackground(new java.awt.Color(255, 255, 255));
        filler113.setOpaque(true);
        PAN5Delete.add(filler113, new org.netbeans.lib.awtextra.AbsoluteConstraints(281, 178, 2, 26));

        filler114.setBackground(new java.awt.Color(255, 255, 255));
        filler114.setOpaque(true);
        PAN5Delete.add(filler114, new org.netbeans.lib.awtextra.AbsoluteConstraints(106, 178, 2, 26));

        filler115.setBackground(new java.awt.Color(255, 255, 255));
        filler115.setOpaque(true);
        PAN5Delete.add(filler115, new org.netbeans.lib.awtextra.AbsoluteConstraints(369, 68, 2, 20));

        filler117.setBackground(new java.awt.Color(255, 255, 255));
        filler117.setOpaque(true);
        PAN5Delete.add(filler117, new org.netbeans.lib.awtextra.AbsoluteConstraints(194, 156, 2, 20));

        jLabel77.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel77.setForeground(new java.awt.Color(255, 255, 255));
        jLabel77.setText("A0");
        PAN5Delete.add(jLabel77, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 38, 20, 20));

        jLabel84.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel84.setForeground(new java.awt.Color(255, 255, 255));
        jLabel84.setText("A1");
        PAN5Delete.add(jLabel84, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 126, 20, 20));

        jLabel85.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel85.setForeground(new java.awt.Color(255, 255, 255));
        jLabel85.setText("A2");
        PAN5Delete.add(jLabel85, new org.netbeans.lib.awtextra.AbsoluteConstraints(505, 126, 20, 20));

        jLabel86.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel86.setForeground(new java.awt.Color(255, 255, 255));
        jLabel86.setText("A3");
        PAN5Delete.add(jLabel86, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 214, 20, 20));

        jLabel87.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel87.setForeground(new java.awt.Color(255, 255, 255));
        jLabel87.setText("A4");
        PAN5Delete.add(jLabel87, new org.netbeans.lib.awtextra.AbsoluteConstraints(242, 214, 20, 20));

        jLabel140.setBackground(new java.awt.Color(0, 0, 0));
        jLabel140.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel140.setForeground(new java.awt.Color(255, 255, 255));
        jLabel140.setText("        Swap A0 <-> A4");
        jLabel140.setOpaque(true);
        PAN5Delete.add(jLabel140, new org.netbeans.lib.awtextra.AbsoluteConstraints(285, 116, 170, 20));

        jPanel2.add(PAN5Delete, "card2");

        PANPAGE5.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 700, 300));

        jPanel30.add(PANPAGE5, "card2");

        PANPAGE6.setBackground(new java.awt.Color(0, 0, 0));
        PANPAGE6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setLayout(new java.awt.CardLayout());

        PAN6SW.setBackground(new java.awt.Color(0, 0, 0));
        PAN6SW.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SW1_6.setBackground(new java.awt.Color(0, 0, 102));
        SW1_6.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        SW1_6.setForeground(new java.awt.Color(255, 255, 255));
        SW1_6.setText("W1_6");
        SW1_6.setOpaque(true);
        PAN6SW.add(SW1_6, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 28, 40, 40));

        SW2_6.setBackground(new java.awt.Color(0, 0, 102));
        SW2_6.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        SW2_6.setForeground(new java.awt.Color(255, 255, 255));
        SW2_6.setText("W2_6");
        SW2_6.setOpaque(true);
        PAN6SW.add(SW2_6, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 116, 40, 40));

        SW3_6.setBackground(new java.awt.Color(0, 0, 102));
        SW3_6.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        SW3_6.setForeground(new java.awt.Color(255, 255, 255));
        SW3_6.setText("W3_6");
        SW3_6.setOpaque(true);
        PAN6SW.add(SW3_6, new org.netbeans.lib.awtextra.AbsoluteConstraints(525, 116, 40, 40));

        SW4_6.setBackground(new java.awt.Color(0, 0, 102));
        SW4_6.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        SW4_6.setForeground(new java.awt.Color(255, 255, 255));
        SW4_6.setText("W4_6");
        SW4_6.setOpaque(true);
        PAN6SW.add(SW4_6, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 204, 40, 40));

        SW5_6.setBackground(new java.awt.Color(0, 0, 102));
        SW5_6.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        SW5_6.setForeground(new java.awt.Color(255, 255, 255));
        SW5_6.setText("W5_6");
        SW5_6.setOpaque(true);
        PAN6SW.add(SW5_6, new org.netbeans.lib.awtextra.AbsoluteConstraints(262, 204, 40, 40));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 0, 0));
        jLabel10.setText("6-1");
        PAN6SW.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 40));

        filler121.setBackground(new java.awt.Color(255, 255, 255));
        filler121.setOpaque(true);
        PAN6SW.add(filler121, new org.netbeans.lib.awtextra.AbsoluteConstraints(194, 88, 350, 2));

        filler122.setBackground(new java.awt.Color(255, 255, 255));
        filler122.setOpaque(true);
        PAN6SW.add(filler122, new org.netbeans.lib.awtextra.AbsoluteConstraints(106, 176, 177, 2));

        filler123.setBackground(new java.awt.Color(255, 255, 255));
        filler123.setOpaque(true);
        PAN6SW.add(filler123, new org.netbeans.lib.awtextra.AbsoluteConstraints(194, 88, 2, 28));

        filler124.setBackground(new java.awt.Color(255, 255, 255));
        filler124.setOpaque(true);
        PAN6SW.add(filler124, new org.netbeans.lib.awtextra.AbsoluteConstraints(544, 88, 2, 28));

        filler125.setBackground(new java.awt.Color(255, 255, 255));
        filler125.setOpaque(true);
        PAN6SW.add(filler125, new org.netbeans.lib.awtextra.AbsoluteConstraints(281, 178, 2, 26));

        filler126.setBackground(new java.awt.Color(255, 255, 255));
        filler126.setOpaque(true);
        PAN6SW.add(filler126, new org.netbeans.lib.awtextra.AbsoluteConstraints(106, 178, 2, 26));

        filler127.setBackground(new java.awt.Color(255, 255, 255));
        filler127.setOpaque(true);
        PAN6SW.add(filler127, new org.netbeans.lib.awtextra.AbsoluteConstraints(369, 68, 2, 20));

        filler129.setBackground(new java.awt.Color(255, 255, 255));
        filler129.setOpaque(true);
        PAN6SW.add(filler129, new org.netbeans.lib.awtextra.AbsoluteConstraints(194, 156, 2, 20));

        jLabel83.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel83.setForeground(new java.awt.Color(255, 255, 255));
        jLabel83.setText("A0");
        PAN6SW.add(jLabel83, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 38, 20, 20));

        jLabel89.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel89.setForeground(new java.awt.Color(255, 255, 255));
        jLabel89.setText("A1");
        PAN6SW.add(jLabel89, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 126, 20, 20));

        jLabel90.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel90.setForeground(new java.awt.Color(255, 255, 255));
        jLabel90.setText("A2");
        PAN6SW.add(jLabel90, new org.netbeans.lib.awtextra.AbsoluteConstraints(505, 126, 20, 20));

        jLabel91.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel91.setForeground(new java.awt.Color(255, 255, 255));
        jLabel91.setText("A3");
        PAN6SW.add(jLabel91, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 214, 20, 20));

        jLabel92.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel92.setForeground(new java.awt.Color(255, 255, 255));
        jLabel92.setText("A4");
        PAN6SW.add(jLabel92, new org.netbeans.lib.awtextra.AbsoluteConstraints(242, 214, 20, 20));

        jLabel129.setBackground(new java.awt.Color(0, 0, 0));
        jLabel129.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel129.setForeground(new java.awt.Color(255, 255, 255));
        jLabel129.setText("  Đưa phần còn lại về Heap");
        jLabel129.setOpaque(true);
        PAN6SW.add(jLabel129, new org.netbeans.lib.awtextra.AbsoluteConstraints(285, 116, 170, 20));

        jPanel3.add(PAN6SW, "card2");

        PAN6ShiftDown.setBackground(new java.awt.Color(0, 0, 0));
        PAN6ShiftDown.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SD1_6.setBackground(new java.awt.Color(0, 0, 102));
        SD1_6.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        SD1_6.setForeground(new java.awt.Color(255, 255, 255));
        SD1_6.setText("S1_6");
        SD1_6.setOpaque(true);
        PAN6ShiftDown.add(SD1_6, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 28, 40, 40));

        SD2_6.setBackground(new java.awt.Color(0, 0, 102));
        SD2_6.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        SD2_6.setForeground(new java.awt.Color(255, 255, 255));
        SD2_6.setText("S2_6");
        SD2_6.setOpaque(true);
        PAN6ShiftDown.add(SD2_6, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 116, 40, 40));

        SD3_6.setBackground(new java.awt.Color(0, 0, 102));
        SD3_6.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        SD3_6.setForeground(new java.awt.Color(255, 255, 255));
        SD3_6.setText("S3_6");
        SD3_6.setOpaque(true);
        PAN6ShiftDown.add(SD3_6, new org.netbeans.lib.awtextra.AbsoluteConstraints(525, 116, 40, 40));

        SD4_6.setBackground(new java.awt.Color(0, 0, 102));
        SD4_6.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        SD4_6.setForeground(new java.awt.Color(255, 255, 255));
        SD4_6.setText("S4_6");
        SD4_6.setOpaque(true);
        PAN6ShiftDown.add(SD4_6, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 204, 40, 40));

        SD5_6.setBackground(new java.awt.Color(0, 0, 102));
        SD5_6.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        SD5_6.setForeground(new java.awt.Color(255, 255, 255));
        SD5_6.setText("S5_6");
        SD5_6.setOpaque(true);
        PAN6ShiftDown.add(SD5_6, new org.netbeans.lib.awtextra.AbsoluteConstraints(262, 204, 40, 40));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 0, 0));
        jLabel11.setText("6-2");
        PAN6ShiftDown.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 40));

        filler133.setBackground(new java.awt.Color(255, 255, 255));
        filler133.setOpaque(true);
        PAN6ShiftDown.add(filler133, new org.netbeans.lib.awtextra.AbsoluteConstraints(194, 88, 350, 2));

        filler134.setBackground(new java.awt.Color(255, 255, 255));
        filler134.setOpaque(true);
        PAN6ShiftDown.add(filler134, new org.netbeans.lib.awtextra.AbsoluteConstraints(106, 176, 177, 2));

        filler135.setBackground(new java.awt.Color(255, 255, 255));
        filler135.setOpaque(true);
        PAN6ShiftDown.add(filler135, new org.netbeans.lib.awtextra.AbsoluteConstraints(194, 88, 2, 28));

        filler136.setBackground(new java.awt.Color(255, 255, 255));
        filler136.setOpaque(true);
        PAN6ShiftDown.add(filler136, new org.netbeans.lib.awtextra.AbsoluteConstraints(544, 88, 2, 28));

        filler137.setBackground(new java.awt.Color(255, 255, 255));
        filler137.setOpaque(true);
        PAN6ShiftDown.add(filler137, new org.netbeans.lib.awtextra.AbsoluteConstraints(281, 178, 2, 26));

        filler138.setBackground(new java.awt.Color(255, 255, 255));
        filler138.setOpaque(true);
        PAN6ShiftDown.add(filler138, new org.netbeans.lib.awtextra.AbsoluteConstraints(106, 178, 2, 26));

        filler139.setBackground(new java.awt.Color(255, 255, 255));
        filler139.setOpaque(true);
        PAN6ShiftDown.add(filler139, new org.netbeans.lib.awtextra.AbsoluteConstraints(369, 68, 2, 20));

        filler141.setBackground(new java.awt.Color(255, 255, 255));
        filler141.setOpaque(true);
        PAN6ShiftDown.add(filler141, new org.netbeans.lib.awtextra.AbsoluteConstraints(194, 156, 2, 20));

        jLabel88.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel88.setForeground(new java.awt.Color(255, 255, 255));
        jLabel88.setText("A0");
        PAN6ShiftDown.add(jLabel88, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 38, 20, 20));

        jLabel94.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel94.setForeground(new java.awt.Color(255, 255, 255));
        jLabel94.setText("A1");
        PAN6ShiftDown.add(jLabel94, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 126, 20, 20));

        jLabel95.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel95.setForeground(new java.awt.Color(255, 255, 255));
        jLabel95.setText("A2");
        PAN6ShiftDown.add(jLabel95, new org.netbeans.lib.awtextra.AbsoluteConstraints(505, 126, 20, 20));

        jLabel96.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel96.setForeground(new java.awt.Color(255, 255, 255));
        jLabel96.setText("A3");
        PAN6ShiftDown.add(jLabel96, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 214, 20, 20));

        jLabel97.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel97.setForeground(new java.awt.Color(255, 255, 255));
        jLabel97.setText("A4");
        PAN6ShiftDown.add(jLabel97, new org.netbeans.lib.awtextra.AbsoluteConstraints(242, 214, 20, 20));

        jLabel135.setBackground(new java.awt.Color(0, 0, 0));
        jLabel135.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel135.setForeground(new java.awt.Color(255, 255, 255));
        jLabel135.setText("            Xóa Node A4");
        jLabel135.setOpaque(true);
        PAN6ShiftDown.add(jLabel135, new org.netbeans.lib.awtextra.AbsoluteConstraints(285, 116, 170, 20));

        jPanel3.add(PAN6ShiftDown, "card2");

        PAN6Delete.setBackground(new java.awt.Color(0, 0, 0));
        PAN6Delete.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        D1_6.setBackground(new java.awt.Color(0, 0, 102));
        D1_6.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        D1_6.setForeground(new java.awt.Color(255, 255, 255));
        D1_6.setText("D1_6");
        D1_6.setOpaque(true);
        PAN6Delete.add(D1_6, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 28, 40, 40));

        D2_6.setBackground(new java.awt.Color(0, 0, 102));
        D2_6.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        D2_6.setForeground(new java.awt.Color(255, 255, 255));
        D2_6.setText("D2_6");
        D2_6.setOpaque(true);
        PAN6Delete.add(D2_6, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 116, 40, 40));

        D3_6.setBackground(new java.awt.Color(0, 0, 102));
        D3_6.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        D3_6.setForeground(new java.awt.Color(255, 255, 255));
        D3_6.setText("D3_6");
        D3_6.setOpaque(true);
        PAN6Delete.add(D3_6, new org.netbeans.lib.awtextra.AbsoluteConstraints(525, 116, 40, 40));

        D4_6.setBackground(new java.awt.Color(0, 0, 102));
        D4_6.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        D4_6.setForeground(new java.awt.Color(255, 255, 255));
        D4_6.setText("D4_6");
        D4_6.setOpaque(true);
        PAN6Delete.add(D4_6, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 204, 40, 40));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 0, 0));
        jLabel12.setText("6-3");
        PAN6Delete.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 40));

        filler145.setBackground(new java.awt.Color(255, 255, 255));
        filler145.setOpaque(true);
        PAN6Delete.add(filler145, new org.netbeans.lib.awtextra.AbsoluteConstraints(194, 88, 350, 2));

        filler146.setBackground(new java.awt.Color(255, 255, 255));
        filler146.setOpaque(true);
        PAN6Delete.add(filler146, new org.netbeans.lib.awtextra.AbsoluteConstraints(106, 176, 90, 2));

        filler147.setBackground(new java.awt.Color(255, 255, 255));
        filler147.setOpaque(true);
        PAN6Delete.add(filler147, new org.netbeans.lib.awtextra.AbsoluteConstraints(194, 88, 2, 28));

        filler148.setBackground(new java.awt.Color(255, 255, 255));
        filler148.setOpaque(true);
        PAN6Delete.add(filler148, new org.netbeans.lib.awtextra.AbsoluteConstraints(544, 88, 2, 28));

        filler150.setBackground(new java.awt.Color(255, 255, 255));
        filler150.setOpaque(true);
        PAN6Delete.add(filler150, new org.netbeans.lib.awtextra.AbsoluteConstraints(106, 178, 2, 26));

        filler151.setBackground(new java.awt.Color(255, 255, 255));
        filler151.setOpaque(true);
        PAN6Delete.add(filler151, new org.netbeans.lib.awtextra.AbsoluteConstraints(369, 68, 2, 20));

        filler153.setBackground(new java.awt.Color(255, 255, 255));
        filler153.setOpaque(true);
        PAN6Delete.add(filler153, new org.netbeans.lib.awtextra.AbsoluteConstraints(194, 156, 2, 20));

        jLabel93.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel93.setForeground(new java.awt.Color(255, 255, 255));
        jLabel93.setText("A0");
        PAN6Delete.add(jLabel93, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 38, 20, 20));

        jLabel99.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel99.setForeground(new java.awt.Color(255, 255, 255));
        jLabel99.setText("A1");
        PAN6Delete.add(jLabel99, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 126, 20, 20));

        jLabel100.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel100.setForeground(new java.awt.Color(255, 255, 255));
        jLabel100.setText("A2");
        PAN6Delete.add(jLabel100, new org.netbeans.lib.awtextra.AbsoluteConstraints(505, 126, 20, 20));

        jLabel101.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel101.setForeground(new java.awt.Color(255, 255, 255));
        jLabel101.setText("A3");
        PAN6Delete.add(jLabel101, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 214, 20, 20));

        jLabel141.setBackground(new java.awt.Color(0, 0, 0));
        jLabel141.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel141.setForeground(new java.awt.Color(255, 255, 255));
        jLabel141.setText("        Swap A0 <-> A3");
        jLabel141.setOpaque(true);
        PAN6Delete.add(jLabel141, new org.netbeans.lib.awtextra.AbsoluteConstraints(285, 116, 170, 20));

        jPanel3.add(PAN6Delete, "card2");

        PANPAGE6.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 700, 300));

        jPanel30.add(PANPAGE6, "card2");

        PANPAGE7.setBackground(new java.awt.Color(0, 0, 0));
        PANPAGE7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setLayout(new java.awt.CardLayout());

        PAN7SW.setBackground(new java.awt.Color(0, 0, 0));
        PAN7SW.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SW1_7.setBackground(new java.awt.Color(0, 0, 102));
        SW1_7.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        SW1_7.setForeground(new java.awt.Color(255, 255, 255));
        SW1_7.setText("W1_7");
        SW1_7.setOpaque(true);
        PAN7SW.add(SW1_7, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 28, 40, 40));

        SW2_7.setBackground(new java.awt.Color(0, 0, 102));
        SW2_7.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        SW2_7.setForeground(new java.awt.Color(255, 255, 255));
        SW2_7.setText("W2_7");
        SW2_7.setOpaque(true);
        PAN7SW.add(SW2_7, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 116, 40, 40));

        SW3_7.setBackground(new java.awt.Color(0, 0, 102));
        SW3_7.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        SW3_7.setForeground(new java.awt.Color(255, 255, 255));
        SW3_7.setText("W3_7");
        SW3_7.setOpaque(true);
        PAN7SW.add(SW3_7, new org.netbeans.lib.awtextra.AbsoluteConstraints(525, 116, 40, 40));

        SW4_7.setBackground(new java.awt.Color(0, 0, 102));
        SW4_7.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        SW4_7.setForeground(new java.awt.Color(255, 255, 255));
        SW4_7.setText("W4_7");
        SW4_7.setOpaque(true);
        PAN7SW.add(SW4_7, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 204, 40, 40));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 0, 0));
        jLabel13.setText("7-1");
        PAN7SW.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 40));

        filler157.setBackground(new java.awt.Color(255, 255, 255));
        filler157.setOpaque(true);
        PAN7SW.add(filler157, new org.netbeans.lib.awtextra.AbsoluteConstraints(194, 88, 350, 2));

        filler158.setBackground(new java.awt.Color(255, 255, 255));
        filler158.setOpaque(true);
        PAN7SW.add(filler158, new org.netbeans.lib.awtextra.AbsoluteConstraints(106, 176, 90, 2));

        filler159.setBackground(new java.awt.Color(255, 255, 255));
        filler159.setOpaque(true);
        PAN7SW.add(filler159, new org.netbeans.lib.awtextra.AbsoluteConstraints(194, 88, 2, 28));

        filler160.setBackground(new java.awt.Color(255, 255, 255));
        filler160.setOpaque(true);
        PAN7SW.add(filler160, new org.netbeans.lib.awtextra.AbsoluteConstraints(544, 88, 2, 28));

        filler162.setBackground(new java.awt.Color(255, 255, 255));
        filler162.setOpaque(true);
        PAN7SW.add(filler162, new org.netbeans.lib.awtextra.AbsoluteConstraints(106, 178, 2, 26));

        filler163.setBackground(new java.awt.Color(255, 255, 255));
        filler163.setOpaque(true);
        PAN7SW.add(filler163, new org.netbeans.lib.awtextra.AbsoluteConstraints(369, 68, 2, 20));

        filler165.setBackground(new java.awt.Color(255, 255, 255));
        filler165.setOpaque(true);
        PAN7SW.add(filler165, new org.netbeans.lib.awtextra.AbsoluteConstraints(194, 156, 2, 20));

        jLabel98.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel98.setForeground(new java.awt.Color(255, 255, 255));
        jLabel98.setText("A0");
        PAN7SW.add(jLabel98, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 38, 20, 20));

        jLabel103.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel103.setForeground(new java.awt.Color(255, 255, 255));
        jLabel103.setText("A1");
        PAN7SW.add(jLabel103, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 126, 20, 20));

        jLabel104.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel104.setForeground(new java.awt.Color(255, 255, 255));
        jLabel104.setText("A2");
        PAN7SW.add(jLabel104, new org.netbeans.lib.awtextra.AbsoluteConstraints(505, 126, 20, 20));

        jLabel105.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel105.setForeground(new java.awt.Color(255, 255, 255));
        jLabel105.setText("A3");
        PAN7SW.add(jLabel105, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 214, 20, 20));

        jLabel130.setBackground(new java.awt.Color(0, 0, 0));
        jLabel130.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel130.setForeground(new java.awt.Color(255, 255, 255));
        jLabel130.setText("  Đưa phần còn lại về Heap");
        jLabel130.setOpaque(true);
        PAN7SW.add(jLabel130, new org.netbeans.lib.awtextra.AbsoluteConstraints(285, 116, 170, 20));

        jPanel4.add(PAN7SW, "card2");

        PAN7ShiftDown.setBackground(new java.awt.Color(0, 0, 0));
        PAN7ShiftDown.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SD1_7.setBackground(new java.awt.Color(0, 0, 102));
        SD1_7.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        SD1_7.setForeground(new java.awt.Color(255, 255, 255));
        SD1_7.setText("S1_7");
        SD1_7.setOpaque(true);
        PAN7ShiftDown.add(SD1_7, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 28, 40, 40));

        SD2_7.setBackground(new java.awt.Color(0, 0, 102));
        SD2_7.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        SD2_7.setForeground(new java.awt.Color(255, 255, 255));
        SD2_7.setText("S2_7");
        SD2_7.setOpaque(true);
        PAN7ShiftDown.add(SD2_7, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 116, 40, 40));

        SD3_7.setBackground(new java.awt.Color(0, 0, 102));
        SD3_7.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        SD3_7.setForeground(new java.awt.Color(255, 255, 255));
        SD3_7.setText("S3_7");
        SD3_7.setOpaque(true);
        PAN7ShiftDown.add(SD3_7, new org.netbeans.lib.awtextra.AbsoluteConstraints(525, 116, 40, 40));

        SD4_7.setBackground(new java.awt.Color(0, 0, 102));
        SD4_7.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        SD4_7.setForeground(new java.awt.Color(255, 255, 255));
        SD4_7.setText("S4_7");
        SD4_7.setOpaque(true);
        PAN7ShiftDown.add(SD4_7, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 204, 40, 40));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 0, 0));
        jLabel14.setText("7-2");
        PAN7ShiftDown.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 40));

        filler169.setBackground(new java.awt.Color(255, 255, 255));
        filler169.setOpaque(true);
        PAN7ShiftDown.add(filler169, new org.netbeans.lib.awtextra.AbsoluteConstraints(194, 88, 350, 2));

        filler170.setBackground(new java.awt.Color(255, 255, 255));
        filler170.setOpaque(true);
        PAN7ShiftDown.add(filler170, new org.netbeans.lib.awtextra.AbsoluteConstraints(106, 176, 90, 2));

        filler171.setBackground(new java.awt.Color(255, 255, 255));
        filler171.setOpaque(true);
        PAN7ShiftDown.add(filler171, new org.netbeans.lib.awtextra.AbsoluteConstraints(194, 88, 2, 28));

        filler172.setBackground(new java.awt.Color(255, 255, 255));
        filler172.setOpaque(true);
        PAN7ShiftDown.add(filler172, new org.netbeans.lib.awtextra.AbsoluteConstraints(544, 88, 2, 28));

        filler174.setBackground(new java.awt.Color(255, 255, 255));
        filler174.setOpaque(true);
        PAN7ShiftDown.add(filler174, new org.netbeans.lib.awtextra.AbsoluteConstraints(106, 178, 2, 26));

        filler175.setBackground(new java.awt.Color(255, 255, 255));
        filler175.setOpaque(true);
        PAN7ShiftDown.add(filler175, new org.netbeans.lib.awtextra.AbsoluteConstraints(369, 68, 2, 20));

        filler177.setBackground(new java.awt.Color(255, 255, 255));
        filler177.setOpaque(true);
        PAN7ShiftDown.add(filler177, new org.netbeans.lib.awtextra.AbsoluteConstraints(194, 156, 2, 20));

        jLabel102.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel102.setForeground(new java.awt.Color(255, 255, 255));
        jLabel102.setText("A0");
        PAN7ShiftDown.add(jLabel102, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 38, 20, 20));

        jLabel107.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel107.setForeground(new java.awt.Color(255, 255, 255));
        jLabel107.setText("A1");
        PAN7ShiftDown.add(jLabel107, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 126, 20, 20));

        jLabel108.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel108.setForeground(new java.awt.Color(255, 255, 255));
        jLabel108.setText("A2");
        PAN7ShiftDown.add(jLabel108, new org.netbeans.lib.awtextra.AbsoluteConstraints(505, 126, 20, 20));

        jLabel109.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel109.setForeground(new java.awt.Color(255, 255, 255));
        jLabel109.setText("A3");
        PAN7ShiftDown.add(jLabel109, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 214, 20, 20));

        jLabel136.setBackground(new java.awt.Color(0, 0, 0));
        jLabel136.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel136.setForeground(new java.awt.Color(255, 255, 255));
        jLabel136.setText("            Xóa Node A3");
        jLabel136.setOpaque(true);
        PAN7ShiftDown.add(jLabel136, new org.netbeans.lib.awtextra.AbsoluteConstraints(285, 116, 170, 20));

        jPanel4.add(PAN7ShiftDown, "card2");

        PAN7Delete.setBackground(new java.awt.Color(0, 0, 0));
        PAN7Delete.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        D1_7.setBackground(new java.awt.Color(0, 0, 102));
        D1_7.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        D1_7.setForeground(new java.awt.Color(255, 255, 255));
        D1_7.setText("D1_7");
        D1_7.setOpaque(true);
        PAN7Delete.add(D1_7, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 28, 40, 40));

        D2_7.setBackground(new java.awt.Color(0, 0, 102));
        D2_7.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        D2_7.setForeground(new java.awt.Color(255, 255, 255));
        D2_7.setText("D2_7");
        D2_7.setOpaque(true);
        PAN7Delete.add(D2_7, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 116, 40, 40));

        D3_7.setBackground(new java.awt.Color(0, 0, 102));
        D3_7.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        D3_7.setForeground(new java.awt.Color(255, 255, 255));
        D3_7.setText("D3_7");
        D3_7.setOpaque(true);
        PAN7Delete.add(D3_7, new org.netbeans.lib.awtextra.AbsoluteConstraints(525, 116, 40, 40));

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 0, 0));
        jLabel15.setText("7-3");
        PAN7Delete.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 40));

        filler181.setBackground(new java.awt.Color(255, 255, 255));
        filler181.setOpaque(true);
        PAN7Delete.add(filler181, new org.netbeans.lib.awtextra.AbsoluteConstraints(194, 88, 350, 2));

        filler183.setBackground(new java.awt.Color(255, 255, 255));
        filler183.setOpaque(true);
        PAN7Delete.add(filler183, new org.netbeans.lib.awtextra.AbsoluteConstraints(194, 88, 2, 28));

        filler184.setBackground(new java.awt.Color(255, 255, 255));
        filler184.setOpaque(true);
        PAN7Delete.add(filler184, new org.netbeans.lib.awtextra.AbsoluteConstraints(544, 88, 2, 28));

        filler187.setBackground(new java.awt.Color(255, 255, 255));
        filler187.setOpaque(true);
        PAN7Delete.add(filler187, new org.netbeans.lib.awtextra.AbsoluteConstraints(369, 68, 2, 20));

        jLabel106.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel106.setForeground(new java.awt.Color(255, 255, 255));
        jLabel106.setText("A0");
        PAN7Delete.add(jLabel106, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 38, 20, 20));

        jLabel111.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel111.setForeground(new java.awt.Color(255, 255, 255));
        jLabel111.setText("A1");
        PAN7Delete.add(jLabel111, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 126, 20, 20));

        jLabel112.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel112.setForeground(new java.awt.Color(255, 255, 255));
        jLabel112.setText("A2");
        PAN7Delete.add(jLabel112, new org.netbeans.lib.awtextra.AbsoluteConstraints(505, 126, 20, 20));

        jLabel142.setBackground(new java.awt.Color(0, 0, 0));
        jLabel142.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel142.setForeground(new java.awt.Color(255, 255, 255));
        jLabel142.setText("        Swap A0 <-> A2");
        jLabel142.setOpaque(true);
        PAN7Delete.add(jLabel142, new org.netbeans.lib.awtextra.AbsoluteConstraints(285, 116, 170, 20));

        jPanel4.add(PAN7Delete, "card2");

        PANPAGE7.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 700, 300));

        jPanel30.add(PANPAGE7, "card2");

        PANPAGE8.setBackground(new java.awt.Color(0, 0, 0));
        PANPAGE8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setLayout(new java.awt.CardLayout());

        PAN8SW.setBackground(new java.awt.Color(0, 0, 0));
        PAN8SW.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SW1_8.setBackground(new java.awt.Color(0, 0, 102));
        SW1_8.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        SW1_8.setForeground(new java.awt.Color(255, 255, 255));
        SW1_8.setText("W1_8");
        SW1_8.setOpaque(true);
        PAN8SW.add(SW1_8, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 28, 40, 40));

        SW2_8.setBackground(new java.awt.Color(0, 0, 102));
        SW2_8.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        SW2_8.setForeground(new java.awt.Color(255, 255, 255));
        SW2_8.setText("W2_8");
        SW2_8.setOpaque(true);
        PAN8SW.add(SW2_8, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 116, 40, 40));

        SW3_8.setBackground(new java.awt.Color(0, 0, 102));
        SW3_8.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        SW3_8.setForeground(new java.awt.Color(255, 255, 255));
        SW3_8.setText("W3_8");
        SW3_8.setOpaque(true);
        PAN8SW.add(SW3_8, new org.netbeans.lib.awtextra.AbsoluteConstraints(525, 116, 40, 40));

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 0, 0));
        jLabel16.setText("8-1");
        PAN8SW.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 40));

        filler193.setBackground(new java.awt.Color(255, 255, 255));
        filler193.setOpaque(true);
        PAN8SW.add(filler193, new org.netbeans.lib.awtextra.AbsoluteConstraints(194, 88, 350, 2));

        filler195.setBackground(new java.awt.Color(255, 255, 255));
        filler195.setOpaque(true);
        PAN8SW.add(filler195, new org.netbeans.lib.awtextra.AbsoluteConstraints(194, 88, 2, 28));

        filler196.setBackground(new java.awt.Color(255, 255, 255));
        filler196.setOpaque(true);
        PAN8SW.add(filler196, new org.netbeans.lib.awtextra.AbsoluteConstraints(544, 88, 2, 28));

        filler199.setBackground(new java.awt.Color(255, 255, 255));
        filler199.setOpaque(true);
        PAN8SW.add(filler199, new org.netbeans.lib.awtextra.AbsoluteConstraints(369, 68, 2, 20));

        jLabel110.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel110.setForeground(new java.awt.Color(255, 255, 255));
        jLabel110.setText("A0");
        PAN8SW.add(jLabel110, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 38, 20, 20));

        jLabel114.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel114.setForeground(new java.awt.Color(255, 255, 255));
        jLabel114.setText("A1");
        PAN8SW.add(jLabel114, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 126, 20, 20));

        jLabel115.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel115.setForeground(new java.awt.Color(255, 255, 255));
        jLabel115.setText("A2");
        PAN8SW.add(jLabel115, new org.netbeans.lib.awtextra.AbsoluteConstraints(505, 126, 20, 20));

        jLabel131.setBackground(new java.awt.Color(0, 0, 0));
        jLabel131.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel131.setForeground(new java.awt.Color(255, 255, 255));
        jLabel131.setText("  Đưa phần còn lại về Heap");
        jLabel131.setOpaque(true);
        PAN8SW.add(jLabel131, new org.netbeans.lib.awtextra.AbsoluteConstraints(285, 116, 170, 20));

        jPanel5.add(PAN8SW, "card2");

        PAN8ShiftDown.setBackground(new java.awt.Color(0, 0, 0));
        PAN8ShiftDown.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SD1_8.setBackground(new java.awt.Color(0, 0, 102));
        SD1_8.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        SD1_8.setForeground(new java.awt.Color(255, 255, 255));
        SD1_8.setText("S1_8");
        SD1_8.setOpaque(true);
        PAN8ShiftDown.add(SD1_8, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 28, 40, 40));

        SD2_8.setBackground(new java.awt.Color(0, 0, 102));
        SD2_8.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        SD2_8.setForeground(new java.awt.Color(255, 255, 255));
        SD2_8.setText("S2_8");
        SD2_8.setOpaque(true);
        PAN8ShiftDown.add(SD2_8, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 116, 40, 40));

        SD3_8.setBackground(new java.awt.Color(0, 0, 102));
        SD3_8.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        SD3_8.setForeground(new java.awt.Color(255, 255, 255));
        SD3_8.setText("S3_8");
        SD3_8.setOpaque(true);
        PAN8ShiftDown.add(SD3_8, new org.netbeans.lib.awtextra.AbsoluteConstraints(525, 116, 40, 40));

        jLabel17.setBackground(new java.awt.Color(255, 255, 255));
        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 0, 0));
        jLabel17.setText("8-2");
        PAN8ShiftDown.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 40));

        filler205.setBackground(new java.awt.Color(255, 255, 255));
        filler205.setOpaque(true);
        PAN8ShiftDown.add(filler205, new org.netbeans.lib.awtextra.AbsoluteConstraints(194, 88, 350, 2));

        filler207.setBackground(new java.awt.Color(255, 255, 255));
        filler207.setOpaque(true);
        PAN8ShiftDown.add(filler207, new org.netbeans.lib.awtextra.AbsoluteConstraints(194, 88, 2, 28));

        filler208.setBackground(new java.awt.Color(255, 255, 255));
        filler208.setOpaque(true);
        PAN8ShiftDown.add(filler208, new org.netbeans.lib.awtextra.AbsoluteConstraints(544, 88, 2, 28));

        filler211.setBackground(new java.awt.Color(255, 255, 255));
        filler211.setOpaque(true);
        PAN8ShiftDown.add(filler211, new org.netbeans.lib.awtextra.AbsoluteConstraints(369, 68, 2, 20));

        jLabel113.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel113.setForeground(new java.awt.Color(255, 255, 255));
        jLabel113.setText("A0");
        PAN8ShiftDown.add(jLabel113, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 38, 20, 20));

        jLabel116.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel116.setForeground(new java.awt.Color(255, 255, 255));
        jLabel116.setText("A1");
        PAN8ShiftDown.add(jLabel116, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 126, 20, 20));

        jLabel117.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel117.setForeground(new java.awt.Color(255, 255, 255));
        jLabel117.setText("A2");
        PAN8ShiftDown.add(jLabel117, new org.netbeans.lib.awtextra.AbsoluteConstraints(505, 126, 20, 20));

        jLabel137.setBackground(new java.awt.Color(0, 0, 0));
        jLabel137.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel137.setForeground(new java.awt.Color(255, 255, 255));
        jLabel137.setText("            Xóa Node A2");
        jLabel137.setOpaque(true);
        PAN8ShiftDown.add(jLabel137, new org.netbeans.lib.awtextra.AbsoluteConstraints(285, 116, 170, 20));

        jPanel5.add(PAN8ShiftDown, "card2");

        PAN8Delete.setBackground(new java.awt.Color(0, 0, 0));
        PAN8Delete.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        D1_8.setBackground(new java.awt.Color(0, 0, 102));
        D1_8.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        D1_8.setForeground(new java.awt.Color(255, 255, 255));
        D1_8.setText("D1_8");
        D1_8.setOpaque(true);
        PAN8Delete.add(D1_8, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 28, 40, 40));

        D2_8.setBackground(new java.awt.Color(0, 0, 102));
        D2_8.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        D2_8.setForeground(new java.awt.Color(255, 255, 255));
        D2_8.setText("D2_8");
        D2_8.setOpaque(true);
        PAN8Delete.add(D2_8, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 116, 40, 40));

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 0, 0));
        jLabel18.setText("8-3");
        PAN8Delete.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 40));

        filler217.setBackground(new java.awt.Color(255, 255, 255));
        filler217.setOpaque(true);
        PAN8Delete.add(filler217, new org.netbeans.lib.awtextra.AbsoluteConstraints(194, 88, 177, 2));

        filler219.setBackground(new java.awt.Color(255, 255, 255));
        filler219.setOpaque(true);
        PAN8Delete.add(filler219, new org.netbeans.lib.awtextra.AbsoluteConstraints(194, 88, 2, 28));

        filler223.setBackground(new java.awt.Color(255, 255, 255));
        filler223.setOpaque(true);
        PAN8Delete.add(filler223, new org.netbeans.lib.awtextra.AbsoluteConstraints(369, 68, 2, 20));

        jLabel118.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel118.setForeground(new java.awt.Color(255, 255, 255));
        jLabel118.setText("A0");
        PAN8Delete.add(jLabel118, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 38, 20, 20));

        jLabel119.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel119.setForeground(new java.awt.Color(255, 255, 255));
        jLabel119.setText("A1");
        PAN8Delete.add(jLabel119, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 126, 20, 20));

        jLabel143.setBackground(new java.awt.Color(0, 0, 0));
        jLabel143.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel143.setForeground(new java.awt.Color(255, 255, 255));
        jLabel143.setText("        Swap A0 <-> A1");
        jLabel143.setOpaque(true);
        PAN8Delete.add(jLabel143, new org.netbeans.lib.awtextra.AbsoluteConstraints(285, 116, 170, 20));

        jPanel5.add(PAN8Delete, "card2");

        PANPAGE8.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 700, 300));

        jPanel30.add(PANPAGE8, "card2");

        PANPAGE9.setBackground(new java.awt.Color(0, 0, 0));
        PANPAGE9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setLayout(new java.awt.CardLayout());

        PAN9SW.setBackground(new java.awt.Color(0, 0, 0));
        PAN9SW.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SW1_9.setBackground(new java.awt.Color(0, 0, 102));
        SW1_9.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        SW1_9.setForeground(new java.awt.Color(255, 255, 255));
        SW1_9.setText("W1_9");
        SW1_9.setOpaque(true);
        PAN9SW.add(SW1_9, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 28, 40, 40));

        SW2_9.setBackground(new java.awt.Color(0, 0, 102));
        SW2_9.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        SW2_9.setForeground(new java.awt.Color(255, 255, 255));
        SW2_9.setText("W2_9");
        SW2_9.setOpaque(true);
        PAN9SW.add(SW2_9, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 116, 40, 40));

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 0, 0));
        jLabel19.setText("9-1");
        PAN9SW.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 40));

        filler229.setBackground(new java.awt.Color(255, 255, 255));
        filler229.setOpaque(true);
        PAN9SW.add(filler229, new org.netbeans.lib.awtextra.AbsoluteConstraints(194, 88, 177, 2));

        filler231.setBackground(new java.awt.Color(255, 255, 255));
        filler231.setOpaque(true);
        PAN9SW.add(filler231, new org.netbeans.lib.awtextra.AbsoluteConstraints(194, 88, 2, 28));

        filler235.setBackground(new java.awt.Color(255, 255, 255));
        filler235.setOpaque(true);
        PAN9SW.add(filler235, new org.netbeans.lib.awtextra.AbsoluteConstraints(369, 68, 2, 20));

        jLabel120.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel120.setForeground(new java.awt.Color(255, 255, 255));
        jLabel120.setText("A0");
        PAN9SW.add(jLabel120, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 38, 20, 20));

        jLabel121.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel121.setForeground(new java.awt.Color(255, 255, 255));
        jLabel121.setText("A1");
        PAN9SW.add(jLabel121, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 126, 20, 20));

        jLabel132.setBackground(new java.awt.Color(0, 0, 0));
        jLabel132.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel132.setForeground(new java.awt.Color(255, 255, 255));
        jLabel132.setText("  Đưa phần còn lại về Heap");
        jLabel132.setOpaque(true);
        PAN9SW.add(jLabel132, new org.netbeans.lib.awtextra.AbsoluteConstraints(285, 116, 170, 20));

        jPanel6.add(PAN9SW, "card2");

        PAN9ShiftDown.setBackground(new java.awt.Color(0, 0, 0));
        PAN9ShiftDown.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SD1_9.setBackground(new java.awt.Color(0, 0, 102));
        SD1_9.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        SD1_9.setForeground(new java.awt.Color(255, 255, 255));
        SD1_9.setText("S1_9");
        SD1_9.setOpaque(true);
        PAN9ShiftDown.add(SD1_9, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 28, 40, 40));

        SD2_9.setBackground(new java.awt.Color(0, 0, 102));
        SD2_9.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        SD2_9.setForeground(new java.awt.Color(255, 255, 255));
        SD2_9.setText("S2_9");
        SD2_9.setOpaque(true);
        PAN9ShiftDown.add(SD2_9, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 116, 40, 40));

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 0, 0));
        jLabel20.setText("9-2");
        PAN9ShiftDown.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 40));

        filler241.setBackground(new java.awt.Color(255, 255, 255));
        filler241.setOpaque(true);
        PAN9ShiftDown.add(filler241, new org.netbeans.lib.awtextra.AbsoluteConstraints(194, 88, 177, 2));

        filler243.setBackground(new java.awt.Color(255, 255, 255));
        filler243.setOpaque(true);
        PAN9ShiftDown.add(filler243, new org.netbeans.lib.awtextra.AbsoluteConstraints(194, 88, 2, 28));

        filler247.setBackground(new java.awt.Color(255, 255, 255));
        filler247.setOpaque(true);
        PAN9ShiftDown.add(filler247, new org.netbeans.lib.awtextra.AbsoluteConstraints(369, 68, 2, 20));

        jLabel122.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel122.setForeground(new java.awt.Color(255, 255, 255));
        jLabel122.setText("A0");
        PAN9ShiftDown.add(jLabel122, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 38, 20, 20));

        jLabel123.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel123.setForeground(new java.awt.Color(255, 255, 255));
        jLabel123.setText("A1");
        PAN9ShiftDown.add(jLabel123, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 126, 20, 20));

        jLabel138.setBackground(new java.awt.Color(0, 0, 0));
        jLabel138.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel138.setForeground(new java.awt.Color(255, 255, 255));
        jLabel138.setText("            Xóa Node A1");
        jLabel138.setOpaque(true);
        PAN9ShiftDown.add(jLabel138, new org.netbeans.lib.awtextra.AbsoluteConstraints(285, 116, 170, 20));

        jPanel6.add(PAN9ShiftDown, "card2");

        PAN9Delete.setBackground(new java.awt.Color(0, 0, 0));
        PAN9Delete.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        D1_9.setBackground(new java.awt.Color(0, 0, 102));
        D1_9.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        D1_9.setForeground(new java.awt.Color(255, 255, 255));
        D1_9.setText("D1_9");
        D1_9.setOpaque(true);
        PAN9Delete.add(D1_9, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 28, 40, 40));

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 0, 0));
        jLabel21.setText("9-3");
        PAN9Delete.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 40));

        indexA0.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        indexA0.setForeground(new java.awt.Color(255, 255, 255));
        indexA0.setText("A0");
        PAN9Delete.add(indexA0, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 38, 20, 20));

        jPanel6.add(PAN9Delete, "card2");

        PANPAGE9.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 700, 300));

        jPanel30.add(PANPAGE9, "card2");

        jPanel11.add(jPanel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, 700, 340));

        jPanel9.setBackground(new java.awt.Color(0, 0, 0));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel9.add(ptA6, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 10, 30, 30));
        jPanel9.add(ptA0, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 30, 30));
        jPanel9.add(ptA1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 30, 30));
        jPanel9.add(ptA2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, 30, 30));
        jPanel9.add(ptA3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, 30, 30));
        jPanel9.add(ptA4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, 30, 30));
        jPanel9.add(ptA5, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 30, 30));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("   A0         A1         A2         A3         A4       A5        A6");
        jPanel9.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 270, 20));

        jButton1.setText("Sort ");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jPanel9.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 10, -1, 40));

        OUTPUTA6.setBackground(new java.awt.Color(0, 0, 0));
        OUTPUTA6.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        OUTPUTA6.setForeground(new java.awt.Color(255, 255, 255));
        OUTPUTA6.setOpaque(true);
        jPanel9.add(OUTPUTA6, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 80, 40, 40));

        OUTPUTA5.setBackground(new java.awt.Color(0, 0, 0));
        OUTPUTA5.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        OUTPUTA5.setForeground(new java.awt.Color(255, 255, 255));
        OUTPUTA5.setOpaque(true);
        jPanel9.add(OUTPUTA5, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 80, 40, 40));

        OUTPUTA4.setBackground(new java.awt.Color(0, 0, 0));
        OUTPUTA4.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        OUTPUTA4.setForeground(new java.awt.Color(255, 255, 255));
        OUTPUTA4.setOpaque(true);
        jPanel9.add(OUTPUTA4, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 80, 40, 40));

        OUTPUTA3.setBackground(new java.awt.Color(0, 0, 0));
        OUTPUTA3.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        OUTPUTA3.setForeground(new java.awt.Color(255, 255, 255));
        OUTPUTA3.setOpaque(true);
        jPanel9.add(OUTPUTA3, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 80, 40, 40));

        OUTPUTA2.setBackground(new java.awt.Color(0, 0, 0));
        OUTPUTA2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        OUTPUTA2.setForeground(new java.awt.Color(255, 255, 255));
        OUTPUTA2.setOpaque(true);
        jPanel9.add(OUTPUTA2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 80, 40, 40));

        OUTPUTA1.setBackground(new java.awt.Color(0, 0, 0));
        OUTPUTA1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        OUTPUTA1.setForeground(new java.awt.Color(255, 255, 255));
        OUTPUTA1.setOpaque(true);
        jPanel9.add(OUTPUTA1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 80, 40, 40));

        OUTPUTA0.setBackground(new java.awt.Color(0, 0, 0));
        OUTPUTA0.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        OUTPUTA0.setForeground(new java.awt.Color(255, 255, 255));
        OUTPUTA0.setOpaque(true);
        jPanel9.add(OUTPUTA0, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 80, 40, 40));

        jPanel11.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 700, 120));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        String s0 = ptA0.getText(), s1 = ptA1.getText(), s2 = ptA2.getText(), s3 = ptA3.getText(), s4 = ptA4.getText(), s5 = ptA5.getText(), s6 = ptA6.getText();
        if (!s0.isEmpty() && !s1.isEmpty() && !s2.isEmpty() && !s3.isEmpty() && !s4.isEmpty() && !s5.isEmpty() && !s6.isEmpty()) {
            
            try {
                int num0 = Integer.parseInt(s0);
                HEAP.A.SetIndex(0, num0);
                int num1 = Integer.parseInt(s1);
                HEAP.A.SetIndex(1, num1);
                int num2 = Integer.parseInt(s2);
                HEAP.A.SetIndex(2, num2);
                int num3 = Integer.parseInt(s3);
                HEAP.A.SetIndex(3, num3);
                int num4 = Integer.parseInt(s4);
                HEAP.A.SetIndex(4, num4);
                int num5 = Integer.parseInt(s5);
                HEAP.A.SetIndex(5, num5);
                int num6 = Integer.parseInt(s6);
                HEAP.A.SetIndex(6, num6);

                pt0.setText(" " + s0);
                pt1.setText(" " + s1);
                pt2.setText(" " + s2);
                pt3.setText(" " + s3);
                pt4.setText(" " + s4);
                pt5.setText(" " + s5);
                pt6.setText(" " + s6);
                t0.start();

                HEAP.handling();
                for (int i = 0; i < 3; i++) {

                    settextLabelPage1ToPage3(i + 2, HEAP.Arr[i]);

                }
                settextLabelPage4(HEAP.Arr[3], HEAP.Arr[4]);
                settextLabelPage5(HEAP.Arr[5], HEAP.Arr[6]);
                settextLabelPage6(HEAP.Arr[7], HEAP.Arr[8]);
                settextLabelPage7(HEAP.Arr[9], HEAP.Arr[10]);
                settextLabelPage8(HEAP.Arr[11], HEAP.Arr[12]);
                settextLabelPage9(HEAP.Arr[13], HEAP.Arr[14]);
                
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
            }

        }

    }//GEN-LAST:event_jButton1MouseClicked

    Timer setPan0, setPan1, setPan2, setPan3, setPan4, setPan5, setPan6;
    int numcl1 = 255, numcl2 = 255, numcl3 = 255;

    void setColorPAN(int numPan, int numLa) {

        if (numPan == 0) {
            switch (numLa) {
                case 0:
                    setPan0 = new Timer(50, new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            setColor(pt0, numcl1, numcl2, numcl3);
                            if (numcl1 > 1)numcl1 -= 1;
                            else numcl1 = 255;
                            if (numcl2 > 2)numcl2 -= 2;
                            else numcl2 = 255;
                            if (numcl3 > 3)numcl3 -= 3;
                            else numcl3 = 255;
                        }
                    });
                    setPan0.start();
                    break;
                case 1:
                    setColor(pt0, 0, 0, 102);
                    setPan0.stop();
                    setPan1 = new Timer(50, new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            setColor(pt1, numcl1, numcl2, numcl3);
                            if (numcl1 > 1)numcl1 -= 1;
                            else numcl1 = 255;
                            if (numcl2 > 2)numcl2 -= 2;
                            else numcl2 = 255;
                            if (numcl3 > 3)numcl3 -= 3;
                            else numcl3 = 255;
                        }
                    });
                    setPan1.start();
                    break;
                case 2:
                    setColor(pt1, 0, 0, 102);
                    setPan1.stop();
                    setPan2 = new Timer(50, new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            setColor(pt2, numcl1, numcl2, numcl3);
                            if (numcl1 > 1)numcl1 -= 1;
                            else numcl1 = 255;
                            if (numcl2 > 2)numcl2 -= 2;
                            else numcl2 = 255;
                            if (numcl3 > 3)numcl3 -= 3;
                            else numcl3 = 255;
                        }
                    });
                    setPan2.start();
                    break;
                case 3:
                    setColor(pt2, 0, 0, 102);
                    setPan2.stop();
                    setPan3 = new Timer(50, new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            setColor(pt3, numcl1, numcl2, numcl3);
                            if (numcl1 > 1)numcl1 -= 1;
                            else numcl1 = 255;
                            if (numcl2 > 2)numcl2 -= 2;
                            else numcl2 = 255;
                            if (numcl3 > 3)numcl3 -= 3;
                            else numcl3 = 255;
                        }
                    });
                    setPan3.start();
                    break;
                case 4:
                    setColor(pt3, 0, 0, 102);
                    setPan3.stop();
                    setPan4 = new Timer(50, new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            setColor(pt4, numcl1, numcl2, numcl3);
                            if (numcl1 > 1)numcl1 -= 1;
                            else numcl1 = 255;
                            if (numcl2 > 2)numcl2 -= 2;
                            else numcl2 = 255;
                            if (numcl3 > 3)numcl3 -= 3;
                            else numcl3 = 255;
                        }
                    });
                    setPan4.start();
                    break;
                case 5:
                    setColor(pt4, 0, 0, 102);
                    setPan4.stop();
                    setPan5 = new Timer(50, new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            setColor(pt5, numcl1, numcl2, numcl3);
                            if (numcl1 > 1)numcl1 -= 1;
                            else numcl1 = 255;
                            if (numcl2 > 2)numcl2 -= 2;
                            else numcl2 = 255;
                            if (numcl3 > 3)numcl3 -= 3;
                            else numcl3 = 255;
                        }
                    });
                    setPan5.start();
                    break;
                case 6:
                    setColor(pt5, 0, 0, 102);
                    setPan5.stop();
                    setPan6 = new Timer(50, new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            setColor(pt6, numcl1, numcl2, numcl3);
                            if (numcl1 > 1)numcl1 -= 1;
                            else numcl1 = 255;
                            if (numcl2 > 2)numcl2 -= 2;
                            else numcl2 = 255;
                            if (numcl3 > 3)numcl3 -= 3;
                            else numcl3 = 255;
                        }
                    });
                    setPan6.start();
                    break;
                default:
                    break;
            }
        }
    }

    Timer TimeEqual;
    // thiet ke tao hieu ung co Page. 
    void EffectMovedOnPage(int numPage) {
     
        switch (numPage) {
            case 1:
                // ve cay.
//                drawTrePage1To3(g, PANPAGE1);
                //.
                SwapPanel(jPanel30, PANPAGE1);
                t0.stop();
                TimeEqual.stop();
                // cho hieu ung.
                TimeEqual = new Timer(20, new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        setColor(La2P1, numcl1, numcl2, numcl3);
                        setColor(La4P1, numcl1, numcl2, numcl3);
                        setColor(La5P1, numcl1, numcl2, numcl3);
                        if (numcl1 > 1)numcl1 -= 1;
                        else numcl1 = 255;
                        if (numcl2 > 2)numcl2 -= 2;
                        else numcl2 = 255;
                        if (numcl3 > 3)numcl3 -= 3;
                        else numcl3 = 255;
                    }
                });
                TimeEqual.start();
                break;
            case 2:
                TimeEqual.stop();                                                  
                SwapPanel(jPanel30, PANPAGE2);
                // Tao hieu ung.
                TimeEqual = new Timer(20, new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        setColor(La1P2, numcl1, numcl2, numcl3);
                        setColor(La2P2, numcl1, numcl2, numcl3);
                        setColor(La3P2, numcl1, numcl2, numcl3);
                        if (numcl1 > 1)numcl1 -= 1;
                        else numcl1 = 255;
                        if (numcl2 > 2)numcl2 -= 2;
                        else numcl2 = 255;
                        if (numcl3 > 3)numcl3 -= 3;
                        else numcl3 = 255;
                    }
                });
                TimeEqual.start();
                break;
            case 3:
                TimeEqual.stop();
                SwapPanel(jPanel30, PANPAGE3);
                TimeEqual = new Timer(20, new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        setColor(La1P3, numcl1, numcl2, numcl3);
                        setColor(La7P3, numcl1, numcl2, numcl3);
                        if (numcl1 > 1)numcl1 -= 1;
                        else numcl1 = 255;
                        if (numcl2 > 2)numcl2 -= 2;
                        else numcl2 = 255;
                        if (numcl3 > 3)numcl3 -= 3;
                        else numcl3 = 255;
                    }
                });
                TimeEqual.start();
                break;
            case 4:
                TimeEqual.stop();
                SwapPanel(jPanel30, PANPAGE4);
                TimeEqual = new Timer(20, new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        setColor(SW1_4, numcl1, numcl2, numcl3);
                        setColor(SW2_4, numcl1, numcl2, numcl3);
                        setColor(SW3_4, numcl1, numcl2, numcl3);
                        setColor(SW4_4, numcl1, numcl2, numcl3);
                        setColor(SW5_4, numcl1, numcl2, numcl3);
                        setColor(SW6_4, numcl1, numcl2, numcl3);
                        if (numcl1 > 1)numcl1 -= 1;
                        else numcl1 = 255;
                        if (numcl2 > 2)numcl2 -= 2;
                        else numcl2 = 255;
                        if (numcl3 > 3)numcl3 -= 3;
                        else numcl3 = 255;
                    }
                });
                TimeEqual.start();
                break;
            case 5:
                TimeEqual.stop();
                SwapPanel(jPanel30, PANPAGE5);
                TimeEqual = new Timer(20, new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        setColor(SW1_5, numcl1, numcl2, numcl3);
                        setColor(SW2_5, numcl1, numcl2, numcl3);
                        setColor(SW3_5, numcl1, numcl2, numcl3);
                        setColor(SW4_5, numcl1, numcl2, numcl3);
                        setColor(SW5_5, numcl1, numcl2, numcl3);
                        if (numcl1 > 1)numcl1 -= 1;
                        else numcl1 = 255;
                        if (numcl2 > 2)numcl2 -= 2;
                        else numcl2 = 255;
                        if (numcl3 > 3)numcl3 -= 3;
                        else numcl3 = 255;
                    }
                });
                TimeEqual.start();
                break;
            case 6:
                TimeEqual.stop();
                SwapPanel(jPanel30, PANPAGE6);
                TimeEqual = new Timer(20, new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        setColor(SW1_6, numcl1, numcl2, numcl3);
                        setColor(SW2_6, numcl1, numcl2, numcl3);
                        setColor(SW3_6, numcl1, numcl2, numcl3);
                        setColor(SW4_6, numcl1, numcl2, numcl3);
                        if (numcl1 > 1)numcl1 -= 1;
                        else numcl1 = 255;
                        if (numcl2 > 2)numcl2 -= 2;
                        else numcl2 = 255;
                        if (numcl3 > 3)numcl3 -= 3;
                        else numcl3 = 255;
                    }
                });
                TimeEqual.start();
                break;
            case 7:
                TimeEqual.stop();
                SwapPanel(jPanel30, PANPAGE7);
                TimeEqual = new Timer(20, new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        setColor(SW1_7, numcl1, numcl2, numcl3);
                        setColor(SW2_7, numcl1, numcl2, numcl3);
                        setColor(SW3_7, numcl1, numcl2, numcl3);
                        if (numcl1 > 1)numcl1 -= 1;
                        else numcl1 = 255;
                        if (numcl2 > 2)numcl2 -= 2;
                        else numcl2 = 255;
                        if (numcl3 > 3)numcl3 -= 3;
                        else numcl3 = 255;
                    }
                });
                TimeEqual.start();
                break;
            case 8:
                TimeEqual.stop();
                SwapPanel(jPanel30, PANPAGE8);
                TimeEqual = new Timer(20, new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        setColor(SW1_8, numcl1, numcl2, numcl3);
                        setColor(SW2_8, numcl1, numcl2, numcl3);
                        if (numcl1 > 1)numcl1 -= 1;
                        else numcl1 = 255;
                        if (numcl2 > 2)numcl2 -= 2;
                        else numcl2 = 255;
                        if (numcl3 > 3)numcl3 -= 3;
                        else numcl3 = 255;
                    }
                });
                TimeEqual.start();
                break;
            case 9:
                TimeEqual.stop();
                SwapPanel(jPanel30, PANPAGE9);
                TimeEqual = new Timer(20, new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        setColor(SW1_9, numcl1, numcl2, numcl3);
                        if (numcl1 > 1)numcl1 -= 1;
                        else numcl1 = 255;
                        if (numcl2 > 2)numcl2 -= 2;
                        else numcl2 = 255;
                        if (numcl3 > 3)numcl3 -= 3;
                        else numcl3 = 255;
                    }
                });
                TimeEqual.start();
                break;
            case 10:
                TimeEqual.stop();
                SwapPanel(jPanel30, PANPAGE0);
                break;
            default:
                break;
        }
    }
    
    
    int numclx1 = 255, numclx2 = 0, numclx3 = 0; 
    void EffectMoveOnEachPageShift(int Page) {

        switch (Page) {
            case 4:
                TimeEqual.stop();
                setElementEachPage(2, OUTPUTA6, jPanel1, PAN4Delete, PAN4ShiftDown, 6);
                // xet hieu ung cho shift. 
                TimeEqual = new Timer(200, new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        setColor(SD7_4, numclx1, numclx2, numclx3);
                        if(numclx1 == 255 && numclx2 == 0 && numclx3 ==0){
                            numclx1 = 255;
                            numclx2 = 153;
                            numclx3 = 153; 
                        }else{
                            numclx1 = 255;
                            numclx2 = 0;
                            numclx3 = 0; 
                        }
                    }
                });
                TimeEqual.start();
                break;
            case 5:
                TimeEqual.stop();
                setElementEachPage(2, OUTPUTA5, jPanel2, PAN5Delete, PAN5ShiftDown, 5);
                TimeEqual = new Timer(200, new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        setColor(SD6_5, numclx1, numclx2, numclx3);
                        if(numclx1 == 255 && numclx2 == 0 && numclx3 ==0){
                            numclx1 = 255;
                            numclx2 = 153;
                            numclx3 = 153; 
                        }else{
                            numclx1 = 255;
                            numclx2 = 0;
                            numclx3 = 0; 
                        }
                    }
                });
                TimeEqual.start();
                break;
            case 6:
                TimeEqual.stop();
                setElementEachPage(2, OUTPUTA4, jPanel3, PAN6Delete, PAN6ShiftDown, 4);
                TimeEqual = new Timer(200, new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        setColor(SD5_6, numclx1, numclx2, numclx3);
                        if(numclx1 == 255 && numclx2 == 0 && numclx3 ==0){
                            numclx1 = 255;
                            numclx2 = 153;
                            numclx3 = 153; 
                        }else{
                            numclx1 = 255;
                            numclx2 = 0;
                            numclx3 = 0; 
                        }
                    }
                });
                TimeEqual.start();
                break;
            case 7:
                TimeEqual.stop();
                setElementEachPage(2, OUTPUTA3, jPanel4, PAN7Delete, PAN7ShiftDown, 3);
                TimeEqual = new Timer(200, new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        setColor(SD4_7, numclx1, numclx2, numclx3);
                        if(numclx1 == 255 && numclx2 == 0 && numclx3 ==0){
                            numclx1 = 255;
                            numclx2 = 153;
                            numclx3 = 153; 
                        }else{
                            numclx1 = 255;
                            numclx2 = 0;
                            numclx3 = 0; 
                        }
                    }
                });
                TimeEqual.start();
                break;
            case 8:
                TimeEqual.stop();
                setElementEachPage(2, OUTPUTA2, jPanel5, PAN8Delete, PAN8ShiftDown, 2);
                TimeEqual = new Timer(200, new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        setColor(SD3_8, numclx1, numclx2, numclx3);
                        if(numclx1 == 255 && numclx2 == 0 && numclx3 ==0){
                            numclx1 = 255;
                            numclx2 = 153;
                            numclx3 = 153; 
                        }else{
                            numclx1 = 255;
                            numclx2 = 0;
                            numclx3 = 0; 
                        }
                    }
                });
                TimeEqual.start();
                break;
            case 9:
                TimeEqual.stop();
                setElementEachPage(2, OUTPUTA1, jPanel6, PAN9Delete, PAN9ShiftDown, 1);
                TimeEqual = new Timer(200, new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        setColor(SD2_9, numclx1, numclx2, numclx3);
                        if(numclx1 == 255 && numclx2 == 0 && numclx3 ==0){
                            numclx1 = 255;
                            numclx2 = 153;
                            numclx3 = 153; 
                        }else{
                            numclx1 = 255;
                            numclx2 = 0;
                            numclx3 = 0; 
                        }
                    }
                });
                TimeEqual.start();
                break;

            default:
                break;
        }
    }

    void EffectMoveOnEachPageDelete(int Page) {
        switch (Page) {
            case 4:
                TimeEqual.stop();
                setElementEachPage(1, OUTPUTA6, jPanel1, PAN4Delete, PAN4ShiftDown, 6);
                // them hieu ung. 
                TimeEqual = new Timer(20, new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        setColor(D1_4, numcl1, numcl2, numcl3);
                        setColor(D6_4, numcl1, numcl2, numcl3);
                        if (numcl1 > 1)numcl1 -= 1;
                        else numcl1 = 255;
                        if (numcl2 > 2)numcl2 -= 2;
                        else numcl2 = 255;
                        if (numcl3 > 3)numcl3 -= 3;
                        else numcl3 = 255;
                    }
                });
                TimeEqual.start();
                break;
            case 5:
                TimeEqual.stop();
                setElementEachPage(1, OUTPUTA5, jPanel2, PAN5Delete, PAN5ShiftDown, 5);
                TimeEqual = new Timer(20, new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        setColor(D1_5, numcl1, numcl2, numcl3);
                        setColor(D5_5, numcl1, numcl2, numcl3);
                        if (numcl1 > 1)numcl1 -= 1;
                        else numcl1 = 255;
                        if (numcl2 > 2)numcl2 -= 2;
                        else numcl2 = 255;
                        if (numcl3 > 3)numcl3 -= 3;
                        else numcl3 = 255;
                    }
                });
                TimeEqual.start();
                break;
            case 6:
                TimeEqual.stop();
                setElementEachPage(1, OUTPUTA4, jPanel3, PAN6Delete, PAN6ShiftDown, 4);
                TimeEqual = new Timer(20, new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        setColor(D1_6, numcl1, numcl2, numcl3);
                        setColor(D4_6, numcl1, numcl2, numcl3);
                        if (numcl1 > 1)numcl1 -= 1;
                        else numcl1 = 255;
                        if (numcl2 > 2)numcl2 -= 2;
                        else numcl2 = 255;
                        if (numcl3 > 3)numcl3 -= 3;
                        else numcl3 = 255;
                    }
                });
                TimeEqual.start();
                break;
            case 7:
                TimeEqual.stop();
                setElementEachPage(1, OUTPUTA3, jPanel4, PAN7Delete, PAN7ShiftDown, 3);
                TimeEqual = new Timer(20, new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        setColor(D1_7, numcl1, numcl2, numcl3);
                        setColor(D3_7, numcl1, numcl2, numcl3);
                        if (numcl1 > 1)numcl1 -= 1;
                        else numcl1 = 255;
                        if (numcl2 > 2)numcl2 -= 2;
                        else numcl2 = 255;
                        if (numcl3 > 3)numcl3 -= 3;
                        else numcl3 = 255;
                    }
                });
                TimeEqual.start();
                break;
            case 8:
                TimeEqual.stop();
                setElementEachPage(1, OUTPUTA2, jPanel5, PAN8Delete, PAN8ShiftDown, 2);
                TimeEqual = new Timer(20, new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        setColor(D1_8, numcl1, numcl2, numcl3);
                        setColor(D2_8, numcl1, numcl2, numcl3);
                        if (numcl1 > 1)numcl1 -= 1;
                        else numcl1 = 255;
                        if (numcl2 > 2)numcl2 -= 2;
                        else numcl2 = 255;
                        if (numcl3 > 3)numcl3 -= 3;
                        else numcl3 = 255;
                    }
                });
                TimeEqual.start();
                break;
            case 9:
                TimeEqual.stop();
                setElementEachPage(1, OUTPUTA1, jPanel6, PAN9Delete, PAN9ShiftDown, 1);
                break;
            default:
                break;
        }
    }

    void setElementEachPage(int Page, JLabel LabelUPDate, JPanel PanPlat, JPanel PanDele, JPanel PanShift, int index) {
        switch (Page) {
            case 1:
                SwapPanel(PanPlat, PanDele);
                LabelUPDate.setText(" " + String.valueOf(HEAP.Arr[14].GetIndex(index)));
                setColor(LabelUPDate, 0, 0, 102);
                break;
            case 2:
                SwapPanel(PanPlat, PanShift);
                break;

            default:
                break;
        }
    }

    void settextLabelPage1ToPage3(int numPage, Array A) {
        if (numPage == 2) {
            La1P1.setText(" " + String.valueOf(A.GetIndex(0)));
            La2P1.setText(" " + String.valueOf(A.GetIndex(1)));
            La3P1.setText(" " + String.valueOf(A.GetIndex(2)));
            La4P1.setText(" " + String.valueOf(A.GetIndex(3)));
            La5P1.setText(" " + String.valueOf(A.GetIndex(4)));
            La6P1.setText(" " + String.valueOf(A.GetIndex(5)));
            La7P1.setText(" " + String.valueOf(A.GetIndex(6)));
           
      
        } else if (numPage == 3) {
            La1P2.setText(" " + String.valueOf(A.GetIndex(0)));
            La2P2.setText(" " + String.valueOf(A.GetIndex(1)));
            La3P2.setText(" " + String.valueOf(A.GetIndex(2)));
            La4P2.setText(" " + String.valueOf(A.GetIndex(3)));
            La5P2.setText(" " + String.valueOf(A.GetIndex(4)));
            La6P2.setText(" " + String.valueOf(A.GetIndex(5)));
            La7P2.setText(" " + String.valueOf(A.GetIndex(6)));
            
        } else if (numPage == 4) {
            La1P3.setText(" " + String.valueOf(A.GetIndex(0)));
            La2P3.setText(" " + String.valueOf(A.GetIndex(1)));
            La3P3.setText(" " + String.valueOf(A.GetIndex(2)));
            La4P3.setText(" " + String.valueOf(A.GetIndex(3)));
            La5P3.setText(" " + String.valueOf(A.GetIndex(4)));
            La6P3.setText(" " + String.valueOf(A.GetIndex(5)));
            La7P3.setText(" " + String.valueOf(A.GetIndex(6)));
           
        }
    }

    void settextLabelPage4(Array A, Array B) {
        SW1_4.setText(" " + String.valueOf(A.GetIndex(0)));
        SW2_4.setText(" " + String.valueOf(A.GetIndex(1)));
        SW3_4.setText(" " + String.valueOf(A.GetIndex(2)));
        SW4_4.setText(" " + String.valueOf(A.GetIndex(3)));
        SW5_4.setText(" " + String.valueOf(A.GetIndex(4)));
        SW6_4.setText(" " + String.valueOf(A.GetIndex(5)));
        SW7_4.setText(" " + String.valueOf(A.GetIndex(6)));
        // xet gia tri Shift.
        SD1_4.setText(" " + String.valueOf(B.GetIndex(0)));
        SD2_4.setText(" " + String.valueOf(B.GetIndex(1)));
        SD3_4.setText(" " + String.valueOf(B.GetIndex(2)));
        SD4_4.setText(" " + String.valueOf(B.GetIndex(3)));
        SD5_4.setText(" " + String.valueOf(B.GetIndex(4)));
        SD6_4.setText(" " + String.valueOf(B.GetIndex(5)));
        SD7_4.setText(" " + String.valueOf(B.GetIndex(6)));
        // xet gia tri delete. 
        D1_4.setText(" " + String.valueOf(B.GetIndex(0)));
        D2_4.setText(" " + String.valueOf(B.GetIndex(1)));
        D3_4.setText(" " + String.valueOf(B.GetIndex(2)));
        D4_4.setText(" " + String.valueOf(B.GetIndex(3)));
        D5_4.setText(" " + String.valueOf(B.GetIndex(4)));
        D6_4.setText(" " + String.valueOf(B.GetIndex(5)));
    }

    void settextLabelPage5(Array A, Array B) {
        SW1_5.setText(" " + String.valueOf(A.GetIndex(0)));
        SW2_5.setText(" " + String.valueOf(A.GetIndex(1)));
        SW3_5.setText(" " + String.valueOf(A.GetIndex(2)));
        SW4_5.setText(" " + String.valueOf(A.GetIndex(3)));
        SW5_5.setText(" " + String.valueOf(A.GetIndex(4)));
        SW6_5.setText(" " + String.valueOf(A.GetIndex(5)));

        // xet gia tri Shift.
        SD1_5.setText(" " + String.valueOf(B.GetIndex(0)));
        SD2_5.setText(" " + String.valueOf(B.GetIndex(1)));
        SD3_5.setText(" " + String.valueOf(B.GetIndex(2)));
        SD4_5.setText(" " + String.valueOf(B.GetIndex(3)));
        SD5_5.setText(" " + String.valueOf(B.GetIndex(4)));
        SD6_5.setText(" " + String.valueOf(B.GetIndex(5)));

        // xet gia tri delete.
        D1_5.setText(" " + String.valueOf(B.GetIndex(0)));
        D2_5.setText(" " + String.valueOf(B.GetIndex(1)));
        D3_5.setText(" " + String.valueOf(B.GetIndex(2)));
        D4_5.setText(" " + String.valueOf(B.GetIndex(3)));
        D5_5.setText(" " + String.valueOf(B.GetIndex(4)));

    }

    void settextLabelPage6(Array A, Array B) {
        SW1_6.setText(" " + String.valueOf(A.GetIndex(0)));
        SW2_6.setText(" " + String.valueOf(A.GetIndex(1)));
        SW3_6.setText(" " + String.valueOf(A.GetIndex(2)));
        SW4_6.setText(" " + String.valueOf(A.GetIndex(3)));
        SW5_6.setText(" " + String.valueOf(A.GetIndex(4)));

        // xet gia tri Shift.
        SD1_6.setText(" " + String.valueOf(B.GetIndex(0)));
        SD2_6.setText(" " + String.valueOf(B.GetIndex(1)));
        SD3_6.setText(" " + String.valueOf(B.GetIndex(2)));
        SD4_6.setText(" " + String.valueOf(B.GetIndex(3)));
        SD5_6.setText(" " + String.valueOf(B.GetIndex(4)));
        // xet gia tri delete.       
        D1_6.setText(" " + String.valueOf(B.GetIndex(0)));
        D2_6.setText(" " + String.valueOf(B.GetIndex(1)));
        D3_6.setText(" " + String.valueOf(B.GetIndex(2)));
        D4_6.setText(" " + String.valueOf(B.GetIndex(3)));

    }

    void settextLabelPage7(Array A, Array B) {
        SW1_7.setText(" " + String.valueOf(A.GetIndex(0)));
        SW2_7.setText(" " + String.valueOf(A.GetIndex(1)));
        SW3_7.setText(" " + String.valueOf(A.GetIndex(2)));
        SW4_7.setText(" " + String.valueOf(A.GetIndex(3)));

        SD1_7.setText(" " + String.valueOf(B.GetIndex(0)));
        SD2_7.setText(" " + String.valueOf(B.GetIndex(1)));
        SD3_7.setText(" " + String.valueOf(B.GetIndex(2)));
        SD4_7.setText(" " + String.valueOf(B.GetIndex(3)));

        // xet gia tri delete.       
        D1_7.setText(" " + String.valueOf(B.GetIndex(0)));
        D2_7.setText(" " + String.valueOf(B.GetIndex(1)));
        D3_7.setText(" " + String.valueOf(B.GetIndex(2)));

    }

    void settextLabelPage8(Array A, Array B) {
        SW1_8.setText(" " + String.valueOf(A.GetIndex(0)));
        SW2_8.setText(" " + String.valueOf(A.GetIndex(1)));
        SW3_8.setText(" " + String.valueOf(A.GetIndex(2)));

        SD1_8.setText(" " + String.valueOf(B.GetIndex(0)));
        SD2_8.setText(" " + String.valueOf(B.GetIndex(1)));
        SD3_8.setText(" " + String.valueOf(B.GetIndex(2)));

        // xet gia tri delete.       
        D1_8.setText(" " + String.valueOf(B.GetIndex(0)));
        D2_8.setText(" " + String.valueOf(B.GetIndex(1)));

    }

    void settextLabelPage9(Array A, Array B) {
        SW1_9.setText(" " + String.valueOf(A.GetIndex(0)));
        SW2_9.setText(" " + String.valueOf(A.GetIndex(1)));

        SD1_9.setText(" " + String.valueOf(B.GetIndex(0)));
        SD2_9.setText(" " + String.valueOf(B.GetIndex(1)));

        // xet gia tri delete.       
        D1_9.setText(" " + String.valueOf(B.GetIndex(0)));

    }
    // xet Panel8. 

    void SwapPanel(javax.swing.JPanel PanMain, javax.swing.JPanel P2) {
        PanMain.removeAll();
        PanMain.repaint();
        PanMain.revalidate();
        PanMain.add(P2);
        PanMain.repaint();
        PanMain.revalidate();
    }

    void setColor(javax.swing.JLabel Label, int m1, int m2, int m3) {
        Label.setBackground(new Color(m1, m2, m3));
    }
    
    // vẽ cây. 
    
    void drawTrePage1To3(java.awt.Graphics g, javax.swing.JPanel P){
        g = P.getGraphics(); 
        g.drawLine(350, 108, 215, 156);
        g.drawLine(390, 108, 525, 156);
        g.drawLine(175, 196, 127, 244);
        g.drawLine(215, 196, 262, 244);
        g.drawLine(525, 196, 478, 244);
        g.drawLine(565, 196, 612, 244);
        System.out.println("Co chay");
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Grapdemo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel D1_4;
    private javax.swing.JLabel D1_5;
    private javax.swing.JLabel D1_6;
    private javax.swing.JLabel D1_7;
    private javax.swing.JLabel D1_8;
    private javax.swing.JLabel D1_9;
    private javax.swing.JLabel D2_4;
    private javax.swing.JLabel D2_5;
    private javax.swing.JLabel D2_6;
    private javax.swing.JLabel D2_7;
    private javax.swing.JLabel D2_8;
    private javax.swing.JLabel D3_4;
    private javax.swing.JLabel D3_5;
    private javax.swing.JLabel D3_6;
    private javax.swing.JLabel D3_7;
    private javax.swing.JLabel D4_4;
    private javax.swing.JLabel D4_5;
    private javax.swing.JLabel D4_6;
    private javax.swing.JLabel D5_4;
    private javax.swing.JLabel D5_5;
    private javax.swing.JLabel D6_4;
    private javax.swing.JLabel JL1;
    private javax.swing.JLabel JL2;
    private javax.swing.JLabel La1P1;
    private javax.swing.JLabel La1P2;
    private javax.swing.JLabel La1P3;
    private javax.swing.JLabel La2P1;
    private javax.swing.JLabel La2P2;
    private javax.swing.JLabel La2P3;
    private javax.swing.JLabel La3P1;
    private javax.swing.JLabel La3P2;
    private javax.swing.JLabel La3P3;
    private javax.swing.JLabel La4P1;
    private javax.swing.JLabel La4P2;
    private javax.swing.JLabel La4P3;
    private javax.swing.JLabel La5P1;
    private javax.swing.JLabel La5P2;
    private javax.swing.JLabel La5P3;
    private javax.swing.JLabel La6P1;
    private javax.swing.JLabel La6P2;
    private javax.swing.JLabel La6P3;
    private javax.swing.JLabel La7P1;
    private javax.swing.JLabel La7P2;
    private javax.swing.JLabel La7P3;
    private javax.swing.JLabel OUTPUTA0;
    private javax.swing.JLabel OUTPUTA1;
    private javax.swing.JLabel OUTPUTA2;
    private javax.swing.JLabel OUTPUTA3;
    private javax.swing.JLabel OUTPUTA4;
    private javax.swing.JLabel OUTPUTA5;
    private javax.swing.JLabel OUTPUTA6;
    private javax.swing.JPanel PAN4Delete;
    private javax.swing.JPanel PAN4SW;
    private javax.swing.JPanel PAN4ShiftDown;
    private javax.swing.JPanel PAN5Delete;
    private javax.swing.JPanel PAN5SW;
    private javax.swing.JPanel PAN5ShiftDown;
    private javax.swing.JPanel PAN6Delete;
    private javax.swing.JPanel PAN6SW;
    private javax.swing.JPanel PAN6ShiftDown;
    private javax.swing.JPanel PAN7Delete;
    private javax.swing.JPanel PAN7SW;
    private javax.swing.JPanel PAN7ShiftDown;
    private javax.swing.JPanel PAN8Delete;
    private javax.swing.JPanel PAN8SW;
    private javax.swing.JPanel PAN8ShiftDown;
    private javax.swing.JPanel PAN9Delete;
    private javax.swing.JPanel PAN9SW;
    private javax.swing.JPanel PAN9ShiftDown;
    private javax.swing.JPanel PANPAGE0;
    private javax.swing.JPanel PANPAGE1;
    private javax.swing.JPanel PANPAGE2;
    private javax.swing.JPanel PANPAGE3;
    private javax.swing.JPanel PANPAGE4;
    private javax.swing.JPanel PANPAGE5;
    private javax.swing.JPanel PANPAGE6;
    private javax.swing.JPanel PANPAGE7;
    private javax.swing.JPanel PANPAGE8;
    private javax.swing.JPanel PANPAGE9;
    private javax.swing.JLabel SD1_4;
    private javax.swing.JLabel SD1_5;
    private javax.swing.JLabel SD1_6;
    private javax.swing.JLabel SD1_7;
    private javax.swing.JLabel SD1_8;
    private javax.swing.JLabel SD1_9;
    private javax.swing.JLabel SD2_4;
    private javax.swing.JLabel SD2_5;
    private javax.swing.JLabel SD2_6;
    private javax.swing.JLabel SD2_7;
    private javax.swing.JLabel SD2_8;
    private javax.swing.JLabel SD2_9;
    private javax.swing.JLabel SD3_4;
    private javax.swing.JLabel SD3_5;
    private javax.swing.JLabel SD3_6;
    private javax.swing.JLabel SD3_7;
    private javax.swing.JLabel SD3_8;
    private javax.swing.JLabel SD4_4;
    private javax.swing.JLabel SD4_5;
    private javax.swing.JLabel SD4_6;
    private javax.swing.JLabel SD4_7;
    private javax.swing.JLabel SD5_4;
    private javax.swing.JLabel SD5_5;
    private javax.swing.JLabel SD5_6;
    private javax.swing.JLabel SD6_4;
    private javax.swing.JLabel SD6_5;
    private javax.swing.JLabel SD7_4;
    private javax.swing.JLabel SW1_4;
    private javax.swing.JLabel SW1_5;
    private javax.swing.JLabel SW1_6;
    private javax.swing.JLabel SW1_7;
    private javax.swing.JLabel SW1_8;
    private javax.swing.JLabel SW1_9;
    private javax.swing.JLabel SW2_4;
    private javax.swing.JLabel SW2_5;
    private javax.swing.JLabel SW2_6;
    private javax.swing.JLabel SW2_7;
    private javax.swing.JLabel SW2_8;
    private javax.swing.JLabel SW2_9;
    private javax.swing.JLabel SW3_4;
    private javax.swing.JLabel SW3_5;
    private javax.swing.JLabel SW3_6;
    private javax.swing.JLabel SW3_7;
    private javax.swing.JLabel SW3_8;
    private javax.swing.JLabel SW4_4;
    private javax.swing.JLabel SW4_5;
    private javax.swing.JLabel SW4_6;
    private javax.swing.JLabel SW4_7;
    private javax.swing.JLabel SW5_4;
    private javax.swing.JLabel SW5_5;
    private javax.swing.JLabel SW5_6;
    private javax.swing.JLabel SW6_4;
    private javax.swing.JLabel SW6_5;
    private javax.swing.JLabel SW7_4;
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler10;
    private javax.swing.Box.Filler filler100;
    private javax.swing.Box.Filler filler101;
    private javax.swing.Box.Filler filler102;
    private javax.swing.Box.Filler filler103;
    private javax.swing.Box.Filler filler104;
    private javax.swing.Box.Filler filler105;
    private javax.swing.Box.Filler filler106;
    private javax.swing.Box.Filler filler108;
    private javax.swing.Box.Filler filler109;
    private javax.swing.Box.Filler filler11;
    private javax.swing.Box.Filler filler110;
    private javax.swing.Box.Filler filler111;
    private javax.swing.Box.Filler filler112;
    private javax.swing.Box.Filler filler113;
    private javax.swing.Box.Filler filler114;
    private javax.swing.Box.Filler filler115;
    private javax.swing.Box.Filler filler117;
    private javax.swing.Box.Filler filler12;
    private javax.swing.Box.Filler filler121;
    private javax.swing.Box.Filler filler122;
    private javax.swing.Box.Filler filler123;
    private javax.swing.Box.Filler filler124;
    private javax.swing.Box.Filler filler125;
    private javax.swing.Box.Filler filler126;
    private javax.swing.Box.Filler filler127;
    private javax.swing.Box.Filler filler129;
    private javax.swing.Box.Filler filler13;
    private javax.swing.Box.Filler filler133;
    private javax.swing.Box.Filler filler134;
    private javax.swing.Box.Filler filler135;
    private javax.swing.Box.Filler filler136;
    private javax.swing.Box.Filler filler137;
    private javax.swing.Box.Filler filler138;
    private javax.swing.Box.Filler filler139;
    private javax.swing.Box.Filler filler14;
    private javax.swing.Box.Filler filler141;
    private javax.swing.Box.Filler filler145;
    private javax.swing.Box.Filler filler146;
    private javax.swing.Box.Filler filler147;
    private javax.swing.Box.Filler filler148;
    private javax.swing.Box.Filler filler15;
    private javax.swing.Box.Filler filler150;
    private javax.swing.Box.Filler filler151;
    private javax.swing.Box.Filler filler153;
    private javax.swing.Box.Filler filler157;
    private javax.swing.Box.Filler filler158;
    private javax.swing.Box.Filler filler159;
    private javax.swing.Box.Filler filler16;
    private javax.swing.Box.Filler filler160;
    private javax.swing.Box.Filler filler162;
    private javax.swing.Box.Filler filler163;
    private javax.swing.Box.Filler filler165;
    private javax.swing.Box.Filler filler169;
    private javax.swing.Box.Filler filler17;
    private javax.swing.Box.Filler filler170;
    private javax.swing.Box.Filler filler171;
    private javax.swing.Box.Filler filler172;
    private javax.swing.Box.Filler filler174;
    private javax.swing.Box.Filler filler175;
    private javax.swing.Box.Filler filler177;
    private javax.swing.Box.Filler filler18;
    private javax.swing.Box.Filler filler181;
    private javax.swing.Box.Filler filler183;
    private javax.swing.Box.Filler filler184;
    private javax.swing.Box.Filler filler187;
    private javax.swing.Box.Filler filler19;
    private javax.swing.Box.Filler filler193;
    private javax.swing.Box.Filler filler195;
    private javax.swing.Box.Filler filler196;
    private javax.swing.Box.Filler filler199;
    private javax.swing.Box.Filler filler2;
    private javax.swing.Box.Filler filler20;
    private javax.swing.Box.Filler filler205;
    private javax.swing.Box.Filler filler207;
    private javax.swing.Box.Filler filler208;
    private javax.swing.Box.Filler filler21;
    private javax.swing.Box.Filler filler211;
    private javax.swing.Box.Filler filler217;
    private javax.swing.Box.Filler filler219;
    private javax.swing.Box.Filler filler22;
    private javax.swing.Box.Filler filler223;
    private javax.swing.Box.Filler filler229;
    private javax.swing.Box.Filler filler23;
    private javax.swing.Box.Filler filler231;
    private javax.swing.Box.Filler filler235;
    private javax.swing.Box.Filler filler24;
    private javax.swing.Box.Filler filler241;
    private javax.swing.Box.Filler filler243;
    private javax.swing.Box.Filler filler247;
    private javax.swing.Box.Filler filler25;
    private javax.swing.Box.Filler filler26;
    private javax.swing.Box.Filler filler27;
    private javax.swing.Box.Filler filler28;
    private javax.swing.Box.Filler filler29;
    private javax.swing.Box.Filler filler3;
    private javax.swing.Box.Filler filler30;
    private javax.swing.Box.Filler filler31;
    private javax.swing.Box.Filler filler32;
    private javax.swing.Box.Filler filler33;
    private javax.swing.Box.Filler filler34;
    private javax.swing.Box.Filler filler35;
    private javax.swing.Box.Filler filler36;
    private javax.swing.Box.Filler filler37;
    private javax.swing.Box.Filler filler38;
    private javax.swing.Box.Filler filler39;
    private javax.swing.Box.Filler filler4;
    private javax.swing.Box.Filler filler40;
    private javax.swing.Box.Filler filler41;
    private javax.swing.Box.Filler filler42;
    private javax.swing.Box.Filler filler43;
    private javax.swing.Box.Filler filler44;
    private javax.swing.Box.Filler filler45;
    private javax.swing.Box.Filler filler46;
    private javax.swing.Box.Filler filler47;
    private javax.swing.Box.Filler filler48;
    private javax.swing.Box.Filler filler49;
    private javax.swing.Box.Filler filler5;
    private javax.swing.Box.Filler filler50;
    private javax.swing.Box.Filler filler51;
    private javax.swing.Box.Filler filler52;
    private javax.swing.Box.Filler filler53;
    private javax.swing.Box.Filler filler54;
    private javax.swing.Box.Filler filler55;
    private javax.swing.Box.Filler filler56;
    private javax.swing.Box.Filler filler57;
    private javax.swing.Box.Filler filler58;
    private javax.swing.Box.Filler filler59;
    private javax.swing.Box.Filler filler6;
    private javax.swing.Box.Filler filler60;
    private javax.swing.Box.Filler filler61;
    private javax.swing.Box.Filler filler62;
    private javax.swing.Box.Filler filler63;
    private javax.swing.Box.Filler filler64;
    private javax.swing.Box.Filler filler65;
    private javax.swing.Box.Filler filler66;
    private javax.swing.Box.Filler filler67;
    private javax.swing.Box.Filler filler68;
    private javax.swing.Box.Filler filler69;
    private javax.swing.Box.Filler filler7;
    private javax.swing.Box.Filler filler70;
    private javax.swing.Box.Filler filler71;
    private javax.swing.Box.Filler filler72;
    private javax.swing.Box.Filler filler73;
    private javax.swing.Box.Filler filler74;
    private javax.swing.Box.Filler filler75;
    private javax.swing.Box.Filler filler76;
    private javax.swing.Box.Filler filler77;
    private javax.swing.Box.Filler filler78;
    private javax.swing.Box.Filler filler79;
    private javax.swing.Box.Filler filler8;
    private javax.swing.Box.Filler filler80;
    private javax.swing.Box.Filler filler81;
    private javax.swing.Box.Filler filler82;
    private javax.swing.Box.Filler filler84;
    private javax.swing.Box.Filler filler85;
    private javax.swing.Box.Filler filler86;
    private javax.swing.Box.Filler filler87;
    private javax.swing.Box.Filler filler88;
    private javax.swing.Box.Filler filler89;
    private javax.swing.Box.Filler filler9;
    private javax.swing.Box.Filler filler90;
    private javax.swing.Box.Filler filler91;
    private javax.swing.Box.Filler filler92;
    private javax.swing.Box.Filler filler93;
    private javax.swing.Box.Filler filler94;
    private javax.swing.Box.Filler filler96;
    private javax.swing.Box.Filler filler97;
    private javax.swing.Box.Filler filler98;
    private javax.swing.Box.Filler filler99;
    private javax.swing.JLabel indexA0;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel107;
    private javax.swing.JLabel jLabel108;
    private javax.swing.JLabel jLabel109;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel110;
    private javax.swing.JLabel jLabel111;
    private javax.swing.JLabel jLabel112;
    private javax.swing.JLabel jLabel113;
    private javax.swing.JLabel jLabel114;
    private javax.swing.JLabel jLabel115;
    private javax.swing.JLabel jLabel116;
    private javax.swing.JLabel jLabel117;
    private javax.swing.JLabel jLabel118;
    private javax.swing.JLabel jLabel119;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel120;
    private javax.swing.JLabel jLabel121;
    private javax.swing.JLabel jLabel122;
    private javax.swing.JLabel jLabel123;
    private javax.swing.JLabel jLabel124;
    private javax.swing.JLabel jLabel125;
    private javax.swing.JLabel jLabel126;
    private javax.swing.JLabel jLabel127;
    private javax.swing.JLabel jLabel128;
    private javax.swing.JLabel jLabel129;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel130;
    private javax.swing.JLabel jLabel131;
    private javax.swing.JLabel jLabel132;
    private javax.swing.JLabel jLabel133;
    private javax.swing.JLabel jLabel134;
    private javax.swing.JLabel jLabel135;
    private javax.swing.JLabel jLabel136;
    private javax.swing.JLabel jLabel137;
    private javax.swing.JLabel jLabel138;
    private javax.swing.JLabel jLabel139;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel140;
    private javax.swing.JLabel jLabel141;
    private javax.swing.JLabel jLabel142;
    private javax.swing.JLabel jLabel143;
    private javax.swing.JLabel jLabel144;
    private javax.swing.JLabel jLabel145;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JLabel pt0;
    private javax.swing.JLabel pt1;
    private javax.swing.JLabel pt2;
    private javax.swing.JLabel pt3;
    private javax.swing.JLabel pt4;
    private javax.swing.JLabel pt5;
    private javax.swing.JLabel pt6;
    private javax.swing.JTextField ptA0;
    private javax.swing.JTextField ptA1;
    private javax.swing.JTextField ptA2;
    private javax.swing.JTextField ptA3;
    private javax.swing.JTextField ptA4;
    private javax.swing.JTextField ptA5;
    private javax.swing.JTextField ptA6;
    private javax.swing.JLabel titleP1;
    // End of variables declaration//GEN-END:variables
}
