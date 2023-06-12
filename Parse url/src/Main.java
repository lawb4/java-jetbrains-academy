class Main {
    public static void main(String[] args) {
        String url = "https://target.com/index.html?pass=12345&port=8080&cookie=&host=localhost";

        String pass = "pass";
        String port = "port";
        String cookie = "cookie";
        String host = "host";

        String getPass = "";
        String[] forPass = url.split("\\?");
        for (int i = 0; i < 5; i++) {
            pass.ind
            getPass = "" + forPass[i];
        }

        String getPort = "";
        String[] forPort = url.split("port=");
        for (int i = 0; i < 4; i++) {
            if (forPort[i].equals("&")){
                getPort = "not found";
                break;
            }
            getPort = "" + forPort[i];
        }

        String getCookie = "";
        String[] forCookie = url.split("cookie=");
        for (int i = 0; i < 5; i++) {
            if (forCookie[i].equals("&")){
                getCookie = "not found";
                break;
            }
            getCookie = "" + forCookie[i];
        }

        String getHost = "";
        String[] forHost = url.split("host=");
        for (int i = 0; i < 5; i++) {
            if (forHost[i].equals("&")){
                getHost = "not found";
                break;
            }
            getHost = "" + forHost[i];
        }

        if (url.contains(pass)){
            System.out.println("pass : " + getPass + "\n" +
                    "port : " + getPort + "\n" +
                    "cookie : " + getCookie + "\n" +
                    "host : " + getHost + "\n" +
                    "password : " + getPass + "\n");
        }
    }
}