package defpackage;

import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class t8i implements x8i {
    public final ynh a;
    public final ynh b;
    public final v8i c;

    public t8i(ynh ynhVar, ynh ynhVar2, v8i v8iVar) {
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
        if (!(obj instanceof t8i)) {
            return false;
        }
        t8i t8iVar = (t8i) obj;
        return this.a.equals(t8iVar.a) && this.b.equals(t8iVar.b) && this.c.equals(t8iVar.c);
    }

    @Override // defpackage.x8i
    public final int getIcon() {
        return R.drawable.icon_bulb;
    }

    @Override // defpackage.x8i
    public final ynh getTitle() {
        return this.a;
    }

    public final int hashCode() {
        return this.c.hashCode() + bc1.h(bc1.h(Integer.hashCode(R.drawable.icon_bulb) * 31, 31, this.a), 31, this.b);
    }

    public final String toString() {
        return "CreateHint(icon=" + R.drawable.icon_bulb + ", title=" + this.a + ", subtitle=" + this.b + ", inputState=" + this.c + ")";
    }
}
