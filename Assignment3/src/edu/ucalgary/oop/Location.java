package edu.ucalgary.oop;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Location {
    private String name;
    private String address;
    private DisasterVictim[] occupants;
    private Supply[] supplies;

    public Location(String name, String address) {
        if (name == null || address == null) {
            throw new IllegalArgumentException("Name and address cannot be null.");
        }
        this.name = name;
        this.address = address;
        this.occupants = new DisasterVictim[0];
        this.supplies = new Supply[0];
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        if (name == null) {
            throw new IllegalArgumentException("Name cannot be null.");
        }
        this.name = name;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        if (address == null) {
            throw new IllegalArgumentException("Address cannot be null.");
        }
        this.address = address;
    }

    public DisasterVictim[] getOccupants() {
        return this.occupants;
    }

    public void setOccupants(DisasterVictim[] occupants) {
        this.occupants = occupants;
    }

    public Supply[] getSupplies() {
        return this.supplies;
    }

    public void setSupplies(Supply[] supplies) {
        this.supplies = supplies;
    }

    public void addOccupant(DisasterVictim occupant) {
        occupants = Arrays.copyOf(occupants, occupants.length + 1);
        occupants[occupants.length - 1] = occupant;
    }

    public void removeOccupant(DisasterVictim occupant) {
        List<DisasterVictim> tempList = new ArrayList<>(Arrays.asList(occupants));
        tempList.remove(occupant);
        occupants = tempList.toArray(new DisasterVictim[0]);
    }

    public void addSupply(Supply supply) {
        supplies = Arrays.copyOf(supplies, supplies.length + 1);
        supplies[supplies.length - 1] = supply;
    }

    public void removeSupply(Supply supply) {
        List<Supply> tempList = new ArrayList<>(Arrays.asList(supplies));
        tempList.remove(supply);
        supplies = tempList.toArray(new Supply[0]);
    }
}
