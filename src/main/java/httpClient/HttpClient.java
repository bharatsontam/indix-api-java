package httpClient;

import exception.IndixApiException;
import org.apache.http.client.ClientProtocolException;

import java.io.Closeable;
import java.io.IOException;
import java.net.URI;

/*
 * Interface defining the expected contract for http clients
 */
public interface HttpClient extends Closeable {

    /*
     * Executes a GET request and retrieves the response body as String
     * NOTE: If the response body can be huge, you may have to use a different API
     */
    String GET(URI uri) throws ClientProtocolException, IOException, IndixApiException;

    void close() throws IOException;
}