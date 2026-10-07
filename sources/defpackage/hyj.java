package defpackage;

import androidx.work.impl.WorkDatabase;

/* JADX INFO: loaded from: classes.dex */
public final class hyj {
    public final azj a;
    public final ijd b;
    public final qzj c;

    static {
        n1g.Z("WMFgUpdater");
    }

    public hyj(WorkDatabase workDatabase, ijd ijdVar, azj azjVar) {
        this.b = ijdVar;
        this.a = azjVar;
        this.c = workDatabase.x();
    }
}
