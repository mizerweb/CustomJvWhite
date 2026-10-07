package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class pd8 implements k79 {
    public final String a;
    public final String b;
    public final long c;

    public pd8(String str, String str2) {
        this.a = str;
        this.b = str2;
        this.c = str.hashCode();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pd8)) {
            return false;
        }
        pd8 pd8Var = (pd8) obj;
        return this.a.equals(pd8Var.a) && this.b.equals(pd8Var.b);
    }

    @Override // defpackage.k79
    public final long getItemId() {
        return this.c;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    @Override // defpackage.k79
    public final int j() {
        return 0;
    }

    public final String toString() {
        return nbh.w("InfoSettingsItem(title=", this.a, ", description=", this.b, ")");
    }
}
