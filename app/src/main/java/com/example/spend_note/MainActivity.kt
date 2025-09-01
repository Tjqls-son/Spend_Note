package com.example.spend_note

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.spend_note.calendar.CalendarActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // CalendarActivity로 이동하는 Intent 생성
        val intent = Intent(this, CalendarActivity::class.java)

        // Activity 시작
        startActivity(intent)

        // 현재 Activity(MainActivity) 종료
        finish()
    }
}