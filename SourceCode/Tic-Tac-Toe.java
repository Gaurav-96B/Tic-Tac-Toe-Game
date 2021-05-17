package JavaGame;
import java.awt.*;
import java.awt.event.*;
class awt extends Frame implements ActionListener
{
Button b[]=new Button[9];
int x=100;
int y=100;
int w=100;
int h=100;
awt()
{
setLayout(null);
Font f=new Font("Forte",Font.BOLD ,30);
setFont(f);
int k=0;
for(int i=0;i<3;i++)
{
for(int j=0;j<3;j++)
{
b[k]=new Button("");
b[k].setSize(w,h);
b[k].setLocation(x,y);
add(b[k]);
b[k].addActionListener(this);
k++;
x=x+100;
}
x=100;
y=y+100;
}
}
int c=0;
public void actionPerformed(ActionEvent e)
{
Button b1=(Button)e.getSource();
if(c%2==0)
{
b1.setLabel("x");
}
else
{
b1.setLabel("0");
}
b1.removeActionListener(this);
c++;
if(
(b[0].getLabel()=="x" && b[1].getLabel()=="x" && b[2].getLabel()=="x")
||
(b[3].getLabel()=="x" && b[4].getLabel()=="x" && b[5].getLabel()=="x")
||
(b[6].getLabel()=="x" && b[7].getLabel()=="x" && b[8].getLabel()=="x")
||
(b[0].getLabel()=="x" && b[3].getLabel()=="x" && b[6].getLabel()=="x")
||
(b[1].getLabel()=="x" && b[4].getLabel()=="x" && b[7].getLabel()=="x")
||
(b[2].getLabel()=="x" && b[5].getLabel()=="x" && b[8].getLabel()=="x")
||
(b[0].getLabel()=="x" && b[4].getLabel()=="x" && b[8].getLabel()=="x")
||
(b[2].getLabel()=="x" && b[4].getLabel()=="x" && b[6].getLabel()=="x"))
{
System.out.println("player one is winner");
}
else if(
(b[0].getLabel()=="0" && b[1].getLabel()=="0" && b[2].getLabel()=="0")
||
(b[3].getLabel()=="0" && b[4].getLabel()=="0" && b[5].getLabel()=="0")
||
(b[6].getLabel()=="0" && b[7].getLabel()=="0" && b[8].getLabel()=="0")
||
(b[0].getLabel()=="0" && b[3].getLabel()=="0" && b[6].getLabel()=="0")
||
(b[1].getLabel()=="0" && b[4].getLabel()=="0" && b[7].getLabel()=="0")
||
(b[2].getLabel()=="0" && b[5].getLabel()=="0" && b[8].getLabel()=="0")
||
(b[0].getLabel()=="0" && b[4].getLabel()=="0" && b[8].getLabel()=="0")
||
(b[2].getLabel()=="0" && b[4].getLabel()=="0" && b[6].getLabel()=="0"))
{
System.out.println("player two is winner");
}
else if(c==9)
{
System.out.println("Draw");
}
}
}
public class Tic-Tac-Toe
{
public static void main(String args[])
{
awt a=new awt();
a.setVisible(true);
a.setSize(500,500);
a.setLocation(300,200);
a.setTitle("Tic-Tac-Toe");
a.setBackground(Color.RED);
a.addWindowListener(new WindowAdapter(){public void windowClosing(WindowEvent e){System.exit(0);}});
}
}
