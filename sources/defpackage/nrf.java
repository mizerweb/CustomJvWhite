package defpackage;

import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class nrf implements orf, psf {
    public final ynh a;
    public final long b;
    public final int c;
    public final ynh d;
    public final msf e;
    public final osf f;

    public nrf(ynh ynhVar, long j, int i, xnh xnhVar, lsf lsfVar, int i2) {
        xnhVar = (i2 & 16) != 0 ? null : xnhVar;
        lsfVar = (i2 & 32) != 0 ? null : lsfVar;
        osf osfVar = (i2 & 64) != 0 ? osf.b : osf.d;
        this.a = ynhVar;
        this.b = j;
        this.c = i;
        this.d = xnhVar;
        this.e = lsfVar;
        this.f = osfVar;
    }

    @Override // defpackage.psf
    public final int A() {
        return 0;
    }

    @Override // defpackage.orf
    public final int a() {
        return this.c;
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
        return this.e;
    }

    @Override // defpackage.psf
    public final dz8 e() {
        return null;
    }

    @Override // defpackage.psf
    public final ynh f() {
        return this.d;
    }

    @Override // defpackage.k79
    public final long getItemId() {
        return this.b;
    }

    @Override // defpackage.psf
    public final ynh getTitle() {
        return this.a;
    }

    @Override // defpackage.psf
    public final osf getType() {
        return this.f;
    }

    @Override // defpackage.k79
    /* JADX INFO: renamed from: j */
    public final int getF() {
        return R.id.settings_devices_recycler_session_item_viewtype;
    }
}
