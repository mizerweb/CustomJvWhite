package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class vdg implements aeg {
    public final long a;

    public vdg(long j) {
        this.a = j;
    }

    @Override // defpackage.aeg
    public final long a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vdg) && this.a == ((vdg) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return nbh.s(this.a, "Gap(sliceTime=", ")");
    }
}
