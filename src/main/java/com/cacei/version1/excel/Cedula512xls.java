/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cacei.version1.excel;

/**
 *
 * @author DianneElizeth
 */
import com.cacei.version1.entidades.Cedula512;
import java.io.File;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.List;
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

public class Cedula512xls {

    public static void main(String[] args) {
       
    }
            
    public String GenerarCedulaxls(List<Cedula512> arrayCedula512){
          //Crear libro de trabajo en blanco
        String respuesta = "";
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
        
        String[] dato1 = {"N°", "Equipo principal de laboratorio",null, "Cantidad"};
        Row con1 = sheet.createRow(2);
        sheet.addMergedRegion(CellRangeAddress.valueOf("$B$3:$C$3"));
        for(int a = 0; a < dato1.length; a++) {
            Cell celda = con1.createCell(a);
            celda.setCellValue(dato1[a]);
            celda.setCellStyle(styles.get("subtitle"));
        }
       
        /*************************************************************/
        /***************************Guardan datos del controlador**********************************/
        /*************************************************************/
        String nombreLab="";
        int aux = 3;
        for(int n = 0; n<arrayCedula512.size(); n++){

            nombreLab = arrayCedula512.get(n).getDatosLaboratorio().getNombreLab();
            
            Row prueb = sheet.createRow(aux);
            Cell datoseq =  prueb.createCell(0);
            datoseq.setCellValue(""+arrayCedula512.get(n).getNumEquipo());
            Cell datoseq1 =  prueb.createCell(1);
            datoseq1.setCellValue(""+arrayCedula512.get(n).getNombreEquipo());
            Cell datoseq2 =  prueb.createCell(3);
            datoseq2.setCellValue(""+arrayCedula512.get(n).getCantidad());
            System.out.println("**************"+arrayCedula512.get(n).getNumEquipo());
            System.out.println("**************"+arrayCedula512.get(n).getNombreEquipo());
            aux++;
        }
        Row prueba = sheet.createRow(1);
        Cell celdapr = prueba.createCell(2);
        celdapr.setCellValue(nombreLab);       
        
        sheet.addMergedRegion(CellRangeAddress.valueOf("$B$4:$C$4"));

        sheet.setColumnWidth(0, 5 * 256);
        sheet.setColumnWidth(1, 20 * 256);
        sheet.setColumnWidth(2, 41 * 256);
        sheet.autoSizeColumn(3);
        
        
        try {
            //Se genera el documento xls
            FileOutputStream out = new FileOutputStream(new File("/C:/Users/ilsem/Desktop/RESPALDO/cedula512.xls"));
            workbook.write(out);
            out.close();
            respuesta="true";
        } catch (Exception e) {
            e.printStackTrace();
            respuesta="false";
        }
        return respuesta;
    }
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
        style.setBorderBottom(BorderStyle.THIN);
        style.setBorderLeft(BorderStyle.THIN);
        style.setBorderRight(BorderStyle.THIN);
        style.setBorderTop(BorderStyle.THIN);
        styles.put("nullstyle", style);
        
        return styles;
        
    } 
}
