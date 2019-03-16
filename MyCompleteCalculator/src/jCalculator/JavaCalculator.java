package jCalculator;

/**
 *      File Name:  JavaCalculator
 *  Programmed By:  Joseph Calarco
 * Programmed For:  Mr. Salavati
 *           Date:  16 Mar, 2019
 *    Description:  This calculator program takes input from the user in a text box, converts it to a double,
 *                  stores which operation the user would like to perform (multiplication, division, subtraction
 *                  , addition, square root, powers), then evaluates the users input, displaying the solution.
 *                  **Note: This is a modification of the MyCalculator program
 */

public class JavaCalculator extends javax.swing.JFrame {
        
//Variable Declarations
    private double num1 = 0.0; //This Variable stores the value set by the plus button
    private double num2 = 0.0; //This variable stores the value set by the equal button
    char operator;             //This variable stores the character of the operator selected by the user


    /** Creates new form JavaCalculator */
    public JavaCalculator() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtDisplay = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        btnOne = new javax.swing.JButton();
        btnTwo = new javax.swing.JButton();
        btnThree = new javax.swing.JButton();
        btnFour = new javax.swing.JButton();
        btnFive = new javax.swing.JButton();
        btnSix = new javax.swing.JButton();
        btnSeven = new javax.swing.JButton();
        btnEight = new javax.swing.JButton();
        btnNine = new javax.swing.JButton();
        btnZero = new javax.swing.JButton();
        btnDecimal = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btnPlus = new javax.swing.JButton();
        btnEquals = new javax.swing.JButton();
        btnMinus = new javax.swing.JButton();
        btnMultiply = new javax.swing.JButton();
        btnDivide = new javax.swing.JButton();
        btnSqrt = new javax.swing.JButton();
        btnSq = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculator");
        setBackground(new java.awt.Color(25, 25, 112));

