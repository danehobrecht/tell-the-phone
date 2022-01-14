#!/user/bin/python3

### Peforms cellular call of the passed parameter "number".
def call(number):

	### Function code will vary based on the calling library.

	### Initiates phone call
	# print("Calling...")
	# serialport.write("AT\r")
	# response = serialport.readlines(None)
	# serialport.write("ATD " + number + ';\r')
	# response = serialport.readlines(None)
	# print(response)

	### Ends phone call
	# print("Ending...")
	# serialport.write("AT\r")
	# response = serialport.readlines(None)
	# serialport.write("ATH\r")
	# response = serialport.readlines(None)
	# print(response)

	print(number)

### Formats and dials input according to U.S. tellecommunication standards.
def dial():
	# Takes/cleans user input
	user_input = input("+1 ").replace("-", "")
	# Checks that the user input is of valid length
	if len(user_input) != 10:
		print("Invalid.")
		dial()
	# Appends U.S. area code
	else:
		number = "1" + user_input
		call(number)

### Main function.
def main():
	dial()

### Initiates program.
if __name__ == "__main__":
	main()
