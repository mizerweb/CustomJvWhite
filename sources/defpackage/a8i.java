package defpackage;

import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class a8i implements d8i {
    public final tnh a;
    public final int b;
    public final long c;

    public a8i(tnh tnhVar) {
        long j = R.id.oneme_settings_twofa_configuration_description_item;
        this.a = tnhVar;
        this.b = 4;
        this.c = j;
    }

    @Override // defpackage.psf
    public final int A() {
        return 0;
    }

    @Override // defpackage.d8i
    public final int a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a8i)) {
            return false;
        }
        a8i a8iVar = (a8i) obj;
        return this.a.equals(a8iVar.a) && this.b == a8iVar.b && this.c == a8iVar.c;
    }

    @Override // defpackage.d8i
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
        return Long.hashCode(this.c) + c0a.f(this.b, zo5.c(0, Integer.hashCode(this.a.c) * 31, 31), 31);
    }

    @Override // defpackage.psf, defpackage.k79
    /* JADX INFO: renamed from: j */
    public final int getF() {
        return R.id.oneme_settings_twofa_configuration_description_item;
    }

    public final String toString() {
        return "Description(title=" + this.a + ", sectionId=0, sectionItemType=" + pye.q(this.b) + ", itemId=" + this.c + ")";
    }
}
