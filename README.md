
# Changelog:

## C

> ### Prompt:
> > Customize the HTML user interface for your customer’s application. The user interface should include the shop name, the product names, and the names of the parts.
> ### File Names:
> mainscreen.html
> ### Changes:
> Line (14)
> * Changed page title to reflect shop name
> 
> Line (19)
> * Replaced "Shop" with shop name
> 
## D
> ### Prompt:
> > Add an “About” page to the application to describe your chosen customer’s company to web viewers and include navigation to and from the “About” page and the main screen.
> ### File Names:
>   mainscreen.html, about.html, AboutScreenController
> ### Changes:
> Created AboutScreenController.java (lines 1 - 14)
> * Helps mainscreen link to about
> 
> Created about.html (lines 1 - 27)
> * Gives a company intro 
> * Links to mainscreen.html 
> 
> Mainscreen.html (line 20)
> * Added link to about.html 
## E
> ### Prompt:
> > Add a sample inventory appropriate for your chosen store to the application. You should have five parts and five products in your sample inventory and should not overwrite existing data in the database.
> ### File Names:
> BootStrapData.java
> ### Changes:
> Lines (66 - 121)
> * Added 5 parts and 5 products
> * Made it so that it doesn't duplicate when running multiple times
## F

> ### Prompt:
> >Add a “Buy Now” button to your product list. Your “Buy Now” button must meet each of the following parameters:
>>* The “Buy Now” button must be next to the buttons that update and delete products.
>>* The button should decrement the inventory of that product by one. It should not affect the inventory of any of the associated parts.
>>* Display a message that indicates the success or failure of a purchase.
> ### File Names:
> mainscreen.html, confirmationbuyproduct.html, emptyerror.html, AddProductController.java
> ### Changes:
> Mainscreen.html (lines 84 - 85)
> * Added buy product button
> 
> Created confirmationbuyproduct.html (lines 1 - 32)
> * Default page for confirmed buying with button to home
> 
> Created emptyerror.html (lines 1 - 32)
> * Duplicate confirmationbuyproduct page with error message
> 
> AddProductController.java (lines 115 - 131)
> * Added Get mapping for Buy button on mainscreen
> * Gives error when buying 0 inventory
> * Gives confirmation otherwise - removes 1 from inventory
## G
> ### Prompt:
> > Modify the parts to track maximum and minimum inventory by doing the following:
>>* Add additional fields to the part entity for maximum and minimum inventory.
>>* Modify the sample inventory to include the maximum and minimum fields.
>>* Add to the InhousePartForm and OutsourcedPartForm forms additional text inputs for the inventory so the user can set the maximum and minimum values.
>>* Rename the file the persistent storage is saved to.
>>* Modify the code to enforce that the inventory is between or at the minimum and maximum value.
> ### File Names:
> mainscreen.html, InhousePartForm.html, OutsourcedPartForm.html, InventoryValidator.java, ValidInventory.java, part.java, BootStrapData.java, application.properties.
>
> ### Changes:
> Mainscreen.html
> * Lines (39 - 40): Added new headers for table (Min/Max)
> * Lines (49 - 50): Added applicable row data (Min/Max)
> 
> InhousePartForm.html & OutsourcedPartForm.html (lines 16 - 35)
> * Gave names for input forms so it's legible when filled
> * Added Min and Max inventory input forms
> * Added validation for incorrect input
> 
> Created InventoryValidator.java (lines 1 - 41)
> * Validates input (input > max or input < min)
> 
> Created ValidInventory.java (lines 1 - 24)
> * Generic input validator message
> 
> BootStrapData.java 
> * Lines (72, 73, 84, 85, 96, 97, 108, 109, 119, 120): Adds default min and max inventory
> 
> Part.java
> * Lines (33 - 36): Initializes min/max inventory values & adds input validation for negative numbers
> * Lines (99 - 115): Add getters and setters for min/max inventory values
> 
> application.properties (line 6)
> * Updated database via renaming
## H
> ### Prompt:
> > Add validation for between or at the maximum and minimum fields. The validation must include the following:
>>*  Display error messages for low inventory when adding and updating parts if the inventory is less than the minimum number of parts.
>>*  Display error messages for low inventory when adding and updating products lowers the part inventory below the minimum.
>>*  Display error messages when adding and updating parts if the inventory is greater than the maximum.
> ### File Names:
> EnufPartsValidator.java, productForm.html
> ### Changes:
> EnufPartsValidator.java (lines 36 - 39)
> * Reworked the default validator to include positive numbers below minInv
> * Displays error messaging requesting more parts inventory for change (ValidEnufParts.java)
> 
> productForm.html (lines 40, 41, 50, 51, 66, 65, 74, 75)
> * Added Min/Max columns in Products Form
> 
> See Section G "Created InventoryValidator.java(lines 1 - 41)" for Max/Min input validator requirements
## I
> ### Prompt:
> > Add at least two unit tests for the maximum and minimum fields to the PartTest class in the test package.
> ### File Names:
> PartTest.java
> ### Changes:
>  Lines (159 - 177)
> * Added testMin and testMax for inhouse and outsource parts
## J
> ### Prompt:
> > Remove the class files for any unused validators in order to clean your code.
> ### File Names:
> DeletePartValidator.java, ValidDeletePart.java, Part.java
> ### Changes:
> * Removed DeletePartValidator.java and ValidDeletePart.java
> * Part.java (lines 3, 18): Removed calls to nonexistent validators