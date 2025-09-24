package org.devanshu;

public class Branch {
    private String managerName;
    private int ifscCode;

    public Branch(){
        // Default Constructor
    }

    public Branch(String managerName , int ifscCode){
        this.managerName = managerName;
        this.ifscCode = ifscCode;
    }

    public String getManagerName() {
        return managerName;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }

    public int getIfscCode() {
        return ifscCode;
    }

    public void setIfscCode(int ifscCode) {
        this.ifscCode = ifscCode;
    }
}
