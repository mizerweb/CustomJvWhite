package defpackage;

import android.net.Uri;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class lx7 {
    public final String a;
    public Uri c;
    public Uri d;
    public boolean j;
    public Boolean o;
    public String p;
    public String q;
    public String t;
    public final HashMap b = new HashMap();
    public long e = -9223372036854775807L;
    public long f = -9223372036854775807L;
    public long g = -9223372036854775807L;
    public long h = -9223372036854775807L;
    public ArrayList i = new ArrayList();
    public long k = -9223372036854775807L;
    public long l = -9223372036854775807L;
    public ArrayList m = new ArrayList();
    public ArrayList n = new ArrayList();
    public long r = -9223372036854775807L;
    public long s = -9223372036854775807L;

    public lx7(String str) {
        this.a = str;
    }

    public final mx7 a() {
        Uri uri = this.d;
        if ((uri != null || this.c == null) && (uri == null || this.c != null)) {
            return null;
        }
        long j = this.e;
        if (j == -9223372036854775807L) {
            return null;
        }
        Uri uri2 = this.c;
        long j2 = this.f;
        long j3 = this.g;
        long j4 = this.h;
        ArrayList arrayList = this.i;
        boolean z = this.j;
        long j5 = this.k;
        long j6 = this.l;
        ArrayList arrayList2 = this.m;
        ArrayList arrayList3 = this.n;
        ArrayList arrayList4 = new ArrayList(this.b.values());
        Boolean bool = this.o;
        boolean z2 = bool == null || bool.booleanValue();
        String str = this.p;
        if (str == null) {
            str = "POINT";
        }
        String str2 = str;
        String str3 = this.q;
        if (str3 == null) {
            str3 = "HIGHLIGHT";
        }
        return new mx7(this.a, uri2, uri, j, j2, j3, j4, arrayList, z, j5, j6, arrayList2, arrayList3, arrayList4, z2, str2, str3, this.r, this.s, this.t);
    }

    public final void b(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            kx7 kx7Var = (kx7) arrayList.get(i);
            String str = kx7Var.a;
            HashMap map = this.b;
            kx7 kx7Var2 = (kx7) map.get(str);
            if (kx7Var2 != null) {
                boolean zEquals = kx7Var2.equals(kx7Var);
                Object[] objArr = {str, kx7Var2.d, Double.valueOf(kx7Var2.c), kx7Var.d, Double.valueOf(kx7Var.c)};
                if (!zEquals) {
                    ore.p(qe7.z("Can't change %s from %s %s to %s %s", objArr));
                    return;
                }
            }
            map.put(str, kx7Var);
        }
    }

    public final void c(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (!this.i.isEmpty()) {
            lvb.O("Can't change cue from " + String.join(", ", this.i) + " to " + String.join(", ", arrayList), this.i.equals(arrayList));
        }
        this.i = arrayList;
    }

    public final void d(long j) {
        long j2;
        if (j == -9223372036854775807L) {
            return;
        }
        long j3 = this.g;
        if (j3 != -9223372036854775807L) {
            j2 = j;
            lvb.M(j3, j2, "Can't change durationUs from %s to %s", j3 == j);
        } else {
            j2 = j;
        }
        this.g = j2;
    }

    public final void e(long j) {
        long j2;
        if (j == -9223372036854775807L) {
            return;
        }
        long j3 = this.f;
        if (j3 != -9223372036854775807L) {
            j2 = j;
            lvb.M(j3, j2, "Can't change endDateUnixUs from %s to %s", j3 == j);
        } else {
            j2 = j;
        }
        this.f = j2;
    }

    public final void f(long j) {
        long j2;
        if (j == -9223372036854775807L) {
            return;
        }
        long j3 = this.h;
        if (j3 != -9223372036854775807L) {
            j2 = j;
            lvb.M(j3, j2, "Can't change plannedDurationUs from %s to %s", j3 == j);
        } else {
            j2 = j;
        }
        this.h = j2;
    }

    public final void g(long j) {
        long j2;
        if (j == -9223372036854775807L) {
            return;
        }
        long j3 = this.l;
        if (j3 != -9223372036854775807L) {
            j2 = j;
            lvb.M(j3, j2, "Can't change playoutLimitUs from %s to %s", j3 == j);
        } else {
            j2 = j;
        }
        this.l = j2;
    }

    public final void h(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (!this.n.isEmpty()) {
            lvb.O("Can't change restrictions from " + String.join(", ", this.n) + " to " + String.join(", ", arrayList), this.n.equals(arrayList));
        }
        this.n = arrayList;
    }

    public final void i(long j) {
        long j2;
        if (j == -9223372036854775807L) {
            return;
        }
        long j3 = this.k;
        if (j3 != -9223372036854775807L) {
            j2 = j;
            lvb.M(j3, j2, "Can't change resumeOffsetUs from %s to %s", j3 == j);
        } else {
            j2 = j;
        }
        this.k = j2;
    }

    public final void j(long j) {
        long j2;
        if (j == -9223372036854775807L) {
            return;
        }
        long j3 = this.s;
        if (j3 != -9223372036854775807L) {
            j2 = j;
            lvb.M(j3, j2, "Can't change skipControlDurationUs from %s to %s", j3 == j);
        } else {
            j2 = j;
        }
        this.s = j2;
    }

    public final void k(long j) {
        long j2;
        if (j == -9223372036854775807L) {
            return;
        }
        long j3 = this.r;
        if (j3 != -9223372036854775807L) {
            j2 = j;
            lvb.M(j3, j2, "Can't change skipControlOffsetUs from %s to %s", j3 == j);
        } else {
            j2 = j;
        }
        this.r = j2;
    }

    public final void l(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (!this.m.isEmpty()) {
            lvb.O("Can't change snapTypes from " + String.join(", ", this.m) + " to " + String.join(", ", arrayList), this.m.equals(arrayList));
        }
        this.m = arrayList;
    }

    public final void m(long j) {
        long j2;
        if (j == -9223372036854775807L) {
            return;
        }
        long j3 = this.e;
        if (j3 != -9223372036854775807L) {
            j2 = j;
            lvb.M(j3, j2, "Can't change startDateUnixUs from %s to %s", j3 == j);
        } else {
            j2 = j;
        }
        this.e = j2;
    }
}
