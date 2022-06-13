# Multithread Safe, Singleton Object Pool

This Java app is an example of multithread safe, singleton object pool. It is designed like a rent a car company: 15 customers are trying to rent a car, but the company only has 10 cars. So first threads to come get to rent a car for a random amount of time, while the others wait for their turn. The program terminates once all the customers' needs are satisfied.
