package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import one.me.sdk.media.transformer.MediaTransformException;
import one.video.calls.sdk.net.signaling.wt.nal.NALSocket;
import one.video.calls.sdk.net.signaling.wt.nal.internal.WebTransportSocket;
import org.webrtc.StatsReport;
import ru.ok.android.externcalls.sdk.audio.internal.impl3.CallsAudioManagerV3Impl;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class h82 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ h82(WebTransportSocket webTransportSocket, String str, qf7 qf7Var, Object obj, NALSocket.Listener listener) {
        this.a = 8;
        this.b = webTransportSocket;
        this.e = str;
        this.c = qf7Var;
        this.d = obj;
        this.f = listener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z = true;
        switch (this.a) {
            case 0:
                CallsAudioManagerV3Impl.doOnOwnThreadUnsafe$lambda$9((af7) this.b, (af7) this.c, (CallsAudioManagerV3Impl) this.d, (String) this.e, (cf7) this.f);
                break;
            case 1:
                ((zc4) this.c).run().b(new sc2((gvb) this.b, (AtomicBoolean) this.d, (ad4) this.e, (AtomicBoolean) this.f, 2), im5.a);
                break;
            case 2:
                fm5 fm5Var = (fm5) this.b;
                StatsReport[] statsReportArr = (StatsReport[]) this.c;
                StatsReport[] statsReportArr2 = (StatsReport[]) this.d;
                yt1 yt1Var = (yt1) this.e;
                wig wigVar = (wig) this.f;
                rkg[] rkgVarArr = new rkg[statsReportArr2.length];
                du1 du1Var = fm5Var.j.a;
                du1 du1VarX = fm5Var.x(yt1Var);
                for (int i = 0; i < statsReportArr2.length; i++) {
                    if (statsReportArr2[i].id.endsWith("_recv")) {
                        rkgVarArr[i] = new rkg(du1VarX, false);
                    } else {
                        rkgVarArr[i] = new rkg(du1Var, false);
                    }
                }
                wigVar.a(statsReportArr, statsReportArr2, rkgVarArr, Collections.EMPTY_MAP, fm5Var);
                break;
            case 3:
                fm5 fm5Var2 = (fm5) this.b;
                b1k b1kVar = (b1k) this.c;
                a4e a4eVar = (a4e) this.d;
                yt1 yt1Var2 = (yt1) this.e;
                vig vigVar = (vig) ((jkg) this.f);
                List list = a4eVar.b;
                fgg[] fggVarArr = list != null ? (fgg[]) list.toArray(new fgg[0]) : new fgg[0];
                sh6[] sh6VarArr = new sh6[fggVarArr.length];
                du1 du1VarX2 = fm5Var2.x(yt1Var2);
                for (int i2 = 0; i2 < fggVarArr.length; i2++) {
                    sh6VarArr[i2] = new sh6(fggVarArr[i2].b == 1 ? du1VarX2 : fm5Var2.j.a, false, th6.a);
                }
                rh6 rh6Var = new rh6(b1kVar, a4eVar, fggVarArr, sh6VarArr, Collections.EMPTY_MAP, fm5Var2);
                b8g b8gVar = vigVar.a;
                if (!b8gVar.b()) {
                    b8gVar.a(rh6Var);
                }
                break;
            case 4:
                ws5 ws5Var = (ws5) this.b;
                CountDownLatch countDownLatch = (CountDownLatch) this.c;
                AtomicReference atomicReference = (AtomicReference) this.d;
                AtomicReference atomicReference2 = (AtomicReference) this.e;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.f;
                try {
                    gs5 gs5VarK = ws5Var.k();
                    ws5Var.r = gs5VarK;
                    g85 g85Var = new g85(atomicBoolean, ws5Var, atomicReference, atomicReference2, countDownLatch);
                    lvb.b0(gs5VarK.j == null);
                    gs5VarK.j = g85Var;
                    if (gs5VarK.c != 0) {
                        ur0 ur0Var = gs5VarK.b;
                        ur0Var.getClass();
                        gs5VarK.k = new fs5(ur0Var, gs5VarK);
                    } else {
                        gs5VarK.g.post(new gf5(gs5VarK, 9, g85Var));
                    }
                } catch (Exception e) {
                    atomicReference2.set(e);
                    countDownLatch.countDown();
                    return;
                }
                break;
            case 5:
                r6a r6aVar = (r6a) this.b;
                g2i g2iVar = (g2i) this.c;
                k84 k84Var = (k84) this.d;
                String str = (String) this.e;
                q6a q6aVar = (q6a) this.f;
                String str2 = (String) r6aVar.b;
                a4c a4cVar = gm0.f;
                if (a4cVar != null) {
                    je9 je9Var = je9.d;
                    if (a4cVar.b(je9Var)) {
                        a4cVar.c(je9Var, str2, "Transformer.startSafely", null);
                    }
                }
                try {
                    g2iVar.h(k84Var, str);
                } catch (Throwable th) {
                    MediaTransformException mediaTransformException = new MediaTransformException("Unexpected failure when start transformer", th);
                    gm0.V(q6aVar.b, "onError", mediaTransformException);
                    q6aVar.a.b(mediaTransformException);
                    q6aVar.c();
                    return;
                }
                break;
            case 6:
                wif wifVar = (wif) this.b;
                StatsReport[] statsReportArr3 = (StatsReport[]) this.c;
                StatsReport[] statsReportArr4 = (StatsReport[]) this.d;
                ArrayList arrayList = (ArrayList) this.e;
                wig wigVar2 = (wig) this.f;
                Map mapY = wifVar.y();
                rkg[] rkgVarArr2 = new rkg[statsReportArr4.length];
                for (int i3 = 0; i3 < statsReportArr4.length; i3++) {
                    w3k w3kVar = (w3k) arrayList.get(i3);
                    if (w3kVar.b) {
                        rkgVarArr2[i3] = new rkg(null, true);
                    } else {
                        rkgVarArr2[i3] = new rkg(w3kVar.d ? wifVar.j.a : wifVar.x(w3kVar.a), false);
                    }
                }
                wigVar2.a(statsReportArr3, statsReportArr4, rkgVarArr2, mapY, wifVar);
                break;
            case 7:
                wif wifVar2 = (wif) this.b;
                b1k b1kVar2 = (b1k) this.c;
                a4e a4eVar2 = (a4e) this.d;
                ArrayList arrayList2 = (ArrayList) this.e;
                jkg jkgVar = (jkg) this.f;
                th6 th6Var = th6.a;
                Map mapY2 = wifVar2.y();
                vig vigVar2 = (vig) jkgVar;
                sh6[] sh6VarArr2 = new sh6[arrayList2.size()];
                fgg[] fggVarArr2 = new fgg[arrayList2.size()];
                int size = arrayList2.size();
                int i4 = 0;
                while (i4 < size) {
                    ylc ylcVar = (ylc) arrayList2.get(i4);
                    fgg fggVar = (fgg) ylcVar.a;
                    w3k w3kVar2 = (w3k) ylcVar.b;
                    if (w3kVar2.b) {
                        sh6VarArr2[i4] = new sh6(null, z, th6Var);
                        fggVarArr2[i4] = fggVar;
                    } else if (w3kVar2.c) {
                        String str3 = fggVar.e;
                        sh6VarArr2[i4] = new sh6(null, false, str3 != null ? new uh6(str3) : th6Var);
                        fggVarArr2[i4] = fggVar;
                    } else {
                        sh6VarArr2[i4] = new sh6(w3kVar2.d ? wifVar2.j.a : wifVar2.x(w3kVar2.a), false, th6Var);
                        fggVarArr2[i4] = fggVar;
                    }
                    i4++;
                    z = true;
                }
                rh6 rh6Var2 = new rh6(b1kVar2, a4eVar2, fggVarArr2, sh6VarArr2, mapY2, wifVar2);
                b8g b8gVar2 = vigVar2.a;
                if (!b8gVar2.b()) {
                    b8gVar2.a(rh6Var2);
                }
                break;
            default:
                WebTransportSocket.handleAsync$lambda$0((WebTransportSocket) this.b, (String) this.e, (qf7) this.c, this.d, (NALSocket.Listener) this.f);
                break;
        }
    }

    public /* synthetic */ h82(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
    }
}
