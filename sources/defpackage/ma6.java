package defpackage;

import java.io.Serializable;
import java.util.RandomAccess;
import kotlin.collections.a;

/* JADX INFO: loaded from: classes.dex */
public final class ma6 extends b2 implements la6, RandomAccess, Serializable {
    public final Enum[] a;

    public ma6(Enum[] enumArr) {
        this.a = enumArr;
    }

    @Override // defpackage.b2, java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof Enum)) {
            return false;
        }
        Enum r2 = (Enum) obj;
        return ((Enum) a.d1(this.a, r2.ordinal())) == r2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        Enum[] enumArr = this.a;
        int length = enumArr.length;
        if (i >= 0 && i < length) {
            return enumArr[i];
        }
        c.r(qt4.l("index: ", i, length, ", size: "));
        return null;
    }

    @Override // defpackage.b2
    public final int getSize() {
        return this.a.length;
    }

    @Override // defpackage.b2, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r3 = (Enum) obj;
        int iOrdinal = r3.ordinal();
        if (((Enum) a.d1(this.a, iOrdinal)) == r3) {
            return iOrdinal;
        }
        return -1;
    }

    @Override // defpackage.b2, java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r3 = (Enum) obj;
        int iOrdinal = r3.ordinal();
        if (((Enum) a.d1(this.a, iOrdinal)) == r3) {
            return iOrdinal;
        }
        return -1;
    }
}
