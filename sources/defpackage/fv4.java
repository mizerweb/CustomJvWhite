package defpackage;

import ru.ok.tracer.minidump.Minidump;

/* JADX INFO: loaded from: classes.dex */
public final class fv4 implements vwh {
    public final boolean a;
    public final boolean b;
    public final int c;
    public final int d;

    public fv4(a8g a8gVar) {
        boolean z;
        try {
            Minidump minidump = Minidump.c;
            z = true;
        } catch (Throwable unused) {
            z = false;
        }
        this.a = z;
        this.b = true;
        this.c = 10;
        this.d = 65536;
    }

    @Override // defpackage.vwh
    public final ste a() {
        return gm0.c;
    }
}
