public class Caixa2 {
    private String codigo;
    private int numero;
    private String endereco;
    private String cidade;
    private String estado;
    private Bandeja bandejas[] = new Bandeja[4];
    
    
public  Caixa2(String codigo, int numero, String endereco, String cidade, String estado, Bandeja b1, Bandeja b2, Bandeja b3, Bandeja b4 ){
    
    this.codigo = codigo;
    this.numero = numero;
    this.endereco = endereco;
    this.cidade = cidade;
    this.estado = estado;
    this.bandejas[0] = b1;
    this.bandejas[1] = b2;
    this.bandejas[2] = b3;
    this.bandejas[3] = b4;
    

}

public double saldo(){
    double x = 0;
    
    for(int i=0; i<4; i++){
     x+= (bandejas[i].getvalorDeFace() * bandejas[i].getquantidadedeCedula());
    }
    return x;
}
public double saldoDaBandeja(int b){
    return (bandejas[b].getvalorDeFace() * bandejas[b].getquantidadedeCedula());
}

public double[][] sacar(int valor){
    double cedulas[][] = new double[4][2];
    int resto = valor%100;
    
    if(((valor%100) == 0)&&((valor/100)<=bandejas[0].getquantidadedeCedula())){

        cedulas[0][0] = bandejas[0].getvalorDeFace();
        cedulas[0][1] = (valor/bandejas[0].getvalorDeFace());
        bandejas[0].setquantidadedeCedula(bandejas[0].getquantidadedeCedula()-(valor/100));
        valor = 0;

                }
    else if((((valor-resto)%100) == 0)&&((valor/100)<=bandejas[0].getquantidadedeCedula())){
        
        valor-=resto;
        cedulas[0][0] = bandejas[0].getvalorDeFace();
        cedulas[0][1] = (valor/bandejas[0].getvalorDeFace());
        bandejas[0].setquantidadedeCedula(bandejas[0].getquantidadedeCedula()-(valor/100));
        valor = resto;
    }
    else{
        cedulas[0][0] = 100.0;
        cedulas[0][1] = 0;
    }
    if(((valor%50)==0)&&((valor/50)<=bandejas[1].getquantidadedeCedula())){
       
        cedulas[1][0] = bandejas[1].getvalorDeFace();
        cedulas[1][1] = (valor/bandejas[1].getvalorDeFace());
        bandejas[1].setquantidadedeCedula(bandejas[1].getquantidadedeCedula()-(valor/50));
        valor =0;
        
    }
    else if((((valor-resto)%50) == 0)&&((valor/50)<=bandejas[1].getquantidadedeCedula())){
        
        valor-=resto;
        cedulas[1][0] = bandejas[1].getvalorDeFace();
        cedulas[1][1] = (valor/bandejas[1].getvalorDeFace());
        bandejas[1].setquantidadedeCedula(bandejas[1].getquantidadedeCedula()-(valor/50));
        valor = resto;
        
    }
    else{
        cedulas[1][0] = 50.0;
        cedulas[1][1] = 0;
    }
    if(((valor%20)==0)&&((valor/20)<=bandejas[2].getquantidadedeCedula())){
       
        cedulas[2][0] = bandejas[2].getvalorDeFace();
        cedulas[2][1] = (valor/bandejas[2].getvalorDeFace());
        bandejas[2].setquantidadedeCedula(bandejas[2].getquantidadedeCedula()-(valor/20));
        valor = 0;
       
    }
    else if((((valor-resto)%20) == 0)&&((valor/20)<=bandejas[2].getquantidadedeCedula())){
        
        valor-=resto;
        cedulas[2][0] = bandejas[2].getvalorDeFace();
        cedulas[2][1] = (valor/bandejas[2].getvalorDeFace());
        bandejas[2].setquantidadedeCedula(bandejas[2].getquantidadedeCedula()-(valor/20));
        valor = resto;
   
    }
    else{
        cedulas[2][0] = 20.0;
        cedulas[2][1] = 0;
    }
    if(((valor%10)==0)&&((valor/10)<=bandejas[3].getquantidadedeCedula())){
       
        cedulas[3][0] = bandejas[3].getvalorDeFace();
        cedulas[3][1] = (valor/bandejas[3].getvalorDeFace());
        bandejas[3].setquantidadedeCedula(bandejas[3].getquantidadedeCedula()-(valor/10));
      
    }
    else if((((valor-resto)%10) == 0)&&((valor/10)<=bandejas[3].getquantidadedeCedula())){
       
        valor-=resto;
        cedulas[3][0] = bandejas[3].getvalorDeFace();
        cedulas[3][1] = (valor/bandejas[3].getvalorDeFace());
        bandejas[3].setquantidadedeCedula(bandejas[3].getquantidadedeCedula()-(valor/10));
      
    }
    else{
        cedulas[3][0] = 10.0;
        cedulas[3][1] = 0;
    }
    return cedulas;
}

}