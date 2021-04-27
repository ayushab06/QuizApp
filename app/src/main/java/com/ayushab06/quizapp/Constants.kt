package com.ayushab06.quizapp

object Constants {
    fun getQuestions(): ArrayList<Question> {
        val questionsList = ArrayList<Question>()

        val question1 = Question(
            1,
            "Can you name this very intelligent gentleman?",
            "Albert Einstein",
            "Nikola Tesla",
            "Thomas Edison",
            "None of the above",
            1
        )
        questionsList.add(question1)

        val question2 = Question(
            1,
            " What is this massive copper sculpture called?",
            "Roman Sculpture",
            "Statue Of Liberty ",
            "Mahatma Gandhi",
            "None Of the above",
            2
        )
        questionsList.add(question2)

        val question3 = Question(
            1,
            "Can you name the sport",
            "Badminton",
            "Cricket",
            "Tennis",
            "Table Tennis",
            1
        )
        questionsList.add(question3)

        val question4 = Question(
            1,
            "What is the name of this tower?",
            "Eiffel Tower",
            "Tokyo Tower",
            "Steel Tower",
            "None Of the above",
            1
        )
        questionsList.add(question4)

        val question5 = Question(
            1,
            "Who is the figure in this colossal sculpture?",
            "Abraham Lincoln",
            "Nelson Mandela",
            "Borris Johnson",
            "None of the above",
            1
        )
        questionsList.add(question5)
        return questionsList
    }
}