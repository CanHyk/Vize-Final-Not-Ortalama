package can.hoyuk.vizefinalnotortalama

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import can.hoyuk.vizefinalnotortalama.databinding.ActivityMainBinding
import kotlin.random.Random


class MainActivity : AppCompatActivity() {
    lateinit var  binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.hesapb.setOnClickListener {

                if (binding.vizet.text.isNotEmpty() && binding.finalt.text.isNotEmpty()) {
                    var vize = binding.vizet.text.toString().toDouble()
                    var final = binding.finalt.text.toString().toDouble()
                    var ortalama: Double = ((vize * 0.4) + (final * 0.6))
                      if (ortalama >=60) {
                        binding.sonuct.text = ortalama.toString()+" \n"+"Geçtiniz"
                        binding.sonuct.setTextColor(getColor(R.color.green))
                            if(ortalama>100){
                                binding.sonuct.text="100"
                             }else
                                     if (ortalama<0){
                                binding.sonuct.text="0"
                                }
                         }else
                                 if(ortalama<60){
                             binding.sonuct.text = ortalama.toString()+" \n"+"Kaldınız"
                             binding.sonuct.setTextColor(getColor(R.color.red))
                         }

                 } else {
                      binding.sonuct.text="Sınav Notunuzu Giriniz"
                      binding.sonuct.setTextColor(getColor(R.color.red))
                 }
            }
        }
}
