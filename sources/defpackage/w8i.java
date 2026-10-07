package defpackage;

import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class w8i implements x8i {
    public final tnh a;
    public final vnh b;
    public final int c;

    public w8i(tnh tnhVar, vnh vnhVar, int i) {
        this.a = tnhVar;
        this.b = vnhVar;
        this.c = i;
    }

    @Override // defpackage.x8i
    public final ynh b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w8i)) {
            return false;
        }
        w8i w8iVar = (w8i) obj;
        return this.a.equals(w8iVar.a) && this.b.equals(w8iVar.b) && this.c == w8iVar.c;
    }

    @Override // defpackage.x8i
    public final int getIcon() {
        return R.drawable.icon_code;
    }

    @Override // defpackage.x8i
    public final ynh getTitle() {
        return this.a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + ((this.b.hashCode() + zo5.c(this.a.c, Integer.hashCode(R.drawable.icon_code) * 31, 31)) * 31);
    }

    public final String toString() {
        return "VerifyEmail(icon=" + R.drawable.icon_code + ", title=" + this.a + ", subtitle=" + this.b + ", codeLength=" + this.c + ")";
    }
}
