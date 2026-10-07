package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class qa0 {
    public boolean a;
    public boolean b;
    public boolean c;
    public int d = 0;

    public final ra0 a() {
        if (this.a || !(this.b || this.c)) {
            return new ra0(this);
        }
        ore.k("Secondary offload attribute fields are true but primary isFormatSupportedForOffload is false");
        return null;
    }

    public final void b(int i) {
        this.d = i;
    }

    public final void c(boolean z) {
        this.a = z;
    }

    public final void d(boolean z) {
        this.b = z;
    }

    public final void e(boolean z) {
        this.c = z;
    }
}
