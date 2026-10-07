package defpackage;

import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class e6g implements k79 {
    public final tnh a;
    public final xnh b;
    public final long c = R.id.about_app_version;

    public e6g(tnh tnhVar, xnh xnhVar) {
        this.a = tnhVar;
        this.b = xnhVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e6g)) {
            return false;
        }
        e6g e6gVar = (e6g) obj;
        return this.a.equals(e6gVar.a) && this.b.equals(e6gVar.b);
    }

    @Override // defpackage.k79
    public final long getItemId() {
        return this.c;
    }

    public final int hashCode() {
        return this.b.hashCode() + zo5.c(this.a.c, Integer.hashCode(R.id.about_app_version) * 31, 31);
    }

    @Override // defpackage.k79
    /* JADX INFO: renamed from: j */
    public final int getF() {
        return R.id.about_app_simple_cell_view_type;
    }

    public final String toString() {
        return "SimpleActionItem(id=" + R.id.about_app_version + ", title=" + this.a + ", subtitle=" + this.b + ")";
    }
}
