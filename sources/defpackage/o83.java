package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import one.me.android.MainActivity;
import one.me.android.root.RootController;
import one.me.background.wake.BackgroundWakeSuggestionBottomSheet;
import one.me.chats.tab.ChatsTabWidget;
import one.me.main.MainScreen;
import one.me.sdk.arch.Widget;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes.dex */
public final class o83 extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o83(Object obj, lq4 lq4Var, mw mwVar, pk4 pk4Var) {
        super(2, lq4Var);
        this.e = 3;
        this.f = obj;
        this.g = mwVar;
        this.h = pk4Var;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        Object obj2 = this.h;
        Object obj3 = this.g;
        switch (i) {
            case 0:
                o83 o83Var = new o83((t83) obj3, (pw) obj2, lq4Var, 0);
                o83Var.f = obj;
                return o83Var;
            case 1:
                o83 o83Var2 = new o83(lq4Var, (ChatsTabWidget) obj3, (View) obj2);
                o83Var2.f = obj;
                return o83Var2;
            case 2:
                o83 o83Var3 = new o83((pq3) obj3, (s6) obj2, lq4Var, 2);
                o83Var3.f = obj;
                return o83Var3;
            case 3:
                return new o83(this.f, lq4Var, (mw) obj3, (pk4) obj2);
            case 4:
                o83 o83Var4 = new o83((bi8) obj3, (ny8) obj2, lq4Var, 4);
                o83Var4.f = obj;
                return o83Var4;
            case 5:
                o83 o83Var5 = new o83((MainActivity) obj3, (af7) obj2, lq4Var, 5);
                o83Var5.f = obj;
                return o83Var5;
            default:
                return new o83((MainScreen) this.f, (vk9) obj3, (pq3) obj2, lq4Var);
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                return ((o83) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 1:
                ((o83) create(obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 2:
                ((o83) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 3:
                return ((o83) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 4:
                ((o83) create((ag9) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            case 5:
                ((o83) create((l49) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            default:
                ((o83) create((kbc) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
        }
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        final int i = 1;
        final int i2 = 0;
        switch (this.e) {
            case 0:
                gu4 gu4Var = (gu4) this.f;
                ch3.d0(obj);
                String str = ((t83) this.g).j;
                pw pwVar = (pw) this.h;
                a4c a4cVar = gm0.f;
                if (a4cVar != null) {
                    je9 je9Var = je9.d;
                    if (a4cVar.b(je9Var)) {
                        a4cVar.c(je9Var, str, "getFcmHistory: chats=" + pwVar, null);
                    }
                }
                return ((pw) this.h).isEmpty() ? yab.h(gu4Var, null, 0, new n83(), 3) : yab.h(gu4Var, null, 0, new qob((t83) this.g, (pw) this.h, null, 14), 3);
            case 1:
                final ChatsTabWidget chatsTabWidget = (ChatsTabWidget) this.g;
                Object obj2 = this.f;
                ch3.d0(obj);
                yg3 yg3Var = (yg3) obj2;
                if (yg3Var instanceof xg3) {
                    final r8h r8hVar = chatsTabWidget.B;
                    ViewGroup viewGroup = (ViewGroup) ((View) this.h);
                    int iA = ((xg3) yg3Var).a();
                    if (iA == 1) {
                        r8hVar.a().d();
                        h8c h8cVar = new h8c(viewGroup);
                        h8cVar.h(new w8c(R.drawable.icon_bad_connection_attention_fill));
                        h8cVar.m(new tnh(R.string.oneme_background_wake_suggestion_sticky_title));
                        h8cVar.a(new tnh(R.string.oneme_background_wake_suggestion_sticky_caption));
                        h8cVar.k(new e9c(new tnh(R.string.oneme_background_wake_enable_button)));
                        h8cVar.d(new o8c(0, 0, 0, 7));
                        h8cVar.g(q8c.b);
                        h8cVar.f(new i8c() { // from class: q8h
                            @Override // defpackage.i8c
                            public final void w(j8c j8cVar) {
                                int i3 = i;
                                Widget widget = chatsTabWidget;
                                r8h r8hVar2 = r8hVar;
                                switch (i3) {
                                    case 0:
                                        r8hVar2.b((ChatsTabWidget) widget, j8cVar, true);
                                        break;
                                    default:
                                        r8hVar2.b((ChatsTabWidget) widget, j8cVar, false);
                                        break;
                                }
                            }
                        });
                        h8cVar.p();
                    } else if (iA != 2) {
                        r8hVar.a().d();
                        h8c h8cVar2 = new h8c(viewGroup);
                        h8cVar2.h(new w8c(R.drawable.icon_bad_connection_attention_fill));
                        h8cVar2.m(new tnh(R.string.oneme_background_wake_suggestion));
                        h8cVar2.k(new e9c(new tnh(R.string.oneme_background_wake_enable_button)));
                        h8cVar2.d(new o8c(0, 0, 0, 7));
                        h8cVar2.g(new r8c(5000L));
                        h8cVar2.f(new i8c() { // from class: q8h
                            @Override // defpackage.i8c
                            public final void w(j8c j8cVar) {
                                int i3 = i2;
                                Widget widget = chatsTabWidget;
                                r8h r8hVar2 = r8hVar;
                                switch (i3) {
                                    case 0:
                                        r8hVar2.b((ChatsTabWidget) widget, j8cVar, true);
                                        break;
                                    default:
                                        r8hVar2.b((ChatsTabWidget) widget, j8cVar, false);
                                        break;
                                }
                            }
                        });
                        h8cVar2.p();
                    } else {
                        r8hVar.a().d();
                        zv8[] zv8VarArr = BottomSheetWidget.t;
                        BackgroundWakeSuggestionBottomSheet backgroundWakeSuggestionBottomSheet = new BackgroundWakeSuggestionBottomSheet();
                        backgroundWakeSuggestionBottomSheet.setTargetController(chatsTabWidget);
                        br4 parentController = chatsTabWidget;
                        while (parentController.getParentController() != null) {
                            parentController = parentController.getParentController();
                        }
                        RootController rootController = parentController instanceof RootController ? (RootController) parentController : null;
                        hve hveVarU1 = rootController != null ? rootController.u1() : null;
                        if (hveVarU1 != null) {
                            lve lveVar = new lve(backgroundWakeSuggestionBottomSheet, null, null, null, false, -1);
                            p.k(false, lveVar, true, "BottomSheetWidget");
                            hveVarU1.I(lveVar);
                        }
                    }
                } else if (cqk.d(yg3Var, vg3.a)) {
                    zv8[] zv8VarArr2 = ChatsTabWidget.B1;
                    h8c h8cVar3 = new h8c(chatsTabWidget);
                    h8cVar3.h(new w8c(R.drawable.icon_check_round_fill));
                    h8cVar3.m(new tnh(R.string.oneme_background_wake_enabled));
                    h8cVar3.p();
                } else if (cqk.d(yg3Var, ug3.a)) {
                    zv8[] zv8VarArr3 = ChatsTabWidget.B1;
                    chatsTabWidget.x1().l(new svj(chatsTabWidget, 1));
                } else {
                    if (!cqk.d(yg3Var, wg3.a)) {
                        ore.o();
                        return null;
                    }
                    zv8[] zv8VarArr4 = ChatsTabWidget.B1;
                    br4 parentController2 = chatsTabWidget;
                    while (parentController2.getParentController() != null) {
                        parentController2 = parentController2.getParentController();
                    }
                    View view = parentController2.getView();
                    Object parent = view != null ? view.getParent() : null;
                    View view2 = parent instanceof View ? (View) parent : null;
                    ViewGroup viewGroup2 = view2 instanceof ViewGroup ? (ViewGroup) view2 : null;
                    if (viewGroup2 != null) {
                        h8c h8cVar4 = new h8c(viewGroup2);
                        h8cVar4.h(new w8c(R.drawable.icon_warning_fill));
                        h8cVar4.m(new tnh(R.string.oneme_background_wake_energy_saving_blocks));
                        h8cVar4.p();
                    }
                    zm3.b.s();
                }
                return sbi.a;
            case 2:
                s6 s6Var = (s6) this.h;
                pq3 pq3Var = (pq3) this.g;
                mjg mjgVar = (mjg) pq3Var.g;
                gu4 gu4Var2 = (gu4) this.f;
                ch3.d0(obj);
                if (cqk.d(Looper.myLooper(), Looper.getMainLooper())) {
                    ore.p("Failed requirement.");
                    return null;
                }
                r8e r8eVar = (r8e) ((fbc) pq3Var.c).c;
                q8e q8eVar = (q8e) ((j55) pq3Var.e).c;
                e9i.j0(new dz6(new j3(new fz6(new jz(new j3(e9i.S(new tz(6, new xx6[]{r8eVar, q8eVar, e9i.I(e9i.M0(new fz6(new j3(new jz(q8eVar, 9), 11, pq3Var), new qob(pq3Var, (lq4) null, 16)), new fy4(3, null, 5))), mjgVar}), zz6.a), 12, pq3Var), 13), new y73(pq3Var, (lq4) null, 6), 3), 14, new mq3(pq3Var, null, 0)), new mq3(pq3Var, null, 1)), gu4Var2);
                e9i.j0(new fz6((r8e) pq3Var.h, new gz(pq3Var, s6Var, (lq4) null, 5), 3), gu4Var2);
                e9i.j0(new fz6(mjgVar, new nq3(pq3Var, s6Var, (lq4) null), 3), gu4Var2);
                return sbi.a;
            case 3:
                ch3.d0(obj);
                vg4 vg4Var = (vg4) ((mw) this.g).get(new Long(((Number) this.f).longValue()));
                if (vg4Var != null) {
                    return pk4.f((pk4) this.h, vg4Var);
                }
                return null;
            case 4:
                ny8 ny8Var = (ny8) this.h;
                ag9 ag9Var = (ag9) this.f;
                ch3.d0(obj);
                nh8 nh8Var = ((bi8) this.g).d;
                int i3 = ((x0c) nh8Var.e.getValue()).b;
                String strH0 = z5h.H0(6, "*");
                String str2 = (String) nh8Var.f.getValue();
                StringBuilder sb = new StringBuilder();
                int length = str2.length();
                while (i2 < length) {
                    char cCharAt = str2.charAt(i2);
                    if (Character.isDigit(cCharAt)) {
                        sb.append(cCharAt);
                    }
                    i2++;
                }
                String str3 = "'+" + i3 + strH0 + r5h.v1(4, sb.toString()) + "'";
                if (ag9Var instanceof uf9) {
                    uf9 uf9Var = (uf9) ag9Var;
                    if (!uf9Var.d) {
                        ((iv4) ny8Var.getValue()).a(null, new dg9("Phone: ".concat(str3), uf9Var.b));
                    }
                } else if (ag9Var instanceof xf9) {
                    ((iv4) ny8Var.getValue()).a(null, new dg9(str3));
                } else if (ag9Var != null && !(ag9Var instanceof zf9) && !(ag9Var instanceof wf9) && !(ag9Var instanceof vf9) && !(ag9Var instanceof sf9) && !(ag9Var instanceof tf9)) {
                    ore.o();
                    return null;
                }
                return sbi.a;
            case 5:
                l49 l49Var = (l49) this.f;
                ch3.d0(obj);
                Bundle bundle = new Bundle();
                bundle.putParcelable("link", Uri.EMPTY);
                bundle.putParcelable("link:result", l49Var);
                o65.c((o65) ((MainActivity) this.g).z.getAccessor().c(184), ":link-intercept", bundle, null, 4);
                ((af7) this.h).invoke();
                return sbi.a;
            default:
                vk9 vk9Var = (vk9) this.g;
                ch3.d0(obj);
                LinkedHashMap linkedHashMap = ((MainScreen) this.f).j;
                pq3 pq3Var2 = (pq3) this.h;
                Iterator it = linkedHashMap.entrySet().iterator();
                while (it.hasNext()) {
                    ViewGroup viewGroup3 = (ViewGroup) ((ylc) ((Map.Entry) it.next()).getValue()).b;
                    if (!viewGroup3.isAttachedToWindow()) {
                        pq3.g(pq3Var2, viewGroup3);
                    }
                }
                if (!vk9Var.isAttachedToWindow()) {
                    pq3.g(pq3Var2, vk9Var);
                }
                return sbi.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o83(lq4 lq4Var, ChatsTabWidget chatsTabWidget, View view) {
        super(2, lq4Var);
        this.e = 1;
        this.g = chatsTabWidget;
        this.h = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o83(Object obj, Object obj2, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = obj;
        this.h = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o83(MainScreen mainScreen, vk9 vk9Var, pq3 pq3Var, lq4 lq4Var) {
        super(2, lq4Var);
        this.e = 6;
        this.f = mainScreen;
        this.g = vk9Var;
        this.h = pq3Var;
    }
}
