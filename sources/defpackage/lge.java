package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class lge implements Serializable {
    public final Pattern a;

    /* JADX WARN: Illegal instructions before constructor call */
    public lge(String str, int i) {
        int iE = iic.e(2);
        this(Pattern.compile(str, (iE & 2) != 0 ? iE | 64 : iE));
    }

    public static tn9 a(lge lgeVar, CharSequence charSequence) {
        return pnl.a(lgeVar.a.matcher(charSequence), 0, charSequence);
    }

    public final boolean b(CharSequence charSequence) {
        return this.a.matcher(charSequence).matches();
    }

    public final String c(String str, cf7 cf7Var) {
        int i = 0;
        tn9 tn9VarA = pnl.a(this.a.matcher(str), 0, str);
        if (tn9VarA == null) {
            return str.toString();
        }
        int length = str.length();
        StringBuilder sb = new StringBuilder(length);
        do {
            sb.append((CharSequence) str, i, tn9VarA.b().a);
            sb.append((CharSequence) cf7Var.invoke(tn9VarA));
            i = tn9VarA.b().b + 1;
            tn9VarA = tn9VarA.d();
            if (i >= length) {
                break;
            }
        } while (tn9VarA != null);
        if (i < length) {
            sb.append((CharSequence) str, i, length);
        }
        return sb.toString();
    }

    public final String d(String str, CharSequence charSequence) {
        return this.a.matcher(charSequence).replaceAll(str);
    }

    public final List e(int i, String str) {
        r5h.i1(i);
        Matcher matcher = this.a.matcher(str);
        if (i == 1 || !matcher.find()) {
            return Collections.singletonList(str.toString());
        }
        int i2 = 10;
        if (i > 0 && i <= 10) {
            i2 = i;
        }
        ArrayList arrayList = new ArrayList(i2);
        int i3 = i - 1;
        int iEnd = 0;
        do {
            arrayList.add(str.subSequence(iEnd, matcher.start()).toString());
            iEnd = matcher.end();
            if (i3 >= 0 && arrayList.size() == i3) {
                break;
            }
        } while (matcher.find());
        arrayList.add(str.subSequence(iEnd, str.length()).toString());
        return arrayList;
    }

    public final String toString() {
        return this.a.toString();
    }

    public lge(String str) {
        this(Pattern.compile(str));
    }

    public lge(Pattern pattern) {
        this.a = pattern;
    }
}
