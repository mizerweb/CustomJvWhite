package defpackage;

import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class u8i implements x8i {
    public final ynh a;
    public final v8i b;
    public final v8i c;

    public u8i(ynh ynhVar, v8i v8iVar, v8i v8iVar2) {
        this.a = ynhVar;
        this.b = v8iVar;
        this.c = v8iVar2;
    }

    public static u8i c(u8i u8iVar, v8i v8iVar, v8i v8iVar2, int i) {
        ynh ynhVar = u8iVar.a;
        if ((i & 4) != 0) {
            v8iVar = u8iVar.b;
        }
        if ((i & 8) != 0) {
            v8iVar2 = u8iVar.c;
        }
        return new u8i(ynhVar, v8iVar, v8iVar2);
    }

    @Override // defpackage.x8i
    public final boolean a() {
        return (this.b.c == null && this.c.c == null) ? false : true;
    }

    @Override // defpackage.x8i
    public final ynh b() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u8i)) {
            return false;
        }
        u8i u8iVar = (u8i) obj;
        return this.a.equals(u8iVar.a) && this.b.equals(u8iVar.b) && this.c.equals(u8iVar.c);
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
        return this.c.hashCode() + ((this.b.hashCode() + bc1.h(Integer.hashCode(R.drawable.icon_password) * 31, 31, this.a)) * 31);
    }

    public final String toString() {
        return "CreatePassword(icon=" + R.drawable.icon_password + ", title=" + this.a + ", inputState=" + this.b + ", secondInputState=" + this.c + ")";
    }
}
