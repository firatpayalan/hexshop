# hexagonal architecture based e-commerce example

demonstration of hexagonal architecture sample in kotlin lang

## Description

Primary motivation of hexagonal architecture is decoupling components to manage your business more precisely. In this example, the simple e-commerce-themed application has been built in Kotlin w/spring boot.

### Getting Started
- application; might be your communication layer. 

- domain; all of your business can be executed at here.
  - entity; plain objects/data in which represents your business
  - interaction; to orchestrate your business flows. mostly includes implementations. 
  - port; contracts for your business rules. for example; add item, search user
  - repository; I/O layer for your domain. this can be your database or any kind of rpc endpoint. 

- infrastructure; technical details either executing your business or maintaining your application. for example; configuration management, database/message queue settings codes 

## Authors

Contributors names and contact info

[@firatpayalan](https://twitter.com/firatfirat_)

## Acknowledgments

Inspiration, code snippets, etc.
* [netflix-Ready for changes with Hexagonal Architecture](https://medium.com/p/b315ec967749)
* [baeldung-hexagonal-architecture-ddd-spring](https://www.baeldung.com/hexagonal-architecture-ddd-spring)
* [itnext-hexagonal-architecture-principles-practical-example-in-java](https://itnext.io/hexagonal-architecture-principles-practical-example-in-java-364bb2e50075)
* [alistair-cockburn-hexagonal-architecture](https://alistair.cockburn.us/hexagonal-architecture/)
