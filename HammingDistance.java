public static int hammingDistance(String str1, String str2) {
    int hammingDist = 0;

    for (int i = 0; i < str1.length(); i++) {
        if (str1.charAt(i) != str2.charAt(i)) {
            hammingDist += 1;
        }
    }

    return hammingDist;
}
