from graphviz import Digraph

# Create a flowchart
dot = Digraph()

# Nodes
dot.node('A', 'Start', shape='oval')
dot.node('B', 'Register?', shape='diamond')
dot.node('C', 'Sign In', shape='rectangle')
dot.node('D', 'Sign Up', shape='rectangle')
dot.node('E', 'Navigate to Home Page', shape='rectangle')
dot.node('F', 'Add Expense or Income?', shape='diamond')
dot.node('G', 'Choose Category (Income/Expense)', shape='rectangle')
dot.node('H', 'Enter Amount', shape='rectangle')
dot.node('I', 'If Income: Auto-set Category to Salary', shape='rectangle')
dot.node('J', 'If Expense: Choose Category (Rent, Bills, Education, Others)', shape='rectangle')
dot.node('K', 'Save Transaction', shape='rectangle')
dot.node('L', 'View Budget Report', shape='rectangle')
dot.node('M', 'View Data Visualization', shape='rectangle')
dot.node('N', 'End', shape='oval')

# Edges
dot.edge('A', 'B')
dot.edge('B', 'C', label='Yes')
dot.edge('B', 'D', label='No')
dot.edge('C', 'E')
dot.edge('D', 'E')
dot.edge('E', 'F')
dot.edge('F', 'G', label='Yes')
dot.edge('F', 'L', label='No')
dot.edge('G', 'H')
dot.edge('H', 'I', label='If Income')
dot.edge('H', 'J', label='If Expense')
dot.edge('I', 'K')
dot.edge('J', 'K')
dot.edge('K', 'M')
dot.edge('L', 'M')
dot.edge('M', 'N')

# Render the flowchart
dot
