package defpackage;

import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class mq2 implements nq2 {
    public final String a;
    public final ynh b;
    public final Integer c;
    public final boolean d;

    public mq2(String str, ynh ynhVar, Integer num, boolean z) {
        this.a = str;
        this.b = ynhVar;
        this.c = num;
        this.d = z;
    }

    public static mq2 a(mq2 mq2Var, String str, ynh ynhVar, Integer num, boolean z, int i) {
        if ((i & 2) != 0) {
            str = mq2Var.a;
        }
        return new mq2(str, ynhVar, num, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mq2)) {
            return false;
        }
        mq2 mq2Var = (mq2) obj;
        return cqk.d(this.a, mq2Var.a) && cqk.d(this.b, mq2Var.b) && cqk.d(this.c, mq2Var.c) && this.d == mq2Var.d;
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(R.string.profile_edit_shortlink_contact_title) * 31;
        String str = this.a;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        ynh ynhVar = this.b;
        int iHashCode3 = (iHashCode2 + (ynhVar == null ? 0 : ynhVar.hashCode())) * 31;
        Integer num = this.c;
        return Boolean.hashCode(this.d) + ((iHashCode3 + (num != null ? num.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sbA = nbh.A(R.string.profile_edit_shortlink_contact_title, "Contact(title=", ", link=", this.a, ", hint=");
        sbA.append(this.b);
        sbA.append(", hintColor=");
        sbA.append(this.c);
        sbA.append(", hasError=");
        return qt4.r(sbA, this.d, ")");
    }
}
