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

import android.R.array;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.renderscript.Element;
import android.renderscript.Type;
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
import com.lowagie.text.HeaderFooter;
import com.lowagie.text.PageSize;
import com.lowagie.text.Paragraph;
import com.lowagie.text.Phrase;
import com.lowagie.text.pdf.BaseFont;
import com.lowagie.text.pdf.ColumnText;
import com.lowagie.text.pdf.PdfCopy;
import com.lowagie.text.pdf.PdfImportedPage;
import com.lowagie.text.pdf.PdfReader;
import com.lowagie.text.pdf.PdfWriter;
	@SuppressLint("InflateParams") public class Act_constitutiv_SA extends   Activity   {

		final Context context = this;
		int duration = Toast.LENGTH_SHORT;
		private TextView data,data1,data2 ;
		private Button plus ;
		private EditText txtData,numarAsoc,denumire,disp,din,elibde,f61,f62,f63,f71,f81,f82,f91,f92,f93,f94,f101,p12,p22,p23,p24,p31,p32,p33;
		private EditText p41,p42,p43,p44,p51,p61,p62,p63,p70,p71,domeniulprincipal,grupacaen,grupacaen2,denumirea,capital,lei,minus ;
		private EditText j11,j12,j21,j1,j32,j41,j42,ecap1,ecap2,ecap3,num_actiuni,cj24,cj25,cj26,cj27,cj28,cj29,cj30,cj31,cj32,cene1,cene2,act0;
		private  int i=1 ;
		int cc=3000,kkk=0,conte=2800 ;
		int[] v=new int[15] ;
		private String Titlu=null ,ident,D,dna,natie,nascut,dom,posesor,CI,naties,Ds,Dc,nascutc,Dj,Da,natiea,natiea1,nascuta,doma,jud,valuta11,valuta22,asac1;
	    private String valuta33,valuta44,valuta55,valuta66 ;
		int click=0 ;
		private RadioButton f51,f52,fasoc2,fasoc1,radio0,radio1,radio2,cenzorr,auditorr,pf,pj,admin1,admin2,v1,v2,v3,v4,v5,v6 ;
		private RadioButton cb1,fasoc2p1,fasoc2p2,fasoc2p3,fasoc2p4,pjd,pfdf ; 
		private RadioButton cb2,rcap1,rcap2,css4,css5,css6,act1,act2 ; 
		private RadioButton ci[] =new RadioButton[15] ;
		private RadioButton ci_sc[] =new RadioButton[15] ;
		private RadioButton bi_sc[] =new RadioButton[15] ;
		private TextView switch1 ;
		private RadioButton bi[] =new RadioButton[15] ;	
		private RadioButton ci_m[] =new RadioButton[15] ;
		private RadioButton bi_m[] =new RadioButton[15] ;
		private RadioButton pasaport[] =new RadioButton[15] ;
		private RadioButton pfd ;
		private RadioButton pid ;
		
		private RadioButton supleant ;
		int doi=0 ;
		int un=0;
		
		private ToggleButton p11,p13 ,c1,cj13,admt,admt1,admt2,admjt2,f10b4,asac,sc_pft,j31,toggleSC,pres,pres9,cj22;
		private ToggleButton toggle1[] = new ToggleButton[15] ;
		private ToggleButton Dnul[] = new ToggleButton[15] ;
		private ToggleButton jsc[] = new ToggleButton[15] ;
		private ToggleButton cbc[] = new ToggleButton[15] ;
		private ToggleButton pc[] = new ToggleButton[15] ;
		private ToggleButton dncc[] = new ToggleButton[15] ;
		private ToggleButton cbcc1[] = new ToggleButton[15] ;
		
		private ToggleButton jscc[] = new ToggleButton[15] ;
		private ToggleButton jscc11[] = new ToggleButton[15] ;
		
		private ToggleButton toggle2[] = new ToggleButton[15] ;
		private ToggleButton toggl[] = new ToggleButton[15] ;
		private ToggleButton judet[] = new ToggleButton[15] ;
		private ToggleButton judet1[] = new ToggleButton[15] ;
		private ToggleButton reprezde1[] = new ToggleButton[15] ;
		private ToggleButton reprezde2[] = new ToggleButton[15] ;
		private ToggleButton reprezde3[] = new ToggleButton[15] ;
		private LinearLayout persfizica,persjuridica,layout2,layout,pfl,persfizicac,persjuriticac,persfizicaadm,persjuridicaadm,durata,pfp,scp,sc_pf,sc_imp,lcap1,lcap2 ;
	    private LinearLayout lcap3,lcap4,nr_de_actiuni,add  ,presedinte,add_membri,cend,cenzord ;
		int  id1=1,id=1 ;
	    int k=0 ;
	    int gg=0 ;
	    int heightInt ;
	    int kpl=1  ;
	     int idpl=750  ;
	     int ppl=0 ;
	     int is=810 ;
	     int da=0 ;
	     int ddl=0 ;
	     int iso=1000 ;
	     int c=570 ;
	    List<EditText> allEds = new ArrayList<EditText>();
	    
	    private EditText sc[]=new EditText[10] ;
	    private EditText textcontor[]=new EditText[10] ;
		
	    private EditText sediuc[]=new EditText[10] ;
	    private EditText strcc[]=new EditText[10] ; 
	    private EditText nrcc[]=new EditText[10] ;
	    private EditText jscc1[]=new EditText[10] ;
	    private EditText domcc[]=new EditText[10] ;
	    private EditText jcc[]=new EditText[10] ;
	    private EditText jcc1[]=new EditText[10] ;
	    private EditText jcc2[]=new EditText[10] ;
	    private EditText cuicc[]=new EditText[10] ;
	    private EditText num[]=new EditText[10] ;
	    private EditText reprezcc[]=new EditText[10] ;
	    private EditText domacc[]=new EditText[10] ;
	    private EditText strcc1[]=new EditText[10] ;
	    private EditText nrcc1[]=new EditText[10] ;
	    private EditText seriacc[]=new EditText[10] ;
	    private EditText nrccc[]=new EditText[10] ;
	    private EditText eliblacc[]=new EditText[10] ;
	    private EditText panalacc[]=new EditText[10] ;
	    private EditText decatrecc[]=new EditText[10] ;
	    private EditText datacc[]=new EditText[10] ;
	    private EditText locc[]=new EditText[10] ;
	    private EditText judcc[]=new EditText[10] ;
	    private EditText cnpcc[]=new EditText[10] ;
		
	    private EditText contor[]=new EditText[10] ;
	    private EditText domc[]=new EditText[10] ;
	    private EditText strc[]=new EditText[10] ;
	    private EditText nrc[]=new EditText[10] ;
	    private EditText blc[]=new EditText[10] ;
	    private EditText scc[]=new EditText[10] ;
	    private EditText etc[]=new EditText[10] ;
	    private EditText apc[]=new EditText[10] ;
	    private EditText seriac[]=new EditText[10] ;
	    private EditText jsc1[]=new EditText[10] ;
	    private EditText nrc1[]=new EditText[10] ;
	    private EditText la[]=new EditText[10] ;
	    private EditText panala[]=new EditText[10] ;
	    private EditText catrec[]=new EditText[10] ;
	    private EditText nascutc1[]=new EditText[10] ;
	    private EditText inc[]=new EditText[10] ;
	    private EditText judc[]=new EditText[10] ;
	    private EditText cnpc[]=new EditText[10] ;
	    private EditText jscc22[]=new EditText[10] ;
		
	    private EditText blcc[]=new EditText[10] ;
	    private EditText sccc[]=new EditText[10] ;
	    private EditText etcc[]=new EditText[10] ;
	    private EditText apcc[]=new EditText[10] ;
		
	    private EditText blcc1[]=new EditText[10] ;
	    private EditText sccc1[]=new EditText[10] ;
	    private EditText etcc1[]=new EditText[10] ;
	    private EditText apcc1[]=new EditText[10] ;
		
	    private EditText nume[]=new EditText[10] ;
	    private EditText seria[]=new EditText[10] ;
	    private EditText nrser[]=new EditText[10] ;
	    private EditText elibs[]=new EditText[10] ;
	    private EditText dom1[]=new EditText[10] ;
	    private EditText datade[]=new EditText[10] ;
	    private EditText cnp[]=new EditText[10] ;
	    private EditText str[]=new EditText[10] ;
	    private EditText nrs[]=new EditText[10] ;
	    private EditText sss[]=new EditText[10] ;
	    private EditText dn[]=new EditText[10] ;
	    private EditText in[]=new EditText[10] ;
	    private EditText sector[]=new EditText[10] ;
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
	    private EditText text233[]=new EditText[10] ;
	    private EditText text244[]=new EditText[10] ;
	    private EditText text234[]=new EditText[10] ;
	    private EditText text245[]=new EditText[10] ;	   
	    private EditText text246[]=new EditText[10] ;
	    private EditText text235[]=new EditText[10] ;
	    private EditText text247[]=new EditText[10] ;	   
	    private EditText text248[]=new EditText[10] ;
	    private EditText text249[]=new EditText[10] ;
	    private EditText text250[]=new EditText[10] ;
	    private EditText text251[]=new EditText[10] ;
	    
	    private EditText text336[]=new EditText[10] ;
	    private EditText text337[]=new EditText[10] ;
	    private EditText text338[]=new EditText[10] ;
	    private EditText text339[]=new EditText[10] ;
		    
	    
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
	   
	    private EditText sc1[]=new EditText[25] ;
	    private EditText sc2[]=new EditText[25] ;
	    
	    private EditText c2,c3,c5,c4,c6,c7,c8,c9,c10,c11,c12,c13,c14,c15,c16,c17,c18,c19 ;
	    private EditText cj,cj1,cj2,cj3,cj4,cj5,cj6,cj7,cj8,cj9,cj10,cj11,cj12,cs,cj14,cj15,cj16,cj17,cj18,cj19,cj21,cj20 ;
	    private EditText adm1,adm2,adm3,adm4,adm5,adm6,adm7,adm8,adm9,adm10,adm11,adm12,adm13,adm14,adm15,adm16,adm17 ;
	    private EditText admj1,admj2,admj3,admj4,admj5,admj6,admj7,admj8,admj9,admj10 ;
	    private EditText valuta ,valuta1,valuta2,valuta3,valuta4,valuta5,valuta6,valuta7,valuta8,valuta9 ;
	    private EditText sc_nume , sc_strain,sc_cnp,sc_seria,sc_nr,sc_elibde,sc_data,sc_dom,sc_nr2,sc_str,sc_bl,sc_sc,sc_et,sc_ap,sc_impu,sc_nr3,sc_data2 ;
	    private EditText css1,css2,css3,css7,css8,css9,css13,css14,css15,pres1 ;
	    private RadioButton css10,css11,css12 ;
	    private EditText csv1,csv2,csv3,csv7,csv8,csv9,csv13,csv14,csv15,pres6,pres7,pres8 ;
	    private RadioButton csv10,csv11,csv12,csv4,csv5,csv6 ;
	  private EditText pres10,pres13,pres14,pres15,pres16,pres2,pres3,pres5,pres17,plus_membri ;
	  private ToggleButton pres4 ;
	  private Button plus_button,cenb ;
	  private EditText cj23 ;
	  int unu=0 ;
	    protected void onCreate(Bundle savedInstanceState) {
	    	
	    	
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.act_constitutiv_sa);
	        cend = (LinearLayout) findViewById(R.id.cend); 
	        cenzord = (LinearLayout) findViewById(R.id.cenzord); 
		          
	        add = (LinearLayout) findViewById(R.id.add); 
	        switch1=(TextView) findViewById(R.id.switch1) ;
	        presedinte = (LinearLayout) findViewById(R.id.presedinte); 
	        add_membri = (LinearLayout) findViewById(R.id.add_membri); 
		       plus_button=(Button) findViewById(R.id.plus_button) ;
	        lcap3 = (LinearLayout) findViewById(R.id.lcap3); 
	        lcap4 = (LinearLayout) findViewById(R.id.lcap4);
	        nr_de_actiuni = (LinearLayout) findViewById(R.id.nr_de_actiuni); 
	        num_actiuni = (EditText) findViewById(R.id.num_actiuni);
	        cenb=(Button) findViewById(R.id.cenb) ;
	        cene1 = (EditText) findViewById(R.id.cene1);
	        cene2= (EditText) findViewById(R.id.cene2);
	        switch1=(TextView) findViewById(R.id.switch1) ;

		           
	        cj23 = (EditText) findViewById(R.id.cj23);
	        cj24 = (EditText) findViewById(R.id.cj24);
	        cj25 = (EditText) findViewById(R.id.cj25);
	        cj26 = (EditText) findViewById(R.id.cj26);
	        cj27 = (EditText) findViewById(R.id.cj27);
	        cj28 = (EditText) findViewById(R.id.cj28);
	        cj29 = (EditText) findViewById(R.id.cj29);
	        cj30 = (EditText) findViewById(R.id.cj30);
	        cj31 = (EditText) findViewById(R.id.cj31);
	        cj32 = (EditText) findViewById(R.id.cj32);
			 
	        plus_membri = (EditText) findViewById(R.id.plus_membri);
	        pres5 = (EditText) findViewById(R.id.pres5);
	        pres17 = (EditText) findViewById(R.id.pres17);
	        pres2 = (EditText) findViewById(R.id.pres2);
	        pres3 = (EditText) findViewById(R.id.pres3);
	        pres4 = (ToggleButton) findViewById(R.id.pres4);
	        pres16 = (EditText) findViewById(R.id.pres16);
	        pres10 = (EditText) findViewById(R.id.pres10);
	        pres13 = (EditText) findViewById(R.id.pres13); 
	        pres14 = (EditText) findViewById(R.id.pres14);
	        pres15 = (EditText) findViewById(R.id.pres15);
		    
	        pres6 = (EditText) findViewById(R.id.pres6);
	        pres7 = (EditText) findViewById(R.id.pres7);
	        pres8 = (EditText) findViewById(R.id.pres8);
	        css1 = (EditText) findViewById(R.id.css1);
	        css2 = (EditText) findViewById(R.id.css2);
	        css3 = (EditText) findViewById(R.id.css3);
	        css7 = (EditText) findViewById(R.id.css7);
	        css8 = (EditText) findViewById(R.id.css8);
	        css9 = (EditText) findViewById(R.id.css9);
	        css13 = (EditText) findViewById(R.id.css13);
	        css14 = (EditText) findViewById(R.id.css14);
	        css15 = (EditText) findViewById(R.id.css15);
	        pjd = (RadioButton) findViewById(R.id.pjd);
	        pfdf = (RadioButton) findViewById(R.id.pfd);
	        supleant = (RadioButton) findViewById(R.id.supleant);
			       
	        css4 = (RadioButton) findViewById(R.id.css4);
	        css5 = (RadioButton) findViewById(R.id.css5);
	        css6 = (RadioButton) findViewById(R.id.css6);
	        css10 = (RadioButton) findViewById(R.id.css10);
	        css11 = (RadioButton) findViewById(R.id.css11);
	        css12 = (RadioButton) findViewById(R.id.css12);
			 
	        act1 = (RadioButton) findViewById(R.id.act1);
	        act2 = (RadioButton) findViewById(R.id.act2);
			
	        csv1 = (EditText) findViewById(R.id.csv1);
	        csv2 = (EditText) findViewById(R.id.csv2);
	        csv3 = (EditText) findViewById(R.id.csv3);
	        csv7 = (EditText) findViewById(R.id.csv7);
	        csv8 = (EditText) findViewById(R.id.csv8);
	        csv9 = (EditText) findViewById(R.id.csv9);
	        csv13 = (EditText) findViewById(R.id.csv13);
	        csv14 = (EditText) findViewById(R.id.csv14);
	        csv15 = (EditText) findViewById(R.id.csv15);
			    
	        csv4 = (RadioButton) findViewById(R.id.csv4);
	        csv5 = (RadioButton) findViewById(R.id.csv5);
	        csv6 = (RadioButton) findViewById(R.id.csv6);
	        csv10 = (RadioButton) findViewById(R.id.csv10);
	        csv11 = (RadioButton) findViewById(R.id.csv11);
	        csv12 = (RadioButton) findViewById(R.id.csv12);
	        
	        ecap1 = (EditText) findViewById(R.id.ecap1);
	        ecap2 = (EditText) findViewById(R.id.ecap2);
	        ecap3 = (EditText) findViewById(R.id.ecap3);
		    
	        
	        
	        sc_bl = (EditText) findViewById(R.id.sc_bl);
	        sc_sc = (EditText) findViewById(R.id.sc_sc);
	        sc_et = (EditText) findViewById(R.id.sc_et);
	        sc_ap = (EditText) findViewById(R.id.sc_ap);
	        sc_impu = (EditText) findViewById(R.id.sc_impu);
	        sc_nr3 = (EditText) findViewById(R.id.sc_nr3);
	        sc_data2 = (EditText) findViewById(R.id.sc_data2);
	        
			     
	        sc_dom = (EditText) findViewById(R.id.sc_dom);
	        sc_nr2 = (EditText) findViewById(R.id.sc_nr2);
	        sc_str = (EditText) findViewById(R.id.sc_str);
 
	        rcap1=(RadioButton)findViewById(R.id.rcap1);
	        rcap2=(RadioButton)findViewById(R.id.rcap2);
	        lcap1=(LinearLayout)findViewById(R.id.lcap1);
	        lcap2=(LinearLayout)findViewById(R.id.lcap2);
	 	    
	        
	        
	        v1=(RadioButton)findViewById(R.id.v1);
	        v2=(RadioButton)findViewById(R.id.v2);
	        v3=(RadioButton)findViewById(R.id.v3);
	        v4=(RadioButton)findViewById(R.id.v4);
	        v5=(RadioButton)findViewById(R.id.v5);
	        v6=(RadioButton)findViewById(R.id.v6);
	 	   
	        fasoc2p3=(RadioButton)findViewById(R.id.fasoc2p3);
	        fasoc2p4=(RadioButton)findViewById(R.id.fasoc2p4);
	        
	       minus= (EditText) findViewById(R.id.minus);
		       
	        lei = (EditText) findViewById(R.id.lei);
	        capital = (EditText) findViewById(R.id.capital);
	        grupacaen2 = (EditText) findViewById(R.id.GrupaCAEN2);
	        denumirea = (EditText) findViewById(R.id.Denumirea);
	        domeniulprincipal = (EditText) findViewById(R.id.domeniulprincipal);
	        grupacaen = (EditText) findViewById(R.id.GrupaCAEN);
	        
	        sc_nume = (EditText) findViewById(R.id.sc_nume);		       
	        sc_strain = (EditText) findViewById(R.id.sc_strain);
	        sc_cnp = (EditText) findViewById(R.id.sc_cnp);
	        sc_seria = (EditText) findViewById(R.id.sc_seria);
	        sc_nr = (EditText) findViewById(R.id.sc_nr1);
	        sc_elibde = (EditText) findViewById(R.id.sc_elibde);
	        sc_data = (EditText) findViewById(R.id.sc_data);
			    
	        
	        
	       
	        
	        
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
	        act0 = (EditText) findViewById(R.id.act0);
		       
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
	        fasoc2p1=(RadioButton)findViewById(R.id.fasoc2p1);
	        fasoc2p2=(RadioButton)findViewById(R.id.fasoc2p2);
		        
	        j31=(ToggleButton) findViewById(R.id.j31) ;
	        toggleSC=(ToggleButton) findViewById(R.id.toggleSC) ;
	       cj22=(ToggleButton) findViewById(R.id.cj22) ;
		        
	        sc_pft=(ToggleButton) findViewById(R.id.sc_pft) ;
	        pres=(ToggleButton) findViewById(R.id.pres) ;
	        pres9=(ToggleButton) findViewById(R.id.pres9) ;
		       
	        asac=(ToggleButton) findViewById(R.id.asac) ;
	        pres1 = (EditText) findViewById(R.id.pres1);
	        admt=(ToggleButton) findViewById(R.id.admt) ;
	         admt1=(ToggleButton) findViewById(R.id.admt1) ;
	         admt2=(ToggleButton) findViewById(R.id.admt2) ;
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
	        cj16 = (EditText) findViewById(R.id.cj16);
	        cj17 = (EditText) findViewById(R.id.cj17);
	        cj18 = (EditText) findViewById(R.id.cj18);
	        cj19 = (EditText) findViewById(R.id.cj19);
	        cj20 = (EditText) findViewById(R.id.cj20);
	        cj21 = (EditText) findViewById(R.id.cj21);
	        
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
	       cenzorr=(RadioButton)findViewById(R.id.cenzorr);
	       auditorr=(RadioButton)findViewById(R.id.auditorr);
	       fasoc1=(RadioButton)findViewById(R.id.fasoc1);
	       fasoc2=(RadioButton)findViewById(R.id.fasoc2);   
	       pfl=(LinearLayout)findViewById(R.id.pfl);
	       persfizica=(LinearLayout)findViewById(R.id.persfizica);
	       persjuridica=(LinearLayout)findViewById(R.id.persjuridica);
	       pf=(RadioButton)findViewById(R.id.pf);
	       pj=(RadioButton)findViewById(R.id.pj);
	       
	       
	       persfizicac=(LinearLayout)findViewById(R.id.persfizicac);
	       persjuriticac=(LinearLayout)findViewById(R.id.persjuridicac);
	       c1=(ToggleButton)findViewById(R.id.c1) ;
	       
	       persfizicaadm=(LinearLayout)findViewById(R.id.persfizicaadm);
	       persjuridicaadm=(LinearLayout)findViewById(R.id.persjuridicaadm);
	       sc_pf=(LinearLayout)findViewById(R.id.sc_pf);
	       sc_imp=(LinearLayout)findViewById(R.id.sc_imp);   
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
		mTitleTextView.setText(" S.A. ");
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
	    
	    act1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				act2.setChecked(false) ;
			}
		});
	    
         act2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				act1.setChecked(false) ;
			}
		});
         
         
	    
	    Button actionari = (Button) findViewById(R.id.act3);
	    actionari.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				   
	               LinearLayout valdin = (LinearLayout) findViewById(R.id.valdin);
	               LayoutParams params = new TableRow.LayoutParams(0, LayoutParams.WRAP_CONTENT, 1f);
	               
	               int c=570 ;
	               

	               
		              															                    
if(act1.isChecked()){
	TextView as=new TextView(v.getContext()) ;
    as.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
      as.setText(".. Ac??ionar "+(kkk+1)+" ..") ;
  as.setTextSize(20);
  valdin.addView(as) ;
  
 
  String k=""+(kkk+1) ;
      act0.setText(k) ;
      kkk++ ;
	
	
	
		             act2.setChecked(false) ;  
		             act1.setChecked(false) ;
final LinearLayout sase1 = new LinearLayout(v.getContext());
sase1.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));

textcontor[i]=new EditText(v.getContext()) ;
textcontor[i].setLayoutParams(params);
 textcontor[i].setText("1");
 textcontor[i].setVisibility(View.GONE) ;
 textcontor[i].setId(conte);
