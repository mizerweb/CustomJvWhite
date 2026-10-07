package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class rbm extends h5m {
    public final transient tdm c;
    public final transient vcm d;

    public rbm(tdm tdmVar, vcm vcmVar) {
        this.c = tdmVar;
        this.d = vcmVar;
    }

    @Override // defpackage.apl
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
        this.c.getClass();
        return 1;
    }
}
