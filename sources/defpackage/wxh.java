package defpackage;

import com.my.tracker.core.o.g;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class wxh implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Runnable b;

    public /* synthetic */ wxh(Runnable runnable, int i) {
        this.a = i;
        this.b = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Runnable runnable = this.b;
        switch (i) {
            case 0:
                yxh.a(runnable);
                break;
            default:
                g.a(runnable);
                break;
        }
    }
}
