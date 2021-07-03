package com.rsschool.quiz.`data-base`

import java.io.Serializable

class Questions {
    val data = arrayOf(
        Question(
            0,
            "Куда идет Винни-Пух?",
            0,
            arrayOf("В гости","В бар","По бабам", "Смотреть лекцию лучшего лектора в RS", "Никуда он не идет", "Никуда он не идет"),
        ),
        Question(
            1,
            "Кто такой Винни-Пух?",
            0,
            arrayOf("Мишка","Зайчик","Крендель", "Свинья", "Президент"),
        ),
        Question(
            2,
            "Чего не хватало ослику для счастья?",
            1,
            arrayOf("Ушей","Хвоста","Очков", "Тяночки", "Мёду"),
        ),
        Question(
            3,
            "Кто лучший стрелок всех времен и народов?",
            3,
            arrayOf("Пчела","Лунтик","Винни-Пух", "Пятачок", "Кар-Карыч"),
        ),
        Question(
            4,
            "А что вы делаету у меня в холодильнике???????",
            3,
            arrayOf("Ем","Живу","Зимую", "Готовлюсь к жизни Android-developer", "ЭТО МОЙ ХОЛОДИЛЬНИК"),
        ),
    )
}

data class Question (
    val number:Int,
    val Question: String,
    val corret: Int,
    val answers: Array<String>,
    var answer: Int? = null,
): Serializable