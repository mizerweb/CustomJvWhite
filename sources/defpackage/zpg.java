package defpackage;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes4.dex */
public final class zpg extends tee {
    public final nee b;
    public final aqg c;
    public final g85 d;
    public final RecyclerView e;
    public final SparseBooleanArray a = new SparseBooleanArray();
    public final boolean f = true;
    public final Rect g = new Rect();
    public final Rect h = new Rect();
    public final v56 i = new v56(9, (byte) 0);
    public final AtomicBoolean j = new AtomicBoolean(true);
    public final xpg k = new xpg(this, 0);

    public zpg(RecyclerView recyclerView, nee neeVar, aqg aqgVar) {
        int i = 0;
        this.b = neeVar;
        this.c = aqgVar;
        g85 g85Var = new g85();
        g85Var.e = new SparseArray();
        g85Var.c = new SparseArray();
        g85Var.d = new SparseArray();
        g85Var.a = recyclerView;
        g85Var.b = aqgVar;
        neeVar.C(new wpg(g85Var, i, recyclerView));
        this.d = g85Var;
        this.e = recyclerView;
        neeVar.C(new ypg(this, i, recyclerView));
    }

    public static final void i(zpg zpgVar) {
        RecyclerView recyclerView = zpgVar.e;
        zpgVar.a.clear();
        if (zpgVar.j.compareAndSet(true, false)) {
            n1g.Q(recyclerView, zpgVar.k, null, 5);
            recyclerView.post(new xpg(zpgVar, 1));
        }
    }

    @Override // defpackage.tee
    public final void f(Rect rect, View view, RecyclerView recyclerView, hfe hfeVar) {
        int iP = RecyclerView.P(view);
        boolean zK = k(iP);
        v56 v56Var = this.i;
        if (zK) {
            g85 g85Var = this.d;
            if (g85Var.G(iP) != null) {
                vpg vpgVarH = g85Var.H(iP);
                int i = vpgVarH.c;
                if (i < 0) {
                    rect.top -= i;
                }
                rect.top = vpgVarH.a.getMeasuredHeight() + rect.top;
                v56Var.J(rect, view, recyclerView);
                return;
            }
        }
        v56Var.J(rect, view, recyclerView);
    }

    @Override // defpackage.tee
    public final void h(Canvas canvas, RecyclerView recyclerView) {
        int childCount = recyclerView.getChildCount();
        nee neeVar = this.b;
        int iL = neeVar.l();
        if (childCount <= 0 || iL <= 0) {
            return;
        }
        int i = 0;
        while (true) {
            if (!(i < recyclerView.getChildCount())) {
                return;
            }
            int i2 = i + 1;
            View childAt = recyclerView.getChildAt(i);
            if (childAt == null) {
                ore.i();
                return;
            }
            int iP = RecyclerView.P(childAt);
            if (iP != -1) {
                g85 g85Var = this.d;
                if (g85Var.G(iP) == null) {
                    continue;
                } else {
                    boolean zK = k(iP);
                    v56 v56Var = this.i;
                    Rect rect = this.g;
                    v56Var.C(rect, childAt, iP);
                    boolean z = rect.top <= 0 && rect.bottom > 0;
                    if (zK || z) {
                        vpg vpgVarH = g85Var.H(iP);
                        boolean z2 = z && this.f;
                        int measuredHeight = g85Var.H(iP).a.getMeasuredHeight();
                        v56Var.C(rect, childAt, iP);
                        Rect rect2 = this.h;
                        v56Var.E(rect2, childAt, iP);
                        if (z2) {
                            if (iP >= neeVar.l() - 1 || !k(iP + 1)) {
                                this.c.getClass();
                                if (!zK || rect2.top < 0) {
                                    rect2.offsetTo(rect2.left, 0);
                                }
                            } else {
                                int i3 = rect.bottom;
                                int i4 = rect2.left;
                                if (measuredHeight > i3) {
                                    rect2.offsetTo(i4, i3 - measuredHeight);
                                } else {
                                    rect2.offsetTo(i4, 0);
                                }
                            }
                        }
                        float f = rect2.top;
                        int iSave = canvas.save();
                        canvas.translate(0.0f, f);
                        try {
                            View view = vpgVarH.a;
                            if (yab.g0(view)) {
                                canvas.translate((canvas.getWidth() - view.getMeasuredWidth()) - vpgVarH.b, 0.0f);
                            } else {
                                canvas.translate(vpgVarH.b, 0.0f);
                            }
                            view.draw(canvas);
                            canvas.restoreToCount(iSave);
                        } catch (Throwable th) {
                            canvas.restoreToCount(iSave);
                            throw th;
                        }
                    }
                }
            }
            i = i2;
        }
    }

    public final void j() {
        g85 g85Var = this.d;
        ((SparseArray) g85Var.c).clear();
        ((SparseArray) g85Var.e).clear();
        ((SparseArray) g85Var.d).clear();
    }

    public final boolean k(int i) {
        Object objG;
        SparseBooleanArray sparseBooleanArray = this.a;
        if (sparseBooleanArray.indexOfKey(i) >= 0) {
            return sparseBooleanArray.get(i);
        }
        g85 g85Var = this.d;
        Object objG2 = g85Var.G(i);
        boolean z = false;
        if (objG2 != null && (i <= 0 || (objG = g85Var.G(i - 1)) == null || !objG2.equals(objG))) {
            z = true;
        }
        sparseBooleanArray.put(i, z);
        return z;
    }
}
