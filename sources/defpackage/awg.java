package defpackage;

import android.view.KeyEvent;
import android.widget.FrameLayout;
import java.util.WeakHashMap;
import one.me.keyboardmedia.MediaKeyboardWidget;
import one.me.sdk.messagewrite.MessageWriteWidget;
import one.me.stories.viewer.viewer.widgets.writebar.StoriesWriteBarWidget;

/* JADX INFO: loaded from: classes3.dex */
public final class awg extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ StoriesWriteBarWidget g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ awg(lq4 lq4Var, StoriesWriteBarWidget storiesWriteBarWidget, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = storiesWriteBarWidget;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        StoriesWriteBarWidget storiesWriteBarWidget = this.g;
        switch (i) {
            case 0:
                awg awgVar = new awg(lq4Var, storiesWriteBarWidget, 0);
                awgVar.f = obj;
                return awgVar;
            case 1:
                awg awgVar2 = new awg(lq4Var, storiesWriteBarWidget, 1);
                awgVar2.f = obj;
                return awgVar2;
            case 2:
                awg awgVar3 = new awg(lq4Var, storiesWriteBarWidget, 2);
                awgVar3.f = obj;
                return awgVar3;
            case 3:
                awg awgVar4 = new awg(lq4Var, storiesWriteBarWidget, 3);
                awgVar4.f = obj;
                return awgVar4;
            case 4:
                awg awgVar5 = new awg(lq4Var, storiesWriteBarWidget, 4);
                awgVar5.f = obj;
                return awgVar5;
            case 5:
                awg awgVar6 = new awg(lq4Var, storiesWriteBarWidget, 5);
                awgVar6.f = obj;
                return awgVar6;
            default:
                awg awgVar7 = new awg(lq4Var, storiesWriteBarWidget, 6);
                awgVar7.f = obj;
                return awgVar7;
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        lq4 lq4Var = (lq4) obj2;
        switch (i) {
            case 0:
                ((awg) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            case 1:
                ((awg) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            case 2:
                ((awg) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            case 3:
                ((awg) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            case 4:
                ((awg) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            case 5:
                ((awg) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            default:
                ((awg) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
        }
        return sbiVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        int i = 3;
        byte b = 0;
        switch (this.e) {
            case 0:
                Object obj2 = this.f;
                ch3.d0(obj);
                int iIntValue = ((Number) obj2).intValue();
                StoriesWriteBarWidget storiesWriteBarWidget = this.g;
                zv8[] zv8VarArr = StoriesWriteBarWidget.n;
                MessageWriteWidget messageWriteWidgetT1 = storiesWriteBarWidget.t1();
                if (messageWriteWidgetT1 != null) {
                    messageWriteWidgetT1.B = iIntValue;
                }
                return sbi.a;
            case 1:
                Object obj3 = this.f;
                ch3.d0(obj);
                StoriesWriteBarWidget storiesWriteBarWidget2 = this.g;
                zv8[] zv8VarArr2 = StoriesWriteBarWidget.n;
                nma.L(storiesWriteBarWidget2.s1(), true, 2);
                return sbi.a;
            case 2:
                Object obj4 = this.f;
                ch3.d0(obj);
                cz9 cz9Var = (cz9) obj4;
                StoriesWriteBarWidget storiesWriteBarWidget3 = this.g;
                zv8[] zv8VarArr3 = StoriesWriteBarWidget.n;
                if (cz9Var instanceof wy9) {
                    MessageWriteWidget messageWriteWidgetT2 = storiesWriteBarWidget3.t1();
                    if (messageWriteWidgetT2 != null) {
                        messageWriteWidgetT2.t1().i(((wy9) cz9Var).a);
                    }
                } else if (cz9Var instanceof yy9) {
                    storiesWriteBarWidget3.s1().N(4, ((yy9) cz9Var).a == ax8.e ? eha.a : eha.c);
                } else if (cz9Var instanceof vy9) {
                    MessageWriteWidget messageWriteWidgetT3 = storiesWriteBarWidget3.t1();
                    if (messageWriteWidgetT3 != null) {
                        messageWriteWidgetT3.t1().f.dispatchKeyEvent(new KeyEvent(0, 67));
                    }
                } else if (cz9Var instanceof bz9) {
                    vvg vvgVarU1 = storiesWriteBarWidget3.u1();
                    long j = ((bz9) cz9Var).a;
                    Long l = (Long) vvgVarU1.c.getValue();
                    if (l != null) {
                        vvgVarU1.k.B(vvgVarU1, vvg.q[1], yab.h0(vvgVarU1.b, ((n0c) vvgVarU1.C()).a(), 2, new io4(vvgVarU1, l.longValue(), j, null, 1)));
                    } else {
                        String str = vvgVarU1.g;
                        a4c a4cVar = gm0.f;
                        if (a4cVar != null) {
                            je9 je9Var = je9.f;
                            if (a4cVar.b(je9Var)) {
                                a4cVar.c(je9Var, str, "can't reactToStoryWithSticker cuz storyId is null", null);
                            }
                        }
                    }
                    storiesWriteBarWidget3.u1().D();
                } else if (!(cz9Var instanceof az9) && !(cz9Var instanceof zy9) && !(cz9Var instanceof xy9)) {
                    ore.o();
                    return null;
                }
                return sbi.a;
            case 3:
                Object obj5 = this.f;
                ch3.d0(obj);
                StoriesWriteBarWidget storiesWriteBarWidget4 = this.g;
                j8e j8eVar = storiesWriteBarWidget4.k;
                zka zkaVar = (zka) ((ec6) obj5).a;
                zv8[] zv8VarArr4 = StoriesWriteBarWidget.n;
                int iOrdinal = zkaVar.a.ordinal();
                if (iOrdinal == 0) {
                    kz9 kz9Var = storiesWriteBarWidget4.l;
                    if (kz9Var != null) {
                        zv8[] zv8VarArr5 = kz9.p;
                        kz9Var.i(true);
                    }
                    storiesWriteBarWidget4.q1(storiesWriteBarWidget4.r1());
                } else if (iOrdinal == 1) {
                    zv8[] zv8VarArr6 = StoriesWriteBarWidget.n;
                    if (!((hve) j8eVar.m(storiesWriteBarWidget4, zv8VarArr6[4])).o()) {
                        hve hveVar = (hve) j8eVar.m(storiesWriteBarWidget4, zv8VarArr6[4]);
                        MediaKeyboardWidget mediaKeyboardWidget = new MediaKeyboardWidget(storiesWriteBarWidget4.a, 0L, true, false, null, false, 56, null);
                        mediaKeyboardWidget.setTargetWidget(storiesWriteBarWidget4);
                        mediaKeyboardWidget.f = storiesWriteBarWidget4.c;
                        kbc kbcVar = pq3.j.e(storiesWriteBarWidget4.getContext()).j().b;
                        mediaKeyboardWidget.p = kbcVar;
                        sw8 sw8Var = mediaKeyboardWidget.o;
                        if (sw8Var != null) {
                            sw8Var.L(kbcVar);
                        }
                        hveVar.T(oc9.e(mediaKeyboardWidget, null, null));
                    }
                    tp2 tp2VarR1 = storiesWriteBarWidget4.r1();
                    WeakHashMap weakHashMap = i7j.a;
                    swj.a(tp2VarR1, null);
                    y6j.l(storiesWriteBarWidget4.r1(), null);
                    kz9 kz9Var2 = storiesWriteBarWidget4.l;
                    if (kz9Var2 != null) {
                        kz9Var2.l();
                    }
                } else if (iOrdinal == 2) {
                    MessageWriteWidget messageWriteWidgetT4 = storiesWriteBarWidget4.t1();
                    if (messageWriteWidgetT4 != null) {
                        messageWriteWidgetT4.K1();
                    }
                    e9i.j0(n1g.v(new fz6(new jz(new hde(uw8.f, 9), 11), new hpf(storiesWriteBarWidget4, b == true ? 1 : 0, 8), i), storiesWriteBarWidget4.getViewLifecycleOwner().f(), n09.d), storiesWriteBarWidget4.getViewLifecycleScope());
                }
                return sbi.a;
            case 4:
                StoriesWriteBarWidget storiesWriteBarWidget5 = this.g;
                Object obj6 = this.f;
                ch3.d0(obj);
                nvg nvgVar = (nvg) obj6;
                if (cqk.d(nvgVar, mvg.a)) {
                    if (((Boolean) uw8.f.getValue()).booleanValue()) {
                        zv8[] zv8VarArr7 = StoriesWriteBarWidget.n;
                        MessageWriteWidget messageWriteWidgetT5 = storiesWriteBarWidget5.t1();
                        if (messageWriteWidgetT5 != null) {
                            messageWriteWidgetT5.i();
                        }
                    } else {
                        zv8[] zv8VarArr8 = StoriesWriteBarWidget.n;
                        ((ez9) storiesWriteBarWidget5.g.getValue()).B();
                    }
                } else {
                    if (!cqk.d(nvgVar, lvg.a)) {
                        ore.o();
                        return null;
                    }
                    zv8[] zv8VarArr9 = StoriesWriteBarWidget.n;
                    MessageWriteWidget messageWriteWidgetT6 = storiesWriteBarWidget5.t1();
                    if (messageWriteWidgetT6 != null) {
                        messageWriteWidgetT6.H1(null);
                    }
                    StoriesWriteBarWidget.p1(storiesWriteBarWidget5);
                }
                return sbi.a;
            case 5:
                Object obj7 = this.f;
                ch3.d0(obj);
                Boolean bool = (Boolean) obj7;
                bool.getClass();
                StoriesWriteBarWidget storiesWriteBarWidget6 = this.g;
                zv8[] zv8VarArr10 = StoriesWriteBarWidget.n;
                mjg mjgVar = storiesWriteBarWidget6.s1().w1;
                mjgVar.getClass();
                mjgVar.j(null, bool);
                return sbi.a;
            default:
                ovg ovgVar = ovg.a;
                a8g a8gVar = pq3.j;
                Object obj8 = this.f;
                ch3.d0(obj);
                e5i e5iVar = (e5i) obj8;
                yka ykaVar = (yka) e5iVar.a;
                boolean zBooleanValue = ((Boolean) e5iVar.b).booleanValue();
                Boolean bool2 = (Boolean) e5iVar.c;
                boolean zBooleanValue2 = bool2.booleanValue();
                StoriesWriteBarWidget storiesWriteBarWidget7 = this.g;
                zv8[] zv8VarArr11 = StoriesWriteBarWidget.n;
                mjg mjgVar2 = storiesWriteBarWidget7.u1().m;
                mjgVar2.getClass();
                mjgVar2.j(null, bool2);
                int i2 = ykaVar == null ? -1 : zvg.$EnumSwitchMapping$0[ykaVar.ordinal()];
                if (i2 == -1 || i2 == 1 || i2 == 2 || i2 == 3) {
                    if (zBooleanValue || zBooleanValue2) {
                        a8j.x(storiesWriteBarWidget7.u1().n, ovgVar);
                        MessageWriteWidget messageWriteWidgetT7 = storiesWriteBarWidget7.t1();
                        if (messageWriteWidgetT7 != null && messageWriteWidgetT7.getView() != null) {
                            messageWriteWidgetT7.t1().setTransparent(false);
                        }
                        MessageWriteWidget messageWriteWidgetT8 = storiesWriteBarWidget7.t1();
                        if (messageWriteWidgetT8 != null && messageWriteWidgetT8.getView() != null) {
                            messageWriteWidgetT8.t1().setDisallowParentInterceptTouchEvent(true);
                        }
                        ((FrameLayout) storiesWriteBarWidget7.m.m(storiesWriteBarWidget7, StoriesWriteBarWidget.n[5])).setBackgroundColor(a8gVar.e(storiesWriteBarWidget7.getContext()).j().b.b().c);
                    } else {
                        a8j.x(storiesWriteBarWidget7.u1().n, pvg.a);
                        MessageWriteWidget messageWriteWidgetT9 = storiesWriteBarWidget7.t1();
                        CharSequence text = messageWriteWidgetT9 != null ? messageWriteWidgetT9.t1().getText() : null;
                        if (text == null || r5h.X0(text)) {
                            StoriesWriteBarWidget.p1(storiesWriteBarWidget7);
                        }
                        ((FrameLayout) storiesWriteBarWidget7.m.m(storiesWriteBarWidget7, StoriesWriteBarWidget.n[5])).setBackgroundColor(0);
                    }
                } else {
                    if (i2 != 4) {
                        ore.o();
                        return null;
                    }
                    a8j.x(storiesWriteBarWidget7.u1().n, ovgVar);
                    MessageWriteWidget messageWriteWidgetT10 = storiesWriteBarWidget7.t1();
                    if (messageWriteWidgetT10 != null && messageWriteWidgetT10.getView() != null) {
                        messageWriteWidgetT10.t1().setTransparent(false);
                    }
                    MessageWriteWidget messageWriteWidgetT11 = storiesWriteBarWidget7.t1();
                    if (messageWriteWidgetT11 != null && messageWriteWidgetT11.getView() != null) {
                        messageWriteWidgetT11.t1().setDisallowParentInterceptTouchEvent(true);
                    }
                    ((FrameLayout) storiesWriteBarWidget7.m.m(storiesWriteBarWidget7, StoriesWriteBarWidget.n[5])).setBackgroundColor(a8gVar.e(storiesWriteBarWidget7.getContext()).j().b.b().c);
                }
                return sbi.a;
        }
    }
}
