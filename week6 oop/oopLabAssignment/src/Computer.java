public class Computer {
    String computerNumber;
    String icdModel;
    int ramSize;
    int hddSize;
    boolean hasGpu;
    Computer( ){
        this.computerNumber="zero";
        this.icdModel="default";
        this.ramSize=0;
        this.hddSize=0;
        this.hasGpu=false;
    }
    Computer( String computerNumber, String icdModel, int ramSize, int hddSize, boolean hasGpu){
       this.computerNumber=computerNumber;
       this.icdModel=icdModel;
       this.ramSize=ramSize;
       this.hddSize=hddSize;
       this.hasGpu=hasGpu;
    }
   void  setComputerNumber(String computerNumber){
       this.computerNumber=computerNumber;
   }
 String getComputerNumber(){
   return this.computerNumber;
}
    @Override
    public boolean equals(Object obj) {

        if (obj == null || !(obj instanceof Computer)) {
            return false;
        }
        Computer otherComputer = (Computer) obj;


        return this.computerNumber.equals(otherComputer.computerNumber)
                && this.icdModel.equals(otherComputer.icdModel)
                && this.ramSize == otherComputer.ramSize
                && this.hddSize == otherComputer.hddSize
                && this.hasGpu == otherComputer.hasGpu;
    }
    }

