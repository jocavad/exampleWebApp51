<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>login</title>
    <style>

@font-face {
  font-family: 'Exo' ;
  src: url("../fonts/static/Exo-ExtraLight.ttf");
  font-weight: normal;
  font-style: normal;
}

*{
  font-family: 'Exo';
}

        body {
            margin: 0;
            height: 100vh;
        }

        #mainPic {
            width: 100%;
            height: 100%;
            display: flex;
            flex-direction: column;
            overflow: hidden;
            position: absolute;
        }

        #mainPic > img{
            filter: blur(10px);
        }

        #mainPic>div {
            position: absolute;
            /* top: 50%;
            left: 50%;
            transform: translate(-50%, -50%); */
        }

        /* #mainPic {
            width: 100%;
            height: 100%;
            display:grid;
            grid-template: 
            "row1" 1fr
            "row2" 10%
            /100%
            ;
            overflow: hidden;

        } */

        /* #loginCenter{
            position: absolute;
            grid-area: row1;
            background-color: rgba(255, 0, 0, 0.3);
            top: 50%;
            left: 50%;
            transform: translate(-50%, -50%);
        }


        #cantLog{
            position: absolute;
            grid-area: row2;
            background-color: rgba(255, 0, 0, 0.3);
            top: 50%;
            left: 50%;
            transform: translate(-50%, -50%);
        } */


        #mainPic>div {
            position: absolute;
            /* top: 50%;
            left: 50%;
            transform: translate(-50%, -50%); */
        }


        #loginCenter {
            background-color: rgba(175, 181, 202, 0.3);
            height: 50%;
            width: 50%;
            top: 50%;
            left: 50%;
            transform: translate(-50%, -50%);
            border-radius: 20px;
        }

        #login {
            position: absolute;
            top: 50%;
            left: 50%;
            transform: translate(-50%, -50%);
            color: white;
        }




        #cantLog {
            /* background-color: rgba(255, 0, 0, 0.3); */
            top: 80%;
            left: 45%;
            transform: translate(-10%, -10%);
            color: white;
            
            text-align: center;
        }

        #loginForm {
            /* margin: 0 auto;
            width: 15rem; */
            display: flex;
            /*properties below only for flex container*/
            justify-content: center;
            align-items: center;
            flex-direction: column;
            text-align: center;
            /* align-self: center; */
            margin: 10% 0;
        }

        input[type="submit"]{
            background-color: #569e9b;
            border: none;
            color: white;
            padding: 10px 0px;
            text-decoration: none;
            margin: 1px 1px;
            width: 200px;
            transition: 0.5s;
        }

        input[type="submit"]:active{
            background-color: inherit;
            filter: brightness(70%);
        }
        
        input[type="submit"]:hover{
            background-color: blue;
        }
        /* nav a{
  text-decoration: none;
  text-align: center;
  padding: 1em;
  display: inline-block;
  color: var(--light-color);
  transition: 0.5s;
}

nav a:hover{
  background-color: var(--bright-color);
} */


        input[type="text"],
        input[type="password"]{
            background-color: rgba(0, 0, 0, 0.1);
            border: none;
            color: white;
            padding: 10px 0;
            text-decoration: none;
            margin: 1px 1px;
            outline: 0;
            border-bottom: 2px solid blue;
            /* border-color: blue; */
            width: 200px;
        }

        input:focus {
                border-color: green
        }

        #logoPic{
            width: 50px;
            height: 50px;
            border-radius: 20px;
            background-color: white;
            margin: 5px;
        }

         #logo{
            display: flex;
        } 
    </style>
</head>

<body>
    <div id="mainPic">
        <img src="https://www.nlspacecampus.eu/cache/3/1920x1080/mob-shutterstock-481251031-20210610135721_1920x1080.jpg"
            alt="">
        <div id="loginCenter">
            <div id="login">
                <div id="logo">
                    <div id="logoPic"></div>
                    <h1>LOGO</h1>
                </div>
                <h2>Log in to your account</h2>
                <div id="loginForm">
                    <form class="frm" action="/exampleWebApp51/application/login" method="post">
                        <div>
                            ${error_message}
                        </div>
                        <div id="un">
                            <input type="text" name="username" id="username">
                        </div>
                        <div id="pass">
                            <input type="password" name="password">
                        </div>
                        <input type=submit name="login" value="Login">
                    </form>
                </div>
            </div>
        </div>
        <div id="cantLog">
            <h4>Can't log in?</h4>
            <h5>Privacy policy Terms of use</h5>
        </div>
    </div>
</body>

</html>