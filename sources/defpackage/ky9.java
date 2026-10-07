package defpackage;

import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class ky9 implements qy9 {
    public final long a;
    public final long b;
    public final t50 c;
    public final g58 d;
    public final boolean e;
    public final String f;
    public final long g;

    public ky9(long j, long j2, t50 t50Var, g58 g58Var, String str, int i) {
        boolean z = g58Var.e;
        if ((i & 32) != 0 && (str = g58Var.k) == null) {
            str = "";
        }
        this.a = j;
        this.b = j2;
        this.c = t50Var;
        this.d = g58Var;
        this.e = z;
        this.f = str;
        this.g = (((long) Integer.hashCode(R.id.oneme_chatmedia_viewer_photo_item_view_type)) * 31) + (((long) str.hashCode()) * 31) + ((long) Long.hashCode(j));
    }

    @Override // defpackage.qy9
    public final String B() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!ky9.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        ky9 ky9Var = (ky9) obj;
        return this.a == ky9Var.a && this.b == ky9Var.b && this.e == ky9Var.e && this.g == ky9Var.g && cqk.d(this.d, ky9Var.d) && this.f.equals(ky9Var.f);
    }

    @Override // defpackage.k79
    public final long getItemId() {
        return this.g;
    }

    public final int hashCode() {
        return this.f.hashCode() + ((this.d.hashCode() + ((((Long.hashCode(this.g) + nbh.n(qt4.g(Long.hashCode(this.a) * 31, 31, this.b), 31, this.e)) * 31) + R.id.oneme_chatmedia_viewer_photo_item_view_type) * 31)) * 31);
    }

    @Override // defpackage.k79
    public final int j() {
        return R.id.oneme_chatmedia_viewer_photo_item_view_type;
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
        StringBuilder sb = new StringBuilder("Photo{itemId=");
        sb.append(this.g);
        sb.append(",messageId=");
        sb.append(this.a);
        sb.append(",localId=");
        sb.append(this.f);
        sb.append(",attachId=");
        sb.append(this.b);
        sb.append(",imageAttachConfig=");
        sb.append(this.d);
        sb.append(",isGif=");
        return c0a.p(sb, this.e, '}');
    }

    @Override // defpackage.qy9
    public final t50 u() {
        return this.c;
    }
}
