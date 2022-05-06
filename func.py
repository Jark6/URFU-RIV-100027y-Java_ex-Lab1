import math
#class Functions:
def fac(n):
    if n == 0:
        return 1
    else:
        return fac(n - 1) * n

def accom (n,m):
    return int(fac(n)/fac(n-m))

def combin(n,m):
    return int(fac(n)/(fac(m)*fac(n-m)))

def bernulli(n,k,p):
    return combin(n,k)*(p**k)*((1-p)**(n-k))

def muavr_laplass(n,k,p):
    q=float(1-p)
    u=(k-n*p)/((n*p*q)**0.5)
    f_u=math.e**(-u**2/2)/(2*math.pi)**0.5
    return f_u/(n*p*q)**0.5

def puasson(n,k,p):
    a=n*p
    return a**k/fac(k)*math.e**(-a)

def quadro_eq(a,b,c):
    Discr = b**2-4*a*c
    if Discr<0:
        return('Корней нет')
    elif Discr==0:
        x = -b / (2 * a)
        return(f'Один корень x = {x}')
    else:
        x1 = (-b + Discr**0.5) / (2 * a)
        x2 = (-b - Discr**0.5) / (2 * a)
        return (f'x1 = {x1}; x2 = {x2}')
