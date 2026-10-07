package defpackage;

import android.net.Uri;

/* JADX INFO: loaded from: classes2.dex */
public final class rm7 implements rui {
    public final Uri a;
    public final int b;
    public final int c;
    public final long d;

    public rm7(Uri uri, int i, int i2, long j) {
        this.a = uri;
        this.b = i;
        this.c = i2;
        this.d = j;
    }

    @Override // defpackage.rui
    public final long a() {
        return 0L;
    }

    @Override // defpackage.rui
    public final long c() {
        return 0L;
    }

    @Override // defpackage.rui
    public final Uri d() {
        return this.a;
    }

    @Override // defpackage.rui
    public final boolean e() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rm7)) {
            return false;
        }
        rm7 rm7Var = (rm7) obj;
        return cqk.d(this.a, rm7Var.a) && this.b == rm7Var.b && this.c == rm7Var.c && this.d == rm7Var.d;
    }

    @Override // defpackage.rui
    public final String getContentType() {
        return "video/mp4";
    }

    @Override // defpackage.rui
    public final long getDuration() {
        return 0L;
    }

    @Override // defpackage.rui
    public final int getHeight() {
        return this.c;
    }

    @Override // defpackage.rui
    public final int getType() {
        return 3;
    }

    @Override // defpackage.rui
    public final int getWidth() {
        return this.b;
    }

    @Override // defpackage.rui
    public final boolean h() {
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + zo5.c(this.c, zo5.c(this.b, this.a.hashCode() * 31, 31), 31);
    }

    @Override // defpackage.rui
    public final String i() {
        return null;
    }

    @Override // defpackage.rui
    public final long j() {
        return 0L;
    }

    @Override // defpackage.rui
    public final long k() {
        return this.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GifVideoContent(contentUri=");
        sb.append(this.a);
        sb.append(", width=");
        sb.append(this.b);
        sb.append(", height=");
        c0a.v(sb, this.c, ", videoId=", this.d);
        sb.append(")");
        return sb.toString();
    }
}
