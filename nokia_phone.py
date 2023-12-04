user_input = 0
user_input1 = 0
user_input2 = 0
user_input3 = 0
user_input4 = 0
user_input5 = 0
user_input6 = 0
continuation = 0
select_number = 0;
    
print("Menu Function\n")
print("1. Phone Book\n")
print("2. Messages\n")
print("3. Chat\n")
print("4. Call Register\n")
print("5. Tones\n")
print("6. Settings\n")
print("7. Call Divert\n")
print("8. Games\n");
print("9. Calculator\n")
print("10. Reminders\n")
print("11. Clock\n")
print("12. Profiles \n")
print("13. SIM services\n")

user_input = int(input("Select the number for the page you want to open \n"))
if user_input==1:
	print()
	print("\tPhone Book ")
	print("1. Search\n")
	print("2. Services Nos\n")
	print("3. Add name\n")
	print("4. Erase\n")
	print("5. Edit\n")
	print("6. Assign Tone\n")
	print("7. Send b'card \n")
	print("8. Options \n")
	print("9. Speed dials\n")
	print("10. Voice tags\n")

	user_input1 = int(input("Select the number for the page you want to open \n"))
	print()
	if user_input1 == 1:
		print("Search\n")
			
		
	elif user_input1==2:
		print("Service Nos\n")
			

	elif user_input1==3:
		print("Add name \n")
			

	elif user_input1==4:
		print("Erase \n")
			

	elif user_input1==5:
		print("Edit\n")
				

	elif user_input1==6:
		print("Assign Tone\n")
				

	elif user_input1==7:
		print("Send B'Card \n")

	elif user_input1==8:	
		print()
		print("\tOptions")
		print("1. Type of view\n")
		print("2. Memory Status\n")

	elif user_input1==9:
		print("Speed dials\n")
			

	elif user_input1==10:
		print("Voice Tags\n")	
		
elif user_input==2:
	print()
	print("\tMessages ")
	print("1. write messages\n")
	print("2. inbox \n")
	print("3. Outbox\n")
	print("4. Pictures messages\n")
	print("5. Templates\n")
	print("6. Smileys\n")
	print("7. Message Setting \n")
	print("8. Info Service\n")
	print("9. Voice mailbox number\n") 
	print("10. Service Command editor\n")
			
	user_input2 = (input("Select the number for the page you want to open \n"))

	print();

	if user_input2==1:
				
		print("Write messages\n")
		
		
	elif user_input2==2:
			print("Inbox\n")
			
	elif user_input2==3:
			print("Outbox \n")
			

	elif user_input2==4:
			print("Picture messages\n")

	elif user_input2==5:
			print("Templates\n")

	elif user_input2==6:
			print("Smileys\n")

	elif user_input2==7:
			print("\tMessage Settings")
			print()
			print("1. set 1 \n")
			print("2. common  3 \n")

			select_number = int(input("Select the number for the page you want to open \n"))
					 
			if select_number ==1:
					print()
					print("\tSet 1 \n")
					print(" Message centre number\n")
					print(" Message sent as\n")
					print(" Message validity\n")
				
				
			elif select_number==2:
					print()
					print("\tcommon 3\n")
					print(" Delivery reports\n")
					print(" Reply via Same centre\n")
					print(" Character support\n")
				

			

	elif user_input2==8:
			print("Info Service\n")
	elif user_input2==9:
			print("Voice mailbox number\n")

	elif user_input2==10:
			print("Service command editor\n")
		
elif user_input==3:
		print("Chat\n")	
		
