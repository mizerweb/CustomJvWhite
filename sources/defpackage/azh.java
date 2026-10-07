package defpackage;

import android.content.Context;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public final class azh {
    public final Context a;
    public final fg4 b;
    public final iu0 c;
    public final hdb d;
    public final fg4 e;

    public azh(Context context, azj azjVar) {
        iu0 iu0Var = new iu0(context.getApplicationContext(), azjVar, 0);
        iu0 iu0Var2 = new iu0(context.getApplicationContext(), azjVar, 1);
        hdb hdbVarA = Build.VERSION.SDK_INT < 28 ? gdb.a(context.getApplicationContext(), azjVar) : null;
        iu0 iu0Var3 = new iu0(context.getApplicationContext(), azjVar, 2);
        this.a = context;
        this.b = iu0Var;
        this.c = iu0Var2;
        this.d = hdbVarA;
        this.e = iu0Var3;
    }
}
