<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>Cloudset</title>


<script type="text/javascript" src="resources/js/cufon-yui.js"></script>
<script type="text/javascript" src="resources/js/droid_sans_400-droid_sans_700.font.js"></script>
<script type="text/javascript" src="resources/js/jquery-1.4.2.min.js"></script>
<script type="text/javascript" src="resources/js/script.js"></script>
<script type="text/javascript" src="resources/js/coin-slider.min.js"></script>

<link rel="stylesheet"
	href="https://cdn.rawgit.com/LeaVerou/awesomplete/gh-pages/awesomplete.css">
<script
	src="https://cdn.rawgit.com/LeaVerou/awesomplete/gh-pages/awesomplete.min.js"></script>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.3/jquery.min.js"></script>
<script src="https://code.highcharts.com/highcharts.js"></script>
<script src="https://code.highcharts.com/highcharts-more.js"></script>

<!-- Latest compiled and minified CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
	integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u"
	crossorigin="anonymous">



<!-- Optional theme -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css"
	integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp"
	crossorigin="anonymous">

<!-- Latest compiled and minified JavaScript -->
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"
	integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa"
	crossorigin="anonymous"></script>
	
	<link href="resources/css/style.css" rel="stylesheet" type="text/css" />
<link rel="stylesheet" type="text/css" href="resources/css/coin-slider.css" />
</head>
<body>
<div class="main">
  <div class="header">
    <div class="header_resize">
      <div class="logo">
        <h1><a href="/DataMiningCGE/">AuditoFacil<small>Um software para ajudar nas atividades de auditoria</small></a></h1>
      </div>
      <div class="searchform">
        <form id="formsearch" name="formsearch" method="post" action="#">
          <span>
          <input name="editbox_search" class="editbox_search" id="editbox_search" maxlength="80" value="Search our ste:" type="text" />
          </span>
          <input name="button_search" src="resources/images/search.gif" class="button_search" type="image" />
        </form>
      </div>
      <div class="clr"></div>
      <div class="menu_nav" style="border-radius: 10px;">
        <ul>
          <li class="active"><a href="/DataMiningCGE/"><span>Pagina Inicial</span></a></li>
          <li><a href="#"><span>Suporte</span></a></li>
          <li><a href="#"><span>Sobre</span></a></li>
          <li><a href="#"><span>Contato</span></a></li>
        </ul>
      </div>
      <div class="clr"></div>
      
  </div>
  <div class="content">
    <div class="content_resize">
    	<div class="sidebar">
        <div class="gadget">
          <h2 class="star"> Consultas</h2>
          <div class="clr"></div>
          <ul class="sb_menu">
            <li><a href="dispersaoServidores">Dispersão dos Salarios</a></li>
            <li><a href="/DataMiningCGE/mediaSalarial">Média Salarial</a></li>
            <li><a href="/DataMiningCGE/faixa">Faixa Etária</a></li>
            <li><a href="/DataMiningCGE/piramideHierarquica">Pirâmide Hierárquica</a></li>
            <li><a href="/DataMiningCGE/porcentagemGasto">Distribuição dos Gastos</a></li>
            <li><a href="/DataMiningCGE/mapaDemografico">Mapa Demográfico</a></li>
          </ul>
        </div>
        
      </div>
    
    
      <div class="mainbar">
        
 <div class="modal fade" id="myModal">
	
	<div class="modal-dialog">
		
		<div class="modal-content">
			
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal"
					aria-label="Close">
					<span aria-hidden="true">&times;</span>
				</button>
				<h4 class="modal-title">
					Informações do Servidor
				</h4>
			</div>
			
			<div class="modal-body" >
				<h5 id = "matricula"></h5>
				<h5 id = "cpf"></h5>
				<h5 id = "nome_servidor"></h5>
				<h5 id = "cargo_descricao"></h5>
				<h5 id = "categoria_descricao"></h5>
				<h5 id = "orgao_descricao"></h5>
				<h5 id = "dataNascimento"></h5>
				<h5 id = "dataAdmissao"></h5>
				
				
				
							
			</div>
			
			<form id="exportarModal" action="download" method="post">
							<input id="escondido3" type="hidden" name="matricula" >
							<input id="escondido2" type="hidden" name="referencia" >
							<input  type="hidden" name="funcionalidade" value="detalheServidor" >
						<input type="submit" value="Exportar">	
						</form>
						
			
				<div class="movimentos">
 				 <center><h4>Histórico de Movimentos</h4></center>
  						<table class="table">
    						<thead style="overflow-y: auto">
      							<tr>
        							<th>Descrição do Movimento</th>
        							<th>Valor (Reais)</th>
        							<th>Tipo</th>
      							</tr>
   						 	</thead>
    						<tbody id="corpo">
    						
    						</tbody>
  						</table>
					</div>

			<div id="gif_modal"
						style="width: 600px; height: 500px; margin: 0 auto">
						<img
								src='http://i.kinja-img.com/gawker-media/image/upload/chag4hzw0pgvgy5ujnom.gif' />
						</div>
			
			<div id="container1"
						style="width: 590px; height: 500px; margin: 0 auto"></div>
						
						
			
			<div class="modal-footer">

					<button type="button" class="btn btn-default" data-dismiss="modal">
						Fechar</button>
					
			</div>
			
		</div>

	</div>

