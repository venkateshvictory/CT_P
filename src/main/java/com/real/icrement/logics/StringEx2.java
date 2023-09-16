package com.real.icrement.logics;

public class StringEx2 {
	public static void main(String[] args) {
		
		// S1 refers to Object in the Heap Area                                // subString include start include end
        // Line-1
        String s1 = new String("GFG");
 
        // S2 now refers to Object in SCP Area
        // Line-2
        String s2 = s1.concat("GFG");                                       // heap                         //scp
        System.out.println(s2);                                          //s1 => GFG                          s2=s3=s4=>GFGGFG                   
        
        // S3 refers to Object in SCP Area
        // Line-3
        String s3 = s2.intern();
 
        System.out.println(s2 == s3);
 
        // S4 refers to Object in the SCP Area
        // Line-4
        String s4 = "GFGGFG";
 
        System.out.println(s3 == s4);
	

	
	
	

}}
