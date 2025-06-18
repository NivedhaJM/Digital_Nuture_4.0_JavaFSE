import static org.mockito.Mockito.*;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class MyServiceTest {

    public void testVerifyInteraction() {
        // Step 1: Create mock object
        ExternalApi mockApi = Mockito.mock(ExternalApi.class);

        // Step 2: Use mock in service
        MyService service = new MyService(mockApi);
        service.fetchData();

        // Step 3: Verify the interaction
        verify(mockApi).getData(); 
    }
}
