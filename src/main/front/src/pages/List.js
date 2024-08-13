import React from 'react';
import axios from 'axios';
import PostItem from '../components/PostItem';
import {Button ,Form} from 'react-bootstrap';

const List = () => {
    const requestLogin = async () =>{
        const id = document.getElementById("userName").value;
        const email = document.getElementById("userEmail").value;
        const password = document.getElementById("userPassWord").value;
        const confirmPassword = document.getElementById("userConfirmPassWord").value;
        const phoneNumber = document.getElementById("userPhoneNumber").value;

        const url = "http://localhost:9191/check";
        // const data = {
        //   'id' : id,
        //   'email' : email,
        //   'password' : password,
        //   'confirmPassword' : confirmPassword,
        //   'phoneNumber' : phoneNumber
        // };
        const data = {};
        //const config = {"Content-Type": 'application/json'};
        try {
            const response = await axios.get("http://localhost:9191/check");

            if(response.status == 200){
                console.log('@check success : ',response.data);
            }else{
                console.error('@check falled');
            }
        }catch (error){
            console.error('@check error : ',error)
        }
    }
    function fnc_requestLogin (){
        requestLogin();
    }

    return (
        <div>
            <Form.Group className="mb-3" controlId="exampleForm.ControlInput1">
                <Form.Label>Name</Form.Label>
                <Form.Control id="userName"/>
            </Form.Group>
            <Form.Group className="mb-3">
                <Form.Label>Email</Form.Label>
                <Form.Control id="userEmail"/>
            </Form.Group>
            <Form.Group className="mb-3">
                <Form.Label>Password</Form.Label>
                <Form.Control id="userPassWord"/>
            </Form.Group>
            <Form.Group className="mb-3">
                <Form.Label>Confirm Password</Form.Label>
                <Form.Control id="userConfirmPassWord"/>
            </Form.Group>
            <Form.Group className="mb-3">
                <Form.Label>Phone Number</Form.Label>
                <Form.Control id="userPhoneNumber"/>
            </Form.Group>
            <Button onClick={()=>fnc_requestLogin()}>계정 생성</Button>
        </div>
    );
};

export default List;