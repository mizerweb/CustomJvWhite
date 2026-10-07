package defpackage;

import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class zaf implements ebf {
    public final tnh a;
    public final int b;
    public final int c;
    public final long d;

    public zaf(int i, long j, tnh tnhVar) {
        this.a = tnhVar;
        this.b = i;
        this.c = 4;
        this.d = j;
    }

    @Override // defpackage.psf
    public final int A() {
        return this.b;
    }

    @Override // defpackage.ebf
    public final int a() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zaf)) {
            return false;
        }
        zaf zafVar = (zaf) obj;
        return cqk.d(this.a, zafVar.a) && this.b == zafVar.b && this.c == zafVar.c && this.d == zafVar.d;
    }

    @Override // defpackage.ebf
    public final boolean g() {
        return false;
    }

    @Override // defpackage.k79
    public final long getItemId() {
        return this.d;
    }

    @Override // defpackage.psf
    public final ynh getTitle() {
        return this.a;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + c0a.f(this.c, zo5.c(this.b, Integer.hashCode(this.a.c) * 31, 31), 31);
    }

    @Override // defpackage.psf, defpackage.k79
    /* JADX INFO: renamed from: j */
    public final int getF() {
        return R.id.oneme_settings_media_screen_settings_description_vh;
    }

    public final String toString() {
        return "Description(title=" + this.a + ", sectionId=" + this.b + ", sectionItemType=" + pye.q(this.c) + ", itemId=" + this.d + ")";
    }

    public /* synthetic */ zaf(tnh tnhVar, int i, long j, int i2) {
        this(i, (i2 & 8) != 0 ? w7c.A : j, tnhVar);
    }
}
