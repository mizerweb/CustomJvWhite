package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
final class kzk extends rwk {
    private final transient owk c;
    private final transient iwk d;

    public kzk(owk owkVar, iwk iwkVar) {
        this.c = owkVar;
        this.d = iwkVar;
    }

    @Override // defpackage.tvk
    public final int a(Object[] objArr, int i) {
        return this.d.a(objArr, i);
    }

    @Override // defpackage.tvk, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.c.get(obj) != null;
    }

    @Override // defpackage.rwk, defpackage.tvk
    /* JADX INFO: renamed from: d */
    public final f0l iterator() {
        return this.d.listIterator(0);
    }

    @Override // defpackage.rwk, defpackage.tvk, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return this.d.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }
}
