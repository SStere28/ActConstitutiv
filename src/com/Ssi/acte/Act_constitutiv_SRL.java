package com.Ssi.acte;

	import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.TooManyListenersException;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Paint.Align;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.renderscript.Element;
import android.text.InputType;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TableRow;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

import java.io.FileOutputStream;
import java.io.IOException;


import com.Ssi.acte.R.layout;
import com.lowagie.text.Chunk;
import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.Font;
import com.lowagie.text.PageSize;
import com.lowagie.text.Paragraph;
import com.lowagie.text.Phrase;
import com.lowagie.text.pdf.BaseFont;
import com.lowagie.text.pdf.ColumnText;
import com.lowagie.text.pdf.PdfContentByte;
import com.lowagie.text.pdf.PdfReader;
import com.lowagie.text.pdf.PdfStamper;
import com.lowagie.text.pdf.PdfTable;
import com.lowagie.text.pdf.PdfWriter;
	@SuppressLint("InflateParams") public class Act_constitutiv_SRL extends   Activity   {

		   public static final String PREFS_NAME = "MyPrefsFile";

		final Context context = this;
		int duration = Toast.LENGTH_SHORT;
		private TextView data,data1,data2 ;
		private Button plus ;
		private EditText txtData,numarAsoc,denumire,disp,din,elibde,f61,f62,f63,f71,f81,f82,f91,f92,f93,f94,f101,p12,p22,p23,p24,p31,p32,p33;
		private EditText p41,p42,p43,p44,p51,p61,p62,p63,p70,p71,domeniulprincipal,grupacaen,grupacaen2,denumirea,capital,lei,minus ;
		private EditText j11,j12,j21,j1,j32,j41,j42,caen,caen2 ;
		private  int i=1 ;
		private String Titlu=null ,D,natie,nascut,dom,posesor,CI,naties,Ds,Dd,Dc,nascutc,Dj,Da,natiea,nascuta,posesora,doma,natieadm,Dadm,jud,valuta11,valuta22,asac1,admasac1;
	    int click=0 ;
		private RadioButton f51,f52,fasoc2,fasoc1,radio0,radio1,radio2,cenzorr,auditorr,pf,pj,asociatii,admin1,admin2,v1,v2,v3,v4,v5,v6 ;
		private RadioButton cb1 ; 
		private RadioButton cb2 ; 
		
		private RadioButton ci[] =new RadioButton[15] ;
		private RadioButton bi[] =new RadioButton[15] ;
		private RadioButton pasaport[] =new RadioButton[15] ;
		private String dn[]=new String[15] ;
		private ToggleButton p11,p13 ,c1,cj13,admt,admt1,admjt,admjt2,f10b4,asac,admasac,j31,toggleSC;
		private ToggleButton toggle1[] = new ToggleButton[15] ;
		private ToggleButton toggle2[] = new ToggleButton[15] ;
		private ToggleButton toggl[] = new ToggleButton[15] ;
		private ToggleButton toggl1[] = new ToggleButton[15] ;
		private ToggleButton reprezde1[] = new ToggleButton[15] ;
		private LinearLayout persfizica,persjuridica,layout2,layout,pfl,persfizicac,persjuriticac,persfizicaadm,persjuridicaadm,durata,pfp,scp,valdin ;
	    int  id1=1,id=1 ;
	    int k=0 ;
	    int gg=0 ;
	    int heightInt ;
	    int kpl=1  ;
	     int idpl=520  ;
	     int ppl=0 ;
	    List<EditText> allEds = new ArrayList<EditText>();
	    
	    private EditText text1[]=new EditText[10] ;
	    private EditText text2[]=new EditText[10] ;
	    private EditText text3[]=new EditText[10] ;
	    private EditText text4[]=new EditText[10] ;
	    private EditText text5[]=new EditText[10] ;
	    private EditText text6[]=new EditText[10] ;
	    private EditText text7[]=new EditText[10] ;
	    private EditText text8[]=new EditText[10] ;
	    private EditText text9[]=new EditText[10] ;
	    private EditText text10[]=new EditText[10] ;
	    private EditText text11[]=new EditText[10] ;
	    private EditText text12[]=new EditText[10] ;
	    private EditText text13[]=new EditText[10] ;
	    private EditText text14[]=new EditText[10] ;
	    private EditText text15[]=new EditText[10] ;
	    private EditText text16[]=new EditText[10] ;
	    private EditText text17[]=new EditText[10] ;
	    private EditText text18[]=new EditText[10] ;
	    private EditText text19[]=new EditText[10] ;
	    private EditText text20[]=new EditText[10] ;
	    private EditText text21[]=new EditText[10] ;
	    private EditText text22[]=new EditText[10] ;
	    private EditText text23[]=new EditText[10] ;
	    private EditText text24[]=new EditText[10] ;
	    private EditText text25[]=new EditText[10] ;
	    private EditText text26[]=new EditText[10] ;
	    private EditText text27[]=new EditText[10] ;
	    private EditText text28[]=new EditText[10] ;
	    private EditText text29[]=new EditText[10] ;
	    private EditText text30[]=new EditText[10] ;
	    private EditText text31[]=new EditText[10] ;
	    private EditText text32[]=new EditText[10] ;
	    private EditText text33[]=new EditText[10] ;
	    private EditText text34[]=new EditText[10] ;
	    private EditText text35[]=new EditText[10] ;
	    private EditText text36[]=new EditText[10] ;
	    private EditText text37[]=new EditText[10] ;
	    private EditText text38[]=new EditText[10] ;
	    private EditText text39[]=new EditText[10] ;
	    
	    private EditText plus1[]=new EditText[25] ;
	    private EditText plus2[]=new EditText[25] ;
	   
	    
	    
	    private EditText c2,c3,c5,c4,c6,c7,c8,c9,c10,c11,c12,c13,c14,c15,c16,c17,c18,c19 ;
	    private EditText cj,cj1,cj2,cj3,cj4,cj5,cj6,cj7,cj8,cj9,cj10,cj11,cj12,cs,cj14,cj15 ;
	    private EditText adm1,adm2,adm3,adm4,adm5,adm6,adm7,adm8,adm9,adm10,adm11,adm12,adm13,adm14,adm15,adm16,adm17 ;
	    private EditText admj1,admj2,admj3,admj4,admj5,admj6,admj7,admj8,admj9,admj10 ;
	    private EditText valuta ,valuta1,valuta2,valuta3,valuta4,valuta5,valuta6,valuta7,valuta8,valuta9 ;
	    private EditText cap1,cap2,cap3,cap4,cap5,cap6,cap7,cap8,cap9,cap10,cap11,cap12,cap13,cap14,cap15 ;
	    protected void onCreate(Bundle savedInstanceState) {
	    	
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.act_constitutiv_srl);
	        
	        v1=(RadioButton)findViewById(R.id.v1);
	        v2=(RadioButton)findViewById(R.id.v2);
	        v3=(RadioButton)findViewById(R.id.v3);
	        v4=(RadioButton)findViewById(R.id.v4);
	        v5=(RadioButton)findViewById(R.id.v5);
	        v6=(RadioButton)findViewById(R.id.v6);
	 	   
	        
	 	   
	       minus= (EditText) findViewById(R.id.minus);
		       
	        lei = (EditText) findViewById(R.id.lei);
	        capital = (EditText) findViewById(R.id.capital);
	        grupacaen2 = (EditText) findViewById(R.id.GrupaCAEN2);
	        denumirea = (EditText) findViewById(R.id.Denumirea);
	        domeniulprincipal = (EditText) findViewById(R.id.domeniulprincipal);
	        grupacaen = (EditText) findViewById(R.id.GrupaCAEN);
	        
	        cap1 = (EditText) findViewById(R.id.cap1);
	        cap2 = (EditText) findViewById(R.id.cap2);
	        cap3 = (EditText) findViewById(R.id.cap3);
	        cap4 = (EditText) findViewById(R.id.cap4);
	        cap5 = (EditText) findViewById(R.id.cap5);
	        cap6 = (EditText) findViewById(R.id.cap6);
	        cap7 = (EditText) findViewById(R.id.cap7);
	        cap8 = (EditText) findViewById(R.id.cap8);
	        cap9 = (EditText) findViewById(R.id.cap9);
	        cap10 = (EditText) findViewById(R.id.cap10);
	        cap11 = (EditText) findViewById(R.id.cap11);
	        cap12 = (EditText) findViewById(R.id.cap12);
	        cap13 = (EditText) findViewById(R.id.cap13);
	        cap14 = (EditText) findViewById(R.id.cap14);
	        cap15 = (EditText) findViewById(R.id.cap15);
	        
	        
	        valuta = (EditText) findViewById(R.id.valuta);
	        valuta1 = (EditText) findViewById(R.id.valuta1);
	        valuta2= (EditText) findViewById(R.id.valuta2);
	        valuta3 = (EditText) findViewById(R.id.valuta3);
	        valuta4 = (EditText) findViewById(R.id.valuta4);
	        valuta5 = (EditText) findViewById(R.id.valuta5);
	        valuta6 = (EditText) findViewById(R.id.valuta6);
	        valuta7 = (EditText) findViewById(R.id.valuta7);
	        valuta8 = (EditText) findViewById(R.id.valuta8);
	        valuta9 = (EditText) findViewById(R.id.valuta9);
	        
	        admj1 = (EditText) findViewById(R.id.admj1);
	        admj2 = (EditText) findViewById(R.id.admj2);
	        admj3 = (EditText) findViewById(R.id.admj3);
	        admj4 = (EditText) findViewById(R.id.admj4);
	        admj5 = (EditText) findViewById(R.id.admj5);
	        admj6 = (EditText) findViewById(R.id.admj6);
	        admj7 = (EditText) findViewById(R.id.admj7);
	        admj8 = (EditText) findViewById(R.id.admj8);
	        admj9 = (EditText) findViewById(R.id.admj9);
	        admj10 = (EditText) findViewById(R.id.admj10);
	        
	        
	        admasac=(ToggleButton) findViewById(R.id.admasac) ;
	        asac=(ToggleButton) findViewById(R.id.asac) ;
	        toggleSC=(ToggleButton) findViewById(R.id.toggleSC) ;
			   
	        
	        admt=(ToggleButton) findViewById(R.id.admt) ;
	        admjt=(ToggleButton) findViewById(R.id.admjt) ;
	        admt1=(ToggleButton) findViewById(R.id.admt1) ;
	        admin1=(RadioButton)findViewById(R.id.admin1);
	        admin2=(RadioButton)findViewById(R.id.admin2);
	        plus =(Button) findViewById(R.id.plus) ;
	        
	        admjt2=(ToggleButton) findViewById(R.id.admjt2) ;
	        
	        adm13 = (EditText) findViewById(R.id.adm13);
	        adm14 = (EditText) findViewById(R.id.adm14);
	        adm15 = (EditText) findViewById(R.id.adm15);
	        adm16 = (EditText) findViewById(R.id.adm16);
	        adm17 = (EditText) findViewById(R.id.adm17);
	        
	        adm11 = (EditText) findViewById(R.id.adm11);
	        adm12 = (EditText) findViewById(R.id.adm12);
	        adm1 = (EditText) findViewById(R.id.adm1);
	        adm2 = (EditText) findViewById(R.id.adm2);
	        adm3 = (EditText) findViewById(R.id.adm3);
	        adm4 = (EditText) findViewById(R.id.adm4);
	        adm5 = (EditText) findViewById(R.id.adm5);
	        adm6 = (EditText) findViewById(R.id.adm6);
	        adm7 = (EditText) findViewById(R.id.adm7);
	        adm8 = (EditText) findViewById(R.id.adm8);
	        adm9 = (EditText) findViewById(R.id.adm9);
	        adm10 = (EditText) findViewById(R.id.adm10);
	        
	        f10b4=(ToggleButton) findViewById(R.id.f10b4) ;
		       
	        cj13=(ToggleButton) findViewById(R.id.cj13) ;
	        cj14 = (EditText) findViewById(R.id.cj14);
	        cj15 = (EditText) findViewById(R.id.cj15);
	        cs = (EditText) findViewById(R.id.cs);
	        cj12 = (EditText) findViewById(R.id.cj12);
	        cj11 = (EditText) findViewById(R.id.cj11);
	        cj10 = (EditText) findViewById(R.id.cj10);
	        cj9 = (EditText) findViewById(R.id.cj9);
	        cj8 = (EditText) findViewById(R.id.cj8);
	        cj7 = (EditText) findViewById(R.id.cj7);
	        cj6 = (EditText) findViewById(R.id.cj6);
	        cj5 = (EditText) findViewById(R.id.cj5);
	        cj4 = (EditText) findViewById(R.id.cj4);
	        cj3 = (EditText) findViewById(R.id.cj3);
	        cj2 = (EditText) findViewById(R.id.cj2);
	        cj1 = (EditText) findViewById(R.id.cj1);
	        cj = (EditText) findViewById(R.id.cj);
	        c19 = (EditText) findViewById(R.id.c19);
	        c18 = (EditText) findViewById(R.id.c18);
	        c17 = (EditText) findViewById(R.id.c17);
	        c16 = (EditText) findViewById(R.id.c16);
	        c15 = (EditText) findViewById(R.id.c15);
	        c14 = (EditText) findViewById(R.id.c14);
	        c13 = (EditText) findViewById(R.id.c13);
	        c12 = (EditText) findViewById(R.id.c12);
	        c11= (EditText) findViewById(R.id.c11);
	        c10 = (EditText) findViewById(R.id.c10);
	        c9 = (EditText) findViewById(R.id.c9);
	        c8 = (EditText) findViewById(R.id.c8);
	        c7 = (EditText) findViewById(R.id.c7);
	        c6 = (EditText) findViewById(R.id.c6);
	        c5 = (EditText) findViewById(R.id.c5);
	        c4 = (EditText) findViewById(R.id.c4);
	        c3 = (EditText) findViewById(R.id.c3);
	        c2 = (EditText) findViewById(R.id.c2);
	        j41 = (EditText) findViewById(R.id.j41);
	        j41 = (EditText) findViewById(R.id.j41);
	        j41 = (EditText) findViewById(R.id.j41);
	        
	        
	        j41 = (EditText) findViewById(R.id.j41);
	        j42 = (EditText) findViewById(R.id.j42);
	        j32 = (EditText) findViewById(R.id.j32);
	        j1 = (EditText) findViewById(R.id.j1);
	        j21 = (EditText) findViewById(R.id.j21);
	        j12 = (EditText) findViewById(R.id.j12);
	        j11 = (EditText) findViewById(R.id.j11);
	        p70 = (EditText) findViewById(R.id.p70);
	        p71 = (EditText) findViewById(R.id.p71);
	        p61 = (EditText) findViewById(R.id.p61);
	        p62 = (EditText) findViewById(R.id.p62);
	        p63 = (EditText) findViewById(R.id.p63);
	        p51 = (EditText) findViewById(R.id.p51);
	        radio0=(RadioButton)findViewById(R.id.radio0);
	        radio1=(RadioButton)findViewById(R.id.radio1);
	        radio2=(RadioButton)findViewById(R.id.radio2);
	        p41 = (EditText) findViewById(R.id.p41);
	        p42 = (EditText) findViewById(R.id.p42);
	        p43 = (EditText) findViewById(R.id.p43);
	        p44 = (EditText) findViewById(R.id.p44);
	        p31 = (EditText) findViewById(R.id.p31);
	        p32 = (EditText) findViewById(R.id.p32);
	        p33 = (EditText) findViewById(R.id.p33);
	        p22 = (EditText) findViewById(R.id.p22);
	        p23 = (EditText) findViewById(R.id.p23);
	        p24 = (EditText) findViewById(R.id.p24);
	        p12 = (EditText) findViewById(R.id.p12);
	        p11=(ToggleButton) findViewById(R.id.p11) ;
	        p13=(ToggleButton) findViewById(R.id.p13) ;
	       txtData = (EditText) findViewById(R.id.editText1);
	       numarAsoc = (EditText) findViewById(R.id.numarAsoc);
	       denumire = (EditText) findViewById(R.id.f11);
	       disp = (EditText) findViewById(R.id.f21);
	       din = (EditText) findViewById(R.id.f22);
	       elibde = (EditText) findViewById(R.id.f41);
	       f51=(RadioButton)findViewById(R.id.f51);
	       f52=(RadioButton)findViewById(R.id.f52);
	       f61 = (EditText) findViewById(R.id.f61); 
	       f62 = (EditText) findViewById(R.id.f62);
	       f63 = (EditText) findViewById(R.id.f63);
	       f71 = (EditText) findViewById(R.id.f71);
	       f81 = (EditText) findViewById(R.id.f81);
	       f82 = (EditText) findViewById(R.id.f82);
	       f91 = (EditText) findViewById(R.id.f91);
	       f92 = (EditText) findViewById(R.id.f92);
	       f93 = (EditText) findViewById(R.id.f93);
	       f94 = (EditText) findViewById(R.id.f94);
	       f101 = (EditText) findViewById(R.id.f101);
	       j31=(ToggleButton) findViewById(R.id.j31) ;
	       cenzorr=(RadioButton)findViewById(R.id.cenzorr);
	       auditorr=(RadioButton)findViewById(R.id.auditorr);
	       fasoc1=(RadioButton)findViewById(R.id.fasoc1);
	       fasoc2=(RadioButton)findViewById(R.id.fasoc2);   
	       pfl=(LinearLayout)findViewById(R.id.pfl);
	       persfizica=(LinearLayout)findViewById(R.id.persfizica);
	       persjuridica=(LinearLayout)findViewById(R.id.persjuridica);
	       pf=(RadioButton)findViewById(R.id.pf);
	       pj=(RadioButton)findViewById(R.id.pj);
	       asociatii=(RadioButton)findViewById(R.id.asociati);
	       persfizicac=(LinearLayout)findViewById(R.id.persfizicac);
	       persjuriticac=(LinearLayout)findViewById(R.id.persjuridicac);
	       c1=(ToggleButton)findViewById(R.id.c1) ;
	       
	       persfizicaadm=(LinearLayout)findViewById(R.id.persfizicaadm);
	       persjuridicaadm=(LinearLayout)findViewById(R.id.persjuridicaadm);
	       
	       durata=(LinearLayout)findViewById(R.id.durata);
		      
	       pfp=(LinearLayout)findViewById(R.id.pfp);
	       scp=(LinearLayout)findViewById(R.id.scp);
	       
	       
	       
	      
	       
	     
		   
           Button button1 = (Button) findViewById(R.id.button1);
	       button1.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					
					createPDF();
					}
				// onClick
			});
	        
	       Button button2 = (Button) findViewById(R.id.button2);     
	       button2.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					
					if(Titlu==null){
						Toast.makeText(context, "Documentul nu a fost salvat", duration).show();
					}
					else{
					String path = Environment.getExternalStorageDirectory()
							.getAbsolutePath()+"/Acte/Act_constitutiv/"+Titlu+".pdf";
				     File targetFile = new File(path);
				      Uri targetUri = Uri.fromFile(targetFile);
				      
				    Intent intent;
				      intent = new Intent(Intent.ACTION_VIEW);
				      intent.setDataAndType(targetUri, "application/pdf");
				    
				      startActivity(intent);
					}
					
				}
			});
	      
	       final Button doc_nou = (Button) findViewById(R.id.doc_nou);
	       doc_nou.setOnClickListener(new OnClickListener() {
	    	  
	    	   
	    	   
	    		   
	   			@Override
	   			public void onClick(View arg0) {
	    
	   				// get prompts.xml view
	   				LayoutInflater li = LayoutInflater.from(context);
	   				View promptsView = li.inflate(R.layout.doc_nou, null);
	    
	   				AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(
	   						context);
	    
	   				// set prompts.xml to alertdialog builder
	   				alertDialogBuilder.setView(promptsView);
	    
	   				final EditText userInput = (EditText) promptsView
	   						.findViewById(R.id.nume);
	    
	   				// set dialog message
	   				alertDialogBuilder
	   					.setCancelable(false)
	   					.setPositiveButton("OK",
	   					  new DialogInterface.OnClickListener() {
	   					    public void onClick(DialogInterface dialog,int id) {
	   						// get user input and set it to result
	   						// edit text
	   						Titlu=userInput.getText().toString();
	   					    }
	   					  })
	   					.setNegativeButton("Cancel",
	   					  new DialogInterface.OnClickListener() {
	   					    public void onClick(DialogInterface dialog,int id) {
	   						dialog.cancel();
	   					    }
	   					  });
	    
	   				// create alert dialog
	   				AlertDialog alertDialog = alertDialogBuilder.create();
	    
	   				// show it
	   				alertDialog.show();
	    
	   			}
	   		});

	    android.app.ActionBar mActionBar = getActionBar();
		mActionBar.setDisplayShowHomeEnabled(false);
		mActionBar.setDisplayShowTitleEnabled(false);
		LayoutInflater mInflater = LayoutInflater.from(this);
		View mCustomView = mInflater.inflate(R.layout.custom_actionbar_help, null);
		TextView mTitleTextView = (TextView) mCustomView.findViewById(R.id.title_text);
		mTitleTextView.setText(" S.R.L. ");
		mActionBar.setCustomView(mCustomView);
		mActionBar.setDisplayShowCustomEnabled(true);
		
		Button bac = (Button) findViewById(R.id.b);
		bac.setVisibility(View.VISIBLE) ;
	       bac.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					
					
					}
				// onClick
			});
		
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
	   
	    
	    final Button B=(Button)findViewById(R.id.b) ;
	    B.setOnClickListener(new OnClickListener() {

   			public void onClick(View v) {

   				LayoutInflater li = LayoutInflater.from(context);
   				View promptsView = li.inflate(R.layout.act_nou, null);
    
   				AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(
   						context);
    
   			//	 set prompts.xml to alertdialog builder
   				alertDialogBuilder.setView(promptsView);

   				alertDialogBuilder
   				.setCancelable(false)
                 	.setNegativeButton("Ok",
   					  new DialogInterface.OnClickListener() {
   					    public void onClick(DialogInterface dialog,int id) {
   						dialog.cancel();
   					    }
   					  });
    
   				// create alert dialog
   				AlertDialog alertDialog = alertDialogBuilder.create();
    
   				// show it
   				alertDialog.show();
   				
   				
   				
    
   			}
   		});
	    
	    
	      Button asociati = (Button) findViewById(R.id.Asocitati);
	      asociati.setOnClickListener(new OnClickListener() {
				
				
			public void onClick(View v) {
				String sUsername = numarAsoc.getText().toString();
			    if (sUsername.matches("")) {
			    	Toast.makeText(context, "Introduceti numarul de asociati ", duration).show();
			        return;
			    }
			    else {
					// TODO Auto-generated method stub
		     layout = (LinearLayout) findViewById(R.id.persdinamic);
		    
		    
		   	   
		    
		       String heightString = numarAsoc.getText().toString();
		        heightInt = Integer.parseInt(heightString);
		        
		       
		     
	       if(i==1){
	       
	    	//   s = new  String[heightInt][6] ;
	    	   int f=0 ;
	    	   int j=240 ;
	    	  int c=370 ;
	    	   
	       for (; i < heightInt; i++) {
	    	   
               LinearLayout asocd = (LinearLayout) findViewById(R.id.asocd);
	    	   
               
               LinearLayout valdin = (LinearLayout) findViewById(R.id.valdin);

	    	   
	    	    final LinearLayout unu = new LinearLayout(v.getContext());
	    	    unu.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
                unu.setOrientation(LinearLayout.HORIZONTAL) ;
               
                TextView      btnTag = new TextView(v.getContext());
	               btnTag.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
	               btnTag.setTextSize(20);
	               btnTag.setText("Asociat "+(i+1) +"  : "); 
	             
	               unu.addView(btnTag);
	               cb1 = new RadioButton(v.getContext());
	               cb1.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));   
	               
	               cb1.setText("Persoana fizica");
	              
                   unu.addView(cb1);
                   
                   cb2 = new RadioButton(v.getContext());
                   cb2.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
	             
                   cb2.setText("Persoana juridica");
                   
	               
	             
	               unu.addView(cb2);
	               
	               asocd.addView(unu); 
	               
	              
	               
	               final LinearLayout doi = new LinearLayout(v.getContext());
		    	    doi.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
	                doi.setOrientation(LinearLayout.HORIZONTAL) ;
	                doi.setVisibility(View.GONE) ;
	                
	                toggle1[i] = new ToggleButton(v.getContext());
		               toggle1[i].setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
		                  
		               toggle1[i].setTextOff("D-na") ; 		             
		               toggle1[i].setTextOn("D-nul") ; 	
		               toggle1[i].setChecked(true) ;
		               f++ ;
		               toggle1[i].setId(f) ;
		               doi.addView(toggle1[i]);
		               
		              
		               
		            text1[i]=new EditText (context)  ;
		            LayoutParams params = new TableRow.LayoutParams(0, LayoutParams.WRAP_CONTENT, 1f);
		            text1[i].setLayoutParams(params);
		           f++ ;
		            text1[i].setId(f) ;
		            
		          //  text.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
	                text1[i].setHint("Ex: Vasile Gheorghe") ;
	                
	               
	                doi.addView(text1[i]) ;   
	              
	                
	                 
	                
	                
	                   toggle2[i] = new ToggleButton(v.getContext());
		               toggle2[i].setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
		               toggle2[i].setTextOff("Str??in") ; 		         
		               toggle2[i].setTextOn("Rom??n") ; 
		               toggle2[i].setChecked(true) ;
		               f++ ;
		               toggle2[i].setId(f) ;
		               doi.addView(toggle2[i]);	
		               
		               asocd.addView(doi);
		               //s[i][3]=toggle2.
		               
		               final LinearLayout trei = new LinearLayout(v.getContext());
			    	    trei.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
			    	    trei.setVisibility(View.GONE) ;
			    	    
		            TextView data1=new TextView(v.getContext()) ;
		            data1.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
		               data1.setText("Data nasterii") ;
		               data1.setTextSize(20);
		               trei.addView(data1) ;
		               
                    text2[i]=new EditText(v.getContext()) ;
                    text2[i].setLayoutParams(params);
                    text2[i].setRawInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_NUMBER_FLAG_DECIMAL)  ;
                    f++ ;//f=4
                    text2[i].setId(f);
                    trei.addView(text2[i]) ;
                   // s[i][4]=data2.getText().toString() ;
                    
                    TextView in1=new TextView(v.getContext()) ;
		            in1.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
		               in1.setText("In") ;
		               in1.setTextSize(20);
		               trei.addView(in1) ;
		               
                     text3[i]=new EditText(v.getContext()) ;
                    text3[i].setLayoutParams(params);
                    f++ ;
                    text3[i].setId(f);
                    trei.addView(text3[i]) ;
                    
                    
                    TextView jud1=new TextView(v.getContext()) ;
		            jud1.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
		               jud1.setText("Jud") ;
		               jud1.setTextSize(20);
		               trei.addView(jud1) ;
		               
		               
		               
                     text4[i]=new EditText(v.getContext()) ;
                     text4[i].setLayoutParams(params);
                    f++ ;
                    text4[i].setId(f);
                    trei.addView(text4[i]) ;
                    
                    asocd.addView(trei) ;
                    
                    final LinearLayout patru = new LinearLayout(v.getContext());
		    	    patru.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
		    	    patru.setVisibility(View.GONE) ;
		    	
                    
                    TextView dom=new TextView(v.getContext()) ;
		            dom.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
		               dom.setText("Domiciliat(??) ??n ") ;
		               dom.setTextSize(20);
		               patru.addView(dom) ;
		               
		               text5[i]=new EditText(v.getContext()) ;
		               text5[i].setLayoutParams(params);
	                    f++ ;
	                    text5[i].setId(f);
	                    patru.addView(text5[i]) ;
	                    
	                    TextView str=new TextView(v.getContext()) ;
			            str.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
			               str.setText("str.") ;
			               str.setTextSize(20);
			               patru.addView(str) ;
			               
			               text6[i]=new EditText(v.getContext()) ;
			               text6[i].setLayoutParams(params);
		                    f++ ;
		                    text6[i].setId(f);
		                    patru.addView(text6[i]) ;
		                    
		                    TextView nr=new TextView(v.getContext()) ;
				            nr.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
				               nr.setText("nr.") ;
				               nr.setTextSize(20);
				               patru.addView(nr) ;
                    
				               text7[i]=new EditText(v.getContext()) ;
				               text7[i].setLayoutParams(params);
				               text7[i].setInputType(InputType.TYPE_CLASS_NUMBER) ;
			                    f++ ;
			                    text7[i].setId(f);
			                    patru.addView(text7[i]) ;
                           
			                    asocd.addView(patru) ;    
                    
			                    final LinearLayout cinci = new LinearLayout(v.getContext());
					    	    cinci.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
					    	    cinci.setVisibility(View.GONE) ;
					    	
			                    
			                    TextView bl=new TextView(v.getContext()) ;
					            bl.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
					               bl.setText("bl.") ;
					               bl.setTextSize(20);
					               cinci.addView(bl) ;
					               
					               text8[i]=new EditText(v.getContext()) ;
					               text8[i].setLayoutParams(params);
					               text8[i].setText("-") ;
				                    f++ ;
				                    text8[i].setId(f);
				                    cinci.addView(text8[i]) ;
				                    
				                    TextView sc=new TextView(v.getContext()) ;
						            sc.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
						               sc.setText("sc.") ;
						               sc.setTextSize(20);
						               cinci.addView(sc) ;
						               
						               text9[i]=new EditText(v.getContext()) ;
						               text9[i].setLayoutParams(params);
						               text9[i].setText("-") ;
					                    f++ ;
					                    text9[i].setId(f);
					                    cinci.addView(text9[i]) ;
					                    
					                    TextView et=new TextView(v.getContext()) ;
							            et.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
							               et.setText("et.") ;
							               et.setTextSize(20);
							               cinci.addView(et) ;
			                    
							               text10[i]=new EditText(v.getContext()) ;
							               text10[i].setLayoutParams(params);
							               text10[i].setText("-") ;
						                    f++ ;
						                    text10[i].setId(f);
						                    cinci.addView(text10[i]) ;
						                    
						                    TextView ap=new TextView(v.getContext()) ;
								            ap.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
								               ap.setText("ap.") ;
								               ap.setTextSize(20);
								               cinci.addView(ap) ;
				                    
								               text11[i]=new EditText(v.getContext()) ;
								               text11[i].setLayoutParams(params);
								               text11[i].setText("-") ;
							                    f++ ;
							                    text11[i].setId(f);
							                    cinci.addView(text11[i]) ;
			                           
						                    asocd.addView(cinci) ;  
                    
						                    final LinearLayout sase = new LinearLayout(v.getContext());
								    	    sase.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
								    	    sase.setVisibility(View.GONE) ;
								    	
						                    
						                    TextView judet=new TextView(v.getContext()) ;
								            judet.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
								               judet.setText("Jud") ;
								               judet.setTextSize(20);
								               sase.addView(judet) ;
								               
								               text12[i]=new EditText(v.getContext()) ;
								               text12[i].setLayoutParams(params);
							                    
							                    f++ ; //  f=15
							                    text12[i].setId(f);
							                    sase.addView(text12[i]) ;
							                    
							                     ci[i] = new RadioButton(v.getContext());
							                     ci[i].setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));   
							 	               
							                     ci[i].setText("CI");
							 	               f++;
							 	              ci[i].setId(f) ;
							                    sase.addView(ci[i]);
							                    
							                    bi[i] = new RadioButton(v.getContext());
							                    bi[i].setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
							 	             
							                    bi[i].setText("BI");
							 	               
							 	               f=f+1  ;
							 	              bi[i].setId(f) ;
							 	               sase.addView(bi[i]);
							                
							 	              pasaport[i] = new RadioButton(v.getContext());
							 	             pasaport[i].setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
							 	             
							 	            pasaport[i].setText("Pa??aport");
							 	               
							 	               f++  ;
							 	              pasaport[i].setId(f) ;
							 	               sase.addView(pasaport[i]);
							 	               
							                    asocd.addView(sase) ;  
							                    
							                    final LinearLayout sapte = new LinearLayout(v.getContext());
									    	    sapte.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
									    	    sapte.setVisibility(View.GONE) ;
									    	
							                    
							                    TextView seria=new TextView(v.getContext()) ;
									            seria.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
									               seria.setText("serie") ;
									               seria.setTextSize(20);
									               sapte.addView(seria) ;
									               
									                text13[i]=new EditText(v.getContext()) ;
									                text13[i].setLayoutParams(params);
								                    f++ ;//f=18
								                    text13[i].setId(f);
								                    sapte.addView(text13[i]) ;
								                    
								                    TextView nrs=new TextView(v.getContext()) ;
										            nrs.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
										               nrs.setText("nr.") ;
										               nrs.setTextSize(20);
										               sapte.addView(nrs) ;
										               
										               text14[i]=new EditText(v.getContext()) ;
										               text14[i].setLayoutParams(params);
										               text14[i].setInputType(InputType.TYPE_CLASS_NUMBER) ;
									                    f++ ;
									                    text14[i].setId(f);
									                    sapte.addView(text14[i]) ;
									                    
									                    TextView elibde=new TextView(v.getContext()) ;
											            elibde.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
											               elibde.setText("eliberat de") ;
											               elibde.setTextSize(20);
											               sapte.addView(elibde) ;
							                    
											               text15[i]=new EditText(v.getContext()) ;
											               text15[i].setLayoutParams(params);
										                    f++ ;
										                    text15[i].setId(f);
										                    sapte.addView(text15[i]) ;
							                           
										                    asocd.addView(sapte) ;  
							                    
										                    final LinearLayout opt = new LinearLayout(v.getContext());
												    	    opt.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
												    	    opt.setVisibility(View.GONE) ;
												    	
												                    
												                    TextView datade2=new TextView(v.getContext()) ;
														            datade2.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
														               datade2.setText("la data de") ;
														               datade2.setTextSize(20);
														               opt.addView(datade2) ;
														               
														               text16[i]=new EditText(v.getContext()) ;
														               text16[i].setLayoutParams(params);
														               text16[i].setRawInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_NUMBER_FLAG_DECIMAL)  ;
													                    f++ ;
													                    text16[i].setId(f);
													                    opt.addView(text16[i]) ;
													                    
													                    TextView cnp=new TextView(v.getContext()) ;
															            cnp.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
															               cnp.setText("CNP") ;
															               cnp.setTextSize(20);
															               opt.addView(cnp) ;
										                    
															               text17[i]=new EditText(v.getContext()) ;
															               text17[i].setLayoutParams(params);
															               text17[i].setInputType(InputType.TYPE_CLASS_NUMBER) ;
													                    f++ ;
													                    text17[i].setId(f);
													                    opt.addView(text17[i]) ;
										                           
													                    asocd.addView(opt) ;  
													                    

													                    final LinearLayout noua = new LinearLayout(v.getContext());
															    	    noua.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
															    	    noua.setVisibility(View.GONE) ;
															    	
															                    
															                    TextView scom=new TextView(v.getContext()) ;
																	            scom.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
																	               scom.setText("S.C.") ;
																	               scom.setTextSize(20);
																	               noua.addView(scom) ;
																	               
																	              text18[i]=new EditText(v.getContext()) ;
																	              text18[i].setLayoutParams(params);
																                    
																                    text18[i].setId(j);
																                    noua.addView(text18[i]) ;
																                    
																                     toggl[i] = new ToggleButton(v.getContext());
																		               toggl[i].setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
																		               toggl[i].setTextOff("Str??in") ; 		         
																		               toggl[i].setTextOn("Rom??n") ; 
																		               toggl[i].setChecked(true) ;
																		               j++ ;
																		               toggl[i].setId(j) ;
																		               noua.addView(toggl[i]);	
																                    
																                    TextView sediulj=new TextView(v.getContext()) ;
																		            sediulj.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
																		               sediulj.setText("Sediul") ;
																		               sediulj.setTextSize(20);
																		               noua.addView(sediulj) ;
													                    
																		               text19[i]=new EditText(v.getContext()) ;
																		               text19[i].setLayoutParams(params);
																                    j++ ;
																                    text19[i].setId(j);
																                    noua.addView(text19[i]) ;
													                           
																                    asocd.addView(noua) ;  
																                    
																                    
																                    final LinearLayout unu4 = new LinearLayout(v.getContext());
																		    	    unu4.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
																		    	    unu4.setVisibility(View.GONE) ;
																		    	
																		                    
																		                    TextView identifla=new TextView(v.getContext()) ;
																				            identifla.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
																				               identifla.setText("??nregistrat?? la ") ;
																				               identifla.setTextSize(20);
																				               unu4.addView(identifla) ;
																				               
																				               text20[i]=new EditText(v.getContext()) ;
																				               text20[i].setLayoutParams(params);
																				               
																			                    j++ ;
																			                    text20[i].setId(j);
																			                    unu4.addView(text20[i]) ;
																			                    
																			                    
																                           
																			                    asocd.addView(unu4) ;      
																                    
																                    final LinearLayout zece = new LinearLayout(v.getContext());
																		    	    zece.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
																		    	    zece.setVisibility(View.GONE) ;
																		    	
																		                    
																		                    TextView identif=new TextView(v.getContext()) ;
																				            identif.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
																				               identif.setText("Date de identificare") ;
																				               identif.setTextSize(20);
																				               zece.addView(identif) ;
																				               
																				               text21[i]=new EditText(v.getContext()) ;
																				               text21[i].setLayoutParams(params);
																			                    j++ ;
																			                    text21[i].setId(j);
																			                    zece.addView(text21[i]) ;
																			                    
																			                    
																                           
																			                    asocd.addView(zece) ;      
																			                    
																			                    final LinearLayout unu1 = new LinearLayout(v.getContext());
																					    	    unu1.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
																					    	    unu1.setVisibility(View.GONE) ;
																					    	
																					                    
																					                    TextView reprezde=new TextView(v.getContext()) ;
																							            reprezde.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
																							               reprezde.setText("Reprez. de ") ;
																							               reprezde.setTextSize(20);
																							               unu1.addView(reprezde) ;
																							               
																							                reprezde1[i] = new ToggleButton(v.getContext());
																							                reprezde1[i].setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
																							                  
																							                reprezde1[i].setTextOff("D-na") ; 		             
																							                reprezde1[i].setTextOn("D-nul") ; 	
																							                reprezde1[i].setChecked(true) ;
																							               j++  ;
																							               reprezde1[i].setId(j) ;
																							               unu1.addView(reprezde1[i]);
																							               
																							               text22[i]=new EditText(v.getContext()) ;
																							               text22[i].setLayoutParams(params);
																						                    j++ ;
																						                    text22[i].setId(j);
																						                    unu1.addView(text22[i]) ;
																						                    
																						                    
																			                           
																						                    asocd.addView(unu1) ;        
																
																						                    final LinearLayout unu2 = new LinearLayout(v.getContext());
																								    	    unu2.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
																								    	    unu2.setVisibility(View.GONE) ;
																								    	
																								                    
																								                    TextView aga=new TextView(v.getContext()) ;
																										            aga.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
																										               aga.setText("Conform Hotararii A.G.A a") ;
																										               aga.setTextSize(20);
																										               unu2.addView(aga) ;
																										               
																										               toggl1[i] = new ToggleButton(v.getContext());
																										               toggl1[i].setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
																										               toggl1[i].setTextOff("asocia??ilor") ; 		         
																										               toggl1[i].setTextOn("ac??ionarilor") ; 
																										               toggl1[i].setChecked(true) ;
																										               j++ ;
																										               toggl1[i].setId(j) ;
																										               unu2.addView(toggl1[i]);
																										               
																										               TextView agas=new TextView(v.getContext()) ;
																											            agas.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
																											               agas.setText(" nr.") ;
																											               agas.setTextSize(20);
																											               unu2.addView(agas) ; 
																										               
																										               text23[i]=new EditText(v.getContext()) ;
																										               text23[i].setLayoutParams(params);
																										               text23[i].setInputType(InputType.TYPE_CLASS_NUMBER) ;
																									                    j++ ;
																									                    text23[i].setId(j);
																									                    unu2.addView(text23[i]) ;
																									                    
																									                    TextView da=new TextView(v.getContext()) ;
																									                    da.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
																									                    da.setText("din data ") ;
																									                    da.setTextSize(20);
																											               unu2.addView(da) ;
																						                    
																											               text24[i]=new EditText(v.getContext()) ;
																											               text24[i].setLayoutParams(params);
																											               text24[i].setRawInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_NUMBER_FLAG_DECIMAL)  ;
																									                    j++ ;
																									                    text24[i].setId(j);
																									                    unu2.addView(text24[i]) ;
																						                           
																									                    asocd.addView(unu2) ;  
																									     
																									                    
																		                   TextView as=new TextView(v.getContext()) ;
													   						             as.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
											   								               as.setText(".. Asociat "+(i+1)+" ..") ;
																			               as.setTextSize(20);
																			               valdin.addView(as) ;
																				               
																			              																                    
										
																			               
						               final LinearLayout sase1 = new LinearLayout(v.getContext());
						    	    sase1.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
						    	    sase1.setVisibility(View.GONE) ;
																				    	    
							       TextView nume1=new TextView(v.getContext()) ;
								 nume1.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
								 nume1.setText("  Nume ") ;
								 nume1.setTextSize(20);
								 sase1.addView(nume1) ;
																			               
								  text25[i]=new EditText(v.getContext()) ;
					              text25[i].setLayoutParams(params);
								  
					              text25[i].setId(c);
					              sase1.addView(text25[i]) ;
										
		                TextView pre=new TextView(v.getContext()) ;
	    	            pre.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
					    pre.setText(" Prenume ") ;
					    pre.setTextSize(20);
					    sase1.addView(pre) ;
																			               
					    text26[i]=new EditText(v.getContext()) ;
		                text26[i].setLayoutParams(params);
					     c++ ;
				        text26[i].setId(c);
					 sase1.addView(text26[i]) ;
																	                    
																	                   
					  valdin.addView(sase1) ;

		
					  final LinearLayout sase2 = new LinearLayout(v.getContext());
			    	    sase2.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
			    	    sase2.setVisibility(View.GONE) ;
																	    	    
				       TextView aport1=new TextView(v.getContext()) ;
					 aport1.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
					 aport1.setText(" aport la cap. social") ;
					 aport1.setTextSize(20);
					 sase2.addView(aport1) ;
																               
					  text27[i]=new EditText(v.getContext()) ;
		              text27[i].setLayoutParams(params);
		              text27[i].setRawInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_NUMBER_FLAG_DECIMAL) ;
					  c++ ;
		              text27[i].setId(c);
		              sase2.addView(text27[i]) ;
							
          TextView aport2=new TextView(v.getContext()) ;
          aport2.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
          aport2.setText("%, reprez. un num??r de") ;
          aport2.setTextSize(20);
		    sase2.addView(aport2) ;
																               
		    text28[i]=new EditText(v.getContext()) ;
          text28[i].setLayoutParams(params);
          text28[i].setRawInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_NUMBER_FLAG_DECIMAL)  ;
		     c++ ;
	        text28[i].setId(c);
		 sase2.addView(text28[i]) ;
					
		 TextView aport3=new TextView(v.getContext()) ;
         aport3.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
         aport3.setText("p??r??i sociale, ") ;
         aport3.setTextSize(20);
		    sase2.addView(aport3) ;
														                   
		  valdin.addView(sase2) ;
		  
		  
		  final LinearLayout sase3 = new LinearLayout(v.getContext());
  	    sase3.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
  	    sase3.setVisibility(View.GONE) ;
														    	    
	       TextView aport4=new TextView(v.getContext()) ;
		 aport4.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
		 aport4.setText("cu o valoare de") ;
		 aport4.setTextSize(20);
		 sase3.addView(aport4) ;
													               
		  text29[i]=new EditText(v.getContext()) ;
        text29[i].setLayoutParams(params);
        text29[i].setRawInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_NUMBER_FLAG_DECIMAL)  ;
		  c++ ;
        text29[i].setId(c);
        sase3.addView(text29[i]) ;
				
