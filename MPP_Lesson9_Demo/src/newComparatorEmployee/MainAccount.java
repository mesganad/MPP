package newComparatorEmployee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class MainAccount {

	//Use Comparator.comparing and thenComparing to sort 
	//the list by balance and then by ownerName
	//Collect your stream into a list and print the sorted 
	//result to the console
	//List<Acount> accounts= Account
	
	public static void main(String[] args) {
		List<Account> accounts = new ArrayList<Account>() {
			{
				add(new Account("Jim", 5000, 1001));
				add(new Account("Jim", 10500, 1002));
				add(new Account("Bruce", 5300, 1003));
				add(new Account("Li", 5000, 1004));
				add(new Account("Sam", 9000, 1005));
				add(new Account("Rick", 11000, 1006));
			}
		};

	
		//using method reference
	//	Collections.sort(accounts,Comparator.comparing(Account::getBalance).thenComparing(Account::getOwnerName));
	
		Stream<Account> sortedAccts=accounts.stream().sorted(Comparator.comparing(Account::getBalance).thenComparing(Account::getOwnerName));
		System.out.println(sortedAccts.collect(Collectors.toList()));
		
		
		//Use the reduce method to produce a single space-separated String
		
			System.out.println(
				Stream.of("A", "good", "day", "to", "write", "some", "Java")
			          .reduce("", (s, t) -> 
			                    (new StringBuilder(s)).append(t + " ").toString()));
			
		}
			
		
		
	}