</div>
			
				<div class="panel panel-default">
					<div class="panel-body">
						<h4 style="text-align: center">
							<b>Faixa Etaria</b>
						</h4>
						<hr>
						<h5 style="text-align: center">Distribuicao da faixa etaria dos servidores</h5>
						<hr>

						<div id=tipo class=col-lg-3 style="left: 0px">
							<h6 style="text-align: left">
								<b>Escolher Tipo</b>
							</h6>


							<select class="form-control" id="tipo" name="tipo">

								<option id="vazio" value="vazio">Selecione o Tipo</option>
								<option id="cargo" value="cargo">Cargo</option>
								<option id="categoria" value="categoria">Categoria</option>
								<option id="orgao" value="orgao">Orgão</option>

							</select>

						</div>



						<div id=input_cargo class=col-lg-3 style="left: 30px; top: 0px">

							<h6 style="text-align: left">
								<b>Cargo</b>
							</h6>
							<input id="cargo1" placeholder="Escolha o primeiro cargo"
								required />


						</div>

						<div id=input_categoria class=col-lg-3
							style="left: 30px; top: 0px">

							<h6 style="text-align: left">
								<b>Categoria</b>
							</h6>
							<input id="categoria1" placeholder="Escolha a primeira categoria"
								required />

						</div>

						<div id=input_orgao class=col-lg-3 style="left: 30px; top: 0px">

							<h6 style="text-align: left">
								<b>Orgão</b>
							</h6>
							<input id="orgao1" placeholder="Escolha o primeira Orgão"
								required />

						</div>



						<div id=gifCarregando class=col-lg-3 style="right: 100px">


							<img
								src='http://i.kinja-img.com/gawker-media/image/upload/chag4hzw0pgvgy5ujnom.gif' />


						</div>

						<div id=datas class=col-lg-3 style="left: 80px; top: 0px">
							<h6 style="text-align: left">
								<b>Janela de Tempo</b>
							</h6>


							<select class="form-control" id="data_selecionada"
								name="data_selecionada">

								<option id="vazio" value="vazio">Selecione uma data</option>
								<option id="data_2014" value="2014">2014</option>
								<option id="data_2015" value="2015">2015</option>
								<option id="data_2016" value="2016">2016</option>


							</select>


						</div>
					</div>
					<div class="panel-body">

						<div id="container"
							style="width: 600px; height: 500px; margin: 0 auto"></div>
					</div>

					<div class="panel-body">

						<div id="gifGrafico"
							style="width: 600px; height: 500px; margin: 0 auto">
							<img
								src='http://i.kinja-img.com/gawker-media/image/upload/chag4hzw0pgvgy5ujnom.gif' />
						</div>
					</div>
				</div>
			</div>
		
		
		</div>
        
       
        
      </div>
      
      <div class="clr"></div>
    </div>
  </div>
  
    
  <div class="footer">
    <div class="footer_resize">
      <p class="lf">Copyright &copy; <a href="http://www.ufpi.br/">Universidade Federal do Piauí - UFPI</a>. All Rights Reserved</p>
      <p class="rf">Design by <a target="_blank" href="https://github.com/Irvayne">Irvayne Matheus de Sousa Ibiapina</a></p>
      <div style="clear:both;"></div>
    </div>
  </div>
</div>

