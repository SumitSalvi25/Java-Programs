import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class  npad extends JFrame implements ActionListener
{
	String str;
	JMenuBar mb;
	JMenu f,e,v,fo,h;
	JMenuItem n,o,s,sa,ex,c,co,p,font,an;
	JCheckBoxMenuItem stb;
	static JTextArea tx;
	static JPopupMenu pop;
	JMenuItem cc,coo,pa,rf;
	JDialog df;
	JLabel l;
	Mydialog md;
	HelpDialog hd;

	public npad(String ss)
	{
		//setLayout(BorderLayout());
		super(ss);
		setSize(500,500);
		mb=new JMenuBar();

		pop=new JPopupMenu();
		cc=new JMenuItem("Cut");
		coo=new JMenuItem("Copy");
		pa=new JMenuItem("Paste");
		rf=new JMenuItem("Refresh");

		pop.add(cc);
		pop.add(coo);
		pop.add(pa);
		pop.add(rf);

		 popp po=new popp();
		 this.addMouseListener(po);

		f=new JMenu("File");
		e=new JMenu("Edit");
		v=new JMenu("View");
		fo=new JMenu("Format");
		h=new JMenu("Help");
		df=new JDialog();

		n=new JMenuItem("New");
		o=new JMenuItem("Open");
		s=new JMenuItem("Save");
		sa=new JMenuItem("Save As");
		ex=new JMenuItem("Exit");
		c=new JMenuItem("Cut");
		co=new JMenuItem("Copy");
		p=new JMenuItem("Paste");
		cc=new JMenuItem("Cut");
	    coo=new JMenuItem("Copy");
		pa=new JMenuItem("Paste");
		font=new JMenuItem("Font....");
		an=new JMenuItem("About Notepad");
		stb=new JCheckBoxMenuItem("StatusBar");

		tx=new JTextArea();
		l=new JLabel("");



		setJMenuBar(mb);
		add(tx);

		mb.add(f);
		mb.add(e);
		mb.add(v);
		mb.add(fo);
		mb.add(h);

		f.add(n);
		f.add(o);
		f.add(s);
		f.add(sa);
		f.addSeparator();
		f.add(ex);

		e.add(c);
		e.add(co);
		e.add(p);

		v.add(stb);

		fo.add(font);
		h.add(an);
		md=new Mydialog(this,"FONT",true);
		hd=new HelpDialog(this,"Help",true);


		n.addActionListener(this);
		o.addActionListener(this);
		s.addActionListener(this);
		sa.addActionListener(this);
		ex.addActionListener(this);
		c.addActionListener(this);
		co.addActionListener(this);
		p.addActionListener(this);
		cc.addActionListener(this);
		coo.addActionListener(this);
		pa.addActionListener(this);
		font.addActionListener(this);
		an.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e)
	{
		int x,y;
		if(e.getSource()==ex)
		{
			System.exit(0);
		}
		if(e.getSource()==c)
		{
			x=tx.getSelectionStart();
			y=tx.getSelectionEnd();
			str=tx.getSelectedText();
			tx.replaceRange("",x,y);
		}
		if(e.getSource()==co)
		{
			str=tx.getSelectedText();
		}
		if(e.getSource()==p)
		{
			x=tx.getSelectionStart();
			y=tx.getSelectionEnd();
			tx.replaceRange(str,x,y);
			
		}
		if(e.getSource()==cc)
		{
			x=tx.getSelectionStart();
			y=tx.getSelectionEnd();
			str=tx.getSelectedText();
			tx.replaceRange("",x,y);
		}
		if(e.getSource()==coo)
		{
			str=tx.getSelectedText();
		}
		if(e.getSource()==pa)
		{
			x=tx.getSelectionStart();
			y=tx.getSelectionEnd();
			tx.replaceRange(str,x,y);
			
		}
		 if(e.getSource()==an)
   {
    hd.setVisible(true);
   }
		if(e.getSource()==font)
		{
			//md.setSize(900,900);
			
			md.setVisible(true);
		}

	}
	class popp extends MouseAdapter
{
	
 public void mouseClicked(MouseEvent e)
	{
     pop.show(tx,e.getX(),e.getY());
    }

}
	class Mydialog extends JDialog
	{
		//md=new Mydialog();
		JPanel p1,p2,p3,p4,p5;
		JLabel a1,a2,a3;
		JButton b1,b2,b3;
		JList l1,l2,l3;
		JTextField t1,t2,t3;
		String[] font={"Times New Roman","Sylfaen","Arial"};
		String[] styles={"Bold","Italic","Underline"};
		String[] sizes={"10","12","14"};
		public Mydialog(npad nd,String tle,boolean b)
		{
			
			super(nd,"",true);
			//setLayout(new GridLayout(1,4));
			setSize(500,500);

			p1=new JPanel();
			p2=new JPanel();
			p3=new JPanel();
			p4=new JPanel();
			p5=new JPanel();

			a1=new JLabel("Font->");
			a2=new JLabel("Font Style->");
			a3=new JLabel("Size->");

			b1=new JButton("OK");
			b2=new JButton("Apply");
			b3=new JButton("Cancel");

			l1=new JList(font);
			l2=new JList(styles);
			l3=new JList(sizes);

			t1=new JTextField(10);
			t2=new JTextField(10);
			t3=new JTextField(10);
			p4.setLayout(new GridLayout(1,4));
		//	p4.setSize(200,200);
			add(p4);

			
			//p4.setLayout(new FlowLayout());
			//p1.setLayout(new FlowLayout());
			//p2.setLayout(new GridLayout(4,1));
			//p3.setLayout(new GridLayout(4,1));
			//p5.setLayout(new GridLayout(4,1));
			
		//	p1.setSize(200,200);
			p1.add(a1);
			p1.add(t1);
			p1.add(l1);
			p4.add(p1);

		//	p2.setSize(200,200);
			p2.add(a2);
			p2.add(t2);
			p2.add(l2);
			p4.add(p2);

	//		p3.setSize(200,200);
			p3.add(a3);
			p3.add(t3);
			p3.add(l3);
			p4.add(p3);

		//	p5.setSize(200,200);
				p5.add(b1);
				p5.add(b2);
				p5.add(b3);
				p4.add(p5);
				
				}

	}
	public static void main(String[] args) 
	{
		npad f=new npad("My Notepad");
		f.setVisible(true);
		//System.out.println("Hello World!");
	}
}
class	HelpDialog extends JDialog
{
 JLabel l;
 public HelpDialog(npad na,String tit,boolean bl)
	{
   super(na,tit,bl); 
   setSize(200,200);
    l=new JLabel("Created by : Sumit Salvi");
	add(l);
   }

}
