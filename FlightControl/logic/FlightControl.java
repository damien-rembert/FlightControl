package FlightControl.logic;

public class FlightControl {


    // This class uses hash maps to store the data (as there are multiple planes, places and flights). 
    // The use of hash maps allows us to access the data in the objects quickly using only a string (the id) as a key. It also avoids the creation of duplicate items.
    // The method addAiplane does not return anything but requires two arguments, that are required by the Airplane constructor. This constructor is called and the two arguments are passed on to it. The airplane object is added to the planes hash map.
    // The addFlight method works very much the same way but checks if the Place object arguments are already present in its places hash map. If not, they are added to it.
    // As a key for the flight, when adding it to the hash map, the flight toString is called and used.
    
}
