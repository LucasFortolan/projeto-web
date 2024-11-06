var xml = "";
var atualizar;
var table;

function conexao() {
    atualizar - setInterval(function() {loaddoc();}, 3000);
}

function loaddoc() {
    var xhttp = new XMLHttpRequest(); // https://www.w3schools.com/xml/xml_http.asp
    xhttp.onreadystatechange = function() {
        if(xhttp.readyState == 4 && xhttp.status == 200) {
            AtualizaMenu(xhttp);
        }
        else {
            AtualizaArticle();
        }
    };
    xhttp.open("GET", xml, true); // GET passando parametro por URL, não permite segurança ou criptrografia
    // post é por ARVORE DOM, garante segurança, é orientado a log (historico), informações de data, usuario e tipo de erro
    xhttp.send();
}

function AtualizaMenu(xml) {
    var i;
    var xmldoc = xml.responseXML;
    table = "<tr><th>Nome</th><th>Preço</th><th>descricao</th><th>calorias</th></tr>";
    var x = xmldoc.getElementsByTagName("comida");
    for (i=0; i < x.length; i++) {
        table+= "<tr><td>" + x[i].getElementsByTagName("nome")[0].childNodes[0].nodeValue
        table+= "<tr><td>" + x[i].getElementsByTagName("preco")[0].childNodes[0].nodeValue
        table+= "<tr><td>" + x[i].getElementsByTagName("descricao")[0].childNodes[0].nodeValue
        table+= "<tr><td>" + x[i].getElementsByTagName("calorias")[0].childNodes[0].nodeValue
    }
    document.getElementById("tabArticle").innerHTML = null;
    document.getElementById("tabMenu").innerHTML = table;
    function AtualizaArticle(){
        var articleTab = table;
        document.getElementById("tabMenu").innerHTML = null;
        document.getElementById("tabArticle").innerHTML = articleTab;
      }
    
      function ConectaDesconectaXml(){
          if (xml == "") {
            xml = "pizza_catalog.xml";
            window.alert("Conectado!");
            document.getElementById("btnxml").innerHTML = "Desconectar XML";
    
    
          }else {
            xml = "";
            window.alert("Desconectado!");
            document.getElementById("btnxml").innerHTML = "Conectar XML";
            AtualizaArticle();
          }
      }
}