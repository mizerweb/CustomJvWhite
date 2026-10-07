package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class hz4 implements or0 {
    public final int a;
    public final tnh b;
    public final Integer c;
    public final long d;

    public hz4(int i, tnh tnhVar, Integer num) {
        this.a = i;
        this.b = tnhVar;
        this.c = num;
        long j = i;
        this.d = j;
        if (j >= ll8.d.getSize()) {
            return;
        }
        ore.p("CustomInviteActionListItem itemId must be greater than size of InviteActionListItem.Type to avoid collisions. Set another itemId.");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hz4)) {
            return false;
        }
        hz4 hz4Var = (hz4) obj;
        return this.a == hz4Var.a && this.b.equals(hz4Var.b) && this.c.equals(hz4Var.c);
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
        return this.c.hashCode() + zo5.c(this.b.c, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        return "CustomInviteActionListItem(actionId=" + this.a + ", text=" + this.b + ", icon=" + this.c + ")";
    }
}
