### vkbot
##### Description
    This application constitutes a VK bot that takes a text 
    from recieved message and send it back to the sender.
    
##### How to start the app
    First of all, application needs to be connected to VK community page. 
    To get this done you should to start ngrok on port 8080, copy link from 
    ngrok and paste it in server addres field in community settings. 
    After this, confirmation string should be copied from community settings 
    and pasted in application.properties file to message.confirmation_code 
    string. Also, message.token should be filled with token from your 
    community page. Token is used for create an url to connect with VK API.
    The message.ok_reply string should contain 'ok'.
    
    Unfortunately, this connection routine should be done every time ngrok 
    restarted, because everytime ngrok produces a different link. 
    When connection is done you able to start the application, 
    go to community settings and press "Подтвердить" button. 
           
    Now it works and you can test it out!
     