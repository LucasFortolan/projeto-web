<?php
    include 'dao.php';
    if($_SERVER["REQUEST_METHOD"] == "POST") {
        $id = $_POST["id"];
        $nome = $_POST["nome"];
        $email = $_POST["email"];
        $sql = "UPDATE usuarios SET nome = '$nome', email = '$email' WHERE id = $id";

        if ($conn ->query($sql) === TRUE) {
            echo "Usuário atualizado com sucesso!";
        } else {
            echo "Erro: " . $conn -> error;
        }
    } else {
        $id = $_GET['id'];
        $sql = "SELECT * FROM usuarios WHERE id = $id";
        $result = $conn -> query($sql);
        $usuario = $result -> fetch_assoc();
    }
?>
<form method="post" action = "">
    <!--hidden é oculto, o id não pode ser alterado -->
    <input type="hidden" name="id" value = "<?php echo $usuario['id'];?>"><br>
    Nome: <input type="text" name="nome" value = "<?php echo $usuario['nome'];?>"><br>
    Email: <input type="email" name="email" value = "<?php echo $usuario['email'];?>"><br>
    <input type="submit"  value = "Atualizar usuário">
</form>

<form action="index.php" method="get">
    <button type="submit">Voltar</button>
</form>