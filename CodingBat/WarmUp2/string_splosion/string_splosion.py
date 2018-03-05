def string_splosion(str):
    count = 0
    foo = ""
    for i in str:
        foo += str[:count]
        count += 1
    foo += str
    return foo
