package defpackage;

import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public final class g9 {
    public final dc9 a;
    public final String b;

    public g9(dc9 dc9Var) {
        String lowerCase;
        List list = h9.d;
        if (dc9Var == null) {
            lowerCase = "null";
        } else {
            lowerCase = ((String) dc9Var.c).toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            if (h9.d.contains(lowerCase)) {
                lowerCase = zo5.p((String) dc9Var.b, ":", lowerCase);
            }
        }
        dc9Var.getClass();
        this.a = dc9Var;
        this.b = lowerCase;
    }
}
