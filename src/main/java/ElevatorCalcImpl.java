public class ElevatorCalcImpl implements ElevatorCacl {
    @Override
    public int timeCalculation(int floors, int climb, int descent, int elevator) {
        int result = floors*climb;

        for (int i=1;i<floors+1;i++)
        {
            int targetFloor = (elevator + descent)*i/(climb+descent);
            result = Math.min(result,calcForThePerson(floors,climb,descent,elevator,i,targetFloor));
        }

        return result;
    }

    private int calcForThePerson(int floors, int climb, int descent, int elevator, int elevatorStop, int targetFloor) {
        int result = targetFloor * climb;

        result = Math.max(result,(elevatorStop*elevator + (floors - elevatorStop)*climb));
        result = Math.max(result,(elevatorStop*elevator) + (elevatorStop-targetFloor-1)*descent);

        return result;
    }
}
