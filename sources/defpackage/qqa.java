package defpackage;

import android.os.Handler;
import android.os.SystemClock;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.LinkedHashSet;
import java.util.Locale;
import one.me.messages.list.loader.MessageModel;
import ru.ok.android.onelog.impl.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public final class qqa extends afe {
    public final gu4 a;
    public final qpa b;
    public final long c;
    public final long d;
    public final int e;
    public final ny8 f;
    public final ny8 g;
    public RecyclerView h;
    public int i;
    public LinkedHashSet j = new LinkedHashSet();
    public sgg k;
    public final e4j l;

    public qqa(ny8 ny8Var, ny8 ny8Var2, double d, long j, long j2, double d2, long j3, v09 v09Var, qpa qpaVar, long j4, long j5, int i) {
        this.a = v09Var;
        this.b = qpaVar;
        this.c = j4;
        this.d = j5;
        this.e = i;
        this.f = ny8Var;
        this.g = ny8Var2;
        this.l = new e4j(new ww8(29, this), d, j, j2, d2, j3);
        e9i.j0(new fz6(((n5j) ny8Var.getValue()).j.k, new w8(2, this, qqa.class, "handleFetchEvents", "handleFetchEvents(Lone/me/sdk/media/player/fetcher/VideoFetchEvent;)V", 4, 18), 3), v09Var);
    }

    @Override // defpackage.afe
    public final void a(RecyclerView recyclerView, int i) {
        e4j e4jVar = this.l;
        e4jVar.k = i;
        f4g f4gVar = e4jVar.l;
        Handler handler = e4jVar.g;
        if (i == 0) {
            handler.removeCallbacks(f4gVar);
            e4jVar.a.invoke();
        } else {
            handler.removeCallbacks(f4gVar);
            handler.postDelayed(f4gVar, e4jVar.f);
        }
    }

    @Override // defpackage.afe
    public final void b(RecyclerView recyclerView, int i, int i2) {
        int i3;
        if (i2 > 0) {
            i3 = 2;
        } else {
            i3 = i2 < 0 ? 1 : this.i;
        }
        this.i = i3;
        this.h = recyclerView;
        e4j e4jVar = this.l;
        e4jVar.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j = jElapsedRealtime - e4jVar.h;
        e4jVar.h = jElapsedRealtime;
        Handler handler = e4jVar.g;
        f4g f4gVar = e4jVar.l;
        handler.removeCallbacks(f4gVar);
        handler.postDelayed(f4gVar, e4jVar.f);
        int iAbs = Math.abs(i2);
        long j2 = e4jVar.j;
        if (j2 != BuildConfig.MAX_TIME_TO_UPLOAD) {
            e4jVar.j = j2 + j;
        }
        int i4 = e4jVar.i;
        if (i4 != Integer.MAX_VALUE) {
            e4jVar.i = i4 + iAbs;
        }
        double d = iAbs;
        double height = recyclerView.getHeight();
        if (d >= e4jVar.b * height) {
            e4jVar.j = 0L;
            e4jVar.i = 0;
        } else if (j >= e4jVar.c) {
            e4jVar.j = 0L;
            e4jVar.i = 0;
        } else if (e4jVar.j >= e4jVar.d || e4jVar.i >= height * e4jVar.e) {
            e4jVar.a.invoke();
            e4jVar.j = 0L;
            e4jVar.i = 0;
        }
    }

    public final h3j c() {
        return (h3j) this.g.getValue();
    }

    public final void d(k96 k96Var) {
        if (this.h == null) {
            this.h = k96Var;
            k96Var.k(this);
            return;
        }
        a4c a4cVar = gm0.f;
        if (a4cVar == null) {
            return;
        }
        je9 je9Var = je9.d;
        if (a4cVar.b(je9Var)) {
            a4cVar.c(je9Var, "MessagesListVideoPreloader", "init skipped: already initialized", null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x005e  */
    /* JADX WARN: Code duplicated, block: B:43:0x00a2  */
    public final void e(RecyclerView recyclerView) {
        fj8 hj8Var;
        String str;
        ym5 ym5VarC;
        je9 je9Var = je9.d;
        LinearLayoutManager linearLayoutManagerE0 = tre.e0(recyclerView);
        eag eagVar = null;
        if (linearLayoutManagerE0 == null) {
            a4c a4cVar = gm0.f;
            if (a4cVar != null && a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, "MessagesListVideoPreloader", "Can't syncPrefetch: linearLayoutManager is null", null);
                return;
            }
            return;
        }
        int iX0 = linearLayoutManagerE0.X0();
        int iZ0 = linearLayoutManagerE0.Z0();
        int i = this.e;
        if (iX0 == -1 || iZ0 == -1 || iX0 > iZ0) {
            hj8Var = null;
        } else {
            int i2 = this.i;
            int i3 = i2 == 0 ? -1 : pqa.$EnumSwitchMapping$0[qt4.D(i2)];
            if (i3 == -1) {
                hj8Var = null;
            } else if (i3 == 1) {
                hj8Var = new hj8(iZ0 + 1, i + iZ0, 1);
            } else {
                if (i3 != 2) {
                    ore.o();
                    return;
                }
                hj8Var = new fj8(iX0 - 1, iX0 - i, -1);
            }
        }
        if (hj8Var == null) {
            a4c a4cVar2 = gm0.f;
            if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                a4cVar2.c(je9Var, "MessagesListVideoPreloader", "Can't syncPrefetch: positions is null", null);
                return;
            }
            return;
        }
        LinkedHashSet<rui> linkedHashSet = new LinkedHashSet();
        LinkedHashSet<rui> linkedHashSet2 = new LinkedHashSet();
        linkedHashSet2.addAll(this.j);
        m8b m8bVar = new m8b();
        f8b f8bVar = new f8b();
        int i4 = hj8Var.a;
        int i5 = hj8Var.b;
        int i6 = hj8Var.c;
        if ((i6 > 0 && i4 <= i5) || (i6 < 0 && i5 <= i4)) {
            while (true) {
                MessageModel messageModelQ = this.b.Q(i4);
                if (messageModelQ != null) {
                    t50 t50Var = messageModelQ.j.b;
                    hti htiVar = t50Var instanceof hti ? (hti) t50Var : eagVar;
                    if (htiVar != null) {
                        eag eagVar2 = htiVar instanceof eag ? (eag) htiVar : eagVar;
                        if (eagVar2 != null) {
                            rui ruiVarA = ((n5j) this.f.getValue()).e.a(eagVar2.b);
                            if (ruiVarA != null && (cqk.d(ruiVarA.getContentType(), "application/dash+xml") || cqk.d(ruiVarA.getContentType(), "video/hls"))) {
                                h3j h3jVarC = c();
                                h3jVarC.getClass();
                                ym5 ym5VarC2 = h3j.c(ruiVarA);
                                if (ym5VarC2 == null || h3jVarC.f.get(ym5VarC2.d) == null) {
                                    linkedHashSet.add(ruiVarA);
                                    f8bVar.a(i4);
                                }
                            } else if (ruiVarA == null) {
                                m8bVar.a(eagVar2.a);
                            }
                        }
                    }
                }
                if (i4 == i5) {
                    break;
                }
                i4 += i6;
                iX0 = iX0;
                eagVar = null;
            }
        } else {
            iX0 = iX0;
        }
        linkedHashSet2.removeAll(cx3.c1(linkedHashSet));
        for (rui ruiVar : linkedHashSet2) {
            h3j h3jVarC2 = c();
            h3jVarC2.getClass();
            ym5 ym5VarC3 = h3j.c(ruiVar);
            if (ym5VarC3 != null) {
                h3jVarC2.b.c.obtainMessage(4, ym5VarC3.d).sendToTarget();
            }
        }
        for (rui ruiVar2 : linkedHashSet) {
            h3j h3jVarC3 = c();
            long j = this.d;
            if (h3jVarC3.b.d && (ym5VarC = h3j.c(ruiVar2)) != null) {
                h3jVarC3.b.c.obtainMessage(3, new sp5(h3jVarC3.a, ym5VarC, new x71(j))).sendToTarget();
            }
        }
        this.j = linkedHashSet;
        if (f8bVar.d != 0) {
            int i7 = this.i;
            if (i7 == 0) {
                a4c a4cVar3 = gm0.f;
                if (a4cVar3 != null && a4cVar3.b(je9Var)) {
                    a4cVar3.c(je9Var, "MessagesListVideoPreloader", "Can't log preload: scrollDirection is null", null);
                    return;
                }
                return;
            }
            if (i7 != 2) {
                iZ0 = iX0;
            }
            a4c a4cVar4 = gm0.f;
            if (a4cVar4 != null && a4cVar4.b(je9Var)) {
                if (i7 == 1) {
                    str = "UP";
                } else {
                    if (i7 != 2) {
                        throw null;
                    }
                    str = "DOWN";
                }
                a4cVar4.c(je9Var, "MessagesListVideoPreloader", "preload " + str.toLowerCase(Locale.ROOT) + ": preloaded=" + f8bVar + ", edge=" + iZ0, null);
            }
        }
        if (m8bVar.j()) {
            ((n5j) this.f.getValue()).b(this.c, "messages_video_prefetch_id", rx8.f0(m8bVar));
        }
    }
}
