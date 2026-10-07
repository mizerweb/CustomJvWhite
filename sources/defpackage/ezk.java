package defpackage;

import java.util.AbstractMap;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class ezk extends iwk {
    final /* synthetic */ hzk d;

    public ezk(hzk hzkVar) {
        this.d = hzkVar;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        vpk.a(i, this.d.e, "index");
        int i2 = i + i;
        Object obj = this.d.d[i2];
        Objects.requireNonNull(obj);
        Object obj2 = this.d.d[i2 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d.e;
    }
}
