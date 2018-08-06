package com.ipathsaid.swoosh.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.ipathsaid.swoosh.Model.Player
import com.ipathsaid.swoosh.R
import com.ipathsaid.swoosh.Utilities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        val player = intent.getParcelableExtra<Player>(EXTRA_PLAYER)

val league = player.league
        val skill = player.skill

        searchLeagueText.text = "Looking for $league $skill near you..."
    }
}
