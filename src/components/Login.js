import React, { Component } from 'react';
import ReactDOM from 'react-dom';
import MuiThemeProvider from 'material-ui/styles/MuiThemeProvider';
import AppBar from 'material-ui/AppBar';
import {Button} from 'react-bootstrap';
import TextField from 'material-ui/TextField';
import Main from './Main';
import "./Main.css";

class Login extends Component {
constructor(props){
  super(props);
  this.state={
  username:'',
  password:''
  }
 }

 validateForm(){

    return this.state.username === "admin" && this.state.password === "adminPwd";
  }

  onClick = () =>{
    ReactDOM.render(<div>
      <Main />
      </div>, document.getElementById('root'));
  };

render() {
    return (
      <div>
        <MuiThemeProvider>
          <div>
          <AppBar
             title="Login"
           />
           <TextField
             hintText="Enter your Username"
             floatingLabelText="Username"
             onChange = {(event,newValue) => this.setState({username:newValue})}
             />
           <br/>
             <TextField
               type="password"
               hintText="Enter your Password"
               floatingLabelText="Password"
               onChange = {(event,newValue) => this.setState({password:newValue})}
               />
             <br/>
             <Button className="btn-Login"
                block
                bsSize="large"
                disabled={!this.validateForm()}
                type="submit" onClick={this.onClick}>
                Login
            </Button>
         </div>
         </MuiThemeProvider>
      </div>
    );
  }
}
const style = {
 margin: 15,
};
export default Login;