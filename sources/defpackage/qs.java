package defpackage;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;

/* JADX INFO: loaded from: classes2.dex */
public final class qs implements PopupWindow.OnDismissListener {
    public final /* synthetic */ ls a;
    public final /* synthetic */ rs b;

    public qs(rs rsVar, ls lsVar) {
        this.b = rsVar;
        this.a = lsVar;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        ViewTreeObserver viewTreeObserver = this.b.G.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.a);
        }
    }
}
