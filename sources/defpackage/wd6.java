package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class wd6 {
    private final xwd a;

    public wd6(xwd xwdVar) {
        this.a = xwdVar;
    }

    public Executor a(Executor executor) {
        return executor != null ? executor : (Executor) this.a.get();
    }
}
