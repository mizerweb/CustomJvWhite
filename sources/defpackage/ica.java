package defpackage;

import android.widget.PopupWindow;
import one.me.pinbars.PinBarsWidget;

/* JADX INFO: loaded from: classes2.dex */
public final class ica implements PopupWindow.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ica(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((jca) obj).c();
                break;
            default:
                ((PinBarsWidget) obj).e = null;
                break;
        }
    }
}
