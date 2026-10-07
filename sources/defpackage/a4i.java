package defpackage;

import android.view.View;
import one.me.transparent.TransparentWidget;

/* JADX INFO: loaded from: classes3.dex */
public final class a4i extends wq4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ TransparentWidget b;

    public /* synthetic */ a4i(TransparentWidget transparentWidget, int i) {
        this.a = i;
        this.b = transparentWidget;
    }

    @Override // defpackage.wq4
    public final void j(br4 br4Var, View view) {
        int i = this.a;
        TransparentWidget transparentWidget = this.b;
        switch (i) {
            case 0:
                transparentWidget.removeLifecycleListener(this);
                transparentWidget.r1();
                break;
            default:
                transparentWidget.removeLifecycleListener(this);
                transparentWidget.r1();
                break;
        }
    }
}
