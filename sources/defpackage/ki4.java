package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ki4 {
    public final long a;
    public final String b;
    public final String c;
    public final String d;
    public final long e;
    public final List f;
    public final long g;
    public final long h;
    public final ii4 i;
    public final int j;
    public final ji4 k;
    public final int l;
    public final int m;
    public final String n;
    public final String o;
    public final String p;
    public final long q;
    public final long r;
    public final long s;
    public final gi4 t;
    public final int[] u;
    public final hi4 v;
    public final String w;
    public final List x;
    public final long y;
    public final ix2 z;

    public ki4(di4 di4Var) {
        this.a = di4Var.a;
        this.b = di4Var.d;
        this.c = di4Var.b;
        this.d = di4Var.c;
        this.e = di4Var.e;
        ArrayList arrayList = new ArrayList(di4Var.f);
        arrayList.removeIf(new ci4(0));
        arrayList.sort(Comparator.comparing(new ka4(2)));
        this.f = Collections.unmodifiableList(arrayList);
        this.g = di4Var.g;
        this.h = di4Var.h;
        this.i = di4Var.i;
        this.j = di4Var.j;
        this.k = di4Var.k;
        this.l = di4Var.l;
        this.m = di4Var.m;
        this.n = di4Var.n;
        this.o = di4Var.o;
        this.p = di4Var.p;
        this.q = di4Var.q;
        this.r = di4Var.r;
        this.s = di4Var.s;
        this.t = di4Var.t;
        this.u = di4Var.u;
        this.v = di4Var.v;
        this.w = di4Var.w;
        this.x = di4Var.x;
        this.y = di4Var.y;
        this.z = di4Var.z;
    }

    public final boolean a() {
        List list = this.f;
        if (list.isEmpty()) {
            return true;
        }
        return ((fi4) list.get(0)).equals(fi4.e);
    }

    public final di4 b() {
        di4 di4Var = new di4();
        di4Var.a = this.a;
        di4Var.b = this.c;
        di4Var.c = this.d;
        di4Var.d = this.b;
        di4Var.e = this.e;
        di4Var.f = new ArrayList(this.f);
        di4Var.g = this.g;
        di4Var.h = this.h;
        di4Var.i = this.i;
        di4Var.j = this.j;
        di4Var.k = this.k;
        di4Var.l = this.l;
        di4Var.m = this.m;
        di4Var.n = this.n;
        di4Var.o = this.o;
        di4Var.p = this.p;
        di4Var.q = this.q;
        di4Var.r = this.r;
        di4Var.s = this.s;
        di4Var.t = this.t;
        di4Var.u = this.u;
        di4Var.w = this.w;
        di4Var.x = this.x;
        di4Var.y = this.y;
        di4Var.z = this.z;
        return di4Var;
    }

    public final String toString() {
        boolean zC = gm0.c();
        long j = this.r;
        ji4 ji4Var = this.k;
        List list = this.f;
        ix2 ix2Var = this.z;
        String str = this.c;
        long j2 = this.a;
        if (!zC) {
            StringBuilder sb = new StringBuilder();
            sb.append(ki4.class.getSimpleName());
            sb.append("{serverId=");
            sb.append(j2);
            sb.append(",baseUrl=");
            sb.append(str);
            sb.append(",flags=");
            sb.append(ix2Var);
            sb.append(",names=");
            sb.append(list);
            sb.append(",type=");
            sb.append(ji4Var);
            return zo5.k(j, ",lastSyncTime=", "}", sb);
        }
        StringBuilder sbS = qt4.s(j2, "ContactData{serverId=", ", deviceAvatarUrl='");
        sbS.append(ch3.s(this.b));
        sbS.append("', baseUrl='");
        sbS.append(str);
        sbS.append("', baseRawUrl='");
        sbS.append(this.d);
        sbS.append("', photoId=");
        sbS.append(this.e);
        sbS.append(", names=");
        sbS.append(list);
        sbS.append(", lastUpdateTime=");
        sbS.append(this.g);
        sbS.append(", serverPhone=");
        sbS.append(this.h);
        sbS.append(", country=");
        sbS.append(this.w);
        sbS.append(", status=");
        sbS.append(this.i);
        sbS.append(", type=");
        sbS.append(ji4Var);
        sbS.append(", gender=");
        sbS.append(tt2.m(this.l));
        sbS.append(", settings=");
        sbS.append(this.m);
        sbS.append(", flags=");
        sbS.append(ix2Var);
        sbS.append(", description='");
        sbS.append(this.n);
        sbS.append("', link='");
        sbS.append(this.o);
        sbS.append("', birthday='");
        sbS.append(this.p);
        sbS.append("', lastSearchClickTime=");
        sbS.append(this.q);
        qt4.z(j, ", lastSyncTime=", ", lastShowingUnknownContactBar=", sbS);
        sbS.append(this.s);
        sbS.append("', menuButton=");
        sbS.append(this.t);
        sbS.append(", profileOptions=");
        sbS.append(this.u);
        sbS.append(", organizationIds=");
        sbS.append(this.x);
        sbS.append(", registrationTime=");
        return zo5.u(sbS, this.y, '}');
    }
}
