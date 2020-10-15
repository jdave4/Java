public class Cars {
    HashMap<String, Integer> Cars = new HashMap<>();

// .put adds items to the hash map
Cars.put("Honda", Accord);
Cars.put("Toyota", Forruner);
Cars.put("Dodge", Silverado);
Cars.put("Ford", Focus);

// show what the HashMap cars looks like
System.out.println(cars);
// => {Honda=Accord, Toyota=Forruner, Dodge=Silverado, Ford=Focus}


//.get retrieves data from the hash map
Integer value = car.get("Honda");
//returns the value associated with the key
System.out.println(value);
// => Accord
    
}
