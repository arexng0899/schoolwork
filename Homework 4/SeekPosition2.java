// CSC 1302 Alex Ng Homework 4 Online Section

import java.nio.file.*;
import java.io.*;
import java.nio.channels.FileChannel;
import java.nio.ByteBuffer;
import static java.nio.file.StandardOpenOption.*;
import java.util.Scanner;

   public class SeekPosition2 
   {
      public static void main(String[] args) 
      {
         String fileName;
         int filePosition;
         int request;
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
               System.out.println("Enter number of characters to display: ");
               request = user.nextInt();
               
                  for(int i = 0; i < request; i++)
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

