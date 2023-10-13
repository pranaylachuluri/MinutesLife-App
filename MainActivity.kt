package app.dev.minuteslife

import android.app.DatePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import java.text.SimpleDateFormat
import java.util.*

class MainActivity : AppCompatActivity() {

    private var tvSelectedDate : TextView? =null
    private var tvAgeInMins : TextView? =null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val Datebutton : Button = findViewById(R.id.Datebutton)

        tvSelectedDate = findViewById(R.id.tvSelectedDate)
        tvAgeInMins = findViewById(R.id.tvAgeInMins)

        Datebutton.setOnClickListener{
            clickDate()
        }

    }

    private fun clickDate(){

        val myCal = Calendar.getInstance()
        val year = myCal.get(Calendar.YEAR)
        val month = myCal.get(Calendar.MONTH)
        val day = myCal.get(Calendar.DAY_OF_MONTH)
        val dpd =DatePickerDialog(this,
            {_, selectedyear, selectedmonth, selectedDay ->
                Toast.makeText(this,"Year was $selectedyear",Toast.LENGTH_LONG).show()

                val selectedDate = "$selectedDay/${selectedmonth+1}/$selectedyear"

                tvSelectedDate?.text = selectedDate

                val sdf = SimpleDateFormat("dd/MM/yyyy",Locale.ENGLISH)
                val theDate = sdf.parse(selectedDate)
                theDate?.let{
                    val selectedDateInMin = theDate.time/60000

                    val currentDate = sdf.parse(sdf.format(System.currentTimeMillis()))
                    currentDate?.let{
                        val currentDateInMin = currentDate.time/60000

                        val MinSince = currentDateInMin-selectedDateInMin

                        tvAgeInMins?.text = MinSince.toString()
                    }


                }


            },
            year,month,day
        )
        dpd.datePicker.maxDate=System.currentTimeMillis()-86400000
        dpd.show()

        Toast.makeText(this,"Choose a Date",Toast.LENGTH_SHORT).show()
    }


}

