package defpackage;

import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class f8a implements k79 {
    public final int a;
    public final ynh b;
    public final osf c;
    public final Integer d;
    public final msf e;
    public final long f;

    public f8a(int i, ynh ynhVar, osf osfVar, Integer num, msf msfVar) {
        this.a = i;
        this.b = ynhVar;
        this.c = osfVar;
        this.d = num;
        this.e = msfVar;
        this.f = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f8a)) {
            return false;
        }
        f8a f8aVar = (f8a) obj;
        return this.a == f8aVar.a && cqk.d(this.b, f8aVar.b) && this.c == f8aVar.c && cqk.d(this.d, f8aVar.d) && cqk.d(this.e, f8aVar.e);
    }

    @Override // defpackage.k79
    public final long getItemId() {
        return this.f;
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + bc1.h(Integer.hashCode(this.a) * 31, 31, this.b)) * 31;
        Integer num = this.d;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        msf msfVar = this.e;
        return iHashCode2 + (msfVar != null ? msfVar.hashCode() : 0);
    }

    @Override // defpackage.k79
    /* JADX INFO: renamed from: j */
    public final int getF() {
        return R.id.members_list_action_view_type;
    }

    public final String toString() {
        return "MemberListActionItem(id=" + this.a + ", text=" + this.b + ", type=" + this.c + ", startIconRes=" + this.d + ", endViewType=" + this.e + ")";
    }
}
