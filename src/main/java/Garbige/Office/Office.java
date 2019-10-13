package Garbige.Office;

	/*
	Secretary secretary;
	Director director;
	Hr hr;
	*/

//претенденты идут по одному, когда их достаточно,
// то диретор принимает решение и берет одного в штат

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Office {
        public void concurence(ArrayList<Secretary> empl){
            System.out.println("Office start");
            int count = 0;
            System.out.println(empl.size());
            Director director = new Director();
            HashSet<Secretary> sec = new HashSet<>();
            Iterator<Secretary> iterator = empl.iterator();

            while (sec.size() < 11){

                System.out.println("Отправка кандидата к директору № " + count);
                iterator.hasNext();
               director.choice(iterator.next());
                count ++;
            }
        }



    }



