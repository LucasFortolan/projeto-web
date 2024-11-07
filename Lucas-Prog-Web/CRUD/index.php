<?php
    // Inclui o arquivo de conexão com o banco de dados
    include 'dao.php';

    // Define uma consulta SQL para selecionar todos os registros da tabela 'usuarios'
    $sql = "SELECT * FROM usuarios";
    
    // Executa a consulta SQL e armazena o resultado em $result
    $result = $conn->query($sql); 

?>
<a href ="create.php">Criar novo usuário</a>
<h2>Lista de Usuários</h2>

<?php
    // Verifica se há algum resultado retornado pela consulta
    if ($result->num_rows > 0) {
        // Itera sobre os resultados e exibe os dados de cada usuário
        while ($row = $result->fetch_assoc()) { 
            // Cria uma tabela com as coluna ID, Nome, Email, Botão Editar e Botão Excluir
            echo "ID: " . $row["id"] . " - Nome: " . $row["nome"] . " - Email: " . $row["email"];
            echo " | <a href = 'update.php?id= " .$row["id"]. "'>Editar</a>";
            echo " | <a href = 'delete.php?id=" .$row["id"]. "'>Excluir</a></br>";
        }
    } else {
        // Caso nenhum usuário seja encontrado, exibe uma mensagem informativa
        echo "Nenhum usuário encontrado.";
    }
    
    // Fecha a conexão com o banco de dados
    $conn->close();
?>
