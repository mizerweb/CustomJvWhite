package defpackage;

import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public final class chc extends b2 implements RandomAccess {
    public final d71[] a;
    public final int[] b;

    public chc(d71[] d71VarArr, int[] iArr) {
        this.a = d71VarArr;
        this.b = iArr;
    }

    @Override // defpackage.b2, java.util.List, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof d71) {
            return super.contains((d71) obj);
        }
        return false;
    }

    @Override // java.util.List
    public final Object get(int i) {
        return this.a[i];
    }

    @Override // defpackage.b2
    public final int getSize() {
        return this.a.length;
    }

    @Override // defpackage.b2, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof d71) {
            return super.indexOf((d71) obj);
        }
        return -1;
    }

    @Override // defpackage.b2, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof d71) {
            return super.lastIndexOf((d71) obj);
        }
        return -1;
    }
}
