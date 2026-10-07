package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class rok extends dok {
    public final transient xok c;
    public final transient uok d;

    public rok(xok xokVar, uok uokVar) {
        this.c = xokVar;
        this.d = uokVar;
    }

    @Override // defpackage.wmk
    public final int a(Object[] objArr) {
        return this.d.a(objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.c.get(obj) != null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return this.d.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.c.f;
    }
}
