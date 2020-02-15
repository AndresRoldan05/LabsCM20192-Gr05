package co.edu.udea.compumovil.gr05_20192.lab1

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import androidx.appcompat.app.AppCompatActivity

class contacto : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.contactinfo)


        var pais = findViewById <AutoCompleteTextView>(R.id.paises)
        val countries = resources.getStringArray(R.array.countries_array)

        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, countries)
        pais.setAdapter(adapter)


        val ciudad = findViewById<AutoCompleteTextView>(R.id.ciudad)
        val capital = resources.getStringArray(R.array.ciudades)
        val adapter2 = ArrayAdapter(this, android.R.layout.simple_list_item_1, capital)
        ciudad.setAdapter(adapter2)


    }
}