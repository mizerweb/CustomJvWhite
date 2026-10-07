package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import one.me.android.MainActivity;
import one.me.login.LoginScreen;
import one.me.login.inputphone.InputPhoneScreen;
import one.me.sdk.uikit.common.span.FitFontImageSpan;
import org.apache.http.conn.params.ConnManagerParams;
import org.json.JSONObject;
import ru.ok.tamtam.workmanager.BacklogWorker;

/* JADX INFO: loaded from: classes.dex */
public final class y73 extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y73(Object obj, lq4 lq4Var, a83 a83Var) {
        super(2, lq4Var);
        this.e = 0;
        this.f = obj;
        this.g = a83Var;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        Object obj2 = this.g;
        switch (i) {
            case 0:
                return new y73(this.f, lq4Var, (a83) obj2);
            case 1:
                y73 y73Var = new y73((in0) obj2, lq4Var, 1);
                y73Var.f = obj;
                return y73Var;
            case 2:
                return new y73((BacklogWorker) this.f, (HashSet) obj2, lq4Var, 2);
            case 3:
                y73 y73Var2 = new y73((ym1) obj2, lq4Var, 3);
                y73Var2.f = obj;
                return y73Var2;
            case 4:
                y73 y73Var3 = new y73((e13) obj2, lq4Var, 4);
                y73Var3.f = obj;
                return y73Var3;
            case 5:
                return new y73((ny8) this.f, (xn3) obj2, lq4Var, 5);
            case 6:
                y73 y73Var4 = new y73((pq3) obj2, lq4Var, 6);
                y73Var4.f = obj;
                return y73Var4;
            case 7:
                y73 y73Var5 = new y73((sy4) obj2, lq4Var, 7);
                y73Var5.f = obj;
                return y73Var5;
            case 8:
                y73 y73Var6 = new y73((ex5) obj2, lq4Var, 8);
                y73Var6.f = obj;
                return y73Var6;
            case 9:
                y73 y73Var7 = new y73((nh8) obj2, lq4Var, 9);
                y73Var7.f = obj;
                return y73Var7;
            case 10:
                y73 y73Var8 = new y73((bi8) obj2, lq4Var, 10);
                y73Var8.f = obj;
                return y73Var8;
            case 11:
                y73 y73Var9 = new y73((af7) obj2, lq4Var, 11);
                y73Var9.f = obj;
                return y73Var9;
            case 12:
                y73 y73Var10 = new y73((w09) obj2, lq4Var, 12);
                y73Var10.f = obj;
                return y73Var10;
            case 13:
                y73 y73Var11 = new y73(lq4Var, (LoginScreen) obj2);
                y73Var11.f = obj;
                return y73Var11;
            case 14:
                y73 y73Var12 = new y73((evb) obj2, lq4Var, 14);
                y73Var12.f = obj;
                return y73Var12;
            case 15:
                y73 y73Var13 = new y73((n3) obj2, lq4Var, 15);
                y73Var13.f = obj;
                return y73Var13;
            case 16:
                y73 y73Var14 = new y73((qf7) obj2, lq4Var, 16);
                y73Var14.f = obj;
                return y73Var14;
            case 17:
                y73 y73Var15 = new y73((List) obj2, lq4Var, 17);
                y73Var15.f = obj;
                return y73Var15;
            case 18:
                y73 y73Var16 = new y73((ny8) obj2, lq4Var, 18);
                y73Var16.f = obj;
                return y73Var16;
            case 19:
                return new y73((mnh) this.f, (ifh) obj2, lq4Var, 19);
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                y73 y73Var17 = new y73((Context) obj2, lq4Var, 20);
                y73Var17.f = obj;
                return y73Var17;
            default:
                return new y73((xyj) this.f, (vzj) obj2, lq4Var, 21);
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        int i = this.e;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                return ((y73) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 1:
                ((y73) create((xm0) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 2:
                ((y73) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 3:
                ((y73) create((nm1) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 4:
                ((y73) create((kbc) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 5:
                ((y73) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 6:
                ((y73) create((kbc) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 7:
                ((y73) create((List) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 8:
                ((y73) create((bx5) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 9:
                ((y73) create((List) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 10:
                ((y73) create((ag9) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 11:
                return ((y73) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 12:
                ((y73) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 13:
                ((y73) create(obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 14:
                ((y73) create((rub) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 15:
                ((y73) create((lza) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 16:
                return ((y73) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 17:
                return ((y73) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 18:
                ((y73) create((ohf) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 19:
                ((y73) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                ((y73) create((String) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            default:
                ((y73) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
        }
    }

    /* JADX WARN: Code duplicated, block: B:124:0x0327  */
    /* JADX WARN: Code duplicated, block: B:126:0x032e  */
    /* JADX WARN: Code duplicated, block: B:129:0x0338  */
    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object poeVar;
        Object obj2;
        int i;
        boolean z;
        Object poeVar2;
        sbi sbiVar;
        switch (this.e) {
            case 0:
                ch3.d0(obj);
                rt2 rt2Var = (rt2) this.f;
                try {
                    return a83.a((a83) this.g, rt2Var);
                } catch (CancellationException e) {
                    throw e;
                } catch (Throwable th) {
                    String str = ((a83) this.g).b;
                    x73 x73Var = new x73(rt2Var.A(), th);
                    a4c a4cVar = gm0.f;
                    if (a4cVar == null) {
                        return null;
                    }
                    je9 je9Var = je9.f;
                    if (!a4cVar.b(je9Var)) {
                        return null;
                    }
                    a4cVar.c(je9Var, str, zo5.j(rt2Var.a, "ChatModelConverter.convertChatToModel() failed for "), x73Var);
                    return null;
                }
            case 1:
                xm0 xm0Var = (xm0) this.f;
                ch3.d0(obj);
                a4c a4cVar2 = gm0.f;
                if (a4cVar2 != null) {
                    je9 je9Var2 = je9.d;
                    if (a4cVar2.b(je9Var2)) {
                        a4cVar2.c(je9Var2, "KeepBackground", "PMS keepBackgroundSocket changed: " + xm0Var, null);
                    }
                }
                xm0Var.getClass();
                if (!(xm0Var instanceof vm0) && ((in0) this.g).e()) {
                    gm0.n("KeepBackground", "PMS disabled, force-disabling feature");
                    ((in0) this.g).j(false);
                }
                return sbi.a;
            case 2:
                ch3.d0(obj);
                ((BacklogWorker) this.f).n().g().delete(ww3.T1((HashSet) this.g));
                return sbi.a;
            case 3:
                sbi sbiVar2 = sbi.a;
                ym1 ym1Var = (ym1) this.g;
                nm1 nm1Var = (nm1) this.f;
                ch3.d0(obj);
                if (nm1Var == null) {
                    ym1Var.w();
                    if (!((b95) ym1Var.h.getValue()).g()) {
                        ym1Var.C = null;
                    }
                } else if (nm1Var.b()) {
                    ym1Var.w();
                } else {
                    MainActivity mainActivity = ym1Var.n;
                    if (mainActivity == null) {
                        gm0.Y(ym1.class.getName(), "Early return in showHeldCallBanner cuz of activity is null");
                    } else {
                        wu7 wu7Var = ym1Var.B;
                        if (wu7Var == null) {
                            wu7Var = new wu7(mainActivity);
                            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-1, -2, 1002, 296, -3);
                            layoutParams.gravity = 48;
                            Integer numL = n7j.l(mainActivity.getWindow().getDecorView());
                            int iB = zo5.b(90.0f, yl5.d().getDisplayMetrics().density, numL != null ? numL.intValue() : 0);
                            Integer num = ym1Var.C;
                            if (num != null) {
                                iB = num.intValue();
                            }
                            layoutParams.y = iB;
                            wu7Var.setOnDragDelta(new tc(wu7Var, mainActivity, ym1Var));
                            try {
                                mainActivity.getWindowManager().addView(wu7Var, layoutParams);
                                poeVar = sbiVar2;
                            } catch (Throwable th2) {
                                poeVar = new poe(th2);
                            }
                            Throwable thA = roe.a(poeVar);
                            if (thA != null) {
                                gm0.V("PipAppController", "can't add held call banner", thA);
                            }
                            ym1Var.B = wu7Var;
                        }
                        wu7Var.a(nm1Var.a(), nm1Var.c(), nm1Var.d());
                        wu7Var.setOnReturnClick(new z2(ym1Var, 13, nm1Var));
                    }
                }
                return sbiVar2;
            case 4:
                kbc kbcVar = (kbc) this.f;
                ch3.d0(obj);
                e13 e13Var = (e13) this.g;
                ifh ifhVar = e13Var.n;
                if (ifhVar.d()) {
                    Drawable drawable = (Drawable) ifhVar.getValue();
                    sb8.m0(kbcVar.getIcon().d, drawable);
                    drawable.invalidateSelf();
                }
                ifh ifhVar2 = e13Var.o;
                if (ifhVar2.d()) {
                    Drawable drawable2 = (Drawable) ifhVar2.getValue();
                    sb8.m0(kbcVar.getIcon().d, drawable2);
                    drawable2.invalidateSelf();
                }
                ifh ifhVar3 = e13Var.p;
                if (ifhVar3.d()) {
                    Drawable drawable3 = (Drawable) ifhVar3.getValue();
                    sb8.m0(kbcVar.getIcon().d, drawable3);
                    drawable3.invalidateSelf();
                }
                ifh ifhVar4 = e13Var.q;
                if (ifhVar4.d()) {
                    Drawable drawable4 = (Drawable) ifhVar4.getValue();
                    sb8.m0(kbcVar.getIcon().d, drawable4);
                    drawable4.invalidateSelf();
                }
                ifh ifhVar5 = e13Var.r;
                if (ifhVar5.d()) {
                    Drawable drawable5 = (Drawable) ifhVar5.getValue();
                    sb8.m0(kbcVar.getIcon().d, drawable5);
                    drawable5.invalidateSelf();
                }
                ifh ifhVar6 = e13Var.s;
                if (ifhVar6.d()) {
                    Drawable drawable6 = (Drawable) ifhVar6.getValue();
                    sb8.m0(kbcVar.getIcon().d, drawable6);
                    drawable6.invalidateSelf();
                }
                ifh ifhVar7 = e13Var.t;
                if (ifhVar7.d()) {
                    Drawable drawable7 = (Drawable) ifhVar7.getValue();
                    sb8.m0(kbcVar.getIcon().d, drawable7);
                    drawable7.invalidateSelf();
                }
                ifh ifhVar8 = e13Var.u;
                if (ifhVar8.d()) {
                    Drawable drawable8 = (Drawable) ifhVar8.getValue();
                    sb8.m0(kbcVar.getIcon().d, drawable8);
                    drawable8.invalidateSelf();
                }
                ifh ifhVar9 = e13Var.v;
                if (ifhVar9.d()) {
                    Drawable drawable9 = (Drawable) ifhVar9.getValue();
                    sb8.m0(kbcVar.getIcon().d, drawable9);
                    drawable9.invalidateSelf();
                }
                ifh ifhVar10 = e13Var.w;
                if (ifhVar10.d()) {
                    Drawable drawable10 = (Drawable) ifhVar10.getValue();
                    sb8.m0(kbcVar.getIcon().d, drawable10);
                    drawable10.invalidateSelf();
                }
                ifh ifhVar11 = e13Var.x;
                if (ifhVar11.d()) {
                    Drawable drawable11 = (Drawable) ifhVar11.getValue();
                    sb8.m0(kbcVar.getIcon().d, drawable11);
                    drawable11.invalidateSelf();
                }
                ifh ifhVar12 = e13Var.y;
                if (ifhVar12.d()) {
                    Drawable drawable12 = (Drawable) ifhVar12.getValue();
                    kbcVar.getIcon();
                    sb8.m0(-1, drawable12);
                    drawable12.invalidateSelf();
                }
                ifh ifhVar13 = e13Var.B;
                if (ifhVar13.d()) {
                    ((FitFontImageSpan) ifhVar13.getValue()).onThemeChanged(kbcVar);
                }
                ifh ifhVar14 = e13Var.C;
                if (ifhVar14.d()) {
                    ((FitFontImageSpan) ifhVar14.getValue()).onThemeChanged(kbcVar);
                }
                ifh ifhVar15 = e13Var.D;
                if (ifhVar15.d()) {
                    ((FitFontImageSpan) ifhVar15.getValue()).onThemeChanged(kbcVar);
                }
                ifh ifhVar16 = e13Var.E;
                if (ifhVar16.d()) {
                    ((FitFontImageSpan) ifhVar16.getValue()).onThemeChanged(kbcVar);
                }
                ifh ifhVar17 = e13Var.F;
                if (ifhVar17.d()) {
                    ((FitFontImageSpan) ifhVar17.getValue()).onThemeChanged(kbcVar);
                }
                return sbi.a;
            case 5:
                ch3.d0(obj);
                ((qw2) ((ny8) this.f).getValue()).G = ((xn3) this.g).c;
                return sbi.a;
            case 6:
                kbc kbcVar2 = (kbc) this.f;
                ch3.d0(obj);
                ((mjg) ((pq3) this.g).f).setValue(kbcVar2);
                String str2 = (String) ((pq3) this.g).i;
                a4c a4cVar3 = gm0.f;
                if (a4cVar3 != null) {
                    je9 je9Var3 = je9.d;
                    if (a4cVar3.b(je9Var3)) {
                        a4cVar3.c(je9Var3, str2, "big_flow: onEach " + kbcVar2 + ", isEmitted=true", null);
                    }
                }
                return sbi.a;
            case 7:
                List list = (List) this.f;
                ch3.d0(obj);
                boolean zC = gm0.c();
                String str3 = ((sy4) this.g).c;
                a4c a4cVar4 = gm0.f;
                if (a4cVar4 != null) {
                    je9 je9Var4 = je9.d;
                    if (a4cVar4.b(je9Var4)) {
                        List<r17> list2 = list;
                        ArrayList arrayList = new ArrayList(yw3.W0(list2, 10));
                        for (r17 r17Var : list2) {
                            arrayList.add(new ylc(r17Var.a, zC ? r17Var.b : "*****"));
                        }
                        a4cVar4.c(je9Var4, str3, "Refreshing folderListFlow, order=" + arrayList, null);
                    }
                }
                ((sy4) this.g).a.b.a(list);
                return sbi.a;
            case 8:
                bx5 bx5Var = (bx5) this.f;
                ch3.d0(obj);
                a4c a4cVar5 = gm0.f;
                if (a4cVar5 != null) {
                    je9 je9Var5 = je9.d;
                    if (a4cVar5.b(je9Var5)) {
                        a4cVar5.c(je9Var5, "OneMeDynamicFont", zo5.h(bx5Var.ordinal(), "change dynamic font to "), null);
                    }
                }
                Configuration configuration = new Configuration(((ex5) this.g).b.getResources().getConfiguration());
                configuration.fontScale = Float.intBitsToFloat(Float.floatToRawIntBits(configuration.fontScale) + (i4e.b.j() ? -1 : 1));
                ((ex5) this.g).b.getResources().updateConfiguration(configuration, ((ex5) this.g).b.getResources().getDisplayMetrics());
                ((ex5) this.g).b.onConfigurationChanged(configuration);
                return sbi.a;
            case 9:
                nh8 nh8Var = (nh8) this.g;
                List list3 = (List) this.f;
                ch3.d0(obj);
                x0c x0cVar = (x0c) ww3.t1(list3);
                if (x0cVar == null || !cqk.d(((x0c) nh8Var.e.getValue()).a, x0cVar.a)) {
                    obj2 = null;
                } else {
                    mjg mjgVar = nh8Var.e;
                    mjgVar.getClass();
                    obj2 = null;
                    mjgVar.j(null, x0cVar);
                }
                mjg mjgVar2 = nh8Var.j;
                mjgVar2.getClass();
                mjgVar2.j(obj2, list3);
                return sbi.a;
            case 10:
                ag9 ag9Var = (ag9) this.f;
                ch3.d0(obj);
                ((bi8) this.g).q = ag9Var != null;
                return sbi.a;
            case 11:
                ch3.d0(obj);
                vt4 vt4VarK = ((gu4) this.f).k();
                af7 af7Var = (af7) this.g;
                try {
                    yqh yqhVar = new yqh();
                    yqhVar.i = vd7.D(vd7.B(vt4VarK), yqhVar);
                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = yqh.j;
                    try {
                        do {
                            i = atomicIntegerFieldUpdater.get(yqhVar);
                            if (i != 0) {
                                if (i != 2 && i != 3) {
                                    yqh.r(i);
                                    throw null;
                                }
                            }
                            return af7Var.invoke();
                        } while (!atomicIntegerFieldUpdater.compareAndSet(yqhVar, i, 0));
                        return af7Var.invoke();
                    } finally {
                        yqhVar.q();
                    }
                } catch (InterruptedException e2) {
                    throw new CancellationException("Blocking call was interrupted due to parent cancellation").initCause(e2);
                }
            case 12:
                ch3.d0(obj);
                gu4 gu4Var = (gu4) this.f;
                w09 w09Var = (w09) this.g;
                i19 i19Var = w09Var.a;
                if (i19Var.d.compareTo(n09.b) >= 0) {
                    i19Var.a(w09Var);
                } else {
                    vd7.d(gu4Var.k());
                }
                return sbi.a;
            case 13:
                LoginScreen loginScreen = (LoginScreen) this.g;
                Object obj3 = this.f;
                ch3.d0(obj);
                int iOrdinal = ((xg9) obj3).ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal == 1) {
                        xme xmeVar = loginScreen.d;
                        if (!xmeVar.d()) {
                            View view = loginScreen.getView();
                            ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
                            if (viewGroup != null) {
                                View view2 = (View) xmeVar.getValue();
                                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
                                layoutParams2.gravity = 17;
                                viewGroup.addView(view2, layoutParams2);
                            }
                        }
                    } else {
                        if (iOrdinal != 2) {
                            ore.o();
                            return null;
                        }
                        j8e j8eVar = loginScreen.a;
                        xme xmeVar2 = loginScreen.d;
                        if (xmeVar2.d()) {
                            View view3 = loginScreen.getView();
                            ViewGroup viewGroup2 = view3 instanceof ViewGroup ? (ViewGroup) view3 : null;
                            if (viewGroup2 != null) {
                                viewGroup2.removeView((View) xmeVar2.getValue());
                            }
                        }
                        zv8[] zv8VarArr = LoginScreen.f;
                        if (!((hve) j8eVar.m(loginScreen, zv8VarArr[0])).o()) {
                            ((hve) j8eVar.m(loginScreen, zv8VarArr[0])).e = 1;
                            hve hveVar = (hve) j8eVar.m(loginScreen, zv8VarArr[0]);
                            lve lveVar = new lve(new InputPhoneScreen(loginScreen.b), null, null, null, false, -1);
                            lveVar.e("InputPhoneScreen");
                            hveVar.T(lveVar);
                        }
                    }
                }
                return sbi.a;
            case 14:
                evb evbVar = (evb) this.g;
                rub rubVar = (rub) this.f;
                ch3.d0(obj);
                if (cqk.d(rubVar, pub.a)) {
                    evbVar.e = false;
                    evbVar.b(false);
                } else {
                    if (!cqk.d(rubVar, qub.a)) {
                        ore.o();
                        return null;
                    }
                    evbVar.e = true;
                    n7j.c(evbVar.c(), evbVar.g(), new g3(22, evbVar));
                }
                return sbi.a;
            case 15:
                n3 n3Var = (n3) this.g;
                za0 za0Var = (za0) n3Var.a;
                mjg mjgVar3 = (mjg) n3Var.e;
                hbc hbcVar = (hbc) n3Var.b;
                lza lzaVar = (lza) this.f;
                ch3.d0(obj);
                kza kzaVar = lzaVar instanceof kza ? (kza) lzaVar : null;
                int i2 = kzaVar != null ? kzaVar.h : 0;
                int i3 = i2 == 0 ? -1 : n3d.$EnumSwitchMapping$0[qt4.D(i2)];
                if (i3 == -1) {
                    mjgVar3.setValue(lzaVar);
                } else if (i3 == 1) {
                    d0j d0jVar = (d0j) hbcVar.b;
                    e3j e3jVar = d0jVar.h;
                    if (e3jVar != null) {
                        z = true;
                        if (e3jVar.d()) {
                            if (((kza) lzaVar).f) {
                                hbcVar.a();
                            }
                        }
                        if (((kza) lzaVar).i) {
                            n3Var.c = za0Var;
                            mjgVar3.setValue(lzaVar);
                        }
                    } else {
                        z = true;
                    }
                    e3j e3jVar2 = d0jVar.h;
                    if (e3jVar2 != null && e3jVar2.P() == z) {
                        if (((kza) lzaVar).f) {
                            hbcVar.a();
                        }
                    }
                    if (((kza) lzaVar).i) {
                        n3Var.c = za0Var;
                        mjgVar3.setValue(lzaVar);
                    }
                } else {
                    if (i3 != 2) {
                        ore.o();
                        return null;
                    }
                    xte xteVar = za0Var.c.a;
                    if ((xteVar.r || xteVar.q) && ((kza) lzaVar).f) {
                        za0Var.a();
                    }
                    if (((kza) lzaVar).i) {
                        n3Var.c = hbcVar;
                        mjgVar3.setValue(lzaVar);
                    }
                }
                return sbi.a;
            case 16:
                ch3.d0(obj);
                xt4 xt4Var = (xt4) ((gu4) this.f).k().x0(khb.f);
                i64 i64Var = new i64();
                lq4 lq4Var = null;
                yab.h0(yn7.a, xt4Var, 4, new gz(i64Var, (qf7) this.g, (lq4) null, 16));
                while (!i64Var.W()) {
                    try {
                        return yab.A0(xt4Var, new qn6(i64Var, lq4Var, 29));
                    } catch (InterruptedException unused) {
                        lq4Var = null;
                    }
                }
                return i64Var.z();
            case 17:
                gu4 gu4Var2 = (gu4) this.f;
                ch3.d0(obj);
                List<zzg> list4 = (List) this.g;
                ArrayList arrayList2 = new ArrayList(list4.size());
                for (zzg zzgVar : list4) {
                    cqk.m(gu4Var2);
                    File file = new File(zzgVar.e());
                    try {
                        poeVar2 = Boolean.valueOf(file.exists() ? file.delete() : false);
                    } catch (Throwable th3) {
                        poeVar2 = new poe(th3);
                    }
                    Object obj4 = Boolean.FALSE;
                    if (poeVar2 instanceof poe) {
                        poeVar2 = obj4;
                    }
                    c0a.t(zzgVar.c(), arrayList2);
                }
                return arrayList2;
            case 18:
                ohf ohfVar = (ohf) this.f;
                ch3.d0(obj);
                ((rza) ((ny8) this.g).getValue()).a(yhf.w0(ohfVar));
                return sbi.a;
            case 19:
                ch3.d0(obj);
                ((mnh) this.f).b((Layout) ((ifh) this.g).getValue());
                return sbi.a;
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                sbi sbiVar3 = sbi.a;
                je9 je9Var6 = je9.e;
                String str4 = (String) this.f;
                ch3.d0(obj);
                ifh ifhVar18 = jcj.d;
                as6 as6Var = ifhVar18 != null ? (as6) ifhVar18.getValue() : null;
                if (as6Var == null) {
                    gm0.Y(jcj.a.getClass().getName(), "prefs are null!");
                }
                if (str4 == null || str4.length() == 0) {
                    sbiVar = sbiVar3;
                    jcj jcjVar = jcj.a;
                    jcjVar.b(m94.h);
                    if (as6Var != null) {
                        zr6 zr6Var = (zr6) as6Var.edit();
                        zr6Var.clear();
                        zr6Var.commit();
                    }
                    String name = jcj.class.getName();
                    a4c a4cVar6 = gm0.f;
                    if (a4cVar6 != null && a4cVar6.b(je9Var6)) {
                        a4cVar6.c(je9Var6, name, "use defaultWatchDogConfig", null);
                    }
                    jcjVar.g((Context) this.g, false);
                } else {
                    JSONObject jSONObject = new JSONObject(str4);
                    jcj jcjVar2 = jcj.a;
                    jcjVar2.getClass();
                    boolean zOptBoolean = jSONObject.optBoolean("enabled", jcj.a().a);
                    long j = jcj.a().d;
                    lw5 lw5Var = lw5.SECONDS;
                    int iOptInt = jSONObject.optInt("stuck", (int) ew5.s(j, lw5Var));
                    int iOptInt2 = jSONObject.optInt("hang", (int) ew5.s(jcj.a().e, lw5Var));
                    sbiVar = sbiVar3;
                    boolean zOptBoolean2 = jSONObject.optBoolean("save", jcj.a().f);
                    boolean zOptBoolean3 = jSONObject.optBoolean("short_meta", jcj.a().g);
                    boolean zOptBoolean4 = jSONObject.optBoolean("idle_sleep", jcj.a().b);
                    boolean zOptBoolean5 = jSONObject.optBoolean("scheduler_enabled", jcj.a().c);
                    Context context = (Context) this.g;
                    long jO = qe7.O(iOptInt, lw5Var);
                    long jO2 = qe7.O(iOptInt2, lw5Var);
                    ifh ifhVar19 = jcj.d;
                    as6 as6Var2 = ifhVar19 != null ? (as6) ifhVar19.getValue() : null;
                    if (as6Var2 == null) {
                        gm0.Y(jcj.class.getName(), "prefs are null!");
                    }
                    z1c z1cVarA = jcj.a();
                    z1c z1cVarA2 = jcj.a();
                    as6 as6Var3 = as6Var2;
                    z1c z1cVar = new z1c(zOptBoolean, zOptBoolean4, zOptBoolean5, jO, jO2, zOptBoolean2, zOptBoolean3, z1cVarA2.h, z1cVarA2.i, z1cVarA2.j);
                    z1c z1cVar2 = m94.h;
                    if (z1cVar == z1cVar2) {
                        jcjVar2.b(z1cVar2);
                        if (as6Var3 != null) {
                            zr6 zr6Var2 = (zr6) as6Var3.edit();
                            zr6Var2.clear();
                            zr6Var2.commit();
                        }
                        String name2 = jcj.class.getName();
                        a4c a4cVar7 = gm0.f;
                        if (a4cVar7 != null && a4cVar7.b(je9Var6)) {
                            a4cVar7.c(je9Var6, name2, "use defaultWatchDogConfig", null);
                        }
                        jcjVar2.g(context, false);
                    } else if (cqk.d(z1cVarA, z1cVar)) {
                        String name3 = jcj.class.getName();
                        a4c a4cVar8 = gm0.f;
                        if (a4cVar8 != null && a4cVar8.b(je9Var6)) {
                            a4cVar8.c(je9Var6, name3, "update config ignored", null);
                        }
                    } else {
                        jcjVar2.g(context, true);
                        if (as6Var3 != null) {
                            zr6 zr6Var3 = (zr6) as6Var3.edit();
                            zr6Var3.putBoolean("enabled", zOptBoolean);
                            zr6Var3.putLong("stuck", ew5.s(jO, lw5Var));
                            zr6Var3.putLong("hang", ew5.s(jO2, lw5Var));
                            zr6Var3.putBoolean("save", zOptBoolean2);
                            zr6Var3.putBoolean("short_meta", zOptBoolean3);
                            zr6Var3.putBoolean("idle_sleep", zOptBoolean4);
                            zr6Var3.putBoolean("scheduler_enabled", zOptBoolean5);
                            zr6Var3.apply();
                        }
                        jcjVar2.b(z1cVar);
                    }
                }
                return sbiVar;
            default:
                ch3.d0(obj);
                xyj xyjVar = (xyj) this.f;
                vzj vzjVar = (vzj) this.g;
                a8g a8gVar = xyj.l;
                xyjVar.a(vzjVar, false);
                return sbi.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y73(Object obj, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y73(lq4 lq4Var, LoginScreen loginScreen) {
        super(2, lq4Var);
        this.e = 13;
        this.g = loginScreen;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y73(Object obj, Object obj2, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.f = obj;
        this.g = obj2;
    }
}
