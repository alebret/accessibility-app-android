package fr.ippon.accessibilityapptutorial

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.ObservableField
import fr.ippon.accessibilityapptutorial.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private var congratulation = ObservableField<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.congrat = congratulation

        binding.apply {
            icValid.setOnClickListener {
                if (radioButtonYes.isChecked) congratulation.set("On est d'accord, le fromage c'est la vie !")
                else if (radioButtonNo.isChecked) congratulation.set("C'est nul")
                else congratulation.set("Tu n'as pas répondu")
            }

            icCancel.setOnClickListener {
                congratulation.set("")
            }
        }
    }
}