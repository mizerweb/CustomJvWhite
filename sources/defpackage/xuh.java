package defpackage;

import androidx.appcompat.widget.Toolbar;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class xuh implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Toolbar b;

    public /* synthetic */ xuh(Toolbar toolbar, int i) {
        this.a = i;
        this.b = toolbar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Toolbar toolbar = this.b;
        switch (i) {
            case 0:
                zuh zuhVar = toolbar.n1;
                cca ccaVar = zuhVar == null ? null : zuhVar.b;
                if (ccaVar != null) {
                    ccaVar.collapseActionView();
                }
                break;
            default:
                toolbar.m();
                break;
        }
    }
}
