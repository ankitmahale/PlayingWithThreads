/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

/**
 *
 * @author Ankit Mahale
 */
public class deLogger {



    public static enum DebugLevel { NO_OUTPUT, CONTENTS, ENTRY_ADDED, RUN_CALLED, CONSTRUCTOR };

    private static DebugLevel debugLevel;


    public static void setDebugValue (int levelIn) {
	switch (levelIn) {
            case 0: debugLevel = DebugLevel.NO_OUTPUT; break;
            case 1: debugLevel = DebugLevel.CONTENTS; break;
            case 2: debugLevel = DebugLevel.ENTRY_ADDED; break;
            case 3: debugLevel = DebugLevel.RUN_CALLED; break;
	    case 4: debugLevel = DebugLevel.CONSTRUCTOR; break;
	}
    }

    public static void setDebugValue (DebugLevel levelIn) {
	debugLevel = levelIn;
    }

    // @return None
    public static void writeMessage (String message  , DebugLevel levelIn ) {
	if (levelIn == debugLevel)
	    System.out.println(message);
    }

    public String toString() {
	return "Debug Level is " + debugLevel;
    }
}

