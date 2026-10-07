package defpackage;

import java.util.Arrays;
import java.util.Collection;

/* JADX INFO: loaded from: classes2.dex */
public abstract class q98 extends s88 implements Collection {
    public static final /* synthetic */ int d = 0;
    public transient ghe b;
    public transient u98 c;

    @Override // defpackage.s88
    public final c98 a() {
        ghe gheVar = this.b;
        if (gheVar != null) {
            return gheVar;
        }
        c98 c98VarA = super.a();
        this.b = (ghe) c98VarA;
        return c98VarA;
    }

    @Override // defpackage.s88
    public final int b(Object[] objArr, int i) {
        pci it = l().iterator();
        while (it.hasNext()) {
            xpb xpbVar = (xpb) it.next();
            Arrays.fill(objArr, i, xpbVar.a() + i, xpbVar.a);
            i += xpbVar.a();
        }
        return i;
    }

    @Override // defpackage.s88, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return ((mhe) this).e.b(obj) > 0;
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof q98)) {
            return false;
        }
        q98 q98Var = (q98) obj;
        mhe mheVar = (mhe) this;
        if (mheVar.size() != q98Var.size() || l().size() != q98Var.l().size()) {
            return false;
        }
        for (xpb xpbVar : q98Var.l()) {
            if (mheVar.e.b(xpbVar.a) != xpbVar.a()) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return xpl.d(l());
    }

    @Override // defpackage.s88
    /* JADX INFO: renamed from: i */
    public final pci iterator() {
        return new n98(l().iterator());
    }

    public abstract u98 j();

    public final u98 l() {
        u98 p98Var = this.c;
        if (p98Var == null) {
            p98Var = isEmpty() ? nhe.j : new p98(this, 0);
            this.c = p98Var;
        }
        return p98Var;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return l().toString();
    }
}
