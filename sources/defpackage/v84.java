package defpackage;

import android.net.Uri;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class v84 implements rui {
    public final List a;
    public final long b;
    public final boolean c;
    public final long d;
    public final long e;
    public final int h;
    public final int i;
    public final Uri f = Uri.EMPTY;
    public final String g = "video/mp4";
    public final int j = 2;

    public v84(List list, long j, boolean z) {
        this.a = list;
        this.b = j;
        this.c = z;
        this.d = ((u84) list.get(0)).toString().hashCode();
        this.e = j;
        this.h = ((u84) list.get(0)).b;
        this.i = ((u84) list.get(0)).c;
    }

    @Override // defpackage.rui
    public final long a() {
        return this.e;
    }

    @Override // defpackage.rui
    public final long c() {
        return 0L;
    }

    @Override // defpackage.rui
    public final Uri d() {
        return this.f;
    }

    @Override // defpackage.rui
    public final boolean e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v84)) {
            return false;
        }
        v84 v84Var = (v84) obj;
        return cqk.d(this.a, v84Var.a) && this.b == v84Var.b && this.c == v84Var.c;
    }

    @Override // defpackage.rui
    public final String getContentType() {
        return this.g;
    }

    @Override // defpackage.rui
    public final long getDuration() {
        return this.b;
    }

    @Override // defpackage.rui
    public final int getHeight() {
        return this.i;
    }

    @Override // defpackage.rui
    public final int getType() {
        return this.j;
    }

    @Override // defpackage.rui
    public final int getWidth() {
        return this.h;
    }

    @Override // defpackage.rui
    public final boolean h() {
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + qt4.g(this.a.hashCode() * 31, 31, this.b);
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

    public final List l() {
        return this.a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ConcatenatedMp4VideoContent(items=");
        sb.append(this.a);
        sb.append(", duration=");
        sb.append(this.b);
        return nbh.z(sb, ", isMute=", this.c, ")");
    }
}
