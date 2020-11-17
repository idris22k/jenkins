package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utilities.FunctionalLibrary;

public class SearchHotelPage extends FunctionalLibrary{
public SearchHotelPage() {
PageFactory.initElements(driver, this);
}


@FindBy(name= "hotels")
private WebElement nhotels;

@FindBy(xpath= "//select[@name='location']")
private WebElement nLoaction;

@FindBy(name= "room_type")
private WebElement nroomtype;

public WebElement getNroomnos() {
	return nroomnos;
}


@FindBy(xpath= "//select[@name='room_nos']")
private WebElement nroomnos;


@FindBy(name= "datepick_in")
private WebElement nCheckInDate;


@FindBy(name= "datepick_out")
private WebElement nCheckOutDate;



@FindBy(name= "adult_room")
private WebElement nadultRoom;

@FindBy(name= "child_room")
private WebElement nChildRoom;

@FindBy(name= "submit")
private WebElement btnsubmit;




 public WebElement getNhotels() {
	return nhotels;
}




public WebElement getnLoaction() {
	return nLoaction;
}




public WebElement getNroomtype() {
	return nroomtype;
}




public WebElement getnroomnos() {
	return nroomnos;
}




public WebElement getnCheckInDate() {
	return nCheckInDate;
}




public WebElement getnCheckOutDate() {
	return nCheckOutDate;
}




public WebElement getNadultRoom() {
	return nadultRoom;
}




public WebElement getnChildRoom() {
	return nChildRoom;
}




public WebElement getBtnsubmit() {
	return btnsubmit;
}




public void serachHotel(String location,String hotel ,String roomType  , int nroomnos, String checkinDate , String checkOutDate, String adultsPerRooms,String ChildPerRooms) {
	implicitWait();

	 selectByValue(getnLoaction(), location);
	 selectByValue(getNhotels(), hotel);
	 selectByValue(getNroomtype(), roomType);
	 selectByIndex(getNroomnos(), nroomnos);
	 selectByValue(getnCheckInDate(), checkinDate);
	 selectByValue(getnCheckOutDate(), checkOutDate);
	 selectByValue(getNadultRoom(), adultsPerRooms);
	 selectByValue(getnChildRoom(), ChildPerRooms);


click(getBtnsubmit());



}








}
