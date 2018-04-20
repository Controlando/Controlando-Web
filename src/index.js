import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';
import LandPage from './views/landPage/LandPage';
import registerServiceWorker from './registerServiceWorker';
import Login from './views/login/Login';
import CreateAccount from './views/createAccount/CreateAccount'
import { BrowserRouter, Switch, Route } from 'react-router-dom'

//import Login from './views/login/Login'

ReactDOM.render(
    <BrowserRouter>  
        <Switch>
            <Route path = "/" exact={true} component= {LandPage}/>
            <Route path = "/Login" component = {Login}/>
            <Route path = "/Cadastro" component ={CreateAccount}/>
        </Switch>
    </BrowserRouter>
    , document.getElementById('root'));
registerServiceWorker();

/*ReactDOM.render(<Login/>, document.getElementById('root'));
registerServiceWorker();
*/