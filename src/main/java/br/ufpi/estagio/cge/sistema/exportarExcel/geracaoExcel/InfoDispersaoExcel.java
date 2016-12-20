package br.ufpi.estagio.cge.sistema.exportarExcel.geracaoExcel;

import java.util.ArrayList;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.web.servlet.view.document.AbstractExcelView;

import br.ufpi.estagio.cge.grafico.GraficoDispersao;



public class InfoDispersaoExcel extends AbstractExcelView {

	@Override
	protected void buildExcelDocument(Map model, HSSFWorkbook workbook,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {

		HSSFSheet excelSheet = workbook.createSheet("Informacao List");
		setExcelHeader(excelSheet);
		
		ArrayList<GraficoDispersao> list = (ArrayList<GraficoDispersao>) model.get("list");
		setExcelRows(excelSheet,list);
		
	}

	public void setExcelHeader(HSSFSheet excelSheet) {
		HSSFRow excelHeader = excelSheet.createRow(0);
		excelHeader.createCell(0).setCellValue("matricula");
		excelHeader.createCell(1).setCellValue("Servidor");
		excelHeader.createCell(2).setCellValue("Tempo no cargo");
		excelHeader.createCell(3).setCellValue("Salario");
	}
	
	public void setExcelRows(HSSFSheet excelSheet, ArrayList<GraficoDispersao> list){
		int record = 1;
		for (GraficoDispersao aux : list) {
			HSSFRow excelRow = excelSheet.createRow(record++);
			
			String r = aux.getName().replace("Matrícula: ", "").replace("Nome", "");
			
			String[] s = r.split(":");
	
			excelRow.createCell(0).setCellValue(((s[0])));
			excelRow.createCell(1).setCellValue(s[1]);
			excelRow.createCell(2).setCellValue(aux.getData().get(0).get(0));
			excelRow.createCell(3).setCellValue(aux.getData().get(0).get(1));
		}
	}
}
