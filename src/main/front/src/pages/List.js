import React from 'react';
import axios from 'axios';
import PostItem from '../components/PostItem';
import {Button ,Form} from 'react-bootstrap';

const List = () => {
  function fnc_requestLogin (){

  }
  const requestLogin = async () =>{
    try {
      const response = await axios.get('http://localhost:9191/check');
      console.log(response);
      console.log(response.status);
      console.log(response.data);
    }catch (error){
      console.error('@check error : ',error)
    }
  }
  return (
    <div>
      <Button onClick={()=>fnc_requestLogin()}>조회</Button>
    </div>
  );
};

export default List;