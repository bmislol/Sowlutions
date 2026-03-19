class DataProcessor:
    def __init__(self):
        pass

    def filter_data(self, data, filter_criteria):
        return list(filter(filter_criteria, data))
    
    def transform_data(self, data, tranform_criteria):
        return list(map(tranform_criteria, data))
    
    def sum_data(self, data):
        return sum(data)
    
    def calc_average(self, data):
        return sum(data) / len(data)
    
    def find_max(self, data):
        return max(data)
    
    def find_min(self, data):
        return min(data)
    
class Main:
    def __init__(self):
        data_processor = DataProcessor()

        data = [1,2,3,4,5,6,7,8,9]

        data = data_processor.filter_data(data,lambda x: x % 2 == 0)
        print(data)

        data = [1,2,3,4,5]

        data = data_processor.transform_data(data, lambda x: x*2)
        print(data)

        data = [10,20,30,40,50]

        sum = data_processor.sum_data(data)
        print(sum)

        average = data_processor.calc_average(data)
        print(average)

        data = [15,5,35,25,45]

        print(data_processor.find_max(data))
        print(data_processor.find_min(data))
    
Main = Main()