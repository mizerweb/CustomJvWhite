package defpackage;

import android.graphics.Point;
import android.view.KeyEvent;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes2.dex */
public final class g1i extends afe {
    public int a = -1;
    public int b = -1;
    public final int[] c = new int[2];
    public final /* synthetic */ h1i d;

    public g1i(h1i h1iVar) {
        this.d = h1iVar;
    }

    @Override // defpackage.afe
    public final void a(RecyclerView recyclerView, int i) {
        Point position;
        if (i != 0) {
            return;
        }
        LinearLayoutManager linearLayoutManagerE0 = tre.e0(recyclerView);
        if (linearLayoutManagerE0 == null) {
            gm0.n(g1i.class.getName(), "Only linear layout manger supported");
            return;
        }
        mvh mvhVar = this.d.c;
        nee adapter = recyclerView.getAdapter();
        qpa qpaVar = adapter instanceof qpa ? (qpa) adapter : null;
        if (mvhVar == null || qpaVar == null) {
            String name = g1i.class.getName();
            a4c a4cVar = gm0.f;
            if (a4cVar == null) {
                return;
            }
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, name, "Illegal state tooltip = " + mvhVar + " adapter = " + qpaVar, null);
                return;
            }
            return;
        }
        int iX0 = linearLayoutManagerE0.X0();
        int iZ0 = linearLayoutManagerE0.Z0();
        if (iX0 == -1 || iZ0 == -1) {
            return;
        }
        if (iX0 == this.a && iZ0 == this.b) {
            return;
        }
        this.a = iX0;
        this.b = iZ0;
        int[] iArr = this.c;
        if (iX0 > iZ0) {
            return;
        }
        while (true) {
            lfe lfeVarK = recyclerView.K(iZ0);
            View view = lfeVarK != null ? lfeVarK.a : null;
            iea ieaVar = view instanceof iea ? (iea) view : null;
            KeyEvent.Callback contentView$message_list = ieaVar != null ? ieaVar.getContentView$message_list() : null;
            q1i q1iVar = contentView$message_list instanceof q1i ? (q1i) contentView$message_list : null;
            if (q1iVar != null && (position = q1iVar.getPosition()) != null) {
                recyclerView.getLocationOnScreen(iArr);
                if (position.y - iArr[1] >= mvhVar.getContentView().getMeasuredHeight()) {
                    int iK = (gm0.K(16.0f * yl5.d().getDisplayMetrics().density) / 2) + gm0.K(10.0f * yl5.d().getDisplayMetrics().density);
                    boolean zB = z21.b(qpaVar.n(iZ0) & 2080374784);
                    int iD = wk8.D(recyclerView.getContext()) - position.x;
                    if (zB) {
                        iK = 0;
                    }
                    this.d.a.a(new f1i(new Point(iD - iK, position.y - mvhVar.getContentView().getMeasuredHeight()), zB));
                    return;
                }
            }
            if (iZ0 == iX0) {
                return;
            } else {
                iZ0--;
            }
        }
    }

    @Override // defpackage.afe
    public final void b(RecyclerView recyclerView, int i, int i2) {
        if (i == 0 && i2 == 0) {
            a(recyclerView, 0);
        } else {
            this.d.a.a(null);
        }
    }
}
