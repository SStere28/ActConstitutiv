package com.Ssi.acte;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.LayoutDirection;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;



public class Tipul_societatii extends Activity    {
	

	 protected void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.tipul_societatii);
	        
	       
			

	 Button button1 = (Button) findViewById(R.id.button1);   
     button1.setOnClickListener(new OnClickListener() {

			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i=new Intent(v.getContext(),Act_constitutiv_SRL.class) ;
		        startActivityForResult(i, 0);
			}
	
     });
     
     Button button2 = (Button) findViewById(R.id.button2);     
     button2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i=new Intent(v.getContext(),Act_constitutiv_SA.class) ;
		        startActivityForResult(i, 0);
			}
	
     });
     
     Button button3 = (Button) findViewById(R.id.button3);     
     button3.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i=new Intent(v.getContext(),Act_constitutiv_SCA.class) ;
		        startActivityForResult(i, 0);
			}
	
     });
     
     Button button4 = (Button) findViewById(R.id.button4);     
     button4.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i=new Intent(v.getContext(),Act_constitutiv_SNC.class) ;
		        startActivityForResult(i, 0);
			}
	
     });
     
     android.app.ActionBar mActionBar = getActionBar();
 	mActionBar.setDisplayShowHomeEnabled(false);
 	mActionBar.setDisplayShowTitleEnabled(false);
 	LayoutInflater mInflater = LayoutInflater.from(this);
 	View mCustomView = mInflater.inflate(R.layout.custom_actionbar_help, null);
 	TextView mTitleTextView = (TextView) mCustomView.findViewById(R.id.title_text);
 	mTitleTextView.setText("Tipul societatii");
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
           LayoutParams.WRAP_CONTENT,  
                 LayoutParams.WRAP_CONTENT);  
         
         Button btnDismiss = (Button)popupView.findViewById(R.id.dismiss);
         btnDismiss.setOnClickListener(new Button.OnClickListener(){

 @Override
 public void onClick(View v) {
  // TODO Auto-generated method stub
  popupWindow.dismiss();
 }});
           
         popupWindow.showAtLocation(help , Gravity.CENTER, 0, 0);
     
}});
}

    
    
    
 }
	  
	

