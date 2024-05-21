public class Main {
    public static void main(String[] args) {
        ContractBuilder permanentBuilder = new PermanentContractBuilder();
        Contract permanentContract = permanentBuilder
            .buildContractID("PC001")
            .buildPropertyID("P1001")
            .buildTenantID("T1001")
            .buildRentAmount(1200)
            .signContract();
        
        System.out.println(permanentContract);

        ContractBuilder longTermBuilder = new LongTermContractBuilder();
        Contract longTermContract = longTermBuilder
            .buildContractID("LC001")
            .buildPropertyID("P1002")
            .buildTenantID("T1002")
            .buildRentAmount(1500)
            .signContract();
        
        System.out.println(longTermContract);

        ContractBuilder shortTermBuilder = new ShortTermContractBuilder();
        Contract shortTermContract = shortTermBuilder
            .buildContractID("SC001")
            .buildPropertyID("P1003")
            .buildTenantID("T1003")
            .buildRentAmount(800)
            .signContract();
        
        System.out.println(shortTermContract);
    }
}
