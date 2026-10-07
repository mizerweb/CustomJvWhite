package defpackage;

import android.os.Trace;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class nee {
    public final oee a = new oee();
    public boolean b = false;
    public int c = 1;

    public void A(lfe lfeVar) {
    }

    public void B(lfe lfeVar) {
    }

    public void C(pee peeVar) {
        this.a.registerObserver(peeVar);
    }

    public void D(boolean z) {
        if (this.a.a()) {
            ore.k("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        } else {
            this.b = z;
        }
    }

    public void E(pee peeVar) {
        this.a.unregisterObserver(peeVar);
    }

    public final void j(lfe lfeVar, int i) {
        nee neeVar = lfeVar.s;
        View view = lfeVar.a;
        boolean z = neeVar == null;
        if (z) {
            lfeVar.c = i;
            if (this.b) {
                lfeVar.e = m(i);
            }
            lfeVar.j = (lfeVar.j & (-520)) | 1;
            int i2 = mwh.a;
            Trace.beginSection("RV OnBindView");
        }
        lfeVar.s = this;
        if (RecyclerView.Z1) {
            if (view.getParent() == null) {
                WeakHashMap weakHashMap = i7j.a;
                if (view.isAttachedToWindow() != lfeVar.u()) {
                    throw new IllegalStateException("Temp-detached state out of sync with reality. holder.isTmpDetached(): " + lfeVar.u() + ", attached to window: " + view.isAttachedToWindow() + ", holder: " + lfeVar);
                }
            }
            if (view.getParent() == null) {
                WeakHashMap weakHashMap2 = i7j.a;
                if (view.isAttachedToWindow()) {
                    c.q(lfeVar, "Attempting to bind attached holder with no parent (AKA temp detached): ");
                    return;
                }
            }
        }
        v(lfeVar, i, lfeVar.n());
        if (z) {
            ArrayList arrayList = lfeVar.k;
            if (arrayList != null) {
                arrayList.clear();
            }
            lfeVar.j &= -1025;
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof wee) {
                ((wee) layoutParams).c = true;
            }
            int i3 = mwh.a;
            Trace.endSection();
        }
    }

    public int k(nee neeVar, lfe lfeVar, int i) {
        if (neeVar == this) {
            return i;
        }
        return -1;
    }

    public abstract int l();

    public long m(int i) {
        return -1L;
    }

    public int n(int i) {
        return 0;
    }

    public final void o() {
        this.a.b();
    }

    public final void p(int i, int i2) {
        this.a.c(i, i2);
    }

    public final void q(int i, int i2, Object obj) {
        this.a.d(i, i2, obj);
    }

    public final void r(int i, int i2) {
        this.a.e(i, i2);
    }

    public final void s(int i, int i2) {
        this.a.f(i, i2);
    }

    public void t(RecyclerView recyclerView) {
    }

    public abstract void u(lfe lfeVar, int i);

    public void v(lfe lfeVar, int i, List list) {
        u(lfeVar, i);
    }

    public abstract lfe w(ViewGroup viewGroup, int i);

    public void x(RecyclerView recyclerView) {
    }

    public boolean y(lfe lfeVar) {
        return false;
    }

    public void z(lfe lfeVar) {
    }
}