conte++ ;
sase1.addView(textcontor[i]) ;
			    	    
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

  	    
TextView aport1=new TextView(v.getContext()) ;
aport1.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
aport1.setText(" de??ine un num??r de") ;
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
aport2.setText("ac??iuni, cu o val. de") ;
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
aport3.setText("lei/ac??iune , val. total?? de") ;
aport3.setTextSize(20);
sase2.addView(aport3) ;
     
valdin.addView(sase2) ;


final LinearLayout sase3 = new LinearLayout(v.getContext());
sase3.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));




text29[i]=new EditText(v.getContext()) ;
text29[i].setLayoutParams(params);
text29[i].setRawInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_NUMBER_FLAG_DECIMAL)  ;
c++ ;
text29[i].setId(c);
sase3.addView(text29[i]) ;


TextView aport5=new TextView(v.getContext()) ;
aport5.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
aport5.setText("lei , reprez.") ;
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
aport6.setText("% din capitalul social  subscris ??i v??rsat,") ;
aport6.setTextSize(20);
sase3.addView(aport6) ;

valdin.addView(sase3) ;


final LinearLayout sase4 = new LinearLayout(v.getContext());
sase4.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));


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

}
if(act2.isChecked()){
    act2.setChecked(false) ;  
    act1.setChecked(false) ;

    TextView as=new TextView(v.getContext()) ;
    as.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
      as.setText(".. Ac??ionar "+(kkk+1)+" ..") ;
  as.setTextSize(20);
  valdin.addView(as) ;
  
 
  String k=""+(kkk+1) ;
      act0.setText(k) ;
      kkk++ ;
      
final LinearLayout sase5 = new LinearLayout(v.getContext());
sase5.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));

textcontor[i]=new EditText(v.getContext()) ;
textcontor[i].setLayoutParams(params);
 textcontor[i].setText("2");
 textcontor[i].setVisibility(View.GONE) ;
 textcontor[i].setId(conte);
conte++ ;
sase5.addView(textcontor[i]) ;

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


TextView aport10=new TextView(v.getContext()) ;
aport10.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
aport10.setText(" de??ine un num??r de") ;
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
aport11.setText("ac??iuni, cu o val.  de") ;
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
aport12.setText("lei/ac??iune ??i ??n val. total?? de") ;
aport12.setTextSize(20);
sase6.addView(aport12) ;

valdin.addView(sase6) ;


final LinearLayout sase7 = new LinearLayout(v.getContext());
sase7.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));




text36[i]=new EditText(v.getContext()) ;
text36[i].setLayoutParams(params);
text36[i].setInputType(InputType.TYPE_NUMBER_FLAG_DECIMAL) ;
c++ ;
text36[i].setId(c);
sase7.addView(text36[i]) ;

TextView aport14=new TextView(v.getContext()) ;
aport14.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
aport14.setText("lei, reprez") ;
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
aport15.setText("% din capitalul social  subscris ??i v??rsat ") ;
aport15.setTextSize(20);
sase7.addView(aport15) ;

valdin.addView(sase7) ;


final LinearLayout sase8 = new LinearLayout(v.getContext());
sase8.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));


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

	               
}     
				
