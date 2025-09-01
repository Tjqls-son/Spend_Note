//달력 화면의 로직을 담당하는 kotlin 파일
package com.example.spend_note.calendar

import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.util.Calendar
import com.example.spend_note.R

class CalendarActivity : AppCompatActivity() {

    // 뷰 바인딩을 위한 변수 선언
    private lateinit var rvCalendar: RecyclerView
    private lateinit var tvMonthYear: TextView
    private lateinit var btnPrevMonth: ImageButton
    private lateinit var btnNextMonth: ImageButton

    // 날짜 데이터를 담을 리스트
    private val days = mutableListOf<CalendarDay>()

    // 현재 달력의 연도와 월
    private var currentYear: Int = 0
    private var currentMonth: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calendar)

        // XML 뷰와 코드 연결
        rvCalendar = findViewById(R.id.rv_calendar)
        tvMonthYear = findViewById(R.id.tv_month_year)
        btnPrevMonth = findViewById(R.id.btn_prev_month)
        btnNextMonth = findViewById(R.id.btn_next_month)

        // 초기 달력 설정
        val calendar = Calendar.getInstance()
        currentYear = calendar.get(Calendar.YEAR)
        currentMonth = calendar.get(Calendar.MONTH)

        rvCalendar.post {
            val recyclerViewHeight = rvCalendar.height
            val itemHeight = recyclerViewHeight / 6
            val adapter = CalendarAdapter(days, itemHeight)
            rvCalendar.adapter = adapter

            rvCalendar.layoutManager = GridLayoutManager(this, 7)

            setupCalendar()
        }

        // 버튼 클릭 리스너 설정
        btnPrevMonth.setOnClickListener {
            changeMonth(-1)
        }

        btnNextMonth.setOnClickListener {
            changeMonth(1)
        }
    }

    // 달력 화면 설정 및 업데이트
    private fun setupCalendar() {
        val calendar = Calendar.getInstance()
        calendar.set(currentYear, currentMonth, 1) // 현재 설정된 연도와 월의 첫째 날로 설정

        // 월/연도 텍스트 업데이트
        val monthString = (currentMonth + 1).toString()
        tvMonthYear.text = "${currentYear}. ${monthString}"

        // 날짜 리스트 초기화
        days.clear()

        // 해당 월의 첫날이 시작하는 요일 계산
        val firstDayOfWeek = calendar.get(Calendar.DAY_OF_WEEK)

        // 달력의 빈 공간 채우기
        // DAY_OF_WEEK: 일요일(1) ~ 토요일(7)
        for (i in 1 until firstDayOfWeek) {
            days.add(CalendarDay(0, 0, 0))
        }

        // 해당 월의 마지막 날 계산
        val lastDayOfMonth = calendar.getActualMaximum(Calendar.DAY_OF_MONTH)

        // 해당 월의 날짜 추가
        for (i in 1..lastDayOfMonth) {
            days.add(CalendarDay(i, currentMonth + 1, currentYear))
        }

        (rvCalendar.adapter as? CalendarAdapter)?.notifyDataSetChanged()
    }

    // 월 이동
    private fun changeMonth(change: Int) {
        val calendar = Calendar.getInstance().apply {
            set(currentYear, currentMonth, 1)
            add(Calendar.MONTH, change)
        }

        currentYear = calendar.get(Calendar.YEAR)
        currentMonth = calendar.get(Calendar.MONTH)

        setupCalendar()
    }
}