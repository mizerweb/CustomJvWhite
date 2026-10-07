package defpackage;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.PixelCopy;
import android.view.View;
import android.view.Window;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import one.me.android.root.RootController;
import one.me.calls.ui.bottomsheet.exit.RecordExitBottomSheet;
import one.me.calls.ui.bottomsheet.more.CallMoreBottomSheet;
import one.me.calls.ui.bottomsheet.opponent.ConfirmAddOpponentToCallBottomSheet;
import one.me.calls.ui.bottomsheet.opponent.ConfirmRemoveOpponentToCallBottomSheet;
import one.me.calls.ui.bottomsheet.raisehand.RaiseHandActionBottomSheet;
import one.me.calls.ui.bottomsheet.record.StartRecordBottomSheet;
import one.me.calls.ui.ui.call.CallScreen;
import one.me.calls.ui.ui.call.panels.CallEventsWidget;
import one.me.calls.ui.ui.call.panels.VpnPanelWidget;
import one.me.calls.ui.ui.waitingroom.event.CallWaitingRoomEventsWidget;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;
import org.apache.http.protocol.HTTP;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class jx1 extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ CallScreen g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jx1(lq4 lq4Var, CallScreen callScreen, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = callScreen;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        CallScreen callScreen = this.g;
        switch (i) {
            case 0:
                jx1 jx1Var = new jx1(lq4Var, callScreen, 0);
                jx1Var.f = obj;
                return jx1Var;
            case 1:
                jx1 jx1Var2 = new jx1(lq4Var, callScreen, 1);
                jx1Var2.f = obj;
                return jx1Var2;
            case 2:
                jx1 jx1Var3 = new jx1(lq4Var, callScreen, 2);
                jx1Var3.f = obj;
                return jx1Var3;
            case 3:
                jx1 jx1Var4 = new jx1(lq4Var, callScreen, 3);
                jx1Var4.f = obj;
                return jx1Var4;
            case 4:
                jx1 jx1Var5 = new jx1(lq4Var, callScreen, 4);
                jx1Var5.f = obj;
                return jx1Var5;
            case 5:
                jx1 jx1Var6 = new jx1(lq4Var, callScreen, 5);
                jx1Var6.f = obj;
                return jx1Var6;
            case 6:
                jx1 jx1Var7 = new jx1(lq4Var, callScreen, 6);
                jx1Var7.f = obj;
                return jx1Var7;
            default:
                jx1 jx1Var8 = new jx1(lq4Var, callScreen, 7);
                jx1Var8.f = obj;
                return jx1Var8;
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        lq4 lq4Var = (lq4) obj2;
        switch (i) {
            case 0:
                ((jx1) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            case 1:
                ((jx1) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            case 2:
                ((jx1) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            case 3:
                ((jx1) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            case 4:
                ((jx1) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            case 5:
                ((jx1) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            case 6:
                ((jx1) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            default:
                ((jx1) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
        }
        return sbiVar;
    }

    /* JADX WARN: Code duplicated, block: B:122:0x033c  */
    /* JADX WARN: Code duplicated, block: B:125:0x040a A[LOOP:3: B:123:0x0404->B:125:0x040a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:128:0x0413  */
    /* JADX WARN: Code duplicated, block: B:129:0x0416  */
    /* JADX WARN: Code duplicated, block: B:131:0x0419  */
    /* JADX WARN: Code duplicated, block: B:133:0x041f  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [lq4] */
    /* JADX WARN: Type inference failed for: r8v1, types: [y69] */
    /* JADX WARN: Type inference failed for: r8v56 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        mr1 mr1Var;
        ValueAnimator valueAnimator;
        Activity activity;
        Window window;
        Object poeVar;
        a4c a4cVar;
        ConfirmationBottomSheet confirmationBottomSheetE;
        br4 parentController;
        RootController rootController;
        hve hveVarU1;
        Boolean boolValueOf;
        Object value;
        int i = 7;
        int i2 = 3;
        int iMin = 0;
        ?? r8 = 0;
        bitmap = null;
        bitmap = null;
        Bitmap bitmap = null;
        switch (this.e) {
            case 0:
                Object obj2 = this.f;
                ch3.d0(obj);
                ylc ylcVar = (ylc) obj2;
                x7j x7jVar = (x7j) ylcVar.a;
                List list = (List) ylcVar.b;
                CallScreen callScreen = this.g;
                l6m l6mVar = CallScreen.D1;
                bz1 bz1VarO1 = callScreen.O1();
                y8j y8jVar = bz1VarO1.E;
                int i3 = w7j.$EnumSwitchMapping$0[x7jVar.ordinal()];
                if (i3 != 1 && i3 != 2) {
                    if (i3 != 3) {
                        ore.o();
                        return null;
                    }
                    iMin = 1;
                }
                if (iMin >= list.size()) {
                    iMin = Math.min(y8jVar.getCurrentItem(), list.size() - 1);
                }
                nee adapter = y8jVar.getAdapter();
                if (adapter instanceof mr1) {
                    mr1Var = (mr1) adapter;
                }
                if (r8 != 0) {
                    r8 = mr1Var;
                    r8.I(list, new ai(bz1VarO1, iMin, i2));
                }
                r8 = mr1Var;
                bz1VarO1.y(iMin, "main");
                if (!list.isEmpty()) {
                    List list2 = list;
                    if ((list2 instanceof Collection) && list2.isEmpty()) {
                        ((View) callScreen.p1.m(callScreen, CallScreen.E1[13])).setVisibility(8);
                    } else {
                        Iterator it = list2.iterator();
                        while (it.hasNext()) {
                            if (((lr1) it.next()).a == x7j.b) {
                            }
                        }
                        ((View) callScreen.p1.m(callScreen, CallScreen.E1[13])).setVisibility(8);
                    }
                }
                return sbi.a;
            case 1:
                Object obj3 = this.f;
                ch3.d0(obj);
                boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                CallScreen callScreen2 = this.g;
                l6m l6mVar2 = CallScreen.D1;
                if (!zBooleanValue) {
                    br4 br4VarC = rx8.C(callScreen2.M1().a);
                    CallWaitingRoomEventsWidget callWaitingRoomEventsWidget = br4VarC instanceof CallWaitingRoomEventsWidget ? (CallWaitingRoomEventsWidget) br4VarC : null;
                    if (callWaitingRoomEventsWidget != null) {
                        CallWaitingRoomEventsWidget.t1(callWaitingRoomEventsWidget);
                    }
                } else if (rx8.C(callScreen2.M1().a) != null) {
                    br4 br4VarC2 = rx8.C(callScreen2.M1().a);
                    CallWaitingRoomEventsWidget callWaitingRoomEventsWidget2 = br4VarC2 instanceof CallWaitingRoomEventsWidget ? (CallWaitingRoomEventsWidget) br4VarC2 : null;
                    if (callWaitingRoomEventsWidget2 != null) {
                        callScreen2.J1(callWaitingRoomEventsWidget2);
                    }
                } else {
                    zp3 zp3VarM1 = callScreen2.M1();
                    hve hveVar = zp3VarM1.a;
                    if (!cqk.d(zp3VarM1.b(), "call_waiting_room_widget_tag")) {
                        hveVar.S(false);
                        CallWaitingRoomEventsWidget callWaitingRoomEventsWidget3 = new CallWaitingRoomEventsWidget(callScreen2.f);
                        callScreen2.J1(callWaitingRoomEventsWidget3);
                        lve lveVarE = oc9.e(callWaitingRoomEventsWidget3, null, null);
                        lveVarE.e("call_waiting_room_widget_tag");
                        hveVar.T(lveVarE);
                    }
                }
                return sbi.a;
            case 2:
                Object obj4 = this.f;
                ch3.d0(obj);
                boolean zBooleanValue2 = ((Boolean) obj4).booleanValue();
                l6m l6mVar3 = CallScreen.D1;
                this.g.F1(false, !zBooleanValue2);
                return sbi.a;
            case 3:
                Object obj5 = this.f;
                ch3.d0(obj);
                CallScreen callScreen3 = this.g;
                r6a r6aVar = ((ve1) callScreen3.J.m(callScreen3, CallScreen.E1[8])).s;
                if (((ve1) r6aVar.a).getWidth() != 0 && ((ve1) r6aVar.a).getHeight() != 0 && ((ve1) r6aVar.a).isLaidOut() && ((valueAnimator = (ValueAnimator) r6aVar.b) == null || !valueAnimator.isRunning())) {
                    Context context = ((ve1) r6aVar.a).getContext();
                    while (true) {
                        if (!(context instanceof ContextWrapper)) {
                            activity = null;
                        } else if (context instanceof Activity) {
                            activity = (Activity) context;
                        } else {
                            context = ((ContextWrapper) context).getBaseContext();
                        }
                    }
                    if (activity != null && (window = activity.getWindow()) != null) {
                        ve1 ve1Var = (ve1) r6aVar.a;
                        Bitmap bitmapCreateBitmap = Bitmap.createBitmap((int) (ve1Var.getWidth() * 0.5f), (int) (ve1Var.getHeight() * 0.5f), Bitmap.Config.ARGB_8888);
                        ((ve1) r6aVar.a).getLocationInWindow((int[]) r6aVar.c);
                        int[] iArr = (int[]) r6aVar.c;
                        int i4 = iArr[0];
                        Rect rect = new Rect(i4, iArr[1], ((ve1) r6aVar.a).getWidth() + i4, ((ve1) r6aVar.a).getHeight() + ((int[]) r6aVar.c)[1]);
                        final CountDownLatch countDownLatch = new CountDownLatch(1);
                        final sfe sfeVar = new sfe();
                        HandlerThread handlerThread = new HandlerThread("SessionSwitchSnapshot");
                        handlerThread.start();
                        try {
                            try {
                                PixelCopy.request(window, rect, bitmapCreateBitmap, new PixelCopy.OnPixelCopyFinishedListener() { // from class: tnf
                                    @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
                                    public final void onPixelCopyFinished(int i5) {
                                        sfeVar.a = i5 == 0;
                                        countDownLatch.countDown();
                                    }
                                }, new Handler(handlerThread.getLooper()));
                                boolean zAwait = countDownLatch.await(200L, TimeUnit.MILLISECONDS);
                                boolean z = zAwait && sfeVar.a;
                                if (!z && (a4cVar = gm0.f) != null) {
                                    je9 je9Var = je9.d;
                                    if (a4cVar.b(je9Var)) {
                                        a4cVar.c(je9Var, "SessionSwitchAnimator", "Failed to Pixel copy. Awaited: " + zAwait + ", copied: " + sfeVar.a, null);
                                    }
                                }
                                poeVar = Boolean.valueOf(z);
                            } catch (Throwable th) {
                                poeVar = new poe(th);
                            }
                            Boolean bool = Boolean.FALSE;
                            boolean z2 = poeVar instanceof poe;
                            Object obj6 = poeVar;
                            if (z2) {
                                obj6 = bool;
                            }
                            boolean zBooleanValue3 = ((Boolean) obj6).booleanValue();
                            handlerThread.quitSafely();
                            if (zBooleanValue3) {
                                bitmap = bitmapCreateBitmap;
                            }
                        } catch (Throwable th2) {
                            handlerThread.quitSafely();
                            throw th2;
                        }
                    }
                    if (bitmap != null) {
                        unf unfVar = new unf(bitmap);
                        unfVar.setBounds(0, 0, ((ve1) r6aVar.a).getWidth(), ((ve1) r6aVar.a).getHeight());
                        ((ve1) r6aVar.a).getOverlay().add(unfVar);
                        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        valueAnimatorOfFloat.setStartDelay(150L);
                        valueAnimatorOfFloat.setDuration(300L);
                        valueAnimatorOfFloat.setInterpolator(new DecelerateInterpolator());
                        valueAnimatorOfFloat.addUpdateListener(new xcf(1, unfVar));
                        valueAnimatorOfFloat.addListener(new d7(r6aVar, 5, unfVar));
                        valueAnimatorOfFloat.start();
                        r6aVar.b = valueAnimatorOfFloat;
                    }
                    break;
                }
                return sbi.a;
            case 4:
                CallScreen callScreen4 = this.g;
                Object obj7 = this.f;
                ch3.d0(obj);
                qf1 qf1Var = (qf1) obj7;
                if (qf1Var instanceof pf1) {
                    l6m l6mVar4 = CallScreen.D1;
                    pf1 pf1Var = (pf1) qf1Var;
                    String strS = ((x02) callScreen4.R1().I().i.a.getValue()).s();
                    if (r5h.X0(strS) || strS.equals(pf1Var.a)) {
                        callScreen4.K1(false);
                    }
                } else {
                    if (!(qf1Var instanceof of1)) {
                        ore.o();
                        return null;
                    }
                    j8e j8eVar = callScreen4.X;
                    d62 d62Var = ((of1) qf1Var).a;
                    l6m l6mVar5 = CallScreen.D1;
                    callScreen4.O1().C(d62Var);
                    if (d62Var.h) {
                        br4 br4VarC3 = rx8.C(callScreen4.L1().a);
                        CallEventsWidget callEventsWidget = br4VarC3 instanceof CallEventsWidget ? (CallEventsWidget) br4VarC3 : null;
                        if (callEventsWidget != null) {
                            callEventsWidget.getRouter().C(callEventsWidget);
                            hu huVar = callEventsWidget.a;
                            if (huVar != null) {
                                CallScreen callScreen5 = (CallScreen) huVar.b;
                                callScreen5.N1().a.remove((CallEventsWidget) huVar.c);
                                callScreen5.L1().a();
                            }
                            callEventsWidget.a = null;
                        }
                    } else if (rx8.C(callScreen4.L1().a) != null) {
                        br4 br4VarC4 = rx8.C(callScreen4.L1().a);
                        CallEventsWidget callEventsWidget2 = br4VarC4 instanceof CallEventsWidget ? (CallEventsWidget) br4VarC4 : null;
                        if (callEventsWidget2 != null) {
                            callScreen4.I1(callEventsWidget2);
                        }
                    } else {
                        zv8[] zv8VarArr = CallScreen.E1;
                        ((FrameLayout) j8eVar.m(callScreen4, zv8VarArr[10])).setVisibility(0);
                        ((FrameLayout) j8eVar.m(callScreen4, zv8VarArr[10])).setTranslationY(0.0f);
                        zp3 zp3VarL1 = callScreen4.L1();
                        hve hveVar2 = zp3VarL1.a;
                        if (!cqk.d(zp3VarL1.b(), "call_events_widget_tag")) {
                            hveVar2.S(false);
                            CallEventsWidget callEventsWidget3 = new CallEventsWidget(callScreen4.f);
                            callScreen4.I1(callEventsWidget3);
                            lve lveVarE2 = oc9.e(callEventsWidget3, null, null);
                            lveVarE2.e("call_events_widget_tag");
                            hveVar2.T(lveVarE2);
                        }
                    }
                    callScreen4.T1(d62Var);
                }
                return sbi.a;
            case 5:
                Object obj8 = this.f;
                ch3.d0(obj);
                rbb rbbVar = (rbb) obj8;
                if (rbbVar instanceof ry1) {
                    CallScreen callScreen6 = this.g;
                    ry1 ry1Var = (ry1) rbbVar;
                    l6m l6mVar6 = CallScreen.D1;
                    pi6 pi6Var = callScreen6.R1().K().f;
                    if ((pi6Var instanceof ii6) || (pi6Var instanceof hi6) || (pi6Var instanceof ki6)) {
                        String name = CallScreen.class.getName();
                        a4c a4cVar2 = gm0.f;
                        if (a4cVar2 != null) {
                            je9 je9Var2 = je9.d;
                            if (a4cVar2.b(je9Var2)) {
                                a4cVar2.c(je9Var2, name, "handleCallScreenNavigationEvent skip event=" + ry1Var + " due to call is failed or finished.", null);
                            }
                        }
                    } else if (ry1Var instanceof by1) {
                        zv8[] zv8VarArr2 = BottomSheetWidget.t;
                        ConfirmAddOpponentToCallBottomSheet confirmAddOpponentToCallBottomSheet = new ConfirmAddOpponentToCallBottomSheet(callScreen6.f.b());
                        confirmAddOpponentToCallBottomSheet.setTargetController(callScreen6);
                        br4 parentController2 = callScreen6;
                        while (parentController2.getParentController() != null) {
                            parentController2 = parentController2.getParentController();
                        }
                        RootController rootController2 = parentController2 instanceof RootController ? (RootController) parentController2 : null;
                        hve hveVarU2 = rootController2 != null ? rootController2.u1() : null;
                        if (hveVarU2 != null) {
                            lve lveVar = new lve(confirmAddOpponentToCallBottomSheet, null, null, null, false, -1);
                            p.k(false, lveVar, true, "BottomSheetWidget");
                            hveVarU2.I(lveVar);
                        }
                    } else if (ry1Var instanceof fy1) {
                        zv8[] zv8VarArr3 = BottomSheetWidget.t;
                        ConfirmRemoveOpponentToCallBottomSheet confirmRemoveOpponentToCallBottomSheet = new ConfirmRemoveOpponentToCallBottomSheet(((fy1) ry1Var).F, callScreen6.f.b());
                        confirmRemoveOpponentToCallBottomSheet.setTargetController(callScreen6);
                        br4 parentController3 = callScreen6;
                        while (parentController3.getParentController() != null) {
                            parentController3 = parentController3.getParentController();
                        }
                        RootController rootController3 = parentController3 instanceof RootController ? (RootController) parentController3 : null;
                        hve hveVarU3 = rootController3 != null ? rootController3.u1() : null;
                        if (hveVarU3 != null) {
                            lve lveVar2 = new lve(confirmRemoveOpponentToCallBottomSheet, null, null, null, false, -1);
                            p.k(false, lveVar2, true, "BottomSheetWidget");
                            hveVarU3.I(lveVar2);
                        }
                    } else if (ry1Var instanceof oy1) {
                        ze1 ze1Var = ((oy1) ry1Var).F;
                        pp4 pp4VarB = opl.b(callScreen6, 1).c().p(ze1Var.a).b();
                        Point point = ze1Var.d;
                        if (point != null) {
                            pp4VarB.n(point.x, point.y);
                        }
                        qp4 qp4VarBuild = pp4VarB.e().l(ze1Var.b).build();
                        callScreen6.B1 = qp4VarBuild;
                        qp4VarBuild.u(callScreen6);
                    } else if (ry1Var instanceof py1) {
                        callScreen6.R1().M(false);
                        t3g t3gVar = (t3g) callScreen6.x1.getValue();
                        py1 py1Var = (py1) ry1Var;
                        int iB = callScreen6.N1().k.b();
                        xw1 xw1Var = new xw1(callScreen6, 7);
                        t3gVar.getClass();
                        t3g.b(py1Var.F, new tp9(py1Var, callScreen6, iB, xw1Var, 1));
                    } else if (ry1Var instanceof qy1) {
                        callScreen6.R1().M(false);
                        t3g t3gVar2 = (t3g) callScreen6.x1.getValue();
                        int iB2 = callScreen6.N1().k.b();
                        xw1 xw1Var2 = new xw1(callScreen6, 8);
                        t3gVar2.getClass();
                        t3g.b(xx1.b, new tp9(callScreen6, (qy1) ry1Var, iB2, xw1Var2, 2));
                    } else if (ry1Var instanceof dy1) {
                        h02 h02VarR1 = callScreen6.R1();
                        qe1 qe1Var = callScreen6.R1().K().g;
                        Long l = qe1Var != null ? qe1Var.a : null;
                        if (l != null) {
                            sa2 sa2Var = (sa2) h02VarR1.j.getValue();
                            String strA = ns4.a(h02VarR1.K().a);
                            boolean z3 = h02VarR1.K().h;
                            sa2Var.getClass();
                            sa2.c(sa2Var, "PROFILE_OPENED", strA, null, null, null, null, z3, null, 380);
                            a8j.x(h02VarR1.G, cs1.k(cs1.b, l.longValue()));
                        } else {
                            h02VarR1.getClass();
                            gm0.Y(h02.class.getName(), "Early return in openProfile cuz of chatId is null");
                        }
                    } else if (ry1Var instanceof cy1) {
                        callScreen6.R1().O();
                    } else if (ry1Var instanceof ux1) {
                        callScreen6.K1(true);
                    } else if (ry1Var instanceof my1) {
                        boolean z4 = ((my1) ry1Var).F;
                        boolean zA = callScreen6.R1().K().j.a();
                        if (!z4 && zA) {
                            callScreen6.R1().Q(false, null);
                        } else if (!z4 || !zA) {
                            if (((ao1) callScreen6.R1().u.a.getValue()).h) {
                                czf czfVar = (czf) callScreen6.d.getValue();
                                Context context2 = callScreen6.getContext();
                                ha9 ha9VarB = callScreen6.f.b();
                                jc4 jc4VarA = mol.a(((bzf) czfVar.a.getValue()).a, null, null, 6);
                                List listSingletonList = Collections.singletonList("shield");
                                a8g a8gVar = pq3.j;
                                jc4VarA.h(new nc4(R.drawable.ic_shield_24, listSingletonList, 3, 2, a8gVar.e(context2).j().b.getIcon().k, Integer.valueOf(a8gVar.e(context2).j().b.h().b), xw3.P0("line", "dot"), 0L, Integer.valueOf(tre.I0(a8gVar.e(context2).j().b.getIcon().k, 0.16f)), null));
                                jc4VarA.j(a8gVar.e(context2).j().b.getName());
                                ((bzf) czfVar.a.getValue()).b.forEach(new o01(14, new t63(1, jc4VarA, jc4.class, "addButton", "addButton([Lone/me/sdk/bottomsheet/ConfirmationBottomSheet$Button;)Lone/me/sdk/bottomsheet/ConfirmationBottomSheet$Builder;", 8, 20)));
                                confirmationBottomSheetE = jc4VarA.e(ha9VarB);
                                callScreen6.e = confirmationBottomSheetE;
                                zv8[] zv8VarArr4 = BottomSheetWidget.t;
                                confirmationBottomSheetE.setTargetController(callScreen6);
                                parentController = callScreen6;
                                while (parentController.getParentController() != null) {
                                    parentController = parentController.getParentController();
                                }
                                if (parentController instanceof RootController) {
                                    rootController = (RootController) parentController;
                                } else {
                                    rootController = null;
                                }
                                if (rootController != null) {
                                }
                                if (hveVarU1 != null) {
                                    lve lveVar3 = new lve(confirmationBottomSheetE, null, null, null, false, -1);
                                    p.k(false, lveVar3, true, "BottomSheetWidget");
                                    hveVarU1.I(lveVar3);
                                }
                            } else {
                                h02 h02VarR2 = callScreen6.R1();
                                phl phlVar = h02VarR2.K().c;
                                m32 m32Var = phlVar instanceof m32 ? (m32) phlVar : null;
                                Long lValueOf = m32Var != null ? Long.valueOf(m32Var.a) : null;
                                if (lValueOf == null) {
                                    gm0.n(h02.class.getName(), "isOpponentInContact skipping, of not p2p call");
                                    boolValueOf = null;
                                } else {
                                    vg4 vg4Var = (vg4) ((no4) h02VarR2.k.getValue()).j(lValueOf.longValue()).a.getValue();
                                    boolValueOf = vg4Var == null ? Boolean.FALSE : Boolean.valueOf(vg4Var.h());
                                }
                                if (cqk.d(boolValueOf, Boolean.TRUE)) {
                                    callScreen6.S1();
                                } else {
                                    czf czfVar2 = (czf) callScreen6.d.getValue();
                                    Context context3 = callScreen6.getContext();
                                    ha9 ha9VarB2 = callScreen6.f.b();
                                    jc4 jc4VarA2 = mol.a(((bzf) czfVar2.a.getValue()).a, null, null, 6);
                                    List listSingletonList2 = Collections.singletonList("shield");
                                    a8g a8gVar2 = pq3.j;
                                    jc4VarA2.h(new nc4(R.drawable.ic_shield_24, listSingletonList2, 3, 2, a8gVar2.e(context3).j().b.getIcon().k, Integer.valueOf(a8gVar2.e(context3).j().b.h().b), xw3.P0("line", "dot"), 0L, Integer.valueOf(tre.I0(a8gVar2.e(context3).j().b.getIcon().k, 0.16f)), null));
                                    jc4VarA2.j(a8gVar2.e(context3).j().b.getName());
                                    ((bzf) czfVar2.a.getValue()).b.forEach(new o01(14, new t63(1, jc4VarA2, jc4.class, "addButton", "addButton([Lone/me/sdk/bottomsheet/ConfirmationBottomSheet$Button;)Lone/me/sdk/bottomsheet/ConfirmationBottomSheet$Builder;", 8, 20)));
                                    confirmationBottomSheetE = jc4VarA2.e(ha9VarB2);
                                    callScreen6.e = confirmationBottomSheetE;
                                    zv8[] zv8VarArr5 = BottomSheetWidget.t;
                                    confirmationBottomSheetE.setTargetController(callScreen6);
                                    parentController = callScreen6;
                                    while (parentController.getParentController() != null) {
                                        parentController = parentController.getParentController();
                                    }
                                    if (parentController instanceof RootController) {
                                        rootController = (RootController) parentController;
                                    } else {
                                        rootController = null;
                                    }
                                    hveVarU1 = rootController != null ? rootController.u1() : null;
                                    if (hveVarU1 != null) {
                                        lve lveVar4 = new lve(confirmationBottomSheetE, null, null, null, false, -1);
                                        p.k(false, lveVar4, true, "BottomSheetWidget");
                                        hveVarU1.I(lveVar4);
                                    }
                                }
                            }
                        }
                    } else {
                        int i5 = 4;
                        if (ry1Var instanceof hy1) {
                            h02 h02VarR3 = callScreen6.R1();
                            yab.i0(h02VarR3.b, null, 0, new qt1(h02VarR3, ((hy1) ry1Var).F, r8, i5), 3);
                        } else if (ry1Var instanceof wx1) {
                            callScreen6.K1(false);
                        } else if (ry1Var instanceof vx1) {
                            callScreen6.R1().E(((vx1) ry1Var).F, false);
                        } else if (ry1Var instanceof ay1) {
                            String string = callScreen6.getContext().getString(R.string.call_screen_invite_to_p2p_title);
                            cs1 cs1Var = cs1.b;
                            String name2 = CallScreen.class.getName();
                            cs1Var.getClass();
                            Intent intent = new Intent();
                            intent.setAction("android.intent.action.SEND");
                            intent.setType(HTTP.PLAIN_TEXT_TYPE);
                            o65.c(cs1Var.b(), ":chats/callshare", n1g.i(new ylc("oneme:share:data", intent), new ylc("calls_share_title", string), new ylc("tag", name2)), null, 4);
                        } else if (ry1Var instanceof ny1) {
                            o65.c(cs1.b.b(), ":call-opponents-list?arg_key_scope_id=".concat(callScreen6.f.a), null, null, 6);
                        } else if (ry1Var instanceof yx1) {
                            it3.a(callScreen6.getContext(), ((yx1) ry1Var).F);
                            if (it3.b()) {
                                String string2 = callScreen6.getContext().getString(R.string.call_link_share_dialog_share_link_copy);
                                h8c h8cVar = new h8c(callScreen6);
                                h8cVar.n(string2);
                                h8cVar.e(new y42(4, null));
                                h8cVar.c(new o8c(0, 0, 0, 11));
                                h8cVar.p();
                            }
                        } else if (ry1Var instanceof jy1) {
                            zv8[] zv8VarArr6 = BottomSheetWidget.t;
                            CallMoreBottomSheet callMoreBottomSheet = new CallMoreBottomSheet(callScreen6.f, vr1.b);
                            callMoreBottomSheet.setTargetController(callScreen6);
                            br4 parentController4 = callScreen6;
                            while (parentController4.getParentController() != null) {
                                parentController4 = parentController4.getParentController();
                            }
                            RootController rootController4 = parentController4 instanceof RootController ? (RootController) parentController4 : null;
                            hve hveVarU4 = rootController4 != null ? rootController4.u1() : null;
                            if (hveVarU4 != null) {
                                lve lveVar5 = new lve(callMoreBottomSheet, null, null, null, false, -1);
                                p.k(false, lveVar5, true, "BottomSheetWidget");
                                hveVarU4.I(lveVar5);
                            }
                        } else if (ry1Var instanceof gy1) {
                            zv8[] zv8VarArr7 = BottomSheetWidget.t;
                            RaiseHandActionBottomSheet raiseHandActionBottomSheet = new RaiseHandActionBottomSheet(callScreen6.f, ((gy1) ry1Var).F);
                            raiseHandActionBottomSheet.setTargetController(callScreen6);
                            br4 parentController5 = callScreen6;
                            while (parentController5.getParentController() != null) {
                                parentController5 = parentController5.getParentController();
                            }
                            RootController rootController5 = parentController5 instanceof RootController ? (RootController) parentController5 : null;
                            hve hveVarU5 = rootController5 != null ? rootController5.u1() : null;
                            if (hveVarU5 != null) {
                                lve lveVar6 = new lve(raiseHandActionBottomSheet, null, null, null, false, -1);
                                p.k(false, lveVar6, true, "BottomSheetWidget");
                                hveVarU5.I(lveVar6);
                            }
                        } else if (ry1Var instanceof iy1) {
                            zv8[] zv8VarArr8 = BottomSheetWidget.t;
                            StartRecordBottomSheet startRecordBottomSheet = new StartRecordBottomSheet(callScreen6.f);
                            startRecordBottomSheet.setTargetController(callScreen6);
                            br4 parentController6 = callScreen6;
                            while (parentController6.getParentController() != null) {
                                parentController6 = parentController6.getParentController();
                            }
                            RootController rootController6 = parentController6 instanceof RootController ? (RootController) parentController6 : null;
                            hve hveVarU6 = rootController6 != null ? rootController6.u1() : null;
                            if (hveVarU6 != null) {
                                lve lveVar7 = new lve(startRecordBottomSheet, null, null, null, false, -1);
                                p.k(false, lveVar7, true, "BottomSheetWidget");
                                hveVarU6.I(lveVar7);
                            }
                        } else if (ry1Var instanceof ky1) {
                            zv8[] zv8VarArr9 = BottomSheetWidget.t;
                            RecordExitBottomSheet recordExitBottomSheet = new RecordExitBottomSheet(callScreen6.f, cde.b, null, 4, null);
                            recordExitBottomSheet.setTargetController(callScreen6);
                            br4 parentController7 = callScreen6;
                            while (parentController7.getParentController() != null) {
                                parentController7 = parentController7.getParentController();
                            }
                            RootController rootController7 = parentController7 instanceof RootController ? (RootController) parentController7 : null;
                            hve hveVarU7 = rootController7 != null ? rootController7.u1() : null;
                            if (hveVarU7 != null) {
                                lve lveVar8 = new lve(recordExitBottomSheet, null, null, null, false, -1);
                                p.k(false, lveVar8, true, "BottomSheetWidget");
                                hveVarU7.I(lveVar8);
                            }
                        } else if (ry1Var instanceof zx1) {
                            zv8[] zv8VarArr10 = BottomSheetWidget.t;
                            RecordExitBottomSheet recordExitBottomSheet2 = new RecordExitBottomSheet(callScreen6.f, cde.a, null, 4, null);
                            recordExitBottomSheet2.setTargetController(callScreen6);
                            br4 parentController8 = callScreen6;
                            while (parentController8.getParentController() != null) {
                                parentController8 = parentController8.getParentController();
                            }
                            RootController rootController8 = parentController8 instanceof RootController ? (RootController) parentController8 : null;
                            hve hveVarU8 = rootController8 != null ? rootController8.u1() : null;
                            if (hveVarU8 != null) {
                                lve lveVar9 = new lve(recordExitBottomSheet2, null, null, null, false, -1);
                                p.k(false, lveVar9, true, "BottomSheetWidget");
                                hveVarU8.I(lveVar9);
                            }
                        } else if (ry1Var instanceof ey1) {
                            zv8[] zv8VarArr11 = BottomSheetWidget.t;
                            CallMoreBottomSheet callMoreBottomSheet2 = new CallMoreBottomSheet(callScreen6.f, vr1.a);
                            callMoreBottomSheet2.setTargetController(callScreen6);
                            br4 parentController9 = callScreen6;
                            while (parentController9.getParentController() != null) {
                                parentController9 = parentController9.getParentController();
                            }
                            RootController rootController9 = parentController9 instanceof RootController ? (RootController) parentController9 : null;
                            hve hveVarU9 = rootController9 != null ? rootController9.u1() : null;
                            if (hveVarU9 != null) {
                                lve lveVar10 = new lve(callMoreBottomSheet2, null, null, null, false, -1);
                                p.k(false, lveVar10, true, "BottomSheetWidget");
                                hveVarU9.I(lveVar10);
                            }
                        } else {
                            if (!(ry1Var instanceof ly1)) {
                                ore.o();
                                return null;
                            }
                            cs1.b.l(((ly1) ry1Var).F, callScreen6.getContext().getString(R.string.call_screen_share_link_title), CallScreen.class.getName());
                        }
                    }
                } else if (rbbVar instanceof i65) {
                    cs1.b.e((i65) rbbVar);
                }
                return sbi.a;
            case 6:
                Object obj9 = this.f;
                ch3.d0(obj);
                CallScreen callScreen7 = this.g;
                l6m l6mVar7 = CallScreen.D1;
                if (callScreen7.O1().B()) {
                    f9b f9bVarI = callScreen7.R1().e.i();
                    do {
                        value = f9bVarI.getValue();
                    } while (!f9bVarI.h(value, k52.a((k52) value, null, 0, null, null, null, null, 0L, 511)));
                }
                return sbi.a;
            default:
                CallScreen callScreen8 = this.g;
                Object obj10 = this.f;
                ch3.d0(obj);
                boolean zBooleanValue4 = ((Boolean) obj10).booleanValue();
                if (!zBooleanValue4) {
                    if (zBooleanValue4) {
                        ore.o();
                        return null;
                    }
                    br4 br4VarC5 = rx8.C(CallScreen.D1(callScreen8).a);
                    VpnPanelWidget vpnPanelWidget = br4VarC5 instanceof VpnPanelWidget ? (VpnPanelWidget) br4VarC5 : null;
                    if (vpnPanelWidget != null) {
                        vpnPanelWidget.getRouter().C(vpnPanelWidget);
                        ks9 ks9Var = vpnPanelWidget.a;
                        if (ks9Var != null) {
                            CallScreen.D1((CallScreen) ks9Var.b).a();
                        }
                        vpnPanelWidget.a = null;
                    }
                } else if (rx8.C(CallScreen.D1(callScreen8).a) == null) {
                    zp3 zp3VarD1 = CallScreen.D1(callScreen8);
                    hve hveVar3 = zp3VarD1.a;
                    if (!cqk.d(zp3VarD1.b(), "call_vpn_panel_widget_tag")) {
                        hveVar3.S(false);
                        VpnPanelWidget vpnPanelWidget2 = new VpnPanelWidget(callScreen8.f);
                        vpnPanelWidget2.a = new ks9(i, callScreen8);
                        lve lveVarE3 = oc9.e(vpnPanelWidget2, null, null);
                        lveVarE3.e("call_vpn_panel_widget_tag");
                        hveVar3.T(lveVarE3);
                    }
                }
                return sbi.a;
        }
    }
}
