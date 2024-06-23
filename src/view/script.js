import cadastrar from "../controller/input.controller";
import limpar from "../controller/input.controller";

const formulario = document.querySelector("form");

formulario.addEventListener("submit", function (event) {
    event.preventDefault();
    cadastrar();
    limpar();
})