        btnOne.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnOne.setText("1");
        btnOne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOneActionPerformed(evt);
            }
        });

        btnTwo.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnTwo.setText("2");
        btnTwo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTwoActionPerformed(evt);
            }
        });

        btnThree.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnThree.setText("3");
        btnThree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThreeActionPerformed(evt);
            }
        });

        btnFour.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnFour.setText("4");
        btnFour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFourActionPerformed(evt);
            }
        });

        btnFive.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnFive.setText("5");
        btnFive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFiveActionPerformed(evt);
            }
        });

        btnSix.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnSix.setText("6");
        btnSix.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSixActionPerformed(evt);
            }
        });

        btnSeven.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnSeven.setText("7");
        btnSeven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSevenActionPerformed(evt);
            }
        });

        btnEight.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnEight.setText("8");
        btnEight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEightActionPerformed(evt);
            }
        });

        btnNine.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnNine.setText("9");
        btnNine.setToolTipText("");
        btnNine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNineActionPerformed(evt);
            }
        });

        btnZero.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnZero.setText("0");
        btnZero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnZeroActionPerformed(evt);
            }
        });

        btnDecimal.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnDecimal.setText(".");
        btnDecimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDecimalActionPerformed(evt);
            }
        });

        btnClear.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnClear.setText("Cl");
        btnClear.setToolTipText("");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnOne, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnTwo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnThree, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnFour, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnFive, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSix, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnSeven, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEight, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnNine, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnZero, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnDecimal, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(8, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnOne, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTwo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnThree, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFour, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFive, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSix, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSeven, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEight, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNine, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnZero, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDecimal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnPlus.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnPlus.setText("+");
        btnPlus.setToolTipText("");
        btnPlus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlusActionPerformed(evt);
            }
        });

        btnEquals.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnEquals.setText("=");
        btnEquals.setToolTipText("");
        btnEquals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEqualsActionPerformed(evt);
            }
        });

        btnMinus.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnMinus.setText("-");
        btnMinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinusActionPerformed(evt);
            }
        });

        btnMultiply.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnMultiply.setText("*");
        btnMultiply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMultiplyActionPerformed(evt);
            }
        });

        btnDivide.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnDivide.setText("/");
        btnDivide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDivideActionPerformed(evt);
            }
        });

        btnSqrt.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        btnSqrt.setText("Sqrt");
        btnSqrt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSqrtActionPerformed(evt);
            }
        });

        btnSq.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        btnSq.setText("X^Y");
        btnSq.setToolTipText("");
        btnSq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSqActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btnSqrt, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnSq, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(btnPlus, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(btnMultiply, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnDivide, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(btnEquals, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPlus, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMultiply, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDivide, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSqrt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSq, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEquals, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtDisplay))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(53, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)))
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //ButtonEvents -- Actions that happen as a result of pressing buttons in the application
    //Button number '2'
    private void btnTwoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTwoActionPerformed
        String btnTwoText = txtDisplay.getText() + btnTwo.getText(); //Adds string stored in button to string in text box
        txtDisplay.setText(btnTwoText);                              //Displays the newly formed string
    }//GEN-LAST:event_btnTwoActionPerformed
    //Button number '3'
    private void btnThreeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThreeActionPerformed
        String btnThreeText = txtDisplay.getText() + btnThree.getText(); //Adds string stored in button to string in text box
        txtDisplay.setText(btnThreeText);                                //Displays the newly formed string
    }//GEN-LAST:event_btnThreeActionPerformed
    //Button number '4'
    private void btnFourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFourActionPerformed
        String btnFourText = txtDisplay.getText() + btnFour.getText(); //Adds string stored in button to string in text box
        txtDisplay.setText(btnFourText);                               //Displays the newly formed string
    }//GEN-LAST:event_btnFourActionPerformed
    //Button number '5'
    private void btnFiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiveActionPerformed
        String btnFiveText = txtDisplay.getText() + btnFive.getText(); //Adds string stored in button to string in text box
        txtDisplay.setText(btnFiveText);                               //Displays the newly formed string
    }//GEN-LAST:event_btnFiveActionPerformed
    //Button number '6'
    private void btnSixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSixActionPerformed
        String btnSixText = txtDisplay.getText() + btnSix.getText(); //Adds string stored in button to string in text box
        txtDisplay.setText(btnSixText);                              //Displays the newly formed string
    }//GEN-LAST:event_btnSixActionPerformed
    //Button number '7'
    private void btnSevenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSevenActionPerformed
        String btnSevenText = txtDisplay.getText() + btnSeven.getText(); //Adds string stored in button to string in text box
        txtDisplay.setText(btnSevenText);                                //Displays the newly formed string
    }//GEN-LAST:event_btnSevenActionPerformed
    //Button number '8'
    private void btnEightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEightActionPerformed
        String btnEightText = txtDisplay.getText() + btnEight.getText(); //Adds string stored in button to string in text box
        txtDisplay.setText(btnEightText);                                //Displays the newly formed string
    }//GEN-LAST:event_btnEightActionPerformed
    //Button number '9'
    private void btnNineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNineActionPerformed
        String btnNineText = txtDisplay.getText() + btnNine.getText(); //Adds string stored in button to string in text box
        txtDisplay.setText(btnNineText);                               //Displays the newly formed string
    }//GEN-LAST:event_btnNineActionPerformed
    //Button number '0'
    private void btnZeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnZeroActionPerformed
        String btnZeroText = txtDisplay.getText() + btnZero.getText(); //Adds string stored in button to string in text box
        txtDisplay.setText(btnZeroText);                               //Displays the newly formed string
    }//GEN-LAST:event_btnZeroActionPerformed
    // '+' Button
    private void btnPlusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlusActionPerformed
        num1 = num1 + Double.parseDouble(txtDisplay.getText()); //Adds the current value of total1 to the value of the textbox converted to a double
        txtDisplay.setText("");                                 //Clears the text box so a new number may be entered
        operator = '+';                                         //Defines the character of the opperator
    }//GEN-LAST:event_btnPlusActionPerformed
    /*
    *      Description: Functions to perform various math operations (+ - * / sqrt ^) on the user input
    *     Pre-Conditon: These are all functions which evaluate the users input
    *                   In order for these functions to work the user must supply
    *                   two values (In the case of the squareRoot function the program
    *                   automatically supplies the second value).
    *
    *   Post-Condition: After these functions are completed they each return a double value
    *                   which is the solution of their respected operations
    */
    
    //Function for addition
    private static double addition(double total1, double total2){
        double solution = total1 + total2;          //Creates the variable 'solution' equalled to the two values added together
        return solution;                            //Returns solution
    }
    //Function for subtraction
    private static double subtraction(double total1, double total2){
        double solution = total1 - total2;          //Creates the variable 'solution' equalled to the second value subtracted from the first
        return solution;                            //Returns solution
    }
    //Function for multiplication
    private static double multiply(double total1, double total2){
        double solution = total1 * total2;          //Creates the variable 'solution' equalled to the two values mulitplied together
        return solution;                            //Returns solution
    }
    //Function for division
    private static double division(double total1, double total2){
        double solution = total1 / total2;          //Creates the variable 'solution' equalled to the first value divided by the second
        return solution;                            //Returns solution
    }
    //Function for squarerooting
    //**This function only requires one value
    private static double squareRoot(double total1){
        double solution = Math.sqrt(total1);        //Creates the variable 'solution' equalled to the square root of a single value using the Math.sqrt function
        return solution;                            //returns solution
    }
    //Function for raising to powers
    private static double square(double total1, double total2){
        double solution = Math.pow(total1, total2); ////Creates the variable 'solution' equalled to the first value raised to the power of the second using the Math.pow function
        return solution;                            //Returns solution
    }
    //'=' Button   
    private void btnEqualsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEqualsActionPerformed
        double solution;
        
        /*
        *   This short for loop checks to see if the text field is blank
        *   which is the case with the square root function, if blank it 
        *   simply makes num2 equal to zero in order to prevent an error
        *   from trying to make num2 equal a value that isn't there.
        */
        if (txtDisplay.getText().equals("")){                       //Checks if txtDisplay is blank upon pressing the equal button
            num2 = 0.0;                                             //Makes num2 equal to zero
        } else {                                                    //For all other situations
                  num2 = Double.parseDouble(txtDisplay.getText());  //Makes num2 equal to the number that is typed into the display
                    }
        
        
        /*
        *   This switch loop has cases which check for what operator the user 
        *   has inputed into the calculator, then directs the program to the
        *   corresponding function and outputs the solution
        */
        switch(operator){                                       //creates switch function that checks the operator variable (which is a char) for each case
            case '+':                                           //case for addition
                solution = addition(num1, num2);                //calls the addition function
                txtDisplay.setText(Double.toString(solution));  //Sets display to show solution
                break;                                          //ends the switch loop
            case '-':                                           //case for subtraction
                solution = subtraction(num1, num2);             //Calls the subtraction function
                txtDisplay.setText(Double.toString(solution));  //Sets display to show solution
                break;                                          //Ends the switch loop
            case '*':                                           //case for multiplication
                solution = multiply(num1, num2);                //Calls the multiplication function
                txtDisplay.setText(Double.toString(solution));  //Sets display to show solution
                break;                                          //Ends the switch loop
            case '/':                                           //case for division
                solution = division(num1, num2);                //Calls the division function
                txtDisplay.setText(Double.toString(solution));  //Sets display to show solution
                break;                                          //Ends the switch loop
            case 's':                                           //case for square rooting
                solution = squareRoot(num1);                    //Calls the squareroot function
                txtDisplay.setText(Double.toString(solution));  //Sets display to show solution
                break;                                          //Ends the switch loop
            case '^':                                           //Case for raising powers
                solution = square(num1, num2);                  //Calls the raising to powers function
                txtDisplay.setText(Double.toString(solution));  //Sets display to show solution
                break;                                          //Ends the switch loop 
        }
        
       num1 = 0.0;                                              //Clears the value stored in total1 to allow for a new equation to begin
    }//GEN-LAST:event_btnEqualsActionPerformed
    // 'Cl' Button (Clear)
    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        num2 = 0.0;                                                          //Clears value from total2 by setting it to zero
        txtDisplay.setText("");                                              //Clears all text from the textbox
    }//GEN-LAST:event_btnClearActionPerformed
    //Button number '1'
    private void btnOneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOneActionPerformed
        String btnOneText = txtDisplay.getText() + btnOne.getText();         //Adds string stored in button to string in text box
        txtDisplay.setText(btnOneText);                                      //Displays the newly formed string
    }//GEN-LAST:event_btnOneActionPerformed
    //Button for '.' (decimal point)
    private void btnDecimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDecimalActionPerformed
        String btnDecimalText = txtDisplay.getText() + btnDecimal.getText(); //Adds string stored in button to string in the text box
        txtDisplay.setText(btnDecimalText);                                  //Displays the newly formed string
    }//GEN-LAST:event_btnDecimalActionPerformed
    // '-' Button (minus)
    private void btnMinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinusActionPerformed
        num1 = num1 + Double.parseDouble(txtDisplay.getText()); //Adds the current value of total1 to the value of the textbox converted to a double
        txtDisplay.setText("");                                 //Clears text box
        operator = '-';                                         //Defines the character of the opperator
    }//GEN-LAST:event_btnMinusActionPerformed
    // '*' Button (multiplication)
    private void btnMultiplyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMultiplyActionPerformed
        num1 = num1 + Double.parseDouble(txtDisplay.getText()); //Adds the current value of total1 to the value of the textbox converted to a double
        txtDisplay.setText("");                                 //Clears text box
        operator = '*';                                         //Defines the character of the opperator
    }//GEN-LAST:event_btnMultiplyActionPerformed
    // '/' Button (division)
    private void btnDivideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDivideActionPerformed
        num1 = num1 + Double.parseDouble(txtDisplay.getText()); //Adds the current value of total1 to the value of the textbox converted to a double
        txtDisplay.setText("");                                 //Clears text box
        operator = '/';                                         //Defines the character of the opperator
    }//GEN-LAST:event_btnDivideActionPerformed
    // 'Sqrt' Button (Square Root)
    private void btnSqrtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSqrtActionPerformed
        num1 = num1 + Double.parseDouble(txtDisplay.getText()); //Adds the current value of total1 to the value of the textbox converted to a double
                                                                //**Note no clear textbox because no secondary input needed for squareroot
        operator = 's';                                         //Defines the character of the opperator
    }//GEN-LAST:event_btnSqrtActionPerformed
    // 'X^Y' Button (number to the power of second number)
    private void btnSqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSqActionPerformed
        num1 = num1 + Double.parseDouble(txtDisplay.getText()); //Adds the current value of total1 to the value of the textbox converted to a double
        txtDisplay.setText("");                                 //Clears text box
        operator = '^';                                         //Defines the character of the opperator
    }//GEN-LAST:event_btnSqActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JavaCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JavaCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JavaCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JavaCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JavaCalculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDecimal;
    private javax.swing.JButton btnDivide;
    private javax.swing.JButton btnEight;
    private javax.swing.JButton btnEquals;
    private javax.swing.JButton btnFive;
    private javax.swing.JButton btnFour;
    private javax.swing.JButton btnMinus;
    private javax.swing.JButton btnMultiply;
    private javax.swing.JButton btnNine;
    private javax.swing.JButton btnOne;
    private javax.swing.JButton btnPlus;
    private javax.swing.JButton btnSeven;
    private javax.swing.JButton btnSix;
    private javax.swing.JButton btnSq;
    private javax.swing.JButton btnSqrt;
    private javax.swing.JButton btnThree;
    private javax.swing.JButton btnTwo;
    private javax.swing.JButton btnZero;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtDisplay;
    // End of variables declaration//GEN-END:variables
}