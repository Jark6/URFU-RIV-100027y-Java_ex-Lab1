package com.example.testng_app;

public class Questions {
    private String question;
    private String[] answers;

    public Questions(String question, String[] answers) {
        this.question = question;
        this.answers = answers;
    }

    public String getQuestion() {
        return question;
    }

    public String correctAnswer(){
        return this.answers[answers.length-1];

    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String[] getAnswers() {
        return answers;
    }

    public void setAnswers(String[] answers) {
        this.answers = answers;
    }
}
