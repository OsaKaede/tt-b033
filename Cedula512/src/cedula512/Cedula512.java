package cedula512;

/**
 *
 * @author DianneElizeth
 */
import java.io.File;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.Map;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.BorderStyle;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.VerticalAlignment;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.util.RegionUtil;

public class Cedula512 {

    public static void main(String[] args) {
         //Crear libro de trabajo en blanco
        Workbook workbook = new HSSFWorkbook();
        Map<String, CellStyle> styles = createStyles(workbook);
        //Crea hoja nueva
        Sheet sheet = workbook.createSheet("Cedula 5.1.2");
        //titulo de fila
        Row titulofila = sheet.createRow(0);
        titulofila.setHeightInPoints(45);
        Cell tituloCelda = titulofila.createCell(0);
        tituloCelda.setCellValue("Cédula 5.1.2 - Equipamiento en laboratorios ");
        tituloCelda.setCellStyle(styles.get("title"));
        sheet.addMergedRegion(CellRangeAddress.valueOf("$A$1:$D$1"));
        
        Row subfila = sheet.createRow(1);
        Cell textocelda = subfila.createCell(0);
        textocelda.setCellValue("Nombre del laboratorio:");
        textocelda.setCellStyle(styles.get("subtitle"));
        sheet.addMergedRegion(CellRangeAddress.valueOf("$A$2:$B$2"));
        sheet.addMergedRegion(CellRangeAddress.valueOf("$C$2:$D$2"));
        
        String[] dato1 = {"N°", "Euipo principal de laboratorio",null, "Cantidad"};
        Row con1 = sheet.createRow(2);
        sheet.addMergedRegion(CellRangeAddress.valueOf("$B$3:$C$3"));
        for(int a = 0; a < dato1.length; a++) {
            Cell celda = con1.createCell(a);
            celda.setCellValue(dato1[a]);
            celda.setCellStyle(styles.get("subtitle"));
        }

        Row con2 = sheet.createRow(3);
        sheet.addMergedRegion(CellRangeAddress.valueOf("$B$4:$C$4"));
        Cell celda2 = con2.createCell(0);
        celda2.setCellValue(1);       
        celda2.setCellStyle(styles.get("numstyle"));
                
        Row con3 = sheet.createRow(4);
        sheet.addMergedRegion(CellRangeAddress.valueOf("$B$5:$C$5"));
        Cell celda3 = con3.createCell(0);
        celda3.setCellValue(2);
        celda3.setCellStyle(styles.get("numstyle"));

        Row con4 = sheet.createRow(5);
        sheet.addMergedRegion(CellRangeAddress.valueOf("$B$6:$C$6"));
        Cell celda4 = con4.createCell(0);
        celda4.setCellValue(3);
        celda4.setCellStyle(styles.get("numstyle"));

        Row con5 = sheet.createRow(6);
        sheet.addMergedRegion(CellRangeAddress.valueOf("$B$7:$C$7"));
        Cell celda5 = con5.createCell(0);
        celda5.setCellValue(4);
        celda5.setCellStyle(styles.get("numstyle"));

        Row con6 = sheet.createRow(7);
        sheet.addMergedRegion(CellRangeAddress.valueOf("$B$8:$C$8"));
        Cell celda6 = con6.createCell(0);
        celda6.setCellValue(5);
        celda6.setCellStyle(styles.get("numstyle"));    

        Row con7 = sheet.createRow(8);
        sheet.addMergedRegion(CellRangeAddress.valueOf("$B$9:$C$9"));
        Cell celda7 = con7.createCell(0);
        celda7.setCellValue(6);
        celda7.setCellStyle(styles.get("numstyle"));

        Row con8 = sheet.createRow(9);
        sheet.addMergedRegion(CellRangeAddress.valueOf("$B$10:$C$10"));
        Cell celda8 = con8.createCell(0);
        celda8.setCellValue(7);
        celda8.setCellStyle(styles.get("numstyle"));
        
        Row con9 = sheet.createRow(10);
        sheet.addMergedRegion(CellRangeAddress.valueOf("$B$11:$C$11"));
        Cell celda9 = con9.createCell(0);
        celda9.setCellValue(8);
        celda9.setCellStyle(styles.get("numstyle"));

        Row con10 = sheet.createRow(11);
        sheet.addMergedRegion(CellRangeAddress.valueOf("$B$12:$C$12"));
        Cell celda10 = con10.createCell(0);
        celda10.setCellValue(9);
        celda10.setCellStyle(styles.get("numstyle"));

        Row con11 = sheet.createRow(12);
        sheet.addMergedRegion(CellRangeAddress.valueOf("$B$13:$C$13"));
        Cell celda11 = con11.createCell(0);
        celda11.setCellValue(10);
        celda11.setCellStyle(styles.get("numstyle"));
        
        CellRangeAddress region = new CellRangeAddress(1, 12, 1, 3); 
        RegionUtil.setBorderTop(BorderStyle.THIN, region, sheet); 
        RegionUtil.setBorderRight(BorderStyle.THIN, region, sheet);
        RegionUtil.setBorderBottom(BorderStyle.THIN, region, sheet);
        RegionUtil.setBorderLeft(BorderStyle.THIN, region, sheet);
        
        CellRangeAddress region2 = new CellRangeAddress(1, 12, 3, 3); 
        RegionUtil.setBorderTop(BorderStyle.THIN, region2, sheet); 
        RegionUtil.setBorderRight(BorderStyle.THIN, region2, sheet);
        RegionUtil.setBorderBottom(BorderStyle.THIN, region2, sheet);
        RegionUtil.setBorderLeft(BorderStyle.THIN, region2, sheet);
        sheet.setColumnWidth(0, 5 * 256);
        sheet.setColumnWidth(1, 20 * 256);
        sheet.setColumnWidth(2, 41 * 256);
        sheet.autoSizeColumn(3);
        
        try {
            //Se genera el documento xls
            FileOutputStream out = new FileOutputStream(new File("/C:/Users/DianneElizeth/Documents/11SemESCOM/cedula512.xls"));
            workbook.write(out);
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
            
    /**
     * estilos de celda
     */
    private static Map<String, CellStyle> createStyles(Workbook wb){
        Map<String, CellStyle> styles = new HashMap<>();
        CellStyle style;
        Font titleFont = wb.createFont();
        titleFont.setFontHeightInPoints((short)14);
        titleFont.setBold(true);
        titleFont.setColor(IndexedColors.WHITE.getIndex());
        titleFont.setFontName("Calibri");
        style = wb.createCellStyle();
        style.setAlignment(HorizontalAlignment.CENTER);
        style.setVerticalAlignment(VerticalAlignment.CENTER);
        style.setFillForegroundColor(IndexedColors.BLACK.getIndex());
        style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
        style.setFont(titleFont);
        style.setWrapText(true);
        styles.put("title", style);
        
        Font subtitleFont = wb.createFont();
        subtitleFont.setFontHeightInPoints((short)11);
        subtitleFont.setBold(true);
        subtitleFont.setColor(IndexedColors.BLACK.getIndex());
        subtitleFont.setFontName("Calibri");
        style = wb.createCellStyle();
        style.setBorderBottom(BorderStyle.THIN);
        style.setBorderLeft(BorderStyle.THIN);
        style.setBorderRight(BorderStyle.THIN);
        style.setBorderTop(BorderStyle.THIN);
        style.setFillForegroundColor(IndexedColors.LIGHT_CORNFLOWER_BLUE.getIndex());
        style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
        style.setFont(subtitleFont);
        styles.put("subtitle", style);
        
        Font numFont = wb.createFont();
        numFont.setFontHeightInPoints((short)11);
        numFont.setBold(true);
        numFont.setColor(IndexedColors.BLACK.getIndex());
        numFont.setFontName("Calibri");
        style = wb.createCellStyle();
        style.setAlignment(HorizontalAlignment.CENTER);
        style.setVerticalAlignment(VerticalAlignment.CENTER);
        style.setBorderBottom(BorderStyle.THIN);
        style.setBorderLeft(BorderStyle.THIN);
        style.setBorderRight(BorderStyle.THIN);
        style.setBorderTop(BorderStyle.THIN);
        style.setFont(numFont);
        styles.put("numstyle", style);
        

        style = wb.createCellStyle();
        style.setBorderBottom(BorderStyle.THIN);
        style.setBorderLeft(BorderStyle.THIN);
        style.setBorderRight(BorderStyle.THIN);
        style.setBorderTop(BorderStyle.THIN);
        styles.put("nullstyle", style);
        
        return styles;
        
    } 
}
