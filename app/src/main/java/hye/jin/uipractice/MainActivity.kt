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
            // 로그인버튼이 눌리면 할 일 지정

            val inputEmail = emailEdt.text.toString()
            Log.d("로그인버튼", "버튼 클릭 됨")
            Toast.makeText(this, inputEmail, Toast.LENGTH_SHORT).show()

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




    ==================================================================
    ㅁ 코틀린 기본 문법
    1. 개요
     - 내용물이 변할 수 있는 데이터를 저장하는 공간 (RAM에서 공간 임대)
     - 상수 : 내용물을 바꿀 수 없는 데이터 저장 공간

    2. 자바 이론
     - 변수의 종류 : 크게 나누면 2가지. 기본형변수 / 참조형 변수
     1) 기본형 변수 : int, double, boolean 등 형태가 소문자로 구성된 변수들
     2) 참조형 변수 : String, Button, TextView, EditText 등 대문자로 시작하는 변수
      => 참조형 변수에는 .을 찍어서 추가기능/변수를 사용할 수 있다.

    3. 코틀린 이론
     - 변수의 종류 : 무조건 참조형 변수 사용. 자바의 기본형 변수도 모두 참조형 변수로 변환하여 사용
      => JAVA Wrapper 클래스의 개념으로 활용
     - 변수를 만드는 법
        예시) 1. 정수 10을 num이라는 변수에 저장
        var num = 10 //num은 int 형태로 자동 감지되어 변수 저장 됨 /이런식으로 제일 많이 변수 사용

        var num:Int
        num = 10 //num 을 미리 Int형태로 만들고 그 뒤에 10을 대입

     - 만일 변수의 값이 변하지 않을 거 같다면 상수로 만들어 주는게 앱 속도에 긍정적 영향 줌
        예시) 2. 상수 3.14를 PI라는 이름으로 저장
        val PI = 3.14 //상수로 PI값을 ㅁ나들고 값을 3.14로 확정. 자료형 자동 double(실수)
        val PI:Double

        //val : value(값)

      4. 참고사항
      - 변수타입 지정하지 않은 경우 반드시 값 초기화
        => val은 만들어지자 마자 넣는게 정석. var도 변수타입 지정 안할거라면 바로 초기화





     */