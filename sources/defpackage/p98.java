package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class p98 extends u98 {
    public final /* synthetic */ int d;
    public final /* synthetic */ q98 e;

    public /* synthetic */ p98(q98 q98Var, int i) {
        this.d = i;
        this.e = q98Var;
    }

    @Override // defpackage.s88
    public final int b(Object[] objArr, int i) {
        return a().b(objArr, i);
    }

    @Override // defpackage.s88, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        int i = this.d;
        q98 q98Var = this.e;
        switch (i) {
            case 0:
                if (obj instanceof xpb) {
                    xpb xpbVar = (xpb) obj;
                    if (xpbVar.a() > 0) {
                        if (((mhe) q98Var).e.b(xpbVar.a) == xpbVar.a()) {
                            return true;
                        }
                    }
                }
                return false;
            default:
                return ((mhe) q98Var).contains(obj);
        }
    }

    @Override // defpackage.s88
    public final boolean g() {
        switch (this.d) {
            case 0:
                return false;
            default:
                return true;
        }
    }

    @Override // defpackage.u98, java.util.Collection, java.util.Set
    public int hashCode() {
        switch (this.d) {
            case 0:
                return this.e.hashCode();
            default:
                return super.hashCode();
        }
    }

    @Override // defpackage.s88
    /* JADX INFO: renamed from: i */
    public final pci iterator() {
        return a().listIterator(0);
    }

    @Override // defpackage.u98
    public final c98 n() {
        return new cd8(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        int i = this.d;
        q98 q98Var = this.e;
        switch (i) {
            case 0:
                return q98Var.j().size();
            default:
                return ((mhe) q98Var).e.c;
        }
    }
}
