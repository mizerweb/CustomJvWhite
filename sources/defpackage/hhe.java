package defpackage;

import java.util.AbstractMap;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class hhe extends c98 {
    public final /* synthetic */ ihe c;

    public hhe(ihe iheVar) {
        this.c = iheVar;
    }

    @Override // defpackage.s88
    public final boolean g() {
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        ihe iheVar = this.c;
        lvb.U(i, iheVar.g);
        Object[] objArr = iheVar.e;
        int i2 = i * 2;
        int i3 = iheVar.f;
        Object obj = objArr[i2 + i3];
        Objects.requireNonNull(obj);
        Object obj2 = objArr[i2 + (i3 ^ 1)];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c.g;
    }
}
