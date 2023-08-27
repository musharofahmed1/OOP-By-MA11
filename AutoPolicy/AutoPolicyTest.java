package AutoPolicy;

public class AutoPolicyTest {
    public static void main(String[] args){
        //create two AutoPolicy object

        AutoPolicy policy1 = new AutoPolicy(1111111, "Toyota Camry", "NJ");

        AutoPolicy policy2 = new AutoPolicy(22222222, "Ford Fusion", "ME");

        //display whether each policy is in a no fault-state
        policyInNoFaultState(policy1);
        policyInNoFaultState(policy2);

    }
    //method that displays whether an AutoPolicy is in a state with no fault auto insurance
    public static void policyInNoFaultState(AutoPolicy policy){
        System.out.println("The Auto Policy: ");

        System.out.println("Account #: %d; Car: %s; State: %s %s a non-fault state%n%n", policy.getAccountNumber(),policy.getMakeAndModel(),policy.getState(), (policy.isNoFaultState() ? "is": "is not"));
    }
}
