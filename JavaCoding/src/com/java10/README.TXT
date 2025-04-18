Parallel Full GC for G1
--------------------------
What is Parallel Full GC for G1?
Java 10 improves the G1 garbage collector by enabling parallel processing for full garbage collections, 
reducing pause times and improving performance for applications with large heaps.

Example
----------
To enable parallel full GC for G1, use the JVM option:

java -XX:+UseG1GC -XX:+UnlockExperimentalVMOptions -XX:+UseParallelGCForG1
The parallel full GC for G1 enhances the performance of applications with large heaps by distributing the GC workload across multiple threads.