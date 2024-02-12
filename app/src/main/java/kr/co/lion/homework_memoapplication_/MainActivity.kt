package kr.co.lion.homework_memoapplication_

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val toolbarImage = findViewById<ImageView>(R.id.toolbar_image)

        toolbarImage.setOnClickListener {
            // 이미지 버튼 클릭 시 다음 XML로 이동하는 코드
            val intent = Intent(this, writeMemo::class.java)
            startActivity(intent)
        }
    }
}

