package defpackage;

import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class zp1 implements cq1 {
    public final ynh a;
    public final esf b;
    public final bz8 c = new bz8(R.drawable.icon_message, 0, 6);
    public final long d = tyb.b;
    public final tnh e = new tnh(R.string.call_history_info_open_call_chat_title);

    public zp1(ynh ynhVar, dsf dsfVar) {
        this.a = ynhVar;
        this.b = dsfVar;
    }

    @Override // defpackage.psf
    public final int A() {
        return 0;
    }

    @Override // defpackage.cq1, defpackage.psf
    public final esf b() {
        return this.b;
    }

    @Override // defpackage.cq1, defpackage.psf
    public final msf d() {
        return fsf.a;
    }

    @Override // defpackage.psf
    public final dz8 e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zp1)) {
            return false;
        }
        zp1 zp1Var = (zp1) obj;
        return this.a.equals(zp1Var.a) && cqk.d(this.b, zp1Var.b);
    }

    @Override // defpackage.cq1, defpackage.psf
    public final ynh f() {
        return this.a;
    }

    @Override // defpackage.k79
    public final long getItemId() {
        return this.d;
    }

    @Override // defpackage.psf
    public final ynh getTitle() {
        return this.e;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        esf esfVar = this.b;
        return iHashCode + (esfVar == null ? 0 : esfVar.hashCode());
    }

    @Override // defpackage.psf, defpackage.k79
    /* JADX INFO: renamed from: j */
    public final int getF() {
        return R.id.call_info_action_vh;
    }

    public final String toString() {
        return "OpenCallChat(descriptionRes=" + this.a + ", counterType=" + this.b + ")";
    }
}
