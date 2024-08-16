import { useEffect, useState } from 'react';
import '../Test.scss';

function Test() {
  const today = new Date();
  const firstDay = new Date("2023-03-08");
  const formattedDate = `${today.getFullYear()}년 ${today.getMonth() + 1}월 ${today.getDate()}일`;
  const formattedDate2 = `${firstDay.getFullYear()}년 ${firstDay.getMonth() + 1}월 ${firstDay.getDate()}일`;
  const difDays = Math.ceil((today - firstDay) / (1000 * 60 * 60 * 24));

  const [page, setPage] = useState(0); // 페이지 번호 상태

  const questionList = [
    {
      q:["만난 일수는?"],
      a:[
        {type:"X",text:difDays-1},
        {type:"O",text:difDays},
        {type:"X",text:difDays+1},
        {type:"X",text:difDays-+2}
      ]
    },
  ]

  const [mbtiList, setMbtiList ] = useState([
    {name:"O", count:0}, {name:"X", count:0},
  ]);

  // 답변을 클릭했을 때 실행할 함수. (MTTI 타입 / 질문 idx)
  const handleCkAnswer = (type, idx) => {
    let ls = mbtiList;
    for(let i = 0; i < ls.length; i++){
      if (ls[i].name === type){ //mbtiList의 name이, type과 같을 경우
        ls[i].count +=1; // count값을 1 늘려준다.
      }
    }

    setMbtiList(ls); //mbtiList를 업데이트 시킨다.
    setPage(page+1); // 페이지도 1 업데이트 시킨다.

    //결과페이지 | idx가 질문리스트 길이만큼 됐다면
    if(idx+1 === questionList.length){
      // console.log("결과보기")
      setMbti();
    }
  }
  function setMbti(){}

  return(
    <div className={"contentLayout"}>
      <div className={"headerLogo"}>
        - -
      </div>
      {page == 0?
        <div onClick={()=> setPage(1)} className={""}>
          시작
        </div>
        :
        <div className=''>
          <div>{`${page} / ${questionList.length}`}</div>
        </div>
      }
      {questionList.map((val,idx)=> //질문 리스트 받기
        <div className='' key={idx} style={{display:page===idx+1? "block" : "none"}}>
          {console.log(mbtiList)}
          <div className=''>
            <div className="">
              {val.q.map((qval, qidx)=>
                <div key={qidx} className=''>
                  <div>{qval}</div>
                </div>
              )}
            </div>
          </div>

          <div className='answerItemLayout'>

            {/* 답변 내용 */}
            {val.a.map((aval,aidx) =>
              <div key={aidx} className="" onClick={() => handleCkAnswer(aval.type, idx )}>
                {aval.text}
              </div>
            )}
          </div>
        </div>
      )}
      <div className=''>
        <div onClick={()=> window.location.reload()}>다시하기</div>
      </div>
    </div>
  )
}

export default Test;
