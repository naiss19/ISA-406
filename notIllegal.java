public class notIllegal {
    
    public void iter() {
        public String[][] s = {{"A","B","C"}, {"1","2","3"}};
        String inject;
        for(int i = 0; i < s.length; i++) {
            for(int j = 0; j < s.length; j++) {
                inject += s[i][j];
            }
        }
    }
}
