package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class hec extends bt8 {
    @Override // defpackage.bt8
    public final aw8 e(jt8 jt8Var) {
        return kt8.g(jt8Var).containsKey("max_cache_size_mb") ? gec.Companion.serializer() : dec.INSTANCE.serializer();
    }

    public final aw8 serializer() {
        return iec.a;
    }
}
