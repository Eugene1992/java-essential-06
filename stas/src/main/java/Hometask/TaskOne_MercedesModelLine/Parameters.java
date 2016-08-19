package Hometask.TaskOne_MercedesModelLine;

/**
 * Created by Станислав on 19.08.2016.
 * class Parameters contains car list with options variable.
 */
public class Parameters {
    /**
     * String name shows the name of the model.
     */
    private String name;
    /**
     * carBody attribute shows the type of carBody(sedan, hatchback, etc...).
     */
    private String carBody;
    /**
     * engineVolume attribute shows the engine's volume in liters.
     */
    private int engineVolume;
    /**
     * enginePower attribute shows the engine's power in horsepower quantity.
     */
    private int enginePower;
    /**
     * price attribute shows the model's price in US dollars.
     */
    private int price;

    void setName(String name) {
        this.name = name;
    }
    String getName() {
        return this.name;
    }

    void setCarBody(String carBody) {
        this.carBody = carBody;
    }
    String getCarBody () {return this.carBody;}

    void setEngineVolume(int engineVolume) {
        this.engineVolume = engineVolume;
    }
    int getEngineVolume () {return this.engineVolume;}

    void setEnginePower (int enginePower) {this.enginePower = enginePower;}
    int getEnginePower () {return this.enginePower;}

    void setPrice (int price) {this.price = price;}
    int getPrice () {return this.price;}


    /*

    public Parameters(String name, String carBody, int engineVolume, int enginePower, int price) {
    this.name = name;
    this.carBody = carBody;
    this.engineVolume = engineVolume;
    this.enginePower = enginePower;
    this.price = price;
    }
    hatchback   , station wagon car, coupe , SUV
    */


}
