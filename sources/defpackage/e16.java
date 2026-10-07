package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class e16 implements f16 {
    public final kb9 a;
    public final fvi b;
    public final rvc c;

    public e16(kb9 kb9Var, fvi fviVar, rvc rvcVar) {
        this.a = kb9Var;
        this.b = fviVar;
        this.c = rvcVar;
    }

    public static e16 a(e16 e16Var, kb9 kb9Var, fvi fviVar, rvc rvcVar, int i) {
        if ((i & 1) != 0) {
            kb9Var = e16Var.a;
        }
        if ((i & 2) != 0) {
            fviVar = e16Var.b;
        }
        if ((i & 4) != 0) {
            rvcVar = e16Var.c;
        }
        return new e16(kb9Var, fviVar, rvcVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e16)) {
            return false;
        }
        e16 e16Var = (e16) obj;
        return this.a.equals(e16Var.a) && cqk.d(this.b, e16Var.b) && cqk.d(this.c, e16Var.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        fvi fviVar = this.b;
        int iHashCode2 = (iHashCode + (fviVar == null ? 0 : fviVar.hashCode())) * 31;
        rvc rvcVar = this.c;
        return iHashCode2 + (rvcVar != null ? rvcVar.hashCode() : 0);
    }

    public final String toString() {
        return "Media(media=" + this.a + ", videoConvertOptions=" + this.b + ", photoEditorOptions=" + this.c + ")";
    }
}
