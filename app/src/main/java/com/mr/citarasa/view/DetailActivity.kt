package com.mr.citarasa.view

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.AppCompatActivity
import com.mr.citarasa.R

class DetailActivity : AppCompatActivity() {

    companion object {
        const val FOOD_NAME = "food_name"
        const val FOOD_DESC = "food_desc"
        const val FOOD_PLACE = "food_place"
        const val FOOD_CALORIES = "food_calories"
        const val FOOD_FAT = "food_fat"
        const val FOOD_CARBO = "food_carbo"
        const val FOOD_PROTEIN = "food_protein"
        const val FOOD_INGREDIENT = "food_ingredient"
        const val FOOD_RECIPE = "food_recipe"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        (supportActionBar as ActionBar).title = intent.getStringExtra(FOOD_NAME)
        (supportActionBar as ActionBar).setDisplayHomeAsUpEnabled(true)

        val descriptionReceive: TextView = findViewById(R.id.textViewDetailFoodDescription)
        val foodPlaceReceive: TextView = findViewById(R.id.textViewDetailFoodPlace)
        val foodCaloriesReceive: TextView = findViewById(R.id.textViewDetailCalories)
        val foodFatReceive: TextView = findViewById(R.id.textViewDetailFat)
        val foodCarboReceive: TextView = findViewById(R.id.textViewDetailCarbo)
        val foodProteinReceive: TextView = findViewById(R.id.textViewDetailProtein)
        val foodIngredientReceive: TextView = findViewById(R.id.textViewDetailIngredients)
        val foodRecipeReceive: TextView = findViewById(R.id.textViewDetailRecipe)
        val photo: ImageView = findViewById(R.id.imgDetailPhoto)

        val bundle: Bundle = intent.extras
        val resultPhoto = bundle.getInt("food_photo")

        foodPlaceReceive.text = intent.getStringExtra(FOOD_PLACE)
        descriptionReceive.text = intent.getStringExtra(FOOD_DESC)
        foodCaloriesReceive.text = intent.getStringExtra(FOOD_CALORIES)
        foodFatReceive.text = intent.getStringExtra(FOOD_FAT)
        foodCarboReceive.text = intent.getStringExtra(FOOD_CARBO)
        foodProteinReceive.text = intent.getStringExtra(FOOD_PROTEIN)
        foodIngredientReceive.text = intent.getStringExtra(FOOD_INGREDIENT)
        foodRecipeReceive.text = intent.getStringExtra(FOOD_RECIPE)

        photo.setImageResource(resultPhoto)

    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}
