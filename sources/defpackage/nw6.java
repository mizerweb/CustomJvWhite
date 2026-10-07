package defpackage;

import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public final class nw6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;
    public final /* synthetic */ Runnable c;

    public /* synthetic */ nw6(View view, Runnable runnable, int i) {
        this.a = i;
        this.b = view;
        this.c = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Runnable runnable = this.c;
        View view = this.b;
        switch (i) {
            case 0:
                view.removeCallbacks(runnable);
                break;
            default:
                view.removeCallbacks(runnable);
                break;
        }
    }
}
