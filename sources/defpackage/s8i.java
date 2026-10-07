package defpackage;

import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class s8i implements x8i {
    public final ynh a;
    public final ynh b;
    public final v8i c;

    public s8i(ynh ynhVar, ynh ynhVar2, v8i v8iVar) {
        this.a = ynhVar;
        this.b = ynhVar2;
        this.c = v8iVar;
    }

    @Override // defpackage.x8i
    public final ynh b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s8i)) {
            return false;
        }
        s8i s8iVar = (s8i) obj;
        return this.a.equals(s8iVar.a) && this.b.equals(s8iVar.b) && this.c.equals(s8iVar.c);
    }

    @Override // defpackage.x8i
    public final int getIcon() {
        return R.drawable.icon_password;
    }

    @Override // defpackage.x8i
    public final ynh getTitle() {
        return this.a;
    }

    public final int hashCode() {
        return this.c.hashCode() + bc1.h(bc1.h(Integer.hashCode(R.drawable.icon_password) * 31, 31, this.a), 31, this.b);
    }

    public final String toString() {
        return "CheckPassword(icon=" + R.drawable.icon_password + ", title=" + this.a + ", subtitle=" + this.b + ", inputState=" + this.c + ")";
    }
}
