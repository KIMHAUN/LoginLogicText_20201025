package kr.co.neoplus.loginlogictext_20201025

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loginBtn.setOnClickListener {
            
//            입력된 이메일과 비번을 별도의 변수에 저장
            val email = inputEmail.text.toString() //왠만하면 toString으로 가져오기.
            val pwd = inputPwd.text.toString()
            
//            질문 : 입력한 이메일과 비번이"admin@test.com", "qwer"이냐 
            if(email == "admin@test.com" && pwd == "qwer"){
//                질문 결과가 맞으면 관리자 로그인 토스트
                Toast.makeText(this, "관리자가 로그인했습니다.", Toast.LENGTH_SHORT).show()
            }else{
//                질문 결과가 false이면 로그인 실패 토스트
                Toast.makeText(this, "로그인 실패", Toast.LENGTH_SHORT).show()
            }
        }
    }
}