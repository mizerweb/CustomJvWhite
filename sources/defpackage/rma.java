package defpackage;

import android.widget.PopupWindow;
import one.me.sdk.messagewrite.MessageWriteWidget;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class rma implements PopupWindow.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessageWriteWidget b;

    public /* synthetic */ rma(MessageWriteWidget messageWriteWidget, int i) {
        this.a = i;
        this.b = messageWriteWidget;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        int i = this.a;
        MessageWriteWidget messageWriteWidget = this.b;
        switch (i) {
            case 0:
                messageWriteWidget.A = null;
                break;
            case 1:
                messageWriteWidget.A = null;
                break;
            default:
                messageWriteWidget.A = null;
                break;
        }
    }
}
