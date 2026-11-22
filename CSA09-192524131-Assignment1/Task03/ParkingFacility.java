public class ParkingFacility {
    private final String[][] slots;
    public ParkingFacility(int[] slotsPerFloor) {
        slots = new String[slotsPerFloor.length][];
        for (int i = 0; i < slotsPerFloor.length; i++) slots[i] = new String[slotsPerFloor[i]];
    }
    public boolean allocateSlot(String vNo) {
        for (int f = 0; f < slots.length; f++) {
            for (int s = 0; s < slots[f].length; s++) {
                if (slots[f][s] == null) { slots[f][s] = vNo; return true; }
            }
        }
        return false;
    }
    public double calculateFee(int mins, boolean pass) {
        if (pass || mins <= 0) return 0.0;
        int hrs = (int) Math.ceil(mins / 60.0);
        return hrs <= 2 ? 20.0 : 20.0 + (hrs - 2) * 10.0;
    }
    public static void main(String[] args) {
        ParkingFacility pf = new ParkingFacility(new int[]{2, 3});
        System.out.println("Allocated TN-01-AB-1234: " + pf.allocateSlot("TN-01-AB-1234"));
        System.out.println("Fee for 30 mins (Visitor): Rs. " + pf.calculateFee(30, false));
        System.out.println("Fee for 150 mins (Visitor): Rs. " + pf.calculateFee(150, false));
        System.out.println("Fee for 150 mins (Passholder): Rs. " + pf.calculateFee(150, true));
    }
}
