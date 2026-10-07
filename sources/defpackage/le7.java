package defpackage;

import com.facebook.fresco.middleware.HasExtraData;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import one.me.sdk.fresco.FrescoHttpDownloadException;
import ru.ok.android.onelog.impl.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public final class le7 implements gme {
    public final ny8 b;
    public final ny8 c;
    public final ke7 e;
    public final ConcurrentHashMap f;
    public final String a = le7.class.getName();
    public final ReentrantReadWriteLock d = new ReentrantReadWriteLock();

    public le7(gue gueVar, ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3) {
        this.b = ny8Var2;
        this.c = ny8Var3;
        ke7 ke7Var = new ke7();
        ke7Var.a = 0L;
        ke7Var.b = 0L;
        ke7Var.c = 0L;
        ke7Var.d = 0L;
        ke7Var.e = 0L;
        ke7Var.f = 0L;
        ke7Var.g = BuildConfig.MAX_TIME_TO_UPLOAD;
        ke7Var.h = 0L;
        ke7Var.i = BuildConfig.MAX_TIME_TO_UPLOAD;
        ke7Var.j = 0L;
        ke7Var.k = 0L;
        ke7Var.l = 0L;
        ke7Var.m = BuildConfig.MAX_TIME_TO_UPLOAD;
        ke7Var.n = 0L;
        ke7Var.o = BuildConfig.MAX_TIME_TO_UPLOAD;
        ke7Var.p = 0L;
        ke7Var.q = 0L;
        ke7Var.r = 0L;
        this.e = ke7Var;
        this.f = new ConcurrentHashMap();
        gueVar.c(new u67(this, 1, ny8Var));
    }

    @Override // defpackage.pjd
    public final void a(es0 es0Var, String str) {
    }

    @Override // defpackage.pjd
    public final void b(es0 es0Var, String str, Throwable th, Map map) {
    }

    @Override // defpackage.pjd
    public final boolean c(es0 es0Var, String str) {
        return str.equals("NetworkFetchProducer");
    }

    @Override // defpackage.pjd
    public final void d(es0 es0Var, String str, Map map) {
        String str2;
        Long lC0;
        Long lC1;
        if (!str.equals("NetworkFetchProducer") || map == null || (str2 = (String) map.get("queue_time")) == null || (lC0 = y5h.C0(str2)) == null) {
            return;
        }
        long jLongValue = lC0.longValue();
        String str3 = (String) map.get("total_time");
        if (str3 == null || (lC1 = y5h.C0(str3)) == null) {
            return;
        }
        this.f.compute(es0Var.b, new he7(new ge7(jLongValue, lC1.longValue()), 0));
    }

    @Override // defpackage.pjd
    public final void e(es0 es0Var, String str, boolean z) {
        int i = 5;
        switch (str) {
            case "QualifiedResourceFetchProducer":
            case "LocalResourceFetchProducer":
            case "LocalFileFetchProducer":
            case "VideoThumbnailProducer":
            case "LocalAssetFetchProducer":
            case "DataFetchProducer":
            case "LocalContentUriThumbnailFetchProducer":
            case "LocalContentUriFetchProducer":
                i = 7;
                break;
            case "BitmapMemoryCacheGetProducer":
            case "BitmapMemoryCacheProducer":
            case "PostprocessedBitmapMemoryCacheProducer":
                break;
            case "EncodedMemoryCacheProducer":
                i = 4;
                break;
            case "NetworkFetchProducer":
                i = 2;
                break;
            case "DiskCacheProducer":
            case "PartialDiskCacheProducer":
                i = 3;
                break;
            default:
                i = 1;
                break;
        }
        if (i == 1 || i == 7) {
            return;
        }
        this.f.compute(es0Var.b, new he7(new ie7(i), 1));
    }

    @Override // defpackage.gme
    public final void f(es0 es0Var) {
        this.f.remove(es0Var.b);
    }

    @Override // defpackage.pjd
    public final void g(es0 es0Var) {
    }

    @Override // defpackage.gme
    public final void h(oof oofVar) {
        String host = oofVar.a.b.getHost();
        this.f.put(oofVar.b, new je7(1, host != null && ((Map) ((e5d) this.c.getValue()).g().i()).containsKey(host), null, null, 12));
    }

    @Override // defpackage.gme
    public final void i(es0 es0Var) {
        je7 je7Var = (je7) this.f.remove(es0Var.b);
        if (je7Var != null) {
            int i = je7Var.a;
            Long l = je7Var.d;
            Long l2 = je7Var.c;
            if (i == 1 || i == 7) {
                return;
            }
            ke7 ke7Var = this.e;
            ReentrantReadWriteLock reentrantReadWriteLock = this.d;
            int i2 = 0;
            if (i != 2) {
                if (i == 3 || i == 4 || i == 5 || i == 6) {
                    ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
                    int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
                    for (int i3 = 0; i3 < readHoldCount; i3++) {
                        lock.unlock();
                    }
                    ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
                    writeLock.lock();
                    try {
                        ke7Var.q++;
                        ke7Var.r++;
                        ke7Var.b++;
                        ke7Var.a++;
                        while (i2 < readHoldCount) {
                            lock.lock();
                            i2++;
                        }
                        return;
                    } finally {
                        while (i2 < readHoldCount) {
                            lock.lock();
                            i2++;
                        }
                        writeLock.unlock();
                    }
                }
                return;
            }
            ReentrantReadWriteLock.ReadLock lock2 = reentrantReadWriteLock.readLock();
            int readHoldCount2 = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
            for (int i4 = 0; i4 < readHoldCount2; i4++) {
                lock2.unlock();
            }
            ReentrantReadWriteLock.WriteLock writeLock2 = reentrantReadWriteLock.writeLock();
            writeLock2.lock();
            try {
                ke7Var.a++;
                if (je7Var.b) {
                    ke7Var.e++;
                    ke7Var.f++;
                    if (l2 != null) {
                        ke7Var.g = Math.min(ke7Var.g, l2.longValue());
                        ke7Var.h = Math.max(ke7Var.h, l2.longValue());
                    }
                    if (l != null) {
                        ke7Var.i = Math.min(ke7Var.i, l.longValue());
                        ke7Var.j = Math.max(ke7Var.j, l.longValue());
                    }
                } else {
                    ke7Var.k++;
                    ke7Var.l++;
                    if (l2 != null) {
                        ke7Var.m = Math.min(ke7Var.m, l2.longValue());
                        ke7Var.n = Math.max(ke7Var.n, l2.longValue());
                    }
                    if (l != null) {
                        ke7Var.o = Math.min(ke7Var.o, l.longValue());
                        ke7Var.p = Math.max(ke7Var.p, l.longValue());
                    }
                }
                ke7Var.c++;
            } finally {
                while (i2 < readHoldCount2) {
                    lock2.lock();
                    i2++;
                }
                writeLock2.unlock();
            }
        }
    }

    @Override // defpackage.pjd
    public final void j(es0 es0Var, String str) {
    }

    @Override // defpackage.gme
    public final void k(es0 es0Var, Throwable th) {
        je7 je7Var = (je7) this.f.remove(es0Var.b);
        ny8 ny8Var = this.b;
        String simpleName = null;
        if (je7Var == null) {
            ((y9g) ny8Var.getValue()).b("image", th != null ? th.getClass().getSimpleName() : null, p90.O(1, HasExtraData.KEY_ORIGIN));
            return;
        }
        int i = je7Var.a;
        y9g y9gVar = (y9g) ny8Var.getValue();
        boolean z = th instanceof FrescoHttpDownloadException;
        if (!z && th != null) {
            simpleName = th.getClass().getSimpleName();
        }
        long[] jArr = q1f.a;
        b9b b9bVar = new b9b();
        b9bVar.k(HasExtraData.KEY_ORIGIN, Integer.valueOf(i));
        if (z) {
            b9bVar.k("code", Integer.valueOf(((FrescoHttpDownloadException) th).a));
        }
        y9gVar.b("image", simpleName, b9bVar);
        if (i == 1 || i == 7) {
            return;
        }
        ReentrantReadWriteLock reentrantReadWriteLock = this.d;
        ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
        int i2 = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i3 = 0; i3 < readHoldCount; i3++) {
            lock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            ke7 ke7Var = this.e;
            if (i == 2) {
                if (je7Var.b) {
                    ke7Var.e++;
                } else {
                    ke7Var.k++;
                }
            }
            ke7Var.d++;
            ke7Var.a++;
        } finally {
            while (i2 < readHoldCount) {
                lock.lock();
                i2++;
            }
            writeLock.unlock();
        }
    }
}
