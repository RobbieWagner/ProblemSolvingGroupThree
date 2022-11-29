def missing_no(n, list_of_ints):
    for i in range(n):
        try:
            if i + 1 != list_of_ints[i]:
                return list_of_ints[i] - 1
        except IndexError:
            return n


def main():
    n = int(input())

    list_of_ints = list(map(int, input().split(" ")))

    list_of_ints.sort()

    print(missing_no(n, list_of_ints))


if __name__ == '__main__':
    main()
