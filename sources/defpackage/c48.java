package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class c48 {
    public boolean a;
    public int b;
    public int c;

    public c48() {
        a();
    }

    public void a() {
        this.a = false;
        this.b = 4;
        this.c = 0;
    }

    public void b() {
        this.c = 0;
    }

    public void c(boolean z) {
        this.a = z;
    }

    public boolean d() {
        return this.a && this.c < this.b;
    }
}
