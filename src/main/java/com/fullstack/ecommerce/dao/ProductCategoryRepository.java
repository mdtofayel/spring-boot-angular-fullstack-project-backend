package com.fullstack.ecommerce.dao;

import com.fullstack.ecommerce.entity.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@RepositoryRestResource( collectionResourceRel = "productCategory", path="product-category")
public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Long> {
}


/*handleSearchProducts() {

    const theKeyword: string = this.route.snapshot.paramMap.get('keyword');


    //if we have a different keyword than previous
    //then set thePageNUmber to 1
    if(this.previousKeyword != theKeyword){
      this.thePageNumber = 1;
    }

    this.previousKeyword = theKeyword;

  console.log(`keyowrd=${theKeyword}, thePageNUmbe=${this.thePageNumber}`);
    // now search for the products using keyword
    this.productService.searchProductsPaginate(this.thePageNumber-1,
                                              this.thePageSize,
                                              theKeyword).subscribe(this.processResult());
  }

  searchProductPaginate(thePage: number,
                    thePageSize: number,
                    theKeyword: string): Observable<GetResponseProducts> {

// need to build URL based on keyword, page and size
const searchUrl = `${this.baseUrl}/search/findByNameContaining?name=${theKeyword}`
                                        + `&page=${thePage}&size=${thePageSize}`;

return this.httpClient.get<GetResponseProducts>(searchUrl);
}


  */