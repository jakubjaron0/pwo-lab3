/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package pwo;
import java.math.BigDecimal;
/**
 *
 * @author kuba
 */
public class LucaGenerator {
    
    private int lastindex =0;
    
    private BigDecimal current = new BigDecimal(0);
    
    private BigDecimal l_1 = new BigDecimal(2),
            l_2 = new BigDecimal(1);
    public BigDecimal LucasString() {
        if (lastindex > 1) {
            current = l_1.add(l_2);
            l_1 = l_2;
            l_2 = current;
            
        } else if (lastindex == 1) {
            current = new BigDecimal(1);
        } else {
            current = new BigDecimal(2);
        }
        lastindex++;
        return current;
    }
    public BigDecimal getLucasString(int i) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
        if (i < lastindex) {
            reset();
        }
        while (lastindex <= i) {
            LucasString();
        }
        return current;
    }
    
    public void reset() {
        lastindex = 0;
        current = new BigDecimal(0);
        l_1 = new BigDecimal(2);
        l_2 = new BigDecimal(1);
    }
}
