package defpackage;

import android.content.res.TypedArray;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import android.view.Surface;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes2.dex */
public final class ach implements AutoCloseable {
    public final i4h a;
    public final Provider b;
    public final fi2 c;
    public final Map d;
    public final Object e = new Object();
    public final LinkedHashMap f;
    public final LinkedHashMap g;
    public boolean h;
    public boolean i;

    public ach(i4h i4hVar, rg5 rg5Var, fi2 fi2Var, Map map) {
        this.a = i4hVar;
        this.b = rg5Var;
        this.c = fi2Var;
        this.d = map;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            ((m78) entry.getValue()).getClass();
            linkedHashMap.put(key, null);
        }
        this.f = linkedHashMap;
        this.g = new LinkedHashMap();
        this.h = true;
    }

    public final void A() throws Exception {
        List<AutoCloseable> listT1;
        boolean zIsTerminated;
        synchronized (this.e) {
            this.h = false;
            listT1 = ww3.T1(this.g.values());
            this.g.clear();
        }
        for (AutoCloseable autoCloseable : listT1) {
            if (autoCloseable instanceof AutoCloseable) {
                autoCloseable.close();
            } else if (autoCloseable instanceof ExecutorService) {
                ExecutorService executorService = (ExecutorService) autoCloseable;
                if (executorService != ForkJoinPool.commonPool() && !(zIsTerminated = executorService.isTerminated())) {
                    executorService.shutdown();
                    boolean z = false;
                    while (!zIsTerminated) {
                        try {
                            zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                        } catch (InterruptedException unused) {
                            if (!z) {
                                executorService.shutdownNow();
                                z = true;
                            }
                        }
                    }
                    if (z) {
                        Thread.currentThread().interrupt();
                    }
                }
            } else if (autoCloseable instanceof TypedArray) {
                ((TypedArray) autoCloseable).recycle();
            } else if (autoCloseable instanceof MediaMetadataRetriever) {
                ((MediaMetadataRetriever) autoCloseable).release();
            } else {
                if (!(autoCloseable instanceof MediaDrm)) {
                    ore.a();
                    return;
                }
                ((MediaDrm) autoCloseable).release();
            }
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        boolean zIsTerminated;
        synchronized (this.e) {
            if (this.i) {
                return;
            }
            this.i = true;
            this.f.clear();
            List<AutoCloseable> listT1 = ww3.T1(this.g.values());
            this.g.clear();
            for (AutoCloseable autoCloseable : listT1) {
                if (autoCloseable instanceof AutoCloseable) {
                    autoCloseable.close();
                } else if (autoCloseable instanceof ExecutorService) {
                    ExecutorService executorService = (ExecutorService) autoCloseable;
                    if (executorService != ForkJoinPool.commonPool() && !(zIsTerminated = executorService.isTerminated())) {
                        executorService.shutdown();
                        boolean z = false;
                        while (!zIsTerminated) {
                            try {
                                zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                            } catch (InterruptedException unused) {
                                if (!z) {
                                    executorService.shutdownNow();
                                    z = true;
                                }
                            }
                        }
                        if (z) {
                            Thread.currentThread().interrupt();
                        }
                    }
                } else if (autoCloseable instanceof TypedArray) {
                    ((TypedArray) autoCloseable).recycle();
                } else if (autoCloseable instanceof MediaMetadataRetriever) {
                    ((MediaMetadataRetriever) autoCloseable).release();
                } else {
                    if (!(autoCloseable instanceof MediaDrm)) {
                        ore.a();
                        return;
                    }
                    ((MediaDrm) autoCloseable).release();
                }
            }
        }
    }

    public final void l() {
        Map linkedHashMap;
        synchronized (this.e) {
            linkedHashMap = new LinkedHashMap();
            loop0: for (g4h g4hVar : this.a.c) {
                for (bi2 bi2Var : g4hVar.l) {
                    Surface surface = (Surface) this.f.get(new j4h(bi2Var.a));
                    if (surface == null) {
                        if (!(g4hVar.f != null)) {
                            linkedHashMap = s66.a;
                            break loop0;
                        }
                    } else {
                        linkedHashMap.put(new j4h(bi2Var.a), surface);
                    }
                }
            }
        }
        if (linkedHashMap.isEmpty()) {
            return;
        }
        kb2 kb2Var = (kb2) this.b.get();
        synchronized (kb2Var.p) {
            if (kb2Var.e()) {
                return;
            }
            kb2Var.z = linkedHashMap;
            zm2 zm2Var = kb2Var.y;
            if (zm2Var != null) {
                zm2Var.k(linkedHashMap);
            }
        }
    }

    public final void y() {
        synchronized (this.e) {
            try {
                if (this.i) {
                    throw new IllegalStateException("Check failed.");
                }
                for (Surface surface : this.f.values()) {
                    this.g.put(surface, this.c.a(surface));
                }
                this.h = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
