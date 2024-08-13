package app.komatsuzaki.kotori.album

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import app.komatsuzaki.kotori.album.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    // バインディングクラスの変数
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater).apply { setContentView(this.root) }

        // プレビュー画面に情報を送る変数を準備する
        val preview = Intent(this, PreviewActivity::class.java)

        // 海の写真がタップされた時
        binding.albumImage1.setOnClickListener {

            //海の写真をセットする
            preview.putExtra("image",R.drawable.sea_image)
            //タイトルをセットする
            preview.putExtra("title","海")
            //プレビュー画面に送る
            startActivity(preview)
        }

        // ねこの写真がタップされた時
        binding.albumImage2.setOnClickListener {
            //海の写真をセットする
            preview.putExtra("image",R.drawable.cat_image)
            //タイトルをセットする
            preview.putExtra("title","ねこ")
            //プレビュー画面に送る
            startActivity(preview)
        }

        // 犬の写真がタップされた時
        binding.albumImage3.setOnClickListener {
            // 犬の写真をセットする
            preview.putExtra("image",R.drawable.dog_image)
            //タイトルをセットする
            preview.putExtra("title","犬")
            //プレビュー画面に送る
            startActivity(preview)
        }

        //ケーキの写真がタップされた時
        binding.albumImage4.setOnClickListener {
            preview.putExtra("image",R.drawable.cake_image)

            preview.putExtra("title","ケーキ")

            startActivity(preview)
        }

        //夜景の写真がタップされた時
        binding.albumImage5.setOnClickListener {
            preview.putExtra("image",R.drawable.night_image)

            preview.putExtra("title","夜景")

            startActivity(preview)
        }

        //花の写真がタップされた時
        binding.albumImage6.setOnClickListener {
            preview.putExtra("image",R.drawable.flower_image)

            preview.putExtra("title","はな")

            startActivity(preview)
        }
    }
}