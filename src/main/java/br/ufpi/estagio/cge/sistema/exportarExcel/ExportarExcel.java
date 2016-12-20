package br.ufpi.estagio.cge.sistema.exportarExcel;

import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.servlet.ModelAndView;

import br.ufpi.estagio.cge.dao.MovimentoDAO;
import br.ufpi.estagio.cge.dao.ServidorDAO;
import br.ufpi.estagio.cge.extrator.AlgoritmoBusca;
import br.ufpi.estagio.cge.grafico.Dados;
import br.ufpi.estagio.cge.grafico.GraficoDispersao;
import br.ufpi.estagio.cge.grafico.GraficoLinha;
import br.ufpi.estagio.cge.modelo.Servidor;
/**
 * Classe que realiza o processo de geracao de Excel 
 * 
 * @author Irvayne Matheus
 *
 */
public class ExportarExcel {
	/**
	 * Metodo que realiza a geracao dos excel de acordo com a funcionalidade especificada
	 * @param request - informacoes vindas das views
	 * @return - o excel gerado
	 * @throws SQLException
	 */
	public static ModelAndView exportar(HttpServletRequest request) throws SQLException{
		String funcionalidade = request.getParameter("funcionalidade");
		if (funcionalidade.equals("mediaSalarial")) {
			
			String entrada1 = request.getParameter("entrada1");
			String entrada2 = request.getParameter("entrada2");
			String entrada3 = request.getParameter("entrada3");
			String entrada4 = request.getParameter("entrada4");
			String entrada5 = request.getParameter("entrada5");
			String entrada6 = request.getParameter("entrada6");
			String entrada7 = request.getParameter("entrada7");
			String entrada8 = request.getParameter("entrada8");
			String entrada9 = request.getParameter("entrada9");
			String referencia = request.getParameter("referencia");
			String tipoSalario = request.getParameter("tipoSalario");
			int qntFiltros = Integer.parseInt(request.getParameter("qntFiltros"));
			
			if(qntFiltros==1){
				Dados dados = new Dados();
				dados.setInput1(entrada1);
				dados.setInput2(entrada2);
				dados.setInput3(entrada3);
				dados.setReferencia(referencia);
				dados.setTipoSalario(tipoSalario);
				dados.setTipo("cargo");
				ArrayList<GraficoLinha> graficoMedia =  AlgoritmoBusca.mediaSalarial(dados);
				return new ModelAndView("InformacaoMediaExcel", "list", graficoMedia);
				
			}
		} 
		if(funcionalidade.equals("dispersao")) {
			String cargo = request.getParameter("cargo");
			String referencia = request.getParameter("referencia");

			Dados dados = new Dados();
			dados.setInput1(cargo);
			dados.setReferencia(referencia);
			dados.setTipo("cargo");
			dados.setTipoSalario("bruto");

			dados.setInput2("");
			dados.setInput3("");
			dados.setInput4("");
			dados.setInput5("");
			dados.setInput6("");
			dados.setInput7("");
			dados.setInput8("");
			dados.setInput9("");

			ArrayList<GraficoDispersao> grafico = AlgoritmoBusca.graficoDispersaoSalarioPorTempo(dados);

			return new ModelAndView("InformacaoDispersaoExcel", "list", grafico);
		}
		if(funcionalidade.equals("detalheServidor")){
			String matricula = request.getParameter("matricula");
			String referencia = request.getParameter("referencia");
			
			Servidor servidor = ServidorDAO.buscar(matricula);
			servidor.setReferencia(referencia);
			servidor.setMovimentos(MovimentoDAO.listarMovimento(matricula, referencia));
			
			return new ModelAndView("InformacaoServidorExcel", "servidor", servidor);
			

		}
		
		return null;
}
}
