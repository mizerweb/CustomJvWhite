package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final class stj {
    public final long a;
    public final long b;
    public final Context c;
    public final ifh d;
    public final ifh e;

    public stj(long j, long j2, Context context, gjf gjfVar, iv4 iv4Var) {
        this.a = j;
        this.b = j2;
        this.c = context;
        this.d = new ifh(new j0i(this, 19, gjfVar));
        this.e = new ifh(new i8f(this, gjfVar, iv4Var, 13));
    }

    public final rtj a(boolean z) {
        return z ? (ltj) this.e.getValue() : (ftj) this.d.getValue();
    }
}
