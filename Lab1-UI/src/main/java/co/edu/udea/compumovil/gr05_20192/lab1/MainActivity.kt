package co.edu.udea.compumovil.gr05_20192.lab1

import android.app.DatePickerDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.DatePicker
import android.widget.Spinner
import kotlinx.android.synthetic.main.personalinfo.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.personalinfo)

        val spinner : Spinner = findViewById<Spinner>(R.id.spiestudio)

        val calendario = Calendar.getInstance()
        val dia = calendario.get(Calendar.DAY_OF_MONTH)
        val mes = calendario.get(Calendar.MONTH)
        val anio= calendario.get(Calendar.YEAR)

        cambiar.setOnClickListener{
            val dpd = DatePickerDialog( this, android.R.style.Theme_Holo_Dialog, DatePickerDialog.OnDateSetListener{ view: DatePicker?, year: Int, month: Int, dayOfMonth: Int ->  fecha.setText(""+ dayOfMonth + "/" + month + "/" + year)}, anio, mes, dia)
            dpd.show()

            val arreglo = ArrayAdapter.createFromResource(this, R.array.opcion, android.R.layout.simple_spinner_item)


            spinner.adapter = arreglo

            siguiente.setOnClickListener {
                val intent: Intent = Intent(this, contacto::class.java)
                startActivity(intent)
            }

        }




    }
}