TextView aport5=new TextView(v.getContext()) ;
aport5.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
aport5.setText("lei/p. social?? ??n valoare total?? de") ;
aport5.setTextSize(20);
sase3.addView(aport5) ;
													               
text30[i]=new EditText(v.getContext()) ;
text30[i].setLayoutParams(params);
text30[i].setRawInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_NUMBER_FLAG_DECIMAL)  ;
c++ ;
text30[i].setId(c);
sase3.addView(text30[i]) ;
		
TextView aport6=new TextView(v.getContext()) ;
aport6.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
aport6.setText("lei , ") ;
aport6.setTextSize(20);
sase3.addView(aport6) ;
											                   
valdin.addView(sase3) ;
		  
		  
final LinearLayout sase4 = new LinearLayout(v.getContext());
  sase4.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
  sase4.setVisibility(View.GONE) ;
												    	    
   TextView aport7=new TextView(v.getContext()) ;
 aport7.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
 aport7.setText(" participare la profit") ;
 aport7.setTextSize(20);
 sase4.addView(aport7) ;
											               
  text31[i]=new EditText(v.getContext()) ;
text31[i].setLayoutParams(params);
text31[i].setRawInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_NUMBER_FLAG_DECIMAL)  ;
  c++ ;
text31[i].setId(c);
sase4.addView(text31[i]) ;
		
