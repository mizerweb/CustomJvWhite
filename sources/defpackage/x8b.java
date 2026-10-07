package defpackage;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes4.dex */
public final class x8b {
    public final LinkedHashMap a;
    public final AtomicBoolean b;

    public x8b(LinkedHashMap linkedHashMap, boolean z) {
        this.a = linkedHashMap;
        this.b = new AtomicBoolean(z);
    }

    public final void a(vdd vddVar, Object obj) {
        AtomicBoolean atomicBoolean = this.b;
        if (atomicBoolean.get()) {
            ore.k("Do mutate preferences once returned to DataStore.");
            return;
        }
        LinkedHashMap linkedHashMap = this.a;
        if (obj == null) {
            if (atomicBoolean.get()) {
                ore.k("Do mutate preferences once returned to DataStore.");
                return;
            } else {
                linkedHashMap.remove(vddVar);
                return;
            }
        }
        if (obj instanceof Set) {
            linkedHashMap.put(vddVar, Collections.unmodifiableSet(ww3.X1((Iterable) obj)));
        } else {
            linkedHashMap.put(vddVar, obj);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof x8b)) {
            return false;
        }
        return cqk.d(this.a, ((x8b) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ww3.z1(this.a.entrySet(), ",\n", "{\n", "\n}", rl0.j, 24);
    }

    public /* synthetic */ x8b(boolean z) {
        this(new LinkedHashMap(), z);
    }
}
