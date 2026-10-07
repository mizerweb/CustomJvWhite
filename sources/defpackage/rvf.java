package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class rvf extends mk0 {
    public final tnh b;
    public final int c;

    public rvf(int i, tnh tnhVar) {
        super(19);
        this.b = tnhVar;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rvf)) {
            return false;
        }
        rvf rvfVar = (rvf) obj;
        return this.b.equals(rvfVar.b) && this.c == rvfVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + (Integer.hashCode(this.b.c) * 31);
    }

    public final String toString() {
        return "ShowSnackbar(message=" + this.b + ", icon=" + this.c + ")";
    }
}
