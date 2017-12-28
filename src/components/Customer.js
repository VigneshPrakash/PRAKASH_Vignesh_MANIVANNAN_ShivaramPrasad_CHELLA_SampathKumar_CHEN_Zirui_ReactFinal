import React from "react";
import axios from "axios";



export default class Customer extends React.Component {
constructor(props) {
   super(props);
   this.state = {
      customer: []
   }
}
 
componentDidMount() {

 axios.get("http://localhost:8080/customer/")

 .then((response)=> { 
   
     this.setState({
        customer: JSON.stringify(response.data, null, '\t')
        });
        console.log(JSON.stringify(response.data, null, '\t'));
      })

  .catch((error)=>{

    console.log("entering customer catch");
  })

 
}

// componentWillUnmount() {
//   .abort();
// }
 
render() {
 return (
    <div>
      <h1>WELCOME</h1>
      <p>The following details are rendered from the customer table of sakila Database</p>
        {this.state.customer}
    </div>
     
  );
 } 
}

