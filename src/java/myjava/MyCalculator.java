/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package myjava;
import java.math.BigInteger;
import java.util.Iterator;

/**
 *
 * @author youlovethis
 */
public class MyCalculator {
    
    public String action;
    public BigInteger firstnumber;
    public BigInteger secondnumber;
    
    public MyCalculator(String a, String b, String c){
        action=a;
        firstnumber=new BigInteger(b);
        secondnumber=new BigInteger(c);
    }
    public String process(){
        switch(this.action){
            case"add":
                return firstnumber.add(secondnumber).toString();
            case"multiply":
                return firstnumber.multiply(secondnumber).toString();
            case"relatively prime":
                if(firstnumber.gcd(secondnumber).equals(BigInteger.ONE))return "true";
                else return "false";
            case"mod":
                return firstnumber.mod(secondnumber).toString();
            case"mod inverse":
                return firstnumber.modInverse(secondnumber).toString();
            case"power":
                return firstnumber.pow(secondnumber.intValue()).toString();
            default:return "wrong methods";
        }
    }
    
    public String toXml() {
        StringBuffer xml = new StringBuffer();
        xml.append("<?xml version=\"1.0\"?>\n");
            xml.append("<result>");
            xml.append(this.process());
            xml.append("</result>\n");
            System.out.println(xml.toString());
        return xml.toString();
    }
}
