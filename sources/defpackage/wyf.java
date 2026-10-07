package defpackage;

import android.view.View;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class wyf implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zyf b;

    public /* synthetic */ wyf(zyf zyfVar, int i) {
        this.a = i;
        this.b = zyfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        zyf zyfVar = this.b;
        switch (i) {
            case 0:
                af7 onSingleClick = zyfVar.getOnSingleClick();
                if (onSingleClick == null) {
                    ((View) zyfVar.getParent()).performClick();
                } else {
                    onSingleClick.invoke();
                }
                break;
            default:
                af7 onSingleClick2 = zyfVar.getOnSingleClick();
                if (onSingleClick2 == null) {
                    ((View) zyfVar.getParent()).performClick();
                } else {
                    onSingleClick2.invoke();
                }
                break;
        }
    }
}
