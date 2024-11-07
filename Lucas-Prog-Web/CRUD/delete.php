<?php
    include 'dao.php';
    if ($_SERVER["REQUEST_METHOD"] == "GET") {
        $id = $_GET["id"];
        $sql = "DELETE FROM usuarios WHERE id=$id";
        if ($conn>query($sql) === TRUE){
            echo "Usuário apagado com sucesso!";
        } else {
            echo "Error: " .$conn > error;
        }
    }
?>

<form action="index.php" method="get">
    <button type="submit">Voltar</button>
</form>