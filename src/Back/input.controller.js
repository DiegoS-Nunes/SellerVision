export function cadastrar({ nome, username, email, telefone, senha }) {
    fetch("http://localhost:8080/usuarios", {
      headers: {
        "Accept": "application/json",
        "Content-Type": "application/json",
      },
      method: "POST",
      body: JSON.stringify({ nome, username, email, telefone, senha })
    })
    .then(function (res) { console.log(res); })
    .catch(function (res) { console.log(res); });
  }
  
  export function limpar(setNome, setUsername, setEmail, setTelefone, setSenha) {
    setNome("");
    setUsername("");
    setEmail("");
    setTelefone("");
    setSenha("");
  }