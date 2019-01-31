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
public abstract class ShareAsset implements Asset0{

    @Override
    public abstract double getMarketValue();

    @Override
    public double getProfit() {
       return 0;
    }

    protected String symbol;
    protected double totalCost;
    protected double currentPrice;

    public ShareAsset(String symbol, double totalCost, double currentPrice) {
        this.symbol = symbol;
        this.totalCost = totalCost;
        this.currentPrice = currentPrice;
    }
    
   
       
   }
    

