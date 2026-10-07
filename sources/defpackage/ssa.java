package defpackage;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import one.me.messages.list.loader.MessageModel;
import one.me.messages.list.ui.MessagesListWidget;

/* JADX INFO: loaded from: classes2.dex */
public final class ssa extends afe {
    public final Rect a = new Rect();
    public int b = -1;
    public int c = -1;
    public boolean d = true;
    public LinkedHashSet e = new LinkedHashSet();
    public LinkedHashSet f = new LinkedHashSet();
    public final /* synthetic */ MessagesListWidget g;

    public ssa(MessagesListWidget messagesListWidget) {
        this.g = messagesListWidget;
    }

    @Override // defpackage.afe
    public final void a(RecyclerView recyclerView, int i) {
        this.d = i != 2;
        if (i == 0) {
            b(recyclerView, -1, -1);
            c();
        }
    }

    @Override // defpackage.afe
    public final void b(RecyclerView recyclerView, int i, int i2) {
        if (this.d) {
            LinearLayoutManager linearLayoutManagerE0 = tre.e0(recyclerView);
            if (linearLayoutManagerE0 == null) {
                ore.k("Only linear layout manger supported");
                return;
            }
            int iX0 = linearLayoutManagerE0.X0();
            int iZ0 = linearLayoutManagerE0.Z0();
            View viewR = linearLayoutManagerE0.r(iX0);
            Rect rect = this.a;
            if (viewR != null) {
                int iMin = Math.min(viewR.getMeasuredHeight(), recyclerView.getMeasuredHeight());
                if ((!viewR.getLocalVisibleRect(rect) || rect.height() < iMin * 0.3f) && (iX0 = linearLayoutManagerE0.U0()) == -1) {
                    iX0 = this.b;
                }
            }
            View viewR2 = linearLayoutManagerE0.r(iZ0);
            if (viewR2 != null) {
                int iMin2 = Math.min(viewR2.getMeasuredHeight(), recyclerView.getMeasuredHeight());
                if ((!viewR2.getLocalVisibleRect(rect) || rect.height() < iMin2 * 0.3f) && (iZ0 = linearLayoutManagerE0.Y0()) == -1) {
                    iZ0 = this.c;
                }
            }
            Integer numValueOf = Integer.valueOf(iX0);
            Integer numValueOf2 = Integer.valueOf(iZ0);
            int iIntValue = numValueOf.intValue();
            int iIntValue2 = numValueOf2.intValue();
            int i3 = this.b;
            if (i3 == -1 && this.c == -1) {
                this.b = iIntValue;
                this.c = iIntValue2;
                d(iIntValue, iIntValue2);
                c();
                return;
            }
            if (iIntValue == i3 && iIntValue2 == this.c) {
                return;
            }
            this.b = iIntValue;
            this.c = iIntValue2;
            d(iIntValue, iIntValue2);
        }
    }

    public final void c() {
        Set setY = lof.Y(this.e, this.f);
        if (setY.isEmpty()) {
            return;
        }
        this.f = this.e;
        this.e = new LinkedHashSet();
        zv8[] zv8VarArr = MessagesListWidget.T1;
        this.g.F1().y0(setY);
    }

    public final void d(int i, int i2) {
        LinkedHashSet linkedHashSet = this.e;
        hj8 hj8Var = new hj8(i, i2, 1);
        ArrayList arrayList = new ArrayList();
        Iterator it = hj8Var.iterator();
        while (true) {
            gj8 gj8Var = (gj8) it;
            if (!gj8Var.c) {
                linkedHashSet.addAll(arrayList);
                return;
            }
            MessageModel messageModelQ = this.g.H.Q(gj8Var.nextInt());
            if (messageModelQ != null) {
                arrayList.add(messageModelQ);
            }
        }
    }
}
