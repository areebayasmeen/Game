public class Lab {
    String labId;
    Computer[] computers=new Computer[10];
    Employee labAttendant=new Employee("fiona","101");



    public void addComputer(Computer computer) {

        int emptySlot = -1;
        for (int i = 0; i < computers.length; i++) {
            if (computers[i] == null) {
                emptySlot = i;
                break;
            }
        }}
        public boolean removeComputer(String computerNumber) {
            for (int i = 0; i < computers.length; i++) {
                if (computers[i] != null && computers[i].getComputerNumber().equals(computerNumber)) {
                    computers[i] = null;
                    System.out.println("Computer removed from the lab.");

                }}return true;}
    public Computer getComputer(String computerNumber) {
        for (Computer computer : computers) {
            if (computer != null && computer.getComputerNumber().equals(computerNumber)) {
                return computer;
            }
        }
        return null;
    }
  String getLabAttendant_Id()  {
return labAttendant.getEmployeeID();
    }
    String getLabAttendant_name()  {
        return labAttendant.getEmployeename();
    }

}
