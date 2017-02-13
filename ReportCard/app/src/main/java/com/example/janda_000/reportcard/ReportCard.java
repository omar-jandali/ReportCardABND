package com.example.janda_000.reportcard;

/**
 * Created by janda_000 on 2/13/2017.
 */

public class ReportCard {

    private char rMathLetterGrade;
    private char rEnglishLetterGrade;
    private char rBiologyLetterGrade;
    private char rDataStructuresLetterGrade;
    private char rHistoryLetterGrade;

    public ReportCard(char MathLetterGrade, char EnglishLetterGrade, char BiologyLetterGrade,
                      char DataStructuresLetterGrade, char HistoryLetterGrade){

        rMathLetterGrade = MathLetterGrade;
        rEnglishLetterGrade = EnglishLetterGrade;
        rBiologyLetterGrade = BiologyLetterGrade;
        rDataStructuresLetterGrade = DataStructuresLetterGrade;
        rHistoryLetterGrade = HistoryLetterGrade;

    }

    public char getrMathLetterGrade(){
        return rMathLetterGrade;
    }

    public char getrEnglishLetterGrade(){
        return rEnglishLetterGrade;
    }

    public char getrBiologyLetterGrade(){
        return rBiologyLetterGrade;
    }

    public char getrDataStructuresLetterGrade(){
        return rDataStructuresLetterGrade;
    }

    public char getrHistoryLetterGrade(){
        return rHistoryLetterGrade;
    }

    public void setrMathLetterGrade(char MathLetterGrade){
        rMathLetterGrade = MathLetterGrade;
    }

    public void setrEnglishLetterGrade(char EnglishLetterGrade){
        rEnglishLetterGrade = EnglishLetterGrade;
    }

    public void setrBiologyLetterGrade(char BiologyLetterGrade){
        rBiologyLetterGrade = BiologyLetterGrade;
    }

    public void setrDataStructuresLetterGrade(char DataStructuresGrade){
        rDataStructuresLetterGrade = DataStructuresGrade;
    }

    public void setrHistoryLetterGrade(char HistoryLetterGrade){
        rHistoryLetterGrade = HistoryLetterGrade;
    }

    @Override
    public String toString(){
        return "Your Math Grade: " + getrMathLetterGrade() + "\n Your English Grade: " +
                getrEnglishLetterGrade() + "\n Your Biology Grade: " + getrBiologyLetterGrade() +
                "\n Your Data Structures Grade: " + getrDataStructuresLetterGrade() + "\n Your History Grade" +
                getrHistoryLetterGrade() + ".";
    }
}
