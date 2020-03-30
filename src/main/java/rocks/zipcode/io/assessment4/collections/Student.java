package rocks.zipcode.io.assessment4.collections;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 10/12/2018.
 */
public class Student {

    List<Lab> labs;


    public Student() {
        this(new ArrayList<>());
    }

    public Student(List<Lab> labs) {
        this.labs=labs;
    }

    public Lab getLab(String labName) {
        for (Lab elem: labs) {
            if(labName.equals(elem.getName())){
                return  elem;
            }
        }
        return null;
    }

    public void setLabStatus(String labName, LabStatus labStatus) {
        try {
            getLab(labName).labStatus = labStatus;
        }catch(Exception ex){
               throw new UnsupportedOperationException();
        }


    }

    public void forkLab(Lab lab) {
        labs.add(lab);
        Lab lab1 = getLab(lab.labName);
        lab1.labStatus = LabStatus.PENDING;
    }

    public LabStatus getLabStatus(String labName) {
        return getLab(labName).labStatus;
    }


    @Override
    public String toString() {
        String ans = "";
        for (int i = labs.size()-1; i >= 0 ; i--) {
            ans += labs.get(i).labName + " > " + labs.get(i).labStatus;
            if(i > 0)ans +=  "\n";
        }
        return ans;
        }

}

