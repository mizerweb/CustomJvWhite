package defpackage;

import android.net.Uri;
import android.view.ViewGroup;
import android.widget.TextView;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import one.me.android.root.RootController;
import one.me.chatscreen.ChatScreen;
import one.me.chatscreen.mediabar.SelectedMediaBottomBarWidget;
import one.me.mediaeditor.MediaEditScreen;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;
import one.me.sdk.messagewrite.mention.SuggestionsWidget;
import one.me.videoeditor.trimslider.VideoTrimSliderWidget;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class gw9 extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ MediaEditScreen g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gw9(MediaEditScreen mediaEditScreen, lq4 lq4Var) {
        super(2, lq4Var);
        this.e = 0;
        this.g = mediaEditScreen;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        MediaEditScreen mediaEditScreen = this.g;
        switch (i) {
            case 0:
                gw9 gw9Var = new gw9(mediaEditScreen, lq4Var);
                gw9Var.f = obj;
                return gw9Var;
            case 1:
                gw9 gw9Var2 = new gw9(lq4Var, mediaEditScreen, 1);
                gw9Var2.f = obj;
                return gw9Var2;
            case 2:
                gw9 gw9Var3 = new gw9(lq4Var, mediaEditScreen, 2);
                gw9Var3.f = obj;
                return gw9Var3;
            case 3:
                gw9 gw9Var4 = new gw9(lq4Var, mediaEditScreen, 3);
                gw9Var4.f = obj;
                return gw9Var4;
            case 4:
                gw9 gw9Var5 = new gw9(lq4Var, mediaEditScreen, 4);
                gw9Var5.f = obj;
                return gw9Var5;
            case 5:
                gw9 gw9Var6 = new gw9(lq4Var, mediaEditScreen, 5);
                gw9Var6.f = obj;
                return gw9Var6;
            case 6:
                gw9 gw9Var7 = new gw9(lq4Var, mediaEditScreen, 6);
                gw9Var7.f = obj;
                return gw9Var7;
            case 7:
                gw9 gw9Var8 = new gw9(lq4Var, mediaEditScreen, 7);
                gw9Var8.f = obj;
                return gw9Var8;
            case 8:
                gw9 gw9Var9 = new gw9(lq4Var, mediaEditScreen, 8);
                gw9Var9.f = obj;
                return gw9Var9;
            case 9:
                gw9 gw9Var10 = new gw9(lq4Var, mediaEditScreen, 9);
                gw9Var10.f = obj;
                return gw9Var10;
            case 10:
                gw9 gw9Var11 = new gw9(lq4Var, mediaEditScreen, 10);
                gw9Var11.f = obj;
                return gw9Var11;
            case 11:
                gw9 gw9Var12 = new gw9(lq4Var, mediaEditScreen, 11);
                gw9Var12.f = obj;
                return gw9Var12;
            case 12:
                gw9 gw9Var13 = new gw9(lq4Var, mediaEditScreen, 12);
                gw9Var13.f = obj;
                return gw9Var13;
            default:
                gw9 gw9Var14 = new gw9(lq4Var, mediaEditScreen, 13);
                gw9Var14.f = obj;
                return gw9Var14;
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) throws IllegalAccessException, InvocationTargetException {
        int i = this.e;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                ((gw9) create((qw9) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
            case 1:
                ((gw9) create(obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
            case 2:
                ((gw9) create(obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
            case 3:
                ((gw9) create(obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
            case 4:
                ((gw9) create(obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
            case 5:
                ((gw9) create(obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
            case 6:
                ((gw9) create(obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
            case 7:
                ((gw9) create(obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
            case 8:
                ((gw9) create(obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
            case 9:
                ((gw9) create(obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
            case 10:
                ((gw9) create(obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
            case 11:
                ((gw9) create(obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
            case 12:
                ((gw9) create(obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
            default:
                ((gw9) create(obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
        }
        return sbiVar;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) throws IllegalAccessException, InvocationTargetException {
        br4 br4Var;
        t5a t5aVar;
        VideoTrimSliderWidget videoTrimSliderWidgetZ1;
        float f = 0.0f;
        switch (this.e) {
            case 0:
                qw9 qw9Var = (qw9) this.f;
                ch3.d0(obj);
                MediaEditScreen mediaEditScreen = this.g;
                s0a s0aVar = mediaEditScreen.q1;
                s0aVar.l.b(qw9Var.a, new eq0(1, new t86(mediaEditScreen, s0aVar.l(), qw9Var, 2)));
                return sbi.a;
            case 1:
                MediaEditScreen mediaEditScreen2 = this.g;
                Object obj2 = this.f;
                ch3.d0(obj);
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                if (zBooleanValue) {
                    zv8[] zv8VarArr = MediaEditScreen.w1;
                    j8e j8eVar = mediaEditScreen2.n1;
                    zv8[] zv8VarArr2 = MediaEditScreen.w1;
                    if (rx8.C(((zp3) j8eVar.m(mediaEditScreen2, zv8VarArr2[18])).a) == null) {
                        hve childRouter = mediaEditScreen2.getChildRouter((tp2) mediaEditScreen2.Z.m(mediaEditScreen2, zv8VarArr2[17]));
                        childRouter.e = 1;
                        childRouter.S(false);
                        if (!childRouter.o()) {
                            childRouter.T(oc9.e(new SuggestionsWidget(mediaEditScreen2.d, true), null, null));
                        }
                    }
                }
                ((tp2) mediaEditScreen2.Z.m(mediaEditScreen2, MediaEditScreen.w1[17])).setVisibility(zBooleanValue ? 0 : 8);
                return sbi.a;
            case 2:
                Object obj3 = this.f;
                ch3.d0(obj);
                ylc ylcVar = (ylc) obj3;
                String str = (String) ylcVar.a;
                String str2 = (String) ylcVar.b;
                MediaEditScreen mediaEditScreen3 = this.g;
                j8e j8eVar2 = mediaEditScreen3.H;
                zv8[] zv8VarArr3 = MediaEditScreen.w1;
                ((TextView) j8eVar2.m(mediaEditScreen3, zv8VarArr3[12])).setText(str);
                ((TextView) mediaEditScreen3.I.m(mediaEditScreen3, zv8VarArr3[13])).setText(str2);
                return sbi.a;
            case 3:
                Object obj4 = this.f;
                ch3.d0(obj);
                boolean zBooleanValue2 = ((Boolean) obj4).booleanValue();
                MediaEditScreen mediaEditScreen4 = this.g;
                ((ViewGroup) mediaEditScreen4.o1.m(mediaEditScreen4, MediaEditScreen.w1[19])).setVisibility(zBooleanValue2 ? 8 : 0);
                return sbi.a;
            case 4:
                Object obj5 = this.f;
                ch3.d0(obj);
                rbb rbbVar = (rbb) obj5;
                if (rbbVar instanceof bw9) {
                    bw9 bw9Var = (bw9) rbbVar;
                    zv8[] zv8VarArr4 = MediaEditScreen.w1;
                    if (bw9Var instanceof aw9) {
                        aw9 aw9Var = (aw9) bw9Var;
                        yv9.b.k(aw9Var.c, aw9Var.b);
                    } else {
                        if (!(bw9Var instanceof zv9)) {
                            ore.o();
                            return null;
                        }
                        zv9 zv9Var = (zv9) bw9Var;
                        yv9.b.j(zv9Var.b, zv9Var.c);
                    }
                } else if (cqk.d(rbbVar, rt3.b)) {
                    this.g.O1();
                    hve router = this.g.getRouter();
                    zv zvVar = new zv();
                    zvVar.addLast(router);
                    while (true) {
                        if (zvVar.isEmpty()) {
                            br4Var = null;
                        } else {
                            ArrayList arrayListE = ((hve) zvVar.removeLast()).e();
                            int iO0 = xw3.O0(arrayListE);
                            while (true) {
                                if (-1 < iO0) {
                                    br4Var = ((lve) arrayListE.get(iO0)).a;
                                    if (!(br4Var instanceof ChatScreen)) {
                                        Iterator it = new upe(br4Var.getChildRouters()).iterator();
                                        while (true) {
                                            tpe tpeVar = (tpe) it;
                                            if (tpeVar.b.hasPrevious()) {
                                                zvVar.addLast((hve) tpeVar.b.previous());
                                            }
                                        }
                                        iO0--;
                                    }
                                }
                            }
                        }
                    }
                    ChatScreen chatScreen = (ChatScreen) br4Var;
                    if (chatScreen != null) {
                        String name = ChatScreen.class.getName();
                        a4c a4cVar = gm0.f;
                        if (a4cVar != null) {
                            je9 je9Var = je9.d;
                            if (a4cVar.b(je9Var)) {
                                a4cVar.c(je9Var, name, "media edit was cancelled", null);
                            }
                        }
                        chatScreen.S1().H = true;
                    }
                    yv9.b.l();
                } else if (rbbVar instanceof i65) {
                    yv9.b.e((i65) rbbVar);
                }
                return sbi.a;
            case 5:
                Object obj6 = this.f;
                ch3.d0(obj);
                cc6 cc6Var = (cc6) obj6;
                MediaEditScreen mediaEditScreen5 = this.g;
                zv8[] zv8VarArr5 = MediaEditScreen.w1;
                a8g a8gVar = pq3.j;
                je9 je9Var2 = je9.d;
                if (cc6Var instanceof nb6) {
                    sgg sggVar = mediaEditScreen5.k;
                    if (sggVar != null) {
                        sggVar.b(null);
                    }
                    nb6 nb6Var = (nb6) cc6Var;
                    if (nb6Var.a.c()) {
                        e3j e3jVarW0 = mediaEditScreen5.w0();
                        if (mediaEditScreen5.i < 0.0f && e3jVarW0.a() == 0.0f) {
                            sw9 sw9Var = (sw9) mediaEditScreen5.a2().B.a.getValue();
                            e3jVarW0.b((sw9Var == null || !sw9Var.b) ? 1.0f : 0.0f);
                        }
                        mediaEditScreen5.c2();
                        mediaEditScreen5.a2().N();
                        zp3 zp3Var = (zp3) mediaEditScreen5.X.m(mediaEditScreen5, MediaEditScreen.w1[15]);
                        hve hveVar = zp3Var.a;
                        if (!cqk.d(zp3Var.b(), "video_trim_slider_widget")) {
                            hveVar.S(false);
                            lve lveVarE = oc9.e(new VideoTrimSliderWidget(mediaEditScreen5.d.b(), null, 0L, 6, null), null, null);
                            lveVarE.e("video_trim_slider_widget");
                            hveVar.T(lveVarE);
                        }
                        VideoTrimSliderWidget videoTrimSliderWidgetZ2 = mediaEditScreen5.Z1();
                        if (videoTrimSliderWidgetZ2 != null) {
                            videoTrimSliderWidgetZ2.p1().x = mediaEditScreen5.v1;
                        }
                        Uri uriD = nb6Var.a.d();
                        if (uriD != null && (videoTrimSliderWidgetZ1 = mediaEditScreen5.Z1()) != null) {
                            videoTrimSliderWidgetZ1.s1(Collections.singletonList(uriD));
                        }
                    } else {
                        mediaEditScreen5.a2().E();
                    }
                } else if (cc6Var instanceof pb6) {
                    String str3 = mediaEditScreen5.p;
                    a4c a4cVar2 = gm0.f;
                    if (a4cVar2 != null && a4cVar2.b(je9Var2)) {
                        a4cVar2.c(je9Var2, str3, "Media editor, page disappear", null);
                    }
                } else if (cc6Var instanceof fb6) {
                    h8c h8cVar = new h8c(mediaEditScreen5);
                    h8cVar.m(new tnh(((fb6) cc6Var).a.intValue()));
                    h8cVar.h(new w8c(R.drawable.icon_warning));
                    h8cVar.p();
                    ltb onBackPressedDispatcher = mediaEditScreen5.getOnBackPressedDispatcher();
                    if (onBackPressedDispatcher != null) {
                        onBackPressedDispatcher.d();
                    }
                } else if (cc6Var instanceof yb6) {
                    g8c g8cVar = mediaEditScreen5.l;
                    if (g8cVar != null) {
                        g8cVar.a();
                    }
                    h8c h8cVar2 = new h8c(mediaEditScreen5);
                    h8cVar2.m(((yb6) cc6Var).a);
                    h8cVar2.a(null);
                    mediaEditScreen5.l = h8cVar2.p();
                } else if (cc6Var instanceof wb6) {
                    g8c g8cVar2 = mediaEditScreen5.l;
                    if (g8cVar2 != null) {
                        g8cVar2.a();
                    }
                    zv8[] zv8VarArr6 = BottomSheetWidget.t;
                    wb6 wb6Var = (wb6) cc6Var;
                    jc4 jc4VarA = mol.a(wb6Var.a, null, null, 6);
                    jc4VarA.j(a8gVar.e(mediaEditScreen5.getContext()).j().b.getName());
                    jc4VarA.g(wb6Var.b);
                    wb6Var.c.forEach(new o01(7, new t63(1, jc4VarA, jc4.class, "addButton", "addButton([Lone/me/sdk/bottomsheet/ConfirmationBottomSheet$Button;)Lone/me/sdk/bottomsheet/ConfirmationBottomSheet$Builder;", 8, 10)));
                    ConfirmationBottomSheet confirmationBottomSheetF = jc4VarA.f(mediaEditScreen5);
                    confirmationBottomSheetF.setTargetController(mediaEditScreen5);
                    br4 parentController = mediaEditScreen5;
                    while (parentController.getParentController() != null) {
                        parentController = parentController.getParentController();
                    }
                    RootController rootController = parentController instanceof RootController ? (RootController) parentController : null;
                    hve hveVarU1 = rootController != null ? rootController.u1() : null;
                    if (hveVarU1 != null) {
                        lve lveVar = new lve(confirmationBottomSheetF, null, null, null, false, -1);
                        p.k(false, lveVar, true, "BottomSheetWidget");
                        hveVarU1.I(lveVar);
                    }
                } else if (cc6Var instanceof ib6) {
                    ib6 ib6Var = (ib6) cc6Var;
                    int i = ib6Var.a;
                    if (i == 5) {
                        t5a t5aVar2 = mediaEditScreen5.m;
                        if ((t5aVar2 != null ? t5aVar2.h : 0) != i) {
                            mediaEditScreen5.M1(ib6Var.b);
                        }
                    }
                    if (mediaEditScreen5.a2().D.a.getValue() != wr4.c && (t5aVar = mediaEditScreen5.m) != null) {
                        t5aVar.d(ib6Var.a);
                    }
                } else if (cc6Var instanceof kb6) {
                    SelectedMediaBottomBarWidget selectedMediaBottomBarWidget = mediaEditScreen5.u1;
                    if (selectedMediaBottomBarWidget != null) {
                        oef oefVar = selectedMediaBottomBarWidget.A;
                        hb9 hb9VarX0 = oefVar != null ? oefVar.X0() : null;
                        gm0.n(selectedMediaBottomBarWidget.c, "Send clicked");
                        selectedMediaBottomBarWidget.t1().G(selectedMediaBottomBarWidget.q1().getText(), hb9VarX0);
                        oef oefVar2 = selectedMediaBottomBarWidget.A;
                        if (oefVar2 != null) {
                            oefVar2.q0();
                        }
                    }
                } else if (cc6Var instanceof rb6) {
                    String str4 = mediaEditScreen5.p;
                    a4c a4cVar3 = gm0.f;
                    if (a4cVar3 != null && a4cVar3.b(je9Var2)) {
                        a4cVar3.c(je9Var2, str4, "media editor: handle event refresh photo", null);
                    }
                } else if (cqk.d(cc6Var, tb6.a)) {
                    ((wsc) mediaEditScreen5.K.getValue()).o(new svj(mediaEditScreen5, 1));
                } else if (cc6Var instanceof vb6) {
                    ArrayList arrayList = ((vb6) cc6Var).a;
                    jc4 jc4VarC = p.c(R.string.video_quality, null, null, 6);
                    jc4VarC.j(a8gVar.e(mediaEditScreen5.getContext()).j().b.getName());
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        jc4VarC.a((kc4) it2.next());
                    }
                    zv8[] zv8VarArr7 = BottomSheetWidget.t;
                    ConfirmationBottomSheet confirmationBottomSheetF2 = jc4VarC.f(mediaEditScreen5);
                    confirmationBottomSheetF2.setTargetController(mediaEditScreen5);
                    br4 parentController2 = mediaEditScreen5;
                    while (parentController2.getParentController() != null) {
                        parentController2 = parentController2.getParentController();
                    }
                    RootController rootController2 = parentController2 instanceof RootController ? (RootController) parentController2 : null;
                    hve hveVarU2 = rootController2 != null ? rootController2.u1() : null;
                    if (hveVarU2 != null) {
                        lve lveVar2 = new lve(confirmationBottomSheetF2, null, null, null, false, -1);
                        p.k(false, lveVar2, true, "BottomSheetWidget");
                        hveVarU2.I(lveVar2);
                    }
                } else {
                    if (!(cc6Var instanceof mb6)) {
                        ore.o();
                        return null;
                    }
                    mediaEditScreen5.G1().h(((mb6) cc6Var).a, false);
                }
                return sbi.a;
            case 6:
                MediaEditScreen mediaEditScreen6 = this.g;
                Object obj7 = this.f;
                ch3.d0(obj);
                if (((Boolean) obj7).booleanValue()) {
                    zv8[] zv8VarArr8 = MediaEditScreen.w1;
                    sgg sggVar2 = mediaEditScreen6.k;
                    if (sggVar2 != null) {
                        sggVar2.b(null);
                    }
                    t5a t5aVar3 = mediaEditScreen6.m;
                    if (t5aVar3 != null) {
                        t5aVar3.c();
                    }
                    t5a t5aVar4 = mediaEditScreen6.m;
                    if (t5aVar4 != null) {
                        t5aVar4.e(true);
                    }
                    mediaEditScreen6.c2();
                    mediaEditScreen6.a2().B1.a(Boolean.FALSE);
                }
                return sbi.a;
            case 7:
                MediaEditScreen mediaEditScreen7 = this.g;
                Object obj8 = this.f;
                ch3.d0(obj);
                int iOrdinal = ((wr4) obj8).ordinal();
                if (iOrdinal == 0) {
                    zv8[] zv8VarArr9 = MediaEditScreen.w1;
                    t5a t5aVar5 = mediaEditScreen7.m;
                    if (t5aVar5 != null) {
                        t5aVar5.e(true);
                    }
                    mediaEditScreen7.a2().N();
                    mediaEditScreen7.d2(true, true);
                } else if (iOrdinal == 1) {
                    zv8[] zv8VarArr10 = MediaEditScreen.w1;
                    t5a t5aVar6 = mediaEditScreen7.m;
                    if (t5aVar6 != null) {
                        t5aVar6.e(false);
                    }
                    mediaEditScreen7.a2().E();
                    mediaEditScreen7.d2(true, false);
                } else if (iOrdinal == 2) {
                    zv8[] zv8VarArr11 = MediaEditScreen.w1;
                    if (mediaEditScreen7.J1()) {
                        t5a t5aVar7 = mediaEditScreen7.m;
                        if (t5aVar7 != null) {
                            t5aVar7.b();
                        }
                        mediaEditScreen7.a2().N();
                    }
                } else {
                    if (iOrdinal != 3) {
                        ore.o();
                        return null;
                    }
                    zv8[] zv8VarArr12 = MediaEditScreen.w1;
                    t5a t5aVar8 = mediaEditScreen7.m;
                    if (t5aVar8 != null) {
                        t5aVar8.e(true);
                    }
                    mediaEditScreen7.a2().E();
                    mediaEditScreen7.d2(true, true);
                }
                return sbi.a;
            case 8:
                MediaEditScreen mediaEditScreen8 = this.g;
                Object obj9 = this.f;
                ch3.d0(obj);
                kb9 kb9Var = (kb9) obj9;
                int iOrdinal2 = kb9Var.l.ordinal();
                if (iOrdinal2 == 0) {
                    MediaEditScreen.S1(mediaEditScreen8).setVisibility(8);
                    MediaEditScreen.R1(mediaEditScreen8).setVisibility(8);
                    MediaEditScreen.U1(mediaEditScreen8).setVisibility(8);
                    MediaEditScreen.T1(mediaEditScreen8).setVisibility(8);
                    MediaEditScreen.P1(mediaEditScreen8).setVisibility(8);
                    MediaEditScreen.Q1(mediaEditScreen8).setVisibility(8);
                } else if (iOrdinal2 == 1) {
                    MediaEditScreen.S1(mediaEditScreen8).setVisibility(8);
                    MediaEditScreen.R1(mediaEditScreen8).setVisibility(8);
                    MediaEditScreen.U1(mediaEditScreen8).setVisibility(8);
                    MediaEditScreen.T1(mediaEditScreen8).setVisibility(8);
                    MediaEditScreen.P1(mediaEditScreen8).setVisibility(0);
                    MediaEditScreen.Q1(mediaEditScreen8).setVisibility(0);
                } else if (iOrdinal2 == 2) {
                    MediaEditScreen.S1(mediaEditScreen8).setVisibility(8);
                    MediaEditScreen.R1(mediaEditScreen8).setVisibility(8);
                    MediaEditScreen.U1(mediaEditScreen8).setVisibility(8);
                    MediaEditScreen.T1(mediaEditScreen8).setVisibility(8);
                    MediaEditScreen.P1(mediaEditScreen8).setVisibility(8);
                    MediaEditScreen.Q1(mediaEditScreen8).setVisibility(8);
                } else {
                    if (iOrdinal2 != 3) {
                        ore.o();
                        return null;
                    }
                    MediaEditScreen.P1(mediaEditScreen8).setVisibility(8);
                    MediaEditScreen.Q1(mediaEditScreen8).setVisibility(8);
                    MediaEditScreen.U1(mediaEditScreen8).setVisibility(0);
                    MediaEditScreen.T1(mediaEditScreen8).setVisibility(0);
                    MediaEditScreen.R1(mediaEditScreen8).setVisibility(0);
                    MediaEditScreen.S1(mediaEditScreen8).setVisibility(0);
                }
                SelectedMediaBottomBarWidget selectedMediaBottomBarWidget2 = mediaEditScreen8.u1;
                if (selectedMediaBottomBarWidget2 != null) {
                    long j = kb9Var.a;
                    nef nefVar = (nef) selectedMediaBottomBarWidget2.q.getValue();
                    nefVar.g.B(nefVar, nef.h[0], Long.valueOf(j));
                }
                return sbi.a;
            case 9:
                MediaEditScreen mediaEditScreen9 = this.g;
                Object obj10 = this.f;
                ch3.d0(obj);
                int iOrdinal3 = ((gef) obj10).ordinal();
                if (iOrdinal3 == 0) {
                    zv8[] zv8VarArr13 = MediaEditScreen.w1;
                    mediaEditScreen9.Y1().setRightActions(new acc(null, new jcc(R.drawable.icon_file, null, null, null, 0.0f, new hw9(mediaEditScreen9, 1), 254), null));
                } else if (iOrdinal3 != 1) {
                    if (iOrdinal3 != 2) {
                        ore.o();
                        return null;
                    }
                    zv8[] zv8VarArr14 = MediaEditScreen.w1;
                    mediaEditScreen9.Y1().setRightActions(new acc(null, new jcc(R.drawable.icon_file, null, null, null, 0.0f, new hw9(mediaEditScreen9, 1), 254), null));
                } else {
                    zv8[] zv8VarArr15 = MediaEditScreen.w1;
                    mediaEditScreen9.Y1().setRightActions(new acc(null, new jcc(R.drawable.icon_file_fill, null, null, null, 0.0f, new hw9(mediaEditScreen9, 0), 254), null));
                }
                return sbi.a;
            case 10:
                MediaEditScreen mediaEditScreen10 = this.g;
                Object obj11 = this.f;
                ch3.d0(obj);
                sw9 sw9Var2 = (sw9) obj11;
                MediaEditScreen.T1(mediaEditScreen10).setImageResource(sw9Var2 != null ? sw9Var2.a : R.drawable.icon_sound);
                ynh ynhVar = ((sw9Var2 != null ? sw9Var2.d : null) == null || sw9Var2.d.isEmpty()) ? null : sw9Var2.c;
                MediaEditScreen.U1(mediaEditScreen10).setVisibility(ynhVar != null ? 0 : 8);
                MediaEditScreen.U1(mediaEditScreen10).setText(ynhVar != null ? ynhVar.b(mediaEditScreen10.getContext()) : null);
                if (sw9Var2 != null && !sw9Var2.b) {
                    f = 1.0f;
                }
                mediaEditScreen10.w0().b(f);
                return sbi.a;
            case 11:
                MediaEditScreen mediaEditScreen11 = this.g;
                Object obj12 = this.f;
                ch3.d0(obj);
                rui ruiVar = ((xw9) obj12).b;
                Uri uriD2 = ruiVar != null ? ruiVar.d() : null;
                if (uriD2 != null) {
                    zv8[] zv8VarArr16 = MediaEditScreen.w1;
                    VideoTrimSliderWidget videoTrimSliderWidgetZ3 = mediaEditScreen11.Z1();
                    if (videoTrimSliderWidgetZ3 != null) {
                        videoTrimSliderWidgetZ3.r1(((Number) mediaEditScreen11.a2().K.a.getValue()).floatValue(), ((Number) mediaEditScreen11.a2().Y.a.getValue()).floatValue());
                    }
                    VideoTrimSliderWidget videoTrimSliderWidgetZ4 = mediaEditScreen11.Z1();
                    if (videoTrimSliderWidgetZ4 != null) {
                        videoTrimSliderWidgetZ4.s1(Collections.singletonList(uriD2));
                    }
                }
                return sbi.a;
            case 12:
                Object obj13 = this.f;
                ch3.d0(obj);
                long jLongValue = ((Number) obj13).longValue();
                MediaEditScreen mediaEditScreen12 = this.g;
                long duration = mediaEditScreen12.w0().getDuration();
                VideoTrimSliderWidget videoTrimSliderWidgetZ5 = mediaEditScreen12.Z1();
                if (videoTrimSliderWidgetZ5 != null) {
                    videoTrimSliderWidgetZ5.q1(duration, jLongValue);
                }
                if (duration > 0) {
                    float f2 = duration;
                    if (jLongValue + 50 >= ((long) (((Number) mediaEditScreen12.a2().Y.a.getValue()).floatValue() * f2))) {
                        mediaEditScreen12.w0().seekTo((long) (((Number) mediaEditScreen12.a2().K.a.getValue()).floatValue() * f2));
                    }
                }
                return sbi.a;
            default:
                Object obj14 = this.f;
                ch3.d0(obj);
                ((Number) obj14).longValue();
                MediaEditScreen mediaEditScreen13 = this.g;
                zv8[] zv8VarArr17 = MediaEditScreen.w1;
                if (mediaEditScreen13.j) {
                    String str5 = mediaEditScreen13.p;
                    a4c a4cVar4 = gm0.f;
                    if (a4cVar4 != null) {
                        je9 je9Var3 = je9.d;
                        if (a4cVar4.b(je9Var3)) {
                            a4cVar4.c(je9Var3, str5, "will be ignored in ONEME-24601", null);
                        }
                    }
                }
                return sbi.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gw9(lq4 lq4Var, MediaEditScreen mediaEditScreen, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = mediaEditScreen;
    }
}
