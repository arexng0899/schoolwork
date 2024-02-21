// CSC 1302 Alex Ng Homework 4 Online Section

import java.nio.file.*;
import java.io.*;
import java.nio.channels.FileChannel;
import java.nio.ByteBuffer;
import static java.nio.file.StandardOpenOption.*;
import java.util.Scanner;

   public class SeekPosition 
   {
      public static void main(String[] args) 
      {
         String fileName;
         int filePosition;
         Scanner user = new Scanner(System.in);
         RandomAccessFile raf = null;
         
         System.out.println("Enter file name: ");
         fileName = user.nextLine();
         System.out.println("Enter file position: ");
         filePosition = Integer.parseInt(user.nextLine());
            
            try
            {
               raf = new RandomAccessFile(new File(fileName), "rw");
               raf.seek(filePosition);
               System.out.println("Next 10 characters from given position: ");
               
                  for(int i = 0; i < 10; i++)
                  {
                     byte a = raf.readByte();
                     System.out.print((char)a);
                  }
            }
               
               catch(FileNotFoundException e)
               {
                  System.out.println(e.getMessage());
               }
               
               catch(IOException e)
               {
                  System.out.println(e.getMessage());
               }
      }
   }