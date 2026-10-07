package defpackage;

import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class py9 implements qy9 {
    public final long a;
    public final long b;
    public final t50 c;
    public final fti d;
    public final String e;
    public final long f;

    public py9(long j, long j2, t50 t50Var, fti ftiVar, String str) {
        this.a = j;
        this.b = j2;
        this.c = t50Var;
        this.d = ftiVar;
        this.e = str;
        this.f = (((long) Integer.hashCode(R.id.oneme_chatmedia_viewer_video_item_view_type)) * 31) + (((long) str.hashCode()) * 31) + ((long) Long.hashCode(j));
    }

    @Override // defpackage.qy9
    public final String B() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!py9.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        py9 py9Var = (py9) obj;
        if (this.a != py9Var.a || this.b != py9Var.b || this.f != py9Var.f) {
            return false;
        }
        fti ftiVar = this.d;
        int i = ftiVar.c;
        fti ftiVar2 = py9Var.d;
        return i == ftiVar2.c && ftiVar.d == ftiVar2.d && ftiVar.e == ftiVar2.e && ftiVar.l == ftiVar2.l && ew5.f(ftiVar.f, ftiVar2.f) && cqk.d(this.e, py9Var.e);
    }

    @Override // defpackage.k79
    public final long getItemId() {
        return this.f;
    }

    public final int hashCode() {
        int iHashCode = (((Long.hashCode(this.f) + qt4.g(Long.hashCode(this.a) * 31, 31, this.b)) * 31) + R.id.oneme_chatmedia_viewer_video_item_view_type) * 31;
        fti ftiVar = this.d;
        int iN = nbh.n((((((iHashCode + ftiVar.c) * 31) + ftiVar.d) * 31) + ftiVar.e) * 31, 31, ftiVar.l);
        long j = ftiVar.f;
        ghb ghbVar = ew5.b;
        return this.e.hashCode() + qt4.g(iN, 31, j);
    }

    @Override // defpackage.k79
    /* JADX INFO: renamed from: j */
    public final int getF() {
        return R.id.oneme_chatmedia_viewer_video_item_view_type;
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
        return "Video{itemId=" + this.f + ",messageId=" + this.a + ",localId=" + this.e + ",attachId=" + this.b + ",videoAttachConfig=" + this.d + '}';
    }

    @Override // defpackage.qy9
    public final t50 u() {
        return this.c;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public py9(long j, long j2, t50 t50Var, fti ftiVar) {
        String str = ftiVar.h;
        this(j, j2, t50Var, ftiVar, str == null ? "" : str);
    }
}
