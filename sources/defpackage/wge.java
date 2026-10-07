package defpackage;

import android.content.Context;
import android.util.TypedValue;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes.dex */
public final class wge {
    public static final String[] g = {"RU", "BY", "AZ", "AM", "KZ", "KG", "MD", "TJ", "UZ", "GE"};
    public final ny8 a;
    public final ny8 b;
    public final ny8 c;
    public final ny8 d;
    public final zc6 e = new zc6(new o6(11), 6);
    public final dab f;

    public wge(ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4, ny8 ny8Var5) {
        this.a = ny8Var2;
        this.b = ny8Var3;
        this.c = ny8Var4;
        this.d = ny8Var5;
        this.f = new dab(new r07(new dab(new tz(7, g), this, 8), new dab(((tu4) ny8Var.getValue()).b, this, 9), new adh(3, (lq4) null, 13), 0), this, 10);
    }

    public static String a(wge wgeVar, String str) {
        Locale localeForLanguageTag = Locale.forLanguageTag(((jc9) wgeVar.d.getValue()).b((Context) wgeVar.c.getValue()));
        String[] stringArray = ((jc9) wgeVar.d.getValue()).c((Context) wgeVar.c.getValue()).getResources().getStringArray(R.array.country_data);
        int iP0 = wm9.P0(stringArray.length);
        if (iP0 < 16) {
            iP0 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iP0);
        for (String str2 : stringArray) {
            List listM1 = r5h.m1(str2, new String[]{"|"}, 2);
            ylc ylcVar = listM1.size() == 2 ? new ylc(listM1.get(0), listM1.get(1)) : new ylc("", "");
            linkedHashMap.put(ylcVar.a, ylcVar.b);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            if (((CharSequence) entry.getValue()).length() > 0) {
                linkedHashMap2.put(entry.getKey(), entry.getValue());
            }
        }
        String str3 = (String) linkedHashMap2.get(str);
        return str3 == null ? new Locale("", str).getDisplayCountry(localeForLanguageTag) : str3;
    }

    public final x0c b(String str) {
        String str2;
        int iE = ((vtc) this.b.getValue()).e(str);
        String strA = a(this, str);
        f66 f66Var = (f66) this.a.getValue();
        if (str.length() != 2) {
            gm0.Y(wge.class.getName(), "Early return in countryCodeToFlagEmoji cuz of countryCode.length != 2");
            str2 = null;
        } else {
            String upperCase = str.toUpperCase(Locale.ROOT);
            str2 = new String(new int[]{upperCase.charAt(0) - 3675, upperCase.charAt(1) - 3675}, 0, 2);
        }
        return new x0c(str, iE, strA, f66Var.f(gm0.K(TypedValue.applyDimension(2, 24.0f, yl5.d().getDisplayMetrics())), str2));
    }
}
