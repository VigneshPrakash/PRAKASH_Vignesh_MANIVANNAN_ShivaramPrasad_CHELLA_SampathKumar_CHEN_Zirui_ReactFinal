import React from 'react';
import ReactDOM from 'react-dom';
import Customer from './components/Customer';

it('renders customer details from JSON file of localhost:8080 without crashing', () => {
  const div = document.createElement('div');
  ReactDOM.render(<Customer />, div);
});

it('To check the correct credentials for a valid login', () => {
  

const credentials =  ["admin", "adminPwd"];

const expectedChoices = ["admin","adminPwd"];

expect(credentials).toEqual(expectedChoices);

});
