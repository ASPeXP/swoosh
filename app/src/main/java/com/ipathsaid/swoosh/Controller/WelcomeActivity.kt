package com.ipathsaid.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import com.ipathsaid.swoosh.R
import kotlinx.android.synthetic.main.activity_welcome.*

class WelcomeActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

        getStartButton.setOnClickListener {
            val leagueIntent  = Intent(this,  LeagueActivity::class.java)
            startActivity(leagueIntent)
        }

    }
}
