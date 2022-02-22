package enums;

import java.util.ArrayList;

public class StoreItem {

/*    enum Building {
        CURSOR,
        GRANDMA,
        FARM,
        MINE,
        FACTORY,
        BANK,
        TEMPLE,
        WIZARDTOWER,
        SHIPMENT,
        ALCHEMYLAB,
        PORTAL,
        TIMEMACHINE,
        ANTIMATTERCONDENSER,
        PRISM,
        CHANCEMAKER,
        FRACTALENGINE,
        JAVASCRIPTCONSOLE,
        IDLEVERSE
    }*/

    public class Building {

        public String name;
        public double price;
        public int numberPurchased;
        public int numberOwned;

        public Building(String name, double initialPrice) {
            this.name = name;
            this.price = initialPrice;
            this.numberPurchased = 0;
            this.numberOwned = 0;
        }
    }

    ArrayList<Building> buildings = new ArrayList<>();

    public void createInitialBuildingsList()
    {
        Building cursor = new Building("cursor", 15);
        Building grandma = new Building("grandma", 100);
        Building farm = new Building("farm", 1100);
        Building mine = new Building("mine", 12000);
        Building factory = new Building("factory", 130000);
        Building bank = new Building("bank", 1400000);
        Building temple = new Building("temple", 20000000);
        Building wizardtower = new Building("wizardtower", 330000000);
        Building shipment = new Building("shipment", 5100000000.0);
        Building alchemylab = new Building("alchemylab", 75000000000.0);
        Building portal = new Building("portal", 1000000000000.0);
        Building timemachine = new Building("timemachine", 14000000000000.0);
        Building antimattercondenser = new Building("antimattercondenser", 170000000000000.0);
        Building prism = new Building("prism", 2100000000000000.0);
        Building chancemaker = new Building("chancemaker", 26000000000000000.0);
        Building fractalengine = new Building("fractalengine", 310000000000000000.0);
        Building javascriptconsole = new Building("javascriptconsole", 71000000000000000000.0);
        Building idleverse = new Building("idleverse", 12000000000000000000000.0);

        buildings.add(cursor);
        buildings.add(grandma);
        buildings.add(farm);
        buildings.add(mine);
        buildings.add(factory);
        buildings.add(bank);
        buildings.add(temple);
        buildings.add(wizardtower);
        buildings.add(shipment);
        buildings.add(alchemylab);
        buildings.add(portal);
        buildings.add(timemachine);
        buildings.add(antimattercondenser);
        buildings.add(prism);
        buildings.add(chancemaker);
        buildings.add(fractalengine);
        buildings.add(javascriptconsole);
        buildings.add(idleverse);
    }






}
