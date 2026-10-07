package defpackage;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes2.dex */
class gsk extends ask implements List {
    final /* synthetic */ jsk f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gsk(jsk jskVar, Object obj, List list, ask askVar) {
        super(jskVar, obj, list, askVar);
        this.f = jskVar;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        b();
        boolean zIsEmpty = this.b.isEmpty();
        ((List) this.b).add(i, obj);
        this.f.e++;
        if (zIsEmpty) {
            a();
        }
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zAddAll = ((List) this.b).addAll(i, collection);
        if (zAddAll) {
            int size2 = this.b.size();
            this.f.e += size2 - size;
            if (size == 0) {
                a();
                return true;
            }
        }
        return zAddAll;
    }

    @Override // java.util.List
    public final Object get(int i) {
        b();
        return ((List) this.b).get(i);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        b();
        return ((List) this.b).indexOf(obj);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        b();
        return ((List) this.b).lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        b();
        return new dsk(this);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        b();
        Object objRemove = ((List) this.b).remove(i);
        this.f.e--;
        c();
        return objRemove;
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        b();
        return ((List) this.b).set(i, obj);
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        b();
        List listSubList = ((List) this.b).subList(i, i2);
        ask askVar = this.c;
        if (askVar == null) {
            askVar = this;
        }
        return this.f.u(this.a, listSubList, askVar);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        b();
        return new dsk(this, i);
    }
}
