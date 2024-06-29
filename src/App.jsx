import { useState } from 'react'
import './App.css'

function App() {
  const [] = useState(0)

  return (
    <>
      <div className="box">
        <form action="">
            <h1>Cadastro</h1>
            <input type="text" className="nome" name="nome" id="nome" autoComplete="on" placeholder="Nome"/>
            <input type="text" className="username" name="username" id="username" autoComplete="off" placeholder="Nome de Usuário"/>            
            <input type="email" className="email" name="email" id="email" autoComplete="on" placeholder="Email"/>
            <input type="tel" className="tel" name="telefone" id="telefone" autoComplete="on" placeholder="Telefone"/>
            <input type="password" className="senha" name="senha" id="senha" autoComplete="on" placeholder="Senha"/>
            <button>Cadastrar</button>
        </form>
      </div>
    </>
  )
}

export default App
