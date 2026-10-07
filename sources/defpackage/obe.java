package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class obe implements pbe {
    public final fbe a;
    public final tnh b;

    public obe(fbe fbeVar, tnh tnhVar) {
        this.a = fbeVar;
        this.b = tnhVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof obe)) {
            return false;
        }
        obe obeVar = (obe) obj;
        return this.a == obeVar.a && this.b.equals(obeVar.b);
    }

    public final int hashCode() {
        return Integer.hashCode(this.b.c) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ShowTooltip(recordControlType=" + this.a + ", textSource=" + this.b + ")";
    }
}
