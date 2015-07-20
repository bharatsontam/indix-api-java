package client;

import client.impl.IndixApiClientFactory;
import common.ResourceUtils;
import exception.IndixApiException;
import exception.InternalServerException;
import httpClient.HttpClient;
import models.searchResponse.searchResult.*;
import org.junit.Test;
import query.Query;
import query.QueryFactory;
import query.SearchQuery;

import java.io.IOException;
import java.net.URI;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class IndixApiClientSearchTest {

    @Test
    public void getProductsUniversal() throws IOException, IndixApiException {
        HttpClient mockHttpClient = new HttpClient() {
            public String GET(URI uri) throws IOException, IndixApiException {
                return ResourceUtils.getTestResource(getClass().getClassLoader(), "search-json-responses0/universalSearchResponse.json");
            }

            public void close() throws IOException { }
        };

        IndixApiClient indixApiClient = IndixApiClientFactory.newIndixApiClient(mockHttpClient);

        try {
            Query searchQuery = QueryFactory.newSearchQuery()
                    .withQ("nike")
                    .withCountryCode("US")
                    .withStoresCount(3)
                    .withAppId("123")
                    .withAppKey("123");

            UniversalSearchResult sr = indixApiClient.getProductsUniversal(searchQuery);
            assertEquals(18672, sr.getCount());
            assertEquals(10, sr.getProducts().size());
            assertEquals(0, sr.getFacets().size());
            assertEquals("31c2300c8e33393cbe62762dbca01751", sr.getProducts().get(0).getMpid());
        } finally {
            indixApiClient.close();
        }
    }

    @Test
    public void getProductsOffersPremium() throws IOException, IndixApiException {
        HttpClient mockHttpClient = new HttpClient() {
            public String GET(URI uri) throws IOException, IndixApiException {
                return ResourceUtils.getTestResource(getClass().getClassLoader(), "search-json-responses0/offersPremiumSearchResponse.json");
            }

            public void close() throws IOException { }
        };

        IndixApiClient indixApiClient = IndixApiClientFactory.newIndixApiClient(mockHttpClient);

        try {
            Query searchQuery = QueryFactory.newSearchQuery()
                    .withQ("nike")
                    .withCountryCode("US")
                    .withStoresCount(3)
                    .withAppId("123")
                    .withAppKey("123");

            OffersSearchResult sr = indixApiClient.getProductsOffersPremium(searchQuery);
            assertEquals(18672, sr.getCount());
            assertEquals(10, sr.getProducts().size());
            assertEquals(0, sr.getFacets().size());
            assertEquals("31c2300c8e33393cbe62762dbca01751", sr.getProducts().get(0).getMpid());
        } finally {
            indixApiClient.close();
        }
    }

    @Test
    public void getProductsOffersStandard() throws IOException, IndixApiException {
        HttpClient mockHttpClient = new HttpClient() {
            public String GET(URI uri) throws IOException, IndixApiException {
                return ResourceUtils.getTestResource(getClass().getClassLoader(), "search-json-responses0/offersStandardSearchResponse.json");
            }

            public void close() throws IOException { }
        };

        IndixApiClient indixApiClient = IndixApiClientFactory.newIndixApiClient(mockHttpClient);

        try {
            Query searchQuery = QueryFactory.newSearchQuery()
                    .withQ("nike")
                    .withCountryCode("US")
                    .withStoresCount(3)
                    .withStoreId(Arrays.asList(270))
                    .withAppId("123")
                    .withAppKey("123");

            OffersSearchResult sr = indixApiClient.getProductsOffersStandard(searchQuery);
            assertEquals(11624, sr.getCount());
            assertEquals(10, sr.getProducts().size());
            assertEquals(0, sr.getFacets().size());
            assertEquals("31c2300c8e33393cbe62762dbca01751", sr.getProducts().get(0).getMpid());
        } finally {
            indixApiClient.close();
        }
    }

    @Test
    public void getProductsCatalogStandard() throws IOException, IndixApiException {
        HttpClient mockHttpClient = new HttpClient() {
            public String GET(URI uri) throws IOException, IndixApiException {
                return ResourceUtils.getTestResource(getClass().getClassLoader(), "search-json-responses0/catalogStandardSearchResponse.json");
            }

            public void close() throws IOException { }
        };

        IndixApiClient indixApiClient = IndixApiClientFactory.newIndixApiClient(mockHttpClient);

        try {
            Query searchQuery = QueryFactory.newSearchQuery()
                    .withQ("nike")
                    .withCountryCode("US")
                    .withStoresCount(3)
                    .withAppId("123")
                    .withAppKey("123");

            CatalogStandardSearchResult sr = indixApiClient.getProductsCatalogStandard(searchQuery);
            assertEquals(18672, sr.getCount());
            assertEquals(10, sr.getProducts().size());
            assertEquals(0, sr.getFacets().size());
            assertEquals("31c2300c8e33393cbe62762dbca01751", sr.getProducts().get(0).getMpid());
        } finally {
            indixApiClient.close();
        }
    }

    @Test
    public void getProductsCatalogPremium() throws IOException, IndixApiException {
        HttpClient mockHttpClient = new HttpClient() {
            public String GET(URI uri) throws IOException, IndixApiException {
                return ResourceUtils.getTestResource(getClass().getClassLoader(), "search-json-responses0/catalogPremiumSearchResponse.json");
            }

            public void close() throws IOException { }
        };

        IndixApiClient indixApiClient = IndixApiClientFactory.newIndixApiClient(mockHttpClient);

        try {
            SearchQuery searchQuery = QueryFactory.newSearchQuery()
                    .withQ("nike")
                    .withCountryCode("US")
                    .withStoresCount(3)
                    .withAppId("123")
                    .withAppKey("123");

            CatalogPremiumSearchResult sr = indixApiClient.getProductsCatalogPremium(searchQuery);
            assertEquals(18672, sr.getCount());
            assertEquals(10, sr.getProducts().size());
            assertEquals(0, sr.getFacets().size());
            assertEquals("31c2300c8e33393cbe62762dbca01751", sr.getProducts().get(0).getMpid());
        } finally {
            indixApiClient.close();
        }
    }

    @Test
    public void getProductsSummary() throws IOException, IndixApiException {
        HttpClient mockHttpClient = new HttpClient() {
            public String GET(URI uri) throws IOException, IndixApiException {
                return ResourceUtils.getTestResource(getClass().getClassLoader(), "search-json-responses0/summarySearchResponse.json");
            }

            public void close() throws IOException { }
        };

        IndixApiClient indixApiClient = IndixApiClientFactory.newIndixApiClient(mockHttpClient);

        try {
            Query searchQuery = QueryFactory.newSearchQuery()
                    .withQ("nike")
                    .withCountryCode("US")
                    .withStoresCount(3)
                    .withAppId("123")
                    .withAppKey("123");

            SummarySearchResult sr = indixApiClient.getProductsSummary(searchQuery);
            assertEquals(18672, sr.getCount());
            assertEquals(10, sr.getProducts().size());
            assertEquals(0, sr.getFacets().size());
            assertEquals("31c2300c8e33393cbe62762dbca01751", sr.getProducts().get(0).getMpid());
        } finally {
            indixApiClient.close();
        }
    }

    @Test(expected= InternalServerException.class)
    public void getProductsCatalogPremiumFailsIfInputResponseIsMalformed0()
            throws IOException, IndixApiException {
        HttpClient mockHttpClient = new HttpClient() {
            public String GET(URI uri) throws IOException, IndixApiException {
                return ResourceUtils.getTestResource(getClass().getClassLoader(), "search-json-responses0/universalSearchResponse.json");
            }

            public void close() throws IOException { }
        };

        IndixApiClient indixApiClient = IndixApiClientFactory.newIndixApiClient(mockHttpClient);

        try {
            Query searchQuery = QueryFactory.newSearchQuery()
                    .withQ("nike")
                    .withCountryCode("US")
                    .withStoresCount(3)
                    .withAppId("123")
                    .withAppKey("123");

            CatalogPremiumSearchResult sr = indixApiClient.getProductsCatalogPremium(searchQuery);
            System.out.println(sr.getCount());
        } finally {
            indixApiClient.close();
        }
    }

    @Test(expected=InternalServerException.class)
    public void getProductsCatalogPremiumFailsIfInputResponseIsMalformed1()
            throws IOException, IndixApiException {
        HttpClient mockHttpClient = new HttpClient() {
            public String GET(URI uri) throws IOException, IndixApiException {
                return ResourceUtils.getTestResource(getClass().getClassLoader(), "search-json-responses0/offersPremiumSearchResponse.json");
            }

            public void close() throws IOException { }
        };

        IndixApiClient indixApiClient = IndixApiClientFactory.newIndixApiClient(mockHttpClient);

        try {
            Query searchQuery = QueryFactory.newSearchQuery()
                    .withQ("nike")
                    .withCountryCode("US")
                    .withStoresCount(3)
                    .withAppId("123")
                    .withAppKey("123");

            CatalogPremiumSearchResult sr = indixApiClient.getProductsCatalogPremium(searchQuery);
            System.out.println(sr.getCount());
        } finally {
            indixApiClient.close();
        }
    }

    @Test(expected=InternalServerException.class)
    public void getProductsCatalogPremiumFailsIfInputResponseIsMalformed2()
            throws IOException, IndixApiException {
        HttpClient mockHttpClient = new HttpClient() {
            public String GET(URI uri) throws IOException, IndixApiException {
                return ResourceUtils.getTestResource(getClass().getClassLoader(), "search-json-responses0/offersStandardSearchResponse.json");
            }

            public void close() throws IOException { }
        };

        IndixApiClient indixApiClient = IndixApiClientFactory.newIndixApiClient(mockHttpClient);

        try {
            Query searchQuery = QueryFactory.newSearchQuery()
                    .withQ("nike")
                    .withCountryCode("US")
                    .withStoresCount(3)
                    .withAppId("123")
                    .withAppKey("123");

            CatalogPremiumSearchResult sr = indixApiClient.getProductsCatalogPremium(searchQuery);
            System.out.println(sr.getCount());
        } finally {
            indixApiClient.close();
        }
    }

    @Test(expected=InternalServerException.class)
    public void getProductsCatalogStandardFailsIfInputResponseIsMalformed0()
            throws IOException, IndixApiException {
        HttpClient mockHttpClient = new HttpClient() {
            public String GET(URI uri) throws IOException, IndixApiException {
                return ResourceUtils.getTestResource(getClass().getClassLoader(), "search-json-responses0/universalSearchResponse.json");
            }

            public void close() throws IOException { }
        };

        IndixApiClient indixApiClient = IndixApiClientFactory.newIndixApiClient(mockHttpClient);

        try {
            Query searchQuery = QueryFactory.newSearchQuery()
                    .withQ("nike")
                    .withCountryCode("US")
                    .withStoresCount(3)
                    .withAppId("123")
                    .withAppKey("123");

            CatalogStandardSearchResult sr = indixApiClient.getProductsCatalogStandard(searchQuery);
            System.out.println(sr.getCount());
        } finally {
            indixApiClient.close();
        }
    }

    @Test(expected=InternalServerException.class)
    public void getProductsCatalogStandardFailsIfInputResponseIsMalformed1()
            throws IOException, IndixApiException {
        HttpClient mockHttpClient = new HttpClient() {
            public String GET(URI uri) throws IOException, IndixApiException {
                return ResourceUtils.getTestResource(getClass().getClassLoader(), "search-json-responses0/catalogPremiumSearchResponse.json");
            }

            public void close() throws IOException { }
        };

        IndixApiClient indixApiClient = IndixApiClientFactory.newIndixApiClient(mockHttpClient);

        try {
            Query searchQuery = QueryFactory.newSearchQuery()
                    .withQ("nike")
                    .withCountryCode("US")
                    .withStoresCount(3)
                    .withAppId("123")
                    .withAppKey("123");

            CatalogStandardSearchResult sr = indixApiClient.getProductsCatalogStandard(searchQuery);
            System.out.println(sr.getCount());
        } finally {
            indixApiClient.close();
        }
    }

    @Test(expected=InternalServerException.class)
    public void getProductsCatalogStandardFailsIfInputResponseIsMalformed2()
            throws IOException, IndixApiException {
        HttpClient mockHttpClient = new HttpClient() {
            public String GET(URI uri) throws IOException, IndixApiException {
                return ResourceUtils.getTestResource(getClass().getClassLoader(), "search-json-responses0/offersPremiumSearchResponse.json");
            }

            public void close() throws IOException { }
        };

        IndixApiClient indixApiClient = IndixApiClientFactory.newIndixApiClient(mockHttpClient);

        try {
            Query searchQuery = QueryFactory.newSearchQuery()
                    .withQ("nike")
                    .withCountryCode("US")
                    .withStoresCount(3)
                    .withAppId("123")
                    .withAppKey("123");

            CatalogStandardSearchResult sr = indixApiClient.getProductsCatalogStandard(searchQuery);
            System.out.println(sr.getCount());
        } finally {
            indixApiClient.close();
        }
    }

    @Test(expected=InternalServerException.class)
    public void getProductsCatalogStandardFailsIfInputResponseIsMalformed3()
            throws IOException, IndixApiException {
        HttpClient mockHttpClient = new HttpClient() {
            public String GET(URI uri) throws IOException, IndixApiException {
                return ResourceUtils.getTestResource(getClass().getClassLoader(), "search-json-responses0/offersStandardSearchResponse.json");
            }

            public void close() throws IOException { }
        };

        IndixApiClient indixApiClient = IndixApiClientFactory.newIndixApiClient(mockHttpClient);

        try {
            Query searchQuery = QueryFactory.newSearchQuery()
                    .withQ("nike")
                    .withCountryCode("US")
                    .withStoresCount(3)
                    .withAppId("123")
                    .withAppKey("123");

            CatalogStandardSearchResult sr = indixApiClient.getProductsCatalogStandard(searchQuery);
            System.out.println(sr.getCount());
        } finally {
            indixApiClient.close();
        }
    }

    @Test(expected=InternalServerException.class)
    public void getProductsOffersPremiumFailsIfInputResponseIsMalformed0()
            throws IOException, IndixApiException {
        HttpClient mockHttpClient = new HttpClient() {
            public String GET(URI uri) throws IOException, IndixApiException {
                return ResourceUtils.getTestResource(getClass().getClassLoader(), "search-json-responses0/universalSearchResponse.json");
            }

            public void close() throws IOException { }
        };

        IndixApiClient indixApiClient = IndixApiClientFactory.newIndixApiClient(mockHttpClient);

        try {
            Query searchQuery = QueryFactory.newSearchQuery()
                    .withQ("nike")
                    .withCountryCode("US")
                    .withStoresCount(3)
                    .withAppId("123")
                    .withAppKey("123");

            OffersSearchResult sr = indixApiClient.getProductsOffersPremium(searchQuery);
            System.out.println(sr.getCount());
        } finally {
            indixApiClient.close();
        }
    }

    @Test(expected=InternalServerException.class)
    public void getProductsOffersPremiumFailsIfInputResponseIsMalformed1()
            throws IOException, IndixApiException {
        HttpClient mockHttpClient = new HttpClient() {
            public String GET(URI uri) throws IOException, IndixApiException {
                return ResourceUtils.getTestResource(getClass().getClassLoader(), "search-json-responses0/catalogPremiumSearchResponse.json");
            }

            public void close() throws IOException { }
        };

        IndixApiClient indixApiClient = IndixApiClientFactory.newIndixApiClient(mockHttpClient);

        try {
            Query searchQuery = QueryFactory.newSearchQuery()
                    .withQ("nike")
                    .withCountryCode("US")
                    .withStoresCount(3)
                    .withAppId("123")
                    .withAppKey("123");

            OffersSearchResult sr = indixApiClient.getProductsOffersPremium(searchQuery);
            System.out.println(sr.getCount());
        } finally {
            indixApiClient.close();
        }
    }

    @Test(expected=InternalServerException.class)
    public void getProductsOffersPremiumFailsIfInputResponseIsMalformed2()
            throws IOException, IndixApiException {
        HttpClient mockHttpClient = new HttpClient() {
            public String GET(URI uri) throws IOException, IndixApiException {
                return ResourceUtils.getTestResource(getClass().getClassLoader(), "search-json-responses0/catalogStandardSearchResponse.json");
            }

            public void close() throws IOException { }
        };

        IndixApiClient indixApiClient = IndixApiClientFactory.newIndixApiClient(mockHttpClient);

        try {
            Query searchQuery = QueryFactory.newSearchQuery()
                    .withQ("nike")
                    .withCountryCode("US")
                    .withStoresCount(3)
                    .withAppId("123")
                    .withAppKey("123");

            OffersSearchResult sr = indixApiClient.getProductsOffersPremium(searchQuery);
            System.out.println(sr.getCount());
        } finally {
            indixApiClient.close();
        }
    }

    @Test(expected=InternalServerException.class)
    public void getProductsOffersStandardFailsIfInputResponseIsMalformed0()
            throws IOException, IndixApiException {
        HttpClient mockHttpClient = new HttpClient() {
            public String GET(URI uri) throws IOException, IndixApiException {
                return ResourceUtils.getTestResource(getClass().getClassLoader(), "search-json-responses0/universalSearchResponse.json");
            }

            public void close() throws IOException { }
        };

        IndixApiClient indixApiClient = IndixApiClientFactory.newIndixApiClient(mockHttpClient);

        try {
            Query searchQuery = QueryFactory.newSearchQuery()
                    .withQ("nike")
                    .withCountryCode("US")
                    .withStoresCount(3)
                    .withAppId("123")
                    .withAppKey("123");

            OffersSearchResult sr = indixApiClient.getProductsOffersStandard(searchQuery);
            System.out.println(sr.getCount());
        } finally {
            indixApiClient.close();
        }
    }

    @Test(expected=InternalServerException.class)
    public void getProductsOffersStandardFailsIfInputResponseIsMalformed1()
            throws IOException, IndixApiException {
        HttpClient mockHttpClient = new HttpClient() {
            public String GET(URI uri) throws IOException, IndixApiException {
                return ResourceUtils.getTestResource(getClass().getClassLoader(), "search-json-responses0/catalogPremiumSearchResponse.json");
            }

            public void close() throws IOException { }
        };

        IndixApiClient indixApiClient = IndixApiClientFactory.newIndixApiClient(mockHttpClient);

        try {
            Query searchQuery = QueryFactory.newSearchQuery()
                    .withQ("nike")
                    .withCountryCode("US")
                    .withStoresCount(3)
                    .withAppId("123")
                    .withAppKey("123");

            OffersSearchResult sr = indixApiClient.getProductsOffersStandard(searchQuery);
            System.out.println(sr.getCount());
        } finally {
            indixApiClient.close();
        }
    }

    @Test(expected=InternalServerException.class)
    public void getProductsOffersStandardFailsIfInputResponseIsMalformed2()
            throws IOException, IndixApiException {
        HttpClient mockHttpClient = new HttpClient() {
            public String GET(URI uri) throws IOException, IndixApiException {
                return ResourceUtils.getTestResource(getClass().getClassLoader(), "search-json-responses0/catalogStandardSearchResponse.json");
            }

            public void close() throws IOException { }
        };

        IndixApiClient indixApiClient = IndixApiClientFactory.newIndixApiClient(mockHttpClient);

        try {
            Query searchQuery = QueryFactory.newSearchQuery()
                    .withQ("nike")
                    .withCountryCode("US")
                    .withStoresCount(3)
                    .withAppId("123")
                    .withAppKey("123");

            OffersSearchResult sr = indixApiClient.getProductsOffersStandard(searchQuery);
            System.out.println(sr.getCount());
        } finally {
            indixApiClient.close();
        }
    }

    @Test(expected=InternalServerException.class)
    public void getProductsSummaryFailsIfInputResponseIsMalformed0()
            throws IOException, IndixApiException {
        HttpClient mockHttpClient = new HttpClient() {
            public String GET(URI uri) throws IOException, IndixApiException {
                return ResourceUtils.getTestResource(getClass().getClassLoader(), "search-json-responses0/universalSearchResponse.json");
            }

            public void close() throws IOException { }
        };

        IndixApiClient indixApiClient = IndixApiClientFactory.newIndixApiClient(mockHttpClient);

        try {
            Query searchQuery = QueryFactory.newSearchQuery()
                    .withQ("nike")
                    .withCountryCode("US")
                    .withStoresCount(3)
                    .withAppId("123")
                    .withAppKey("123");

            SummarySearchResult sr = indixApiClient.getProductsSummary(searchQuery);
            System.out.println(sr.getCount());
        } finally {
            indixApiClient.close();
        }
    }

    @Test(expected=InternalServerException.class)
    public void getProductsSummaryFailsIfInputResponseIsMalformed1()
            throws IOException, IndixApiException {
        HttpClient mockHttpClient = new HttpClient() {
            public String GET(URI uri) throws IOException, IndixApiException {
                return ResourceUtils.getTestResource(getClass().getClassLoader(), "search-json-responses0/catalogPremiumSearchResponse.json");
            }

            public void close() throws IOException { }
        };

        IndixApiClient indixApiClient = IndixApiClientFactory.newIndixApiClient(mockHttpClient);

        try {
            Query searchQuery = QueryFactory.newSearchQuery()
                    .withQ("nike")
                    .withCountryCode("US")
                    .withStoresCount(3)
                    .withAppId("123")
                    .withAppKey("123");

            SummarySearchResult sr = indixApiClient.getProductsSummary(searchQuery);
            System.out.println(sr.getCount());
        } finally {
            indixApiClient.close();
        }
    }

    @Test(expected=InternalServerException.class)
    public void getProductsSummaryFailsIfInputResponseIsMalformed2()
            throws IOException, IndixApiException {
        HttpClient mockHttpClient = new HttpClient() {
            public String GET(URI uri) throws IOException, IndixApiException {
                return ResourceUtils.getTestResource(getClass().getClassLoader(), "search-json-responses0/catalogStandardSearchResponse.json");
            }

            public void close() throws IOException { }
        };

        IndixApiClient indixApiClient = IndixApiClientFactory.newIndixApiClient(mockHttpClient);

        try {
            Query searchQuery = QueryFactory.newSearchQuery()
                    .withQ("nike")
                    .withCountryCode("US")
                    .withStoresCount(3)
                    .withAppId("123")
                    .withAppKey("123");

            SummarySearchResult sr = indixApiClient.getProductsSummary(searchQuery);
            System.out.println(sr.getCount());
        } finally {
            indixApiClient.close();
        }
    }

    @Test(expected=InternalServerException.class)
    public void getProductsSummaryFailsIfInputResponseIsMalformed3()
            throws IOException, IndixApiException {
        HttpClient mockHttpClient = new HttpClient() {
            public String GET(URI uri) throws IOException, IndixApiException {
                return ResourceUtils.getTestResource(getClass().getClassLoader(), "search-json-responses0/offersPremiumSearchResponse.json");
            }

            public void close() throws IOException { }
        };

        IndixApiClient indixApiClient = IndixApiClientFactory.newIndixApiClient(mockHttpClient);

        try {
            Query searchQuery = QueryFactory.newSearchQuery()
                    .withQ("nike")
                    .withCountryCode("US")
                    .withStoresCount(3)
                    .withAppId("123")
                    .withAppKey("123");

            SummarySearchResult sr = indixApiClient.getProductsSummary(searchQuery);
            System.out.println(sr.getCount());
        } finally {
            indixApiClient.close();
        }
    }

    @Test(expected=InternalServerException.class)
    public void getProductsSummaryFailsIfInputResponseIsMalformed4()
            throws IOException, IndixApiException {
        HttpClient mockHttpClient = new HttpClient() {
            public String GET(URI uri) throws IOException, IndixApiException {
                return ResourceUtils.getTestResource(getClass().getClassLoader(), "search-json-responses0/offersStandardSearchResponse.json");
            }

            public void close() throws IOException { }
        };

        IndixApiClient indixApiClient = IndixApiClientFactory.newIndixApiClient(mockHttpClient);

        try {
            Query searchQuery = QueryFactory.newSearchQuery()
                    .withQ("nike")
                    .withCountryCode("US")
                    .withStoresCount(3)
                    .withAppId("123")
                    .withAppKey("123");

            SummarySearchResult sr = indixApiClient.getProductsSummary(searchQuery);
            System.out.println(sr.getCount());
        } finally {
            indixApiClient.close();
        }
    }
}
