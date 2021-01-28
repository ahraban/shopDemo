# shopDemo
simple eshop example

- java 8,  maven, spring boot, hibernate, swagger2, H2 database
- 2x REST endpoint:
  - POST /purchase = accepts + validates JSON / XML request body
              {
          "title": "Prim",
          "price": "250000", 
          "description": "A watch with a water fountain picture",
          "fountain": "R0lGODlhAQABAIAAAAUEBA"
          }
  - GET /records = returns all DB records in JSON response body
  
