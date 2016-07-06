/*
 * CS1632 Software Quality Assurance 
 * Deliverable 4 
 * Lecture Monday & Wednesday 2:30~4:15 
 */
package laboonify;

/**
 *
 * @Lun Xi 
 */
public class Laboonify {

    public int[] laboonify(int[] x)
    {
        int[] arr = new int[x.length+1];
     
        if(x.length <= 0 || x.length >100)
            return null;
        
        int sum =0;
        for(int i=0; i<x.length; i++)
        {
            if(x[i] >=0 && x[i]<=100)
            {
                arr[i] = x[i]*x[i];
                sum += arr[i];
            }
            else
                return null;
        }
        arr[x.length] = sum;
        
        return arr;
    }
}
