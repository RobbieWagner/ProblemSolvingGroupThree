def print_all_combos_of_bits(n):

    char_0 = "0"
    char_1 = "1"

    working_list = [char_0, char_1]

    for i in range(1, n):
        front = [char_0 + j for j in working_list]
        end = [char_1 + j for j in working_list[::-1]]

        working_list = front + end

    for thing in working_list:
        print(thing)


def main():
    # get all bit combinations for a given n

    n = int(input())

    print_all_combos_of_bits(n)


if __name__ == '__main__':
    main()
