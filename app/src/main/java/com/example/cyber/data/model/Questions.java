package com.example.cyber.data.model;

public class Questions
{
    private int question_1;
    private int question_2;

    public Questions(int question_1, int question_2)
    {
        super();

        this.question_1 = question_1;
        this.question_2 = question_2;
    }

    public Questions()
    {
        super();
    }

    public int getQuestion_1()
    {return question_1;}

    public int getQuestion_2()
    {return question_2;}
}