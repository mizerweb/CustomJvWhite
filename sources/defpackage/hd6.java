package defpackage;

import java.io.IOException;
import java.net.ProtocolException;

/* JADX INFO: loaded from: classes.dex */
public final class hd6 implements kag {
    public final kag a;
    public final long b;
    public boolean c;
    public long d;
    public boolean e;
    public final /* synthetic */ yf2 f;

    public hd6(yf2 yf2Var, kag kagVar, long j) {
        this.f = yf2Var;
        this.a = kagVar;
        this.b = j;
    }

    public final void A() {
        this.a.flush();
    }

    @Override // defpackage.kag
    public final void X(long j, l31 l31Var) throws IOException {
        if (this.e) {
            ore.k("closed");
            return;
        }
        long j2 = this.b;
        if (j2 != -1 && this.d + j > j2) {
            StringBuilder sbS = qt4.s(j2, "expected ", " bytes but received ");
            sbS.append(this.d + j);
            throw new ProtocolException(sbS.toString());
        }
        try {
            this.a.X(j, l31Var);
            this.d += j;
        } catch (IOException e) {
            throw y(e);
        }
    }

    @Override // defpackage.kag, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.e) {
            return;
        }
        this.e = true;
        long j = this.b;
        if (j != -1 && this.d != j) {
            throw new ProtocolException("unexpected end of stream");
        }
        try {
            l();
            y(null);
        } catch (IOException e) {
            throw y(e);
        }
    }

    @Override // defpackage.kag, java.io.Flushable
    public final void flush() throws IOException {
        try {
            A();
        } catch (IOException e) {
            throw y(e);
        }
    }

    public final void l() {
        this.a.close();
    }

    @Override // defpackage.kag
    public final xsh m() {
        return this.a.m();
    }

    public final String toString() {
        return hd6.class.getSimpleName() + '(' + this.a + ')';
    }

    public final IOException y(IOException iOException) {
        if (this.c) {
            return iOException;
        }
        this.c = true;
        return this.f.a(false, true, iOException);
    }
}
