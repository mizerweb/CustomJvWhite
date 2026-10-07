package defpackage;

import android.view.View;
import android.view.ViewParent;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.collections.a;

/* JADX INFO: loaded from: classes3.dex */
public final class whc extends xtb {
    public final jic i;
    public final dud j;
    public final i5d k;

    public whc(jic jicVar, dud dudVar, i5d i5dVar) {
        super(null, 6);
        this.i = jicVar;
        this.j = dudVar;
        this.k = i5dVar;
    }

    @Override // defpackage.xtb
    public final boolean c(View view, int i) {
        e(view);
        return true;
    }

    @Override // defpackage.xtb
    public final boolean d(View view, int i) {
        e(view);
        return true;
    }

    public final void e(View view) {
        if (!((Boolean) this.k.i()).booleanValue()) {
            return;
        }
        ViewParent parent = view.getParent();
        Object obj = null;
        RecyclerView recyclerView = parent instanceof RecyclerView ? (RecyclerView) parent : null;
        if (recyclerView == null) {
            return;
        }
        vee layoutManager = recyclerView.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager == null) {
            return;
        }
        int iX0 = linearLayoutManager.X0();
        int iZ0 = linearLayoutManager.Z0();
        if (iX0 == -1 || iZ0 == -1 || iX0 > iZ0) {
            return;
        }
        while (true) {
            Object objU1 = ww3.u1(iX0, this.j.d.f);
            xqd xqdVar = objU1 instanceof xqd ? (xqd) objU1 : null;
            if (xqdVar != null) {
                u8b u8bVar = xqdVar.d;
                Object[] objArr = u8bVar.a;
                int i = u8bVar.b;
                for (int i2 = 0; i2 < i; i2++) {
                    Object obj2 = objArr[i2];
                    if (((rhc) obj2).a == uhc.a) {
                        obj = obj2;
                        break;
                    }
                }
                rhc rhcVar = (rhc) obj;
                boolean zA = rhcVar != null ? rhcVar.a() : false;
                Long l = xqdVar.e;
                long jLongValue = l != null ? l.longValue() : 0L;
                int i3 = xqdVar.f;
                if (i3 == 0) {
                    i3 = 2;
                }
                int i4 = i3;
                Long l2 = xqdVar.g;
                long jLongValue2 = l2 != null ? l2.longValue() : 0L;
                jic jicVar = this.i;
                k8b k8bVar = jicVar.d;
                long jY = ((xb9) ((et3) jicVar.b.getValue())).Y();
                if (jY != jicVar.e) {
                    k8bVar.e = 0;
                    long[] jArr = k8bVar.a;
                    if (jArr != q1f.a) {
                        a.W0(jArr);
                        long[] jArr2 = k8bVar.a;
                        int i5 = k8bVar.d;
                        int i6 = i5 >> 3;
                        long j = 255 << ((i5 & 7) << 3);
                        jArr2[i6] = ((~j) & jArr2[i6]) | j;
                    }
                    k8bVar.f = q1f.a(k8bVar.d) - k8bVar.e;
                    jicVar.e = jY;
                }
                long jD = (((long) (i4 == 3 ? -qt4.D(1) : qt4.D(1))) * 961) + jLongValue2;
                if (k8bVar.d(jD, -1L) == jY) {
                    return;
                }
                k8bVar.g(jD, jY);
                jicVar.a(1, jLongValue, i4, jLongValue2, 1, 0, Boolean.valueOf(zA));
                return;
            }
            if (iX0 == iZ0) {
                return;
            } else {
                iX0++;
            }
        }
    }
}
