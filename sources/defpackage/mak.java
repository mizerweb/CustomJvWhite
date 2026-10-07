package defpackage;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Consumer;
import one.video.calls.sdk_private.bJ;

/* JADX INFO: loaded from: classes3.dex */
public final class mak {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public long e;
    public int j;
    public final ConcurrentHashMap i = new ConcurrentHashMap();
    public long f = 0;
    public final HashMap g = new HashMap();
    public final HashMap h = new HashMap();

    public mak(long j, long j2, long j3, long j4, ku8 ku8Var) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j;
    }

    public final void a(k5k k5kVar) {
        synchronized (this) {
            try {
                int i = k5kVar.b;
                long j = k5kVar.c;
                if (this.g.containsKey(Integer.valueOf(i))) {
                    if (j > ((Long) this.g.get(Integer.valueOf(i))).longValue()) {
                        boolean z = ((Long) this.h.get(Integer.valueOf(i))).longValue() == ((Long) this.g.get(Integer.valueOf(i))).longValue() && this.f != this.e;
                        this.g.put(Integer.valueOf(i), Long.valueOf(j));
                        if (z) {
                            ebk ebkVar = (ebk) this.i.get(Integer.valueOf(i));
                            pak pakVar = ebkVar.a;
                            Objects.toString(pakVar);
                            pakVar.b.k(new bbk(ebkVar, 3), 20, ebkVar.E(), new cbk(ebkVar, 3), false);
                        }
                    }
                } else if (i % 2 == 0 && i > this.j) {
                    throw new bJ(6);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized void b(final c8k c8kVar) {
        try {
            long j = c8kVar.c;
            if (j > this.a && j > this.e) {
                this.e = j;
            }
            final int i = 0;
            if (c8kVar.d > this.b) {
                this.g.entrySet().stream().filter(new e05(29)).forEach(new Consumer(this) { // from class: kak
                    public final /* synthetic */ mak b;

                    {
                        this.b = this;
                    }

                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                        int i2 = i;
                        c8k c8kVar2 = c8kVar;
                        mak makVar = this.b;
                        Map.Entry entry = (Map.Entry) obj;
                        makVar.getClass();
                        switch (i2) {
                            case 0:
                                if (c8kVar2.d > ((Long) entry.getValue()).longValue()) {
                                    makVar.g.put((Integer) entry.getKey(), Long.valueOf(c8kVar2.d));
                                }
                                break;
                            case 1:
                                if (c8kVar2.e > ((Long) entry.getValue()).longValue()) {
                                    makVar.g.put((Integer) entry.getKey(), Long.valueOf(c8kVar2.e));
                                }
                                break;
                            default:
                                if (c8kVar2.f > ((Long) entry.getValue()).longValue()) {
                                    makVar.g.put((Integer) entry.getKey(), Long.valueOf(c8kVar2.f));
                                }
                                break;
                        }
                    }
                });
            }
            final int i2 = 1;
            if (c8kVar.e > this.c) {
                this.g.entrySet().stream().filter(new lak(0)).forEach(new Consumer(this) { // from class: kak
                    public final /* synthetic */ mak b;

                    {
                        this.b = this;
                    }

                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                        int i3 = i2;
                        c8k c8kVar2 = c8kVar;
                        mak makVar = this.b;
                        Map.Entry entry = (Map.Entry) obj;
                        makVar.getClass();
                        switch (i3) {
                            case 0:
                                if (c8kVar2.d > ((Long) entry.getValue()).longValue()) {
                                    makVar.g.put((Integer) entry.getKey(), Long.valueOf(c8kVar2.d));
                                }
                                break;
                            case 1:
                                if (c8kVar2.e > ((Long) entry.getValue()).longValue()) {
                                    makVar.g.put((Integer) entry.getKey(), Long.valueOf(c8kVar2.e));
                                }
                                break;
                            default:
                                if (c8kVar2.f > ((Long) entry.getValue()).longValue()) {
                                    makVar.g.put((Integer) entry.getKey(), Long.valueOf(c8kVar2.f));
                                }
                                break;
                        }
                    }
                });
            }
            if (c8kVar.f > this.d) {
                final int i3 = 2;
                this.g.entrySet().stream().filter(new lak(1)).forEach(new Consumer(this) { // from class: kak
                    public final /* synthetic */ mak b;

                    {
                        this.b = this;
                    }

                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                        int i4 = i3;
                        c8k c8kVar2 = c8kVar;
                        mak makVar = this.b;
                        Map.Entry entry = (Map.Entry) obj;
                        makVar.getClass();
                        switch (i4) {
                            case 0:
                                if (c8kVar2.d > ((Long) entry.getValue()).longValue()) {
                                    makVar.g.put((Integer) entry.getKey(), Long.valueOf(c8kVar2.d));
                                }
                                break;
                            case 1:
                                if (c8kVar2.e > ((Long) entry.getValue()).longValue()) {
                                    makVar.g.put((Integer) entry.getKey(), Long.valueOf(c8kVar2.e));
                                }
                                break;
                            default:
                                if (c8kVar2.f > ((Long) entry.getValue()).longValue()) {
                                    makVar.g.put((Integer) entry.getKey(), Long.valueOf(c8kVar2.f));
                                }
                                break;
                        }
                    }
                });
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final long c(pak pakVar) {
        int i = pakVar.a;
        long jLongValue = ((Long) this.g.get(Integer.valueOf(i))).longValue() - ((Long) this.h.get(Integer.valueOf(i))).longValue();
        long j = this.e - this.f;
        return jLongValue > j ? j : jLongValue;
    }
}
