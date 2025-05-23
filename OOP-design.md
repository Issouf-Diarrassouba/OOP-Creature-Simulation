# OOP Design Document

![](/Project2UML.png)

## Overview
 

[For each of the classes in your OOP design, including ones provided
for you, offer a brief description of their functionality and how they
interact. Be sure to highlight good OOP like encapsulation,
inheritance, and polymorphism. Once you do, remove this text! Also be
sure the headers below match the class names, and not Class 1 and
Class 2 and etc.]

## Class Creature 

Creatures is the first class that I implemented. For Creatures we have the two mice and cats. With cats haing zombie cats extended to cats because cats is already a creature and zombie cat is an enhanced or modified cat as it adopts to its environment. I did say that Creatures  is dependant on City as we need the ciy for the creatures to be shown or spawn into a specific loaction. Without the city we would just have reandom creatures not being seen or shown because they are not placed anywhere.

## Class Gridpoint

Gridpoint was my 2nd implemented class on the UL Diagram where I said it was dependant on the Creature. For Gridpiint we are plotting the points where the creatures could possiby be spawn, while also assigning / randomizing thre movements of the creatures throughout the overall grid / city.

## Class City

City was the last Class I implemented as I said it is assiciated with Gridpoint due to the fact that it is where it is taking place and where the overal scene is. I also hinted that creatures was dependant in city as the city allows the creatures to have space to roam and run. 

## Method public void simulate

The method only method I implemented was public void simulate and had it connect to city as that is the class where the method lies. I ultimately feel that it could connect to other classes such as Creatures becasuse in order to simulate we need to be able to have the creatures avaliable for anything to happen in the city but also the grid point so there could be a range of where specific creatures are spawned so that there is not an overwhelm of mice getting killed at one spot. 

I could have implemented other methods as well as they do take into account the performance of mutiple classes as well

## Question or Expansion on Project 

I wanted to ask could it be possible to implement a zambie mice that eats mice but poisons cats? Just so that there also is a certain heircarchy standpoint from aswell.
