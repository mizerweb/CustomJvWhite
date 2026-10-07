package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class s8e implements x41 {
    public final kag a;
    public final l31 b = new l31();
    public boolean c;

    public s8e(kag kagVar) {
        this.a = kagVar;
    }

    @Override // defpackage.x41
    public final x41 A0(long j) {
        if (this.c) {
            ore.k("closed");
            return null;
        }
        this.b.u0(j);
        l();
        return this;
    }

    @Override // defpackage.x41
    public final x41 L(String str) {
        if (this.c) {
            ore.k("closed");
            return null;
        }
        this.b.z0(0, str.length(), str);
        l();
        return this;
    }

    @Override // defpackage.x41
    public final x41 N(d71 d71Var) {
        if (this.c) {
            ore.k("closed");
            return null;
        }
        this.b.o0(d71Var);
        l();
        return this;
    }

    @Override // defpackage.kag
    public final void X(long j, l31 l31Var) {
        if (this.c) {
            ore.k("closed");
        } else {
            this.b.X(j, l31Var);
            l();
        }
    }

    @Override // defpackage.kag, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        kag kagVar = this.a;
        if (this.c) {
            return;
        }
        l31 l31Var = this.b;
        long j = l31Var.b;
        if (j > 0) {
            kagVar.X(j, l31Var);
        }
        th = null;
        try {
            kagVar.close();
        } catch (Throwable th) {
            if (th == null) {
                th = th;
            }
        }
        this.c = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // defpackage.x41, defpackage.kag, java.io.Flushable
    public final void flush() {
        if (this.c) {
            ore.k("closed");
            return;
        }
        l31 l31Var = this.b;
        long j = l31Var.b;
        kag kagVar = this.a;
        if (j > 0) {
            kagVar.X(j, l31Var);
        }
        kagVar.flush();
    }

    @Override // defpackage.x41
    public final l31 getBuffer() {
        return this.b;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.c;
    }

    public final x41 l() {
        if (this.c) {
            ore.k("closed");
            return null;
        }
        l31 l31Var = this.b;
        long j = l31Var.b;
        if (j == 0) {
            j = 0;
        } else {
            fcf fcfVar = l31Var.a.g;
            int i = fcfVar.c;
            if (i < 8192 && fcfVar.e) {
                j -= (long) (i - fcfVar.b);
            }
        }
        if (j > 0) {
            this.a.X(j, l31Var);
        }
        return this;
    }

    @Override // defpackage.kag
    public final xsh m() {
        return this.a.m();
    }

    public final String toString() {
        return "buffer(" + this.a + ')';
    }

    @Override // defpackage.x41
    public final x41 w() {
        if (this.c) {
            ore.k("closed");
            return null;
        }
        l31 l31Var = this.b;
        long j = l31Var.b;
        if (j > 0) {
            this.a.X(j, l31Var);
        }
        return this;
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        if (this.c) {
            ore.k("closed");
            return 0;
        }
        int iWrite = this.b.write(byteBuffer);
        l();
        return iWrite;
    }

    @Override // defpackage.x41
    public final x41 writeByte(int i) {
        if (this.c) {
            ore.k("closed");
            return null;
        }
        this.b.t0(i);
        l();
        return this;
    }

    @Override // defpackage.x41
    public final x41 writeInt(int i) {
        if (this.c) {
            ore.k("closed");
            return null;
        }
        this.b.v0(i);
        l();
        return this;
    }

    @Override // defpackage.x41
    public final x41 writeShort(int i) {
        if (this.c) {
            ore.k("closed");
            return null;
        }
        this.b.x0(i);
        l();
        return this;
    }

    @Override // defpackage.x41
    public final x41 write(byte[] bArr) {
        if (!this.c) {
            this.b.k0(bArr.length, bArr);
            l();
            return this;
        }
        ore.k("closed");
        return null;
    }
}
