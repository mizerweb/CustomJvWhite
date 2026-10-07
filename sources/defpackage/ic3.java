package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ic3 implements pc3 {
    public final long a;
    public final g4b b;
    public final int c;

    public ic3(long j, g4b g4bVar, int i) {
        this.a = j;
        this.b = g4bVar;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ic3)) {
            return false;
        }
        ic3 ic3Var = (ic3) obj;
        return this.a == ic3Var.a && this.b.equals(ic3Var.b) && this.c == ic3Var.c;
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (Long.hashCode(this.a) * 31)) * 31;
        int i = this.c;
        return iHashCode + (i == 0 ? 0 : qt4.D(i));
    }

    public final String toString() {
        return "SendStickerAfterConfirm(stickerId=" + this.a + ", sliceData=" + this.b + ", place=" + pye.l(this.c) + ")";
    }
}
