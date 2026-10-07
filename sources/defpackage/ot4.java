package defpackage;

import android.util.Log;
import android.view.View;
import androidx.camera.core.ImageCaptureException;
import com.google.firebase.encoders.EncodingException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import kotlin.collections.a;
import one.me.calllist.ui.callinfo.CallLinkInfoScreen;
import one.me.calls.ui.bottomsheet.opponents.CallOpponentsListWidget;
import one.me.calls.ui.ui.debugmenu.CallDebugMenuScreen;
import one.me.calls.ui.ui.settings.CallAdminSettingsScreen;
import one.me.main.accountswitcher.AccountSwitcherBottomSheet;
import one.me.profile.screens.members.ChatAdminsScreen;
import one.me.settings.privacy.ui.ChangeDisabledDialog;
import org.apache.http.HttpStatus;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.protocol.HTTP;
import org.webrtc.NativeDoubleArrayConsumer;
import ru.ok.android.externcalls.analytics.internal.api.CallAnalyticsApiRequest;
import ru.ok.android.externcalls.sdk.api.CallInfo;
import ru.ok.android.externcalls.sdk.audio.VideoTracker;
import ru.ok.android.externcalls.sdk.factory.internal.CidLogger;
import ru.ok.android.externcalls.sdk.media.mute.MediaMuteManager;
import ru.ok.android.externcalls.sdk.participant.state.ParticipantStatesManager;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ot4 implements s72, qbf, NativeDoubleArrayConsumer.Consumer, cub, tg4, v7, hu8, yo, myb, z52, VideoTracker, n78, j59, i8c {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ot4(zi1 zi1Var, vy0 vy0Var) {
        this.a = 12;
        this.b = zi1Var;
    }

    @Override // defpackage.s72
    public Object Q(r72 r72Var) {
        e89 e89Var;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((up8) obj).Y(new j22(29, r72Var));
                return "Job.asListenableFuture";
            default:
                ri2 ri2Var = (ri2) obj;
                ri2Var.n.f();
                if (ri2Var.o.d()) {
                    oue oueVar = (oue) ri2Var.o.getValue();
                    synchronized (oueVar.a) {
                        oueVar.b.disable();
                        oueVar.c.clear();
                        oueVar.d = -1;
                    }
                }
                dh2 dh2Var = ri2Var.a;
                synchronized (dh2Var.a) {
                    try {
                        boolean zIsEmpty = dh2Var.b.isEmpty();
                        u72 u72Var = dh2Var.d;
                        e89 e89Var2 = u72Var;
                        u72 u72Var2 = u72Var;
                        if (zIsEmpty) {
                            if (u72Var == null) {
                                e89Var2 = g88.c;
                            }
                            e89Var = e89Var2;
                        } else {
                            if (u72Var == null) {
                                r72 r72Var2 = new r72();
                                r72Var2.c = new gne();
                                u72 u72Var3 = new u72(r72Var2);
                                r72Var2.b = u72Var3;
                                r72Var2.a = qt4.class;
                                try {
                                    synchronized (dh2Var.a) {
                                        dh2Var.e = r72Var2;
                                        break;
                                    }
                                    r72Var2.a = "CameraRepository-deinit";
                                } catch (Exception e) {
                                    u72Var3.c(e);
                                }
                                dh2Var.d = u72Var3;
                                u72Var2 = u72Var3;
                            }
                            dh2Var.c.addAll(dh2Var.b.values());
                            for (pf2 pf2Var : dh2Var.b.values()) {
                                pf2Var.release().b(new f92(dh2Var, 8, pf2Var), zjl.a());
                            }
                            dh2Var.b.clear();
                            e89Var = u72Var2;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                e89Var.b(new f92(ri2Var, 10, r72Var), ri2Var.d);
                return "CameraX shutdownInternal";
        }
    }

    @Override // defpackage.cub
    public void a(Object obj) {
        ((tc) this.b).invoke(obj);
    }

    @Override // defpackage.tg4
    public void accept(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 4:
                q60 q60Var = (q60) obj2;
                c60 c60Var = (c60) obj;
                if (c60Var.e == null && c60Var.d == null && c60Var.r == null) {
                    gm0.q("l70", "Attach is not audio/video/file. Ignore");
                } else if (c60Var.y != q60.c) {
                    c60Var.y = q60Var;
                } else {
                    gm0.q("l70", "Try to update processingOnServerStatus from PROCESSED. Ignore");
                }
                break;
            case 26:
                ((tw2) obj).p = (ax2) obj2;
                break;
            case 27:
                ge3 ge3Var = (ge3) obj2;
                tw2 tw2Var = (tw2) obj;
                cx2 cx2Var = tw2Var.o;
                if (cx2Var == null) {
                    cx2Var = cx2.h;
                }
                tw2Var.o = pm9.h(ge3Var, cx2Var);
                break;
            default:
                long j = ((rt2) obj2).b.n0;
                ((tw2) obj).o0 = j;
                gm0.n("kz2", "updated last delayed load time to: " + j);
                break;
        }
    }

    @Override // defpackage.j59
    public void b(View view, String str) {
        ChangeDisabledDialog changeDisabledDialog = (ChangeDisabledDialog) this.b;
        wtc wtcVar = changeDisabledDialog.u;
        o65 o65Var = (o65) wtcVar.getAccessor().c(184);
        jz jzVar = new jz(new xc3(((c59) wtcVar.getAccessor().d(216).getValue()).g(str), 20), 13);
        tc tcVar = new tc(changeDisabledDialog, 18, o65Var);
        int i = ChangeDisabledDialog.v;
        e9i.j0(new fz6(n1g.v(jzVar, changeDisabledDialog.getViewLifecycleOwner().f(), n09.d), new sp2(null, tcVar, 0), 3), changeDisabledDialog.getViewLifecycleScope());
    }

    @Override // defpackage.z52
    public void c(boolean z) {
        s52.w((s52) this.b, z);
    }

    @Override // org.webrtc.NativeDoubleArrayConsumer.Consumer
    public void consume(Double[] dArr) {
        nl nlVar = (nl) this.b;
        dArr.getClass();
        if (nlVar.i && nlVar.j) {
            Iterator it = nlVar.g.iterator();
            while (it.hasNext()) {
                ((zl) it.next()).a(dArr);
            }
        }
        ((AtomicInteger) nlVar.e.g).incrementAndGet();
    }

    public zg2 d(r6a r6aVar) throws IOException {
        go2 go2Var = (go2) this.b;
        URL url = (URL) r6aVar.a;
        String strConcat = "TRuntime.".concat("CctTransportBackend");
        if (Log.isLoggable(strConcat, 4)) {
            Log.i(strConcat, String.format("Making request to: %s", url));
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(go2Var.g);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod(HttpPost.METHOD_NAME);
        httpURLConnection.setRequestProperty(HTTP.USER_AGENT, "datatransport/3.1.9 android/");
        httpURLConnection.setRequestProperty(HTTP.CONTENT_ENCODING, "gzip");
        httpURLConnection.setRequestProperty(HTTP.CONTENT_TYPE, "application/json");
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        String str = (String) r6aVar.b;
        if (str != null) {
            httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
        }
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                try {
                    ex8 ex8Var = go2Var.a;
                    vg0 vg0Var = (vg0) r6aVar.c;
                    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(gZIPOutputStream));
                    ft8 ft8Var = (ft8) ex8Var.b;
                    jv8 jv8Var = new jv8(bufferedWriter, ft8Var.a, ft8Var.b, ft8Var.c, ft8Var.d);
                    jv8Var.f(vg0Var);
                    jv8Var.h();
                    jv8Var.b.flush();
                    gZIPOutputStream.close();
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    int responseCode = httpURLConnection.getResponseCode();
                    Integer numValueOf = Integer.valueOf(responseCode);
                    String strConcat2 = "TRuntime.".concat("CctTransportBackend");
                    if (Log.isLoggable(strConcat2, 4)) {
                        Log.i(strConcat2, String.format("Status Code: %d", numValueOf));
                    }
                    e2k.a("CctTransportBackend", "Content-Type: %s", httpURLConnection.getHeaderField(HTTP.CONTENT_TYPE));
                    e2k.a("CctTransportBackend", "Content-Encoding: %s", httpURLConnection.getHeaderField(HTTP.CONTENT_ENCODING));
                    if (responseCode == 302 || responseCode == 301 || responseCode == 307) {
                        return new zg2(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0L);
                    }
                    if (responseCode != 200) {
                        return new zg2(responseCode, null, 0L);
                    }
                    InputStream inputStream = httpURLConnection.getInputStream();
                    try {
                        InputStream gZIPInputStream = "gzip".equals(httpURLConnection.getHeaderField(HTTP.CONTENT_ENCODING)) ? new GZIPInputStream(inputStream) : inputStream;
                        try {
                            zg2 zg2Var = new zg2(responseCode, null, ai0.a(new BufferedReader(new InputStreamReader(gZIPInputStream))).a);
                            if (gZIPInputStream != null) {
                                gZIPInputStream.close();
                            }
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            return zg2Var;
                        } catch (Throwable th) {
                            if (gZIPInputStream == null) {
                                throw th;
                            }
                            try {
                                gZIPInputStream.close();
                                throw th;
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                                throw th;
                            }
                        }
                    } catch (Throwable th3) {
                        if (inputStream == null) {
                            throw th3;
                        }
                        try {
                            inputStream.close();
                            throw th3;
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                            throw th3;
                        }
                    }
                } catch (Throwable th5) {
                    try {
                        gZIPOutputStream.close();
                        throw th5;
                    } catch (Throwable th6) {
                        th5.addSuppressed(th6);
                        throw th5;
                    }
                }
            } catch (Throwable th7) {
                if (outputStream == null) {
                    throw th7;
                }
                try {
                    outputStream.close();
                    throw th7;
                } catch (Throwable th8) {
                    th7.addSuppressed(th8);
                    throw th7;
                }
            }
        } catch (EncodingException e) {
            e = e;
            e2k.b("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new zg2(HttpStatus.SC_BAD_REQUEST, null, 0L);
        } catch (ConnectException e2) {
            e = e2;
            e2k.b("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new zg2(500, null, 0L);
        } catch (UnknownHostException e3) {
            e = e3;
            e2k.b("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new zg2(500, null, 0L);
        } catch (IOException e4) {
            e = e4;
            e2k.b("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new zg2(HttpStatus.SC_BAD_REQUEST, null, 0L);
        }
    }

    @Override // defpackage.qbf
    public int e(int i) {
        int i2 = this.a;
        Object obj = this.b;
        switch (i2) {
            case 1:
                return ((i7) ((k79) ((AccountSwitcherBottomSheet) obj).x.F(i))).a();
            case 9:
                fb1 fb1Var = (fb1) ((k79) ((CallAdminSettingsScreen) obj).d.F(i));
                int iA = fb1Var.a();
                if (fb1Var.g()) {
                    return iA;
                }
                return 0;
            case 11:
                ag1 ag1Var = (ag1) ((k79) ((CallDebugMenuScreen) obj).d.F(i));
                int iA2 = ag1Var.a();
                if (ag1Var.g()) {
                    return iA2;
                }
                return 0;
            case 14:
                return ((cq1) ((k79) ((CallLinkInfoScreen) obj).q.F(i))).s();
            default:
                return 0;
        }
    }

    @Override // defpackage.myb
    public void g(int i) {
        final ya1 ya1Var;
        ParticipantStatesManager participantStatesManagerH;
        CallOpponentsListWidget callOpponentsListWidget = (CallOpponentsListWidget) this.b;
        zv8[] zv8VarArr = CallOpponentsListWidget.v;
        if (i == R.id.call_screen_opponents_list_link) {
            kt1 kt1VarP1 = callOpponentsListWidget.p1();
            a8j.x(kt1VarP1.t, new yx1(v3e.c(((dz4) kt1VarP1.C().z().getValue()).d)));
            return;
        }
        if (i == R.id.call_screen_opponents_list_add_users) {
            kt1 kt1VarP2 = callOpponentsListWidget.p1();
            Long l = ((be1) kt1VarP2.C().b().getValue()).a;
            if (l == null) {
                gm0.Y(kt1.class.getName(), "Early return in addUser cuz of callChatInfo.chatId is null");
                return;
            }
            long jLongValue = l.longValue();
            xb9 xb9Var = (xb9) ((et3) kt1VarP2.l.getValue());
            boolean zBooleanValue = ((Boolean) xb9Var.s0.m(xb9Var, xb9.g1[8])).booleanValue();
            ic6 ic6Var = kt1VarP2.t;
            if (!zBooleanValue) {
                a8j.x(ic6Var, by1.F);
                return;
            }
            cs1.b.getClass();
            bc1.q(":profile/add-members?chat_id=" + jLongValue + "&is_chat=true", ic6Var);
            return;
        }
        if (i == R.id.call_screen_opponents_list_invite_users) {
            kt1 kt1VarP3 = callOpponentsListWidget.p1();
            a8j.x(kt1VarP3.t, new ly1(v3e.c(((dz4) kt1VarP3.C().z().getValue()).d)));
            return;
        }
        o0a o0aVar = o0a.b;
        if (i == R.id.call_admin_settings_disable_all_cameras_once) {
            kt1 kt1VarP4 = callOpponentsListWidget.p1();
            final ya1 ya1Var2 = (ya1) ((da1) kt1VarP4.j.getValue());
            MediaMuteManager mediaMuteManagerG = ya1Var2.g();
            if (mediaMuteManagerG != null) {
                ul9 ul9Var = new ul9();
                ul9Var.put(n0a.b, o0aVar);
                final int i2 = 1;
                MediaMuteManager.updateMediaOptionsForAll$default(mediaMuteManagerG, ul9Var.b(), null, new ia1(ya1Var2, 3), new cf7() { // from class: ma1
                    @Override // defpackage.cf7
                    public final Object invoke(Object obj) {
                        int i3 = i2;
                        ya1 ya1Var3 = ya1Var2;
                        Throwable th = (Throwable) obj;
                        switch (i3) {
                            case 0:
                                a4c a4cVar = gm0.f;
                                if (a4cVar != null) {
                                    je9 je9Var = je9.d;
                                    if (a4cVar.b(je9Var)) {
                                        a4cVar.c(je9Var, "CallAdminSettingsController", qv1.k("Low hands for all failed due to: ", th.getMessage()), null);
                                    }
                                }
                                ya1Var3.s.a(new pd(false));
                                break;
                            case 1:
                                a4c a4cVar2 = gm0.f;
                                if (a4cVar2 != null) {
                                    je9 je9Var2 = je9.d;
                                    if (a4cVar2.b(je9Var2)) {
                                        a4cVar2.c(je9Var2, "CallAdminSettingsController", qv1.k("Disable cameras for all once failed due to: ", th.getMessage()), null);
                                    }
                                }
                                ya1Var3.s.a(new md(false));
                                break;
                            default:
                                a4c a4cVar3 = gm0.f;
                                if (a4cVar3 != null) {
                                    je9 je9Var3 = je9.d;
                                    if (a4cVar3.b(je9Var3)) {
                                        a4cVar3.c(je9Var3, "CallAdminSettingsController", qv1.k("Disable microphone for all once failed due to: ", th.getMessage()), null);
                                    }
                                }
                                ya1Var3.s.a(new od(false));
                                break;
                        }
                        return sbi.a;
                    }
                }, 2, null);
            }
            a8j.x(kt1VarP4.t, ux1.F);
            return;
        }
        final int i3 = 2;
        if (i != R.id.call_admin_settings_disable_all_mic_once) {
            if (i != R.id.call_admin_settings_disable_all_hands_once || (participantStatesManagerH = (ya1Var = (ya1) ((da1) callOpponentsListWidget.p1().j.getValue())).h()) == null) {
                return;
            }
            final int i4 = 0;
            participantStatesManagerH.lowerHandForAll(new ia1(ya1Var, 2), new cf7() { // from class: ma1
                @Override // defpackage.cf7
                public final Object invoke(Object obj) {
                    int i5 = i4;
                    ya1 ya1Var3 = ya1Var;
                    Throwable th = (Throwable) obj;
                    switch (i5) {
                        case 0:
                            a4c a4cVar = gm0.f;
                            if (a4cVar != null) {
                                je9 je9Var = je9.d;
                                if (a4cVar.b(je9Var)) {
                                    a4cVar.c(je9Var, "CallAdminSettingsController", qv1.k("Low hands for all failed due to: ", th.getMessage()), null);
                                }
                            }
                            ya1Var3.s.a(new pd(false));
                            break;
                        case 1:
                            a4c a4cVar2 = gm0.f;
                            if (a4cVar2 != null) {
                                je9 je9Var2 = je9.d;
                                if (a4cVar2.b(je9Var2)) {
                                    a4cVar2.c(je9Var2, "CallAdminSettingsController", qv1.k("Disable cameras for all once failed due to: ", th.getMessage()), null);
                                }
                            }
                            ya1Var3.s.a(new md(false));
                            break;
                        default:
                            a4c a4cVar3 = gm0.f;
                            if (a4cVar3 != null) {
                                je9 je9Var3 = je9.d;
                                if (a4cVar3.b(je9Var3)) {
                                    a4cVar3.c(je9Var3, "CallAdminSettingsController", qv1.k("Disable microphone for all once failed due to: ", th.getMessage()), null);
                                }
                            }
                            ya1Var3.s.a(new od(false));
                            break;
                    }
                    return sbi.a;
                }
            });
            return;
        }
        kt1 kt1VarP5 = callOpponentsListWidget.p1();
        final ya1 ya1Var3 = (ya1) ((da1) kt1VarP5.j.getValue());
        MediaMuteManager mediaMuteManagerG2 = ya1Var3.g();
        if (mediaMuteManagerG2 != null) {
            ul9 ul9Var2 = new ul9();
            ul9Var2.put(n0a.a, o0aVar);
            MediaMuteManager.updateMediaOptionsForAll$default(mediaMuteManagerG2, ul9Var2.b(), null, new ia1(ya1Var3, 4), new cf7() { // from class: ma1
                @Override // defpackage.cf7
                public final Object invoke(Object obj) {
                    int i5 = i3;
                    ya1 ya1Var4 = ya1Var3;
                    Throwable th = (Throwable) obj;
                    switch (i5) {
                        case 0:
                            a4c a4cVar = gm0.f;
                            if (a4cVar != null) {
                                je9 je9Var = je9.d;
                                if (a4cVar.b(je9Var)) {
                                    a4cVar.c(je9Var, "CallAdminSettingsController", qv1.k("Low hands for all failed due to: ", th.getMessage()), null);
                                }
                            }
                            ya1Var4.s.a(new pd(false));
                            break;
                        case 1:
                            a4c a4cVar2 = gm0.f;
                            if (a4cVar2 != null) {
                                je9 je9Var2 = je9.d;
                                if (a4cVar2.b(je9Var2)) {
                                    a4cVar2.c(je9Var2, "CallAdminSettingsController", qv1.k("Disable cameras for all once failed due to: ", th.getMessage()), null);
                                }
                            }
                            ya1Var4.s.a(new md(false));
                            break;
                        default:
                            a4c a4cVar3 = gm0.f;
                            if (a4cVar3 != null) {
                                je9 je9Var3 = je9.d;
                                if (a4cVar3.b(je9Var3)) {
                                    a4cVar3.c(je9Var3, "CallAdminSettingsController", qv1.k("Disable microphone for all once failed due to: ", th.getMessage()), null);
                                }
                            }
                            ya1Var4.s.a(new od(false));
                            break;
                    }
                    return sbi.a;
                }
            }, 2, null);
        }
        a8j.x(kt1VarP5.t, ux1.F);
    }

    @Override // defpackage.n78
    public void n(o78 o78Var) throws Exception {
        js8 js8Var = (js8) this.b;
        try {
            l78 l78VarD = o78Var.d();
            StringBuilder sb = new StringBuilder("OnImageAvailableListener: mCurrentRequest ID = ");
            hjd hjdVar = (hjd) js8Var.a;
            sb.append(hjdVar == null ? null : Integer.valueOf(hjdVar.a));
            sb.append(", image.isNull = ");
            sb.append(l78VarD == null);
            tvj.a("CaptureNode", sb.toString());
            if (l78VarD != null) {
                js8Var.p(l78VarD);
                return;
            }
            hjd hjdVar2 = (hjd) js8Var.a;
            if (hjdVar2 != null) {
                js8Var.s(new fj0(hjdVar2.a, new ImageCaptureException(2, "Failed to acquire latest image", null)));
            }
        } catch (IllegalStateException e) {
            hjd hjdVar3 = (hjd) js8Var.a;
            if (hjdVar3 != null) {
                js8Var.s(new fj0(hjdVar3.a, new ImageCaptureException(2, "Failed to acquire latest image", e)));
            }
        }
    }

    @Override // defpackage.hu8
    public Object parse(vu8 vu8Var) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 10:
                return CallAnalyticsApiRequest._get_okParser_$lambda$0((CallAnalyticsApiRequest) obj, vu8Var);
            default:
                return ((CallInfo.Companion) obj).parse(vu8Var);
        }
    }

    @Override // ru.ok.android.externcalls.sdk.audio.VideoTracker
    public boolean preferSpeakerOverEarpiece() {
        return ((Boolean) ((jc1) this.b).get()).booleanValue();
    }

    @Override // defpackage.v7
    public void run() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 6:
                wxl.b((File) obj, null);
                break;
            case 7:
                ((CidLogger) ((ih) obj).b).log("BitrateDumpGatheringConfigCacherImpl", "Remote bitrate dump config has not been provided");
                break;
            default:
                ((zi1) obj).b.log("CallFinishHandler", "on complete BitrateDumpFileSendTrigger");
                break;
        }
    }

    @Override // defpackage.i8c
    public void w(j8c j8cVar) {
        int i = this.a;
        j8c j8cVar2 = j8c.e;
        Object obj = this.b;
        switch (i) {
            case 25:
                ChatAdminsScreen chatAdminsScreen = (ChatAdminsScreen) obj;
                zv8[] zv8VarArr = ChatAdminsScreen.l;
                if (j8cVar != j8cVar2) {
                    chatAdminsScreen.o1().D();
                } else {
                    a8j.x(chatAdminsScreen.q1().g, e9a.a);
                    gu2 gu2VarO1 = chatAdminsScreen.o1();
                    ArrayList arrayList = gu2VarO1.l;
                    int size = arrayList.size();
                    arrayList.clear();
                    a8j.x(gu2VarO1.m, new jrd(new vnh(R.string.profile_members_list_restore_in_admin_snackbar, a.n1(new Object[]{Integer.valueOf(size)}))));
                }
                break;
            default:
                hy2 hy2Var = (hy2) obj;
                p3c p3cVar = hy2Var.H;
                if (j8cVar != j8cVar2) {
                    zv8[] zv8VarArr2 = hy2.Q;
                    vo8 vo8Var = (vo8) p3cVar.m(hy2Var, zv8VarArr2[1]);
                    if (vo8Var == null || !vo8Var.isActive()) {
                        gu4 gu4Var = hy2Var.a;
                        xt4 xt4VarB = ((n0c) hy2Var.s()).b();
                        zhb zhbVar = zhb.b;
                        xt4VarB.getClass();
                        p3cVar.B(hy2Var, zv8VarArr2[1], yab.i0(gu4Var, lvb.x0(xt4VarB, zhbVar), 0, new by2(0, hy2Var, null), 2));
                    }
                }
                break;
        }
    }

    public /* synthetic */ ot4(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }
}
