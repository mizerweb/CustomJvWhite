package defpackage;

import android.net.Uri;

/* JADX INFO: loaded from: classes3.dex */
public final class glb {
    public String a;
    public String b;
    public boolean c;
    public boolean d;
    public Uri e;
    public long[] g;
    public boolean h;
    public boolean j;
    public boolean f = false;
    public int i = -1000;
    public boolean k = false;

    public glb a() {
        String str = this.a;
        String str2 = this.b;
        boolean z = this.c;
        boolean z2 = this.d;
        Uri uri = this.e;
        boolean z3 = this.j;
        long[] jArr = this.g;
        boolean z4 = this.h;
        int i = this.i;
        boolean z5 = this.k;
        boolean z6 = this.f;
        glb glbVar = new glb();
        glbVar.a = str;
        glbVar.b = str2;
        glbVar.c = z;
        glbVar.d = z2;
        glbVar.e = uri;
        glbVar.f = z3;
        glbVar.g = jArr;
        glbVar.h = z4;
        glbVar.i = i;
        glbVar.j = z5;
        glbVar.k = z6;
        return glbVar;
    }

    public void b() {
        this.f = true;
    }

    public void c(String str) {
        this.a = str;
    }

    public void d() {
        this.i = 2;
    }

    public void e(boolean z) {
        this.h = z;
    }

    public void f(String str) {
        this.b = str;
    }

    public void g(boolean z) {
        this.j = z;
    }

    public void h(Uri uri) {
        this.e = uri;
    }

    public void i() {
        this.k = true;
    }

    public void j(boolean z) {
        this.c = z;
    }

    public void k(boolean z) {
        this.d = z;
    }

    public void l(long[] jArr) {
        this.g = jArr;
    }
}
