<?php
    // Define os dados de conexão com o banco de dados
    $servername = "localhost"; // Nome do servidor, geralmente "localhost" para desenvolvimento local
    $username = "root"; // Nome de usuário para o banco de dados (aqui usando "root")
    $password = ""; // Senha do banco de dados (vazia neste exemplo)
    $dbname = "crud_113676"; // Nome do banco de dados a ser acessado

    // Cria uma nova conexão com o banco de dados usando os parâmetros definidos
    $conn = new mysqli($servername, $username, $password, $dbname);

    // Verifica se houve algum erro na conexão
    if ($conn->connect_error) {
        // Se houver um erro, a execução será interrompida e uma mensagem de erro será exibida
        die("Conexão foi pro brejo: " . $conn->connect_error);
    }
?>
