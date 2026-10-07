package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: loaded from: classes.dex */
public final class l46 {
    public static final Object j = new Object();
    public static volatile l46 k;
    public final ReentrantReadWriteLock a;
    public final pw b;
    public volatile int c;
    public final Handler d;
    public final i46 e;
    public final k46 f;
    public final ou7 g;
    public final int h;
    public final va5 i;

    public l46(e77 e77Var) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.a = reentrantReadWriteLock;
        this.c = 3;
        this.f = e77Var.a;
        int i = e77Var.b;
        this.h = i;
        this.i = e77Var.c;
        this.d = new Handler(Looper.getMainLooper());
        this.b = new pw(0);
        this.g = new ou7(24);
        i46 i46Var = new i46(this);
        this.e = i46Var;
        reentrantReadWriteLock.writeLock().lock();
        if (i == 0) {
            try {
                this.c = 0;
            } catch (Throwable th) {
                this.a.writeLock().unlock();
                throw th;
            }
        }
        reentrantReadWriteLock.writeLock().unlock();
        if (b() == 0) {
            i46Var.c();
        }
    }

    public static l46 a() {
        l46 l46Var;
        synchronized (j) {
            l46Var = k;
            qyj.l("EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.", l46Var != null);
        }
        return l46Var;
    }

    public final int b() {
        this.a.readLock().lock();
        try {
            return this.c;
        } finally {
            this.a.readLock().unlock();
        }
    }

    public final void c() {
        qyj.l("Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading", this.h == 1);
        if (b() == 1) {
            return;
        }
        this.a.writeLock().lock();
        try {
            if (this.c == 0) {
                this.a.writeLock().unlock();
                return;
            }
            this.c = 0;
            this.a.writeLock().unlock();
            this.e.c();
        } catch (Throwable th) {
            this.a.writeLock().unlock();
            throw th;
        }
    }

    public final void d(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.a.writeLock().lock();
        try {
            this.c = 2;
            arrayList.addAll(this.b);
            this.b.clear();
            this.a.writeLock().unlock();
            this.d.post(new v72(arrayList, this.c, th));
        } catch (Throwable th2) {
            this.a.writeLock().unlock();
            throw th2;
        }
    }

    public final CharSequence e(int i, int i2, CharSequence charSequence) {
        qyj.l("Not initialized yet", b() == 1);
        if (i < 0) {
            ore.p("start cannot be negative");
            return null;
        }
        if (i2 < 0) {
            ore.p("end cannot be negative");
            return null;
        }
        qyj.h("start should be <= than end", i <= i2);
        if (charSequence == null) {
            return null;
        }
        qyj.h("start should be < than charSequence length", i <= charSequence.length());
        qyj.h("end should be < than charSequence length", i2 <= charSequence.length());
        return (charSequence.length() == 0 || i == i2) ? charSequence : this.e.d(charSequence, i, i2, false);
    }

    public final void f(j46 j46Var) {
        qyj.k(j46Var, "initCallback cannot be null");
        this.a.writeLock().lock();
        try {
            if (this.c == 1 || this.c == 2) {
                this.d.post(new v72(j46Var, this.c));
            } else {
                this.b.add(j46Var);
            }
        } finally {
            this.a.writeLock().unlock();
        }
    }
}
