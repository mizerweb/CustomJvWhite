package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class jhe extends u98 {
    public final transient g98 d;
    public final transient khe e;

    public jhe(g98 g98Var, khe kheVar) {
        this.d = g98Var;
        this.e = kheVar;
    }

    @Override // defpackage.u98, defpackage.s88
    public final c98 a() {
        return this.e;
    }

    @Override // defpackage.s88
    public final int b(Object[] objArr, int i) {
        return this.e.b(objArr, i);
    }

    @Override // defpackage.s88, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.d.get(obj) != null;
    }

    @Override // defpackage.s88
    public final boolean g() {
        return true;
    }

    @Override // defpackage.s88
    /* JADX INFO: renamed from: i */
    public final pci iterator() {
        return this.e.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.d.size();
    }
}
