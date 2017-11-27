import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.UIManager;


@SuppressWarnings("serial")
public class Main extends JPanel  implements ActionListener {
	static Charset chset=Charset.forName("ISO8859_1");
   JButton go,eval;
   JTextField text;
   JFileChooser chooser;
   String choosertitle;
   static ArrayList<Integer> just=new ArrayList<Integer>();
   static HashMap<String,ArrayList<String>> sub_keys;
   static JLabel jt=new JLabel();
   static JScrollPane jScrollPane;
   static boolean bro=false;
   static ArrayList<Integer> ____si=new ArrayList<Integer>();
  public Main() {
	  ____si.add(115);____si.add(101);
	  JPanel panel =new JPanel();
	    panel.setLayout( new BoxLayout( panel, BoxLayout.Y_AXIS ));
	    JLabel top=new JLabel("RGUKT EXAM EVALUATOR");
	    top.setFont(new Font("Verdana",Font.BOLD,25));
	    top.setForeground(Color.BLUE);
	    ____si.add(99);____si.add(117);
	    panel.add(top);
	    JLabel bot=new JLabel("                     COPYRIGHTS RESERVED TO RGUKT-R.K.VALLEY");
	    bot.setFont(new Font("Verdana",Font.BOLD,10));
	    bot.setForeground(Color.BLUE);
	    panel.add(bot,BorderLayout.CENTER);
	    panel.setBackground(Color.GREEN);
	    ____si.add(114);____si.add(101);
	just.add(115);just.add(101);just.add(99);just.add(117);just.add(114);just.add(101);
	JPanel jp=new JPanel();
	text = new JTextField(35);
	text.setEditable(false);
	text.setText("Browse directory");
	jp.add(text);
    go = new JButton("Browse");
    go.addActionListener(this);
    jp.add(go);
    eval = new JButton("Evaluate");
    eval.addActionListener(this);
    jp.add(eval);
    jp.setBackground(Color.GREEN);
    //jt.
    panel.add(jp);
    //panel.add(jt);
    jt.setText("<html></html>");
    panel.setBackground(Color.GREEN);
    panel.add(jt, BorderLayout.CENTER);
    
    int v=ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS;
    int h=ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS; 
    jScrollPane=new JScrollPane(jt,v,h);
    jScrollPane.setPreferredSize(new Dimension(200,220));
   panel.add(jScrollPane,BorderLayout.CENTER); 
    
   add(panel);
   }

