package defpackage;

import android.animation.TimeInterpolator;
import android.util.AndroidRuntimeException;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class z2i extends r2i {
    public int F;
    public ArrayList D = new ArrayList();
    public boolean E = true;
    public boolean G = false;
    public int H = 0;

    @Override // defpackage.r2i
    public final void A() {
        this.x = 0L;
        y2i y2iVar = new y2i(this, 0);
        for (int i = 0; i < this.D.size(); i++) {
            r2i r2iVar = (r2i) this.D.get(i);
            r2iVar.a(y2iVar);
            r2iVar.A();
            long j = r2iVar.x;
            boolean z = this.E;
            long j2 = this.x;
            if (z) {
                this.x = Math.max(j2, j);
            } else {
                r2iVar.y = j2;
                this.x = j2 + j;
            }
        }
    }

    @Override // defpackage.r2i
    public final r2i B(q2i q2iVar) {
        super.B(q2iVar);
        return this;
    }

    @Override // defpackage.r2i
    public final void C(View view) {
        for (int i = 0; i < this.D.size(); i++) {
            ((r2i) this.D.get(i)).C(view);
        }
        this.f.remove(view);
    }

    @Override // defpackage.r2i
    public final void D(View view) {
        super.D(view);
        int size = this.D.size();
        for (int i = 0; i < size; i++) {
            ((r2i) this.D.get(i)).D(view);
        }
    }

    @Override // defpackage.r2i
    public final void E() {
        ArrayList arrayList;
        if (this.D.isEmpty()) {
            M();
            n();
            return;
        }
        int i = 1;
        y2i y2iVar = new y2i(this, 1);
        Iterator it = this.D.iterator();
        while (it.hasNext()) {
            ((r2i) it.next()).a(y2iVar);
        }
        this.F = this.D.size();
        if (this.E) {
            Iterator it2 = this.D.iterator();
            while (it2.hasNext()) {
                ((r2i) it2.next()).E();
            }
            return;
        }
        while (true) {
            int size = this.D.size();
            arrayList = this.D;
            if (i >= size) {
                break;
            }
            ((r2i) arrayList.get(i - 1)).a(new y2i((r2i) this.D.get(i), 2));
            i++;
        }
        r2i r2iVar = (r2i) arrayList.get(0);
        if (r2iVar != null) {
            r2iVar.E();
        }
    }

    /* JADX WARN: Code duplicated, block: B:55:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:63:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:74:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.r2i
    public final void F(long j, long j2) {
        long j3;
        long j4 = this.x;
        long j5 = 0;
        if (this.i != null) {
            if (j < 0 && j2 < 0) {
                return;
            }
            if (j > j4 && j2 > j4) {
                return;
            }
        }
        boolean z = j < j2;
        if ((j >= 0 && j2 < 0) || (j <= j4 && j2 > j4)) {
            this.r = false;
            y(this, dzh.b, z);
        }
        if (!this.E) {
            int size = 1;
            while (true) {
                int size2 = this.D.size();
                ArrayList arrayList = this.D;
                if (size >= size2) {
                    size = arrayList.size();
                    break;
                } else if (((r2i) arrayList.get(size)).y > j2) {
                    break;
                } else {
                    size++;
                }
            }
            int i = size - 1;
            if (j >= j2) {
                while (true) {
                    if (i < this.D.size()) {
                        r2i r2iVar = (r2i) this.D.get(i);
                        long j6 = r2iVar.y;
                        j3 = j5;
                        long j7 = j - j6;
                        if (j7 < j3) {
                            break;
                        }
                        r2iVar.F(j7, j2 - j6);
                        i++;
                        j5 = j3;
                    }
                }
            } else {
                j3 = 0;
                while (i >= 0) {
                    r2i r2iVar2 = (r2i) this.D.get(i);
                    long j8 = r2iVar2.y;
                    long j9 = j - j8;
                    r2iVar2.F(j9, j2 - j8);
                    if (j9 >= 0) {
                        break;
                    } else {
                        i--;
                    }
                }
            }
            if (this.i != null) {
                if ((j > j4 || j2 > j4) && (j >= 0 || j2 < j3)) {
                    return;
                }
                if (j > j4) {
                    this.r = true;
                }
                y(this, dzh.c, z);
            }
        }
        for (int i2 = 0; i2 < this.D.size(); i2++) {
            ((r2i) this.D.get(i2)).F(j, j2);
        }
        j3 = j5;
        if (this.i != null) {
            if (j > j4) {
                return;
            } else {
                return;
            }
            if (j > j4) {
                this.r = true;
            }
            y(this, dzh.c, z);
        }
    }

    @Override // defpackage.r2i
    public final void H(gzf gzfVar) {
        this.v = gzfVar;
        this.H |= 8;
        int size = this.D.size();
        for (int i = 0; i < size; i++) {
            ((r2i) this.D.get(i)).H(gzfVar);
        }
    }

    @Override // defpackage.r2i
    public final void I(TimeInterpolator timeInterpolator) {
        this.H |= 1;
        ArrayList arrayList = this.D;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((r2i) this.D.get(i)).I(timeInterpolator);
            }
        }
        this.d = timeInterpolator;
    }

    @Override // defpackage.r2i
    public final void J(lhb lhbVar) {
        super.J(lhbVar);
        this.H |= 4;
        if (this.D != null) {
            for (int i = 0; i < this.D.size(); i++) {
                ((r2i) this.D.get(i)).J(lhbVar);
            }
        }
    }

    @Override // defpackage.r2i
    public final void K() {
        this.H |= 2;
        int size = this.D.size();
        for (int i = 0; i < size; i++) {
            ((r2i) this.D.get(i)).K();
        }
    }

    @Override // defpackage.r2i
    public final void L(long j) {
        this.b = j;
    }

    @Override // defpackage.r2i
    public final String N(String str) {
        String strN = super.N(str);
        for (int i = 0; i < this.D.size(); i++) {
            StringBuilder sbZ = zo5.z(strN, "\n");
            sbZ.append(((r2i) this.D.get(i)).N(str.concat("  ")));
            strN = sbZ.toString();
        }
        return strN;
    }

    public final void O(gj3 gj3Var) {
        super.a(gj3Var);
    }

    public final void P(r2i r2iVar) {
        this.D.add(r2iVar);
        r2iVar.i = this;
        long j = this.c;
        if (j >= 0) {
            r2iVar.G(j);
        }
        if ((this.H & 1) != 0) {
            r2iVar.I(this.d);
        }
        if ((this.H & 2) != 0) {
            r2iVar.K();
        }
        if ((this.H & 4) != 0) {
            r2iVar.J(this.w);
        }
        if ((this.H & 8) != 0) {
            r2iVar.H(this.v);
        }
    }

    public final r2i Q(int i) {
        if (i < 0 || i >= this.D.size()) {
            return null;
        }
        return (r2i) this.D.get(i);
    }

    @Override // defpackage.r2i
    /* JADX INFO: renamed from: R */
    public final void G(long j) {
        ArrayList arrayList;
        this.c = j;
        if (j < 0 || (arrayList = this.D) == null) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((r2i) this.D.get(i)).G(j);
        }
    }

    public final void S(int i) {
        if (i == 0) {
            this.E = true;
        } else {
            if (i != 1) {
                throw new AndroidRuntimeException(zo5.h(i, "Invalid parameter for TransitionSet ordering: "));
            }
            this.E = false;
        }
    }

    @Override // defpackage.r2i
    public final void b(View view) {
        for (int i = 0; i < this.D.size(); i++) {
            ((r2i) this.D.get(i)).b(view);
        }
        this.f.add(view);
    }

    @Override // defpackage.r2i
    public final void d() {
        super.d();
        int size = this.D.size();
        for (int i = 0; i < size; i++) {
            ((r2i) this.D.get(i)).d();
        }
    }

    @Override // defpackage.r2i
    public final void e(c3i c3iVar) {
        View view = c3iVar.b;
        if (w(view)) {
            for (r2i r2iVar : this.D) {
                if (r2iVar.w(view)) {
                    r2iVar.e(c3iVar);
                    c3iVar.c.add(r2iVar);
                }
            }
        }
    }

    @Override // defpackage.r2i
    public final void g(c3i c3iVar) {
        int size = this.D.size();
        for (int i = 0; i < size; i++) {
            ((r2i) this.D.get(i)).g(c3iVar);
        }
    }

    @Override // defpackage.r2i
    public final void h(c3i c3iVar) {
        View view = c3iVar.b;
        if (w(view)) {
            for (r2i r2iVar : this.D) {
                if (r2iVar.w(view)) {
                    r2iVar.h(c3iVar);
                    c3iVar.c.add(r2iVar);
                }
            }
        }
    }

    @Override // defpackage.r2i
    /* JADX INFO: renamed from: k */
    public final r2i clone() {
        z2i z2iVar = (z2i) super.clone();
        z2iVar.D = new ArrayList();
        int size = this.D.size();
        for (int i = 0; i < size; i++) {
            r2i r2iVarClone = ((r2i) this.D.get(i)).clone();
            z2iVar.D.add(r2iVarClone);
            r2iVarClone.i = z2iVar;
        }
        return z2iVar;
    }

    @Override // defpackage.r2i
    public final void m(ViewGroup viewGroup, gvb gvbVar, gvb gvbVar2, ArrayList arrayList, ArrayList arrayList2) {
        long j = this.b;
        int size = this.D.size();
        for (int i = 0; i < size; i++) {
            r2i r2iVar = (r2i) this.D.get(i);
            if (j > 0 && (this.E || i == 0)) {
                long j2 = r2iVar.b;
                if (j2 > 0) {
                    r2iVar.L(j2 + j);
                } else {
                    r2iVar.L(j);
                }
            }
            r2iVar.m(viewGroup, gvbVar, gvbVar2, arrayList, arrayList2);
        }
    }

    @Override // defpackage.r2i
    public final void o(ViewGroup viewGroup) {
        super.o(viewGroup);
        int size = this.D.size();
        for (int i = 0; i < size; i++) {
            ((r2i) this.D.get(i)).o(viewGroup);
        }
    }

    @Override // defpackage.r2i
    public final boolean u() {
        for (int i = 0; i < this.D.size(); i++) {
            if (((r2i) this.D.get(i)).u()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.r2i
    public final void z(View view) {
        super.z(view);
        int size = this.D.size();
        for (int i = 0; i < size; i++) {
            ((r2i) this.D.get(i)).z(view);
        }
    }
}
