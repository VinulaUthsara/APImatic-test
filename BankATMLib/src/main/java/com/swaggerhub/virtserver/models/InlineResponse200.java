/*
 * BankATMLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.swaggerhub.virtserver.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.ALWAYS)
public class InlineResponse200 
        extends java.util.Observable
        implements java.io.Serializable {
    private static final long serialVersionUID = 8990568087128137557L;
    private Double accountNumber;
    private String accountName;
    private String accountBalance;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("account_number")
    public Double getAccountNumber ( ) { 
        return this.accountNumber;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("account_number")
    public void setAccountNumber (Double value) { 
        this.accountNumber = value;
        notifyObservers(this.accountNumber);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("account_name")
    public String getAccountName ( ) { 
        return this.accountName;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("account_name")
    public void setAccountName (String value) { 
        this.accountName = value;
        notifyObservers(this.accountName);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("account_balance")
    public String getAccountBalance ( ) { 
        return this.accountBalance;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("account_balance")
    public void setAccountBalance (String value) { 
        this.accountBalance = value;
        notifyObservers(this.accountBalance);
    }
 
}
