package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class jag extends u98 {
    public final transient Object d;

    public jag(Object obj) {
        obj.getClass();
        this.d = obj;
    }

    @Override // defpackage.u98, defpackage.s88
    public final c98 a() {
        return c98.r(this.d);
    }

    @Override // defpackage.s88
    public final int b(Object[] objArr, int i) {
        objArr[i] = this.d;
        return i + 1;
    }

    @Override // defpackage.s88, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.d.equals(obj);
    }

    @Override // defpackage.s88
    public final boolean g() {
        return false;
    }

    @Override // defpackage.u98, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.d.hashCode();
    }

    @Override // defpackage.s88
    /* JADX INFO: renamed from: i */
    public final pci iterator() {
        return q4m.e(this.d);
    }

    @Override // defpackage.s88, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return q4m.e(this.d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return "[" + this.d.toString() + ']';
    }
}
