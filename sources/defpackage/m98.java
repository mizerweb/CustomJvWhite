package defpackage;

import java.util.Collection;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class m98 extends s88 {
    public final d98 b;

    public m98(d98 d98Var) {
        this.b = d98Var;
    }

    @Override // defpackage.s88, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            Collection collection = (Collection) this.b.b().get(key);
            if (collection != null && collection.contains(value)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.s88
    /* JADX INFO: renamed from: i */
    public final pci iterator() {
        d98 d98Var = this.b;
        d98Var.getClass();
        return new l98(d98Var);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.b.f;
    }
}
