package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
public final class u88 extends s2 implements Serializable {
    public final Object a;
    public final Object b;

    public u88(Object obj, Object obj2) {
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

    @Override // defpackage.s2, java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
