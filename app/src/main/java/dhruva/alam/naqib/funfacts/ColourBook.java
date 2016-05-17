package dhruva.alam.naqib.funfacts;

import java.util.Random;
import android.graphics.Color;

/**
 * Created by naqib on 4/17/2016.
 */
public class ColourBook {
    //fields
    public String[] mColors = {
            "#39add1", // light blue
            "#3079ab", // dark blue
            "#c25975", // mauve
            "#e15258", // red
            "#f9845b", // orange
            "#838cc7", // lavender
            "#7d669e", // purple
            "#53bbb4", // aqua
            "#51b46d", // green
            "#e0ab18", // mustard
            "#637a91", // dark gray
            "#f092b0", // pink
            "#b7c0c7"  // light gray
    };
    //methods
    public int randomColour (){
        Random num = new Random();
        int random = num.nextInt(mColors.length);
        String colourString = mColors[random];
        int stringToNum = Color.parseColor(colourString);

        return stringToNum;

    }


}
