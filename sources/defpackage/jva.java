package defpackage;

import android.graphics.drawable.Drawable;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class jva implements lva {
    public final tnh a;
    public final long b;
    public final Drawable c;

    public jva(tnh tnhVar, long j, Drawable drawable) {
        this.a = tnhVar;
        this.b = j;
        this.c = drawable;
    }

    @Override // defpackage.psf
    public final int A() {
        return 2;
    }

    @Override // defpackage.lva
    public final int a() {
        return 3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jva)) {
            return false;
        }
        jva jvaVar = (jva) obj;
        return this.a.equals(jvaVar.a) && this.b == jvaVar.b && cqk.d(this.c, jvaVar.c);
    }

    @Override // defpackage.k79
    public final long getItemId() {
        return this.b;
    }

    @Override // defpackage.psf
    public final ynh getTitle() {
        return this.a;
    }

    public final int hashCode() {
        int iG = qt4.g(zo5.c(2, zo5.c(this.a.c, qt4.D(3) * 31, 31), 31), 31, this.b);
        Drawable drawable = this.c;
        return iG + (drawable == null ? 0 : drawable.hashCode());
    }

    @Override // defpackage.psf, defpackage.k79
    /* JADX INFO: renamed from: j */
    public final int getF() {
        return R.id.oneme_messages_settings_need_divider_above_vh;
    }

    public final String toString() {
        return "ReactionSetting(sectionItemType=LAST, title=" + this.a + ", sectionId=2, itemId=" + this.b + ", reaction=" + this.c + ")";
    }
}