i++ ;
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
	    	   int j=230 ;
	    	  
	    	  
	    	   
	       for (; i < heightInt; i++) {
	    	   
               LinearLayout asocd = (LinearLayout) findViewById(R.id.asocd);
	    	   
            
	    	   
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
																							               
																							           
																							               pfd = new RadioButton(v.getContext());
																						                    pfd.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
																						 	             
																						                    pfd.setText("Persoana fizica");
																						 	               
																						 	               j++  ;
																						 	              pfd.setId(j) ;
																						 	               unu1.addView(pfd);
																						                
																						 	              pid = new RadioButton(v.getContext());
																						 	             pid.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
																						 	             
																						 	            pid.setText("Imputernicit");
																						 	               
																						 	               j++  ;
																						 	              pid.setId(j) ;
																						 	               unu1.addView(pid);
																						 	               
																						 	              asocd.addView(unu1) ;
																							               
																						 	              final LinearLayout unu11 = new LinearLayout(v.getContext());
																								    	    unu11.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
																								    	    unu11.setVisibility(View.GONE) ;
																							               
																							                reprezde1[i] = new ToggleButton(v.getContext());
																							                reprezde1[i].setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
																							                  
																							                reprezde1[i].setTextOff("D-na") ; 		             
																							                reprezde1[i].setTextOn("D-nul") ; 	
																							                reprezde1[i].setChecked(true) ;
																							               j++  ;
																							               reprezde1[i].setId(j) ;
																							               unu11.addView(reprezde1[i]);
																							               
																							               text22[i]=new EditText(v.getContext()) ;
																							               text22[i].setLayoutParams(params);
																						                    j++ ;
																						                    text22[i].setId(j);
																						                    unu11.addView(text22[i]) ;
																						                    
																						                    
																			                           
																						                    asocd.addView(unu11) ;        
																
																						                    final LinearLayout unu2 = new LinearLayout(v.getContext());
																								    	    unu2.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
																								    	    unu2.setVisibility(View.GONE) ;
																								    	
																								                    
																								                    TextView aga=new TextView(v.getContext()) ;
																										            aga.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
																										               aga.setText("Conform Hotararii A.G.A ") ;
																										               aga.setTextSize(20);
																										               unu2.addView(aga) ;
																										               
																										                reprezde3[i] = new ToggleButton(v.getContext());
																										                reprezde3[i].setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
																										           
																										               
																										                reprezde3[i].setTextOn("asocia??ilor") ; 		             
																										                reprezde3[i].setTextOff("ac??ionarilor") ; 	
																										                reprezde3[i].setChecked(true) ;
																										               j++  ;
																										               reprezde3[i].setId(j) ;
																										               unu2.addView(reprezde3[i]);
																										               
																										               
																										               TextView aga2=new TextView(v.getContext()) ;
																											            aga2.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
																											               aga2.setText("nr.") ;
																											               aga2.setTextSize(20);
																											               unu2.addView(aga2) ;
																										               
																											               
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
																									                   
																									                   
																									                    
																									                    final LinearLayout unu5 = new LinearLayout(v.getContext());
																									                    unu5.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
																									                    unu5.setVisibility(View.GONE) ;
																											    	
																											             reprezde2[i] = new ToggleButton(v.getContext());
																											             reprezde2[i].setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
																											                  
																											             reprezde2[i].setTextOff("D-na") ; 		             
																											             reprezde2[i].setTextOn("D-nul") ; 	
																											             reprezde2[i].setChecked(true) ;
																											               j++  ;
																											               reprezde2[i].setId(j) ;
																											               unu5.addView(reprezde2[i]);
																													               
																													               sc1[i]=new EditText(v.getContext()) ;
																													               sc1[i].setLayoutParams(params);
																													              
																												                    j++ ;
																												                    sc1[i].setId(j);
																												                    unu5.addView(sc1[i]) ;
																												                    
																												                    TextView da1=new TextView(v.getContext()) ;
																												                    da1.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
																												                    da1.setText("cet????ean rom??n/ ") ;
																												                    da1.setTextSize(20);
																														               unu5.addView(da1) ;
																									                    
																														               sc2[i]=new EditText(v.getContext()) ;
																														               sc2[i].setLayoutParams(params);
																														                 j++ ;
																												                    sc2[i].setId(j);
																												                    unu5.addView(sc2[i]) ;
																									                           
																												                    asocd.addView(unu5) ;  
																									                    
																												                    final LinearLayout unu6 = new LinearLayout(v.getContext());
																														    	    unu6.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
																														    	    unu6.setVisibility(View.GONE) ;
																														    	
																														                    
																														                    TextView aga5=new TextView(v.getContext()) ;
																																            aga5.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
																																               aga5.setText("CNP ") ;
																																               aga5.setTextSize(20);
																																               unu6.addView(aga5) ;
																																               
																																               text233[i]=new EditText(v.getContext()) ;
																																               text233[i].setLayoutParams(params);
																																               text233[i].setInputType(InputType.TYPE_CLASS_NUMBER) ;
																															                    j++ ;
																															                    text233[i].setId(j);
																															                    unu6.addView(text233[i]) ;
																															                    
																															                    TextView aga6=new TextView(v.getContext()) ;
																																	            aga6.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
																																	               aga6.setText("cu ") ;
																																	               aga6.setTextSize(20);
																																	               unu6.addView(aga6) ;
																																               
																																               ci_sc[i] = new RadioButton(v.getContext());
																																               ci_sc[i].setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));   
																															 	               
																																               ci_sc[i].setText("CI");
																															 	               j++;
																															 	              ci_sc[i].setId(j) ;
																															                    unu6.addView(ci_sc[i]);
																															                    
																															                    
																															                    bi_sc[i] = new RadioButton(v.getContext());
																															                    bi_sc[i].setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
																															 	             
																															                    bi_sc[i].setText("BI");
																															 	               
																															 	               j=j+1  ;
																															 	              bi_sc[i].setId(j) ;
																															 	               unu6.addView(bi_sc[i]);
																																               
																																               TextView aga3=new TextView(v.getContext()) ;
																																	            aga3.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
																																	               aga3.setText(" seria ") ;
																																	               aga3.setTextSize(20);
																																	               unu6.addView(aga3) ;
																																               
																																               
																															                    
																															                    
																																	               text244[i]=new EditText(v.getContext()) ;
																																	               text244[i].setLayoutParams(params);
																																	             j++ ;
																															                    text244[i].setId(j);
																															                    unu6.addView(text244[i]) ;
																												                           
																															                    asocd.addView(unu6) ;  
																															                    
																															                    final LinearLayout unu7 = new LinearLayout(v.getContext());
																																	    	    unu7.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
																																	    	    unu7.setVisibility(View.GONE) ;
																																	    	
																																	                    
																																	                    TextView aga7=new TextView(v.getContext()) ;
																																			            aga7.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
																																			               aga7.setText("nr. ") ;
																																			               aga7.setTextSize(20);
																																			               unu7.addView(aga7) ;
																																			             
																																			               text234[i]=new EditText(v.getContext()) ;
																																			               text234[i].setLayoutParams(params);
																																			               text234[i].setInputType(InputType.TYPE_CLASS_NUMBER) ;
																																		                    j++ ;
																																		                    text234[i].setId(j);
																																		                    unu7.addView(text234[i]) ;
																																		                    
																																		                    TextView aga8=new TextView(v.getContext()) ;
																																				            aga8.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
																																				               aga8.setText("elib. de ") ;
																																				               aga8.setTextSize(20);
																																				               unu7.addView(aga8) ;
																																			               
																																				               text245[i]=new EditText(v.getContext()) ;
																																				               text245[i].setLayoutParams(params);
																																				             j++ ;
																																		                    text245[i].setId(j);
																																		                    unu7.addView(text245[i]) ;
																																			              
																																			               
																																			               TextView aga9=new TextView(v.getContext()) ;
																																				            aga9.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
																																				               aga9.setText(" la data de ") ;
																																				               aga9.setTextSize(20);
																																				               unu7.addView(aga9) ;
																																			               
																																			               
																																		                    
																																		                    
																																				               text246[i]=new EditText(v.getContext()) ;
																																				               text246[i].setLayoutParams(params);
																																				               text246[i].setRawInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_NUMBER_FLAG_DECIMAL)  ;
																																		                    j++ ;
																																		                    text246[i].setId(j);
																																		                    unu7.addView(text246[i]) ;
																															                           
																																		                    asocd.addView(unu7) ; 
																															                    
																																		                    final LinearLayout unu8 = new LinearLayout(v.getContext());
																																				    	    unu8.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
																																				    	    unu8.setVisibility(View.GONE) ;
																																				    	
																																				                    
																																				                    TextView aga10=new TextView(v.getContext()) ;
																																						            aga10.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
																																						               aga10.setText("domiciliat in ") ;
																																						               aga10.setTextSize(20);
																																						               unu8.addView(aga10) ;
																																						              
																																						               text235[i]=new EditText(v.getContext()) ;
																																						               text235[i].setLayoutParams(params);
																																						                 j++ ;
																																					                    text235[i].setId(j);
																																					                    unu8.addView(text235[i]) ;
																																					                    
																																					                    TextView aga11=new TextView(v.getContext()) ;
																																					                    aga11.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
																																					                    aga11.setText("str. ") ;
																																					                    aga11.setTextSize(20);
																																							               unu8.addView(aga11) ;
																																						               
																																							               text247[i]=new EditText(v.getContext()) ;
																																							               text247[i].setLayoutParams(params);
																																							             j++ ;
																																					                    text247[i].setId(j);
																																					                    unu8.addView(text247[i]) ;
																																						              
																																						               
																																						               TextView aga12=new TextView(v.getContext()) ;
																																							            aga12.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
																																							               aga12.setText(" nr. ") ;
																																							               aga12.setTextSize(20);
																																							               unu8.addView(aga12) ;
																																						               
																																						               
																																					                    
																																					                    
																																							               text248[i]=new EditText(v.getContext()) ;
																																							               text248[i].setLayoutParams(params);
																																							               text248[i].setRawInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_NUMBER_FLAG_DECIMAL)  ;
																																					                    j++ ;
																																					                    text248[i].setId(j);
																																					                    unu8.addView(text248[i]) ;
																																		                           
																																					                    asocd.addView(unu8) ; 
																																					                    
																																					                    
																																					                    final LinearLayout unu9 = new LinearLayout(v.getContext());
																																					                    unu9.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
																																							    	    unu9.setVisibility(View.GONE) ;
																																							    	
																																					                    
																																					                    TextView bl1=new TextView(v.getContext()) ;
																																							            bl1.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
																																							               bl1.setText("bl.") ;
																																							               bl1.setTextSize(20);
																																							               unu9.addView(bl1) ;
																																							              
																																							               text336[i]=new EditText(v.getContext()) ;
																																							               text336[i].setLayoutParams(params);
																																							               text336[i].setText("-") ;
																																						                    j++ ;
																																						                    text336[i].setId(j);
																																						                    unu9.addView(text336[i]) ;
																																						                    
																																						                    TextView sc1=new TextView(v.getContext()) ;
																																								            sc1.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
																																								               sc1.setText("sc.") ;
																																								               sc1.setTextSize(20);
																																								               unu9.addView(sc1) ;
																																								               
																																								               text337[i]=new EditText(v.getContext()) ;
																																								               text337[i].setLayoutParams(params);
																																								               text337[i].setText("-") ;
																																							                    j++ ;
																																							                    text337[i].setId(j);
																																							                    unu9.addView(text337[i]) ;
																																							                    
																																							                    TextView et1=new TextView(v.getContext()) ;
																																									            et1.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
																																									               et1.setText("et.") ;
																																									               et1.setTextSize(20);
																																									               unu9.addView(et1) ;
																																					                    
																																									               text338[i]=new EditText(v.getContext()) ;
																																									               text338[i].setLayoutParams(params);
																																									               text338[i].setText("-") ;
																																								                    j++ ;
																																								                    text338[i].setId(j);
																																								                    unu9.addView(text338[i]) ;
																																								                    
																																								                    TextView ap1=new TextView(v.getContext()) ;
																																										            ap1.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
																																										               ap1.setText("ap.") ;
																																										               ap1.setTextSize(20);
																																										               unu9.addView(ap1) ;
																																						                    
																																										               text339[i]=new EditText(v.getContext()) ;
																																										               text339[i].setLayoutParams(params);
																																										               text339[i].setText("-") ;
																																									                    j++ ;
																																									                    text339[i].setId(f);
																																									                    unu9.addView(text339[i]) ;
																																					                           
																																								                    asocd.addView(unu9) ;  
																																								                    
																																								                    final LinearLayout unu10 = new LinearLayout(v.getContext());
																																								                    unu10.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
																																								                    unu10.setVisibility(View.GONE) ;
																																										    	
																																										                    
																																										                    TextView aga112=new TextView(v.getContext()) ;
																																										                    aga112.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
																																										                    aga112.setText("??mputernicit prin ") ;
																																										                    aga112.setTextSize(20);
																																												               unu10.addView(aga112) ;
																																												             
																																												               text249[i]=new EditText(v.getContext()) ;
																																												               text249[i].setLayoutParams(params);
																																												                 j++ ;
																																												                 text249[i].setId(j);
																																											                    unu10.addView(text249[i]) ;
																																											                    
																																											                    TextView aga13=new TextView(v.getContext()) ;
																																											                    aga13.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
																																											                    aga13.setText("nr. ") ;
																																											                    aga13.setTextSize(20);
																																											                    unu10.addView(aga13) ;
																																												               
																																													               text250[i]=new EditText(v.getContext()) ;
																																													               text250[i].setLayoutParams(params);
																																													               text250[i].setRawInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_NUMBER_FLAG_DECIMAL)  ;
																																														             
																																													             j++ ;
																																													             text250[i].setId(j);
																																											                    unu10.addView(text250[i]) ;
																																												              
																																												               
																																												               TextView aga14=new TextView(v.getContext()) ;
																																												               aga14.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
																																												               aga14.setText(" din data ") ;
																																												               aga14.setTextSize(20);
																																													               unu10.addView(aga14) ;
																																												               
																																												               
																																											                    
																																											                    
																																													               text251[i]=new EditText(v.getContext()) ;
																																													               text251[i].setLayoutParams(params);
																																													               text251[i].setRawInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_NUMBER_FLAG_DECIMAL)  ;
																																											                    j++ ;
																																											                    text251[i].setId(j);
																																											                    unu10.addView(text251[i]) ;
																																								                           
																																											                    asocd.addView(unu10) ; 
																																											                                    
																																		                    
																									                    
																		                  


                    
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
        					
        					
        					
    						noua.setVisibility(View.GONE) ;
    						zece.setVisibility(View.GONE) ;
    						unu1.setVisibility(View.GONE) ;
    						unu2.setVisibility(View.GONE) ;
    						unu4.setVisibility(View.GONE) ;
    						
    						unu11.setVisibility(View.GONE) ;
    						unu5.setVisibility(View.GONE) ;
    						unu6.setVisibility(View.GONE) ;
    						unu7.setVisibility(View.GONE);
    						unu8.setVisibility(View.GONE);
    						unu9.setVisibility(View.GONE);
    						unu10.setVisibility(View.GONE);
    						
        				}
        			});     
        		  cb2.setOnClickListener(new OnClickListener() {
        					
        					
        					public void onClick(View v) {
        						cb1.setChecked(false);
        						noua.setVisibility(View.VISIBLE) ;
        						zece.setVisibility(View.VISIBLE) ;
        						unu11.setVisibility(View.GONE) ;
            					
        						unu4.setVisibility(View.VISIBLE) ;
        						
        						unu1.setVisibility(View.VISIBLE) ;
        						
        						noua.setVisibility(View.VISIBLE) ;
        						zece.setVisibility(View.VISIBLE) ;
        						
        						unu5.setVisibility(View.GONE) ;
        						unu6.setVisibility(View.GONE) ;
        						unu7.setVisibility(View.GONE);
        						unu8.setVisibility(View.GONE);
        						unu9.setVisibility(View.GONE);
        						unu10.setVisibility(View.GONE);
        						
        						
        						
        						
        						doi.setVisibility(View.GONE) ;
            					trei.setVisibility(View.GONE) ;
            					patru.setVisibility(View.GONE) ;
            					cinci.setVisibility(View.GONE) ;
            					sase.setVisibility(View.GONE) ;
            					sapte.setVisibility(View.GONE) ;
            					opt.setVisibility(View.GONE) ;
            					
        						
        					}
        				}); 
        		 
        		 pfd.setOnClickListener(new OnClickListener() {
					
					@Override
					public void onClick(View v) {
						// TODO Auto-generated method stub
						pid.setChecked(false) ;
						unu11.setVisibility(View.VISIBLE) ;
						unu2.setVisibility(View.VISIBLE) ;
						
						unu5.setVisibility(View.GONE) ;
						unu6.setVisibility(View.GONE) ;
						unu7.setVisibility(View.GONE);
						unu8.setVisibility(View.GONE);
						unu9.setVisibility(View.GONE);
						unu10.setVisibility(View.GONE);
						
					}
				});
        		 
        		 pid.setOnClickListener(new OnClickListener() {
 					
 					@Override
 					public void onClick(View v) {
 						// TODO Auto-generated method stub
 						pfd.setChecked(false) ;
 						unu11.setVisibility(View.GONE) ;
 						unu2.setVisibility(View.GONE) ;
 						
 						unu5.setVisibility(View.VISIBLE) ;
						unu6.setVisibility(View.VISIBLE) ;
						unu7.setVisibility(View.VISIBLE);
						unu8.setVisibility(View.VISIBLE);
						unu9.setVisibility(View.VISIBLE);
						unu10.setVisibility(View.VISIBLE);
 						
 						
 					}
 				});
        		  
	           }

	       }
			    
	       else { } ;
			    }
			    

				}
			
			
			
			});  
	      
	    
	      rcap1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				lcap1.setVisibility(View.VISIBLE) ;
				lcap2.setVisibility(View.GONE) ;
				lcap3.setVisibility(View.VISIBLE) ;
				lcap4.setVisibility(View.VISIBLE) ;
				nr_de_actiuni.setVisibility(View.VISIBLE) ;
				rcap2.setChecked(false) ;
			}
		});
	      rcap2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				lcap1.setVisibility(View.GONE) ;
				lcap2.setVisibility(View.VISIBLE) ;
				lcap3.setVisibility(View.VISIBLE) ;
				lcap4.setVisibility(View.VISIBLE) ;
				nr_de_actiuni.setVisibility(View.VISIBLE) ;
				rcap1.setChecked(false) ;
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
	      
	      css4.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					css5.setChecked(false) ;
					css6.setChecked(false) ;
					valuta33="EUR" ;
					css7.setVisibility(View.GONE) ;
					
				}
			});
	      css5.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					css4.setChecked(false) ;
					css6.setChecked(false) ;
					valuta33="USD" ;
					css7.setVisibility(View.GONE) ;
					
				}
			});
	      css6.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					css4.setChecked(false) ;
					css5.setChecked(false) ;
					css7.setVisibility(View.VISIBLE) ;
					valuta33=" "+css7.getText().toString() ;
				}
			});
	      css10.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					css11.setChecked(false) ;
					css12.setChecked(false) ;
					css13.setVisibility(View.GONE) ;
					valuta44="EUR " ;
				}
			});
	      css11.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					css10.setChecked(false) ;
					css12.setChecked(false) ;
					css13.setVisibility(View.GONE) ;
					valuta44="USD ";
				}
			});
	      css12.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					css10.setChecked(false) ;
					css11.setChecked(false) ;
					css13.setVisibility(View.VISIBLE) ;
					valuta44=" "+css13.getText().toString() ;
				}
			});
	      
	      csv4.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					csv5.setChecked(false) ;
					csv6.setChecked(false) ;
					valuta55="EUR" ;
					csv7.setVisibility(View.GONE) ;
					
				}
			});
	      csv5.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					csv4.setChecked(false) ;
					csv6.setChecked(false) ;
					valuta55="USD" ;
					csv7.setVisibility(View.GONE) ;
					
				}
			});
	      css6.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					csv4.setChecked(false) ;
					csv5.setChecked(false) ;
					csv7.setVisibility(View.VISIBLE) ;
					valuta55=" "+csv7.getText().toString() ;
				}
			});
	      csv10.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					csv11.setChecked(false) ;
					csv12.setChecked(false) ;
					csv13.setVisibility(View.GONE) ;
					valuta66="EUR " ;
				}
			});
	      csv11.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					csv10.setChecked(false) ;
					csv12.setChecked(false) ;
					csv13.setVisibility(View.GONE) ;
					valuta66="USD ";
				}
			});
	      csv12.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					csv10.setChecked(false) ;
					csv11.setChecked(false) ;
					csv13.setVisibility(View.VISIBLE) ;
					valuta66=" "+csv7.getText().toString() ;
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
						
						
						
					}
				});   
		   fasoc2p1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				sc_pf.setVisibility(View.VISIBLE) ;
				sc_imp.setVisibility(View.GONE) ;
				fasoc2p2.setChecked(false) ;
			}
		}) ;
	   
		   fasoc2p2.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					sc_pf.setVisibility(View.GONE) ;
					sc_imp.setVisibility(View.VISIBLE) ;
					fasoc2p1.setChecked(false) ;
				}
			}) ;
	      
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
    	  natiea="rom??n ";
    	  
		  admt.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				 if(admt.isChecked()) {
					 Da="D-nul " ;
		        	  nascuta="n??scut ";
		        	  doma="domiciliat " ;
		        	  
		        	 
		          }
		          else {
		        	 
		        	  
		        	  Da="D-na " ;
		        	  nascuta="n??scut?? ";
		        	  doma="domiciliat?? " ;
				
			}
			}
		}) ;		
		  
		
		  
		  admt1.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					
					if(admt1.isChecked()) {
						 
			        	  natiea="Jude??";
			        	 
			          }
			          else {
			        	 
			        	  
			        	  natiea="Sector";
				}
					  
				
					  
				}
			});
		  admt2.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					
					if(admt2.isChecked()) {
						 
			        	  natiea1="Jude??";
			        	 
			          }
			          else {
			        	 
			        	  
			        	  natiea1="Sector";
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
		  
		  dna="D-nul " ;
		  
		  sc_pft.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					
					if(sc_pft.isChecked()) {
						 
			        	dna="D-nul " ;
			       	 
			          }
			          else {
			        	 
			        	  
			        	  dna="D-na ";
				}
					  
				
					  
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
         
         plus_membri.setText("0") ;
        
       
         plus_button.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				LayoutParams params = new TableRow.LayoutParams(0, LayoutParams.WRAP_CONTENT, 1f);
				
				TextView data=new TextView(v.getContext()) ;
	            data.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
	               data.setText("Membru "+(da+1) +  " : ") ;
	               
	            
	               data.setTextSize(20);
	               add.addView(data) ;
				 
				
				final LinearLayout act1 = new LinearLayout(v.getContext());
	    	    act1.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
	    	    
	    	    
            Dnul[da]=new ToggleButton(v.getContext()) ;
            Dnul[da].setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
            Dnul[da].setTextOn("D-nul") ;
            Dnul[da].setTextOff("D-na") ;
            Dnul[da].setChecked(true) ;
            Dnul[da].setId(is) ;
             is++ ;
              act1.addView(Dnul[da]) ;
              
              nume[da]=new EditText(v.getContext()) ;
              nume[da].setLayoutParams(params);
         
              nume[da].setId(is);
              act1.addView(nume[da]) ;
          is++ ;
               add.addView(act1) ;
				
               
               final LinearLayout act2 = new LinearLayout(v.getContext());
	    	    act2.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
	    	
               
	    	    TextView data1=new TextView(v.getContext()) ;
	            data1.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
	               data1.setText("Data nasterii ") ;
	               data1.setTextSize(20);
	               act2.addView(data1) ;
			
	               dn[da]=new EditText(v.getContext()) ;
	               dn[da].setLayoutParams(params);
	              dn[da].setRawInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_NUMBER_FLAG_DECIMAL)  ;

	               dn[da].setId(is);
	               act2.addView(dn[da]) ;
	           is++ ;
	           
	           TextView data2=new TextView(v.getContext()) ;
	            data2.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
	               data2.setText("In ") ;
	               data2.setTextSize(20);
	               act2.addView(data2) ;
	           
	               in[da]=new EditText(v.getContext()) ;
	               in[da].setLayoutParams(params);
	          
	               in[da].setId(is);
	               act2.addView(in[da]) ;
	           is++ ;
	           
	           judet[da]=new ToggleButton(v.getContext()) ;
	            judet[da].setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
	            judet[da].setTextOn("Jude??") ;
	            judet[da].setTextOff("Sector") ;
	            judet[da].setChecked(true) ;
	            judet[da].setId(is) ;
	             is++ ;
	              act2.addView(judet[da]) ;
	               
	              sector[da]=new EditText(v.getContext()) ;
	               sector[da].setLayoutParams(params);
	          
	               sector[da].setId(is);
	               act2.addView(sector[da]) ;
	           is++ ; 
	              
	                add.addView(act2) ;
	                
	                
	                final LinearLayout act3 = new LinearLayout(v.getContext());
		    	    act3.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
		    	
	               
		    	    TextView data4=new TextView(v.getContext()) ;
		            data4.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
		               data4.setText("Domiciliat(??) ??n ") ;
		               data4.setTextSize(20);
		               act3.addView(data4) ;
	                
		               dom1[da]=new EditText(v.getContext()) ;
		               dom1[da].setLayoutParams(params);
		          
		               dom1[da].setId(is);
		               act3.addView(dom1[da]) ;
		           is++ ; 
		           
		           TextView data5=new TextView(v.getContext()) ;
		            data5.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
		               data5.setText("str. ") ;
		               data5.setTextSize(20);
		               act3.addView(data5) ;
		           
		               str[da]=new EditText(v.getContext()) ;
		               str[da].setLayoutParams(params);
		          
		               str[da].setId(is);
		               act3.addView(str[da]) ;
		           is++ ; 
		           
		           TextView data6=new TextView(v.getContext()) ;
		            data6.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
		               data6.setText("nr. ") ;
		               data6.setTextSize(20);
		               act3.addView(data6) ;
		           
		               nrs[da]=new EditText(v.getContext()) ;
		               nrs[da].setLayoutParams(params);
		               nrs[da].setRawInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_NUMBER_FLAG_DECIMAL)  ;

		               nrs[da].setId(is);
		               act3.addView(nrs[da]) ;
		           is++ ; 
		           add.addView(act3) ;
              
		           
	                final LinearLayout act4 = new LinearLayout(v.getContext());
		    	    act4.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
		    	
		    	    judet1[da]=new ToggleButton(v.getContext()) ;
		            judet1[da].setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
		            judet1[da].setTextOn("Jude??") ;
		            judet1[da].setTextOff("Sector") ;
		            judet1[da].setChecked(true) ;
		            judet1[da].setId(is) ;
		             is++ ;
		              act4.addView(judet1[da]) ;
		              
		              
		              sss[da]=new EditText(v.getContext()) ;
		               sss[da].setLayoutParams(params);
		          
		               sss[da].setId(is);
		               act4.addView(sss[da]) ;
		           is++ ; 
		           
		           ci_m[da] = new RadioButton(v.getContext());
	               ci_m[da].setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));   
 	               
	               ci_m[da].setText("CI");
 	              ci_m[da].setId(is) ;
                    act4.addView(ci_m[da]);
                    is++;
                    
                    bi_m[da] = new RadioButton(v.getContext());
                    bi_m[da].setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
 	             
                    bi_m[da].setText("BI");     
 	              bi_m[da].setId(is) ;
 	               act4.addView(bi_m[da]);
 	              is++;
 	              
		           add.addView(act4) ;
		           
		           final LinearLayout act5 = new LinearLayout(v.getContext());
		    	    act5.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
		    
	               
		    	    TextView data7=new TextView(v.getContext()) ;
		            data7.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
		               data7.setText("seria ") ;
		               data7.setTextSize(20);
		               act5.addView(data7) ;
	                
		               seria[da]=new EditText(v.getContext()) ;
		               seria[da].setLayoutParams(params);
		          
		               seria[da].setId(is);
		               act5.addView(seria[da]) ;
		           is++ ; 
		           
		           TextView data8=new TextView(v.getContext()) ;
		           data8.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
		           data8.setText("nr. ") ;
		           data8.setTextSize(20);
		               act5.addView(data8) ;
		           
		               nrser[da]=new EditText(v.getContext()) ;
		               nrser[da].setLayoutParams(params);
		               nrser[da].setRawInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_NUMBER_FLAG_DECIMAL)  ;

		               nrser[da].setId(is);
		               act5.addView(nrser[da]) ;
		           is++ ; 
		           
		           TextView data9=new TextView(v.getContext()) ;
		           data9.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
		           data9.setText("eliberat de ") ;
		           data9.setTextSize(20);
		               act5.addView(data9) ;
		           
		               elibs[da]=new EditText(v.getContext()) ;
		               elibs[da].setLayoutParams(params);
		          
		               elibs[da].setId(is);
		               act5.addView(elibs[da]) ;
		           is++ ; 
		           add.addView(act5) ;
		           
		           final LinearLayout act6 = new LinearLayout(v.getContext());
		    	    act6.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
		    	
	               
		    	    TextView data10=new TextView(v.getContext()) ;
		    	    data10.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
		    	    data10.setText("la data de ") ;
		    	    data10.setTextSize(20);
		               act6.addView(data10) ;
	                
		               datade[da]=new EditText(v.getContext()) ;
		               datade[da].setLayoutParams(params);
		               datade[da].setRawInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_NUMBER_FLAG_DECIMAL)  ;

		               datade[da].setId(is);
		               act6.addView(datade[da]) ;
		           is++ ; 
		           
		           TextView data11=new TextView(v.getContext()) ;
		           data11.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
		           data11.setText("CNP ") ;
		           data11.setTextSize(20);
		               act6.addView(data11) ;
		           
		               cnp[da]=new EditText(v.getContext()) ;
		               cnp[da].setLayoutParams(params);
		               cnp[da].setRawInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_NUMBER_FLAG_DECIMAL)  ;

		               cnp[da].setId(is);
		               act6.addView(cnp[da]) ;
		           is++ ; 
		           
		           
		           add.addView(act6) ;
		           
               da++ ;
               String s=""+da ;
               plus_membri.setText(s) ;
			}
		}) ;
         
      
   
        	
         cenzorr.setOnClickListener(new OnClickListener() {
				
		 		@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					pfl.setVisibility(View.GONE) ;
					auditorr.setChecked(false) ;
					persfizicac.setVisibility(View.GONE) ;
					persjuriticac.setVisibility(View.GONE) ;
					cend.setVisibility(View.VISIBLE) ;
					cenzord.setVisibility(View.VISIBLE) ;
				}
			});  
         
         
         pfdf.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
			pjd.setChecked(false) ;	
			supleant.setChecked(false) ;	
			}
		});
         pjd.setOnClickListener(new OnClickListener() {
 			
 			@Override
 			public void onClick(View v) {
 				// TODO Auto-generated method stub
 				pfdf.setChecked(false) ;	
 				supleant.setChecked(false) ;	
 			}
 		});
         supleant.setOnClickListener(new OnClickListener() {
 			
 			@Override
 			public void onClick(View v) {
 				// TODO Auto-generated method stub
 				pfdf.setChecked(false) ;	
 				pjd.setChecked(false) ;	
 			}
 		});
			
         cene1.setText("0") ;
         cene2.setText("0") ;
         cenb.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				 
				if(pfdf.isChecked()){
					pfdf.setChecked(false) ;
					pjd.setChecked(false) ;
					supleant.setChecked(false) ;
					
					
					LayoutParams params = new TableRow.LayoutParams(0, LayoutParams.WRAP_CONTENT, 1f);
				
					 
					TextView data0=new TextView(v.getContext()) ;
			           data0.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
			           data0.setText("Cenzor "+(un+1)+" :persoana fizica ") ;
			           
			           
			           
			           String unu1=""+(un+1) ;
			           cene1.setText(unu1) ;
			           data0.setTextSize(20);
			               cenzord.addView(data0) ;
			           
			               contor[un]=new EditText(v.getContext()) ;
			               contor[un].setLayoutParams(params);
			               contor[un].setRawInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_NUMBER_FLAG_DECIMAL)  ;
                           contor[un].setVisibility(View.GONE) ;
			               contor[un].setId(cc);
			              cc++ ;
				           contor[un].setText("1") ;
			               cenzord.addView(contor[un]) ;
			               
			               final LinearLayout act = new LinearLayout(v.getContext());
				    	    act.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
				    	
			               
				    	    TextView data=new TextView(v.getContext()) ;
				    	    data.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
				    	    data.setText("Nume ") ;
				    	    data.setTextSize(20);
				               act.addView(data) ;
			                
				               num[un]=new EditText(v.getContext()) ;
				               num[un].setLayoutParams(params);
				             
				               num[un].setId(iso);
				               act.addView(num[un]) ;
				           iso++ ;  
				           
				           TextView data1=new TextView(v.getContext()) ;
				    	    data1.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
				    	    data1.setText(" cet????ean rom??n ") ;
				    	    data1.setTextSize(20);
				               act.addView(data1) ;
				           
				           cenzord.addView(act) ;
				           
				           final LinearLayout act1 = new LinearLayout(v.getContext());
				    	    act1.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
				    	
				    	    TextView data2=new TextView(v.getContext()) ;
				    	    data2.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
				    	    data2.setText("domiciliat in ") ;
				    	    data2.setTextSize(20);
				               act1.addView(data2) ;
			                
				               domc[un]=new EditText(v.getContext()) ;
				               domc[un].setLayoutParams(params);
				             
				               domc[un].setId(iso);
				               act1.addView(domc[un]) ;
				           iso++ ;  
				           
					           TextView data3=new TextView(v.getContext()) ;
					    	    data3.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
					    	    data3.setText("str. ") ;
					    	    data3.setTextSize(20);
					               act1.addView(data3) ;
				                
					               strc[un]=new EditText(v.getContext()) ;
					               strc[un].setLayoutParams(params);
					             
					               strc[un].setId(iso);
					               act1.addView(strc[un]) ;
					               
					           iso++ ;  
				           
					           TextView data4=new TextView(v.getContext()) ;
					    	    data4.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
					    	    data4.setText("nr. ") ;
					    	    data4.setTextSize(20);
					               act1.addView(data4) ;
				                
					               nrc[un]=new EditText(v.getContext()) ;
					               nrc[un].setLayoutParams(params);
					               nrc[un].setRawInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_NUMBER_FLAG_DECIMAL)  ;
			                        
					               nrc[un].setId(iso);
					               act1.addView(nrc[un]) ;
					               
					           iso++ ;  
					           
					           cenzord.addView(act1) ;
					           
					           
					           
					           final LinearLayout act2 = new LinearLayout(v.getContext());
					    	    act2.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
					    	
					    	    
					    	    
					    	    TextView data5=new TextView(v.getContext()) ;
					    	    data5.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
					    	    data5.setText("bl. ") ;
					    	    data5.setTextSize(20);
					               act2.addView(data5) ;
				                
					               blc[un]=new EditText(v.getContext()) ;
					               blc[un].setLayoutParams(params);
					               blc[un].setText("-") ;
					               blc[un].setId(iso);
					               act2.addView(blc[un]) ;
					           iso++ ;  
					           
						           TextView data6=new TextView(v.getContext()) ;
						    	    data6.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
						    	    data6.setText("sc. ") ;
						    	    data6.setTextSize(20);
						               act2.addView(data6) ;
					                
						               scc[un]=new EditText(v.getContext()) ;
						               scc[un].setLayoutParams(params);
						               scc[un].setText("-") ;
						               scc[un].setId(iso);
						               act2.addView(scc[un]) ;
						               
						           iso++ ;  
					           
						           TextView data7=new TextView(v.getContext()) ;
						    	    data7.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
						    	    data7.setText("et. ") ;
						    	    data7.setTextSize(20);
						               act2.addView(data7) ;
					                
						               etc[un]=new EditText(v.getContext()) ;
						               etc[un].setLayoutParams(params);
						               etc[un].setText("-") ;
						               etc[un].setId(iso);
						               act2.addView(etc[un]) ;
						               
						           iso++ ;  
						           
						           TextView data8=new TextView(v.getContext()) ;
						    	    data8.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
						    	    data8.setText("ap. ") ;
						    	    data8.setTextSize(20);
						               act2.addView(data8) ;
					                
						               apc[un]=new EditText(v.getContext()) ;
						               apc[un].setLayoutParams(params);
						               apc[un].setText("-") ;
						               apc[un].setId(iso);
						               act2.addView(apc[un]) ;
						               
						           iso++ ;  
						           cenzord.addView(act2) ;
						           
						           final LinearLayout act3 = new LinearLayout(v.getContext());
						    	    act3.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
						    	    
						    	    jsc[un]=new ToggleButton(v.getContext()) ;
						    	    jsc[un].setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
						    	    jsc[un].setTextOn("jude??") ;
						    	    jsc[un].setTextOff("sector") ;
						    	    jsc[un].setChecked(true) ;
						    	    jsc[un].setId(iso) ;
						             iso++ ;
						              act3.addView(jsc[un]) ;
						              
						              
						              jsc1[un]=new EditText(v.getContext()) ;
						               jsc1[un].setLayoutParams(params);
						               jsc1[un].setId(iso);
						               act3.addView(jsc1[un]) ;
						               
						           iso++ ;  
						           
						           TextView data9=new TextView(v.getContext()) ;
						    	    data9.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
						    	    data9.setText("cu ") ;
						    	    data9.setTextSize(20);
						               act3.addView(data9) ;
						               
						               cbc[un]=new ToggleButton(v.getContext()) ;
						               cbc[un].setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
						               cbc[un].setTextOn("C.I.") ;
						               cbc[un].setTextOff("B.I.") ;
						               cbc[un].setChecked(true) ;
						               cbc[un].setId(iso) ;
							             iso++ ;
							              act3.addView(cbc[un]) ;
							              
							              TextView data10=new TextView(v.getContext()) ;
							              data10.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
							              data10.setText(" seria ") ;
							              data10.setTextSize(20);
								               act3.addView(data10) ;
							                
								               seriac[un]=new EditText(v.getContext()) ;
								               seriac[un].setLayoutParams(params);
								               seriac[un].setId(iso);
								               act3.addView(seriac[un]) ;
								               
								           iso++ ;  
						           
								           cenzord.addView(act3) ;
								           
								           final LinearLayout act4 = new LinearLayout(v.getContext());
								    	    act4.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
								    	 
								    	    TextView data11=new TextView(v.getContext()) ;
								    	    data11.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
								    	    data11.setText(" nr. ") ;
								    	    data11.setTextSize(20);
									               act4.addView(data11) ;
								                
									               nrc1[un]=new EditText(v.getContext()) ;
									               nrc1[un].setLayoutParams(params);
									               nrc1[un].setRawInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_NUMBER_FLAG_DECIMAL)  ;
								                      
									               nrc1[un].setId(iso);
									               act4.addView(nrc1[un]) ;
									               
									           iso++ ;  
									           
									           TextView data12=new TextView(v.getContext()) ;
									           data12.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
									           data12.setText("eliberat?? la ") ;
									           data12.setTextSize(20);
										               act4.addView(data12) ;
									                
										               la[un]=new EditText(v.getContext()) ;
										               la[un].setLayoutParams(params);
										               la[un].setId(iso);
										               la[un].setHint("data de");
										               la[un].setRawInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_NUMBER_FLAG_DECIMAL)  ;
									                      
										               act4.addView(la[un]) ;
										               
										               
										           iso++ ;  
										           
										           
										           TextView data13=new TextView(v.getContext()) ;
										              data13.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
										              data13.setText("p??n?? la ") ;
										              data13.setTextSize(20);
											               act4.addView(data13) ;
										                
											               panala[un]=new EditText(v.getContext()) ;
											               panala[un].setLayoutParams(params);
											               panala[un].setId(iso);
											               panala[un].setRawInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_NUMBER_FLAG_DECIMAL)  ;
										                      
											               panala[un].setHint("data de") ;
											               act4.addView(panala[un]) ;
											               
											           iso++ ;  
											           
											           cenzord.addView(act4) ;
				          
											           
											           final LinearLayout act5 = new LinearLayout(v.getContext());
											    	    act5.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
											    	
											    	    TextView data14=new TextView(v.getContext()) ;
											              data14.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
											              data14.setText("de catre ") ;
											              data14.setTextSize(20);
												               act5.addView(data14) ;
											                
												               catrec[un]=new EditText(v.getContext()) ;
												               catrec[un].setLayoutParams(params);
												               catrec[un].setId(iso);
												                   
												                act5.addView(catrec[un]) ;
												               
												           iso++ ;  
											           
												           TextView data15=new TextView(v.getContext()) ;
												              data15.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
												              data15.setText("n??scut la data de ") ;
												              data15.setTextSize(20);
													               act5.addView(data15) ;
													               
													               nascutc1[un]=new EditText(v.getContext()) ;
													               nascutc1[un].setLayoutParams(params);
													               nascutc1[un].setId(iso);
													               nascutc1[un].setRawInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_NUMBER_FLAG_DECIMAL)  ;
													                    
													                act5.addView(nascutc1[un]) ;
													                iso++ ; 
													                
													                cenzord.addView(act5) ;
													                
													                final LinearLayout act6 = new LinearLayout(v.getContext());
														    	    act6.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
														    	
														    	    TextView data16=new TextView(v.getContext()) ;
														              data16.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
														              data16.setText("??n ") ;
														              data16.setTextSize(20);
															               act6.addView(data16) ;
														                
															               inc[un]=new EditText(v.getContext()) ;
															               inc[un].setLayoutParams(params);
															               inc[un].setId(iso);
															                   
															                act6.addView(inc[un]) ;
															               
															           iso++ ;  
														           
															           TextView data17=new TextView(v.getContext()) ;
															              data17.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
															              data17.setText("Jud. ") ;
															              data17.setTextSize(20);
																               act6.addView(data17) ;
																               
																               judc[un]=new EditText(v.getContext()) ;
																               judc[un].setLayoutParams(params);
																               judc[un].setId(iso);
																                   
																                act6.addView(judc[un]) ;
																                iso++ ; 
																                
																                cenzord.addView(act6) ;
																                
																                final LinearLayout act7 = new LinearLayout(v.getContext());
																	    	    act7.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
																	    	
																	    	    TextView data18=new TextView(v.getContext()) ;
																	              data18.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
																	              data18.setText("CNP ") ;
																	              data18.setTextSize(20);
																		               act7.addView(data18) ;
																	                
																		               cnpc[un]=new EditText(v.getContext()) ;
																		               cnpc[un].setLayoutParams(params);
																		               cnpc[un].setId(iso);
																		               cnpc[un].setRawInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_NUMBER_FLAG_DECIMAL)  ;
																		                 
																		                act7.addView(cnpc[un]) ;
																		               
																		           iso++ ;  
																		           cenzord.addView(act7) ;
													                
																		           un++;
										           
					
				}else if(supleant.isChecked()){
					pfdf.setChecked(false) ;
					pjd.setChecked(false) ;
					supleant.setChecked(false) ;
					
					
					LayoutParams params = new TableRow.LayoutParams(0, LayoutParams.WRAP_CONTENT, 1f);
				
					 
					TextView data0=new TextView(v.getContext()) ;
			           data0.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
			           data0.setText("Cenzor "+(un+1)+" :membru supleant ") ;
			           
			           
			           
			           String unu1=""+(un+1) ;
			           cene1.setText(unu1) ;
			           data0.setTextSize(20);
			               cenzord.addView(data0) ;
			           
			               contor[un]=new EditText(v.getContext()) ;
			               contor[un].setLayoutParams(params);
			               contor[un].setRawInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_NUMBER_FLAG_DECIMAL)  ;
                           contor[un].setVisibility(View.GONE) ;
			               contor[un].setId(cc);
			              cc++ ;
				           contor[un].setText("3") ;
			               cenzord.addView(contor[un]) ;
			               
			               final LinearLayout act = new LinearLayout(v.getContext());
				    	    act.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
				    	
			               
				    	    TextView data=new TextView(v.getContext()) ;
				    	    data.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
				    	    data.setText("Nume ") ;
				    	    data.setTextSize(20);
				               act.addView(data) ;
			                
				               num[un]=new EditText(v.getContext()) ;
				               num[un].setLayoutParams(params);
				             
				               num[un].setId(iso);
				               act.addView(num[un]) ;
				           iso++ ;  
				           
				           TextView data1=new TextView(v.getContext()) ;
				    	    data1.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
				    	    data1.setText(" cet????ean rom??n ") ;
				    	    data1.setTextSize(20);
				               act.addView(data1) ;
				           
				           cenzord.addView(act) ;
				           
				           final LinearLayout act1 = new LinearLayout(v.getContext());
				    	    act1.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
				    	
				    	    TextView data2=new TextView(v.getContext()) ;
				    	    data2.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
				    	    data2.setText("domiciliat in ") ;
				    	    data2.setTextSize(20);
				               act1.addView(data2) ;
			                
				               domc[un]=new EditText(v.getContext()) ;
				               domc[un].setLayoutParams(params);
				             
				               domc[un].setId(iso);
				               act1.addView(domc[un]) ;
				           iso++ ;  
				           
					           TextView data3=new TextView(v.getContext()) ;
					    	    data3.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
					    	    data3.setText("str. ") ;
					    	    data3.setTextSize(20);
					               act1.addView(data3) ;
				                
					               strc[un]=new EditText(v.getContext()) ;
					               strc[un].setLayoutParams(params);
					             
					               strc[un].setId(iso);
					               act1.addView(strc[un]) ;
					               
					           iso++ ;  
				           
					           TextView data4=new TextView(v.getContext()) ;
					    	    data4.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
					    	    data4.setText("nr. ") ;
					    	    data4.setTextSize(20);
					               act1.addView(data4) ;
				                
					               nrc[un]=new EditText(v.getContext()) ;
					               nrc[un].setLayoutParams(params);
					               nrc[un].setRawInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_NUMBER_FLAG_DECIMAL)  ;
			                        
					               nrc[un].setId(iso);
					               act1.addView(nrc[un]) ;
					               
					           iso++ ;  
					           
					           cenzord.addView(act1) ;
					           
					           
					           
					           final LinearLayout act2 = new LinearLayout(v.getContext());
					    	    act2.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
					    	
					    	    
					    	    
					    	    TextView data5=new TextView(v.getContext()) ;
					    	    data5.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
					    	    data5.setText("bl. ") ;
					    	    data5.setTextSize(20);
					               act2.addView(data5) ;
				                
					               blc[un]=new EditText(v.getContext()) ;
					               blc[un].setLayoutParams(params);
					             blc[un].setText("-") ;
					               blc[un].setId(iso);
					               act2.addView(blc[un]) ;
					           iso++ ;  
					           
						           TextView data6=new TextView(v.getContext()) ;
						    	    data6.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
						    	    data6.setText("sc. ") ;
						    	    data6.setTextSize(20);
						               act2.addView(data6) ;
					                
						               scc[un]=new EditText(v.getContext()) ;
						               scc[un].setLayoutParams(params);
						               scc[un].setText("-") ;
						               scc[un].setId(iso);
						               act2.addView(scc[un]) ;
						               
						           iso++ ;  
					           
						           TextView data7=new TextView(v.getContext()) ;
						    	    data7.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
						    	    data7.setText("et. ") ;
						    	    data7.setTextSize(20);
						               act2.addView(data7) ;
					                
						               etc[un]=new EditText(v.getContext()) ;
						               etc[un].setLayoutParams(params);
						               etc[un].setText("-") ;
						               etc[un].setId(iso);
						               act2.addView(etc[un]) ;
						               
						           iso++ ;  
						           
						           TextView data8=new TextView(v.getContext()) ;
						    	    data8.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
						    	    data8.setText("ap. ") ;
						    	    data8.setTextSize(20);
						               act2.addView(data8) ;
					                
						               apc[un]=new EditText(v.getContext()) ;
						               apc[un].setLayoutParams(params);
						               apc[un].setText("-") ;
						               apc[un].setId(iso);
						               act2.addView(apc[un]) ;
						               
						           iso++ ;  
						           cenzord.addView(act2) ;
						           
						           final LinearLayout act3 = new LinearLayout(v.getContext());
						    	    act3.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
						    	    
						    	    jsc[un]=new ToggleButton(v.getContext()) ;
						    	    jsc[un].setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
						    	    jsc[un].setTextOn("jude??") ;
						    	    jsc[un].setTextOff("sector") ;
						    	    jsc[un].setChecked(true) ;
						    	    jsc[un].setId(iso) ;
						             iso++ ;
						              act3.addView(jsc[un]) ;
						              
						              
						              jsc1[un]=new EditText(v.getContext()) ;
						               jsc1[un].setLayoutParams(params);
						               jsc1[un].setId(iso);
						               act3.addView(jsc1[un]) ;
						               
						           iso++ ;  
						           
						           TextView data9=new TextView(v.getContext()) ;
						    	    data9.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
						    	    data9.setText("cu ") ;
						    	    data9.setTextSize(20);
						               act3.addView(data9) ;
						               
						               cbc[un]=new ToggleButton(v.getContext()) ;
						               cbc[un].setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
						               cbc[un].setTextOn("C.I.") ;
						               cbc[un].setTextOff("B.I.") ;
						               cbc[un].setChecked(true) ;
						               cbc[un].setId(iso) ;
							             iso++ ;
							              act3.addView(cbc[un]) ;
							              
							              TextView data10=new TextView(v.getContext()) ;
							              data10.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
							              data10.setText(" seria ") ;
							              data10.setTextSize(20);
								               act3.addView(data10) ;
							                
								               seriac[un]=new EditText(v.getContext()) ;
								               seriac[un].setLayoutParams(params);
								               seriac[un].setId(iso);
								               act3.addView(seriac[un]) ;
								               
								           iso++ ;  
						           
								           cenzord.addView(act3) ;
								           
								           final LinearLayout act4 = new LinearLayout(v.getContext());
								    	    act4.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
								    	 
								    	    TextView data11=new TextView(v.getContext()) ;
								    	    data11.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
								    	    data11.setText(" nr. ") ;
								    	    data11.setTextSize(20);
									               act4.addView(data11) ;
								                
									               nrc1[un]=new EditText(v.getContext()) ;
									               nrc1[un].setLayoutParams(params);
									               nrc1[un].setRawInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_NUMBER_FLAG_DECIMAL)  ;
								                      
									               nrc1[un].setId(iso);
									               act4.addView(nrc1[un]) ;
									               
									           iso++ ;  
									           
									           TextView data12=new TextView(v.getContext()) ;
									           data12.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
									           data12.setText("eliberat?? la ") ;
									           data12.setTextSize(20);
										               act4.addView(data12) ;
									                
										               la[un]=new EditText(v.getContext()) ;
										               la[un].setLayoutParams(params);
										               la[un].setId(iso);
										               la[un].setHint("data de");
										               la[un].setRawInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_NUMBER_FLAG_DECIMAL)  ;
									                      
										               act4.addView(la[un]) ;
										               
										               
										           iso++ ;  
										           
										           
										           TextView data13=new TextView(v.getContext()) ;
										              data13.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
										              data13.setText("p??n?? la ") ;
										              data13.setTextSize(20);
											               act4.addView(data13) ;
										                
											               panala[un]=new EditText(v.getContext()) ;
											               panala[un].setLayoutParams(params);
											               panala[un].setId(iso);
											               panala[un].setRawInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_NUMBER_FLAG_DECIMAL)  ;
										                      
											               panala[un].setHint("data de") ;
											               act4.addView(panala[un]) ;
											               
											           iso++ ;  
											           
											           cenzord.addView(act4) ;
				          
											           
											           final LinearLayout act5 = new LinearLayout(v.getContext());
											    	    act5.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
											    	
											    	    TextView data14=new TextView(v.getContext()) ;
											              data14.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
											              data14.setText("de catre ") ;
											              data14.setTextSize(20);
												               act5.addView(data14) ;
											                
												               catrec[un]=new EditText(v.getContext()) ;
												               catrec[un].setLayoutParams(params);
												               catrec[un].setId(iso);
												                   
												                act5.addView(catrec[un]) ;
												               
												           iso++ ;  
											           
												           TextView data15=new TextView(v.getContext()) ;
												              data15.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
												              data15.setText("n??scut la data de ") ;
												              data15.setTextSize(20);
													               act5.addView(data15) ;
													               
													               nascutc1[un]=new EditText(v.getContext()) ;
													               nascutc1[un].setLayoutParams(params);
													               nascutc1[un].setId(iso);
													               nascutc1[un].setRawInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_NUMBER_FLAG_DECIMAL)  ;
													                    
													                act5.addView(nascutc1[un]) ;
													                iso++ ; 
													                
													                cenzord.addView(act5) ;
													                
													                final LinearLayout act6 = new LinearLayout(v.getContext());
														    	    act6.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
														    	
														    	    TextView data16=new TextView(v.getContext()) ;
														              data16.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
														              data16.setText("??n ") ;
														              data16.setTextSize(20);
															               act6.addView(data16) ;
														                
															               inc[un]=new EditText(v.getContext()) ;
															               inc[un].setLayoutParams(params);
															               inc[un].setId(iso);
															                   
															                act6.addView(inc[un]) ;
															               
															           iso++ ;  
														           
															           TextView data17=new TextView(v.getContext()) ;
															              data17.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
															              data17.setText("Jud. ") ;
															              data17.setTextSize(20);
																               act6.addView(data17) ;
																               
																               judc[un]=new EditText(v.getContext()) ;
																               judc[un].setLayoutParams(params);
																               judc[un].setId(iso);
																                   
																                act6.addView(judc[un]) ;
																                iso++ ; 
																                
																                cenzord.addView(act6) ;
																                
																                final LinearLayout act7 = new LinearLayout(v.getContext());
																	    	    act7.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
																	    	
																	    	    TextView data18=new TextView(v.getContext()) ;
																	              data18.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
																	              data18.setText("CNP ") ;
																	              data18.setTextSize(20);
																		               act7.addView(data18) ;
																	                
																		               cnpc[un]=new EditText(v.getContext()) ;
																		               cnpc[un].setLayoutParams(params);
																		               cnpc[un].setId(iso);
																		               cnpc[un].setRawInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_NUMBER_FLAG_DECIMAL)  ;
																		                 
																		                act7.addView(cnpc[un]) ;
																		               
																		           iso++ ;  
																		           cenzord.addView(act7) ;
													                
				
																		           un++ ;
				}
				
				
				else if(pjd.isChecked()){
					pfdf.setChecked(false) ;
					pjd.setChecked(false) ;
					supleant.setChecked(false) ;
					
					
					LayoutParams params = new TableRow.LayoutParams(0, LayoutParams.WRAP_CONTENT, 1f);
				
					
					TextView data11=new TextView(v.getContext()) ;
			           data11.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
			           data11.setText("Cenzor "+(un+1)+" :persoana juridica") ;
			           
			          
			           String doi2=""+(un+1) ;
			           cene1.setText(doi2) ;
			           data11.setTextSize(20);
			               cenzord.addView(data11) ;
			               
			               contor[un]=new EditText(v.getContext()) ;
			               contor[un].setLayoutParams(params);
			               contor[un].setRawInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_NUMBER_FLAG_DECIMAL)  ;
                           contor[un].setVisibility(View.GONE) ;
			               contor[un].setId(cc);
			              cc++ ;
				           contor[un].setText("2") ;
			               cenzord.addView(contor[un]) ;
			               
			               final LinearLayout act = new LinearLayout(v.getContext());
				    	    act.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
				    	
			               
				    	    TextView data=new TextView(v.getContext()) ;
				    	    data.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
				    	    data.setText("S.C. ") ;
				    	    data.setTextSize(20);
				               act.addView(data) ;
			                
				               sc[un]=new EditText(v.getContext()) ;
				               sc[un].setLayoutParams(params);
				             
				               sc[un].setId(iso);
				               act.addView(sc[un]) ;
				           iso++ ;  
				           
				           TextView data1=new TextView(v.getContext()) ;
				    	    data1.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
				    	    data1.setText("persoan?? ") ;
				    	    data1.setTextSize(20);
				               act.addView(data1) ;
				               
				               pc[un]=new ToggleButton(v.getContext()) ;
				               pc[un].setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
				               pc[un].setTextOn("rom??n??") ;
				               pc[un].setTextOff("str??in??") ;
				               pc[un].setChecked(true) ;
				               pc[un].setId(iso) ;
					             iso++ ;
					              act.addView(pc[un]) ;
				           
				           cenzord.addView(act) ;
			               
				           final LinearLayout act1 = new LinearLayout(v.getContext());
				    	    act1.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
				    	
			               
				    	    TextView data2=new TextView(v.getContext()) ;
				    	    data2.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
				    	    data2.setText("Sediul in ") ;
				    	    data2.setTextSize(20);
				               act1.addView(data2) ;
			                
				               sediuc[un]=new EditText(v.getContext()) ;
				               sediuc[un].setLayoutParams(params);
				            
				               sediuc[un].setId(iso);
				               act1.addView(sediuc[un]) ;
				           iso++ ;  
			              
				           TextView data3=new TextView(v.getContext()) ;
				    	    data3.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
				    	    data3.setText("str. ") ;
				    	    data3.setTextSize(20);
				               act1.addView(data3) ;
			                
				               strcc[un]=new EditText(v.getContext()) ;
				               strcc[un].setLayoutParams(params);
				            
				               strcc[un].setId(iso);
				               act1.addView(strcc[un]) ;
				           iso++ ;  
				           
				           TextView data4=new TextView(v.getContext()) ;
				    	    data4.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
				    	    data4.setText("nr. ") ;
				    	    data4.setTextSize(20);
				               act1.addView(data4) ;
			                
				               nrcc[un]=new EditText(v.getContext()) ;
				              nrcc[un].setLayoutParams(params);
				              nrcc[un].setRawInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_NUMBER_FLAG_DECIMAL)  ;
		                        
				               nrcc[un].setId(iso);
				               act1.addView(nrcc[un]) ;
				               iso++ ; 
				              
			               cenzord.addView(act1) ;
			               
			               final LinearLayout act2 = new LinearLayout(v.getContext());
				    	    act2.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
				    	
			               
				    	    TextView data5=new TextView(v.getContext()) ;
				    	    data5.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
				    	    data5.setText("bl. ") ;
				    	    data5.setTextSize(20);
				               act2.addView(data5) ;
			                
				               blcc[un]=new EditText(v.getContext()) ;
				               blcc[un].setLayoutParams(params);
				            blcc[un].setText("-");
				               blcc[un].setId(iso);
				               act2.addView(blcc[un]) ;
				           iso++ ;  
			              
				           TextView data6=new TextView(v.getContext()) ;
				    	    data6.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
				    	    data6.setText("sc. ") ;
				    	    data6.setTextSize(20);
				               act2.addView(data6) ;
			                
				               sccc[un]=new EditText(v.getContext()) ;
				               sccc[un].setLayoutParams(params);
				               sccc[un].setText("-");
				               sccc[un].setId(iso);
				               act2.addView(sccc[un]) ;
				           iso++ ;  
				           
				           TextView data7=new TextView(v.getContext()) ;
				    	    data7.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
				    	    data7.setText("et. ") ;
				    	    data7.setTextSize(20);
				               act2.addView(data7) ;
			                
				               etcc[un]=new EditText(v.getContext()) ;
				              etcc[un].setLayoutParams(params);
				              etcc[un].setText("-");
				               etcc[un].setId(iso);
				               act2.addView(etcc[un]) ;
				               iso++ ; 
				               
				               TextView data8=new TextView(v.getContext()) ;
					    	    data8.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
					    	    data8.setText("ap. ") ;
					    	    data8.setTextSize(20);
					               act2.addView(data8) ;
				                
					               apcc[un]=new EditText(v.getContext()) ;
					              apcc[un].setLayoutParams(params);
					              apcc[un].setText("-");
					               apcc[un].setId(iso);
					               act2.addView(apcc[un]) ;
					               iso++ ; 
				              
			               cenzord.addView(act2) ;
				              
			               
			               final LinearLayout act3 = new LinearLayout(v.getContext());
				    	    act3.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
				    	
				    	    jscc[un]=new ToggleButton(v.getContext()) ;
				               jscc[un].setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
				               jscc[un].setTextOn("Jude??") ;
				               jscc[un].setTextOff("Sector") ;
				               jscc[un].setChecked(true) ;
				               jscc[un].setId(iso) ;
					             iso++ ;
					              act3.addView(jscc[un]) ;
				    	    
					              jscc1[un]=new EditText(v.getContext()) ;
					              jscc1[un].setLayoutParams(params);
					              
					              jscc1[un].setId(iso);
					               act3.addView(jscc1[un]) ;
					               iso++ ; 
					              
					               cenzord.addView(act3) ;
					               
					               final LinearLayout act4 = new LinearLayout(v.getContext());
						    	    act4.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
						    
						    	    TextView data9=new TextView(v.getContext()) ;
						    	    data9.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
						    	    data9.setText("??nregistrat?? la ") ;
						    	    data9.setTextSize(20);
						               act4.addView(data9) ;
					                
						               domcc[un]=new EditText(v.getContext()) ;
						              domcc[un].setLayoutParams(params);
						             
						               domcc[un].setId(iso);
						               act4.addView(domcc[un]) ;
						               iso++ ; 
					              
				               cenzord.addView(act4) ;
				               
				               final LinearLayout act5 = new LinearLayout(v.getContext());
					    	    act5.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
					    
					    	    TextView data10=new TextView(v.getContext()) ;
					    	    data10.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
					    	    data10.setText("cu j/") ;
					    	    data10.setTextSize(20);
					               act5.addView(data10) ;
				                
					               jcc[un]=new EditText(v.getContext()) ;
					              jcc[un].setLayoutParams(params);
					              jcc[un].setRawInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_NUMBER_FLAG_DECIMAL)  ;
				                    
					              jcc[un].setId(iso);
					               act5.addView(jcc[un]) ;
					               iso++ ; 
					               
					               TextView data12=new TextView(v.getContext()) ;
					               data12.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
					               data12.setText("/") ;
					               data12.setTextSize(20);
						               act5.addView(data12) ;
					                
						               jcc1[un]=new EditText(v.getContext()) ;
						               jcc1[un].setLayoutParams(params);
						               jcc1[un].setRawInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_NUMBER_FLAG_DECIMAL)  ;
					                    
						              jcc1[un].setId(iso);
						               act5.addView(jcc1[un]) ;
						               iso++ ; 
						               
						               TextView data13=new TextView(v.getContext()) ;
						               data13.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
						               data13.setText("/") ;
						               data13.setTextSize(20);
							               act5.addView(data13) ;
						                
							               jcc2[un]=new EditText(v.getContext()) ;
							               jcc2[un].setLayoutParams(params);
							               jcc2[un].setRawInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_NUMBER_FLAG_DECIMAL)  ;
						                    
							               jcc2[un].setId(iso);
							               act5.addView(jcc2[un]) ;
							               iso++ ; 
							               
							               
							               TextView data14=new TextView(v.getContext()) ;
							               data14.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
							               data14.setText(" CUI ") ;
							               data14.setTextSize(20);
								               act5.addView(data14) ;
							                
								               cuicc[un]=new EditText(v.getContext()) ;
								               cuicc[un].setLayoutParams(params);
								               cuicc[un].setRawInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_NUMBER_FLAG_DECIMAL)  ;
							                    
								               cuicc[un].setId(iso);
								               act5.addView(cuicc[un]) ;
								               iso++ ; 
					    	    
					    	    cenzord.addView(act5) ;
					    	    
					    	    final LinearLayout act6 = new LinearLayout(v.getContext());
					    	    act6.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
					    
					    	    TextView data15=new TextView(v.getContext()) ;
					               data15.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
					               data15.setText("Reprez. de ") ;
					               data15.setTextSize(20);
						               act6.addView(data15) ;
						               
						               dncc[un]=new ToggleButton(v.getContext()) ;
						               dncc[un].setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
						               dncc[un].setTextOn("D-nul") ;
						               dncc[un].setTextOff("D-na") ;
						               dncc[un].setChecked(true) ;
						               dncc[un].setId(iso) ;
							             iso++ ;
							              act6.addView(dncc[un]) ;
						               
						               
						               reprezcc[un]=new EditText(v.getContext()) ;
						               reprezcc[un].setLayoutParams(params);
						              
						               reprezcc[un].setId(iso);
						               act6.addView(reprezcc[un]) ;
						               iso++ ; 
						               
						               cenzord.addView(act6) ;
						               
						               final LinearLayout act7 = new LinearLayout(v.getContext());
							    	    act7.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
							    
							    	    TextView data16=new TextView(v.getContext()) ;
							    	    data16.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
							    	    data16.setText("domiciliat(??) ??n ") ;
							    	    data16.setTextSize(20);
							               act7.addView(data16) ;
						                
							               domacc[un]=new EditText(v.getContext()) ;
							              domacc[un].setLayoutParams(params);
							             
							               domacc[un].setId(iso);
							               act7.addView(domacc[un]) ;
							               iso++ ; 
							               
							               TextView data17=new TextView(v.getContext()) ;
							               data17.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
							               data17.setText("str. ") ;
							               data17.setTextSize(20);
								               act7.addView(data17) ;
							                
								               strcc1[un]=new EditText(v.getContext()) ;
								              strcc1[un].setLayoutParams(params);
								             
								               strcc1[un].setId(iso);
								               act7.addView(strcc1[un]) ;
								               iso++ ; 
							    	    
								               TextView data18=new TextView(v.getContext()) ;
								               data18.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
								               data18.setText("nr. ") ;
								               data18.setTextSize(20);
									               act4.addView(data18) ;
								                
									               nrcc1[un]=new EditText(v.getContext()) ;
									              nrcc1[un].setLayoutParams(params);
									              nrcc1[un].setRawInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_NUMBER_FLAG_DECIMAL)  ;
									                
									               nrcc1[un].setId(iso);
									               act7.addView(nrcc1[un]) ;
									               iso++ ; 
									               
									               cenzord.addView(act7) ;
									               
									               final LinearLayout act8 = new LinearLayout(v.getContext());
										    	    act8.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
										    	
									               
										    	    TextView data19=new TextView(v.getContext()) ;
										    	    data19.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
										    	    data19.setText("bl. ") ;
										    	    data19.setTextSize(20);
										               act8.addView(data19) ;
									                
										               blcc1[un]=new EditText(v.getContext()) ;
										               blcc1[un].setLayoutParams(params);
										            blcc1[un].setText("-");
										               blcc1[un].setId(iso);
										               act8.addView(blcc1[un]) ;
										           iso++ ;  
									              
										           TextView ata6=new TextView(v.getContext()) ;
										    	    ata6.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
										    	    ata6.setText("sc. ") ;
										    	    ata6.setTextSize(20);
										               act8.addView(ata6) ;
									                
										               sccc1[un]=new EditText(v.getContext()) ;
										               sccc1[un].setLayoutParams(params);
										               sccc1[un].setText("-");
										               sccc1[un].setId(iso);
										               act8.addView(sccc1[un]) ;
										           iso++ ;  
										           
										           TextView ata7=new TextView(v.getContext()) ;
										           ata7.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
										           ata7.setText("et. ") ;
										           ata7.setTextSize(20);
										               act8.addView(ata7) ;
									                
										               etcc1[un]=new EditText(v.getContext()) ;
										              etcc1[un].setLayoutParams(params);
										              etcc1[un].setText("-");
										               etcc1[un].setId(iso);
										               act8.addView(etcc1[un]) ;
										               iso++ ; 
										               
										               TextView ata8=new TextView(v.getContext()) ;
										               ata8.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
										               ata8.setText("ap. ") ;
										               ata8.setTextSize(20);
											               act8.addView(ata8) ;
										                
											               apcc1[un]=new EditText(v.getContext()) ;
											              apcc1[un].setLayoutParams(params);
											              apcc1[un].setText("-");
											               apcc1[un].setId(iso);
											               act8.addView(apcc1[un]) ;
											               iso++ ; 
										              
									               cenzord.addView(act8) ;
									               
									               

									               final LinearLayout act9 = new LinearLayout(v.getContext());
										    	    act9.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
										    
										    	    
											               
											               jscc11[un]=new ToggleButton(v.getContext()) ;
											               jscc11[un].setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
											               jscc11[un].setTextOn("Jude??") ;
											               jscc11[un].setTextOff("Sector") ;
											               jscc11[un].setChecked(true) ;
											               jscc11[un].setId(iso) ;
												             iso++ ;
												              act9.addView(jscc11[un]) ;
											               
											               
											               jscc22[un]=new EditText(v.getContext()) ;
											               jscc22[un].setLayoutParams(params);
											              
											               jscc22[un].setId(iso);
											               act9.addView(jscc22[un]) ;
											               iso++ ; 
											               
											              
											               
											               TextView ata15=new TextView(v.getContext()) ;
											               ata15.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
											               ata15.setText("cu  ") ;
											               ata15.setTextSize(20);
												               act9.addView(ata15) ;
												               
												               cbcc1[un]=new ToggleButton(v.getContext()) ;
												               cbcc1[un].setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
												               cbcc1[un].setTextOn("C.I.") ;
												               cbcc1[un].setTextOff("B.I.") ;
												               cbcc1[un].setChecked(true) ;
												               cbcc1[un].setId(iso) ;
													             iso++ ;
													              act9.addView(cbcc1[un]) ;
													              
													              
													              TextView ata5=new TextView(v.getContext()) ;
													              ata5.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
													              ata5.setText(" seria ") ;
													              ata5.setTextSize(20);
														               act9.addView(ata5) ;
														               
														               
														               seriacc[un]=new EditText(v.getContext()) ;
														               seriacc[un].setLayoutParams(params);
														              
														               seriacc[un].setId(iso);
														               act9.addView(seriacc[un]) ;
														               iso++ ; 
														               
														               cenzord.addView(act9) ;
														               
														               final LinearLayout act10 = new LinearLayout(v.getContext());
															    	    act10.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
															    	    
															    	    TextView ata9=new TextView(v.getContext()) ;
															    	    ata9.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
															    	    ata9.setText(" nr. ") ;
															              ata9.setTextSize(20);
																               act10.addView(ata9) ;
																               
																               
																               nrccc[un]=new EditText(v.getContext()) ;
																               nrccc[un].setLayoutParams(params);
																	              nrccc[un].setRawInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_NUMBER_FLAG_DECIMAL)  ;

																               nrccc[un].setId(iso);
																               act10.addView(nrccc[un]) ;
																               iso++ ; 
																               
																               
																               
																               
																               TextView ata12=new TextView(v.getContext()) ;
																               ata12.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
																               ata12.setText("elib. la  ") ;
																               ata12.setTextSize(20);
																		               act10.addView(ata12) ;
																		               
																		               
																		               eliblacc[un]=new EditText(v.getContext()) ;
																		               eliblacc[un].setLayoutParams(params);
																		               eliblacc[un].setRawInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_NUMBER_FLAG_DECIMAL)  ;
      eliblacc[un].setHint("data de") ;
																		               eliblacc[un].setId(iso);
																		               act10.addView(eliblacc[un]) ;
																		               iso++ ; 
																		               
																		               
																		               
																		               
																		               TextView ata14=new TextView(v.getContext()) ;
																		               ata14.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
																		               ata14.setText("pana la ") ;
																		               ata14.setTextSize(20);
																				               act10.addView(ata14) ;
																				               
																				               
																				               panalacc[un]=new EditText(v.getContext()) ;
																				               panalacc[un].setLayoutParams(params);
																				               panalacc[un].setRawInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_NUMBER_FLAG_DECIMAL)  ;
																				               panalacc[un].setHint("data de") ;
																				               panalacc[un].setId(iso);
																				               act10.addView(panalacc[un]) ;
																				               iso++ ; 
																				               
																				               cenzord.addView(act10) ;
															    	
																				               final LinearLayout act11 = new LinearLayout(v.getContext());
																					    	    act11.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
																					    	    
																					    	    TextView atat1=new TextView(v.getContext()) ;
																					    	    atat1.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
																					    	    atat1.setText(" de catre ") ;
																					    	    atat1.setTextSize(20);
																						               act11.addView(atat1) ;
																						               
																						               
																						               decatrecc[un]=new EditText(v.getContext()) ;
																						               decatrecc[un].setLayoutParams(params);
																							              
																						               decatrecc[un].setId(iso);
																						               act11.addView(decatrecc[un]) ;
																						               iso++ ; 
																						               
																						      
																						               TextView atat2=new TextView(v.getContext()) ;
																						               atat2.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
																						               atat2.setText("data nasterii ") ;
																						               atat2.setTextSize(20);
																								               act11.addView(atat2) ;
																								               
																								               
																								               datacc[un]=new EditText(v.getContext()) ;
																								               datacc[un].setLayoutParams(params);
																								               datacc[un].setRawInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_NUMBER_FLAG_DECIMAL)  ;
																									            
																								               datacc[un].setId(iso);
																								               act11.addView(datacc[un]) ;
																								               iso++ ;
												cenzord.addView(act11) ;
												
												final LinearLayout act12 = new LinearLayout(v.getContext());
									    	    act12.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
									    	  
									    	    TextView atat112=new TextView(v.getContext()) ;
									    	    atat112.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
									    	    atat112.setText(" locul nasterii ") ;
									    	    atat112.setTextSize(20);
										               act12.addView(atat112) ;
										               
										               
										               locc[un]=new EditText(v.getContext()) ;
										               locc[un].setLayoutParams(params);
											              
										               locc[un].setId(iso);
										               act12.addView(locc[un]) ;
										               iso++ ; 
										               
										               TextView atat12=new TextView(v.getContext()) ;
										               atat12.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
										               atat12.setText(" Jud. ") ;
										               atat12.setTextSize(20);
												               act12.addView(atat12) ;
												               
												               
												               judcc[un]=new EditText(v.getContext()) ;
												               judcc[un].setLayoutParams(params);
													              
												               judcc[un].setId(iso);
												               act12.addView(judcc[un]) ;
												               iso++ ; 
										               
												               cenzord.addView(act12) ;
										               final LinearLayout act13 = new LinearLayout(v.getContext());
											    	    act13.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT));
											    	  
											    	    TextView atat212=new TextView(v.getContext()) ;
											    	    atat212.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
											    	    atat212.setText(" CNP ") ;
											    	    atat212.setTextSize(20);
												               act13.addView(atat212) ;
												               
												               
												               cnpcc[un]=new EditText(v.getContext()) ;
												               cnpcc[un].setLayoutParams(params);
												               cnpcc[un].setRawInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_NUMBER_FLAG_DECIMAL)  ;
															     
												               cnpcc[un].setId(iso);
												               act13.addView(cnpcc[un]) ;
												               iso++ ; 
												               
												               cenzord.addView(act13) ;
 												
			               un++ ;
				}
				
			}
			
		}) ;
         
         auditorr.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					pfl.setVisibility(View.VISIBLE) ; 
					cenzorr.setChecked(false) ;
					cend.setVisibility(View.GONE) ;
					cenzord.setVisibility(View.GONE) ;
					
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
					admin2.setChecked(false) ;
					presedinte.setVisibility(View.VISIBLE) ;
					add.setVisibility(View.VISIBLE) ;
					switch1.setText("Pre??edinte.") ;
					add_membri.setVisibility(View.VISIBLE) ;
				}
			});  
         
         admin2.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					switch1.setText("Administrator unic.") ;
					admin1.setChecked(false) ;
					presedinte.setVisibility(View.VISIBLE) ;
					add.setVisibility(View.GONE) ;
					
					add_membri.setVisibility(View.GONE) ;
				}
			});  
          
         fasoc2p3.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					
					fasoc2p4.setChecked(false) ;
				ident="CI" ;
				}
			});  
         fasoc2p4.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					
					fasoc2p3.setChecked(false) ;
					ident="BI" ;
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
				 
				 Paragraph p1 = new Paragraph("ACTUL CONSTITUTIV AL SOCIET????II \n" +
				 		" "+txtData.getText()+" S.A.\n",paraFont);
				 p1.setAlignment(Paragraph.ALIGN_CENTER);
				 doc.add(p1) ;
				 
				 doc.add(Chunk.NEWLINE) ;
				 doc.add(Chunk.NEWLINE) ;
				 doc.add(Chunk.NEWLINE) ;
				 
				 Paragraph p2 = new Paragraph("AC??IONARI FONDATORI:",paraFont);
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
			    		
			    		Paragraph asoc2 = new Paragraph();
			    		asoc2.add(new Chunk("               S.C. "+j11.getText()+", persoan?? juridic?? "+naties+", cu sediul social ??n "+j12.getText()+", " +
			    				"??nregistrat?? la "+j1.getText()+", av??nd urm??toarele date de identificare  "+j21.getText()+", reprezentat?? de ",paraFontfor ));
			    		
			    		if(fasoc2p1.isChecked()){
			    		asoc2.add(new Chunk(Ds+"   "+j32.getText()+", " +
			    				"conform Hot??r??rii Adun??rii Generale Extraordinare a "+asac1+" nr. "+j41.getText()+" din data de "+j42.getText()+" . ",paraFontfor ));
			    		doc.add(asoc2) ;
			    		}
	    		
			    		else if(fasoc2p2.isChecked()){
			    			
			    			String strain="rom??n" ;
			    			if(sc_strain.getText().toString().isEmpty()){
				    			strain="rom??n" ;
				    		}
				    		else {
				    			strain=""+sc_strain.getText().toString() ;
				    			
				    		}
			    			asoc2.add(new Chunk(dna+" "+sc_nume.getText()+", cet????ean "+strain+", CNP "+sc_cnp.getText()+" identificat cu "+ident+", seria "+sc_seria.getText()+", nr. "+sc_nr.getText()+", eliberat de "+sc_elibde.getText()+",  " +
			    					"la data de "+sc_data.getText()+", domiciliat ??n "+sc_dom.getText()+", str. "+sc_str.getText()+", nr. "+sc_nr2.getText()+", bl "+sc_bl.getText()+", sc. "+sc_sc.getText()+", et. "+sc_et.getText()+", ap "+sc_ap.getText()+", " +
			    							"in calitate de ??mputernicit prin "+sc_impu.getText()+", nr. "+sc_nr3.getText()+", din data "+sc_data2.getText()+", ",paraFontfor ));
			    			doc.add(asoc2) ;
			    		}
			    		
			    		
			    		
			    		
				    	 
			    	}
			    	
			    	doc.add(Chunk.NEWLINE) ;
			    	
			    	int f=1 ;
			    	int j=222 ;
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
			    		ci[a].findViewById(f) ;
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
				    				"nr. "+text14[a].getText()+", eliberat de "+text15[a].getText()+", la data de "+text16[a].getText()+", CNP  "+text17[a].getText()+" ,",paraFontfor) ;
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
		    			reprezde2[a].findViewById(j) ;
		    			j++ ;
		    			text24[a].findViewById(j);
		    			j++ ;
		    			reprezde2[a].findViewById(j) ;
		    			j++  ;
		    			sc1[a].findViewById(j) ;
		    			j++  ;
		    			sc2[a].findViewById(j) ;
		    			j++  ;
		    			text233[a].findViewById(j) ;
		    			j++  ;
		    			ci_sc[a].findViewById(j) ;
		    			j++  ;
		    			bi_sc[a].findViewById(j) ;
		    			j++  ;
		    			text244[a].findViewById(j) ;
		    			j++  ;
		    			text234[a].findViewById(j) ;
		    			j++  ;
		    			text245[a].findViewById(j) ;
		    			j++  ;
		    			text246[a].findViewById(j) ;
		    			j++  ;
		    			text235[a].findViewById(j) ;
		    			j++  ;
		    			text247[a].findViewById(j) ;
		    			j++  ;
		    			text248[a].findViewById(j) ;
		    			j++ ;
		    			text336[a].findViewById(j) ;
                     	j++  ;
		    			text337[a].findViewById(j) ;
		    			j++  ;
		    			text338[a].findViewById(j) ;
		    			j++  ;
		    			text339[a].findViewById(j) ;
		    			j++  ;
		    			text249[a].findViewById(j) ;
		    			j++  ;
		    			text250[a].findViewById(j) ;
		    			j++  ;
		    			text251[a].findViewById(j) ;
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
			    		
		    			String n2="ac??ionarilor" ;
		    			if(reprezde3[a].isChecked()) {
		    				n2="ac??ionarilor" ;
		    			}else {
		    				n2="asocia??ilor" ;
		    			}
		    			
		    			String n3="D-nul" ;
		    			if(reprezde2[a].isChecked()) {
		    				n3="D-nul" ;
		    			}else {
		    				n3="D-na" ;
		    			}
		    			
		    			String cia2="CI" ;
		    			if(ci_sc[a].isChecked()) {
		    				cia2="CI" ;
		    			}else if(bi_sc[a].isChecked()) {
		    				cia2="BI" ;
		    			}
		    			
			    		if(!text18[a].getText().toString().isEmpty()){
			    			
			    			doc.add(new Chunk("??i ",paraFontfor ));
			    			
			    			Paragraph asoc2d = new Paragraph();
				    		asoc2d.add(new Chunk("               S.C. "+text18[a].getText()+", persoan?? juridic?? "+d+", cu sediul social ??n "+text19[a].getText()+", ??nregistrat?? " +
			    					"la "+text20[a].getText()+", av??nd urm??toarele date de identificare  "+text21[a].getText()+", reprezentat?? de "+n,paraFontfor ));
				    		
				    		if(!text22[a].getText().toString().isEmpty()){
				    		asoc2d.add(new Chunk(" "+text22[a].getText()+", conform Hot??r??rii Adun??rii " +
			    					"Generale Extraordinare a "+n2+" nr. "+text23[a].getText()+"  din data de "+text24[a].getText()+" . ",paraFontfor ));
				    		doc.add(asoc2d) ;
				    		}
		    		
				    		else if(!sc1[a].getText().toString().isEmpty()){
				    			
				    			String nume="rom??n" ;
				    			if(sc2[a].getText().toString().isEmpty()){
				    				 nume="rom??n" ;
				    			}else {
				    				nume=""+sc2[a].getText().toString() ;
				    			}
				    			
				    			asoc2d.add(new Chunk(n3+" "+sc1[a].getText()+", cet????ean "+nume+", CNP "+text233[a].getText()+" identificat cu "+cia2+", seria "+text244[a].getText()+", nr. "+text234[a].getText()+", eliberat de "+text245[a].getText()+",  " +
				    					"la data de "+text246[a].getText()+", domiciliat ??n "+text235[a].getText()+", str. "+text247[a].getText()+", nr. "+text248[a].getText()+", bl "+text336[a].getText()+", sc. "+text337[a].getText()+", et. "+text338[a].getText()+", ap "+text339[a].getText()+", " +
				    							"in calitate de ??mputernicit prin "+text249[a].getText()+", nr. "+text250[a].getText()+", din data "+text251[a].getText()+", ",paraFontfor ));
				    			doc.add(asoc2d) ;
			    			
			    			
			    			
			    			
				    		}
			    		}
			    		
			    	}
					 
			    	doc.add(Chunk.NEWLINE) ;
					 
			    	
			      
			      
			    
			    
			    
                 Font paraFont2 = new Font(baseFont,12);				
			     
			     
			     Paragraph p6 = new Paragraph("CAP. I ??? DENUMIREA SOCIET????II ??I SEDIUL SOCIAL",paraFont);
					 p6.setAlignment(Paragraph.ALIGN_CENTER);
					 doc.add(p6) ; 
					 
					 
			     doc.add(Chunk.NEWLINE) ;
					 
			     Paragraph p7 = new Paragraph();
			
				 p7.add(new Chunk("Art. 1.1. ",paraFont ));
				 p7.add(new Chunk("Denumirea societ????ii este: ",paraFont2 ));
				 p7.add(new Chunk(""+denumire.getText() +" S.A.",paraFont ));
				 p7.add(new Chunk(", conform dovezii privind disponibilitatea " +
				  		"firmei nr. "+disp.getText()+", din "+din.getText()+", eliberat?? de Oficiul Registrului Comer??ului de pe l??ng?? Tribunalul "+elibde.getText()+" .",paraFont2 ));
				 doc.add(p7) ;
				
				 Paragraph p8 = new Paragraph();
				 p8.add(new Chunk("Art.1.2. ",paraFont ));
				 p8.add(new Chunk("In toate actele, scrisorile sau publica??iile eman??nd de la societate, denumirea societ????ii va fi urmat?? de cuvintele ???societate pe ac??iuni??? sau de ini??ialele ???S.A.???, sediul social, capitalul social, precum ??i de num??rul de ??nmatriculare ??i codul unic de ??nregistrare.",paraFont2 ));
				 doc.add(p8) ;
				 
				 Paragraph p9 = new Paragraph();
				 p9.add(new Chunk("Art.1.3. ",paraFont ));
				 p9.add(new Chunk("Sediul societ????ii este ??n "+f71.getText()+", Str. "+f81.getText()+", nr. "+f82.getText()+", bl. "+f91.getText()+" sc. "+f92.getText()+", et. "+f93.getText()+", ap. "+f94.getText()+", "+jud+" "+f101.getText(),paraFont2 ));
				 doc.add(p9) ;
				 
				 Paragraph p10 = new Paragraph();
				 p10.add(new Chunk("Art.1.4. ",paraFont ));
				 p10.add(new Chunk("Sediul social poate fi mutat ??n orice alt loc ??n baza hot??r??rii adun??rii generale extraordinare a ac??ionarilor / deciziei consiliului de administra??ie. ",paraFont2 ));
				 doc.add(p10) ;
				 
				 Paragraph p11 = new Paragraph();
				 p11.add(new Chunk("Art.1.5. ",paraFont ));
				 p11.add(new Chunk("Societatea va putea ??nfiin??a sau desfiin??a sedii secundare - sucursale, agen??ii, reprezentan??e sau alte asemenea unit????i f??r?? personalitate juridic?? - ??n temeiul hot??r??rii adun??rii generale extraordinare a ac??ionarilor / deciziei consiliului de administra??ie.",paraFont2 ));
				 doc.add(p11) ;
				 
				 
				 doc.add(Chunk.NEWLINE) ;
				 doc.add(Chunk.NEWLINE) ;
				 
				 Paragraph cc10 = new Paragraph("CAP. II ??? FORMA JURIDIC??  A SOCIET????II",paraFont);
				 cc10.setAlignment(Paragraph.ALIGN_CENTER);
				 doc.add(cc10) ;
				 doc.add(Chunk.NEWLINE) ;
				 doc.add(Chunk.NEWLINE) ;
				 
				 
				 Paragraph p12 = new Paragraph();
				 p12.add(new Chunk("Art.2.1. ",paraFont ));
				 p12.add(new Chunk("Societatea este persoan?? juridic?? rom??n??, av??nd forma de societate pe ac??iuni ??i ????i desf????oar?? activitatea ??n conformitate cu prezentul act constitutiv, cu Legea nr. 31/1990 privind societ????ile comerciale, republicat??, cu modific??rile ??i complet??rile ulterioare, ??i cu legisla??ia rom??n?? ??n vigoare.",paraFont2 ));
				 doc.add(p12) ;
				 
				 Paragraph p13 = new Paragraph();
				 p13.add(new Chunk("Art.2.2. ",paraFont ));
				 p13.add(new Chunk("Obliga??iile sociale ale societ????ii sunt garantate cu patrimoniul social. Fiecare ac??ionar al societ????ii r??spunde numai p??n?? la concuren??a capitalului social subscris.",paraFont2 ));
				 doc.add(p13) ;
				 
				 
				 doc.add(Chunk.NEWLINE) ;
				 doc.add(Chunk.NEWLINE) ;
				 
				 Paragraph cc11 = new Paragraph("CAP. III - DURATA SOCIET????II",paraFont);
				 cc11.setAlignment(Paragraph.ALIGN_CENTER);
				 doc.add(cc11) ;
				 doc.add(Chunk.NEWLINE) ;
				 doc.add(Chunk.NEWLINE) ;
				 
				 
				
				
					
				doc.add(Chunk.NEWLINE) ;
				
				if(f51.isChecked()) {
					Paragraph p14 = new Paragraph();
					 p14.add(new Chunk("Art.3.1. ",paraFont ));
					 p14.add(new Chunk("Durata de func??ionare a societ????ii este nedeterminat??.",paraFont2 ));
					 doc.add(p14) ;
				
				}
				else if(f52.isChecked()){
					Paragraph p14 = new Paragraph();
					 p14.add(new Chunk("Art.3.1. ",paraFont ));
					 p14.add(new Chunk("Durata de func??ionare a societ????ii este pe o perioad?? de ",paraFont2 ));
					 p14.add(new Chunk(""+f61.getText() +" ani, de la data de "+f62.getText()+" p??n?? la data de" +
							f63.getText()+"",paraFont ));
					 p14.add(new Chunk(" ??i poate fi prelungit?? ??n condi??iile prev??zute de lege.",paraFont2 ));
					 doc.add(p14) ;
					
					
				}
				
                doc.add(Chunk.NEWLINE) ;
				
				
				Paragraph cc13 = new Paragraph("CAP. IV ??? OBIECTUL DE ACTIVITATE",paraFont);
				 cc13.setAlignment(Paragraph.ALIGN_CENTER);
				 doc.add(cc13) ; 
				 
				 doc.add(Chunk.NEWLINE) ;
				 doc.add(Chunk.NEWLINE) ;
				 
				 Paragraph p14 = new Paragraph();
				 p14.add(new Chunk("Art.4.1. ",paraFont ));
				 p14.add(new Chunk("Domeniul principal de activitate este "+domeniulprincipal.getText() +", c??ruia ??i corespunde grupa CAEN "+grupacaen.getText(),paraFont2 ));
				 doc.add(p14) ;
 
				 Paragraph p16 = new Paragraph();
				 p16.add(new Chunk("  - activitatea ",paraFont2 ));
				 p16.add(new Chunk("principal??: ",paraFont ));
				 p16.add(new Chunk("clasa CAEN "+grupacaen2.getText()+" "+denumirea.getText(),paraFont2 ));
				 doc.add(p16) ;
				 
				 
				 int idpl2=750 ;
				 
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
				 p18.add(new Chunk("Art. 4.2. ",paraFont ));
				 p18.add(new Chunk("Activitatea societ????ii se va putea desf????ura ??i ??n pie??e, t??rguri ??i oboare etc.",paraFont2));			
				 doc.add(p18) ;
				 
				 Paragraph p19 = new Paragraph();
				 p19.add(new Chunk("Art. 4.3. ",paraFont ));
				 p19.add(new Chunk("Societatea poate desf????ura, inclusiv, activit????i de import-export, reclam??, publicitate a produselor proprii, ob??inerea de finan????ri pentru desf????urarea activit????ilor men??ionate etc. ",paraFont2));			
				 doc.add(p19) ;
				 
				 Paragraph p20 = new Paragraph();
				 p20.add(new Chunk("Art. 4.4. ",paraFont ));
				 p20.add(new Chunk("Desf????urarea tuturor categoriilor de activit????i se va face pe baza autoriza??iilor, avizelor, aprob??rilor prev??zute de lege cu ??ncadrarea ??n standardele de calitate, respectarea normelor igienico-sanitare, de protec??ie a muncii, paz?? contra incendiilor, p??strarea calit????ii mediului ??nconjur??tor, a normelor privind dreptul de proprietate intelectual?? etc.",paraFont2));			
				 doc.add(p20) ;
				 
				 
				 doc.add(Chunk.NEWLINE) ;
				 doc.add(Chunk.NEWLINE) ;
				 
				 Paragraph cc14 = new Paragraph("CAP. V ??? CAPITALUL SOCIAL",paraFont);
				 cc14.setAlignment(Paragraph.ALIGN_CENTER);
				 doc.add(cc14) ;
				 doc.add(Chunk.NEWLINE) ;
				 doc.add(Chunk.NEWLINE) ;
				 
				if(rcap1.isChecked()){
				 Paragraph p21 = new Paragraph();
				 p21.add(new Chunk("Art. 5.1. ",paraFont ));
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
				 doc.add(new Paragraph("         ??? "+valuta.getText()+" lei, reprezent??nd "+valuta1.getText()+" "+valuta11+", la cursul B.N.R. din data de "+valuta3.getText()+", "+valuta4.getText()+"lei/1 "+valuta22+" , aport ??n numerar;",paraFont2));
				 }
				 if(!valuta6.getText().toString().isEmpty()){
				 doc.add(new Paragraph("         ??? "+valuta6.getText()+" lei, reprezent??nd  "+valuta7.getText()+", aport ??n natur??;",paraFont2));
				 }
				
	
				}
				
				else if(rcap2.isChecked()){
					
					 Paragraph p21 = new Paragraph();
					 p21.add(new Chunk("Art. 5.1. ",paraFont ));
					 p21.add(new Chunk("La constituire, capitalul social subscris al societ????ii este de "+ecap1.getText()+" lei, din care v??rsat "+ecap2.getText()+" lei (nu mai pu??in de 30% din cel subscris) la data de "+ecap3.getText()+", urm??nd ca restul de capital p??n?? la limita celui subscris s?? fie v??rsat ??n termenul legal de la data ??nmatricul??rii. ",paraFont2));			
					 doc.add(p21) ;
					 doc.add(Chunk.NEWLINE) ;
					
					
				}
				
				 doc.add(new Paragraph("Capital social subscris:",paraFont2));
			       
				 
				 if(css6.isChecked()) {
					 valuta33=" "+css7.getText().toString() ;
				 }
				 if(css12.isChecked()) {
					 valuta44=" "+css13.getText().toString() ;
				 }
				 
				
				 if(!css1.getText().toString().isEmpty()){
					 
					 doc.add(new Paragraph("         ??? "+css1.getText()+" lei, aport ??n numerar;",paraFont2));
			         }
					 if(!css2.getText().toString().isEmpty()){
					 doc.add(new Paragraph("         ??? "+css2.getText()+" lei, reprezent??nd "+css3.getText()+" "+valuta33+", la cursul B.N.R. din data de "+css8.getText()+", "+css9.getText()+" lei/1 "+valuta44+", aport ??n numerar;",paraFont2));
					 }
					 if(!css14.getText().toString().isEmpty()){
					 doc.add(new Paragraph("         ??? "+css14.getText()+" lei, reprezent??nd  "+css15.getText()+", aport ??n natur??;",paraFont2));
					 }
						 
					 doc.add(new Paragraph("Capital social v??rsat:",paraFont2));
			
						
					 if(csv6.isChecked()) {
						 valuta55=" "+csv7.getText().toString() ;
					 }
					 if(csv12.isChecked()) {
						 valuta66=" "+csv13.getText().toString() ;
					 }
					 
					
					 if(!csv1.getText().toString().isEmpty()){
						 
						 doc.add(new Paragraph("         ??? "+csv1.getText()+" lei, aport ??n numerar;",paraFont2));
				         }
						 if(!csv2.getText().toString().isEmpty()){
						 doc.add(new Paragraph("         ??? "+csv2.getText()+" lei, reprezent??nd "+csv3.getText()+" "+valuta55+", la cursul B.N.R. din data de "+csv8.getText()+", "+csv9.getText()+" lei/1 "+valuta66+", aport ??n numerar;",paraFont2));
						 }
						 if(!csv14.getText().toString().isEmpty()){
						 doc.add(new Paragraph("         ??? "+csv14.getText()+" lei, reprezent??nd  "+csv15.getText()+", aport ??n natur??;",paraFont2));
						 }
						 
						 doc.add(Chunk.NEWLINE) ;
						 doc.add(new Paragraph("  fiind ??mp??r??it ??ntr-un num??r de "+valuta8.getText()+" ac??iuni, cu o valoare nominal?? de "+valuta9.getText()+" lei/ac??iune.",paraFont2));
						 doc.add(Chunk.NEWLINE) ;
	    
					 
				 Paragraph c22 = new Paragraph();
				 c22.add(new Chunk("Art. 5.2. ",paraFont ));
				 c22.add(new Chunk("Capitalul social este de??inut de c??tre ac??ionari astfel:",paraFont2));			
				 doc.add(c22) ;
				 
									
				 
				
			    	int c=570 ;
			    	int daca=Integer.parseInt(act0.getText().toString()) ;
			    	int css=2800 ;
			    	
			    	for (int a=1; a <= daca; a++) {
			    		
			    	
			    		textcontor[a].findViewById(css);
			    		
			    		int comp=Integer.parseInt(textcontor[a].getText().toString()) ;
			    		css++ ;
			    		if(comp==1){
			    		
			    		
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
			    		c++ ;
			    		
			    		
			    		
			    		
			    			doc.add(new Paragraph("         "+a+"   Nume "+text25[a].getText()+" Prenume "+text26[a].getText()+", de??ine un num??r de  "+text27[a].getText()+" ac??iuni, cu o valoare nominal?? de " +
							 		""+text28[a].getText()+" lei/ac??iune ??i ??n valoare total?? de  "+text29[a].getText()+" lei, reprezent??nd "+text30[a].getText()+"% din capitalul social  subscris ??i v??rsat, participare la profit " +
							 		""+text31[a].getText()+"% ??i  participare la pierderi "+text32[a].getText()+"%;",paraFont2));
								
				    		
				    	
			    		}
				    
			    	 
			    		
			    		else if(comp==2){
		    			
		    			
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
			    		
			    		
			    			
			    			
			    			
			    			doc.add(new Paragraph("         "+a+"	 S.C. "+text33[a].getText()+", de??ine un num??r de "+text34[a].getText()+" ac??iuni, cu o valoare nominal?? de "+text35[a].getText()+" lei/ac??iune ??i ??n valoare total?? de " +
							 		""+text36[a].getText()+" lei, reprezent??nd "+text37[a].getText()+"% din capitalul social subscris ??i v??rsat, participare la profit "+text38[a].getText()+"% ??i participare la pierderi "+text39[a].getText()+"%;",paraFont2));
								
			    			
			    		
			    		}
			    	}
				 doc.add(Chunk.NEWLINE) ;
				 
				 
				
				
				 doc.add(Chunk.NEWLINE) ;
				 
				 Paragraph p25 = new Paragraph("CAP.VI. AC??IUNILE",paraFont);
				 p25.setAlignment(Paragraph.ALIGN_CENTER);
				 doc.add(p25) ;
				 
				 doc.add(Chunk.NEWLINE) ;
				 doc.add(Chunk.NEWLINE) ;
				 
				
				 Paragraph p26 = new Paragraph();
				 p26.add(new Chunk("Art. 6.1. ",paraFont ));
				 p26.add(new Chunk("Ac??iunile sunt numerotate de la 1 la "+num_actiuni.getText()+" .",paraFont2));		
				 doc.add(p26) ;
				 
					
				 Paragraph p27 = new Paragraph();
				 p27.add(new Chunk("Art. 6.2. ",paraFont ));
				 p27.add(new Chunk("Toate ac??iunile emise de societate sunt nominative / la purt??tor ??i indivizibile. Fiec??rui ac??ionar i se va elibera un certificat de ac??ionar care atest?? calitatea de ac??ionar ??i proprietar al ac??iunilor sau, dup?? caz, ac??iuni emise ??n form?? material??. Certificatul de ac??ionar/ac??iunea va cuprinde men??iunile prev??zute de lege.",paraFont2));			
				 doc.add(p27) ;
				 
								
				 Paragraph p28 = new Paragraph();
				 p28.add(new Chunk("Art. 6.3. ",paraFont ));
				 p28.add(new Chunk("Ac??iunile au valoare egal?? ??i confer?? posesorilor drepturi egale.",paraFont2));			
				 doc.add(p28) ;
				 
				 Paragraph p29 = new Paragraph();
				 p29.add(new Chunk("Art. 6.4. ",paraFont ));
				 p29.add(new Chunk("Societatea va ??ine eviden??a ac??iunilor ??i ac??ionarilor ??ntr-un registru care men??ioneaz?? numele ??i prenumele, codul numeric personal, denumirea, domiciliul sau sediul ac??ionarilor cu ac??iuni nominative precum ??i v??rs??mintele f??cute ??n contul ac??iunilor, precum ??i celelalte eviden??e prev??zute de art. 177 alin. (1) din Legea nr. 31/1990 privind societ????ile comerciale, republicat??, cu modific??rile ??i complet??rile ulterioare.",paraFont2));			
				 doc.add(p29) ;
				 
				 Paragraph p30 = new Paragraph();
				 p30.add(new Chunk("Art. 6.5. ",paraFont ));
				 p30.add(new Chunk("Registrele men??ionate la art. 6.4. vor fi ??inute prin grija persoanelor abilitate de lege, la sediul societ????ii.",paraFont2));			
				 doc.add(p30) ;
				 
                doc.add(Chunk.NEWLINE) ;
                doc.add(Chunk.NEWLINE) ;
				 
				 Paragraph cc15 = new Paragraph("CAP.VII. DREPTURI ??I OBLIGA??II  DECURG??ND DIN AC??IUNI",paraFont);
				 cc15.setAlignment(Paragraph.ALIGN_CENTER);
				 doc.add(cc15) ;
				 
				 doc.add(Chunk.NEWLINE) ;
				 doc.add(Chunk.NEWLINE) ;
				 
				 
				 Paragraph pp = new Paragraph();
				 pp.add(new Chunk("Art. 7.1. ",paraFont ));
				 pp.add(new Chunk("Fiecare ac??iune confer?? titularilor acestora dreptul la un vot ??n adunarea general?? a ac??ionarilor, dreptul de a alege ??i de a fi ales ??n organele de conducere, dreptul de a participa la distribuirea beneficiilor.",paraFont2));			
				 doc.add(pp) ;
				 
				 
				 Paragraph p31 = new Paragraph();
				 p31.add(new Chunk("Art. 7.2. ",paraFont ));
				 p31.add(new Chunk("De??inerea ac??iunii implic?? adeziunea de drept la dispozi??iile actului constitutiv.",paraFont2));			
				 doc.add(p31) ;
				 
				 Paragraph p32 = new Paragraph();
				 p32.add(new Chunk("Art. 7.3. ",paraFont ));
				 p32.add(new Chunk("Ac??ionarii nu r??spund pentru datoriile societ????ii, fiind obliga??i numai s?? verse capitalul social subscris.",paraFont2));			
				 doc.add(p32) ;
				 
				 
				 Paragraph p33 = new Paragraph();
				 p33.add(new Chunk("Art. 7.4. ",paraFont ));
				 p33.add(new Chunk("Drepturile ??i obliga??iile legate de ac??iuni urmeaz?? ac??iunile ??n cazul trecerii lor ??n patrimoniul altor persoane.",paraFont2));			
				 doc.add(p33) ;
				 doc.add(Chunk.NEWLINE) ;
				 doc.add(Chunk.NEWLINE) ;
				 
				 Paragraph cc16 = new Paragraph("CAP.VIII. TRANSFERUL AC??IUNILOR",paraFont);
				 cc16.setAlignment(Paragraph.ALIGN_CENTER);
				 doc.add(cc16) ;
				 
				 doc.add(Chunk.NEWLINE) ;
				 doc.add(Chunk.NEWLINE) ;
				 
				 
				 Paragraph pp1 = new Paragraph();
				 pp1.add(new Chunk("Art. 8.1. ",paraFont ));
				 pp1.add(new Chunk("Ac??iunile sunt indivizibile cu privire la societate, care nu recunoa??te dec??t un singur proprietar pentru o ac??iune.",paraFont2));			
				 doc.add(pp1) ;
				 
				 
				 Paragraph p34 = new Paragraph();
				 p34.add(new Chunk("Art. 8.2. ",paraFont ));
				 p34.add(new Chunk("Dreptul de proprietate asupra ac??iunilor se transmite conform dispozi??iilor legale ??n vigoare.",paraFont2));			
				 doc.add(p34) ;
				 
				 
				 doc.add(Chunk.NEWLINE) ;
				 doc.add(Chunk.NEWLINE) ;
				 
				 Paragraph cc17 = new Paragraph("CAP.IX. ADUN??RILE GENERALE ALE AC??IONARILOR",paraFont);
				 cc17.setAlignment(Paragraph.ALIGN_CENTER);
				 doc.add(cc17) ;
				 
				 doc.add(Chunk.NEWLINE) ;
				 doc.add(Chunk.NEWLINE) ;
				 
				 
				 Paragraph pp2 = new Paragraph();
				 pp2.add(new Chunk("Art. 9.1. ",paraFont ));
				 pp2.add(new Chunk("Adun??rile generale ale ac??ionarilor sunt ordinare ??i extraordinare.",paraFont2));			
				 doc.add(pp2) ;
				 
				 
				 Paragraph p35 = new Paragraph();
				 p35.add(new Chunk("Art. 9.2. ",paraFont ));
				 p35.add(new Chunk("Adunarea general?? ordinar?? se ??ntrune??te cel pu??in o dat?? pe an, ??n cel mult 5 luni de la ??ncheierea exerci??iului financiar.",paraFont2));			
				 doc.add(p35) ;
				 
				 
				 Paragraph p36 = new Paragraph();
				 p36.add(new Chunk("Art. 9.3. ",paraFont ));
				 p36.add(new Chunk("Adunarea general?? ordinar?? a ac??ionarilor are atribu??iile prev??zute de lege.",paraFont2));			
				 doc.add(p36) ;
				 
				 Paragraph p37 = new Paragraph();
				 p37.add(new Chunk("Art. 9.4. ",paraFont ));
				 p37.add(new Chunk("Adunarea general?? extraordinar?? a ac??ionarilor se ??ntrune??te ori de c??te ori este necesar a se lua o hot??r??re ce intr?? ??n atribu??iile sale.",paraFont2));			
				 doc.add(p37) ;
				 
				 Paragraph p38 = new Paragraph();
				 p38.add(new Chunk("Art. 9.5. ",paraFont ));
				 p38.add(new Chunk("Atribu??iile adun??rii generale extraordinare a ac??ionarilor sunt cele prev??zute de lege, cu excep??ia celor referitoare la: mutarea sediului, schimbarea obiectului de activitate al societ????ii, majorarea capitalului social, ??nfiin??area sau desfiin??area de sedii secundare - sucursale, agen??ii, reprezentan??e sau alte asemenea unit????i f??r?? personalitate juridic?? -, pe care adunarea general?? extraordinar??, ??n temeiul art. 114 alin. (1) din Legea nr. 31/1990 privind societ????ile comerciale, republicat??, cu modific??rile ??i complet??rile ulterioare, le deleag?? / le poate delega consiliului de administra??ie al societ????ii.",paraFont2));			
				 doc.add(p38) ;
				 
				 
				 doc.add(Chunk.NEWLINE) ;
				 doc.add(Chunk.NEWLINE) ;
				 
				 Paragraph cc18 = new Paragraph("CAP.IX. ADUN??RILE GENERALE ALE AC??IONARILOR",paraFont);
				 cc18.setAlignment(Paragraph.ALIGN_CENTER);
				 doc.add(cc18) ;
				 
				 doc.add(Chunk.NEWLINE) ;
				 doc.add(Chunk.NEWLINE) ;
				 
				 
				 Paragraph pp3 = new Paragraph();
				 pp3.add(new Chunk("Art. 10.1. ",paraFont ));
				 pp3.add(new Chunk("Adunarea general?? este convocat?? de administratorul societ????ii ori de c??te ori este necesar.",paraFont2));			
				 doc.add(pp3) ;
				 
				 
				 Paragraph p39 = new Paragraph();
				 p39.add(new Chunk("Art. 10.2. ",paraFont ));
				 p39.add(new Chunk("Termenul de ??ntrunire nu poate fi mai mic de 30 de zile de la publicarea convoc??rii ??n Monitorul Oficial al Rom??niei, Partea a IV-a.",paraFont2));			
				 doc.add(p39) ;
				 
				 
				 Paragraph p40 = new Paragraph();
				 p40.add(new Chunk("Art. 10.3. ",paraFont ));
				 p40.add(new Chunk("Convocarea se public?? ??n Monitorul Oficial al Rom??niei, Partea a IV-a, ??i ??n unul dintre ziarele de larg?? r??sp??ndire din localitatea ??n care se afl?? sediul societ????ii sau din cea mai apropiat?? localitate.",paraFont2));			
				 doc.add(p40) ;
				 
				 Paragraph p41 = new Paragraph();
				 p41.add(new Chunk("Art. 10.4. ",paraFont ));
				 p41.add(new Chunk("Prin excep??ie de la art. 10.2., dac?? toate ac??iunile societ????ii sunt nominative, convocarea poate fi f??cut?? prin scrisoare recomandat?? sau, prin scrisoare transmis?? pe cale electronic??, av??nd ??ncorporat??, ata??at?? sau logic asociat?? semn??tura electronic?? extins??, expediat?? cu cel pu??in 30 de zile ??nainte de data ??inerii adun??rii, la adresa ac??ionarului, ??nscris?? ??n registrul ac??ionarilor. Schimbarea adresei nu poate fi opus?? societ????ii, dac?? nu i-a fost comunicat?? ??n scris de ac??ionar.",paraFont2));			
				 doc.add(p41) ;
				 
				 Paragraph p42 = new Paragraph();
				 p42.add(new Chunk("Art. 10.5. ",paraFont ));
				 p42.add(new Chunk("Convocarea va cuprinde locul ??i data ??inerii adun??rii, precum ??i ordinea de zi, cu men??ionarea explicit?? a tuturor problemelor care vor face obiectul dezbaterilor adun??rii. ??n cazul ??n care pe ordinea de zi figureaz?? numirea administratorilor sau a membrilor consiliului de supraveghere, ??n convocare se va men??iona c?? lista cuprinz??nd informa??ii cu privire la numele, localitatea de domiciliu ??i calificarea profesional?? ale persoanelor propuse pentru func??ia de administrator se afl?? la dispozi??ia ac??ionarilor, put??nd fi consultat?? ??i completat?? de ace??tia.",paraFont2));			
				 doc.add(p42) ;
				 
				 Paragraph p43 = new Paragraph();
				 p43.add(new Chunk("Art. 10.6. ",paraFont ));
				 p43.add(new Chunk("C??nd pe ordinea de zi figureaz?? propuneri pentru modificarea actului constitutiv, convocarea va trebui s?? cuprind?? textul integral al propunerilor.",paraFont2));			
				 doc.add(p43) ;
				 
				 Paragraph p44 = new Paragraph();
				 p44.add(new Chunk("Art. 10.7. ",paraFont ));
				 p44.add(new Chunk("Administratorii ??i func??ionarii societ????ii nu pot reprezenta pe ac??ionari sub sanc??iunea nulit????ii hot??r??rii, dac?? f??r?? votul acestora nu s-ar fi ob??inut majoritatea cerut??.",paraFont2));			
				 doc.add(p44) ;
				 
				 Paragraph p45 = new Paragraph();
				 p45.add(new Chunk("Art. 10.8. ",paraFont ));
				 p45.add(new Chunk("Adunarea general?? a ac??ionarilor se ??ntrune??te la sediul societ????ii sau ??n orice alt loc din ??ar?? sau din str??in??tate indicat ??n convocare.",paraFont2));			
				 doc.add(p45) ;
				 
				 Paragraph p46 = new Paragraph();
				 p46.add(new Chunk("Art. 10.9. ",paraFont ));
				 p46.add(new Chunk("??n convocarea pentru prima adunare general?? se va putea fixa data ??i pentru a doua adunare, ??n cazul ??n care la prima adunare general?? a ac??ionarilor nu se ??ntrune??te cvorumul necesar.",paraFont2));			
				 doc.add(p46) ;
				 
				 Paragraph p47 = new Paragraph();
				 p47.add(new Chunk("Art. 10.10. ",paraFont ));
				 p47.add(new Chunk("Ac??ionarii reprezent??nd ??ntreg capitalul social vor putea, daca nici unul dintre ei nu se opune, s?? ??in?? o adunare general?? ??i s?? ia orice hot??r??re de competen??a adun??rii, f??r?? respectarea formalit????ilor cerute pentru convocarea ei, dac?? sunt prezen??i sau reprezenta??i to??i ac??ionarii.",paraFont2));			
				 doc.add(p47) ;
				 
				 
				 
				 doc.add(Chunk.NEWLINE) ;
				 doc.add(Chunk.NEWLINE) ;
				 
				 Paragraph cc20 = new Paragraph("CAP.XI. ORGANIZAREA ADUN??RII GENERALE A AC??IONARILOR",paraFont);
				 cc20.setAlignment(Paragraph.ALIGN_CENTER);
				 doc.add(cc20) ;
				 
				 doc.add(Chunk.NEWLINE) ;
				 doc.add(Chunk.NEWLINE) ;
				 
				 
				 Paragraph pp4 = new Paragraph();
				 pp4.add(new Chunk("Art. 11.1. ",paraFont ));
				 pp4.add(new Chunk("Adun??rile generale sunt valabil constituite ??i pot lua hot??r??ri dac?? sunt respectate condi??iile de cvorum prev??zute de Legea nr. 31/1990 privind societ????ile comerciale, republicat??, cu modific??rile ??i complet??rile ulterioare.",paraFont2));			
				 doc.add(pp4) ;
				 
				 
				 Paragraph p48 = new Paragraph();
				 p48.add(new Chunk("Art. 11.2. ",paraFont ));
				 p48.add(new Chunk("Adunarea general?? a ac??ionarilor este prezidat?? de c??tre administratorul societ????ii, care va desemna unul p??n?? la trei secretari care va/vor verifica lista de prezenta a ac??ionarilor, va/vor ??ntocmi procesul verbal al adun??rii ??i dup?? caz va/vor ??mp??r??i buletinele de vot, le va/vor centraliza ??i va/vor num??ra voturile.",paraFont2));			
				 doc.add(p48) ;
				 
				 
				 
				 doc.add(Chunk.NEWLINE) ;
				 doc.add(Chunk.NEWLINE) ;
				 
				 Paragraph c21 = new Paragraph("CAP.XII. EXERCITAREA DREPTULUI LA VOT ??N ADUNAREA GENERAL?? A AC??IONARILOR",paraFont);
				 c21.setAlignment(Paragraph.ALIGN_CENTER);
				 doc.add(c21) ;
				 
				 doc.add(Chunk.NEWLINE) ;
				 doc.add(Chunk.NEWLINE) ;
				 
				 Paragraph pp5 = new Paragraph();
				 pp5.add(new Chunk("Art. 12.1. ",paraFont ));
				 pp5.add(new Chunk("Dup?? constatarea ??ndeplinirii cerin??elor legale ??i ale actului constitutiv privind ??inerea adun??rii generale se va trece la dezbaterea ??i votarea fiec??rui punct de pe ordinea de zi.",paraFont2));			
				 doc.add(pp5) ;
				 
				 
				 Paragraph p49 = new Paragraph();
				 p49.add(new Chunk("Art. 12.2. ",paraFont ));
				 p49.add(new Chunk("Dreptul de vot nu poate fi cedat. Hot??r??rile adun??rilor generale se iau prin vot deschis. Votul secret este obligatoriu pentru numirea sau revocarea membrilor consiliului de administra??ie/administratorului unic, pentru numirea, revocarea cenzorilor ??i auditorilor financiari ??i pentru luarea hot??r??rilor referitoare la r??spunderea organelor de administrare, de conducere ??i control ale societ????ii.",paraFont2));			
				 doc.add(p49) ;
				 
				 Paragraph p50 = new Paragraph();
				 p50.add(new Chunk("Art. 12.3. ",paraFont ));
				 p50.add(new Chunk("Hot??r??rile adun??rii generale a ac??ionarilor se iau cu majoritatea prev??zut?? de Legea nr. 31/1990  privind societ????ile comerciale, republicat??, cu modific??rile ??i complet??rile ulterioare.",paraFont2));			
				 doc.add(p50) ;
				 
				 Paragraph p51 = new Paragraph();
				 p51.add(new Chunk("Art. 12.4. ",paraFont ));
				 p51.add(new Chunk("Hot??r??rile adun??rii generale a ac??ionarilor luate ??n condi??iile legii ??i ale actului constitutiv sunt obligatorii chiar pentru ac??ionarii absen??i sau care au votat ??mpotriv??, ??n condi??iile prev??zute de Legea nr. 31/1990 privind societ????ile comerciale, republicat??, cu modific??rile ??i complet??rile ulterioare.",paraFont2));			
				 doc.add(p51) ;
				
				 
				 
				    doc.add(Chunk.NEWLINE) ;
	                doc.add(Chunk.NEWLINE) ;
					 
					 Paragraph cc24 = new Paragraph("CAP.XIII. ADMINISTRAREA SOCIET????II",paraFont);
					 cc24.setAlignment(Paragraph.ALIGN_CENTER);
					 doc.add(cc24) ;
					 
					 doc.add(Chunk.NEWLINE) ;
					 doc.add(Chunk.NEWLINE) ;
				
					 
					 Paragraph pp6 = new Paragraph();
					 pp6.add(new Chunk("Art. 13.1. ",paraFont ));
					 pp6.add(new Chunk("Societatea este administrat?? de c??tre un consiliul de administra??ie/administrator unic ales de c??tre adunarea general?? ordinar?? a ac??ionarilor pentru un mandat de 2 ani.",paraFont2));			
					 doc.add(pp6) ;
					 
					 
					 Paragraph p52 = new Paragraph();
					 p52.add(new Chunk("Art. 13.2. ",paraFont ));
					 p52.add(new Chunk("Consiliul de administra??ie/administratorul unic poate fi revocat sau ??nlocuit oric??nd de adunarea general?? ordinar?? a ac??ionarilor societ????ii  ??i poate fi persoan?? fizic??, cet????ean rom??n sau str??in, sau persoan?? juridic??, de na??ionalitate rom??n?? sau str??in??, poate fi ac??ionar sau persoan?? din afara societ????ii.",paraFont2));			
					 doc.add(p52) ;
					 
					 Paragraph p53 = new Paragraph();
					 p53.add(new Chunk("Art. 13.3. ",paraFont ));
					 p53.add(new Chunk("Hot??r??rile adun??rii generale a ac??ionarilor se iau cu majoritatea prev??zut?? de Legea nr. 31/1990  privind societ????ile comerciale, republicat??, cu modific??rile ??i complet??rile ulterioare.",paraFont2));			
					 doc.add(p53) ;
					 
					 Paragraph p54 = new Paragraph();
					 p54.add(new Chunk("Art. 13.4. ",paraFont ));
					 p54.add(new Chunk("Consiliul de  administra??ie/administratorul unic nume??te ??i revoc?? directorul general al societ????ii, ??i stabile??te atribu??iile ??i remunera??ia.",paraFont2));			
					 doc.add(p54) ;
					 
					 Paragraph p55 = new Paragraph();
					 p55.add(new Chunk("Art. 13.5. ",paraFont ));
					 p55.add(new Chunk("??n rela??iile cu ter??ii societatea este reprezentat?? de c??tre consiliul de administra??ie/administratorul unic, " +
					 		"av??nd puteri de reprezentare ??i angajare a societ????ii. ??n ceea ce prive??te ob??inerea sau acordarea de credite, gajarea, " +
					 		"v??nzarea sau ??nchirierea bunurilor societ????ii aceste hot??r??ri se iau de c??tre consiliul de administra??ie/administratorul " +
					 		"unic indiferent de valoarea acestor opera??iuni. Consiliul de administra??ie/administratorul unic poate delega oricare dintre " +
					 		"puterile ??i atribu??iile sale directorului general sau altor persoane printr-o ??mputernicire expres??. Delegarea de atribu??ii " +
					 		"include delegarea dreptului de reprezentare al societ????ii ??n rela??iile cu ter??ii, persoane fizice, juridice , institu??ii sau " +
					 		"autorit????i ale statului.",paraFont2));			
					 doc.add(p55) ;
					 
					 
					 if(admin1.isChecked()){
						 
						 String n3="D-nul" ;
						 String dom="domiciliat" ;
			    			if(pres.isChecked()) {
			    				n3="D-nul" ;
			    				dom="domiciliat";
			    			}else {
			    				n3="D-na" ;
			    				dom="domiciliat??" ;
			    			}
			    			String da="Jude??" ;
			    			if(pres9.isChecked()){
			    				da="Jude??" ;
			    			}else {
			    				da="Sector" ;
			    			}
			    			
			    			String jud="Jude??" ;
			    			
			    			if(pres4.isChecked()){
			    				jud="Jude??" ;
			    			}
			    			else {
			    				jud="Sector" ;
			    			}
			    			 String ciadmp=" " ;
		 					 String das="" ;
							 RadioGroup radioGroupadm = (RadioGroup) findViewById(R.id.radioGroupadmpres);
					          
					          
					          int checkedRadioButtonadm = radioGroupadm.getCheckedRadioButtonId();
					           
					         
					           
					          switch (checkedRadioButtonadm) {
					            case R.id.pres11 : ciadmp="C.I. " ;
					            das="eliberat??" ;
					                             	              break;
					            case R.id.pres12 : ciadmp="B.I. ";
					                              
					                               das="eliberat" ; 
					          		                      break;
					           
					          }
						 
					 
					 Paragraph p56 = new Paragraph();
					 p56.add(new Chunk("Art. 13.6. ",paraFont ));
					 p56.add(new Chunk("La data prezentului act constitutiv este numit consiliul de administra??ie, cu urm??toarea componen????:",paraFont2));			
					 doc.add(p56) ;
					 doc.add(Chunk.NEWLINE) ;
					 
					 doc.add(new Paragraph("         "+n3+" "+pres1.getText()+", cet????ean rom??n   "+dom+
					 		" ??n "+pres6.getText()+", Str. "+pres7.getText()+" nr. "+pres8.getText()+" "+da+" "+pres10.getText()+",  identificat cu "+ciadmp+", seria "+pres13.getText()+" nr. "+pres14.getText()+" "+das+" de "+pres15.getText()+", " +
					 		"la data de "+pres16.getText()+" n??scut la data de "+pres2.getText()+" ??n "+pres3.getText()+", "+jud+" "+pres5.getText()+", CNP "+pres17.getText()+", ??n calitate de Pre??edinte.",paraFont2)) ;
					 
					 int idpl3=810 ;
					 
					 int nr2=Integer.parseInt(plus_membri.getText().toString());
					 
					 if(nr2>0){
							
						 for(int r=0;r<nr2 ;r++) {
						 
						 Dnul[r].findViewById(idpl3) ;
						 idpl3++ ;
						 nume[r].findViewById(idpl3) ;
						 idpl3++ ;
						 dn[r].findViewById(idpl3) ;
						 idpl3++ ;
						 in[r].findViewById(idpl3) ;
						 idpl3++ ;
						 judet[r].findViewById(idpl3) ;
						 idpl3++ ;
						 sector[r].findViewById(idpl3) ;
						 idpl3++ ;
						 dom1[r].findViewById(idpl3) ;
						 idpl3++ ;
						 str[r].findViewById(idpl3) ;
						 idpl3++ ;
						 nrs[r].findViewById(idpl3) ;
						 idpl3++ ;
						 judet1[r].findViewById(idpl3) ;
						 idpl3++ ;
						 sss[r].findViewById(idpl3) ;
						 idpl3++ ;
						 ci_m[r].findViewById(idpl3) ;
						 idpl3++ ;
						 bi_m[r].findViewById(idpl3) ;
						 idpl3++ ;
						 seria[r].findViewById(idpl3) ;
						 idpl3++ ;
						 nrs[r].findViewById(idpl3) ;
						 idpl3++ ;
						 elibs[r].findViewById(idpl3) ;
						 idpl3++ ;
						 datade[r].findViewById(idpl3) ;
						 idpl3++ ;
						 cnp[r].findViewById(idpl3) ;
						 idpl3++ ;
						 
						 String D="D-nul" ;
						 String dos="domiciliat" ;
						 if(Dnul[r].isChecked()){
							 D="D-nul" ;
							 dos="domiciliat" ;
						 }
						 else {
							 D="D-na" ;
							 dos="domiciliat??" ;
						 }
						 String je="Jude??" ;
						 
						 if(judet[r].isChecked()){
							 je="Jude??" ;
						 }else {
							 je="Sector" ;
						 }
                       String je1="Jude??" ;
						 
						 if(judet1[r].isChecked()){
							 je1="Jude??" ;
						 }else {
							 je1="Sector" ;
						 }
						 
						 String cica="CI" ;
                         String elib="eliberat??"  ;
								 
                         if(ci_m[r].isChecked()){
                        	 cica="CI" ;
                        	 elib="eliberat??"  ;
                         } else if(bi_m[r].isChecked()){
                        	 cica="BI" ;
                        	 elib="eliberat" ;
                         }
                        
								 
						 doc.add(new Paragraph("         "+D+" "+nume[r].getText()+", cet????ean rom??n  "+dos +
						 		" ??n "+dom1[r].getText()+", Str. "+str[r].getText()+" nr. "+nrs[r].getText()+" "+je1+" "+sss[r].getText()+",  identificat cu "+cica+", seria "+seria[r].getText()+" nr "+nrs[r].getText()+" " +
						 		" "+elib+" de "+elibs[r].getText()+" ,la data de "+datade[r].getText()+" n??scut la data de "+dn[r].getText()+" ??n "+in[r].getText()+", " +
						 		je+" "+sector[r].getText()+", CNP "+cnp[r].getText()+", ??n calitate de membru.",paraFont2)) ; 
							 
						 }
						
					 }
						else {
							
						}
				
					 
					 
					 } 
					 else if(admin2.isChecked()){
						 Paragraph p56 = new Paragraph();
						 p56.add(new Chunk("Art. 13.6. ",paraFont ));
						 p56.add(new Chunk("La data prezentului act constitutiv este numit administrator unic al societ????ii cu puteri depline :",paraFont2));			
						 doc.add(p56) ;
						 doc.add(Chunk.NEWLINE) ;
						 String n3="D-nul" ;
						 String dom="domiciliat" ;
			    			if(pres.isChecked()) {
			    				n3="D-nul" ;
			    				dom="domiciliat";
			    			}else {
			    				n3="D-na" ;
			    				dom="domiciliat??" ;
			    			}
			    			String da="Jude??" ;
			    			if(pres9.isChecked()){
			    				da="Jude??" ;
			    			}else {
			    				da="Sector" ;
			    			}
			    			
			    			String jud="Jude??" ;
			    			
			    			if(pres4.isChecked()){
			    				jud="Jude??" ;
			    			}
			    			else {
			    				jud="Sector" ;
			    			}
			    			 String ciadmp=" " ;
		 					 String das="" ;
							 RadioGroup radioGroupadm = (RadioGroup) findViewById(R.id.radioGroupadmpres);
					          
					          
					          int checkedRadioButtonadm = radioGroupadm.getCheckedRadioButtonId();
					           
					         
					           
					          switch (checkedRadioButtonadm) {
					            case R.id.pres11 : ciadmp="C.I. " ;
					            das="eliberat??" ;
					                             	              break;
					            case R.id.pres12 : ciadmp="B.I. ";
					            das="eliberat" ; 
					                               
					          		                      break;
					           
					          }
					          
					          doc.add(new Paragraph("         "+n3+" "+pres1.getText()+", cet????ean rom??n   "+dom+
								 		"??n "+pres6.getText()+", Str. "+pres7.getText()+" nr. "+pres8.getText()+" "+da+" "+pres10.getText()+",  identificat cu "+ciadmp+", seria "+pres13.getText()+" nr. "+pres14.getText()+" "+das+" de "+pres15.getText()+", " +
								 		"la data de "+pres16.getText()+" n??scut la data de "+pres2.getText()+" ??n "+pres3.getText()+", "+jud+" "+pres5.getText()+", CNP "+pres17.getText()+" .",paraFont2)) ;
								
						 
					 }
					 
					 
					 
					 
					     doc.add(Chunk.NEWLINE) ;
		                 doc.add(Chunk.NEWLINE) ;
						 
						 Paragraph cc25 = new Paragraph("CAP.XIV.  ATRIBU??IILE ORGANELOR DE ADMINISTRARE.",paraFont);
						 cc25.setAlignment(Paragraph.ALIGN_CENTER);
						 doc.add(cc25) ;
						 
						 doc.add(Chunk.NEWLINE) ;
						 doc.add(Chunk.NEWLINE) ;
					 
					 
						 Paragraph p57 = new Paragraph();
						 p57.add(new Chunk("Art.14.1. ",paraFont ));
						 p57.add(new Chunk("Principalele atribu??ii ale administratorul unic/consiliului de administra??ie sunt:",paraFont2));			
						 doc.add(p57) ;
					 
					 
						 doc.add(new Paragraph("         a. ??n baza ??mputernicirii primite de la adunarea general?? decide cu privire la: mutarea sediului societ????ii, contractarea de credite ??n numele societ????ii, extinderea obiectului de activitate al societ????ii, majorarea capitalului social.",paraFont2));
						 doc.add(new Paragraph("         b. stabilirea direc??iilor principale de activitate ??i de dezvoltare ale societ????ii;",paraFont2));
						 doc.add(new Paragraph("         c. stabilirea politicilor contabile ??i a sistemului de control financiar, precum ??i aprobarea planific??rii financiare;",paraFont2));
						 doc.add(new Paragraph("         d. numirea ??i revocarea directorilor ??i stabilirea remunera??iei lor;",paraFont2));
						 doc.add(new Paragraph("         e. supravegherea activit????ii directorilor;",paraFont2));
						 doc.add(new Paragraph("         f. preg??tirea raportului anual, organizarea adun??rii generale a ac??ionarilor ??i implementarea hot??r??rilor acesteia;",paraFont2));
						 doc.add(new Paragraph("         g. introducerea cererii pentru deschiderea procedurii insolven??ei societ????ii, potrivit Legii nr. 85/2006 privind procedura insolven??ei, cu modific??rile ??i complet??rile ulterioare.",paraFont2));
								
						 Paragraph p58 = new Paragraph();
						 p58.add(new Chunk("Art.14.2 ",paraFont ));
						 p58.add(new Chunk("Consiliul de administra??ie/administratorul unic poate delega conducerea societ????ii unuia sau mai multor directori, numind pe unul dintre ei director general, stabilind totodat?? competen??ele acestora/acestuia.",paraFont2));			
						 doc.add(p58) ;
							
					 
						 doc.add(Chunk.NEWLINE) ;
		                 doc.add(Chunk.NEWLINE) ;
						 
						 Paragraph cc26 = new Paragraph("CAP.XV. CONDUCEREA EXECUTIV??",paraFont);
						 cc26.setAlignment(Paragraph.ALIGN_CENTER);
						 doc.add(cc26) ;
						 
						 doc.add(Chunk.NEWLINE) ;
						 doc.add(Chunk.NEWLINE) ;
					 
					 
						 Paragraph p59 = new Paragraph();
						 p59.add(new Chunk("Art.15.1 ",paraFont ));
						 p59.add(new Chunk("Director al societ????ii pe ac??iuni este numai acea persoan?? c??reia i-au fost delegate atribu??ii de conducere a societ????ii. Orice alt?? persoan??, indiferent de denumirea tehnic?? a postului ocupat ??n cadrul societ????ii, este exclus?? de la aplicarea normelor prezentei legi cu privire la directorii societ????ii pe ac??iuni.",paraFont2));			
						 doc.add(p59) ;
						 
						 Paragraph p60 = new Paragraph();
						 p60.add(new Chunk("Art.15.2 ",paraFont ));
						 p60.add(new Chunk("Directorii sunt responsabili cu luarea tuturor m??surilor aferente conducerii societ????ii, ??n limitele obiectului de activitate al societ????ii ??i cu respectarea competen??elor exclusive rezervate de lege sau de actul constitutiv consiliului de administra??ie/administratorului unic ??i adun??rii generale a ac??ionarilor.",paraFont2));			
						 doc.add(p60) ;
						 
						 Paragraph p61 = new Paragraph();
						 p61.add(new Chunk("Art.15.3 ",paraFont ));
						 p61.add(new Chunk("Consiliul de administra??ie/administratorul unic este ??ns??rcinat cu supravegherea activit????ii directorilor. Orice administrator poate solicita directorilor informa??ii cu privire la conducerea operativ?? a societ????ii. Directorii vor informa administratorul unic/consiliul de administra??ie asupra opera??iunilor ??ntreprinse ??i asupra celor avute ??n vedere.",paraFont2));			
						 doc.add(p61) ;
						 
						 
						 doc.add(Chunk.NEWLINE) ;
					 
						 Paragraph p62 = new Paragraph();
						 p62.add(new Chunk("Art.15.4 ",paraFont ));
						 p62.add(new Chunk("La data prezentului act constitutiv este numit director general:",paraFont2));			
						 doc.add(p62) ;
					
						 String ciadm=" " ;
	 					 
						 RadioGroup radioGroupadm = (RadioGroup) findViewById(R.id.radioGroupadm);
				          
				          
				          int checkedRadioButtonadm = radioGroupadm.getCheckedRadioButtonId();
				           
				         
				           
				          switch (checkedRadioButtonadm) {
				            case R.id.radioadm1 : ciadm="C.I. " ;
				                             	              break;
				            case R.id.radioadm2 : ciadm="B.I. ";
				          		                      break;
				           
				          }
						 
						 
						 
						 Paragraph adm = new Paragraph();
							
						 adm.add(new Chunk(Da+adm1.getText()+", cet????ean rom??n  "+doma+" ??n "+adm5.getText()+", Str "+adm6.getText()+" nr "+adm7.getText() +" "
								 +natiea+" "+adm12.getText()+",  identificat cu "+ciadm+", seria "+adm13.getText()+" nr. "+adm14.getText()+" eliberat de "+adm15.getText()+", la data de "+adm16.getText()+" "+nascuta+" la data de " +
						 		adm2.getText()+" ??n "+adm3.getText()+", "+natiea1+" "+adm4.getText()+", CNP "+adm17.getText()+" .",paraFont2));			
						 doc.add(adm) ;
	  			 
					
					 
					 
					 
		
					 
					 
					 Paragraph adm1 = new Paragraph();
					 adm1.add(new Chunk("Art. 15.5. ",paraFont ));
					 adm1.add(new Chunk("Directorul general va avea ??n principiu urm??toarele atribu??ii :",paraFont2));			
					 doc.add(adm1) ;
					 
					 
					 doc.add(new Paragraph("         a. reprezint?? societatea ??n rela??iile cu ter??ii ??i  are puteri de decizie ??n ceea ce prive??te opera??iunile curente ale societ????ii; ",paraFont2));
					 doc.add(new Paragraph("         b. propune administratorului unic/consiliului de administra??ie strategia ??i politica comercial?? ??i de dezvoltare a societ????ii;",paraFont2));
					 doc.add(new Paragraph("         c. propune administratorului unic/consiliului de administra??ie structura  organizatoric?? a societ????ii, num??rul de posturi, precum ??i normativele de constituire a compartimentelor func??ionale ??i de produc??ie;",paraFont2));
					 doc.add(new Paragraph("         d. negociaz?? ??i semneaz?? contractul colectiv de munc?? la nivel de societate ??n baza mandatului specific acordat de administratorul unic/consiliul de administra??ie ;",paraFont2));
					 doc.add(new Paragraph("         e. ??ncheie contractele de munc?? ??n condi??iile stabilite de c??tre administratorul unic/consiliul de administra??ie ??i a Codului Muncii ??i concediaz?? personalul societ????ii;",paraFont2));
					 doc.add(new Paragraph("         f. rezolv?? orice problem?? ??ncredin??at?? de administratorul unic/consiliul de administra??ie al societ????ii.",paraFont2));
					 
					 
					
						 
						 doc.add(Chunk.NEWLINE) ;
			                doc.add(Chunk.NEWLINE) ;
							 
							 Paragraph t6 = new Paragraph("CAP.XVI. CONTROLUL GESTIUNII SOCIET????II. AUDITORUL FINANCIAR",paraFont);
							 t6.setAlignment(Paragraph.ALIGN_CENTER);
							 doc.add(t6) ;
							 
							 doc.add(Chunk.NEWLINE) ;
							 doc.add(Chunk.NEWLINE) ;
							 
								
							 if(cenzorr.isChecked()){
								 Paragraph s2 = new Paragraph();
								 s2.add(new Chunk("Art. 16.1. ",paraFont ));
								 s2.add(new Chunk("Controlul gestiunii societ????ii este asigurat de c??tre cenzorii:",paraFont2));			
								 doc.add(s2) ;
								 
								 doc.add(Chunk.NEWLINE) ;
								 int iso=1000 ;
								 int ccc=3000 ;
								 
								 int ce=Integer.parseInt(cene1.getText().toString()) ;
								 
								 for(int i=0;i<ce;i++){
								 
									 
									contor[i].findViewById(ccc) ;
									
									int con=Integer.parseInt(contor[i].getText().toString()) ;
									ccc++ ;
									if(con==1){
									
									 num[i].findViewById(iso) ;
									 iso++ ;
									 domc[i].findViewById(iso) ;
									 iso++ ;
									 strc[i].findViewById(iso) ;
									 iso++ ;
									 nrc[i].findViewById(iso) ;
									 iso++ ;
									 blc[i].findViewById(iso) ;
									 iso++ ;
									 scc[i].findViewById(iso) ;
									 iso++ ;
									 etc[i].findViewById(iso) ;
									 iso++ ;
									 apc[i].findViewById(iso) ;
									 iso++ ;
									 jsc[i].findViewById(iso) ;
									 iso++ ;
									 jsc1[i].findViewById(iso) ;
									 iso++ ;
									 cbc[i].findViewById(iso) ;
									 iso++ ;
									 seriac[i].findViewById(iso) ;
									 iso++ ;
									 nrc1[i].findViewById(iso) ;
									 iso++ ;
									 la[i].findViewById(iso) ;
									 iso++ ;
									 panala[i].findViewById(iso) ;
									 iso++ ;
									 catrec[i].findViewById(iso) ;
									 iso++ ;
									 nascutc1[i].findViewById(iso) ;
									 iso++ ;
									 inc[i].findViewById(iso) ;
									 iso++ ;
									 judc[i].findViewById(iso) ;
									 iso++ ;
									 cnpc[i].findViewById(iso) ;
									 iso++ ;
									 
									 
									 String jud="jude??" ;
									 
									 if(jsc[i].isChecked()){
										 jud="jude??" ;
										 
									 }else {
										 jud="sector" ;
									 }
									 
                                      String ci="C.I." ;
									 
									 if(cbc[i].isChecked()){
										 ci="C.I." ;
										 
									 }else {
										 ci="B.I." ;
									 }
									 
									 
									 
								 doc.add(new Paragraph( (i+1)+".    "+num[i].getText()+", cet????ean rom??n, domiciliat ??n " +
								 		domc[i].getText()+", Str. "+strc[i].getText()+", nr. "+nrc[i].getText()+" bl. "+blc[i].getText()+", sc. "+scc[i].getText()+" " +
								 		"et. "+etc[i].getText()+", ap. "+apc[i].getText()+", "+jud+" "+jsc1[i].getText()+", identificat cu "+ci+" Seria "+seriac[i].getText()+" " +
								 		"nr. "+nrc1[i].getText()+", eliberat?? la data de "+la[i].getText()+" de c??tre "+catrec[i].getText()+", " +
								 		"CNP: "+cnpc[i].getText()+" f??r?? antecedente penale, n??scut la data de "+nascutc1[i].getText()+" ??n "+inc[i].getText()+", " +
								 		"Jud. "+judc[i].getText()+", p??n?? la data de "+panala[i].getText()+" .",paraFont2)) ;
									}else if(con==3){
										
										 num[i].findViewById(iso) ;
										 iso++ ;
										 domc[i].findViewById(iso) ;
										 iso++ ;
										 strc[i].findViewById(iso) ;
										 iso++ ;
										 nrc[i].findViewById(iso) ;
										 iso++ ;
										 blc[i].findViewById(iso) ;
										 iso++ ;
										 scc[i].findViewById(iso) ;
										 iso++ ;
										 etc[i].findViewById(iso) ;
										 iso++ ;
										 apc[i].findViewById(iso) ;
										 iso++ ;
										 jsc[i].findViewById(iso) ;
										 iso++ ;
										 jsc1[i].findViewById(iso) ;
										 iso++ ;
										 cbc[i].findViewById(iso) ;
										 iso++ ;
										 seriac[i].findViewById(iso) ;
										 iso++ ;
										 nrc1[i].findViewById(iso) ;
										 iso++ ;
										 la[i].findViewById(iso) ;
										 iso++ ;
										 panala[i].findViewById(iso) ;
										 iso++ ;
										 catrec[i].findViewById(iso) ;
										 iso++ ;
										 nascutc1[i].findViewById(iso) ;
										 iso++ ;
										 inc[i].findViewById(iso) ;
										 iso++ ;
										 judc[i].findViewById(iso) ;
										 iso++ ;
										 cnpc[i].findViewById(iso) ;
										 iso++ ;
										 
										 
										 String jud="jude??" ;
										 
										 if(jsc[i].isChecked()){
											 jud="jude??" ;
											 
										 }else {
											 jud="sector" ;
										 }
										 
	                                      String ci="C.I." ;
										 
										 if(cbc[i].isChecked()){
											 ci="C.I." ;
											 
										 }else {
											 ci="B.I." ;
										 }
										 
										 
										 
									 doc.add(new Paragraph( (i+1)+".    "+num[i].getText()+", cet????ean rom??n, domiciliat ??n " +
									 		domc[i].getText()+", Str. "+strc[i].getText()+", nr. "+nrc[i].getText()+" bl. "+blc[i].getText()+", sc. "+scc[i].getText()+" " +
									 		"et. "+etc[i].getText()+", ap. "+apc[i].getText()+", "+jud+" "+jsc1[i].getText()+", identificat cu "+ci+" Seria "+seriac[i].getText()+" " +
									 		"nr. "+nrc1[i].getText()+", eliberat?? la data de "+la[i].getText()+" de c??tre "+catrec[i].getText()+", " +
									 		"CNP: "+cnpc[i].getText()+" f??r?? antecedente penale, n??scut la data de "+nascutc1[i].getText()+" ??n "+inc[i].getText()+", " +
									 		"Jud. "+judc[i].getText()+", p??n?? la data de "+panala[i].getText()+" (membru supleant).",paraFont2)) ;
										
									}
									
									else if(con==2){
										sc[i].findViewById(iso) ;
										 iso++ ;
										 pc[i].findViewById(iso) ;
										 iso++ ;
										 sediuc[i].findViewById(iso) ;
										 iso++ ;
										 strcc[i].findViewById(iso) ;
										 iso++ ;
										 nrcc[i].findViewById(iso) ;
										 iso++ ;
										 blcc[i].findViewById(iso) ;
										 iso++ ;
										 sccc[i].findViewById(iso) ;
										 iso++ ;
										 etcc[i].findViewById(iso) ;
										 iso++ ;
										 apcc[i].findViewById(iso) ;
										 iso++ ;
										 jscc[i].findViewById(iso) ;
										 iso++ ;
										 jscc1[i].findViewById(iso) ;
										 iso++ ;
										 domcc[i].findViewById(iso) ;
										 iso++ ;
										 jcc[i].findViewById(iso) ;
										 iso++ ;
										 jcc1[i].findViewById(iso) ;
										 iso++ ;
										 jcc2[i].findViewById(iso) ;
										 iso++ ;
										 cuicc[i].findViewById(iso) ;
										 iso++ ;
										 dncc[i].findViewById(iso) ;
										 iso++ ;
										 reprezcc[i].findViewById(iso) ;
										 iso++ ;
										 domacc[i].findViewById(iso) ;
										 iso++ ;
										 strcc1[i].findViewById(iso) ;
										 iso++ ;
										 nrcc1[i].findViewById(iso) ;
										 iso++ ;
										 blcc1[i].findViewById(iso) ;
										 iso++ ;
										 sccc1[i].findViewById(iso) ;
										 iso++ ;
										 etcc1[i].findViewById(iso) ;
										 iso++ ;
										 apcc1[i].findViewById(iso) ;
										 iso++ ;
										 jscc11[i].findViewById(iso) ;
										 iso++ ;
										 jscc22[i].findViewById(iso) ;
										 iso++ ;
										 cbcc1[i].findViewById(iso) ;
										 iso++ ;
										 seriacc[i].findViewById(iso) ;
										 iso++ ;
										 nrccc[i].findViewById(iso) ;
										 iso++ ;
										 eliblacc[i].findViewById(iso) ;
										 iso++ ;
										 panalacc[i].findViewById(iso) ;
										 iso++ ;
										 decatrecc[i].findViewById(iso) ;
										 iso++ ;
										 datacc[i].findViewById(iso) ;
										 iso++ ;
										 locc[i].findViewById(iso) ;
										 iso++ ;
										 judcc[i].findViewById(iso) ;
										 iso++ ;
										 cnpcc[i].findViewById(iso) ;
										 
										 String nat="rom??n??" ;
 										 if(pc[i].isChecked()){
 											nat="rom??n??" ;
 										 }else {
 											nat="str??in??" ;
 										 }
										 String jj="Jude??" ;
										 if(jscc[i].isChecked()){
											 jj="Jude??" ;
										 }else 
										 {
											 jj="Sector" ;
										 }
										 
										 String dn="d-nul" ;
										 if(dncc[i].isChecked()){
											 dn="d-nul" ;
										 }else {
											 dn="d-na" ;
										 }
										 String jj1="Jude??" ;
										 if(jscc11[i].isChecked()){
											 jj1="Jude??" ;
										 }else 
										 {
											 jj1="Sector" ;
										 }
										 String cb="C.I." ;
										 if(cbcc1[i].isChecked()){
											 cb="C.I." ;
										 }else {
											 cb="B.I." ;
										 }
										
										doc.add(new Paragraph((i+1)+".    S.C. "+sc[i].getText()+", persoan?? juridic?? "+nat+", cu" +
												"sediul social  ??n "+sediuc[i].getText()+" , str. "+strcc[i].getText()+" nr. "+nrcc[i].getText()+" , " +
								 		"bl. "+blcc[i].getText()+", sc. "+sccc[i].getText()+", et. "+etcc[i].getText()+" ap. "+apcc[i].getText()+",  "+jj+"  "+jscc1[i].getText()+", ??nregistrat?? la " +
								 		" "+domcc[i].getText()+" cu J/"+jcc[i].getText()+"/"+jcc1[i].getText()+"/"+jcc2[i].getText()+", av??nd CUI: "+cuicc[i].getText()+", " +
								 				" reprezentat?? de "+dn+" "+reprezcc[i].getText()+", cet????ean rom??n, " +
												"domiciliat?? ??n "+domacc[i].getText()+", Str. "+strcc1[i].getText()+" " +
												"nr. "+nrcc1[i].getText()+", bl. "+blcc1[i].getText()+", sc. "+sccc1[i].getText()+", et. "+etcc1[i].getText()+", ap. "+apcc1[i].getText()+", "+jj1+" "+jscc22[i].getText()+", " +
												"identificat?? cu "+cb+" Seria "+seriacc[i].getText()+", nr. "+nrcc[i].getText()+", " +
												"eliberat?? la data de "+eliblacc[i].getText()+" de c??tre "+decatrecc[i].getText()+", CNP: "+cnpcc[i].getText()+", f??r?? antecedente penale, n??scut?? la data " +
												"de "+datacc[i].getText()+" ??n "+locc[i].getText()+", Jud. "+judcc[i].getText()+", " +
												"p??n?? la data de "+panalacc[i].getText()+" ;",paraFont2)) ;
									}
								 }
							 }
							 else  
								 if(auditorr.isChecked()){
								 Paragraph s2 = new Paragraph();
								 s2.add(new Chunk("Art. 16.1. ",paraFont ));
								 s2.add(new Chunk("La data prezentului act constitutiv este numit auditor financiar:",paraFont2));			
								 doc.add(s2) ;
								 
								 doc.add(Chunk.NEWLINE) ;
								
								 
								
							 
							 
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
								  		"CNP: "+c19.getText()+", "+nascutc+" la data de "+c3.getText()+" ??n "+c4.getText()+", Jud. "+c5.getText()+", " +
								  		"p??n?? la data de "+c18.getText(),paraFont2));
									
								  
							 }
							 else if(pj.isChecked()){
								 
								String jud="Jude??" ;
								if(cj22.isChecked()){
									jud="Jude??" ;
								}else {
									jud="Sector" ;
								}
								String da="C.I." ;
								
								RadioGroup radioGroup5 = (RadioGroup) findViewById(R.id.radioGroupc);
						          
						          
						          int checkedRadioButton5 = radioGroup5.getCheckedRadioButtonId();
						           
						         
						           
						          switch (checkedRadioButton5) {
						            case R.id.radioc0 : da="C.I. " ;
						                             	              break;
						            case R.id.radioc1 : da="B.I. ";
						          		                      break;
						          		                      
						          		                      
						           
						          }

								 Paragraph s4 = new Paragraph();
								 
								 s4.add(new Chunk("S.C. "+cj1.getText()+", persoan?? juridic?? cu sediul social  ??n "+cj.getText()+" , str. "+cj2.getText()+" nr. "+cj3.getText()+" , " +
								 		"bl. "+cj4.getText()+"  , sc. "+cj5.getText()+" , et. "+cj6.getText()+" ap. "+cj7.getText()+" , "+jj+"  "+cs.getText()+", ??nregistrat?? la " +
								 		" "+cj8.getText()+" cu J/"+cj9.getText()+"/"+cj10.getText()+"/"+cj11.getText()+", av??nd CUI: "+cj12.getText()+", reprezentat?? de "+Dj+"   " +
								 		cj14.getText()+", cet????ean rom??n, domiciliat?? ??n "+cj15.getText()+", str. "+cj16.getText()+" nr. "+cj17.getText()+", bl. "+cj18.getText()+", sc. "+cj19.getText()+", " +
								 				"et. "+cj20.getText()+", ap. "+cj21.getText()+", "+jud+" "+cj23.getText()+", identificat?? cu "+da+" Seria "+cj24.getText()+", nr. "+cj25.getText()+", " +
								 				"eliberat?? la data de "+cj26.getText()+" de c??tre  "+cj28.getText()+", CNP: "+cj32.getText()+", f??r?? antecedente penale," +
								 				" n??scut?? la data de "+cj29.getText()+" ??n "+cj30.getText()+", Jud. "+cj31.getText()+", p??n?? la data de "+cj27.getText()+" ." ,paraFont2));
									
								 doc.add(s4) ;
								 
							 }
							  
							  doc.add(Chunk.NEWLINE) ;
							 
							  
							  
							  
							  
								 }
							  
							 	 doc.add(Chunk.NEWLINE) ;
					                doc.add(Chunk.NEWLINE) ;
									 
					                
									 Paragraph t12 = new Paragraph("CAP.XVII. DIZOLVAREA SOCIET????II",paraFont);
									 t12.setAlignment(Paragraph.ALIGN_CENTER);
									 doc.add(t12) ;
									 
									 doc.add(Chunk.NEWLINE) ;
									 doc.add(Chunk.NEWLINE) ;
									 
									 Paragraph t13 = new Paragraph();
									 t13.add(new Chunk("Art.17.1. ",paraFont ));
									 t13.add(new Chunk("Urm??toarele situa??ii duc la dizolvarea societ????ii:",paraFont2));			
									 doc.add(t13) ;
								 
									 doc.add(new Paragraph("         a) imposibilitatea realiz??rii obiectului de activitate al societ????ii sau realizarea acestuia;",paraFont2));
									 doc.add(new Paragraph("         b) faliment;",paraFont2));
									 doc.add(new Paragraph("         c) pierderea unei jum??t????i din capitalul social, dup?? ce s-a consumat fondul de rezerv??, dac?? adunarea general?? a ac??ionarilor nu decide completarea capitalului sau reducerea lui la suma r??mas??;",paraFont2));
									 doc.add(new Paragraph("         d) dac?? num??rul de ac??ionari va fi sub 2, mai mult de 9 luni;",paraFont2));
									 doc.add(new Paragraph("         e) ??n orice alt?? situa??ie, pe baza hot??r??rii adun??rii generale a ac??ionarilor.",paraFont2));
										
									 Paragraph t14 = new Paragraph();
									 t14.add(new Chunk("Art. 17.2. ",paraFont ));
									 t14.add(new Chunk("C??nd datorit?? decesului unui ac??ionar, num??rul minim de ac??ionari va fi sub cel prev??zut de lege, societatea ????i va continua activitatea cu mo??tenitorii defunctului.",paraFont2));			
									 doc.add(t14) ;
									 
									
										
									 Paragraph t15 = new Paragraph();
									 t15.add(new Chunk("Art. 17.3. ",paraFont ));
									 t15.add(new Chunk("Dizolvarea societ????ii are ca efect deschiderea procedurii lichid??rii. Dizolvarea are loc f??r?? lichidare ??n cazul fuziunii ori diviz??rii totale a societ????ii sau ??n alte cazuri prev??zute de lege.",paraFont2));			
									 doc.add(t15) ;
									 
											
									 Paragraph t16 = new Paragraph();
									 t16.add(new Chunk("Art. 17.4. ",paraFont ));
									 t16.add(new Chunk("Dizolvarea societ????ii trebuie s?? fie ??nscris?? ??n registrul comer??ului ??i publicat?? ??n Monitorul Oficial al Rom??niei, Partea a IV ??? a, conform prevederilor legale ??n vigoare.",paraFont2));			
									 doc.add(t16) ;
									 
									 
								
									 
									 doc.add(Chunk.NEWLINE) ;
						                doc.add(Chunk.NEWLINE) ;
										 
						                
										 Paragraph t30 = new Paragraph("CAP.XVIII. LICHIDAREA SOCIET????II",paraFont);
										 t30.setAlignment(Paragraph.ALIGN_CENTER);
										 doc.add(t30) ;
										 
										 doc.add(Chunk.NEWLINE) ;
										 doc.add(Chunk.NEWLINE) ;
									 
										 
										 Paragraph t31 = new Paragraph();
										 t31.add(new Chunk("Art. 18.1. ",paraFont ));
										 t31.add(new Chunk("Societatea fiind dizolvat??, lichidatorii numi??i trebuie s?? ??nceap?? procedura de lichidare ??n conformitate cu dispozi??iile Legii nr. 31/1990 privind societ????ile comerciale, republicat??, cu modific??rile ??i complet??rile ulterioare.",paraFont2));			
										 doc.add(t31) ;
										 
										 Paragraph t32 = new Paragraph();
										 t32.add(new Chunk("Art. 18.2. ",paraFont ));
										 t32.add(new Chunk("Lichidatorii vor putea fi persoane fizice sau juridice rom??ne sau str??ine, autorizate ??n condi??iile legii. Lichidarea societ????ii ??i reparti??ia patrimoniului se fac ??n condi??iile ??i cu respectarea procedurii prev??zute de lege.",paraFont2));			
										 doc.add(t32) ;
									 
										 
										 
										 
										 doc.add(Chunk.NEWLINE) ;
							                doc.add(Chunk.NEWLINE) ;
											 
							                
											 Paragraph t40 = new Paragraph("CAP.XIX. DISPOZI??II FINALE",paraFont);
											 t40.setAlignment(Paragraph.ALIGN_CENTER);
											 doc.add(t40) ;
											 
											 doc.add(Chunk.NEWLINE) ;
											 doc.add(Chunk.NEWLINE) ;
											 
											 
											 Paragraph t41 = new Paragraph();
											 t41.add(new Chunk("Art. 19.1. ",paraFont ));
											 t41.add(new Chunk("Orice litigiu rezult??nd din sau referitor la prezentul act constitutiv, ori la ??nc??lcarea prezentului act constitutiv va fi solu??ionat de instan??ele judec??tore??ti competente.",paraFont2));			
											 doc.add(t41) ;
											 
											 
											 Paragraph t42 = new Paragraph();
											 t42.add(new Chunk("Art. 19.2. ",paraFont ));
											 t42.add(new Chunk("Prevederile prezentului act constitutiv se completeaz?? cu dispozi??iile legale referitoare la societ????ile comerciale ??i alte prevederi legale ??n vigoare.",paraFont2));			
											 doc.add(t42) ;
											 
											 doc.add(Chunk.NEWLINE) ;
											 
											 Paragraph data = new Paragraph();
											 data.add(new Chunk("Data ",paraFont2 ));
											 data.setAlignment(Paragraph.ALIGN_LEFT) ;
											 doc.add(data) ;
											 Paragraph data1 = new Paragraph();
											 data1.add(new Chunk("Semn??tur?? ac??ionari ",paraFont2));	
											 data1.setAlignment(Paragraph.ALIGN_RIGHT) ;
											 doc.add(data1) ;
											 doc.add(Chunk.NEWLINE) ;
											 
											 for(int a=1;a< heightInt;a++ ){
												 
												 Paragraph data2 = new Paragraph();
												 data2.add(new Chunk("Semn??tur?? ac??ionari ",paraFont2));	
												 data2.setAlignment(Paragraph.ALIGN_RIGHT) ;
												 doc.add(data2) ;
												 doc.add(Chunk.NEWLINE) ;
											 }
										 
											 doc.close();
											 
											  
										      
										       
										        
										        // step 3
										       
										      
										    

										 
			} catch (DocumentException de) {
				Log.e("PDFCreator", "DocumentException:" + de);
			} catch (IOException e) {
				Log.e("PDFCreator", "ioException:" + e);
			} finally {
				
			}
			
			
	    }
        
	    
	    	

	}
	    
