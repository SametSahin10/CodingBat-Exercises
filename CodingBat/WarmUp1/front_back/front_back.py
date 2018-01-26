def front_back(str):
    if(len(str) > 2):
        str = str[-1] + str.partition(str[0])[2].partition(str[-1])[0] + str[0]
    elif(len(str) == 2):
        str = str[-1] + str[0]
    return str
