package me.project.imdbcollector

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import me.project.imdbcollector.presentation.MainView
import moxy.MvpAppCompatActivity
import moxy.presenter.InjectPresenter

class MainActivity : MvpAppCompatActivity(), MainView {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}