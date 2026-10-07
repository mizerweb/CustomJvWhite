package defpackage;

import android.graphics.Bitmap;
import android.os.SystemClock;
import androidx.camera.core.CameraUnavailableException;
import androidx.camera.core.InitializationException;
import androidx.camera.core.impl.CameraValidator$CameraIdListIncorrectException;
import java.net.URL;

/* JADX INFO: loaded from: classes4.dex */
public final class zg2 {
    public int a;
    public long b;
    public Object c;

    public zg2(long j, Exception exc) {
        this.b = SystemClock.elapsedRealtime() - j;
        if (exc instanceof CameraValidator$CameraIdListIncorrectException) {
            this.a = 2;
            this.c = exc;
            return;
        }
        if (!(exc instanceof InitializationException)) {
            this.a = 0;
            this.c = exc;
            return;
        }
        Throwable cause = exc.getCause();
        exc = cause != null ? cause : exc;
        this.c = exc;
        if (exc instanceof CameraUnavailableException) {
            this.a = 2;
        } else if (exc instanceof IllegalArgumentException) {
            this.a = 1;
        } else {
            this.a = 0;
        }
    }

    public long a() {
        return this.b;
    }

    public Bitmap b() {
        return (Bitmap) this.c;
    }

    public int c() {
        return this.a;
    }

    public boolean d() {
        return ((Bitmap) this.c) != null;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x001d  */
    public synchronized boolean e() {
        boolean z;
        if (this.a != 0) {
            ((yqi) this.c).a.getClass();
            if (System.currentTimeMillis() > this.b) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = true;
        }
        return z;
    }

    public synchronized void f(int i) {
        long jMin;
        if ((i >= 200 && i < 300) || i == 401 || i == 404) {
            synchronized (this) {
                this.a = 0;
            }
            return;
        }
        this.a++;
        synchronized (this) {
            if (i == 429 || (i >= 500 && i < 600)) {
                double dPow = Math.pow(2.0d, this.a);
                ((yqi) this.c).getClass();
                jMin = (long) Math.min(dPow + ((long) (Math.random() * 1000.0d)), 1800000.0d);
            } else {
                jMin = 86400000;
            }
            ((yqi) this.c).a.getClass();
            this.b = System.currentTimeMillis() + jMin;
        }
        return;
        throw th;
    }

    public void g(Bitmap bitmap) {
        this.c = bitmap;
    }

    public zg2(int i, URL url, long j) {
        this.a = i;
        this.c = url;
        this.b = j;
    }

    public zg2(int i, long j) {
        this.a = i;
        this.b = j;
    }
}
