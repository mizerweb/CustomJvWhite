package defpackage;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes.dex */
public final class uw8 {
    public static final int a = gm0.K(100.0f * yl5.d().getDisplayMetrics().density);
    public static final q8b b = new q8b();
    public static int c;
    public static SharedPreferences d;
    public static final mjg e;
    public static final mjg f;

    static {
        mjg mjgVarA = p90.a(Boolean.FALSE);
        e = mjgVarA;
        f = mjgVarA;
    }

    public static int a(Context context) {
        q8b q8bVar = b;
        if (q8bVar.e == 0) {
            SharedPreferences sharedPreferences = d;
            if (sharedPreferences == null) {
                sharedPreferences = context.getApplicationContext().getSharedPreferences("keyboard_prefs", 0);
            }
            if (d == null) {
                d = sharedPreferences;
            }
            int iB = hsl.b(context) / 3;
            q8bVar.e(sharedPreferences.getInt("pref_keyboard_height_portrait", iB), "pref_keyboard_height_portrait");
            q8bVar.e(sharedPreferences.getInt("pref_keyboard_height_portrait", iB), "pref_keyboard_height_landscape");
        }
        int iB2 = q8bVar.b(hsl.a(context) ? "pref_keyboard_height_portrait" : "pref_keyboard_height_landscape");
        return iB2 >= 0 ? q8bVar.c[iB2] : hsl.b(context) / 3;
    }

    public static boolean b(int i) {
        return i > a;
    }
}
