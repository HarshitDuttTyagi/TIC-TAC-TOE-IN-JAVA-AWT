import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class TICTACTOE implements ActionListener
{
    JFrame f;
    JPanel p;
    JButton b[]=new JButton[9];
    public TICTACTOE()
    {
        f=new JFrame("TIC TAC TOE");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(500,500);
        f.getContentPane().setBackground(Color.blue);
        f.setLayout(null);
        p=new JPanel();
        p.setBounds(50,50,150,150);
        p.setLayout(new GridLayout(3,3));
        f.add(p);
        for(int i=0;i<9;i++)
        {
            b[i]=new JButton("");
            b[i].addActionListener(this);
            p.add(b[i]);
        }
        f.setVisible(true);
    }
    int flag=0;
    public void actionPerformed(ActionEvent ob)
    {
        if(flag==0)
        {
        ((JButton)ob.getSource()).setText("X");
        flag=1;
        }
        else
        {
            ((JButton)ob.getSource()).setText("O");
            flag=0;
        }
        if(b[0].getText().equals(b[1].getText())&& b[1].getText().equals(b[2].getText())&& !b[0].getText().equals(""))
        {
            JOptionPane.showMessageDialog(f,b[0].getText()+"wins");
        }
        else if(b[3].getText().equals(b[4].getText())&& b[4].getText().equals(b[5].getText())&& !(b[3].getText().equals("")))
        {
            JOptionPane.showMessageDialog(f,b[3].getText()+" wins");
        }
        else if(b[6].getText().equals(b[7].getText())&& b[7].getText().equals(b[8].getText())&& !(b[6].getText().equals("")))
        {
            JOptionPane.showMessageDialog(f,b[6].getText()+" wins");
        }
        else if(b[0].getText().equals(b[4].getText())&& b[4].getText().equals(b[8].getText())&& !(b[0].getText().equals("")))
        {
            JOptionPane.showMessageDialog(f,b[0].getText()+" wins");
        }
        else if(b[2].getText().equals(b[4].getText())&& b[4].getText().equals(b[6].getText())&& !(b[2].getText().equals("")))
        {
            JOptionPane.showMessageDialog(f,b[2].getText()+" wins");
        }
        else if(b[0].getText().equals(b[3].getText())&& b[3].getText().equals(b[6].getText())&& !(b[0].getText().equals("")))
        {
            JOptionPane.showMessageDialog(f,b[0].getText()+" wins");
        }
        else if(b[1].getText().equals(b[4].getText())&& b[4].getText().equals(b[7].getText())&& !(b[1].getText().equals("")))
        {
            JOptionPane.showMessageDialog(f,b[1].getText()+" wins");
        }
        else if(b[2].getText().equals(b[5].getText())&& b[5].getText().equals(b[8].getText())&& !(b[2].getText().equals("")))
        {
            JOptionPane.showMessageDialog(f,b[2].getText()+" wins");
        }
        else if(!b[0].getText().equals("")&&!b[1].getText().equals("")&&!(b[2].getText().equals(""))&&!(b[3].getText().equals(""))&&!(b[4].getText().equals(""))&&!(b[5].getText().equals(""))&&!(b[6].getText().equals(""))&&!(b[7].getText().equals(""))&&!(b[8].getText().equals("")))
        {
            JOptionPane.showMessageDialog(f," Nobody Wins");
        }

    }
    public static void main(String a[])
    {
        new TICTACTOE();
    }
}