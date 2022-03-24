	package com.Ssi.acte;

	import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup.LayoutParams;
import android.view.animation.AnimationUtils;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.ViewFlipper;
import java.io.File;
import java.util.ArrayList;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Environment;
import android.widget.LinearLayout;
import android.widget.TextView;

	public class Actele_mele extends Activity {

		private ViewFlipper viewFlipper;
        private float lastX;
        private File root1;
        private File root2;
    	private ArrayList<File> fileList1 = new ArrayList<File>();
    	private ArrayList<File> fileList2 = new ArrayList<File>();
    	private LinearLayout view1;
    	private LinearLayout view2;
        
	    /** Called when the activity is first created. */
	    @Override
	    public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);

	        // Set main.XML as the layout for this Activity
	        setContentView(R.layout.actele_mele);
	        viewFlipper = (ViewFlipper) findViewById(R.id.view_flipper);
	        view2 = (LinearLayout) findViewById(R.id.view2);
	        view1 = (LinearLayout) findViewById(R.id.view1);
	        
	        android.app.ActionBar mActionBar = getActionBar();
	    	mActionBar.setDisplayShowHomeEnabled(false);
	    	mActionBar.setDisplayShowTitleEnabled(false);
	    	LayoutInflater mInflater = LayoutInflater.from(this);

	    	View mCustomView = mInflater.inflate(R.layout.custom_actionbar_help, null);
	    	TextView mTitleTextView = (TextView) mCustomView.findViewById(R.id.title_text);
	    	mTitleTextView.setText("Acte afaceri");
	    	
	    	mActionBar.setCustomView(mCustomView);
	    	mActionBar.setDisplayShowCustomEnabled(true);
	    	
	    	
	    	
	    	
	        final Button help = (Button)findViewById(R.id.help);
	        help.setOnClickListener(new Button.OnClickListener(){

	    @Override
	    public void onClick(View arg0) {
	    LayoutInflater layoutInflater 
	     = (LayoutInflater)getBaseContext()
	      .getSystemService(LAYOUT_INFLATER_SERVICE);  
	    View popupView = layoutInflater.inflate(R.layout.popuot, null);  
	             final PopupWindow popupWindow = new PopupWindow(
	               popupView,
	               LayoutParams.MATCH_PARENT,  
	                     LayoutParams.WRAP_CONTENT);  
	             
	             TextView text=(TextView)popupView.findViewById(R.id.text) ;
	             text.setText("Documentele sunt salvate in memoria dispozitivului " +
	             		"in folderul /Acte/Act_constitutiv sau /Acte/Hotarare_aga") ;
	             
	             Button btnDismiss = (Button)popupView.findViewById(R.id.dismiss);
	             btnDismiss.setOnClickListener(new Button.OnClickListener(){

	     @Override
	     public void onClick(View v) {
	      // TODO Auto-generated method stub
	      popupWindow.dismiss();
	     }});
	            
	            
	               
	             popupWindow.showAtLocation(help , Gravity.CENTER, 0, 0);
	         
	    }});
	    	
	    	
	    	 
			//getting SDcard root path
			root1 = new File(Environment.getExternalStorageDirectory()+"/Acte/Act_constitutiv");
			getfile1(root1);
	        
			if(fileList1.isEmpty()) {
			
			
			TextView hint1= (TextView) findViewById(R.id.hint1);
	    	hint1.setHint("Nu au fost creeate acte constitutive") ;
			}
			
			
			for (int i = 0; i < fileList1.size(); i++) {
				Button textView1 = new Button(this);
				textView1.setBackgroundColor(Color.TRANSPARENT) ;
				textView1.setText("• "+ fileList1.get(i).getName());
				textView1.setPadding(5, 5, 5, 5);
				textView1.setTextSize(18) ;
				final String da=""+fileList1.get(i).getName() ;
 	            
				textView1.setOnClickListener(new OnClickListener() {
					
					@Override
					public void onClick(View v) {
						// TODO Auto-generated method stub
						String path = Environment.getExternalStorageDirectory()
								.getAbsolutePath()+"/Acte/Act_constitutiv/"+da;
					     File targetFile = new File(path);
					      Uri targetUri = Uri.fromFile(targetFile);
					      
					    Intent intent;
					      intent = new Intent(Intent.ACTION_VIEW);
					      intent.setDataAndType(targetUri, "application/pdf");
					    
					      startActivity(intent);
					}
				});
					
				
				System.out.println(fileList1.get(i).getName());
	 
				
				view1.addView(textView1);
			}
			 
			
			
			
	    	 
			//getting SDcard root path
			root2 = new File(Environment.getExternalStorageDirectory()+"/Acte/Hotarare_aga");
			getfile2(root2);
	 
			if(fileList2.isEmpty()) {
				
				
				TextView hint2= (TextView) findViewById(R.id.hint2);
		    	hint2.setHint("Nu a fost creeate nici o hotarare aga") ;
				}
			
			for (int i = 0; i < fileList2.size(); i++) {
				Button textView2 = new Button(this);
				textView2.setBackgroundColor(Color.TRANSPARENT) ;
				textView2.setText("• "+ fileList2.get(i).getName());
				textView2.setPadding(5, 5, 5, 5);
				textView2.setTextSize(18) ;
				final String da1=""+fileList2.get(i).getName() ;
 	            
				textView2.setOnClickListener(new OnClickListener() {
					
					@Override
					public void onClick(View v) {
						// TODO Auto-generated method stub
						String path = Environment.getExternalStorageDirectory()
								.getAbsolutePath()+"/Acte/Hotarare_aga/"+da1;
					     File targetFile = new File(path);
					      Uri targetUri = Uri.fromFile(targetFile);
					      
					    Intent intent;
					      intent = new Intent(Intent.ACTION_VIEW);
					      intent.setDataAndType(targetUri, "application/pdf");
					    
					      startActivity(intent);
					}
				});
 	           
				System.out.println(fileList2.get(i).getName());
				view2.addView(textView2);
			}
	 
        
           
	  
		
		
		
	    }
        // Method to handle touch event like left to right swap and right to left swap
        public boolean onTouchEvent(MotionEvent touchevent)
        {
                     switch (touchevent.getAction())
                     {
                     
                     
                            // when user first touches the screen to swap
                             case MotionEvent.ACTION_DOWN:
                             {
                                 lastX = touchevent.getX();
                                 break;
                            }
                             case MotionEvent.ACTION_UP:
                             {
                                 float currentX = touchevent.getX();
                                
                                 // if left to right swipe on screen
                                 if (lastX < currentX)
                                 {
                                      // If no more View/Child to flip
                                     if (viewFlipper.getDisplayedChild() == 0)
                                         break;
                                    
                                     // set the required Animation type to ViewFlipper
                                     // The Next screen will come in form Left and current Screen will go OUT from Right
                                     viewFlipper.setInAnimation(this, R.anim.in_from_left);
                                     viewFlipper.setOutAnimation(this, R.anim.out_to_right);
                                     // Show the next Screen
                                     viewFlipper.showNext();
                                 }
                                
                                 // if right to left swipe on screen
                                 if (lastX > currentX)
                                 {
                                     if (viewFlipper.getDisplayedChild() == 1)
                                         break;
                                     // set the required Animation type to ViewFlipper
                                     // The Next screen will come in form Right and current Screen will go OUT from Left
                                     viewFlipper.setInAnimation(this, R.anim.in_from_right);
                                     viewFlipper.setOutAnimation(this, R.anim.out_to_left);
                                     // Show The Previous Screen
                                     viewFlipper.showPrevious();
                                 }
                                 break;
                             }
                     }
                     return false;
        }
        
        public ArrayList<File> getfile1(File dir) {
			File listFile[] = dir.listFiles();
			if (listFile != null && listFile.length > 0) {
				for (int i = 0; i < listFile.length; i++) {
	 
					if (listFile[i].isDirectory()) {
						fileList1.add(listFile[i]);
						getfile1(listFile[i]);
	 
					} else {
						if (listFile[i].getName().endsWith(".pdf"))
	 
						{
							fileList1.add(listFile[i]);
						}
					}
	 
				}
			}
			return fileList1;
		}
        public ArrayList<File> getfile2(File dit) {
			File listFile[] = dit.listFiles();
			if (listFile != null && listFile.length > 0) {
				for (int i = 0; i < listFile.length; i++) {
	 
					if (listFile[i].isDirectory()) {
						fileList2.add(listFile[i]);
						getfile2(listFile[i]);
	 
					} else {
						if (listFile[i].getName().endsWith(".pdf"))
	 
						{
							fileList2.add(listFile[i]);
						}
					}
	 
				}
			}
			return fileList2;
		}
        
        public void openFolder()
        {
      //  Intent intent = new Intent(Intent.ACTION_GET_CONTENT);
      //  Uri uri = Uri.parse(Environment.getExternalStorageDirectory().getAbsolutePath()
     //       + "/Acte/Act_constitutiv/");
        Intent intent = new Intent(Intent.ACTION_GET_CONTENT);
        intent.setType("file/*");
        startActivityForResult(intent, RESULT_OK); 
        }
        
}