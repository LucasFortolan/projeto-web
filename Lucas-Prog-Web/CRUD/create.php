<?php
    include 'dao.php';
    // me fala sobre esse metodo de variavel global
    if ($_SERVER["REQUEST_METHOD"] == "POST") {
        $nome = $_POST["nome"];
        $email = $_POST["email"];
        // hash é uma criptrografia de vida única, valida hash e não a senha, NÃO é salvo a SENHA e sim o HASH
        // um caracter que mudo, muda todo o hash. 'Lucas' é um cash. 'LucasFortolan', é criado outro hash para 'Lucas'
        $senha = password_hash($_POST["senha"], PASSWORD_DEFAULT);
        $sql = "INSERT INTO usuarios (nome, email, senha) VALUES ('$nome', '$email', '$senha')";
        if ($conn->query($sql)===TRUE) {
            echo "Novo usuário criado";
        } else {
            echo "Error: " . $sql . "<br>" . $coon -> error;
        }
    }
?>

<form method="post" action="">
    Nome: <input type="text" name="nome" required><br>
    Email: <input type="email" name="email" required><br>
    Senha: <input type="password" name="senha" required><br>
    <input type="submit" value="Criar Usuário">
</form>
<form action="index.php" method="get">
    <button type = "submit">Voltar</button>
</form>