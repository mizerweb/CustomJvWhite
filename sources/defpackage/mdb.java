package defpackage;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class mdb {
    public final WeakReference a;
    public final Executor b;
    public final /* synthetic */ ndb c;

    public mdb(ndb ndbVar, c85 c85Var, Executor executor) {
        this.c = ndbVar;
        this.a = new WeakReference(c85Var);
        this.b = executor;
    }
}
