package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class m16 implements n16 {
    public final int a;
    public final int b;

    public m16(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m16)) {
            return false;
        }
        m16 m16Var = (m16) obj;
        return this.a == m16Var.a && this.b == m16Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return nbh.u("Video(playIcon=", this.a, ", muteIcon=", this.b, ")");
    }
}
