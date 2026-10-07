package defpackage;

import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class lfe {
    public static final List t = Collections.EMPTY_LIST;
    public final View a;
    public WeakReference b;
    public int j;
    public RecyclerView r;
    public nee s;
    public int c = -1;
    public int d = -1;
    public long e = -1;
    public int f = -1;
    public int g = -1;
    public lfe h = null;
    public lfe i = null;
    public ArrayList k = null;
    public List l = null;
    public int m = 0;
    public cfe n = null;
    public boolean o = false;
    public int p = 0;
    public int q = -1;

    public lfe(View view) {
        if (view != null) {
            this.a = view;
        } else {
            ore.p("itemView may not be null");
            throw null;
        }
    }

    public final boolean A() {
        return (this.j & 32) != 0;
    }

    public final void j(int i) {
        this.j = i | this.j;
    }

    public final int k() {
        RecyclerView recyclerView = this.r;
        if (recyclerView == null) {
            return -1;
        }
        return recyclerView.N(this);
    }

    public final int l() {
        RecyclerView recyclerView;
        nee adapter;
        int iN;
        if (this.s == null || (recyclerView = this.r) == null || (adapter = recyclerView.getAdapter()) == null || (iN = this.r.N(this)) == -1) {
            return -1;
        }
        return adapter.k(this.s, this, iN);
    }

    public final int m() {
        int i = this.g;
        return i == -1 ? this.c : i;
    }

    public final List n() {
        ArrayList arrayList;
        return ((this.j & 1024) != 0 || (arrayList = this.k) == null || arrayList.size() == 0) ? t : this.l;
    }

    public final boolean o() {
        View view = this.a;
        return (view.getParent() == null || view.getParent() == this.r) ? false : true;
    }

    public final boolean p() {
        return (this.j & 1) != 0;
    }

    public final boolean q() {
        return (this.j & 4) != 0;
    }

    public final boolean r() {
        if ((this.j & 16) != 0) {
            return false;
        }
        WeakHashMap weakHashMap = i7j.a;
        return !this.a.hasTransientState();
    }

    public final boolean s() {
        return (this.j & 8) != 0;
    }

    public final boolean t() {
        return this.n != null;
    }

    public final String toString() {
        StringBuilder sbZ = zo5.z(getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName(), "{");
        sbZ.append(Integer.toHexString(hashCode()));
        sbZ.append(" position=");
        sbZ.append(this.c);
        sbZ.append(" id=");
        sbZ.append(this.e);
        sbZ.append(", oldPos=");
        sbZ.append(this.d);
        sbZ.append(", pLpos:");
        sbZ.append(this.g);
        StringBuilder sb = new StringBuilder(sbZ.toString());
        if (t()) {
            sb.append(" scrap ");
            sb.append(this.o ? "[changeScrap]" : "[attachedScrap]");
        }
        if (q()) {
            sb.append(" invalid");
        }
        if (!p()) {
            sb.append(" unbound");
        }
        if ((this.j & 2) != 0) {
            sb.append(" update");
        }
        if (s()) {
            sb.append(" removed");
        }
        if (z()) {
            sb.append(" ignored");
        }
        if (u()) {
            sb.append(" tmpDetached");
        }
        if (!r()) {
            sb.append(" not recyclable(" + this.m + ")");
        }
        if ((this.j & np0.o) != 0 || q()) {
            sb.append(" undefined adapter position");
        }
        if (this.a.getParent() == null) {
            sb.append(" no parent");
        }
        sb.append("}");
        return sb.toString();
    }

    public final boolean u() {
        return (this.j & np0.n) != 0;
    }

    public final boolean v() {
        return (this.j & 2) != 0;
    }

    public final void w(int i, boolean z) {
        if (this.d == -1) {
            this.d = this.c;
        }
        if (this.g == -1) {
            this.g = this.c;
        }
        if (z) {
            this.g += i;
        }
        this.c += i;
        View view = this.a;
        if (view.getLayoutParams() != null) {
            ((wee) view.getLayoutParams()).c = true;
        }
    }

    public final void x() {
        if (RecyclerView.Z1 && u()) {
            c.u(this, ". ViewHolders should be fully detached before resetting.", "Attempting to reset temp-detached ViewHolder: ");
            return;
        }
        this.j = 0;
        this.c = -1;
        this.d = -1;
        this.e = -1L;
        this.g = -1;
        this.m = 0;
        this.h = null;
        this.i = null;
        ArrayList arrayList = this.k;
        if (arrayList != null) {
            arrayList.clear();
        }
        this.j &= -1025;
        this.p = 0;
        this.q = -1;
        RecyclerView.m(this);
    }

    public final void y(boolean z) {
        int i = this.m;
        int i2 = z ? i - 1 : i + 1;
        this.m = i2;
        if (i2 < 0) {
            this.m = 0;
            if (RecyclerView.Z1) {
                c.g(this, "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for ");
                return;
            } else {
                Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
            }
        } else if (!z && i2 == 1) {
            this.j |= 16;
        } else if (z && i2 == 0) {
            this.j &= -17;
        }
        if (RecyclerView.a2) {
            Log.d("RecyclerView", "setIsRecyclable val:" + z + ":" + this);
        }
    }

    public final boolean z() {
        return (this.j & np0.m) != 0;
    }
}