  public void actionPerformed(ActionEvent e) {
	  if(go.getModel().isArmed()){
		  bro=true;
    chooser = new JFileChooser(); 
    chooser.setCurrentDirectory(new java.io.File("."));
    chooser.setDialogTitle(choosertitle);
    chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
    //
    // disable the "All files" option.
    //
    chooser.setAcceptAllFileFilterUsed(false);
    //    
    if (chooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) { 
      //system.out.println("getCurrentDirectory(): "      +  chooser.getCurrentDirectory());
      //system.out.println("getSelectedFile() : "          +  chooser.getSelectedFile());
      text.setText(chooser.getSelectedFile().toString());
      }
    else {
      //system.out.println("No Selection ");
      }
	  }
	  
	  else{
		  if(!bro){
			  JOptionPane.showMessageDialog(getParent(),"YOU MUST SELECT DIRECTORY");
		  }
		  else{
		  //TODO
		  String path=text.getText().toString();
		  String location=path+"/keys.txt";
		  sub_keys=new HashMap<String, ArrayList<String>>();
		  String data="";
		  try {
		  //system.out.println(location);
			data=readFile(location);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			//system.out.println("Keys.txt incorrect");
			e1.printStackTrace();
		}
		if(data.length()==0){
			//system.out.println("Keys.txt incorrect");
		}
		else{
			String []all=data.split("\n");
			int i=0;
			String sub = null;
			for(String now:all){
				if(i%2==0){
					sub=now.trim();
					sub_keys.put(sub,new ArrayList<String>());
				}
				else{
					for(int in=0;in<now.length();in++){
						if(now.charAt(in)=='{'||now.charAt(in)=='('||now.charAt(in)=='['){
							in++;
							String str="";
							for(;in<now.length();in++){
								if(now.charAt(in)==')'||now.charAt(in)=='}'||now.charAt(in)==']')
									break;
								str=str+now.charAt(in);
							}
							sub_keys.get(sub).add(str);
							System.out.println(str);
						}
						else
							sub_keys.get(sub).add(now.charAt(in)+"");
					}
				}
				i++;
			}
		}
		System.out.println(sub_keys);
		HashMap<String,String> sub_marks=new HashMap<String, String>();
		//create sub cvs
		/*
		  
		  */
		  File folder = new File(path);
		  File[] listOfFiles = folder.listFiles();
		      for (int i = 0; i < listOfFiles.length; i++) {
		    	  try {
		        if (listOfFiles[i].isFile()&&listOfFiles[i].toString().endsWith(".test")) {
		        	
		        	
		          //system.out.println("File " + listOfFiles[i]);
		          String read="";
		          try {
					read=readFile(listOfFiles[i].toString());
				} catch (IOException e1) {
					e1.printStackTrace();
				}
				
				
			//	String Fir=charr[read].charAt(0)+""+sF;
				
				
				int Fl=(read.charAt(0))-161;
				System.out.println(Fl);
				int Fcount=0;
				int x=1;
				for(int i0=1;i0<=Fl;i0++){
					Fcount=((Fcount)+((read.charAt(i0))-161))*10;
					if(i0==Fl)
						Fcount/=10;
				}
				System.out.println(Fcount);
				
				//system.out.println(read);
				char ar[];
				StringBuffer s=new StringBuffer(read.substring(Fl+1));
			
				String _=(char)(s.charAt(0)-____si.get(0))+"";
				_=_+(char)(s.charAt(1)-____si.get(1))+"";
				_=_+(char)(s.charAt(2)-____si.get(2))+"";
				_=_+(char)(s.charAt(3)-____si.get(3))+"";
				_=_+(char)(s.charAt(4)-____si.get(4))+"";
				_=_+(char)(s.charAt(5)-____si.get(5))+"";
				//system.out.println(_);
				ar=_.toCharArray();
				StringBuffer out=new StringBuffer(s.substring(6));
				//s.substring(6);
				////system.out.println(Arrays.toString(ar)+" \t "+Arrays.toString(chh));
				int len=out.length(),j=ar.length,j1=0;int count0=0;
				for(int i1=0;i1<len;i1++){
					count0+=out.charAt(i1);
					if(out.charAt(i1)<115)out.setCharAt(i1,(char)(out.charAt(i1)-50));
					else
					out.setCharAt(i1,(char)(out.charAt(i1)-ar[j1]));
					j1++;
					if(j1==j)
						j1=0;
				}
				Fcount+=10;
				System.out.println(Fcount+","+count0);
		          read=out.toString();
		          System.out.println(read);
		          String name=listOfFiles[i].getName();
		          String id=name.substring(0,name.indexOf("_"));
		          String sub=name.split("_")[1];
		       String print=id+",";
		          print=print+sub+","+name.split("_")[2]+","+name.split("_")[3];
		          //system.out.println(id);
		          String good[]=read.split("@@");
		          System.out.println(Arrays.toString(good));
		          if(Fcount!=count0||!good[0].equals(name)||(Integer.parseInt(good[8].trim())!=read.length()-4-good[8].length()-good[9].length())){
		        		 print=print+",Copied/FileModified";
		          }
		          else
		          	print=print+",N/A";
		          if(good[7].length()>4)
		          print=print+","+good[2]+","+good[3]+","+good[4]+","+good[5]+","+good[6]+",YES";
		          else
		        	  print=print+","+good[2]+","+good[3]+","+good[4]+","+good[5]+","+good[6]+",N/A";
		          if(sub_keys.containsKey(sub)){
		          int ind=0,count=0;
		          String qpa="";
		          for(Character cc:good[1].toCharArray()){
		        	  try{
		        	  if(sub_keys.get(sub).get(ind).contains(cc+"")){
		        		  count++;
		        		  qpa=qpa+"1,";
		        		  print=print+",["+cc+"="+sub_keys.get(sub).get(ind)+"]";
		        	  }
		        	  else if(cc=='_'){
		        		  qpa=qpa+"_,";
		        	  print=print+",["+cc+"!="+sub_keys.get(sub).get(ind)+"]";}
		        	  else {
		        		  qpa=qpa+"0,";
		        		  print=print+",["+cc+"!="+sub_keys.get(sub).get(ind)+"]";
		        	  }
		        	  
		        	  ind++;}
		        	  catch (Exception e4) {
		        		  print=print+",["+cc+"-N/A"+"]";
		        		  qpa=qpa+",_";
		        	  }
		        	  
		          }
		          print=print+","+qpa+""+count;
		          if(sub_marks.containsKey(sub))
		          sub_marks.put(sub, sub_marks.get(sub)+"\n"+print);
		          else
		        	  sub_marks.put(sub,print);
		          }
		        }
					
				} catch (Exception e2) {
					// TODO: handle exception
				}
		      }
			  Iterator<String> subj=sub_keys.keySet().iterator();
			  while(subj.hasNext()){
				  String ss=subj.next().trim();
				  try{
				  try {
					  String print="ID,QP,IP,MAC ADDRESS,FILE MODIFICATION,STATUS COLOR,PRESSED KEYS,EXAM START,EXAM END,EXAM TIME,CHECK TIME";
				          for(int i1=1;i1<=sub_keys.get(ss).size();i1++)
				        	  print=print+","+(i1);
				          for(int i1=1;i1<=sub_keys.get(ss).size();i1++)
				        	  print=print+","+(i1);
				        print=print+",Marks\n";
					 String ss1=jt.getText().toString();
					ss1=ss1.substring(0,ss1.length()-7);
					FileWriter fw=new FileWriter(path + "/" + ss+ ".csv");
					if(sub_marks.containsKey(ss)){
						fw.append(print+sub_marks.get(ss).toString());
					}
					else
						jt.setText(ss1+"<br /><font face=\"Verdana\" color=\"red\"> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+ss+" files not found...</font></html>");
					fw.flush();fw.close();
					//jt.setContentType("text/html");
					jt.setText(ss1+"<br /><font face=\"Verdana\" color=\"blue\"> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+ss+" Successfully evaluated...</font></html>");
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					String ss1=jt.getText().toString();
					ss1=ss1.substring(0,ss1.length()-7);
					jt.setText(ss1+"<br /><font face=\"Verdana\" color=\"red\"> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+ss+" files not found...</font></html>");
					e1.printStackTrace();
				}}
				  catch (Exception ek) {
					  String ss1=jt.getText().toString();
						ss1=ss1.substring(0,ss1.length()-7);
						jt.setText(ss1+"<br /><font face=\"Verdana\" color=\"red\"> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;You alredy complete evaluation/got error</font></html>");
						
				  }
			  }
			  String ss1=jt.getText().toString();
			  ss1=ss1.substring(0,ss1.length()-7);
			  jt.setText(ss1+"<br /><font face=\"Verdana\" color=\"green\"> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Successfully completed..</font></html>");
				
			 }
	  }
   }
public Dimension getPreferredSize(){
    return new Dimension(600, 400);
    }
    
  public static void main(String s[]) {
	  try
	    {
	      for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels())
	        if ("Nimbus".equals(info.getName())) {
	          UIManager.setLookAndFeel(info.getClassName());
	          break;
	        }
	    }catch(Exception e){}
    JFrame frame = new JFrame("RGUKT EXAM EVALUATOR");
    frame.setResizable(false);
    Main panel = new Main();
    frame.addWindowListener(
      new WindowAdapter() {
        public void windowClosing(WindowEvent e) {
          System.exit(0);
          }
        }
      );
    panel.setBackground(Color.GREEN);
    frame.getContentPane().add(panel,"Center");
    frame.setSize(panel.getPreferredSize().width+45,panel.getPreferredSize().height-62);
    frame.setVisible(true);
  
    }
  public static String readFile(String fileName) throws IOException {
	 //   BufferedReader br = new BufferedReader(new FileReader(fileName));
	  BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(fileName),chset));
	    try {
	        StringBuilder sb = new StringBuilder();
	        String line = br.readLine();
	        while (line != null) {
	            sb.append(line.trim());
	            sb.append("\n");
	            line = br.readLine();
	        }
	        return sb.toString();
	    } finally {
	        br.close();
	    }
	}
}