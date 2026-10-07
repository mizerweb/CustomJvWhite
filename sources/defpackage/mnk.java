package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class mnk extends snk {
    public final transient snk c;

    public mnk(snk snkVar) {
        this.c = snkVar;
    }

    @Override // defpackage.snk, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.c.contains(obj);
    }

    @Override // defpackage.snk
    public final snk f() {
        return this.c;
    }

    @Override // defpackage.snk, java.util.List
    /* JADX INFO: renamed from: g */
    public final snk subList(int i, int i2) {
        snk snkVar = this.c;
        e2k.g(i, i2, snkVar.size());
        return snkVar.subList(snkVar.size() - i2, snkVar.size() - i).f();
    }

    @Override // java.util.List
    public final Object get(int i) {
        snk snkVar = this.c;
        e2k.f(i, snkVar.size());
        return snkVar.get((snkVar.size() - 1) - i);
    }

    @Override // defpackage.snk, java.util.List
    public final int indexOf(Object obj) {
        snk snkVar = this.c;
        int iLastIndexOf = snkVar.lastIndexOf(obj);
        if (iLastIndexOf >= 0) {
            return (snkVar.size() - 1) - iLastIndexOf;
        }
        return -1;
    }

    @Override // defpackage.snk, java.util.List
    public final int lastIndexOf(Object obj) {
        snk snkVar = this.c;
        int iIndexOf = snkVar.indexOf(obj);
        if (iIndexOf >= 0) {
            return (snkVar.size() - 1) - iIndexOf;
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c.size();
    }
}
