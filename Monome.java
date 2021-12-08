public class Monome{
  private double coef;
  private int exp;

  public Monome(){
    coef=0;
    exp=0;
  }

  public Monome(double c, int e){
    coef=c;
    exp=e;
  }

  public Monome(Monome m){
    this.setCoef(m.getCoef());
    this.setExp(m.getExp());
  }

  public double getCoef(){
    return coef;
  }

  public void setCoef(double c){
    coef=c;
  }

  public int getExp(){
    return exp;
  }

  public void setExp(int e){
    exp=e;
  }

  public double valeur(double x){
    return coef*Math.pow(x,exp);
  }

  public Monome multMonome(Monome m){
    double c=this.getCoef()*m.getCoef();
    int e=this.getExp()+m.getExp();
    Monome res=new Monome(c,e);
    return res;
  }

/*Exceptions
  public Monome addMonome(Monome m)throws MonomeException{
    if(this.exp!=m.exp){
      throw new MonomeException("exposants différents, addition impossible");
    }
    else{
      return new Monome(this.coef+m.coef,m.exp);
    }
  }
*/

  public String toString(){
    String res="";
    res=res + coef +" x^"+exp;
    return res;
  }

}
