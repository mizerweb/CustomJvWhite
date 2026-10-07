package defpackage;

import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class r8i implements x8i {
    public final ynh a;
    public final ynh b;
    public final v8i c;

    public r8i(ynh ynhVar, ynh ynhVar2, v8i v8iVar) {
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
        if (!(obj instanceof r8i)) {
            return false;
        }
        r8i r8iVar = (r8i) obj;
        return this.a.equals(r8iVar.a) && this.b.equals(r8iVar.b) && this.c.equals(r8iVar.c);
    }

    @Override // defpackage.x8i
    public final int getIcon() {
        return R.drawable.icon_mention;
    }

    @Override // defpackage.x8i
    public final ynh getTitle() {
        return this.a;
    }

    public final int hashCode() {
        return this.c.hashCode() + bc1.h(bc1.h(Integer.hashCode(R.drawable.icon_mention) * 31, 31, this.a), 31, this.b);
    }

    public final String toString() {
        return "AddEmail(icon=" + R.drawable.icon_mention + ", title=" + this.a + ", subtitle=" + this.b + ", inputState=" + this.c + ")";
    }
}
