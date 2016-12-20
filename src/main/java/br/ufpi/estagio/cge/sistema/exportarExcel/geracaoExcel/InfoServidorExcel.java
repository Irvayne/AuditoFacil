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
import br.ufpi.estagio.cge.modelo.Movimento;
import br.ufpi.estagio.cge.modelo.Servidor;



public class InfoServidorExcel extends AbstractExcelView {

	@Override
	protected void buildExcelDocument(Map model, HSSFWorkbook workbook,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {

		HSSFSheet excelSheet = workbook.createSheet("Informacao do Servidor");
		setExcelHeader(excelSheet);
		
		Servidor servidor = (Servidor) model.get("servidor");
		setExcelRows(excelSheet,servidor);
		
	}

	public void setExcelHeader(HSSFSheet excelSheet) {
		HSSFRow excelHeader = excelSheet.createRow(0);
		excelHeader.createCell(0).setCellValue("Referência");
		excelHeader.createCell(1).setCellValue("Matricula");
		excelHeader.createCell(2).setCellValue("Cpf");
		excelHeader.createCell(3).setCellValue("Nome");
		excelHeader.createCell(4).setCellValue("Cargo");
		excelHeader.createCell(5).setCellValue("Categoria");
		excelHeader.createCell(6).setCellValue("Órgão");
		//excelHeader.createCell(7).setCellValue("Salário Bruto");
		//excelHeader.createCell(8).setCellValue("Salário Líquido");
		excelHeader.createCell(7).setCellValue("Movimento");
		excelHeader.createCell(8).setCellValue("Valor");
		excelHeader.createCell(9).setCellValue("Tipo");
	}
	
	public void setExcelRows(HSSFSheet excelSheet, Servidor servidor){
		int record = 1;
		HSSFRow excelRow = excelSheet.createRow(record);
		excelRow.createCell(0).setCellValue(servidor.getReferencia());
		excelRow.createCell(1).setCellValue(servidor.getMatricula());
		excelRow.createCell(2).setCellValue(servidor.getCpf());
		excelRow.createCell(3).setCellValue(servidor.getNome());
		excelRow.createCell(4).setCellValue(servidor.getCargo_descricao());
		excelRow.createCell(5).setCellValue(servidor.getCategoria());
		excelRow.createCell(6).setCellValue(servidor.getOrgao_descricao());
		//excelRow.createCell(7).setCellValue(servidor.getSalarioBruto());
		//excelRow.createCell(8).setCellValue(servidor.getSalarioLiquido());
		for (Movimento aux : servidor.getMovimentos()) {
			
			excelRow.createCell(7).setCellValue(aux.getFinanceiro_descricao());
			excelRow.createCell(8).setCellValue(aux.getValor());
			excelRow.createCell(9).setCellValue(aux.getTipo());
			
			record++;
			excelRow = excelSheet.createRow(record);
			
		}
	}
}
