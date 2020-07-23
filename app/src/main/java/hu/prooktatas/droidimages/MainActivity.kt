package hu.prooktatas.droidimages

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.GridLayout
import android.widget.ImageView
import android.widget.LinearLayout

class MainActivity : AppCompatActivity() {

    private val icons = listOf("cupcake", "donut", "eclair", "froyo", "gingerbread",
            "honeycomb", "ics", "jelly_bean", "kit_kat", "lollipop",
            "marshmallow", "nougat", "oreo", "pie", "android_10")

    private lateinit var gridLayout: GridLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_2)

        gridLayout = findViewById(R.id.gridLayout)
        gridLayout.columnCount = 3
        gridLayout.rowCount = 5

        loadImages()
    }

//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//    }

    private fun loadImages() {

        icons.forEach {
            val resId = resources.getIdentifier(it, "drawable", packageName)
            val drawable = resources.getDrawable(resId)

            val iv = ImageView(this)
            iv.setImageDrawable(drawable)

            val params = LinearLayout.LayoutParams(IMAGE_DIMENSION, IMAGE_DIMENSION)
            iv.layoutParams = params

            gridLayout.addView(iv)

        }

    }
}

const val IMAGE_DIMENSION = 100     // 100dp