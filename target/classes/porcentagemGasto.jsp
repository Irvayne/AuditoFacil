<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
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
</head>
<body>
	<div class=col-lg-9
		style="width: 971px; height: 2500px; margin-left: 150px; background: #F6F6F6">



		<div class=row style="width: 971px; height: 200px">
			<img src="http://www.domextechnical.com/images/data-mining.jpg"
				style="width: 971px; height: 200px">
		</div>
		<div class=row>

			<nav class="navbar navbar-default">
			<div class="container-fluid">
				<!-- Brand and toggle get grouped for better mobile display -->
				<div class="navbar-header">
					<button type="button" class="navbar-toggle collapsed"
						data-toggle="collapse" data-target="#bs-example-navbar-collapse-1"
						aria-expanded="false">
						<span class="sr-only">Toggle navigation</span> <span
							class="icon-bar"></span> <span class="icon-bar"></span> <span
							class="icon-bar"></span>
					</button>
					<a class="navbar-brand" href="http://localhost:8080/DataMiningCGE/">Inicio</a>
				</div>

				<!-- Collect the nav links, forms, and other content for toggling -->
				<div class="collapse navbar-collapse"
					id="bs-example-navbar-collapse-1">

					</ul>
					<form class="navbar-form navbar-right">
						<div class="form-group">
							<input type="text" class="form-control" placeholder="Search">
						</div>
					</form>

				</div>
				<!-- /.navbar-collapse -->
			</div>
			<!-- /.container-fluid --> </nav>
		</div>
		<div class=row>
			<div class=col-lg-3>
				<div class="panel panel-default">
					<div class="panel-heading">
						<h5 style="text-align: center">
							<b>Consultas Avançadas</b>
						</h5>
					</div>
					<!-- /.panel-heading -->
					<div class="panel-body">
						<div class="list-group text-center">

							<a class="list-group-item"
								href="/DataMiningCGE/mediaSalarial">Média Salarial </a>
						</div>
						
						
						
	<!-- -------------------------------------------------Feature 2 ---------------------------------------------- -->					
						<div class="list-group text-center">

							<a class="list-group-item"
								href="/DataMiningCGE/piramideHierarquica">Níveis Hierárquicos  </a>
						</div>
						
	<!-- -------------------------------------------------Feature 4 ---------------------------------------------- -->					
						<div class="list-group text-center">

							<a class="list-group-item"
								href="/DataMiningCGE/dispersaoServidores">Dispersão dos Salários Individuais</a>
						</div>
						
											

	<!-- -------------------------------------------------Feature 5 ---------------------------------------------- -->					
						<div class="list-group text-center">

							<a class="list-group-item"
								href="/DataMiningCGE/mediaSalarialQntServidores">Media Salarial e Quantidade de Servidores  </a>
						</div>
			<!-- -------------------------------------------------Feature 6---------------------------------------------- -->					
						<div class="list-group text-center">

							<a class="list-group-item"
								href="/DataMiningCGE/mapaDemografico">Mapa Demográfico  </a>
						</div>
									
			<!-- -------------------------------------------------Feature 7---------------------------------------------- -->					
						<div class="list-group text-center">

							<a class="list-group-item"
								href="/DataMiningCGE/faixa">Faixa Etária dos Servidores  </a>
						</div>
		<!-- -------------------------------------------------Feature 8---------------------------------------------- -->					
						<div class="list-group text-center">

							<a class="list-group-item"
								href="/DataMiningCGE/porcentagemGasto">Distribuição dos Gasto Mensais  </a>
						</div>								

					</div>
				</div>
			</div>

			<div class=col-lg-9>
			
			<!-- Large modal -->




			
				<div class="panel panel-default">
					<div class="panel-body">
						<h4 style="text-align: center">
							<b>Porcentagem de Gastos </b>
						</h4>
						<hr>
						<h5 style="text-align: center">
							 
							 
						</h5>
						<hr>
						
						<div class=col-lg-6 style="left: 150px">
						
						<div id=tipo class=col-lg-12 style="left: 0px;text-align: center">
							<h6 style="text-align: center">
								<b>Escolher Tipo</b>
							</h6>
							
				


							<form class="form-control" id="tipo" name="tipo">	
								<input type="radio" id="cargo" value="cargo" name="tipo">Cargo
								  <input type="radio" id="categoria" value="categoria" name="tipo">Categoria
								<input type="radio" id="orgao" value="orgao" name="tipo">Orgão
							</form>

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



	<script language="JavaScript">
		$(document).ready(function() {
			
			var datas = {};
			
			
			$('#datas').hide();
			
			$('#container').hide();
			$('#gifGrafico').hide();
			
			$('#pesquisar').hide();
			
			
			$('input[type=radio][name=tipo]').click(function(){
				
				var tipo = $('input[type=radio][name=tipo]:checked').val();
				$('#datas').show();
				
				$('#pesquisar').show();
				
				if(tipo=='cargo'){
					
					
					
				datas['tipo'] = 'cargo';
					
				$('#gifGrafico').hide();
				$('#container').hide();
				
				
				}
				
				if(tipo =='categoria'){
					
					datas['tipo'] = 'categoria';
					
					$('#gifGrafico').hide();
					$('#container').hide();
							
				}
				
				if(tipo=='orgao'){
					
					datas['tipo'] = 'orgao';
					
					$('#gifGrafico').hide();
					$('#container').hide();
					
					
					
						
				}
			});
			
			
			$('#pesq').click(function(){
				
				datas['referencia'] = $('#data_selecionada option:selected').attr('value');

									
					requisicao();

				
			});
			
			function requisicao(){
								$('#container').hide();
								$('#gifGrafico').show();
								$.ajax({
									type : 'POST',
									contentType : 'application/json',
									url : '/DataMiningCGE/distribuicaoGasto',
									data : JSON.stringify(datas),
									dataType : 'json',
									success : function(dataResponse) {
													  
										  $('#gifGrafico').hide();
										  $('#container').show();
										  Highcharts.chart('container', {
										        chart: {
										            plotBackgroundColor: null,
										            plotBorderWidth: null,
										            plotShadow: false,
										            type: 'pie'
										        },
										        title: {
										            text: 'Distribuicao dos Gastos Mensais'
										        },
										        tooltip: {
										            pointFormat: '{series.name}: <b>{point.percentage:.1f}%</b> <br>Valor Bruto: <b>{point.y} Reais</b>'
										        },
										        plotOptions: {
										            pie: {
										                allowPointSelect: true,
										                cursor: 'pointer',
										                dataLabels: {
										                    enabled: true,
										                    format: '<b>{point.name}</b>: {point.percentage:.1f} %',
										                    style: {
										                        color: (Highcharts.theme && Highcharts.theme.contrastTextColor) || 'black'
										                    }
										                }
										            }
										        },
										        series: [{
										            name: 'Porcentagem',
										            colorByPoint: true,
										            data: dataResponse
										        }]
										    });
										
									}
								});
								
							}
							

						})
	</script>
</body>
</html>