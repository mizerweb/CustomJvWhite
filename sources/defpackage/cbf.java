package defpackage;

import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class cbf implements ebf {
    public final dbf a;
    public final dbf b;
    public final dbf c;
    public final ynh d;
    public final osf e;
    public final int f;

    public cbf(dbf dbfVar, dbf dbfVar2, dbf dbfVar3) {
        int i = w7c.B;
        this.a = dbfVar;
        this.b = dbfVar2;
        this.c = dbfVar3;
        this.d = ynh.b;
        this.e = osf.b;
        this.f = 4;
    }

    @Override // defpackage.psf
    public final int A() {
        return 1;
    }

    @Override // defpackage.ebf
    public final int a() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cbf)) {
            return false;
        }
        cbf cbfVar = (cbf) obj;
        long j = w7c.r;
        return j == j && this.a.equals(cbfVar.a) && this.b.equals(cbfVar.b) && this.c.equals(cbfVar.c) && this.d.equals(cbfVar.d) && this.e == cbfVar.e && this.f == cbfVar.f;
    }

    @Override // defpackage.k79
    public final long getItemId() {
        return w7c.r;
    }

    @Override // defpackage.psf
    public final ynh getTitle() {
        return this.d;
    }

    @Override // defpackage.ebf, defpackage.psf
    public final osf getType() {
        return this.e;
    }

    public final int hashCode() {
        return qt4.D(this.f) + ((this.e.hashCode() + bc1.h((this.c.hashCode() + ((this.b.hashCode() + ((this.a.hashCode() + qt4.g(Integer.hashCode(1) * 31, 31, w7c.r)) * 31)) * 31)) * 31, 31, this.d)) * 31);
    }

    @Override // defpackage.psf, defpackage.k79
    /* JADX INFO: renamed from: j */
    public final int getF() {
        return R.id.oneme_settings_media_screen_settings_slider_item_vh;
    }

    public final String toString() {
        return "SettingSliderItem(sectionId=1, itemId=" + w7c.r + ", currentStep=" + this.a + ", minStep=" + this.b + ", maxStep=" + this.c + ", title=" + this.d + ", type=" + this.e + ", sectionItemType=" + pye.q(this.f) + ")";
    }
}
