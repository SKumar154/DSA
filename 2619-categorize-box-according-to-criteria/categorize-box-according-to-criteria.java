class Solution {
    public String categorizeBox(int length, int width, int height, int mass) {
        
        StringBuilder str = new StringBuilder();
        long vol = (long)length*width*height;
        if(vol>=1000000000 || length>=10000 || width>=10000 || height>=10000 || mass>=10000){
            str.append("Bulky");
        }
        if(mass>=100){
            str.append("Heavy");
        }
        StringBuilder res = new StringBuilder();
        if(str.toString().equals("BulkyHeavy")){
            res.append("Both");
        }else if(str.toString().equals("")){
            res.append("Neither");
        }else if(str.toString().equals("Bulky")){
            res.append("Bulky");
        }else if(str.toString().equals("Heavy")){
            res.append("Heavy");
        }

        return res.toString();
    }
}