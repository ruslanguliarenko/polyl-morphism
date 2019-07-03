
<b/>Inheritance in Java</b> <br />

Inheritance is an important pillar of OO. It is the mechanism in java by which one class is allow to inherit <br /> the
features(fields and methods) of another class.<br />

Important facts about inheritance in Java<br />

<li>Default superclass: Except Object class, which has no superclass, every class has one and only one direct superclass (single inheritance). In the absence of any other explicit superclass, every class is implicitly a subclass of Object class.
<li>Superclass can only be one: A superclass can have any number of subclasses. But a subclass can have only one superclass. This is because Java does not support multiple inheritance with classes. Although with interfaces, multiple inheritance is supported by java.
<li>Inheriting Constructors: A subclass inherits all the members (fields, methods, and nested classes) from its superclass. Constructors are not members, so they are not inherited by subclasses, but the constructor of the superclass can be invoked from the subclass.
<li>Private member inheritance: A subclass does not inherit the private members of its parent class. However, if the superclass has public or protected methods(like getters and setters) for accessing its private fields, these can also be used by the subclass.
<br>
<br>

<b> Polymorphism</b> <br />
<br>
Polymorphism is considered as one of the important features of Object Oriented Programming. Polymorphism allows
us to perform a single action in different ways. In other words, polymorphism allows you to define one interface 
and have multiple implementations. The word “poly” means many and “morphs” means forms, So it means many forms.  
<br /> 

In Java polymorphism is mainly divided into two types:<br /> 
<li/>  [Compile time Polymorphism](https://github.com/ruslanguliarenko/oop-example/blob/8bd9f2897edda9c88f7dc1add4ef3cc22ab5cdef/src/com/company/Accounting.java#L3)
<li> Runtime Polymorphism
<br />

<b>Compile time polymorphism: </b> It is also known as static polymorphism. This type of polymorphism is achieved by <br />
function overloading or operator overloadin. <br />

<li><b>Method Overloading:</b> When there are multiple functions with same name but different parameters then these functions <br />
are said to be overloaded. Functions can be overloaded by change in number of arguments or/and change in type of arguments.
<li><b>Operator Overloading:</b> Java also provide option to overload operators. For example, we can make the operator (‘+’) for <br />
string class to concatenate two strings. We know that this is the addition operator whose task is to add two operands. So a single <br />
operator ‘+’ when placed between integer operands, adds them and when placed between string operands, concatenates them. <br />
<b>Runtime polymorphism:</b> It is also known as Dynamic Method Dispatch. It is a process in which a function call to the overridden <br />
method is resolved at Runtime. This type of polymorphism is achieved by Method Overriding.<br />

<li><b>Method overriding</b>, on the other hand, occurs when a derived class has a definition for one of the member functions of the base class.<br />
That base function is said to be overridden.<br />

<b>Aggregation and Composition</b> <br />


I know this question is tagged as C# but the concepts are pretty generic questions like this redirect here. So I am going to provide my point of
view here (a bit biased from java point of view where I am more comfortable). When we think of Object-oriented nature we always think of Objects, 
class (objects blueprints) and the relationship between them. Objects are related and interact with each other via methods. In other words the 
object of one class may use services/methods provided by the object of another class. This kind of relationship is termed as association. 
Aggregation and Composition are subsets of association meaning they are specific cases of association. 
In both aggregation and composition object of one class "owns" object of another class. <br />
But there is a subtle difference. In Composition the object of class that is owned by the object of it's owning class cannot live on it's own
(Also called "death relationship"). It will always live as a part of it's owning object where as in Aggregation the dependent object is standalone 
and can exist even if the object of owning class is dead. <br />
So in composition if owning object is garbage collected the owned object will also be which is not the case in aggregation. <br />

Composition Example : Consider the example of a Car and an engine that is very specific to that car (meaning it cannot be used in any other car). 
This type of relationship between Car and SpecificEngine class is called Composition. An object of the Car class cannot exist without an object 
of SpecificEngine class and object of SpecificEngine has no significance without Car class. To put in simple words Car class solely "owns" the
SpecificEngine class. <br />

Aggregation Example : Now consider class Car and class Wheel. Car needs a Wheel object to function. Meaning the Car object owns the Wheel object 
but we cannot say the Wheel object has no significance without the Car Object. It can very well be used in a Bike, Truck or different Cars Object.

<b>Generics in Java </b> <br />

Generics in Java is similar to templates in C++. The idea is to allow type (Integer, String, … etc and user defined types) to be a parameter to 
methods, classes and interfaces<br/>

<b>Advantages of Generics: </b> <br />
<li> Code Reuse: We can write a method/class/interface once and use for any type we want.
<li>Type Safety : Generics make errors to appear compile time than at run time (It’s always better to know problems in your code at compile time 
 rather than making your code fail at run time). Suppose you want to create an ArrayList that store name of students and if by mistake programmer 
 adds an integer object instead of string, compiler allows it. But, when we retrieve this data from ArrayList, it causes problems at runtime.
<li>Individual Type Casting is not needed: If we do not use generics, then, in the above example every-time we retrieve data from ArrayList,  
 then we need not to typecast it every time. <br />
<li>Implementing generic algorithms: By using generics, we can implement algorithms that work on different types of objects and at the same 
they are type safe too.<br />