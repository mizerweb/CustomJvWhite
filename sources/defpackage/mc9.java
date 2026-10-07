package defpackage;

import android.os.LocaleList;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class mc9 {
    public static final mc9 b = new mc9(new nc9(new LocaleList(new Locale[0])));
    public final nc9 a;

    public mc9(nc9 nc9Var) {
        this.a = nc9Var;
    }

    public static mc9 a(String str) {
        if (str == null || str.isEmpty()) {
            return b;
        }
        String[] strArrSplit = str.split(",", -1);
        int length = strArrSplit.length;
        Locale[] localeArr = new Locale[length];
        for (int i = 0; i < length; i++) {
            String str2 = strArrSplit[i];
            int i2 = lc9.a;
            localeArr[i] = Locale.forLanguageTag(str2);
        }
        return new mc9(new nc9(new LocaleList(localeArr)));
    }

    public final Locale b(int i) {
        return this.a.a.get(i);
    }

    public final boolean c() {
        return this.a.a.isEmpty();
    }

    public final int d() {
        return this.a.a.size();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof mc9) {
            return this.a.equals(((mc9) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }

    public final String toString() {
        return this.a.a.toString();
    }
}
