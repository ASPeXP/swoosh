package com.ipathsaid.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.ipathsaid.swoosh.Model.Player
import com.ipathsaid.swoosh.R
import com.ipathsaid.swoosh.Utilities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : BaseActivity() {

    lateinit var player : Player

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        player = intent.getParcelableExtra(EXTRA_PLAYER)


    }

    fun onSkillFinishClicked(view: View){
        if (player.skill != "") {
            val finishActivity = Intent(this, FinishActivity::class.java)
            finishActivity.putExtra(EXTRA_PLAYER, player )
            startActivity(finishActivity)
        }else {
            Toast.makeText(this,"Please select a skill first", Toast.LENGTH_SHORT).show()


        }
    }

    fun onBallerClicked(view: View ){
        beginnerSkillBtn.isChecked = false
        player.skill = "baller"
    }

    fun onBeginnerClicked(view: View ){
        ballerSkillBtn.isChecked = false
        player.skill = "beginner"

    }
}
