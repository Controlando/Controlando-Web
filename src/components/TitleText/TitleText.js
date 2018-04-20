import React from 'react'
import './TitleText.css'
//https://scontent.fmao1-1.fna.fbcdn.net/v/t1.0-9/14264946_1871911676373587_7351697778102918119_n.jpg?_nc_cat=0&oh=fb2f304ec2f896d6e40ee30f4dd41c48&oe=5B9D12DC
class TitleText extends React.Component {
    render() {
        return (
            <div className="card" >
                <img className="card-img-top" src={this.props.image} alt="" />
                <div className="card-body">
                    <b className="card-title">{this.props.title}</b>
                    <p className="card-text">{this.props.text}</p>
                    <a href="" className="btn btn-primary">{this.props.btnText}</a>
                </div>
            </div>
        );
    }
}

export default TitleText;