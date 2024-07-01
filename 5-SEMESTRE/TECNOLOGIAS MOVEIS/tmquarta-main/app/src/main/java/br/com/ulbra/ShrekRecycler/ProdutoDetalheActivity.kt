package br.com.ulbra.ShrekRecycler

import android.annotation.SuppressLint
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.Toolbar
import br.com.ulbra.exemplorecycler.R
import br.com.ulbra.ShrekRecycler.data.Product
import com.bumptech.glide.Glide

@Suppress("DEPRECATION")
class ProdutoDetalheActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_produto_detalhe)

        val toolbar = findViewById<Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)


        supportActionBar?.apply {
            setDisplayHomeAsUpEnabled(true)
            title = "Detalhe"
        }

        val productBundle = if (Build.VERSION.SDK_INT >= 33) {
            intent?.getSerializableExtra("data", Product::class.java)
        } else {
            intent?.getSerializableExtra("data") as? Product
        }

        val productName = findViewById<TextView>(R.id.tvProductName)
        val productPrice = findViewById<TextView>(R.id.tvProductPrice)
        val productImg = findViewById<ImageView>(R.id.imgProduct)



        productName.text = productBundle?.name
        productPrice.text = productBundle?.price

        Glide
            .with(this)
            .load(productBundle?.urlImage)
            .into(productImg)
    }

    override fun onSupportNavigateUp(): Boolean {
        finish()
        return true
    }

}