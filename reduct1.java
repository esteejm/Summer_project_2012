import java.util.Scanner;
import java.io.*;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRichTextString;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;

import java.util.Scanner;
import java.io.*;
public class reduct1 extends operation1 {
    public static void displayFromExcel (String xlsPath, String[][] str)
	{
	InputStream inputStream = null;

	try
	{
	inputStream = new FileInputStream (xlsPath);
	}
	catch (FileNotFoundException e)
	{
	System.out.println ("File not found in the specified path.");
	e.printStackTrace ();
	}

	POIFSFileSystem fileSystem = null;

	try
	{
	fileSystem = new POIFSFileSystem (inputStream);

	HSSFWorkbook      workBook = new HSSFWorkbook (fileSystem);
	HSSFSheet         sheet    = workBook.getSheetAt (0);
	Iterator<Row> rows     = sheet.rowIterator ();
int i, j;
	while (rows.hasNext ())
	{
	HSSFRow row = (HSSFRow) rows.next ();

	// display row number in the console.
	//System.out.println ("Row No.: " + row.getRowNum ());
   i= row.getRowNum();
	// once get a row its time to iterate through cells.
	Iterator<Cell> cells = row.cellIterator ();

	while (cells.hasNext ())
	   {
	HSSFCell cell = (HSSFCell) cells.next ();
     //System.out.println ("Cell No.: " + cell.getCellNum ());
    j= cell.getCellNum();

	 // Now we will get the cell type and display the values
	 // accordingly.
    cell.setCellType(Cell.CELL_TYPE_STRING);
    if(j<m&&i<n)                                                  //to prevent arrayOutofBound
       {str[i][j]= cell.getRichStringCellValue().getString();}
      }
	}
	}
	catch (IOException e)
	 {
	   e.printStackTrace ();
	 }
	}

public static void main(String args[]){
    String xlsPath    = "F://IMPORT{java}//eclipse wrkbench for java files//reduct//src//project.xls";
    System.out.println("enter no. of attributes and objects");
    Scanner sc= new Scanner(System.in);
    m=sc.nextInt();
    n=sc.nextInt();
    String str[][]= new String[n][m];
  displayFromExcel (xlsPath,str);
   for(int i=0;i<n;i++)
   {
       
       for(int j=i+1;j<n;j++)
       {String temp=new String();
           if(!((str[i][m-1]).equals(str[j][m-1])))
           {
               for(int k=0;k<(m-1);k++)
               {
                   if(!((str[i][k]).equals(str[j][k])))
                   {
                       char ch=(char)(97+k);
                       temp=temp+Character.toString(ch);
                       //System.out.println("temp ==\t"+temp+"at r.no."+i+" n c.no "+k);
                   }
               }

               v.addElement(temp);
           }
           
           }
       }

  operation1 o = new operation1();
  //System.out.println("vector before absorption" );
  for(int i=0;i<v.size();i++)
  {
	  System.out.println(v.get(i));
  }
   o.absorption(v);
  
   o.expansion();
   System.gc();
    o.absorption(red1);
    System.gc();
   o.absorption(red2);
   System.gc();
   o.compute(red1);
   System.gc();
  o.compute(red2);
   System.out.println("*****THE END****");   
}
}
