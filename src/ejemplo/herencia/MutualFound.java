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
public class MutualFound extends ShareAsset{
 private double totalShares;   
    public MutualFound(String symbol, double totalCost, double currentPrice) {
        super(symbol, totalCost, currentPrice);
    }

    @Override
    public double getMarketValue() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
