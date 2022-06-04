package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("This is archive of MySQL stuff I learnt in 2022JuneLC");
        System.out.println("MovieSQL studio2022f4jun :-");
        System.out.println("=====++++++++++================\n" +
                "8:04 PM 6/2/2022\n" +
                "I created movies and directors in the correct schema\n" +
                " movie-buff;\n" +
                "\n" +
                "select * from movies;\n" +
                "1\tToy Story\t1995\t1\n" +
                "2\tThe Incredibles\t2004\t2\n" +
                "3\tMoney Monster\t2016\t3\n" +
                "4\tA Bug's Life\t1998\t1\n" +
                "5\tCrouching Tiger, Hidden Dragon\t2000\t4\n" +
                "6\tHarry Potter and the Prisoner of Azkaban\t2004\t5\n" +
                "7\tLittle Man Tate\t1991\t3\n" +
                "8\tRoma\t2018\t5\n" +
                "9\tThe Perfect Candidate\t2019\t10\n" +
                "10\tThe Shape of Water\t2017\t6\n" +
                "11\tThe Lord of the Rings: The Return of the King\t2003\t7\n" +
                "12\tA Wrinke in Time\t2018\t8\n" +
                "13\tWonder Woman\t2017\t9\n" +
                "14\tRatatouille\t2007\t2\n" +
                "15\tMary Shelley\t2017\t10\n" +
                "16\tSelma\t2014\t8\n" +
                "\t\t\t======================++++++++++++++++=====\n" +
                "\n" +
                "\n" +
                "select * from directors;\n" +
                "1\tJohn\tLasseter\tUSA\n" +
                "2\tBrad\tBird\tUSA\n" +
                "3\tJodie\tFoster\tUSA\n" +
                "4\tAng\tLee\tTaiwan\n" +
                "5\tAlfonso\tCuarón\tMexico\n" +
                "6\tGuillermo\tdel Toro\tMexico\n" +
                "7\tPeter\tJackson\tNew Zealand\n" +
                "8\tAva\tDuVernay\tUSA\n" +
                "9\tPatty\tJenkins\tUSA\n" +
                "10\tHaifaa\tal-Mansour\tSaudi Arabia\n" +
                "\t\t\t\n" +
                "=========++++===============\n" +
                "STUDIO 1.5.2.1 Movie SQLs\n" +
                "\n" +
                "1.5.2.1. Task List\n" +
                "Open up a new Query tab in MySQL Workbench. In that tab, write the SQL commands to carry out each of the queries described below. As you complete each step, compare your SQL code and the output with a partner.\n" +
                "\n" +
                "1) List just the titles of all the movies in the database.\n" +
                "\n" +
                "\n" +
                "select title from movies;\n" +
                "Toy Story\n" +
                "The Incredibles\n" +
                "Money Monster\n" +
                "A Bug's Life\n" +
                "Crouching Tiger, Hidden Dragon\n" +
                "Harry Potter and the Prisoner of Azkaban\n" +
                "Little Man Tate\n" +
                "Roma\n" +
                "The Perfect Candidate\n" +
                "The Shape of Water\n" +
                "The Lord of the Rings: The Return of the King\n" +
                "A Wrinke in Time\n" +
                "Wonder Woman\n" +
                "Ratatouille\n" +
                "Mary Shelley\n" +
                "Selma\n" +
                "========+++++================\n" +
                "\n" +
                "2) List the title and year of each movie in the database in\n" +
                " DESCENDING order of the year released. (Hint: Combine the\n" +
                " SELECT command with the ORDER BY keywords).\n" +
                "\n" +
                "select title,year_released from movies ORDER BY \n" +
                "year_released DESC;\n" +
                "\n" +
                "\n" +
                "The Perfect Candidate\t2019\n" +
                "Roma\t2018\n" +
                "A Wrinke in Time\t2018\n" +
                "The Shape of Water\t2017\n" +
                "Wonder Woman\t2017\n" +
                "Mary Shelley\t2017\n" +
                "Money Monster\t2016\n" +
                "Selma\t2014\n" +
                "Ratatouille\t2007\n" +
                "The Incredibles\t2004\n" +
                "Harry Potter and the Prisoner of Azkaban\t2004\n" +
                "The Lord of the Rings: The Return of the King\t2003\n" +
                "Crouching Tiger, Hidden Dragon\t2000\n" +
                "A Bug's Life\t1998\n" +
                "Toy Story\t1995\n" +
                "Little Man Tate\t1991\n" +
                "\n" +
                "===========++++++++++++++============\n" +
                "3)List all columns for all records of the directors table\n" +
                " in ASCENDING alphabetical order based on the director’s\n" +
                " country of origin.\n" +
                "\n" +
                "select * from directors order by country ASC;\n" +
                "5\tAlfonso\tCuarón\tMexico\n" +
                "6\tGuillermo\tdel Toro\tMexico\n" +
                "7\tPeter\tJackson\tNew Zealand\n" +
                "10\tHaifaa\tal-Mansour\tSaudi Arabia\n" +
                "4\tAng\tLee\tTaiwan\n" +
                "1\tJohn\tLasseter\tUSA\n" +
                "2\tBrad\tBird\tUSA\n" +
                "3\tJodie\tFoster\tUSA\n" +
                "8\tAva\tDuVernay\tUSA\n" +
                "9\tPatty\tJenkins\tUSA\n" +
                "\t\t\t..........................-.........\n" +
                "select country,first_name,last_name,director_id from directors order by country ASC;\n" +
                "\n" +
                "Mexico\tAlfonso\tCuarón\t5\n" +
                "Mexico\tGuillermo\tdel Toro\t6\n" +
                "New Zealand\tPeter\tJackson\t7\n" +
                "Saudi Arabia\tHaifaa\tal-Mansour\t10\n" +
                "Taiwan\tAng\tLee\t4\n" +
                "USA\tJohn\tLasseter\t1\n" +
                "USA\tBrad\tBird\t2\n" +
                "USA\tJodie\tFoster\t3\n" +
                "USA\tAva\tDuVernay\t8\n" +
                "USA\tPatty\tJenkins\t9\n" +
                "\t\t\t\n" +
                "==========++++++++++==========\n" +
                "4)ORDER BY can also consider multiple columns. List all\n" +
                " columns for all records of the directors table in \n" +
                "ASCENDING alphabetical order first by the director’s\n" +
                " country of origin and then by the director’s last name.\n" +
                "\n" +
                "select * from directors order by country ASC , \n" +
                "last_name ASC;\n" +
                "\n" +
                "5\tAlfonso\tCuarón\tMexico\n" +
                "6\tGuillermo\tdel Toro\tMexico\n" +
                "7\tPeter\tJackson\tNew Zealand\n" +
                "10\tHaifaa\tal-Mansour\tSaudi Arabia\n" +
                "4\tAng\tLee\tTaiwan\n" +
                "2\tBrad\tBird\tUSA\n" +
                "8\tAva\tDuVernay\tUSA\n" +
                "3\tJodie\tFoster\tUSA\n" +
                "9\tPatty\tJenkins\tUSA\n" +
                "1\tJohn\tLasseter\tUSA\n" +
                "\t\t\t\n" +
                "\n" +
                "select * from directors order by last_name;\n" +
                "10\tHaifaa\tal-Mansour\tSaudi Arabia\n" +
                "2\tBrad\tBird\tUSA\n" +
                "5\tAlfonso\tCuarón\tMexico\n" +
                "6\tGuillermo\tdel Toro\tMexico\n" +
                "8\tAva\tDuVernay\tUSA\n" +
                "3\tJodie\tFoster\tUSA\n" +
                "7\tPeter\tJackson\tNew Zealand\n" +
                "9\tPatty\tJenkins\tUSA\n" +
                "1\tJohn\tLasseter\tUSA\n" +
                "4\tAng\tLee\tTaiwan\n" +
                "\t\t\t\n" +
                "............-.................\n" +
                "\n" +
                "\n" +
                "========+++++==============\n" +
                "\n" +
                "5)\n" +
                "select country,first_name,last_name,director_id from directors order by country ASC;\n" +
                "select * from directors order by country ASC , last_name ASC;\n" +
                "select * from directors;\n" +
                "insert into directors (first_name,last_name,country) values (\"Rob\",\"Reiner\",\"USA\");\n" +
                "select * from directors;\n" +
                "select last_name,director_id from directors where first_name =\"Rob\" and last_name=\"Reiner\";\n" +
                "7)\n" +
                "select country,first_name,last_name,director_id from directors order by country ASC;\n" +
                "select * from directors order by country ASC , last_name ASC;\n" +
                "select * from directors;\n" +
                "insert into directors (first_name,last_name,country) values (\"Rob\",\"Reiner\",\"USA\");\n" +
                "select * from directors;\n" +
                "select last_name,director_id from directors where first_name =\"Rob\" and last_name=\"Reiner\";\n" +
                "\n" +
                "'1', 'Toy Story', '1995', '1'\n" +
                "'2', 'The Incredibles', '2004', '2'\n" +
                "'3', 'Money Monster', '2016', '3'\n" +
                "'4', 'A Bug\\'s Life', '1998', '1'\n" +
                "'5', 'Crouching Tiger, Hidden Dragon', '2000', '4'\n" +
                "'6', 'Harry Potter and the Prisoner of Azkaban', '2004', '5'\n" +
                "'7', 'Little Man Tate', '1991', '3'\n" +
                "'8', 'Roma', '2018', '5'\n" +
                "'9', 'The Perfect Candidate', '2019', '10'\n" +
                "'10', 'The Shape of Water', '2017', '6'\n" +
                "'11', 'The Lord of the Rings: The Return of the King', '2003', '7'\n" +
                "'12', 'A Wrinke in Time', '2018', '8'\n" +
                "'13', 'Wonder Woman', '2017', '9'\n" +
                "'14', 'Ratatouille', '2007', '2'\n" +
                "'15', 'Mary Shelley', '2017', '10'\n" +
                "'16', 'Selma', '2014', '8'\n" +
                "\n" +
                "AFTER insert :\n" +
                "1\tToy Story\t1995\t1\n" +
                "2\tThe Incredibles\t2004\t2\n" +
                "3\tMoney Monster\t2016\t3\n" +
                "4\tA Bug's Life\t1998\t1\n" +
                "5\tCrouching Tiger, Hidden Dragon\t2000\t4\n" +
                "6\tHarry Potter and the Prisoner of Azkaban\t2004\t5\n" +
                "7\tLittle Man Tate\t1991\t3\n" +
                "8\tRoma\t2018\t5\n" +
                "9\tThe Perfect Candidate\t2019\t10\n" +
                "10\tThe Shape of Water\t2017\t6\n" +
                "11\tThe Lord of the Rings: The Return of the King\t2003\t7\n" +
                "12\tA Wrinke in Time\t2018\t8\n" +
                "13\tWonder Woman\t2017\t9\n" +
                "14\tRatatouille\t2007\t2\n" +
                "15\tMary Shelley\t2017\t10\n" +
                "16\tSelma\t2014\t8\n" +
                "17\tThe Princess Bride\t1987\t13\n" +
                "\n" +
                "\n" +
                "==============++++++++++============\n" +
                "8). Use an INNER JOIN in your SQL command to display a list of movie titles, years released, and director last names.\n" +
                "\n" +
                "\n" +
                "select movies.title,movies.year_released,directors.last_name\n" +
                "from movies inner join directors on movies.director_id = directors.director_id \n" +
                "order by last_name ASC; \n" +
                "\n" +
                "\n" +
                "\n" +
                "The Perfect Candidate\t2019\tal-Mansour\n" +
                "Mary Shelley\t2017\tal-Mansour\n" +
                "The Incredibles\t2004\tBird\n" +
                "Ratatouille\t2007\tBird\n" +
                "Harry Potter and the Prisoner of Azkaban\t2004\tCuarón\n" +
                "Roma\t2018\tCuarón\n" +
                "The Shape of Water\t2017\tdel Toro\n" +
                "A Wrinke in Time\t2018\tDuVernay\n" +
                "Selma\t2014\tDuVernay\n" +
                "Money Monster\t2016\tFoster\n" +
                "Little Man Tate\t1991\tFoster\n" +
                "The Lord of the Rings: The Return of the King\t2003\tJackson\n" +
                "Wonder Woman\t2017\tJenkins\n" +
                "Toy Story\t1995\tLasseter\n" +
                "A Bug's Life\t1998\tLasseter\n" +
                "Crouching Tiger, Hidden Dragon\t2000\tLee\n" +
                "The Princess Bride\t1987\tReiner\n" +
                "\n" +
                "\n" +
                "===========++++++++++================\n" +
                "9)\n" +
                "\n" +
                "select movies.title,directors.first_name,directors.last_name\n" +
                "from movies inner join directors on movies.director_id = directors.director_id \n" +
                "order by last_name ASC; \n" +
                "The Perfect Candidate\tHaifaa\tal-Mansour\n" +
                "Mary Shelley\tHaifaa\tal-Mansour\n" +
                "The Incredibles\tBrad\tBird\n" +
                "Ratatouille\tBrad\tBird\n" +
                "Harry Potter and the Prisoner of Azkaban\tAlfonso\tCuarón\n" +
                "Roma\tAlfonso\tCuarón\n" +
                "The Shape of Water\tGuillermo\tdel Toro\n" +
                "A Wrinke in Time\tAva\tDuVernay\n" +
                "Selma\tAva\tDuVernay\n" +
                "Money Monster\tJodie\tFoster\n" +
                "Little Man Tate\tJodie\tFoster\n" +
                "The Lord of the Rings: The Return of the King\tPeter\tJackson\n" +
                "Wonder Woman\tPatty\tJenkins\n" +
                "Toy Story\tJohn\tLasseter\n" +
                "A Bug's Life\tJohn\tLasseter\n" +
                "Crouching Tiger, Hidden Dragon\tAng\tLee\n" +
                "The Princess Bride\tRob\tReiner\n" +
                "\n" +
                "\n" +
                "=================++++++++===============\n" +
                "\n" +
                "\n" +
                "11)\n" +
                "\n" +
                "select last_name, country\n" +
                "from directors\n" +
                "inner join movies \n" +
                "on movies.director_id=directors.director_id\n" +
                "where movies.title = \"Roma\";\n" +
                "Cuaro`n  Mexico\n" +
                "\n" +
                "===========++++++++++++++++=====\n" +
                "\n" +
                "\n");
    }
}
