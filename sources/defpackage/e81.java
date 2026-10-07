package defpackage;

import java.io.InterruptedIOException;
import ru.ok.android.onelog.impl.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public final class e81 {
    public final k71 a;
    public final j6g b;
    public final a35 c;
    public final String d;
    public final byte[] e;
    public final d81 f;
    public long g;
    public long h;
    public long i;
    public volatile boolean j;

    public e81(k71 k71Var, a35 a35Var, byte[] bArr, d81 d81Var) {
        this.a = k71Var;
        this.b = k71Var.a;
        this.c = a35Var;
        this.e = bArr == null ? new byte[131072] : bArr;
        this.f = d81Var;
        this.d = k71Var.e.c(a35Var);
        this.g = a35Var.f;
    }

    public final void a() throws Exception {
        long jF;
        long j;
        long j2;
        long j3;
        if (this.j) {
            throw new InterruptedIOException();
        }
        j6g j6gVar = this.b;
        String str = this.d;
        a35 a35Var = this.c;
        this.i = j6gVar.f(a35Var.f, a35Var.g, str);
        long j4 = a35Var.g;
        long j5 = -1;
        if (j4 != -1) {
            this.h = a35Var.f + j4;
        } else {
            long jA = bp4.a(this.b.h(this.d));
            if (jA == -1) {
                jA = -1;
            }
            this.h = jA;
        }
        d81 d81Var = this.f;
        if (d81Var != null) {
            long j6 = this.h;
            d81Var.b(j6 == -1 ? -1L : j6 - this.c.f, this.i, 0L);
        }
        while (true) {
            long j7 = this.h;
            if (j7 != j5 && this.g >= j7) {
                return;
            }
            if (this.j) {
                throw new InterruptedIOException();
            }
            long j8 = this.h;
            long jG = this.b.g(this.g, j8 == j5 ? Long.MAX_VALUE : j8 - this.g, this.d);
            if (jG > 0) {
                this.g += jG;
                j = j5;
            } else {
                long j9 = -jG;
                if (j9 == BuildConfig.MAX_TIME_TO_UPLOAD) {
                    j9 = j5;
                }
                long j10 = this.g;
                k71 k71Var = this.a;
                boolean z = true;
                int i = 0;
                boolean z2 = j10 + j9 == this.h || j9 == j5;
                if (j9 != j5) {
                    z25 z25VarA = a35Var.a();
                    z25VarA.f = j10;
                    z25VarA.g = j9;
                    try {
                        jF = k71Var.f(z25VarA.a());
                    } catch (Exception unused) {
                        gz8.a(k71Var);
                        jF = j5;
                        z = false;
                    }
                } else {
                    jF = j5;
                    z = false;
                }
                if (!z) {
                    if (this.j) {
                        throw new InterruptedIOException();
                    }
                    z25 z25VarA2 = a35Var.a();
                    z25VarA2.f = j10;
                    z25VarA2.g = j5;
                    try {
                        jF = k71Var.f(z25VarA2.a());
                    } catch (Exception e) {
                        gz8.a(k71Var);
                        throw e;
                    }
                }
                if (z2 && jF != j5) {
                    long j11 = jF + j10;
                    try {
                        if (this.h != j11) {
                            this.h = j11;
                            d81 d81Var2 = this.f;
                            if (d81Var2 != null) {
                                d81Var2.b(j11 == j5 ? j5 : j11 - this.c.f, this.i, 0L);
                            }
                        }
                    } catch (Exception e2) {
                        gz8.a(k71Var);
                        throw e2;
                    }
                }
                int i2 = 0;
                int i3 = 0;
                while (i2 != -1) {
                    if (this.j) {
                        throw new InterruptedIOException();
                    }
                    byte[] bArr = this.e;
                    i2 = k71Var.read(bArr, i, bArr.length);
                    if (i2 != -1) {
                        long j12 = i2;
                        long j13 = this.i + j12;
                        this.i = j13;
                        d81 d81Var3 = this.f;
                        if (d81Var3 != null) {
                            j2 = j5;
                            long j14 = this.h;
                            if (j14 == j2) {
                                j3 = j2;
                            } else {
                                d81Var3 = d81Var3;
                                j3 = j14 - this.c.f;
                            }
                            d81Var3.b(j3, j13, j12);
                        } else {
                            j2 = j5;
                        }
                        i3 += i2;
                        j5 = j2;
                        i = 0;
                    }
                }
                j = j5;
                if (z2) {
                    long j15 = ((long) i3) + j10;
                    if (this.h != j15) {
                        this.h = j15;
                        d81 d81Var4 = this.f;
                        if (d81Var4 != null) {
                            d81Var4.b(j15 == j ? j : j15 - this.c.f, this.i, 0L);
                        }
                    }
                }
                k71Var.close();
                this.g = j10 + ((long) i3);
            }
            j5 = j;
        }
    }
}
