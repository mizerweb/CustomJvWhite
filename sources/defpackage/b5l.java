package defpackage;

/* JADX INFO: loaded from: classes2.dex */
final class b5l implements d6l {
    private final int a;
    private final a6l b;

    public b5l(int i, a6l a6lVar) {
        this.a = i;
        this.b = a6lVar;
    }

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return d6l.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d6l)) {
            return false;
        }
        d6l d6lVar = (d6l) obj;
        return this.a == d6lVar.zza() && this.b.equals(d6lVar.zzb());
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (this.a ^ 14552422) + (this.b.hashCode() ^ 2041407134);
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.a + "intEncoding=" + this.b + ')';
    }

    @Override // defpackage.d6l
    public final int zza() {
        return this.a;
    }

    @Override // defpackage.d6l
    public final a6l zzb() {
        return this.b;
    }
}
