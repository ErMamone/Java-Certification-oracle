/*
* The Learn Programming Academy Java SE 11 Dev 1Z0-819 OCP Course - Part 1
* Section 2: create an class in a package
*
* java -cp directory = execute .class what do u want (main in this case)
*
* javac -d build directory.java = compile the .java what do u want and move thata .class to the folder in first parameter
*
* javac -d directory.java = compile the .java file and put the .class file into .java folder
*
*
*
*
* Referecing a type from another package.
* A Fully Qualified Class Name (FQCN)                    java.util.ArrayList = new java.util.ArrayList();
* A single-type-import declaration                       (in top) import java.util.ArrayList ..... (use) ArrayList list = new ArrayList();
* A type-import-on-demand declaration                    same as previous but: import java.util.*
* A single-static-import declaration                     import static java.lang.Math.PI;
* A static-import-on-demand declaration                  import static java.lang.Math.*
*/
package garden.vegetable;

public class VineVegetable {

    //Main Method simply outputs some data
    public static void main(String[] args){
        System.out.println("Im a vegetable that grows on a vine.");
    }

}
