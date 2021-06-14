package com.gospodenko.springeshop.endpoint;

import com.gospodenko.springeshop.dto.ProductDTO;
import com.gospodenko.springeshop.service.ProductService;
import com.gospodenko.springeshop.ws.greeting.GetGreetingRequest;
import com.gospodenko.springeshop.ws.products.GetProductsResponse;
import com.gospodenko.springeshop.ws.products.ProductsWS;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import javax.xml.datatype.DatatypeConfigurationException;

public class ProductsEndpoint {
    public static final String NAMESPACE_URL = "http://gospodenko.com/springeshop/ws/products";

    private ProductService productService;

    @Autowired
    public ProductsEndpoint(ProductService productService) {
        this.productService = productService;
    }

    @PayloadRoot(namespace = NAMESPACE_URL, localPart = "getProductsRequest")
    @ResponsePayload
    public GetProductsResponse getProductWS(@RequestPayload GetGreetingRequest request) throws DatatypeConfigurationException {
        GetProductsResponse response = new GetProductsResponse();
        productService.getAll().forEach(dto -> response.getProducts().add(createProductWS(dto)));
        return response;
    }

    private ProductsWS createProductWS(ProductDTO dto) {
        ProductsWS ws = new ProductsWS();
        ws.setId(dto.getId());
        ws.setPrice(Double.parseDouble(dto.getPrice().toString()));
        ws.setTitle(dto.getTitle());
        return ws;
    }

}
