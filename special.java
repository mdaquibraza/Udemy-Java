
/*special character nhi hona chahiye */
class special{
    public static void main(String[] args) {
        String cha="razmdaquibcom";
        System.out.println(cha.matches("[^ @ . ! @ # $ % ^ & * () - _  = + . , / ? ]*"));
        System.out.println(cha.matches("[a-z A-Z 0-9]+"));
    }
}

