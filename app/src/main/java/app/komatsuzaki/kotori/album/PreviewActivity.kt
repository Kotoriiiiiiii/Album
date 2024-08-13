package app.komatsuzaki.kotori.album

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import app.komatsuzaki.kotori.album.databinding.ActivityPreviewBinding

class PreviewActivity : AppCompatActivity() {

    // バインディングクラスの変数
    private lateinit var binding: ActivityPreviewBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPreviewBinding.inflate(layoutInflater).apply{ setContentView(this.root) }

        //　前の画像から写真を受け取る
        val imageId = intent.getIntExtra("image", 0)

        //　前の画面からタイトルを受け取る
        val displayTitle = intent.getStringExtra("title")

        // 受け取った写真をセット
        binding.previewImage.setImageResource(imageId)

        // 受け取ったタイトルをセット
        binding.titleText.text = displayTitle

        // 戻るボタンがタップされた時
        binding.backButton.setOnClickListener {
            //画面を閉じる
            finish()
        }
    }
}