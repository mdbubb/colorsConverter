/**
 * Created by mdb17 on 1/26/2017.
 */
public class CommonName {
    static String [] Commonnames = {"Black","Navy","DarkBlue","MediumBlue","Blue","DarkGreen","Green","Teal","DarkCyan","DeepSkyBlue",
            "DarkTurquoise","MediumSpringGreen","Lime","SpringGreen","Aqua","Cyan","MidnightBlue","Dodgeblue2",
            "LightSeaGreen","ForestGreen","SeaGreen","DarkSlateGray","DarkSlateGrey","LimeGreen","MediumSeaGreen",
            "Turquoise","RoyalBlue","SteelBlue","DarkSlateBlue","MediumTurquoise","Indigo","DarkOliveGreen",
            "CadetBlue","Cornfloweblue2","RebeccaPurple","MediumAquaMarine","DimGray","DimGrey","SlateBlue",
            "OliveDrab","SlateGray","SlateGrey","LightSlateGray","LightSlateGrey","MediumSlateBlue","LawnGreen",
            "Chartreuse","Aquamarine","Maroon","Purple","Olive","Gray","Grey","SkyBlue","LightSkyBlue",
            "BlueViolet","DarkRed","DarkMagenta","SaddleBrown","DarkSeaGreen","LightGreen","MediumPurple",
            "DarkViolet","PaleGreen","DarkOrchid","YellowGreen","Sienna","Brown","DarkGray","DarkGrey",
            "LightBlue","GreenYellow","PaleTurquoise","LightSteelBlue","Powdeblue2","FireBrick ","DarkGoldenRod",
            "MediumOrchid","RosyBrown","DarkKhaki","Silver","MediumVioletRed","IndianRed","Peru ","Chocolate",
            "Tan","LightGray","LightGrey","Thistle","Orchid","GoldenRod","PaleVioletRed","Crimson",
            "Gainsboro","Plum","BurlyWood","LightCyan","Lavender","DarkSalmon","Violet","PaleGoldenRod",
            "LightCoral","Khaki","AliceBlue","HoneyDew","Azure","SandyBrown","Wheat","Beige","WhiteSmoke",
            "MintCream","GhostWhite","Salmon","AntiqueWhite","Linen","LightGoldenRodYellow","OldLace",
            "Red","Fuchsia ","Magenta","DeepPink","OrangeRed","Tomato","HotPink","Coral","DarkOrange",
            "LightSalmon","Orange","LightPink","Pink","Gold","PeachPuff","NavajoWhite","Moccasin",
            "Bisque","MistyRose","BlanchedAlmond","PapayaWhip","LavenderBlush","SeaShell","Cornsilk",
            "LemonChiffon","FloralWhite","Snow","Yellow","LightYellow","Ivory","White"};

    static String [] hexCodes = {"000000" ,"000080" ,"00008B" ,"0000CD" ,"0000FF" ,"006400" ,"008000"
            ,"008080" ,"008B8B" ,"00BFFF" ,"00CED1" ,"00FA9A" ,"00FF00" ,"00FF7F" ,"00FFFF"
            ,"00FFFF" ,"191970" ,"1E90FF" ,"20B2AA" ,
            "228B22" ,"2E8B57" ,"2F4F4F" ,"2F4F4F" ,"32CD32" ,"3CB371" ,"40E0D0" ,"4169E1"
            ,"4682B4" ,"483D8B" ,
            "48D1CC" ,"4B0082" ,"556B2F" ,"5F9EA0" ,"6495ED" ,"663399" ,"66CDAA" ,"696969" ,"696969" ,"6A5ACD" ,
            "6B8E23" ,"708090" ,"708090" ,"778899" ,"778899" ,"7B68EE" ,"7CFC00" ,"7FFF00" ,"7FFFD4" ,"800000" ,
            "800080" ,"808000" ,"808080" ,"808080" ,"87CEEB" ,"87CEFA" ,"8A2BE2" ,"8B0000" ,"8B008B" ,"8B4513" ,
            "8FBC8F" ,"90EE90" ,"9370DB" ,"9400D3" ,"98FB98" ,"9932CC" ,"9ACD32" ,"A0522D" ,"A52A2A" ,"A9A9A9" ,
            "A9A9A9" ,"ADD8E6" ,"ADFF2F" ,"AFEEEE" ,"B0C4DE" ,"B0E0E6" ,"B22222" ,"B8860B" ,"BA55D3" ,"BC8F8F" ,
            "BDB76B" ,"C0C0C0" ,"C71585" ,"CD5C5C" ,"CD853F" ,"D2691E" ,"D2B48C" ,"D3D3D3" ,"D3D3D3" ,"D8BFD8" ,
            "DA70D6" ,"DAA520" ,"DB7093" ,"DC143C" ,"DCDCDC" ,"DDA0DD" ,"DEB887" ,"E0FFFF" ,"E6E6FA" ,"E9967A" ,
            "EE82EE" ,"EEE8AA" ,"F08080" ,"F0E68C" ,"F0F8FF" ,"F0FFF0" ,"F0FFFF" ,"F4A460" ,"F5DEB3" ,"F5F5DC" ,
            "F5F5F5" ,"F5FFFA" ,"F8F8FF" ,"FA8072" ,"FAEBD7" ,"FAF0E6" ,"FAFAD2" ,"FDF5E6" ,"FF0000" ,"FF00FF" ,
            "FF00FF" ,"FF1493" ,"FF4500" ,"FF6347" ,"FF69B4" ,"FF7F50" ,"FF8C00" ,"FFA07A" ,"FFA500" ,"FFB6C1" ,
            "FFC0CB" ,"FFD700" ,"FFDAB9" ,"FFDEAD" ,"FFE4B5" ,"FFE4C4" ,"FFE4E1" ,"FFEBCD" ,"FFEFD5" ,"FFF0F5" ,
            "FFF5EE" ,"FFF8DC" ,"FFFACD" ,"FFFAF0" ,"FFFAFA" ,"FFFF00" ,"FFFFE0" ,"FFFFF0" ,"FFFFFF" };

            public void nextMethod(String name){
                hex c = new hex();
                for(int i=0; i<Commonnames.length; i++){
                    if(name.equalsIgnoreCase(Commonnames[i])){
                        System.out.println("Your hex code is " + hexCodes[i]);

                    }
                    String one = hexCodes[i].substring(0,2);
                    String two = hexCodes[i].substring(2,4);
                    String three = hexCodes[i].substring(4,6);
                }
            }
            public void almostDone(String code){
                for(int i=0; i<hexCodes.length; i++){
                    if(code.equalsIgnoreCase(hexCodes[i])){
                        System.out.println("Your common HTML name is " + Commonnames[i]);
                    }
                    //Hi Mr. P
                }
            }
}
