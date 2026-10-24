# System Design Practice — HLD & LLD

A hands-on learning repository for high-level system design,
low-level design, Java OOP, SOLID principles, and design patterns.

My focus is on understanding requirements, explaining design
tradeoffs, building implementations, and documenting what I learn.

> **Status:** Learning in progress. Topics and exercises are
> marked complete as notes, diagrams, and implementations are added.

## Contents

- [HLD vs. LLD](#hld-vs-lld)
- [Tools](#tools)
- [Repository Structure](#repository-structure)
- [LLD Roadmap](#lld-roadmap)
- [LLD Exercises](#lld-exercises)
- [HLD Roadmap](#hld-roadmap)
- [HLD Case Studies](#hld-case-studies)
- [Practice Approach](#practice-approach)
- [Running the Code](#running-the-code)

## HLD vs. LLD

| Area | High-Level Design | Low-Level Design |
|------|-------------------|------------------|
| Focus | Overall architecture | Detailed class and module design |
| Building blocks | Services, databases, caches, and queues | Classes, interfaces, methods, and data structures |
| Key concerns | Scalability, performance, and reliability | Correctness, maintainability, testability, and extensibility |
| Deliverables | Architecture diagrams and design tradeoffs | Class diagrams, code, and tests |

Both levels work together to turn requirements into a working system.

## Tools

| Tool | Purpose |
|------|---------|
| Java | OOP, design patterns, and coding exercises |
| IntelliJ IDEA | Development and debugging |
| Git & GitHub | Version control and learning progress |
| Excalidraw | Architecture and class diagrams |
| Markdown | Notes, requirements, and design decisions |

## Repository Structure

The repository will grow as topics and exercises are added.

```text
system-design-practice/
├── src/
│   └── lld/
│       ├── oop/
│       ├── relationships/
│       ├── solid/
│       ├── patterns/
│       ├── systems/
│       └── dsa/
├── docs/
│   ├── hld/
│   │   ├── fundamentals/
│   │   ├── building-blocks/
│   │   └── case-studies/
│   └── lld/
│       └── diagrams/
└── README.md
```

## LLD Roadmap

### Foundations

- [ ] Java basics
- [ ] OOP — encapsulation, abstraction, inheritance, and polymorphism
- [ ] Class relationships — association, aggregation, and composition
- [ ] Interfaces and abstract classes
- [ ] UML class diagrams
- [ ] SOLID principles
- [ ] Dependency Inversion Principle
- [ ] Dependency Injection

### Creational Design Patterns

- [ ] Singleton
- [ ] Builder
- [ ] Factory
- [ ] Factory Method
- [ ] Abstract Factory

### Structural Design Patterns

- [ ] Decorator
- [ ] Composite — file/folder example
- [ ] Adapter
- [ ] Facade
- [ ] Proxy

### Behavioral Design Patterns

- [ ] Observer
- [ ] State — ATM example
- [ ] Chain of Responsibility

### Supporting Skills

- [ ] Data structures and algorithms
- [ ] Schema design
- [ ] Testing and edge cases
- [ ] Refactoring
- [ ] Machine-coding practice

## LLD Exercises

Source-code links and design notes will be added as exercises are completed.

- [ ] Elevator system
- [ ] Parking lot
- [ ] LRU cache
- [ ] Notification system
- [ ] Rate limiter
- [ ] Payment system
- [ ] Booking system
- [ ] Splitwise
- [ ] Chess
- [ ] File system
- [ ] Food delivery application
- [ ] Vending machine
- [ ] Task scheduler

## HLD Roadmap

Start with the [HLD notes guide](docs/hld/README.md).

### System Fundamentals

- [ ] CPU, RAM, and storage
- [ ] Bits, bytes, and data-size estimation
- [ ] Request/response flow
- [ ] Network latency, bandwidth, and throughput
- [ ] Distributed systems fundamentals
- [ ] Vertical and horizontal scaling

### System Design Framework

- [ ] Clarify scope and assumptions
- [ ] Define functional requirements
- [ ] Define non-functional requirements
- [ ] Estimate traffic, storage, and bandwidth
- [ ] Design APIs and data models
- [ ] Draw the high-level architecture
- [ ] Identify bottlenecks and failure scenarios
- [ ] Explain scaling decisions and tradeoffs

### Databases and Data Distribution

- [ ] SQL vs. NoSQL
- [ ] Schema design and database selection
- [ ] Transactions and ACID properties
- [ ] Consistency and availability
- [ ] Database indexing
- [ ] Replication
- [ ] Range-based and hash-based sharding
- [ ] Shard keys, hot partitions, and resharding
- [ ] Consistent hashing and virtual nodes

### Caching and Redis

- [ ] Caching fundamentals
- [ ] Cache-aside pattern
- [ ] TTL and eviction policies
- [ ] Cache invalidation
- [ ] Redis data structures
- [ ] Distributed caching

### Networking and Traffic Management

- [ ] Load balancing — L4 vs. L7
- [ ] Load-balancing algorithms
- [ ] Health checks and failover
- [ ] Reverse proxies and TLS termination
- [ ] Forward proxies
- [ ] CDN and edge caching
- [ ] Cache hits, misses, and invalidation

### Messaging and Kafka

- [ ] Synchronous vs. asynchronous processing
- [ ] Message queues and publish/subscribe
- [ ] Kafka producers, consumers, and brokers
- [ ] Topics, partitions, and partitioning strategies
- [ ] Consumer groups and offsets
- [ ] Ordering and delivery semantics
- [ ] Replication, leader election, and acknowledgments
- [ ] Retention, retries, and dead-letter topics
- [ ] Fault tolerance and scaling

### Concurrency and Reliability

- [ ] Reservation and temporary-hold workflows
- [ ] Optimistic and pessimistic locking
- [ ] Idempotency and duplicate-event handling
- [ ] Timeouts, retries, and dead-letter queues
- [ ] Provider failover
- [ ] Logging, monitoring, and alerting

### Rate Limiting

- [ ] Fixed window
- [ ] Sliding window
- [ ] Token bucket
- [ ] Leaky bucket
- [ ] Distributed rate limiting with Redis
- [ ] Burst handling, throttling, and retry guidance

## HLD Case Studies

These are learning exercises inspired by common system design problems, not claims about the internal architecture of the named products.

| Case Study | Areas to Explore | Status |
|------------|------------------|--------|
| URL shortener | ID generation, Base62, redirects, caching, expiration, analytics | Planned |
| Booking system | Availability, temporary holds, concurrency, payments, cancellations | Planned |
| Notification system | SMS, email, push, queues, preferences, retries, delivery tracking | Planned |
| WhatsApp-style messaging | WebSockets, groups, presence, ordering, offline messages, encryption | Planned |
| Payment service | Payment lifecycle, idempotency, webhooks, refunds, reconciliation, ledger | Planned |
| Instagram-style platform | Media uploads, feeds, fan-out, CDN, sharding, notifications | Planned |
| Netflix-style streaming | Transcoding, adaptive bitrate, CDN, playback tracking, multi-region design | Planned |
| Ad click aggregator | Event ingestion, Kafka, aggregation, deduplication, stream vs. batch | Planned |
| Leaderboard | Redis sorted sets, score updates, top-N queries, ranking, ties | Planned |
| Google Maps-style service | Geospatial indexing, geocoding, map tiles, routing, ETA, traffic | Planned |
| Google Docs-style editor | Collaboration, WebSockets, OT/CRDT, versioning, offline synchronization | Planned |
| Log aggregator | Collection, parsing, buffering, indexing, retention, search, alerting | Planned |

## Practice Approach

### For LLD

1. Clarify requirements and expected behavior.
2. Identify classes, responsibilities, and relationships.
3. Sketch a class diagram.
4. Implement the design in Java.
5. Test common scenarios and edge cases.
6. Refactor and document design decisions.

### For HLD

1. Define scope and requirements.
2. Estimate traffic and storage needs.
3. Design APIs and data models.
4. Draw the system architecture.
5. Explore bottlenecks, failures, and scaling.
6. Compare alternatives and document tradeoffs.

For each completed exercise, aim to include:

- Requirements and assumptions
- Design diagrams
- Implementation or architecture explanation
- Tests or example scenarios
- Tradeoffs and limitations
- Lessons learned

## Running the Code

1. Clone this repository.
2. Open the project in IntelliJ IDEA.
3. Configure JDK 25.
4. Open the Java exercise you want to run.
5. Run its `main` method.

HLD notes and architecture diagrams belong under `docs/hld/`.
Java LLD implementations belong under `src/lld/`.
