package defpackage;

import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class fnh implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ gnh b;

    public /* synthetic */ fnh(gnh gnhVar, int i) {
        this.a = i;
        this.b = gnhVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        gnh gnhVar = this.b;
        switch (i) {
            case 0:
                af7 onSingleClick = gnhVar.getOnSingleClick();
                if (onSingleClick == null) {
                    ((View) gnhVar.getParent()).performClick();
                } else {
                    onSingleClick.invoke();
                }
                break;
            default:
                if (!gnhVar.r()) {
                    af7 onSingleClick2 = gnhVar.getOnSingleClick();
                    if (onSingleClick2 == null) {
                        ((View) gnhVar.getParent()).performClick();
                    } else {
                        onSingleClick2.invoke();
                    }
                } else {
                    gnhVar.u();
                }
                break;
        }
    }
}
