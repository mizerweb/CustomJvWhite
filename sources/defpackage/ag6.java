package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ag6 implements Executor {
    public final /* synthetic */ int a;
    public final /* synthetic */ sfh b;

    public /* synthetic */ ag6(sfh sfhVar, int i) {
        this.a = i;
        this.b = sfhVar;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        int i = this.a;
        this.b.f(runnable);
    }
}
