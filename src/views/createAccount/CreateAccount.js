import React from 'react';
import './CreateAccount.css';

class CreateAccount extends React.Component {
    render() {
        return (
            
        <div className='container'>    
            <form className='Forma'>
                <b>Empresa</b>
                <div className="form-group">
                    <label for="exampleInputEmail1">Email:</label>
                    <input type="email" className="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter email" />
                    <small id="emailHelp" className="form-text text-muted">We'll never share your email with anyone else.</small>

                </div>
                <div className="form-group">
                    <label for="exampleInputPassword1">Senha:</label>
                    <input type="password" className="form-control" id="exampleInputPassword1" placeholder="Password" />
                </div>
                <div className="form-check">

                    <input type="checkbox" className="form-check-input" id="exampleCheck1" />
                    <label className="form-check-label" for="exampleCheck1">Salvar meus dados</label>
                    <br/>
                    </div>
                <div className='administrador'>
                    <b>Administrador</b>
                    <br/>
                    <label> Email</label>
                    <input type="email" className="form-control" id="emailAdministrador" aria-describedby="emailHelp" placeholder="Enter email" />
                    <small id="emailHelp" className="form-text text-muted">We'll never share your email with anyone else.</small>
                    
                    <label for="exampleInputPassword1">Senha:</label>
                    <input type="password" className="form-control" id="exampleInputPassword1" placeholder="Password" />
                </div>
                    <button type="submit" className="btn btn-primary">Cadastrar</button>

                
            </form>
            </div>
        );
    }
}

export default CreateAccount;