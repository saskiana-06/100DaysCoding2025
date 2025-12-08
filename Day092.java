 public static String cekPassword(String pass) {
        if (pass.equals("bubble123")) {
            return "Password benar!";
        }
        return "Password salah!";
    }

    public static void main(String[] args) {
        System.out.println(cekPassword("bubble123"));
    }

}
