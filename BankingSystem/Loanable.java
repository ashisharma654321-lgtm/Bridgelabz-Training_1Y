package com.gla.BankingSystem;
interface Loanable{
    void applyForLoan(double amount);
    boolean calculateLoanEligibility();
}