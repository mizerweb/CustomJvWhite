package defpackage;

import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class vnb implements wnb {
    public final tnh a;
    public final int b;
    public final long c;
    public final osf d;
    public final ynh e;
    public final msf f;
    public final esf g;

    public vnb(tnh tnhVar, int i, long j, tnh tnhVar2, msf msfVar, csf csfVar, int i2) {
        tnhVar2 = (i2 & 16) != 0 ? null : tnhVar2;
        csfVar = (i2 & np0.m) != 0 ? null : csfVar;
        this.a = tnhVar;
        this.b = i;
        this.c = j;
        this.d = osf.b;
        this.e = tnhVar2;
        this.f = msfVar;
        this.g = csfVar;
    }

    @Override // defpackage.psf
    public final int A() {
        return this.b;
    }

    @Override // defpackage.wnb, defpackage.psf
    public final esf b() {
        return this.g;
    }

    @Override // defpackage.wnb, defpackage.psf
    public final msf d() {
        return this.f;
    }

    @Override // defpackage.wnb, defpackage.psf
    public final dz8 e() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vnb)) {
            return false;
        }
        vnb vnbVar = (vnb) obj;
        return this.a.equals(vnbVar.a) && this.b == vnbVar.b && this.c == vnbVar.c && this.d == vnbVar.d && cqk.d(this.e, vnbVar.e) && this.f.equals(vnbVar.f) && cqk.d(this.g, vnbVar.g);
    }

    @Override // defpackage.wnb, defpackage.psf
    public final ynh f() {
        return this.e;
    }

    @Override // defpackage.k79
    public final long getItemId() {
        return this.c;
    }

    @Override // defpackage.psf
    public final ynh getTitle() {
        return this.a;
    }

    @Override // defpackage.wnb, defpackage.psf
    public final osf getType() {
        return this.d;
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + qt4.g(zo5.c(this.b, Integer.hashCode(this.a.c) * 31, 31), 31, this.c)) * 31;
        ynh ynhVar = this.e;
        int iHashCode2 = (this.f.hashCode() + ((iHashCode + (ynhVar == null ? 0 : ynhVar.hashCode())) * 31)) * 961;
        esf esfVar = this.g;
        return iHashCode2 + (esfVar != null ? esfVar.hashCode() : 0);
    }

    @Override // defpackage.psf, defpackage.k79
    /* JADX INFO: renamed from: j */
    public final int getF() {
        return R.id.oneme_notifications_settings_item_vh;
    }

    public final String toString() {
        return "NotificationsSettingItem(title=" + this.a + ", sectionId=" + this.b + ", itemId=" + this.c + ", type=" + this.d + ", descriptionRes=" + this.e + ", endView=" + this.f + ", leadingElementProperties=null, counterType=" + this.g + ")";
    }
}
