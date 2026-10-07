package defpackage;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class ptj implements Closeable {
    public final y41 a;
    public final l9e b;
    public final boolean c;
    public final boolean d;
    public boolean e;
    public int f;
    public long g;
    public boolean h;
    public boolean i;
    public boolean j;
    public tfa m;
    public final l31 k = new l31();
    public final l31 l = new l31();
    public final byte[] n = null;

    public ptj(y41 y41Var, l9e l9eVar, boolean z, boolean z2) {
        this.a = y41Var;
        this.b = l9eVar;
        this.c = z;
        this.d = z2;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        tfa tfaVar = this.m;
        if (tfaVar != null) {
            tfaVar.close();
        }
    }

    public final void l() throws ProtocolException, EOFException {
        String strP;
        short s;
        ptj ptjVar;
        qtj qtjVar;
        String strH;
        long j = this.g;
        if (j > 0) {
            this.a.q0(j, this.k);
        }
        switch (this.f) {
            case 8:
                l31 l31Var = this.k;
                long j2 = l31Var.b;
                if (j2 == 1) {
                    throw new ProtocolException("Malformed close payload length of 1.");
                }
                b9e b9eVar = null;
                if (j2 != 0) {
                    s = l31Var.readShort();
                    strP = this.k.P();
                    if (s < 1000 || s >= 5000) {
                        strH = zo5.h(s, "Code must be in range [1000,5000): ");
                    } else {
                        strH = ((1004 > s || s >= 1007) && (1015 > s || s >= 3000)) ? null : c0a.k(s, "Code ", " is reserved and may not be used.");
                    }
                    if (strH != null) {
                        throw new ProtocolException(strH);
                    }
                } else {
                    strP = "";
                    s = 1005;
                }
                l9e l9eVar = this.b;
                if (s == -1) {
                    l9eVar.getClass();
                    ore.p("Failed requirement.");
                    return;
                }
                synchronized (l9eVar) {
                    if (l9eVar.s != -1) {
                        throw new IllegalStateException("already closed");
                    }
                    l9eVar.s = s;
                    l9eVar.t = strP;
                    if (l9eVar.r && l9eVar.p.isEmpty()) {
                        b9e b9eVar2 = l9eVar.n;
                        l9eVar.n = null;
                        ptjVar = l9eVar.j;
                        l9eVar.j = null;
                        qtjVar = l9eVar.k;
                        l9eVar.k = null;
                        l9eVar.l.e();
                        b9eVar = b9eVar2;
                    } else {
                        ptjVar = null;
                        qtjVar = null;
                    }
                }
                try {
                    l9eVar.b.onClosing(l9eVar, s, strP);
                    if (b9eVar != null) {
                        l9eVar.b.onClosed(l9eVar, s, strP);
                        break;
                    }
                    if (b9eVar != null) {
                        uqi.d(b9eVar);
                    }
                    if (ptjVar != null) {
                        uqi.d(ptjVar);
                    }
                    if (qtjVar != null) {
                        uqi.d(qtjVar);
                    }
                    this.e = true;
                    return;
                } catch (Throwable th) {
                    if (b9eVar != null) {
                        uqi.d(b9eVar);
                    }
                    if (ptjVar != null) {
                        uqi.d(ptjVar);
                    }
                    if (qtjVar != null) {
                        uqi.d(qtjVar);
                    }
                    throw th;
                }
            case 9:
                l9e l9eVar2 = this.b;
                l31 l31Var2 = this.k;
                d71 d71VarF0 = l31Var2.f0(l31Var2.b);
                synchronized (l9eVar2) {
                    try {
                        if (!l9eVar2.u && (!l9eVar2.r || !l9eVar2.p.isEmpty())) {
                            l9eVar2.o.add(d71VarF0);
                            l9eVar2.f();
                            return;
                        }
                        return;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            case 10:
                l9e l9eVar3 = this.b;
                l31 l31Var3 = this.k;
                l31Var3.f0(l31Var3.b);
                synchronized (l9eVar3) {
                    l9eVar3.w = false;
                }
                return;
            default:
                int i = this.f;
                byte[] bArr = uqi.a;
                throw new ProtocolException("Unknown control opcode: ".concat(Integer.toHexString(i)));
        }
    }

    public final void y() throws IOException {
        boolean z;
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        if (this.e) {
            qr7.k("closed");
            return;
        }
        y41 y41Var = this.a;
        long jH = y41Var.m().h();
        y41Var.m().b();
        try {
            byte b = y41Var.readByte();
            byte[] bArr = uqi.a;
            y41Var.m().g(jH, timeUnit);
            int i = b & 15;
            this.f = i;
            boolean z2 = (b & 128) != 0;
            this.h = z2;
            boolean z3 = (b & 8) != 0;
            this.i = z3;
            if (z3 && !z2) {
                throw new ProtocolException("Control frames must be final.");
            }
            boolean z4 = (b & 64) != 0;
            if (i == 1 || i == 2) {
                if (!z4) {
                    z = false;
                } else {
                    if (!this.c) {
                        throw new ProtocolException("Unexpected rsv1 flag");
                    }
                    z = true;
                }
                this.j = z;
            } else if (z4) {
                throw new ProtocolException("Unexpected rsv1 flag");
            }
            if ((b & 32) != 0) {
                throw new ProtocolException("Unexpected rsv2 flag");
            }
            if ((b & 16) != 0) {
                throw new ProtocolException("Unexpected rsv3 flag");
            }
            byte b2 = y41Var.readByte();
            boolean z5 = (b2 & 128) != 0;
            if (z5) {
                throw new ProtocolException("Server-sent frames must not be masked.");
            }
            long j = b2 & 127;
            this.g = j;
            if (j == 126) {
                this.g = y41Var.readShort() & 65535;
            } else if (j == 127) {
                long j2 = y41Var.readLong();
                this.g = j2;
                if (j2 < 0) {
                    throw new ProtocolException("Frame length 0x" + Long.toHexString(this.g) + " > 0x7FFFFFFFFFFFFFFF");
                }
            }
            if (this.i && this.g > 125) {
                throw new ProtocolException("Control frame must be less than 125B.");
            }
            if (z5) {
                y41Var.readFully(this.n);
            }
        } catch (Throwable th) {
            y41Var.m().g(jH, timeUnit);
            throw th;
        }
    }
}
