package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class wm0 extends bt8 {
    @Override // defpackage.bt8
    public final aw8 e(jt8 jt8Var) {
        return kt8.g(jt8Var).containsKey("bg_interval_minutes") ? vm0.Companion.serializer() : sm0.INSTANCE.serializer();
    }

    public final aw8 serializer() {
        return xm0.a;
    }
}
