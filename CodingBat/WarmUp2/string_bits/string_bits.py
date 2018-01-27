def string_bits(str):
    count = 0
    foo = ""
    for char in str:
        if(count % 2 == 0):
            foo += str[count]
        count += 1
    return foo
