package com.hotel;

public class Maintainpage 
{
    private Loginpagepojo login;
	private Searchpagepojo search;
	private Bookingpagepojo booking;
	private Orderpagepojo  order;
	
	public Loginpagepojo getLogin() 
	{
		return (login==null)?login=new Loginpagepojo():login;
	}
	public Searchpagepojo getSearch() 
	{
		return (search==null)?search=new Searchpagepojo():search;
	}
	public Bookingpagepojo getBooking() 
	{
		return (booking==null)?booking=new Bookingpagepojo():booking;
	}
	public Orderpagepojo getOrder() 
	{
		return (order==null)?order=new Orderpagepojo():order;
	}
	
}
