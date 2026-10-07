package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class avi implements cvi {
    public final gka a;
    public final wui b;
    public final zui c;

    public avi(gka gkaVar, wui wuiVar, zui zuiVar) {
        this.a = gkaVar;
        this.b = wuiVar;
        this.c = zuiVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof avi)) {
            return false;
        }
        avi aviVar = (avi) obj;
        return cqk.d(this.a, aviVar.a) && this.b.equals(aviVar.b) && this.c.equals(aviVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "ConversionRequired(preparedMessageUpload=" + this.a + ", preparedConversion=" + this.b + ", videoConversionSpec=" + this.c + ")";
    }
}
