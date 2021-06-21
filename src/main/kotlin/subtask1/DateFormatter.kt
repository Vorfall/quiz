package subtask1

import java.text.SimpleDateFormat
import java.util.*

class DateFormatter {

    // TODO: Complete the following function
    fun toTextDay(day: String, month: String, year: String): String {
        var newStr:String = ""

        SimpleDateFormat("yyyy-M-d", Locale("ru")).parse("$year-$month-$day")
        if ( SimpleDateFormat("d").format(SimpleDateFormat("yyyy-M-d", Locale("ru")).parse("$year-$month-$day")) == day && SimpleDateFormat("M").format(
                SimpleDateFormat("yyyy-M-d", Locale("ru")).parse("$year-$month-$day")) == month && SimpleDateFormat("yyyy").format(
                SimpleDateFormat("yyyy-M-d", Locale("ru")).parse("$year-$month-$day")) == year )
            newStr = SimpleDateFormat("dd MMMM, EEEE", Locale("ru")).format(SimpleDateFormat("yyyy-M-d", Locale("ru")).parse("$year-$month-$day"))
        else
            newStr = "Такого дня не существует"
        return newStr
    }
}