TextView aport8=new TextView(v.getContext()) ;
aport8.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
aport8.setText("% ??i  participare la pierderi") ;
aport8.setTextSize(20);
sase4.addView(aport8) ;
											               
text32[i]=new EditText(v.getContext()) ;
text32[i].setLayoutParams(params);
text32[i].setRawInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_NUMBER_FLAG_DECIMAL)  ;
c++ ;
text32[i].setId(c);
sase4.addView(text32[i]) ;

TextView aport9=new TextView(v.getContext()) ;
aport9.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
aport9.setText("%; ") ;
aport9.setTextSize(20);
sase4.addView(aport9) ;
									                   
valdin.addView(sase4) ;


final LinearLayout sase5 = new LinearLayout(v.getContext());
sase5.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
sase5.setVisibility(View.GONE) ;
											    	    
TextView nume2=new TextView(v.getContext()) ;
nume2.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
nume2.setText("  S.C. ") ;
nume2.setTextSize(20);
sase5.addView(nume2) ;
										               
text33[i]=new EditText(v.getContext()) ;
text33[i].setLayoutParams(params);
c++ ;
text33[i].setId(c);
sase5.addView(text33[i]) ;
	
                  
								                   
valdin.addView(sase5) ;


final LinearLayout sase6 = new LinearLayout(v.getContext());
sase6.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
sase6.setVisibility(View.GONE) ;
								    	    
TextView aport10=new TextView(v.getContext()) ;
aport10.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
aport10.setText(" aport la cap. social") ;
aport10.setTextSize(20);
sase6.addView(aport10) ;
							               
text34[i]=new EditText(v.getContext()) ;
text34[i].setLayoutParams(params);
text34[i].setRawInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_NUMBER_FLAG_DECIMAL)  ;
c++ ;
text34[i].setId(c);
sase6.addView(text34[i]) ;

TextView aport11=new TextView(v.getContext()) ;
aport11.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
aport11.setText("%, reprez. un num??r de") ;
aport11.setTextSize(20);
sase6.addView(aport11) ;
							               
text35[i]=new EditText(v.getContext()) ;
text35[i].setLayoutParams(params);
text35[i].setRawInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_NUMBER_FLAG_DECIMAL)  ;
c++ ;
text35[i].setId(c);
sase6.addView(text35[i]) ;

TextView aport12=new TextView(v.getContext()) ;
aport12.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
aport12.setText("p??r??i sociale, ") ;
aport12.setTextSize(20);
sase6.addView(aport12) ;
					                   
valdin.addView(sase6) ;


final LinearLayout sase7 = new LinearLayout(v.getContext());
sase7.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
sase7.setVisibility(View.GONE) ;
					    	    
TextView aport13=new TextView(v.getContext()) ;
aport13.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
aport13.setRawInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_NUMBER_FLAG_DECIMAL)  ;
aport13.setTextSize(20);
sase7.addView(aport13) ;
				               
text36[i]=new EditText(v.getContext()) ;
text36[i].setLayoutParams(params);
text36[i].setInputType(InputType.TYPE_NUMBER_FLAG_DECIMAL) ;
c++ ;
text36[i].setId(c);
sase7.addView(text36[i]) ;

TextView aport14=new TextView(v.getContext()) ;
aport14.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
aport14.setText("lei/p. social?? ??n valoare total?? de") ;
aport14.setTextSize(20);
sase7.addView(aport14) ;
				               
text37[i]=new EditText(v.getContext()) ;
text37[i].setLayoutParams(params);
text37[i].setRawInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_NUMBER_FLAG_DECIMAL)  ;
c++ ;
text37[i].setId(c);
sase7.addView(text37[i]) ;

TextView aport15=new TextView(v.getContext()) ;
aport15.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
aport15.setText("lei , ") ;
aport15.setTextSize(20);
sase7.addView(aport15) ;
		                   
valdin.addView(sase7) ;


final LinearLayout sase8 = new LinearLayout(v.getContext());
sase8.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
sase8.setVisibility(View.GONE) ;
			    	    
TextView aport16=new TextView(v.getContext()) ;
aport16.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
aport16.setText(" participare la profit") ;
aport16.setTextSize(20);
sase8.addView(aport16) ;
		               
text38[i]=new EditText(v.getContext()) ;
text38[i].setLayoutParams(params);
text38[i].setRawInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_NUMBER_FLAG_DECIMAL)  ;
c++ ;
text38[i].setId(c);
sase8.addView(text38[i]) ;

TextView aport17=new TextView(v.getContext()) ;
aport17.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
aport17.setText("% ??i  participare la pierderi") ;
aport17.setTextSize(20);
sase8.addView(aport17) ;
		               
text39[i]=new EditText(v.getContext()) ;
text39[i].setLayoutParams(params);
text39[i].setRawInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_NUMBER_FLAG_DECIMAL)  ;
c++ ;
text39[i].setId(c);
sase8.addView(text39[i]) ;

TextView aport18=new TextView(v.getContext()) ;
aport18.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
aport18.setText("%; ") ;
aport18.setTextSize(20);
sase8.addView(aport18) ;
                   
