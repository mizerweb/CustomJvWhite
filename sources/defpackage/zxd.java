package defpackage;

import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zxd implements Serializable {
    public final st2 a;
    public final List b;
    public final gm4 c;

    public zxd(st2 st2Var, b50 b50Var, gm4 gm4Var) {
        this.a = st2Var;
        this.b = b50Var;
        this.c = gm4Var;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.a);
        int iO = tre.O(this.b);
        return zo5.w(c0a.r(iO, "{chat=", strValueOf, ", highlights=", ", contactSearchResult="), String.valueOf(this.c), "}");
    }
}
