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
public class cal {
    private int giorno;
    private int mese;
    private int anno;
    private String tipoAnno;
    
    public cal(int g,int m,int a,String t)
    {
        giorno=g;
        mese=m;
    anno=a;
    tipoAnno=t;
    }
    public String annoBis()
    {
    tipoAnno="NO";
    int annoCor=this.getanno();
    if(annoCor % 400==0){
    System.out.println("anno bisestile");
    tipoAnno="bisestile";
    }
   else if(annoCor % 4==0)
    {
        if(annoCor % 100 != 0){
    System.out.println("anno bisestile");
    tipoAnno="bisestile";
        }
    }
    return tipoAnno;
    }
    public int getanno(){
    return anno;
    }
    public int getmese(){
    return mese;
    }
    public int getgiorno(){
    return giorno;
    }
    public String gettipoAnno()
    {
    return tipoAnno;
    }
    public void setanno(int a){
     anno=a;
    }
    public void setmese(int m){
     if(m>=1 && m<13){
        mese=m;
     }
     else{
     System.out.println("mese inesistente");
     }
    }
    public void setgiorno(int g){
        if(mese==1 || mese==3 || mese==5 || mese==7 || mese==8 || mese==10 || mese==12){
            if(g>=1 && g<32)
            {
             giorno=g;
            }
            else{
            System.out.println("giorno non valido");
            }
        }
        else if(mese==4 || mese==6 || mese==9|| mese==11 ){
        if(g>=1 && g<31){
         giorno=g;
        }
        else{
        System.out.println("giorno non valido");
        }
        }
   else if(mese==2)
    {
    if(this.annoBis()=="bisestile")
    {
    if(g>=1 && g<30){
     giorno=g;
    }
    else{
    System.out.println("giorno non valido");
    }
    }
    else{
    if(g>=1 && g<29)
    {
     giorno=g;
    }
    else{
    System.out.println("giorno non valido");
    }
    }
    }
     
    }
    public void settipoAnno(String t)
    {
    tipoAnno=t;
    }
    public void data(){
    System.out.println("giorno:"+giorno+",mese:"+mese+",anno:"+anno);
    }
}
