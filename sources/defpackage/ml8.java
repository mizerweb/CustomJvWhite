package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ml8 implements or0 {
    public final ll8 a;
    public final tnh b;
    public final Integer c;
    public final long d;

    public ml8(ll8 ll8Var, tnh tnhVar, Integer num) {
        this.a = ll8Var;
        this.b = tnhVar;
        this.c = num;
        this.d = ll8Var.ordinal();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ml8)) {
            return false;
        }
        ml8 ml8Var = (ml8) obj;
        return this.a == ml8Var.a && this.b.equals(ml8Var.b) && this.c.equals(ml8Var.c);
    }

    @Override // defpackage.or0
    public final Integer getIcon() {
        return this.c;
    }

    @Override // defpackage.k79
    public final long getItemId() {
        return this.d;
    }

    @Override // defpackage.or0
    public final ynh getText() {
        return this.b;
    }

    public final int hashCode() {
        return this.c.hashCode() + zo5.c(this.b.c, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "InviteActionListItem(type=" + this.a + ", text=" + this.b + ", icon=" + this.c + ")";
    }
}
