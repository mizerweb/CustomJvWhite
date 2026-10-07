package defpackage;

import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class ry9 {
    public static final ry9 g;
    public static final String h;
    public static final String i;
    public static final String j;
    public static final String k;
    public static final String l;
    public static final String m;
    public final String a;
    public final jy9 b;
    public final iy9 c;
    public final b0a d;
    public final dy9 e;
    public final ly9 f;

    static {
        by9 by9Var = new by9();
        a98 a98Var = c98.b;
        ghe gheVar = ghe.e;
        List list = Collections.EMPTY_LIST;
        ghe gheVar2 = ghe.e;
        hy9 hy9Var = new hy9();
        g = new ry9("", new dy9(by9Var), null, new iy9(hy9Var), b0a.K, ly9.d);
        h = Integer.toString(0, 36);
        i = Integer.toString(1, 36);
        j = Integer.toString(2, 36);
        k = Integer.toString(3, 36);
        l = Integer.toString(4, 36);
        m = Integer.toString(5, 36);
    }

    public ry9(String str, dy9 dy9Var, jy9 jy9Var, iy9 iy9Var, b0a b0aVar, ly9 ly9Var) {
        this.a = str;
        this.b = jy9Var;
        this.c = iy9Var;
        this.d = b0aVar;
        this.e = dy9Var;
        this.f = ly9Var;
    }

    public static ry9 b(Bundle bundle) {
        dy9 dy9Var;
        ly9 ly9Var;
        ghe gheVarA;
        ghe gheVarA2;
        jy9 jy9Var;
        String string = bundle.getString(h, "");
        string.getClass();
        Bundle bundle2 = bundle.getBundle(i);
        iy9 iy9VarB = bundle2 == null ? iy9.f : iy9.b(bundle2);
        Bundle bundle3 = bundle.getBundle(j);
        b0a b0aVarB = bundle3 == null ? b0a.K : b0a.b(bundle3);
        Bundle bundle4 = bundle.getBundle(k);
        if (bundle4 == null) {
            dy9Var = dy9.r;
        } else {
            by9 by9Var = new by9();
            String str = cy9.j;
            cy9 cy9Var = cy9.i;
            long j2 = cy9Var.a;
            long j3 = cy9Var.d;
            long j4 = cy9Var.b;
            by9Var.b(vqi.X(bundle4.getLong(str, j2)));
            by9Var.a(vqi.X(bundle4.getLong(cy9.k, cy9Var.c)));
            by9Var.c = bundle4.getBoolean(cy9.l, cy9Var.e);
            by9Var.d = bundle4.getBoolean(cy9.m, cy9Var.f);
            by9Var.e = bundle4.getBoolean(cy9.n, cy9Var.g);
            by9Var.f = bundle4.getBoolean(cy9.q, cy9Var.h);
            long j5 = bundle4.getLong(cy9.o, j4);
            if (j5 != j4) {
                by9Var.b(j5);
            }
            long j6 = bundle4.getLong(cy9.p, j3);
            if (j6 != j3) {
                by9Var.a(j6);
            }
            dy9Var = new dy9(by9Var);
        }
        dy9 dy9Var2 = dy9Var;
        Bundle bundle5 = bundle.getBundle(l);
        if (bundle5 == null) {
            ly9Var = ly9.d;
        } else {
            u50 u50Var = new u50();
            u50Var.a = (Uri) bundle5.getParcelable(ly9.e);
            u50Var.c = bundle5.getString(ly9.f);
            u50Var.b = vqi.n(bundle5.getBundle(ly9.g));
            ly9Var = new ly9(u50Var);
        }
        ly9 ly9Var2 = ly9Var;
        Bundle bundle6 = bundle.getBundle(m);
        if (bundle6 == null) {
            jy9Var = null;
        } else {
            Bundle bundle7 = bundle6.getBundle(jy9.k);
            gy9 gy9VarB = bundle7 == null ? null : gy9.b(bundle7);
            Bundle bundle8 = bundle6.getBundle(jy9.l);
            zx9 zx9VarA = bundle8 != null ? zx9.a(bundle8) : null;
            ArrayList parcelableArrayList = bundle6.getParcelableArrayList(jy9.m);
            if (parcelableArrayList == null) {
                a98 a98Var = c98.b;
                gheVarA = ghe.e;
            } else {
                gheVarA = l51.a(new ch9(11), parcelableArrayList);
            }
            ghe gheVar = gheVarA;
            ArrayList parcelableArrayList2 = bundle6.getParcelableArrayList(jy9.o);
            if (parcelableArrayList2 == null) {
                a98 a98Var2 = c98.b;
                gheVarA2 = ghe.e;
            } else {
                gheVarA2 = l51.a(new ch9(12), parcelableArrayList2);
            }
            ghe gheVar2 = gheVarA2;
            long j7 = bundle6.getLong(jy9.p, -9223372036854775807L);
            Uri uri = (Uri) bundle6.getParcelable(jy9.i);
            uri.getClass();
            jy9Var = new jy9(uri, bundle6.getString(jy9.j), gy9VarB, zx9VarA, gheVar, bundle6.getString(jy9.n), gheVar2, j7);
        }
        return new ry9(string, dy9Var2, jy9Var, iy9VarB, b0aVarB, ly9Var2);
    }

    public static ry9 c(Uri uri) {
        jy9 jy9Var;
        by9 by9Var = new by9();
        fy9 fy9Var = new fy9();
        List list = Collections.EMPTY_LIST;
        ghe gheVar = ghe.e;
        hy9 hy9Var = new hy9();
        ly9 ly9Var = ly9.d;
        lvb.b0(fy9Var.b == null || fy9Var.a != null);
        gy9 gy9Var = null;
        if (uri != null) {
            if (fy9Var.a != null) {
                gy9Var = new gy9(fy9Var);
            }
            jy9Var = new jy9(uri, null, gy9Var, null, list, null, gheVar, -9223372036854775807L);
        } else {
            jy9Var = null;
        }
        return new ry9("", new dy9(by9Var), jy9Var, new iy9(hy9Var), b0a.K, ly9Var);
    }

    public final ay9 a() {
        ay9 ay9Var = new ay9();
        ay9Var.d = this.e.a();
        ay9Var.a = this.a;
        ay9Var.k = this.d;
        ay9Var.l = this.c.a();
        ay9Var.m = this.f;
        jy9 jy9Var = this.b;
        if (jy9Var != null) {
            ay9Var.g = jy9Var.f;
            ay9Var.c = jy9Var.b;
            ay9Var.b = jy9Var.a;
            ay9Var.f = jy9Var.e;
            ay9Var.h = jy9Var.g;
            gy9 gy9Var = jy9Var.c;
            ay9Var.e = gy9Var != null ? gy9Var.a() : new fy9();
            ay9Var.i = jy9Var.d;
            ay9Var.j = jy9Var.h;
        }
        return ay9Var;
    }

    public final Bundle d(boolean z) {
        jy9 jy9Var;
        Bundle bundle = new Bundle();
        String str = this.a;
        if (!str.equals("")) {
            bundle.putString(h, str);
        }
        iy9 iy9Var = iy9.f;
        iy9 iy9Var2 = this.c;
        if (!iy9Var2.equals(iy9Var)) {
            bundle.putBundle(i, iy9Var2.c());
        }
        b0a b0aVar = b0a.K;
        b0a b0aVar2 = this.d;
        if (!b0aVar2.equals(b0aVar)) {
            bundle.putBundle(j, b0aVar2.c());
        }
        cy9 cy9Var = cy9.i;
        dy9 dy9Var = this.e;
        if (!dy9Var.equals(cy9Var)) {
            Bundle bundle2 = new Bundle();
            long j2 = dy9Var.a;
            if (j2 != cy9Var.a) {
                bundle2.putLong(cy9.j, j2);
            }
            long j3 = dy9Var.c;
            if (j3 != cy9Var.c) {
                bundle2.putLong(cy9.k, j3);
            }
            long j4 = dy9Var.b;
            if (j4 != cy9Var.b) {
                bundle2.putLong(cy9.o, j4);
            }
            long j5 = dy9Var.d;
            if (j5 != cy9Var.d) {
                bundle2.putLong(cy9.p, j5);
            }
            boolean z2 = dy9Var.e;
            if (z2 != cy9Var.e) {
                bundle2.putBoolean(cy9.l, z2);
            }
            boolean z3 = dy9Var.f;
            if (z3 != cy9Var.f) {
                bundle2.putBoolean(cy9.m, z3);
            }
            boolean z4 = dy9Var.g;
            if (z4 != cy9Var.g) {
                bundle2.putBoolean(cy9.n, z4);
            }
            boolean z5 = dy9Var.h;
            if (z5 != cy9Var.h) {
                bundle2.putBoolean(cy9.q, z5);
            }
            bundle.putBundle(k, bundle2);
        }
        ly9 ly9Var = ly9.d;
        ly9 ly9Var2 = this.f;
        if (!ly9Var2.equals(ly9Var)) {
            Bundle bundle3 = new Bundle();
            Uri uri = ly9Var2.a;
            if (uri != null) {
                bundle3.putParcelable(ly9.e, uri);
            }
            String str2 = ly9Var2.b;
            if (str2 != null) {
                bundle3.putString(ly9.f, str2);
            }
            Bundle bundle4 = ly9Var2.c;
            if (bundle4 != null) {
                bundle3.putBundle(ly9.g, bundle4);
            }
            bundle.putBundle(l, bundle3);
        }
        if (z && (jy9Var = this.b) != null) {
            c98 c98Var = jy9Var.g;
            List list = jy9Var.e;
            Bundle bundle5 = new Bundle();
            bundle5.putParcelable(jy9.i, jy9Var.a);
            String str3 = jy9Var.b;
            if (str3 != null) {
                bundle5.putString(jy9.j, str3);
            }
            gy9 gy9Var = jy9Var.c;
            if (gy9Var != null) {
                bundle5.putBundle(jy9.k, gy9Var.c());
            }
            zx9 zx9Var = jy9Var.d;
            if (zx9Var != null) {
                bundle5.putBundle(jy9.l, zx9Var.b());
            }
            if (!list.isEmpty()) {
                bundle5.putParcelableArrayList(jy9.m, l51.e(list, new ch9(9)));
            }
            String str4 = jy9Var.f;
            if (str4 != null) {
                bundle5.putString(jy9.n, str4);
            }
            if (!c98Var.isEmpty()) {
                bundle5.putParcelableArrayList(jy9.o, l51.e(c98Var, new ch9(10)));
            }
            long j6 = jy9Var.h;
            if (j6 != -9223372036854775807L) {
                bundle5.putLong(jy9.p, j6);
            }
            bundle.putBundle(m, bundle5);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ry9)) {
            return false;
        }
        ry9 ry9Var = (ry9) obj;
        return Objects.equals(this.a, ry9Var.a) && this.e.equals(ry9Var.e) && Objects.equals(this.b, ry9Var.b) && Objects.equals(this.c, ry9Var.c) && Objects.equals(this.d, ry9Var.d) && Objects.equals(this.f, ry9Var.f);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        jy9 jy9Var = this.b;
        return this.f.hashCode() + ((this.d.hashCode() + ((this.e.hashCode() + ((this.c.hashCode() + ((iHashCode + (jy9Var != null ? jy9Var.hashCode() : 0)) * 31)) * 31)) * 31)) * 31);
    }
}
