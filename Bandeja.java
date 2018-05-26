public class Bandeja {
    private double valorDeFace;
    private int quantidadedeCedula;
    
    public Bandeja(double valorDeFace, int quantidadedeCedula){
        this.valorDeFace = valorDeFace;
        this.quantidadedeCedula = quantidadedeCedula;
    
    }
    public double getvalorDeFace(){
        return this.valorDeFace;
    }
    public void setvalordeFace(double valorDeFace){
        this.valorDeFace = valorDeFace;
    }
    public int getquantidadedeCedula(){
        return this.quantidadedeCedula;
    }
    public void setquantidadedeCedula(int quantidadedeCedula){
        this.quantidadedeCedula = quantidadedeCedula;
    }
    
}
