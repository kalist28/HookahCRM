package ru.kalistratov.core.app.entity

import ru.kalistratov.screen.main.MainComponent

sealed interface AppScreen {
    data class Main(val component: MainComponent) : AppScreen
}