/**
 * Contact.java
 * <p/>
 * A model that refers the contact type.
 *
 * @category Demo
 * @package com.raj.androiddatabinding
 * @version 1.0
 * @author Rajkumar.N
 * @license http://www.apache.org/licenses/LICENSE-2.0
 */
package com.raj.androiddatabinding;

/**
 * Created by Rajkumar.N on 30-Sep-15.
 */
public class Contact {

    private String name;
    private String mobileNumber;
    private String workNumber;
    private int age;

    public Contact() {
    }

    public Contact(String name, String mobileNumber, String workNumber) {
        this.name = name;
        this.mobileNumber = mobileNumber;
        this.workNumber = workNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getWorkNumber() {
        return workNumber;
    }

    public void setWorkNumber(String workNumber) {
        this.workNumber = workNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
