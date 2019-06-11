package com.evans.shop

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.LinearLayoutManager
import android.view.Menu
import android.view.MenuItem
import com.evans.shop.adapter.ProductsAdapter
import com.evans.shop.model.Product

import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.content_main.*
import kotlinx.android.synthetic.main.product_row.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        val products = arrayListOf<Product>()
        for (i in 0..100){
            products.add(Product("A text", "https://static.wixstatic.com/media/81512a_ab9fdf7159864a36bbee77a4f6ac48b5~mv2.png/v1/fill/w_489,h_693,al_c/81512a_ab9fdf7159864a36bbee77a4f6ac48b5~mv2.png", 1.99))
        }

        recycler_view.apply {
            layoutManager = GridLayoutManager(this@MainActivity, 2)
            adapter = ProductsAdapter(products)
        }
    }

}
