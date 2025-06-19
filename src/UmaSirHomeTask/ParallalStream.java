package UmaSirHomeTask;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ParallalStream {
    public static long factorial(int n){
        long result=1;
        for (int i=1;i<=n;i++){
            result=result*i;
        }
        return result;
    }
    public static void main(String[] args) {
        //parallel Stream=> a type of stream that enables parallel processing of element .
        //=> allowing multiple thread

//        The main difference between Sequential and Parallel Stream is listed below:
//
//        Sequential Streams: Process elements in a sequential manner, one element at a time
//        Parallel Streams: Process elements in parallel, utilizing multiple CPU cores.



        long startTime=System.currentTimeMillis();
        List<Integer>list= Stream.iterate(1,i->i+1).limit(1000).collect(Collectors.toList());
       List<Long>factorial=list.stream().map(i->ParallalStream.factorial(i)).collect(Collectors.toList());

        long endTim=System.currentTimeMillis();
        System.out.println("time taken with sequesntial stream "+(endTim-startTime));

        // parallel stream

         startTime=System.currentTimeMillis();
       list= Stream.iterate(1,i->i+1).limit(1000).collect(Collectors.toList());
        factorial=list.parallelStream().map(i->ParallalStream.factorial(i)).collect(Collectors.toList());

        endTim=System.currentTimeMillis();
        System.out.println("time taken with parallal stream "+ (endTim-startTime));




        // one more example of parallel Stream

        //parallel stream
        List<Integer> numbers
                = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
          long stTime=System.currentTimeMillis();
        numbers.parallelStream().filter(n -> n % 2 == 0).forEach(System.out::print);
        System.out.println();
        System.out.println(System.currentTimeMillis()-stTime);

        //sequential stream
        stTime=System.currentTimeMillis();
        numbers.stream().filter(n -> n % 2 == 0).forEach(System.out::print);
        System.out.println();
        System.out.println(System.currentTimeMillis()-stTime);




        // parallel stream with orderedFforEach
        List<Integer>lsst=Arrays.asList(10,20,30,40,50,60,70,80);
        lsst.parallelStream().forEach(i-> System.out.print(i+" "));
        System.out.println();
        lsst.parallelStream().forEachOrdered(i-> System.out.print(" "+i));
    }
}
