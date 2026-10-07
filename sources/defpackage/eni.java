package defpackage;

import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class eni implements k79 {
    public final xnh a;
    public final tj0 b;
    public final String c;
    public final fu1 d;
    public final boolean e;

    public eni(xnh xnhVar, tj0 tj0Var, String str, fu1 fu1Var, boolean z) {
        this.a = xnhVar;
        this.b = tj0Var;
        this.c = str;
        this.d = fu1Var;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eni)) {
            return false;
        }
        eni eniVar = (eni) obj;
        return this.a.equals(eniVar.a) && this.b.equals(eniVar.b) && this.c.equals(eniVar.c) && cqk.d(this.d, eniVar.d) && this.e == eniVar.e;
    }

    @Override // defpackage.k79
    public final long getItemId() {
        return this.d.a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + ((this.d.hashCode() + zo5.d((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c)) * 31);
    }

    @Override // defpackage.k79
    /* JADX INFO: renamed from: j */
    public final int getF() {
        return R.id.call_screen_admin_user_in_wait_room_vh;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UserInWaitingData(name=");
        sb.append(this.a);
        sb.append(", avatarAbbreviationModel=");
        sb.append(this.b);
        sb.append(", url=");
        sb.append(this.c);
        sb.append(", participantId=");
        sb.append(this.d);
        sb.append(", isOfficial=");
        return qt4.r(sb, this.e, ")");
    }
}
