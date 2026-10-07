package defpackage;

import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public abstract class rwk extends tvk implements Set {
    private transient iwk b;

    @Override // defpackage.tvk, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* JADX INFO: renamed from: d */
    public abstract f0l iterator();

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return zzk.b(this, obj);
    }

    public final iwk g() {
        iwk iwkVar = this.b;
        if (iwkVar != null) {
            return iwkVar;
        }
        iwk iwkVarI = i();
        this.b = iwkVarI;
        return iwkVarI;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        return zzk.a(this);
    }

    public iwk i() {
        Object[] array = toArray();
        int i = iwk.c;
        return iwk.i(array, array.length);
    }
}
