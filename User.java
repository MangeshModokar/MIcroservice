public class User {

  User(){}

  User(String name, int age){
    this.name = name;
    this.age = age;
  }

  private String name;
  private int age;
  
public String getName(){
  return this.name;
}

public int getAge(){
  return this.age;
}

public setName(String name){
  this.name = name;
}

public setAge(int age){
  this.age = age;
}

@Override
public toString(String name, int age){
  System.out.println(this.name + " " + this.age);
}

}
