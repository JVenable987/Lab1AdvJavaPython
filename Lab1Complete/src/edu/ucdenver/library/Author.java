package edu.ucdenver.library;

public class Author {
    //ToDo: declare the instance attribute name
    private String name;

    //Todo: Implement the constructor that takes the name as argument
    Author(String _name){
        name = _name;
    }


    //Add the getter only for name.
    String getName(){
        return name;
    }

    @Override
    public String toString(){
        //Todo: Should return "name (Author)"  where name is the author's name
        return String.format("name %s", name);
    }
}
