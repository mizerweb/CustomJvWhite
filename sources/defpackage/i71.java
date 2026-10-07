package defpackage;

import androidx.media3.datasource.cache.Cache$CacheException;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes2.dex */
public final class i71 {
    public final j6g a;
    public final long b;
    public final int c;
    public a35 d;
    public long e;
    public File f;
    public OutputStream g;
    public long h;
    public long i;
    public jpe j;

    public i71(j6g j6gVar) {
        j6gVar.getClass();
        this.a = j6gVar;
        this.b = 5242880L;
        this.c = 20480;
    }

    public final void a() {
        OutputStream outputStream = this.g;
        if (outputStream == null) {
            return;
        }
        try {
            outputStream.flush();
            vqi.h(this.g);
            this.g = null;
            File file = this.f;
            this.f = null;
            j6g j6gVar = this.a;
            long j = this.h;
            synchronized (j6gVar) {
                boolean z = true;
                lvb.b0(!j6gVar.j);
                if (file.exists()) {
                    if (j == 0) {
                        file.delete();
                        return;
                    }
                    m6g m6gVarD = m6g.d(file, j, j6gVar.c);
                    m6gVarD.getClass();
                    g81 g81VarG = j6gVar.c.g(m6gVarD.a);
                    g81VarG.getClass();
                    lvb.b0(g81VarG.h(m6gVarD.b, m6gVarD.c));
                    long jA = bp4.a(g81VarG.d());
                    if (jA != -1) {
                        if (m6gVarD.b + m6gVarD.c > jA) {
                            z = false;
                        }
                        lvb.b0(z);
                    }
                    if (j6gVar.d == null) {
                        j6gVar.b(m6gVarD);
                        j6gVar.c.x();
                        j6gVar.notifyAll();
                        return;
                    }
                    try {
                        j6gVar.d.M(m6gVarD.c, m6gVarD.f, file.getName());
                        j6gVar.b(m6gVarD);
                        try {
                            j6gVar.c.x();
                            j6gVar.notifyAll();
                            return;
                        } catch (IOException e) {
                            throw new Cache$CacheException(e);
                        }
                    } catch (IOException e2) {
                        throw new Cache$CacheException(e2);
                    }
                    throw th;
                }
            }
        } catch (Throwable th) {
            vqi.h(this.g);
            this.g = null;
            File file2 = this.f;
            this.f = null;
            file2.delete();
            throw th;
        }
    }

    public final void b(a35 a35Var) {
        File fileF;
        long j = a35Var.g;
        long jMin = j != -1 ? Math.min(j - this.i, this.e) : -1L;
        j6g j6gVar = this.a;
        String str = a35Var.h;
        String str2 = vqi.a;
        long j2 = a35Var.f + this.i;
        synchronized (j6gVar) {
            try {
                lvb.b0(!j6gVar.j);
                j6gVar.d();
                g81 g81VarG = j6gVar.c.g(str);
                g81VarG.getClass();
                lvb.b0(g81VarG.h(j2, jMin));
                if (!j6gVar.a.exists()) {
                    j6g.e(j6gVar.a);
                    j6gVar.p();
                }
                j6gVar.b.d(j6gVar, str, j2, jMin);
                File file = new File(j6gVar.a, Integer.toString(j6gVar.f.nextInt(10)));
                if (!file.exists()) {
                    j6g.e(file);
                }
                fileF = m6g.f(file, g81VarG.a, j2, System.currentTimeMillis());
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f = fileF;
        FileOutputStream fileOutputStream = new FileOutputStream(this.f);
        if (this.c > 0) {
            jpe jpeVar = this.j;
            if (jpeVar == null) {
                this.j = new jpe(fileOutputStream, this.c);
            } else {
                jpeVar.b(fileOutputStream);
            }
            this.g = this.j;
        } else {
            this.g = fileOutputStream;
        }
        this.h = 0L;
    }
}
