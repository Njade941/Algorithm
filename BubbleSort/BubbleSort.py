def bubbleSort(data):
    length = len(data)
    for i in range(length):
        for j in range(length - i - 1):
            if data[j] > data[j + 1]:
                data[j], data[j+1] = data[j+1], data[j]
            print(data)
        print('\n')


data = [4, 5, 3, 2, 1]
bubbleSort(data)

print(data)