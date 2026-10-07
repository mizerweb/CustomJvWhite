package defpackage;

import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class jbf implements kbf {
    public final int a;
    public final ynh b;
    public final int c;
    public final long d;
    public final osf e;
    public final msf f;
    public final dz8 g;
    public final boolean h;
    public final String i;

    public jbf(int i, ynh ynhVar, int i2, long j, gsf gsfVar, bz8 bz8Var, String str, int i3) {
        osf osfVar = (i3 & 16) != 0 ? osf.b : osf.a;
        gsfVar = (i3 & 64) != 0 ? null : gsfVar;
        bz8Var = (i3 & np0.m) != 0 ? null : bz8Var;
        boolean z = (i3 & np0.n) == 0;
        str = (i3 & np0.o) != 0 ? null : str;
        this.a = i;
        this.b = ynhVar;
        this.c = i2;
        this.d = j;
        this.e = osfVar;
        this.f = gsfVar;
        this.g = bz8Var;
        this.h = z;
        this.i = str;
    }

    @Override // defpackage.psf
    public final int A() {
        return this.c;
    }

    @Override // defpackage.kbf
    public final int a() {
        return this.a;
    }

    @Override // defpackage.kbf, defpackage.psf
    public final msf d() {
        return this.f;
    }

    @Override // defpackage.kbf, defpackage.psf
    public final dz8 e() {
        return this.g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jbf)) {
            return false;
        }
        jbf jbfVar = (jbf) obj;
        return this.a == jbfVar.a && this.b.equals(jbfVar.b) && this.c == jbfVar.c && this.d == jbfVar.d && this.e == jbfVar.e && cqk.d(this.f, jbfVar.f) && cqk.d(this.g, jbfVar.g) && this.h == jbfVar.h && cqk.d(this.i, jbfVar.i);
    }

    @Override // defpackage.kbf, defpackage.psf
    public final ynh f() {
        return null;
    }

    @Override // defpackage.k79
    public final long getItemId() {
        return this.d;
    }

    @Override // defpackage.psf
    public final ynh getTitle() {
        return this.b;
    }

    @Override // defpackage.kbf, defpackage.psf
    public final osf getType() {
        return this.e;
    }

    public final int hashCode() {
        int iHashCode = (this.e.hashCode() + qt4.g(zo5.c(this.c, bc1.h(qt4.D(this.a) * 31, 31, this.b), 31), 31, this.d)) * 961;
        msf msfVar = this.f;
        int iHashCode2 = (iHashCode + (msfVar == null ? 0 : msfVar.hashCode())) * 31;
        dz8 dz8Var = this.g;
        int iN = nbh.n((iHashCode2 + (dz8Var == null ? 0 : dz8Var.hashCode())) * 31, 31, this.h);
        String str = this.i;
        return iN + (str != null ? str.hashCode() : 0);
    }

    @Override // defpackage.psf, defpackage.k79
    /* JADX INFO: renamed from: j */
    public final int getF() {
        return R.id.oneme_settings_ringtone_section_item_vh;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SettingSelectRingtoneItem(sectionItemType=");
        sb.append(pye.q(this.a));
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", sectionId=");
        c0a.v(sb, this.c, ", itemId=", this.d);
        sb.append(", type=");
        sb.append(this.e);
        sb.append(", descriptionRes=null, endView=");
        sb.append(this.f);
        sb.append(", leadingElementProperties=");
        sb.append(this.g);
        sb.append(", canRemove=");
        sb.append(this.h);
        return qt4.q(sb, ", filePath=", this.i, ")");
    }
}
