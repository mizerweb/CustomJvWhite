package defpackage;

import android.net.Uri;
import androidx.media3.datasource.DataSourceException;
import androidx.media3.datasource.cache.Cache$CacheException;
import java.io.InterruptedIOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import ru.ok.android.onelog.impl.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public final class k71 implements u25 {
    public final j6g a;
    public final u25 b;
    public final hlh c;
    public final u25 d;
    public final w71 e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public Uri i;
    public a35 j;
    public a35 k;
    public u25 l;
    public long m;
    public long n;
    public long o;
    public m6g p;
    public boolean q;
    public boolean r;
    public long s;
    public long t;

    public k71(j6g j6gVar, u25 u25Var, u25 u25Var2, i71 i71Var, w71 w71Var, int i, int i2, mhl mhlVar) {
        this.a = j6gVar;
        this.b = u25Var2;
        this.e = w71Var == null ? w71.O : w71Var;
        this.f = (i & 1) != 0;
        this.g = (i & 2) != 0;
        this.h = (i & 4) != 0;
        if (u25Var != null) {
            this.d = u25Var;
            this.c = i71Var != null ? new hlh(u25Var, i71Var) : null;
        } else {
            this.d = b2d.a;
            this.c = null;
        }
    }

    public final void a() {
        j6g j6gVar = this.a;
        u25 u25Var = this.l;
        if (u25Var == null) {
            return;
        }
        try {
            u25Var.close();
        } finally {
            this.k = null;
            this.l = null;
            m6g m6gVar = this.p;
            if (m6gVar != null) {
                j6gVar.m(m6gVar);
                this.p = null;
            }
        }
    }

    public final void b(a35 a35Var, boolean z) throws InterruptedIOException {
        m6g m6gVarQ;
        long j;
        a35 a35VarA;
        u25 u25Var;
        String str = a35Var.h;
        String str2 = vqi.a;
        if (this.r) {
            m6gVarQ = null;
        } else {
            boolean z2 = this.f;
            j6g j6gVar = this.a;
            long j2 = this.n;
            if (z2) {
                try {
                    long j3 = this.o;
                    synchronized (j6gVar) {
                        lvb.b0(!j6gVar.j);
                        j6gVar.d();
                        while (true) {
                            m6gVarQ = j6gVar.q(j2, j3, str);
                            if (m6gVarQ != null) {
                                break;
                            } else {
                                j6gVar.wait();
                            }
                        }
                    }
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    throw new InterruptedIOException();
                }
            } else {
                m6gVarQ = j6gVar.q(j2, this.o, str);
            }
        }
        if (m6gVarQ == null) {
            u25Var = this.d;
            z25 z25VarA = a35Var.a();
            z25VarA.f = this.n;
            z25VarA.g = this.o;
            a35VarA = z25VarA.a();
            j = -1;
        } else if (m6gVarQ.d) {
            Uri uriFromFile = Uri.fromFile(m6gVarQ.e);
            long j4 = m6gVarQ.b;
            long j5 = this.n - j4;
            long jMin = m6gVarQ.c - j5;
            j = -1;
            long j6 = this.o;
            if (j6 != -1) {
                jMin = Math.min(jMin, j6);
            }
            z25 z25VarA2 = a35Var.a();
            z25VarA2.a = uriFromFile;
            z25VarA2.b = j4;
            z25VarA2.f = j5;
            z25VarA2.g = jMin;
            a35VarA = z25VarA2.a();
            u25Var = this.b;
        } else {
            j = -1;
            long jMin2 = m6gVarQ.c;
            long j7 = this.o;
            if (jMin2 == -1) {
                jMin2 = j7;
            } else if (j7 != -1) {
                jMin2 = Math.min(jMin2, j7);
            }
            z25 z25VarA3 = a35Var.a();
            z25VarA3.f = this.n;
            z25VarA3.g = jMin2;
            a35VarA = z25VarA3.a();
            u25Var = this.c;
            if (u25Var == null) {
                u25Var = this.d;
                this.a.m(m6gVarQ);
                m6gVarQ = null;
            }
        }
        this.t = (this.r || u25Var != this.d) ? BuildConfig.MAX_TIME_TO_UPLOAD : this.n + 102400;
        if (z) {
            lvb.b0(this.l == this.d);
            if (u25Var == this.d) {
                return;
            }
            try {
                a();
            } catch (Throwable th) {
                if (!m6gVarQ.d) {
                    this.a.m(m6gVarQ);
                }
                throw th;
            }
        }
        if (m6gVarQ != null && !m6gVarQ.d) {
            this.p = m6gVarQ;
        }
        this.l = u25Var;
        this.k = a35VarA;
        this.m = 0L;
        long jF = u25Var.f(a35VarA);
        xp9 xp9Var = new xp9(12);
        if (a35VarA.g == j && jF != j) {
            this.o = jF;
            xp9Var.L(Long.valueOf(this.n + jF), "exo_len");
        }
        if (!(this.l == this.b)) {
            Uri uri = u25Var.getUri();
            this.i = uri;
            Uri uri2 = a35Var.a.equals(uri) ? null : this.i;
            if (uri2 == null) {
                ((ArrayList) xp9Var.c).add("exo_redir");
                ((HashMap) xp9Var.b).remove("exo_redir");
            } else {
                xp9Var.L(uri2.toString(), "exo_redir");
            }
        }
        if (this.l == this.c) {
            this.a.c(str, xp9Var);
        }
    }

    @Override // defpackage.u25
    public final void close() {
        this.j = null;
        this.i = null;
        this.n = 0L;
        try {
            a();
        } catch (Throwable th) {
            if (this.l == this.b || (th instanceof Cache$CacheException)) {
                this.q = true;
            }
            throw th;
        }
    }

    @Override // defpackage.u25
    public final long f(a35 a35Var) {
        j6g j6gVar = this.a;
        try {
            String strC = this.e.c(a35Var);
            z25 z25VarA = a35Var.a();
            long j = a35Var.f;
            long j2 = a35Var.g;
            z25VarA.h = strC;
            a35 a35VarA = z25VarA.a();
            this.j = a35VarA;
            Uri uri = a35VarA.a;
            byte[] bArr = (byte[]) j6gVar.h(strC).b.get("exo_redir");
            Uri uri2 = null;
            String str = bArr != null ? new String(bArr, StandardCharsets.UTF_8) : null;
            if (str != null) {
                uri2 = Uri.parse(str);
            }
            if (uri2 != null) {
                uri = uri2;
            }
            this.i = uri;
            this.n = j;
            boolean z = (this.g && this.q) || (this.h && j2 == -1);
            this.r = z;
            if (z) {
                this.o = -1L;
            } else {
                long jA = bp4.a(j6gVar.h(strC));
                this.o = jA;
                if (jA != -1) {
                    long j3 = jA - j;
                    this.o = j3;
                    if (j3 < 0) {
                        throw new DataSourceException(2008);
                    }
                }
            }
            if (j2 != -1) {
                long j4 = this.o;
                this.o = j4 == -1 ? j2 : Math.min(j4, j2);
            }
            long j5 = this.o;
            if (j5 > 0 || j5 == -1) {
                b(a35VarA, false);
            }
            return j2 != -1 ? j2 : this.o;
        } catch (Throwable th) {
            if (this.l == this.b || (th instanceof Cache$CacheException)) {
                this.q = true;
            }
            throw th;
        }
    }

    @Override // defpackage.u25
    public final Uri getUri() {
        return this.i;
    }

    @Override // defpackage.u25
    public final Map p() {
        return !(this.l == this.b) ? this.d.p() : Collections.EMPTY_MAP;
    }

    @Override // defpackage.q25
    public final int read(byte[] bArr, int i, int i2) {
        int i3;
        long j;
        u25 u25Var = this.b;
        if (i2 == 0) {
            return 0;
        }
        if (this.o == 0) {
            return -1;
        }
        a35 a35Var = this.j;
        a35Var.getClass();
        a35 a35Var2 = this.k;
        a35Var2.getClass();
        try {
            if (this.n >= this.t) {
                b(a35Var, true);
            }
            u25 u25Var2 = this.l;
            u25Var2.getClass();
            int i4 = u25Var2.read(bArr, i, i2);
            u25 u25Var3 = this.l;
            if (i4 != -1) {
                if (u25Var3 == u25Var) {
                    this.s += (long) i4;
                }
                long j2 = i4;
                this.n += j2;
                this.m += j2;
                long j3 = this.o;
                if (j3 == -1) {
                    return i4;
                }
                this.o = j3 - j2;
                return i4;
            }
            if (!(u25Var3 == u25Var)) {
                j = -1;
                long j4 = a35Var2.g;
                if (j4 != -1) {
                    i3 = i4;
                    if (this.m < j4) {
                    }
                } else {
                    i3 = i4;
                }
                String str = a35Var.h;
                String str2 = vqi.a;
                this.o = 0L;
                if (!(u25Var3 == this.c)) {
                    return i3;
                }
                xp9 xp9Var = new xp9(12);
                xp9Var.L(Long.valueOf(this.n), "exo_len");
                this.a.c(str, xp9Var);
                return i3;
            }
            i3 = i4;
            j = -1;
            long j5 = this.o;
            if (j5 <= 0 && j5 != j) {
                return i3;
            }
            a();
            b(a35Var, false);
            return read(bArr, i, i2);
        } catch (Throwable th) {
            if (this.l == u25Var || (th instanceof Cache$CacheException)) {
                this.q = true;
            }
            throw th;
        }
    }

    @Override // defpackage.u25
    public final void w(v1i v1iVar) {
        v1iVar.getClass();
        this.b.w(v1iVar);
        this.d.w(v1iVar);
    }
}
