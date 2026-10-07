package defpackage;

import android.content.Context;
import android.net.Uri;

/* JADX INFO: loaded from: classes3.dex */
public final class rq9 {
    public final ny8 a;
    public final ny8 b;

    public rq9(ny8 ny8Var) {
        this.a = ny8Var;
        this.b = rx8.P(3, new w40(ny8Var, 16));
    }

    public final v78 a(Uri uri) {
        ny8 ny8Var = this.a;
        bne bneVar = new bne(wk8.D((Context) ny8Var.getValue()) / 8, wk8.t((Context) ny8Var.getValue()) / 8, 0.0f, 12);
        w78 w78VarD = w78.d(uri);
        w78VarD.d = bneVar;
        w78VarD.k = (jxb) this.b.getValue();
        w78VarD.m = at5.a;
        return w78VarD.a();
    }
}
