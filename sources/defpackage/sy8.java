package defpackage;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class sy8<K, V> {
    private final Map a = new HashMap();

    public abstract V a(K k);

    public V b(K k) {
        synchronized (this.a) {
            try {
                if (this.a.containsKey(k)) {
                    return (V) this.a.get(k);
                }
                V vA = a(k);
                this.a.put(k, vA);
                return vA;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
