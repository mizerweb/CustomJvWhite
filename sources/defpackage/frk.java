package defpackage;

import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
final class frk extends ayk {
    final /* synthetic */ jrk a;

    public frk(jrk jrkVar) {
        this.a = jrkVar;
    }

    @Override // defpackage.ayk
    public final Map a() {
        return this.a;
    }

    @Override // defpackage.ayk, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        Set setEntrySet = this.a.d.entrySet();
        setEntrySet.getClass();
        try {
            return setEntrySet.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new irk(this.a);
    }

    @Override // defpackage.ayk, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        if (!contains(obj)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Objects.requireNonNull(entry);
        jrk jrkVar = this.a;
        jsk.x(jrkVar.e, entry.getKey());
        return true;
    }
}
