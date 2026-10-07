package defpackage;

import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes2.dex */
final class dsk extends xrk implements ListIterator {
    final /* synthetic */ gsk d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dsk(gsk gskVar, int i) {
        super(gskVar, ((List) gskVar.b).listIterator(i));
        this.d = gskVar;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        boolean zIsEmpty = this.d.isEmpty();
        a();
        ((ListIterator) this.a).add(obj);
        this.d.f.e++;
        if (zIsEmpty) {
            this.d.a();
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        a();
        return ((ListIterator) this.a).hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        a();
        return ((ListIterator) this.a).nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        a();
        return ((ListIterator) this.a).previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        a();
        return ((ListIterator) this.a).previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        a();
        ((ListIterator) this.a).set(obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dsk(gsk gskVar) {
        super(gskVar);
        this.d = gskVar;
    }
}
