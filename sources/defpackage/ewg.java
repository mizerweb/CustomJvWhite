package defpackage;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;
import android.view.animation.PathInterpolator;
import android.widget.LinearLayout;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.ProcessingException;
import androidx.recyclerview.widget.RecyclerView;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;
import one.me.calls.impl.service.VoIpCallService;
import one.me.calls.impl.service.d;
import one.me.stories.text.TextEditStoryWidget;
import org.apache.http.conn.params.ConnManagerParams;
import org.webrtc.VideoFileRenderer;
import org.webrtc.VideoFrame;
import org.webrtc.VideoSource;
import ru.ok.android.externcalls.sdk.waiting_room.ConversationWaitingParticipantId;
import ru.ok.android.externcalls.sdk.waiting_room.WaitingRoomParticipants;
import ru.ok.android.externcalls.sdk.watch_together.internal.listener.WatchTogetherListenerManagerImpl;
import ru.ok.android.externcalls.sdk.watch_together.listener.WatchTogetherListener;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ewg implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ewg(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = 0;
        switch (this.a) {
            case 0:
                fwg fwgVar = (fwg) this.b;
                View view = (View) this.c;
                fwgVar.f = null;
                if (fwgVar.b || !view.isAttachedToWindow()) {
                    return;
                }
                ViewPropertyAnimator viewPropertyAnimatorWithEndAction = view.animate().scaleX(1.0f).scaleY(1.0f).setDuration(250L).setInterpolator((PathInterpolator) fwgVar.d).withEndAction(new dwg(fwgVar, 3));
                fwgVar.f = viewPropertyAnimatorWithEndAction;
                if (viewPropertyAnimatorWithEndAction != null) {
                    viewPropertyAnimatorWithEndAction.start();
                    return;
                }
                return;
            case 1:
                ((ug4) ((AtomicReference) this.c).get()).accept(new aj0((cch) this.b));
                return;
            case 2:
                euc eucVar = (euc) this.b;
                try {
                    ((t0j) eucVar.b).e((ich) this.c);
                    return;
                } catch (ProcessingException e) {
                    tvj.d("SurfaceProcessor", "Failed to setup SurfaceProcessor input.", e);
                    ((qk5) eucVar.d).accept(e);
                    return;
                }
            case 3:
                euc eucVar2 = (euc) this.b;
                try {
                    ((t0j) eucVar2.b).d((cch) this.c);
                    return;
                } catch (ProcessingException e2) {
                    tvj.d("SurfaceProcessor", "Failed to setup SurfaceProcessor output.", e2);
                    ((qk5) eucVar2.d).accept(e2);
                    return;
                }
            case 4:
                ((qhh) this.b).e.remove((qme) this.c);
                return;
            case 5:
                gj0 gj0Var = (gj0) this.b;
                ImageCaptureException imageCaptureException = (ImageCaptureException) this.c;
                gj2 gj2Var = gj0Var.d;
                if (gj2Var != null) {
                    gj2Var.M(imageCaptureException);
                    return;
                } else {
                    ore.k("One and only one callback is allowed.");
                    return;
                }
            case 6:
                gj0 gj0Var2 = (gj0) this.b;
                l78 l78Var = (l78) this.c;
                gj2 gj2Var2 = gj0Var2.d;
                Objects.requireNonNull(gj2Var2);
                Objects.requireNonNull(l78Var);
                ((hj2) gj2Var2.c).i = false;
                String name = gj2.class.getName();
                a4c a4cVar = gm0.f;
                if (a4cVar != null) {
                    je9 je9Var = je9.d;
                    if (a4cVar.b(je9Var)) {
                        a4cVar.c(je9Var, name, qt4.l("capture image with success, with resolution ", l78Var.getWidth(), l78Var.getHeight(), "x"), null);
                    }
                }
                ((hj2) gj2Var2.c).getFreezeCameraDetector().a();
                hj2 hj2Var = (hj2) gj2Var2.c;
                try {
                    ByteBuffer buffer = l78Var.e0()[0].getBuffer();
                    byte[] bArr = new byte[buffer.capacity()];
                    buffer.rewind();
                    buffer.get(bArr);
                    zf2 zf2Var = hj2Var.f;
                    if (zf2Var != null) {
                        n2e n2eVar = ((k2e) ((ft0) zf2Var).a).d;
                        if (n2eVar == null) {
                            n2eVar = null;
                        }
                        a8j.t(n2eVar, ((n0c) n2eVar.i).b(), new voc(n2eVar, bArr, (lq4) null, 21), 2);
                        break;
                    }
                    p90.f(l78Var, null);
                    return;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        p90.f(l78Var, th);
                        throw th2;
                    }
                }
            case 7:
                TextEditStoryWidget textEditStoryWidget = (TextEditStoryWidget) this.b;
                LinearLayout linearLayout = (LinearLayout) this.c;
                zv8[] zv8VarArr = TextEditStoryWidget.B;
                if (textEditStoryWidget.getView() != null) {
                    ViewParent parent = linearLayout.getParent();
                    ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                    if (viewGroup != null) {
                        viewGroup.removeView(linearLayout);
                        return;
                    }
                    return;
                }
                return;
            case 8:
                bph bphVar = (bph) this.b;
                ich ichVar = (ich) this.c;
                ich ichVar2 = bphVar.h;
                if (ichVar2 != null && ichVar2 == ichVar) {
                    bphVar.h = null;
                    bphVar.g = null;
                }
                oo ooVar = bphVar.l;
                if (ooVar != null) {
                    ooVar.g();
                    bphVar.l = null;
                    return;
                }
                return;
            case 9:
                wfe wfeVar = (wfe) this.b;
                wfe wfeVar2 = (wfe) this.c;
                cqk.g((gu4) wfeVar.a);
                cqk.g((gu4) wfeVar2.a);
                return;
            case 10:
                k36 k36Var = (k36) this.b;
                CountDownLatch countDownLatch = (CountDownLatch) this.c;
                try {
                    k36Var.run();
                    return;
                } finally {
                    countDownLatch.countDown();
                }
            case 11:
                k2i k2iVar = (k2i) this.b;
                z88 z88Var = (z88) this.c;
                vog vogVar = k2iVar.e;
                ghe gheVarH = z88Var.h();
                dc9 dc9Var = k2iVar.d;
                String str = (String) dc9Var.b;
                String str2 = (String) dc9Var.c;
                g2i g2iVar = (g2i) vogVar.a;
                wv5 wv5Var = g2iVar.q;
                ((z88) wv5Var.n).f(gheVarH);
                if (str != null) {
                    wv5Var.f = str;
                }
                if (str2 != null) {
                    wv5Var.l = str2;
                }
                g2iVar.s = null;
                int i2 = g2iVar.x;
                if (i2 != 1) {
                    if (i2 == 2) {
                        g2iVar.t = null;
                        g2iVar.x = 3;
                        throw null;
                    }
                    if (i2 == 3) {
                        g2iVar.x = 4;
                        throw null;
                    }
                    if (i2 == 5) {
                        g2iVar.x = 6;
                        k84 k84Var = g2iVar.u;
                        k84Var.getClass();
                        throw null;
                    }
                    if (i2 != 6) {
                        g2i.a(g2iVar);
                        return;
                    } else {
                        wv5Var.m = 1;
                        g2i.a(g2iVar);
                        return;
                    }
                }
                g2iVar.x = 2;
                k84 k84Var2 = g2iVar.u;
                k84Var2.getClass();
                int i3 = u98.c;
                jag jagVar = new jag(2);
                k84 k84VarC = k84Var2.c();
                c98 c98Var = (c98) k84Var2.b;
                ArrayList arrayList = new ArrayList();
                int i4 = 0;
                while (i4 < c98Var.size()) {
                    ghe gheVar = ((t26) c98Var.get(i4)).a;
                    ArrayList arrayList2 = new ArrayList();
                    for (int i5 = i; i5 < gheVar.d; i5++) {
                        s26 s26Var = (s26) gheVar.get(i5);
                        r26 r26VarA = s26Var.a();
                        ry9 ry9Var = s26Var.a;
                        if (i5 == 0) {
                            by9 by9VarA = ry9Var.e.a();
                            by9VarA.b(vqi.X(vqi.p0(0L) + ry9Var.e.a));
                            cy9 cy9Var = new cy9(by9VarA);
                            ay9 ay9VarA = ry9Var.a();
                            ay9VarA.d = cy9Var.a();
                            r26VarA.a = ay9VarA.a();
                        }
                        arrayList2.add(new s26(r26VarA));
                    }
                    kzi kziVar = new kzi(jagVar);
                    ((z88) kziVar.a).f(arrayList2);
                    arrayList.add(new t26(kziVar));
                    i4++;
                    i = 0;
                }
                k84VarC.d(arrayList);
                k84VarC.a();
                g2iVar.t.getClass();
                t9b t9bVar = g2iVar.t;
                lvb.b0(t9bVar.m == 1);
                t9bVar.m = 2;
                throw null;
            case 12:
                ((vki) this.b).e.a((oah) this.c);
                return;
            case 13:
                omi omiVar = (omi) this.b;
                Runnable runnable = (Runnable) this.c;
                ThreadLocal threadLocal = omiVar.d;
                threadLocal.set(Boolean.TRUE);
                try {
                    runnable.run();
                    return;
                } finally {
                    threadLocal.remove();
                }
            case 14:
                mof mofVar = (mof) this.b;
                e89 e89Var = (e89) this.c;
                if (mofVar.a instanceof a1) {
                    e89Var.cancel(false);
                    return;
                }
                return;
            case 15:
                bui buiVar = (bui) this.b;
                if (((wf5) this.c) == buiVar.u) {
                    buiVar.M();
                    return;
                }
                return;
            case 16:
                xti xtiVar = (xti) this.b;
                hmf hmfVar = (hmf) this.c;
                ((ArrayList) hmfVar.b.e).remove(xtiVar);
                hmfVar.e.remove(xtiVar);
                return;
            case 17:
                ((VideoFileRenderer) this.b).lambda$onFrame$0((VideoFrame) this.c);
                return;
            case 18:
                ((VideoFileRenderer) this.b).lambda$release$2((CountDownLatch) this.c);
                return;
            case 19:
                o02 o02Var = (o02) this.b;
                pwi pwiVar = (pwi) this.c;
                o02Var.getClass();
                try {
                    pwiVar.run();
                    return;
                } catch (Exception e3) {
                    o02Var.l(e3);
                    return;
                }
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                t0j t0jVar = (t0j) this.b;
                af7 af7Var = (af7) this.c;
                if (!t0jVar.k) {
                    af7Var.invoke();
                    return;
                }
                String str3 = t0jVar.a;
                a4c a4cVar2 = gm0.f;
                if (a4cVar2 != null) {
                    a4c.f(a4cVar2, je9.g, str3, "postToGl, GL is already RELEASED, skip action!", null, null, 8);
                    return;
                }
                return;
            case 21:
                fbc fbcVar = (fbc) this.b;
                pu3 pu3Var = (pu3) this.c;
                y3j y3jVar = (y3j) fbcVar.c;
                String str4 = vqi.a;
                y3jVar.e(pu3Var);
                return;
            case 22:
                fbc fbcVar2 = (fbc) this.b;
                k4j k4jVar = (k4j) this.c;
                y3j y3jVar2 = (y3j) fbcVar2.c;
                String str5 = vqi.a;
                y3jVar2.c(k4jVar);
                return;
            case 23:
                fbc fbcVar3 = (fbc) this.b;
                Exception exc = (Exception) this.c;
                y3j y3jVar3 = (y3j) fbcVar3.c;
                String str6 = vqi.a;
                y3jVar3.r(exc);
                return;
            case 24:
                fbc fbcVar4 = (fbc) this.b;
                String str7 = (String) this.c;
                y3j y3jVar4 = (y3j) fbcVar4.c;
                String str8 = vqi.a;
                y3jVar4.a(str7);
                return;
            case 25:
                ((VideoSource) this.b).lambda$setVideoProcessor$0((VideoFrame) this.c);
                return;
            case 26:
                RecyclerView recyclerView = (RecyclerView) this.b;
                s57 s57Var = (s57) this.c;
                if (recyclerView.Y()) {
                    recyclerView.post(new ewg(recyclerView, 26, s57Var));
                    return;
                } else {
                    s57Var.invoke();
                    return;
                }
            case 27:
                d dVar = (d) this.b;
                Context context = (Context) this.c;
                try {
                    Intent intentH = dVar.h(context);
                    intentH.putExtra("ACTION", 1);
                    context.stopService(intentH);
                    return;
                } catch (IllegalStateException e4) {
                    VoIpCallService.VoIpCallServiceException voIpCallServiceException = new VoIpCallService.VoIpCallServiceException("cant stop foreground service", e4);
                    gm0.V(dVar.b, voIpCallServiceException.getMessage(), voIpCallServiceException);
                    return;
                }
            case 28:
                WaitingRoomParticipants.resolveInternalIdSingle$lambda$0$0((f8g) this.b, (ConversationWaitingParticipantId) this.c);
                return;
            default:
                WatchTogetherListenerManagerImpl.sendActualState$lambda$0((WatchTogetherListenerManagerImpl) this.b, (WatchTogetherListener) this.c);
                return;
        }
    }
}
