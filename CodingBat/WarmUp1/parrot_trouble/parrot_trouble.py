def parrot_trouble(talking, hour):
    if (talking == True and (hour > 20 or hour < 7)):
        return True
    else:
        return False
