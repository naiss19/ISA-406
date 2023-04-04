public class notIllegal {
    
    public void iter() {
        public String[][] s = {{"A","B","C"}, {"1","2","3"}};
        
        for(int i = 0; i < s.length; i++) {
            String inject;
            for(int j = 0; j < 3; j++) {
                inject += s[i][j];
                
            }
            System.out.println(inject);
        }
        
    }
}
