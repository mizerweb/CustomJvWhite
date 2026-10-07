package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class uvd {
    public final int a;
    public final boolean b;

    public uvd(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || uvd.class != obj.getClass()) {
            return false;
        }
        uvd uvdVar = (uvd) obj;
        return this.a == uvdVar.a && this.b == uvdVar.b;
    }

    public final int hashCode() {
        return (this.a * 31) + (this.b ? 1 : 0);
    }
}
