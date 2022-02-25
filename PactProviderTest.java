package pactProject;


import au.com.dius.pact.provider.junit.Provider;
import au.com.dius.pact.provider.junit.State;
import au.com.dius.pact.provider.junit.loader.PactFolder;
import au.com.dius.pact.provider.junit5.HttpTestTarget;
import au.com.dius.pact.provider.junit5.PactVerificationContext;
import au.com.dius.pact.provider.junit5.PactVerificationInvocationContextProvider;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.TestTemplate;
import org.junit.jupiter.api.extension.ExtendWith;

@Provider("UserProvider")
@PactFolder("target/pacts")
public class PactProviderTest {
    @BeforeEach
    void before(PactVerificationContext context) {
        // Set target for provider to send request to
       HttpTestTarget testTarget= new HttpTestTarget("localhost", 8585);
        context.setTarget(testTarget);
    }
    @TestTemplate
    @ExtendWith(PactVerificationInvocationContextProvider.class)
    void pactTestTemplate(PactVerificationContext context) {
        context.verifyInteraction();
    }
    // State to send the call to consumer
    @State("A request to create a user")
    public void stateProvider() {}
}

