import React from 'react';
import './Login.css'


class Login extends React.Component {
    render() {
        return (<div className='page'>
            <h1 className='loginText'>Entrar</h1>

            <div className='LoginBox'>
                <div className="edita">
                    <label className="emailEmp" for="emailEmpresa">E-mail da empresa: </label>
                    <input className="inputEmp" type="text" value="" id="emailEmpresa"></input>
                    <br></br>
                    <label className="emailInd" for="emailEmpresa">E-mail individual: </label>

                    <input className="inputInd" type="text" value="" id="emailIndividual"></input>
                    <br></br>
                    <label className="senha" for="senhaLogin">Senha: </label>
                    <input className="senhaInput" type="text" value="" id="senhaLogin"></input>
                    <br></br>
                    <button className="button" type="submit">Enviar</button>
                </div>
            </div>

        </div>);
    }
}

export default Login;