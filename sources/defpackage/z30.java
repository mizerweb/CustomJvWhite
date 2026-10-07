package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class z30 implements owd {
    public final int a;

    public z30(int i) {
        this.a = i;
    }

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return owd.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof owd)) {
            return false;
        }
        owd owdVar = (owd) obj;
        return this.a == owdVar.tag() && nwd.a.equals(owdVar.intEncoding());
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (this.a ^ 14552422) + (nwd.a.hashCode() ^ 2041407134);
    }

    @Override // defpackage.owd
    public final nwd intEncoding() {
        return nwd.a;
    }

    @Override // defpackage.owd
    public final int tag() {
        return this.a;
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.a + "intEncoding=" + nwd.a + ')';
    }
}
