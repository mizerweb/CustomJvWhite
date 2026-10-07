package defpackage;

import android.content.Context;
import android.media.DeniedByServerException;
import android.media.MediaCodec;
import android.media.MediaDrm;
import android.media.MediaDrmResetException;
import android.media.NotProvisionedException;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackSession;
import android.media.metrics.TrackChangeEvent;
import android.os.SystemClock;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.util.Pair;
import android.util.SparseArray;
import androidx.media3.common.ParserException;
import androidx.media3.common.PlaybackException;
import androidx.media3.datasource.FileDataSource$FileDataSourceException;
import androidx.media3.datasource.HttpDataSource$HttpDataSourceException;
import androidx.media3.datasource.HttpDataSource$InvalidContentTypeException;
import androidx.media3.datasource.HttpDataSource$InvalidResponseCodeException;
import androidx.media3.datasource.UdpDataSource$UdpDataSourceException;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.audio.AudioSink$InitializationException;
import androidx.media3.exoplayer.audio.AudioSink$WriteException;
import androidx.media3.exoplayer.drm.DefaultDrmSessionManager$MissingSchemeDataException;
import androidx.media3.exoplayer.drm.DrmSession$DrmSessionException;
import androidx.media3.exoplayer.drm.UnsupportedDrmException;
import androidx.media3.exoplayer.mediacodec.MediaCodecDecoderException;
import androidx.media3.exoplayer.mediacodec.MediaCodecRenderer$DecoderInitializationException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class g0a implements xf {
    public int A;
    public boolean B;
    public final Context a;
    public final xc5 c;
    public final PlaybackSession d;
    public String j;
    public PlaybackMetrics.Builder k;
    public int l;
    public PlaybackException o;
    public ed7 p;
    public ed7 q;
    public ed7 r;
    public b87 s;
    public b87 t;
    public b87 u;
    public boolean v;
    public int w;
    public boolean x;
    public int y;
    public int z;
    public final Executor b = gm0.t();
    public final tsh f = new tsh();
    public final rsh g = new rsh();
    public final HashMap i = new HashMap();
    public final HashMap h = new HashMap();
    public final long e = SystemClock.elapsedRealtime();
    public int m = 0;
    public int n = 0;

    public g0a(Context context, PlaybackSession playbackSession) {
        this.a = context.getApplicationContext();
        this.d = playbackSession;
        xc5 xc5Var = new xc5();
        this.c = xc5Var;
        xc5Var.d = this;
    }

    @Override // defpackage.xf
    public final void G(wf wfVar, k4j k4jVar) {
        ed7 ed7Var = this.p;
        if (ed7Var != null) {
            b87 b87Var = (b87) ed7Var.c;
            if (b87Var.v == -1) {
                a87 a87VarA = b87Var.a();
                a87VarA.v(k4jVar.a);
                a87VarA.h(k4jVar.b);
                this.p = new ed7(a87VarA.a(), ed7Var.b, (String) ed7Var.d);
            }
        }
    }

    @Override // defpackage.xf
    public final void J0(wf wfVar, int i, long j, long j2) {
        x4a x4aVar = wfVar.d;
        if (x4aVar != null) {
            String strD = this.c.d(wfVar.b, x4aVar);
            HashMap map = this.i;
            Long l = (Long) map.get(strD);
            HashMap map2 = this.h;
            Long l2 = (Long) map2.get(strD);
            map.put(strD, Long.valueOf((l == null ? 0L : l.longValue()) + j));
            map2.put(strD, Long.valueOf((l2 != null ? l2.longValue() : 0L) + ((long) i)));
        }
    }

    @Override // defpackage.xf
    public final void O(wf wfVar, PlaybackException playbackException) {
        this.o = playbackException;
    }

    @Override // defpackage.xf
    public final void O0(wf wfVar, uz9 uz9Var) {
        x4a x4aVar = wfVar.d;
        if (x4aVar == null) {
            return;
        }
        b87 b87Var = uz9Var.c;
        b87Var.getClass();
        int i = uz9Var.d;
        ush ushVar = wfVar.b;
        x4aVar.getClass();
        ed7 ed7Var = new ed7(b87Var, i, this.c.d(ushVar, x4aVar));
        int i2 = uz9Var.b;
        if (i2 != 0) {
            if (i2 == 1) {
                this.q = ed7Var;
                return;
            } else if (i2 != 2) {
                if (i2 != 3) {
                    return;
                }
                this.r = ed7Var;
                return;
            }
        }
        this.p = ed7Var;
    }

    @Override // defpackage.xf
    public final void R(wf wfVar, t55 t55Var) {
        this.y += t55Var.g;
        this.z += t55Var.e;
    }

    public final boolean a(ed7 ed7Var) {
        String str;
        if (ed7Var == null) {
            return false;
        }
        String str2 = (String) ed7Var.d;
        xc5 xc5Var = this.c;
        synchronized (xc5Var) {
            str = xc5Var.f;
        }
        return str2.equals(str);
    }

    public final void b() {
        PlaybackMetrics.Builder builder = this.k;
        if (builder != null && this.B) {
            builder.setAudioUnderrunCount(this.A);
            this.k.setVideoFramesDropped(this.y);
            this.k.setVideoFramesPlayed(this.z);
            Long l = (Long) this.h.get(this.j);
            this.k.setNetworkTransferDurationMillis(l == null ? 0L : l.longValue());
            Long l2 = (Long) this.i.get(this.j);
            this.k.setNetworkBytesRead(l2 == null ? 0L : l2.longValue());
            this.k.setStreamSource((l2 == null || l2.longValue() <= 0) ? 0 : 1);
            this.b.execute(new su6(this, 18, this.k.build()));
        }
        this.k = null;
        this.j = null;
        this.A = 0;
        this.y = 0;
        this.z = 0;
        this.s = null;
        this.t = null;
        this.u = null;
        this.B = false;
    }

    public final void c(ush ushVar, x4a x4aVar) {
        int iB;
        PlaybackMetrics.Builder builder = this.k;
        if (x4aVar == null || (iB = ushVar.b(x4aVar.a)) == -1) {
            return;
        }
        rsh rshVar = this.g;
        int i = 0;
        ushVar.f(iB, rshVar, false);
        int i2 = rshVar.c;
        tsh tshVar = this.f;
        ushVar.n(i2, tshVar);
        jy9 jy9Var = tshVar.b.b;
        if (jy9Var != null) {
            int iN = vqi.N(jy9Var.a, jy9Var.b);
            if (iN == 0) {
                i = 3;
            } else if (iN != 1) {
                i = iN != 2 ? 1 : 4;
            } else {
                i = 5;
            }
        }
        builder.setStreamType(i);
        if (tshVar.l != -9223372036854775807L && !tshVar.j && !tshVar.h && !tshVar.a()) {
            builder.setMediaDurationMillis(vqi.p0(tshVar.l));
        }
        builder.setPlaybackType(tshVar.a() ? 2 : 1);
        this.B = true;
    }

    public final void d(wf wfVar, String str) {
        x4a x4aVar = wfVar.d;
        if ((x4aVar == null || !x4aVar.b()) && str.equals(this.j)) {
            b();
        }
        this.h.remove(str);
        this.i.remove(str);
    }

    public final void e(int i, long j, b87 b87Var, int i2) {
        int i3;
        TrackChangeEvent.Builder timeSinceCreatedMillis = e0a.d(i).setTimeSinceCreatedMillis(j - this.e);
        if (b87Var != null) {
            timeSinceCreatedMillis.setTrackState(1);
            if (i2 != 1) {
                i3 = 3;
                if (i2 != 2) {
                    i3 = i2 != 3 ? 1 : 4;
                }
            } else {
                i3 = 2;
            }
            timeSinceCreatedMillis.setTrackChangeReason(i3);
            String str = b87Var.m;
            if (str != null) {
                timeSinceCreatedMillis.setContainerMimeType(str);
            }
            String str2 = b87Var.n;
            if (str2 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str2);
            }
            String str3 = b87Var.k;
            if (str3 != null) {
                timeSinceCreatedMillis.setCodecName(str3);
            }
            int i4 = b87Var.j;
            if (i4 != -1) {
                timeSinceCreatedMillis.setBitrate(i4);
            }
            int i5 = b87Var.u;
            if (i5 != -1) {
                timeSinceCreatedMillis.setWidth(i5);
            }
            int i6 = b87Var.v;
            if (i6 != -1) {
                timeSinceCreatedMillis.setHeight(i6);
            }
            int i7 = b87Var.F;
            if (i7 != -1) {
                timeSinceCreatedMillis.setChannelCount(i7);
            }
            int i8 = b87Var.G;
            if (i8 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i8);
            }
            String str4 = b87Var.d;
            if (str4 != null) {
                String str5 = vqi.a;
                String[] strArrSplit = str4.split("-", -1);
                Pair pairCreate = Pair.create(strArrSplit[0], strArrSplit.length >= 2 ? strArrSplit[1] : null);
                timeSinceCreatedMillis.setLanguage((String) pairCreate.first);
                Object obj = pairCreate.second;
                if (obj != null) {
                    timeSinceCreatedMillis.setLanguageRegion((String) obj);
                }
            }
            float f = b87Var.y;
            if (f != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(f);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.B = true;
        this.b.execute(new su6(this, 17, timeSinceCreatedMillis.build()));
    }

    @Override // defpackage.xf
    public final void r(wf wfVar, k3d k3dVar, k3d k3dVar2, int i) {
        if (i == 1) {
            this.v = true;
        }
        this.l = i;
    }

    /* JADX WARN: Code duplicated, block: B:250:0x0453  */
    /* JADX WARN: Code duplicated, block: B:368:0x05d4 A[PHI: r5
  0x05d4: PHI (r5v91 int) = (r5v89 int), (r5v88 int), (r5v88 int), (r5v88 int) binds: [B:375:0x05e7, B:356:0x05b7, B:357:0x05b9, B:359:0x05bd] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:385:0x05fa  */
    /* JADX WARN: Code duplicated, block: B:388:0x0627  */
    /* JADX WARN: Code duplicated, block: B:392:0x063b A[Catch: all -> 0x064a, TryCatch #1 {all -> 0x064a, blocks: (B:390:0x0637, B:392:0x063b, B:395:0x064c, B:396:0x0656, B:398:0x065c, B:400:0x066b, B:402:0x066f), top: B:411:0x0637 }] */
    /* JADX WARN: Code duplicated, block: B:398:0x065c A[Catch: all -> 0x064a, TryCatch #1 {all -> 0x064a, blocks: (B:390:0x0637, B:392:0x063b, B:395:0x064c, B:396:0x0656, B:398:0x065c, B:400:0x066b, B:402:0x066f), top: B:411:0x0637 }] */
    /* JADX WARN: Code duplicated, block: B:408:0x067b A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:411:0x0637 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.xf
    public final void s(l3d l3dVar, v2a v2aVar) {
        int i;
        boolean z;
        int i2;
        int i3;
        int i4;
        int i5;
        gx gxVar;
        gx gxVar2;
        int i6;
        int i7;
        int i8;
        ed7 ed7Var;
        int i9;
        int i10;
        int i11;
        boolean z2;
        xc5 xc5Var;
        String str;
        Iterator it;
        wc5 wc5Var;
        g0a g0aVar;
        b87 b87Var;
        wu5 wu5Var;
        int i12;
        if (((cx6) v2aVar.b).a.size() == 0) {
            return;
        }
        int i13 = 0;
        while (true) {
            boolean z3 = true;
            if (i13 >= ((cx6) v2aVar.b).a.size()) {
                break;
            }
            int iB = ((cx6) v2aVar.b).b(i13);
            wf wfVar = (wf) ((SparseArray) v2aVar.c).get(iB);
            wfVar.getClass();
            xc5 xc5Var2 = this.c;
            if (iB == 0) {
                synchronized (xc5Var2) {
                    try {
                        xc5Var2.d.getClass();
                        ush ushVar = xc5Var2.e;
                        xc5Var2.e = wfVar.b;
                        Iterator it2 = xc5Var2.c.values().iterator();
                        while (it2.hasNext()) {
                            wc5 wc5Var2 = (wc5) it2.next();
                            if (!wc5Var2.l(ushVar, xc5Var2.e) || wc5Var2.j(wfVar)) {
                                it2.remove();
                                if (wc5Var2.a.equals(xc5Var2.f)) {
                                    xc5Var2.a(wc5Var2);
                                }
                                if (wc5Var2.e) {
                                    xc5Var2.d.d(wfVar, wc5Var2.a);
                                }
                            }
                        }
                        xc5Var2.e(wfVar);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } else if (iB == 11) {
                int i14 = this.l;
                synchronized (xc5Var2) {
                    try {
                        xc5Var2.d.getClass();
                        if (i14 != 0) {
                            z3 = false;
                        }
                        Iterator it3 = xc5Var2.c.values().iterator();
                        while (it3.hasNext()) {
                            wc5 wc5Var3 = (wc5) it3.next();
                            if (wc5Var3.j(wfVar)) {
                                it3.remove();
                                boolean zEquals = wc5Var3.a.equals(xc5Var2.f);
                                if (zEquals) {
                                    xc5Var2.a(wc5Var3);
                                }
                                if (wc5Var3.e) {
                                    if (z3 && zEquals) {
                                        boolean unused = wc5Var3.f;
                                    }
                                    xc5Var2.d.d(wfVar, wc5Var3.a);
                                }
                            }
                        }
                        xc5Var2.e(wfVar);
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            } else {
                xc5Var2.f(wfVar);
            }
            i13++;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (v2aVar.l(0)) {
            wf wfVar2 = (wf) ((SparseArray) v2aVar.c).get(0);
            wfVar2.getClass();
            if (this.k != null) {
                c(wfVar2.b, wfVar2.d);
            }
        }
        if (v2aVar.l(2) && this.k != null) {
            a98 a98VarListIterator = l3dVar.q().a.listIterator(0);
            loop3: while (true) {
                if (!a98VarListIterator.hasNext()) {
                    wu5Var = null;
                    break;
                }
                ezh ezhVar = (ezh) a98VarListIterator.next();
                for (int i15 = 0; i15 < ezhVar.a; i15++) {
                    if (ezhVar.g(i15) && (wu5Var = ezhVar.c(i15).r) != null) {
                        break loop3;
                    }
                }
            }
            if (wu5Var != null) {
                PlaybackMetrics.Builder builder = this.k;
                String str2 = vqi.a;
                PlaybackMetrics.Builder builderN = oi2.n(builder);
                int i16 = 0;
                while (true) {
                    if (i16 >= wu5Var.d) {
                        i12 = 1;
                        break;
                    }
                    UUID uuid = wu5Var.b(i16).b;
                    if (uuid.equals(f71.d)) {
                        i12 = 3;
                        break;
                    } else if (uuid.equals(f71.e)) {
                        i12 = 2;
                        break;
                    } else {
                        if (uuid.equals(f71.c)) {
                            i12 = 6;
                            break;
                        }
                        i16++;
                    }
                }
                builderN.setDrmType(i12);
            }
        }
        if (v2aVar.l(1011)) {
            this.A++;
        }
        PlaybackException playbackException = this.o;
        int i17 = 5;
        if (playbackException == null) {
            i7 = 1;
            i8 = 2;
            i2 = 9;
            i3 = 8;
            i4 = 7;
            i5 = 6;
        } else {
            int i18 = playbackException.a;
            Context context = this.a;
            boolean z4 = this.w == 4;
            if (i18 == 1001) {
                gxVar = new gx(20, 0);
            } else {
                if (playbackException instanceof ExoPlaybackException) {
                    ExoPlaybackException exoPlaybackException = (ExoPlaybackException) playbackException;
                    z = exoPlaybackException.j == 1;
                    i = exoPlaybackException.n;
                } else {
                    i = 0;
                    z = false;
                }
                Throwable cause = playbackException.getCause();
                cause.getClass();
                int i19 = 27;
                if (!(cause instanceof IOException)) {
                    i2 = 9;
                    i3 = 8;
                    i4 = 7;
                    i5 = 6;
                    if (z && (i == 0 || i == 1)) {
                        gxVar = new gx(35, 0);
                    } else if (z && i == 3) {
                        gxVar = new gx(15, 0);
                    } else if (z && i == 2) {
                        gxVar = new gx(23, 0);
                    } else {
                        if (cause instanceof MediaCodecRenderer$DecoderInitializationException) {
                            gxVar2 = new gx(13, vqi.D(((MediaCodecRenderer$DecoderInitializationException) cause).d));
                        } else if (cause instanceof MediaCodecDecoderException) {
                            gxVar2 = new gx(14, ((MediaCodecDecoderException) cause).b);
                        } else if (cause instanceof OutOfMemoryError) {
                            gxVar = new gx(14, 0);
                        } else if (cause instanceof AudioSink$InitializationException) {
                            gxVar = new gx(17, 0);
                        } else if (cause instanceof AudioSink$WriteException) {
                            gxVar2 = new gx(18, ((AudioSink$WriteException) cause).a);
                        } else if (cause instanceof MediaCodec.CryptoException) {
                            int errorCode = ((MediaCodec.CryptoException) cause).getErrorCode();
                            switch (vqi.C(errorCode)) {
                                case 6002:
                                    i19 = 24;
                                    break;
                                case 6003:
                                    i19 = 28;
                                    break;
                                case 6004:
                                    i19 = 25;
                                    break;
                                case 6005:
                                    i19 = 26;
                                    break;
                            }
                            gxVar = new gx(i19, errorCode);
                        } else {
                            gxVar = new gx(22, 0);
                        }
                        gxVar = gxVar2;
                    }
                } else if (cause instanceof HttpDataSource$InvalidResponseCodeException) {
                    gxVar = new gx(5, ((HttpDataSource$InvalidResponseCodeException) cause).c);
                } else if ((cause instanceof HttpDataSource$InvalidContentTypeException) || (cause instanceof ParserException)) {
                    i2 = 9;
                    i4 = 7;
                    i5 = 6;
                    i3 = 8;
                    gxVar = new gx(z4 ? 10 : 11, 0);
                } else {
                    boolean z5 = cause instanceof HttpDataSource$HttpDataSourceException;
                    if (z5 || (cause instanceof UdpDataSource$UdpDataSourceException)) {
                        i2 = 9;
                        if (ndb.a(context).b() == 1) {
                            gxVar = new gx(3, 0);
                        } else {
                            Throwable cause2 = cause.getCause();
                            if (cause2 instanceof UnknownHostException) {
                                gxVar = new gx(6, 0);
                                i5 = 6;
                                i3 = 8;
                                i4 = 7;
                            } else {
                                if (cause2 instanceof SocketTimeoutException) {
                                    i6 = 7;
                                    gxVar = new gx(7, 0);
                                } else {
                                    i6 = 7;
                                    if (z5 && ((HttpDataSource$HttpDataSourceException) cause).b == 1) {
                                        gxVar = new gx(4, 0);
                                    } else {
                                        gxVar = new gx(8, 0);
                                        i4 = 7;
                                        i5 = 6;
                                        i3 = 8;
                                    }
                                }
                                i4 = i6;
                                i5 = 6;
                                i3 = 8;
                            }
                        }
                    } else if (i18 == 1002) {
                        gxVar = new gx(21, 0);
                    } else if (cause instanceof DrmSession$DrmSessionException) {
                        Throwable cause3 = cause.getCause();
                        cause3.getClass();
                        if (cause3 instanceof MediaDrm.MediaDrmStateException) {
                            int iD = vqi.D(((MediaDrm.MediaDrmStateException) cause3).getDiagnosticInfo());
                            switch (vqi.C(iD)) {
                                case 6002:
                                    i19 = 24;
                                    break;
                                case 6003:
                                    i19 = 28;
                                    break;
                                case 6004:
                                    i19 = 25;
                                    break;
                                case 6005:
                                    i19 = 26;
                                    break;
                            }
                            gxVar = new gx(i19, iD);
                        } else if (cause3 instanceof MediaDrmResetException) {
                            gxVar = new gx(27, 0);
                        } else if (cause3 instanceof NotProvisionedException) {
                            gxVar = new gx(24, 0);
                        } else if (cause3 instanceof DeniedByServerException) {
                            gxVar = new gx(29, 0);
                        } else if (cause3 instanceof UnsupportedDrmException) {
                            gxVar = new gx(23, 0);
                        } else {
                            gxVar = cause3 instanceof DefaultDrmSessionManager$MissingSchemeDataException ? new gx(28, 0) : new gx(30, 0);
                        }
                    } else if ((cause instanceof FileDataSource$FileDataSourceException) && (cause.getCause() instanceof FileNotFoundException)) {
                        Throwable cause4 = cause.getCause();
                        cause4.getClass();
                        Throwable cause5 = cause4.getCause();
                        gxVar = ((cause5 instanceof ErrnoException) && ((ErrnoException) cause5).errno == OsConstants.EACCES) ? new gx(32, 0) : new gx(31, 0);
                    } else {
                        i2 = 9;
                        gxVar = new gx(9, 0);
                    }
                    i3 = 8;
                    i4 = 7;
                    i5 = 6;
                }
                this.b.execute(new o90(this, 12, oi2.i().setTimeSinceCreatedMillis(jElapsedRealtime - this.e).setErrorCode(gxVar.a).setSubErrorCode(gxVar.b).setException(playbackException).build()));
                i7 = 1;
                this.B = true;
                this.o = null;
                i8 = 2;
            }
            i2 = 9;
            i3 = 8;
            i4 = 7;
            i5 = 6;
            this.b.execute(new o90(this, 12, oi2.i().setTimeSinceCreatedMillis(jElapsedRealtime - this.e).setErrorCode(gxVar.a).setSubErrorCode(gxVar.b).setException(playbackException).build()));
            i7 = 1;
            this.B = true;
            this.o = null;
            i8 = 2;
        }
        if (v2aVar.l(i8)) {
            fzh fzhVarQ = l3dVar.q();
            boolean zA = fzhVarQ.a(i8);
            boolean zA2 = fzhVarQ.a(i7);
            boolean zA3 = fzhVarQ.a(3);
            if (zA || zA2 || zA3) {
                if (zA) {
                    b87Var = null;
                } else if (Objects.equals(this.s, null)) {
                    b87Var = null;
                } else {
                    int i20 = this.s == null ? 1 : 0;
                    this.s = null;
                    b87Var = null;
                    e(1, jElapsedRealtime, null, i20);
                }
                if (!zA2 && !Objects.equals(this.t, b87Var)) {
                    int i21 = this.t == null ? 1 : 0;
                    this.t = b87Var;
                    e(0, jElapsedRealtime, b87Var, i21);
                }
                if (!zA3 && !Objects.equals(this.u, b87Var)) {
                    int i22 = this.u == null ? 1 : 0;
                    this.u = b87Var;
                    e(2, jElapsedRealtime, b87Var, i22);
                }
                ed7Var = b87Var;
            } else {
                i17 = 5;
                ed7Var = 0;
            }
        } else {
            i17 = 5;
            ed7Var = 0;
        }
        if (a(this.p)) {
            ed7 ed7Var2 = this.p;
            b87 b87Var2 = (b87) ed7Var2.c;
            if (b87Var2.v != -1) {
                int i23 = ed7Var2.b;
                if (!Objects.equals(this.s, b87Var2)) {
                    int i24 = (this.s == null && i23 == 0) ? 1 : i23;
                    this.s = b87Var2;
                    e(1, jElapsedRealtime, b87Var2, i24);
                }
                this.p = ed7Var;
            }
        }
        if (a(this.q)) {
            ed7 ed7Var3 = this.q;
            b87 b87Var3 = (b87) ed7Var3.c;
            int i25 = ed7Var3.b;
            if (!Objects.equals(this.t, b87Var3)) {
                int i26 = (this.t == null && i25 == 0) ? 1 : i25;
                this.t = b87Var3;
                e(0, jElapsedRealtime, b87Var3, i26);
            }
            this.q = ed7Var;
        }
        if (a(this.r)) {
            ed7 ed7Var4 = this.r;
            b87 b87Var4 = (b87) ed7Var4.c;
            int i27 = ed7Var4.b;
            if (!Objects.equals(this.u, b87Var4)) {
                int i28 = (this.u == null && i27 == 0) ? 1 : i27;
                this.u = b87Var4;
                e(2, jElapsedRealtime, b87Var4, i28);
            }
            this.r = ed7Var;
        }
        switch (ndb.a(this.a).b()) {
            case 0:
                i9 = 0;
                break;
            case 1:
                i9 = i2;
                break;
            case 2:
                i9 = 2;
                break;
            case 3:
                i9 = 4;
                break;
            case 4:
                i9 = i17;
                break;
            case 5:
                i9 = i5;
                break;
            case 6:
            case 8:
            default:
                i9 = 1;
                break;
            case 7:
                i9 = 3;
                break;
            case 9:
                i9 = i3;
                break;
            case 10:
                i9 = i4;
                break;
        }
        if (i9 != this.n) {
            this.n = i9;
            i10 = 11;
            this.b.execute(new o90(this, i10, oi2.e().setNetworkType(i9).setTimeSinceCreatedMillis(jElapsedRealtime - this.e).build()));
        } else {
            i10 = 11;
        }
        if (l3dVar.getPlaybackState() != 2) {
            this.v = false;
        }
        if (l3dVar.m() == null) {
            this.x = false;
            i11 = 10;
        } else {
            i11 = 10;
            if (v2aVar.l(10)) {
                this.x = true;
            }
        }
        int playbackState = l3dVar.getPlaybackState();
        if (!this.v) {
            if (this.x) {
                z2 = true;
                i10 = 13;
            } else if (playbackState != 4) {
                int i29 = 2;
                if (playbackState == 2) {
                    int i30 = this.m;
                    if (i30 == 0 || i30 == 2 || i30 == 12) {
                        i10 = i29;
                    } else if (l3dVar.z()) {
                        i10 = l3dVar.u() != 0 ? i11 : i5;
                    } else {
                        i10 = i4;
                    }
                } else {
                    i29 = 3;
                    if (playbackState != 3) {
                        z2 = true;
                        i10 = (playbackState != 1 || this.m == 0) ? this.m : 12;
                    } else if (!l3dVar.z()) {
                        i10 = 4;
                    } else if (l3dVar.u() != 0) {
                        i10 = i2;
                    } else {
                        i10 = i29;
                    }
                }
            }
            if (this.m != i10) {
                this.m = i10;
                this.B = z2;
                this.b.execute(new o90(this, 13, oi2.p().setState(this.m).setTimeSinceCreatedMillis(jElapsedRealtime - this.e).build()));
            }
            if (v2aVar.l(1028)) {
                xc5Var = this.c;
                wf wfVar3 = (wf) ((SparseArray) v2aVar.c).get(1028);
                wfVar3.getClass();
                synchronized (xc5Var) {
                    try {
                        str = xc5Var.f;
                        if (str != null) {
                            wc5 wc5Var4 = (wc5) xc5Var.c.get(str);
                            wc5Var4.getClass();
                            xc5Var.a(wc5Var4);
                        }
                        it = xc5Var.c.values().iterator();
                        while (it.hasNext()) {
                            wc5Var = (wc5) it.next();
                            it.remove();
                            if (!wc5Var.e && (g0aVar = xc5Var.d) != null) {
                                g0aVar.d(wfVar3, wc5Var.a);
                            }
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
            }
        }
        i10 = i17;
        z2 = true;
        if (this.m != i10) {
            this.m = i10;
            this.B = z2;
            this.b.execute(new o90(this, 13, oi2.p().setState(this.m).setTimeSinceCreatedMillis(jElapsedRealtime - this.e).build()));
        }
        if (v2aVar.l(1028)) {
            xc5Var = this.c;
            wf wfVar4 = (wf) ((SparseArray) v2aVar.c).get(1028);
            wfVar4.getClass();
            synchronized (xc5Var) {
                str = xc5Var.f;
                if (str != null) {
                    wc5 wc5Var5 = (wc5) xc5Var.c.get(str);
                    wc5Var5.getClass();
                    xc5Var.a(wc5Var5);
                }
                it = xc5Var.c.values().iterator();
                while (it.hasNext()) {
                    wc5Var = (wc5) it.next();
                    it.remove();
                    if (!wc5Var.e) {
                    }
                }
            }
        }
    }

    @Override // defpackage.xf
    public final void u(wf wfVar, t99 t99Var, uz9 uz9Var, IOException iOException, boolean z) {
        this.w = uz9Var.a;
    }
}
