package defpackage;

import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class n7d extends o7d {
    public static final long d = z5c.c;
    public final xnh a;
    public final tnh b;
    public final long c = d;

    public n7d(tnh tnhVar, xnh xnhVar) {
        this.a = xnhVar;
        this.b = tnhVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n7d)) {
            return false;
        }
        n7d n7dVar = (n7d) obj;
        return this.a.equals(n7dVar.a) && this.b.equals(n7dVar.b);
    }

    @Override // defpackage.k79
    public final long getItemId() {
        return this.c;
    }

    public final int hashCode() {
        return Integer.hashCode(200) + zo5.c(this.b.c, this.a.hashCode() * 31, 31);
    }

    @Override // defpackage.k79
    /* JADX INFO: renamed from: j */
    public final int getF() {
        return R.id.oneme_poll_create__title_item_viewtype;
    }

    @Override // defpackage.k79
    public final /* bridge */ /* synthetic */ boolean m(k79 k79Var) {
        return true;
    }

    public final String toString() {
        return "Title(title=" + this.a + ", hint=" + this.b + ", lengthLimit=200)";
    }
}
