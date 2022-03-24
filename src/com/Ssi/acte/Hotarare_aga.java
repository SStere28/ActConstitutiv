	package com.Ssi.acte;

	import java.io.ByteArrayOutputStream;
import android.content.Context;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.lang.Character.UnicodeBlock;
import java.nio.charset.Charset;
import java.util.concurrent.Future;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.Paint.Align;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.renderscript.Element;
import android.text.Editable;
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
import android.widget.TableRow;
import android.widget.TextView;
import android.widget.Toast;

import java.io.FileOutputStream;
import java.io.IOException;


import com.lowagie.text.Chunk;
import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.Font;
import com.lowagie.text.HeaderFooter;
import com.lowagie.text.Image;
import com.lowagie.text.Paragraph;
import com.lowagie.text.Phrase;
import com.lowagie.text.pdf.BaseFont;
import com.lowagie.text.pdf.PdfWriter;
	public class Hotarare_aga extends Activity {

		
		
		private Button button1,button2;
		private EditText txtData,text3,text4,txtData2,text5,text6,text7,text8,text9,text10,text11,text12,text13,text14,text15,text16,id,data,capital,id2;
		String Titlu=null ;
		int duration = Toast.LENGTH_SHORT;
		final Context context = this;
		int j=1;
		int i=0;
		 int  kkk=1 ;
		 int iid=30 ;
		 private EditText nume[]=new EditText[20] ;
		 private EditText aport[]=new EditText[20] ;
		 private EditText hott[]=new EditText[20] ;
	    protected void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.hotarare_aga);
	        
	        data = (EditText) findViewById(R.id.data);
	        capital = (EditText) findViewById(R.id.capital);
	        id = (EditText) findViewById(R.id.id);
	        id2 = (EditText) findViewById(R.id.id2);
	        txtData2 = (EditText) findViewById(R.id.editText2);
	       txtData = (EditText) findViewById(R.id.editText1);
	       text3 = (EditText) findViewById(R.id.editText3);
	       text4 = (EditText) findViewById(R.id.editText4);
	       text5 = (EditText) findViewById(R.id.text5);
	       text6 = (EditText) findViewById(R.id.text6);
	       text7 = (EditText) findViewById(R.id.text7);
	       text8 = (EditText) findViewById(R.id.text8);
	       text9 = (EditText) findViewById(R.id.text9);
	       text10 = (EditText) findViewById(R.id.text10);
	       text11 = (EditText) findViewById(R.id.text11);
	       text12 = (EditText) findViewById(R.id.text12);
	       text13 = (EditText) findViewById(R.id.text13);
	       text14 = (EditText) findViewById(R.id.text14);
	       text15 = (EditText) findViewById(R.id.text15);
	       text16 = (EditText) findViewById(R.id.text16);
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
							.getAbsolutePath()+"/Acte/Hotarare_aga/"+Titlu+".pdf";
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
		mTitleTextView.setText("Hotarare AGA");
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
	    
	   
	    Button h = (Button) findViewById(R.id.h);
	    h.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				 LinearLayout h = (LinearLayout) findViewById(R.id.hot);
				 
				 LayoutParams params = new TableRow.LayoutParams(0, LayoutParams.WRAP_CONTENT, 1f);
	             
				 final LinearLayout unu = new LinearLayout(v.getContext());
				 unu.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));

				 
				  
				  id2.setText(""+kkk) ;
				  
				  hott[kkk]=new EditText(v.getContext()) ;
				  hott[kkk].setLayoutParams(params);
                  hott[kkk].setText(""+kkk) ;
				  hott[kkk].setId(iid);
				  unu.addView(hott[kkk]) ;
				  iid++ ;
				  
				  h.addView(unu) ;
				kkk++ ;
			}
		});
	    
	    
	    Button plus = (Button) findViewById(R.id.plus);
	       plus.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					
					 LinearLayout as = (LinearLayout) findViewById(R.id.asociati);
					  LayoutParams params = new TableRow.LayoutParams(0, LayoutParams.WRAP_CONTENT, 1f);
			             
					 final LinearLayout unu = new LinearLayout(v.getContext());
					 unu.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));

					 
					 TextView as1=new TextView(v.getContext()) ;
					    as1.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
					      as1.setText(""+j+" Nume: ") ;
					  as1.setTextSize(20);
					  unu.addView(as1) ;
					  id.setText(""+j) ;
					  
					  
					  nume[j]=new EditText(v.getContext()) ;
					  nume[j].setLayoutParams(params);

					  nume[j].setId(i);
					  unu.addView(nume[j]) ;
					  i++ ;
					  as.addView(unu) ;
					  
					  final LinearLayout doi = new LinearLayout(v.getContext());
						 doi.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));

						 
						 TextView as2=new TextView(v.getContext()) ;
						 as2.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
						 as2.setText("detinator a  ") ;
						 as2.setTextSize(20);
						  doi.addView(as2) ;
						  
						  
						  aport[j]=new EditText(v.getContext()) ;
						  aport[j].setLayoutParams(params);
                          aport[j].setInputType(InputType.TYPE_CLASS_NUMBER);
						  aport[j].setId(i);
						  doi.addView(aport[j]) ;
						  i++ ;
						  
						  
						  TextView as3=new TextView(v.getContext()) ;
							 as3.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
							 as3.setText("% capital  ") ;
							 as3.setTextSize(20);
							  doi.addView(as3) ;
							  
							  as.addView(doi) ;
					  
							  j++ ;
					}
				// onClick
			});
	}
	
	    public void createPDF() {
			Document doc = new Document();

			try {
				String path = Environment.getExternalStorageDirectory()
						.getAbsolutePath() + "/Acte/Hotarare_aga/";

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
				doc.open();
				
				 BaseFont baseFont = BaseFont.createFont("/assets/PTN57F.ttf", BaseFont.IDENTITY_H, BaseFont.EMBEDDED);
				 Font paraFont = new Font(baseFont,12);
		          
				 
				 text3.setTypeface(null,Typeface.BOLD) ;
				 
				 Font paraFontb = new Font(baseFont,12,Font.BOLD);
				Paragraph p1 = new Paragraph();
				p1.add(new Chunk("S.C. ",paraFontb)) ;
				
				Chunk underline = new Chunk(""+text3.getText(),paraFontb);
				underline.setUnderline(0.1f, -2f);
				p1.add(underline);
				Chunk underline2 = new Chunk(" "+text4.getText(),paraFontb);
				
				p1.add(underline2);
				
				
				p1.setAlignment(Paragraph.ALIGN_CENTER);
				// add paragraph to document
				doc.add(p1);
	            
				Paragraph pp1 = new Paragraph();
				Chunk underlinee = new Chunk(""+text5.getText()+", Str. "+text6.getText()+" nr."+text7.getText()+", "+text11.getText(),paraFontb);
				underlinee.setUnderline(0.1f, -2f);
				pp1.add(underlinee);
				pp1.setAlignment(Paragraph.ALIGN_CENTER) ;
	                 doc.add(pp1) ;
	                 
	                 Paragraph pp2 = new Paragraph();
	 				Chunk underlinee1 = new Chunk("J"+text14.getText()+" / "+text15.getText()+" / "+text16.getText()+", CUI: "+text12.getText()+"",paraFontb);
	 				underlinee1.setUnderline(0.1f, -2f);
	 				pp2.add(underlinee1);
	 				pp2.setAlignment(Paragraph.ALIGN_CENTER) ;
	 	                 doc.add(pp2) ;
	                 
	                 
				doc.add(Chunk.NEWLINE) ;
				doc.add(Chunk.NEWLINE) ;
				
				Paragraph h = new Paragraph();
				 Chunk underlin1 = new Chunk("HOTĂRÂREA nr. ",paraFontb);
	                underlin1.setUnderline(0.1f, -2f);
					h.add(underlin1);
                Chunk underlin2 = new Chunk(""+txtData.getText()+"/"+txtData2.getText()+" a\n",paraFontb);
                underlin2.setUnderline(0.1f, -2f);
				h.add(underlin2);
				 Chunk underlin3 = new Chunk("ADUNĂRII GENERALE A ASOCIATILOR",paraFontb);
	               underlin3.setUnderline(0.1f, -2f);
					h.add(underlin3);
				h.setAlignment(Paragraph.ALIGN_CENTER);
	                    doc.add(h) ;
	                    
	                    
	                    doc.add(Chunk.NEWLINE) ; 
	                    
	                    
				String p2 = new String("          Persoană juridică română cu sediul în "+text5.getText()+", str. "+text6.getText()+" nr. "+text7.getText()+", " +
						"bloc "+text8.getText()+", scara "+text9.getText()+", ap. "+text10.getText()+", jud. "+text11.getText()+", având Cod Unic de Inregistrare "+text12.getText()+", " +
						"înregistrată la Oficiul Registrului Comerţului de pe lângă Tribunalul "+text13.getText()+" sub nr. J"+text14.getText()+" / "+text15.getText()+" / "+text16.getText()+", reprezentată prin asociaţii ei:");
				doc.add(new Paragraph(p2,paraFont));
				
				int k=0 ;
				String kk=id.getText().toString() ;
				int s=Integer.parseInt(kk) ;
				
				for(int t=1;t<=s;t++){
					
					nume[t].findViewById(k);
		    		k++ ;
		    		aport[t].findViewById(k);
		    		k++ ;
		    		
		    		String pp=new String("          "+t+". "+nume[t].getText()+", asociat deţinător a "+aport[t].getText()+"% din capitalul social,") ;
		    		doc.add(new Paragraph(pp,paraFont));
				}
				doc.add(Chunk.NEWLINE) ;
				
				String p3=new String("care s-au întrunit astăzi, "+data.getText()+",  în Adunarea Generală a Asociatilor, " +
						"capitalul social fiind reprezentat în proporţie de "+capital.getText()+"% şi, cu unanimitate de voturi, " +
						"hotărăsc prin prezenta următoarele:") ;
				doc.add(new Paragraph(p3,paraFont)) ;
				
				
				doc.add(Chunk.NEWLINE) ;
				
				int ks=30 ;
				String ksk=id2.getText().toString() ;
				int sss=Integer.parseInt(ksk) ;
				
				for(int t=1;t<=sss;t++){
					
					
		    		hott[t].findViewById(ks);
		    		ks++ ;
		    		
		    		String pp=new String("          "+hott[t].getText()) ;
		    		doc.add(new Paragraph(pp,paraFont));
				}
				

				doc.add(Chunk.NEWLINE) ;
				
				int k1=0 ;
				String k2=id.getText().toString() ;
				int s1=Integer.parseInt(k2) ;
				
				for(int t=1;t<=s1;t++){
					
					nume[t].findViewById(k1);
		    		k++ ;
		    		
		    		Paragraph pp4 = new Paragraph("  "+nume[t].getText());
		    		pp4.setFont(paraFont) ;
		    		pp4.setAlignment(Paragraph.ALIGN_RIGHT) ;
		    		doc.add(pp4);
		    		doc.add(Chunk.NEWLINE) ;
				}
				doc.add(Chunk.NEWLINE) ;
				

			} catch (DocumentException de) {
				Log.e("PDFCreator", "DocumentException:" + de);
			} catch (IOException e) {
				Log.e("PDFCreator", "ioException:" + e);
			} finally {
				doc.close();
			}

	    }
	}