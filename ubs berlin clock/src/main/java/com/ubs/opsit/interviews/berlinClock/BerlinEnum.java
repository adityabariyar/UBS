package com.ubs.opsit.interviews.berlinClock;

public enum BerlinEnum {
	OFF( "O"),
	SECOND( "Y"),
	HOUR( "RRRR"),
	MINUTE( "YYRYYRYYRYY"),
	MINUTE_NEXT ( "YYYY");
	
	
	private final String levelCode;

    private BerlinEnum(String levelCode) {
        this.levelCode = levelCode;
    }
    public static char[] toChars(String input) {
        return input.toCharArray();
    }
    @Override
    public String toString() {
    	return levelCode;
    }
}
