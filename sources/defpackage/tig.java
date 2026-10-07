package defpackage;

import android.os.Environment;
import android.os.StatFs;
import android.os.SystemClock;
import java.io.File;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes.dex */
public final class tig {
    public static tig h;
    public volatile File b;
    public volatile File d;
    public long e;
    public volatile StatFs a = null;
    public volatile StatFs c = null;
    public volatile boolean g = false;
    public final ReentrantLock f = new ReentrantLock();

    public static StatFs b(StatFs statFs, File file) throws Throwable {
        if (file != null && file.exists()) {
            try {
                if (statFs == null) {
                    return new StatFs(file.getAbsolutePath());
                }
                statFs.restat(file.getAbsolutePath());
                return statFs;
            } catch (IllegalArgumentException unused) {
            } catch (Throwable th) {
                ayl.b(th);
                throw null;
            }
        }
        return null;
    }

    public final void a() {
        if (this.g) {
            return;
        }
        this.f.lock();
        try {
            if (!this.g) {
                this.b = Environment.getDataDirectory();
                this.d = Environment.getExternalStorageDirectory();
                this.a = b(this.a, this.b);
                this.c = b(this.c, this.d);
                this.e = SystemClock.uptimeMillis();
                this.g = true;
            }
        } finally {
            this.f.unlock();
        }
    }
}
