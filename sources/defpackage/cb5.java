package defpackage;

import android.net.Uri;
import android.os.SystemClock;
import androidx.media3.common.ParserException;
import androidx.media3.datasource.HttpDataSource$InvalidResponseCodeException;
import androidx.media3.exoplayer.hls.playlist.HlsPlaylistParser$DeltaUpdateException;
import androidx.media3.exoplayer.hls.playlist.HlsPlaylistTracker$PlaylistResetException;
import androidx.media3.exoplayer.hls.playlist.HlsPlaylistTracker$PlaylistStuckException;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class cb5 implements w99 {
    public final Uri a;
    public final dc9 b = new dc9("DefaultHlsPlaylistTracker:MediaPlaylist", 1);
    public final u25 c;
    public sx7 d;
    public long e;
    public long f;
    public long g;
    public long h;
    public boolean i;
    public IOException j;
    public boolean k;
    public final /* synthetic */ db5 l;

    public cb5(db5 db5Var, Uri uri) {
        this.l = db5Var;
        this.a = uri;
        this.c = ((s25) db5Var.a.b).a();
    }

    public static boolean a(cb5 cb5Var, long j) {
        cb5Var.h = SystemClock.elapsedRealtime() + j;
        Uri uri = cb5Var.a;
        db5 db5Var = cb5Var.l;
        if (!uri.equals(db5Var.k)) {
            return true;
        }
        List list = db5Var.j.e;
        int size = list.size();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        for (int i = 0; i < size; i++) {
            cb5 cb5Var2 = (cb5) db5Var.d.get(((vx7) list.get(i)).a);
            cb5Var2.getClass();
            if (jElapsedRealtime > cb5Var2.h) {
                Uri uri2 = cb5Var2.a;
                db5Var.k = uri2;
                cb5Var2.f(db5Var.b(uri2));
                return true;
            }
        }
        return false;
    }

    public final Uri b() {
        sx7 sx7Var = this.d;
        Uri uri = this.a;
        if (sx7Var != null) {
            rx7 rx7Var = sx7Var.v;
            if (rx7Var.a != -9223372036854775807L || rx7Var.e) {
                Uri.Builder builderBuildUpon = uri.buildUpon();
                sx7 sx7Var2 = this.d;
                if (sx7Var2.v.e) {
                    builderBuildUpon.appendQueryParameter("_HLS_msn", String.valueOf(sx7Var2.k + ((long) sx7Var2.r.size())));
                    sx7 sx7Var3 = this.d;
                    if (sx7Var3.n != -9223372036854775807L) {
                        c98 c98Var = sx7Var3.s;
                        int size = c98Var.size();
                        if (!c98Var.isEmpty() && ((nx7) np4.n(c98Var)).m) {
                            size--;
                        }
                        builderBuildUpon.appendQueryParameter("_HLS_part", String.valueOf(size));
                    }
                }
                rx7 rx7Var2 = this.d.v;
                if (rx7Var2.a != -9223372036854775807L) {
                    builderBuildUpon.appendQueryParameter("_HLS_skip", rx7Var2.b ? "v2" : "YES");
                }
                return builderBuildUpon.build();
            }
        }
        return uri;
    }

    public final void c(boolean z) {
        f(z ? b() : this.a);
    }

    @Override // defpackage.w99
    public final void d(y99 y99Var, long j, long j2, boolean z) {
        rmc rmcVar = (rmc) y99Var;
        long j3 = rmcVar.a;
        a35 a35Var = rmcVar.b;
        lkg lkgVar = rmcVar.d;
        t99 t99Var = new t99(a35Var, lkgVar.c, lkgVar.d, j, j2, lkgVar.b);
        db5 db5Var = this.l;
        db5Var.c.getClass();
        db5Var.f.N(t99Var, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    public final void e(Uri uri) {
        db5 db5Var = this.l;
        qmc qmcVarG = db5Var.b.g(db5Var.j, this.d);
        Map map = Collections.EMPTY_MAP;
        lvb.W(uri, "The uri must be set.");
        rmc rmcVar = new rmc(this.c, new a35(uri, 0L, 1, null, map, 0L, -1L, null, 1, null), 4, qmcVarG);
        this.b.N(rmcVar, this, db5Var.c.o(rmcVar.c));
    }

    public final void f(Uri uri) {
        this.h = 0L;
        if (this.i) {
            return;
        }
        dc9 dc9Var = this.b;
        if (dc9Var.J() || dc9Var.I()) {
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j = this.g;
        if (jElapsedRealtime >= j) {
            e(uri);
        } else {
            this.i = true;
            this.l.h.postDelayed(new f92(this, 25, uri), j - jElapsedRealtime);
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0247  */
    /* JADX WARN: Code duplicated, block: B:102:0x0249 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:103:0x024b  */
    /* JADX WARN: Code duplicated, block: B:105:0x0256  */
    /* JADX WARN: Code duplicated, block: B:106:0x025a  */
    /* JADX WARN: Code duplicated, block: B:109:0x026e  */
    /* JADX WARN: Code duplicated, block: B:111:0x0276  */
    /* JADX WARN: Code duplicated, block: B:117:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:24:0x0057  */
    /* JADX WARN: Code duplicated, block: B:26:0x005b  */
    /* JADX WARN: Code duplicated, block: B:28:0x005f  */
    /* JADX WARN: Code duplicated, block: B:29:0x0067  */
    /* JADX WARN: Code duplicated, block: B:31:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:32:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:34:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:36:0x00da  */
    /* JADX WARN: Code duplicated, block: B:38:0x00de  */
    /* JADX WARN: Code duplicated, block: B:39:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:41:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:42:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:44:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:45:0x0106  */
    /* JADX WARN: Code duplicated, block: B:47:0x0109  */
    /* JADX WARN: Code duplicated, block: B:49:0x010e  */
    /* JADX WARN: Code duplicated, block: B:51:0x0115  */
    /* JADX WARN: Code duplicated, block: B:55:0x011e  */
    /* JADX WARN: Code duplicated, block: B:56:0x0126  */
    /* JADX WARN: Code duplicated, block: B:58:0x012a  */
    /* JADX WARN: Code duplicated, block: B:59:0x012d  */
    /* JADX WARN: Code duplicated, block: B:61:0x0130  */
    /* JADX WARN: Code duplicated, block: B:62:0x0132  */
    /* JADX WARN: Code duplicated, block: B:64:0x013e  */
    /* JADX WARN: Code duplicated, block: B:65:0x0145  */
    /* JADX WARN: Code duplicated, block: B:67:0x0148  */
    /* JADX WARN: Code duplicated, block: B:72:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:74:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:76:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:81:0x01d2 A[LOOP:0: B:79:0x01cc->B:81:0x01d2, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:82:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:84:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:86:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:87:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:89:0x020d  */
    /* JADX WARN: Code duplicated, block: B:91:0x0214  */
    /* JADX WARN: Code duplicated, block: B:93:0x0218  */
    /* JADX WARN: Code duplicated, block: B:96:0x022c A[LOOP:1: B:94:0x0226->B:96:0x022c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:99:0x0242 A[DONT_INVERT] */
    public final void g(sx7 sx7Var, t99 t99Var) {
        boolean z;
        long j;
        c98 c98Var;
        long j2;
        boolean z2;
        sx7 sx7Var2;
        long j3;
        long j4;
        c98 c98Var2;
        int size;
        int i;
        px7 px7Var;
        long j5;
        long j6;
        long j7;
        sx7 sx7Var3;
        int i2;
        int i3;
        c98 c98Var3;
        px7 px7Var2;
        int i4;
        sx7 sx7Var4;
        IOException iOException;
        Uri uri;
        long size2;
        sx7 sx7Var5;
        IOException hlsPlaylistTracker$PlaylistStuckException;
        boolean z3;
        mf mfVar;
        Iterator it;
        sx7 sx7Var6;
        rx7 rx7Var;
        long j8;
        long j9;
        Iterator it2;
        int size3;
        int size4;
        int size5;
        sx7 sx7Var7 = this.d;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        this.e = jElapsedRealtime;
        db5 db5Var = this.l;
        CopyOnWriteArrayList copyOnWriteArrayList = db5Var.e;
        if (sx7Var7 != null) {
            long j10 = sx7Var.k;
            long j11 = sx7Var7.k;
            z = j10 > j11 || (j10 >= j11 && ((size3 = sx7Var.r.size() - sx7Var7.r.size()) == 0 ? (size4 = sx7Var.s.size()) > (size5 = sx7Var7.s.size()) || (size4 == size5 && sx7Var.o && !sx7Var7.o) : size3 > 0));
            j = sx7Var.k;
            c98Var = sx7Var.r;
            j2 = 0;
            if (z) {
                copyOnWriteArrayList = copyOnWriteArrayList;
                z2 = true;
                if (sx7Var.p) {
                    j6 = sx7Var.h;
                } else {
                    sx7Var2 = db5Var.l;
                    if (sx7Var2 != null) {
                        j3 = sx7Var2.h;
                    } else {
                        j3 = 0;
                    }
                    if (sx7Var7 == null) {
                        long j12 = sx7Var7.h;
                        j4 = sx7Var7.k;
                        c98Var2 = sx7Var7.r;
                        size = c98Var2.size();
                        i = (int) (j - j4);
                        if (i < c98Var2.size()) {
                            px7Var = (px7) c98Var2.get(i);
                        } else {
                            px7Var = null;
                        }
                        if (px7Var != null) {
                            j5 = px7Var.e;
                        } else {
                            if (size == j - j4) {
                                j5 = sx7Var7.u;
                            }
                            if (sx7Var.i) {
                                i4 = sx7Var.j;
                            } else {
                                sx7Var3 = db5Var.l;
                                if (sx7Var3 != null) {
                                    i2 = sx7Var3.j;
                                } else {
                                    i2 = 0;
                                }
                                if (sx7Var7 == null) {
                                    i3 = (int) (j - sx7Var7.k);
                                    c98Var3 = sx7Var7.r;
                                    if (i3 < c98Var3.size()) {
                                        px7Var2 = (px7) c98Var3.get(i3);
                                    } else {
                                        px7Var2 = null;
                                    }
                                    if (px7Var2 != null) {
                                        i2 = (sx7Var7.j + px7Var2.d) - ((px7) c98Var.get(0)).d;
                                    }
                                }
                                i4 = i2;
                            }
                            iOException = null;
                            sx7Var4 = new sx7(sx7Var.d, sx7Var.a, sx7Var.b, sx7Var.e, sx7Var.g, j7, true, i4, sx7Var.k, sx7Var.l, sx7Var.m, sx7Var.n, sx7Var.c, sx7Var.o, sx7Var.p, sx7Var.q, c98Var, sx7Var.s, sx7Var.v, sx7Var.t, sx7Var.w);
                        }
                        j6 = j12 + j5;
                    }
                    j7 = j3;
                    if (sx7Var.i) {
                        i4 = sx7Var.j;
                    } else {
                        sx7Var3 = db5Var.l;
                        if (sx7Var3 != null) {
                            i2 = sx7Var3.j;
                        } else {
                            i2 = 0;
                        }
                        if (sx7Var7 == null) {
                            i3 = (int) (j - sx7Var7.k);
                            c98Var3 = sx7Var7.r;
                            if (i3 < c98Var3.size()) {
                                px7Var2 = (px7) c98Var3.get(i3);
                            } else {
                                px7Var2 = null;
                            }
                            if (px7Var2 != null) {
                                i2 = (sx7Var7.j + px7Var2.d) - ((px7) c98Var.get(0)).d;
                            }
                        }
                        i4 = i2;
                    }
                    iOException = null;
                    sx7Var4 = new sx7(sx7Var.d, sx7Var.a, sx7Var.b, sx7Var.e, sx7Var.g, j7, true, i4, sx7Var.k, sx7Var.l, sx7Var.m, sx7Var.n, sx7Var.c, sx7Var.o, sx7Var.p, sx7Var.q, c98Var, sx7Var.s, sx7Var.v, sx7Var.t, sx7Var.w);
                }
                j7 = j6;
                if (sx7Var.i) {
                    i4 = sx7Var.j;
                } else {
                    sx7Var3 = db5Var.l;
                    if (sx7Var3 != null) {
                        i2 = sx7Var3.j;
                    } else {
                        i2 = 0;
                    }
                    if (sx7Var7 == null) {
                        i3 = (int) (j - sx7Var7.k);
                        c98Var3 = sx7Var7.r;
                        if (i3 < c98Var3.size()) {
                            px7Var2 = (px7) c98Var3.get(i3);
                        } else {
                            px7Var2 = null;
                        }
                        if (px7Var2 != null) {
                            i2 = (sx7Var7.j + px7Var2.d) - ((px7) c98Var.get(0)).d;
                        }
                    }
                    i4 = i2;
                }
                iOException = null;
                sx7Var4 = new sx7(sx7Var.d, sx7Var.a, sx7Var.b, sx7Var.e, sx7Var.g, j7, true, i4, sx7Var.k, sx7Var.l, sx7Var.m, sx7Var.n, sx7Var.c, sx7Var.o, sx7Var.p, sx7Var.q, c98Var, sx7Var.s, sx7Var.v, sx7Var.t, sx7Var.w);
            } else {
                if (sx7Var.o) {
                    z2 = true;
                    sx7Var4 = sx7Var7;
                } else if (sx7Var7.o) {
                    sx7Var4 = sx7Var7;
                    copyOnWriteArrayList = copyOnWriteArrayList;
                    iOException = null;
                    z2 = true;
                } else {
                    z2 = true;
                    sx7Var4 = new sx7(sx7Var7.d, sx7Var7.a, sx7Var7.b, sx7Var7.e, sx7Var7.g, sx7Var7.h, sx7Var7.i, sx7Var7.j, sx7Var7.k, sx7Var7.l, sx7Var7.m, sx7Var7.n, sx7Var7.c, true, sx7Var7.p, sx7Var7.q, sx7Var7.r, sx7Var7.s, sx7Var7.v, sx7Var7.t, sx7Var7.w);
                }
                iOException = null;
            }
            this.d = sx7Var4;
            uri = this.a;
            if (sx7Var4 != sx7Var7) {
                this.j = iOException;
                this.f = jElapsedRealtime;
                if (uri.equals(db5Var.k)) {
                    if (db5Var.l == null) {
                        db5Var.m = !sx7Var4.o;
                        db5Var.n = sx7Var4.h;
                    }
                    db5Var.l = sx7Var4;
                    db5Var.i.x(sx7Var4);
                }
                it2 = copyOnWriteArrayList.iterator();
                while (it2.hasNext()) {
                    ((ay7) it2.next()).b();
                }
            } else if (!sx7Var4.o) {
                size2 = sx7Var.k + ((long) sx7Var.r.size());
                sx7Var5 = this.d;
                if (size2 < sx7Var5.k) {
                    hlsPlaylistTracker$PlaylistStuckException = new HlsPlaylistTracker$PlaylistResetException();
                    z3 = z2;
                } else {
                    if (jElapsedRealtime - this.f > vqi.p0(sx7Var5.m) * 3.5d) {
                        hlsPlaylistTracker$PlaylistStuckException = new HlsPlaylistTracker$PlaylistStuckException();
                    } else {
                        hlsPlaylistTracker$PlaylistStuckException = iOException;
                    }
                    z3 = false;
                }
                if (hlsPlaylistTracker$PlaylistStuckException != null) {
                    this.j = hlsPlaylistTracker$PlaylistStuckException;
                    mfVar = new mf(hlsPlaylistTracker$PlaylistStuckException, z2 ? 1 : 0, 7);
                    it = copyOnWriteArrayList.iterator();
                    while (it.hasNext()) {
                        ((ay7) it.next()).d(uri, mfVar, z3);
                    }
                }
            }
            sx7Var6 = this.d;
            rx7Var = sx7Var6.v;
            j8 = sx7Var6.m;
            if (!rx7Var.e) {
                if (sx7Var6 == sx7Var7) {
                    j9 = sx7Var6.n;
                    if (j9 != -9223372036854775807L) {
                        j2 = j9 / 2;
                    } else {
                        j8 /= 2;
                    }
                }
                this.g = (vqi.p0(j2) + jElapsedRealtime) - t99Var.e;
                if (this.d.o) {
                }
                if (!uri.equals(db5Var.k) || this.k) {
                    f(b());
                }
                return;
            }
            if (sx7Var6 == sx7Var7) {
                j8 /= 2;
            }
            j2 = j8;
            this.g = (vqi.p0(j2) + jElapsedRealtime) - t99Var.e;
            if (this.d.o) {
                if (uri.equals(db5Var.k)) {
                }
                f(b());
            }
        }
        sx7Var.getClass();
        j = sx7Var.k;
        c98Var = sx7Var.r;
        j2 = 0;
        if (z) {
            if (sx7Var.o) {
                z2 = true;
                sx7Var4 = sx7Var7;
            } else if (sx7Var7.o) {
                sx7Var4 = sx7Var7;
                copyOnWriteArrayList = copyOnWriteArrayList;
                iOException = null;
                z2 = true;
            } else {
                z2 = true;
                sx7Var4 = new sx7(sx7Var7.d, sx7Var7.a, sx7Var7.b, sx7Var7.e, sx7Var7.g, sx7Var7.h, sx7Var7.i, sx7Var7.j, sx7Var7.k, sx7Var7.l, sx7Var7.m, sx7Var7.n, sx7Var7.c, true, sx7Var7.p, sx7Var7.q, sx7Var7.r, sx7Var7.s, sx7Var7.v, sx7Var7.t, sx7Var7.w);
            }
            iOException = null;
        } else {
            copyOnWriteArrayList = copyOnWriteArrayList;
            z2 = true;
            if (sx7Var.p) {
                j6 = sx7Var.h;
            } else {
                sx7Var2 = db5Var.l;
                if (sx7Var2 != null) {
                    j3 = sx7Var2.h;
                } else {
                    j3 = 0;
                }
                if (sx7Var7 == null) {
                    long j13 = sx7Var7.h;
                    j4 = sx7Var7.k;
                    c98Var2 = sx7Var7.r;
                    size = c98Var2.size();
                    i = (int) (j - j4);
                    if (i < c98Var2.size()) {
                        px7Var = (px7) c98Var2.get(i);
                    } else {
                        px7Var = null;
                    }
                    if (px7Var != null) {
                        j5 = px7Var.e;
                    } else {
                        if (size == j - j4) {
                            j5 = sx7Var7.u;
                        }
                        if (sx7Var.i) {
                            i4 = sx7Var.j;
                        } else {
                            sx7Var3 = db5Var.l;
                            if (sx7Var3 != null) {
                                i2 = sx7Var3.j;
                            } else {
                                i2 = 0;
                            }
                            if (sx7Var7 == null) {
                                i3 = (int) (j - sx7Var7.k);
                                c98Var3 = sx7Var7.r;
                                if (i3 < c98Var3.size()) {
                                    px7Var2 = (px7) c98Var3.get(i3);
                                } else {
                                    px7Var2 = null;
                                }
                                if (px7Var2 != null) {
                                    i2 = (sx7Var7.j + px7Var2.d) - ((px7) c98Var.get(0)).d;
                                }
                            }
                            i4 = i2;
                        }
                        iOException = null;
                        sx7Var4 = new sx7(sx7Var.d, sx7Var.a, sx7Var.b, sx7Var.e, sx7Var.g, j7, true, i4, sx7Var.k, sx7Var.l, sx7Var.m, sx7Var.n, sx7Var.c, sx7Var.o, sx7Var.p, sx7Var.q, c98Var, sx7Var.s, sx7Var.v, sx7Var.t, sx7Var.w);
                    }
                    j6 = j13 + j5;
                }
                j7 = j3;
                if (sx7Var.i) {
                    i4 = sx7Var.j;
                } else {
                    sx7Var3 = db5Var.l;
                    if (sx7Var3 != null) {
                        i2 = sx7Var3.j;
                    } else {
                        i2 = 0;
                    }
                    if (sx7Var7 == null) {
                        i3 = (int) (j - sx7Var7.k);
                        c98Var3 = sx7Var7.r;
                        if (i3 < c98Var3.size()) {
                            px7Var2 = (px7) c98Var3.get(i3);
                        } else {
                            px7Var2 = null;
                        }
                        if (px7Var2 != null) {
                            i2 = (sx7Var7.j + px7Var2.d) - ((px7) c98Var.get(0)).d;
                        }
                    }
                    i4 = i2;
                }
                iOException = null;
                sx7Var4 = new sx7(sx7Var.d, sx7Var.a, sx7Var.b, sx7Var.e, sx7Var.g, j7, true, i4, sx7Var.k, sx7Var.l, sx7Var.m, sx7Var.n, sx7Var.c, sx7Var.o, sx7Var.p, sx7Var.q, c98Var, sx7Var.s, sx7Var.v, sx7Var.t, sx7Var.w);
            }
            j7 = j6;
            if (sx7Var.i) {
                i4 = sx7Var.j;
            } else {
                sx7Var3 = db5Var.l;
                if (sx7Var3 != null) {
                    i2 = sx7Var3.j;
                } else {
                    i2 = 0;
                }
                if (sx7Var7 == null) {
                    i3 = (int) (j - sx7Var7.k);
                    c98Var3 = sx7Var7.r;
                    if (i3 < c98Var3.size()) {
                        px7Var2 = (px7) c98Var3.get(i3);
                    } else {
                        px7Var2 = null;
                    }
                    if (px7Var2 != null) {
                        i2 = (sx7Var7.j + px7Var2.d) - ((px7) c98Var.get(0)).d;
                    }
                }
                i4 = i2;
            }
            iOException = null;
            sx7Var4 = new sx7(sx7Var.d, sx7Var.a, sx7Var.b, sx7Var.e, sx7Var.g, j7, true, i4, sx7Var.k, sx7Var.l, sx7Var.m, sx7Var.n, sx7Var.c, sx7Var.o, sx7Var.p, sx7Var.q, c98Var, sx7Var.s, sx7Var.v, sx7Var.t, sx7Var.w);
        }
        this.d = sx7Var4;
        uri = this.a;
        if (sx7Var4 != sx7Var7) {
            this.j = iOException;
            this.f = jElapsedRealtime;
            if (uri.equals(db5Var.k)) {
                if (db5Var.l == null) {
                    db5Var.m = !sx7Var4.o;
                    db5Var.n = sx7Var4.h;
                }
                db5Var.l = sx7Var4;
                db5Var.i.x(sx7Var4);
            }
            it2 = copyOnWriteArrayList.iterator();
            while (it2.hasNext()) {
                ((ay7) it2.next()).b();
            }
        } else if (!sx7Var4.o) {
            size2 = sx7Var.k + ((long) sx7Var.r.size());
            sx7Var5 = this.d;
            if (size2 < sx7Var5.k) {
                hlsPlaylistTracker$PlaylistStuckException = new HlsPlaylistTracker$PlaylistResetException();
                z3 = z2;
            } else {
                if (jElapsedRealtime - this.f > vqi.p0(sx7Var5.m) * 3.5d) {
                    hlsPlaylistTracker$PlaylistStuckException = new HlsPlaylistTracker$PlaylistStuckException();
                } else {
                    hlsPlaylistTracker$PlaylistStuckException = iOException;
                }
                z3 = false;
            }
            if (hlsPlaylistTracker$PlaylistStuckException != null) {
                this.j = hlsPlaylistTracker$PlaylistStuckException;
                mfVar = new mf(hlsPlaylistTracker$PlaylistStuckException, z2 ? 1 : 0, 7);
                it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    ((ay7) it.next()).d(uri, mfVar, z3);
                }
            }
        }
        sx7Var6 = this.d;
        rx7Var = sx7Var6.v;
        j8 = sx7Var6.m;
        if (!rx7Var.e) {
            if (sx7Var6 == sx7Var7) {
                j9 = sx7Var6.n;
                if (j9 != -9223372036854775807L) {
                    j2 = j9 / 2;
                } else {
                    j8 /= 2;
                }
            }
            this.g = (vqi.p0(j2) + jElapsedRealtime) - t99Var.e;
            if (this.d.o) {
                if (uri.equals(db5Var.k)) {
                }
                f(b());
            }
        }
        if (sx7Var6 == sx7Var7) {
            j8 /= 2;
        }
        j2 = j8;
        this.g = (vqi.p0(j2) + jElapsedRealtime) - t99Var.e;
        if (this.d.o) {
            if (uri.equals(db5Var.k)) {
            }
            f(b());
        }
    }

    @Override // defpackage.w99
    public final void h(y99 y99Var, long j, long j2) {
        rmc rmcVar = (rmc) y99Var;
        xx7 xx7Var = (xx7) rmcVar.f;
        a35 a35Var = rmcVar.b;
        lkg lkgVar = rmcVar.d;
        t99 t99Var = new t99(a35Var, lkgVar.c, lkgVar.d, j, j2, lkgVar.b);
        if (xx7Var instanceof sx7) {
            g((sx7) xx7Var, t99Var);
            this.l.f.O(t99Var, 4, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        } else {
            ParserException parserExceptionB = ParserException.b(null, "Loaded playlist has unexpected type.");
            this.j = parserExceptionB;
            this.l.f.Q(t99Var, 4, parserExceptionB, true);
        }
        this.l.c.getClass();
    }

    @Override // defpackage.w99
    public final void p(y99 y99Var, long j, long j2, int i) {
        t99 t99Var;
        rmc rmcVar = (rmc) y99Var;
        if (i == 0) {
            long j3 = rmcVar.a;
            t99Var = new t99(j, rmcVar.b);
        } else {
            long j4 = rmcVar.a;
            a35 a35Var = rmcVar.b;
            lkg lkgVar = rmcVar.d;
            t99Var = new t99(a35Var, lkgVar.c, lkgVar.d, j, j2, lkgVar.b);
        }
        this.l.f.R(t99Var, rmcVar.c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, i);
    }

    @Override // defpackage.w99
    public final dc1 x(y99 y99Var, long j, long j2, IOException iOException, int i) {
        rmc rmcVar = (rmc) y99Var;
        long j3 = rmcVar.a;
        int i2 = rmcVar.c;
        a35 a35Var = rmcVar.b;
        lkg lkgVar = rmcVar.d;
        Uri uri = lkgVar.c;
        t99 t99Var = new t99(a35Var, uri, lkgVar.d, j, j2, lkgVar.b);
        boolean z = uri.getQueryParameter("_HLS_msn") != null;
        boolean z2 = iOException instanceof HlsPlaylistParser$DeltaUpdateException;
        dc1 dc1Var = dc9.f;
        db5 db5Var = this.l;
        if (z || z2) {
            int i3 = iOException instanceof HttpDataSource$InvalidResponseCodeException ? ((HttpDataSource$InvalidResponseCodeException) iOException).c : Integer.MAX_VALUE;
            if (z2 || i3 == 400 || i3 == 503) {
                this.g = SystemClock.elapsedRealtime();
                c(false);
                ed7 ed7Var = db5Var.f;
                String str = vqi.a;
                ed7Var.Q(t99Var, i2, iOException, true);
                return dc1Var;
            }
        }
        mf mfVar = new mf(iOException, i, 7);
        Iterator it = db5Var.e.iterator();
        boolean z3 = false;
        while (it.hasNext()) {
            z3 |= !((ay7) it.next()).d(this.a, mfVar, false);
        }
        l6m l6mVar = db5Var.c;
        if (z3) {
            long jQ = l6mVar.q(mfVar);
            dc1Var = jQ != -9223372036854775807L ? new dc1(0, jQ, false) : dc9.g;
        }
        boolean zF = dc1Var.f();
        db5Var.f.Q(t99Var, i2, iOException, !zF);
        if (!zF) {
            l6mVar.getClass();
        }
        return dc1Var;
    }
}
