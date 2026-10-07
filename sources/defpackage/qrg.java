package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class qrg {
    public final ozg a;
    public final int b;
    public final ozg c;

    public qrg(ozg ozgVar, int i, ozg ozgVar2) {
        this.a = ozgVar;
        this.b = i;
        this.c = ozgVar2;
    }

    public static qrg a(qrg qrgVar, ozg ozgVar, ozg ozgVar2, int i) {
        if ((i & 1) != 0) {
            ozgVar = qrgVar.a;
        }
        int i2 = qrgVar.b;
        if ((i & 4) != 0) {
            ozgVar2 = qrgVar.c;
        }
        return new qrg(ozgVar, i2, ozgVar2);
    }

    public final int b() {
        return this.b;
    }

    public final ozg c() {
        return this.c;
    }

    public final ozg d() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qrg)) {
            return false;
        }
        qrg qrgVar = (qrg) obj;
        return cqk.d(this.a, qrgVar.a) && this.b == qrgVar.b && cqk.d(this.c, qrgVar.c);
    }

    public final int hashCode() {
        ozg ozgVar = this.a;
        int iC = zo5.c(this.b, (ozgVar == null ? 0 : ozgVar.hashCode()) * 31, 31);
        ozg ozgVar2 = this.c;
        return iC + (ozgVar2 != null ? ozgVar2.hashCode() : 0);
    }

    public final String toString() {
        return "StashedPreview(preview=" + this.a + ", index=" + this.b + ", pollingPreview=" + this.c + ")";
    }
}
