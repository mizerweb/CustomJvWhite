package defpackage;

import android.window.OnBackInvokedCallback;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class or implements OnBackInvokedCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ or(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final void onBackInvoked() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((vr) obj).E();
                break;
            case 1:
                ((af7) obj).invoke();
                break;
            default:
                ((Runnable) obj).run();
                break;
        }
    }
}
