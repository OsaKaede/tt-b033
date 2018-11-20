package com.cacei.version1.excel;

import java.io.File;
import java.io.FileOutputStream;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Workbook;

import java.util.Map;
import java.util.HashMap;
import org.apache.poi.ss.usermodel.BorderStyle;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.VerticalAlignment;
import org.apache.poi.ss.util.RegionUtil;

public class Cedula511xls {
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
        tituloCelda.setCellValue("Cédula 5.1.1 -Características de las aulas");
        tituloCelda.setCellStyle(styles.get("title"));
        sheet.addMergedRegion(CellRangeAddress.valueOf("$A$1:$F$1"));
       
        Row subfila = sheet.createRow(1);
        subfila.setHeightInPoints(15);
        Cell textocelda = subfila.createCell(0);
        textocelda.setCellValue("Tipo de aula:");
        textocelda.setCellStyle(styles.get("subtitle"));
        sheet.addMergedRegion(CellRangeAddress.valueOf("$B$2:$F$2"));
        
        String Laboratorio = "";
        //recuperar lab de obj3 Laboratorio = 
        Row nlab = sheet.getRow(1);
        Cell nlabc = nlab.createCell(1);
        nlabc.setCellValue(Laboratorio); 
        
        sheet.addMergedRegion(CellRangeAddress.valueOf("$A$3:$F$3"));
        Row celdanula = sheet.createRow(2);       
        Cell blank = celdanula.createCell(0);        
        blank.setCellStyle(styles.get("cellnull"));
        
        String[] dato1 = {"a.Suficiencia", "Si",null, 
                            "No",null };
        Row con1 = sheet.createRow(4);
        for(int a = 0; a < dato1.length; a++) {
            Cell celda = con1.createCell(a);
            celda.setCellValue(dato1[a]);
        }
        
        String[] dato2 = {"b.Iluminación", "Adecuada", null, 
                            "Inadecuada" };
        Row con2 = sheet.createRow(7);
        for(int b = 0; b < dato2.length; b++) {
            Cell celda = con2.createCell(b);
            celda.setCellValue(dato2[b]);
        }
        String[] dato3 = {"c.Ventilación", "Adecuada",null,  
                            "Inadecuada" };
        Row con3 = sheet.createRow(10);
        for(int c = 0; c < dato3.length; c++) {
            Cell celda = con3.createCell(c);
            celda.setCellValue(dato3[c]);
        }
        String[] dato4 = {"d.Aislamiento del ruido", "Adecuada", null, 
                            "Inadecuada" };
        Row con4 = sheet.createRow(13);
        for(int d = 0; d < dato4.length; d++) {
            Cell celda = con4.createCell(d);
            celda.setCellValue(dato4[d]);
        }
        String[] dato5 = {"e.Equipo audiovisual", "Adecuada", null, 
                            "Inadecuada" };
        Row con5 = sheet.createRow(16);
        for(int e = 0; e < dato5.length; e++) {
            Cell celda = con5.createCell(e);
            celda.setCellValue(dato5[e]);
        }
        String[] dato6 = {"f.Mobiliario", "Adecuada", null, 
                            "Inadecuada" };
        Row con6 = sheet.createRow(19);
        for(int f = 0; f < dato6.length; f++) {
            Cell celda = con6.createCell(f);
            celda.setCellValue(dato6[f]);
        }
        String[] dato7 = {"g.Accesibilidad", "Adecuada", null, 
                            "Inadecuada" };
        Row con7 = sheet.createRow(22);
        for(int g = 0; g < dato7.length; g++) {
            Cell celda = con7.createCell(g);
            celda.setCellValue(dato7[g]);
            celda.setCellStyle(styles.get("check")); 
        }
        String[] dato8 = {"h.Conectividad", "Adecuada", null, 
                            "Inadecuada" };
        Row con8 = sheet.createRow(25);
        for(int h = 0; h < dato8.length; h++) {
            Cell celda = con8.createCell(h);
            celda.setCellValue(dato8[h]);
        }
        String[] dato9 = {"i.Higiene", "Adecuada", null, 
                            "Inadecuada" };
        Row con9 = sheet.createRow(28);
        for(int i = 0; i < dato7.length; i++) {
            Cell celda = con9.createCell(i);
            celda.setCellValue(dato9[i]);
        }
            Row rb1 = sheet.getRow(4); 
            Cell cb1 = rb1.createCell(2);
            Cell cb2 = rb1.createCell(4);
            cb1.setCellStyle(styles.get("boolstyle"));
            cb2.setCellStyle(styles.get("boolstyle"));
            CellRangeAddress region2 = new CellRangeAddress(3, 5, 0, 5); 
            RegionUtil.setBorderBottom(BorderStyle.THIN, region2, sheet); 
            RegionUtil.setBorderRight(BorderStyle.THIN, region2, sheet);

