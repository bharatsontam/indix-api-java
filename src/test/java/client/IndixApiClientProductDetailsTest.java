package client;

import client.impl.IndixApiClientFactory;
import com.fasterxml.jackson.databind.JsonMappingException;
import common.ResourceUtils;
import exception.IndixApiException;
import exception.InternalServerException;
import httpClient.HttpClient;
import models.productDetailsResponse.productDetailsResult.*;
import org.apache.http.client.ClientProtocolException;
import org.junit.Assert;
import org.junit.Test;
import query.ProductDetailsQuery;
import query.QueryFactory;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class IndixApiClientProductDetailsTest {

    @Test
    public void getProductDetailsSummary()
            throws URISyntaxException, ClientProtocolException, IOException, IndixApiException {
        HttpClient mockHttpClient = new HttpClient() {
            public String GET(URI uri) throws ClientProtocolException, IOException, IndixApiException {
                return ResourceUtils.getTestResource(
                        getClass().getClassLoader(),
                        "productDetails-json-responses0/summaryProductDetailsResponse.json"
                );
            }

            public void close() throws IOException {
            }
        };

        IndixApiClient indixApiClient = IndixApiClientFactory.newIndixApiClient(mockHttpClient);

        try {
            ProductDetailsQuery productDetailsQuery = QueryFactory.newProductDetailsQuery()
                    .withCountryCode("AU")
                    .withMpid("c3c766f0b5fa6bfb9a6f5e2921779dcf")
                    .withAppId("123")
                    .withAppKey("123");
            SummaryProductDetailsResult sr = indixApiClient.getProductDetailsSummary(productDetailsQuery);

            Assert.assertEquals("c3c766f0b5fa6bfb9a6f5e2921779dcf", sr.getProduct().getMpid());
            Assert.assertEquals("Kraft Vegemite Jar 380g, 150c", sr.getProduct().getTitle());
        } finally {
            indixApiClient.close();
        }
    }

    @Test
    public void getProductDetailsOffersStandard()
            throws URISyntaxException, ClientProtocolException, IOException, IndixApiException {
        HttpClient mockHttpClient = new HttpClient() {
            public String GET(URI uri) throws ClientProtocolException, IOException, IndixApiException {
                return ResourceUtils.getTestResource(
                        getClass().getClassLoader(),
                        "productDetails-json-responses0/offersStandardProductDetailsResponse.json"
                );
            }

            public void close() throws IOException {
            }
        };

        IndixApiClient indixApiClient = IndixApiClientFactory.newIndixApiClient(mockHttpClient);

        try {
            ProductDetailsQuery productDetailsQuery = QueryFactory.newProductDetailsQuery()
                    .withCountryCode("AU")
                    .withMpid("c3c766f0b5fa6bfb9a6f5e2921779dcf")
                    .withStoreId(2817)
                    .withAppId("123")
                    .withAppKey("123");
            OffersProductDetailsResult sr = indixApiClient.getProductDetailsOffersStandard(productDetailsQuery);

            Assert.assertEquals("c3c766f0b5fa6bfb9a6f5e2921779dcf", sr.getProduct().getMpid());
            Assert.assertEquals("Kraft Vegemite Jar 380g, 150c", sr.getProduct().getTitle());
        } finally {
            indixApiClient.close();
        }
    }

    @Test
    public void getProductDetailsOffersPremium()
            throws URISyntaxException, ClientProtocolException, IOException, IndixApiException {
        HttpClient mockHttpClient = new HttpClient() {
            public String GET(URI uri) throws ClientProtocolException, IOException, IndixApiException {
                return ResourceUtils.getTestResource(
                        getClass().getClassLoader(),
                        "productDetails-json-responses0/offersPremiumProductDetailsResponse.json"
                );
            }

            public void close() throws IOException {
            }
        };

        IndixApiClient indixApiClient = IndixApiClientFactory.newIndixApiClient(mockHttpClient);

        try {
            ProductDetailsQuery productDetailsQuery = QueryFactory.newProductDetailsQuery()
                    .withCountryCode("AU")
                    .withMpid("c3c766f0b5fa6bfb9a6f5e2921779dcf")
                    .withAppId("123")
                    .withAppKey("123");
            OffersProductDetailsResult sr = indixApiClient.getProductDetailsOffersPremium(productDetailsQuery);

            Assert.assertEquals("c3c766f0b5fa6bfb9a6f5e2921779dcf", sr.getProduct().getMpid());
            Assert.assertEquals("Kraft Vegemite Jar 380g, 150c", sr.getProduct().getTitle());
        } finally {
            indixApiClient.close();
        }
    }

    @Test
    public void getProductDetailsCatalogStandard()
            throws URISyntaxException, ClientProtocolException, IOException, IndixApiException {
        HttpClient mockHttpClient = new HttpClient() {
            public String GET(URI uri) throws ClientProtocolException, IOException, IndixApiException {
                return ResourceUtils.getTestResource(
                        getClass().getClassLoader(),
                        "productDetails-json-responses0/catalogStandardProductDetailsResponse.json"
                );
            }

            public void close() throws IOException {
            }
        };

        IndixApiClient indixApiClient = IndixApiClientFactory.newIndixApiClient(mockHttpClient);

        try {
            ProductDetailsQuery productDetailsQuery = QueryFactory.newProductDetailsQuery()
                    .withCountryCode("AU")
                    .withMpid("c3c766f0b5fa6bfb9a6f5e2921779dcf")
                    .withAppId("123")
                    .withAppKey("123");
            CatalogStandardProductDetailsResult sr = indixApiClient.getProductDetailsCatalogStandard(productDetailsQuery);

            Assert.assertEquals("c3c766f0b5fa6bfb9a6f5e2921779dcf", sr.getProduct().getMpid());
            Assert.assertEquals("Kraft Vegemite Jar 380g, 150c", sr.getProduct().getTitle());
        } finally {
            indixApiClient.close();
        }
    }

    @Test
    public void getProductDetailsCatalogPremium()
            throws URISyntaxException, ClientProtocolException, IOException, IndixApiException {
        HttpClient mockHttpClient = new HttpClient() {
            public String GET(URI uri) throws ClientProtocolException, IOException, IndixApiException {
                return ResourceUtils.getTestResource(
                        getClass().getClassLoader(),
                        "productDetails-json-responses0/catalogPremiumProductDetailsResponse.json"
                );
            }

            public void close() throws IOException {
            }
        };

        IndixApiClient indixApiClient = IndixApiClientFactory.newIndixApiClient(mockHttpClient);

        try {
            ProductDetailsQuery productDetailsQuery = QueryFactory.newProductDetailsQuery()
                    .withCountryCode("AU")
                    .withMpid("c3c766f0b5fa6bfb9a6f5e2921779dcf")
                    .withAppId("123")
                    .withAppKey("123");
            CatalogPremiumProductDetailsResult sr = indixApiClient.getProductDetailsCatalogPremium(productDetailsQuery);

            Assert.assertEquals("c3c766f0b5fa6bfb9a6f5e2921779dcf", sr.getProduct().getMpid());
            Assert.assertEquals("Kraft Vegemite Jar 380g, 150c", sr.getProduct().getTitle());
        } finally {
            indixApiClient.close();
        }
    }

    @Test
    public void getProductDetailsUniversal()
            throws URISyntaxException, ClientProtocolException, IOException, IndixApiException {
        HttpClient mockHttpClient = new HttpClient() {
            public String GET(URI uri) throws ClientProtocolException, IOException, IndixApiException {
                return ResourceUtils.getTestResource(
                        getClass().getClassLoader(),
                        "productDetails-json-responses0/universalProductDetailsResponse.json"
                );
            }

            public void close() throws IOException {
            }
        };

        IndixApiClient indixApiClient = IndixApiClientFactory.newIndixApiClient(mockHttpClient);

        try {
            ProductDetailsQuery productDetailsQuery = QueryFactory.newProductDetailsQuery()
                    .withCountryCode("AU")
                    .withMpid("c3c766f0b5fa6bfb9a6f5e2921779dcf")
                    .withAppId("123")
                    .withAppKey("123");
            UniversalProductDetailsResult sr = indixApiClient.getProductDetailsUniversal(productDetailsQuery);

            Assert.assertEquals("c3c766f0b5fa6bfb9a6f5e2921779dcf", sr.getProduct().getMpid());
            Assert.assertEquals("Kraft Vegemite Jar 380g, 150c", sr.getProduct().getTitle());
        } finally {
            indixApiClient.close();
        }
    }

    @Test(expected = InternalServerException.class)
    public void getProductDetailsSummaryFailsIfInputResponseIsMalformed0()
            throws URISyntaxException, ClientProtocolException, IOException, IndixApiException {
        HttpClient mockHttpClient = new HttpClient() {
            public String GET(URI uri) throws ClientProtocolException, IOException, IndixApiException {
                return ResourceUtils.getTestResource(
                        getClass().getClassLoader(),
                        "productDetails-json-responses0/offersStandardProductDetailsResponse.json"
                );
            }

            public void close() throws IOException {
            }
        };

        IndixApiClient indixApiClient = IndixApiClientFactory.newIndixApiClient(mockHttpClient);

        try {
            ProductDetailsQuery productDetailsQuery = QueryFactory.newProductDetailsQuery()
                    .withCountryCode("AU")
                    .withMpid("c3c766f0b5fa6bfb9a6f5e2921779dcf")
                    .withAppId("123")
                    .withAppKey("123");
            SummaryProductDetailsResult sr = indixApiClient.getProductDetailsSummary(productDetailsQuery);

            System.out.println(sr.getProduct().getMpid());
        } finally {
            indixApiClient.close();
        }
    }

    @Test(expected = InternalServerException.class)
    public void getProductDetailsSummaryFailsIfInputResponseIsMalformed1()
            throws URISyntaxException, ClientProtocolException, IOException, IndixApiException {
        HttpClient mockHttpClient = new HttpClient() {
            public String GET(URI uri) throws ClientProtocolException, IOException, IndixApiException {
                return ResourceUtils.getTestResource(
                        getClass().getClassLoader(),
                        "productDetails-json-responses0/offersPremiumProductDetailsResponse.json"
                );
            }

            public void close() throws IOException {
            }
        };

        IndixApiClient indixApiClient = IndixApiClientFactory.newIndixApiClient(mockHttpClient);

        try {
            ProductDetailsQuery productDetailsQuery = QueryFactory.newProductDetailsQuery()
                    .withCountryCode("AU")
                    .withMpid("c3c766f0b5fa6bfb9a6f5e2921779dcf")
                    .withAppId("123")
                    .withAppKey("123");
            SummaryProductDetailsResult sr = indixApiClient.getProductDetailsSummary(productDetailsQuery);

            System.out.println(sr.getProduct().getMpid());
        } finally {
            indixApiClient.close();
        }
    }

    @Test(expected = InternalServerException.class)
    public void getProductDetailsSummaryFailsIfInputResponseIsMalformed2()
            throws URISyntaxException, ClientProtocolException, IOException, IndixApiException {
        HttpClient mockHttpClient = new HttpClient() {
            public String GET(URI uri) throws ClientProtocolException, IOException, IndixApiException {
                return ResourceUtils.getTestResource(
                        getClass().getClassLoader(),
                        "productDetails-json-responses0/catalogStandardProductDetailsResponse.json"
                );
            }

            public void close() throws IOException {
            }
        };

        IndixApiClient indixApiClient = IndixApiClientFactory.newIndixApiClient(mockHttpClient);

        try {
            ProductDetailsQuery productDetailsQuery = QueryFactory.newProductDetailsQuery()
                    .withCountryCode("AU")
                    .withMpid("c3c766f0b5fa6bfb9a6f5e2921779dcf")
                    .withAppId("123")
                    .withAppKey("123");
            SummaryProductDetailsResult sr = indixApiClient.getProductDetailsSummary(productDetailsQuery);

            System.out.println(sr.getProduct().getMpid());
        } finally {
            indixApiClient.close();
        }
    }

    @Test(expected = InternalServerException.class)
    public void getProductDetailsSummaryFailsIfInputResponseIsMalformed3()
            throws URISyntaxException, ClientProtocolException, IOException, IndixApiException {
        HttpClient mockHttpClient = new HttpClient() {
            public String GET(URI uri) throws ClientProtocolException, IOException, IndixApiException {
                return ResourceUtils.getTestResource(
                        getClass().getClassLoader(),
                        "productDetails-json-responses0/catalogPremiumProductDetailsResponse.json"
                );
            }

            public void close() throws IOException {
            }
        };

        IndixApiClient indixApiClient = IndixApiClientFactory.newIndixApiClient(mockHttpClient);

        try {
            ProductDetailsQuery productDetailsQuery = QueryFactory.newProductDetailsQuery()
                    .withCountryCode("AU")
                    .withMpid("c3c766f0b5fa6bfb9a6f5e2921779dcf")
                    .withAppId("123")
                    .withAppKey("123");
            SummaryProductDetailsResult sr = indixApiClient.getProductDetailsSummary(productDetailsQuery);

            System.out.println(sr.getProduct().getMpid());
        } finally {
            indixApiClient.close();
        }
    }

    @Test(expected = InternalServerException.class)
    public void getProductDetailsSummaryFailsIfInputResponseIsMalformed4()
            throws URISyntaxException, ClientProtocolException, IOException, IndixApiException {
        HttpClient mockHttpClient = new HttpClient() {
            public String GET(URI uri) throws ClientProtocolException, IOException, IndixApiException {
                return ResourceUtils.getTestResource(
                        getClass().getClassLoader(),
                        "productDetails-json-responses0/universalProductDetailsResponse.json"
                );
            }

            public void close() throws IOException {
            }
        };

        IndixApiClient indixApiClient = IndixApiClientFactory.newIndixApiClient(mockHttpClient);

        try {
            ProductDetailsQuery productDetailsQuery = QueryFactory.newProductDetailsQuery()
                    .withCountryCode("AU")
                    .withMpid("c3c766f0b5fa6bfb9a6f5e2921779dcf")
                    .withAppId("123")
                    .withAppKey("123");
            SummaryProductDetailsResult sr = indixApiClient.getProductDetailsSummary(productDetailsQuery);

            System.out.println(sr.getProduct().getMpid());
        } finally {
            indixApiClient.close();
        }
    }

    @Test(expected = InternalServerException.class)
    public void getProductDetailsOffersStandardFailsIfInputResponseIsMalformed0()
            throws URISyntaxException, ClientProtocolException, IOException, IndixApiException {
        HttpClient mockHttpClient = new HttpClient() {
            public String GET(URI uri) throws ClientProtocolException, IOException, IndixApiException {
                return ResourceUtils.getTestResource(
                        getClass().getClassLoader(),
                        "productDetails-json-responses0/catalogStandardProductDetailsResponse.json"
                );
            }

            public void close() throws IOException {
            }
        };

        IndixApiClient indixApiClient = IndixApiClientFactory.newIndixApiClient(mockHttpClient);

        try {
            ProductDetailsQuery productDetailsQuery = QueryFactory.newProductDetailsQuery()
                    .withCountryCode("AU")
                    .withMpid("c3c766f0b5fa6bfb9a6f5e2921779dcf")
                    .withStoreId(2817)
                    .withAppId("123")
                    .withAppKey("123");
            OffersProductDetailsResult sr = indixApiClient.getProductDetailsOffersStandard(productDetailsQuery);

            System.out.println(sr.getProduct().getMpid());
        } finally {
            indixApiClient.close();
        }
    }

    @Test(expected = InternalServerException.class)
    public void getProductDetailsOffersStandardFailsIfInputResponseIsMalformed1()
            throws URISyntaxException, ClientProtocolException, IOException, IndixApiException {
        HttpClient mockHttpClient = new HttpClient() {
            public String GET(URI uri) throws ClientProtocolException, IOException, IndixApiException {
                return ResourceUtils.getTestResource(
                        getClass().getClassLoader(),
                        "productDetails-json-responses0/catalogPremiumProductDetailsResponse.json"
                );
            }

            public void close() throws IOException {
            }
        };

        IndixApiClient indixApiClient = IndixApiClientFactory.newIndixApiClient(mockHttpClient);

        try {
            ProductDetailsQuery productDetailsQuery = QueryFactory.newProductDetailsQuery()
                    .withCountryCode("AU")
                    .withMpid("c3c766f0b5fa6bfb9a6f5e2921779dcf")
                    .withStoreId(2817)
                    .withAppId("123")
                    .withAppKey("123");
            OffersProductDetailsResult sr = indixApiClient.getProductDetailsOffersStandard(productDetailsQuery);

            System.out.println(sr.getProduct().getMpid());
        } finally {
            indixApiClient.close();
        }
    }

    @Test(expected = InternalServerException.class)
    public void getProductDetailsOffersStandardFailsIfInputResponseIsMalformed2()
            throws URISyntaxException, ClientProtocolException, IOException, IndixApiException {
        HttpClient mockHttpClient = new HttpClient() {
            public String GET(URI uri) throws ClientProtocolException, IOException, IndixApiException {
                return ResourceUtils.getTestResource(
                        getClass().getClassLoader(),
                        "productDetails-json-responses0/universalProductDetailsResponse.json"
                );
            }

            public void close() throws IOException {
            }
        };

        IndixApiClient indixApiClient = IndixApiClientFactory.newIndixApiClient(mockHttpClient);

        try {
            ProductDetailsQuery productDetailsQuery = QueryFactory.newProductDetailsQuery()
                    .withCountryCode("AU")
                    .withMpid("c3c766f0b5fa6bfb9a6f5e2921779dcf")
                    .withStoreId(2817)
                    .withAppId("123")
                    .withAppKey("123");
            OffersProductDetailsResult sr = indixApiClient.getProductDetailsOffersStandard(productDetailsQuery);

            System.out.println(sr.getProduct().getMpid());
        } finally {
            indixApiClient.close();
        }
    }

    @Test(expected = InternalServerException.class)
    public void getProductDetailsOffersPremiumFailsIfInputResponseIsMalformed0()
            throws URISyntaxException, ClientProtocolException, IOException, IndixApiException {
        HttpClient mockHttpClient = new HttpClient() {
            public String GET(URI uri) throws ClientProtocolException, IOException, IndixApiException {
                return ResourceUtils.getTestResource(
                        getClass().getClassLoader(),
                        "productDetails-json-responses0/catalogStandardProductDetailsResponse.json"
                );
            }

            public void close() throws IOException {
            }
        };

        IndixApiClient indixApiClient = IndixApiClientFactory.newIndixApiClient(mockHttpClient);

        try {
            ProductDetailsQuery productDetailsQuery = QueryFactory.newProductDetailsQuery()
                    .withCountryCode("AU")
                    .withMpid("c3c766f0b5fa6bfb9a6f5e2921779dcf")
                    .withAppId("123")
                    .withAppKey("123");
            OffersProductDetailsResult sr = indixApiClient.getProductDetailsOffersPremium(productDetailsQuery);

            System.out.println(sr.getProduct().getMpid());
        } finally {
            indixApiClient.close();
        }
    }

    @Test(expected = InternalServerException.class)
    public void getProductDetailsOffersPremiumFailsIfInputResponseIsMalformed1()
            throws URISyntaxException, ClientProtocolException, IOException, IndixApiException {
        HttpClient mockHttpClient = new HttpClient() {
            public String GET(URI uri) throws ClientProtocolException, IOException, IndixApiException {
                return ResourceUtils.getTestResource(
                        getClass().getClassLoader(),
                        "productDetails-json-responses0/catalogPremiumProductDetailsResponse.json"
                );
            }

            public void close() throws IOException {
            }
        };

        IndixApiClient indixApiClient = IndixApiClientFactory.newIndixApiClient(mockHttpClient);

        try {
            ProductDetailsQuery productDetailsQuery = QueryFactory.newProductDetailsQuery()
                    .withCountryCode("AU")
                    .withMpid("c3c766f0b5fa6bfb9a6f5e2921779dcf")
                    .withAppId("123")
                    .withAppKey("123");
            OffersProductDetailsResult sr = indixApiClient.getProductDetailsOffersPremium(productDetailsQuery);

            System.out.println(sr.getProduct().getMpid());
        } finally {
            indixApiClient.close();
        }
    }

    @Test(expected = InternalServerException.class)
    public void getProductDetailsOffersPremiumFailsIfInputResponseIsMalformed2()
            throws URISyntaxException, ClientProtocolException, IOException, IndixApiException {
        HttpClient mockHttpClient = new HttpClient() {
            public String GET(URI uri) throws ClientProtocolException, IOException, IndixApiException {
                return ResourceUtils.getTestResource(
                        getClass().getClassLoader(),
                        "productDetails-json-responses0/universalProductDetailsResponse.json");
            }

            public void close() throws IOException {
            }
        };

        IndixApiClient indixApiClient = IndixApiClientFactory.newIndixApiClient(mockHttpClient);

        try {
            ProductDetailsQuery productDetailsQuery = QueryFactory.newProductDetailsQuery()
                    .withCountryCode("AU")
                    .withMpid("c3c766f0b5fa6bfb9a6f5e2921779dcf")
                    .withAppId("123")
                    .withAppKey("123");
            OffersProductDetailsResult sr = indixApiClient.getProductDetailsOffersPremium(productDetailsQuery);

            System.out.println(sr.getProduct().getMpid());
        } finally {
            indixApiClient.close();
        }
    }

    @Test(expected = InternalServerException.class)
    public void getProductDetailsCatalogStandardFailsIfInputResponseIsMalformed0()
            throws URISyntaxException, ClientProtocolException, IOException, IndixApiException {
        HttpClient mockHttpClient = new HttpClient() {
            public String GET(URI uri) throws ClientProtocolException, IOException, IndixApiException {
                return ResourceUtils.getTestResource(
                        getClass().getClassLoader(),
                        "productDetails-json-responses0/offersStandardProductDetailsResponse.json"
                );
            }

            public void close() throws IOException {
            }
        };

        IndixApiClient indixApiClient = IndixApiClientFactory.newIndixApiClient(mockHttpClient);

        try {
            ProductDetailsQuery productDetailsQuery = QueryFactory.newProductDetailsQuery()
                    .withCountryCode("AU")
                    .withMpid("c3c766f0b5fa6bfb9a6f5e2921779dcf")
                    .withAppId("123")
                    .withAppKey("123");
            CatalogStandardProductDetailsResult sr = indixApiClient.getProductDetailsCatalogStandard(productDetailsQuery);

            System.out.println(sr.getProduct().getMpid());
        } finally {
            indixApiClient.close();
        }
    }

    @Test(expected = InternalServerException.class)
    public void getProductDetailsCatalogStandardFailsIfInputResponseIsMalformed1()
            throws URISyntaxException, ClientProtocolException, IOException, IndixApiException {
        HttpClient mockHttpClient = new HttpClient() {
            public String GET(URI uri) throws ClientProtocolException, IOException, IndixApiException {
                return ResourceUtils.getTestResource(
                        getClass().getClassLoader(),
                        "productDetails-json-responses0/offersPremiumProductDetailsResponse.json"
                );
            }

            public void close() throws IOException {
            }
        };

        IndixApiClient indixApiClient = IndixApiClientFactory.newIndixApiClient(mockHttpClient);

        try {
            ProductDetailsQuery productDetailsQuery = QueryFactory.newProductDetailsQuery()
                    .withCountryCode("AU")
                    .withMpid("c3c766f0b5fa6bfb9a6f5e2921779dcf")
                    .withAppId("123")
                    .withAppKey("123");
            CatalogStandardProductDetailsResult sr = indixApiClient.getProductDetailsCatalogStandard(productDetailsQuery);

            System.out.println(sr.getProduct().getMpid());
        } finally {
            indixApiClient.close();
        }
    }

    @Test(expected = InternalServerException.class)
    public void getProductDetailsCatalogStandardFailsIfInputResponseIsMalformed2()
            throws URISyntaxException, ClientProtocolException, IOException, IndixApiException {
        HttpClient mockHttpClient = new HttpClient() {
            public String GET(URI uri) throws ClientProtocolException, IOException, IndixApiException {
                return ResourceUtils.getTestResource(
                        getClass().getClassLoader(),
                        "productDetails-json-responses0/catalogPremiumProductDetailsResponse.json"
                );
            }

            public void close() throws IOException {
            }
        };

        IndixApiClient indixApiClient = IndixApiClientFactory.newIndixApiClient(mockHttpClient);

        try {
            ProductDetailsQuery productDetailsQuery = QueryFactory.newProductDetailsQuery()
                    .withCountryCode("AU")
                    .withMpid("c3c766f0b5fa6bfb9a6f5e2921779dcf")
                    .withAppId("123")
                    .withAppKey("123");
            CatalogStandardProductDetailsResult sr = indixApiClient.getProductDetailsCatalogStandard(productDetailsQuery);

            System.out.println(sr.getProduct().getMpid());
        } finally {
            indixApiClient.close();
        }
    }

    @Test(expected = InternalServerException.class)
    public void getProductDetailsCatalogStandardFailsIfInputResponseIsMalformed3()
            throws URISyntaxException, ClientProtocolException, IOException, IndixApiException {
        HttpClient mockHttpClient = new HttpClient() {
            public String GET(URI uri) throws ClientProtocolException, IOException, IndixApiException {
                return ResourceUtils.getTestResource(
                        getClass().getClassLoader(),
                        "productDetails-json-responses0/universalProductDetailsResponse.json"
                );
            }

            public void close() throws IOException {
            }
        };

        IndixApiClient indixApiClient = IndixApiClientFactory.newIndixApiClient(mockHttpClient);

        try {
            ProductDetailsQuery productDetailsQuery = QueryFactory.newProductDetailsQuery()
                    .withCountryCode("AU")
                    .withMpid("c3c766f0b5fa6bfb9a6f5e2921779dcf")
                    .withAppId("123")
                    .withAppKey("123");
            CatalogStandardProductDetailsResult sr = indixApiClient.getProductDetailsCatalogStandard(productDetailsQuery);

            System.out.println(sr.getProduct().getMpid());
        } finally {
            indixApiClient.close();
        }
    }

    @Test(expected = InternalServerException.class)
    public void getProductDetailsCatalogPremiumFailsIfInputResponseIsMalformed0()
            throws URISyntaxException, ClientProtocolException, IOException, IndixApiException {
        HttpClient mockHttpClient = new HttpClient() {
            public String GET(URI uri) throws ClientProtocolException, IOException, IndixApiException {
                return ResourceUtils.getTestResource(
                        getClass().getClassLoader(),
                        "productDetails-json-responses0/offersStandardProductDetailsResponse.json"
                );
            }

            public void close() throws IOException {
            }
        };

        IndixApiClient indixApiClient = IndixApiClientFactory.newIndixApiClient(mockHttpClient);

        try {
            ProductDetailsQuery productDetailsQuery = QueryFactory.newProductDetailsQuery()
                    .withCountryCode("AU")
                    .withMpid("c3c766f0b5fa6bfb9a6f5e2921779dcf")
                    .withAppId("123")
                    .withAppKey("123");
            CatalogPremiumProductDetailsResult sr = indixApiClient.getProductDetailsCatalogPremium(productDetailsQuery);

            System.out.println(sr.getProduct().getMpid());
        } finally {
            indixApiClient.close();
        }
    }

    @Test(expected = InternalServerException.class)
    public void getProductDetailsCatalogPremiumFailsIfInputResponseIsMalformed1()
            throws URISyntaxException, ClientProtocolException, IOException, IndixApiException {
        HttpClient mockHttpClient = new HttpClient() {
            public String GET(URI uri) throws ClientProtocolException, IOException, IndixApiException {
                return ResourceUtils.getTestResource(
                        getClass().getClassLoader(),
                        "productDetails-json-responses0/offersPremiumProductDetailsResponse.json"
                );
            }

            public void close() throws IOException {
            }
        };

        IndixApiClient indixApiClient = IndixApiClientFactory.newIndixApiClient(mockHttpClient);

        try {
            ProductDetailsQuery productDetailsQuery = QueryFactory.newProductDetailsQuery()
                    .withCountryCode("AU")
                    .withMpid("c3c766f0b5fa6bfb9a6f5e2921779dcf")
                    .withAppId("123")
                    .withAppKey("123");
            CatalogPremiumProductDetailsResult sr = indixApiClient.getProductDetailsCatalogPremium(productDetailsQuery);

            System.out.println(sr.getProduct().getMpid());
        } finally {
            indixApiClient.close();
        }
    }

    @Test(expected = InternalServerException.class)
    public void getProductDetailsCatalogPremiumFailsIfInputResponseIsMalformed2()
            throws URISyntaxException, ClientProtocolException, IOException, IndixApiException {
        HttpClient mockHttpClient = new HttpClient() {
            public String GET(URI uri) throws ClientProtocolException, IOException, IndixApiException {
                return ResourceUtils.getTestResource(
                        getClass().getClassLoader(),
                        "productDetails-json-responses0/universalProductDetailsResponse.json"
                );
            }

            public void close() throws IOException {
            }
        };

        IndixApiClient indixApiClient = IndixApiClientFactory.newIndixApiClient(mockHttpClient);

        try {
            ProductDetailsQuery productDetailsQuery = QueryFactory.newProductDetailsQuery()
                    .withCountryCode("AU")
                    .withMpid("c3c766f0b5fa6bfb9a6f5e2921779dcf")
                    .withAppId("123")
                    .withAppKey("123");
            CatalogPremiumProductDetailsResult sr = indixApiClient.getProductDetailsCatalogPremium(productDetailsQuery);

            System.out.println(sr.getProduct().getMpid());
        } finally {
            indixApiClient.close();
        }
    }

}