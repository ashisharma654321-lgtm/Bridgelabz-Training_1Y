package com.gla.LibraryManagementSystem;

interface Reservable {
    void reserveItem(String borrowerName);
    boolean checkAvailability();
}