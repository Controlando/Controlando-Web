import React from 'react';
import TitleText from '../../components/TitleText/TitleText';
import './LandPage.css';
import imagem from '../../../src/Image/img1-negocios.png'
import imagem1 from '../../../src/Image/img2.jpg'
import imagem2 from '../../../src/Image/img3.jpg'
 
import { Link } from 'react-router-dom';
//import Navbar from '../'
class LandPage extends React.Component {

    render() {
        return (<div class='page'>

            <div className='tentativa'>
                <div className="buttonLogin">
                    <button type="button" className="btn btn-primary"  ><Link to="/Login">Login</Link></button>
                    
                </div>
                <div className="landContent">
                    <img alt='tentei' className='landImage' src="https://finance-one-public.nyc3.digitaloceanspaces.com/financeone-uploads/melhores-aplicativos-financas-768x315.jpg" />
                </div>
                <div ><p className='Title'>Controlando</p></div>
                <div ><p className='Description'>Nunca foi
                    tão fácil controlar suas finanças empresariais
                        </p>
                </div>
                <div className="buttonCreate">
                    <Link to='/Cadastro'><button type="button" className="btn-outline-primary" >Cadastre-se já</button></Link>

                </div>

            </div>

            <div className='content'>
                <TitleText image = {imagem} title='O que é?' text='O controlando é uma aplicação web com o objetivo de facilitar o controle de finanças de sua empresa ou startup.' btnText='Cadastre-se já'/>
                <TitleText image = {imagem1} title='Como funciona?' text='Após o cadastro, você poderá administrar as despesas e ganhos mensais de sua empresa.' btnText='Login'/>
                <TitleText image = {imagem2} title='Vantagens' text='Relatórios mensais, planejamento para não entrar no vermelho, software gratuito, e feito para você usufruir de uma interface prática e eficiente.'btnText=''/>
            </div>
        </div>);
    }
}

export default LandPage;

/*
<button type="button" ><Link to="/Login">login</Link></button>
                <TitleText title='O que é?' text='O controlando é uma aplicação web com o obejetivo de facilitar o controle de finanças de sua empresa ou startup.' />
                <TitleText title='Como funciona?' text='Após o cadastro, você poderá administrar as dispesas e ganhos mensais de sua empresa.' />
                <TitleText title='Vantagens ?' text='Relatórios mensais, planejamento para não entrar no vermelho, software gratuito, e feito para você usufruir de uma interface prática e eficiente.' />
*/