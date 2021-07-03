package com.company;

public class Main {

    public static void main(String[] args) {

        createObject("Mercedes-Benz");
        createObject("BMW");
        createObject("Toyota");

    }
        public static Printable createObject(String className){
            switch (className) {
                case "Mercedes-Benz":
                    MercedesBenz mercedesBenz = new MercedesBenz("Mercedes-Benz GLE", 2018, "White", "Carbon");
                    mercedesBenz.print();
                    return mercedesBenz;

                case "BMW":
                    BMW bmw = new BMW("BMW X7", 2017, "Black", "Pioneer");
                    bmw.print();
                    return bmw;

                case "Toyota":
                    Toyota toyota = new Toyota("Toyota Highlander", 2016, "Gray", "Chrome");
                    toyota.print();
                    return toyota;

                default:
                    System.out.println("There are no car in the garage!");
            }

            return null;
        }
    }

