package defpackage;

import java.util.Iterator;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes4.dex */
public final class vpe extends b2 {
    @Override // java.util.List
    public final Object get(int i) {
        return us0.g.get(ww3.g1(i, this));
    }

    @Override // defpackage.b2
    public final int getSize() {
        return us0.g.getSize();
    }

    @Override // defpackage.b2, java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new tpe(this, 0);
    }

    @Override // defpackage.b2, java.util.List
    public final ListIterator listIterator() {
        return new tpe(this, 0);
    }

    @Override // defpackage.b2, java.util.List
    public final ListIterator listIterator(int i) {
        return new tpe(this, i);
    }
}
