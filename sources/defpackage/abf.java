package defpackage;

import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class abf implements ebf {
    public final tnh a;
    public final int b;
    public final long c;

    public abf(int i, long j, tnh tnhVar) {
        this.a = tnhVar;
        this.b = i;
        this.c = j;
    }

    @Override // defpackage.psf
    public final int A() {
        return this.b;
    }

    @Override // defpackage.ebf
    public final int a() {
        return 4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof abf)) {
            return false;
        }
        abf abfVar = (abf) obj;
        return this.a.equals(abfVar.a) && this.b == abfVar.b && this.c == abfVar.c;
    }

    @Override // defpackage.ebf
    public final boolean g() {
        return false;
    }

    @Override // defpackage.k79
    public final long getItemId() {
        return this.c;
    }

    @Override // defpackage.psf
    public final ynh getTitle() {
        return this.a;
    }

    public final int hashCode() {
        return qt4.D(4) + qt4.g(zo5.c(this.b, Integer.hashCode(this.a.c) * 31, 31), 31, this.c);
    }

    @Override // defpackage.psf, defpackage.k79
    /* JADX INFO: renamed from: j */
    public final int getF() {
        return R.id.oneme_settings_media_screen_settings_header_vh;
    }

    public final String toString() {
        return "Header(title=" + this.a + ", sectionId=" + this.b + ", itemId=" + this.c + ", sectionItemType=" + pye.q(4) + ")";
    }
}
