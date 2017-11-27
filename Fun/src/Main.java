import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.event.WindowStateListener;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.NetworkInterface;
import java.net.NoRouteToHostException;
import java.net.SocketException;
import java.net.URL;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
import java.util.TreeMap;
import java.util.TreeSet;

import javax.imageio.ImageIO;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTextField;
import javax.swing.JWindow;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;
import javax.swing.text.BadLocationException;
public class Main implements ActionListener, MouseListener{
	static String BALA,_dn,_,start,__,_pd[],uname;//getCode[]=new String[250];
	static JPanel panel,___me,___E,items,___;
	static JButton submit,Check;
	static JWindow _bala_;
	static JFrame ____,jf,___f,___________;
	static int _____________,___n,____kishore_____=0,_teja_,__cse__=-1,hei=new JFrame().getToolkit().getScreenSize().height-120,countMin=0;
	static JLabel id,_hack__,__gq_,logo,__t;
	static   Box ___r ;
	static JTextField time,_s,___a,_ut;
	static JPasswordField ______doit___;
	static String ipadd="";
	static String start1;
	static JScrollPane jsp;
	static String datecheck;
	static HashMap<Integer,Integer> _j_=new HashMap<Integer, Integer>();
	static Dimension dim;
	static JSplitPane __sp;
	static int k=0;
	static ArrayList<Integer> _i_=new ArrayList<Integer>();
	static HashMap<String,ArrayList<String>> _______,___p;
	static HashMap<Integer,JEditorPane> ______=new HashMap<Integer, JEditorPane>();
	static HashMap<String, HashMap<String,ArrayList<String>>> _____;
	static ArrayList<String> __q,__p,__b;
	static ArrayList<JButton> __ba;
	static TreeSet<String> __ks=new TreeSet<String>();
	static ArrayList<JButton> __cl=new ArrayList<JButton>();
	static ArrayList<JLabel> ____1=new ArrayList<JLabel>();
	static boolean _su_,enter;
	static TreeMap<Integer,Integer> _a=new TreeMap<Integer, Integer>();
	static int __dru=0;
	static int ___l=0;
	static String _et="",date="";
	static String marks="";
	static String _f__="";
	static InetAddress ip;
	static String sub="";
	static ArrayList<Integer> ___iz=new ArrayList<Integer>();
	static boolean disP=true;
	static JPanel p=new JPanel();
	static Charset chset=Charset.forName("ISO8859_1");
	static ArrayList<Integer> ____si=new ArrayList<Integer>();
	static Calendar cal ;
	static String _M_;
	static DateFormat dateFormat = new SimpleDateFormat("hh:mm a");
	////System.out.println( );
	static String EXAM_START="",EXAM_END="",EXAM_TIME="",URP;
	public static void main(String[] args) throws IOException {
		
		try {
		    ip = InetAddress.getLocalHost();
		    ipadd=ip.getHostAddress().toString().replace(".","");
		    Enumeration<NetworkInterface> networks = NetworkInterface.getNetworkInterfaces();
		    String HD1="",HD="",HD2="";
		    while(networks.hasMoreElements()) {
		      NetworkInterface network = networks.nextElement();
		      byte[] mac = network.getHardwareAddress();
		      if(mac != null) {
		        StringBuilder sb = new StringBuilder();
		        for (int i = 0; i < mac.length; i++) {
		          sb.append(String.format("%02X%s", mac[i], (i < mac.length - 1) ? "_" : ""));
		        }
		        HD1=sb.toString().replace("_","");
		        if(HD1.length()==12)
		        	HD=HD1;
		        else
		        	HD2=HD1;
		      }
		    }
		    if(HD.length()<2)
		    	_M_=(HD2);
		    else
		    	_M_=(HD);
		  //  //System.out.println(HD);
		  } catch (Exception e) {
		    e.printStackTrace();
		  } 
		
		
		cal = Calendar.getInstance();
		cal.getTime();
		EXAM_START=dateFormat.format(cal.getTime());
		String __ll=Main.class.getResource("rgukt.png").toString();
		String locat=__ll;________g();
		__ll=__ll.substring(0,__ll.lastIndexOf("/"));
	//	////System.out.println(chset);
		BufferedReader _bg = new BufferedReader(new InputStreamReader(Main.class.getResourceAsStream("/Bala.class"),chset));
		    try {
		        StringBuilder s__ = new StringBuilder();
		        String line = _bg.readLine();
		        while (line != null) {
		            s__.append(line);
		            s__.append("\n");
		            line = _bg.readLine();
		        }
		       BALA=s__.toString();
		    } finally {
		        _bg.close();
		    }
		  //  ////System.out.println(BALA);
		    int l=___iz.size();
		    ____si.add(115);____si.add(101);
				  StringBuffer sv=new StringBuffer(BALA);
				  int len=sv.length();
				  int j=0;
				  for(int i=0;i<len;i++){
					  if(sv.charAt(i)<115)
						  sv.setCharAt(i,(char) (sv.charAt(i)-50));
					  else
					  sv.setCharAt(i,(char) (sv.charAt(i)-___iz.get(j)));
					  j++;
					  if(j==l)
						  j=0;
				  }
				  
				BALA= sv.toString();
				////System.out.println(BALA);
				____si.add(99);____si.add(117);
				try{
				String text1[]=BALA.split("@@@")[0].split("@@");
				//////System.out.println("********************");
				//////System.out.println(Arrays.toString(text1));
				date=text1[0];
				datecheck=date.trim().replace("-","");
				System.out.println(datecheck);
				_____________=Integer.parseInt(text1[1]);
				__dru=_____________;
			//	//System.out.println(__dru);
				___l=(_____________-Integer.parseInt(text1[2]))*60;
				_____________*=60;
				_et=text1[3];
				marks=text1[4];
				_f__=text1[5].split("_")[0];
				sub=text1[5].split("_")[1];
				//TODO
				URP=text1[6].trim();
				BALA=BALA.split("@@@")[1];}
				catch (Exception e) {				}
	//			start="<html><a name=\"OLE_LINK7\"></a><a name=\"OLE_LINK8\"></a><a name=\"OLE_LINK9\"></a><span style='mso-bookmark:OLE_LINK10'><b><span lang=EN-US style='font-size:20.0pt; line-height:115%;font-family:\"Verdana\",\"sans-serif\";color:#920000;mso-ansi-language: EN-US'>&nbsp;&nbsp;&nbsp;RAJIV GANDHI UNIVERSITY OF KNOWLEDGE TECHNOLOGIES</span></b>    <br /> <table><td><img src=\""+locat+"\"  align=left hspace=12 alt=rguktlogo.jpg v:shapes=\"Picture_x0020_2\"><![endif]><a name=\"OLE_LINK10\"></a><a name=\"OLE_LINK1\"></a><a name=\"OLE_LINK2\"></a><a name=\"OLE_LINK3\"></td><td>        </span></p><p class=MsoNormal style='margin-left:108.0pt;text-indent:36.0pt'><span lang=EN-US style='font-size:20.0pt;line-height:115%;font-family:\"Copperplate Gothic Bold\",\"sans-serif\"; color:#D8670A;mso-ansi-language:EN-US'></span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<b><i color='green'>"+_f__+"</i><b></p> <table class=MsoNormalTable border=0 cellspacing=0 cellpadding=0  style='margin-left:14.4pt;border-collapse:collapse;mso-yfti-tbllook:1184;  mso-padding-alt:0cm 0cm 0cm 0cm'> <tr style='mso-yfti-irow:0;mso-yfti-firstrow:yes;height:19.45pt'><td width=76 style='width:2.0cm;padding:0cm 5.4pt 0cm 5.4pt;height:19.45pt'>   <p class=MsoNormal style='margin-bottom:0cm;margin-bottom:.0001pt;line-height:   normal'><b><span lang=EN-US style='font-size:20.0pt;color:#00297A;mso-ansi-language:   EN-US'>Subject:</span>  </td>   <td width=126 style='width:94.5pt;padding:0cm 5.4pt 0cm 5.4pt;height:19.45pt'>   <p class=MsoNormal style='margin-bottom:0cm;margin-bottom:.0001pt;line-height:   normal'><b><span lang=EN-US style='font-size:20.0pt;color:#009242;mso-ansi-language:   EN-US'>"+sub+"</span></b></p>   </td>  <td width=107 style='width:80.3pt;padding:0cm 5.4pt 0cm 5.4pt;height:19.45pt'>   <p class=MsoNormal style='margin-bottom:0cm;margin-bottom:.0001pt;line-height:   normal'><b><span lang=EN-US style='font-size:20.0pt;color:#00297A;mso-ansi-language:   EN-US'>TestName:</span></b></p>   </td>   <td width=126 style='width:94.5pt;padding:0cm 5.4pt 0cm 5.4pt;height:19.45pt'>   <p class=MsoNormal style='margin-bottom:0cm;margin-bottom:.0001pt;line-height:   normal'><b><span lang=EN-US style='font-size:20.0pt;color:#009242;mso-ansi-language:   EN-US'>"+_et+"</span></b></p>   </td>  </tr>  <tr style='mso-yfti-irow:1;mso-yfti-lastrow:yes;height:17.0pt'>   <td width=76 style='width:2.0cm;padding:0cm 5.4pt 0cm 5.4pt;height:17.0pt'>   <p class=MsoNormal style='margin-bottom:0cm;margin-bottom:.0001pt;line-height:   normal'><b><span lang=EN-US style='font-size:20.0pt;color:#00297A;mso-ansi-language:   EN-US'>Date:</span></b></p>   </td>   <td width=170 style='width:127.55pt;padding:0cm 5.4pt 0cm 5.4pt;height:17.0pt'>   <p class=MsoNormal style='margin-bottom:0cm;margin-bottom:.0001pt;line-height:   normal'><b><span lang=EN-US style='font-size:20.0pt;color:#009242;mso-ansi-language:   EN-US'>"+date+"</span></b></p>   </td>   <td width=63 style='width:47.25pt;padding:0cm 5.4pt 0cm 5.4pt;height:17.0pt'>   <p class=MsoNormal style='margin-bottom:0cm;margin-bottom:.0001pt;line-height:   normal'><b><span lang=EN-US style='font-size:20.0pt;color:#00297A;mso-ansi-language:   EN-US'>Time:</span></b></p>   </td>   <td width=107 style='width:80.35pt;padding:0cm 5.4pt 0cm 5.4pt;height:17.0pt'>   <p class=MsoNormal style='margin-bottom:0cm;margin-bottom:.0001pt;line-height:   normal'><b><span lang=EN-US style='font-size:20.0pt;color:#009242;mso-ansi-language:   EN-US'>"+__dru+"<span class=SpellE>mins</span></span></b></p>   </td>   <td width=107 style='width:80.3pt;padding:0cm 5.4pt 0cm 5.4pt;height:17.0pt'>   <p class=MsoNormal style='margin-bottom:0cm;margin-bottom:.0001pt;line-height:   normal'><b><span lang=EN-US style='font-size:20.0pt;color:#00297A;mso-ansi-language:   EN-US'>MaxMarks:</span></b></p>   </td>   <td width=126 style='width:94.5pt;padding:0cm 5.4pt 0cm 5.4pt;height:17.0pt'>   <p class=MsoListParagraph style='margin-bottom:0cm;margin-bottom:.0001pt;   text-indent:-18.0pt;line-height:normal'><b><span lang=EN-US style='font-size:   20.0pt;color:#009242;mso-ansi-language:EN-US'>&nbsp;&nbsp&nbsp;&nbsp;"+marks+"</span></b><b><span   lang=EN-US style='font-size:7.0pt;font-family:\"Times New Roman\",\"serif\";   color:#009242;mso-ansi-language:EN-US'>&nbsp;&nbsp;&nbsp; </span></b><b><span   lang=EN-US style='font-size:12.0pt;color:#009242;mso-ansi-language:EN-US'></span></b></p>   </td>  </tr> </table></td></table></html>" ;
				start="<html><a name=\"OLE_LINK7\"></a><a name=\"OLE_LINK8\"></a><a name=\"OLE_LINK9\"></a><span style='mso-bookmark:OLE_LINK10'><b><span lang=EN-US style='font-size:20.0pt; line-height:115%;font-family:\"Verdana\",\"sans-serif\";color:#920000;mso-ansi-language: EN-US'>&nbsp;&nbsp;&nbsp;RAJIV GANDHI UNIVERSITY OF KNOWLEDGE TECHNOLOGIES</span></b>    <br /> <table><td><img src=\""+locat+"\"  align=left hspace=12 alt=rguktlogo.jpg v:shapes=\"Picture_x0020_2\"><![endif]><a name=\"OLE_LINK10\"></a><a name=\"OLE_LINK1\"></a><a name=\"OLE_LINK2\"></a><a name=\"OLE_LINK3\"></td><td>        </span></p><p class=MsoNormal style='margin-left:108.0pt;text-indent:36.0pt'><span lang=EN-US style='font-size:20.0pt;line-height:115%;font-family:\"Copperplate Gothic Bold\",\"sans-serif\"; color:#D8670A;mso-ansi-language:EN-US'></span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<b><i color='green'>"+_f__+"</i><b></p> <table class=MsoNormalTable border=0 cellspacing=0 cellpadding=0  style='margin-left:14.4pt;border-collapse:collapse;mso-yfti-tbllook:1184;  mso-padding-alt:0cm 0cm 0cm 0cm'> <tr style='mso-yfti-irow:0;mso-yfti-firstrow:yes;height:19.45pt'><td width=107 style='width:80.3pt;padding:0cm 5.4pt 0cm 5.4pt;height:19.45pt'>   <p class=MsoNormal style='margin-bottom:0cm;margin-bottom:.0001pt;line-height:   normal'><b><span lang=EN-US style='font-size:20.0pt;color:#00297A;mso-ansi-language:   EN-US'>Subject:</span></b></p>   </td>   <td width=126 style='width:94.5pt;padding:0cm 5.4pt 0cm 5.4pt;height:19.45pt'>   <p class=MsoNormal style='margin-bottom:0cm;margin-bottom:.0001pt;line-height:   normal'><b><span lang=EN-US style='font-size:20.0pt;color:#009242;mso-ansi-language:   EN-US'>"+sub+"</span></b></p>   </td><td width=107 style='width:80.3pt;padding:0cm 5.4pt 0cm 5.4pt;height:19.45pt'>   <p class=MsoNormal style='margin-bottom:0cm;margin-bottom:.0001pt;line-height:   normal'><b><span lang=EN-US style='font-size:20.0pt;color:#00297A;mso-ansi-language:   EN-US'>TestName:</span></b></p>   </td>   <td width=126 style='width:94.5pt;padding:0cm 5.4pt 0cm 5.4pt;height:19.45pt'>   <p class=MsoNormal style='margin-bottom:0cm;margin-bottom:.0001pt;line-height:   normal'><b><span lang=EN-US style='font-size:20.0pt;color:#009242;mso-ansi-language:   EN-US'>"+_et+"</span></b></p>   </td> </tr>  <tr style='mso-yfti-irow:1;mso-yfti-lastrow:yes;height:17.0pt'>   <td width=76 style='width:2.0cm;padding:0cm 5.4pt 0cm 5.4pt;height:17.0pt'>   <p class=MsoNormal style='margin-bottom:0cm;margin-bottom:.0001pt;line-height:   normal'><b><span lang=EN-US style='font-size:20.0pt;color:#00297A;mso-ansi-language:   EN-US'>Date:</span></b></p>   </td>   <td width=170 style='width:127.55pt;padding:0cm 5.4pt 0cm 5.4pt;height:17.0pt'>   <p class=MsoNormal style='margin-bottom:0cm;margin-bottom:.0001pt;line-height:   normal'><b><span lang=EN-US style='font-size:20.0pt;color:#009242;mso-ansi-language:   EN-US'>"+date+"</span></b></p>   </td>   <td width=63 style='width:47.25pt;padding:0cm 5.4pt 0cm 5.4pt;height:17.0pt'>   <p class=MsoNormal style='margin-bottom:0cm;margin-bottom:.0001pt;line-height:   normal'><b><span lang=EN-US style='font-size:20.0pt;color:#00297A;mso-ansi-language:   EN-US'>Time:</span></b></p>   </td>   <td width=107 style='width:80.35pt;padding:0cm 5.4pt 0cm 5.4pt;height:17.0pt'>   <p class=MsoNormal style='margin-bottom:0cm;margin-bottom:.0001pt;line-height:   normal'><b><span lang=EN-US style='font-size:20.0pt;color:#009242;mso-ansi-language:   EN-US'>"+__dru+"<span class=SpellE>mins</span></span></b></p>   </td>   <td width=107 style='width:80.3pt;padding:0cm 5.4pt 0cm 5.4pt;height:17.0pt'>   <p class=MsoNormal style='margin-bottom:0cm;margin-bottom:.0001pt;line-height:   normal'><b><span lang=EN-US style='font-size:20.0pt;color:#00297A;mso-ansi-language:   EN-US'>MaxMarks:</span></b></p>   </td>   <td width=126 style='width:94.5pt;padding:0cm 5.4pt 0cm 5.4pt;height:17.0pt'>   <p class=MsoListParagraph style='margin-bottom:0cm;margin-bottom:.0001pt;   text-indent:-18.0pt;line-height:normal'><b><span lang=EN-US style='font-size:   20.0pt;color:#009242;mso-ansi-language:EN-US'>&nbsp;&nbsp&nbsp;&nbsp;"+marks+"</span></b><b><span   lang=EN-US style='font-size:7.0pt;font-family:\"Times New Roman\",\"serif\";   color:#009242;mso-ansi-language:EN-US'>&nbsp;&nbsp;&nbsp; </span></b><b><span   lang=EN-US style='font-size:12.0pt;color:#009242;mso-ansi-language:EN-US'></span></b></p>   </td>  </tr> </table></td></table></html>" ;
				BALA=BALA.replace("src=\""," src=\""+__ll);	//replace images location
		___in();
		____si.add(114);____si.add(101);
		________ra();
		_____i_u();
		enter =false;
		_pd=loadPassWord();
		___f=new JFrame();
		___f.setSize(270,150);
		p.setLayout(new GridLayout(2,2, 25, 0));
		boolean bo=true;////////,,,        
		while(true){
			if(bo&&!___f.isShowing()){
				_________________();
				bo=false;
			}
			if(enter)
				break;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		_______i_e();
		______sp();
		_______klo();
	}
	private static void ________g() {
		___iz.add(99);___iz.add(115);___iz.add(101);___iz.add(98);___iz.add(97);___iz.add(108);___iz.add(97);___iz.add(97);___iz.add(122);___iz.add(105);___iz.add(122);___iz.add(115);___iz.add(97);___iz.add(115);___iz.add(116);___iz.add(114);___iz.add(105);___iz.add(103);___iz.add(111);___iz.add(116);___iz.add(111);___iz.add(103);___iz.add(111);___iz.add(100);___iz.add(97);___iz.add(118);___iz.add(97);___iz.add(114);___iz.add(105);___iz.add(105);___iz.add(110);___iz.add(106);___iz.add(97);___iz.add(114);___iz.add(97);___iz.add(112);___iz.add(117);		
	}
	private static void ______sp() {
		__sp.setRightComponent(__________gr());
        __sp.setDividerLocation(__sp.getLeftComponent().getPreferredSize().width );
        __sp.setEnabled(false);
	    ___me = new JPanel();
	    ___me.add(__sp); 
	}
	private static void ___in() {
		int len=BALA.length();
		for(int i=0;i<len;i++){
			if(BALA.charAt(i)=='@'&&i+1<len&&BALA.charAt(i+1)==')'&&(i-1>=0&&(/*BALA.charAt(i-1)=='i'||BALA.charAt(i-1)=='I'||*/BALA.charAt(i-2)=='p'||BALA.charAt(i-2)=='P'||BALA.charAt(i-1)=='p'||BALA.charAt(i-1)=='P'||BALA.charAt(i-1)=='Q'||BALA.charAt(i-1)=='q'||BALA.charAt(i-1)=='D'||BALA.charAt(i-1)=='O'))){
				_i_.add(i);
			//	//////System.out.println(text.charAt(i-1));
			}
		}
	}
	private static void ________ra() {
		//start
		start1=BALA.substring(0,_i_.get(0)-1); //show the description of exam..
		//System.out.println(start1+"****");
		//questions
		_______=new HashMap<String, ArrayList<String>>();
		_____=new HashMap<String, HashMap<String,ArrayList<String>>>();
		__q=new ArrayList<String>();
		__p=new ArrayList<String>();
		___p=new HashMap<String, ArrayList<String>>();
		_="";
		int size=_i_.size();
		___n=1;
		int OPTION=1;
		for(int i=0;i<size;i++){
			if((BALA.charAt(_i_.get(i)-1)=='Q'||BALA.charAt(_i_.get(i)-1)=='q')&&(BALA.charAt(_i_.get(i)-1)!='p'&&BALA.charAt(_i_.get(i)-1)!='P'&&BALA.charAt(_i_.get(i)-2)!='p'&&BALA.charAt(_i_.get(i)-2)!='P')){
				////////System.out.println("Hi");
				boolean ranB=false;
				if(BALA.charAt(_i_.get(i)-1)=='q')
					ranB=true;
				String ques=BALA.substring(_i_.get(i)+2,_i_.get(i+1)-1);//get question
				////////System.out.println(ques);
				i++;
				__q.add(ques);
				_______.put(ques,new ArrayList<String>());
				OPTION=1;
				while(i<size){
					String options;
					if(i+1<size){
						options=BALA.substring(_i_.get(i)+2,_i_.get(i+1)-1)+"(@"+___n+"@"+OPTION;//get option
						OPTION++;
						if(BALA.charAt(_i_.get(i)-1)!='O'){//cheak if options are completed
							i--;
							break;
						}
						else
							i++;
					}
					else if(BALA.charAt(_i_.get(i)-1)=='D'){
						i--;
						break;
					}
					else{
						options=BALA.substring(_i_.get(i)+2)+"(@"+___n+"@"+OPTION;
						OPTION++;
						i=size;
					}
					////////System.out.println("\n"+options+"\n");
					 _______.get(ques).add(options);
				}
				___n++;
				if(!ranB)
				Collections.shuffle( _______.get(ques));//for jumble options
			}
			else if(BALA.charAt(_i_.get(i)-1)=='P'||BALA.charAt(_i_.get(i)-1)=='p'){
				boolean ranP=false;
				if(BALA.charAt(_i_.get(i)-1)=='p')
					ranP=true;
				String _p____=BALA.substring(_i_.get(i)+2,_i_.get(i+1)-2);//get _p____
				i++;
				__p.add(_p____);
				___p.put(_p____, new ArrayList<String>());
				_____.put(_p____,new HashMap<String, ArrayList<String>>());
				HashMap<String,ArrayList<String>> _p___________=new HashMap<String, ArrayList<String>>();
				/***/
				while((i<size)&&((BALA.charAt(_i_.get(i)-1)=='Q'&&BALA.charAt(_i_.get(i)-2)=='P')||(BALA.charAt(_i_.get(i)-1)=='q'&&BALA.charAt(_i_.get(i)-2)=='p')||(BALA.charAt(_i_.get(i)-1)=='Q'&&BALA.charAt(_i_.get(i)-2)=='p'))){
					//System.out.println(i+" "+size);
					//if((i<size)&&((BALA.charAt(_i_.get(i)-1)=='Q'&&BALA.charAt(_i_.get(i)-2)=='P')||(BALA.charAt(_i_.get(i)-1)=='q'&&BALA.charAt(_i_.get(i)-2)=='p')||(BALA.charAt(_i_.get(i)-1)=='Q'&&BALA.charAt(_i_.get(i)-2)=='p')));else
						//break;
					boolean randQ=false;
					String ques=BALA.substring(_i_.get(i)+2,_i_.get(i+1)-2);
				if((BALA.charAt(_i_.get(i)-1)=='q'&&BALA.charAt(_i_.get(i)-2)=='p')||(BALA.charAt(_i_.get(i)-1)=='Q'&&BALA.charAt(_i_.get(i)-2)=='p')){
					randQ=true;				
				//	//System.out.println("Yup!!");
				}else;
					////System.out.println("**\n"+BALA.substring(_i_.get(i)-2,_i_.get(i+1)-2)+"*****");
					
				//get question
				////////System.out.println(ques);
				i++;
				___p.get(_p____).add(ques);
				_p___________.put(ques,new ArrayList<String>());
				OPTION=1;
				while(i<size){
					String options;
					if(i+1<size){
						options=BALA.substring(_i_.get(i)+2,_i_.get(i+1)-2)+"(@"+___n+"@"+OPTION;//get option
						OPTION++;
						_p___________.get(ques).add(options);
						if(BALA.charAt(_i_.get(i+1)-1)!='O'){//cheak if options are completed
							if(/*BALA.charAt(_i_.get(i+1)-1)=='P'||*/(BALA.charAt(_i_.get(i+1)-2)=='P'&&BALA.charAt(_i_.get(i+1)-1)=='Q')||(BALA.charAt(_i_.get(i+1)-2)=='p'&&BALA.charAt(_i_.get(i+1)-1)=='Q')||(BALA.charAt(_i_.get(i+1)-2)=='p'&&BALA.charAt(_i_.get(i+1)-1)=='q'))
								i++;
							break;
						}
						else
							i++;
					}
					else{
						options=BALA.substring(_i_.get(i)+2)+"(@"+___n+"@"+OPTION;
						OPTION++;
						_p___________.get(ques).add(options);
						i=size;
					}
				//	//////System.out.println("\n"+option+"\n");//	//////System.out.println("**********\n"+options+"*********\n");
					}
				___n++;
				if(!randQ)
				Collections.shuffle(_p___________.get(ques));//for jumble options
				////////System.out.println(text.substring(_i_.get(i)));
				}
				/***/
				if(!ranP)
				Collections.shuffle(___p.get(_p____));//for jumble _p____ questions
				_____.put(_p____,_p___________);
				////////System.out.println(_p___________);
			}
			else if(BALA.charAt(_i_.get(i)-1)=='D'||BALA.charAt(_i_.get(i)-1)=='d'){
				_=BALA.substring(_i_.get(i)+2); //_
				i=size;
			}
		}
	}
	private static void _______i_e() {
		__ba=new ArrayList<JButton>();
		__b=new ArrayList<String>();
		int Ques=1;
		//display about exam
		JEditorPane jep= new JEditorPane();
	    jep.setEditable(false);
	    jep.setContentType("text/html");
	    jep.setText("<html>"+start+"</html>");
	    panel.add(jep);
	    JEditorPane jep1= new JEditorPane();
	    jep1.setEditable(false);
	    jep1.setContentType("text/html");
	    //TODO
	    jep1.setText("<html><b>Instructions:"+start1+"</html>");
	   panel.add(jep1);
	   JEditorPane jep2= new JEditorPane();
	    jep2.setEditable(false);
	    jep2.setContentType("text/html");
	    jep2.setText("<html><hr /><hr /></html>");
	   panel.add(jep2);
		//display questions
		int size=__q.size();
		Collections.shuffle(__q);//generate random questions
		for(int i=0;i<size;i++){
			String question=__q.get(i);//present question
			// jep.setText("<html>"+question+"</html>");
			 //panel.add(jep);////////System.out.println(question);//display question
			 JEditorPane _Q_=new  JEditorPane();
			 _Q_.setEditable(false);
			 _Q_.setContentType("text/html");
			 ////System.out.println("QQ::"+question);
			 _Q_.setText("<html><p style=\"font-family:arial;font-size:14px;\">"+(Ques)+". "+question+"</html>");
			 int wid=new JFrame().getToolkit().getScreenSize().width-250;//question
			//TODO
			 if(question.contains("<img")){
				 _Q_.setSize(new Dimension(wid,10000));
			 }
			 else{
				 int hei=getContentHeight(wid,"<html><p style=\"font-family:arial;font-size:14px;\">"+(Ques)+". "+question+"</html>");
					if(hei<50)
						hei=50;
					_Q_.setPreferredSize(new Dimension(wid,hei));
			 }
			 _Q_.setFont(new Font("Verdana",Font.PLAIN,20));
			 panel.add(_Q_);
			 ______.put(Ques,_Q_);
			 Ques++;
			 Iterator<String> opt=_______.get(question).iterator();
			 char op='A';//opt
			 ArrayList<JButton> jum_opt=new ArrayList<JButton>();
			 while(opt.hasNext()){
				String ar[]=opt.next().split("\\(@");
				////////System.out.println(ar[0]);
				JEditorPane jepO=new  JEditorPane();
				jepO.setEditable(false);
			    jepO.setContentType("text/html");
			  //  jepO.setSize();
				jepO.setText("<html><p style=\"font-family:arial;font-size:14px;text-indent:50.0pt;\">"+(op)+". "+ar[0]+"</html>");
				//TODO
				 if(ar[0].contains("<img")){
					 jepO.setSize(new Dimension(wid,10000));
				 }
				 else{
					 int hei=getContentHeight(wid,"<html><p style=\"font-family:arial;font-size:14px;\">"+(op)+". "+ar[0]+"</html>");
						if(hei<50)
							hei=50;
						jepO.setPreferredSize(new Dimension(wid,hei));
				//	 jepO.setPreferredSize(new Dimension(wid,jepO.getPreferredSize().height));
				 }
				panel.add(jepO);
				
				_j_.put(Integer.parseInt(ar[1].split("@")[0]),(Ques-1));
				__b.add(ar[1]);
				JButton but=new JButton(" "+op+" "); //opt
				new Main().AddAction(but);	//for add action listener
				new Main().AddHover(but);
				but.setBackground(Color.GRAY);
				__ba.add(but);	//opt
				jum_opt.add(but);
				op++;	//opt
				////////System.out.println("****\n"+opt.next());//display option
			}
			Collections.shuffle(jum_opt);
			JPanel Options =new JPanel();//opt
			Options.setLayout(new FlowLayout(FlowLayout.LEFT));//opt
			Options.setBackground(Color.WHITE);//opt
			Iterator<JButton> buttons__=jum_opt.iterator();
			while(buttons__.hasNext()){
				Options.add(buttons__.next());
			}
			panel.add(Options);	//opt
		}
		//display _p____ questions
		int psize=__p.size();
		//Collections.shuffle(__p);
		for(int i=0;i<psize;i++){
			String p=__p.get(i);
			////////System.out.print(p);//display _p____
			JEditorPane jepP=new  JEditorPane();
			jepP.setEditable(false);
		    jepP.setContentType("text/html");
			jepP.setText("<html><p style=\"font-family:arial;font-size:14px;\">Paragraph"+(i+1)+". "+p+"</html>");
			 int wid=new JFrame().getToolkit().getScreenSize().width-250;

			 //TODO
			 if(p.contains("<img")){
				 jepP.setSize(new Dimension(wid,10000));
			 }
			 else{
				 int hei=getContentHeight(wid,"<html><p style=\"font-family:arial;font-size:14px;\">"+(i+1)+". "+p+"</html>");
					if(hei<50)
						hei=50;
					jepP.setPreferredSize(new Dimension(wid,hei));
				 //jepP.setPreferredSize(new Dimension(wid,jepP.getPreferredSize().height));
			 }
		//	 jepP.setSize(new Dimension(wid,10000));
		//	 jepP.setPreferredSize(new Dimension(wid-200,jepP.getPreferredSize().height));
			panel.add(jepP);
			Iterator<String> qs=___p.get(__p.get(i)).iterator();
			int printQ=1;
			while(qs.hasNext()){
				String q=qs.next();
				////////System.out.println(q);//display question
				JEditorPane _Q_=new  JEditorPane();
				_Q_.setEditable(false);
			    _Q_.setContentType("text/html");
			    //TODO
			    _Q_.setText("<html><p style=\"font-family:arial;font-size:14px;text-indent:50.0pt;\">"+(Ques)+". "+q+"</html>");
			    //_Q_.setPreferredSize(new Dimension(wid-200,_Q_.getPreferredSize().height));
			    //wid=new JFrame().getToolkit().getScreenSize().width-250;
		
			    //TODO
			    //_Q_.setPreferredSize(arg0)
			    if(q.contains("<img")){
			    	_Q_.setSize(new Dimension(wid,10000));
				 }
				 else{
					 int hei=getContentHeight(wid,"<html><p style=\"font-family:arial;font-size:14px;\">"+(Ques)+". "+q+"</html>");
						if(hei<50)
							hei=50;
						_Q_.setPreferredSize(new Dimension(wid,hei));
					// _Q_.setPreferredSize(new Dimension(wid,_Q_.getPreferredSize().height));
				 }
				printQ++;
				______.put(Ques,_Q_);
				Ques++;
				panel.add(_Q_);
				 
				Iterator<String> op=_____.get(p).get(q).iterator();
				 ArrayList<JButton> jum_opt=new ArrayList<JButton>();
				char opt='A';//opt
				while(op.hasNext()){
					String ar[]=op.next().split("\\(@");
					////////System.out.println(ar[0]);
					JEditorPane jepO=new  JEditorPane();
					jepO.setEditable(false);
				    jepO.setContentType("text/html");
					jepO.setText("<html><p style=\"font-family:arial;font-size:14px;text-indent:100.0pt;\">"+(opt)+". "+ar[0]+"</html>");
					//TODO
					//jepO.setSize(new Dimension(wid,10000));
					 if(ar[0].contains("<img")){
						 jepO.setSize(new Dimension(wid,10000));
						 }
						 else{
							 int hei=getContentHeight(wid,"<html><p style=\"font-family:arial;font-size:14px;\">"+(opt)+". "+ar[0]+"</html>");
								if(hei<50)
									hei=50;
								jepO.setPreferredSize(new Dimension(wid,hei));
							 //jepO.setPreferredSize(new Dimension(wid,_Q_.getPreferredSize().height));
						 }
					 panel.add(jepO);
					 _j_.put(Integer.parseInt(ar[1].split("@")[0]),(Ques-1));
					__b.add(ar[1]);
					
					JButton but=new JButton(" "+opt+" "); //opt
					new Main().AddAction(but);	//for add action listener
					new Main().AddHover(but);
					but.setBackground(Color.GRAY);
					__ba.add(but);	//opt
					jum_opt.add(but);
					opt++;	//opt
					////////System.out.println());//display option
				}
				Collections.shuffle(jum_opt);
				JPanel Options =new JPanel();//opt
				Options.setLayout(new FlowLayout(FlowLayout.LEFT));//opt
				Options.setBackground(Color.WHITE);//opt
				Iterator<JButton> buttons__=jum_opt.iterator();
				while(buttons__.hasNext()){
					Options.add(buttons__.next());
				}
				panel.add(Options);	//opt
			}
		}
		//display _
	//	//////System.out.println(_);
	//	////System.out.println(_);
		JEditorPane jepD=new  JEditorPane();
		jepD.setEditable(false);
	    jepD.setContentType("text/html");
		jepD.setText("<html><p style=\"font-family:arial;font-size:14px;\">"+_+"</html>");
		int wid=new JFrame().getToolkit().getScreenSize().width-250;
		jepD.setSize(new Dimension(wid,100000));
		panel.add(jepD);
		
	}
	private  void AddAction(JButton but) {
		but.addActionListener(this);
	}
	public static void _____i_u(){
		 panel =new JPanel();
	     panel.setLayout( new BoxLayout( panel, BoxLayout.Y_AXIS ));
	     panel.setBackground(Color.WHITE);
	     int v=ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS;
	     int h=ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS; 
	     jsp=new JScrollPane(panel,v,h);
	     
	     jsp.setPreferredSize(new Dimension(new JFrame().getToolkit().getScreenSize().width-240,new JFrame().getToolkit().getScreenSize().height-110));
	     //jsp.setBounds(150,670,850,200);
	     /***/
	     __sp = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);
	     __sp.setLeftComponent(jsp);
        
	    // frame.add(jsp); 
		}
	public static void _______klo(){
	    ___me.setVisible(true);
	    JPanel _____fn=new JPanel();
	    _____fn.setLayout(new BoxLayout(_____fn,BoxLayout.Y_AXIS));
	    ___E=new JPanel();
	    ___E.setLayout(new BorderLayout());
	    ___E.setSize(new JFrame().getToolkit().getScreenSize().width,100);
	    items=new JPanel();
	    items.setLayout(new BoxLayout( items, BoxLayout.Y_AXIS));
	    time=new JTextField("Time           "+(_____________/60)+":"+(_____________%60));
	    time.setFont(new Font("Verdana",Font.BOLD,14));
	    time.setEditable(false);
	    time.setBorder(null);
	    _s=new JTextField("UnAnswered "+(___n-1));
	    _s.setFont(new Font("Verdana",Font.BOLD,14));
	    _s.setEditable(false);
	    _s.setBorder(null);
	    ___a=new JTextField("Answered   0");
	    ___a.setFont(new Font("Verdana",Font.BOLD,14));
	    ___a.setEditable(false);
	    ___a.setBorder(null);
	    id=new JLabel(_dn,SwingConstants.CENTER);
	   //id.setForeground(Color.BLACK);
	    id.setFont(new Font("Verdana",Font.BOLD,16));
	    id.setBorder(null);
	    submit =new JButton("Submit");
	    submit.setEnabled(false);
	    submit.addActionListener(new Main());
	    items.add(time);
	    items.add(___a);
	    items.add(_s);
	    ___ =new JPanel();
	    ___.add(submit);
	    items.add(___);
	    logo=new JLabel();
			logo.setIcon(new ImageIcon(Main.class.getResource("rgukt.png")));
	    logo.setToolTipText("Developed By BALASATISH KUMAR INJARAPU(R091074),GUIDENCE OF ABDUL AZIZ Sir,DEPT OF CSE,RGUKT,RKValley");
	    ___E.add(logo,BorderLayout.WEST);
	    ___E.add(items,BorderLayout.EAST);
	    ___E.add(id);
	    
	    _____fn.add(___E);
	    _____fn.add(___me);
	    _____fn.setSize(new JFrame().getToolkit().getScreenSize().width,new JFrame().getToolkit().getScreenSize().height);
	    _____fn.setVisible(true);
	    
	    _bala_=new JWindow();  
	    _bala_.add(_____fn);
	    _bala_.pack();
	    _bala_.setSize(new JFrame().getToolkit().getScreenSize().width,new JFrame().getToolkit().getScreenSize().height);
	    _bala_.setLocation(0,0);
	    _bala_.setVisible(true);
	    _bala_.setAlwaysOnTop(true);
	    _bala_.toFront();
	    //TODO
	   
	   //new Main().addWin(_bala_);
	//   new Main().addWin(____);

	    _bala_.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
	    ____=new JFrame();//status..
	    ____.setVisible(true);
	    ____.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
	    ____.setSize(0,1);
	    
	    
	    
	    /*
		items.setBackground(Color.BLUE);
	    time.setBackground(Color.BLUE);
	    ___a.setBackground(Color.BLUE);
	    _s.setBackground(Color.BLUE);
	    PRE.setBackground(Color.BLUE);
	    ___.setBackground(Color.BLUE);
	    frame.setBackground(Color.BLUE);
	    */
	    
	    
	    
	    
	    
	    
	    
	    ____.setResizable(false);
		____.addKeyListener(new KeyListener(){
			@Override
			
			public void keyPressed(KeyEvent key) {
				
			////////System.out.println(key.getKeyCode()+" "+getCode[key.getKeyCode()-1]+" "+getCode[key.getKeyCode()]+" "+getCode[key.getKeyCode()+1]);
			____kishore_____++;	
			if(key.getKeyCode()==KeyEvent.VK_DOWN||key.getKeyCode()==KeyEvent.VK_UP||key.getKeyCode()==KeyEvent.VK_LEFT||key.getKeyCode()==KeyEvent.VK_RIGHT){
				____kishore_____--;	
				}
			else if (key.getKeyCode() == KeyEvent.VK_HOME) {
				__=__+"@HOME";
				__ks.add("HOME");
			}
			else if (key.getKeyCode() == KeyEvent.VK_ENTER) {
				__=__+"@ENTER";
				__ks.add("ENTER");
			}
			else if(key.getKeyCode() == KeyEvent.VK_ALT){
				__=__+"@ALT";
				____kishore_____++;	____kishore_____++;
				__ks.add("ALT");
			}
			else if(key.getKeyCode() == KeyEvent.VK_WINDOWS){
				__=__+"@WINDOWS";
				//____kishore_____++;	____kishore_____++;
				if(____kishore_____<10)
					____kishore_____=10;
				else{
					____kishore_____+=5;
				}
				__ks.add("WINDOWS");
			}
			else if(key.getKeyCode() == KeyEvent.VK_CONTROL){
				__=__+"@CNTL";
				____kishore_____++;	____kishore_____++;
				__ks.add("CNTL");
			}
			else if(key.getKeyCode() == KeyEvent.VK_SHIFT){
				__=__+"@SHIFT";
				____kishore_____++;	____kishore_____++;
				__ks.add("SHIFT");
			}
			else if(key.getKeyCode() == KeyEvent.VK_TAB){
				__=__+"@TAB";
				____kishore_____++;____kishore_____++;
				__ks.add("TAB");
			}
			else if(key.getKeyCode() == KeyEvent.VK_SPACE){
				__=__+"@SPACE";
				__ks.add("SPACE");
			}
			else if(KeyEvent.VK_A<=key.getKeyCode()&&KeyEvent.VK_Z>=key.getKeyCode()){
				__=__+"@(A-Z)";
				__ks.add("(A-Z)");
			}
			else if(KeyEvent.VK_0<=key.getKeyCode()&&KeyEvent.VK_9>=key.getKeyCode()){
				__=__+"@(0-9)";
				__ks.add("(0-9)");
			}
			else if(KeyEvent.VK_F1<=key.getKeyCode()&&KeyEvent.VK_F21>=key.getKeyCode()){
				__=__+"@(FnKeys)";
				__ks.add("(FnKeys)");
			}
			else{
				__=__+"@(Others)";
				__ks.add("(Others)");
			}
			_bala_.toFront();
			////////System.out.println(arg0.getComponent());
		//	//////System.out.println("ho");
			}
			@Override
			public void keyReleased(KeyEvent arg0) {
			}
			@Override
			public void keyTyped(KeyEvent arg0) {
			}
		});
		____.addWindowStateListener(new WindowStateListener(){

			@Override
			public void windowStateChanged(WindowEvent arg0) {
			//	//////System.out.println(arg0.getNewState());
				__ks.add("Minimised");
				_su_=true;
			//	id.setToolTipText(__ks.toString());
				items.setBackground(Color.RED);
	    	    time.setBackground(Color.RED);
	    	    ___a.setBackground(Color.RED);
	    	    _s.setBackground(Color.RED);
	    	    ___E.setBackground(Color.RED);
	    	    ___.setBackground(Color.RED);
	    	    ___me.setBackground(Color.RED);
	    	    _bala_.toFront();
			}
		});
		_bala_.addWindowStateListener(new WindowStateListener(){

			@Override
			public void windowStateChanged(WindowEvent arg0) {
			//	//////System.out.println(arg0.getNewState());
				__ks.add("Minimised");
				_su_=true;
				items.setBackground(Color.RED);
	    	    time.setBackground(Color.RED);
	    	    ___a.setBackground(Color.RED);
	    	    ___.setBackground(Color.RED);
	    	    _s.setBackground(Color.RED);
	    	    ___E.setBackground(Color.RED);
	    	    ___me.setBackground(Color.RED);
	    	    _bala_.toFront();
			}
		});
		//_____________=3*60;
//	    submit.setEnabled(true);
	    while(_____________>0){
	    	k++;
	    	/*
	    	try{
	    	_bala_.toFront();
			 _bala_.setAlwaysOnTop(true);
			 _bala_.repaint();
			 _bala_.revalidate();
	    	}catch (Exception e) {
				// TODO: handle exception
			}*/
	    //	id.setToolTipText(__ks.toString());
	    	if(_____________==10){
	    	}
	    	if(_su_){
	    	    submit.setToolTipText("You have to Wait for "+(_____________-___l)/60+":"+(_____________-___l)%60);
	    	}
	    	else if(____kishore_____>=5&&____kishore_____<15){
	    		items.setBackground(Color.GREEN);
	    	    time.setBackground(Color.GREEN);
	    	    ___a.setBackground(Color.GREEN);
	    	    _s.setBackground(Color.GREEN);
	    	    ___E.setBackground(Color.GREEN);
	    	    ___me.setBackground(Color.GREEN);
	    	    ___.setBackground(Color.GREEN);
	    	}
	    	else if(____kishore_____>=15){
	    		items.setBackground(Color.RED);
	    	    time.setBackground(Color.RED);
	    	    ___a.setBackground(Color.RED);
	    	    _s.setBackground(Color.RED);
	    	    ___E.setBackground(Color.RED);
	    	    ___me.setBackground(Color.RED);
	    	    ___.setBackground(Color.RED);
	    		_su_=true;
	    	}
	    	try {
	    		panel.setToolTipText((_____________)/60+":"+(_____________)%60);
	    		___r.setToolTipText("SELECT QUESTION");
	    	//	id.setToolTipText(__ks.toString());
	    	    logo.setToolTipText("Developed By I BALASATISH KUMAR(R091074),GUIDENCE OF ABDUL AZIZ,DEPT OF CSE");
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	    	_____________--;
	    	time.setText("Time       "+(_____________/60)+":"+(_____________%60));
	    	if(_____________>___l)
	    		submit.setToolTipText("You have to Wait for "+(_____________-___l)/60+":"+(_____________-___l)%60);
	    	else{
	    		submit.setEnabled(true);
	    		submit.setToolTipText(null);
	    	}
	    }
	    if(disP)
	    _____e_();
	}
	public static void _____e_() {
		String EXAM_MIN="N/A";
		if(k<(__dru*20))
			EXAM_MIN="CHECK TIME";
		EXAM_TIME=(k/60)+":"+(k%60);
		cal = Calendar.getInstance();
		cal.getTime();
		EXAM_END=dateFormat.format(cal.getTime());
		////System.out.println(EXAM_START+" "+EXAM_END+" "+EXAM_TIME);
		disP=false;
		Random rand=new Random();
		String strand=(char)(rand.nextInt(25)+97)+""+(char)(rand.nextInt(25)+97)+""+(char)(rand.nextInt(25)+97)+""+(char)(rand.nextInt(25)+97)+""+(char)(rand.nextInt(25)+97)+""+(char)(rand.nextInt(25)+97)+"";
		char chh[]=strand.toCharArray();
		StringBuffer out=new StringBuffer("");
		StringBuffer fname=new StringBuffer();
		//encrypt strand
			  //  InetAddress ip = InetAddress.getLocalHost();
			    fname.append(_dn+"_"+sub+"_"+ipadd+"_");
			    /*
			    Enumeration<NetworkInterface> networks = NetworkInterface.getNetworkInterfaces();
			    String HD1="",HD="",HD2="";
			    while(networks.hasMoreElements()) {
			      NetworkInterface network = networks.nextElement();
			      byte[] mac = network.getHardwareAddress();
			      if(mac != null) {
			        StringBuilder sb = new StringBuilder();
			        for (int i = 0; i < mac.length; i++) {
			          sb.append(String.format("%02X%s", mac[i], (i < mac.length - 1) ? "_" : ""));
			        }
			        HD1=sb.toString().replace("_","");
			        if(HD1.length()==12)
			        	HD=HD1;
			        else
			        	HD2=HD1;
			      }
			    }
			    if(HD.length()<2)
			    	  fname.append(HD2);
			    else
			    	fname.append(HD);
			  //  //System.out.println(HD);
			  } catch (UnknownHostException e) {
			    e.printStackTrace();
			  } catch (SocketException e){
			    e.printStackTrace();
			  }*/
			  fname.append(_M_);
			  date=date.replace("-","");
			  fname.append("_"+date+".test");
			  out.append(fname+"@@");
		////////System.out.println("fname::"+fname+"\t"+_dn+"\t"+sub);
		for(int i=1;i<___n;i++){
					if(_a.containsKey(i)){
						out.append((char)('a'+_a.get(i)-1));
					}
					else
						out.append((char)('_'));
		}
		out.append("@@");
		if(___me.getBackground().getRed()==255){
			out.append("RED");
		}else if(___me.getBackground().getGreen()==255)
			out.append("GREEN");
		else
			out.append("N/A");
		out.append("@@");
		if(__==null||__.equals("null"))
			out.append("N/A");
		else{
			if(__.length()>=5)
			out.append(__.substring(5));
			else
				out.append(__);
			//System.out.println(__.substring(5));
		}
	//	//System.out.println(__.substring(5));
		out.append("@@"+EXAM_START+"@@"+EXAM_END+"@@"+EXAM_TIME+"@@"+EXAM_MIN);
		out.append("@@"+out.toString().length()+"@@");
		//////System.out.println("before::"+out);
		int ll=out.length();
		int jj=chh.length;
		int k=0;
		int count=0;
		for(int i=0;i<ll;i++){
			if(out.charAt(i)<64)
			out.setCharAt(i,(char)(out.charAt(i)+50));
			else
			out.setCharAt(i,(char)(out.charAt(i)+chh[k]));
			count+=out.charAt(i);
			k++;
			if(k==jj)
				k=0;
		}
		String charr[]={"�","�","�","�","�","�","�","�","�","�"};
		int lF=(count+"").length();
		//String outF=charr[lF];
		StringBuffer sF=new StringBuffer(count+"");
		for(int i=0;i<lF;i++){
			sF.setCharAt(i, charr[Integer.parseInt(sF.charAt(i)+"")].charAt(0));
		}
		//System.out.println(charr[lF].charAt(0)+""+sF);
		
		String Fir=charr[lF].charAt(0)+""+sF;
		
		//////System.out.println("********\n"+strand+""+out);
		String p=System.getProperty("user.home").replace("\\","/").toString();
		p=p+"/Desktop";
		PrintWriter writer = null;
		////////System.out.println(strand);
		try {
			writer = new PrintWriter(p+"/"+fname,chset.name());//chset
			writer.write(Fir+__e(strand)+out.toString());
			writer.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		____.dispose();
		_bala_.dispose();
		_____________=-1;
		//System.exit(0);
	}
	private static String __e(String strand) {
		StringBuffer ___0=new StringBuffer(strand);
		//////////System.out.println(ret+"\n"+____si);
		for(int i=0;i<____si.size();i++)
			if(___0.charAt(i)<64)
				___0.setCharAt(i,(char)(___0.charAt(i)+50));else
				___0.setCharAt(i,(char)(___0.charAt(i)+____si.get(i)));
		return ___0.toString();
	}
	@SuppressWarnings("deprecation")
	@Override
	public void actionPerformed(ActionEvent arg) {
		//////////System.out.println(__b);
		if(Check.getModel().isArmed()){
			uname=_ut.getText().toString().trim();
			String pass=______doit___.getText().toString().trim();
			if(uname.length()==7&&(uname.charAt(0)=='N'||uname.charAt(0)=='B'||uname.charAt(0)=='R')){
				try{
				int ind=Integer.parseInt(uname.substring(3))%3250;
				if(pass.equals(_pd[ind])){
					//GoFurther
					_dn=uname;
					//TODO
					if(!Ck()){
						//System.out.println("***fin****");
						enter=false;
						_hack__.setText("ALREADY FINISHED THE TEST");
						_hack__.setForeground(Color.RED);
					}
					else{
					___f.dispose();
					enter=true;}
					}
				else{
					_hack__.setText("WRONG USER ID OR PASSWORD");
					_hack__.setForeground(Color.RED);
				}
				}
				catch (Exception e) {
					_hack__.setText("WRONG USER ID OR PASSWORD");
					_hack__.setForeground(Color.RED);
				}
			}
			else{
				_hack__.setText("WRONG USER ID OR PASSWORD");
				_hack__.setForeground(Color.RED);
			}
			
		}
		else if(submit.getModel().isArmed()){
			JButton yes=new JButton("Yes");
			JButton no=new JButton("No");
			___.removeAll();
			___.add(yes);
			___.add(no);
			___.revalidate();___E.repaint();
		//	items.add(___);
			yes.addActionListener(new ActionListener(){
				@Override
				public void actionPerformed(ActionEvent arg0) {
					_____e_();
				}
				
			});
			no.addActionListener(new ActionListener(){
				@Override
				public void actionPerformed(ActionEvent arg0) {
					___.removeAll();
					___.revalidate();
					___.add(submit);
					___.revalidate();
					___E.repaint();
				}
				
			});
		}
		else{
			int size=__ba.size();
			for(int i=0;i<size;i++){
				if(__ba.get(i).getModel().isArmed()){
					String split[]=__b.get(i).split("@");
					_a.put(Integer.parseInt(split[0]),Integer.parseInt(split[1]));
					if(___n<61)
					__cl.get(_j_.get(Integer.parseInt(split[0]))-1).setBackground(Color.blue);
					else
					____1.get(_j_.get(Integer.parseInt(split[0]))-1).setForeground(Color.blue);
					//show no.of answered and unanswered questions
					int aszie=_a.size();
					___a.setText("Answered "+(aszie));
					_s.setText("UnAnswered "+(___n-1-aszie));
				
					//for color options
					__ba.get(i).setBackground(Color.BLUE);
					//forward
					String startW=split[0];
					for(int in=i+1;in<size;in++){
						////System.out.println(__b.get(in)+" f* "+startW);
						//if(__b.get(in).startsWith(startW))
						if(__b.get(in).split("@")[0].equals(startW)){
							__ba.get(in).setBackground(Color.DARK_GRAY);
						//	__ba.get(in).setForeground(Color.BLUE);
						}
						else
							break;
					}
					//backword
					for(int in=i-1;in>=0;in--){
						////System.out.println(__b.get(in)+" b* "+startW);
						if(__b.get(in).split("@")[0].equals(startW)){
							__ba.get(in).setBackground(Color.DARK_GRAY);
						//	_____bala.get(in).setForeground(Color.BLUE);
						}
						else
							break;
					}
					//end of color options
					
				}
			}
		}
	}
	public static String [] loadPassWord() {
		String val[]={"188OV","E564G","7E3P8","LEMBA","DPL77","46347","N6E19","UE9I5","C0U74","D6264","3T266","Z8VM9","85901","F59EN","45092","753Z8","KZDVJ","EJ63U","8A9R8","596I1","WH35C","U7PQG","8PE28","XUEQE","AS8O9","SM26D","2BL21","80W1U","H68LI","3XDU3","4V1J9","261KC","D5CT3","872D4","0GL85","411E7","E9633","33I08","SY63G","18P7U","3GBAL","VIKE7","2J4JG","84DFJ","01K96","ITZT4","JM34M","OU262","ZX8V8","1YY9G","F53J1","V6ZZ1","V5GO8","R2VC0","9J98W","8I417","Q0K21","VWR24","QZG5T","M3V04","REZIU","A59V8","U0A64","64DH9","V9FXR","B055N","1SJ1E","VAS57","1LVY1","541DF","8EUV8","21602","17326","B5442","2I115","94062","3A40Y","9YUZ2","0B3G9","8DG23","599Z3","403XY","FG085","IGIR1","575VX","WFRL1","6CC94","NZV9P","6102W","7T8G5","07OOR","CU3NB","O8S6M","6M745","B1EYK","VR8KU","4X942","CY2H0","F23GJ","M6E7C","R413E","V8P43","MDMRS","M39KU","WYR35","F8MKI","26M3I","388AI","777N8","K456X","945V8","J2UH9","GM4G8","EZ37C","87AYP","FL1U2","F99KD","17V97","MRREX","XV4EB","I4UH8","2N5Q5","21ZC9","0H863","SW3OF","C62TZ","BI9E7","5E4U9","3C930","HASTR","80914","1T5KJ","555R2","KP622","Y0LI2","H2971","795KN","J8T9V","J3466","7Z3IB","0L8F6","MB0C3","XFMPN","0153U","QDHM5","68DPI","026L2","9HB3T","PSH4A","9E2R0","29506","N79P1","X19PB","N526U","953G1","0MNNC","GE216","R6B9F","0F30K","A2R87","8O9SU","CF7NB","2K364","TJE8U","0YK1P","0U8X0","I54LL","R212U","3S529","U3SP8","1HA62","P94CX","KE61N","39ODH","N4392","R383F","5684H","2R59J","H2NRZ","LZH8I","58Q3A","50PL7","6O3QO","M714K","4Z485","YNQ89","8ZRZA","U1JYG","91W2A","200V2","26422","E0HU5","CKVMZ","C5TG2","KNQS4","67087","B4RHI","6PUKN","7KHOR","MTAO5","FJD6M","EPFGE","3B462","4E790","06DRA","EY1B1","41558","V8JGP","MBZ7D","8K917","3L5GY","SAU18","9DPE7","R0874","VO46T","9814K","19IIU","P4735","2R985","O33SI","01X7P","IT8VI","260Y3","4WT4O","5U6FQ","TKHR9","S1UZ5","H4591","TFY0Y","PL475","Z8689","2DJ43","K6020","DZN5W","ASH63","JES7L","44065","P6CIZ","E869O","75TZ8","XSK11","E1KGT","01PQM","EC08B","FCG03","MYNS9","29V38","GI13O","966S0","NCWML","M56RB","V8057","EO5C0","Q256F","N0P9T","R1A22","U86R5","823C8","472S1","4RHBG","1HBCJ","T07K7","9ZP49","26U2A","E3143","ZK0H7","V9315","KR66R","7A562","7JVW0","8O532","G118A","K0VCU","25O15","J11PP","P1847","K1966","09ZEV","9404D","R5363","Q878X","FKH5M","9403B","1HW9M","60LD5","ARFQH","D6D30","T646H","4S531","SP2O7","7A9HN","175YY","994SU","6ZI03","AY6HU","G29JL","0OBHX","5R9X8","FPE2K","18PU1","V1NHG","50TLT","M833W","8151F","D4Q6A","I17G4","9959X","0UZ89","0A5V6","0760S","G9MRU","YJRM4","H53E9","E4L50","VLAY3","8N9F2","T7F17","MN8P0","9FDB4","DA2BK","58H10","2G307","26SZ1","1U4IB","DD478","I84XH","185QN","PUN09","6V7F1","UX6JO","62JA6","11AUZ","H11I6","76210","UQUWS","G357H","731LC","L7NMW","N4CGP","54H1N","SZFK9","866YG","323F9","58VNG","WDE84","64HLC","XXINF","EX121","JEN3A","7JX74","QCEH0","11O0K","RL09U","L9LS1","3IULA","47APV","7006M","0B165","FR8SQ","IPJ6B","632UJ","6H045","4YMM3","W267G","F1606","5O750","LOB13","48L3Z","KR0S6","503YT","E4C2U","P6EJP","H8GTK","HF2AP","HL057","BHX51","4OAA8","74IMF","1570V","MBK02","V108C","ZOX61","816P5","01FHQ","5AHLR","J9P6K","97V4E","AGE48","R9YCT","3AE4Z","U9I66","974DP","878AH","R96I6","E3D88","5CWOW","65X3J","4V6L2","147KZ","389SB","46ZI8","899E6","69LXS","O5197","JQ52O","SI545","Z65MA","QC9E3","EE088","42MD1","9BFNL","MCO5N","40FM6","HD6YB","71T8J","Y2X1N","9MTMJ","E41DW","O3PZ9","0FRBY","A94SK","RO795","723B0","1XKH8","W2E40","9T042","W6797","9I416","M5D99","4XL88","Z21V6","PWW20","T262J","D66M3","73RNY","6RHPM","YB1YT","7M8UO","Q05GJ","69G22","W7X47","WDHV0","6316X","RB6GD","065L2","19KN1","W37B3","8BD3C","X4RRP","842P4","VI8V2","2Q976","9173J","2X1D2","705K3","834R7","929NT","36UIL","1I5TL","N7LQK","M8P6X","7PS7Q","276G8","90Y00","4GCFB","6AXU9","84J7N","05Q15","50E81","910J3","5JAVJ","P34TH","X5P7L","VQB7E","532Z4","9J565","949IB","SGG39","DYU9H","BMJ2Z","43P2B","3W338","34O42","7Q6TS","E1W9W","BIJIL","9M9DB","L73L7","5YW7L","MJG19","2I608","WTYB9","JK9RG","YOH08","4N5L3","4QC38","55B8U","BS513","CBNT3","6UAQ0","7RX58","G6782","ZLT17","O3962","C2LX5","PR815","92EC9","6D618","13290","526J0","455F4","9UD79","A7MC4","J0Q01","RLC78","I872A","5BD5X","92E17","1N4M5","XEG46","963OS","M6450","J9688","2DZQ4","0FY92","70OAL","RZNOA","98HU1","NFJD3","6S923","0J7J4","G5121","M7X66","TBG9R","B4SKT","89J02","QZSN4","09O79","I946N","488Y6","8P689","SBCLG","Z1TPR","D59XE","8353C","6DYK5","VS47P","2J1NW","XDSEX","M23HN","D7UIU","BU1G2","9MZWY","62TTN","HEWHR","9N6AY","C7O1I","IWYJ6","N00A0","U8H49","5G0H4","IK3NX","4HHIX","VS15A","K5157","R5091","J0CE4","R5N8I","LKSR7","F3X0K","37198","IY2KZ","58956","33Y5U","0829S","11SQ2","I882K","D787P","8O9XY","GQWM2","T718Q","65SKW","0X255","H975I","7YP36","8CA66","NXE96","2AZY2","64GB1","20KAB","2DJ0P","KNMWZ","TP93S","4O3P6","5P172","ZE2KK","359ON","BMKYA","2R7D6","W50H4","SH9AC","53J98","RDWO8","XGRH2","R2B83","HT6LE","Z8ZJR","9H5O2","OAU31","O6EI7","36HA2","HLTV8","9NA27","S0QLA","471V0","10788","086W4","ROPV5","61JEP","1UL28","O3X4Z","85HBU","GQ0F0","P3UCH","VU0TS","87XEI","952X4","3H7A2","21A11","BQDJ5","230G5","5O727","J0UFH","576BB","X6BTN","M5M7G","H08M1","OKF4G","65IZ2","2Z7A3","L3X35","V93M5","8F70F","36V2W","3UM0N","F57UX","WX03U","IT11Q","TEB2B","88438","01458","194DZ","342Z3","R18W6","CE116","TI1E9","7668Z","9605J","753B4","0KA81","P1E1S","1KP42","6RT08","QKF7T","89X7G","5ZXVT","T2XFK","62E03","FT90L","4N0A0","01IHZ","5840A","2VW88","BEL4C","SM541","RTG78","XSOL4","935V1","EB037","SS8E2","5603D","OBS47","3L419","9K6VE","KIP9V","C03DB","0GP98","M835Z","SM2I1","9TYZP","U18F4","TF6HJ","K8F6V","TW4W5","132N9","222EZ","06P26","52P7F","59283","SQ53Y","4A748","S615S","72W7R","67AV2","T528S","82YPC","6F44Y","4J76V","A8O4U","Q6507","AMP3R","05FF7","P602U","93FY0","OR9VF","961XC","FLFRE","30N2V","277P4","75948","4Z7US","ZH6Q7","Y12S0","DZ51C","33068","A58Y8","G5G08","G7XQC","GW0MS","631FL","5FJN5","YW2TF","Z5YEY","X94M9","Q44X9","MC9T9","C94V5","1X1V2","UNY1W","3MA2L","9DK58","D6S0G","TM12A","B709L","47A7Q","Y351M","T518H","043K3","MEK9F","AZRQS","09AG6","FM2AP","487O2","43H41","F8E4L","4J49D","W4119","585S1","8Y9O0","3Z80B","LBY59","JTIOS","VQ655","I1538","AEDV9","059O5","56OL1","53491","66Z60","VR9KP","8R0AW","IDCU3","J98Z7","3H911","89XOX","18NRT","4117I","9P33X","OG804","520BH","D9Y06","LV2A0","50SIA","04DD5","7Z3UU","P310O","SU8IX","Z4G01","N26XE","8BWX3","30MMX","8IHKS","YSJNS","C42YY","D8Q28","5T0F6","1BN0B","3G6HE","7713Z","0TW8Y","A9QG1","2VJ25","6MY7V","EN17S","387RC","51EC3","22RGG","DLP23","FNN28","SJ8G8","6IG66","ONN9U","7UG1N","GW4SY","LH8BL","4G04V","SA611","50155","7R1GR","AHKZD","7M804","7TID5","13X8X","KC47N","F8G3S","8TI8R","B3S2N","1Z441","763B6","VX0V1","07CW9","UC2Z9","O1FY4","98T9B","50XWD","FUJ35","P8502","UCUJF","50U0Y","P61VG","75W1M","UDCAH","8H9N2","70V6E","XUM22","016YP","61423","428AT","7V74R","GECI1","X8411","V7G87","9488C","WP3S3","BA7ER","1PH64","D0JMM","21N3H","B3JDV","1W8PB","19XRB","Z2340","4U6W5","S405D","B9Z9V","57RQQ","88656","NVQKV","9C2JM","31HED","A1SIA","G5XR8","U9IZF","IP63H","09O6U","UB618","B3J4N","34BVS","84NP3","KV179","94676","N558S","S3177","50328","Q64E0","996OZ","AC22Z","00WIN","0LZ7J","4X6Q8","81TD3","776I0","F32U8","1I6P2","11W6V","HFE5A","66Q66","I9CZ6","8D55Z","UI1Z9","VEV12","ZGLO0","34OLF","LBX65","L5982","2E6G4","K8Q5M","458V8","8V4GI","RPS13","35FC6","1Y87K","9VD7U","G818G","4611V","H0017","176RH","TXNOR","23275","QP6L6","599CU","78JEA","C9I2S","9E2G0","99YZ1","21G5G","C61B1","Y1K44","R40IB","E97EU","5G2KQ","VFO12","P3W86","X55LW","4UZM0","19A45","O0T25","ZNBG6","10824","A999L","R2KE4","F8B9Y","P1166","67P5B","E2I8P","0H513","T2JU0","0SA3O","1B514","SNL7D","00D62","8P4Q7","LLN6C","7BV21","G9GM7","R3H59","C1C04","Z5RAB","7M2KL","FIN4T","EQ7CX","G84J8","5JGM3","9FM31","H6698","JZB6C","70VOR","D43K7","H7SYJ","8AY80","U94PW","GLNX7","C281F","G2OZ2","7PI53","167AS","O8H07","GB178","HGI6Z","1BAGG","RNT01","88GUF","PT62A","59U55","682SB","VW719","O3332","L8H24","1FX6A","KAI75","R93TP","18J9U","QY74F","624M7","MQ1PU","3E00C","7HD5S","962X5","O9O0L","T3W4Z","F2V97","2D217","5GEWJ","RX93H","6HHD1","10V9O","130Q7","8X25V","152SQ","2C8I8","X9I8K","S907U","6FJQM","K2OL6","R97MS","357ZE","UV4Y6","079H2","T563D","V2C33","47R4C","RUG93","U805Z","GGRQ2","63QG5","1HS72","GILW1","7Y0Y8","HQS3A","NZJGP","NS0FR","00R9F","34P4F","6KSI6","LA675","TG137","1T743","GJ71E","DG5WQ","95AX2","8FY8J","89O03","USJTP","D7T57","Q5SN3","R6389","SIY86","19373","Y4CD5","7P6SS","S610C","24902","EKI5Y","6J64I","2568M","ISV7A","IW33P","418S3","87VRY","R7S2M","DIS48","T7UOF","9181D","MNSTR","1C882","67IQT","RYRK1","7WF89","TSFV8","U2HEE","V2428","67K98","R46NZ","5WKLS","O0I08","9E76O","YEV61","P26H8","7ANRG","KF803","89O6V","Y8A87","NDOUY","7ZU7Y","G6O7Z","T54F9","M50S0","7O5IG","601R4","7H405","DN32H","NH8K8","R0231","5NO0N","28E1O","9W0J3","HF4U1","YD9F8","E1WJ8","NO55X","RU55J","QVF49","G257H","KC5V4","8I349","54F42","NK2EL","4G7AJ","0M8R8","2TRDJ","1OYHX","01Q1H","VLR01","2R8R3","81T4D","3A8F2","S69A1","5HL15","5MVSM","0J00U","Q0Q2H","E6UP6","2D19T","0E9VM","3L69G","KTOG1","1I5RX","V82P8","2F2DY","AS9H4","1EE6I","GNI2Q","VA373","9I831","05APD","YCP08","3A2G1","OO9DR","572CJ","UH9I2","43K87","3012","L6MAX","250SK","9PT60","L2095","11RV6","JR56X","9905U","I8X2R","Y7M1K","5JPWE","YX12Q","06FR1","5FH28","ECYJ3","41GMA","00A2H","12093","1IQ1C","20N17","O3XD9","0R5KZ","GAG1S","Z2387","6E6FA","53823","7R3C1","69JO7","9985C","9Q3RD","T94HR","V5T6M","2P06S","6QVG1","L1275","H82Z9","73QY2","O1286","97737","42MS6","44XE9","E594S","AG98X","DJNR2","E4Z20","0X763","69EHT","583A4","3NS2Z","856TK","JD5R3","IX56D","7T88Z","I699Y","K5NG7","5O485","JSQ2A","WY5EK","2J3V0","DAVW0","7T06U","4CM77","RW53X","9F421","SC6W3","08F8K","FZIPZ","29S86","GXMJE","U4KE4","4W24K","UOD9S","J56L1","9ON50","12YY9","49REC","1H8T8","S1K5T","96HZ2","A8AN0","JFR9V","5VKO7","L0L43","12DA3","0IN5G","7756A","N6P8Q","56QO0","N3RI9","4RWXZ","6Z367","E4M5K","75A13","WQIVL","P6P63","UJNMV","4WLN3","D2G19","4P67D","148F8","99GKW","0RYKN","90013","LA9O1","1ZEE8","920L9","7V11I","OJAJX","CKSZL","FNT6I","K9915","6F29F","C6FV1","GZ89Z","L7IJ3","WMMZF","CAF95","6CR14","7O3Q0","A49MW","E10SQ","2VZ00","6QC3T","M787G","UE65C","J8I28","AY61E","SZ9H9","8T0F5","72XH5","7L39O","QTE15","8Q47K","WK4PG","682OV","77682","1920N","N2O4Q","DS7I9","TF1XP","6ON87","T0ATE","77RLN","L54UO","IW65F","5H8QU","9H2A9","DJF4W","KHQ22","OC850","X6SS8","61D84","QD739","RFHRW","RSE9O","2KH18","EV08R","0T3UU","1A503","L70OS","07Q66","48G33","8QDQ0","79FNX","UZZ96","D54R9","97536","XT89D","87K1G","1826R","TWN8U","5A518","U4E12","DZ9AZ","RMINT","QFYIP","84P8H","R0HL6","287I9","933S8","707NS","43PFZ","2V7G3","U89CE","ATV5T","D5IY7","56761","X2J82","87QT3","0GAJ0","D0Z95","7H9V4","RO638","DS420","1Y8L1","UZC4S","YY6W6","06O8U","M8601","PYZLR","8WT00","61MG5","LFR06","8W921","UR5UZ","5FRU9","826XR","7QDE6","9A20I","CY1EX","A69RP","5Y08X","P40DW","GT864","275QZ","6C6JI","2CA0S","38638","KVY7R","F8JSH","HR72K","4MRI4","2S0ER","T58R0","U7OPM","I29UG","8MS7L","LATK7","M1LTC","63G95","TP850","1V1RV","T77M0","79M10","867LV","877CM","A132L","RO71T","V8IXS","FZDRZ","77DL8","6JIU3","QVL67","ID428","396SH","F196C","5SC25","79K6A","06YP2","Z3SH4","TRE6I","0P76H","HE964","RH71P","AF58L","23W9J","6594S","4SRCU","UXEOG","KZOA9","V97F7","E87WP","2J125","5SVO0","E7RH3","L6LH7","WRR3Q","40H9Q","FR93Q","D2053","ZNT59","4HC2J","6S9TA","O9T85","M4I97","7X1Y6","WZKIX","1MXWL","2ER1P","FMJ78","U45FL","UOX16","EK6M3","H7302","0056Y","3N3R0","63JMX","HSQN7","XUKMP","O97DQ","3R5RQ","J9411","933EU","V3990","4RXAR","WGF1R","NA659","2Z3U0","9Y41O","9Q46R","70DZ7","9R369","F8543","UAORG","UES44","07RU5","4D754","FN192","Y1O12","23PYR","12AQX","357Y0","RN6YY","HDJR9","595HN","V3RF3","UO787","KPNID","59148","405GE","2UIXP","G18EP","F04GC","YO7H2","9RC51","5H4N1","2LAXX","QVQD5","UL2I4","0207U","SO26W","37A4D","G7PED","2HX3Y","2S3R2","240YN","J2KHC","2AM67","G43EW","1YR91","Q85IX","Y42K4","AF9L7","TS404","321R9","7R81R","IUW87","JPW74","D1423","87794","6NHJV","2RP6A","LFXG0","TJJYI","6019X","SG0KV","L7721","AVG0S","M771V","689D5","9OCLJ","VXQKM","07D79","50Y57","94EA3","7Q60U","1HOTD","RA015","99962","QG9C7","R25RH","PI42R","OP41Y","ZW6J7","64596","2823Y","11O2Y","HXRV7","4C248","LT703","K9E49","VL4VL","83745","P61K9","1C0J5","54E2G","W2VYM","7W17D","TO5J7","Q27WQ","3ZG1F","528DS","A405P","7QCR9","Z8H55","EF886","8UF4Z","K7J5Y","N75LR","H8DDW","GA282","DUW14","6RR5R","4IA49","53171","0NVU8","L681G","SN3JR","K4337","KN65N","CJ9AM","D0ON1","D3ZG7","OR9IU","K9068","169L9","9S1K1","PR6L4","5Z247","DA8U1","6O9OU","267EC","73J26","IA5Y7","R45D6","0E6K7","NPK9N","3COTW","OKRF3","W88H5","ZJ48A","90N9J","AW9V7","6D0LX","VO2ER","9NKR7","STA98","XO2Z4","OFGOG","VNV02","Z549F","12R84","OO783","2D92X","43N8J","R8K1N","2TF83","Y11RG","C31P2","9554Q","200VT","D4DDL","K0U3U","1618E","PR46R","RGZ43","YO213","94Y91","KC1Y9","8K1E4","KT5V7","3S59W","72VEL","8FG09","YNLD2","UM5O1","10M2K","F9044","H294S","GX3X3","7QH8L","H1X1H","1LOAQ","95H94","58878","9VC0R","4C55X","8RKW0","6D5J4","3R7D0","Q3OFI","SNV5V","61A7S","637K7","P32A0","RM17A","4HDJ5","C8Z2Q","H72FA","H9853","5N61S","VCY5K","U9DMC","T5K45","Y415N","4P9Y6","QKQRR","5YU5A","86725","4F8R6","6L2L7","53861","A1W03","POG8R","URN79","TW1CM","3M7MR","82033","O018D","YI216","2F49M","WZGOL","0184A","25Q85","97T58","00JGN","EZJ1G","01W7P","QX723","90HW3","4IQ1T","9424X","3HRXS","8522N","X9TU1","4F80V","TQ8C5","5WUNG","3LCAP","5R1I4","6ZU9U","3HXLK","ZONPI","YLK95","06QMK","UI800","Y78V1","3V296","7YFD7","YGC1S","1Q7X8","OW6N8","8798J","LEV75","JS05D","511CR","6SW7L","6F3RR","ZY40P","1W37S","A3L56","1H3HE","1O64G","2AGWC","882GN","6.1E+","TY6YX","1I98R","2DHWQ","8242P","HS576","UI0R7","W165Z","VO5Z6","L9ODT","H34FM","P8536","668OR","FKCC1","VRN9Y","TOEWR","281QR","7I6K4","3EU2C","6DM43","8FQW2","9ACD1","W4790","LK4L3","KDS0C","F1J2N","6256S","0V9F4","D21G6","AR4KX","3QX8K","R4RQ6","C696F","98KI0","9180H","49Q5Q","JR70R","W5L98","N2D5F","1714Z","85FDP","7G455","XNI31","TQD88","ICJVS","03DR4","3S50I","Q64UQ","9QI5I","I500R","41Y2R","KH0P4","837D1","QPA9M","74IN7","05O4P","Y4XEI","TE268","7R18Q","377PS","8T2T9","PX072","M6A9V","0JPA8","26K1O","6X7S4","2VC81","0I4N9","7AA18","KNYP2","1F47N","P7015","49GY4","6004R","QIR9N","NR9E1","M563W","LJVVF","R0R5I","9HDVI","3296Y","EOLC2","RIRE5","IN007","14T83","CNSWF","SL958","41L2M","0F0V3","P0R2L","M4K79","2ENJ1","558JU","R1K3J","P9I6M","E4YQ6","0XCRR","P44ZM","3OGAE","M027V","58QU5","29885","KL18U","207FO","6K98H","ZDJVR","60HXV","2TYF1","90663","82E7F","66004","A1S73","O54DT","TFO6G","5C69O","1J1OZ","3N9E4","53RP2","66DC3","A3170","N72W7","I1Z2J","8EIEQ","73R3S","8KA7J","PYA74","VRR6P","9HWX0","36199","W2HCI","5H90C","50TS6","2HR6I","HG564","S782N","4Y6G2","G75IR","5A0MH","1L14Y","60Y68","9YK27","E1UL4","TAQ64","5789V","OO3TX","412UK","D35E9","OT1XQ","4YI1P","SX5CV","CG1O9","MLU4W","6KJUX","KP87L","34G4V","5O5TL","J85ZG","66949","ML23N","451","7314G","6AYZN","MAVK8","8N214","R9RH6","M5VY1","R773N","KU1P9","9J614","1C73S","93F7P","Y6RPL","7GI62","61KZ4","6Q018","S7P41","C02RR","A378Q","0NXK3","75ASO","KA9K2","SN3OU","71QT2","Y6ZXU","V60ZR","R3VTP","2Y9KY","TL0O3","W1093","58W82","9S1HO","5230J","4QE2J","Q3044","D2343","06D12","4672K","0X92U","O3NJS","N6P5F","WRTWS","245A1","K736C","L9X9C","5IRC9","PFDZR","2V2QN","7QVT4","4S15N","P586R","RLAVC","S772K","HJMN8","E41LD","TC833","I0JA9","TA03S","PT213","HLJEM","9OTX0","1HLV8","Q678X","6HQH7","3A11L","J1LWI","2AO14","5I753","DR2Y6","52M8K","1U19W","M13O1","S64V3","XLW17","C8GCM","2MU33","5DIRH","50R53","R207D","Q8LC4","3Y68Y","QDIDX","5PUAS","039K5","6G9O9","W27GI","P23H3","J2E28","9S797","T7F80","0235C","P0WX9","1HR6F","86L38","9Q1D9","ZUV3Y","1LR2V","95MP0","4J534","2V8ZR","36H9A","GZ537","V2FRO","C65S8","85T99","3I3ET","45Y67","83UNU","VK53F","7G539","31L96","O20MD","YN782","X33K2","65126","1N4I3","LWP04","10R2K","033S9","YQJG8","6185P","P923G","CA91P","68RG9","L94R8","31SOQ","P336P","AV0O7","5Z9P2","ZJ9R2","J4FZ5","IA24S","FP2O9","GCKLM","0WR9D","R0P5R","K8I80","AFXFL","R1H35","5W6IE","RQ66D","1378D","HZ20N","WTU2X","L38J9","9GP3R","6T4HL","D66OH","90U62","3Q30V","D9D15","83GD9","56NCR","427PA","D4J5I","F91M6","H4Q2X","UC6R3","8PJV4","66682","A1DC0","N9K96","6RJKU","N3SUZ","UYR06","3685L","4NG1K","9I2RJ","H5LW5","S5N77","4VAP3","137YN","43XK8","9202G","R8NPO","Q02W2","15388","VW602","H6957","11211","Q0STY","T868D","YL5W7","207DP","D0Y23","51S33","76P0A","CG511","WOMK3","ZX4XY","81R4X","J312R","1OK1N","XDM25","GM0LH","7668X","N93K4","2VI34","343MD","879Z3","YE158","RZ226","072U1","15C80","E744Y","33453","U1UJ4","Z4H97","58FXU","QATJ5","HO261","U62O5","55TYW","TTN8S","YOXZ1","KN65U","X457X","4KZYL","G1708","26950","S2A68","147UC","18CNP","G59H0","54Q8K","ORMRT","YIUGG","F6Q30","H44N2","0232V","77M84","V4KDO","2NQUC","1K4D2","53CXN","T9TK2","65LRO","7P6SJ","GS4K4","D4H9L","5370I","54296","G6J6M","O5W2A","269Y6","S2MLP","TVDRV","9X7Y4","6488K","53WMJ","2464R","K6067","VJ57D","V27MF","5209W","74G3P","YFG3H","AO69R","WR8F3","JM500","ALR76","3MRS7","70L5C","HLX86","FUP56","569O8","M1SRJ","F1G13","95KRK","89M9N","45284","1C6OK","95067","XIP01","J098M","QW3YW","YR6P4","71XTH","G2LK0","I1MP3","773H5","O3031","Z38RE","LIG07","36D03","EH921","GP800","RK9HC","5RMJ0","PJO2C","WT9U4","U9H1A","X4OFS","UO44T","3OASD","83NPM","D3T7I","VXRP4","3PAKA","33V3Q","ZKYXI","A7Q3S","20PS8","SA4TI","9O1X3","Q8Q8D","74540","QM319","T5J73","VD619","21M61","43Y94","82SO4","TIO78","5E4WO","T25D2","84875","I0MWG","5AMOX","1M7Q1","N38SZ","Q7681","794N5","WZ7RX","RE019","5R5D8","F5F5R","YR98K","2OG30","28376","50Z1Z","1R0R1","8MW48","32422","7QRX5","NJIQI","CK65P","TJ9NS","P1GRN","P7C25","4DTAZ","5OA4W","85XSK","7IWZ0","1Y025","FAQU0","4MR8U","NPIN4","503O8","QAHAG","T044E","3670F","P45J6","C9S3D","0779O","1Y81T","Q47LH","589TH","UESUL","C3JE9","ZZ8C0","3233R","3505Y","O71Y8","RM701","2Y0N8","ISQEO","774QD","3HAVT","7W113","DX774","059NV","N9605","XE85V","6279F","YX46O","77PJ7","U4SJC","0C769","56G40","D9EYD","MGRR0","37N37","T25UW","E38GR","6WU55","A4R25","SGE6N","M2398","12487","RA1H1","49L06","4WVJO","5O1YV","8XLJ5","WT249","0D1R1","F9RC1","T63Y3","YD387","A9XP3","95675","MA2R6","QDYXU","9FV95","QP16U","35WW5","92JE7","94VC2","8G108","00X1F","Y02C4","861I3","2695V","44H3I","LLE0J","V0629","M821Y","H51SJ","OP10Y","4G4Y8","1661Y","MMY9V","0H25K","S4Q2S","WW1QN","65VM5","AI12O","7R202","KKQ3D","S65EF","378U4","33VR3","XVO88","H02RT","297U0","2896I","74177","ZRF83","UO368","052SG","42K85","5314C","356G2","ZH9RY","R124V","391H4","SMW3U","7NPAJ","I9U8Q","GVLYO","2M8HM","62AP7","SP6TP","03A9I","2O997","46055","OQ3Q1","G2L1I","Y546C","S6F8D","902JU","ZR13W","K8E17","XQIQQ","8J584","26R2R","W7T2D","27GKX","KCIY7","R73L9","UCR47","HH25H","6TQ40","W833Z","UYM4R","2RH1R","Z7SS1","P0EK5","4301U","2R60C","FE9R9","JF8IH","74U12","ESU1R","2R36O","U0800","2Z9OH","9YE38","HCCME","24R3I","I4TRG","7HN1Z","RH6OR","C2446","SU49G","X1L9R","2XY46","HW598","3K7Q9","R49Z8","D709P","6W7R5","0W3E4","64ERN","1WV6F","PN143","2094R","37343","520RR","6UR24","393WO","XZ52W","ME30Z","Q85RN","66R0V","2T550","249EI","2YN25","4F862","D3WDD","DNSR0","WQH2K","L6UI0","RQ299","YARAP","QLDTY","EYDJ4","T1E7O","VX492","15Y68","OUY60","V1S56","OXO5F","R85UK","4X7T1","04EGH","UCQA3","2XM35","C4ESF","DS39X","9YUXG","JC86Q","6R167","251M0","R3N63","07F0L","U20VI","VR7S7","H2A33","89E8M","659U6","2LG5N","C6UW5","N6DQE","1M907","0E85T","7647A","6X9P7","6P2MW","I9V65","39D8V","N5064","0N822","A5738","1C1WA","9145M","97XIJ","67X95","KRH65","N2717","K4XVD","189Q1","9RYV3","DWG62","0R8OH","V8V58","4QV33","9860U","17HS0","6XSGM","YR5F6","10PFQ","VQ580","8AC74","MEZ3L","Y3HN5","8LOIN","47DY6","NW8KJ","CN858","95057","45446","71G1J","9S99P","0I2JS","786XW","496U0","S9MWT","ZT78K","OLVR1","0V5L0","YI5G5","4J77Z","0O44T","5EXZR","L8R4K","UH715","0V8RP","I429T","LU7H4","C364T","2UC1L","ORS4X","Q1J97","DL70K","7.00E+15","3E7Q4","U7M90","GS2SP","6Q99H","WPO2K","15TJ4","W72M0","J5D4S","VQ3RG","744O2","5K917","4N2TZ","SNP4C","4W1P5","N6166","X76P1","4K3SF","8NT05","2P7LG","032T5","146KV","3KKZX","GQV6Z","I1W5P","94465","6F456","8NDWC","5QK1N","33P4F","62KK4","U0KQF","9E602","VIM41","XTQFJ","2N590","3H6RU","8XHYI","Q2Q43","7R303","8P6U9","I68Q2","58F3Z","9U9P9","Z2QH9","YD16E","78EGZ","FSF3J","5XRWO","321CU","251Y3","4K5Z8","1D314","21DFX","66NKI","F6M69","492A0","585AH","I9P56","QJ49R","1OF3T","0UL11","D0400","9C8ZD","O3TE9","SNIQT","XCFL4","F5H2W","8496J","N0S86","QD0J7","W43M9","D57I6","Q3J9K","X74K5","R88LO","1Z295","V3T1T","81PNQ","Z498L","32JN4","H3OU5","926KP","52228","Q8Z12","MHVV4","QR637","498FR","0WRF8","27CTL","38X9R","O8IP3","DR7X7","GDKCM","Y12SR","6RX4D","39SOJ","5F9R3","JGOS1","3267M","37HL6","10AI2","P6N19","XA99E","7SG30","9A1P8","L1XOG","ZQ4L2","R617P","MN4AN","IJ33M","1U63O","5R5OP","HNFYU","ZRYQ6","HZCF5","Q54MU","P50L1","D7047","WUJ55","R0R16","6ORN7","8R8H9","O34ZU","523OC","7649I","D71MZ","5JW3G","K1463","46U45","4I4ZQ","V40VE","O0269","79031","910OQ","CERT0","2YC40","8IM2U","4UVK9","R31Q9","THTLT","54KLI","0RL7Q","C5C9W","1J005","A8712","1066L","F673H","2HY63","DW247","19772","28Y27","C9O55","06NC8","7A48L","12XVS","033Y8","7AEZ8","QPOM0","G1354","RA2OI","DT4R3","1AH7V","0K2P5","ZR770","IL9N3","2S315","05T86","QFFX6","RCD33","RL63R","W599X","25YMR","0GY6D","T8VRQ","N9C9A","J9QGI","PVV6G","E7XCV","9JW9I","27WZ2","N27XF","14O97","3JQQH","8ZOCF","11713","E144X","N9Q8J","C937P","R69HD","I998O","6G1VW","8RJTS","57HWE","7NS16","8TWHU","31TRG","UDLAD","EELP3","S852I","670YK","935SO","Y141P","8Y463","KDR65","RJOOW","7MI1W","8820","1K127","LZ803","NFSE8","621U7","1O2M1","85O63","6YZY5","KR5LU","J0IZQ","7FD07","8DT3T","I490K","48VT3","IKOL4","7485F","FR14E","LOI15","145GT","GJ9RJ","AJ662","0MI38","5W3P4","R9W27","1XW3J","ESE0L","50R0F","5RYF5","Q3828","SGGDJ","04QC2","X21R0","HE68F","NPIAW","3DW5L","K525L","HMK25","0ZAV4","926HV","4GX23","Q5DZC","7VG12","25X8A","KM06T","68R6E","5104T","O5276","F1VKG","8Y22Z","22WF6","LZWG9","73043","Y0H3N","L8PV4","6J61C","0A1P9","SL2LC","S34RH","5EV07","4I33O","45M75","37XO5","MF5TZ","EH645","P54FC","R034G","F97FK","K642J","2XAWE","MT6FP","D8H80","WD9KS","68M6Q","3ZGX5","Y6FP0","0DW3J","7786G","9YDZ1","6P75J","OY9Z6","VNNIK","033J2","FNY0X","WK682","49C4K","363D9","64L9R","F7L34","5XERQ","T85LE","C3S0E","WA56C","J00FS","D0YP2","7KMVG","24F76","D3O5G","Y4304","0FW6J","7T36A","72HSY","324GU","1AQVG","S3923","437EC","11KFF","I3ZF0","7M2X2","G5T9P","64VJ6","LJ890","G2L49","LYP12","8HF32","GRM05","1RZ9F","9VFP7","N4K2C","MK8L3","VX4G8","A68LA","21362","LD13R","19PK9","G45TH","C8KCL","ROFVY","4EY73","74T52","S1896","YK8D3","8ZK27","XP2V4","C088Y","CL0F0","C3053","SUT34","GL0D7","V0T67","RDE04","8S9LK","OJ418","6P685","X1750","E49R6","XS49O","270Z9","4H5N7","ZP3T2","WM9U4","LQX1T","0JHDO","YPFVU","7SL4G","65G63","880A5","J7868","9GH8Y","5H20M","VE0RK","V3O3P","E28R4","R89LC","66X7C","R0257","AFVF5","3UFD6","DGR11","DYCR6","3W30Z","74SS3","5X638","EPV4Z","Z6818","731QH","S92G0","NWSMD","O5978","UIY67","2DKLR","OQ8I4","9ZCFS","A8H50","DFRT2","FF80F","38177","U3ZL1","67K8O","O7AZS","3PCVI","AQMVP","873IW","F8236","LRUH1","A44SK","XQ5N4","R72Z1","VURSW","N3206","KU153","RD8Z8","8XSOC","04NVC","J6K4Y","Z4905","XK3VH","83O48","8OIDP","966Q5","DM0LK","DN3R5","J165Y","7FH77","N4159","7P40V","XP451","230QZ","525YN","L6HIA","2Q5K0","Z8YP4","4G0LP","T54Y4","42465","0D4HK","G9G13","3SWIP","Y9RH1","1K843","A0Y7E","E4FK9","12023","K57WR","7N213","SKE24","GH296","S1O85","I827R","KG77I","UQ182","5Q8UW","9L521","HNA15","C6UP6","6ARSE","63R2R","2LN7S","F66Y5","XLFP1","TA39E","X8CO4","05ZT1","1J20C","R68DJ","R2714","W52LF","84IWN","020V7","7LXYN","67S33","8W3S8","G3A6K","YS374","6G6H7","L67XF","Q993L","9.00E+50","35QF1","NHS8X","9136D","54NIW","X5W2U","MIX71","1053P","VWCWG","58R96","4I27H","ND8GM","160P6","DEPQ0","S93NG","0R4AI","DSWJ9","4CQ82","7ONQC","4HQW5","05N49","MDKZJ","JL301","T9DZP","RD026","A3SQV","93WR4","UR65P","G58F5","E70J0","7R1H9","1V34U","6D60J","DA412","37D3N","2355Q","WZ31R","5F93V","G3QWL","S6524","UZHU9","L5ZRR","0Q4RC","H2ZVC","8P0ZN","SR402","JR71U","3X4W0","JF84R","I1THJ","ON509","I2R2K","K57N4","9W6SH","3MC50","U6J3W","12998","4R8MU","TC369","8PAH9","8MVJ1","8Y1V6","Z45CD","Q5E72","92NG8","40H4X","0W06X","8NCR0","4L0WN","1016K","65U43","1TYT7","ED68Y","0AM14","PQH4J","KK3M5","86Y0O","UIFH4","IP24O","8O97Z","MPODJ","6X941","06VK2","44ZL1","4AG84","MGAR5","39323","L0QJ3","50ATT","78D77","J1IH8","Y701K","91RUI","YYOIO","15710","6FC82","A5QD3","218UI","00I95","I80I4","388R1","7IVNI","MW3O7","J52U4","2OOH9","8HS44","7T5Y2","U696J","G25VX","EPDU3","PKTT9","088Q0","51V7P","FY0R6","1N224","J8977","3O3F6","LXW15","JI02R","84659","R0949","S6X65","61W2X","Q9658","00GER","59V7N","R787E","1V00V","YC0UQ","G46SN","U1NSP","50640","94RXX","ISCOU","X48GR","ICJ8F","F05UH","Z4N93","C5705","MY262","I6L4D","06M92","W149E","S2YS2","06F80","53QZP","4S0VR","095S7","P255J","M5H54","R6G64","816O4","5S5ER","RLJ3N","P31FH","2XG41","4629L","YW0L7","279EI","JN3C6","4L2RR","AK6M7","W9T80","80S3C","MZL66","NK36U","MSX25","4RR1N","35IHT","FW1N4","S97K3","83ZCH","UFI89","V33SX","206LZ","L2T92","75EA0","859M3","56018","PSG15","599V9","ARZ89","1MD6M","UZ643","LS148","32O7F","CY452","8GXCT","15350","5IPY1","QDVCS","M50OE","1Y47R","J604P","F5MF5","CZRL4","Q777R","OS840","4IRYR","YO9V9","OLK94","65DW6","1ZD8F","U76ST","Z11M1","8WS47","J0038","17ETF","4C48K","2HWRL","M345Y","0A296","R4U7E","3Z44K","Q44G2","83YK3","714OU","8E6C0","ZVW0Z","YXTF4","Z112T","07LHJ","JR7YV","TG5VG","JVN5J","QJFS6","8M527","ICNX9","D6VDR","7065G","66WK6","9FZ2Z","M8374","E10VR","3RQ73","X52X8","WX482","M706M","0094V","V4DVO","OS748","0S3R9","WZ6C4","68M13","RYQ4A","X2394","EMH3N","7005K","20K2O","53DD5","9SL2Q","38PT1","ZQCOT","RJUQO","Y1K22","1S806","9YX05","3P7JQ","T8C0R","76424","P9M9O","7406","416F9","D0Q3C","JVKOF","6358W","2UNJZ","G7GW0","888R5","SP412","KK91U","7AXAF","YQC7M","29EZD","X167P","G14SX","1NV6S","8HRF5","7IHLD","4318N","17495","786OZ","2Q8T0","RYZUC","V0562","5Y1GR","LGXER","Q8312","3Z57A","FXFDG","0050Z","RT050","RDC53","U869J","QS3FI","1G6RM","0YRRY","MLVF3","40W2X","N6OJG","V3L66","G93R3","73RMY","966HX","DD1HZ","2R823"};
		return val;
	}
	public static void _________________(){
		
		dim = Toolkit.getDefaultToolkit().getScreenSize();
		___f.setLocation(dim.width/2-___f.getSize().width/2, dim.height/2-___f.getSize().height/2);
		JPanel panel=new JPanel();
		//panel.setLayout( new BoxLayout( panel, BoxLayout.Y_AXIS ));
		JLabel _hack__0=new JLabel("RGUKT EXAM");
		_hack__0.setFont(new Font("Verdana",Font.BOLD,30));
		_hack__=new JLabel("Enter username and password.");
		_hack__.setFont(new Font("Verdana",Font.PLAIN,15));
		panel.add(_hack__0);
		panel.add(_hack__);
		JLabel username=new JLabel("USER ID");
		_ut=new JTextField(9);
		p.add(username);
		p.add(_ut);
		JLabel password=new JLabel("PASSWORD");
		______doit___=new JPasswordField();
		p.add(password);
		p.add(______doit___);
		//panel.add(panel1);
		
		Check=new JButton("SUBMIT");
		Check.setBackground(Color.WHITE);
		panel.setBackground(Color.WHITE);
		p.setBackground(Color.WHITE);
		panel.add(p);
		panel.add(Check);
		Check.addActionListener(new Main());
		___f.add(panel);
		___f.setUndecorated(true);
		___f.setAlwaysOnTop(true);
		___f.setVisible(true);
	}
	public static JSplitPane __________gr() {
		  int boxEveryXNumbers = 3;
         ___r = Box.createVerticalBox();
         Box cbz = new Box(BoxLayout.LINE_AXIS);
         for(int i=1; i<___n; i++) {
        	// ////////System.out.println("bala"+i);
              JButton _ka;
              if(i < 10) {
                   _ka = new JButton("  "+i+" ");
              } else {
                   _ka = new JButton(" "+i+" ");
              }
              __cl.add(_ka);
              _ka.addMouseListener(new MouseAdapter() {
                   public void mouseClicked(MouseEvent e) {
                        handleMouseClickOnLabel(e);
                   }
              });
              
              cbz.add(_ka);
              cbz.add(Box.createHorizontalStrut(5));
              cbz.setBackground(Color.RED);
              if(i > 0 && i % boxEveryXNumbers == 0) {
                   ___r.add(cbz);
                   ___r.add(Box.createVerticalStrut(5));
                   
                    cbz = new Box(BoxLayout.LINE_AXIS);
                    cbz.setBackground(Color.RED);
              }
              else if(i+1==___n){
           	   ___r.add(cbz);
                  ___r.add(Box.createVerticalStrut(5));
                  cbz = new Box(BoxLayout.LINE_AXIS);
                  cbz.setBackground(Color.RED);
              }
         }
         int v=ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS;
         int h=ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS; 
         JScrollPane jScrollPane=new JScrollPane(___r,v,h);
         jScrollPane.setPreferredSize(new Dimension(200,220));
       // panel.add(jScrollPane,BorderLayout.CENTER); 
         
        JSplitPane SPL = new JSplitPane(JSplitPane.VERTICAL_SPLIT);
        //TODO
      //  JPanel stuP =new JPanel();
	   // stuP.setLayout( new BoxLayout( stuP, BoxLayout.X_AXIS ));
        JLabel stuImage=new JLabel();
        InputStream input = null;
		try {
			//System.out.println(URP);
			input = new URL(URP+"/"+_dn+".jpg").openStream();
			//	input = new URL("https://s3.amazonaws.com/codechef_shared/sites/default/files/uploads/pictures/d271848fa8c60c11cde5b0d5eab9d7f2.jpg").openStream();
				Image img = ImageIO.read(input);
			Image resizedImage = img.getScaledInstance(200, 200,0);
			stuImage.setIcon(new ImageIcon(resizedImage));
		} catch (NoRouteToHostException e1) {
		//	stuImage.setIcon(new ImageIcon(Main.class.getResource("rgukt.png")));
			e1.printStackTrace();} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		SPL.setTopComponent(stuImage);
	    // SPL.setTopComponent(stuImage);
	     SPL.setBottomComponent(jScrollPane);
         return SPL;
    }
	 private static void handleMouseClickOnLabel(MouseEvent e) {
         JButton sourceLabelInRightBox = (JButton) e.getSource();
         int clickedLabelNumber = Integer.parseInt(sourceLabelInRightBox.getText().trim());
         if(clickedLabelNumber==__cse__){
        	 ////////System.out.println("Noting");
         }
         else{
        	 __cse__=clickedLabelNumber;
         JEditorPane __kllk = ______.get(clickedLabelNumber);
         
         Rectangle _____________rle = new Rectangle(
                   __kllk.getLocation().x, 
                   __kllk.getLocation().y, 
                   __kllk.getSize().width, 
                   __kllk.getSize().height);
         
         ////////System.out.println(__kllk.getLocation());
         ////////System.out.println(clickedLabelNumber+" HEIGHT::"+panel.getHeight()+" "+(panel.getHeight()-hei));
         int max=panel.getHeight()-hei;
         if(__kllk.getLocation().y>=max){
        	 _____________rle = new Rectangle(
                     __kllk.getLocation().x, 
                     max, 
                     __kllk.getSize().width, 
                     __kllk.getSize().height);
        	 jsp.getViewport().setViewPosition(_____________rle.getLocation());
         }
         else{
        	 jsp.getViewport().setViewPosition(_____________rle.getLocation());
         }
         	}
		
         }
	 private  void AddHover(JButton but) {
			but.addMouseListener(this);
		}
	@Override
	public void mouseClicked(MouseEvent arg0) {
	}
	static boolean boom=false;
	@Override
	public void mouseEntered(MouseEvent arg0) {
		if(arg0.getComponent().getBackground()==Color.DARK_GRAY){
			boom=true;
			arg0.getComponent().setBackground(Color.GRAY);
		}
	}
	@Override
	public void mouseExited(MouseEvent arg0) {
		if(boom&&arg0.getComponent().getBackground()==Color.GRAY){
			boom=false;
		arg0.getComponent().setBackground(Color.DARK_GRAY);
		}
	}
	@Override
	public void mousePressed(MouseEvent arg0) {
	}
	@Override
	public void mouseReleased(MouseEvent arg0) {
	}
	
	
	
	//TODO
	public static int getContentHeight(int width, String content) {
	    JEditorPane dummyEditorPane = new JEditorPane("text/html", content);
	    dummyEditorPane.setSize(width, Short.MAX_VALUE); 
	    if(content.contains("</"))
	    	return dummyEditorPane.getPreferredSize().height-30;
	    else
	    	return dummyEditorPane.getPreferredSize().height;
	}
	/*
	@Override
	public void windowActivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowClosed(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowClosing(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowDeactivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		 _bala_.toFront();
		 _bala_.setAlwaysOnTop(true);
		 _bala_.repaint();
		 _bala_.revalidate();
		 //System.out.println("hi");
	}
	@Override
	public void windowDeiconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowIconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowOpened(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}*/
	 public static boolean Ck() {
		  String p=System.getProperty("user.home").replace("\\","/").toString();
			p=p+"/Desktop";
		File folder = new File(p);
		File[] listOfFiles = folder.listFiles();
		boolean f=true;
		for (int i = 0; i < listOfFiles.length; i++) {
			String g[]=listOfFiles[i].getName().toString().split("_");
	        if (listOfFiles[i].isFile()&&listOfFiles[i].toString().endsWith(".test")&&g[1].trim().equals(sub)&&(g[4].trim().equals(datecheck))){
	        	//System.out.println("Already Finished");
	        	f=false;
	        	break;
	        }
	        }
		return f;
	        }
}