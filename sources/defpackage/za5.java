package defpackage;

import android.content.Context;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
public final class za5 implements pu7, qu7 {
    public final xa5 a;
    public final Context b;
    public final xwd c;
    public final Set d;
    public final Executor e;

    public za5(Context context, String str, Set set, xwd xwdVar, Executor executor) {
        this.a = new xa5(context, str);
        this.d = set;
        this.e = executor;
        this.c = xwdVar;
        this.b = context;
    }

    public final kam a() {
        return !e2m.a(this.b) ? gwl.e("") : gwl.c(new ya5(this, 1), this.e);
    }

    public final void b() {
        if (this.d.size() <= 0) {
            gwl.e(null);
        } else if (e2m.a(this.b)) {
            gwl.c(new ya5(this, 0), this.e);
        } else {
            gwl.e(null);
        }
    }
}
