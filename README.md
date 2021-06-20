# Java_Practice

### Exercise 1

#### Create a method that receives a list of integers and return a Map<String, Integer> with the following keys: 

- key:min = value:mininum value in the list
- key:max = value:maximun value in the list
- key:total = value:the sum of all values in the list

#### Validation
* list cannot be null
* list cannot be empty
* list cannot have negative values

For any broken rule above an exception must be thrown showing the message

### Exercise 2

#### Create a method that receives two lists of String and return a list of integer with the sum of letters of list1.get(x) and list2.get(x) for all the positions. 

#### Validation
* lists cannot be null
* lists cannot be empty
* list must have the same number of elements

### Exercise 3

#### Create a method that receives a Map<String, Integer> and a List<Integer> where the map will contain some operations to be executed on all values on the list, and return a list with modified values in the same positions as the input. Operations are cummulative and must be executed in the following order when there is more than one operation in the Map: SUM > MULT > DIV > SUB.
  
Example of Map
  - SUM, 10
  - MULT, 2
  - DIV, 3
  - SUB, 9

#### Validation
* Map must have at least one of the operations above
* lists cannot be empty
  
### Exercise 4

#### Create a method that receives an List <Person> and return an array of Person with the oldest man and the youngest woman in it.
  
Object Person must be implemented and it has the following attributes: 
  - name
  - gender
  - age

#### Validation
* List must have at leats one woman and one man

