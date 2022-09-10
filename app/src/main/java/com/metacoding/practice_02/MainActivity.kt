package com.metacoding.practice_02

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        okBtn.setOnClickListener {
            val id_str = idTxt.text.toString()
            val pw_str = pwTxt.text.toString()

            if(id_str.equals("jhe93@naver.com") ){

                val name = "조하은"

                if(pw_str.equals("1234")) {
                    Toast.makeText(this, "${name}님 환영합니다.", Toast.LENGTH_SHORT).show()
                }else{

                    Toast.makeText(this, "로그인에 실패하였습니다.", Toast.LENGTH_SHORT).show()
                }
            }else{

                Toast.makeText(this, "존재하지 않는 사용자입니다...", Toast.LENGTH_SHORT).show()
            }
        }
    }
}