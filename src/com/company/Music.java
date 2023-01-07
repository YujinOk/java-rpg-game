package com.company;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;


public class Music extends Thread{
    private boolean isLoop;
    private File fileName;
    InputStream music;
    public Music(String name, boolean isLoop){
     try{

         this.fileName= new File(Main.class.getResource("../Music/" + name).toURI());
         this.music= new FileInputStream(fileName);

     }catch (Exception e){
         System.out.println(e);
     }
    }
}
