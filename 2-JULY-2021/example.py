class Employee:
    def __init__(self, name, salary=0) -> None:
        self.name = name
        self.salary = salary
    def giveRaise(self, percent):
        self.salary = self.salary + (self.salary * percent)
    def work(self):
        print(self.name + " does stuff")
class Chef(Employee):
    def __init__(self, name, salary) -> None:
        super().__init__(name, salary=5000)
    def work(self):
        print(self.name + " makes food")
emp1 = Employee("rohan", 10000)
emp1.giveRaise(2)
emp1.work()
emp2 = Employee("Radhe", 20000)
emp2.giveRaise(2)
emp2.work()

chef1 = Chef("Rohit", 50000)
chef1.work()
print(emp1.__dict__)
print(emp2.__dict__)
print(chef1.__dict__)
