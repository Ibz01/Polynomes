public class Polynome{
  private ListeChainee lMonomes;
  public Polynome(){
   lMonomes=new ListeChainee();
  }

public Polynome addPolynome(Polynome polArg){
  Polynome polResu=new Polynome();
  lMonomes.razCourant();
  Monome monoThis,monoArg;
  int expoThis,expoArg;
  while (lMonomes.getCourant()!=null && polArg.lMonomes.getCourant!=null){
    monoThis=(Monome)lMonomes.getCourant();
    monoArg=(Monome)lMonomes.getContenuCourant();
    expoThis=monoThis.getExp();
    expoArg=monoArg.getExp();
    if(expoThis==expoArg){
      //try{
        polyResu.lMonomes.ajouteQueue(monoThis.addMonome(monoArg));
        lMonomes.suivant();
        polArg.lMonomes.suivant();
      //}
    }
    else if(expoThis>expoArg){
      polResu.lMonomes.ajouteQueue(new Monome(monoArg));
      polArg.lMonomes.suivant();
    }
  }
  while(lMonomes.getCourant()!=null){
    monoThis=(Monome)lMonomes.getContenuCourant();
    polResu.lMonomes.ajouteQueue(new Monome(monoArg));
    polArg.lMonomes.suivant();
  }
}


}