valdin.addView(sase8) ;


                    
                    cb1.setOnClickListener(new OnClickListener() {
        				
        				@Override
        				public void onClick(View v) {
        					
        					cb2.setChecked(false);
        					
        					doi.setVisibility(View.VISIBLE) ;
        					trei.setVisibility(View.VISIBLE) ;
        					patru.setVisibility(View.VISIBLE) ;
        					cinci.setVisibility(View.VISIBLE) ;
        					sase.setVisibility(View.VISIBLE) ;
        					sapte.setVisibility(View.VISIBLE) ;
        					opt.setVisibility(View.VISIBLE) ;
        					sase1.setVisibility(View.VISIBLE) ;
        					sase2.setVisibility(View.VISIBLE) ;
        					sase3.setVisibility(View.VISIBLE) ;
        					sase4.setVisibility(View.VISIBLE) ;
        					
        					
    						noua.setVisibility(View.GONE) ;
    						zece.setVisibility(View.GONE) ;
    						unu1.setVisibility(View.GONE) ;
    						unu2.setVisibility(View.GONE) ;
    						unu4.setVisibility(View.GONE) ;
    						sase5.setVisibility(View.GONE) ;
    						sase6.setVisibility(View.GONE) ;
    						sase7.setVisibility(View.GONE) ;
    						sase8.setVisibility(View.GONE) ;
        				}
        			});     
        		  cb2.setOnClickListener(new OnClickListener() {
        					
        					
        					public void onClick(View v) {
        						cb1.setChecked(false);
        						noua.setVisibility(View.VISIBLE) ;
        						zece.setVisibility(View.VISIBLE) ;
        						unu1.setVisibility(View.VISIBLE) ;
        						unu2.setVisibility(View.VISIBLE) ;
        						unu4.setVisibility(View.VISIBLE) ;
        						sase5.setVisibility(View.VISIBLE) ;
        						sase6.setVisibility(View.VISIBLE) ;
        						sase7.setVisibility(View.VISIBLE) ;
        						sase8.setVisibility(View.VISIBLE) ;
        						
        						doi.setVisibility(View.GONE) ;
            					trei.setVisibility(View.GONE) ;
            					patru.setVisibility(View.GONE) ;
            					cinci.setVisibility(View.GONE) ;
            					sase.setVisibility(View.GONE) ;
            					sapte.setVisibility(View.GONE) ;
            					opt.setVisibility(View.GONE) ;
            					sase1.setVisibility(View.GONE) ;
            					sase2.setVisibility(View.GONE) ;
            					sase3.setVisibility(View.GONE) ;
            					sase4.setVisibility(View.GONE) ;
        						
        					}
        				});      	
	           }

	       }
			    
	       else { } ;
			    }
			    

				}
			
			
			
			});  
	      
	    
	      
	       
	      v1.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					v3.setChecked(false) ;
					v2.setChecked(false) ;
					valuta11="EUR" ;
					valuta2.setVisibility(View.GONE) ;
				}
			});
	      v2.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					v1.setChecked(false) ;
					v3.setChecked(false) ;
					valuta11="USD" ;
					valuta2.setVisibility(View.GONE) ;
				}
			});
	      v3.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					v1.setChecked(false) ;
					v2.setChecked(false) ;
					valuta2.setVisibility(View.VISIBLE) ;
					valuta11= " "+ valuta2.getText().toString() ;
				}
			});
	      v4.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					v5.setChecked(false) ;
					v6.setChecked(false) ;
					valuta22="EUR" ;
					valuta5.setVisibility(View.GONE) ;
				}
			});
	      v5.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					v4.setChecked(false) ;
					v6.setChecked(false) ;
					valuta22="USD" ;
					valuta5.setVisibility(View.GONE) ;
				}
			});
	      v6.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					v4.setChecked(false) ;
					v5.setChecked(false) ;
					valuta5.setVisibility(View.VISIBLE) ;
					valuta22=" "+valuta5.getText().toString() ;
				}
			});
	      
	      f51.setOnClickListener(new OnClickListener() { 
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				f52.setChecked(false);
				f61.setEnabled(false);
				f62.setEnabled(false);
				f63.setEnabled(false);
			
			}
		});     
	      f52.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					f51.setChecked(false);
					f61.setEnabled(true);
					f62.setEnabled(true);
					f63.setEnabled(true);
				}
			});      	   
	      fasoc1.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					fasoc2.setChecked(false);
					persfizica.setVisibility(View.VISIBLE) ;
					persjuridica.setVisibility(View.GONE) ;
					pfp.setVisibility(View.VISIBLE) ;
					scp.setVisibility(View.GONE) ;
				}
			});     
		  fasoc2.setOnClickListener(new OnClickListener() {
					
					@Override
					public void onClick(View v) {
						// TODO Auto-generated method stub
						persfizica.setVisibility(View.GONE) ;
						persjuridica.setVisibility(View.VISIBLE) ;
						fasoc1.setChecked(false);
						pfp.setVisibility(View.GONE) ;	
						scp.setVisibility(View.VISIBLE) ;
					}
				});      	    
	      
		  D="D-nul " ;
    	  nascut="n??scut ";
    	  dom="domiciliat " ;
    	  posesor="posesor " ;
		  
    	  natie="rom??n ";
    	  
		  p11.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				 if(p11.isChecked()) {
					 D="D-nul " ;
		        	  nascut="n??scut ";
		        	  dom="domiciliat " ;
		        	  posesor="posesor " ;
		        	  
		        	 
		          }
		          else {
		        	 
		        	  
		        	  D="D-na " ;
		        	  nascut="n??scut?? ";
		        	  dom="domiciliat?? " ;
		        	  posesor="posesoare " ;
				
			}
			}
		}) ;
		  	  		  
		  Da="D-nul " ;
    	  nascuta="n??scut ";
    	  doma="domiciliat " ;
    	  posesora="posesor " ;
		  
    	  natiea="rom??n ";
    	  
		  admt.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				 if(admt.isChecked()) {
					 Da="D-nul " ;
		        	  nascuta="n??scut ";
		        	  doma="domiciliat " ;
		        	  posesora="posesor " ;
		        	  
		        	 
		          }
		          else {
		        	 
		        	  
		        	  Da="D-na " ;
		        	  nascuta="n??scut?? ";
		        	  doma="domiciliat?? " ;
		        	  posesora="posesoare " ;
				
			}
			}
		}) ;		  
		  admt1.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					
					if(admt1.isChecked()) {
						 
			        	  natiea="rom??n ";
			        	 
			          }
			          else {
			        	 
			        	  
			        	  natiea="str??in ";
				}
					  
				
					  
				}
			});
		  
		  Dc="D-nul " ;
    	  nascutc="n??scut ";
  
		  c1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				 if(c1.isChecked()) {
					 Dc="D-nul " ;
		        	  nascutc="n??scut ";
		        	  
		        	  
		        	 
		          }
		          else {
		        	 
		        	  
		        	  Dc="D-na " ;
		        	  nascutc="n??scut?? ";
		        	  
				
			}
			}
		}) ;
		  asac1="asocia??ilor" ;
		  
		  asac.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					 if(asac.isChecked()) {
						 asac1="asocia??ilor" ;
			        	  
			        	  
			        	 
			          }
			          else {
			        	 
			        	  
			        	  asac1="ac??ionarilor" ;
			        	  
					
				}
				}
			}) ;
admasac1="asocia??ilor" ;
		  
		  admasac.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					 if(admasac.isChecked()) {
						 admasac1="asocia??ilor" ;
			        	  
			        	  
			        	 
			          }
			          else {
			        	 
			        	  
			        	  admasac1="ac??ionarilor" ;
			        	  
					
				}
				}
			}) ;
		  
		  Dj="D-nul " ;
		  cj13.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					 if(cj13.isChecked()) {
						 Dj="D-nul " ;
			        	 
			        	  
			        	  
			        	 
			          }
			          else {
			        	 
			        	  
			        	  Dj="D-na " ;
			        	  
					
				}
				}
			}) ;
		  
		  Dadm="D-nul" ;
		  
		  admjt2.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					 if(admjt2.isChecked()) {
						 Dadm="D-nul " ;
			        	 
			        	  
			        	  
			        	 
			          }
			          else {
			        	 
			        	  
			        	  Dadm="D-na " ;
			        	  
					
				}
				}
			}) ;
		  
		  natieadm="rom??n ";
		  
		  admjt.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					
					if(admjt.isChecked()) {
						 
			        	  natieadm="rom??n ";
			        	 
			          }
			          else {
			        	 
			        	  
			        	  natieadm="str??in ";
				}
					  
				
					  
				}
			});
		  
		  natie="rom??n ";
		  
		  p13.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				if(p13.isChecked()) {
					 
		        	  natie="rom??n ";
		        	 
		          }
		          else {
		        	 
		        	  
		        	  natie="str??in ";
			}
				  
			
				  
			}
		});
		  
