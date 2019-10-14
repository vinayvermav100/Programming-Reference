# Python representation of stacks

class Stack:

	def __init__(self, size):
		self.data = [None for i in range(size)]
		self.size = size
		self.top = -1

	def peek(self):
		if self.top < 0:
			print("Error : Stack Empty!")
		else:
			print(self.data[self.top])

	def push(self, value):
		if self.top + 1 >= self.size:
			print("Error : Stack Overflow!")
		else:
			self.top += 1
			self.data[self.top] = value
			print(str(value) + " was successfully pushed to stack.")

	def pop(self):
		if self.top == -1:
			print("Error : Stack Empty!")
		else:
			value = self.data[self.top]
			self.top -= 1
			print(str(value) + " was successfully popped out of stack.")
			return value

	def __repr__(self):
		if self.top < 0:
			return "Stack Empty!"
		else:
			return "top -> " + ",".join(map(str, reversed(self.data[:self.top+1])))

if __name__=='__main__':
	size = int(input("Enter size of stack : "))
	stack = Stack(size)
	while True:
		print("-"*20)
		print("  1. Push")
		print("  2. Pop")
		print("  3. Peek")
		print("  4. Display Stack")
		print("  5. Quit")
		print("-"*20)
		choice = int(input("Enter choice : "))

		if choice == 1:
			value = int(input("Enter data : "))
			stack.push(value)

		elif choice == 2:
			stack.pop()

		elif choice == 3:
			stack.peek()

		elif choice==4:
			print(stack)

		elif choice == 5:
			break
		else:
			print("Wrong choice!")
