package com.rohit; 

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class CheckRecordSize {                 
    
	public static void main(String[] args) throws IOException {
	
        FileInputStream fstream = new FileInputStream("C:\\Users\\n0281359\\Desktop\\Error Feeds\\ofac_integrity_py.dat");
        BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
        String strLine;
        int i=1;

        ArrayList<Integer> not=new ArrayList<Integer>();
		
        while ((strLine = br.readLine()) != null)   
		{
        	if(strLine.getBytes().length != 198 )
			{
     		not.add(i);
			}
		i++;                                                                                                                                                                
        }
        
		System.out.println(not);
        System.out.println(not.size());
        br.close();
                                                
        }

    }

