import java.util.Scanner;

public class NokiaPhone{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
			int userInput = 0;
			int userInput1 = 0;
			int userInput2 = 0;
			int userInput3 = 0;
			int userInput4 = 0;
			int userInput5 = 0;
			int userInput6 = 0;
			int  continuation = 0;
			int  selectNumber = 0;
    
	System.out.print("Menu Function\n");
	System.out.print("1. Phone Book\n");
	System.out.print("2. Messages\n");
	System.out.print("3. Chat\n");
	System.out.print("4. Call Register\n");
	System.out.print("5. Tones\n");
	System.out.print("6. Settings\n");
	System.out.print("7. Call Divert\n");
	System.out.print("8. Games\n");
	System.out.print("9. Calculator\n");
	System.out.print("10. Reminders\n");
	System.out.print("11. Clock\n");
	System.out.print("12. Profiles \n");
	System.out.print("13. SIM services\n");

		System.out.print("Select the number for the page you want to open \n");
			 userInput = input.nextInt();

	if(userInput==1){
			System.out.println();
			System.out.println("\tPhone Book ");
			System.out.print("1. Search\n");
			System.out.print("2. Services Nos\n");
			System.out.print("3. Add name\n");
			System.out.print("4. Erase\n");
			System.out.print("5. Edit\n");
			System.out.print("6. Assign Tone\n");
			System.out.print("7. Send b'card \n");
			System.out.print("8. Options \n");
			System.out.print("9. Speed dials\n");
			System.out.print("10. Voice tags\n");

		System.out.print("Select the number for the page you want to open  \n");
			 userInput1 = input.nextInt();

			System.out.println();
		if(userInput1 == 1){
				System.out.print("Search\n");
			}
		
		else if(userInput1==2){
				System.out.print("Service Nos\n");
			}

		else if(userInput1==3){
				System.out.print("Add name \n");
			}

		else if(userInput1==4){
				System.out.print("Erase \n");
			}

		else if(userInput1==5){
				System.out.print("Edit\n");
				}

		else if(userInput1==6){
				System.out.print("Assign Tone\n");
				}

		else if(userInput1==7){
				System.out.print("Send B'Card \n");
				}

		else if(userInput1==8){	
				System.out.println();
				System.out.println("\tOptions");
				System.out.print("1. Type of view\n");
				System.out.print("2. Memory Status\n");
			}

		else if(userInput1==9){
				System.out.print("Speed dials\n");
			}

		else if(userInput1==10){
				System.out.print("Voice Tags\n");
			}

		}	
		
	else if(userInput==2){
			System.out.println();
			System.out.println("\tMessages ");
			System.out.print("1. write messages\n");
			System.out.print("2. inbox \n");
			System.out.print("3. Outbox\n");
			System.out.print("4. Pictures messages\n");
			System.out.print("5. Templates\n");
			System.out.print("6. Smileys\n");
			System.out.print("7. Message Setting \n");
			System.out.print("8. Info Service\n");
			System.out.print("9. Voice mailbox number\n"); 
			System.out.print("10. Service Command editor\n");
			
		System.out.print("Select the number for the page you want to open \n");
			 userInput2 = input.nextInt();

				System.out.println();

		if(userInput2==1){
				
				System.out.print("Write messages\n");
			}
		
		else if(userInput2==2){
				System.out.print("Inbox\n");
			}
		else if(userInput2==3){
		
				System.out.print("Outbox \n");
			}

		else if(userInput2==4){

				System.out.print("Picture messages\n");
			}

		else if(userInput2==5){
				System.out.print("Templates\n");
				}

		else if(userInput2==6){
				System.out.print("Smileys\n");
				}

		else if(userInput2==7){

				System.out.println("\tMessage Settings");
				System.out.println();
				System.out.print("1. set 1 \n");
				System.out.print("2. common  3 \n");

				System.out.print("Select the number for the page you want to open \n");
					 selectNumber = input.nextInt();
				if(selectNumber ==1){
					System.out.println();
					System.out.println("\tSet 1");
					System.out.println(" Message centre number");
					System.out.println(" Message sent as");
					System.out.println(" Message validity");
				}
				
				if(selectNumber==2){
					System.out.println();
					System.out.println("\tcommon 3");
					System.out.println(" Delivery reports");
					System.out.println(" Reply via Same centre");
					System.out.println(" Character support");
				}

			}

		else if(userInput2==8){
				System.out.print("Info Service\n");
				}

		else if(userInput2==9){

				System.out.print("Voice mailbox number\n");
			}

		else if(userInput2==10){
				System.out.print("Service command editor\n");
			}

		}
	

	else if(userInput==3){

		System.out.print("Chat\n");	
		}

