package com.aaron.chap03.lec13

class House(
    private val address: String,
    private val livingRoom: LivingRoom,
) {
    class LivingRoom(
        private var area: Double,
    ) {
    }
}