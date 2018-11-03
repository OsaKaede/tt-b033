package cedula513;

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

public class Cedula513 {
    
    
    public static void main(String args[]) {
        //Crear libro de trabajo en blanco
        Workbook workbook = new HSSFWorkbook();
        Map<String, CellStyle> styles = createStyles(workbook);
        //Crea hoja nueva
        Sheet sheet = workbook.createSheet("Cedula 5.1.1");
        //titulo de fila
        Row titulofila = sheet.createRow(0);
        titulofila.setHeightInPoints(45);
        Cell tituloCelda = titulofila.createCell(0);
        tituloCelda.setCellValue("Cédula 5.1.3-3. Características de los laboratorios y talleres");
        tituloCelda.setCellStyle(styles.get("title"));
        sheet.addMergedRegion(CellRangeAddress.valueOf("$A$1:$F$1"));
       
        Row subfila = sheet.createRow(1);
        subfila.setHeightInPoints(20);
        Cell textocelda = subfila.createCell(0);
        textocelda.setCellValue("Laboratorio o Taller:");
        textocelda.setCellStyle(styles.get("subtitle"));
        sheet.addMergedRegion(CellRangeAddress.valueOf("$B$2:$F$2"));
        
        sheet.addMergedRegion(CellRangeAddress.valueOf("$A$3:$F$3"));
        Row celdanula = sheet.createRow(2);       
        Cell blank = celdanula.createCell(0);        
        blank.setCellStyle(styles.get("cellnull"));
        
        CellRangeAddress region = new CellRangeAddress(2, 2, 0, 5); 
        RegionUtil.setBorderBottom(BorderStyle.THIN, region, sheet); 
        RegionUtil.setBorderTop(BorderStyle.THIN, region, sheet);
        RegionUtil.setBorderLeft(BorderStyle.THIN, region, sheet); 
        RegionUtil.setBorderRight(BorderStyle.THIN, region, sheet);
        
        String[] dato1 = {"a.Suficiencia", "Si",null, "No",null };
        Row con1 = sheet.createRow(4);
        for(int a = 0; a < dato1.length; a++) {
            Cell celda = con1.createCell(a);
            celda.setCellValue(dato1[a]);
        }
        Row rb1 = sheet.getRow(4);
        Cell cb1 = rb1.createCell(2);
        Cell cb2 = rb1.createCell(4);
        cb1.setCellStyle(styles.get("boolstyle"));
        cb2.setCellStyle(styles.get("boolstyle"));
        
        CellRangeAddress region2 = new CellRangeAddress(3, 5, 0, 5); 
        RegionUtil.setBorderBottom(BorderStyle.THIN, region2, sheet); 
        RegionUtil.setBorderRight(BorderStyle.THIN, region2, sheet);
        
        String[] dato2 = {"b.Funcionalidad", "Adecuada", null,
                            "Inadecuada",null };
        Row con2 = sheet.createRow(7);
        for(int b = 0; b < dato2.length; b++) {
            Cell celda = con2.createCell(b);
            celda.setCellValue(dato2[b]);
        }
        Row rb2 = sheet.getRow(7);
        Cell cb3 = rb2.createCell(2);
        Cell cb4 = rb2.createCell(4);
        cb3.setCellStyle(styles.get("boolstyle"));
        cb4.setCellStyle(styles.get("boolstyle"));
        
        CellRangeAddress region3 = new CellRangeAddress(6, 8, 0, 5); 
        RegionUtil.setBorderBottom(BorderStyle.THIN, region3, sheet); 
        RegionUtil.setBorderRight(BorderStyle.THIN, region3, sheet);
        String[] dato3 = {"c.Seguridad", "Adecuada", null, 
                            "Inadecuada",null };
        Row con3 = sheet.createRow(10);
        for(int c = 0; c < dato3.length; c++) {
            Cell celda = con3.createCell(c);
            celda.setCellValue(dato3[c]);
        }
        Row rb3 = sheet.getRow(10);
        Cell cb5 = rb3.createCell(2);
        Cell cb6 = rb3.createCell(4);
        cb5.setCellStyle(styles.get("boolstyle"));
        cb6.setCellStyle(styles.get("boolstyle"));
        CellRangeAddress region4 = new CellRangeAddress(9, 11, 0, 5); 
        RegionUtil.setBorderBottom(BorderStyle.THIN, region4, sheet); 
        RegionUtil.setBorderRight(BorderStyle.THIN, region4, sheet);
        
        String[] dato4 = {"d.Aislamiento del ruido", "Adecuada", null, 
                            "Inadecuada",null };
        Row con4 = sheet.createRow(13);
        for(int d = 0; d < dato4.length; d++) {
            Cell celda = con4.createCell(d);
            celda.setCellValue(dato4[d]);
        }
        Row rb4 = sheet.getRow(13);
        Cell cb7 = rb4.createCell(2);
        Cell cb8 = rb4.createCell(4);
        cb7.setCellStyle(styles.get("boolstyle"));
        cb8.setCellStyle(styles.get("boolstyle"));
        CellRangeAddress region5 = new CellRangeAddress(12, 14, 0, 5); 
        RegionUtil.setBorderBottom(BorderStyle.THIN, region5, sheet); 
        RegionUtil.setBorderRight(BorderStyle.THIN, region5, sheet);
        
        String[] dato5 = {"e.Mobiliario", "Adecuada", null, 
                            "Inadecuada",null };
        Row con5 = sheet.createRow(16);
        for(int e = 0; e < dato5.length; e++) {
            Cell celda = con5.createCell(e);
            celda.setCellValue(dato5[e]);
        }
        Row rb5 = sheet.getRow(16);
        Cell cb9 = rb5.createCell(2);
        Cell cb10 = rb5.createCell(4);
        cb9.setCellStyle(styles.get("boolstyle"));
        cb10.setCellStyle(styles.get("boolstyle"));
        CellRangeAddress region6 = new CellRangeAddress(15, 17, 0, 5); 
        RegionUtil.setBorderBottom(BorderStyle.THIN, region6, sheet); 
        RegionUtil.setBorderRight(BorderStyle.THIN, region6, sheet);
        
        String[] dato6 = {"f.Accesibilidad", "Adecuada", null, 
                            "Inadecuada",null };
        Row con6 = sheet.createRow(19);
        for(int f = 0; f < dato6.length; f++) {
            Cell celda = con6.createCell(f);
            celda.setCellValue(dato6[f]);
        }
        Row rb6 = sheet.getRow(19);
        Cell cb11 = rb6.createCell(2);
        Cell cb12 = rb6.createCell(4);
        cb11.setCellStyle(styles.get("boolstyle"));
        cb12.setCellStyle(styles.get("boolstyle"));
        CellRangeAddress region7 = new CellRangeAddress(18, 20, 0, 5); 
        RegionUtil.setBorderBottom(BorderStyle.THIN, region7, sheet); 
        RegionUtil.setBorderRight(BorderStyle.THIN, region7, sheet);
        
        String[] dato7 = {"g.Conectividad", "Adecuada", null, 
                            "Inadecuada",null };
        Row con7 = sheet.createRow(22);
        for(int g = 0; g < dato7.length; g++) {
            Cell celda = con7.createCell(g);
            celda.setCellValue(dato7[g]);
        }
        Row rb7 = sheet.getRow(22);
        Cell cb13 = rb7.createCell(2);
        Cell cb14 = rb7.createCell(4);
        cb13.setCellStyle(styles.get("boolstyle"));
        cb14.setCellStyle(styles.get("boolstyle"));
        CellRangeAddress region8 = new CellRangeAddress(21, 23, 0, 5); 
        RegionUtil.setBorderBottom(BorderStyle.THIN, region8, sheet); 
        RegionUtil.setBorderRight(BorderStyle.THIN, region8, sheet);
        
        String[] dato8 = {"h.Higiene", "Adecuada", null, 
                            "Inadecuada",null };
        Row con8 = sheet.createRow(25);
        for(int h = 0; h < dato8.length; h++) {
            Cell celda = con8.createCell(h);
            celda.setCellValue(dato8[h]);
        }
        Row rb8 = sheet.getRow(25);
        Cell cb15 = rb8.createCell(2);
        Cell cb16 = rb8.createCell(4);
        cb15.setCellStyle(styles.get("boolstyle"));
        cb16.setCellStyle(styles.get("boolstyle"));
        CellRangeAddress region9 = new CellRangeAddress(24, 26, 0, 5); 
        RegionUtil.setBorderBottom(BorderStyle.THIN, region9, sheet); 
        RegionUtil.setBorderRight(BorderStyle.THIN, region9, sheet);
        
        String[] dato9 = {"i.Equipo audiovisual", "Adecuada", null, 
                            "Inadecuada",null };
        Row con9 = sheet.createRow(28);
        for(int i = 0; i < dato9.length; i++) {
            Cell celda = con9.createCell(i);
            celda.setCellValue(dato9[i]);
        }
        Row rb9 = sheet.getRow(28);
        Cell cb17 = rb9.createCell(2);
        Cell cb18 = rb9.createCell(4);
        cb17.setCellStyle(styles.get("boolstyle"));
        cb18.setCellStyle(styles.get("boolstyle"));
        
        String[] datof = {null,null,null, "No aplica", null, null};
        Row conf = sheet.createRow(30);
        for(int fi = 0; fi < datof.length; fi++) {
            Cell celda = conf.createCell(fi);
            celda.setCellValue(datof[fi]);
        }
        Row rbf = sheet.getRow(30);
        Cell cbf = rbf.createCell(4);
        cbf.setCellStyle(styles.get("boolstyle"));
        
        CellRangeAddress regionf = new CellRangeAddress(27, 31, 0, 5); 
        RegionUtil.setBorderBottom(BorderStyle.THIN, regionf, sheet); 
        RegionUtil.setBorderRight(BorderStyle.THIN, regionf, sheet);
        
        CellRangeAddress regionh = new CellRangeAddress(1, 1, 1, 5); 
        RegionUtil.setBorderBottom(BorderStyle.THIN, regionh, sheet); 
        RegionUtil.setBorderRight(BorderStyle.THIN, regionh, sheet);
        
        sheet.autoSizeColumn(0);
        sheet.autoSizeColumn(1);
        sheet.setColumnWidth(2, 4 * 256);
        sheet.autoSizeColumn(3);
        sheet.setColumnWidth(4, 4 * 256);
        sheet.setColumnWidth(5, 5 * 256);
        
        try {
            //Se genera el documento xls
            FileOutputStream out = new FileOutputStream(new File("/C:/Users/DianneElizeth/Documents/11SemESCOM/cedula513.xls"));
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
        
        style = wb.createCellStyle();
        style.setFillForegroundColor(IndexedColors.LIGHT_CORNFLOWER_BLUE.getIndex());
        style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
        styles.put("cellnull", style);
        
        style = wb.createCellStyle();
        style.setBorderBottom(BorderStyle.MEDIUM);
        style.setBorderLeft(BorderStyle.MEDIUM);
        style.setBorderRight(BorderStyle.MEDIUM);
        style.setBorderTop(BorderStyle.MEDIUM);
        styles.put("boolstyle", style);
                       
        return styles;
        
    } 

}