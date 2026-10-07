package defpackage;

import ru.oneme.app.R;

/* JADX INFO: loaded from: classes4.dex */
public final class zj6 implements k79 {
    public final long a;
    public final String b;
    public final CharSequence c;
    public final String d;
    public final ck6 e;
    public final int f;
    public final int g;

    public zj6(long j, String str, CharSequence charSequence, String str2, ck6 ck6Var, int i, int i2) {
        this.a = j;
        this.b = str;
        this.c = charSequence;
        this.d = str2;
        this.e = ck6Var;
        this.f = i;
        this.g = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zj6)) {
            return false;
        }
        zj6 zj6Var = (zj6) obj;
        return this.a == zj6Var.a && cqk.d(this.b, zj6Var.b) && this.c.equals(zj6Var.c) && cqk.d(this.d, zj6Var.d) && cqk.d(this.e, zj6Var.e) && this.f == zj6Var.f && this.g == zj6Var.g;
    }

    @Override // defpackage.k79
    public final long getItemId() {
        return -9223372036854775807L;
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.a) * 31;
        String str = this.b;
        return Integer.hashCode(this.g) + zo5.c(this.f, (this.e.hashCode() + zo5.d(mw7.f((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c), 31, this.d)) * 31, 31);
    }

    @Override // defpackage.k79
    /* JADX INFO: renamed from: j */
    public final int getF() {
        return R.id.messages_list_fake_boss_view_type;
    }

    public final String toString() {
        StringBuilder sbT = qt4.t(this.a, "FakeBossListItem(contactServerId=", ", phoneNumber=", this.b);
        sbT.append(", country=");
        sbT.append((Object) this.c);
        sbT.append(", registrationDate=");
        sbT.append(this.d);
        sbT.append(", mutualChatsState=");
        sbT.append(this.e);
        sbT.append(", organizationInfoTextRes=");
        sbT.append(this.f);
        return qv1.o(sbT, ", organizationInfoIconRes=", this.g, ")");
    }
}
