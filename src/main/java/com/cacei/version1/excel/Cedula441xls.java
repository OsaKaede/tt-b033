package com.cacei.version1.excel;

/**
 *
 * @author DianneElizeth
 */
import java.io.File;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.Map;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
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

public class Cedula441xls {

    public static void main(String[] args) {
        Workbook workbook = new HSSFWorkbook();
        Map<String, CellStyle> styles = createStyles(workbook);
        //Crea hoja nueva
        Sheet sheet = workbook.createSheet("Cedula 4.1.1");
        //titulo de fila - revisar la iteracion de las filas
        
        Row titulofila = sheet.createRow(1);
        titulofila.setHeightInPoints(45);
        Cell tituloCelda = titulofila.createCell(0);
        tituloCelda.setCellValue("Cédula 4.4.1 - Plan de Mejora");
        tituloCelda.setCellStyle(styles.get("title"));
        sheet.addMergedRegion(CellRangeAddress.valueOf("$A$2:$K$2"));
        
        sheet.addMergedRegion(CellRangeAddress.valueOf("$A$3:$K$3"));
        
        Row ha = sheet.createRow(3);
        sheet.addMergedRegion(CellRangeAddress.valueOf("$A$4:$F$4"));
        ha.setHeightInPoints(15);
        Cell ch = ha.createCell(0);
        ch.setCellValue("Hallazgo");
        ch.setCellStyle(styles.get("subtitle"));

        Row acc = sheet.getRow(3);
        sheet.addMergedRegion(CellRangeAddress.valueOf("$G$4:$G$5"));
        acc.setHeightInPoints(25);
        Cell accion = acc.createCell(6);
        accion.setCellValue("Acción(es) de mejora");
        accion.setCellStyle(styles.get("subtitle"));
        
        Row res = sheet.getRow(3);
        sheet.addMergedRegion(CellRangeAddress.valueOf("$H$4:$H$5"));
        res.setHeightInPoints(25);
        Cell resc = acc.createCell(7);
        resc.setCellValue("Resultado(s) Esperado(s)");
        resc.setCellStyle(styles.get("subtitle"));
        
        Row meta = sheet.getRow(3);
        sheet.addMergedRegion(CellRangeAddress.valueOf("$I$4:$I$5"));
        meta.setHeightInPoints(25);
        Cell metac = meta.createCell(8);
        metac.setCellValue("Meta");
        metac.setCellStyle(styles.get("subtitle"));
        
        Row fecha = sheet.getRow(3);
        sheet.addMergedRegion(CellRangeAddress.valueOf("$J$4:$J$5"));
        fecha.setHeightInPoints(25);
        Cell fec = fecha.createCell(9);
        fec.setCellValue("Fecha para alcanzar la meta");
        fec.setCellStyle(styles.get("subtitle"));
        
        Row respon = sheet.getRow(3);
        sheet.addMergedRegion(CellRangeAddress.valueOf("$K$4:$K$5"));
        respon.setHeightInPoints(25);
        Cell rec = respon.createCell(10);
        rec.setCellValue("Responsable de las acciones");
        rec.setCellStyle(styles.get("subtitle"));
        
        CellRangeAddress regionP = new CellRangeAddress(3, 3, 0, 5); 
        RegionUtil.setBorderTop(BorderStyle.THIN, regionP, sheet);
        RegionUtil.setBorderBottom(BorderStyle.THIN, regionP, sheet);
        RegionUtil.setBorderLeft(BorderStyle.THIN, regionP, sheet); 
        RegionUtil.setBorderRight(BorderStyle.THIN, regionP, sheet);
        
        CellRangeAddress region = new CellRangeAddress(5, 5, 6, 10); 
        RegionUtil.setBorderTop(BorderStyle.THIN, region, sheet);
        RegionUtil.setBorderRight(BorderStyle.THIN, region, sheet);
        
        String[] dato2 = {"Número", "OE","AE","IRE","Otr.","Descripción" };
        Row con2 = sheet.createRow(4);
        con2.setHeightInPoints(18);
        for(int b = 0; b < dato2.length; b++) {
            Cell celda = con2.createCell(b);
            celda.setCellValue(dato2[b]);
            celda.setCellStyle(styles.get("subtitle2"));
        }

        String[] nota = {"NOTA:", "OE = Objetivo de Aprendizaje; AE = Atributo de Egreso; IRE=Índice de rendimiento escolar"};
        Row subfila = sheet.createRow(16);
        subfila.setHeightInPoints(20);
        sheet.addMergedRegion(CellRangeAddress.valueOf("$B$17:$K$17"));
        for(int n = 0; n < nota.length; n++) {
            Cell celda = subfila.createCell(n);
            celda.setCellValue(nota[n]);
            celda.setCellStyle(styles.get("final"));
        }
        CellRangeAddress regionf = new CellRangeAddress(16, 16, 1, 10);
        RegionUtil.setBorderTop(BorderStyle.THIN, regionf, sheet);
        RegionUtil.setBorderBottom(BorderStyle.THIN, regionf, sheet);
        RegionUtil.setBorderLeft(BorderStyle.THIN, regionf, sheet); 
        RegionUtil.setBorderRight(BorderStyle.THIN, regionf, sheet);
 
        
        sheet.setColumnWidth(0, 8 * 256);
        sheet.setColumnWidth(1, 5 * 256);
        sheet.setColumnWidth(2, 5 * 256);
        sheet.setColumnWidth(3, 5 * 256);
        sheet.setColumnWidth(4, 5 * 256);
        sheet.setColumnWidth(5, 31* 256);
        sheet.setColumnWidth(6, 35* 256);
        sheet.setColumnWidth(7, 27* 256);
        sheet.setColumnWidth(8, 24 * 256);
        sheet.setColumnWidth(9, 20 * 256);
        sheet.setColumnWidth(10, 22 * 256);
        
        try {
            //Se genera el documento xls
            FileOutputStream out = new FileOutputStream(new File("/C:/Users/DianneElizeth/Documents/11SemESCOM/cedula441.xls"));
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
        subtitleFont.setFontHeightInPoints((short)18);
        subtitleFont.setBold(true);
        subtitleFont.setColor(IndexedColors.BLACK.getIndex());
        subtitleFont.setFontName("Calibri");
        style = wb.createCellStyle();
        style.setAlignment(HorizontalAlignment.CENTER);
        style.setVerticalAlignment(VerticalAlignment.CENTER);
        style.setBorderBottom(BorderStyle.THIN);
        style.setBorderLeft(BorderStyle.THIN);
        style.setBorderRight(BorderStyle.THIN);
        style.setBorderTop(BorderStyle.THIN);
        style.setFillForegroundColor(IndexedColors.LIGHT_CORNFLOWER_BLUE.getIndex());
        style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
        style.setFont(subtitleFont);
        style.setWrapText(true);
        styles.put("subtitle", style);
        
        Font subFont = wb.createFont();
        subFont.setFontHeightInPoints((short)16);
        subFont.setBold(true);
        subFont.setColor(IndexedColors.BLACK.getIndex());
        subFont.setFontName("Calibri");
        style = wb.createCellStyle();
        style.setAlignment(HorizontalAlignment.CENTER);
        style.setVerticalAlignment(VerticalAlignment.CENTER);
        style.setBorderBottom(BorderStyle.THIN);
        style.setBorderLeft(BorderStyle.THIN);
        style.setBorderRight(BorderStyle.THIN);
        style.setBorderTop(BorderStyle.THIN);
        style.setFillForegroundColor(IndexedColors.LIGHT_CORNFLOWER_BLUE.getIndex());
        style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
        style.setFont(subFont);
        styles.put("subtitle2", style);
        
        Font finFont = wb.createFont();
        finFont.setFontHeightInPoints((short)18);
        finFont.setColor(IndexedColors.BLACK.getIndex());
        finFont.setFontName("Calibri");
        style = wb.createCellStyle();
        style.setBorderBottom(BorderStyle.THIN);
        style.setBorderLeft(BorderStyle.THIN);
        style.setBorderRight(BorderStyle.THIN);
        style.setBorderTop(BorderStyle.THIN);
        style.setFont(finFont);
        style.setWrapText(true);
        styles.put("final", style);
        
        style = wb.createCellStyle();
        style.setAlignment(HorizontalAlignment.CENTER);
        style.setVerticalAlignment(VerticalAlignment.CENTER);
        style.setBorderBottom(BorderStyle.THIN);
        style.setBorderLeft(BorderStyle.THIN);
        style.setBorderRight(BorderStyle.THIN);
        style.setBorderTop(BorderStyle.THIN);
        styles.put("content", style);
        
        return styles;
    }
    
}