<script language="JavaScript">
		$(document)
				.ready(
						function() {

							var datas = {};

							$('#input_cargo').hide();
							$('#input_categoria').hide();
							$('#input_orgao').hide();

							$('#datas').hide();
							$('#container').hide();
							$('#gifCarregando').hide();
							$('#gifGrafico').hide();

							$('#tipo').change(showdata);
							showdata();

							function showdata() {
								if ($('#tipo option:selected').attr('id') == 'cargo') {
									$('#gifGrafico').hide();
									datas['tipo'] = 'cargo';
									$('#container').hide();
									$('#gifCarregando').show();
									$('#input_categoria').hide();
									$('#input_orgao').hide();
									$('#datas').hide();

									$.ajax({
										type : 'POST',
										url : '/DataMiningCGE/listarCargos',
										success : function(data) {
											$('#gifCarregando').hide();
											$('#input_categoria').hide();
											$('#input_orgao').hide();
											$('#input_cargo').show();
											$('#datas').show();

											var input = document
													.getElementById("cargo1");
											var awesomplete = new Awesomplete(
													input, {
														minChars : 1,
														autoFirst : true,
														maxItems : 10
													});
											awesomplete.list = data;

										}
									});

								}
								if ($('#tipo option:selected').attr('id') == 'categoria') {
									$('#container').hide();
									datas['tipo'] = 'categoria';
									$('#gifCarregando').show();
									$('#input_orgao').hide();
									$('#input_cargo').hide();
									$('#datas').hide();
									$('#gifGrafico').hide();

									$
											.ajax({
												type : 'POST',
												url : '/DataMiningCGE/listarCategorias',
												success : function(data) {
													$('#gifCarregando').hide();
													$('#input_orgao').hide();
													$('#input_cargo').hide();
													$('#input_categoria')
															.show();
													$('#datas').show();

													var input = document
															.getElementById("categoria1");
													var awesomplete = new Awesomplete(
															input,
															{
																minChars : 1,
																autoFirst : true,
																maxItems : 10
															});
													awesomplete.list = data;

												}
											});

								}
								if ($('#tipo option:selected').attr('id') == 'orgao') {
									$('#container').hide();
									datas['tipo'] = 'orgao';
									$('#gifGrafico').hide();
									$('#input_cargo').hide();
									$('#input_categoria').hide();
									$('#datas').hide();
									$('#gifCarregando').show();

									$.ajax({
										type : 'POST',
										url : '/DataMiningCGE/listarOrgaos',
										success : function(data) {
											$('#gifCarregando').hide();
											$('#input_cargo').hide();
											$('#input_categoria').hide();
											$('#input_orgao').show();
											$('#datas').show();

											var input = document
													.getElementById("orgao1");
											var awesomplete = new Awesomplete(
													input, {
														minChars : 1,
														autoFirst : true,
														maxItems : 10
													});
											awesomplete.list = data;

										}
									});
								}
								if ($('#tipo option:selected').attr('id') == 'vazio') {
									$('#gifGrafico').hide();
									$('#container').hide();
									$('#input_cargo').hide();
									$('#input_categoria').hide();
									$('#input_orgao').hide();
									$('#datas').hide();
									$('#gifCarregando').hide();
								}

							}

							$('#data_selecionada').change(showdatas);
							showdatas();

							function showdatas() {
								if ($('#data_selecionada option:selected')
										.attr('id') == 'data_2014') {

									if (datas['tipo'] == 'cargo') {
										var input1 = $('#cargo1').val();

										datas['input1'] = input1;
										datas['tipo'] = 'cargo';

									}
									if (datas['tipo'] == 'categoria') {
										var input1 = $('#categoria1').val();

										datas['input1'] = input1;
										datas['tipo'] = 'categoria';
									}
									if (datas['tipo'] == 'orgao') {
										var input1 = $('#orgao1').val();

										datas['input1'] = input1;
										datas['tipo'] = 'orgao';
									}
									datas['referencia'] = $(
											'#data_selecionada option:selected')
											.attr('value');

									requisicao();

								}

								if ($('#data_selecionada option:selected')
										.attr('id') == 'data_2015') {

									if (datas['tipo'] == 'cargo') {
										var input1 = $('#cargo1').val();

										datas['input1'] = input1;
										datas['tipo'] = 'cargo';

									}
									if (datas['tipo'] == 'categoria') {
										var input1 = $('#categoria1').val();

										datas['input1'] = input1;
										datas['tipo'] = 'categoria';
									}
									if (datas['tipo'] == 'orgao') {
										var input1 = $('#orgao1').val();

										datas['input1'] = input1;
										datas['tipo'] = 'orgao';
									}
									datas['referencia'] = $(
											'#data_selecionada option:selected')
											.attr('value');

									requisicao();

								}

								if ($('#data_selecionada option:selected')
										.attr('id') == 'data_2016') {

									if (datas['tipo'] == 'cargo') {
										var input1 = $('#cargo1').val();

										datas['input1'] = input1;
										datas['tipo'] = 'cargo';

									}
									if (datas['tipo'] == 'categoria') {
										var input1 = $('#categoria1').val();

										datas['input1'] = input1;
										datas['tipo'] = 'categoria';
									}
									if (datas['tipo'] == 'orgao') {
										var input1 = $('#orgao1').val();

										datas['input1'] = input1;
										datas['tipo'] = 'orgao';
									}
									datas['referencia'] = $(
											'#data_selecionada option:selected')
											.attr('value');

									requisicao();
								}
							}

							function requisicao() {
								$('#gifGrafico').show();
								$
										.ajax({
											type : 'POST',
											contentType : 'application/json',
											url : '/DataMiningCGE/faixaEtaria',
											data : JSON.stringify(datas),
											dataType : 'json',
											success : function(data) {
												$('#gifGrafico').hide();
												$('#container').show();
												// Age categories
												var categories = [ '0-5',
														'6-10', '11-15',
														'16-20', '21-24',
														'25-29', '30-34',
														'35-39', '40-44',
														'45-49', '50-54',
														'55-59', '60-64',
														'65-69', '70-74',
														'75-79', '80-84',
														'85-89', '90-94',
														'95-99', '100 + ' ];

												Highcharts
														.chart(
																'container',
																{
																	chart : {
																		type : 'bar'
																	},
																	title : {
																		text : 'Faixa Etária'
																	},
																	subtitle : {
																		text : 'Faixa Etária dos Servidores Públicos Estaduais do Piauí'
																	},
																	xAxis : [
																			{
																				categories : categories,
																				reversed : false,
																				labels : {
																					step : 1
																				}
																			},
																			{ // mirror axis on right side
																				opposite : true,
																				reversed : false,
																				categories : categories,
																				linkedTo : 0,
																				labels : {
																					step : 1
																				}
																			} ],
																	yAxis : {
																		title : {
																			text : null
																		},
																		labels : {
																			formatter : function() {
																				return this.value;
																			}
																		}
																	},

																	plotOptions : {
																		
																	point:{
																		 events: { 'click': function () {
												                                
												                        	 var data1 =  {};
												                                data1['input1'] = this.series.name;
												                                data1['referencia'] = $('#data_selecionada option:selected').attr('value');
												                             
												                                $.ajax({
																					type : 'POST',
																					contentType : 'application/json',
																					url : '/DataMiningCGE/detalheServidor',
																					data : JSON.stringify(data1),
																					dataType : 'json',
																					success : function(dataServ) {
																						document.getElementById("escondido3").value = dataServ.matricula;
																						$('#myModal').modal('toggle');
																						var element = document.getElementById('matricula');
																						element.innerHTML = '<b>Matricula: </b>'+dataServ.matricula;
																						element = document.getElementById('cpf');
																						element.innerHTML = '<b>CPF: </b>'+dataServ.cpf;
																						element = document.getElementById('nome_servidor');
																						element.innerHTML = '<b>Nome: </b>'+dataServ.nome;
																						element = document.getElementById('cargo_descricao');
																						element.innerHTML = '<b>Cargo: </b>'+dataServ.cargo_descricao;
																						element = document.getElementById('categoria_descricao');
																						element.innerHTML = '<b>Categoria: </b>'+dataServ.categoria;
																						element = document.getElementById('dataNascimento');
																						element.innerHTML = '<b>Data de Nascimento: </b>'+dataServ.data_nascimento;
																						element = document.getElementById('dataAdmissao');
																						element.innerHTML = '<b>Data de Admissão: </b>'+dataServ.data_admissao;
																						element = document.getElementById('orgao_descricao');
																						element.innerHTML = '<b>Órgão: </b>'+dataServ.orgao_descricao;
																						
																						
																						element = document.getElementById('corpo');
																						element.innerHTML = "";
																						for(i = 0; i<dataServ.movimentos.length; i++){
																							
																						element.innerHTML = element.innerHTML + '<tr><td>'+dataServ.movimentos[i].financeiro_descricao+'</td><td>'+dataServ.movimentos[i].valor+'</td><td>'+dataServ.movimentos[i].tipo+'</td></tr>';
																						}
																						element.innerHTML = element.innerHTML + '<tr><td>SALÁRIO BRUTO</td><td>'+dataServ.salarioBruto+'</td><td></td></tr>';
																						element.innerHTML = element.innerHTML + '<tr><td>SALÁRIO LÌQUIDO</td><td>'+dataServ.salarioLiquido+'</td><td></td></tr>';
																						
																						$('#gif_modal').hide();
																						$('#container1').hide();
																					}
												                                
												                                });
												                             
												                         }
																		 } 
																		 },
																		series : {
																			stacking : 'normal'
																		}
																	},

																	tooltip : {
																		formatter : function() {
																			return '<b>'
																					+ this.series.name
																					+ ', Idade '
																					+ this.point.category
																					+ '</b><br/>'
																					+ 'Quantidade: '
																					+ Highcharts
																							.numberFormat(
																									Math
																											.abs(this.point.y),
																									0);
																		}
																	},

																	series : data

																});

											}
										});

							}

						})
	</script>

</body>
</html>
