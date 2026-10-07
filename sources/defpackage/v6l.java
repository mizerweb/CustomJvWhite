package defpackage;

import com.google.firebase.encoders.EncodingException;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
final class v6l implements kri {
    private boolean a = false;
    private boolean b = false;
    private jp6 c;
    private final j6l d;

    public v6l(j6l j6lVar) {
        this.d = j6lVar;
    }

    private final void i() {
        if (this.a) {
            throw new EncodingException("Cannot encode a second value in the ValueEncoderContext");
        }
        this.a = true;
    }

    public final kri a(double d) throws IOException {
        i();
        this.d.o(this.c, d, this.b);
        return this;
    }

    @Override // defpackage.kri
    public final kri b(String str) throws IOException {
        i();
        this.d.q(this.c, str, this.b);
        return this;
    }

    @Override // defpackage.kri
    public final kri c(boolean z) throws IOException {
        i();
        this.d.r(this.c, z ? 1 : 0, this.b);
        return this;
    }

    public final kri d(float f) throws IOException {
        i();
        this.d.p(this.c, f, this.b);
        return this;
    }

    public final kri e(int i) throws IOException {
        i();
        this.d.r(this.c, i, this.b);
        return this;
    }

    public final kri f(long j) throws IOException {
        i();
        this.d.s(this.c, j, this.b);
        return this;
    }

    public final kri g(byte[] bArr) throws IOException {
        i();
        this.d.q(this.c, bArr, this.b);
        return this;
    }

    public final void h(jp6 jp6Var, boolean z) {
        this.a = false;
        this.c = jp6Var;
        this.b = z;
    }
}
