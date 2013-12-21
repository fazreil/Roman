/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package my.fazreil.util;

/**
 *
 * @author root
 */
public class Athens {
    public static void main(String[] args){
        Roman r1 = new Roman();
    }

    public String getAthenName() {
        return athenName;
    }

    public void setAthenName(String athenName) {
        this.athenName = athenName;
    }

    public int getAthenAge() {
        return athenAge;
    }

    public void setAthenAge(int athenAge) {
        this.athenAge = athenAge;
    }
    
    private String athenName = "";
    private int athenAge = 0;

    public Athens() {
    }
    
    public Athens(String givenName, int givenAge)
    {
        athenName = givenName;
        athenAge = givenAge;
    }
    
    public Athens(String givenName)
    {
        athenName = givenName;
    }
}
