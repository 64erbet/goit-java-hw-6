class NameParser {
    public String parse(String[] names) {
        String result = "";
        
        StringBuilder sam_SB = new StringBuilder();
        
        for(int i = 0; i < names.length; i++) {
            sam_SB.append(names[i].split(" ")[0]);
            if (i != names.length - 1) {
               sam_SB.append(", ");
            }
        }
      
        return(sam_SB.toString());
    }
}

class NameParserTest {
    public static void main(String[] args) {
        String[] names = {"John Doe", "Bill Mask", "Nigua Joshua"};

        //John, Bill, Nigua
        System.out.println(new NameParser().parse(names));
    }
}