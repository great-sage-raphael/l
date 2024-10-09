import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class Calculator implements ActionListener
{
JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bdiv,bmul,badd,bsub,bdec,beq,bclr,bdlt;
JFrame jf;
JTextField t;
int operation,result;
int a,b;
 Calculator()
 {
    jf=new JFrame();
    jf.setTitle("CALCULATOR");
    
    t=new JTextField();
    jf.add(t);
    jf.setLayout(new GridLayout(2,1));
    JPanel jp =new JPanel();
    jp.setBackground(Color.gray);
    jp.setLayout(new GridLayout(3,5));
    jf.add(jp);
    b1=new JButton("1");
    b2=new JButton("2");
    b3=new JButton("3");
    b4=new JButton("4");
    b5=new JButton("5");
    b6=new JButton("6");
    b7=new JButton("7");
    b8=new JButton("8");
    b9=new JButton("9");
    b0=new JButton("0");
    bdiv=new JButton("/");
    bmul=new JButton("*");
    badd=new JButton("+");
    bsub=new JButton("-");
    bdec=new JButton(".");
    beq= createbutton("=");
    bclr=createbutton("CLEAR");
    bdlt=createbutton("delete");
    
    jp.add(b1);
    jp.add(b2);
    jp.add(b3);
    jp.add(b4);
    jp.add(b5);
    jp.add(b6);
    jp.add(b7);
    jp.add(b8);
    jp.add(b9);
    jp.add(b0);
    jp.add(bdiv);
    jp.add(bmul);
    jp.add(badd);
    jp.add(bsub);
    jp.add(bdec);
    jp.add(beq);
    jp.add(bclr);
    jp.add(bdlt);

    b1.addActionListener(this);
    b2.addActionListener(this);
    b3.addActionListener(this);
    b4.addActionListener(this);
    b5.addActionListener(this);
    b6.addActionListener(this);
    b7.addActionListener(this);
    b8.addActionListener(this);
    b9.addActionListener(this);
    b0.addActionListener(this);
    bdiv.addActionListener(this);
    bmul.addActionListener(this);
    badd.addActionListener(this);
    bsub.addActionListener(this);
    bdec.addActionListener(this);
    beq.addActionListener(this);
    bsub.addActionListener(this);
    bclr.addActionListener(this);
    bdlt.addActionListener(this);
    jf.setVisible(true);
    jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    jf.setSize(400,400);
 }
 
 public JButton createbutton(String label)
 {
    JButton button=new JButton(label);
    button.addActionListener(this);
    button.setBackground(Color.RED);
    return button;
 }
 public void actionPerformed(ActionEvent e)
 {
    if(e.getSource()==b0){
        t.setText(t.getText().concat("0"));
        }
        else if(e.getSource()==b1){
        t.setText(t.getText().concat("1"));
        }
        else if(e.getSource()==b2){
        t.setText(t.getText().concat("2"));
        }
        else if(e.getSource()==b3){
        t.setText(t.getText().concat("3"));
        }
        else if(e.getSource()==b4){
        t.setText(t.getText().concat("4"));
        }
        else if(e.getSource()==b5){
        t.setText(t.getText().concat("5"));
        }
        else if(e.getSource()==b6){
        t.setText(t.getText().concat("6"));
        }
        else if(e.getSource()==b7){
        t.setText(t.getText().concat("7"));
        }
        else if(e.getSource()==b8){
        t.setText(t.getText().concat("8"));
        }
        else if(e.getSource()==b9){
        t.setText(t.getText().concat("9"));
        }
        else if(e.getSource()==bdec){
        t.setText(t.getText().concat("."));
        }
        else if(e.getSource()==badd){
         a=Integer.parseInt(t.getText());
         operation= 1;
        t.setText("");
        }
        else if(e.getSource()==bsub){
         a=Integer.parseInt(t.getText());
        operation= 2;
        t.setText("");
        }
        else if(e.getSource()==bdiv){
        a=Integer.parseInt(t.getText());
        operation= 3;
        t.setText("");
        }
        else if(e.getSource()==bmul){
         a=Integer.parseInt(t.getText());
       operation= 4;
        t.setText("");
        }
        else if(e.getSource()==bclr){
        t.setText("");
        }
        else if(e.getSource()==bdlt){
        t.setText(t.getText().substring(0,t.getText().length()-1));
        }
        else if(e.getSource()==beq){
         b=Integer.parseInt(t.getText());
        switch(operation){
        case 1:
        result=a+b;
        break;
        case 2:
        result=a-b;
        break;
        case 3:
        result=a/b;
        break;
        case 4:
          result=a*b;
        break;
        }
        t.setText(" "+result);
        }
        
 }


  public static void main(String args[])
  {
    new Calculator();
    

  }
}
