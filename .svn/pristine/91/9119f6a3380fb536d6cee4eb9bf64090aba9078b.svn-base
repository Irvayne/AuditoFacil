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
							<b>Dispersao dos Servidores </b>
						</h4>
						<hr>
						<h5 style="text-align: center">
						Nesta funcionalidade o usuario deve definir um cargo para realizar o filtro 	 
							 
						</h5>
						<hr>
						
						<div class=col-lg-6 style="left: 150px">
						
						<div id=tipo class=col-lg-12 style="left: 0px;text-align: center">
							<h6 style="text-align: center">
								<b>Escolher Tipo</b>
							</h6>
							
				


							<form class="form-control" id="tipo" name="tipo">	
								<input type="radio" id="cargo" value="cargo" name="tipo">Cargo
								<!--  <input type="radio" id="categoria" value="categoria" name="tipo">Categoria
								--><input type="radio" id="orgao" value="orgao" name="tipo">Orgão
							</form>

						</div>

						

						<div id="input1" class="col-lg-12" style="text-align: center">
							
							<h6 id="name_input1" style="text-align: center">
								
							</h6>
							<select id="select1" class="form-control">
							</select>
								
								
						</div>
						
						<div id="input2" class="col-lg-12" style="text-align: center">
							
							<h6 id="name_input2" style="text-align: center">
								<b></b>
							</h6>
							<select id="select2" class="form-control">
							</select>
								
								
						</div>
						
						<div id="input3" class="col-lg-12" style="text-align: center">
							
							<h6 id="name_input3" style="text-align: center">
								<b></b>
							</h6>
							<select class="form-control" id="select3" >
							</select>
								
								
						</div>
						
						
						
						
						

						<div id=gifCarregando class=col-lg-3 style="right :100px">


							<img
								src='http://i.kinja-img.com/gawker-media/image/upload/chag4hzw0pgvgy5ujnom.gif' />


						</div>
						
						
						
						<div id=datas class=col-lg-12 >
							<h6 style="text-align: center">
								<b>Janela de Tempo</b>
							</h6>
							<select class="form-control" id="data_selecionada" name="data_selecionada">

								<option id="data_2014" value="201401">01/2014</option>
								<option id="data_2014" value="201402">02/2014</option>
								<option id="data_2014" value="201403">03/2014</option>
								<option id="data_2014" value="201404">04/2014</option>
								<option id="data_2014" value="201405">05/2014</option>
								<option id="data_2014" value="201406">06/2014</option>
								<option id="data_2014" value="201407">07/2014</option>
								<option id="data_2014" value="201408">08/2014</option>
								<option id="data_2014" value="201409">09/2014</option>
								<option id="data_2014" value="201410">10/2014</option>
								<option id="data_2014" value="201411">11/2014</option>
								<option id="data_2014" value="201412">12/2014</option>
								
								<option id="data_2015" value="201501">01/2015</option>
								<option id="data_2015" value="201502">02/2015</option>
								<option id="data_2015" value="201503">03/2015</option>
								<option id="data_2015" value="201504">04/2015</option>
								<option id="data_2015" value="201505">05/2015</option>
								<option id="data_2015" value="201506">06/2015</option>
								<option id="data_2015" value="201507">07/2015</option>
								<option id="data_2015" value="201508">08/2015</option>
								<option id="data_2015" value="201509">09/2015</option>
								<option id="data_2015" value="201510">10/2015</option>
								<option id="data_2015" value="201511">11/2015</option>
								<option id="data_2015" value="201512">12/2015</option>
								
								<option id="data_2016" value="201601">01/2016</option>
								<option id="data_2016" value="201602">02/2016</option>
								<option id="data_2016" value="201603">03/2016</option>
								<option id="data_2016" value="201604" selected>04/2016</option>
								

							</select>
							

						</div>
						
						
						
						
						<div id=pesquisar class=col-md-12 style="text-align: center;top:20px">
							<button id=pesq type="button" class="btn btn-default">Pesquisar</button>
						</div>
						
						<div id=tipo_de_salario class=col-lg-6 style="left:350px; top:30px">
							<h6 >
								<b>Tipo de salario</b>
							</h6>

							<select class="form-control" id="tipo_de_salario" name="tipo_de_salario">

								<option id="bruto" value="bruto">bruto</option>
								<option id="liquido" value="liquido">líquido</option>
								</select>
								
								</div>
								
								
								
								
					</div>
					
					</div>
					
					<form id="exportar" action="download" method="post">
							<input id="escondido1" type="hidden" name="cargo" >
							<input id="escondido2" type="hidden" name="referencia" >
							<input  type="hidden" name="funcionalidade" value="dispersao" >
						<input type="submit" value="Exportar">	
						</form>	
						
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
		$(document).ready(function() {
			
			var datas = {};
			
			$('#exportar').hide();
			
			$('#input1').hide();
			$('#input2').hide();
			$('#input3').hide();
			
			$('#tipo_de_salario').hide();
			$('#datas').hide();
			
			$('#container').hide();
			$('#gifCarregando').hide();
			$('#gifGrafico').hide();
			
			$('#pesquisar').hide();
			
			
			
		
			
			$('input[type=radio][name=tipo]').click(function(){
				
				var tipo = $('input[type=radio][name=tipo]:checked').val();
				
				var select1 = document.getElementById("select1");
			    select1.innerHTML = '';
			    var select2 = document.getElementById("select2");
			    select2.innerHTML = '';
			    var select3 = document.getElementById("select3");
			    select3.innerHTML = '';
				
				if(tipo=='cargo'){
					
				datas['tipo'] = 'cargo';
					
				$('#gifGrafico').hide();
				$('#container').hide();
				$('#gifCarregando').show();
				
				
				
				$.ajax({
					type : 'POST',
					url : '/DataMiningCGE/listarCargos',
					success : function(data) {
						$('#gifCarregando').hide();
						
						
						$('#input1').show();
						$('#datas').show();
						$('#tipo_de_salario').show();
						
						var element = document.getElementById('name_input1');
						element.innerHTML = '<b>Cargo</b>';
						
						for(i = 0; i< data.length; i++){		
						var x = document.createElement('option');
						x.setAttribute('value', data[i]);
					    var t = document.createTextNode(data[i]);
					    x.appendChild(t);
					    document.getElementById('select1').appendChild(x);
						}
						$.ajax({
							type : 'POST',
							url : '/DataMiningCGE/listarCategorias',
							success : function(data) {
								
								$('#input2').show();
								
								var element = document.getElementById('name_input2');
								element.innerHTML = '<b>Categoria</b>';
								
								var x1 = document.createElement('option');
								x1.setAttribute('value', '');
							    var t1 = document.createTextNode('Todos');
							    x1.appendChild(t1);
							    document.getElementById('select2').appendChild(x1);
								
								for(i = 0; i< data.length; i++){		
								var x = document.createElement('option');
								x.setAttribute('value', data[i]);
							    var t = document.createTextNode(data[i]);
							    x.appendChild(t);
							    document.getElementById('select2').appendChild(x);
								}
								
								$.ajax({
									type : 'POST',
									url : '/DataMiningCGE/listarOrgaos',
									success : function(data) {
										
										$('#input3').show();
										$('#pesquisar').show();
										
										
										var element = document.getElementById('name_input3');
										element.innerHTML = '<b>Órgão</b>';
										
										var x2 = document.createElement('option');
										x2.setAttribute('value', '');
									    var t2 = document.createTextNode('Todos');
									    x2.appendChild(t2);
									    document.getElementById('select3').appendChild(x2);
										
										for(i = 0; i< data.length; i++){		
										var x = document.createElement('option');
										x.setAttribute('value', data[i]);
									    var t = document.createTextNode(data[i]);
									    x.appendChild(t);
									    document.getElementById('select3').appendChild(x);

									}
									}
								});
								
							}
						});	
					}
				});
				
				}
				
				if(tipo =='categoria'){
					
					datas['tipo'] = 'categoria';
					
					$('#gifGrafico').hide();
					$('#container').hide();
					$('#gifCarregando').show();
					
					$.ajax({
						type : 'POST',
						url : '/DataMiningCGE/listarCategorias',
						success : function(data) {
							
							$('#input1').show();
							
							var element = document.getElementById('name_input1');
							element.innerHTML = '<b>Categoria</b>';
							
							
							
							for(i = 0; i< data.length; i++){		
							var x = document.createElement('option');
							x.setAttribute('value', data[i]);
						    var t = document.createTextNode(data[i]);
						    x.appendChild(t);
						    document.getElementById('select1').appendChild(x);
							}
							
							$.ajax({
								type : 'POST',
								url : '/DataMiningCGE/listarCargos',
								success : function(data) {
									$('#gifCarregando').hide();
									
									
									$('#input2').show();
									$('#datas').show();
									$('#tipo_de_salario').show();
									
									var element = document.getElementById('name_input2');
									element.innerHTML = '<b>Cargo</b>';
									
									var x2 = document.createElement('option');
									x2.setAttribute('value', '');
								    var t2 = document.createTextNode('Todos');
								    x2.appendChild(t2);
								    document.getElementById('select2').appendChild(x2);
									
									for(i = 0; i< data.length; i++){		
									var x = document.createElement('option');
									x.setAttribute('value', data[i]);
								    var t = document.createTextNode(data[i]);
								    x.appendChild(t);
								    document.getElementById('select2').appendChild(x);
									}
									
									$.ajax({
										type : 'POST',
										url : '/DataMiningCGE/listarOrgaos',
										success : function(data) {
											
											$('#input3').show();
											$('#pesquisar').show();
											
											
											var element = document.getElementById('name_input3');
											element.innerHTML = '<b>Órgão</b>';
											
											var x2 = document.createElement('option');
											x2.setAttribute('value', '');
										    var t2 = document.createTextNode('Todos');
										    x2.appendChild(t2);
										    document.getElementById('select3').appendChild(x2);
											
											for(i = 0; i< data.length; i++){		
											var x = document.createElement('option');
											x.setAttribute('value', data[i]);
										    var t = document.createTextNode(data[i]);
										    x.appendChild(t);
										    document.getElementById('select3').appendChild(x);

										}
										}
									});
									
								}
							});
						}
					});
					
				}
				
				if(tipo=='orgao'){
					
					datas['tipo'] = 'orgao';
					
					$('#gifGrafico').hide();
					$('#container').hide();
					$('#gifCarregando').show();
					
					
					$.ajax({
						type : 'POST',
						url : '/DataMiningCGE/listarOrgaos',
						success : function(data) {
							
							$('#input1').show();
							$('#pesquisar').show();
							
							
							var element = document.getElementById('name_input1');
							element.innerHTML = '<b>Órgão</b>';
							
							
							
							for(i = 0; i< data.length; i++){		
							var x = document.createElement('option');
							x.setAttribute('value', data[i]);
						    var t = document.createTextNode(data[i]);
						    x.appendChild(t);
						    document.getElementById('select1').appendChild(x);
				

						}
							
							$.ajax({
								type : 'POST',
								url : '/DataMiningCGE/listarCategorias',
								success : function(data) {
									
									$('#input2').show();
									
									var element = document.getElementById('name_input2');
									element.innerHTML = '<b>Categoria</b>';
									
									var x1 = document.createElement('option');
									x1.setAttribute('value', '');
								    var t1 = document.createTextNode('Todos');
								    x1.appendChild(t1);
								    document.getElementById('select2').appendChild(x1);
									
									for(i = 0; i< data.length; i++){		
									var x = document.createElement('option');
									x.setAttribute('value', data[i]);
								    var t = document.createTextNode(data[i]);
								    x.appendChild(t);
								    document.getElementById('select2').appendChild(x);
									}
									$.ajax({
										type : 'POST',
										url : '/DataMiningCGE/listarCargos',
										success : function(data) {
											$('#gifCarregando').hide();
											
											
											$('#input3').show();
											$('#datas').show();
											$('#tipo_de_salario').show();
											
											var element = document.getElementById('name_input3');
											element.innerHTML = '<b>Cargo</b>';
											
											var x2 = document.createElement('option');
											x2.setAttribute('value', '');
										    var t2 = document.createTextNode('Todos');
										    x2.appendChild(t2);
										    document.getElementById('select3').appendChild(x2);
											
											for(i = 0; i< data.length; i++){		
											var x = document.createElement('option');
											x.setAttribute('value', data[i]);
										    var t = document.createTextNode(data[i]);
										    x.appendChild(t);
										    document.getElementById('select3').appendChild(x);
											}
											

											
										}
									});
								
								}
							});
						}
					});
					
						
				}
			});
			
			
			
			$('#pesq').click(function(){
				
				
				
				datas['tipoSalario'] = $('#tipo_de_salario option:selected').attr('value');
				datas['referencia'] = $('#data_selecionada option:selected').attr('value');

					if(datas['tipo'] == 'cargo'){
						datas['input1'] = $('#select1').val();
						datas['input2'] = $('#select2').val();
						datas['input3'] = $('#select3').val();
						
						document.getElementById("escondido1").value = datas['input1'];
						document.getElementById("escondido2").value = datas['referencia'];
						
					}
					if(datas['tipo'] == 'categoria'){
						datas['input2'] = $('#select1').val();
						datas['input1'] = $('#select2').val();
						datas['input3'] = $('#select3').val();

					}
					if(datas['tipo'] == 'orgao'){
						datas['input3'] = $('#select1').val();
						datas['input2'] = $('#select2').val();
						datas['input1'] = $('#select3').val();	
					}
					
					
					requisicao();

				
			});
			
			function requisicao(){
								$('#container').hide();
								$('#gifGrafico').show();
								$.ajax({
									type : 'POST',
									contentType : 'application/json',
									url : '/DataMiningCGE/dispersao',
									data : JSON.stringify(datas),
									dataType : 'json',
									success : function(data) {
										
										
										$('#container').show();
										  Highcharts.chart('container', {
										        chart: {
										            type: 'scatter',
										            zoomType: 'xy'
										        },
										        title: {
										            text: 'Gráfico de Dispersão'
										        },
										        subtitle: {
										            text: 'Relacão entre o salário e o tempo de cargo'
										        },
										        xAxis: {
										            title: {
										                enabled: true,
										                text: 'Tempo no Cargo (Meses)'
										            },
										            startOnTick: true,
										            endOnTick: true,
										            showLastLabel: true
										        },
										        yAxis: {
										            title: {
										                text: 'Salário (Reais)'
										            }
										        },
										        legend: {
										            layout: 'vertical',
										            align: 'left',
										            verticalAlign: 'top',
										            x: -5000,
										            y: -5000,
										            floating: true,
										            backgroundColor: (Highcharts.theme && Highcharts.theme.legendBackgroundColor) || '#FFFFFF',
										            borderWidth: 1
										        },
										        plotOptions: {
										            scatter: {
										            	 point: {
										                     events: {
										                         'click': function () {
										                                
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
										            	
										            
										                marker: {
										                    radius: 5,
										                    states: {
										                        hover: {
										                            enabled: true,
										                            lineColor: 'rgb(100,100,100)'
										                        }
										                    }
										                },
										                states: {
										                    hover: {
										                        marker: {
										                            enabled: false
										                        }
										                    }
										                },
										                tooltip: {
										                    headerFormat: '<b>{series.name}</b><br>',
										                    pointFormat: '{point.x} Meses, {point.y} Reais'
										                }
										            }
										        },
										        series: data
										    });
										  
										  $('#gifGrafico').hide();
										
										  
										  $('#exportar').show();
										  
										  
									}
								});
								
							}
							

						})
	</script>

</body>
</html>
