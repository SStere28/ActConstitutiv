package com.Ssi.acte;

import java.io.File;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class Acte extends Activity   {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_page);

        Button despre = (Button) findViewById(R.id.despre);
        despre.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent h=new Intent(v.getContext(),Despre.class) ;
		        startActivityForResult(h, 0);
			}
		});
      
        Button button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent k=new Intent(v.getContext(),Tipul_societatii.class) ;
		        startActivityForResult(k, 0);
		        
		        
		        
		     
			}
		            
		});
       
        Button button2 = (Button) findViewById(R.id.button2); 
        button2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent k=new Intent(v.getContext(),Hotarare_aga.class) ;
		        startActivityForResult(k, 0);
		        
			}
		});
        
        Button button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent j=new Intent(v.getContext(),Actele_mele.class) ;
		        startActivityForResult(j, 0);
			}
		});


    android.app.ActionBar mActionBar = getActionBar();
	mActionBar.setDisplayShowHomeEnabled(false);
	mActionBar.setDisplayShowTitleEnabled(false);
	LayoutInflater mInflater = LayoutInflater.from(this);
	View mCustomView = mInflater.inflate(R.layout.custom_actionbar, null);
	TextView mTitleTextView = (TextView) mCustomView.findViewById(R.id.title_text);
	mTitleTextView.setText("Acte afaceri");
	
	mActionBar.setCustomView(mCustomView);
	mActionBar.setDisplayShowCustomEnabled(true);

  }

  }
