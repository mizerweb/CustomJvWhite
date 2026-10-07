package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
final class wvk extends msk implements Serializable {
    final Object a;
    final Object b;

    public wvk(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    @Override // defpackage.msk, java.util.Map.Entry
    public final Object getKey() {
        return this.a;
    }

    @Override // defpackage.msk, java.util.Map.Entry
    public final Object getValue() {
        return this.b;
    }

    @Override // defpackage.msk, java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
