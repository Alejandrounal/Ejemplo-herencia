/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo.herencia;

/**
 *
 * @author Estudiante
 */
public class Stock extends ShareAsset{
    private int totalShares;

    public Stock(String symbol, double totalCost, double currentPrice) {
        super(symbol, totalCost, currentPrice);
    }

    @Override
    public double getMarketValue() {
        double valor = this.totalShares - super.currentPrice;
        return valor;
    }
   
  
}
