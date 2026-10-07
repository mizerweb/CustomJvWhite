package defpackage;

import android.content.Context;
import android.content.res.Resources;

/* JADX INFO: loaded from: classes.dex */
public final class u1d implements oah {
    public final Context a;
    public final b78 b;
    public final xe4 c;

    public u1d(Context context, ki3 ki3Var) {
        f78 f78VarG = f78.g();
        this.a = context;
        b78 b78VarF = f78VarG.f();
        this.b = b78VarF;
        x5c x5cVar = (x5c) ki3Var.b;
        if (x5cVar != null) {
            this.c = x5cVar;
        } else {
            this.c = new xe4();
        }
        xe4 xe4Var = this.c;
        Resources resources = context.getResources();
        ag5 ag5VarC = ag5.c();
        e85 e85VarA = f78VarG.a();
        f78VarG.b.w.getClass();
        tai taiVarL = tai.l();
        taa taaVar = b78VarF.f;
        b50 b50Var = (b50) ki3Var.a;
        oah oahVar = (oah) ki3Var.c;
        xe4Var.a = resources;
        xe4Var.b = ag5VarC;
        xe4Var.c = e85VarA;
        xe4Var.d = taiVarL;
        xe4Var.e = taaVar;
        xe4Var.f = b50Var;
        xe4Var.g = oahVar;
    }

    @Override // defpackage.oah
    /* JADX INFO: renamed from: a */
    public final t1d get() {
        return new t1d(this.a, this.c, this.b);
    }
}
