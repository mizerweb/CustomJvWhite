package defpackage;

import android.os.Handler;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class cc5 implements Executor {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ cc5(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((Handler) obj).post(runnable);
                break;
            case 1:
                vqi.d0(((qu9) obj).h, runnable);
                break;
            default:
                vqi.d0(((m0a) obj).d, runnable);
                break;
        }
    }
}
