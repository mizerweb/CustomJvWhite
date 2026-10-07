package defpackage;

import java.util.concurrent.ScheduledThreadPoolExecutor;

/* JADX INFO: loaded from: classes3.dex */
public final class k1k implements vn5 {
    public final ScheduledThreadPoolExecutor a = new ScheduledThreadPoolExecutor(1);

    @Override // defpackage.vn5
    public final void a(kr0 kr0Var) {
        this.a.submit(new xn5(kr0Var, 1));
    }
}
