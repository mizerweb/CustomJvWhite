package defpackage;

import ru.oneme.app.R;

/* JADX INFO: loaded from: classes4.dex */
public final class yf1 implements ag1 {
    public final int a;
    public final tnh b;
    public final long c;
    public final osf d = osf.b;

    public yf1(int i, long j, tnh tnhVar) {
        this.a = i;
        this.b = tnhVar;
        this.c = j;
    }

    @Override // defpackage.psf
    public final int A() {
        return 0;
    }

    @Override // defpackage.ag1
    public final int a() {
        return this.a;
    }

    @Override // defpackage.ag1, defpackage.psf
    public final msf d() {
        return null;
    }

    @Override // defpackage.ag1, defpackage.psf
    public final dz8 e() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yf1)) {
            return false;
        }
        yf1 yf1Var = (yf1) obj;
        return this.a == yf1Var.a && this.b.equals(yf1Var.b) && this.c == yf1Var.c && this.d == yf1Var.d;
    }

    @Override // defpackage.ag1, defpackage.psf
    public final ynh f() {
        return null;
    }

    @Override // defpackage.k79
    public final long getItemId() {
        return this.c;
    }

    @Override // defpackage.psf
    public final ynh getTitle() {
        return this.b;
    }

    @Override // defpackage.ag1, defpackage.psf
    public final osf getType() {
        return this.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + ((this.d.hashCode() + qt4.g(zo5.c(0, zo5.c(this.b.c, qt4.D(this.a) * 31, 31), 31), 31, this.c)) * 923521);
    }

    @Override // defpackage.psf, defpackage.k79
    /* JADX INFO: renamed from: j */
    public final int getF() {
        return R.id.call_debug_menu_settings_item_vh;
    }

    public final String toString() {
        return "CallDebugMenuItem(sectionItemType=" + pye.q(this.a) + ", title=" + this.b + ", sectionId=0, itemId=" + this.c + ", type=" + this.d + ", descriptionRes=null, endView=null, leadingElementProperties=null, clickable=true)";
    }
}
