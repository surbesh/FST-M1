fruit_shop = {
    "mango": 60,
    "grapes": 11,
    "sitaphala": 20,
    "sibaekai": 30,
}
key_to_check = input("What are you looking for? ").lower()
	
if(key_to_check in fruit_shop):
    print("Yes, this is available")
else:
    print("No, this is not available")