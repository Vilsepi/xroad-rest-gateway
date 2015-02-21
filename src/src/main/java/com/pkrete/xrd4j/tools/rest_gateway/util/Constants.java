package com.pkrete.xrd4j.tools.rest_gateway.util;

/**
 * REST Gateway constants.
 *
 * @author Petteri Kivimäki
 */
public class Constants {

    /**
     * Constructs and initializes a new Constants object. Should never
     * be used.
     */
    private Constants() {
    }
    /**
     * Properties files
     */
    public static final String PROPERTIES_FILE_PROVIDER_GATEWAY = "/provider-gateway.properties";
    public static final String PROPERTIES_FILE_CONSUMER_GATEWAY = "/consumer-gateway.properties";
    public static final String PROPERTIES_FILE_PROVIDERS = "/providers.properties";
    public static final String PROPERTIES_FILE_CONSUMERS = "/consumers.properties";
    /**
     * Endpoint properties - used by both provider and consumer endpoints
     *
     */
    public static final String ENDPOINT_PROPS_ID = "id";
    public static final String ENDPOINT_PROPS_VERB = "verb";
    public static final String ENDPOINT_PROPS_SERVICE_NAMESPACE_DESERIALIZE = "namespace.deserialize";
    public static final String ENDPOINT_PROPS_SERVICE_NAMESPACE_SERIALIZE = "namespace.serialize";
    public static final String ENDPOINT_PROPS_SERVICE_NAMESPACE_PREFIX_SERIALIZE = "namespace.prefix.serialize";
    /**
     * Provider properties
     */
    public static final String PROVIDER_PROPS_URL = "url";
    public static final String PROVIDER_PROPS_CONTENT_TYPE = "contenttype";
    public static final String PROVIDER_PROPS_ACCEPT = "accept";
    public static final String PROVIDER_PROPS_OBJECT_TAG = "objecttag";
    public static final String PROVIDER_PROPS_ARRAY_TAG = "arraytag";
    public static final String PROVIDER_PROPS_ATTACHMENT = "response.attachment";
    public static final String PROVIDER_PROPS_SEND_XRD_HEADERS = "request.xrdheaders";
    /**
     * Consumer properties
     */
    public static final String CONSUMER_PROPS_PATH = "path";
    public static final String CONSUMER_PROPS_ID_CLIENT = "id.client";
    public static final String CONSUMER_PROPS_SECURITY_SERVER_URL = "ss.url";
    public static final String CONSUMER_PROPS_MOD_URL = "response.modurl";
    /**
     * Standard HTTP headers
     */
    public static final String HTTP_HEADER_ACCEPT = "Accept";
    public static final String HTTP_HEADER_CONTENT_TYPE = "Content-Type";
    /**
     * X-Road specific custom HTTP headers
     */
    public static final String XRD_HEADER_CLIENT = "X-XRd-Client";
    public static final String XRD_HEADER_SERVICE = "X-XRd-Service";
    public static final String XRD_HEADER_USER_ID = "X-XRd-UserId";
    public static final String XRD_HEADER_MESSAGE_ID = "X-XRd-MessageId";
    public static final String XRD_HEADER_NAMESPACE_SERIALIZE = "X-XRd-NamespaceSerialize";
    public static final String XRD_HEADER_NAMESPACE_PREFIX_SERIALIZE = "X-XRd-NamespacePrefixSerialize";
    /**
     * Other constants.
     */
    public static final String PARAM_REQUEST_BODY = "RESTGatewayRequestBody";
    /**
     * HTTP error messages
     */
    public static final String ERROR_404 = "404 Not Found";
    public static final String ERROR_500 = "500 Internal Server Error";
}
