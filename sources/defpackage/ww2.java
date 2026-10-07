package defpackage;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ww2 {
    public static final ww2 f = new ww2(null, 0, 0, 0, Collections.EMPTY_LIST);
    public static final ww2 g = new ww2(null, 0, 0, 0, Collections.EMPTY_LIST);
    public final ex2 a;
    public final int b;
    public final long c;
    public final long d;
    public final List e;

    public ww2(ex2 ex2Var, int i, long j, long j2, List list) {
        this.a = ex2Var;
        this.b = i;
        this.c = j;
        this.d = j2;
        this.e = list;
    }

    public final vw2 a() {
        vw2 vw2Var = new vw2();
        vw2Var.d = this.a;
        vw2Var.c = this.b;
        vw2Var.a = this.c;
        vw2Var.b = this.d;
        vw2Var.e = this.e;
        return vw2Var;
    }
}
