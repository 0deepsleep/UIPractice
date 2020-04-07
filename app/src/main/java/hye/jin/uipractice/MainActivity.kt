package hye.jin.uipractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loginButton.setOnClickListener {
            Log.d("로그인버튼", "버튼 클릭 됨")
            Toast.makeText(this, "로그인 버튼 눌림", Toast.LENGTH_SHORT).show()
        }

        loginButton.setOnLongClickListener {
            Log.d("로그인버튼", "버튼을 길게 누름")
            return@setOnLongClickListener false
            // return@함수이름 => 해당 함수의 결과로 설정 명시
            // return true : 롱클릭 전용만 처리, false : 일반 클릭도 같이 실행
        }
    }
}

    /*
    Log.d(태그, 명시값)



    ㅁ Toast

    1. 개요
    - 사용자에게 간단한 알림 보여주고 싶을 때 사용
    - 심각한 알림의 경우에는 AlertDialog를 별도로 사용

    2. 사용법
    Toast.makeText(this,"표시내용", Toast.LENGTH_SHORT).show()

    3. 참고사항
    ㄹㅇ 토스트기 처럼 통 튀어 올랐다 사라져서... 졸라 쪼다같음...


    ㅁ UI 컴포넌트의 get, set
    1. 개요
    - 객체지향 개념에서 getter/setter에 대응되는 개념
    - getter : 변수에 적혀있는 데이터 가져오는 기능
    - setter : 변ㅂ수의 값을 바꿔주는 기능
    - JAVA : 변수는 직접 접근 허용x (private로 변수 막자)
     => getter, setter를 public으로 열어주고 이쪽으로 활용하도록
    kotlin : getter / setter 사용하지 않고 직접 변수에 접근

     */