import React from 'react';
import TitleText from '../../components/TitleText/TitleText';
import './LandPage.css';
import { Link } from 'react-router-dom';
class LandPage extends React.Component {

    render() {
        return (<div class='page'>
            
            <div className='tentativa'>
                <div className="buttonLogin">
                    <button type = "button" ><Link to="/Login">login</Link></button>
                </div>
                <div className = "landContent">
                    <img className ='landImage' src="https://finance-one-public.nyc3.digitaloceanspaces.com/financeone-uploads/melhores-aplicativos-financas-768x315.jpg" />
                </div>
                <div ><p className='Title'>Controlando</p></div>
                <div ><p className='Description'>Nunca foi
                    tão fácil controlar suas finanças empresariais
                        </p>
                </div>
                <div className="buttonCreate">
                    <button type = "button" >Cadastre-se já</button>

                </div>

            </div>
            <div className='content'>
                <TitleText title='O que é?' text='O controlando é uma aplicação web com o obejetivo de facilitar o controle de finanças de sua empresa ou startup.' />
                <TitleText title='Como funciona?' text='Após o cadastro, você poderá administrar as dispesas e ganhos mensais de sua empresa.' />
                <TitleText title='Vantagens ?' text='Relatórios mensais, planejamento para não entrar no vermelho, software gratuito, e feito para você usufruir de uma interface prática e eficiente.' />
            </div>
        </div>);
    }
}

export default LandPage;