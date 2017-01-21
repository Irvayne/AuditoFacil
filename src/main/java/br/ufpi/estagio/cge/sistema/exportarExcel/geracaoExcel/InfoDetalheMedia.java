package br.ufpi.estagio.cge.sistema.exportarExcel.geracaoExcel;

import java.util.ArrayList;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.web.servlet.view.document.AbstractExcelView;

import br.ufpi.estagio.cge.grafico.GraficoLinha;
import br.ufpi.estagio.cge.modelo.Movimento;



public class InfoDetalheMedia extends AbstractExcelView {

	@Override
	protected void buildExcelDocument(Map model, HSSFWorkbook workbook,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {

		HSSFSheet excelSheet = workbook.createSheet("Informacao List");
		setExcelHeader(excelSheet);
		
		ArrayList<Movimento> list = (ArrayList<Movimento>) model.get("detalheMedia");
		setExcelRows(excelSheet,list);
		
	}

	public void setExcelHeader(HSSFSheet excelSheet) {
		HSSFRow excelHeader = excelSheet.createRow(0);
		excelHeader.createCell(0).setCellValue("Descrição financeiro");
		excelHeader.createCell(1).setCellValue("Quantidade");
		excelHeader.createCell(2).setCellValue("Valor");
		excelHeader.createCell(3).setCellValue("Tipo");
		
	}
	
	public void setExcelRows(HSSFSheet excelSheet, ArrayList<Movimento> list){
		int record = 1;
		for (Movimento aux : list) {
			HSSFRow excelRow = excelSheet.createRow(record++);
			excelRow.createCell(0).setCellValue(aux.getFinanceiro_descricao());
			excelRow.createCell(1).setCellValue(aux.getQuantidade());
			excelRow.createCell(2).setCellValue(aux.getValor());
			excelRow.createCell(3).setCellValue(aux.getTipo());

		}
	}
}
