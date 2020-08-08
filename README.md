### vkbot
##### Description
    This application constitutes a VK bot that takes a text 
    from recieved message and send it back to the sender.
##### How to start the app
    First of all, application needs to be connected to VK community page. 
    Unfortunately, this should be done 
    every time ngrok restarted, because everytime ngrok produces a different 
    link. To connect the app to the community page you need to start ngrok on 
    port 8080, copy link from ngrok and paste it in server addres field in 
    community settings. After this, confirmation string should be copied from 
    community settings and pasted in application.properties to 
    message.confirmation_code string. Then start the app using the "play button"
    in Intellij IDEA, go to community settings and press "Подтвердить" button.       
    Now it works and you can test it out!
     