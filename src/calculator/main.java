package calculator;

public class main extends javax.swing.JFrame {
    double num, ans;
    int operation;
    public main() {
        initComponents();
    }
    public void arithmeticOperation(){
            //Switches depending on which operation is being done
           switch(operation){
            case 1: //Addition
                ans=num+Double.parseDouble(displayResult.getText());
                displayResult.setText(Double.toString(ans));
                break;
            case 2: //Subtraction
                ans=num-Double.parseDouble(displayResult.getText());
                displayResult.setText(Double.toString(ans));
                break;
            case 3: //Multiplication
                ans=num*Double.parseDouble(displayResult.getText());
                displayResult.setText(Double.toString(ans));
                break;
            case 4: //Division
                //Incase the number is being divided by 0
                if(displayResult.getText().equals("0")){
                    displayResult.setText("ERR");
                }else{
                    ans = num/Double.parseDouble(displayResult.getText());
                    displayResult.setText(Double.toString(ans));
                }
                break;
            case 5: //Mod
                ans =num%Double.parseDouble(displayResult.getText());
                displayResult.setText(Double.toString(ans));
                break;
            } 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CalcBackground = new javax.swing.JPanel();
        seven = new java.awt.Button();
        eight = new java.awt.Button();
        nine = new java.awt.Button();
        six = new java.awt.Button();
        five = new java.awt.Button();
        four = new java.awt.Button();
        one = new java.awt.Button();
        three = new java.awt.Button();
        two = new java.awt.Button();
        zero = new java.awt.Button();
        dot = new java.awt.Button();
        equal = new java.awt.Button();
        plus = new java.awt.Button();
        minus = new java.awt.Button();
        multiply = new java.awt.Button();
        divide = new java.awt.Button();
        mod = new java.awt.Button();
        C = new java.awt.Button();
        AC = new java.awt.Button();
        displayResult = new java.awt.TextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setName("Calculator"); // NOI18N
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);

        CalcBackground.setBackground(new java.awt.Color(0, 0, 0));

