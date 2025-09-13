
# Changelog:
> Include:
> - Commit with a message and push when you complete each of the tasks listed below
> - Prompt, file name, line number, and change.
### C

> ### TODO:
> * Ask about extra requirement here
> ### Prompt:
> > Customize the HTML user interface for your customer’s application. The user interface should include the shop name, the product names, and the names of the parts.
> ### File Names:
> mainscreen.html
> ### Changes:
> Line 14
> * Changed page title to reflect shop name
> 
> Line 19
> * Replaced "Shop" with shop name
> 
### D
> ### TODO:
> * Ask if you need to include the lines for about.html and AboutScreenController
> ### Prompt
> > Add an “About” page to the application to describe your chosen customer’s company to web viewers and include navigation to and from the “About” page and the main screen.
> ### File Names
>   mainscreen.html, about.html, AboutScreenController
> ### Changes
> Created AboutScreenController.java (lines 1 - 14)
> * Helps mainscreen link to about
> 
> Created about.html (lines 1 - 27)
> * Gives a company intro 
> * Links to mainscreen.html 
> 
> Mainscreen.html (line 20)
> * Added link to about.html 
### E
> ### TODO:
> * Ask if I need to include setID for outsource
> ### Prompt
> > Add a sample inventory appropriate for your chosen store to the application. You should have five parts and five products in your sample inventory and should not overwrite existing data in the database.
> ### File Names
> BootStrapData.java
> ### Changes
> Lines 66 - 121
> * Added 5 parts and 5 products
> * Made it so that it doesn't duplicate when running multiple times
### F

> ### Prompt
> >Add a “Buy Now” button to your product list. Your “Buy Now” button must meet each of the following parameters:
>>* The “Buy Now” button must be next to the buttons that update and delete products.
>>* The button should decrement the inventory of that product by one. It should not affect the inventory of any of the associated parts.
>>* Display a message that indicates the success or failure of a purchase.
> ### File Names
> mainscreen.html, confirmationbuyproduct.html, emptyerror.html, AddProductController.java
> ### Changes
> Mainscreen.html (lines 84-85)
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
### G
> ### TODO:
> *
> ### Prompt
> >
> ### File Names
>
> ### Changes
>
### H
> ### TODO:
> *
> ### Prompt
> >
> ### File Names
>
> ### Changes
>
### I
> 
### J
> 