package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class dnk implements aok {
    public final int a;

    public dnk(int i) {
        this.a = i;
    }

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return aok.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aok)) {
            return false;
        }
        aok aokVar = (aok) obj;
        return this.a == aokVar.zza() && vnk.a.equals(aokVar.zzb());
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (this.a ^ 14552422) + (vnk.a.hashCode() ^ 2041407134);
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.a + "intEncoding=" + vnk.a + ')';
    }

    @Override // defpackage.aok
    public final int zza() {
        return this.a;
    }

    @Override // defpackage.aok
    public final vnk zzb() {
        return vnk.a;
    }
}