elif user_input==4:
	print()
	print("\tCall Register \n")

	print("1. Missed calls \n")
	print("2. Recieved calls \n")
	print("3. Dailed Number \n")
	print("4. Erase recent call list\n")
		
	user_input3 = int(input("Select the number for the page you want to open \n"))

	print()
				
	if user_input3==1:
		print(" Missed calls \n")
				
	elif user_input3==2:
		print(" Recieved calls \n")
				
	elif user_input3==3:
		print(" Dailed Number \n")
				
	elif user_input3==4:
		print(" Erase recent call list")
	elif user_input3==5:
		print("\tShow call duration \n")
		print("1.Last call duration \n")
		print("2. All calls' duration \n")
		print("3. Received calls' duration \n")
		print("4. Dialed Calls' duration \n")
		print("5. Clear timers \n ")
				
	elif user_input3==6:
		print()
		print("\tshow call cost\n")
		print("1. Last call cost \n")
		print("2. All calls' cost \n")
		print("3. Clear counters\n")
				
	elif user_input3==7:
		print()
		print("\tcost call setting\n")
		print(" Call cost limit\n")
		System.out.println("Show cost in \n");
			

	elif user_input3==8:
		System.out.print();
		System.out.print("Prepaid credit");
				
elif user_input==5:
	print()
	print("\tTones \n")
	print("1. Ringing tone \n")
	print("2. Ringing volume \n")
	print("3. Incoming call alert \n")
	print("4. Composer\n")
	print("5. Message alert tone\n")
	print("6. Keyboard tone \n")
	print("7. Warning and game tone \n")
	print("8. Vibrating alert \n")
	print("9. Screen saver \n")
	

	user_input4 = int(input("Select the number for the page you want to open \n"))
	print()
	if user_input4==1:
			print("Ringing tone \n")
			
	elif user_input4==2:
			print("Ringing volume \n")
			
	elif user_input4==3:
			print(" Incoming call alert \n")
				
	elif user_input4==4:
			print(" Composer\n")
				
	elif user_input4==5:
			print(" Message alert tone \n")
				
	elif user_input4==6:
			print(" Keyboard tones  \n")
				
	elif user_input4==7:
			print(" Warning and games tone \n")
				
	elif user_input4==8:
			print(" Vibrating alert\n")
			
	elif user_input4==9:
			print(" Screen saver\n")
	
elif user_input==6:
		System.out.println("\tSettings\n");
		System.out.println("1. Call setting \n");
		System.out.println("2. Phone setting\n");
		System.out.println("3. Security setiing \n");
		System.out.println("4. Restore factory setting\n");
		
		user_input5 = int(input("Select the number for the page you want to open \n"))

		print()
		if user_input5==1:
				print("\t Call setting\n")
				print("Automatic redail \n")
				print(" Speed dialing  \n")
				print(" Call waiting option \n")
				print("Own number setting\n")
				print("Phone line in use \n")
				print("Automatic answer\n")
			

		elif user_input5==2:
				print("\t Phone setting\n")
				print("language \n")
				print(" Cell info display  \n")
				print(" Welcome note \n")
				print("Network selection\n")
				print("Lights \n")
				print("Confirm SIM service actions\n")

		elif user_input5==3:
				print("\t Security setting\n")
				print("Pincode request \n")
				print(" Call barring service \n")
				print(" Fixed dialing \n")
				print("Closed user group\n")
				System.out.print("Phone security\n")
				print("Change access code\n");
			
		elif user_input5==4:
				print("Restore factory settings\n")
	
elif user_input==7:
		print("Call divert\n")
		
elif user_input==8:
		print("Games\n")
	
elif user_input==9:
		print("Calculator\n")
	
elif user_input==10:
		print("Reminder")
	
elif user_input==11:
		print()
		print("\tClock\n")
		print("1. Alarm clock \n")
		print("2. Clock settings\n")
		println("3. Date setting\n")
		print("4. Stopwatch \n");
		print("5. Count down timer")
		print("6. Auto update of date and time\n")
		print()

		user_input6 = int(input("Select the number for the page you want to open \n"))
			 	
		print()

		if user_input6==1:
				print("Alarm clock\n")
				
		elif user_input6==2:
				print("Clock setting\n")
				
		elif user_input6==3:
				print("date setting\n")
				
		elif user_input6==4:
				print("Stopwatch\n")
				
		elif user_input6==5:
				print("COunt down timer \n")
				
		elif user_input6==6:
				print("Auto update of date and time\n")

elif user_input == 12:
		print("Profiles")
		
elif user_input == 13:
		print("SIM services")

print()
	