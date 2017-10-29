package com.sudin;

import com.restfb.DefaultFacebookClient;
import com.restfb.FacebookClient;
import com.restfb.types.User;

public class main {

    public static void main(String[] args) {
        String accessToken="Your Access Token";
        FacebookClient facebookClient=new DefaultFacebookClient(accessToken);

        User me=facebookClient.fetchObject("me",User.class);

        System.out.println(me.getName());


    }

}
