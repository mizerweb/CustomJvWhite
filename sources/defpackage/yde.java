package defpackage;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.os.Handler;
import android.view.ViewPropertyAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import androidx.media3.common.VideoFrameProcessingException;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import one.me.calls.impl.service.CallScreenShareService;
import one.me.calls.impl.service.c;
import org.apache.http.conn.params.ConnManagerParams;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.sessionroom.SessionRoomsManager;
import ru.ok.android.externcalls.sdk.sessionroom.internal.listener.SessionRoomListenerManagerImpl;
import ru.ok.android.externcalls.sdk.sessionroom.internal.participant.SessionRoomParticipantsDataProviderImpl;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class yde implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ yde(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        f25 f25Var;
        f25 f25Var2;
        switch (this.a) {
            case 0:
                ((qi0) this.b).j.accept((v3j) this.c);
                break;
            case 1:
                ((gm0) this.b).H((Typeface) this.c);
                break;
            case 2:
                rve rveVar = (rve) this.b;
                dc9 dc9Var = (dc9) this.c;
                if (!rveVar.j.get()) {
                    long j = rveVar.k + 1;
                    rveVar.k = j;
                    rveVar.l.put(j, new vek(j, dc9Var, rveVar.o));
                    dc9 dc9Var2 = rveVar.n;
                    pve pveVar = (pve) dc9Var.b;
                    dc9Var2.getClass();
                    ((Handler) dc9Var2.d).post(new nfk(dc9Var2, pveVar, 0));
                    rveVar.f.post(new qve(rveVar, j, 0));
                    break;
                }
                break;
            case 3:
                rve rveVar2 = (rve) this.b;
                f25 f25Var3 = (f25) this.c;
                p3k p3kVar = rveVar2.d;
                o3k o3kVar = rveVar2.c;
                AtomicReference atomicReference = rveVar2.b;
                AtomicBoolean atomicBoolean = rveVar2.j;
                if (!atomicBoolean.get() && (f25Var = (f25) atomicReference.get()) != f25Var3) {
                    atomicReference.set(f25Var3);
                    if (f25Var != null) {
                        if (o3kVar == null) {
                            ore.p("Illegal 'listener' value: null");
                        } else {
                            f25Var.c.remove(o3kVar);
                            f25Var.c(p3kVar);
                        }
                    }
                    rveVar2.a();
                    f25Var3.a(p3kVar);
                    if (o3kVar == null) {
                        ore.p("Illegal 'listener' value: null");
                        break;
                    } else {
                        f25Var3.c.add(o3kVar);
                        boolean zB = f25Var3.b();
                        f25 f25Var4 = (f25) atomicReference.get();
                        if (!atomicBoolean.get() && f25Var4 == f25Var3) {
                            if (!zB) {
                                rveVar2.a();
                            } else {
                                rveVar2.b();
                            }
                            break;
                        }
                    }
                }
                break;
            case 4:
                z18 z18Var = (z18) this.b;
                f25 f25Var5 = (f25) this.c;
                p3k p3kVar2 = (p3k) z18Var.i;
                AtomicReference atomicReference2 = (AtomicReference) z18Var.h;
                if (!((AtomicBoolean) z18Var.g).get() && (f25Var2 = (f25) atomicReference2.get()) != f25Var5) {
                    atomicReference2.set(f25Var5);
                    if (f25Var2 != null) {
                        f25Var2.c(p3kVar2);
                    }
                    f25Var5.a(p3kVar2);
                }
                break;
            case 5:
                z18 z18Var2 = (z18) this.b;
                Throwable th = (Throwable) this.c;
                Iterator it = ((CopyOnWriteArrayList) z18Var2.c).iterator();
                while (it.hasNext()) {
                    try {
                        ((wve) it.next()).c(th);
                    } catch (Throwable th2) {
                        ((y3e) z18Var2.b).reportException("RtcNotificationReceiver", "rtc.notification.handle.notificationerror", th2);
                    }
                }
                break;
            case 6:
                z18 z18Var3 = (z18) this.b;
                vve vveVar = (vve) this.c;
                Iterator it2 = ((CopyOnWriteArrayList) z18Var3.c).iterator();
                while (it2.hasNext()) {
                    try {
                        ((wve) it2.next()).a(vveVar);
                    } catch (Throwable th3) {
                        ((y3e) z18Var3.b).reportException("RtcNotificationReceiver", "rtc.notification.handle.notificationreceived", th3);
                    }
                }
                break;
            case 7:
                ((ft0) this.b).A((Runnable) this.c);
                break;
            case 8:
                c cVar = (c) this.b;
                Context context = (Context) this.c;
                try {
                    cVar.getClass();
                    Intent intent = new Intent(context, (Class<?>) CallScreenShareService.class);
                    intent.putExtra("LOCAL_ACCOUNT_ID", cVar.a.a);
                    intent.setAction("STOP");
                    context.stopService(intent);
                } catch (IllegalStateException e) {
                    CallScreenShareService.ScreenShareServiceException screenShareServiceException = new CallScreenShareService.ScreenShareServiceException("cant stop media projection service", e);
                    gm0.V(cVar.b, screenShareServiceException.getMessage(), screenShareServiceException);
                    return;
                }
                break;
            case 9:
                g5f g5fVar = (g5f) this.b;
                f25 f25Var6 = (f25) this.c;
                g5fVar.f.d(f25Var6);
                if (g5fVar.g && f25Var6 != null) {
                    g5fVar.f.e();
                    break;
                }
                break;
            case 10:
                ((shf) this.b).i((Bitmap) this.c);
                break;
            case 11:
                SessionRoomListenerManagerImpl.sendActualState$lambda$0((SessionRoomListenerManagerImpl) this.b, (SessionRoomsManager.OwnRoomsListener) this.c);
                break;
            case 12:
                SessionRoomListenerManagerImpl.onRoomUpdated$lambda$0((SessionRoomListenerManagerImpl) this.b, (g12) this.c);
                break;
            case 13:
                SessionRoomListenerManagerImpl.onCurrentParticipantActiveRoomChanged$lambda$0((SessionRoomListenerManagerImpl) this.b, (d12) this.c);
                break;
            case 14:
                SessionRoomListenerManagerImpl.onRoomRemoved$lambda$0((SessionRoomListenerManagerImpl) this.b, (f12) this.c);
                break;
            case 15:
                SessionRoomListenerManagerImpl.onCurrentParticipantInvitedToRoom$lambda$0((SessionRoomListenerManagerImpl) this.b, (e12) this.c);
                break;
            case 16:
                SessionRoomParticipantsDataProviderImpl.resolveInternalIdByExternal$lambda$1((cf7) this.b, (ParticipantId) this.c);
                break;
            case 17:
                szf szfVar = (szf) this.b;
                eg2 eg2Var = (eg2) this.c;
                if (szfVar.o == null) {
                    szfVar.v = eg2Var;
                } else {
                    szfVar.o.k(eg2Var);
                }
                break;
            case 18:
                ((zzf) this.b).r.remove((yzf) this.c);
                break;
            case 19:
                zzf zzfVar = (zzf) this.b;
                vxa vxaVar = (vxa) this.c;
                b1k b1kVar = zzfVar.i;
                if (b1kVar != null) {
                    ((CopyOnWriteArraySet) b1kVar.b).remove(new n3k(0L, vxaVar));
                }
                break;
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                zzf zzfVar2 = (zzf) this.b;
                d80 d80Var = (d80) this.c;
                Iterator it3 = zzfVar2.r.iterator();
                while (it3.hasNext()) {
                    ((ss4) ((yzf) it3.next())).a.report(d80Var);
                }
                break;
            case 21:
                ((zzf) this.b).r.add((ss4) this.c);
                break;
            case 22:
                zzf zzfVar3 = (zzf) this.b;
                szf szfVar2 = (szf) this.c;
                zzfVar3.getClass();
                szfVar2.d(false);
                zzfVar3.j.stopDeviceAudioShare();
                break;
            case 23:
                euc eucVar = (euc) this.b;
                String str = (String) this.c;
                zzf zzfVar4 = (zzf) eucVar.d;
                if (zzfVar4.d != null) {
                    int i = zzfVar4.o;
                    if (i < 3) {
                        zzfVar4.o = i + 1;
                        vx8 vx8Var = zzfVar4.p;
                        if (vx8Var != null) {
                            oo5.a(vx8Var);
                        }
                        z2f z2fVarA = i3f.a();
                        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                        Objects.requireNonNull(timeUnit, "unit is null");
                        Objects.requireNonNull(z2fVarA, "scheduler is null");
                        vqb vqbVarE = new krb(Math.max(1000L, 0L), timeUnit, z2fVarA).e(new vd6(zzfVar4.a, false));
                        vx8 vx8Var2 = new vx8(new c5f(zzfVar4, 2, str), new vuf(3, zzfVar4));
                        vqbVarE.f(vx8Var2);
                        zzfVar4.p = vx8Var2;
                    } else {
                        zzfVar4.b.reportException("SharedPeerConnectionFac", "onWebRtcAudioRecordStartError", new Exception("onWebRtcAudioRecordStartError(" + zzfVar4.o + " attempts done) " + str));
                    }
                } else {
                    zzfVar4.b.log("SharedPeerConnectionFac", "Already released. Ignore audio restart request");
                }
                break;
            case 24:
                j1g j1gVar = (j1g) this.b;
                fql fqlVar = (fql) this.c;
                zr zrVar = j1gVar.w;
                String str2 = ((f1g) fqlVar).b;
                zrVar.setSelection(str2 != null ? str2.length() : 0);
                break;
            case 25:
                q4g q4gVar = (q4g) this.b;
                JSONObject jSONObject = (JSONObject) this.c;
                y3e y3eVar = q4gVar.b;
                if (!q4gVar.q) {
                    y3eVar.log("OKSignaling", "<!> ignoring " + jSONObject.toString());
                } else {
                    try {
                        Iterator it4 = q4gVar.k.iterator();
                        while (it4.hasNext()) {
                            ((n4g) it4.next()).onResponse(jSONObject);
                        }
                    } catch (JSONException e2) {
                        y3eVar.reportException("OKSignaling", "signaling.listener.response.notification", e2);
                        return;
                    }
                }
                break;
            case 26:
                y5g.b((y5g) this.b, (String) this.c);
                break;
            case 27:
                ((n8g) ((gj2) this.b).c).d.a((VideoFrameProcessingException) this.c);
                break;
            case 28:
                ((ViewPropertyAnimator) this.b).translationY(0.0f).setDuration(200L).setInterpolator((AccelerateDecelerateInterpolator) ((wbg) this.c).b.getValue()).start();
                break;
            default:
                fwg fwgVar = (fwg) this.b;
                boh bohVar = (boh) this.c;
                fwgVar.e = null;
                if (!fwgVar.b && bohVar.isAttachedToWindow()) {
                    bohVar.setVisibility(8);
                    break;
                }
                break;
        }
    }
}
