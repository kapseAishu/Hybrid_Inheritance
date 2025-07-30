package com.prime.java.Hybridinheritance;

public class MainWhatsapp {

	public static void main(String[] args) {
		Whatsapp w=new Whatsapp ();
		w.open();
		
		Charts ch=new Charts();
		ch.message();
		ch.open();
		
		Status s=new Status();
		s.watch();
		s.open();
		
	    Calls c=new Calls();
	    c.phoneCall();
	    c.open();
	    
	    VideoCall v=new VideoCall();
	    v.call1();
	    v.open();
	    v.phoneCall();
	    
	    
	    AudioCall a=new AudioCall();
	    a.call2();
	    a.open();
	    a.phoneCall();
	  
		
        
	}

}
