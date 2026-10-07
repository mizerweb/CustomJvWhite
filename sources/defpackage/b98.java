package defpackage;

import java.util.Iterator;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes2.dex */
public final class b98 extends c98 {
    public final transient int c;
    public final transient int d;
    public final /* synthetic */ c98 e;

    public b98(c98 c98Var, int i, int i2) {
        this.e = c98Var;
        this.c = i;
        this.d = i2;
    }

    @Override // defpackage.s88
    public final Object[] c() {
        return this.e.c();
    }

    @Override // defpackage.s88
    public final int d() {
        return this.e.f() + this.c + this.d;
    }

    @Override // defpackage.s88
    public final int f() {
        return this.e.f() + this.c;
    }

    @Override // defpackage.s88
    public final boolean g() {
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        lvb.U(i, this.d);
        return this.e.get(i + this.c);
    }

    @Override // defpackage.c98, defpackage.s88, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // defpackage.c98, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }

    @Override // defpackage.c98, java.util.List
    /* JADX INFO: renamed from: y */
    public final c98 subList(int i, int i2) {
        lvb.Y(i, i2, this.d);
        int i3 = this.c;
        return this.e.subList(i + i3, i2 + i3);
    }

    @Override // defpackage.c98, java.util.List
    public final /* bridge */ /* synthetic */ ListIterator listIterator(int i) {
        return listIterator(i);
    }
}
