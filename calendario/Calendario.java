/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calendario;

/**
 *
 * @author 39334
 */
public class Calendario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        cal c=new cal(30,10,2003,"NO");
        c.setgiorno(30);
        c.setmese(10);
        c.setanno(2003);
        c.settipoAnno("no");
         c.getgiorno();
         c.getmese();
         c.getanno();
         c.annoBis();
         c.gettipoAnno();
    }
    
}
