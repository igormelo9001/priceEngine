package com.engine.price.application.services;

import org.springframework.stereotype.Service;

@Service
public class PricingService {

    // Exemplo de regra de precificação (pode ser substituída por regras mais complexas)
    public double calculateFinalPrice(double basePrice) {
        double profitMargin = 0.20; // 20% de margem de lucro
        double taxRate = 0.10;      // 10% de impostos

        // Preço final após margem de lucro e impostos
        double priceAfterProfit = basePrice + (basePrice * profitMargin);
        double finalPrice = priceAfterProfit + (priceAfterProfit * taxRate);

        return finalPrice;
    }
}
