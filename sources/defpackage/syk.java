package defpackage;

import java.util.AbstractCollection;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
abstract class syk extends AbstractCollection {
    public abstract pyk a();

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        a().h();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return a().d(entry.getKey(), entry.getValue());
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return a().e(entry.getKey(), entry.getValue());
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return a().a();
    }
}
