package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class na0 {
    public boolean a;
    public boolean b;
    public boolean c;

    public oa0 a() {
        if (this.a || !(this.b || this.c)) {
            return new oa0(this);
        }
        ore.k("Secondary offload attribute fields are true but primary isFormatSupported is false");
        return null;
    }

    public void b(boolean z) {
        this.a = z;
    }

    public void c(boolean z) {
        this.b = z;
    }

    public void d(boolean z) {
        this.c = z;
    }
}