            Row rb2 = sheet.getRow(7); 
            Cell cb3 = rb2.createCell(2);
            Cell cb4 = rb2.createCell(4);
            cb3.setCellStyle(styles.get("boolstyle"));
            cb4.setCellStyle(styles.get("boolstyle"));
            CellRangeAddress region3 = new CellRangeAddress(6, 8, 0, 5); 
        RegionUtil.setBorderBottom(BorderStyle.THIN, region3, sheet); 
        RegionUtil.setBorderRight(BorderStyle.THIN, region3, sheet);

            Row rb3 = sheet.getRow(10); 
            Cell cb5 = rb3.createCell(2);
            Cell cb6 = rb3.createCell(4);
            cb5.setCellStyle(styles.get("boolstyle"));
            cb6.setCellStyle(styles.get("boolstyle"));
            CellRangeAddress region4 = new CellRangeAddress(9, 11, 0, 5); 
        RegionUtil.setBorderBottom(BorderStyle.THIN, region4, sheet); 
        RegionUtil.setBorderRight(BorderStyle.THIN, region4, sheet);

            Row rb4 = sheet.getRow(13); 
            Cell cb7 = rb4.createCell(2);
            Cell cb8 = rb4.createCell(4);
            cb7.setCellStyle(styles.get("boolstyle"));
            cb8.setCellStyle(styles.get("boolstyle")); 
            CellRangeAddress region5 = new CellRangeAddress(12, 14, 0, 5); 
        RegionUtil.setBorderBottom(BorderStyle.THIN, region5, sheet); 
        RegionUtil.setBorderRight(BorderStyle.THIN, region5, sheet);

            Row rb5 = sheet.getRow(16); 
            Cell cb9 = rb5.createCell(2);
            Cell cb10 = rb5.createCell(4);
            cb9.setCellStyle(styles.get("boolstyle"));
            cb10.setCellStyle(styles.get("boolstyle"));
            CellRangeAddress region6 = new CellRangeAddress(15, 17, 0, 5); 
        RegionUtil.setBorderBottom(BorderStyle.THIN, region6, sheet); 
        RegionUtil.setBorderRight(BorderStyle.THIN, region6, sheet);

            Row rb6 = sheet.getRow(19); 
            Cell cb11 = rb6.createCell(2);
            Cell cb12 = rb6.createCell(4);
            cb11.setCellStyle(styles.get("boolstyle"));
            cb12.setCellStyle(styles.get("boolstyle")); 
             CellRangeAddress region7 = new CellRangeAddress(18, 20, 0, 5); 
        RegionUtil.setBorderBottom(BorderStyle.THIN, region7, sheet); 
        RegionUtil.setBorderRight(BorderStyle.THIN, region7, sheet);

            Row rb7 = sheet.getRow(22); 
            Cell cb13 = rb7.createCell(2);
            Cell cb14 = rb7.createCell(4);
            cb13.setCellStyle(styles.get("boolstyle"));
            cb14.setCellStyle(styles.get("boolstyle")); 
            CellRangeAddress region8 = new CellRangeAddress(21, 23, 0, 5); 
        RegionUtil.setBorderBottom(BorderStyle.THIN, region8, sheet); 
        RegionUtil.setBorderRight(BorderStyle.THIN, region8, sheet);

            Row rb8 = sheet.getRow(25); 
            Cell cb15 = rb8.createCell(2);
            Cell cb16 = rb8.createCell(4);
            cb15.setCellStyle(styles.get("boolstyle"));
            cb16.setCellStyle(styles.get("boolstyle")); 
            CellRangeAddress region9 = new CellRangeAddress(24, 26, 0, 5); 
        RegionUtil.setBorderBottom(BorderStyle.THIN, region9, sheet); 
        RegionUtil.setBorderRight(BorderStyle.THIN, region9, sheet);

            Row rb9 = sheet.getRow(28); 
            Cell cb17 = rb9.createCell(2);
            Cell cb18 = rb9.createCell(4);
            cb17.setCellStyle(styles.get("boolstyle"));
            cb18.setCellStyle(styles.get("boolstyle")); 
            CellRangeAddress region10 = new CellRangeAddress(27, 29, 0, 5); 
        RegionUtil.setBorderBottom(BorderStyle.THIN, region10, sheet); 
        RegionUtil.setBorderRight(BorderStyle.THIN, region10, sheet);
                      
        CellRangeAddress regionf = new CellRangeAddress(1, 2, 0, 5); 
        RegionUtil.setBorderBottom(BorderStyle.THIN, regionf, sheet); 
        RegionUtil.setBorderRight(BorderStyle.THIN, regionf, sheet);
        RegionUtil.setBorderTop(BorderStyle.THIN, regionf, sheet);
        
        CellRangeAddress regionh = new CellRangeAddress(3, 29, 0, 5); 
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
            FileOutputStream out = new FileOutputStream(new File("/C:/Users/DianneElizeth/Documents/11SemESCOM/cedula511.xls"));
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
        
        Font dataFont = wb.createFont();
        dataFont.setFontHeightInPoints((short)11);
        dataFont.setColor(IndexedColors.BLACK.getIndex());
        dataFont.setFontName("Calibri");
        style = wb.createCellStyle();
        style.setFont(dataFont);
        styles.put("datastyle", style);
        
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