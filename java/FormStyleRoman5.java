/*
 * FormStyleRoman5.java - Script Generator for Glass Shutters to NT specifications, all corners rounded.
 * Copyright (C) 2012, 2013, 2014, 2015  Donald G Gray
 *
 * http://gray10.com/
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see http://www.gnu.org/licenses/.
 *
 */

import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import java.io.*;
import javax.swing.UIManager.*;
import java.text.*;

public class FormStyleRoman5 extends JDialog
{
	/*
	 * version 1.0.20
	 *
	 */

   private JTextField aField = new JTextField();
   private JTextField bField = new JTextField();
   private JTextField cField = new JTextField();
   private JTextField dField = new JTextField();
   private JTextField eField = new JTextField();
   private JTextField fField = new JTextField();
   private JTextField gField = new JTextField();
   private JTextField hField = new JTextField();
   private JTextField iField = new JTextField();
   private JTextField jField = new JTextField();
   private JTextField kField = new JTextField();
   private JTextField lh1Field = new JTextField();
   private JTextField lh2Field = new JTextField();
   private JTextField lh3Field = new JTextField();
   private JTextField rh1Field = new JTextField();
   private JTextField rh2Field = new JTextField();
   private JTextField rh3Field = new JTextField();
   private JTextField apexField = new JTextField();

   private JDialog frame = FormStyleRoman5.this;

   private static String title = "Roman (5 hinges) (inside view)";

   public FormStyleRoman5()
   {
		setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
      setModal(true);
      setSize(450,620);
      setLocation(100,80);
      setTitle(title);

      Container contentPane = getContentPane();
      contentPane.setLayout(null);

      JLabel aLabel = new JLabel("A (top left)");
      aLabel.setBounds(25,20,175,30);
      contentPane.add(aLabel);
      aField.setBounds(200,20,65,30);
      contentPane.add(aField);

      JLabel bLabel = new JLabel("B (top right)");
      bLabel.setBounds(25,50,175,30);
      contentPane.add(bLabel);
      bField.setBounds(200,50,65,30);
      contentPane.add(bField);

      JLabel cLabel = new JLabel("C (left top)");
      cLabel.setBounds(25,80,175,30);
      contentPane.add(cLabel);
      cField.setBounds(200,80,65,30);
      //contentPane.add(cField);

      JLabel dLabel = new JLabel("D (right top)");
      dLabel.setBounds(25,110,175,30);
      contentPane.add(dLabel);
      dField.setBounds(200,110,65,30);
      //contentPane.add(dField);

      JLabel eLabel = new JLabel("E (left bottom)");
      eLabel.setBounds(25,140,175,30);
      contentPane.add(eLabel);
      eField.setBounds(200,140,65,30);
      contentPane.add(eField);

      JLabel fLabel = new JLabel("F (right bottom)");
      fLabel.setBounds(25,170,175,30);
      contentPane.add(fLabel);
      fField.setBounds(200,170,65,30);
      contentPane.add(fField);

      JLabel gLabel = new JLabel("G (bottom left)");
      gLabel.setBounds(25,200,175,30);
      contentPane.add(gLabel);
      gField.setBounds(200,200,65,30);
      contentPane.add(gField);

      JLabel hLabel = new JLabel("H (bottom right)");
      hLabel.setBounds(25,230,175,30);
      contentPane.add(hLabel);
      hField.setBounds(200,230,65,30);
      contentPane.add(hField);

      JLabel iLabel = new JLabel("I (left glazing bar)");
      iLabel.setBounds(25,260,175,30);
      contentPane.add(iLabel);
      iField.setBounds(200,260,65,30);
      //contentPane.add(iField);

      JLabel jLabel = new JLabel("J (right glazing bar)");
      jLabel.setBounds(25,290,175,30);
      contentPane.add(jLabel);
      jField.setBounds(200,290,65,30);
      //contentPane.add(jField);

      JLabel kLabel = new JLabel("K (top flap)");
      kLabel.setBounds(25,320,175,30);
      contentPane.add(kLabel);
      kField.setBounds(200,320,65,30);
      //contentPane.add(kField);

      JLabel lhLabel = new JLabel("LH1 - LH3 (left hinges)");
      lhLabel.setBounds(25,350,175,30);
      contentPane.add(lhLabel);
      lh1Field.setBounds(200,350,65,30);
      contentPane.add(lh1Field);

      lh2Field.setBounds(270,350,65,30);
      contentPane.add(lh2Field);

      lh3Field.setBounds(340,350,65,30);
      contentPane.add(lh3Field);

      JLabel rhLabel = new JLabel("RH1 - RH3 (right hinges)");
      rhLabel.setBounds(25,380,175,30);
      contentPane.add(rhLabel);
      rh1Field.setBounds(200,380,65,30);
      contentPane.add(rh1Field);

      rh2Field.setBounds(270,380,65,30);
      contentPane.add(rh2Field);

      rh3Field.setBounds(340,380,65,30);
      contentPane.add(rh3Field);

      JLabel apexLabel = new JLabel("Apex");
      apexLabel.setBounds(25,410,175,30);
      contentPane.add(apexLabel);
      apexField.setBounds(200,410,65,30);
      contentPane.add(apexField);

      JPanel buttonPanel = new JPanel();
      JButton goButton = new JButton("Continue");
      buttonPanel.add(goButton);
      buttonPanel.setBounds(25,500,240,50);
      contentPane.add(buttonPanel);

      GoAction goAction = new GoAction();

      goButton.addActionListener(goAction);
	}

   public double getA()
   {
      return Double.parseDouble(aField.getText());
   }

   public double getB()
   {
      return Double.parseDouble(bField.getText());
   }

   //public double getC()
   //{
   //   return Double.parseDouble(cField.getText());
   //}

   //public double getD()
   //{
   //   return Double.parseDouble(dField.getText());
   //}

   public double getE()
   {
      return Double.parseDouble(eField.getText());
   }

   public double getF()
   {
      return Double.parseDouble(fField.getText());
   }

   public double getG()
   {
      return Double.parseDouble(gField.getText());
   }

   public double getH()
   {
      return Double.parseDouble(hField.getText());
   }

   //public double getI()
   //{
   //   return Double.parseDouble(iField.getText());
   //}

   //public double getJ()
   //{
   //   return Double.parseDouble(jField.getText());
   //}

   //public double getK()
   //{
   //   return Double.parseDouble(kField.getText());
   //}

   public double getLH1()
   {
      return Double.parseDouble(lh1Field.getText());
   }

   public double getLH2()
   {
      return Double.parseDouble(lh2Field.getText());
   }

   public double getLH3()
   {
      return Double.parseDouble(lh3Field.getText());
   }

   public double getRH1()
   {
      return Double.parseDouble(rh1Field.getText());
   }

   public double getRH2()
   {
      return Double.parseDouble(rh2Field.getText());
   }

   public double getRH3()
   {
      return Double.parseDouble(rh3Field.getText());
   }

   public double getApex()
   {
      return Double.parseDouble(apexField.getText());
   }

   private class GoAction implements ActionListener
   {
      public void actionPerformed(ActionEvent a)
      {
         setVisible(false);
      }
   }
}