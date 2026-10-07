package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ppk implements xqk {
    public final int a;

    public ppk(int i) {
        this.a = i;
    }

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return xqk.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xqk)) {
            return false;
        }
        xqk xqkVar = (xqk) obj;
        return this.a == xqkVar.zza() && uqk.a.equals(xqkVar.zzb());
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (this.a ^ 14552422) + (uqk.a.hashCode() ^ 2041407134);
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.a + "intEncoding=" + uqk.a + ')';
    }

    @Override // defpackage.xqk
    public final int zza() {
        return this.a;
    }

    @Override // defpackage.xqk
    public final uqk zzb() {
        return uqk.a;
    }
}
