package ma.projet.test;

import ma.projet.beans.Salle;
import ma.projet.service.SalleService;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        //test
        SalleService ss = new SalleService();

        ss.create(new Salle("A", "Salle 1"));
        ss.create(new Salle("B", "Salle 2"));
        ss.create(new Salle("C", "Salle 3"));
        ss.create(new Salle("D", "Salle 4"));

        System.out.println("La liste des salles :");
        for (Salle s : ss.findAll())
            System.out.println("\t" + s);

        System.out.println("Supprimer la salle avec id = 1");
        ss.delete(ss.findById(1));

        System.out.println("Modifier la salle avec id = 2");
        Salle salle = ss.findById(2);

        System.out.println("\tSalle à modifier : " + salle);

        Scanner sc = new Scanner(System.in);
        System.out.println("Donner le nouveau code :");
        salle.setCode(sc.nextLine());
        System.out.println("Donner le nouveau libelle :");
        salle.setLibelle(sc.nextLine());
        ss.update(salle);

        System.out.println("La liste des salles après les mises à jour :");
        for (Salle s : ss.findAll())
            System.out.println("\t" + s);

    }

}
//Source : www.exelib.net