public class Decrypt{
  public static String Decrypt(String enc){
    int l = enc.length();
    char[] chara = new char[l];
    for (int i=0;i<l;i++){
      chara[i]=enc.charAt(i);
    }
    for (int j=0;j<l;j++){
      chara[j]=(char) (155 - (int) chara[j]); //(128+27)
    }
    return String.valueOf(chara);
  }
  
  public static void main(String[]args){
   String enc = args[0].toUpperCase();
   System.out.println("\n\""+enc+"\" after Decrypting = "+"\""+Decrypt(enc)+"\"\n");
  }
}

//words = YIFHHVOH<ZNHGVIWZN<UIZMPUFIG<SVZGSILD<AFIRXS