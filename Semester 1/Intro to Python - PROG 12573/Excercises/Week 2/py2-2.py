DISCOUNT_PERCENTAGE = .2
originalPrice = 99.99

discountAmount = originalPrice * DISCOUNT_PERCENTAGE

salePrice = round((originalPrice - discountAmount), 2)

print('The sale price is $', salePrice)
