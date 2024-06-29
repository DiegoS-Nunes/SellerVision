const Inome = document.querySelector(".nome");
const Iemail = document.querySelector(".email");
const Itel = document.querySelector(".tel");
const Isenha = document.querySelector(".senha");

function cadastrar () {
    fetch("http://localhost:5173/cadastro",
        {
            headers: {
                "Accept": "application/json",
                "Content-Type": "application/json",
            },
            method: "POST",
            body: JSON.stringify({
                nome: Inome.value,
                email: Iemail.value,
                tel: Itel.value,
                senha: Isenha.value
            })
        })
        .then(function (res) {console.log(res)})
        .catch(function (res) {console.log(res)})
};

function limpar (){
    Inome.value = "";
    Iemail.value = "";
    Itel.value = "";
    Isenha.value = "";
}

export default {cadastrar, limpar}