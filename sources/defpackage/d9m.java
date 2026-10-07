package defpackage;

import java.util.AbstractMap;

/* JADX INFO: loaded from: classes2.dex */
public final class d9m extends xyl {
    public final /* synthetic */ jam c;

    public d9m(jam jamVar) {
        this.c = jamVar;
    }

    @Override // java.util.List
    public final /* synthetic */ Object get(int i) {
        jam jamVar = this.c;
        e9i.O0(i, jamVar.e);
        Object[] objArr = jamVar.d;
        int i2 = i + i;
        Object obj = objArr[i2];
        obj.getClass();
        Object obj2 = objArr[i2 + 1];
        obj2.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c.e;
    }
}
