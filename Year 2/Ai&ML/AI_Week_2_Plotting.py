# -*- coding: utf-8 -*-
"""Plotting.ipynb

Automatically generated by Colab.

Original file is located at
    https://colab.research.google.com/drive/17a23P7nh8-3r4IjxMeSNLLUur8ON__8x
"""

#for scatter plot
import matplotlib.pyplot as plt
 #uses matplotlib to make it easier (its a wrapper) and adds heat maps and violin maps
import seaborn as sns
import pandas as pd

df = pd.DataFrame({'x':[1,2,3,4,5], 'y':[2,4,6,8,10]})

#usually we like to do a scatter plot of features to see the relationship between them
plt.figure(figsize=(4,3))
plt.scatter(df.x,df.y, color = 'red', marker = 'x')
plt.title('Scatter Plot')
plt.xlabel('x')
plt.ylabel('y')
plt.show()

#using seaborn

sns.scatterplot(data = df, x = 'x', y = 'y')

plt.show()

#load happiness.csv
happiness_data = pd.read_csv('happiness.csv')
happiness_data.head()

#removing columns
data = happiness_data.drop(['Country name', 'Regional indicator'], axis = 1)
data.head()

#correlations
data.corr()

#using seaborn we plot the correlations to easier see the relationships

sns.heatmap(data.corr(), annot = True, cmap=sns.cubehelix_palette(as_cmap=True), vmin = -1, vmax = 1)
plt.title('Correlation Matrix')
plt.show()

#plot happiness Rank vs happiness Score
sns.scatterplot(data = happiness_data, x = "Happiness Rank", y = "Happiness Score")
plt.title('Happiness Rank vs Happiness Score')
plt.show()

#plot another feature vs happiness score
sns.scatterplot(data = happiness_data, x = "GDP per capita", y = "Happiness Score")
plt.title('Economy (GDP per Capita) vs Happiness Score')
plt.show()