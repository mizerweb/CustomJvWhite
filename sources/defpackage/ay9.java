package defpackage;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ay9 {
    public String a;
    public Uri b;
    public String c;
    public String g;
    public zx9 i;
    public b0a k;
    public by9 d = new by9();
    public fy9 e = new fy9();
    public List f = Collections.EMPTY_LIST;
    public c98 h = ghe.e;
    public hy9 l = new hy9();
    public ly9 m = ly9.d;
    public long j = -9223372036854775807L;

    public final ry9 a() {
        jy9 jy9Var;
        fy9 fy9Var = this.e;
        lvb.b0(fy9Var.b == null || fy9Var.a != null);
        Uri uri = this.b;
        if (uri != null) {
            String str = this.c;
            fy9 fy9Var2 = this.e;
            jy9Var = new jy9(uri, str, fy9Var2.a != null ? new gy9(fy9Var2) : null, this.i, this.f, this.g, this.h, this.j);
        } else {
            jy9Var = null;
        }
        String str2 = this.a;
        if (str2 == null) {
            str2 = "";
        }
        String str3 = str2;
        by9 by9Var = this.d;
        by9Var.getClass();
        dy9 dy9Var = new dy9(by9Var);
        hy9 hy9Var = this.l;
        hy9Var.getClass();
        iy9 iy9Var = new iy9(hy9Var);
        b0a b0aVar = this.k;
        if (b0aVar == null) {
            b0aVar = b0a.K;
        }
        return new ry9(str3, dy9Var, jy9Var, iy9Var, b0aVar, this.m);
    }

    public final void b(List list) {
        this.f = (list == null || list.isEmpty()) ? Collections.EMPTY_LIST : Collections.unmodifiableList(new ArrayList(list));
    }
}
