package defpackage;

import android.net.Uri;
import androidx.media3.datasource.cache.CacheDataSink$CacheDataSinkException;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Map;
import ru.ok.android.onelog.impl.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public final class hlh implements u25 {
    public final u25 a;
    public final i71 b;
    public boolean c;
    public long d;

    public hlh(u25 u25Var, i71 i71Var) {
        this.a = u25Var;
        i71Var.getClass();
        this.b = i71Var;
    }

    @Override // defpackage.u25
    public final void close() throws CacheDataSink$CacheDataSinkException {
        i71 i71Var = this.b;
        try {
            this.a.close();
            if (this.c) {
                this.c = false;
                if (i71Var.d == null) {
                    return;
                }
                try {
                    i71Var.a();
                } catch (IOException e) {
                    throw new CacheDataSink$CacheDataSinkException(e);
                }
            }
        } catch (Throwable th) {
            if (this.c) {
                this.c = false;
                if (i71Var.d != null) {
                    try {
                        i71Var.a();
                    } catch (IOException e2) {
                        throw new CacheDataSink$CacheDataSinkException(e2);
                    }
                }
            }
            throw th;
        }
    }

    @Override // defpackage.u25
    public final long f(a35 a35Var) throws CacheDataSink$CacheDataSinkException {
        long jF = this.a.f(a35Var);
        this.d = jF;
        if (jF == 0) {
            return 0L;
        }
        if (a35Var.g == -1 && jF != -1) {
            a35Var = a35Var.e(0L, jF);
        }
        this.c = true;
        i71 i71Var = this.b;
        i71Var.getClass();
        a35Var.h.getClass();
        if (a35Var.g == -1 && a35Var.c(2)) {
            i71Var.d = null;
        } else {
            i71Var.d = a35Var;
            i71Var.e = a35Var.c(4) ? i71Var.b : BuildConfig.MAX_TIME_TO_UPLOAD;
            i71Var.i = 0L;
            try {
                i71Var.b(a35Var);
            } catch (IOException e) {
                throw new CacheDataSink$CacheDataSinkException(e);
            }
        }
        return this.d;
    }

    @Override // defpackage.u25
    public final Uri getUri() {
        return this.a.getUri();
    }

    @Override // defpackage.u25
    public final Map p() {
        return this.a.p();
    }

    @Override // defpackage.q25
    public final int read(byte[] bArr, int i, int i2) throws CacheDataSink$CacheDataSinkException {
        if (this.d == 0) {
            return -1;
        }
        int i3 = this.a.read(bArr, i, i2);
        if (i3 > 0) {
            i71 i71Var = this.b;
            a35 a35Var = i71Var.d;
            if (a35Var != null) {
                int i4 = 0;
                while (i4 < i3) {
                    try {
                        if (i71Var.h == i71Var.e) {
                            i71Var.a();
                            i71Var.b(a35Var);
                        }
                        int iMin = (int) Math.min(i3 - i4, i71Var.e - i71Var.h);
                        OutputStream outputStream = i71Var.g;
                        String str = vqi.a;
                        outputStream.write(bArr, i + i4, iMin);
                        i4 += iMin;
                        long j = iMin;
                        i71Var.h += j;
                        i71Var.i += j;
                    } catch (IOException e) {
                        throw new CacheDataSink$CacheDataSinkException(e);
                    }
                }
            }
            long j2 = this.d;
            if (j2 != -1) {
                this.d = j2 - ((long) i3);
            }
        }
        return i3;
    }

    @Override // defpackage.u25
    public final void w(v1i v1iVar) {
        v1iVar.getClass();
        this.a.w(v1iVar);
    }
}