	else if(userInput==4){

		System.out.println();
		System.out.println("\tCall Register ");

		System.out.println("1. Missed calls ");
		System.out.println("2. Recieved calls ");
		System.out.println("3. Dailed Number ");
		System.out.println("4. Erase recent call list");
		System.out.println("5. Show call duration ");
		System.out.println("6. show call cost");
		System.out.println("7. cost call setting");
		System.out.println("8. Prepaid credit");
		
		System.out.print("Select the number for the page you want to open \n");
					 userInput3 = input.nextInt();

			System.out.println();
				
			 if(userInput3==1){
				System.out.println(" Missed calls ");
				}
			else if(userInput3==2){
				System.out.println(" Recieved calls ");
				}
			else if(userInput3==3){
				System.out.println(" Dailed Number ");
				}
			else if(userInput3==4){
				System.out.println(" Erase recent call list");
				}
			else if(userInput3==5){
				System.out.println("\tShow call duration ");
				System.out.println("1.Last call duration ");
				System.out.println("2. All calls' duration ");
				System.out.println("3. Received calls' duration ");
				System.out.println("4. Dialed Calls' duration");
				System.out.println("5. Clear timers  ");
				}
			else if(userInput3==6){
				System.out.println();
				System.out.println("\tshow call cost");
				System.out.println("1. Last call cost ");
				System.out.println("2. All calls' cost ");
				System.out.println("3. Clear counters");
				}
			else if(userInput3==7){	
				System.out.println();
				System.out.println("\tcost call setting");
				System.out.println(" Call cost limit");
				System.out.println("Show cost in ");
			}

			else if(userInput3==8){
				System.out.print("");
				System.out.print("Prepaid credit");
				}
		}

		
	else if(userInput==5){
		System.out.println();
		System.out.println("\tTones ");
		System.out.println("1. Ringing tone ");
		System.out.println("2. Ringing volume ");
		System.out.println("3. Incoming call alert ");
		System.out.println("4. Composer");
		System.out.println("5. Message alert tone");
		System.out.println("6. Keyboard tone ");
		System.out.println("7. Warning and game tone ");
		System.out.println("8. Vibrating alert ");
		System.out.println("9. Screen saver ");
	
		
		System.out.print("Select the number for the page you want to open \n");
			 userInput4 = input.nextInt();
			System.out.println();

		 if(userInput4==1){
				System.out.println("Ringing tone ");
			}
		else if(userInput4==2){
				System.out.println("Ringing volume ");
			}
		else if(userInput4==3){
				System.out.println(" Incoming call alert ");
				}
		else if(userInput4==4){
				System.out.println(" Composer");
				}
		else if(userInput4==5){
				System.out.println(" Message alert tone ");
				}
		else if(userInput4==6){
				System.out.println(" Keyboard tones  ");
				}
		else if(userInput4==7){
				System.out.println(" Warning and games tone ");
				}
		else if(userInput4==8){
				System.out.println(" Vibrating alert");
			}
		else if(userInput4==9){
				System.out.println(" Screen saver");
			}
		}
	
	
	else if(userInput==6){
		System.out.println("\tSettings");
		System.out.println("1. Call setting ");
		System.out.println("2. Phone setting");
		System.out.println("3. Security setiing ");
		System.out.println("4. Restore factory setting");
		
		System.out.print("Select the number for the page you want to open \n");
			 userInput5 = input.nextInt();

				System.out.println();
		if(userInput5==1){
				System.out.println("\t Call setting");
				System.out.println("Automatic redail ");
				System.out.println(" Speed dialing  ");
				System.out.println(" Call waiting option ");
				System.out.println("Own number setting");
				System.out.println("Phone line in use ");
				System.out.println("Automatic anwer");
			}

		else if(userInput5==2){
				System.out.println("\t Phone setting");
				System.out.println("language ");
				System.out.println(" Cell info display  ");
				System.out.println(" Welcome note ");
				System.out.println("Network selection");
				System.out.println("Lights ");
				System.out.println("Confirm SIM service actions");
			}

		else if(userInput5==3){
				System.out.println("\t Security setting");
				System.out.println("Pincode request ");
				System.out.println(" Call barring service ");
				System.out.println(" Fixed dialing ");
				System.out.println("Closed user group");
				System.out.println("Phone security");
				System.out.println("Change access code");
			}
		else if(userInput5==4){
				System.out.println("Restore factory settings");
			}
		}


	
	else if(userInput==7){
		System.out.println("Call divert");
		}

	else if(userInput==8){
		System.out.println("Games");
		}
	
	else if(userInput==9){
		System.out.println("Calculator");
	}
	
	else if(userInput==10){
		System.out.println("Reminder");
	}
	
	else if(userInput==11){
				System.out.println();
				System.out.println("\tClock");
				System.out.println("1. Alarm clock ");
				System.out.println("2. Clock settings");
				System.out.println("3. Date setting");
				System.out.println("4. Stopwatch ");
				System.out.println("5. Count down timer");
				System.out.println("6. Auto update of date and time");
				System.out.println();

			System.out.print("Select the number for the page you want to open \n");
					 userInput6 = input.nextInt();
			 	
				System.out.println();
		 if(userInput6==1){
				System.out.println("Alarm clock");
				}
		 else if(userInput6==2){
				System.out.println("Clock setting");
				}
		 else if(userInput6==3){
				System.out.println("date setting");
				}
		else if(userInput6==4){
				System.out.println("Stopwatch");
				}
		 else if(userInput6==5){
				System.out.println("COunt down timer ");
				}
		 else if(userInput6==6){
				System.out.println("Auto update of date and time"); 
			}
			
		}


	else if(userInput == 12){
		System.out.println("Profiles");
		}
	else if(userInput == 13){
		
		System.out.println("SIM services");


	}
			System.out.println();
	
		
     }

}