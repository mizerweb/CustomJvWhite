package defpackage;

import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class ey9 implements qy9 {
    public final long a;
    public final long b;
    public final t50 c;
    public final String d;
    public final long e;

    public ey9(long j, long j2, t50 t50Var, String str) {
        this.a = j;
        this.b = j2;
        this.c = t50Var;
        this.d = str;
        this.e = j2;
    }

    @Override // defpackage.qy9
    public final String B() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ey9)) {
            return false;
        }
        ey9 ey9Var = (ey9) obj;
        return this.a == ey9Var.a && this.b == ey9Var.b && cqk.d(this.c, ey9Var.c) && cqk.d(this.d, ey9Var.d);
    }

    @Override // defpackage.k79
    public final long getItemId() {
        return this.e;
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + qt4.g(Long.hashCode(this.a) * 31, 31, this.b)) * 31);
    }

    @Override // defpackage.k79
    /* JADX INFO: renamed from: j */
    public final int getF() {
        return R.id.oneme_chatmedia_viewer_content_level_item_view_type;
    }

    @Override // defpackage.qy9
    public final long k() {
        return this.b;
    }

    @Override // defpackage.qy9
    public final long l() {
        return this.a;
    }

    public final String toString() {
        StringBuilder sbS = qt4.s(this.a, "ContentLevel(messageId=", ", attachId=");
        sbS.append(this.b);
        sbS.append(", attachModel=");
        sbS.append(this.c);
        return qt4.q(sbS, ", localId=", this.d, ")");
    }

    @Override // defpackage.qy9
    public final t50 u() {
        return this.c;
    }
}
