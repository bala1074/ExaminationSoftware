import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

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
public class Main extends JPanel implements ActionListener {
	static JTextField text,date,duration,timelimit,examtype,marks,url;
	static JLabel date1,duration1,timelimit1,examtype1,marks1,url1;
	static JButton go,eval;
	static Charset chset=Charset.forName("ISO8859_1");
	boolean  bro=false;
	static File direc;
	static String urlPath;
	static ArrayList<Integer> ___iz=new ArrayList<Integer>();
	//static JPanel a,b,c,d,e,f;
	static JFileChooser chooser;
	public Main() {
		System.out.println((int)'B');
		System.out.println((int)'A');
		System.out.println((int)'L');
		System.out.println((int)'A');
		________g();
		__();
		JPanel panel =new JPanel();
	    panel.setLayout( new BoxLayout( panel, BoxLayout.Y_AXIS ));
	    JLabel top=new JLabel("RGUKT EXAM CREATOR");
	    top.setFont(new Font("Verdana",Font.BOLD,25));
	    top.setForeground(Color.BLUE);
	    add(top);
	    JLabel bot=new JLabel("        COPYRIGHTS RESERVED TO RGUKT-R.K.VALLEY");
	    bot.setFont(new Font("Verdana",Font.BOLD,10));
	    bot.setForeground(Color.BLUE);
	    add(bot);
	    panel.setBackground(Color.GREEN);
	    
	    JLabel aa=new JLabel("                                                                                                             ");
	    add(aa);
	    
	    
	    
	    JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(7,2, 100, 5));
	    
	    buttonPanel.setBackground(Color.GREEN);
	    
	    
	    
	    
		//a=new JPanel();
		date1 = new JLabel("ENTER EXAM DATE");
		date1.setSize(10,100);
		//a.add(date1);
		date1.setFont(new Font("Verdana",Font.BOLD,13));
		buttonPanel.add(date1);
		//a.add(date1, BorderLayout.SOUTH);
		date = new JTextField("08-07-2015");
		date.setToolTipText("DD-MM-YYYY");
		//a.add(date);
	//	a.add(date, BorderLayout.EAST);
		buttonPanel.add(date);
		//panel.add(a,BorderLayout.SOUTH);
		
		examtype1 = new JLabel("ENTER EXAM TYPE");
		//d.add(examtype1);
		//d.add(examtype1, BorderLayout.SOUTH);
		examtype1.setFont(new Font("Verdana",Font.BOLD,13));
		buttonPanel.add(examtype1);
		examtype = new JTextField("WAT");
		examtype.setToolTipText("WAT / CAT / MID / SEM / Others");
		examtype.setSize(10,1000);
		//d.add(examtype);
		//d.add(examtype, BorderLayout.EAST);
		//panel.add(d,BorderLayout.SOUTH);
		buttonPanel.add(examtype);
		
		
		
		
		marks1 = new JLabel("ENTER MARKS OF EXAM");
		//f.add(marks1);
		//f.add(marks1, BorderLayout.SOUTH);
		marks1.setFont(new Font("Verdana",Font.BOLD,13));
		buttonPanel.add(marks1);
		marks = new JTextField("10");
		marks.setToolTipText("10 / 15 / 60 / Others");
		marks.setSize(10,1000);
		//f.add(marks);
		//f.add(marks, BorderLayout.EAST);
		buttonPanel.add(marks);
		//panel.add(f,BorderLayout.SOUTH);
		
		
		
		//b=new JPanel();
		duration1 = new JLabel("ENTER DURATION OF EXAM");
	//	b.add(duration1);
		//b.add(duration1, BorderLayout.SOUTH);
		duration1.setFont(new Font("Verdana",Font.BOLD,13));
		buttonPanel.add(duration1);
		duration = new JTextField("30");
		duration.setToolTipText("30 / 45 / 180 / Minutes");
		duration.setSize(10,1000);
	//	b.add(duration);
	//	b.add(duration, BorderLayout.EAST);
	//	panel.add(b,BorderLayout.SOUTH);
		buttonPanel.add(duration);
		
