package defpackage;

import java.util.AbstractList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
public final class rci extends AbstractList implements zy8, RandomAccess {
    public final yy8 a;

    public rci(yy8 yy8Var) {
        this.a = yy8Var;
    }

    @Override // defpackage.zy8
    public final List e() {
        return Collections.unmodifiableList(this.a.b);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return (String) this.a.get(i);
    }

    @Override // defpackage.zy8
    public final void h(c71 c71Var) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        d4 d4Var = new d4();
        d4Var.b = this.a.iterator();
        return d4Var;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        qci qciVar = new qci();
        qciVar.a = this.a.listIterator(i);
        return qciVar;
    }

    @Override // defpackage.zy8
    public final zy8 p() {
        return this;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.a.size();
    }

    @Override // defpackage.zy8
    public final Object t(int i) {
        return this.a.b.get(i);
    }
}
