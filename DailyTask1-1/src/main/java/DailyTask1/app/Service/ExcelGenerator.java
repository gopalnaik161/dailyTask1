package DailyTask1.app.Service;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.CreationHelper;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import DailyTask1.app.Model.ReportData;


public class ExcelGenerator {
	
	
	public static ByteArrayInputStream usersToExcel(List<ReportData> data) throws IOException {
		
		String[] COLUMNs = {"targetSystemCode", "targetSystemName", "screenCode", "screenName","objectCode","objectName","objectType","setUpValue_Desc","path"};
	    try(
	        Workbook workbook = new XSSFWorkbook();
	        ByteArrayOutputStream out = new ByteArrayOutputStream();
	    ){
	        CreationHelper createHelper = workbook.getCreationHelper();

	        Sheet sheet = workbook.createSheet("Users");

	        Font headerFont = workbook.createFont();
	        headerFont.setBold(true);
	        headerFont.setColor(IndexedColors.BLUE.getIndex());

	        CellStyle headerCellStyle = workbook.createCellStyle();
	        headerCellStyle.setFont(headerFont);

	        // Row for Header
	        Row headerRow = sheet.createRow(0);

	        // Header
	        for (int col = 0; col < COLUMNs.length; col++) {
	            Cell cell = headerRow.createCell(col);
	            cell.setCellValue(COLUMNs[col]);
	            cell.setCellStyle(headerCellStyle);
	        }

	        // CellStyle for Age
	        CellStyle ageCellStyle = workbook.createCellStyle();
	        ageCellStyle.setDataFormat(createHelper.createDataFormat().getFormat("#"));

	        int rowIdx = 1;
	        for (ReportData Data : data) {
	            Row row = sheet.createRow(rowIdx++);

	            row.createCell(0).setCellValue(Data.getTargetSystemCode());
	            row.createCell(1).setCellValue(Data.getTargetSystemName());
	            row.createCell(2).setCellValue(Data.getScreenCode());
	            row.createCell(3).setCellValue(Data.getScreenName());
	            row.createCell(4).setCellValue(Data.getObjectCode());
	            row.createCell(5).setCellValue(Data.getObjectName());
	            row.createCell(6).setCellValue(Data.getObjectType());
	            row.createCell(7).setCellValue(Data.getTargetSystemCode());
	            row.createCell(8).setCellValue(Data.getPath());
	        }
	        workbook.write(out);
	        return new ByteArrayInputStream(out.toByteArray());
	    }
	}
	





	}