import {Button ,Form} from 'react-bootstrap';
import axios from 'axios';


const Write = () => {
  function selectData(){
    const userName = document.getElementById("userName");
    const contents = document.getElementById('contents')
    console.log(userName);
    console.log(contents);
    console.log(userName.value);
    console.log(contents.value);

    axios.post('http://localhost:9191/testData',["가","나","다"])
      .then(function (res){
        console.log(res)
      });
  };
  return (
    <div>
      <Form.Group className="mb-3" controlId="exampleForm.ControlInput1">
        <Form.Label>제목</Form.Label>
        <Form.Control id="userName"/>
      </Form.Group>
      <Form.Group className="mb-3">
        <Form.Label>내용</Form.Label>
        <Form.Control as="textarea" rows={3} id="contents"/>
      </Form.Group>
      <Button onClick={()=>selectData()}>글쓰기</Button>
    </div>
  );
};

export default Write;