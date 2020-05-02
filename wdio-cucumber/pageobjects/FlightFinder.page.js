class FlightFinder{

    get Type(){ return $('[name="tripType"]');}

    clickType(){
        this.Type.click();
    }
}

export default new FlightFinder();