/**
 *  CashTrack
 *  Copyright (C) 2014  Haiko René Eitzen Bartel
 *
 *  This program is free software; you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation; either version 2 of the License, or
 *  (at your option) any later version.
 *
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License along
 *  with this program; if not, write to the Free Software Foundation, Inc.,
 *  51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.
 */

package CashTrackClasses;

import java.util.ArrayList;
import java.util.GregorianCalendar;

/**
 * I think this class is practically self-explanatory.
 * More documentation will follow in the future.
 * 
 * The light shines in the darkness, but the darkness has not understood it.
 * John 1:5
 * 
 * @author Haiko
 */
public class Account {
    
    private final Integer id;
    private String name;
    private Double balance;
    private ArrayList<Transaction> movement;
    /**
     * If true, there exists an account from which to automatically pull money
     * whenever there's an income into this account.
     */
    private Boolean autoPull;
    /**
     * Specifies the account from which to pull money, as explained above.
     */
    private Account autoPullFrom;
    /**
     * If true, there exists an account to which money must automatically be
     * pushed into whenever some is taken out of this account.
     */
    private Boolean autoPush;
    /**
     * Specifies the account into which to push money, as explained above.
     * An example implementation would be to have an account Bank and an account
     * Cash, and whenever money is taken from the Bank it is automatically
     * pushed into Cash.
     */
    private Account autoPushInto;
    private final GregorianCalendar creation;
    
    /**
     * Simple constructor. Gets an ID and a Name
     * @param id
     * @param name
     */
    public Account(Integer id, String name) {
        
        this.id = id;
        this.name = name;
        this.balance = 0.0;
        this.movement = new ArrayList<>();
        this.autoPull = false;
        this.autoPush = false;
        this.creation = new GregorianCalendar();
        
    }
    
    /**
     * Reinitializes the movement array.
     */
    public void clearTransactions() {
        movement = new ArrayList<>();
    }
    
    public Integer getId() {
        return this.id;
    }
    
    public boolean addTransaction(Transaction t) {
        return this.movement.add(t);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Boolean isAutoPull() {
        return autoPull;
    }

    public void setAutoPull(Boolean autoPull) {
        this.autoPull = autoPull;
    }

    public Account getAutoPullFrom() {
        return autoPullFrom;
    }

    public void setAutoPullFrom(Account autoPullFrom) {
        this.autoPullFrom = autoPullFrom;
    }

    public Boolean isAutoPush() {
        return autoPush;
    }

    public void setAutoPush(Boolean autoPush) {
        this.autoPush = autoPush;
    }

    public Account getAutoPushInto() {
        return autoPushInto;
    }

    public void setAutoPushInto(Account autoPushInto) {
        this.autoPushInto = autoPushInto;
    }
    
}
