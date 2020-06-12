/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eroscoin;

/**
 *
 * @author Bhavdeep
 */
public class Eroscoin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        startup st=new startup();
        st.setVisible(true);
        Login lg=new Login();
        try
        {
            for(int i=0; i<=100; i++)
            {
                Thread.sleep(40);
                st.ppercent.setText(""+i+"%");
                st.progbar.setValue(i);
                if(i==100)
                {
                   lg.setVisible(true);
                   st.setVisible(false);
                }
            }
        }
        catch(Exception ex)
        {
            
        }
    }
    
}
