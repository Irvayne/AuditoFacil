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
			
			<form id="exportarModal" action="download" method="post">
						<input id="escondido1" type="hidden" name="entrada1" >
							<input id="escondido2" type="hidden" name="entrada2" >
							<input id="escondido3" type="hidden" name="entrada3" >
							<input id="escondido4" type="hidden" name="entrada4" >
							<input id="escondido5" type="hidden" name="entrada5" >
							<input id="escondido6" type="hidden" name="entrada6" >
							<input id="escondido7" type="hidden" name="entrada7" >
							<input id="escondido8" type="hidden" name="entrada8" >
							<input id="escondido9" type="hidden" name="entrada9" >
							<input id="escondido10" type="hidden" name="referencia" >
							<input id="escondido11" type="hidden" name="tipoSalario" >
							<input id="escondido12" type="hidden" name="qntFiltros" >
							<input id="escondido13" type="hidden" name="funcionalidade" value="detalheMedia" >
						<input type="submit" value="Exportar">	
						</form>
				<div class="movimentos">
 				 <center><h4>Histórico de Movimentos</h4></center>
  						<table class="table">
    						<thead style="overflow-y: auto">
      							<tr>
        							<th>Descrição do Movimento</th>
        							<th>Valor (Reais)</th>
        							<th>Quantidade de Servidores</th>
        							<th>Tipo</th>
      							</tr>
   						 	</thead>
    						<tbody id="corpo">
    						
    						</tbody>
  						</table>
					</div>
					
					

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
							<b>Relatorio sobre a Media Salarial </b>
						</h4>
						<hr>
						<h5 style="text-align: center">Nesta funcionalidade é mostrado um gráfico linha com a média salarial de acordo com os filtros definidos.</h5>
						<hr>



						<div class=row id=linhaOpc>
							<div id=tipo class=col-lg-12
								style="left: 0px; text-align: center">
								<h6 style="text-align: center">
									<b>Escolher Tipo</b>
								</h6>




								<form class="form-control" id="tipo" name="tipo">
									<input type="radio" id="cargo" value="cargo" name="tipo">Cargo
									<input type="radio" id="categoria" value="categoria"
										name="tipo">Categoria <input type="radio" id="orgao"
										value="orgao" name="tipo">Orgão
								</form>

							</div>
						</div>

						<div class=row id=linha1>
							<div id="input1" class="col-lg-4" style="">

								<h6 id="name_input1" style="text-align: center"></h6>
								<select id="select1" class="form-control">
								</select>


							</div>

							<div id="input2" class="col-lg-4" style="">

								<h6 id="name_input2" style="text-align: center">
									<b></b>
								</h6>
								<select id="select2" class="form-control">
								</select>


							</div>

							<div id="input3" class="col-lg-4" style="">

								<h6 id="name_input3" style="text-align: center">
									<b></b>
								</h6>
								<select class="form-control" id="select3">
								</select>


							</div>

						</div>
						<div class=row id=linha2>
							<div id="input4" class="col-lg-4" style="">

								<h6 id="name_input4" style="text-align: center">
									<b></b>
								</h6>
								<select class="form-control" id="select4">
								</select>


							</div>

							<div id="input5" class="col-lg-4" style="">

								<h6 id="name_input5" style="text-align: center">
									<b></b>
								</h6>
								<select class="form-control" id="select5">
								</select>


							</div>

							<div id="input6" class="col-lg-4" style="">

								<h6 id="name_input6" style="text-align: center">
									<b></b>
								</h6>
								<select class="form-control" id="select6">
								</select>


							</div>
						</div>

						<div class=row id=linha3>

							<div id="input7" class="col-lg-4" style="">

								<h6 id="name_input7" style="text-align: center">
									<b></b>
								</h6>
								<select class="form-control" id="select7">
								</select>


							</div>

							<div id="input8" class="col-lg-4" style="">

								<h6 id="name_input8" style="text-align: center">
									<b></b>
								</h6>
								<select class="form-control" id="select8">
								</select>


							</div>

							<div id="input9" class="col-lg-4" style="">

								<h6 id="name_input9" style="text-align: center">
									<b></b>
								</h6>
								<select class="form-control" id="select9">
								</select>


							</div>
						</div>

						<div class=row id=linhaADD>
							<div id=remover class=col-md-3 style="">
								<button id=rem type="button" class="btn btn-default">-</button>
							</div>

							<div id=adicionar class=col-md-3 style="">
								<button id=add type="button" class="btn btn-default">+</button>
							</div>

						</div>




						<div id=gifCarregando class=col-lg-3 style="right: 100px">


							<img
								src='http://i.kinja-img.com/gawker-media/image/upload/chag4hzw0pgvgy5ujnom.gif' />


						</div>


						<div class=row id=linhaDatas>
							<div id=datas class=col-lg-12 style="">
								<h6 style="text-align: center">
									<b>Janela de Tempo</b>
								</h6>
								<select class="form-control" id="data_selecionada"
									name="data_selecionada">


									<option id="data_2014" value="2014">2014</option>
									<option id="data_2015" value="2015">2015</option>
									<option id="data_2016" value="2016" selected>2016</option>


								</select>


							</div>
						</div>
						<div class=row id=linhaPesq>
							<div id=pesquisar class=col-md-12 style="">
								<button id=pesq type="button" class="btn btn-default">Pesquisar</button>
							</div>
						</div>
						<div class=row id=linhaTipo>
							<div id=tipo_de_salario class=col-lg-6 style="">
								<h6>
									<b>Tipo de salario</b>
								</h6>

								<select class="form-control" id="tipo_de_salario"
									name="tipo_de_salario">

									<option id="bruto" value="bruto">bruto</option>
									<option id="liquido" value="liquido">líquido</option>
								</select>

							</div>

						</div>


					</div>

				
				
					<form id="exportar" action="download" method="post">
							<input id="escondido1" type="hidden" name="entrada1" >
							<input id="escondido2" type="hidden" name="entrada2" >
							<input id="escondido3" type="hidden" name="entrada3" >
							<input id="escondido4" type="hidden" name="entrada4" >
							<input id="escondido5" type="hidden" name="entrada5" >
							<input id="escondido6" type="hidden" name="entrada6" >
							<input id="escondido7" type="hidden" name="entrada7" >
							<input id="escondido8" type="hidden" name="entrada8" >
							<input id="escondido9" type="hidden" name="entrada9" >
							<input id="escondido10" type="hidden" name="referencia" >
							<input id="escondido11" type="hidden" name="tipoSalario" >
							<input id="escondido12" type="hidden" name="qntFiltros" >
							<input id="escondido13" type="hidden" name="funcionalidade" value="mediaSalarial" >
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
			
			var qnt = 1;
			
			$('#exportar').hide();
			$('#input1').hide();
			$('#input2').hide();
			$('#input3').hide();
			$('#input4').hide();
			$('#input5').hide();
			$('#input6').hide();
			$('#input7').hide();
			$('#input8').hide();
			$('#input9').hide();
			$('#linha1').hide();
			$('#linha2').hide();
			$('#linha3').hide();
			
			$('#adicionar').hide();
			$('#remover').hide();
			
			
			$('#tipo_de_salario').hide();
			$('#datas').hide();
			
			$('#container').hide();
			$('#gifCarregando').hide();
			$('#gifGrafico').hide();
			
			$('#pesquisar').hide();
			
			
			
		
			
			$('input[type=radio][name=tipo]').click(function(){
				 qnt = 1;
				
				var tipo = $('input[type=radio][name=tipo]:checked').val();
				
				var select1 = document.getElementById("select1");
			    select1.innerHTML = '';
			    var select2 = document.getElementById("select2");
			    select2.innerHTML = '';
			    var select3 = document.getElementById("select3");
			    select3.innerHTML = '';
			    
			    var select4 = document.getElementById("select4");
			    select4.innerHTML = '';
			    var select5 = document.getElementById("select5");
			    select5.innerHTML = '';
			    var select6 = document.getElementById("select6");
			    select6.innerHTML = '';
			    
			    var select7 = document.getElementById("select7");
			    select7.innerHTML = '';
			    var select8 = document.getElementById("select8");
			    select8.innerHTML = '';
			    var select9 = document.getElementById("select9");
			    select9.innerHTML = '';
				
				if(tipo=='cargo'){
				
				datas['tipo'] = 'cargo';
					
				$('#input1').hide();
				$('#input2').hide();
				$('#input3').hide();
				$('#input4').hide();
				$('#input5').hide();
				$('#input6').hide();
				$('#input7').hide();
				$('#input8').hide();
				$('#input9').hide();
				
				
				
				$('#linha1').hide();
				$('#linha2').hide();
				$('#linha3').hide();
				$('#gifGrafico').hide();
				$('#container').hide();
				$('#gifCarregando').show();
				
				
				
				$.ajax({
					type : 'POST',
					url : '/DataMiningCGE/listarCargos',
					success : function(data) {
						$('#gifCarregando').hide();
						
						
						$('#input1').show();
						
						//primeiro input de cargos
						var element = document.getElementById('name_input1');
						element.innerHTML = '<b>Cargo 1</b>';
						
						for(i = 0; i< data.length; i++){		
						var x = document.createElement('option');
						x.setAttribute('value', data[i]);
					    var t = document.createTextNode(data[i]);
					    x.appendChild(t);
					    document.getElementById('select1').appendChild(x);
						}
						
						//segundo input de cargos
						var element1 = document.getElementById('name_input4');
						element1.innerHTML = '<b>Cargo 2</b>';
						
						for(i = 0; i< data.length; i++){		
						var x = document.createElement('option');
						x.setAttribute('value', data[i]);
					    var t = document.createTextNode(data[i]);
					    x.appendChild(t);
					    document.getElementById('select4').appendChild(x);
						}
						//terceiro input de cargos
						var element2 = document.getElementById('name_input7');
						element2.innerHTML = '<b>Cargo 3</b>';
						
						for(i = 0; i< data.length; i++){		
						var x = document.createElement('option');
						x.setAttribute('value', data[i]);
					    var t = document.createTextNode(data[i]);
					    x.appendChild(t);
					    document.getElementById('select7').appendChild(x);
						}
						//requisicao para listar categorias
						$.ajax({
							type : 'POST',
							url : '/DataMiningCGE/listarCategorias',
							success : function(data) {
								
								$('#input2').show();
								//primeiro input de categorias
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
								//segundo input de categorias
								var element12 = document.getElementById('name_input5');
								element12.innerHTML = '<b>Categoria</b>';
								
								var x12 = document.createElement('option');
								x12.setAttribute('value', '');
							    var t12 = document.createTextNode('Todos');
							    x12.appendChild(t12);
							    document.getElementById('select5').appendChild(x12);
								
								for(i = 0; i< data.length; i++){		
								var x = document.createElement('option');
								x.setAttribute('value', data[i]);
							    var t = document.createTextNode(data[i]);
							    x.appendChild(t);
							    document.getElementById('select5').appendChild(x);
								}
								//terceiro input de categorias
								var element12 = document.getElementById('name_input8');
								element12.innerHTML = '<b>Categoria</b>';
								
								var x12 = document.createElement('option');
								x12.setAttribute('value', '');
							    var t12 = document.createTextNode('Todos');
							    x12.appendChild(t12);
							    document.getElementById('select8').appendChild(x12);
								
								for(i = 0; i< data.length; i++){		
								var x = document.createElement('option');
								x.setAttribute('value', data[i]);
							    var t = document.createTextNode(data[i]);
							    x.appendChild(t);
							    document.getElementById('select8').appendChild(x);
								}
								
								
								//requisicao para listar orgao
								$.ajax({
									type : 'POST',
									url : '/DataMiningCGE/listarOrgaos',
									success : function(data) {
										
										$('#input3').show();
										$('#linha1').show();
										$('#datas').show();
										$('#tipo_de_salario').show();
										
										$('#adicionar').show();
										$('#remover').show();
										//primeiro input de orgao
										element = document.getElementById('name_input3');
										element.innerHTML = '<b>Orgao</b>';
										
										x1 = document.createElement('option');
										x1.setAttribute('value', '');
									    t1 = document.createTextNode('Todos');
									    x1.appendChild(t1);
									    document.getElementById('select3').appendChild(x1);
										
										for(i = 0; i< data.length; i++){		
										var x = document.createElement('option');
										x.setAttribute('value', data[i]);
									    var t = document.createTextNode(data[i]);
									    x.appendChild(t);
									    document.getElementById('select3').appendChild(x);
										}
										//segundo input de orgao
										var element12 = document.getElementById('name_input6');
										element12.innerHTML = '<b>Orgao</b>';
										
										var x12 = document.createElement('option');
										x12.setAttribute('value', '');
									    var t12 = document.createTextNode('Todos');
									    x12.appendChild(t12);
									    document.getElementById('select6').appendChild(x12);
										
										for(i = 0; i< data.length; i++){		
										var x = document.createElement('option');
										x.setAttribute('value', data[i]);
									    var t = document.createTextNode(data[i]);
									    x.appendChild(t);
									    document.getElementById('select6').appendChild(x);
										}
										//terceiro input de orgao
										var element12 = document.getElementById('name_input9');
										element12.innerHTML = '<b>Orgao</b>';
										
										var x12 = document.createElement('option');
										x12.setAttribute('value', '');
									    var t12 = document.createTextNode('Todos');
									    x12.appendChild(t12);
									    document.getElementById('select9').appendChild(x12);
										
										for(i = 0; i< data.length; i++){		
										var x = document.createElement('option');
										x.setAttribute('value', data[i]);
									    var t = document.createTextNode(data[i]);
									    x.appendChild(t);
									    document.getElementById('select9').appendChild(x);
										}
										
										}
										});
								
								
								}
								});
						
						
						$('#pesquisar').show();
					}
				});
				
				}
				
				if(tipo =='categoria'){
					
					datas['tipo'] = 'categoria';
					
					$('#input1').hide();
					$('#input2').hide();
					$('#input3').hide();
					$('#input4').hide();
					$('#input5').hide();
					$('#input6').hide();
					$('#input7').hide();
					$('#input8').hide();
					$('#input9').hide();
					
					
					
					$('#linha1').hide();
					$('#linha2').hide();
					$('#linha3').hide();
					$('#gifGrafico').hide();
					$('#container').hide();
					$('#gifCarregando').show();
					
					$.ajax({
						type : 'POST',
						url : '/DataMiningCGE/listarCategorias',
						success : function(data) {
							$('#gifCarregando').hide();
							$('#input1').show();
							$('#linha1').show();
							
							$('#datas').show();
							$('#tipo_de_salario').show();
							
							$('#adicionar').show();
							$('#remover').show();
							
							var element = document.getElementById('name_input1');
							element.innerHTML = '<b>Categoria</b>';
							
							
							
							for(i = 0; i< data.length; i++){		
							var x = document.createElement('option');
							x.setAttribute('value', data[i]);
						    var t = document.createTextNode(data[i]);
						    x.appendChild(t);
						    document.getElementById('select1').appendChild(x);
							}
							
							element = document.getElementById('name_input2');
							element.innerHTML = '<b>Categoria</b>';
							
							
							
							for(i = 0; i< data.length; i++){		
							var x = document.createElement('option');
							x.setAttribute('value', data[i]);
						    var t = document.createTextNode(data[i]);
						    x.appendChild(t);
						    document.getElementById('select2').appendChild(x);
							}
							
							element = document.getElementById('name_input3');
							element.innerHTML = '<b>Categoria</b>';
							
							
							
							for(i = 0; i< data.length; i++){		
							var x = document.createElement('option');
							x.setAttribute('value', data[i]);
						    var t = document.createTextNode(data[i]);
						    x.appendChild(t);
						    document.getElementById('select3').appendChild(x);
							}
							
							$('#pesquisar').show();
						}
					});
					
				}
				
				if(tipo=='orgao'){
					
					datas['tipo'] = 'orgao';
					
					
					$('#input1').hide();
					$('#input2').hide();
					$('#input3').hide();
					$('#input4').hide();
					$('#input5').hide();
					$('#input6').hide();
					$('#input7').hide();
					$('#input8').hide();
					$('#input9').hide();
					
					
					
					$('#linha1').hide();
					$('#linha2').hide();
					$('#linha3').hide();
					
					$('#gifGrafico').hide();
					$('#container').hide();
					$('#gifCarregando').show();
					
					
					$.ajax({
						type : 'POST',
						url : '/DataMiningCGE/listarOrgaos',
						success : function(data) {
							
							$('#gifCarregando').hide();
							$('#linha1').show();
							$('#input1').show();
							$('#pesquisar').show();
							$('#datas').show();
							$('#tipo_de_salario').show();
							
							$('#adicionar').show();
							$('#remover').show();
							
							
							var element = document.getElementById('name_input1');
							element.innerHTML = '<b>Órgão</b>';
							
							
							
							for(i = 0; i< data.length; i++){		
							var x = document.createElement('option');
							x.setAttribute('value', data[i]);
						    var t = document.createTextNode(data[i]);
						    x.appendChild(t);
						    document.getElementById('select1').appendChild(x);
							}
						    element = document.getElementById('name_input4');
							element.innerHTML = '<b>Órgão</b>';
							
														
							for(i = 0; i< data.length; i++){		
							var x = document.createElement('option');
							x.setAttribute('value', data[i]);
						    var t = document.createTextNode(data[i]);
						    x.appendChild(t);
						    document.getElementById('select4').appendChild(x);
							}
						    element = document.getElementById('name_input7');
							element.innerHTML = '<b>Órgão</b>';
							
							
							
							for(i = 0; i< data.length; i++){		
							var x = document.createElement('option');
							x.setAttribute('value', data[i]);
						    var t = document.createTextNode(data[i]);
						    x.appendChild(t);
						    document.getElementById('select7').appendChild(x);
				

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
								    var t1 = document.createTextNode('Escolher Categoria');
								    x1.appendChild(t1);
								    document.getElementById('select2').appendChild(x1);
									
									for(i = 0; i< data.length; i++){		
									var x = document.createElement('option');
									x.setAttribute('value', data[i]);
								    var t = document.createTextNode(data[i]);
								    x.appendChild(t);
								    document.getElementById('select2').appendChild(x);
									}
								    element = document.getElementById('name_input5');
									element.innerHTML = '<b>Categoria</b>';
									
									x1 = document.createElement('option');
									x1.setAttribute('value', '');
								    t1 = document.createTextNode('Escolher Categoria');
								    x1.appendChild(t1);
								    document.getElementById('select5').appendChild(x1);
									
									for(i = 0; i< data.length; i++){		
									var x = document.createElement('option');
									x.setAttribute('value', data[i]);
								    var t = document.createTextNode(data[i]);
								    x.appendChild(t);
								    document.getElementById('select5').appendChild(x);
									
									}
								    element = document.getElementById('name_input8');
									element.innerHTML = '<b>Categoria</b>';
									
									x1 = document.createElement('option');
									x1.setAttribute('value', '');
								    t1 = document.createTextNode('Escolher Categoria');
								    x1.appendChild(t1);
								    document.getElementById('select8').appendChild(x1);
									
									for(i = 0; i< data.length; i++){		
									var x = document.createElement('option');
									x.setAttribute('value', data[i]);
								    var t = document.createTextNode(data[i]);
								    x.appendChild(t);
								    document.getElementById('select8').appendChild(x);
									
									}
									$('#pesquisar').show();
								}
							});
								
						}
					});
					
							
				}
			});
			
			$('#add').click(function(){
				
				if(datas['tipo'] == 'cargo'){
				if(qnt==2){
					$('#input7').show();
					$('#input8').show();
					$('#input9').show();
					$('#linha3').show();
					
					qnt = 3;	
				}
				if(qnt==1){
					$('#input4').show();
					$('#input5').show();
					$('#input6').show();
					$('#linha2').show();
					qnt = 2;	
				}
				}
				if(datas['tipo'] == 'categoria'){
					if(qnt==2){
						$('#input3').show();
						
						
						qnt = 3;	
					}
					if(qnt==1){
						$('#input2').show();
						qnt = 2;	
					}
				}
				if(datas['tipo'] == 'orgao'){
					if(qnt==2){
						$('#input7').show();
						$('#input8').show();
						
						$('#linha3').show();
						
						qnt = 3;	
					}
					if(qnt==1){
						$('#input4').show();
						$('#input5').show();
						
						$('#linha2').show();
						qnt = 2;	
					}
					}
				
			});
			
			$('#rem').click(function(){
				
				if(datas['tipo'] == 'cargo'){
				if(qnt==2){
					$('#input4').hide();
					$('#input5').hide();
					$('#input6').hide();
					$('#linha2').hide();
					qnt = 1;
				}
				if(qnt==3){
					$('#input7').hide();
					$('#input8').hide();
					$('#input9').hide();
					$('#linha3').hide();
					qnt = 2;	
				}
				}
				if(datas['tipo'] == 'categoria'){
					if(qnt==2){
						$('#input2').hide();
						
						qnt = 1;
					}
					if(qnt==3){
						$('#input3').hide();
						
						qnt = 2;	
					}
					
				}
				if(datas['tipo'] == 'orgao'){
					if(qnt==2){
						$('#input4').hide();
						$('#input5').hide();
						
						$('#linha2').hide();
						qnt = 1;
					}
					if(qnt==3){
						$('#input7').hide();
						$('#input8').hide();
						
						$('#linha3').hide();
						qnt = 2;	
					}
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
						document.getElementById("escondido2").value = datas['input2'];
						document.getElementById("escondido3").value = datas['input3'];
						document.getElementById("escondido4").value = datas['input4'];
						document.getElementById("escondido5").value = datas['input5'];
						document.getElementById("escondido6").value = datas['input6'];
						document.getElementById("escondido7").value = datas['input7'];
						document.getElementById("escondido8").value = datas['input8'];
						document.getElementById("escondido9").value = datas['input9'];
						document.getElementById("escondido10").value = datas['referencia'];
						document.getElementById("escondido11").value = datas['tipoSalario'];
						document.getElementById("escondido12").value =qnt;
						datas['input4'] = null;
						datas['input5'] = null;
						datas['input6'] = null;

						datas['input7'] = null;
						datas['input8'] = null;
						datas['input9'] = null;
						
						if(qnt==3){
							datas['input4'] = $('#select4').val();
							datas['input5'] = $('#select5').val();
							datas['input6'] = $('#select6').val();

							datas['input7'] = $('#select7').val();
							datas['input8'] = $('#select8').val();
							datas['input9'] = $('#select9').val();
						}
						
						if(qnt==2){
							datas['input4'] = $('#select4').val();
							datas['input5'] = $('#select5').val();
							datas['input6'] = $('#select6').val();

							
						}
						

					}
					if(datas['tipo'] == 'categoria'){
						datas['input1'] = $('#select1').val();
						datas['input2'] = null;
						datas['input3'] = null;
						if(qnt==3){
							datas['input2'] = $('#select2').val();
							datas['input3'] = $('#select3').val();
							
							
						}
						
						if(qnt==2){
							datas['input2'] = $('#select2').val();
							
							
						}
						
						

					}
					if(datas['tipo'] == 'orgao'){
						datas['input1'] = $('#select1').val();
						datas['input2'] = $('#select2').val();
						datas['input3'] = null;
						datas['input4'] = null;
						datas['input5'] = null;
						datas['input6'] = null;
						datas['input7'] = null;
						datas['input8'] = null;
						
						if(qnt==3){
							datas['input3'] = $('#select4').val();
							datas['input4'] = $('#select5').val();
							
							datas['input5'] = $('#select7').val();
							datas['input6'] = $('#select8').val();
							
						}
						
						if(qnt==2){
							datas['input3'] = $('#select4').val();
							datas['input4'] = $('#select5').val();
							
						}
						

					}
					
					
					requisicao();

				
			});
			
			function requisicao(){
								$('#container').hide();
								$('#gifGrafico').show();
		
								$
								.ajax({
									type : 'POST',
									contentType : 'application/json',
									url : '/DataMiningCGE/mediaSalarial',
									data : JSON.stringify(datas),
									dataType : 'json',
									success : function(data) {
										 $('#exportar').show();
										$('#gifGrafico').hide();
										$('#container').show();
										Highcharts
												.createElement(
														'link',
														{
															href : 'https://fonts.googleapis.com/css?family=Dosis:400,600',
															rel : 'stylesheet',
															type : 'text/css'
														},
														null,
														document
																.getElementsByTagName('head')[0]);

										Highcharts.theme = {
											colors : [ '#7cb5ec',
													'#f7a35c',
													'#90ee7e',
													'#7798BF',
													'#aaeeee',
													'#ff0066',
													'#eeaaee',
													'#55BF3B',
													'#DF5353',
													'#7798BF',
													'#aaeeee' ],
											chart : {
												backgroundColor : null,
												style : {
													fontFamily : 'Dosis, sans-serif'
												}
											},
											title : {
												style : {
													fontSize : '16px',
													fontWeight : 'bold',
													textTransform : 'uppercase'
												}
											},
											tooltip : {
												borderWidth : 0,
												backgroundColor : 'rgba(219,219,216,0.8)',
												shadow : false
											},
											legend : {
												itemStyle : {
													fontWeight : 'bold',
													fontSize : '13px'
												}
											},
											xAxis : {
												gridLineWidth : 1,
												labels : {
													style : {
														fontSize : '12px'
													}
												}
											},
											yAxis : {
												minorTickInterval : 'auto',
												title : {
													style : {
														textTransform : 'uppercase'
													}
												},
												labels : {
													style : {
														fontSize : '12px'
													}
												}
											},
											plotOptions : {
												candlestick : {
													lineColor : '#404048'
												},
											
											 line: {
								            	 point: {
								                     events: {
								                         'click': function () {
								                        	 var data1 =  {};
								                        	 var tipo = $('input[type=radio][name=tipo]:checked').val();
								                                data1['input1'] = this.series.name;
								                                data1['tipo'] = tipo;
								                                
								                                if(this.x < 9){
								                                data1['referencia'] = $('#data_selecionada option:selected').attr('value') + "0"+(this.x+1);
								                                document.getElementById("escondido10").value = data1['referencia'];
								                        		 }else{
								                        	 data1['referencia'] = $('#data_selecionada option:selected').attr('value') + (this.x+1);
								                        	 document.getElementById("escondido10").value = data1['referencia'];
											                   
								                       			  }
								                                $('#myModal').modal('toggle');
								                                
								                                $('corpo').hide();
								                                $.ajax({
																	type : 'POST',
																	contentType : 'application/json',
																	url : '/DataMiningCGE/detalheMedia',
																	data : JSON.stringify(data1),
																	dataType : 'json',
																	success : function(dataServ) {
																		
																		
																		var element = document.getElementById('corpo');
																		element.innerHTML = "";
																		for(i = 0; i<dataServ.length; i++){
					
																		element.innerHTML = element.innerHTML + '<tr><td>'+dataServ[i].financeiro_descricao+'</td><td>'+dataServ[i].valor+'</td><td>'+dataServ[i].quantidade+'</td><td>'+dataServ[i].tipo+'</td></tr>';
																		
																		}
																		$('corpo').show();
																		
																		
																	}
																	});
															
								                       }
								                     }
								                   }
											 }
											},

											// General
											background2 : '#F0F0EA'

										};

										// Apply the theme
										Highcharts
												.setOptions(Highcharts.theme);

										$('#grafico-linha').show();

										var title = {
											text : 'Média Salarial'
										};
										var subtitle = {
											text : 'Média Salarial dos Servidores Públicos Estaduais'
										};
										var xAxis = {
											categories : [ 'Janeiro',
													'Fevereiro',
													'Marco', 'Abril',
													'Maio', 'Junho',
													'Julho', 'Agosto',
													'Setembro',
													'Outubro',
													'Novembro',
													'Dezembro' ]
										};
										var yAxis = {
											title : {
												text : 'Salário (Reais)'
											},
											plotLines : [ {
												value : 0,
												width : 1,
												color : '#808080'
											} ]
										};

										var tooltip = {
											valueSuffix : 'Reais'
										}

										var legend = {
											layout : 'horizontal',
											align : 'center',
											borderWidth : 0
										};
										var series = data;

										var json = {};

										json.title = title;
										json.subtitle = subtitle;
										json.xAxis = xAxis;
										json.yAxis = yAxis;
										json.tooltip = tooltip;
										json.legend = legend;
										json.series = series;

										$('#container').highcharts(
												json);

									}
								});
								
								
							}
							

						})
	</script>

</body>
</html>
