def missing_char(str, n):
    l = str.partition(str[n])
    str = l[0] + l[2]
    return str
