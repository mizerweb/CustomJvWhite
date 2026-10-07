package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class vgc {
    public final wgc a;

    public vgc(wgc wgcVar) {
        this.a = wgcVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vgc) && this.a.equals(((vgc) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ContentPayload(page=" + this.a + ")";
    }
}
