package defpackage;

import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class lq2 implements nq2 {
    public final int a;
    public final kq2 b;
    public final String c;
    public final ynh d;
    public final Integer e;
    public final boolean f;

    public lq2(int i, kq2 kq2Var, String str, ynh ynhVar, Integer num, boolean z) {
        this.a = i;
        this.b = kq2Var;
        this.c = str;
        this.d = ynhVar;
        this.e = num;
        this.f = z;
    }

    public static lq2 a(lq2 lq2Var, String str, ynh ynhVar, Integer num, boolean z, int i) {
        int i2 = lq2Var.a;
        kq2 kq2Var = lq2Var.b;
        if ((i & 4) != 0) {
            str = lq2Var.c;
        }
        String str2 = str;
        if ((i & 32) != 0) {
            z = lq2Var.f;
        }
        return new lq2(i2, kq2Var, str2, ynhVar, num, z);
    }

    public final boolean b(nq2 nq2Var) {
        if (nq2Var == null || !(nq2Var instanceof lq2)) {
            return false;
        }
        lq2 lq2Var = (lq2) nq2Var;
        return (this.b == lq2Var.b && cqk.d(this.c, lq2Var.c)) ? false : true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lq2)) {
            return false;
        }
        lq2 lq2Var = (lq2) obj;
        return this.a == lq2Var.a && this.b == lq2Var.b && cqk.d(this.c, lq2Var.c) && cqk.d(this.d, lq2Var.d) && cqk.d(this.e, lq2Var.e) && this.f == lq2Var.f;
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31;
        String str = this.c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        ynh ynhVar = this.d;
        int iHashCode3 = (iHashCode2 + (ynhVar == null ? 0 : ynhVar.hashCode())) * 31;
        Integer num = this.e;
        return Boolean.hashCode(this.f) + ((iHashCode3 + (num != null ? num.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "Chat(title=" + this.a + ", type=" + this.b + ", link=" + this.c + ", hint=" + this.d + ", hintColor=" + this.e + ", hasError=" + this.f + ")";
    }

    public /* synthetic */ lq2(kq2 kq2Var, String str) {
        this(R.string.profile_edit_shortlink_chat_title, kq2Var, str, null, null, false);
    }
}