naties="rom??n ";
		  
		  toggleSC.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				if(toggleSC.isChecked()) {
					 
		        	  naties="rom??n ";
		        	 
		          }
		          else {
		        	 
		        	  
		        	  naties="str??in ";
			}
				  
			
				  
			}
		});
		  
		  jud="Jude?? ";
		  
		  f10b4.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					
					if(f10b4.isChecked()) {
						 
			        	 jud="Jude?? ";
			       	 
			          }
			          else {
			        	 
			        	  
			        	  jud="Sector ";
				}
					  
				
					  
				}
			});
		  
	
		  RadioGroup radioGroupadmd = (RadioGroup) findViewById(R.id.radioGroupadmj);
          
          
          int checkedRadioButtonadmd = radioGroupadmd.getCheckedRadioButtonId();
           
         
           
          switch (checkedRadioButtonadmd) {
            case R.id.radioadmj1 : 
            admj10.setClickable(false) ;
                             	              break;
                             	             
            case R.id.radioadmj2 :   admj10.setClickable(true) ;
            	
          		                      break;
            
          }
		 
		  
		minus.setText("0") ;
		    
		    layout2 = (LinearLayout) findViewById(R.id.activitatea);
		   
         plus.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
					
					

				
				
				LayoutParams params = new TableRow.LayoutParams(0, LayoutParams.WRAP_CONTENT, 1f);
				
				 data=new TextView(v.getContext()) ;
	            data.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
	               data.setText((ppl+1) +  " : ") ;
	               
	            
	               data.setTextSize(20);
	               layout2.addView(data) ;
				ppl++; 
				
				final LinearLayout act1 = new LinearLayout(v.getContext());
	    	    act1.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
	    	    
	    	    
            data1=new TextView(v.getContext()) ;
            data1.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
               data1.setText("Clasa CAEN ") ;
               data1.setTextSize(20);
            
              
               act1.addView(data1) ;
               
              
               
            plus1[kpl]=new EditText(v.getContext()) ;
            plus1[kpl].setLayoutParams(params);
            plus1[kpl].setInputType(InputType.TYPE_CLASS_NUMBER);
            
            plus1[kpl].setId(idpl);
            act1.addView(plus1[kpl]) ;
            
            layout2.addView(act1) ;
            idpl++ ;
            final LinearLayout act = new LinearLayout(v.getContext());
    	    act.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
    	    
    	    
        data2=new TextView(v.getContext()) ;
        data2.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
           data2.setText("Denumirea ") ;
           data2.setTextSize(20);
         
           
           act.addView(data2) ;
           
           
           plus2[kpl]=new EditText(v.getContext()) ;
           plus2[kpl].setLayoutParams(params);
      
           plus2[kpl].setId(idpl);
        act.addView(plus2[kpl]) ;
       
        layout2.addView(act) ;
        idpl++ ;
        
        kpl++ ;
        
        String da=""+ppl ;
        minus.setText(da) ;
        
			}
		});
         
         
          
        	
         cenzorr.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					pfl.setVisibility(View.VISIBLE) ;
					auditorr.setChecked(false) ;
				    asociatii.setChecked(false) ;
					
				}
			});  
         auditorr.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					pfl.setVisibility(View.VISIBLE) ; 
					cenzorr.setChecked(false) ;
					asociatii.setChecked(false) ;
				}
			});  
         asociatii.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					persfizicac.setVisibility(View.GONE) ;
					persjuriticac.setVisibility(View.GONE) ;
					pf.setChecked(false) ;
					pfl.setVisibility(View.GONE) ; 
					auditorr.setChecked(false) ;
				}
			});  
          
         pf.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					persfizicac.setVisibility(View.VISIBLE) ;
					persjuriticac.setVisibility(View.GONE) ;
					pj.setChecked(false) ;
				}
			});  
       
         pj.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					persfizicac.setVisibility(View.GONE) ;
					persjuriticac.setVisibility(View.VISIBLE) ;
					pf.setChecked(false) ;
				}
			});  
         
         
         admin1.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					persfizicaadm.setVisibility(View.VISIBLE) ;
					persjuriticac.setVisibility(View.GONE) ;
					durata.setVisibility(View.VISIBLE) ;
					admin2.setChecked(false) ;
				}
			});  
         
         admin2.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					persfizicaadm.setVisibility(View.GONE) ;
					persjuridicaadm.setVisibility(View.VISIBLE) ;
					admin1.setChecked(false) ;
					durata.setVisibility(View.VISIBLE) ;
				}
			});  
         Ds="D-nul " ;
         
         j31.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					
					if(j31.isChecked()) {
						 
			        	Ds="D-nul " ;
			       	 
			          }
			          else {
			        	 
			        	  
			        	  Ds="D-na ";
				}
					  
				
					  
				}
			});
          
         
         
          
       } 
	
	    public void createPDF() {
			Document doc = new Document(PageSize.A4);

			try {
				String path = Environment.getExternalStorageDirectory()
						.getAbsolutePath() + "/Acte/Act_constitutiv/";

				File dir = new File(path);
				if (!dir.exists())
					dir.mkdirs();

				Log.d("PDFCreator", "PDF Path: " + path);
				
				if(Titlu==null){
					Toast.makeText(context, "Documentul nu a fost creat ", duration).show();
				} 
					
				
			else {

				File file = new File(dir, Titlu+".pdf");
				FileOutputStream fOut = new FileOutputStream(file);
				
				PdfWriter.getInstance(doc, fOut);
				}
				// open the document
				doc.open();
				
				 BaseFont baseFont = BaseFont.createFont("/assets/PTN57F.ttf", BaseFont.IDENTITY_H, BaseFont.EMBEDDED);
				 Font paraFont = new Font(baseFont,12,Font.BOLD);
				 
				 Paragraph p1 = new Paragraph("ACT  CONSTITUTIV AL  \n" +
				 		"SOCIET????II "+txtData.getText()+" S.R.L.\n",paraFont);
				 p1.setAlignment(Paragraph.ALIGN_CENTER);
				 doc.add(p1) ;
				 
				 doc.add(Chunk.NEWLINE) ;
				 doc.add(Chunk.NEWLINE) ;
				 doc.add(Chunk.NEWLINE) ;
				 
				 Paragraph p2 = new Paragraph("               ??ntre:",paraFont);
					 p2.setAlignment(Paragraph.ALIGN_LEFT);
				doc.add(p2);
				
				doc.add(Chunk.NEWLINE) ;
				
				
				
				
			     String heightString1 = numarAsoc.getText().toString();
			      heightInt = Integer.parseInt(heightString1);
			     
			  
			    	Font paraFontfor = new Font(baseFont,12);
			    	
			    	RadioGroup radioGroup = (RadioGroup) findViewById(R.id.radioGroup1);
			          
			          
			          int checkedRadioButton = radioGroup.getCheckedRadioButtonId();
			           
			         
			           
			          switch (checkedRadioButton) {
			            case R.id.radio0 : CI="CI " ;
			                             	              break;
			            case R.id.radio1 : CI="BI ";
			          		                      break;
			            case R.id.radio2 :  CI="Pa??aport ";
			          		                      break;
			          }
			    	
			    	if(fasoc1.isChecked()){
			    		
			    		Paragraph asoc1 = new Paragraph("               "+D+p12.getText()+",  cet????ean "+natie+", "+nascut+" la data de "+p22.getText()+", ??n "+p23.getText()+", jud. "+p24.getText()+", " +
			    				dom+" ??n "+p31.getText()+" str. "+p32.getText()+", nr. "+p33.getText()+", bl. "+p41.getText()+", sc. "+p42.getText()+", et. "+p43.getText()+", ap. "+p44.getText()+", jud. "+p51.getText()+", "+posesor+" al "+CI+", " +
			    				"seria "+p61.getText()+" nr. "+p62.getText()+", eliberat de "+p63.getText()+", la data de "+p70.getText()+", CNP "+p71.getText()+" .",paraFontfor) ;
				    	 doc.add(asoc1) ;
			    		
			    	}
			    	
			    	else if(fasoc2.isChecked()){
			    		
			    		Paragraph asoc2 = new Paragraph("                  S.C. "+j11.getText()+", persoan?? juridic?? "+naties+", cu sediul social ??n "+j12.getText()+", " +
			    				"??nregistrat?? la "+j1.getText()+", av??nd urm??toarele date de identificare  "+j21.getText()+", reprezentat?? de "+Ds+"   "+j32.getText()+", " +
			    				"conform Hot??r??rii Adun??rii Generale Extraordinare a "+asac1+" nr. "+j41.getText()+" din data de "+j42.getText()+" . ",paraFontfor) ;
				    	 doc.add(asoc2) ;
				    	 
			    	}
			    	
			    	doc.add(Chunk.NEWLINE) ;
			    	
			    	int f=1 ;
			    	int j=240 ;
			    	
			    	for ( int a=1; a < heightInt; a++) {
			    	    
			    		
			    		
			    		
			    		toggle1[a].findViewById(f);
			    		f++ ;
			    		text1[a].findViewById(f);
			    		f++ ;
			    		toggle2[a].findViewById(f);
			    		f++ ;
			    		text2[a].findViewById(f);
			    		f++ ;
			    		text3[a].findViewById(f);
			    		f++ ;
			    		text4[a].findViewById(f);
			    		f++ ; 
			    		text5[a].findViewById(f);
			    		f++ ;                    
			    		text6[a].findViewById(f);
			    		f++ ;
			    		text7[a].findViewById(f);
			    		f++ ;
			    		text8[a].findViewById(f);
			    		f++ ;
			    		text9[a].findViewById(f);
			    		f++ ;
			    		text10[a].findViewById(f);
			    		f++ ;
			    		text11[a].findViewById(f);
			    		f++ ;
			    		text12[a].findViewById(f);
			    		f++ ;
			    		ci[a].findViewById(f);
			    		f++ ;
			    		bi[a].findViewById(f) ;
			    		f++ ;
			    		pasaport[a].findViewById(f) ;
			    		f++ ;
			    		text13[a].findViewById(f);
			    		f++ ;
			    		text14[a].findViewById(f);
			    		f++ ;
			    		text15[a].findViewById(f);
			    		f++ ;
			    		text16[a].findViewById(f);
			    		f++ ;
			    		text17[a].findViewById(f);
			    		f++ ;
			    		String das="D-nul" ;
			    		String de="n??scut??" ;
			    		String dom="domiciliat" ;
			    		String pos="posesor" ;
			    		
								if(toggle1[a].isChecked()){
								das="D-nul" ;
								de="n??scut" ;
								dom="domiciliat" ;
								pos="posesor" ;
								}else {
									das="D-na" ;
									de="n??scut??" ;
									dom="domiciliat??" ;
									pos="posesoare" ;}
								
								String rs="rom??n" ;
								if(toggle2[a].isChecked()){
								rs="rom??n" ;
									
								}else {
									rs="str??in" ;	}
								
								
								String cia="CI" ;
								
								if(ci[a].isChecked()){
									cia="CI" ;
								}else if(bi[a].isChecked()){
									cia="BI" ;
								}else if(pasaport[a].isChecked()){
									cia="Pa??aport" ;
								}
								
			    		
			    		if(!text1[a].getText().toString().isEmpty()){
			    		
			    		
			    		
			    		doc.add(new Chunk("??i ",paraFontfor ));
			    		doc.add(Chunk.NEWLINE) ;
				    		Paragraph asocd1 = new Paragraph("               "+das+" "+text1[a].getText()+", cet????ean "+rs+", "+de+" la data de "+text2[a].getText()+", ??n "+text3[a].getText()+", jud. "+text4[a].getText()+", " +
				    				dom+" ??n "+text5[a].getText()+" str. "+text6[a].getText()+", nr. "+text7[a].getText()+", bl. "+text8[a].getText()+", sc. "+text9[a].getText()+", et. "+text10[a].getText()+", ap. "+text11[a].getText()+", jud. "+text12[a].getText()+", "+pos+" al "+cia+", seria "+text13[a].getText()+" . " +
				    				"nr. "+text14[a].getText()+", eliberat de "+text15[a].getText()+", la data de "+text16[a].getText()+", CNP  "+text17[a].getText()+" .",paraFontfor) ;
					    	 doc.add(asocd1) ;
				    		
				    	
			    		}
				    
			    	 
			    		text18[a].findViewById(j);
			    		j++ ;
			    		toggl[a].findViewById(j) ;
			    		j++ ;
		    			text19[a].findViewById(j);
		    			j++ ;
		    			text20[a].findViewById(j);
		    			j++ ;
		    			text21[a].findViewById(j);
		    			j++ ;
		    			reprezde1[a].findViewById(j) ;
		    			j++ ;
		    			text22[a].findViewById(j);
		    			j++ ;
		    			text23[a].findViewById(j);
		    			j++ ;
		    			text24[a].findViewById(j);
		    			j++ ;
		    			
		    			String d="rom??n??" ;
		    			
		    			if(toggl[a].isChecked()){
		    				d="rom??n??" ;
		    			}else {
		    				d="str??in??" ;
		    			}
		    			
		    			String n="D-nul" ;
		    			if(reprezde1[a].isChecked()) {
		    				n="D-nul" ;
		    			}else {
		    				n="D-na" ;
		    			}
			    		
		    			String rep="ac??ionarilor" ;
		    			if(toggl1[a].isChecked()){
		    				rep="ac??ionarilor" ;
		    			}else {rep="asocia??ilor" ;}
		    			
			    		if(!text18[a].getText().toString().isEmpty()){
			    			
			    			
			    			
			    			doc.add(new Chunk("??i ",paraFontfor ));
			    			doc.add(Chunk.NEWLINE) ;
			    			Paragraph asocd1 = new Paragraph("                  S.C. "+text18[a].getText()+", persoan?? juridic?? "+d+", cu sediul social ??n "+text19[a].getText()+", ??nregistrat?? " +
			    					"la "+text20[a].getText()+", av??nd urm??toarele date de identificare  "+text21[a].getText()+", reprezentat?? de "+n+" "+text22[a].getText()+", conform Hot??r??rii Adun??rii " +
			    					"Generale Extraordinare a "+rep+" nr. "+text23[a].getText()+"  din data de "+text24[a].getText()+" . ",paraFontfor) ;
					    	 doc.add(asocd1) ;
			    			
			    		}
			    		
			    	}
					 
			    	doc.add(Chunk.NEWLINE) ;
					 
			    	
			      
			      
			    
			    
			    String p5 = new String("               ??n conformitate cu dispozi??iile Legii nr. 31/1990 privind societ????ile comerciale, republicat??, cu " +
						"modific??rile si complet??rile ulterioare, a intervenit prezentul act constitutiv prin care s-a hot??r??t ??nfiin??area " +
						"unei societ????i comerciale cu r??spundere limitat??.");
                 Font paraFont2 = new Font(baseFont,12);				
			     doc.add(new Paragraph(p5,paraFont2));
			     
			     doc.add(Chunk.NEWLINE) ;
			     
			     Paragraph p6 = new Paragraph("CAP. I. FORMA JURIDIC??, DENUMIREA, DURATA,SEDIUL SOCIAL",paraFont);
					 p6.setAlignment(Paragraph.ALIGN_CENTER);
					 doc.add(p6) ; 
					 
					 
			     doc.add(Chunk.NEWLINE) ;
					 
			     doc.add(new Paragraph("Art. 1.1.  Forma juridic??",paraFont));
			     
			     doc.add(Chunk.NEWLINE) ;
			     
			     String p7 = new String("             Societatea este o persoan?? juridic?? rom??n??, constituit?? ??n forma de societate cu r??spundere " +
			     		"limitat??. Societatea ????i desf????oar?? activitatea in conformitate cu legisla??ia ??n vigoare ??i ale prezentului act " +
			     		"constitutiv. Societatea este titular?? de drepturi si obliga??ii ??i r??spunde fa???? de ter??i cu ??ntregul patrimoniu;" +
			     		" asocia??ii r??spund numai ??n limita aportului la capitalul social.");
	                   		doc.add(new Paragraph(p7,paraFont2));
				
				String p8 = new String("              Modificarea formei juridice se realizeaz?? prin hot??r??rea adun??rii generale a asocia??ilor, cu respectarea dispozi??iilor prev??zute de lege.");  				
				doc.add(new Paragraph(p8,paraFont2));
				doc.add(Chunk.NEWLINE) ;
				
				  doc.add(new Paragraph("Art. 1.2. Denumirea",paraFont));
				   
				  doc.add(Chunk.NEWLINE) ;
				     
				  Paragraph p9 = new Paragraph("             Denumirea societ????ii este: "+denumire.getText() +" S.R.L., conform dovezii privind disponibilitatea " +
				  		"firmei nr. "+disp.getText()+", din "+din.getText()+", eliberat?? de Oficiul Registrului Comer??ului de pe l??ng?? Tribunalul "+elibde.getText()+" .",paraFont2);
					 doc.add(p9) ;
				   
				 String p10 = new String("              ??n toate actele - facturi, oferte, comenzi, tarife, prospecte ??i alte documente ??ntrebuin??ate ??n comer??, eman??nd de la societate, trebuie s?? se men??ioneze denumirea, forma juridic??, sediul social, num??rul de ??nregistrare ??n  registrul comer??ului ,codul unic de ??nregistrare ??i capitalul social. Sunt exceptate bonurile fiscale, emise de aparatele de marcat electronice, care vor cuprinde elementele prev??zute de legisla??ia din domeniu.");  				
				doc.add(new Paragraph(p10,paraFont2));
				
				
				String p11=new String("              Dac?? societatea ????i creeaz?? o pagin?? de internet proprie, aceste informa??ii vor fi publicate ??i pe pagina de internet a societ????ii.");
				doc.add(new Paragraph(p11,paraFont2));	
					 

				String p12=new String("              Modificarea denumirii societ????ii se realizeaz?? ??n urma hot??r??rii adun??rii generale a asocia??ilor ??i numai dup?? ce, ??n prealabil, s-a efectuat opera??iunea de verificare a  disponibilit????ii  firmei.");	
				doc.add(new Paragraph(p12,paraFont2));	
				
				doc.add(Chunk.NEWLINE) ;
				
				doc.add(new Paragraph("Art. 1.3. Durata",paraFont));
					
				doc.add(Chunk.NEWLINE) ;
				
				if(f51.isChecked()) {
				doc.add(new Paragraph("Durata de func??ionare a societ????ii este nedeterminat??.",paraFont2));
				}
				else if(f52.isChecked()){
					doc.add(new Paragraph("Durata de func??ionare a societ????ii este pe o perioad?? de "+f61.getText() +". ani, de la data de "+f62.getText()+" p??n?? la data de" +
							f63.getText()+" ??i poate fi prelungit?? ??n condi??iile prev??zute de lege.",paraFont2));
				}
				
                doc.add(Chunk.NEWLINE) ;
				
				doc.add(new Paragraph("Art. 1.4. Sediul social.",paraFont));
					
				doc.add(Chunk.NEWLINE) ;
				
				doc.add(new Paragraph("              Sediul societ????ii este ??n "+f71.getText()+", Str. "+f81.getText()+", nr. "+f82.getText()+", bl. "+f91.getText()+" sc. "+f92.getText()+", et. "+f93.getText()+", ap. "+f94.getText()+", "+jud+" "+f101.getText(),paraFont2));
	
				doc.add(new Paragraph("              Sediul societ????ii poate fi mutat ??n orice loc, prin hot??r??rea adun??rii generale a asocia??ilor, cu respectarea condi??iilor de form?? ??i publicitate prev??zute de lege.",paraFont2));
				
				doc.add(new Paragraph("              Societatea va putea ??nfiin??a sedii secundare - sucursale, agen??ii, reprezentan??e sau alte asemenea unit????i f??r?? personalitate juridic?? - ??i la alte adrese, ??n alte localit????i din Rom??nia ??i alte state, cu respectarea prevederilor legale ??n materie.",paraFont2));
				
				
				Paragraph p13 = new Paragraph("CAP. II. OBIECTUL DE ACTIVITATE AL SOCIET????II",paraFont);
				 p13.setAlignment(Paragraph.ALIGN_CENTER);
				 doc.add(p13) ; 
				 
				 doc.add(Chunk.NEWLINE) ;
				 doc.add(Chunk.NEWLINE) ;
				 Paragraph p14 = new Paragraph();
				 p14.add(new Chunk("Art.2.1. ",paraFont ));
				 p14.add(new Chunk("Obiectul de activitate al societ????ii este:",paraFont2 ));
				 doc.add(p14) ;
				 doc.add(Chunk.NEWLINE) ;
				 doc.add(Chunk.NEWLINE) ;
				 
				 Paragraph p15=new Paragraph("  - Domeniul principal de activitate este "+domeniulprincipal.getText() +", c??ruia ??i corespunde grupa CAEN "+grupacaen.getText(),paraFont2);
				 doc.add(p15) ;
				 
				 Paragraph p16 = new Paragraph();
				 p16.add(new Chunk("  - activitatea ",paraFont2 ));
				 p16.add(new Chunk("principal??: ",paraFont ));
				 p16.add(new Chunk("clasa CAEN "+grupacaen2.getText()+" "+denumirea.getText(),paraFont2 ));
				 doc.add(p16) ;
				 
				 
				 int idpl2=520 ;
				 
				int nr=Integer.parseInt(minus.getText().toString());
				
				if(nr>0){
				
				 for(int r=1;r<=nr ;r++) {
				 
				 plus1[r].findViewById(idpl2) ;
				 idpl2++ ;
				 plus2[r].findViewById(idpl2) ;
				 idpl2++ ;
					 if(r==1){
				 Paragraph p17 = new Paragraph();
				 p17.add(new Chunk("   - activit????i  ",paraFont2 ));
				 p17.add(new Chunk("secundare: ",paraFont ));
				 p17.add(new Chunk("clasa CAEN "+plus1[r].getText()+" "+plus2[r].getText(),paraFont2 ));
				 doc.add(p17) ; }
					 
					 else {
						 Paragraph p17 = new Paragraph();
						
						 p17.add(new Chunk("                                        clasa CAEN "+plus1[r].getText()+" "+plus2[r].getText(),paraFont2 ));
						 doc.add(p17) ;
						 
					 }
				 
				 }
				}
				else {
					
				}
				 doc.add(Chunk.NEWLINE) ;
				 
				 Paragraph p18 = new Paragraph();
				 p18.add(new Chunk("Art. 2.2. ",paraFont ));
				 p18.add(new Chunk("Activitatea societ????ii se va putea desf????ura ??i ??n pie??e, t??rguri ??i oboare etc.",paraFont2));			
				 doc.add(p18) ;
				 
				 Paragraph p19 = new Paragraph();
				 p19.add(new Chunk("Art. 2.3. ",paraFont ));
				 p19.add(new Chunk("??n realizarea obiectului de activitate, societatea va pl??ti taxele ??i impozitele prev??zute de legisla??ia ??n vigoare. Obiectul de activitate " +
				 		"al societ????ii poate fi modificat, prin extinderea sau restr??ngerea sa, conform hot??r??rii adun??rii generale a asocia??ilor.",paraFont2));			
				 doc.add(p19) ;
				 doc.add(Chunk.NEWLINE) ;
				 doc.add(Chunk.NEWLINE) ;
				 
				 Paragraph p20 = new Paragraph("CAP.III. CAPITALUL SOCIAL, P??R??ILE SOCIALE",paraFont);
				 p20.setAlignment(Paragraph.ALIGN_CENTER);
				 doc.add(p20) ;
				 doc.add(Chunk.NEWLINE) ;
				 doc.add(Chunk.NEWLINE) ;
				 
				
				 Paragraph p21 = new Paragraph();
				 p21.add(new Chunk("Art. 3.1. ",paraFont ));
				 p21.add(new Chunk("La constituire, capitalul social subscris ??i v??rsat al societ????ii este de "+capital.getText()+" lei, din care: ",paraFont2));			
				 doc.add(p21) ;
				 doc.add(Chunk.NEWLINE) ;
				 
				 if(v3.isChecked()) {
					 valuta11=" "+valuta2.getText().toString() ;
				 }
				 
				 if(v6.isChecked()) {
					 valuta22=" "+valuta5.getText().toString() ;
				 }
				 
				 if(!lei.getText().toString().isEmpty()){
				 doc.add(new Paragraph("         ??? "+lei.getText()+" lei, aport ??n numerar;",paraFont2));
				 }
				 if(!valuta.getText().toString().isEmpty()){
				 doc.add(new Paragraph("         ??? "+valuta.getText()+" lei, reprezent??nd "+valuta1.getText()+" "+valuta11+", la cursul B.N.R. din data de "+valuta3.getText()+", "+valuta4.getText()+" lei/1 "+valuta22+", aport ??n numerar;",paraFont2));
				 }
				 if(!valuta6.getText().toString().isEmpty()){
				 doc.add(new Paragraph("         ??? "+valuta6.getText()+" lei, reprezent??nd  "+valuta7.getText()+", aport ??n natur??;",paraFont2));
				 }
				 doc.add(Chunk.NEWLINE) ;
				 doc.add(new Paragraph("  fiind ??mp??r??it ??ntr-un num??r de "+valuta8.getText()+" p??r??i sociale, cu o valoare nominal?? de "+valuta9.getText()+" lei/parte social??.",paraFont2));
				 doc.add(Chunk.NEWLINE) ;
	
				 
				 Paragraph c22 = new Paragraph();
				 c22.add(new Chunk("Art. 3.2. ",paraFont ));
				 c22.add(new Chunk("Capitalul social este de??inut de c??tre asocia??i astfel:",paraFont2));			
				 doc.add(c22) ;
				 
				 if(fasoc1.isChecked()){
					 doc.add(Chunk.NEWLINE) ;
					 doc.add(new Paragraph("         1   Nume "+cap1.getText()+" Prenume "+cap2.getText()+", aport la capitalul social "+cap3.getText()+" %, " +
					 		"reprezent??nd un num??r de "+cap4.getText()+" p??r??i sociale, cu o valoare nominal?? de "+cap5.getText()+" lei/parte social?? ??i ??n valoare total?? de "+cap6.getText()+" lei, participare " +
					 		"la profit "+cap7.getText()+" % ??i  participare la pierderi "+cap8.getText()+" %;",paraFont2));
						
				 }
				 else if(fasoc2.isChecked()){
					 doc.add(Chunk.NEWLINE) ;
					 doc.add(new Paragraph("         1 	 S.C. "+cap9.getText()+", aport la capitalul social "+cap10.getText()+" %, reprezent??nd un num??r de "+cap11.getText()+" p??r??i sociale, cu o valoare nominal?? " +
					 		"de "+cap12.getText()+" lei/parte social?? ??i ??n valoare total?? de "+cap13.getText()+" lei, participare la profit "+cap14.getText()+" % ??i  participare la pierderi "+cap15.getText()+" %;",paraFont2));
						
				 }
				
			    	int c=370 ;
			    	
			    	for (int a=1; a < heightInt; a++) {
			    	
			    		
			    		
			    		
			    		
			    		
			    		text25[a].findViewById(c);
			    		c++ ;
			    		text26[a].findViewById(c);
			    		c++ ;
			    		text27[a].findViewById(c);
			    		c++ ;
			    		text28[a].findViewById(c);
			    		c++ ;
			    		text29[a].findViewById(c);
			    		c++ ;
			    		text30[a].findViewById(c);
			    		c++ ;
			    		text31[a].findViewById(c);
			    		c++ ;
			    		text32[a].findViewById(c);
			    		
			    		if(!text1[a].getText().toString().isEmpty()){
			    		
			    		
			    		
			    			doc.add(new Paragraph("         "+(a+1)+"   Nume "+text25[a].getText()+" Prenume "+text26[a].getText()+", aport la capitalul social "+text27[a].getText()+"%, " +
							 		"reprezent??nd un num??r de "+text28[a].getText()+" p??r??i sociale, cu o valoare nominal?? de "+text29[a].getText()+" lei/parte social?? ??i ??n valoare total?? de "+text30[a].getText()+" lei, participare " +
							 		"la profit "+text31[a].getText()+"% ??i  participare la pierderi "+text32[a].getText()+"%;",paraFont2));
								
				    		
				    	
			    		}
				    
			    	 
			    		
		    			
		    			c++ ;
			    		text33[a].findViewById(c);
			    		c++ ;
			    		text34[a].findViewById(c);
			    		c++ ;
			    		text35[a].findViewById(c);
			    		c++ ;
			    		text36[a].findViewById(c);
			    		c++ ;
			    		text37[a].findViewById(c);
			    		c++ ;
			    		text38[a].findViewById(c);
			    		c++ ;
			    		text39[a].findViewById(c);
			    		c++ ;
			    		
			    		if(!text18[a].getText().toString().isEmpty()){
			    			
			    			
			    			
			    			doc.add(new Paragraph("         "+(a+1)+"	 S.C. "+text33[a].getText()+", aport la capitalul social "+text34[a].getText()+"%, reprezent??nd un num??r de "+text35[a].getText()+" p??r??i sociale, cu o valoare nominal?? " +
							 		"de "+text36[a].getText()+" lei/parte social?? ??i ??n valoare total?? de "+text37[a].getText()+" lei, participare la profit "+text38[a].getText()+"% ??i  participare la pierderi "+text39[a].getText()+"%;",paraFont2));
								
			    			
			    		}
			    		
			    	}
				 doc.add(Chunk.NEWLINE) ;
				 
				 
				 Paragraph p22 = new Paragraph();
				 p22.add(new Chunk("Art. 3.3. ",paraFont ));
				 p22.add(new Chunk("Capitalul social poate fi modificat prin hot??r??rea adun??rii generale a asocia??ilor, cu respectarea prevederilor legale.",paraFont2));			
				 doc.add(p22) ;
				 
				 doc.add(new Paragraph("	        Reducerea capitalului social va putea fi f??cut?? numai dup?? trecerea a dou?? luni din ziua ??n care hot??r??rea a fost publicat?? ??n Monitorul Oficial al Rom??niei Partea a IV-a.",paraFont2));
				 
				 doc.add(new Paragraph("	        Orice creditor poate face opozi??ie ??n condi??iile art. 62 din Legea 31/1990 ??? privind societ????ile comerciale, republicat??, cu modific??rile ??i complet??rile ulterioare.",paraFont2));
				 
				 doc.add(new Paragraph("	        Majorarea capitalului social se va face pe baza hot??r??rii adun??rii generale a asocia??ilor prin aport  ??n natur?? sau ??n numerar al asocia??ilor.",paraFont2));
				 
				 doc.add(new Paragraph("	        P??r??ile sociale nou constituite vor fi subscrise ??n totalitatea lor, libere de orice sarcini.",paraFont2));
				 
				 Paragraph p23 = new Paragraph();
				 p23.add(new Chunk("Art. 3.4. ",paraFont ));
				 p23.add(new Chunk("Obliga??iile sociale sunt garantate cu patrimoniul social ??i nu pot fi grevate de datorii sau alte obliga??ii personale ??i sunt indivizibile. Asocia??ii sunt r??spunz??tori p??n?? la concuren??a sumei reprezent??nd p??r??ile sociale pe care le posed??.",paraFont2));			
				 doc.add(p23) ;
				 
				 
				 Paragraph p24 = new Paragraph();
				 p24.add(new Chunk("Art. 3.5. ",paraFont ));
				 p24.add(new Chunk("P??r??ile sociale pot fi transmise ??ntre asocia??i.",paraFont2));			
				 doc.add(p24) ;
				 
				 
				 doc.add(new Paragraph("	        Transmiterea p??r??ilor sociale c??tre persoane din afara societ????ii este permis?? numai dac?? a fost aprobat?? de asocia??i reprezent??nd cel pu??in trei p??trimi din capitalul social.",paraFont2));
				 
				 doc.add(new Paragraph("	        Hot??r??rea adun??rii asocia??ilor, adoptat?? ??n condi??iile alin. (2), se depune ??n termen de 15 zile la oficiul registrului comer??ului, spre a fi men??ionat?? ??n registru ??i publicat?? ??n Monitorul Oficial al Rom??niei, Partea a IV-a.",paraFont2));
				 
				 doc.add(new Paragraph("	        Transmiterea p??r??ilor sociale se ??nregistreaz?? ??n Registrul Comer??ului ??i ??n registrul de asocia??i al societ????ii.",paraFont2));
				 
				 doc.add(new Paragraph("	        Actul de transmitere a p??r??ilor sociale ??i actul constitutiv actualizat cu datele de identificare a noilor asocia??i vor fi depuse la oficiul registrului comer??ului, fiind supuse ??nregistr??rii ??n registrul comer??ului potrivit dispozi??iilor art. 204 alin. (4).din Legea nr. 31/1990 privind societ????ile comerciale, republicat??, cu modific??rile ??i complet??rile ulterioare.",paraFont2));
				 
				 doc.add(new Paragraph("	        Asocia??ii convin de comun acord ca, ??n cazul decesului unuia dintre ei, s?? acorde succesorilor calitatea de asociat. Societatea este obligat?? la plata p??r??ilor sociale c??tre succesor, conform ultimei situa??ii financiare aprobate, ??n cazul ??n care acesta nu dore??te intrarea ??n societate.",paraFont2));
				 
				 
				
				 doc.add(Chunk.NEWLINE) ;
				 
				 Paragraph p25 = new Paragraph("CAP. IV. DREPTURILE ??I OBLIGA??IILE ASOCIA??ILOR",paraFont);
				 p25.setAlignment(Paragraph.ALIGN_CENTER);
				 doc.add(p25) ;
				 
				 doc.add(Chunk.NEWLINE) ;
				 doc.add(Chunk.NEWLINE) ;
				 
				 Paragraph p26 = new Paragraph();
				 p26.add(new Chunk("Art. 4.1. ",paraFont ));
				 p26.add(new Chunk("P??r??ile sociale confer?? posesorilor lor drepturi egale respect??ndu-se pentru fiecare asociat urm??toarele:",paraFont2));			
				 doc.add(p26) ;
				 
				 doc.add(new Paragraph("	        - dreptul la dividende, ??n func??ie de aportul la capitalul social al fiec??rui asociat;",paraFont2));					
				 doc.add(new Paragraph("	        - acordarea unei cote propor??ionale cu activul social rezultat ??n caz de lichidare;",paraFont2));					
				 doc.add(new Paragraph("	        - dreptul de participare la conducerea societ????ii prin exercitarea dreptului la vot ??i controlul  asupra eviden??elor ??i registrelor contabile;",paraFont2));
				 doc.add(new Paragraph("	        - dreptul de  a fi informat asupra activit????ii societ????ii;",paraFont2));					
				 doc.add(new Paragraph("	        - dreptul de  a se retrage din societate;",paraFont2));
					
				 Paragraph p27 = new Paragraph();
				 p27.add(new Chunk("Art. 4.2. ",paraFont ));
				 p27.add(new Chunk("??n virtutea drepturilor conferite asocia??ii se oblig??:",paraFont2));			
				 doc.add(p27) ;
				 
				 doc.add(new Paragraph("	        - s?? se informeze reciproc ??i onest ??n cadrul adun??rilor generale ale asocia??ilor, precum ??i ??n orice alte situa??ii asupra problemelor ce privesc activitatea societ????ii;",paraFont2));					
				 doc.add(new Paragraph("	        - s?? nu ??ntreprind?? ac??iuni care vor putea aduce atingerea intereselor societ????ii, fapt care poate determina excluderea sa prin hot??r??rea adun??rii generale a asocia??ilor;",paraFont2));					
				 doc.add(new Paragraph("	        - s?? decid?? contractarea auditului financiar, atunci c??nd acesta nu are caracter obligatoriu potrivit legii.",paraFont2));
				
				 Paragraph p28 = new Paragraph();
				 p28.add(new Chunk("Art. 4.3. ",paraFont ));
				 p28.add(new Chunk("Participarea la profit ??i pierderi a asocia??ilor se va face propor??ional cu p??r??ile sociale subscrise ??i depuse de fiecare la constituirea capitalului social cu excep??ia pierderilor produse prin fraud?? de oricare dintre p??r??i.",paraFont2));			
				 doc.add(p28) ;
				 
				 
                doc.add(Chunk.NEWLINE) ;
                doc.add(Chunk.NEWLINE) ;
				 
				 Paragraph p29 = new Paragraph("CAP. V. CONDUCEREA SOCIET????II",paraFont);
				 p29.setAlignment(Paragraph.ALIGN_CENTER);
				 doc.add(p29) ;
				 
				 doc.add(Chunk.NEWLINE) ;
				 doc.add(Chunk.NEWLINE) ;
				 
				 
				 Paragraph p30 = new Paragraph();
				 p30.add(new Chunk("Art. 5.1. ",paraFont ));
				 p30.add(new Chunk("Adunarea general?? a asocia??ilor este organul suprem de conducere a societ????ii ??i are urm??toarele atribu??ii principale:",paraFont2));			
				 doc.add(p30) ;
				 
				 doc.add(new Paragraph("	        - s?? aprobe situa??ia financiar?? anual?? ??i s?? stabileasc?? repartizarea profitului net;",paraFont2));
				 doc.add(new Paragraph("	        - s?? desemneze administratorii ??i cenzorii sau dup?? caz, auditorii interni, s??-i revoce ??i s?? le dea desc??rcare de activitatea lor, precum ??i s?? decid?? contractarea auditului financiar, atunci c??nd acesta nu are caracter obligatoriu, potrivit legii;",paraFont2));
				 doc.add(new Paragraph("	        - s?? modifice actul constitutiv.",paraFont2));
				 doc.add(new Paragraph("	        - alte atribu??ii prev??zute de legisla??ia ??n vigoare.",paraFont2));
					
				 doc.add(new Paragraph("Adunarea general?? decide prin votul reprezent??nd majoritatea absolut?? a asocia??ilor ??i a p??r??ilor sociale.Pentru hot??r??rea av??nd " +
				 		"ca obiect modificarea actului constitutiv este necesar votul tuturor  asocia??ilor, ??n afar?? de situa??ia c??nd legea  prevede altfel. Asociatul care " +
				 		"nu este de acord cu modificarea actului constitutiv are dreptul s?? se retrag??.Dac?? adunarea legal constituit?? nu poate lua o hot??r??re valabil?? din " +
				 		"cauza ne??ntrunirii majorit????ii cerute, adunarea convocat?? a doua oar?? poate decide asupra ordinii de zi, oricare ar fi num??rul de asocia??i ??i partea " +
				 		"din capitalul social reprezentat?? de asocia??ii prezen??i. Votul este deschis sau secret.",paraFont2));
				 
				 Paragraph p31 = new Paragraph();
				 p31.add(new Chunk("Art. 5.2. ",paraFont ));
				 p31.add(new Chunk("Asociatul care ??ntr-o opera??iune determinat?? are pe cont propriu sau pe contul altuia interese contrare acelora ale societ????ii, " +
				 		"nu poate lua parte la nicio deliberare sau decizie privind aceast?? opera??iune.Asociatul care contravine dispozi??iilor alin.1 este r??spunz??tor " +
				 		"de daunele cauzate societ????ii.",paraFont2));			
				 doc.add(p31) ;
				 
				 Paragraph p32 = new Paragraph();
				 p32.add(new Chunk("Art. 5.3. ",paraFont ));
				 p32.add(new Chunk("Un asociat nu poate exercita dreptul s??u de vot ??n deliber??rile adun??rilor  asocia??ilor referitoare la aporturile sale ??n natur?? sau la actele juridice ??ncheiate ??ntre el ??i societate.",paraFont2));			
				 doc.add(p32) ;
				 
				 
				    doc.add(Chunk.NEWLINE) ;
	                doc.add(Chunk.NEWLINE) ;
					 
					 Paragraph p33 = new Paragraph("CAP. VI. ADMINISTRAREA SOCIET????II",paraFont);
					 p33.setAlignment(Paragraph.ALIGN_CENTER);
					 doc.add(p33) ;
					 
					 doc.add(Chunk.NEWLINE) ;
					 doc.add(Chunk.NEWLINE) ;
					 
					 String ciadm=" " ;
 					 
					 RadioGroup radioGroupadm = (RadioGroup) findViewById(R.id.radioGroupadm);
			          
			          
			          int checkedRadioButtonadm = radioGroupadm.getCheckedRadioButtonId();
			           
			         
			           
			          switch (checkedRadioButtonadm) {
			            case R.id.radioadm1 : ciadm="C.I. " ;
			                             	              break;
			            case R.id.radioadm2 : ciadm="B.I. ";
			          		                      break;
			            case R.id.radioadm3 :  ciadm="Pa??aport ";
			          		                      break;
			          }
					 
			          String nel=" " ;
			          
                      RadioGroup radioGroupadmd = (RadioGroup) findViewById(R.id.radioGroupadmj);
			          
			          
			          int checkedRadioButtonadmd = radioGroupadmd.getCheckedRadioButtonId();
			           
			         
			           
			          switch (checkedRadioButtonadmd) {
			            case R.id.radioadmj1 : nel="nelimitat?? " ;
			            admj10.setClickable(true) ;
			                             	              break;
			                             	             
			            case R.id.radioadmj2 :   admj10.setClickable(true) ;
			            	nel= "de " + admj10.getText().toString() +" ani";
			          		                      break;
			            
			          }
					 
					 if(admin1.isChecked()){
						 
						 Paragraph adm = new Paragraph();
						 adm.add(new Chunk("Art. 6.1. ",paraFont ));
						 adm.add(new Chunk(" Administrarea societ????ii se face, de c??tre "+Da+" "+adm1.getText()+", cet????ean "+natiea+", "+nascuta+" la data de  "+adm2.getText()+", " +
						 		"??n "+adm3.getText()+", jud. "+adm4.getText()+", "+doma+" ??n "+adm5.getText()+" str. "+adm6.getText()+", nr. "+adm7.getText()+", " +
						 				"bl. "+adm8.getText()+", sc. "+adm9.getText()+", et. "+adm10.getText()+", ap. "+adm11.getText()+", jud. "+adm12.getText()+", "+posesora+" " +
						 		"al "+ciadm+", seria "+adm13.getText()+" nr. "+adm14.getText()+", eliberat de "+adm15.getText()+", la data de "+adm16.getText()+", CNP "+adm17.getText()+", ",paraFont2));			
						 doc.add(adm) ;
						 
					 }
	  			 
					
					 
					 else if (admin2.isChecked()){
						 
						 Paragraph adm = new Paragraph();
						 adm.add(new Chunk("Art. 6.1. ",paraFont ));
						 adm.add(new Chunk(" Administrarea societ????ii se face, de c??tre S.C. "+admj1.getText()+", persoan?? juridic?? "+natieadm+", cu sediul social ??n "+admj2.getText()+", ??nregistrat?? la Oficiul " +
						 		"Registrului Comer??ului de pe l??ng?? Tribunalul "+admj3.getText()+", cu num??r de ordine J"+admj4.getText()+"/"+admj5.getText()+", CUI "+admj6.getText()+", reprezentat?? de " +
						 		Dadm+"  "+admj7.getText()+", conform Hot??r??ri Adun??rii Generale Extraordinare a "+admasac1+" " +
						 		"nr. "+admj8.getText()+" din data de "+admj9.getText()+",",paraFont2));			
						 doc.add(adm) ;
						 
					 }
					 
					 

					 doc.add(new Paragraph("av??nd puteri depline de reprezentare ??i administrare a societ????ii, pe o perioad?? "+nel+"  . (??n cazul ??n care sunt numi??i mai mul??i administratori, se vor men??iona puterile ce li s-au conferit ??i dac?? ei urmeaz?? s?? le exercite ??mpreun?? sau separat).",paraFont2));
					 doc.add(new Paragraph("Potrivit prevederilor art. 2015 din Legea nr. 287/2009 privind Codul civil, republicat??, dac?? p??r??ile nu au prev??zut un termen, contractul de mandat ??nceteaz?? ??n 3 ani de la ??ncheierea lui.",paraFont2));
						
					 
					 
					 Paragraph adm1 = new Paragraph();
					 adm1.add(new Chunk("Art. 6.2. ",paraFont ));
					 adm1.add(new Chunk("Societatea trebuie s?? ??in??, prin grija administratorului, un registru al societ????ii ??n care se vor ??nscrie dup?? caz, numele ??i prenumele asociatului,denumirea, domiciliul sau sediul fiec??rui asociat, partea fiec??ruia din capitalul social, transferul p??r??ilor sociale sau alte modific??ri privitoare la acestea.",paraFont2));			
					 doc.add(adm1) ;
					 
					 doc.add(new Paragraph("Administratorul este r??spunz??tor fa???? de societate pentru:",paraFont2));
					 doc.add(new Paragraph("	        - realitatea v??rs??mintelor efectuate de asocia??i;",paraFont2));
					 doc.add(new Paragraph("            - existen??a real?? a dividendelor pl??tite;",paraFont2));
					 doc.add(new Paragraph("            - existen??a registrelor cerute de lege ??i corecta lor ??inere;",paraFont2));
					 doc.add(new Paragraph("            - exacta ??ndeplinire a hot??r??rilor adun??rii generale;",paraFont2));
					 doc.add(new Paragraph("            - stricta ??ndeplinire a ??ndatoririlor pe care legea ??i actul constitutiv le impun;",paraFont2));
								
					 Paragraph adm2 = new Paragraph();
					 adm2.add(new Chunk("Art. 6.3. ",paraFont ));
					 adm2.add(new Chunk("Administratorul este obligat s?? convoace adunarea asocia??ilor la sediul social, cel pu??in o dat?? pe an sau ori de c??te ori este necesar.",paraFont2));			
					 doc.add(adm2) ;
					 
					 doc.add(new Paragraph("Un asociat sau un num??r de asocia??i ce reprezint?? cel pu??in o p??trime din capitalul social, vor putea cere convocarea adun??rii generale ar??t??nd scopul acestei convoc??ri.",paraFont2));
						
					 
					 Paragraph adm3 = new Paragraph();
					 adm3.add(new Chunk("Art. 6.4. ",paraFont ));
					 adm3.add(new Chunk("Reprezentarea ??i administrarea societ????ii comerciale se realizeaz?? de c??tre administrator ??n limitele competen??ei stabilite prin adunarea general?? a asocia??ilor ??n acord cu dispozi??iile Legii nr. 31/1990 - privind societ????ile comerciale, republicat??, cu modific??rile ??i complet??rile ulterioare.",paraFont2));			
					 doc.add(adm3) ;
					 
					 doc.add(Chunk.NEWLINE) ;
		                doc.add(Chunk.NEWLINE) ;
						 
						 Paragraph t1 = new Paragraph("CAP.VII. ACTIVITATEA SOCIET????II",paraFont);
						 t1.setAlignment(Paragraph.ALIGN_CENTER);
						 doc.add(t1) ;
						 
						 doc.add(Chunk.NEWLINE) ;
						 doc.add(Chunk.NEWLINE) ;
						 
						 
						 Paragraph t2 = new Paragraph();
						 t2.add(new Chunk("Art. 7.1. ",paraFont ));
						 t2.add(new Chunk("Exerci??iul economico - financiar ??ncepe la 1 ianuarie ??i se termin?? la 31 decembrie ale fiec??rui an. Primul exerci??iu va ??ncepe la data constituirii societ????ii.",paraFont2));			
						 doc.add(t2) ;
						 
						 Paragraph t3 = new Paragraph();
						 t3.add(new Chunk("Art. 7.2. ",paraFont ));
						 t3.add(new Chunk("Angajarea personalului societ????ii se face cu respectarea legisla??iei ??n vigoare.",paraFont2));			
						 doc.add(t3) ;
						 
						 Paragraph t4 = new Paragraph();
						 t4.add(new Chunk("Art. 7.3. ",paraFont ));
						 t4.add(new Chunk("Situa??iile financiare vor fi ??ntocmite dup?? normele prev??zute de lege.",paraFont2));			
						 doc.add(t4) ;
						 
						 Paragraph t5 = new Paragraph();
						 t5.add(new Chunk("Art. 7.4. ",paraFont ));
						 t5.add(new Chunk("Profitul net  al societ????ii se stabile??te prin situa??ia financiar?? aprobat?? de asocia??i.",paraFont2));			
						 doc.add(t5) ;
				 
						 doc.add(new Paragraph("	        1. Cota-parte din profit ce se pl??te??te fiec??rui asociat constituie dividend.",paraFont2));
						 doc.add(new Paragraph("	        2. Dividendele se pl??tesc asocia??ilor propor??ional cu cota de participare la capitalul social v??rsat, dac??, " +
						 		"prin actul constitutiv, nu se prevede altfel. Ele se pl??tesc ??n termenul stabilit de c??tre adunarea general?? a asocia??ilor sau, dup?? caz, " +
						 		"prin legile speciale, dar nu mai t??rziu de 6 luni de la data aprob??rii situa??iei  financiare anuale aferente exerci??iului financiar " +
						 		"??ncheiat. ??n caz contrar, societatea comercial?? datoreaz??, dup?? acest termen, dob??nd?? penalizatoare calculat?? conform art. 3 din " +
						 		"Ordonan??a Guvernului nr. 13/2011 privind dob??nda legal?? remuneratorie ??i penalizatoare pentru obliga??ii b??ne??ti, precum ??i pentru " +
						 		"reglementarea unor m??suri financiar-fiscale ??n domeniul bancar, aprobat?? prin Legea nr. 43/2012, dac?? prin hot??r??rea adun??rii generale " +
						 		"a ac??ionarilor care a aprobat situa??ia financiar?? aferent?? exerci??iului financiar ??ncheiat nu s-a stabilit o dob??nd?? mai mare.",paraFont2));
						 doc.add(new Paragraph("	        3. Dividendele pl??tite contrar dispozi??iilor prev??zute de lege se restituie, dac?? societatea dovede??te c?? asocia??ii au cunoscut neregularitatea distribuirii sau, ??n ??mprejur??rile existente, trebuiau s?? o cunoasc??.",paraFont2));
						 doc.add(new Paragraph("	        4.  Dreptul la ac??iunea de restituire a dividendelor pl??tite contrar dispozi??iilor anterioare, se prescrie ??n termen de 3 ani de la data distribuirii lor.",paraFont2));
						 doc.add(new Paragraph("	        5.  Dividendele care se cuvin dup?? data transmiterii ac??iunilor apar??in cesionarului, ??n afar?? de cazul ??n care p??r??ile au convenit altfel.",paraFont2));
						 doc.add(new Paragraph("	Beneficiul cuvenit asocia??ilor se ??mparte ??ntre ace??tia ??n cote propor??ionale cu participarea la capitalul social, dac?? asocia??ii nu hot??r??sc altfel.",paraFont2));
								
						 
						 doc.add(Chunk.NEWLINE) ;
			                doc.add(Chunk.NEWLINE) ;
							 
							 Paragraph t6 = new Paragraph("CAP. VIII. CONTROLUL ACTIVIT????II SOCIET????II",paraFont);
							 t6.setAlignment(Paragraph.ALIGN_CENTER);
							 doc.add(t6) ;
							 
							 doc.add(Chunk.NEWLINE) ;
							 doc.add(Chunk.NEWLINE) ;
							 
							 Paragraph s1 = new Paragraph();
							 s1.add(new Chunk("Art. 8.1. ",paraFont ));
							 s1.add(new Chunk("Controlul activit????ii societ????ii  ??l exercit?? asocia??ii sau cenzorii, c??nd sunt numi??i de asocia??i sau, dup?? caz, de c??tre auditorii financiari.",paraFont2));			
							 doc.add(s1) ;
							 
							 doc.add(new Paragraph("	        Ace??tia vor supraveghea gestiunea societ????ii, vor verifica dac?? situa??ia financiar??, contul de profit ??i pierderi este legal ??ntocmit ??i ??n concordan???? cu registrele, dac?? acestea din urm?? sunt regulat ??inute ??i dac?? evaluarea patrimoniului s-a f??cut conform regulilor stabilite pentru ??ntocmirea situa??iei financiare.",paraFont2));
								
							 String ant=" ";
							 Paragraph s3 = new Paragraph();
							 if(asociatii.isChecked()){
							 
							
							 s3.add(new Chunk("Art. 8.2. ",paraFont ));
							 s3.add(new Chunk("Societatea va ??ine contabilitatea opera??iunilor ??n mod regulat ??i va ??ntocmi la sf??r??itul fiec??rui exerci??iu financiar documentele prev??zute ??n legisla??ia financiar?? contabil?? ??n vigoare.",paraFont2));			
							
							 }
							 else   
								 if(cenzorr.isChecked()){
								 Paragraph s2 = new Paragraph();
								 s2.add(new Chunk("Art. 8.2. ",paraFont ));
								 s2.add(new Chunk("La data prezentului act constitutiv este numit cenzor: ",paraFont2));			
								 doc.add(s2) ;
								 
								 doc.add(Chunk.NEWLINE) ;
								 
								 s3.add(new Chunk("Art. 8.3. ",paraFont ));
								 s3.add(new Chunk("Societatea va ??ine contabilitatea opera??iunilor ??n mod regulat ??i va ??ntocmi la sf??r??itul fiec??rui exerci??iu financiar documentele prev??zute ??n legisla??ia financiar?? contabil?? ??n vigoare.",paraFont2));			
								 ant="f??r?? antecedente penale ";
								 
							 }else  
								 if(auditorr.isChecked()){
								 Paragraph s2 = new Paragraph();
								 s2.add(new Chunk("Art. 8.2. ",paraFont ));
								 s2.add(new Chunk("La data prezentului act constitutiv este numit auditor: ",paraFont2));			
								 doc.add(s2) ;
								 
								 doc.add(Chunk.NEWLINE) ;
								
								 s3.add(new Chunk("Art. 8.3. ",paraFont ));
								 s3.add(new Chunk("Societatea va ??ine contabilitatea opera??iunilor ??n mod regulat ??i va ??ntocmi la sf??r??itul fiec??rui exerci??iu financiar documentele prev??zute ??n legisla??ia financiar?? contabil?? ??n vigoare.",paraFont2));			
								
								 ant=" ";
							 }
							 
							 String ci=" " ;
							
							 RadioGroup radioGroup2 = (RadioGroup) findViewById(R.id.radioGroupc1);
					          
					          
					          int checkedRadioButton2 = radioGroup2.getCheckedRadioButtonId();
					           
					         
					           
					          switch (checkedRadioButton2) {
					            case R.id.radioc11 : ci="jude?? " ;
					                             	              break;
					            case R.id.radioc12 : ci="sector ";
					          		                      break;
					           
					          }
					          
					          String bi=" " ;
							
                             RadioGroup radioGroup3 = (RadioGroup) findViewById(R.id.radioGroupc2);
					          
					          
					          int checkedRadioButton3 = radioGroup3.getCheckedRadioButtonId();
					           
					         
					           
					          switch (checkedRadioButton3) {
					            case R.id.radioc21 : bi="C.I. " ;
					                             	              break;
					            case R.id.radioc22 : bi="B.I. ";
					          		                      break;
					          		                      
					          		                      
					           
					          }
					          
					          String jj=" " ;
                             RadioGroup radioGroup4 = (RadioGroup) findViewById(R.id.radioGroupc3);
					          
					          
					          int checkedRadioButton4 = radioGroup4.getCheckedRadioButtonId();
					           
					         
					           
					          switch (checkedRadioButton4) {
					            case R.id.radioc31 : jj="Jude?? " ;
					                             	              break;
					            case R.id.radioc32 : jj="Sector ";
					          		                      break;
					          		                      
					          		                      
					           
					          }
							
							 
							 
							  if(pf.isChecked()){
								 
								  doc.add(new Paragraph("	        "+Dc+" "+c2.getText()+", cet????ean rom??n, domiciliat "+c6.getText()+", Str. " +
								  		c7.getText()+", nr. "+c8.getText()+" bl. "+c9.getText()+", sc "+c10.getText()+" et. "+c11.getText()+", ap. "+c12.getText()+", "+ci+" "+c13.getText()+", identificat cu " +
								  		bi+" Seria "+c14.getText()+" nr. "+c15.getText()+", eliberat?? la data de "+c16.getText()+" de c??tre "+c17.getText()+", " +
								  		"CNP: "+c19.getText()+ant+", "+nascutc+" la data de "+c3.getText()+" ??n "+c4.getText()+", Jud. "+c5.getText()+", " +
								  		"p??n?? la data de "+c18.getText(),paraFont2));
									
								  
							 }
							 else if(pj.isChecked()){
								

								 Paragraph s4 = new Paragraph();
								 s4.add(new Chunk("S.C. "+cj1.getText()+" S.R.L.  ",paraFont ));
								 s4.add(new Chunk(", persoan?? juridic?? cu sediul ??n "+cj.getText()+", str. "+cj2.getText()+" nr. "+cj3.getText()+", " +
								 		"bl. "+cj4.getText()+", sc. "+cj5.getText()+", et. "+cj6.getText()+" ap. "+cj7.getText()+", "+jj+"  "+cs.getText()+", ??nmatriculat?? la Registrul Comer??ului" +
								 		" "+cj8.getText()+" cu ",paraFont2));
								 s4.add(new Chunk("J/"+cj9.getText()+"/"+cj10.getText()+"/"+cj11.getText()+"  ",paraFont ));	
								 s4.add(new Chunk(", av??nd CUI: "+cj12.getText()+", reprezentat?? de "+Dj+"   " +
								 		cj14.getText()+", p??n?? la data de "+cj15.getText()+", expert contabil autorizat.",paraFont2));			
								
								 doc.add(s4) ;
								 
							 }
							  doc.add(Chunk.NEWLINE) ;
							  
							  doc.add(s3) ;
							 
							 doc.add(Chunk.NEWLINE) ;
				                doc.add(Chunk.NEWLINE) ;
								 
				                
								 Paragraph t7 = new Paragraph("CAP. IX. EXCLUDEREA ??I RETRAGEREA ASOCIA??ILOR",paraFont);
								 t7.setAlignment(Paragraph.ALIGN_CENTER);
								 doc.add(t7) ;
								 
								 doc.add(Chunk.NEWLINE) ;
								 doc.add(Chunk.NEWLINE) ;
						 
								 
								 Paragraph t8 = new Paragraph();
								 t8.add(new Chunk("Art. 9.1. ",paraFont ));
								 t8.add(new Chunk("Poate fi exclus din societate:",paraFont2));			
								 doc.add(t8) ;
								 
								 doc.add(new Paragraph("	        -  asociatul care pus ??n ??nt??rziere, nu aduce aportul la care s-a obligat;",paraFont2));
								 doc.add(new Paragraph("	        - asociatul-administrator care comite fraud?? ??n dauna societ????ii sau se serve??te de semn??tura social?? sau de capitalul social ??n folosul s??u sau al altora.",paraFont2));
										
								 Paragraph t9 = new Paragraph();
								 t9.add(new Chunk("Art. 9.2. ",paraFont ));
								 t9.add(new Chunk("Excluderea se pronun???? prin hot??r??re judec??toreasc?? la cererea societ????ii sau a oric??rui asociat. Asociatul exclus r??m??ne obligat fa???? de ter??i pentru opera??iile f??cute de societate p??n?? ??n ziua r??m??nerii definitive ??i irevocabile a hot??r??rii de excludere, hot??r??re ce va dispune ??i structura participan??ilor la capitalul social a celorlal??i asocia??i.",paraFont2));			
								 doc.add(t9) ;
								 
								 Paragraph t10 = new Paragraph();
								 t10.add(new Chunk("Art. 9.3. ",paraFont ));
								 t10.add(new Chunk("Retragerea din societate se va face:",paraFont2));			
								 doc.add(t10) ;
								 
								 doc.add(new Paragraph("	        - cu acordul tuturor celorlal??i asocia??i;",paraFont2));
								 doc.add(new Paragraph("	        - ??n situa??iile prev??zute la art. 5.1. alin.3, conform actului constitutiv;",paraFont2));
								 doc.add(new Paragraph("	        - c??nd nu se realizeaz?? acordul unanim, asociatul se poate retrage pentru motive temeinice, ??n baza unei hot??r??ri a tribunalului, supuse numai recursului, ??n termen de 15 zile de la comunicare.",paraFont2));

								 Paragraph t11 = new Paragraph();
								 t11.add(new Chunk("Art. 9.4. ",paraFont ));
								 t11.add(new Chunk("Hot??r??rea irevocabil?? de excludere sau retragere se va depune ??n 15 zile la Registrul Comer??ului pentru a fi ??nscris??, iar dispozitivul hot??r??rii de excludere se va publica la cererea societ????ii ??n Monitorul Oficial.",paraFont2));			
								 doc.add(t11) ;
								 
								 
								 doc.add(Chunk.NEWLINE) ;
					                doc.add(Chunk.NEWLINE) ;
									 
					                
									 Paragraph t12 = new Paragraph("CAP. X.  DIZOLVAREA SOCIET????II ??I LICHIDAREA SOCIET????II.",paraFont);
									 t12.setAlignment(Paragraph.ALIGN_CENTER);
									 doc.add(t12) ;
									 
									 doc.add(Chunk.NEWLINE) ;
									 doc.add(Chunk.NEWLINE) ;
									 
									 Paragraph t13 = new Paragraph();
									 t13.add(new Chunk("Art. 10.1. ",paraFont ));
									 t13.add(new Chunk("Au ca efect dizolvarea societ????ii ??i dau dreptul fiec??rui asociat s?? cear?? lichidarea acestuia:",paraFont2));			
									 doc.add(t13) ;
								 
									 doc.add(new Paragraph("	        - trecerea timpului stabilit pentru durata societ????ii; asocia??ii trebuie s?? fie consulta??i de administratori cu cel pu??in trei luni ??nainte de expirarea duratei societ????ii, cu privire la eventuala prelungire a acesteia. ??n lips??, la cererea oric??ruia dintre asocia??i, tribunalul va putea dispune, prin ??ncheiere, efectuarea consult??rii, conform  art.119 alin. (3) din Legea nr. 31/1990  privind societ????ile comerciale, republicat??, cu modific??rile ??i complet??rile ulterioare.",paraFont2));
									 doc.add(new Paragraph("	        - imposibilitatea realiz??rii obiectului societ????ii sau realizarea acestuia;",paraFont2));
									 doc.add(new Paragraph("	        - declararea nulit????ii societ????ii;",paraFont2));
									 doc.add(new Paragraph("	        - hot??r??rea adun??rii generale;",paraFont2));
									 doc.add(new Paragraph("	        - hot??r??rea tribunalului, la cererea oric??rui asociat, pentru motive temeinice; precum ??i ne??n??elegerile grave dintre asocia??i, care ??mpiedic?? func??ionarea societ????ii;",paraFont2));
									 doc.add(new Paragraph("	        - falimentul;",paraFont2));
									 doc.add(new Paragraph("	        - alte cauze prev??zute de lege sau de modific??rile prezentului act constitutiv;",paraFont2));
										
									 Paragraph t14 = new Paragraph();
									 t14.add(new Chunk("Art. 10.2. ",paraFont ));
									 t14.add(new Chunk("C??nd datorit?? decesului unui asociat, num??rul minim de asocia??i va fi sub cel prev??zut de lege, societatea ????i va continua activitatea cu mo??tenitorii defunctului.",paraFont2));			
									 doc.add(t14) ;
									 
									
										
									 Paragraph t15 = new Paragraph();
									 t15.add(new Chunk("Art. 10.3. ",paraFont ));
									 t15.add(new Chunk("Dizolvarea societ????ii ??nainte de expirarea termenului fixat pentru durata sa are efect fa???? de ter??i numai dup?? trecerea de 30 zile de la publicarea ??n Monitorul Oficial al Rom??niei Partea a IV-a .",paraFont2));			
									 doc.add(t15) ;
									 
									 doc.add(new Paragraph("	        Dizolvarea societ????ii are ca efect deschiderea procedurii lichid??rii .",paraFont2));
										
									 Paragraph t16 = new Paragraph();
									 t16.add(new Chunk("Art. 10.4. ",paraFont ));
									 t16.add(new Chunk("Din momentul dizolv??rii, administratorul nu mai poate ??ntreprinde noi opera??iuni, ??n caz contrar va fi personal ??i solidar r??spunz??tor pentru opera??iunile pe care le-a ??ntreprins.",paraFont2));			
									 doc.add(t16) ;
									 
									 doc.add(new Paragraph("	        Interdic??ia prev??zut?? la alin.1 se aplic?? din ziua expir??rii termenului fixat pentru durata societ????ii (??n cazul ??n care durata de func??ionare a societ????ii este limitat??) ori de la data la care dizolvarea a fost hot??r??t?? de adunarea general?? sau declarat?? prin sentin???? judec??toreasc??.",paraFont2));
										
									 Paragraph t17 = new Paragraph();
									 t17.add(new Chunk("Art. 10.5. ",paraFont ));
									 t17.add(new Chunk("Pentru lichidarea ??i repartizarea patrimoniului social, sunt obligatorii urm??toarele reguli:",paraFont2));			
									 doc.add(t17) ;
									 
									 doc.add(new Paragraph("	        - p??n?? la preluarea func??iei de c??tre lichidatori, administratorii continu?? s??-??i exercite atribu??iile, cu excep??ia celor prev??zute la art. 233 din Legea nr. 31/1990, privind societ????ile comerciale, republicat??, cu modific??rile ??i complet??rile ulterioare.",paraFont2));
									 doc.add(new Paragraph("	        - actul de numire a lichidatorilor, men??ion??nd puterile conferite acestora sau sentin??a care ??i ??ine locul, precum ??i orice act ulterior care ar aduce schimb??ri cu privire la persoana lor sau la puterile conferite trebuie depuse, prin grija lichidatorilor, la oficiul registrului comer??ului, pentru a fi ??nscrise de ??ndat?? ??i publicate ??n Monitorul Oficial al Rom??niei, Partea a IV-a.",paraFont2));
									 doc.add(new Paragraph("	        Asocia??ii pot hot??r??, cu cvorumul ??i majoritatea prev??zute pentru modificarea actului constitutiv, ??i modul de lichidare a societ????ii, atunci c??nd sunt de acord cu privire la repartizarea ??i lichidarea patrimoniului societ????ii ??i c??nd asigur?? stingerea pasivului sau regularizarea lui ??n acord cu creditorii.",paraFont2));
									 doc.add(new Paragraph("	        Prin votul unanim al asocia??ilor se poate hot??r?? ??i asupra modului ??n care activele r??mase dup?? plata creditorilor vor fi ??mp??r??ite ??ntre asocia??i. ??n lipsa acordului unanim privind ??mp??r??irea bunurilor, va fi urmat?? procedura lichid??rii, prev??zut?? de prezenta lege.",paraFont2));
									 doc.add(new Paragraph("	        Transmiterea dreptului de proprietate asupra bunurilor r??mase dup?? plata creditorilor are loc la data radierii societ????ii din registrul comer??ului. Registrul va elibera fiec??rui asociat un certificat constatator al dreptului de proprietate asupra activelor distribuite, ??n baza c??ruia asociatul poate proceda la ??nscrierea bunurilor imobile ??n cartea funciar??.",paraFont2));
									
									 Paragraph t18 = new Paragraph();
									 t18.add(new Chunk("Art. 10.6. ",paraFont ));
									 t18.add(new Chunk("Lichidatorii vor putea fi persoane fizice sau juridice. Lichidatorii persoane fizice sau reprezentan??ii permanen??i - persoane fizice ale societ????ii lichidatoare - trebuie s?? fie  lichidatori autoriza??i, ??n condi??iile legii.",paraFont2));			
									 doc.add(t18) ;
									 
									 doc.add(new Paragraph("	        Toate actele eman??nd de la societate trebuie s?? arate ca aceasta este ??n lichidare.",paraFont2));
									
									 Paragraph t19 = new Paragraph();
									 t19.add(new Chunk("Art. 10.7. ",paraFont ));
									 t19.add(new Chunk("Lichidatorii au obliga??ia, ??ndat?? dup?? intrarea ??n func??ie, ca ??mpreun?? cu administratorul societ????ii s?? fac?? un inventar ??i s?? ??ncheie situa??ia financiar??, care s?? constate situa??ia exact?? a activului ??i pasivului societ????ii ??i s?? le semneze.",paraFont2));			
									 doc.add(t19) ;
									 
									 doc.add(new Paragraph("	        Lichidatorii sunt obliga??i s?? primeasc?? ??i s?? p??streze,  patrimoniul societ????ii, registrele ce li s-au ??ncredin??at de c??tre administratori ??i actele societ????ii. De asemenea, ei vor ??ine un registru cu toate opera??iunile lichid??rii, ??n ordinea datei lor.",paraFont2));
									
									 
									 Paragraph t22 = new Paragraph();
									 t22.add(new Chunk("Art. 10.8. ",paraFont ));
									 t22.add(new Chunk("Lichidatorii vor putea:",paraFont2));			
									 doc.add(t22) ;
									 
									 doc.add(new Paragraph("	        - s?? stea ??n judecat?? ??i s?? fie ac??iona??i ??n interesul lichid??rii;",paraFont2));
									 doc.add(new Paragraph("	        - s?? execute ??i s?? termine opera??iunile de comer?? referitoare la lichidare;",paraFont2));
									 doc.add(new Paragraph("	        - s?? v??nd?? prin licita??ie public??, imobilele ??i orice avere mobiliar?? a societ????ii; v??nzarea bunurilor nu se va putea face ??n bloc;",paraFont2));
									 doc.add(new Paragraph("	        - s?? fac?? tranzac??ii;",paraFont2));
									 doc.add(new Paragraph("	        - s?? lichideze ??i s?? ??ncaseze crean??ele societ????ii, chiar ??i ??n caz de faliment al debitorilor, d??nd chitan????.",paraFont2));
									 doc.add(new Paragraph("	        - s?? contracteze obliga??ii cambiale, s?? fac?? ??mprumuturi neipotecare ??i s?? ??ndeplineasc?? orice acte necesare.",paraFont2));
									 doc.add(new Paragraph("	      ??n lipsa unor dispozi??ii speciale ??n actul constitutiv sau ??n actul lor de numire, lichidatorii nu pot s?? constituie ipoteci asupra bunurilor societ????ii, dac?? nu sunt autoriza??i de instan????.",paraFont2));
									 doc.add(new Paragraph("	    Lichidatorii ce ??ntreprind noi opera??iuni comerciale, ce nu sunt necesare scopului lichid??rii, sunt r??spunz??tori personal ??i solidari de executarea lor.",paraFont2));
	
									 Paragraph t21 = new Paragraph();
									 t21.add(new Chunk("Art. 10.9. ",paraFont ));
									 t21.add(new Chunk("Lichidatorii nu pot pl??ti asocia??ilor nicio sum?? ??n contul p??r??ilor ce li s-ar cuveni din lichidare ??naintea achit??rii creditelor societ????ii. ??mpotriva deciziilor lichidatorilor, creditorii societ????ii pot face opozi??ie.",paraFont2));			
									 doc.add(t21) ;
									 
									 Paragraph t23 = new Paragraph();
									 t23.add(new Chunk("Art. 10.10. ",paraFont ));
									 t23.add(new Chunk("Lichidatorii ce au achitat datoriile societ????ii cu proprii lor bani nu vor putea s?? execute ??mpotriva societ????ii drepturi mai mari dec??t acelea ce apar??ineau creditorilor pl??ti??i.",paraFont2));			
									 doc.add(t23) ;
									 
									 Paragraph t24 = new Paragraph();
									 t24.add(new Chunk("Art. 10.11. ",paraFont ));
									 t24.add(new Chunk("Creditorii societ????ii au dreptul de a exercita contra lichidatorilor ac??iunile ce decurg din crean??ele la termen, p??n?? la concuren??a bunurilor existente, ??n patrimoniul societ????ii ??i numai dup?? aceea, de a se ??ndrepta ??mpotriva asocia??ilor pentru plata sumelor datorate, din valoarea aporturilor la capitalul societ????ii.",paraFont2));			
									 doc.add(t24) ;
									 
									 Paragraph t25 = new Paragraph();
									 t25.add(new Chunk("Art. 10.12. ",paraFont ));
									 t25.add(new Chunk("Lichidarea societ????ii trebuie terminat?? ??n cel mult un an de la data dizolv??rii. Pentru motive temeinice, tribunalul poate prelungi acest termen cu perioade de c??te 6 luni, dar nu cu mai mult de 24 de luni cumulat.",paraFont2));			
									 doc.add(t25) ;
									 
									 
									 Paragraph t26 = new Paragraph();
									 t26.add(new Chunk("Art. 10.13. ",paraFont ));
									 t26.add(new Chunk("Dup?? terminarea lichid??rii societ????ii, lichidatorii trebuie s?? ??ntocmeasc?? situa??ia financiar?? ??i s?? propun?? repartizarea activului ??ntre asocia??i.",paraFont2));			
									 doc.add(t26) ;
									 
									 doc.add(new Paragraph("	        Asociatul nemul??umit poate face opozi??ie ??n condi??iile art. 62 din Legea nr. 31/ 1990, republicat??, cu modific??rile ??i complet??rile ulterioare, ??n termen de 15 zile de la notificarea situa??iei financiare de lichidare ??i a proiectului de repartizare.",paraFont2));
									 doc.add(new Paragraph("	        Pentru solu??ionarea opozi??iei, problemele referitoare la lichidare vor fi separate de acele ale repartiz??rii, fa???? de care lichidatorii pot r??m??ne str??ini.",paraFont2));
										
									 
									 Paragraph t27 = new Paragraph();
									 t27.add(new Chunk("Art. 10.14. ",paraFont ));
									 t27.add(new Chunk("??n termen de 15 zile de la terminarea lichid??rii, lichidatorii trebuie s?? cear?? radierea societ????ii din Registrul Comer??ului. Radierea se poate face ??i din oficiu, ??n cazurile prev??zute de lege.",paraFont2));			
									 doc.add(t27) ;
									 
									 doc.add(new Paragraph("	        Situa??ia financiar?? semnat?? de c??tre lichidatori se ??nainteaz?? spre a fi ??nregistrat?? ??i publicat?? pe pagina de Internet a oficiului registrului comer??ului.",paraFont2));
									 doc.add(new Paragraph("	        Lichidarea nu elibereaz?? asocia??ii ??i nu ??mpiedic?? declararea ??n stare de faliment a societ????ii.",paraFont2));
										
									 Paragraph t28 = new Paragraph();
									 t28.add(new Chunk("Art. 10.15. ",paraFont ));
									 t28.add(new Chunk("Dup?? aprobarea socotelilor ??i terminarea reparti??iei, registrele ??i actele societ????ii ce nu vor fi necesare vreunuia dintre asocia??i, se vor depune la asociatul desemnat de majoritate.",paraFont2));			
									 doc.add(t28) ;
									 
									 doc.add(new Paragraph("	        Registrele societ????ii vor fi p??strate timp de 5 ani.",paraFont2));
								
									 
									 doc.add(Chunk.NEWLINE) ;
						                doc.add(Chunk.NEWLINE) ;
										 
						                
										 Paragraph t30 = new Paragraph("CAP. XI. LITIGII",paraFont);
										 t30.setAlignment(Paragraph.ALIGN_CENTER);
										 doc.add(t30) ;
										 
										 doc.add(Chunk.NEWLINE) ;
										 doc.add(Chunk.NEWLINE) ;
									 
										 
										 Paragraph t31 = new Paragraph();
										 t31.add(new Chunk("Art. 11.1. ",paraFont ));
										 t31.add(new Chunk("Litigiile societ????ii cu persoane fizice sau juridice sunt de competen??a instan??elor judec??tore??ti.",paraFont2));			
										 doc.add(t31) ;
										 
										 Paragraph t32 = new Paragraph();
										 t32.add(new Chunk("Art. 11.2. ",paraFont ));
										 t32.add(new Chunk("Litigiile societ????ii n??scute din contractele economice ??ncheiate cu persoane fizice sau juridice precum ??i litigiile patrimoniale dintre asocia??i ??i societate vor fi solu??ionate de instan??ele competente prin aplicarea dreptului material rom??n.",paraFont2));			
										 doc.add(t32) ;
									 
										 Paragraph t33 = new Paragraph();
										 t33.add(new Chunk("Art. 11.3. ",paraFont ));
										 t33.add(new Chunk("Litigiile personalului angajat de societate se rezolv?? potrivit legisla??iei muncii ??n vigoare ??n Rom??nia.",paraFont2));			
										 doc.add(t33) ;
										 
										 
										 doc.add(Chunk.NEWLINE) ;
							                doc.add(Chunk.NEWLINE) ;
											 
							                
											 Paragraph t40 = new Paragraph("CAP.XII. DISPOZI??II FINALE",paraFont);
											 t40.setAlignment(Paragraph.ALIGN_CENTER);
											 doc.add(t40) ;
											 
											 doc.add(Chunk.NEWLINE) ;
											 doc.add(Chunk.NEWLINE) ;
											 
											 
											 Paragraph t41 = new Paragraph();
											 t41.add(new Chunk("Art. 12.1. ",paraFont ));
											 t41.add(new Chunk("Prezentul act  constitutiv intr?? ??n vigoare de la data semn??rii lui de c??tre asocia??i.",paraFont2));			
											 doc.add(t41) ;
											 
											 
											 Paragraph t42 = new Paragraph();
											 t42.add(new Chunk("Art. 12.2. ",paraFont ));
											 t42.add(new Chunk("Prevederile actului constitutiv se completeaz?? cu normele Codului Civil, Codului Muncii, Legii nr. 31/1990, republicat??, cu modific??rile ??i complet??rile ulterioare, ??i ale legisla??iei civile ??n vigoare.",paraFont2));			
											 doc.add(t42) ;
											 
											 doc.add(Chunk.NEWLINE) ;
											 
											 
										 
											
											 
											 Paragraph data = new Paragraph();
											 data.add(new Chunk("Data ",paraFont2 ));
											 data.setAlignment(Paragraph.ALIGN_LEFT) ;
											 doc.add(data) ;
											 Paragraph data1 = new Paragraph();
											 data1.add(new Chunk("Semn??tur?? asociat ",paraFont2));	
											 data1.setAlignment(Paragraph.ALIGN_RIGHT) ;
											 doc.add(data1) ;
											 doc.add(Chunk.NEWLINE) ;
											 
											 for(int a=1;a< heightInt;a++ ){
												 
												 Paragraph data2 = new Paragraph();
												 data2.add(new Chunk("Semn??tur?? asociat ",paraFont2));	
												 data2.setAlignment(Paragraph.ALIGN_RIGHT) ;
												 doc.add(data2) ;
												 doc.add(Chunk.NEWLINE) ;
											 }
											 
										 
			} catch (DocumentException de) {
				Log.e("PDFCreator", "DocumentException:" + de);
			} catch (IOException e) {
				Log.e("PDFCreator", "ioException:" + e);
			} finally {
				doc.close();
				
				 
				
			}
			
		     	
			
			
	    }



	}
	    
	