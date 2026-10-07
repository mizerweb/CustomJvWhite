package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
public final class v75 {
    public long a;
    public final cb0 b;
    public final xr2 c;
    public final /* synthetic */ w75 d;

    public v75(w75 w75Var, cb0 cb0Var, xr2 xr2Var, long j) {
        this.d = w75Var;
        this.b = cb0Var;
        this.a = j;
        this.c = xr2Var;
    }

    public final void a(long j, ByteBuffer byteBuffer) {
        lvb.R(j >= this.a);
        byteBuffer.position((((int) (j - this.a)) * this.b.d) + byteBuffer.position());
        this.a = j;
    }
}
