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
public class DividendStock extends Stock{
    private double dividends;

    public DividendStock(String symbol, double totalCost, double currentPrice) {
        super(symbol, totalCost, currentPrice);
    }
    
    public double getMarketValue(){

    }
}
