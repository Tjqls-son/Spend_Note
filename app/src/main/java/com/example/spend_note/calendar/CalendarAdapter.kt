package com.example.spend_note.calendar

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.spend_note.R

class CalendarAdapter (
    private val days: List<CalendarDay>,
    private val itemHeight: Int
) : RecyclerView.Adapter<CalendarAdapter.CalendarViewHolder>() {

    class CalendarViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val dayTextView: TextView = view.findViewById(R.id.tv_day)
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CalendarViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_calendar_day, parent, false)
        return CalendarViewHolder(view)
    }
    override fun onBindViewHolder(holder: CalendarViewHolder, position: Int) {
        val day = days[position].day
        holder.dayTextView.text = if (day != 0) day.toString() else ""

        val layoutParams = holder.itemView.layoutParams
        layoutParams.height = itemHeight
        holder.itemView.layoutParams = layoutParams
    }
    override fun getItemCount() = days.size
}