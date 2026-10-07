package defpackage;

import android.content.Context;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import java.util.HashMap;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes4.dex */
public abstract class wl5 {
    public static final HashMap a;
    public static final Pattern b;

    static {
        HashMap map = new HashMap();
        map.put("px", 0);
        map.put("dip", 1);
        map.put("dp", 1);
        map.put("sp", 2);
        tt2.e(3, map, "pt", 4, "in");
        map.put("mm", 5);
        a = map;
        b = Pattern.compile("^\\s*(\\d+(\\.\\d+)*)\\s*([a-zA-Z]+)\\s*$");
    }

    public static float a(Context context, String str) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        Matcher matcher = b.matcher(str);
        if (!matcher.matches()) {
            throw new NumberFormatException();
        }
        float fFloatValue = Float.valueOf(matcher.group(1)).floatValue();
        Integer num = (Integer) a.get(matcher.group(3).toLowerCase(Locale.ROOT));
        if (num != null) {
            return TypedValue.applyDimension(num.intValue(), fFloatValue, displayMetrics);
        }
        throw new NumberFormatException();
    }
}