        seven.setBackground(new java.awt.Color(153, 153, 153));
        seven.setFont(new java.awt.Font("Retro Gaming", 0, 12)); // NOI18N
        seven.setForeground(new java.awt.Color(255, 255, 255));
        seven.setLabel("7");
        seven.setName("seven"); // NOI18N
        seven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sevenActionPerformed(evt);
            }
        });

        eight.setBackground(new java.awt.Color(153, 153, 153));
        eight.setFont(new java.awt.Font("Retro Gaming", 0, 12)); // NOI18N
        eight.setForeground(new java.awt.Color(255, 255, 255));
        eight.setLabel("8");
        eight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eightActionPerformed(evt);
            }
        });

        nine.setBackground(new java.awt.Color(153, 153, 153));
        nine.setFont(new java.awt.Font("Retro Gaming", 0, 12)); // NOI18N
        nine.setForeground(new java.awt.Color(255, 255, 255));
        nine.setLabel("9");
        nine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nineActionPerformed(evt);
            }
        });

        six.setBackground(new java.awt.Color(153, 153, 153));
        six.setFont(new java.awt.Font("Retro Gaming", 0, 12)); // NOI18N
        six.setForeground(new java.awt.Color(255, 255, 255));
        six.setLabel("6");
        six.setName("six"); // NOI18N
        six.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sixActionPerformed(evt);
            }
        });

        five.setActionCommand("five");
        five.setBackground(new java.awt.Color(153, 153, 153));
        five.setFont(new java.awt.Font("Retro Gaming", 0, 12)); // NOI18N
        five.setForeground(new java.awt.Color(255, 255, 255));
        five.setLabel("5");
        five.setName("five"); // NOI18N
        five.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fiveActionPerformed(evt);
            }
        });

        four.setBackground(new java.awt.Color(153, 153, 153));
        four.setFont(new java.awt.Font("Retro Gaming", 0, 12)); // NOI18N
        four.setForeground(new java.awt.Color(255, 255, 255));
        four.setLabel("4");
        four.setName("four"); // NOI18N
        four.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fourActionPerformed(evt);
            }
        });

        one.setBackground(new java.awt.Color(153, 153, 153));
        one.setFont(new java.awt.Font("Retro Gaming", 0, 12)); // NOI18N
        one.setForeground(new java.awt.Color(255, 255, 255));
        one.setLabel("1");
        one.setName("one"); // NOI18N
        one.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oneActionPerformed(evt);
            }
        });

        three.setBackground(new java.awt.Color(153, 153, 153));
        three.setFont(new java.awt.Font("Retro Gaming", 0, 12)); // NOI18N
        three.setForeground(new java.awt.Color(255, 255, 255));
        three.setLabel("3");
        three.setName("three"); // NOI18N
        three.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                threeActionPerformed(evt);
            }
        });

        two.setBackground(new java.awt.Color(153, 153, 153));
        two.setFont(new java.awt.Font("Retro Gaming", 0, 12)); // NOI18N
        two.setForeground(new java.awt.Color(255, 255, 255));
        two.setLabel("2");
        two.setName("two"); // NOI18N
        two.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                twoActionPerformed(evt);
            }
        });

        zero.setActionCommand("");
        zero.setBackground(new java.awt.Color(153, 153, 153));
        zero.setFont(new java.awt.Font("Retro Gaming", 0, 12)); // NOI18N
        zero.setForeground(new java.awt.Color(255, 255, 255));
        zero.setLabel("0");
        zero.setName("zero"); // NOI18N
        zero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zeroActionPerformed(evt);
            }
        });

        dot.setBackground(new java.awt.Color(153, 153, 153));
        dot.setFont(new java.awt.Font("Retro Gaming", 0, 12)); // NOI18N
        dot.setForeground(new java.awt.Color(255, 255, 255));
        dot.setLabel(".");
        dot.setName("dot"); // NOI18N
        dot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dotActionPerformed(evt);
            }
        });

        equal.setActionCommand("equal");
        equal.setBackground(new java.awt.Color(102, 102, 255));
        equal.setFont(new java.awt.Font("Retro Gaming", 0, 12)); // NOI18N
        equal.setForeground(new java.awt.Color(255, 255, 255));
        equal.setLabel("=");
        equal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                equalActionPerformed(evt);
            }
        });

        plus.setActionCommand("");
        plus.setBackground(new java.awt.Color(255, 102, 51));
        plus.setFont(new java.awt.Font("Retro Gaming", 0, 12)); // NOI18N
        plus.setForeground(new java.awt.Color(255, 255, 255));
        plus.setLabel("+");
        plus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plusActionPerformed(evt);
            }
        });

        minus.setActionCommand("minus");
        minus.setBackground(new java.awt.Color(255, 102, 51));
        minus.setFont(new java.awt.Font("Retro Gaming", 0, 12)); // NOI18N
        minus.setForeground(new java.awt.Color(255, 255, 255));
        minus.setLabel("-");
        minus.setName("minus"); // NOI18N
        minus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minusActionPerformed(evt);
            }
        });

        multiply.setBackground(new java.awt.Color(255, 102, 51));
        multiply.setFont(new java.awt.Font("Retro Gaming", 0, 12)); // NOI18N
        multiply.setForeground(new java.awt.Color(255, 255, 255));
        multiply.setLabel("×");
        multiply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiplyActionPerformed(evt);
            }
        });

        divide.setBackground(new java.awt.Color(255, 102, 51));
        divide.setFont(new java.awt.Font("Retro Gaming", 0, 12)); // NOI18N
        divide.setForeground(new java.awt.Color(255, 255, 255));
        divide.setLabel("÷");
        divide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divideActionPerformed(evt);
            }
        });

        mod.setBackground(new java.awt.Color(255, 102, 51));
        mod.setFont(new java.awt.Font("Retro Gaming", 0, 12)); // NOI18N
        mod.setForeground(new java.awt.Color(255, 255, 255));
        mod.setLabel("%");
        mod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modActionPerformed(evt);
            }
        });

        C.setBackground(new java.awt.Color(204, 0, 51));
        C.setFont(new java.awt.Font("Retro Gaming", 0, 12)); // NOI18N
        C.setForeground(new java.awt.Color(255, 255, 255));
        C.setLabel("C");
        C.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CActionPerformed(evt);
            }
        });

        AC.setActionCommand("AC");
        AC.setBackground(new java.awt.Color(204, 0, 51));
        AC.setFont(new java.awt.Font("Retro Gaming", 0, 12)); // NOI18N
        AC.setForeground(new java.awt.Color(255, 255, 255));
        AC.setLabel("AC");
        AC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ACActionPerformed(evt);
            }
        });

        displayResult.setEditable(false);
        displayResult.setFont(new java.awt.Font("Retro Gaming", 0, 72)); // NOI18N

        javax.swing.GroupLayout CalcBackgroundLayout = new javax.swing.GroupLayout(CalcBackground);
        CalcBackground.setLayout(CalcBackgroundLayout);
        CalcBackgroundLayout.setHorizontalGroup(
            CalcBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CalcBackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(CalcBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CalcBackgroundLayout.createSequentialGroup()
                        .addGroup(CalcBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(equal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(CalcBackgroundLayout.createSequentialGroup()
                                .addGroup(CalcBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(CalcBackgroundLayout.createSequentialGroup()
                                        .addComponent(one, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(two, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(zero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(CalcBackgroundLayout.createSequentialGroup()
                                        .addGroup(CalcBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(seven, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
                                            .addComponent(four, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(10, 10, 10)
                                        .addGroup(CalcBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(eight, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
                                            .addComponent(five, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(CalcBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(dot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(CalcBackgroundLayout.createSequentialGroup()
                                        .addGroup(CalcBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(three, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
                                            .addComponent(nine, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(six, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(0, 0, Short.MAX_VALUE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(CalcBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(minus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(multiply, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(divide, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(mod, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                            .addComponent(plus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(CalcBackgroundLayout.createSequentialGroup()
                        .addComponent(displayResult, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(CalcBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(C, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AC, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        CalcBackgroundLayout.setVerticalGroup(
            CalcBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CalcBackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(CalcBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(CalcBackgroundLayout.createSequentialGroup()
                        .addComponent(AC, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(C, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(displayResult, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CalcBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nine, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eight, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(seven, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mod, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CalcBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CalcBackgroundLayout.createSequentialGroup()
                        .addGroup(CalcBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(six, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                            .addComponent(four, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                            .addComponent(five, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(CalcBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(CalcBackgroundLayout.createSequentialGroup()
                                .addGroup(CalcBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(three, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(two, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(one, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(CalcBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(CalcBackgroundLayout.createSequentialGroup()
                                        .addComponent(minus, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(plus, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(CalcBackgroundLayout.createSequentialGroup()
                                        .addGroup(CalcBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(dot, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(zero, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(equal, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(CalcBackgroundLayout.createSequentialGroup()
                                .addComponent(multiply, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(CalcBackgroundLayout.createSequentialGroup()
                        .addComponent(divide, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        four.getAccessibleContext().setAccessibleName("four");
        three.getAccessibleContext().setAccessibleName("three");
        two.getAccessibleContext().setAccessibleName("two");
        zero.getAccessibleContext().setAccessibleName("zero");
        dot.getAccessibleContext().setAccessibleName("dot");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(CalcBackground, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(CalcBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void oneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oneActionPerformed
        //If there is an "ERR" shown, whichever number chosen will clear it out first
        if(displayResult.getText().equals("ERR")){
            displayResult.setText("");
        }
        displayResult.setText(displayResult.getText() + "1");
    }//GEN-LAST:event_oneActionPerformed

    private void zeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zeroActionPerformed
            if(displayResult.getText().equals("ERR") || displayResult.getText().equals("0")){
                displayResult.setText("");
            }
            displayResult.setText(displayResult.getText() + "0");
        
    }//GEN-LAST:event_zeroActionPerformed

    private void twoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_twoActionPerformed
        if(displayResult.getText().equals("ERR") || displayResult.getText().equals("0")){
                displayResult.setText("");
        }
        displayResult.setText(displayResult.getText() + "2");
    }//GEN-LAST:event_twoActionPerformed

    private void threeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_threeActionPerformed
        if(displayResult.getText().equals("ERR") || displayResult.getText().equals("0")){
                displayResult.setText("");
        }
        displayResult.setText(displayResult.getText() + "3");
    }//GEN-LAST:event_threeActionPerformed

    private void fourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fourActionPerformed
        if(displayResult.getText().equals("ERR") || displayResult.getText().equals("0")){
                displayResult.setText("");
        }
        displayResult.setText(displayResult.getText() + "4");
    }//GEN-LAST:event_fourActionPerformed

    private void fiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fiveActionPerformed
        if(displayResult.getText().equals("ERR") || displayResult.getText().equals("0")){
                displayResult.setText("");
        }
        displayResult.setText(displayResult.getText() + "5");
    }//GEN-LAST:event_fiveActionPerformed

    private void sixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sixActionPerformed
        if(displayResult.getText().equals("ERR") || displayResult.getText().equals("0")){
                displayResult.setText("");
        }
        displayResult.setText(displayResult.getText() + "6");
    }//GEN-LAST:event_sixActionPerformed

    private void sevenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sevenActionPerformed
        if(displayResult.getText().equals("ERR") || displayResult.getText().equals("0")){
                displayResult.setText("");
        }
        displayResult.setText(displayResult.getText() + "7");
    }//GEN-LAST:event_sevenActionPerformed

    private void eightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eightActionPerformed
        if(displayResult.getText().equals("ERR") || displayResult.getText().equals("0")){
                displayResult.setText("");
        }
        displayResult.setText(displayResult.getText() + "8");
    }//GEN-LAST:event_eightActionPerformed

    private void nineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nineActionPerformed

        if(displayResult.getText().equals("ERR") || displayResult.getText().equals("0")){
                displayResult.setText("");
        }
        displayResult.setText(displayResult.getText() + "9");
    }//GEN-LAST:event_nineActionPerformed

    private void plusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plusActionPerformed
        //If there is no number being shown before pressing an operation, the text will display an error
        if(displayResult.getText().equals("") || displayResult.getText().equals(" ")){
            displayResult.setText("ERR");
        }else{
            num = Double.parseDouble(displayResult.getText());
            operation = 1;
            displayResult.setText("");
        }
        
    }//GEN-LAST:event_plusActionPerformed

    private void minusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minusActionPerformed
        if(displayResult.getText().equals("") || displayResult.getText().equals(" ")){
            displayResult.setText("ERR");
        }else{
            num = Double.parseDouble(displayResult.getText());
            operation = 2;
            displayResult.setText("");
        }
    }//GEN-LAST:event_minusActionPerformed

    private void multiplyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multiplyActionPerformed

        if(displayResult.getText().equals("") || displayResult.getText().equals(" ")){
            displayResult.setText("ERR");
        }else{
            num = Double.parseDouble(displayResult.getText());
            operation = 3;
            displayResult.setText("");
        }
    }//GEN-LAST:event_multiplyActionPerformed

    private void divideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divideActionPerformed
        if(displayResult.getText().equals("") || displayResult.getText().equals(" ")){
            displayResult.setText("ERR");
        }else{
            num = Double.parseDouble(displayResult.getText());
            operation = 4;
            displayResult.setText("");
        }
    }//GEN-LAST:event_divideActionPerformed

    private void modActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modActionPerformed
        if(displayResult.getText().equals("") || displayResult.getText().equals(" ")){
            displayResult.setText("ERR");
        }else{
            num = Double.parseDouble(displayResult.getText());
            operation = 5;
            displayResult.setText("");
        }
    }//GEN-LAST:event_modActionPerformed

    private void CActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CActionPerformed
        String displayRes = displayResult.getText();
        displayResult.setText(displayRes.substring(0,displayRes.length()-1));
    }//GEN-LAST:event_CActionPerformed

    private void ACActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ACActionPerformed
        displayResult.setText("");
    }//GEN-LAST:event_ACActionPerformed

    private void dotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dotActionPerformed
        if(displayResult.getText().equals("")){
            displayResult.setText("0");
        }
        //If there is already another ., then the dot would not be added
        if(displayResult.getText().contains(".")){
            displayResult.setText(displayResult.getText());
        }else{
            displayResult.setText(displayResult.getText() + ".");
        }
    }//GEN-LAST:event_dotActionPerformed

    private void equalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_equalActionPerformed
        arithmeticOperation();
    }//GEN-LAST:event_equalActionPerformed
    
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button AC;
    private java.awt.Button C;
    private javax.swing.JPanel CalcBackground;
    private java.awt.TextField displayResult;
    private java.awt.Button divide;
    private java.awt.Button dot;
    private java.awt.Button eight;
    private java.awt.Button equal;
    private java.awt.Button five;
    private java.awt.Button four;
    private java.awt.Button minus;
    private java.awt.Button mod;
    private java.awt.Button multiply;
    private java.awt.Button nine;
    private java.awt.Button one;
    private java.awt.Button plus;
    private java.awt.Button seven;
    private java.awt.Button six;
    private java.awt.Button three;
    private java.awt.Button two;
    private java.awt.Button zero;
    // End of variables declaration//GEN-END:variables
}
