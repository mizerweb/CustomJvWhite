package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import one.me.messages.list.loader.MessageModel;
import one.me.messages.list.ui.MessagesListWidget;

/* JADX INFO: loaded from: classes4.dex */
public final class xsa extends afe {
    public int a = -1;
    public int b = -1;
    public final /* synthetic */ MessagesListWidget c;

    public xsa(MessagesListWidget messagesListWidget) {
        this.c = messagesListWidget;
    }

    @Override // defpackage.afe
    public final void b(RecyclerView recyclerView, int i, int i2) {
        MessageModel messageModelQ;
        LinearLayoutManager linearLayoutManagerE0 = tre.e0(recyclerView);
        if (linearLayoutManagerE0 == null) {
            gm0.n(xsa.class.getName(), "Only linear layout manger supported");
            return;
        }
        int iU0 = linearLayoutManagerE0.U0();
        int iY0 = linearLayoutManagerE0.Y0();
        if (iU0 == -1 || iY0 == -1) {
            return;
        }
        if (iU0 == this.a && iY0 == this.b) {
            return;
        }
        this.a = iU0;
        this.b = iY0;
        MessagesListWidget messagesListWidget = this.c;
        zv8[] zv8VarArr = MessagesListWidget.T1;
        sdg sdgVarT = messagesListWidget.F1().T();
        if (sdgVarT == null || iU0 > iY0) {
            return;
        }
        while (true) {
            if ((this.c.H.n(iU0) & (-2130706433)) == -2147483634 && (messageModelQ = this.c.H.Q(iU0)) != null) {
                long j = messageModelQ.b;
                uea ueaVarU1 = this.c.u1();
                if (!ueaVarU1.b) {
                    ueaVarU1.b = true;
                    ueaVarU1.a(j, 5, sdgVarT, 6);
                }
            }
            if (iU0 == iY0) {
                return;
            } else {
                iU0++;
            }
        }
    }
}
