package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class zoh {
    public final int a;
    public final int b;
    public final int c;

    public zoh(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zoh)) {
            return false;
        }
        zoh zohVar = (zoh) obj;
        return this.a == zohVar.a && this.b == zohVar.b && this.c == zohVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + zo5.c(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        return zo5.t(qv1.p("TextsUiModel(titleRes=", this.a, ", descriptionRes=", this.b, ", buttonRes="), this.c, ")");
    }
}
