package defpackage;

import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public final class y59 {
    public final ny8 a;
    public final ny8 b = rx8.P(3, new q38(24));

    public y59(ny8 ny8Var) {
        this.a = ny8Var;
    }

    public final x59 a(String str, boolean z) {
        int i = 1;
        if (str.length() >= 4) {
            if (r5h.U0(str, ' ', 0, 6) >= 0) {
                i = 2;
            } else if (z5h.K0(str, "https://", true) || ((z && z5h.K0(str, "http://", true)) || z5h.K0(str, "max://", true))) {
                i = (((Pattern) this.b.getValue()).matcher(str).matches() || ((w69) this.a.getValue()).d(str)) ? 0 : 3;
            } else {
                i = 4;
            }
        }
        return i != 0 ? new v59(i) : w59.a;
    }
}
