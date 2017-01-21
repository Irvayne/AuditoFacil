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
							<b>Porcentagem de Gastos </b>
						</h4>
						<hr>
						<h5 style="text-align: center">
							 Distribuicao dos gastos publicos em relacao aos cargos/orgao/categoria.
							 
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
