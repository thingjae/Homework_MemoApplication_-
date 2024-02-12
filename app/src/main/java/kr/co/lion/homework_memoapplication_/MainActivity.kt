package kr.co.lion.homework_memoapplication_

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import kr.co.lion.homework_memoapplication_.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var activityMainBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        activityMainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(activityMainBinding.root)
        val toolbarImage: ImageView = findViewById(R.id.toolbar_image)

        toolbarImage.setOnClickListener {
            // 이미지뷰를 클릭했을 때 다음 액티비티로 이동
            startActivity(Intent(this@MainActivity, writeMemo::class.java))
        }
    }
}
