package defpackage;

import ru.oneme.app.R;

/* JADX INFO: loaded from: classes4.dex */
public final class unb implements wnb {
    public final tnh a;
    public final int b;
    public final long c;

    public unb(int i, long j, tnh tnhVar) {
        this.a = tnhVar;
        this.b = i;
        this.c = j;
    }

    @Override // defpackage.psf
    public final int A() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof unb)) {
            return false;
        }
        unb unbVar = (unb) obj;
        return this.a.equals(unbVar.a) && this.b == unbVar.b && this.c == unbVar.c;
    }

    @Override // defpackage.wnb
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
        return Long.hashCode(this.c) + zo5.c(this.b, Integer.hashCode(this.a.c) * 31, 31);
    }

    @Override // defpackage.psf, defpackage.k79
    /* JADX INFO: renamed from: j */
    public final int getF() {
        return R.id.oneme_notifications_settings_header_vh;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Header(title=");
        sb.append(this.a);
        sb.append(", sectionId=");
        sb.append(this.b);
        sb.append(", itemId=");
        return c0a.m(this.c, ")", sb);
    }
}