	//	f=new JPanel();
		
		
		//c=new JPanel();
		timelimit1 = new JLabel("ENTER TIMELIMIT");
		//c.add(duration1);
	//	c.add(timelimit1, BorderLayout.SOUTH);
		timelimit1.setFont(new Font("Verdana",Font.BOLD,13));
		buttonPanel.add(timelimit1);
		timelimit = new JTextField("5");
		timelimit.setToolTipText("5 / 15 / 45 / Minutes");
		timelimit.setSize(10,1000);
		//c.add(timelimit);
		buttonPanel.add(timelimit);
		//c.add(timelimit, BorderLayout.EAST);
		//panel.add(c,BorderLayout.SOUTH);
		
		//d=new JPanel();
		url1 = new JLabel("ENTER IMAGES URL");
		//c.add(duration1);
	//	c.add(timelimit1, BorderLayout.SOUTH);
		url1.setFont(new Font("Verdana",Font.BOLD,13));
		buttonPanel.add(url1);
		url = new JTextField("http://10.50.50.6:8081/exphofallstudsrkvse/");
		url.setToolTipText("http://10.20.3.2/Images");
		url.setSize(10,1000);
		//c.add(timelimit);
		buttonPanel.add(url);
		
		//e=new JPanel();
		text = new JTextField("Browse directory..           ");
		text.setEditable(false);
		text.setSize(10,1000);
		//e.add(text);
		//e.add(text, BorderLayout.SOUTH);
		buttonPanel.add(text);
	    go = new JButton("Browse");
	    go.addActionListener(this);
	    //e.add(go);
		//e.add(go, BorderLayout.EAST);
		buttonPanel.add(go);
		//panel.add(e,BorderLayout.SOUTH);		
	    eval = new JButton("Create JarFiles");
	    eval.addActionListener(this);
	   // panel.add(eval);
	    //panel.add(eval,BorderLayout.SOUTH);
	 /*   a.setBackground(Color.GREEN);
	    b.setBackground(Color.GREEN);
	    c.setBackground(Color.GREEN);
	    d.setBackground(Color.GREEN);
	    e.setBackground(Color.GREEN);
	    f.setBackground(Color.GREEN);*/
	    panel.add(buttonPanel);
	    add(panel);
	    add(eval);
	    
	   }

	  public void actionPerformed(ActionEvent e) {
		  if(go.getModel().isArmed()){
			  	bro=true;
			    chooser = new JFileChooser(); 
			    chooser.setCurrentDirectory(new java.io.File("."));
			    chooser.setDialogTitle("Choose Directory");
			    chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
			    //
			    // disable the "All files" option.
			    //
			    chooser.setAcceptAllFileFilterUsed(false);
			    //    
			    if (chooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
			    	
			    	direc=chooser.getSelectedFile();
			     // System.out.println("getCurrentDirectory(): " +  chooser.getCurrentDirectory());
			   //   System.out.println("getSelectedFile() : " +  chooser.getSelectedFile());
			      text.setText(chooser.getSelectedFile().toString());
			      }
			    else {
			      System.out.println("No Selection ");
			      }}
		 
		  else{
			  //TODOtext,date,duration,timelimit,examtype
			  boolean a1=false,a2=false,a3=false,a4=false,a5=false,a6=false;
			  String S_Date = null,S_Examtype=null,S_Url=null;
			  int S_Duration=-1,S_Timelimit=-1,S_Maxmarks=-1;
			  if(date.getText().toString().length()==10&&date.getText().toString().split("-").length==3){
				  S_Date=date.getText().toString();
				  a1=true;
			  }
			  else
				  date1.setForeground(Color.RED);
			  if(url.getText().toString().length()>7&&url.getText().toString().contains("http://")){
				  S_Url=url.getText().toString();
				//  System.out.println(S_Url);
				  a6=true;
			  }
			  else
				  url1.setForeground(Color.RED);
			  try{S_Duration=Integer.parseInt(duration.getText().toString());
			  a2=true;
			  }
			  catch (Exception e2) {
				// TODO: handle exception
				duration1.setForeground(Color.RED);
				  a2=false;
			  }
			  try{S_Maxmarks=Integer.parseInt(marks.getText().toString());
			  a5=true;
			  }
			  catch (Exception e2) {
				// TODO: handle exception
				marks1.setForeground(Color.RED);
				  a5=false;
			  }
			  try{S_Timelimit=Integer.parseInt(timelimit.getText().toString());
			  a3=true;
			  }
			  catch (Exception e1) {
				  timelimit1.setForeground(Color.RED);
				// TODO: handle exception
				  a3=false;
			  }
			  if(examtype.getText().toString().length()>1){
				  S_Examtype=examtype.getText().toString().trim();
				  a4=true;
			  }
			  else
				  examtype1.setForeground(Color.RED);
			  if(!bro){
				  JOptionPane.showMessageDialog(getParent(),"YOU MUST SELECT DIRECTORY");
			  }
			  if(a1&&a2&&a3&&a4&&bro){
				  frame.dispose();
				  g.setVisible(true);
			String path=text.getText().toString();
			  File folder = new File(path);
			  File[] listOfFiles = folder.listFiles();
			  for (int i = 0; i < listOfFiles.length; i++) {
			      if (listOfFiles[i].isFile()&&listOfFiles[i].toString().endsWith(".htm")||listOfFiles[i].isFile()&&listOfFiles[i].toString().endsWith(".html")) {
			      System.out.println("File " + listOfFiles[i].getName());
			     // String read=readFile(listOfFiles[i].toString());
			      String filename=listOfFiles[i].getName();
			      filename=filename.substring(0,filename.lastIndexOf("."));
			      boolean buz=true;
			      try{
			      try {
			    	  System.out.println(S_Url);
					String filedata=S_Date+"@@"+S_Duration+"@@"+S_Timelimit+"@@"+S_Examtype+"@@"+S_Maxmarks+"@@"+filename+"@@"+S_Url+"@@@";
					filedata=filedata+"\n"+readFile(listOfFiles[i].getAbsolutePath());
					filedata=filedata.replace("height=","");
					filedata=filedata.replace("width=","");
					filedata=filedata.replace("style='","style=\"font-family:arial;font-size:14px;\"");
					System.out.println(filedata);
					filedata=filedata.replace(filename+"_files/","/");
					//FileOutputStream ob2=new FileOutputStream();
				//	BufferedWriter bw = new BufferedWriter(new FileWriter(chooser.getSelectedFile().toString()+"/Bala.class"));
				//	bw.write(encrypt(filedata));
				//	bw.close();
					PrintWriter writer = null;
					////System.out.println(strand);
					try {
						writer = new PrintWriter(chooser.getSelectedFile().toString()+"/Bala.class",chset.name());//chset
						writer.write(encrypt(filedata));
						writer.close();
					} catch (Exception e6) {
						e6.printStackTrace();
					}
				} catch (IOException e2) {
					buz=false;
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}
			      //creation of jar file
				System.out.println(buz+"***");
			      String jarpath="";
			      try {jarpath=ExportResource("/Insider_v1.2.jar",filename);} catch (Exception e1) {e1.printStackTrace();}
			      //modify jar file
			      ArrayList<File> contents =new ArrayList<File>();
			      contents.add(new File(chooser.getSelectedFile().toString()+"/Bala.class"));
			      try{
			      File insidefolder = new File(path+"/"+filename+"_files");
			      File[] insidelistOfFiles = insidefolder.listFiles();
			      System.out.println(Arrays.toString(insidelistOfFiles));
			      for (int i1 = 0; i1 < insidelistOfFiles.length; i1++) {
					  System.out.println(insidelistOfFiles[i1]);
					  contents.add(insidelistOfFiles[i1]);
				  }}catch (Exception e4) {
					  buz=false;
				  }
					System.out.println(buz+"***2");
			      System.out.println(jarpath);
			      File jarFile = new File(jarpath);
			      try {_(jarFile, contents);} catch (Exception ee) {ee.printStackTrace(); buz=false;}}
			      catch (Exception ezz) {
			    	  buz=false;
			      }
			  	System.out.println(buz+"***3");
			   //   if(buz==true){
			    	  String ss1=jt.getText().toString();
						ss1=ss1.substring(0,ss1.length()-7);
						jt.setText(ss1+"<br />&nbsp;&nbsp;&nbsp;&nbsp;<font face=\"Verdana\" color=\"blue\"> "+filename+".jar file successfully created...</font></html>");
			     
			    /*  }
			      else{
			    	  String ss1=jt.getText().toString();
						ss1=ss1.substring(0,ss1.length()-7);
						jt.setText(ss1+"<br />&nbsp;&nbsp;&nbsp;&nbsp;<font face=\"Verdana\" color=\"red\"> "+filename+".jar file not created...</font></html>");
			      }*/
			   }			        
			 }
		//	  JOptionPane.showMessageDialog(getParent(),"Successfully jar files created");
			  String ss1=jt.getText().toString();
				ss1=ss1.substring(0,ss1.length()-7);
				jt.setText(ss1+"<br /><br />&nbsp;&nbsp;&nbsp;&nbsp;<font face=\"Verdana\" color=\"green\"> Successfully completed...</font></html>");
	      
		  }
			
		  }
	   }
	   
	  private String encrypt(String filedata) {
		// TODO Auto-generated method stub
		  StringBuffer sv=new StringBuffer(filedata);
		  int len=filedata.length();
		  int l=___iz.size();
		  int j=0;
		  for(int i=0;i<len;i++){
			  //System.out.println(sv.charAt(i)+" "+(char) (sv.charAt(i)+cip[j]));
			  if(sv.charAt(i)<64) sv.setCharAt(i,(char) (sv.charAt(i)+50));
			  else
			  sv.setCharAt(i,(char) (sv.charAt(i)+___iz.get(j)));
			  j++;
			  if(j==l)
				  j=0;
		  }
		return sv.toString();
	}
		private static void ________g() {
			___iz.add(99);___iz.add(115);___iz.add(101);___iz.add(98);___iz.add(97);___iz.add(108);___iz.add(97);___iz.add(97);___iz.add(122);___iz.add(105);___iz.add(122);___iz.add(115);___iz.add(97);___iz.add(115);___iz.add(116);___iz.add(114);___iz.add(105);___iz.add(103);___iz.add(111);___iz.add(116);___iz.add(111);___iz.add(103);___iz.add(111);___iz.add(100);___iz.add(97);___iz.add(118);___iz.add(97);___iz.add(114);___iz.add(105);___iz.add(105);___iz.add(110);___iz.add(106);___iz.add(97);___iz.add(114);___iz.add(97);___iz.add(112);___iz.add(117);		
		}
	@Override
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
	    frame = new JFrame("RGUKT EXAM CREATOR");
	    frame.setResizable(false);
	    Main panel = new Main();
	    frame.addWindowListener(
	      new WindowAdapter() {
	        @Override
			public void windowClosing(WindowEvent e) {
	          System.exit(0);
	          }
	        }
	      );
	    panel.setBackground(Color.GREEN);
	    frame.getContentPane().add(panel,"Center");
	    frame.setSize(panel.getPreferredSize().width,panel.getPreferredSize().height-30);
	    frame.setVisible(true);  
			  
	    }
	  static public String ExportResource(String resourceName,String filename) throws Exception {
	        InputStream stream = null;
	        OutputStream resStreamOut = null;
	        String pp=direc.toString().replace('\\', '/') ;
	        try {
	            stream = Main.class.getResourceAsStream(resourceName);//note that each / is a directory down in the "jar tree" been the jar the root of the tree
	            if(stream == null) {
	                throw new Exception("Cannot get resource \"" + resourceName + "\" from Jar file.");
	            }

	            int readBytes;
	            byte[] buffer = new byte[4096];
	          //  jarFolder = new File(Main.class.getProtectionDomain().getCodeSource().getLocation().toURI().getPath()).getParentFile().getPath().replace('\\', '/');
	           
	            resStreamOut = new FileOutputStream(pp+ "/"+filename+".jar");
	            while ((readBytes = stream.read(buffer)) > 0) {
	                resStreamOut.write(buffer, 0, readBytes);
	            }
	        } catch (Exception ex) {
	            throw ex;
	        } finally {
	            stream.close();
	            resStreamOut.close();
	        }

	        return pp+ "/"+filename+".jar";
	    }
	  public static void _(File zipFile,ArrayList<File> files) throws IOException {
	               // get a temp file
	        File tempFile = File.createTempFile(zipFile.getName(), null);
	               // delete it, otherwise you cannot rename your existing zip to it.
	        tempFile.delete();

	        boolean renameOk=zipFile.renameTo(tempFile);
	        if (!renameOk)
	        {
	            throw new RuntimeException("could not rename the file "+zipFile.getAbsolutePath()+" to "+tempFile.getAbsolutePath());
	        }
	        byte[] buf = new byte[1024];

	        ZipInputStream zin = new ZipInputStream(new FileInputStream(tempFile));
	        ZipOutputStream out = new ZipOutputStream(new FileOutputStream(zipFile));

	        ZipEntry entry = zin.getNextEntry();
	        while (entry != null) {
	            String name = entry.getName();
	            boolean notInFiles = true;
	            for (File f : files) {
	                if (f.getName().equals(name)) {
	                    notInFiles = false;
	                    break;
	                }
	            }
	            if (notInFiles) {
	                // Add ZIP entry to output stream.
	                out.putNextEntry(new ZipEntry(name));
	                // Transfer bytes from the ZIP file to the output file
	                int len;
	                while ((len = zin.read(buf)) > 0) {
	                    out.write(buf, 0, len);
	                }
	            }
	            entry = zin.getNextEntry();
	        }
	        // Close the streams        
	        zin.close();
	        // Compress the files
	        for (int i = 0; i < files.size(); i++) {
	            InputStream in = new FileInputStream(files.get(i));
	            // Add ZIP entry to output stream.
	            	out.putNextEntry(new ZipEntry(files.get(i).getName()));
	            // Transfer bytes from the file to the ZIP file
	            int len;
	            while ((len = in.read(buf)) > 0) {
	                out.write(buf, 0, len);
	            }
	            // Complete the entry
	            out.closeEntry();
	            in.close();
	           System.out.println("hi::"+files.get(i));
	        }
	        out.close();
	        tempFile.delete();
	    }
	  public static String readFile(String fileName) throws IOException {
		  BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(fileName),chset));
		    try {
		        StringBuilder sb = new StringBuilder();
		        String line = br.readLine();

		        while (line != null) {
		            sb.append(line);
		            sb.append("\n");
		            line = br.readLine();
		        }
		        return sb.toString();
		    } finally {
		        br.close();
		    }
		}
	  
	  
	  
	  
	  
	  
	   static JLabel jt=new JLabel();
	   static JScrollPane jScrollPane;
	   static JFrame frame,g ;
	 //  static JX jt=new JEditorPane();
	  public void __() {
		  //jt.setEditable(false);
		//  jt.setFont(new Font("Verdana",Font.PLAIN,0));
		  //frame.dispose();
		  JPanel panel =new JPanel();
		    panel.setLayout( new BoxLayout( panel, BoxLayout.Y_AXIS ));
		    JLabel top=new JLabel("          RGUKT EXAM EVALUATOR");
		    top.setFont(new Font("Verdana",Font.BOLD,25));
		    top.setForeground(Color.BLUE);
		    panel.add(top);
		    JLabel bot=new JLabel("                                             COPYRIGHTS RESERVED TO RGUKT-R.K.VALLEY");
		    bot.setFont(new Font("Verdana",Font.BOLD,10));
		    bot.setForeground(Color.BLUE);
		    panel.add(bot,BorderLayout.CENTER);
		    panel.setBackground(Color.GREEN);
		    JLabel bot1=new JLabel("                                           ");
		    panel.add(bot1);
	    //panel.add(jt);
	    jt.setText("<html></html>");
	    panel.setBackground(Color.GREEN);
	    //panel.add(jt, BorderLayout.CENTER);
	    
	    int v=ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS;
	    int h=ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS; 
	    jScrollPane=new JScrollPane(jt,v,h);
	    jScrollPane.setPreferredSize(new Dimension(200,220));
	    
	    
//	    jScrollPane.getViewport().add(jButton1, null);
	  //  jScrollPane.setViewportView(jt);
	 //   jScrollPane.setBackground(Color.black);
	   panel.add(jScrollPane,BorderLayout.CENTER); 
	    
	   //add(panel);
	  g=new JFrame("RGUKT EXAM CREATOR");
	  g.setSize(new Dimension(600,380));
	  g.setVisible(false);
	  g.add(panel);
	   }
	}