package defpackage;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class j08 extends h08 {
    public final k28 d;
    public long e;
    public boolean f;
    public final /* synthetic */ ma g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j08(ma maVar, k28 k28Var) {
        super(maVar);
        this.g = maVar;
        this.d = k28Var;
        this.e = -1L;
        this.f = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x007a, code lost:
    
        if (r9.f == false) goto L29;
     */
    @Override // defpackage.h08, defpackage.mdg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long S(long r10, defpackage.l31 r12) throws java.net.ProtocolException {
        /*
            Method dump skipped, instruction units count: 210
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j08.S(long, l31):long");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean zU;
        if (this.b) {
            return;
        }
        if (this.f) {
            try {
                zU = uqi.u(this, 100);
            } catch (IOException unused) {
                zU = false;
            }
            if (!zU) {
                ((c9e) this.g.c).k();
                l();
            }
        }
        this.b = true;
    }
}
