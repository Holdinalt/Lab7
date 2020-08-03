package test;

import businessLogic.dataBase.LoginManager;
import businessLogic.dataBase.dataBaseHandler;
import businessLogic.dataBase.dataBaseManager;
import businessLogic.factories.StudyGroupFactory;
import businessLogic.factories.Typer;
import businessLogic.sourseDate.Coordinates;
import businessLogic.sourseDate.StudyGroup;
import javafx.util.Pair;
import jdk.internal.org.objectweb.asm.Type;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;


public class AppTest{

    public static void main(String[] args) {
        //dataBaseHandler dbH = new dataBaseHandler("ssh");
        //dataBaseManager dataBaseManager = new dataBaseManager(dbH);
        //LoginManager lm = new LoginManager(dataBaseManager);
        //lm.register("login", "pass");
        //System.out.println(lm.passCheck("login", "pass"));

        StudyGroupFactory sgf = new StudyGroupFactory();
        StudyGroup stg = sgf.createStudyGroup();
        Pair<String, String> pair = (Pair<String, String>) stg.getEverything().get(8);
        System.out.println(pair.getValue());

        //Coordinates date = new Coordinates(1.0 , 1);
        //System.out.println(date.getClass().getTypeName());








    }




}
