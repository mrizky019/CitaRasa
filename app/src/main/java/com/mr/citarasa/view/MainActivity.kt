package com.mr.citarasa.view

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.mr.citarasa.R
import com.mr.citarasa.adapter.ListFoodAdapter
import com.mr.citarasa.model.Food
import com.mr.citarasa.model.FoodData
import org.jetbrains.anko.intentFor
import org.jetbrains.anko.startActivity
import java.util.*

class MainActivity : AppCompatActivity() {

    private lateinit var rvFood: RecyclerView
    private var list: ArrayList<Food> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvFood = findViewById(R.id.recyclerViewFoods)
        rvFood.setHasFixedSize(true)

        list.addAll(FoodData.listData)
        showRecyclerList()
    }

    private fun showRecyclerList() {
        rvFood.layoutManager = LinearLayoutManager(this)
        val listFoodAdapter = ListFoodAdapter(list)
        rvFood.adapter = listFoodAdapter

        listFoodAdapter.setOnItemClickCallback(object : ListFoodAdapter.OnItemClickCallback {
            override fun onItemClicked(data: Food) {
                showSelectedFood(data)
            }
        })
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.profile, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        startActivity<ProfileActivity>()
        return super.onOptionsItemSelected(item)
    }

    private fun showSelectedFood(food: Food) {
        startActivity(intentFor<DetailActivity>(
            "food_name" to food.name,
            "food_desc" to food.description,
            "food_place" to food.place,
            "food_photo" to food.photo,
            "food_calories" to food.cal,
            "food_fat" to food.fat,
            "food_carbo" to food.carb,
            "food_protein" to food.protein,
            "food_ingredient" to food.ingredient,
            "food_recipe" to food.recipe
        ))
    }
}
