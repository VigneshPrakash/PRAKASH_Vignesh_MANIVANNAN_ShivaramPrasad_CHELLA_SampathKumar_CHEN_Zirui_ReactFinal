import React, { Component } from "react";
import {Route, NavLink, HashRouter} from "react-router-dom";
import {Button} from 'react-bootstrap';
import Login from "./Login";
import Movies from "./Movies";
import Home from "./Home";
import Customer from "./Customer";
import ReactDOM from "react-dom";
import "./Main.css";

class Main extends Component {

  onClick = () =>{
    ReactDOM.render(<div>
      <Login />
      </div>, document.getElementById('root'));
  };

 render() {
   return (
     <HashRouter>
       <div>
         <h1>Management For Rental Store </h1>
         <Button className="btn-Logout"
                block
                bsSize="large"
                type="submit" onClick={this.onClick}>
                Logout
            </Button>
         <ul className="header">
           <li><NavLink to="/Home">Home</NavLink></li>
           <li><NavLink to="/Customer">Customer</NavLink></li>
           <li><NavLink to="/Movies">Movies</NavLink></li>
         </ul>
         <div className="content">
            <Route exact path="/Home" component={Home}/>
            <Route path="/Customer" component={Customer}/>
            <Route path="/Movies" component={Movies}/>
         </div>
       </div>
      </HashRouter>
   );
 }
}

export default Main;