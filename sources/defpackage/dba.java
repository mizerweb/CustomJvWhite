package defpackage;

import com.facebook.imagepipeline.memory.MemoryPooledByteBufferOutputStream$InvalidStreamException;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes.dex */
public final class dba extends OutputStream {
    public final waa a;
    public g95 b;
    public int c;

    public dba(waa waaVar, int i) {
        if (i <= 0) {
            ore.k("Check failed.");
            throw null;
        }
        this.a = waaVar;
        this.c = 0;
        this.b = au3.k0(waaVar.get(i), waaVar, au3.f);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        au3.E(this.b);
        this.b = null;
        this.c = -1;
        l();
    }

    public final void l() throws Throwable {
        try {
            super.close();
        } catch (IOException e) {
            ayl.b(e);
            throw null;
        }
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        if (i < 0 || i2 < 0 || i + i2 > bArr.length) {
            StringBuilder sbP = qv1.p("length=", bArr.length, "; regionStart=", i, "; regionLength=");
            sbP.append(i2);
            throw new ArrayIndexOutOfBoundsException(sbP.toString());
        }
        if (!au3.W(this.b)) {
            throw new MemoryPooledByteBufferOutputStream$InvalidStreamException();
        }
        int i3 = this.c + i2;
        if (!au3.W(this.b)) {
            throw new MemoryPooledByteBufferOutputStream$InvalidStreamException();
        }
        g95 g95Var = this.b;
        if (g95Var == null) {
            ore.k("Required value was null.");
            return;
        }
        if (i3 > ((vaa) g95Var.K()).getSize()) {
            waa waaVar = this.a;
            vaa vaaVar = (vaa) waaVar.get(i3);
            g95 g95Var2 = this.b;
            if (g95Var2 == null) {
                ore.k("Required value was null.");
                return;
            } else {
                ((vaa) g95Var2.K()).E(vaaVar, this.c);
                this.b.close();
                this.b = au3.k0(vaaVar, waaVar, au3.f);
            }
        }
        g95 g95Var3 = this.b;
        if (g95Var3 == null) {
            ore.k("Required value was null.");
        } else {
            ((vaa) g95Var3.K()).A(this.c, i, i2, bArr);
            this.c += i2;
        }
    }

    public final cba y() {
        if (!au3.W(this.b)) {
            throw new MemoryPooledByteBufferOutputStream$InvalidStreamException();
        }
        g95 g95Var = this.b;
        if (g95Var != null) {
            return new cba(g95Var, this.c);
        }
        ore.k("Required value was null.");
        return null;
    }

    public dba(waa waaVar) {
        this(waaVar, waaVar.j[0]);
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        write(new byte[]{(byte) i});
    }
}
