import { useEffect, useState } from 'react';
import '../Test.scss';

function Test() {
  const [page, setPage] = useState(0); // 페이지 번호 상태
  console.log("page : " + page);
  const questionList = [
    {
      q: ["재무 관련 정리 start"],
      a:[
        {value:"O",text:"맞다"},
        {value:"X",text:"아니다"}
      ]
    },
  ]
  return(
    <div className={"contentLayout"}>
      <div className={"startLogo"}>
        <div>정리</div>
      </div>
      <div onClick={()=> setPage(1)} className={"startButton"}>
        시작하기
      </div>
      <div className='mbtiTitle'>
        <div>{`${page} / ${questionList.length}`}</div>
      </div>
    </div>
  )
}

export default Test;
