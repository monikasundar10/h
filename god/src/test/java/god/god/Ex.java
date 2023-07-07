//package god.god;
//
//import java.io.IOException;
//
//import org.apache.poi.xssf.usermodel.XSSFSheet;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//
//public class Ex {
//	//ublic static void main(String[] args) throws IOException - we are going to change as normal method 
//	
//	
//	public  static String[][] readData() throws IOException{
////step1: set up the path for the work book
//XSSFWorkbook wb= new XSSFWorkbook("./data/CreateLead.xlsx");
////step2:Get in to the respective sheet
//XSSFSheet ws=wb.getSheet("Sheet1");//using sheet name
//////step3:Get into the  respective row
////XSSFRow row =ws.getRow(1);
//////step4:get into the respective cell
////XSSFCell cell=row.getCell(0);
//////step5: to read data from the cell
////String cellValue =cell.getStringCellValue();
////System.out.println(cellValue);
////
////To read all the data from 1 st   coloumn  "first name"
////
////for(int i=1;i<=2;i++) {
////	//step3:Get into the  respective row
////	//XSSFRow row =ws.getRow(1);
////	//step4:get into the respective cell
////	//XSSFCell cell=row.getCell(0);
////	//step5: to read data from the cell
////	//String cellValue =cell.getStringCellValue();
////	String cellValue=ws.getRow(i).getCell(0).getStringCellValue();
////	System.out.println(cellValue);
////	// instead  of multiple line we have given above we can give like this
////	
////}
////to  read all the data from the cell
//
////for(int i=1;i<=2;i++) {
////	for(int j=0;j<=2;j++) {
////		String cellValue=ws.getRow(i).getCell(j).getStringCellValue();
////        System.out.print(cellValue+ "\t" );
////        
////
////	}
////	System.out.println("");
////}
////to close the workbook
//
//// to get row count
//int  rowCount =ws.getLastRowNum();// it will skip the header. It will not include the header
//System.out.println(rowCount);
//
////to get cell count
//int cellcount=ws.getRow(1).getLastCellNum();
//System.out.println(cellcount);
//
////How to use excel
//String[][] data= new String[rowCount][cellcount];
//                           
//
//for(int i=1;i<=rowCount;i++) {
//	for(int j=0;j<=cellcount;j++) {
//	String cellValue=ws.getRow(i).getCell(j).getStringCellValue();
//        System.out.print(cellValue );
//        data[i-1][j] =cellValue;
//        
//
//}
//	
//}
//wb.close();
//return data;
//
//
//
//
//}
//}
//
//
//}
