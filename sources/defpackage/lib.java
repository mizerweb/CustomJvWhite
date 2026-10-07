package defpackage;

import kotlinx.serialization.SerializationException;

/* JADX INFO: loaded from: classes2.dex */
public final class lib implements aw8 {
    public static final lib a = new lib();
    public static final kib b = kib.a;

    @Override // defpackage.aw8
    public final void a(u76 u76Var, Object obj) {
        throw new SerializationException("'kotlin.Nothing' cannot be serialized");
    }

    @Override // defpackage.aw8
    public final Object c(r55 r55Var) {
        throw new SerializationException("'kotlin.Nothing' does not have instances");
    }

    @Override // defpackage.aw8
    public final fif d() {
        return b;
    }
}
