package problem8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.stream.Collectors;

import com.sun.net.httpserver.Filter;

public class PuttingIntoPractice{
    public static void main(String ...args){    
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario","Milan");
        Trader alan = new Trader("Alan","Cambridge");
        Trader brian = new Trader("Brian","Cambridge");
		
		List<Transaction> transactions = Arrays.asList(
            new Transaction(brian, 2011, 300), 
            new Transaction(raoul, 2012, 1000),
            new Transaction(raoul, 2011, 400),
            new Transaction(mario, 2012, 710),	
            new Transaction(mario, 2012, 700),
            new Transaction(alan, 2012, 950)
        );	
        
        
        // Query 1: Find all transactions from year 2011 and sort them by value (small to high).

		System.out.println("All transactions from 2011 sorted by value: ");
		System.out.println(transactions.stream()
		.filter(t->t.getYear()==2011)
		.sorted(Comparator.comparing(Transaction::getValue))
		.collect(Collectors.toList()));
		

        
        // Query 2: What are all the unique cities where the traders work?
        System.out.println("Unique cities where traders workd: ");
		System.out.println(transactions.stream()
		.map(t->t.getTrader().getCity())
		.distinct()
		.collect(Collectors.joining(",")));

        // Query 3: Find all traders from Cambridge and sort them by name.
		System.out.println("Traders from Cambridge sorted by name:");
       System.out.println(transactions.stream()
        .filter(t->(t.getTrader().getCity().equalsIgnoreCase("Cambridge")))
        .map(t->t.getTrader().getName())
        .distinct()
        .sorted()
        .collect(Collectors.joining(",")));
   
        
        // Query 4: Return a string of all traders names sorted alphabetically.
       System.out.println("Traders names sorted alphabetically:");
       System.out.println(transactions.stream()
       .map(t->t.getTrader().getName())
       .distinct() 
       .sorted()
       .reduce("", (n1, n2) -> n1 + n2+" "));
       

        // Query 5: Are there any trader based in Milan?
		/*
		 * System.out.println("Are there any traders based in Milan? ");
		 * Optional<Transaction> milan=transactions.stream()
		 * .filter(t->t.getTrader().getCity().equalsIgnoreCase("Milan")) .findAny();
		 * 
		 * 
		 * if(milan.isPresent()) System.out.println("Yes");
		 * 
		 * else System.out.println("No");
		 */
       boolean milanBased =
               transactions.stream()
                           .anyMatch(transaction -> transaction.getTrader()
                                                               .getCity()
                                                               .equals("Milan")
                                    );
           System.out.println("Any match from Milan? "+milanBased);
      
        
   
        // Query 6: Update all transactions so that the traders from Milan are set to Cambridge.
        transactions.stream()
        .filter(t->t.getTrader().getCity().equalsIgnoreCase("Milan"))
        .forEach(t->t.getTrader().setCity("Cambridge"));
        
        System.out.println("Traders from Cambridge After Update");
        System.out.println(transactions.stream()
        .filter(t->t.getTrader().getCity()=="Cambridge")
        .map(t->t.getTrader().getName())
        .distinct()
        .collect(Collectors.joining(",")));
        
       
        
        // Query 7: What's the highest value in all the transactions?
       Optional<Transaction> highest= transactions.stream()
    		   .reduce((t1,t2)->t1.getValue()>t2.getValue()?t1:t2);
       
       highest.ifPresent(h->System.out.println("Highest is: "+h));
       
       // Query 7: What's the lowest value in all the transactions?
       Optional<Transaction> lowest= transactions.stream()
    		   .reduce((t1,t2)->t1.getValue()<t2.getValue()?t1:t2);
       
       lowest.ifPresent(l->System.out.println("Lowest is: "+l));
     
    }
}
