<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>Cloudset</title>

<meta http-equiv="Content-Type" content="text/html; charset=utf-8">


<script type="text/javascript" src="resources/js/jquery-1.4.2.min.js"></script>


<link rel="stylesheet"
	href="https://cdn.rawgit.com/LeaVerou/awesomplete/gh-pages/awesomplete.css">
<script
	src="https://cdn.rawgit.com/LeaVerou/awesomplete/gh-pages/awesomplete.min.js"></script>

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

        <script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jquery/1.8.2/jquery.min.js"></script>
     
        <style type="text/css">
            #container {
                height: 500px; 
                min-width: 310px; 
                max-width: 800px; 
                margin: 0 auto; 
            }
            .loading {
                margin-top: 10em;
                text-align: center;
                color: gray;
            }
        
        </style>
          
        <script type="text/javascript">
            $(function () {

                // Prepare demo data
                var data = [{ 'hc-key': 'br-sp', value: 82 },
                    { 'hc-key': 'br-ma', value: 173},
                    { 'hc-key': 'br-pa', value: 2 },
                    { 'hc-key': 'br-sc', value: 0 },
                    { 'hc-key': 'br-ba', value: 10 },
                    { 'hc-key': 'br-ap', value: 0 },
                    { 'hc-key': 'br-ms', value: 0 },
                    { 'hc-key': 'br-mg', value: 14 },
                    { 'hc-key': 'br-go', value: 15 },
                    { 'hc-key': 'br-rs', value: 1 },
                    { 'hc-key': 'br-to', value: 3 },
                    { 'hc-key': 'br-pi', value: 109593 },
                    { 'hc-key': 'br-al', value: 2 },
                    { 'hc-key': 'br-pb', value: 5 },
                    { 'hc-key': 'br-ce', value: 89 },
                    { 'hc-key': 'br-se', value: 2 },
                    { 'hc-key': 'br-rr', value: 3 },
                    { 'hc-key': 'br-pe', value: 34 },
                    { 'hc-key': 'br-pr', value: 1 },
                    { 'hc-key': 'br-es', value: 4 },
                    { 'hc-key': 'br-rj', value: 43 },
                    { 'hc-key': 'br-rn', value: 4 },
                    { 'hc-key': 'br-am', value: 5 },
                    { 'hc-key': 'br-mt', value: 4 },
                    { 'hc-key': 'br-df', value: 143 },
                    { 'hc-key': 'br-ac', value: 0 },
                    { 'hc-key': 'br-ro', value: 3 }];

                    
                // Initiate the chart
                $('#container').highcharts('Map', {
                    
                    title : {
                        text : 'Mapa Demográfico'
                    },

                    subtitle : {
                        text : 'Mapa Demografico dos Sevidores Públicos Estaduais do Piauí'
                    },

                    mapNavigation: {
                        enabled: false,
                        buttonOptions: {
                            verticalAlign: 'bottom'
                        }
                    },

                    colorAxis: {
                        min: 0
                    },

                    series : [{
                        data : data,
                        mapData: Highcharts.maps['countries/br/br-all'],
                        joinBy: 'hc-key',
                        name: 'Quantidade',
                        states: {
                            hover: {
                                color: '#BADA55'
                            }
                        },
                        dataLabels: {
                            enabled: true,
                            format: '{point.name}'
                        }
                    }]
                });
            });
        </script>



</head>
<body>

<script src="https://code.highcharts.com/maps/highmaps.js"></script>
        <script src="https://code.highcharts.com/maps/modules/exporting.js"></script>
        <script src="https://code.highcharts.com/mapdata/countries/br/br-all.js"></script>
        <script type="text/javascript" src="resources/js/droid_sans_400-droid_sans_700.font.js"></script>
        <script type="text/javascript" src="resources/js/cufon-yui.js"></script>
        <script type="text/javascript" src="resources/js/script.js"></script>
<script type="text/javascript" src="resources/js/coin-slider.min.js"></script>
<link href="resources/css/style.css" rel="stylesheet" type="text/css" />
<link rel="stylesheet" type="text/css" href="resources/css/coin-slider.css" />

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
							<b>Mapa Demografico </b>
						</h4>
						<hr>
						<h5 style="text-align: center">
							Nesta consulta é possível identificar quantos servidores pertencentes ao Piauí estão alocados em cada estado do Brasil.
							 Para isso, basta selecionar um estado.
							 
						</h5>
						<hr>
						
						
					</div>
					<div class="panel-body">
					
					<div id="container"></div>
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

</body>
</html>
