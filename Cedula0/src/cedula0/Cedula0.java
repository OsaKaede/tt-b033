package cedula0;

import java.io.File;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.Map;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
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

public class Cedula0 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Crear libro de trabajo en blanco
        Workbook workbook = new HSSFWorkbook();
        Map<String, CellStyle> styles = createStyles(workbook);
        //Crea hoja nueva
        Sheet sheet = workbook.createSheet("Cedula 0");
        //titulo de fila
        Row titulofila = sheet.createRow(0);
        titulofila.setHeightInPoints(30);
        Cell tituloCelda = titulofila.createCell(0);
        tituloCelda.setCellValue("Cédula 0 - Currículum Vitae Resumido");
        sheet.addMergedRegion(CellRangeAddress.valueOf("$A$1:$E$1"));
        tituloCelda.setCellStyle(styles.get("title"));
        

        String[] dato1 = {"IMPORTANTE: El CV debe limitarse a una extensión máxima de 2 cuartillas, no se aceptarán documentos adicionales.", 
            "Número de profesor\n(de 001 a 999)", null, "Número de profesor (de 001 a 999)" };
        sheet.addMergedRegion(CellRangeAddress.valueOf("$A$3:$C$3"));
        Row con1 = sheet.createRow(2);
        con1.setHeightInPoints(45);
        for(int a = 0; a < dato1.length; a++) {
            Cell celda = con1.createCell(a);
            celda.setCellValue(dato1[a]);
        }
        String [] celdanula = {null,null,null,null,null};

        String[] dato2 = {"Apellido paterno", null, "Apellido materno", "Nombre(s)", null};
        sheet.addMergedRegion(CellRangeAddress.valueOf("$A$5:$B$5"));
        sheet.addMergedRegion(CellRangeAddress.valueOf("$D$5:$E$5"));
        Row con2 = sheet.createRow(4);
        con2.setHeightInPoints(15);
        for(int b = 0; b < dato2.length; b++) {
            Cell celda = con2.createCell(b);
            celda.setCellValue(dato2[b]);
            celda.setCellStyle(styles.get("datastyle"));
        }
        //Corregir, dar instyle a una sola fila pasando string con null
        sheet.addMergedRegion(CellRangeAddress.valueOf("$A$6:$B$6"));
        Row in1 = sheet.createRow(5);
        for(int n1 = 0; n1 < celdanula.length; n1++) {
            Cell celda = in1.createCell(n1);
            celda.setCellValue(celdanula[n1]);
            celda.setCellStyle(styles.get("instyle"));
        }
        
        String[] dato3 = {"Edad", 
            "Fecha de nacimiento (dd/mm/aaaa)", "Puesto en la institución", null, null};
        sheet.addMergedRegion(CellRangeAddress.valueOf("$C$8:$E$8"));
        Row con3 = sheet.createRow(7);
        con3.setHeightInPoints(15);
        for(int c = 0; c < dato3.length; c++) {
            Cell celda = con3.createCell(c);
            celda.setCellValue(dato3[c]);
            celda.setCellStyle(styles.get("datastyle"));
        }
        int rowin2 = 8;
        for (int ro = 0; ro < 1; ro++) {
            Row row = sheet.createRow(rowin2++);
            for (int col = 0; col < celdanula.length; col++) {
		Cell empty = row.createCell(col);
		empty.setCellStyle(styles.get("instyle"));        
        }
        }
        sheet.addMergedRegion(CellRangeAddress.valueOf("$C$9:$E$9"));

        
        Row subfila1 = sheet.createRow(10);
        subfila1.setHeightInPoints(20);
        Cell textocelda = subfila1.createCell(0);
        textocelda.setCellValue("Formación académica");
        sheet.addMergedRegion(CellRangeAddress.valueOf("$A$11:$E$11"));
        textocelda.setCellStyle(styles.get("substyle"));
        
        String[] dato4 = {"Nivel", "Nombre (incluir especialidad)", 
            "Institución y país", "Año de obtención", "Cédula Profesional"};
        Row con4 = sheet.createRow(11);
        con4.setHeightInPoints(15);
        for(int d = 0; d < dato4.length; d++) {
            Cell celda = con4.createCell(d);
            celda.setCellValue(dato4[d]);
            celda.setCellStyle(styles.get("datastyle"));
            
        }
        String[] n1 = {"L", null, null, null,null};
        Row letra1 = sheet.createRow(12);
        for(int niv1 = 0; niv1 < n1.length; niv1++) {
            Cell celda = letra1.createCell(niv1);
            celda.setCellValue(n1[niv1]);
            celda.setCellStyle(styles.get("levelstyle"));
        }
        String[] n2 = {"E", null, null, null,null};
        Row letra2 = sheet.createRow(13);
        for(int niv2 = 0; niv2 < n2.length; niv2++) {
            Cell celda = letra2.createCell(niv2);
            celda.setCellValue(n2[niv2]);
            celda.setCellStyle(styles.get("levelstyle"));
        }
        String[] n3 = {"M", null, null, null,null};
        Row letra3 = sheet.createRow(14);
        for(int niv3 = 0; niv3 < n3.length; niv3++) {
            Cell celda = letra3.createCell(niv3);
            celda.setCellValue(n3[niv3]);
            celda.setCellStyle(styles.get("levelstyle"));
        }
        String[] n4 = {"D", null, null, null,null};
        Row letra4 = sheet.createRow(15);
        for(int niv4 = 0; niv4 < n1.length; niv4++) {
            Cell celda = letra4.createCell(niv4);
            celda.setCellValue(n4[niv4]);
            celda.setCellStyle(styles.get("levelstyle"));
        }
        Row subfila2 = sheet.createRow(17);
        subfila2.setHeightInPoints(15);
        Cell textocelda2 = subfila2.createCell(0);
        textocelda2.setCellValue("Capacitación Docente");
        sheet.addMergedRegion(CellRangeAddress.valueOf("$A$18:$E$18"));
        textocelda2.setCellStyle(styles.get("substyle"));
        
        
        String[] dato5 = {"Tipo de capacitación",null,  "Institución y país", 
            "Año de obtención", "Horas"};
        Row con5 = sheet.createRow(18);
        sheet.addMergedRegion(CellRangeAddress.valueOf("$A$19:$B$19"));
        con5.setHeightInPoints(15);
        for(int e = 0; e < dato5.length; e++) {
            Cell celda = con5.createCell(e);
            celda.setCellValue(dato5[e]);
            celda.setCellStyle(styles.get("datastyle"));
        }
        
        int rownum = 19;
        for (int ro = 0; ro < 4; ro++) {
            Row row = sheet.createRow(rownum++);
            for (int col = 0; col < celdanula.length; col++) {
		Cell empty = row.createCell(col);
		empty.setCellStyle(styles.get("levelstyle"));        
        }
        }
        sheet.addMergedRegion(CellRangeAddress.valueOf("$A$20:$B$20"));
        sheet.addMergedRegion(CellRangeAddress.valueOf("$A$21:$B$21"));
        sheet.addMergedRegion(CellRangeAddress.valueOf("$A$22:$B$22"));
        sheet.addMergedRegion(CellRangeAddress.valueOf("$A$23:$B$23"));
        
       
        Row subfila3 = sheet.createRow(24);
        subfila3.setHeightInPoints(15);
        Cell textocelda3 = subfila3.createCell(0);
        textocelda3.setCellValue("Actualización disciplinar");
        sheet.addMergedRegion(CellRangeAddress.valueOf("$A$25:$E$25")); 
        textocelda3.setCellStyle(styles.get("substyle"));

        
        String[] dato6 = {"Tipo de actualización", null, "Institución y país", 
            "Año de obtención", "Horas"};
        Row con6 = sheet.createRow(25);
        con6.setHeightInPoints(15);
        sheet.addMergedRegion(CellRangeAddress.valueOf("$A$26:$B$26"));
        for(int f = 0; f < dato6.length; f++) {
            Cell celda = con6.createCell(f);
            celda.setCellValue(dato6[f]);
            celda.setCellStyle(styles.get("datastyle"));
        }
        
        int rownum2 = 26;
        for (int ro = 0; ro < 4; ro++) {
            Row row = sheet.createRow(rownum2++);
            for (int col = 0; col < celdanula.length; col++) {
		Cell empty = row.createCell(col);
		empty.setCellStyle(styles.get("levelstyle"));        
        }
        }
        sheet.addMergedRegion(CellRangeAddress.valueOf("$A$27:$B$27"));
        sheet.addMergedRegion(CellRangeAddress.valueOf("$A$28:$B$28"));
        sheet.addMergedRegion(CellRangeAddress.valueOf("$A$29:$B$29"));
        sheet.addMergedRegion(CellRangeAddress.valueOf("$A$30:$B$30"));
        Row subfila4 = sheet.createRow(31);
        subfila4.setHeightInPoints(15);
        Cell textocelda4 = subfila4.createCell(0);
        textocelda4.setCellValue("Gestión Académica");
        sheet.addMergedRegion(CellRangeAddress.valueOf("$A$32:$E$32"));
        textocelda4.setCellStyle(styles.get("substyle"));

        
        Row subfila5 = sheet.createRow(32);
        subfila5.setHeightInPoints(15);
        Cell textocelda5 = subfila5.createCell(0);
        textocelda5.setCellValue("Anotar las actividades o puestos académicos desempeñados en orden cronológico decreciente");
        sheet.addMergedRegion(CellRangeAddress.valueOf("$A$33:$E$33"));
        
        String[] dato7 = {"Actividad o puesto", null, "Institución", 
            "De: (mes y año)", "A: (mes y año)"};
        sheet.addMergedRegion(CellRangeAddress.valueOf("$A$34:$B$34"));
        Row con7 = sheet.createRow(33);
        con7.setHeightInPoints(15);
        for(int g = 0; g < dato7.length; g++) {
            Cell celda = con7.createCell(g);
            celda.setCellValue(dato7[g]);
            celda.setCellStyle(styles.get("datastyle"));
        }
        
        int rownum3 = 34;
        for (int ro = 0; ro < 4; ro++) {
            Row row = sheet.createRow(rownum3++);
            for (int col = 0; col < celdanula.length; col++) {
		Cell empty = row.createCell(col);
		empty.setCellStyle(styles.get("levelstyle"));        
        }
        }
        sheet.addMergedRegion(CellRangeAddress.valueOf("$A$35:$B$35"));
        sheet.addMergedRegion(CellRangeAddress.valueOf("$A$36:$B$36"));
        sheet.addMergedRegion(CellRangeAddress.valueOf("$A$37:$B$37"));
        sheet.addMergedRegion(CellRangeAddress.valueOf("$A$38:$B$38"));
        
        Row subfila6 = sheet.createRow(39);
        subfila6.setHeightInPoints(15);
        Cell textocelda6 = subfila6.createCell(0);
        textocelda6.setCellValue("Productos académicos relevantes en los últimos cinco años, relacionados con el PE");
        sheet.addMergedRegion(CellRangeAddress.valueOf("$A$40:$E$40"));
        textocelda6.setCellStyle(styles.get("substyle"));

        
        Row subfila7 = sheet.createRow(40);
        subfila7.setHeightInPoints(15);
        Cell textocelda7 = subfila7.createCell(0);
        textocelda7.setCellValue("Incluir los datos relevantes, tales como: para publicaciones título, autor, dónde se publicó");
        sheet.addMergedRegion(CellRangeAddress.valueOf("$A$41:$E$41"));
        
        String[] dato8 = {"Núm.",  "Descripción del producto académico" };
        Row con8 = sheet.createRow(41);
        sheet.addMergedRegion(CellRangeAddress.valueOf("$B$42:$E$42"));
        con8.setHeightInPoints(15);
        for(int h = 0; h < dato8.length; h++) {
            Cell celda = con8.createCell(h);
            celda.setCellValue(dato8[h]);
            celda.setCellStyle(styles.get("datastyle"));
        }
        
        int rownum4 = 42;
        for (int ro = 0; ro < 10; ro++) {
            Row row = sheet.createRow(rownum4++);
            for (int col = 0; col < celdanula.length; col++) {
		Cell empty = row.createCell(col);
		empty.setCellStyle(styles.get("levelstyle"));        
        }
        }
        sheet.addMergedRegion(CellRangeAddress.valueOf("$B$43:$E$43"));
        sheet.addMergedRegion(CellRangeAddress.valueOf("$B$44:$E$44"));
        sheet.addMergedRegion(CellRangeAddress.valueOf("$B$45:$E$45"));
        sheet.addMergedRegion(CellRangeAddress.valueOf("$B$46:$E$46"));
        sheet.addMergedRegion(CellRangeAddress.valueOf("$B$47:$E$47"));
        sheet.addMergedRegion(CellRangeAddress.valueOf("$B$48:$E$48"));
        sheet.addMergedRegion(CellRangeAddress.valueOf("$B$49:$E$49"));
        sheet.addMergedRegion(CellRangeAddress.valueOf("$B$50:$E$50"));
        sheet.addMergedRegion(CellRangeAddress.valueOf("$B$51:$E$51"));
        sheet.addMergedRegion(CellRangeAddress.valueOf("$B$52:$E$52"));
           
        Row subfila8 = sheet.createRow(53);
        subfila8.setHeightInPoints(15);
        Cell textocelda8 = subfila8.createCell(0);
        textocelda8.setCellValue("Experiencia profesional (no académica)");
        sheet.addMergedRegion(CellRangeAddress.valueOf("$A$54:$E$54"));
        textocelda8.setCellStyle(styles.get("substyle"));

        
        Row subfila9 = sheet.createRow(54);
        subfila9.setHeightInPoints(15);
        Cell textocelda9 = subfila9.createCell(0);
        textocelda9.setCellValue("Anotar las actividades o puestos desempeñados en orden cronológico decreciente");
        sheet.addMergedRegion(CellRangeAddress.valueOf("$A$55:$E$55"));
        
        String[] dato9 = {"Actividad o puesto", null, "Organización o empresa",
        "De: (mes y año)", "A:(mes y año)"};
        Row con9 = sheet.createRow(55);
        sheet.addMergedRegion(CellRangeAddress.valueOf("$A$56:$B$56"));
        con9.setHeightInPoints(20);
        for(int i = 0; i < dato9.length; i++) {
            Cell celda = con9.createCell(i);
            celda.setCellValue(dato9[i]);
            celda.setCellStyle(styles.get("datastyle"));
        }
        int rownum5 = 56;
        for (int ro = 0; ro < 4; ro++) {
            Row row = sheet.createRow(rownum5++);
            for (int col = 0; col < celdanula.length; col++) {
		Cell empty = row.createCell(col);
		empty.setCellStyle(styles.get("levelstyle"));        
        }
        }
        sheet.addMergedRegion(CellRangeAddress.valueOf("$A$57:$B$57"));
        sheet.addMergedRegion(CellRangeAddress.valueOf("$A$58:$B$58"));
        sheet.addMergedRegion(CellRangeAddress.valueOf("$A$59:$B$59"));
        sheet.addMergedRegion(CellRangeAddress.valueOf("$A$60:$B$60"));
        
        Row subfila10 = sheet.createRow(61);
        subfila10.setHeightInPoints(15);
        Cell textocelda10 = subfila10.createCell(0);
        textocelda10.setCellValue("Experiencia en diseño ingenieril");
        sheet.addMergedRegion(CellRangeAddress.valueOf("$A$62:$E$62"));
        textocelda10.setCellStyle(styles.get("substyle"));

        
        Row subfila11 = sheet.createRow(62);
        subfila11.setHeightInPoints(15);
        Cell textocelda11 = subfila11.createCell(0);
        textocelda11.setCellValue("Anotar el tipo de experiencia en diseño, el lugar donde se realizó, el "
                + "número de años y en su caso otra información relevante");
        sheet.addMergedRegion(CellRangeAddress.valueOf("$A$63:$E$63"));
        
        String[] dato10 = {"Organismo",null,null,"Período (años)",
        "Nivel de experiencia"};
        Row con10 = sheet.createRow(63);
        sheet.addMergedRegion(CellRangeAddress.valueOf("$A$64:$C$64"));
        con10.setHeightInPoints(15);
        for(int j = 0; j < dato10.length; j++) {
            Cell celda = con10.createCell(j);
            celda.setCellValue(dato10[j]);
            celda.setCellStyle(styles.get("datastyle"));
        }
        
        int rownum6 = 64;
        for (int ro = 0; ro < 4; ro++) {
            Row row = sheet.createRow(rownum6++);
            for (int col = 0; col < celdanula.length; col++) {
		Cell empty = row.createCell(col);
		empty.setCellStyle(styles.get("levelstyle"));        
        }
        }
        sheet.addMergedRegion(CellRangeAddress.valueOf("$A$65:$C$65"));
        sheet.addMergedRegion(CellRangeAddress.valueOf("$A$66:$C$66"));
        sheet.addMergedRegion(CellRangeAddress.valueOf("$A$67:$C$67"));
        sheet.addMergedRegion(CellRangeAddress.valueOf("$A$68:$C$68"));
        
        Row subfila12 = sheet.createRow(69);
        subfila12.setHeightInPoints(15);
        Cell textocelda12 = subfila12.createCell(0);
        textocelda12.setCellValue("Logros profesionales (no académicos) relevantes en los últimos cinco años, relacionados con el PE");
        sheet.addMergedRegion(CellRangeAddress.valueOf("$A$70:$E$70"));
        textocelda12.setCellStyle(styles.get("substyle"));
       
        Row subfila13 = sheet.createRow(70);
        subfila13.setHeightInPoints(15);
        Cell textocelda13 = subfila13.createCell(0);
        textocelda13.setCellValue("Incluir los datos relevantes, tales como: titulo, autor, nombre del logro, "
                + "relevancia, dónde se realizó, etc.");
        sheet.addMergedRegion(CellRangeAddress.valueOf("$A$71:$E$71"));
        
        Row subfila14 = sheet.createRow(71);
        subfila14.setHeightInPoints(15);
        Cell textocelda14 = subfila14.createCell(0);
        textocelda14.setCellValue("Descripción del logro");
        sheet.addMergedRegion(CellRangeAddress.valueOf("$A$72:$E$72"));
        textocelda14.setCellStyle(styles.get("datastyle"));
        
        CellRangeAddress region = new CellRangeAddress(71, 75, 0, 4); 
        RegionUtil.setBorderBottom(BorderStyle.THIN, region, sheet); 
        RegionUtil.setBorderTop(BorderStyle.THIN, region, sheet);
        RegionUtil.setBorderLeft(BorderStyle.THIN, region, sheet); 
        RegionUtil.setBorderRight(BorderStyle.THIN, region, sheet);
        
        sheet.addMergedRegion(CellRangeAddress.valueOf("$A$73:$E$73"));
        sheet.addMergedRegion(CellRangeAddress.valueOf("$A$74:$E$74"));
        sheet.addMergedRegion(CellRangeAddress.valueOf("$A$75:$E$75"));
        sheet.addMergedRegion(CellRangeAddress.valueOf("$A$76:$E$76"));
        
        Row subfila15 = sheet.createRow(77);
        subfila15.setHeightInPoints(15);
        Cell textocelda15 = subfila15.createCell(0);
        textocelda15.setCellValue("Membresía o participación en Colegios, Cámaras, asociaciones científicas");
        sheet.addMergedRegion(CellRangeAddress.valueOf("$A$78:$E$78"));
        textocelda15.setCellStyle(styles.get("substyle"));

        
        Row subfila16 = sheet.createRow(78);
        subfila16.setHeightInPoints(15);
        Cell textocelda16 = subfila16.createCell(0);
        textocelda16.setCellValue("Anotar el nombre del organismo, el tipo de membresía o participación, el número de años"
                + "y en su caso, alguna otra información relevante");
        sheet.addMergedRegion(CellRangeAddress.valueOf("$A$79:$E$79"));
            
        String[] dato11 = {"Organismo", null,null, "Período (años)",
        "Nivel de participación"};
        Row con11 = sheet.createRow(79);
        sheet.addMergedRegion(CellRangeAddress.valueOf("$A$80:$C$80"));
        for(int k = 0; k < dato11.length; k++) {
            Cell celda = con11.createCell(k);
            celda.setCellValue(dato11[k]);
            celda.setCellStyle(styles.get("datastyle"));
        }
        
        int rownum7 = 80;
        for (int ro = 0; ro < 4; ro++) {
            Row row = sheet.createRow(rownum7++);
            for (int col = 0; col < celdanula.length; col++) {
		Cell empty = row.createCell(col);
		empty.setCellStyle(styles.get("levelstyle"));        
        }
        }
        sheet.addMergedRegion(CellRangeAddress.valueOf("$A$81:$C$81"));
        sheet.addMergedRegion(CellRangeAddress.valueOf("$A$82:$C$82"));
        sheet.addMergedRegion(CellRangeAddress.valueOf("$A$83:$C$83"));
        sheet.addMergedRegion(CellRangeAddress.valueOf("$A$84:$C$84"));
        
        Row subfila17 = sheet.createRow(85);
        subfila17.setHeightInPoints(15);
        Cell textocelda17 = subfila17.createCell(0);
        textocelda17.setCellValue("Premios, distinciones o reconocimientos recibidos");
        sheet.addMergedRegion(CellRangeAddress.valueOf("$A$88:$E$88"));
        textocelda17.setCellStyle(styles.get("substyle"));

        
        Row subfila18 = sheet.createRow(86);
        subfila18.setHeightInPoints(15);
        Cell textocelda18 = subfila18.createCell(0);
        textocelda18.setCellValue("Incluir los datos relevantes, nombre del premio, organismo que lo otorga, motivos por se otorga, etc");
        sheet.addMergedRegion(CellRangeAddress.valueOf("$A$89:$E$89"));
        
        Row subfila19 = sheet.createRow(87);
        subfila19.setHeightInPoints(15);
        Cell textocelda19 = subfila19.createCell(0);
        textocelda19.setCellValue("Descripción del premio o reconocimiento");
        sheet.addMergedRegion(CellRangeAddress.valueOf("$A$90:$E$90"));
        textocelda19.setCellStyle(styles.get("datastyle"));
        
        CellRangeAddress region2 = new CellRangeAddress(87, 91, 0, 4); 
        RegionUtil.setBorderBottom(BorderStyle.THIN, region2, sheet); 
        RegionUtil.setBorderTop(BorderStyle.THIN, region2, sheet);
        RegionUtil.setBorderLeft(BorderStyle.THIN, region2, sheet); 
        RegionUtil.setBorderRight(BorderStyle.THIN, region2, sheet);
        
        sheet.addMergedRegion(CellRangeAddress.valueOf("$A$91:$E$91"));
        sheet.addMergedRegion(CellRangeAddress.valueOf("$A$92:$E$92"));

        Row subfila20 = sheet.createRow(93);
        subfila20.setHeightInPoints(15);
        Cell textocelda20 = subfila20.createCell(0);
        textocelda20.setCellValue("Participación en el análisis o actualización del PE, o en actividades extracurriculares relacionadas con el PE");
        sheet.addMergedRegion(CellRangeAddress.valueOf("$A$94:$E$94"));
        textocelda20.setCellStyle(styles.get("substyle"));

        
        Row subfila21 = sheet.createRow(94);
        subfila21.setHeightInPoints(65);
        Cell textocelda21 = subfila21.createCell(0);
        textocelda21.setCellValue("Con un máximo de 200 palabras, reseñe cuál ha sido su participación en actividades"
                + "relevantes del PE, tales como: diseño el PE, diseño de asignatura(s) del PE, análisis de indicadores"
                + "del PE, participación en cuerpos colegiados del PE, participación en grupos de mejora del PE, etc"
                + "en actividades extracurriculares relacionadas con el PE; o en ambos tipos de actividades");
        sheet.addMergedRegion(CellRangeAddress.valueOf("$A$95:$E$95"));
        
        sheet.autoSizeColumn(1);
        sheet.autoSizeColumn(2);
        sheet.autoSizeColumn(3);
        sheet.autoSizeColumn(4);
        
        try {
            //Se genera el documento xls
            FileOutputStream out = new FileOutputStream(new File("/C:/Users/DianneElizeth/Documents/11SemESCOM/cedula0.xls"));
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
        titleFont.setFontHeightInPoints((short)16);
        titleFont.setBold(true);
        titleFont.setColor(IndexedColors.WHITE.getIndex());
        titleFont.setFontName("Arial Narrow");
        style = wb.createCellStyle();
        style.setAlignment(HorizontalAlignment.CENTER);
        style.setVerticalAlignment(VerticalAlignment.CENTER);
        style.setFillForegroundColor(IndexedColors.BLACK.getIndex());
        style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
        style.setFont(titleFont);
        style.setWrapText(true);
        styles.put("title", style);
        
        Font subFont = wb.createFont();
        subFont.setFontHeightInPoints((short)9);
        subFont.setBold(true);
        subFont.setColor(IndexedColors.BLACK.getIndex());
        subFont.setFontName("Arial Narrow");
        style = wb.createCellStyle();
        style.setAlignment(HorizontalAlignment.LEFT);
        style.setFont(subFont);
        styles.put("substyle", style);
        
        Font dataFont = wb.createFont();
        dataFont.setFontHeightInPoints((short)8);
        dataFont.setBold(true);
        dataFont.setColor(IndexedColors.BLACK.getIndex());
        dataFont.setFontName("Arial Narrow");
        style = wb.createCellStyle();
        style.setAlignment(HorizontalAlignment.CENTER);
        style.setVerticalAlignment(VerticalAlignment.CENTER);
        style.setBorderTop(BorderStyle.THIN);
        style.setBorderRight(BorderStyle.THIN);
        style.setFillForegroundColor(IndexedColors.LIGHT_CORNFLOWER_BLUE.getIndex());
        style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
        style.setFont(dataFont);
        styles.put("datastyle", style);
        
        Font levelFont = wb.createFont();
        levelFont.setFontHeightInPoints((short)9);
        levelFont.setBold(true);
        levelFont.setColor(IndexedColors.BLACK.getIndex());
        levelFont.setFontName("Arial Narrow");
        style = wb.createCellStyle();
        style.setAlignment(HorizontalAlignment.CENTER);
        style.setVerticalAlignment(VerticalAlignment.CENTER);
        style.setBorderTop(BorderStyle.THIN);
        style.setBorderBottom(BorderStyle.THIN);
        style.setBorderRight(BorderStyle.THIN);
        style.setFont(levelFont);
        styles.put("levelstyle", style);

        style = wb.createCellStyle();
        style.setBorderBottom(BorderStyle.THIN);
        style.setBorderRight(BorderStyle.THIN);
        style.setFont(levelFont);
        styles.put("instyle", style);
       
        Font headerFont = wb.createFont();
        headerFont.setFontHeightInPoints((short)8);
        headerFont.setBold(true);
        headerFont.setColor(IndexedColors.BLACK.getIndex());
        headerFont.setFontName("Arial Narrow");
        style = wb.createCellStyle();
        style.setAlignment(HorizontalAlignment.CENTER);
        style.setVerticalAlignment(VerticalAlignment.CENTER);
        style.setBorderTop(BorderStyle.THIN);
        style.setBorderBottom(BorderStyle.THIN);
        style.setFillForegroundColor(IndexedColors.LIGHT_CORNFLOWER_BLUE.getIndex());
        style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
        style.setFont(headerFont);
        styles.put("header", style);
        
        
        return styles;
        
    } 
  
}
