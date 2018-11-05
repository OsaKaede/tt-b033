package cedula431;

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

public class Cedula431 {

    public static void main(String[] args) {
        Workbook workbook = new HSSFWorkbook();
        Map<String, CellStyle> styles = createStyles(workbook);
        //Crea hoja nueva
        Sheet sheet = workbook.createSheet("Cedula 4.3.1");
        //PRE
        Row prefila = sheet.createRow(0);
        Cell prec = prefila.createCell(0);
        prec.setCellValue("Cédula concentradora. Junto con esta tabla se deberá anexar la evidencia que sustenta la información y el análisis sistemático de los índices");
        sheet.addMergedRegion(CellRangeAddress.valueOf("$A$1:$I$1"));
        prec.setCellStyle(styles.get("pre"));

        //titulo de fila
        Row titulofila = sheet.createRow(1);
        titulofila.setHeightInPoints(65);
        Cell tituloCelda = titulofila.createCell(0);
        tituloCelda.setCellValue("Cédula 4.3.1 \n Valoración de los Índices de rendimiento escolar por cohorte");
        tituloCelda.setCellStyle(styles.get("title"));
        sheet.addMergedRegion(CellRangeAddress.valueOf("$A$2:$I$2"));
        
        Row ins1 = sheet.createRow(2);
        sheet.addMergedRegion(CellRangeAddress.valueOf("$B$3:$I$3"));
        Cell desc1 = ins1.createCell(1);
        desc1.setCellValue("Complete la Cédula 4.3.1 incluyendo la información solicitada");
        
        String[] ins2 = {null,"Indique la periodicidad de impartición de las asignaturas (cursos, módulos, etc) del PE. Ésta puede ser"
                + "semestral, trimestral, cuatrimestral o \n alguna otra modalidad",null ,null ,null,null ,null ,"Periodicidad",null };
        Row desc2 = sheet.createRow(3);
        desc2.setHeightInPoints(40);
        sheet.addMergedRegion(CellRangeAddress.valueOf("$B$4:$G$4"));
        for(int a = 0; a < ins2.length; a++) {
            Cell celda = desc2.createCell(a);
            celda.setCellValue(ins2[a]);
            celda.setCellStyle(styles.get("text"));
        }

        String[] ins3 = {null,"Indique cuántos periodos (semestre,trimestre, cuatrimestre o alguna otra modalidad de impartición)"
                + "se ofrecen por \n año",null ,null ,null,null ,null ,"Número de periodos al año",null };
        Row desc3  = sheet.createRow(4);
        desc3.setHeightInPoints(40);
        sheet.addMergedRegion(CellRangeAddress.valueOf("$B$5:$F$5"));
        for(int b = 0; b < ins3.length; b++) {
            Cell celda = desc3.createCell(b);
            celda.setCellValue(ins3[b]);
            celda.setCellStyle(styles.get("text"));
        }
        CellRangeAddress regionp = new CellRangeAddress(3, 5, 8, 8); 
        RegionUtil.setBorderBottom(BorderStyle.THIN, regionp, sheet); 
        RegionUtil.setBorderTop(BorderStyle.THIN, regionp, sheet);
        RegionUtil.setBorderLeft(BorderStyle.THIN, regionp, sheet); 
        RegionUtil.setBorderRight(BorderStyle.THIN, regionp, sheet);
       

        Row ins4 = sheet.createRow(5);
        sheet.addMergedRegion(CellRangeAddress.valueOf("$B$6:$I$6"));
        Cell desc4 = ins4.createCell(1);
        desc4.setCellValue("La eficiencia terminal deberá calcularse considerando 1.5 veces la duración oficial del PE");
        desc4.setCellStyle(styles.get("pre"));
        
        String[] head = {"1","2","3","4","5=4/3","6","7 = 6/3","8","9 =8/3"};
        Row hd  = sheet.createRow(6);
        for(int nom = 0; nom  < head.length; nom ++) {
            Cell celda = hd.createCell(nom );
            celda.setCellValue(head[nom ]);
        }
        CellRangeAddress regionpe = new CellRangeAddress(4, 6, 8, 8); 
        RegionUtil.setBorderTop(BorderStyle.THIN, regionpe, sheet);
        RegionUtil.setBorderBottom(BorderStyle.THIN, regionpe, sheet);
        String[] dato1 = {"Cohortes \n equivalentes a 5 \n años (semestre, \n trimestre, \n cuatrimestre, etc)",
            "Periodo de la cohorte \n (mes y año de inicio \n y mes y año de \n terminación). \n Ejemplo: 9/2010- \n 7/2014",
            "Número de \n estudiantes de la \n Cohorte",
            "Número de estudiantes \n que permanecen en el \n PE",
            "Porcentaje de \n estudiantes que \n permanecen en el \n PE",
            "Número de \n egresados de la \n cohorte",
            "Eficiencia terminal \n (egresaron / ingreso por \n cohorte). \n Considerar el tiempo \n máximo como 1.5 \n veces la duración \n oficial del PE",
            "Número de titulados \n por cohorte",
            "Porcentaje de \n titulación -(titulados / \n Ingreso por cohorte"};
        Row con1  = sheet.createRow(7);
        con1.setHeightInPoints(95);
        for(int c = 0; c  < dato1.length; c++) {
            Cell celda = con1.createCell(c);
            celda.setCellValue(dato1[c]);
            celda.setCellStyle(styles.get("datastyle"));
        }
          CellRangeAddress regionper = new CellRangeAddress(5, 7, 8, 8); 
        RegionUtil.setBorderTop(BorderStyle.THIN, regionper, sheet);

        String[] n1 = {"1", null, null, null,null, null,null,null,null};
        Row letra1 = sheet.createRow(8);
        for(int niv1 = 0; niv1 < n1.length; niv1++) {
            Cell celda = letra1.createCell(niv1);
            celda.setCellValue(n1[niv1]);
            celda.setCellStyle(styles.get("levelstyle"));
        }
        String[] n2 = {"2", null, null, null,null,null,null,null,null};
        Row letra2 = sheet.createRow(9);
        for(int niv2 = 0; niv2 < n2.length; niv2++) {
            Cell celda = letra2.createCell(niv2);
            celda.setCellValue(n2[niv2]);
            celda.setCellStyle(styles.get("levelstyle"));
        }
        String[] n3 = {"3", null, null, null,null,null,null,null,null};
        Row letra3 = sheet.createRow(10);
        for(int niv3 = 0; niv3 < n3.length; niv3++) {
            Cell celda = letra3.createCell(niv3);
            celda.setCellValue(n3[niv3]);
            celda.setCellStyle(styles.get("levelstyle"));
        }
        String[] n4 = {"4", null, null, null,null,null,null,null,null};
        Row letra4 = sheet.createRow(11);
        for(int niv4 = 0; niv4 < n1.length; niv4++) {
            Cell celda = letra4.createCell(niv4);
            celda.setCellValue(n4[niv4]);
            celda.setCellStyle(styles.get("levelstyle"));
        }
        String[] n5 = {"5", null, null, null,null,null,null,null,null};
        Row letra5 = sheet.createRow(12);
        for(int niv5 = 0; niv5 < n5.length; niv5++) {
            Cell celda = letra5.createCell(niv5);
            celda.setCellValue(n5[niv5]);
            celda.setCellStyle(styles.get("levelstyle"));
        }
        String[] n6 = {"6", null, null, null,null,null,null,null,null};
        Row letra6 = sheet.createRow(13);
        for(int niv6 = 0; niv6 < n6.length; niv6++) {
            Cell celda = letra6.createCell(niv6);
            celda.setCellValue(n6[niv6]);
            celda.setCellStyle(styles.get("levelstyle"));
        }
        String[] n7 = {"7", null, null, null,null,null,null,null,null};
        Row letra7 = sheet.createRow(14);
        for(int niv7 = 0; niv7 < n1.length; niv7++) {
            Cell celda = letra7.createCell(niv7);
            celda.setCellValue(n7[niv7]);
            celda.setCellStyle(styles.get("levelstyle"));
        }
        String[] n8 = {"8", null, null, null,null,null,null,null,null};
        Row letra8 = sheet.createRow(15);
        for(int niv8 = 0; niv8 < n8.length; niv8++) {
            Cell celda = letra8.createCell(niv8);
            celda.setCellValue(n8[niv8]);
            celda.setCellStyle(styles.get("levelstyle"));
        }
        String[] n9 = {"9", null, null, null,null,null,null,null,null};
        Row letra9 = sheet.createRow(16);
        for(int niv9 = 0; niv9 < n3.length; niv9++) {
            Cell celda = letra9.createCell(niv9);
            celda.setCellValue(n9[niv9]);
            celda.setCellStyle(styles.get("levelstyle"));
        }
        String[] n10 = {"10", null, null, null,null,null,null,null,null};
        Row letraf = sheet.createRow(17);
        for(int nivf = 0; nivf < n1.length; nivf++) {
            Cell celda = letraf.createCell(nivf);
            celda.setCellValue(n10[nivf]);
            celda.setCellStyle(styles.get("levelstyle"));
        }
        Row subfila = sheet.createRow(18);
        subfila.setHeightInPoints(40);
        Cell subcel = subfila.createCell(0);
        subcel.setCellValue("Asignaturas con mayor índice de reprobación");
        subcel.setCellStyle(styles.get("pre"));
        sheet.addMergedRegion(CellRangeAddress.valueOf("$A$19:$I$19"));
        
        String[] n11 = {"1", null, "2", "3","4"};
        Row letra11 = sheet.createRow(19);
        for(int niv11 = 0; niv11 < n11.length; niv11++) {
            Cell celda = letra11.createCell(niv11);
            celda.setCellValue(n11[niv11]);
            celda.setCellStyle(styles.get("levelstyle"));
        }
        String[] datof = {"Asignatura", null, "Ubicación \n (Semestre, \n cuatrimestre, etc).", 
            "Periodo de \n impartición","Índices de \n reprobación (%)"};
        Row conf = sheet.createRow(20);
        conf.setHeightInPoints(70);
        for(int ff = 0; ff < datof.length; ff++) {
            Cell celda = conf.createCell(ff);
            celda.setCellValue(datof[ff]);
            celda.setCellStyle(styles.get("datastyle"));
        }
        String[] nulos = {null,null,null,null,null};
        
        Row nu1 = sheet.createRow(21);
        for(int nul = 0; nul < nulos.length; nul++) {
            Cell celda = nu1.createCell(nul);
            celda.setCellValue(nulos[nul]);
            celda.setCellStyle(styles.get("levelstyle"));
        }
        Row nu2 = sheet.createRow(22);
        for(int nul = 0; nul < nulos.length; nul++) {
            Cell celda = nu2.createCell(nul);
            celda.setCellValue(nulos[nul]);
            celda.setCellStyle(styles.get("levelstyle"));
        }
        Row nu3 = sheet.createRow(23);
        for(int nul = 0; nul < nulos.length; nul++) {
            Cell celda = nu3.createCell(nul);
            celda.setCellValue(nulos[nul]);
            celda.setCellStyle(styles.get("levelstyle"));
        }
        Row nu4 = sheet.createRow(24);
        for(int nul = 0; nul < nulos.length; nul++) {
            Cell celda = nu4.createCell(nul);
            celda.setCellValue(nulos[nul]);
            celda.setCellStyle(styles.get("levelstyle"));
        }
        Row nu5 = sheet.createRow(25);
        for(int nul = 0; nul < nulos.length; nul++) {
            Cell celda = nu5.createCell(nul);
            celda.setCellValue(nulos[nul]);
            celda.setCellStyle(styles.get("levelstyle"));
        }
        Row nu6 = sheet.createRow(26);
        for(int nul = 0; nul < nulos.length; nul++) {
            Cell celda = nu6.createCell(nul);
            celda.setCellValue(nulos[nul]);
            celda.setCellStyle(styles.get("levelstyle"));
        }
        Row nu7 = sheet.createRow(27);
        for(int nul = 0; nul < nulos.length; nul++) {
            Cell celda = nu7.createCell(nul);
            celda.setCellValue(nulos[nul]);
            celda.setCellStyle(styles.get("levelstyle"));
        }
        Row nu8 = sheet.createRow(28);
        for(int nul = 0; nul < nulos.length; nul++) {
            Cell celda = nu8.createCell(nul);
            celda.setCellValue(nulos[nul]);
            celda.setCellStyle(styles.get("levelstyle"));
        }
        
        
        sheet.autoSizeColumn(0);
        sheet.autoSizeColumn(1);
        sheet.autoSizeColumn(2);
        sheet.autoSizeColumn(3);
        sheet.autoSizeColumn(4);
        sheet.autoSizeColumn(5);
        sheet.autoSizeColumn(6);
        sheet.autoSizeColumn(7);
        sheet.autoSizeColumn(8);
        sheet.autoSizeColumn(9);
        try {
            //Se genera el documento xls
            FileOutputStream out = new FileOutputStream(new File("/C:/Users/DianneElizeth/Documents/11SemESCOM/cedula431.xls"));
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
        titleFont.setFontHeightInPoints((short)20);
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
        subtitleFont.setFontName("Arial Narrow");
        style = wb.createCellStyle();
        style.setFont(subtitleFont);
        styles.put("pre", style);
        
        Font dataFont = wb.createFont();
        dataFont.setFontHeightInPoints((short)11);
        dataFont.setColor(IndexedColors.BLACK.getIndex());
        dataFont.setFontName("Arial Narrow");
        style = wb.createCellStyle();
        style.setFillForegroundColor(IndexedColors.LIGHT_CORNFLOWER_BLUE.getIndex());
        style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
        style.setAlignment(HorizontalAlignment.CENTER);
        style.setVerticalAlignment(VerticalAlignment.CENTER);
        style.setBorderTop(BorderStyle.THIN);
        style.setBorderBottom(BorderStyle.THIN);
        style.setBorderRight(BorderStyle.THIN);
        style.setFont(dataFont);
        style.setWrapText(true);
        styles.put("datastyle", style);
        
        Font levelFont = wb.createFont();
        levelFont.setFontHeightInPoints((short)11);
        levelFont.setBold(true);
        levelFont.setColor(IndexedColors.BLACK.getIndex());
        levelFont.setFontName("Calibri");
        style = wb.createCellStyle();
        style.setAlignment(HorizontalAlignment.CENTER);
        style.setVerticalAlignment(VerticalAlignment.CENTER);
        style.setBorderTop(BorderStyle.THIN);
        style.setBorderBottom(BorderStyle.THIN);
        style.setBorderRight(BorderStyle.THIN);
        style.setFont(levelFont);
        styles.put("levelstyle", style);
        

        style = wb.createCellStyle();
        style.setWrapText(true);
        styles.put("text", style);
                   
        return styles;
        
    } 
    
}
