import React from 'react'
import axios from 'axios';
export default function Login(){

  return (
    <div className = "page">
      {/* Title Wrap*/}
      <div className = "titleWrap">
        이메일과 비밀번호를<br/> 입력하세요
      </div>

      {/* contentWrap - 이메일 입력 */}
      <div className = "contentWrap">
        <div className="inputTitle">
          이메일 주소
        </div>
        <div className="inputWrap">
          <input></input>
        </div>
      </div>

      {/* errror 메세지 띄우기  */}
      <div className = "errorMessageWrap">
        <div>올바른 이메일 주소를 입력해주세요</div>

      </div>

      <div className = "contentWrap">
        <div className="inputTitle">
          비밀번호
        </div>
        <div className="inputWrap">
          <input></input>
        </div>
      </div>

      {/* errror 메세지 띄우기  */}
      <div className = "errorMessageWrap">
        <div> 영문, 숫자, 특수문자 포함 8자 이상 입력해주세요</div>

      </div>

      <div>
        <button>
          확인</button>
      </div>

    </div>
  )
}

