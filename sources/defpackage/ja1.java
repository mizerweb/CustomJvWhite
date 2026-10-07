package defpackage;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.PowerManager;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Log;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.work.impl.foreground.SystemForegroundService;
import java.io.File;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import one.video.exo.error.OneVideoExoPlaybackException;
import org.webrtc.EglBase;
import org.webrtc.HardwareVideoEncoderFactory;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.sessionroom.internal.participant.SessionRoomParticipantsDataProviderImpl;
import ru.ok.android.externcalls.sdk.stereo.internal.StereoRoomManagerImpl;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ja1 implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ ja1(ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, zec zecVar) {
        this.a = 9;
        this.c = ny8Var;
        this.d = ny8Var2;
        this.e = ny8Var3;
        this.b = zecVar;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:99:0x040d  */
    @Override // defpackage.af7
    public final Object invoke() {
        int length;
        String string;
        j60 j60Var;
        String str;
        File file;
        switch (this.a) {
            case 0:
                return new va1((ya1) this.b, (ny8) this.c, (ny8) this.d, (ny8) this.e);
            case 1:
                Context context = (Context) this.b;
                yg0 yg0Var = (yg0) this.c;
                jj0 jj0Var = (jj0) this.d;
                uvc uvcVar = (uvc) this.e;
                Trace.beginSection("CameraFactoryAdapter#appComponent");
                long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                r05 r05Var = new r05(new yfj(context, yg0Var, (lg2) ((ifh) jj0Var.a).getValue(), uvcVar, (je2) jj0Var.e, (ui2) jj0Var.d));
                if (tvj.f(3, "CXCP")) {
                    Log.d("CXCP", "Created CameraFactoryAdapter in ".concat(String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf((SystemClock.elapsedRealtimeNanos() - jElapsedRealtimeNanos) / 1000000.0d)}, 1))));
                }
                Trace.endSection();
                return r05Var;
            case 2:
                qe2 qe2Var = (qe2) this.b;
                Context context2 = (Context) this.c;
                yg0 yg0Var2 = (yg0) this.d;
                hw5 hw5Var = (hw5) this.e;
                try {
                    Trace.beginSection("Create CameraPipe");
                    long jElapsedRealtimeNanos2 = SystemClock.elapsedRealtimeNanos();
                    Context contextA = jq4.a(context2);
                    jg2 jg2Var = new jg2(new eif(yg0Var2.a), 119);
                    uvc uvcVar2 = qe2Var.a;
                    lg2 lg2VarA = ng2.a(new hg2(contextA, jg2Var, new gg2((uf2) uvcVar2.b, (xp9) uvcVar2.c, hw5Var)));
                    if (tvj.f(3, "CXCP")) {
                        Log.d("CXCP", "Created CameraPipe in ".concat(String.format(null, "%.3f ms", Arrays.copyOf(new Object[]{Double.valueOf((SystemClock.elapsedRealtimeNanos() - jElapsedRealtimeNanos2) / 1000000.0d)}, 1))));
                        break;
                    }
                    return lg2VarA;
                } finally {
                    Trace.endSection();
                }
            case 3:
                return ((qw2) this.b).q(lx2.b, (List) this.c, (String) this.d, (String) this.e);
            case 4:
                ae5 ae5Var = (ae5) this.b;
                String str2 = (String) this.c;
                wfe wfeVar = (wfe) this.d;
                wfe wfeVar2 = (wfe) this.e;
                String strK = "[]";
                File fileS = ((ju6) ((rs6) ae5Var.d.getValue())).s(str2 + "_" + UUID.randomUUID(), "jpg");
                wfeVar.a = fileS;
                q3m.g(fileS.getAbsolutePath(), (Bitmap) ((au3) wfeVar2.a).K(), 100, Bitmap.CompressFormat.JPEG);
                String str3 = ae5Var.f;
                a4c a4cVar = gm0.f;
                if (a4cVar != null) {
                    je9 je9Var = je9.d;
                    if (a4cVar.b(je9Var)) {
                        Object absolutePath = fileS.getAbsolutePath();
                        if (gm0.c()) {
                            string = absolutePath.toString();
                        } else {
                            if (absolutePath instanceof Collection) {
                                Collection collection = (Collection) absolutePath;
                                if (!collection.isEmpty()) {
                                    length = collection.size();
                                    strK = c0a.k(length, "[**", "**]");
                                }
                            } else if (absolutePath instanceof Map) {
                                Map map = (Map) absolutePath;
                                strK = map.isEmpty() ? "{}" : c0a.k(map.size(), "{**", "**}");
                            } else if (absolutePath instanceof Object[]) {
                                Object[] objArr = (Object[]) absolutePath;
                                if (objArr.length != 0) {
                                    length = objArr.length;
                                    strK = c0a.k(length, "[**", "**]");
                                }
                            } else if (absolutePath instanceof int[]) {
                                int[] iArr = (int[]) absolutePath;
                                if (iArr.length != 0) {
                                    length = iArr.length;
                                    strK = c0a.k(length, "[**", "**]");
                                }
                            } else if (absolutePath instanceof float[]) {
                                float[] fArr = (float[]) absolutePath;
                                if (fArr.length != 0) {
                                    length = fArr.length;
                                    strK = c0a.k(length, "[**", "**]");
                                }
                            } else if (absolutePath instanceof long[]) {
                                long[] jArr = (long[]) absolutePath;
                                if (jArr.length != 0) {
                                    length = jArr.length;
                                    strK = c0a.k(length, "[**", "**]");
                                }
                            } else if (absolutePath instanceof double[]) {
                                double[] dArr = (double[]) absolutePath;
                                if (dArr.length != 0) {
                                    length = dArr.length;
                                    strK = c0a.k(length, "[**", "**]");
                                }
                            } else if (absolutePath instanceof short[]) {
                                short[] sArr = (short[]) absolutePath;
                                if (sArr.length != 0) {
                                    length = sArr.length;
                                    strK = c0a.k(length, "[**", "**]");
                                }
                            } else if (absolutePath instanceof byte[]) {
                                byte[] bArr = (byte[]) absolutePath;
                                if (bArr.length != 0) {
                                    length = bArr.length;
                                    strK = c0a.k(length, "[**", "**]");
                                }
                            } else if (absolutePath instanceof char[]) {
                                char[] cArr = (char[]) absolutePath;
                                if (cArr.length != 0) {
                                    length = cArr.length;
                                    strK = c0a.k(length, "[**", "**]");
                                }
                            } else if (absolutePath instanceof boolean[]) {
                                boolean[] zArr = (boolean[]) absolutePath;
                                if (zArr.length != 0) {
                                    length = zArr.length;
                                    strK = c0a.k(length, "[**", "**]");
                                }
                            } else {
                                strK = "***";
                            }
                            string = strK;
                        }
                        a4cVar.c(je9Var, str3, qt4.n("Story image rendered to ", string, ". File is ready - ", ku6.p(fileS.getAbsolutePath())), null);
                    }
                }
                return fileS;
            case 5:
                er5 er5Var = (er5) this.b;
                ny8 ny8Var = (ny8) this.c;
                ny8 ny8Var2 = (ny8) this.d;
                ny8 ny8Var3 = (ny8) this.e;
                pjh pjhVar = er5Var.a;
                long j = pjhVar.c;
                long j2 = pjhVar.f;
                long j3 = pjhVar.e;
                long j4 = pjhVar.d;
                if (j > 0) {
                    return pjhVar.n ? ((ju6) ((rs6) ny8Var.getValue())).u(j) : ((ju6) ((rs6) ny8Var.getValue())).v(j);
                }
                if (j4 > 0) {
                    return ((Boolean) ((e5d) ny8Var2.getValue()).R3.a(e5d.S6[253]).i()).booleanValue() ? ((ju6) ((rs6) ny8Var.getValue())).h(j4, qs6.a) : new File(((ju6) ((rs6) ny8Var.getValue())).e(false), nbh.s(j4, "audio_", ".wav"));
                }
                if (j3 > 0) {
                    ju6 ju6Var = (ju6) ((rs6) ny8Var.getValue());
                    ju6Var.getClass();
                    return new File(ju6.j(ju6Var.b(), "gifCache"), zo5.j(j3, "gif_"));
                }
                if (j2 > 0) {
                    ju6 ju6Var2 = (ju6) ((rs6) ny8Var.getValue());
                    ju6Var2.getClass();
                    return new File(ju6.j(ju6Var2.b(), "stickerCache"), zo5.j(j2, "sticker_"));
                }
                if (pjhVar.j > 0) {
                    sfa sfaVarL = ((qfa) ((sua) ny8Var3.getValue()).f.getValue()).l(pjhVar.a);
                    if (sfaVarL != null) {
                        c46 c46Var = sfaVarL.n;
                        if (c46Var != null) {
                            e70 e70VarL = c46Var.l(y60.j);
                            if (e70VarL == null || (j60Var = e70VarL.j) == null || (str = e70VarL.u) == null || str.length() == 0) {
                                file = null;
                            } else {
                                File file2 = new File(str);
                                if (file2.exists() && file2.length() == j60Var.b && file2.lastModified() == e70VarL.y) {
                                    file = file2;
                                } else {
                                    file = null;
                                }
                            }
                        } else {
                            ore.p("Required value was null.");
                        }
                    } else {
                        file = null;
                    }
                    return file == null ? ((ju6) ((rs6) ny8Var.getValue())).k(pjhVar.k) : file;
                }
                return null;
            case 6:
                ga7 ga7Var = (ga7) this.b;
                OneVideoExoPlaybackException oneVideoExoPlaybackException = (OneVideoExoPlaybackException) this.c;
                m4j m4jVar = (m4j) this.d;
                aec aecVar = (aec) this.e;
                Iterator it = ga7Var.b.iterator();
                while (it.hasNext()) {
                    ((xdc) it.next()).q(oneVideoExoPlaybackException, m4jVar, aecVar);
                }
                return sbi.a;
            case 7:
                qfa qfaVar = (qfa) this.b;
                gda gdaVar = (gda) this.c;
                o3b o3bVar = (o3b) this.d;
                sfa sfaVar = (sfa) this.e;
                long j5 = gdaVar.a;
                long j6 = gdaVar.c;
                bq bqVar = o3bVar.e;
                if (bqVar == null) {
                    bqVar = null;
                }
                qfaVar.t(j5, j6, Long.valueOf(((s7f) bqVar.e()).f()));
                qfaVar.p(sfaVar, xfa.SENT);
                b50 b50Var = gdaVar.h;
                bq bqVar2 = o3bVar.e;
                qfaVar.o(sfaVar, pm9.e(b50Var, (m7f) (bqVar2 != null ? bqVar2 : null).M.getValue()));
                return sbi.a;
            case 8:
                sfe sfeVar = (sfe) this.b;
                sfe sfeVar2 = (sfe) this.c;
                nub nubVar = (nub) this.d;
                dvb dvbVar = (dvb) this.e;
                if (sfeVar.a && sfeVar2.a) {
                    FrameLayout frameLayout = (FrameLayout) nubVar.h;
                    if (frameLayout != null) {
                        nubVar.h = null;
                        ((ViewGroup) nubVar.c).removeView(frameLayout);
                    }
                    nubVar.a = false;
                    dvbVar.invoke();
                }
                return sbi.a;
            case 9:
                ny8 ny8Var4 = (ny8) this.c;
                ny8 ny8Var5 = (ny8) this.d;
                ny8 ny8Var6 = (ny8) this.e;
                zec zecVar = (zec) this.b;
                return new uhi(ny8Var4, ny8Var5, ny8Var6, zecVar.d, zecVar.g, zecVar.i);
            case 10:
                EglBase.Context context3 = (EglBase.Context) this.b;
                ioc iocVar = (ioc) this.c;
                try {
                    return new HardwareVideoEncoderFactory(context3, false, false, iocVar.a.r.E.a(), (ou7) this.d, (b1k) this.e);
                } catch (Throwable th) {
                    return new hoc(iocVar.b, new IllegalStateException("Can't create HardwareVideoEncoder", th));
                }
            case 11:
                c8e c8eVar = (c8e) this.b;
                v24 v24Var = (v24) this.d;
                lua luaVar = (lua) this.e;
                ny8 ny8Var7 = (ny8) this.c;
                q24 q24Var = c8eVar.d;
                return q24Var != null ? new u24(q24Var, v24Var.a, v24Var.b, v24Var.c, v24Var.d, v24Var.e, v24Var.f, v24Var.g, v24Var.h, v24Var.i, v24Var.j, v24Var.k, v24Var.l, v24Var.m, v24Var.n, v24Var.o) : luaVar.a(c8eVar.c, new ifh(new w40(ny8Var7, 28)));
            case 12:
                return new sw1((ny8) this.c, (ny8) this.d, (ny8) this.e, (Context) ((eqe) this.b).c.getValue());
            case 13:
                return SessionRoomParticipantsDataProviderImpl.getRoomParticipants$lambda$0((cf7) this.b, (dnf) this.c, (SessionRoomParticipantsDataProviderImpl) this.d, (Collection) this.e);
            case 14:
                return StereoRoomManagerImpl.unpromoteParticipant$lambda$0((StereoRoomManagerImpl) this.b, (ParticipantId) this.c, (af7) this.d, (cf7) this.e);
            case 15:
                j3h j3hVar = (j3h) this.b;
                r6a r6aVar = (r6a) this.c;
                qzh qzhVar = (qzh) this.d;
                Bitmap bitmap = (Bitmap) this.e;
                String str4 = j3hVar.a;
                a4c a4cVar2 = gm0.f;
                if (a4cVar2 != null) {
                    je9 je9Var2 = je9.d;
                    if (a4cVar2.b(je9Var2)) {
                        x86 x86Var = qzhVar.a;
                        int i = x86Var.c;
                        int i2 = x86Var.a;
                        int i3 = x86Var.b;
                        stg stgVar = qzhVar.b;
                        int i4 = stgVar.c;
                        int i5 = stgVar.b;
                        int i6 = stgVar.a;
                        boolean z = qzhVar.d;
                        boolean z2 = qzhVar.e;
                        int width = bitmap.getWidth();
                        int height = bitmap.getHeight();
                        Long l = qzhVar.c;
                        boolean z3 = qzhVar.f;
                        boolean z4 = qzhVar.g;
                        boolean z5 = qzhVar.h;
                        boolean z6 = qzhVar.i;
                        boolean z7 = qzhVar.j;
                        StringBuilder sbP = qv1.p("story transcode: starting with bitrate: ", i, ", size: ", i2, "x");
                        qt4.x(i3, i4, ", quality<=", ", bitrate<=", sbP);
                        qt4.x(i5, i6, "kbps, fps<=", ", cbr: ", sbP);
                        qt4.B(" (forced=", "), overlay: ", sbP, z, z2);
                        qt4.x(width, height, "x", ", max_output_duration_mcs: ", sbP);
                        sbP.append(l);
                        sbP.append(", portrait_encoding=");
                        sbP.append(z3);
                        sbP.append(", b_frames_disabled<=");
                        qt4.B(", encoder_parameters_disabled<=", ", hdr_allowed<=", sbP, z4, z5);
                        sbP.append(z6);
                        sbP.append(", hdr_tone_mapping_via_codec<=");
                        sbP.append(z7);
                        a4cVar2.c(je9Var2, str4, sbP.toString(), null);
                    }
                }
                return r6aVar.z();
            default:
                hyj hyjVar = (hyj) this.b;
                UUID uuid = (UUID) this.c;
                q77 q77Var = (q77) this.d;
                Context context4 = (Context) this.e;
                String string2 = uuid.toString();
                mzj mzjVarD = hyjVar.c.d(string2);
                if (mzjVarD == null || mzjVarD.b.a()) {
                    ore.k("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                } else {
                    ijd ijdVar = hyjVar.b;
                    synchronized (ijdVar.k) {
                        try {
                            n1g.x().J(ijd.l, "Moving WorkSpec (" + string2 + ") to the foreground");
                            h0k h0kVar = (h0k) ijdVar.g.remove(string2);
                            if (h0kVar != null) {
                                if (ijdVar.a == null) {
                                    PowerManager.WakeLock wakeLockA = ybj.a(ijdVar.b);
                                    ijdVar.a = wakeLockA;
                                    wakeLockA.acquire();
                                }
                                ijdVar.f.put(string2, h0kVar);
                                ijdVar.b.startForegroundService(qfh.c(ijdVar.b, wk8.n(h0kVar.a), q77Var));
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                        break;
                    }
                    iyj iyjVarN = wk8.n(mzjVarD);
                    String str5 = qfh.j;
                    Intent intent = new Intent(context4, (Class<?>) SystemForegroundService.class);
                    intent.setAction("ACTION_NOTIFY");
                    intent.putExtra("KEY_NOTIFICATION_ID", q77Var.a);
                    intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", q77Var.b);
                    intent.putExtra("KEY_NOTIFICATION", q77Var.c);
                    intent.putExtra("KEY_WORKSPEC_ID", iyjVarN.a);
                    intent.putExtra("KEY_GENERATION", iyjVarN.b);
                    context4.startService(intent);
                }
                return null;
        }
    }

    public /* synthetic */ ja1(c8e c8eVar, v24 v24Var, lua luaVar, ny8 ny8Var) {
        this.a = 11;
        this.b = c8eVar;
        this.d = v24Var;
        this.e = luaVar;
        this.c = ny8Var;
    }

    public /* synthetic */ ja1(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }
}
