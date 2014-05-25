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

import java.util.GregorianCalendar;

/**
 * I think this class is practically self-explanatory.
 * More documentation will follow in the future.
 * 
 * The Lord is a refuge for the oppressed, a stronghold in times of trouble.
 * Psalm 9:9
 * 
 * @author Haiko
 */
public class Transaction {
    
    private final Integer id;
    private final Account account;
    private final InOrOut inorout;
    private final Double amount;
    private final String detail;
    private final GregorianCalendar date;
    
    public Transaction (Integer id, Account account, InOrOut inorout, 
            Double amount, String detail) {
        this.id = id;
        this.account = account;
        this.inorout = inorout;
        this.amount = amount;
        this.detail = detail;
        this.date = new GregorianCalendar();
    }

    public Integer getId() {
        return id;
    }

    public Account getAccount() {
        return account;
    }

    public InOrOut getInorout() {
        return inorout;
    }

    public Double getAmount() {
        return amount;
    }

    public String getDetail() {
        return detail;
    }

    public GregorianCalendar getDate() {
        return date;
    }
    
}


