package defpackage;

import java.util.regex.Matcher;

/* JADX INFO: loaded from: classes3.dex */
public abstract class pnl {
    public static final tn9 a(Matcher matcher, int i, CharSequence charSequence) {
        if (matcher.find(i)) {
            return new tn9(matcher, charSequence);
        }
        return null;
    }

    public static final tn9 b(Matcher matcher, String str) {
        if (matcher.matches()) {
            return new tn9(matcher, str);
        }
        return null;
    }

    public static int c(v44 v44Var, v44 v44Var2) {
        return ew5.d(v44Var.c(v44Var2), 0L);
    }
}
