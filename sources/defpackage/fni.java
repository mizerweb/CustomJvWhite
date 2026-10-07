package defpackage;

import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class fni implements psf {
    public final vnh a;

    public fni(vnh vnhVar) {
        this.a = vnhVar;
    }

    @Override // defpackage.psf
    public final int A() {
        return 0;
    }

    @Override // defpackage.psf
    public final esf b() {
        return null;
    }

    @Override // defpackage.psf
    public final ynh c() {
        return null;
    }

    @Override // defpackage.psf
    public final msf d() {
        return fsf.a;
    }

    @Override // defpackage.psf
    public final dz8 e() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fni) && this.a.equals(((fni) obj).a);
    }

    @Override // defpackage.psf
    public final ynh f() {
        return null;
    }

    @Override // defpackage.k79
    public final long getItemId() {
        return Long.MIN_VALUE;
    }

    @Override // defpackage.psf
    public final ynh getTitle() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.psf, defpackage.k79
    /* JADX INFO: renamed from: j */
    public final int getF() {
        return R.id.call_screen_admin_user_in_wait_room_more_vh;
    }

    public final String toString() {
        return "UserInWaitingMore(title=" + this.a + ")";
    }
}
