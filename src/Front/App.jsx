import { useState } from 'react';
import './App.css';
import { cadastrar, limpar } from '../back/input.controller.js';

function App() {
  const [nome, setNome] = useState('');
  const [username, setUsername] = useState('');
  const [email, setEmail] = useState('');
  const [telefone, setTelefone] = useState('');
  const [senha, setSenha] = useState('');

  const handleSubmit = (e) => {
    e.preventDefault();
    cadastrar({ nome, username, email, telefone, senha });
    limpar(setNome, setUsername, setEmail, setTelefone, setSenha);
  };

  return (
    <>
      <div className="box">
        <form onSubmit={handleSubmit}>
          <h1>Cadastro</h1>
          <input type="text" className="nome" value={nome} onChange={(e) => setNome(e.target.value)} autoComplete="on" placeholder="Nome"/>
          <input type="text" className="username" value={username} onChange={(e) => setUsername(e.target.value)} autoComplete="off" placeholder="Nome de Usuário"/>
          <input type="email" className="email" value={email} onChange={(e) => setEmail(e.target.value)} autoComplete="on" placeholder="Email"/>
          <input type="telefone" className="telefone" value={telefone} onChange={(e) => setTelefone(e.target.value)} autoComplete="on" placeholder="Telefone"/>
          <input type="password" className="senha" value={senha} onChange={(e) => setSenha(e.target.value)} autoComplete="on" placeholder="Senha"/>
          <button type="submit">Cadastrar</button>
        </form>
      </div>
    </>
  );
}

export default App;