 import java.util.Scanner;
 import java.io.*;

 public class HotelSystem
{
	static class hotels{
		void showHotels(){
			System.out.println("\n*****HOTELS IN INDORE*****\n");
			System.out.println("***LIST OF HOTELS IN INDORE***");
			System.out.println("1.Wow Hotel-A luxury boutique hotel");
			System.out.println("2.Effotel Hotel By Sayaji");
			System.out.println("3.Sayaji Hotel");
			System.out.println("4.Radisson blu Hotel");
			System.out.println("5.JALSA Hotel");
			System.out.println("6.The Red Maple Mashal");
			System.out.println("7.Indore Marriott Hotel");
			System.out.println("8.Hotel Solitaire");
			System.out.println("9.Hotel Infiniti");
			System.out.println("10.Hotel Sapphire Star");
			System.out.println("11.Fairfield by Marriott Indore");
			System.out.println("12.Treebo Trend Daksh Residency");
			System.out.println("13.Hotel Giri Shankara");
			System.out.println("14.Fabhotel Sky A1");
			System.out.println("15.Enrise By Sayaji Rau Indore");
			System.out.println("*CHOOSE WHERE YOU WANT TO STAY*");
		}
		void selectHotel(){
			String ch;
			int ph;
			Scanner sc=new Scanner(System.in);
			ch=sc.next();
			switch(ch)

			{
				case "1":
					System.out.println("Wow Hotel-A luxury boutique hotel");
					System.out.println("Located in Indore, 5.6 km from ISKCON Indore, \n" +
							"WOW Hotel has rooms with free WiFi access. 6.7 km from Rajwada Palace,\n" +
							"the hotel offers a fitness centre and a terrace. Guests can enjoy city views.");
					System.out.println("Avg. prize/night:");
					System.out.println("Rs.4,200");
					System.out.println("Room Available In AC or Non AC");
					System.out.println("CHOOSE 1 FOR AC AND 2 FOR NON AC");
					Scanner br=new Scanner(System.in);
					ph=br.nextInt();
					if(ph==1)
					{
						System.out.println("AC ROOMS");
						System.out.println("06 Single Bedrooms Are Available");
						System.out.println("09 Double Bedrooms Are Available");
					}
					else
					{
						System.out.println("NON AC ROOMS");
						System.out.println("10 Single Bedrooms Are Available");
						System.out.println("12 Double Bedrooms Are Available");

					}

					break;

				case "2":
					System.out.println("Effotel Hotel By Sayaji");
					System.out.println("Located just 4 km from the magnificent Rajwada Palace, \n" +
							"Effotel is offers comfortable accommodation in the historic city of Indore. Free WiFi");
					System.out.println("Avg. prize/night:");
					System.out.println("Rs.2,244");
					System.out.println("Room Available:-");
					System.out.println("Room Available In AC or Non AC");
					System.out.println("CHOOSE 1 FOR AC AND 2 FOR NON AC");
					Scanner vr=new Scanner(System.in);
					ph=vr.nextInt();
					if(ph==1)
					{
						System.out.println("AC ROOMS");
						System.out.println("15 Single Bedrooms Are Available");
						System.out.println("20 Double Bedrooms Are Available");
					}
					else
					{
						System.out.println("NON AC ROOMS");
						System.out.println("28 Single Bedrooms Are Available");
						System.out.println("13 Double Bedrooms Are Available");

					}
					break;

				case "3":
					System.out.println("Sayaji Hotel");
					System.out.println("Offering an outdoor swimming pool, a fitness centre and a spa and wellness centre,\n" +
							" Sayaji Indore is located within 6 km from Indore Railway Station and Regional Park Boating Club.");
					System.out.println("Avg. prize/night:");
					System.out.println("Rs.3,119.20");
					System.out.println("Room Available:-");
					System.out.println("Room Available In AC or Non AC");
					System.out.println("CHOOSE 1 FOR AC AND 2 FOR NON AC");
					Scanner ar=new Scanner(System.in);
					ph=ar.nextInt();
					if(ph==1)
					{
						System.out.println("AC ROOMS");
						System.out.println("23 Single Bedrooms Are Available");
						System.out.println("29 Double Bedrooms Are Available");
					}
					else
					{
						System.out.println("NON AC ROOMS");
						System.out.println("32 Single Bedrooms Are Available");
						System.out.println("14 Double Bedrooms Are Available");

					}
					break;

				case "4":
					System.out.println("Radisson blu Hotel");
					System.out.println("The 5-star Radisson Blu Hotel features an indoor pool, \n" +
							"a rooftop spa, a modern gym and free Wi-Fi. Hospitality, food & rooms");
					System.out.println("Avg. prize/night:");
					System.out.println("Rs.4,000");
					System.out.println("Room Available:-");
					System.out.println("Room Available In AC or Non AC");
					System.out.println("CHOOSE 1 FOR AC AND 2 FOR NON AC");
					Scanner er=new Scanner(System.in);
					ph=er.nextInt();
					if(ph==1)
					{
						System.out.println("AC ROOMS");
						System.out.println("12 Single Bedrooms Are Available");
						System.out.println("20 Double Bedrooms Are Available");
					}
					else
					{
						System.out.println("NON AC ROOMS");
						System.out.println("19 Single Bedrooms Are Available");
						System.out.println("10 Double Bedrooms Are Available");

					}
					break;

				case "5":
					System.out.println("JALSA Hotel");
					System.out.println("JALSA HOTEL & BANQUETS is set in Indore, less than 1 km from ISKCON Indore, and provides free WiFi.\n " +
							"The property is situated 10 km from Rajwada Palace. The accommodation features a 24-hour front desk.");
					System.out.println("Avg. prize/night:");
					System.out.println("Rs.2,000");
					System.out.println("Room Available:-");
					System.out.println("Room Available In AC or Non AC");
					System.out.println("CHOOSE 1 FOR AC AND 2 FOR NON AC");
					Scanner wr=new Scanner(System.in);
					ph=wr.nextInt();
					if(ph==1)
					{
						System.out.println("AC ROOMS");
						System.out.println("25 Single Bedrooms Are Available");
						System.out.println("17 Double Bedrooms Are Available");
					}
					else
					{
						System.out.println("NON AC ROOMS");
						System.out.println("19 Single Bedrooms Are Available");
						System.out.println("09 Double Bedrooms Are Available");

					}
					break;

				case "6":
					System.out.println("The Red Maple Mashal");
					System.out.println("The Red Maple Mashal is conveniently located in the popular Rau area.\n" +
							" The hotel offers a high standard of service and amenities to suit the individual needs of all travelers.\n" +
							" Take advantage of the hotel's free Wi-Fi in all rooms, daily housekeeping, fireplace, taxi service, ticket service.\n" +
							" Each guestroom is elegantly furnished and equipped with handy amenities. \n" +
							"The hotel's peaceful atmosphere extends to its recreational facilities which include fitness center,\n" +
							" outdoor pool, massage, garden, games room. For reliable service and professional staff,\n" +
							" The Red Maple Mashal caters to your needs.");
					System.out.println("Avg. prize/night:");
					System.out.println("Rs.3,334");
					System.out.println("Room Available:-");
					System.out.println("Room Available In AC or Non AC");
					System.out.println("CHOOSE 1 FOR AC AND 2 FOR NON AC");
					Scanner ur=new Scanner(System.in);
					ph=ur.nextInt();
					if(ph==1)
					{
						System.out.println("AC ROOMS");
						System.out.println("00 Single Bedrooms Are Available");
						System.out.println("19 Double Bedrooms Are Available");
					}
					else
					{
						System.out.println("NON AC ROOMS");
						System.out.println("09 Single Bedrooms Are Available");
						System.out.println("18 Double Bedrooms Are Available");

					}
					break;

				case "7":
					System.out.println("Indore Marriott Hotel");
					System.out.println("Featuring a fitness centre and garden, Indore Marriott Hotel is a hotel is set in Indore, 5 km from ISKCON Indore.\n" +
							" Among the various facilities of this property are a bar and on-site dining.\n");
					System.out.println("Avg. prize/night:");
					System.out.println("Rs.3,541");
					System.out.println("Room Available:-");
					System.out.println("Room Available In AC or Non AC");
					System.out.println("CHOOSE 1 FOR AC AND 2 FOR NON AC");
					Scanner pr=new Scanner(System.in);
					ph=pr.nextInt();
					if(ph==1)
					{
						System.out.println("AC ROOMS");
						System.out.println("25 Single Bedrooms Are Available");
						System.out.println("09 Double Bedrooms Are Available");
					}
					else
					{
						System.out.println("NON AC ROOMS");
						System.out.println("18 Single Bedrooms Are Available");
						System.out.println("16 Double Bedrooms Are Available");

					}
					break;

				case "8":
					System.out.println("Hotel Solitaire");
					System.out.println("Capital O 16115 Hotel Solitaire is conveniently located in the popular Nanda Nagar area. \n" +
							"The property offers guests a range of services and amenities designed to provide comfort and convenience. \n" +
							"Service-minded staff will welcome and guide you at Capital O 16115 Hotel Solitaire. \n" +
							"Some of the well-appointed guestrooms feature towels, fan, television, toiletries. \n" +
							"The property offers various recreational opportunities. Friendly staff, great facilities, \n" +
							"and close proximity to all that Indore has to offer are three great reasons you should stay at Capital O 16115 Hotel Solitaire.\n");
					System.out.println("Avg. prize/night:");
					System.out.println("Rs.1,776");
					System.out.println("Room Available:-");
					System.out.println("Room Available In AC or Non AC");
					System.out.println("CHOOSE 1 FOR AC AND 2 FOR NON AC");
					Scanner nr=new Scanner(System.in);
					ph=nr.nextInt();
					if(ph==1)
					{
						System.out.println("AC ROOMS");
						System.out.println("15 Single Bedrooms Are Available");
						System.out.println("09 Double Bedrooms Are Available");
					}
					else
					{
						System.out.println("NON AC ROOMS");
						System.out.println("18 Single Bedrooms Are Available");
						System.out.println("12 Double Bedrooms Are Available");

					}
					break;

				case "9":
					System.out.println("Hotel Infiniti");
					System.out.println("Hotel Infiniti is conveniently located in the popular Vijay Nagar area.\n" +
							" The property features a wide range of facilities to make your stay a pleasant experience.\n" +
							" Service-minded staff will welcome and guide you at Hotel Infiniti. \n" +
							"Designed for comfort, selected guestrooms offer flat screen television, clothes rack, linens, sofa, towels \n" +
							"to ensure a restful night. The property offers various recreational opportunities. \n" +
							"Hotel Infiniti is an excellent choice from which to explore Indore or to simply relax and rejuvenate.");
					System.out.println("Avg. prize/night:");
					System.out.println("Rs.3,745");
					System.out.println("Room Available:-");
					System.out.println("Room Available In AC or Non AC");
					System.out.println("CHOOSE 1 FOR AC AND 2 FOR NON AC");
					Scanner tr=new Scanner(System.in);
					ph=tr.nextInt();
					if(ph==1)
					{
						System.out.println("AC ROOMS");
						System.out.println("9 Single Bedrooms Are Available");
						System.out.println("12 Double Bedrooms Are Available");
					}
					else
					{
						System.out.println("NON AC ROOMS");
						System.out.println("19 Single Bedrooms Are Available");
						System.out.println("00 Double Bedrooms Are Available");

					}

					break;

				case "10":
					System.out.println("Hotel Sapphire Star");
					System.out.println("In a Galaxy of hotels that offer great deals and discounts to customers,\n " +
							"Sapphire Star shines on as the best value for money in Indore city.\n " +
							"The hotel’s proximity from corporate offices, commercial centers,\n" +
							" multispeciality hospitals as well as shopping malls and tourist destinations provides visitors the best of both worlds.\n " +
							"Located a few feet away from the Chappan Dukaan (56 stores) which is famous for its street food, \n" +
							"Sapphire Star is every food lover’s dream come true. \n" +
							"The International Airport is only 10km away while the Indore Junction and Sarwate Bus Stand\n" +
							" are even closer at 2.5 and 2.8 km respectively.\n" +
							" Guests can reach out to the Tour Desk anytime for travel related information and assistance.\n" +
							" At Sapphire Star, we leave no stone unturned in ensuring that our guests feel at home.\n " +
							"The quaint interiors and well furnished rooms with a king size bed (or twin beds), spotless linens, well stocked mini bar, \n" +
							"coffee table and Lcd Tv feel like a blessing after a long day of sightseeing.\n" +
							" We also take care of your laundry so you can live out of a suitcase, carefree! Our room service is faster than the free Wi-Fi.");
					System.out.println("Avg. prize/night:");
					System.out.println("Rs.1,654");
					System.out.println("Room Available:-");
					System.out.println("Room Available In AC or Non AC");
					System.out.println("CHOOSE 1 FOR AC AND 2 FOR NON AC");
					Scanner lr=new Scanner(System.in);
					ph=lr.nextInt();
					if(ph==1)
					{
						System.out.println("AC ROOMS");
						System.out.println("05 Single Bedrooms Are Available");
						System.out.println("01 Double Bedrooms Are Available");
					}
					else
					{
						System.out.println("NON AC ROOMS");
						System.out.println("19 Single Bedrooms Are Available");
						System.out.println("10 Double Bedrooms Are Available");

					}
					break;

				case "11":
					System.out.println("Fairfield by Marriott Indore");
					System.out.println("Featuring a fitness centre and 24-hour food and beverage pantry, \n" +
							"Fairfield by Marriott Indore offers accommodation located 6 km from the Mumbai – Agra National Highway.\n" +
							" Everything was perfect. The staff and service was exemplary. Arnal, Gopal, Riddhi and Vikas were just brilliant. \n" +
							"We will stay again and I've recommended to my in-laws who are coming next year to Indore too.\n.");
					System.out.println("Avg. prize/night:");
					System.out.println("Rs.2,499");
					System.out.println("Room Available:-");
					System.out.println("Room Available In AC or Non AC");
					System.out.println("CHOOSE 1 FOR AC AND 2 FOR NON AC");
					Scanner zr=new Scanner(System.in);
					ph=zr.nextInt();
					if(ph==1)
					{
						System.out.println("AC ROOMS");
						System.out.println("10 Single Bedrooms Are Available");
						System.out.println("09 Double Bedrooms Are Available");
					}
					else
					{
						System.out.println("NON AC ROOMS");
						System.out.println("18 Single Bedrooms Are Available");
						System.out.println("19 Double Bedrooms Are Available");

					}
					break;

				case "12":

					System.out.println("Treebo Trend Daksh Residency");
					System.out.println("Located in Indore, 48 km from Ujjain, Treebo Daksh Residency features a restaurant and free WiFi throughout the property.\n" +
							" Guests can enjoy the on-site restaurant. Indore means for me it is Daksh Residency only.\n");
					System.out.println("Avg. prize/night:");
					System.out.println("Rs.1,464.46");
					System.out.println("Room Available:-");
					System.out.println("Room Available In AC or Non AC");
					System.out.println("CHOOSE 1 FOR AC AND 2 FOR NON AC");
					Scanner yr=new Scanner(System.in);
					ph=yr.nextInt();
					if(ph==1)
					{
						System.out.println("AC ROOMS");
						System.out.println("15 Single Bedrooms Are Available");
						System.out.println("19 Double Bedrooms Are Available");
					}
					else
					{
						System.out.println("NON AC ROOMS");
						System.out.println("13 Single Bedrooms Are Available");
						System.out.println("05 Double Bedrooms Are Available");

					}
					break;


				case "13":
					System.out.println("Hotel Giri Shankara");
					System.out.println("Located in Indore, within 1.7 km of Rajwada Palace and 12 km of ISKCON Indore,\n" +
							" Hotel Giri Shankara offers accommodation with a terrace and as well as free private parking for guests who drive.\n" +
							" Best Place to stay in Indore if you are traveling for Work. I would definitely stay over here only if I visit Indore any day.\n");
					System.out.println("Avg. prize/night:");
					System.out.println("Rs.1,188");
					System.out.println("Room Available:-");
					System.out.println("Room Available In AC or Non AC");
					System.out.println("CHOOSE 1 FOR AC AND 2 FOR NON AC");
					Scanner dr=new Scanner(System.in);
					ph=dr.nextInt();
					if(ph==1)
					{
						System.out.println("AC ROOMS");
						System.out.println("15 Single Bedrooms Are Available");
						System.out.println("19 Double Bedrooms Are Available");
					}
					else
					{
						System.out.println("NON AC ROOMS");
						System.out.println("13 Single Bedrooms Are Available");
						System.out.println("05 Double Bedrooms Are Available");

					}
					break;

				case "14":
					System.out.println("Fabhotel Sky A1");
					System.out.println("Located 3.7 km from ISKCON Indore, Fabhotel Sky A1 provides rooms with air conditioning in Indore.\n" +
							" The location is very good breakfast is also nice good quality maintained and the Eminities also very good\n");
					System.out.println("Avg. prize/night:");
					System.out.println("Rs.1,233");
					System.out.println("Room Available:-");
					System.out.println("Room Available In AC or Non AC");
					System.out.println("CHOOSE 1 FOR AC AND 2 FOR NON AC");
					Scanner du=new Scanner(System.in);
					ph=du.nextInt();
					if(ph==1)
					{
						System.out.println("AC ROOMS");
						System.out.println("16 Single Bedrooms Are Available");
						System.out.println("19 Double Bedrooms Are Available");
					}
					else
					{
						System.out.println("NON AC ROOMS");
						System.out.println("19 Single Bedrooms Are Available");
						System.out.println("08 Double Bedrooms Are Available");

					}
					break;


				case "15":
					System.out.println("Enrise By Sayaji Rau Indore");
					System.out.println("Situated in Indore, 13 km from Rajwada Palace, Enrise By Sayaji Rau Indore features accommodation with a restaurant,\n" +
							" free private parking, a fitness centre and a bar. Staff, hotel was very clean, food options are available.");
					System.out.println("Avg. prize/night:");
					System.out.println("Rs.4,250");
					System.out.println("Room Available:-");
					System.out.println("Room Available In AC or Non AC");
					System.out.println("CHOOSE 1 FOR AC AND 2 FOR NON AC");
					Scanner vq=new Scanner(System.in);
					ph=vq.nextInt();
					if(ph==1)
					{
						System.out.println("AC ROOMS");
						System.out.println("20 Single Bedrooms Are Available");
						System.out.println("18 Double Bedrooms Are Available");
					}
					else
					{
						System.out.println("NON AC ROOMS");
						System.out.println("16 Single Bedrooms Are Available");
						System.out.println("07 Double Bedrooms Are Available ");

					}
					break;


			}
		}
	}
	static class feedback
	{
		void getfeedback()
		{

				Scanner sc = new Scanner(System.in);
				System.out.println("Enter your name");
				String fname = sc.nextLine();
				try
				{
					FileOutputStream fout=new FileOutputStream(fname+".txt");
					System.out.println("Please write your experience with us here (please write in single line only)........... \n");
					String s= sc.nextLine();
					byte b[]=s.getBytes();//converting string into byte array
					fout.write(b);
					fout.close();
					System.out.println("Thank you for your Feedback \n");
				}
				catch(Exception e){System.out.println(e);}
		}
	}
	static class admin
	{
		void showfeedback()
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter user name to open feedback");
			String fname = sc.nextLine();
			try
			{
				FileInputStream fin=new FileInputStream(fname+".txt");
				int i=0;
				while((i=fin.read())!=-1){
					System.out.print((char)i);
				}
				fin.close();
			}
			catch(Exception e){System.out.println("File not found");
			}

		}
	}
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		hotels hotel=new hotels();
		feedback feed = new feedback();
		admin ad = new admin();
		System.out.println("Press 1 if you are a customer\n" +
				"Press 2 if you are Admin");
		int login = scan.nextInt();
		if (login==1) {
			hotel.showHotels();
			hotel.selectHotel();
		}
		else if (login==2)
			ad.showfeedback();
		else System.out.println("Wrong input. please select correct input");

		System.out.println("\nPress 1 if you want to see another hotel details\n" +
				"Press 2 to exit");
		int repeat = scan.nextInt();
		if (repeat==1)
		{
			hotel.showHotels();
			hotel.selectHotel();
		}
			//main(args);
		else if (repeat ==2)
		{
			System.out.println("We would like to hear your feedback with us...\n" +
					"Press 1 to give feedback\n" +
					"Press 2 to exit without giving feedback \n");
			int fb = scan.nextInt();
			if (fb==1)
			{
			feed.getfeedback();
			}
			else if (fb==2)
			System.exit(0);
			else System.out.println("wrong input. Exiting!");
		}
		else System.out.println("wrong input. Exiting!");


	}
}