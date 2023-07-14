package com.appmob.quiz;

public class QuesitionsItem {
    String quesitions, answer1, ansewer2,answer3,answer4, correct;

    public QuesitionsItem(String quesitions, String answer1, String ansewer2, String answer3, String answer4, String correct) {
        this.quesitions = quesitions;
        this.answer1 = answer1;
        this.ansewer2 = ansewer2;
        this.answer3 = answer3;
        this.answer4 = answer4;
        this.correct = correct;
    }
    public String getQuesitions() {
        return quesitions;
    }

    public void setQuesitions(String quesitions) {
        this.quesitions = quesitions;
    }

    public String getAnswer1() {
        return answer1;
    }

    public void setAnswer1(String answer1) {
        this.answer1 = answer1;
    }

    public String getAnsewer2() {
        return ansewer2;
    }

    public void setAnsewer2(String ansewer2) {
        this.ansewer2 = ansewer2;
    }

    public String getAnswer3() {
        return answer3;
    }

    public void setAnswer3(String answer3) {
        this.answer3 = answer3;
    }

    public String getAnswer4() {
        return answer4;
    }

    public void setAnswer4(String answer4) {
        this.answer4 = answer4;
    }

    public String getCorrect() {
        return correct;
    }

    public void setCorrect(String correct) {
        this.correct = correct;
    }
}
