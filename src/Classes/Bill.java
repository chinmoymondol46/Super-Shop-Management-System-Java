/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author saifu
 */
public class Bill
{
    private int bno;
    private String cname;
    private int amt;
    private String pdate;
    
    public Bill(int bno,String cname,int amt, String pdate)
    {
        this.bno=bno;
        this.cname=cname;
        this.amt=amt;
        this.pdate=pdate;
        
        
    }
            
    public int getbno()
    {
        return bno;
    }
    public String getcname()
    {
        return cname;
    }
    public int getamt()
    {
        return amt;
    }
    public String pdate()
    {
        return pdate;
    }
  }


