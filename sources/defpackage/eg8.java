package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class eg8 implements ny8, Serializable {
    public final Object a;

    public eg8(Object obj) {
        this.a = obj;
    }

    @Override // defpackage.ny8
    public final boolean d() {
        return true;
    }

    @Override // defpackage.ny8
    public final Object getValue() {
        return this.a;
    }

    public final String toString() {
        return String.valueOf(this.a);
    }
}
