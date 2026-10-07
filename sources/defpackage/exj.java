package defpackage;

import android.os.Build;
import android.view.View;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class exj {
    public static final ixj b;
    public final ixj a;

    static {
        xwj uwjVar;
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            uwjVar = new wwj();
        } else if (i >= 30) {
            uwjVar = new vwj();
        } else {
            uwjVar = i >= 29 ? new uwj() : new twj();
        }
        b = uwjVar.b().a.a().a.b().a.c();
    }

    public exj(ixj ixjVar) {
        this.a = ixjVar;
    }

    public ixj a() {
        return this.a;
    }

    public ixj b() {
        return this.a;
    }

    public ixj c() {
        return this.a;
    }

    public void d(View view) {
    }

    public do5 e() {
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof exj)) {
            return false;
        }
        exj exjVar = (exj) obj;
        return n() == exjVar.n() && m() == exjVar.m() && Objects.equals(j(), exjVar.j()) && Objects.equals(h(), exjVar.h()) && Objects.equals(e(), exjVar.e());
    }

    public mi8 f(int i) {
        return mi8.e;
    }

    public mi8 g() {
        return j();
    }

    public mi8 h() {
        return mi8.e;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(n()), Boolean.valueOf(m()), j(), h(), e());
    }

    public mi8 i() {
        return j();
    }

    public mi8 j() {
        return mi8.e;
    }

    public mi8 k() {
        return j();
    }

    public ixj l(int i, int i2, int i3, int i4) {
        return b;
    }

    public boolean m() {
        return false;
    }

    public boolean n() {
        return false;
    }

    public boolean o(int i) {
        return true;
    }

    public void p(mi8[] mi8VarArr) {
    }

    public void q(ixj ixjVar) {
    }

    public void r(mi8 mi8Var) {
    }

    public void s(int i) {
    }
}
