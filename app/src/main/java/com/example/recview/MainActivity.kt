package com.example.recview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.LinearLayout
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recview.adapter.RecycleViewAdapter
import com.example.recview.model.ItemElements
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(),RecycleViewAdapter.OnItemClickedListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val list = listOf(
            ItemElements(R.drawable.ic_baseline_beach_access_24,resources.getString(R.string.title),resources.getString(R.string.text)),
            ItemElements(R.drawable.ic_baseline_beach_access_24,resources.getString(R.string.title),resources.getString(R.string.text)),
            ItemElements(R.drawable.ic_baseline_beach_access_24,resources.getString(R.string.title),resources.getString(R.string.text)),
            ItemElements(R.drawable.ic_baseline_beach_access_24,resources.getString(R.string.title),resources.getString(R.string.text)),
            ItemElements(R.drawable.ic_baseline_beach_access_24,resources.getString(R.string.title),resources.getString(R.string.text)),
            ItemElements(R.drawable.ic_baseline_beach_access_24,resources.getString(R.string.title),resources.getString(R.string.text)),
            ItemElements(R.drawable.ic_baseline_beach_access_24,resources.getString(R.string.title),resources.getString(R.string.text)),
            ItemElements(R.drawable.ic_baseline_beach_access_24,resources.getString(R.string.title),resources.getString(R.string.text)),
            ItemElements(R.drawable.ic_baseline_beach_access_24,resources.getString(R.string.title),resources.getString(R.string.text)),
            ItemElements(R.drawable.ic_baseline_beach_access_24,resources.getString(R.string.title),resources.getString(R.string.text)),
            ItemElements(R.drawable.ic_baseline_beach_access_24,resources.getString(R.string.title),resources.getString(R.string.text)),
            ItemElements(R.drawable.ic_baseline_beach_access_24,resources.getString(R.string.title),resources.getString(R.string.text)),
            ItemElements(R.drawable.ic_baseline_beach_access_24,resources.getString(R.string.title),resources.getString(R.string.text))

        )

        val adapter= RecycleViewAdapter(list,this)
        recyclerView.layoutManager=LinearLayoutManager(this)
        recyclerView.adapter = adapter
    }

    override fun onItemClicked(item: ItemElements, position: Int) {
        intent = Intent(this, MainActivity2::class.java)
        intent.putExtra("title",item.title)
        startActivity(intent)

       // Toast.makeText(this,item.title,Toast.LENGTH_LONG).show()
    }
}