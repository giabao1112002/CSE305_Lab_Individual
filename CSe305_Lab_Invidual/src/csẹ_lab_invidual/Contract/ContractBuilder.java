public interface ContractBuilder {
    ContractBuilder buildContractID(String contractID);
    ContractBuilder buildPropertyID(String propertyID);
    ContractBuilder buildTenantID(String tenantID);
    ContractBuilder buildRentAmount(double rentAmount);
    Contract signContract();
}
