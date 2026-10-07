package defpackage;

import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: loaded from: classes3.dex */
public final class jke extends ArrayList {
    public final Collection a;

    /* JADX WARN: Illegal instructions before constructor call */
    public jke() {
        r66 r66Var = r66.a;
        super(r66Var);
        this.a = r66Var;
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof hke) {
            return super.contains((hke) obj);
        }
        return false;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jke) && cqk.d(this.a, ((jke) obj).a);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof hke) {
            return super.indexOf((hke) obj);
        }
        return -1;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof hke) {
            return super.lastIndexOf((hke) obj);
        }
        return -1;
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean remove(Object obj) {
        if (obj instanceof hke) {
            return super.remove((hke) obj);
        }
        return false;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return "ReplyButtonRow(buttons=" + this.a + ")";
    }
}
