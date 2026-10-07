package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import one.me.messages.list.ui.MessagesListWidget;

/* JADX INFO: loaded from: classes4.dex */
public final class wsa extends afe {
    public final int a = gm0.K(80.0f * yl5.d().getDisplayMetrics().density);
    public Boolean b;
    public boolean c;
    public boolean d;
    public final /* synthetic */ MessagesListWidget e;

    public wsa(MessagesListWidget messagesListWidget) {
        this.e = messagesListWidget;
    }

    public static boolean d(RecyclerView recyclerView) {
        nee adapter;
        LinearLayoutManager linearLayoutManagerE0 = tre.e0(recyclerView);
        if (linearLayoutManagerE0 == null || (adapter = recyclerView.getAdapter()) == null) {
            return false;
        }
        int iL = adapter.l();
        Integer numValueOf = Integer.valueOf(iL);
        if (iL <= 0) {
            numValueOf = null;
        }
        return (numValueOf == null || linearLayoutManagerE0.r(numValueOf.intValue() - 1) == null) ? false : true;
    }

    @Override // defpackage.afe
    public final void a(RecyclerView recyclerView, int i) {
        this.c = i != 0;
    }

    @Override // defpackage.afe
    public final void b(RecyclerView recyclerView, int i, int i2) {
        int iComputeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
        int iComputeVerticalScrollRange = recyclerView.computeVerticalScrollRange();
        int iComputeVerticalScrollExtent = recyclerView.computeVerticalScrollExtent();
        boolean z = this.d;
        int i3 = this.a;
        if (z || iComputeVerticalScrollRange >= recyclerView.getHeight() + i3) {
            this.d = false;
            nee adapter = recyclerView.getAdapter();
            int iL = adapter != null ? adapter.l() : 0;
            boolean zD = d(recyclerView);
            MessagesListWidget messagesListWidget = this.e;
            if ((zD || iL <= 0) && (iComputeVerticalScrollOffset < 0 || iComputeVerticalScrollRange - (iComputeVerticalScrollOffset + iComputeVerticalScrollExtent) < i3)) {
                Boolean bool = this.b;
                if (bool == null || bool.equals(Boolean.TRUE)) {
                    zv8[] zv8VarArr = MessagesListWidget.T1;
                    messagesListWidget.F1().z0(false);
                    this.b = Boolean.FALSE;
                    return;
                }
                return;
            }
            Boolean bool2 = this.b;
            if (bool2 == null || bool2.equals(Boolean.FALSE)) {
                zv8[] zv8VarArr2 = MessagesListWidget.T1;
                messagesListWidget.F1().z0(true);
                this.b = Boolean.TRUE;
            }
        }
    }

    public final void c(RecyclerView recyclerView) {
        if (this.c) {
            return;
        }
        nee adapter = recyclerView.getAdapter();
        Integer numValueOf = adapter != null ? Integer.valueOf(adapter.l()) : null;
        this.d = d(recyclerView) || (numValueOf != null && numValueOf.intValue() == 0);
        b(recyclerView, 0, 0);
    }
}
