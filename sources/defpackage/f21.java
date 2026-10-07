package defpackage;

import android.widget.PopupWindow;
import one.me.sdk.arch.Widget;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class f21 implements PopupWindow.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ f21(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                g21 g21Var = (g21) obj2;
                af7 af7Var = (af7) obj;
                g21Var.a = null;
                if (g21Var.b) {
                    af7Var.invoke();
                }
                break;
            default:
                ri riVar = (ri) obj2;
                Widget widget = (Widget) obj;
                vp4 vp4Var = (vp4) widget;
                if (!riVar.a) {
                    riVar.a = true;
                    vp4Var.onDismiss();
                }
                aq4 aq4Var = (aq4) riVar.e;
                if (aq4Var != null) {
                    widget.removeLifecycleListener(aq4Var);
                }
                riVar.e = null;
                riVar.d = null;
                riVar.c = null;
                break;
        }
    }
}
