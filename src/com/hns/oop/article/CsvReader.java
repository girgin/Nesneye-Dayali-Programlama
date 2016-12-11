package com.hns.oop.article;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class CsvReader {
    
    private final BufferedReader br;
    
    public CsvReader(String csvFile) throws FileNotFoundException {
        br = new BufferedReader(new FileReader(csvFile));
    }
    
    public String[] next() throws IOException{
        String line = br.readLine();
        if (line == null)
            return null;
        return parse(line);
    }
    
    private String[] parse(String str){
        ArrayList<String> al = new ArrayList();
        
        char[] c = str.toCharArray();
        int i = 0;
        
        while(true){
            StringBuilder sb = new StringBuilder();
            if(c[i] == '\"'){
                i++;
                while(c[i]!='\"'){
                    sb.append(c[i]);
                    i++;
                }
                i++;
            }
            else{
                while(c[i]!=',' && c[i]!='\0'){
                    sb.append(c[i]);
                    i++;
                }
            }
            al.add(sb.toString());
            if(i==c.length)
                break;
            i++;
        }
        
        return al.toArray(new String[0]);
    }
}
