package defpackage;

import android.content.Context;
import android.net.Uri;

/* JADX INFO: loaded from: classes.dex */
public final class t1d extends x0 {
    public final b78 n;
    public final xe4 o;

    public t1d(Context context, xe4 xe4Var, b78 b78Var) {
        super(context);
        this.n = b78Var;
        this.o = xe4Var;
    }

    public final void b(Uri uri) {
        if (uri == null) {
            this.c = null;
            return;
        }
        w78 w78VarD = w78.d(uri);
        w78VarD.e = iue.d;
        this.c = w78VarD.a();
    }
}
