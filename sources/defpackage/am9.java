package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class am9 implements Map.Entry, uv8 {
    public final Object a;
    public final Object b;

    public am9(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.b;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
