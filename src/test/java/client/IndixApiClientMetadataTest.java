package client;

import client.impl.IndixApiClientFactory;
import common.ResourceUtils;
import exception.IndixApiException;
import httpClient.HttpClient;
import models.metadataResponse.metadataResult.BrandsResult;
import models.metadataResponse.metadataResult.CategoriesResult;
import models.metadataResponse.metadataResult.StoresResult;
import org.junit.Assert;
import org.apache.http.client.ClientProtocolException;
import org.junit.Test;
import query.MetadataQuery;
import query.QueryFactory;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class IndixApiClientMetadataTest {

    @Test
    public void getStores() throws URISyntaxException, ClientProtocolException, IOException, IndixApiException {
        HttpClient mockHttpClient = new HttpClient() {
            public String GET(URI uri) throws ClientProtocolException, IOException, IndixApiException {
                return ResourceUtils.getTestResource(getClass().getClassLoader(), "metadata-json-responses0/storesResponse.json");
            }

            public void close() throws IOException { }
        };

        IndixApiClient indixApiClient = IndixApiClientFactory.newIndixApiClient(mockHttpClient);

        try {
            MetadataQuery metadataQuery = QueryFactory.newMetadataQuery()
                    .withAppId("123")
                    .withAppKey("123")
                    .withQ("ama");
            StoresResult sr = indixApiClient.searchStores(metadataQuery);

            Assert.assertEquals("US", sr.getStores().get(0).getCountryCode());
            Assert.assertEquals(3341, sr.getStores().get(0).getId());
            Assert.assertEquals("CPO Delta", sr.getStores().get(0).getName());
        } finally {
            indixApiClient.close();
        }
    }

    @Test
    public void getBrands() throws URISyntaxException, ClientProtocolException, IOException, IndixApiException {
        HttpClient mockHttpClient = new HttpClient() {
            public String GET(URI uri) throws ClientProtocolException, IOException, IndixApiException {
                return ResourceUtils.getTestResource(getClass().getClassLoader(), "metadata-json-responses0/brandsResponse.json");
            }

            public void close() throws IOException { }
        };

        IndixApiClient indixApiClient = IndixApiClientFactory.newIndixApiClient(mockHttpClient);

        try {
            MetadataQuery metadataQuery = QueryFactory.newMetadataQuery()
                    .withAppId("123")
                    .withAppKey("123")
                    .withQ("ama");
            BrandsResult sr = indixApiClient.searchBrands(metadataQuery);

            Assert.assertEquals(73, sr.getBrands().get(0).getId());
            Assert.assertEquals("Amanda Uprichard", sr.getBrands().get(0).getName());
        } finally {
            indixApiClient.close();
        }
    }

    @Test
    public void getCategories() throws URISyntaxException, ClientProtocolException, IOException, IndixApiException {
        HttpClient mockHttpClient = new HttpClient() {
            public String GET(URI uri) throws ClientProtocolException, IOException, IndixApiException {
                return ResourceUtils.getTestResource(getClass().getClassLoader(), "metadata-json-responses0/categoriesResponse.json");
            }

            public void close() throws IOException { }
        };

        IndixApiClient indixApiClient = IndixApiClientFactory.newIndixApiClient(mockHttpClient);

        try {
            MetadataQuery metadataQuery = QueryFactory.newMetadataQuery()
                    .withAppId("123")
                    .withAppKey("123");
            CategoriesResult sr = indixApiClient.exportCategories(metadataQuery);

            Assert.assertEquals(10161, sr.getCategories().get(0).getId());
            Assert.assertEquals("Computers & Accessories", sr.getCategories().get(0).getName());
        } finally {
            indixApiClient.close();
        }
    }

}