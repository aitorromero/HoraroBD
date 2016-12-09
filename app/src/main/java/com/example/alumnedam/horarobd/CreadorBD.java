package com.example.alumnedam.horarobd;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class CreadorBD extends SQLiteOpenHelper {

    String[] sqlCreate = new String[3];
    String[] sqlInserts = new String[30];

    public CreadorBD(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqlCreate[0]= "CREATE TABLE PROFESSORS (id_prof INTEGER PRIMARY KEY, " +
                                                "nom_prof TEXT" +
                                                "cognom_prof TEXT)";

        sqlCreate[1]= "CREATE TABLE ASSIGNATURA (id_assig INTEGER PRIMARY KEY, " +
                "asig_M TEXT, " +
                "nom_assig TEXT, " +
                "id_prof INTEGER)";

        sqlCreate[2]= "CREATE TABLE HORARIS (id_horari INTEGER PRIMARY KEY, " +
                                            "grup TEXT, " +
                                            "codi_assig INTEGER, " +
                                            "hora_inici TEXT, " +
                                            "hora_fi TEXT, " +
                                            "dia_setmana TEXT, )";

        sqlInserts[0]="INSERT INTO PROFESSORS VALUES(1, 'Jorge', 'Rubio Peris')," +
                                                    "(2, 'Josefa', 'Gonzalez')," +
                                                    "(3, 'Jose Antonio Leo', 'Megias')," +
                                                    "(4, 'Lluis Maria', 'Perpiña')," +
                                                    "(5, 'Marta', 'Planas')";

        sqlInserts[1]="INSERT INTO ASSIGNATURA VALUES (1, 'M02/M05/M06', 'Cosas chulis de programación', 1)," +
                                                        "(2, 'M03', 'Programació orientada a objectes', 2)," +
                                                        "(3, 'M07', 'Desenvolupament de interfícies(PHP)', 3)," +
                                                        "(4, 'M08', 'Desenvolupament d'aplicacions per dispositius mòbils', 4)," +
                                                        "(5, 'M09', 'Processos i fills chachis', 1)," +
                                                        "(6, 'M10', 'Los buenos ERP-CRM ricos ricos', 5)," +
                                                        "(7, 'MPatio', 'Patio siiiii', NULL)";

        sqlInserts[2]="INSERT INTO HORARIOS VALUES (1, 'A1', 5, '15:00:00', '15:59:59', 4),"+
                                                    "(2, 'A1', 4, '16:00:00', '16:59:59', 4),"+
                                                    "(3, 'A1', 4, '17:00:00', '17:59:59', 4),"+
                                                    "(4, 'A1', 7, '18:00:00', '18:19:59', 4),"+
                                                    "(5, 'A1', 1, '18:20:00', '19:19:59', 4),"+
                                                    "(6, 'A1', 1, '19:20:00', '20:19:59', 4),"+
                                                    "(7, 'A1', 1, '20:20:00', '21:19:59', 4)";

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
