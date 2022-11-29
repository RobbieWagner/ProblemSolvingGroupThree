def super_stronk_recursive_func(n: int):
    if n == 1:
        print(1)
    elif n % 2 == 0:
        print(n, " ", end="")
        super_stronk_recursive_func(int(n / 2))
    else:
        print(n, " ", end="")
        super_stronk_recursive_func((n * 3) + 1)


def main():
    n = int(input())

    super_stronk_recursive_func(n)


if __name__ == '__main__':
    main()
