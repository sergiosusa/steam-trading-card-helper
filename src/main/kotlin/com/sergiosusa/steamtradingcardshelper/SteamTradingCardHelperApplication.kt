package com.sergiosusa.steamtradingcardshelper

import javafx.application.Application
import javafx.fxml.FXMLLoader
import javafx.scene.Scene
import javafx.stage.Stage

class SteamTradingCardHelperApplication : Application() {
    override fun start(stage: Stage) {
        val fxmlLoader = FXMLLoader(SteamTradingCardHelperApplication::class.java.getResource("hello-view.fxml"))
        val scene = Scene(fxmlLoader.load(), 600.0, 400.0)
        stage.title = "Steam Trading Card Helper"
        stage.scene = scene
        stage.show()
    }
}

fun main() {
    Application.launch(SteamTradingCardHelperApplication::class.java)
}