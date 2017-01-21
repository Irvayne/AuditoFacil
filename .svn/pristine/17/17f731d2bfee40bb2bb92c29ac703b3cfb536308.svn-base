<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>Cloudset</title>

<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
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
<script src="https://code.highcharts.com/modules/funnel.js"></script>
<script src="https://code.highcharts.com/modules/exporting.js"></script>
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
        
        <div class="panel panel-default">
					<div class="panel-body">
						<h4 style="text-align: center">
							<b>Piramide Hierarquica</b>
						</h4>
						<hr>
						<h5 style="text-align: center">
							Piramide proprorcional a quantidade (largura) de servidores em relacao a media (da base ao topo). 
							 
						</h5>
						<hr>
						
						<div id=tipo class=col-lg-3 style="left: 0px">
							<h6 style="text-align: left">
								<b>Escolher Tipo</b>
							</h6>


							<select class="form-control" id="tipo" name="tipo">

								<option id="vazio" value="vazio">Selecione o Tipo</option>
								
								<option id="categoria" value="categoria">Categoria</option>
								<option id="orgao" value="orgao">Orgão</option>

							</select>

						</div>


						<div id=input_categoria class=col-lg-3 style="left:30px; top:0px">
							
							<h6 style="text-align: left">
							<b>Categoria</b>
							</h6>
							<input id="categoria1" placeholder="Escolha a primeira categoria"
								required />
							<h6 style="text-align: left">
								<b>Categoria</b>
							</h6>
							<input id="categoria2" placeholder="Escolha a segunda categoria" required />
							<h6 style="text-align: left">
								<b>Categoria</b>
							</h6>
							<input id="categoria3" placeholder="Escolha a terceira categoria"
								required />
						</div>
						
						<div id=input_orgao class=col-lg-3 style="left:30px; top:0px">
							
							<h6 style="text-align: left">
							<b>Orgão</b>
							</h6>
							<input id="orgao1" placeholder="Escolha o primeira Orgão"
								required />
							<h6 style="text-align: left">
								<b>Orgão</b>
							</h6>
							<input id="orgao2" placeholder="Escolha o segundo Orgão" required />
							<h6 style="text-align: left">
								<b>Orgão</b>
							</h6>
							<input id="orgao3" placeholder="Escolha o terceiro Orgão"
								required />
						</div>
						
						

						<div id=gifCarregando class=col-lg-3 style="right :100px">


							<img
								src='http://i.kinja-img.com/gawker-media/image/upload/chag4hzw0pgvgy5ujnom.gif' />


						</div>
						
						<div id=datas class=col-lg-3 style="left: 80px; top: 0px">
							<h6 style="text-align: left">
								<b>Janela de Tempo</b>
							</h6>


							<select class="form-control" id="data_selecionada" name="data_selecionada">

								<option id="vazio" value="vazio">Selecione uma data</option>
								<option id="data_2014" value="2014">2014</option>
								<option id="data_2015" value="2015">2015</option>
								<option id="data_2016" value="2016">2016</option>

							</select>

						</div>
					</div>
					<div class="panel-body">
					
					<div id="grafico"
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
			
			
			
			$('#input_categoria').hide();
			$('#input_orgao').hide();
			
			$('#datas').hide();
			$('#grafico').hide();
			$('#gifCarregando').hide();
			$('#gifGrafico').hide();
			
			$('#tipo').change(showdata);
			showdata();
			
			function showdata() {
				if ($('#tipo option:selected').attr('id') == 'orgao') {
					$('#gifGrafico').hide();
					datas['tipo'] = 'orgao';
					$('#grafico').hide();
					
					$('#input_categoria').hide();
					$('#input_orgao').hide();
					$('#datas').show();
					
					
					
				}
				if ($('#tipo option:selected').attr('id') == 'categoria') {
					$('#grafico').hide();
					datas['tipo'] = 'categoria';
					$('#gifGrafico').hide();
					$('#input_categoria').hide();
					$('#input_orgao').hide();
					
					$('#datas').show();
					$('#gifGrafico').hide();
					
					
					
				}
				if ($('#tipo option:selected').attr('id') == 'vazio') {
					$('#gifGrafico').hide();
					$('#grafico').hide();
					
					$('#input_categoria').hide();
					$('#input_orgao').hide();
					$('#datas').hide();
					$('#gifCarregando').hide();
				}
				
				}
			
			$('#data_selecionada').change(showdatas);
			showdatas();

			function showdatas() {
				if ($('#data_selecionada option:selected').attr('id') == 'data_2014') {

					
					if(datas['tipo'] == 'categoria'){
						var input1 = $('#categoria1').val();
						var input2 = $('#categoria2').val();
						var input3 = $('#categoria3').val();

						datas['input1'] = input1;
						datas['input2'] = input2;
						datas['input3'] = input3;
						datas['tipo'] = 'categoria';
						}
					if(datas['tipo'] == 'orgao'){
						var input1 = $('#orgao1').val();
						var input2 = $('#orgao2').val();
						var input3 = $('#orgao3').val();

						datas['input1'] = input1;
						datas['input2'] = input2;
						datas['input3'] = input3;
						datas['tipo'] = 'orgao';
						}
					datas['referencia'] = '2014';
					
					requisicao();

					
				}

				if ($('#data_selecionada option:selected').attr('id') == 'data_2015') {

					
						if(datas['tipo'] == 'categoria'){
							var input1 = $('#categoria1').val();
							var input2 = $('#categoria2').val();
							var input3 = $('#categoria3').val();

							datas['input1'] = input1;
							datas['input2'] = input2;
							datas['input3'] = input3;
							datas['tipo'] = 'categoria';
							}
						if(datas['tipo'] == 'orgao'){
							var input1 = $('#orgao1').val();
							var input2 = $('#orgao2').val();
							var input3 = $('#orgao3').val();

							datas['input1'] = input1;
							datas['input2'] = input2;
							datas['input3'] = input3;
							datas['tipo'] = 'orgao';
							}
						datas['referencia'] = '2015';
						
						requisicao();
					
				}

				if ($('#data_selecionada option:selected').attr('id') == 'data_2016') {

						if(datas['tipo'] == 'categoria'){
							var input1 = $('#categoria1').val();
							var input2 = $('#categoria2').val();
							var input3 = $('#categoria3').val();

							datas['input1'] = input1;
							datas['input2'] = input2;
							datas['input3'] = input3;
							datas['tipo'] = 'categoria';
							}
						if(datas['tipo'] == 'orgao'){
							var input1 = $('#orgao1').val();
							var input2 = $('#orgao2').val();
							var input3 = $('#orgao3').val();

							datas['input1'] = input1;
							datas['input2'] = input2;
							datas['input3'] = input3;
							datas['tipo'] = 'orgao';
							}
						datas['referencia'] = '2016';
						
						requisicao();
				}
			}
							
							

							
							
							function requisicao(){
								$('#grafico').hide();
								$('#gifGrafico').show();
								$.ajax({
									type : 'POST',
									contentType : 'application/json',
									url : '/DataMiningCGE/piramide',
									data : JSON.stringify(datas),
									dataType : 'json',
									success : function(data) {
										$('#gifGrafico').hide();

										$('#grafico').show();
										$('#grafico').highcharts({
									        chart: {
									            type: 'pyramid',
									            marginRight: 100
									        },
									        title: {
									            text: 'Pirâmide Hierárquica',
									            x: -50
									        },
									        plotOptions: {
									            series: {
									                dataLabels: {
									                    enabled: true,
									                    format: '<b>{point.name}</b> ({point.y:,.0f})',
									                    color: (Highcharts.theme && Highcharts.theme.contrastTextColor) || 'black',
									                    softConnector: true
									                }
									            }
									        },
									        legend: {
									            enabled: false
									        },
									        series: data
									    });

									}
								});
								
							}
							

						})
	</script>
</body>
</html>
