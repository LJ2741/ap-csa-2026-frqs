
public String getShortenedName() {
    String result = username;
    while (result.indexOf("-") != -1) {
        result = result.substring(0,result.indexOf("-") - 1) + result.substring(result.indexOf("-") + 1);
    }
  
    return result;
}
