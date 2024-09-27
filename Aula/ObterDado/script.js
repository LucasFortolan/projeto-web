const handleSubmit = (event) => {
    event.preventDefault();
    
    const name = document.querySelector('input[name=name]').value;
    const email = document.querySelector('input[name=email]').value;
    fetch('https://api.sheetmonkey.io/form/4eN3Savr3QYbtiio7gCdpF', {
        // Objeto
        method: 'post',
        headers: {
            'Accept': 'application/json',
            'Content-Type': 'application/json',
        },
        body: JSON.stringify({ name: name, email: email }) // Corrigido para usar as variáveis
    });
};

document.querySelector('form').addEventListener('submit', handleSubmit);


const handleSubmit = (event) => {

    event.preventDefault();
    // Função para validar e-mail
    // Função para validar e-mail
    function isValidEmail(email) {
        var re = /^[^\s@]+@[^\s@]+\.[^\s@]+$/; // Regex para validação de e-mail
        return re.test(email);
    }
    const email = document.querySelector('#email').value; // Obtém o valor do campo de e-mail
    $('#messageContainer').empty(); // Limpa mensagens anteriores
    console.log(email);
    if (email && isValidEmail(email)) {
        // Envia o e-mail para a planilha do Google Sheets
        fetch('https://api.sheetmonkey.io/form/4eN3Savr3QYbtiio7gCdpF', {
            method: 'post',
            headers: {
                'Accept': 'application/json',
                'Content-Type': 'application/json',
            },
            body: JSON.stringify({ email: email }), // Envia o e-mail em formato JSON
    });
    }
};

document.querySelector('#submitBtn').addEventListener('click', handleSubmit);