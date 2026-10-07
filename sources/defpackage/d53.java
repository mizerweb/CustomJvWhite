package defpackage;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import one.me.android.root.RootController;
import one.me.chatmedia.viewer.ChatMediaViewerScreen;
import one.me.chatmedia.viewer.video.playbackSpeed.PlaybackSettingsBottomSheet;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class d53 extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ ChatMediaViewerScreen g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d53(lq4 lq4Var, ChatMediaViewerScreen chatMediaViewerScreen, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = chatMediaViewerScreen;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        ChatMediaViewerScreen chatMediaViewerScreen = this.g;
        switch (i) {
            case 0:
                d53 d53Var = new d53(lq4Var, chatMediaViewerScreen, 0);
                d53Var.f = obj;
                return d53Var;
            case 1:
                d53 d53Var2 = new d53(lq4Var, chatMediaViewerScreen, 1);
                d53Var2.f = obj;
                return d53Var2;
            case 2:
                d53 d53Var3 = new d53(lq4Var, chatMediaViewerScreen, 2);
                d53Var3.f = obj;
                return d53Var3;
            case 3:
                d53 d53Var4 = new d53(lq4Var, chatMediaViewerScreen, 3);
                d53Var4.f = obj;
                return d53Var4;
            case 4:
                d53 d53Var5 = new d53(lq4Var, chatMediaViewerScreen, 4);
                d53Var5.f = obj;
                return d53Var5;
            case 5:
                d53 d53Var6 = new d53(lq4Var, chatMediaViewerScreen, 5);
                d53Var6.f = obj;
                return d53Var6;
            case 6:
                d53 d53Var7 = new d53(lq4Var, chatMediaViewerScreen, 6);
                d53Var7.f = obj;
                return d53Var7;
            case 7:
                d53 d53Var8 = new d53(lq4Var, chatMediaViewerScreen, 7);
                d53Var8.f = obj;
                return d53Var8;
            case 8:
                d53 d53Var9 = new d53(lq4Var, chatMediaViewerScreen, 8);
                d53Var9.f = obj;
                return d53Var9;
            default:
                d53 d53Var10 = new d53(lq4Var, chatMediaViewerScreen, 9);
                d53Var10.f = obj;
                return d53Var10;
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) throws IllegalAccessException, InvocationTargetException {
        int i = this.e;
        sbi sbiVar = sbi.a;
        lq4 lq4Var = (lq4) obj2;
        switch (i) {
            case 0:
                ((d53) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            case 1:
                ((d53) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            case 2:
                ((d53) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            case 3:
                ((d53) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            case 4:
                ((d53) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            case 5:
                ((d53) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            case 6:
                ((d53) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            case 7:
                ((d53) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            case 8:
                ((d53) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            default:
                ((d53) create(obj, lq4Var)).invokeSuspend(sbiVar);
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
        hve hveVarU1;
        dcc accVar;
        t5a t5aVar;
        t5a t5aVar2;
        int i = this.e;
        int i2 = 8;
        ChatMediaViewerScreen chatMediaViewerScreen = this.g;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                Object obj2 = this.f;
                ch3.d0(obj);
                a0f a0fVar = (a0f) obj2;
                if (a0fVar.equals(xze.a)) {
                    ((wsc) chatMediaViewerScreen.X.getValue()).o(new svj(chatMediaViewerScreen, 1));
                    return sbiVar;
                }
                if (!(a0fVar instanceof yze)) {
                    if (!(a0fVar instanceof zze)) {
                        ore.o();
                        return null;
                    }
                    h8c h8cVar = new h8c(chatMediaViewerScreen);
                    zze zzeVar = (zze) a0fVar;
                    h8cVar.m(zzeVar.a);
                    h8cVar.a(null);
                    h8cVar.c(new o8c(0, 0, chatMediaViewerScreen.D1(), 11));
                    Integer num = zzeVar.b;
                    if (num != null) {
                        h8cVar.h(new w8c(num.intValue()));
                    }
                    chatMediaViewerScreen.l = h8cVar.p();
                    return sbiVar;
                }
                zv8[] zv8VarArr = BottomSheetWidget.t;
                jc4 jc4VarC = p.c(R.string.to_save, null, null, 6);
                yze yzeVar = (yze) a0fVar;
                jc4VarC.c(R.id.oneme_chatmedia_viewer_bulk_saving_only_this, yzeVar.a);
                jc4VarC.c(R.id.oneme_chatmedia_viewer_bulk_saving_all, yzeVar.b);
                jc4VarC.b(R.id.cancel, new tnh(R.string.chatmedia_viewer_bulk_saving_cancel));
                jc4VarC.j(pq3.j.e(chatMediaViewerScreen.getContext()).j().b.getName());
                ConfirmationBottomSheet confirmationBottomSheetF = jc4VarC.f(chatMediaViewerScreen);
                confirmationBottomSheetF.setTargetController(chatMediaViewerScreen);
                br4 parentController = chatMediaViewerScreen;
                while (parentController.getParentController() != null) {
                    parentController = parentController.getParentController();
                }
                RootController rootController = parentController instanceof RootController ? (RootController) parentController : null;
                hveVarU1 = rootController != null ? rootController.u1() : null;
                if (hveVarU1 == null) {
                    return sbiVar;
                }
                lve lveVar = new lve(confirmationBottomSheetF, null, null, null, false, -1);
                p.k(false, lveVar, true, "BottomSheetWidget");
                hveVarU1.I(lveVar);
                return sbiVar;
            case 1:
                Object obj3 = this.f;
                ch3.d0(obj);
                m53 m53Var = (m53) obj3;
                chatMediaViewerScreen.x.l.b(m53Var.a, new eq0(1, new e53(chatMediaViewerScreen, chatMediaViewerScreen.x.l(), m53Var, 0)));
                return sbiVar;
            case 2:
                Object obj4 = this.f;
                ch3.d0(obj);
                n53 n53Var = (n53) obj4;
                zv8[] zv8VarArr2 = ChatMediaViewerScreen.Z;
                ChatMediaViewerScreen chatMediaViewerScreen2 = this.g;
                rcc rccVarS1 = chatMediaViewerScreen2.S1();
                CharSequence charSequenceB = n53Var.a.b(chatMediaViewerScreen2.getContext());
                if (charSequenceB == null) {
                    charSequenceB = "";
                }
                rccVarS1.setTitle(charSequenceB);
                TextView textViewT1 = chatMediaViewerScreen2.T1();
                CharSequence charSequenceB2 = n53Var.b.b(chatMediaViewerScreen2.getContext());
                textViewT1.setText(charSequenceB2 != null ? charSequenceB2 : "");
                chatMediaViewerScreen2.T1().setVisibility(r5h.X0(chatMediaViewerScreen2.T1().getText()) ? 8 : 0);
                jcc jccVar = new jcc(R.drawable.icon_dots_vertical, null, null, null, 0.0f, new n61(1, chatMediaViewerScreen2, ChatMediaViewerScreen.class, "showDropdownMenu", "showDropdownMenu(Landroid/view/View;)V", 0, 10), 254);
                jcc jccVar2 = n53Var.c ? new jcc(R.drawable.icon_download, null, null, null, 0.0f, new f53(chatMediaViewerScreen2, 0), 254) : null;
                jcc jccVar3 = n53Var.d ? new jcc(R.drawable.icon_paint, null, null, null, 0.0f, new f53(chatMediaViewerScreen2, 1), 254) : null;
                rcc rccVarS2 = chatMediaViewerScreen2.S1();
                if (chatMediaViewerScreen2.getView() != null ? ww3.u1(chatMediaViewerScreen2.G1().getCurrentItem(), chatMediaViewerScreen2.x.l.f) instanceof ey9 : false) {
                    accVar = ybc.a;
                } else {
                    vv vvVar = chatMediaViewerScreen2.t;
                    zv8 zv8Var = ChatMediaViewerScreen.Z[4];
                    if (((Boolean) vvVar.a(chatMediaViewerScreen2)).booleanValue() || jccVar3 == null) {
                        acc accVar2 = new acc(jccVar2, jccVar, null);
                        accVar = accVar2;
                    } else {
                        accVar = new acc(jccVar3, jccVar, jccVar2);
                    }
                }
                rccVarS2.setRightActions(accVar);
                return sbiVar;
            case 3:
                Object obj5 = this.f;
                ch3.d0(obj);
                k53 k53Var = (k53) obj5;
                zv8[] zv8VarArr3 = ChatMediaViewerScreen.Z;
                chatMediaViewerScreen.R1().b(k53Var);
                CharSequence charSequence = k53Var.c;
                fl2 fl2VarQ1 = chatMediaViewerScreen.Q1();
                if (fl2VarQ1 != null) {
                    if (chatMediaViewerScreen.R1().getVisibility() == 0 && charSequence.length() > 0) {
                        i2 = 0;
                    }
                    fl2VarQ1.setVisibility(i2);
                }
                fl2 fl2VarQ2 = chatMediaViewerScreen.Q1();
                if (fl2VarQ2 != null) {
                    fl2VarQ2.setText(charSequence);
                }
                return sbiVar;
            case 4:
                Object obj6 = this.f;
                ch3.d0(obj);
                bc6 bc6Var = (bc6) obj6;
                zv8[] zv8VarArr4 = ChatMediaViewerScreen.Z;
                if (bc6Var instanceof ob6) {
                    sgg sggVar = chatMediaViewerScreen.k;
                    if (sggVar != null) {
                        sggVar.b(null);
                    }
                    if (((ob6) bc6Var).a instanceof py9) {
                        chatMediaViewerScreen.R1().c((k53) chatMediaViewerScreen.U1().q1.a.getValue());
                        e3j e3jVarW0 = chatMediaViewerScreen.w0();
                        if (chatMediaViewerScreen.i < 0.0f && e3jVarW0.a() == 0.0f) {
                            e3jVarW0.b(1.0f);
                        }
                        chatMediaViewerScreen.V1();
                        chatMediaViewerScreen.U1().Q();
                    } else {
                        td8 td8VarR1 = chatMediaViewerScreen.R1();
                        ny8 ny8Var = td8VarR1.h;
                        if (ny8Var.d()) {
                            ((s3d) ny8Var.getValue()).setVisibility(8);
                        }
                        ny8 ny8Var2 = td8VarR1.i;
                        if (ny8Var2.d()) {
                            ((ImageView) ny8Var2.getValue()).setVisibility(8);
                        }
                        ny8 ny8Var3 = td8VarR1.j;
                        if (ny8Var3.d()) {
                            ((cyb) ny8Var3.getValue()).setVisibility(8);
                        }
                        chatMediaViewerScreen.U1().H();
                    }
                    td8 td8VarR2 = chatMediaViewerScreen.R1();
                    bdc.a(td8VarR2, new pi(9, td8VarR2, chatMediaViewerScreen));
                    ji0 ji0Var = chatMediaViewerScreen.G;
                    if (ji0Var == null) {
                        return sbiVar;
                    }
                    td8 td8Var = (td8) ji0Var.c;
                    bdc.a(td8Var, new og7(td8Var, 7, ji0Var));
                    return sbiVar;
                }
                if (bc6Var instanceof qb6) {
                    return sbiVar;
                }
                if (bc6Var instanceof gb6) {
                    Integer num2 = ((gb6) bc6Var).a;
                    h8c h8cVar2 = new h8c(chatMediaViewerScreen);
                    h8cVar2.n(chatMediaViewerScreen.getContext().getString(num2.intValue()));
                    h8cVar2.h(new w8c(R.drawable.icon_warning));
                    h8cVar2.p();
                    ltb onBackPressedDispatcher = chatMediaViewerScreen.getOnBackPressedDispatcher();
                    if (onBackPressedDispatcher == null) {
                        return sbiVar;
                    }
                    onBackPressedDispatcher.d();
                    return sbiVar;
                }
                if (bc6Var instanceof zb6) {
                    h8c h8cVar3 = new h8c(chatMediaViewerScreen);
                    zb6 zb6Var = (zb6) bc6Var;
                    h8cVar3.m(zb6Var.a);
                    h8cVar3.a(zb6Var.c);
                    h8cVar3.c(new o8c(0, 0, chatMediaViewerScreen.D1(), 11));
                    Integer num3 = zb6Var.b;
                    if (num3 != null) {
                        h8cVar3.h(new w8c(num3.intValue()));
                    }
                    chatMediaViewerScreen.l = h8cVar3.p();
                    return sbiVar;
                }
                if (bc6Var instanceof jb6) {
                    jb6 jb6Var = (jb6) bc6Var;
                    int i3 = jb6Var.a;
                    if (i3 == 5) {
                        t5a t5aVar3 = chatMediaViewerScreen.m;
                        if ((t5aVar3 != null ? t5aVar3.h : 0) != i3) {
                            chatMediaViewerScreen.M1(jb6Var.b);
                        }
                    }
                    if (chatMediaViewerScreen.U1().y1.a.getValue() == wr4.c || (t5aVar = chatMediaViewerScreen.m) == null) {
                        return sbiVar;
                    }
                    t5aVar.d(i3);
                    return sbiVar;
                }
                if (bc6Var instanceof sb6) {
                    return sbiVar;
                }
                if (bc6Var instanceof ac6) {
                    z43 z43Var = z43.b;
                    ac6 ac6Var = (ac6) bc6Var;
                    long j = ac6Var.a;
                    long j2 = ac6Var.b;
                    String str = ac6Var.c;
                    dq5 dq5Var = ac6Var.d;
                    int iD1 = chatMediaViewerScreen.D1();
                    o65 o65VarB = z43Var.b();
                    n65 n65Var = new n65();
                    n65Var.a = ":dialogs/share-media";
                    n65Var.d(Long.valueOf(j), "msg_id");
                    n65Var.d(Long.valueOf(j2), "attach_id");
                    n65Var.d(str, "local_attach_id");
                    n65Var.d(Integer.valueOf(dq5Var.ordinal()), "cause_ordinal");
                    n65Var.d(Integer.valueOf(iD1), "snack_bot_margin");
                    n65Var.d(Boolean.TRUE, "force_dark");
                    o65.e(o65VarB, n65Var.a(), null, null, 4);
                    return sbiVar;
                }
                if (bc6Var instanceof lb6) {
                    sb8.P(new a53(chatMediaViewerScreen, 0), chatMediaViewerScreen.getContext(), ((lb6) bc6Var).a);
                    return sbiVar;
                }
                if (bc6Var instanceof hb6) {
                    hb6 hb6Var = (hb6) bc6Var;
                    it3.a(chatMediaViewerScreen.getContext(), y1m.a(hb6Var.a));
                    if (!it3.b()) {
                        return sbiVar;
                    }
                    h8c h8cVar4 = new h8c(chatMediaViewerScreen);
                    h8cVar4.m(hb6Var.b);
                    h8cVar4.h(new w8c(R.drawable.icon_copy_fill));
                    h8cVar4.p();
                    return sbiVar;
                }
                if (!(bc6Var instanceof xb6)) {
                    if (!(bc6Var instanceof ub6)) {
                        ore.o();
                        return null;
                    }
                    e3j e3jVarW1 = chatMediaViewerScreen.w0();
                    float f = ((ub6) bc6Var).a;
                    e3jVarW1.setPlaybackSpeed(f);
                    td8 td8VarR3 = chatMediaViewerScreen.R1();
                    cyb cybVar = (cyb) td8VarR3.j.getValue();
                    cybVar.post(new sd8(f, cybVar, td8VarR3));
                    return sbiVar;
                }
                xb6 xb6Var = (xb6) bc6Var;
                float f2 = xb6Var.d;
                float f3 = xb6Var.e;
                Bundle bundle = xb6Var.a;
                xnh xnhVar = xb6Var.b;
                Collection collection = xb6Var.c;
                if (chatMediaViewerScreen.getView() == null) {
                    return sbiVar;
                }
                opl.b(chatMediaViewerScreen, 1).g().n(f2, f3).p(bundle).t(xnhVar).l(collection).build().u(chatMediaViewerScreen);
                View view = chatMediaViewerScreen.getView();
                if (view == null) {
                    return sbiVar;
                }
                p0m.a(view, mt7.LONG_PRESS);
                return sbiVar;
            case 5:
                Object obj7 = this.f;
                ch3.d0(obj);
                rbb rbbVar = (rbb) obj7;
                if (rbbVar instanceof si6) {
                    chatMediaViewerScreen.O1();
                    o65.c(z43.b.b(), ":external_callback", n1g.i(new ylc("params", ((si6) rbbVar).b)), null, 4);
                } else if (rbbVar instanceof hk8) {
                    chatMediaViewerScreen.O1();
                    z43.b.d(((v65) ((hk8) rbbVar).a).a);
                } else if (rbbVar instanceof i65) {
                    chatMediaViewerScreen.O1();
                    z43.b.e((i65) rbbVar);
                }
                return sbiVar;
            case 6:
                Object obj8 = this.f;
                ch3.d0(obj);
                nic nicVar = (nic) obj8;
                zv8[] zv8VarArr5 = ChatMediaViewerScreen.Z;
                int i4 = nicVar.a;
                float f4 = nicVar.b;
                if (i4 != 0) {
                    t5a t5aVar4 = chatMediaViewerScreen.m;
                    if (t5aVar4 != null) {
                        t5aVar4.a().setRotation(f4);
                    }
                    ji0 ji0Var2 = chatMediaViewerScreen.G;
                    if (ji0Var2 != null) {
                        ji0Var2.b().setRotation(f4);
                    }
                }
                return sbiVar;
            case 7:
                Object obj9 = this.f;
                ch3.d0(obj);
                vr4 vr4Var = (vr4) obj9;
                zv8[] zv8VarArr6 = ChatMediaViewerScreen.Z;
                if (cqk.d(vr4Var, qr4.a)) {
                    if (chatMediaViewerScreen.i >= 0.0f) {
                        chatMediaViewerScreen.w0().b(chatMediaViewerScreen.i);
                        chatMediaViewerScreen.i = -1.0f;
                        chatMediaViewerScreen.R1().d(false);
                        return sbiVar;
                    }
                    chatMediaViewerScreen.i = chatMediaViewerScreen.w0().a();
                    chatMediaViewerScreen.w0().b(0.0f);
                    chatMediaViewerScreen.R1().d(true);
                    return sbiVar;
                }
                if (cqk.d(vr4Var, tr4.a)) {
                    chatMediaViewerScreen.j = true;
                    chatMediaViewerScreen.U1().H();
                    return sbiVar;
                }
                if (vr4Var instanceof ur4) {
                    chatMediaViewerScreen.j = false;
                    chatMediaViewerScreen.w0().seekTo(((ur4) vr4Var).a);
                    chatMediaViewerScreen.U1().Q();
                    return sbiVar;
                }
                if (vr4Var instanceof rr4) {
                    l63 l63VarU1 = chatMediaViewerScreen.U1();
                    l63VarU1.J1.B(l63VarU1, l63.O1[4], yab.h0(l63VarU1.b, ((n0c) l63VarU1.l).b(), 2, new x53(((rr4) vr4Var).a, l63VarU1, (lq4) null)));
                    return sbiVar;
                }
                if (cqk.d(vr4Var, pr4.a)) {
                    chatMediaViewerScreen.U1().H();
                    chatMediaViewerScreen.U1().W(R.id.oneme_chatmedia_viewer_info_panel_forward_message_view, null);
                    return sbiVar;
                }
                if (!(vr4Var instanceof sr4)) {
                    ore.o();
                    return null;
                }
                zv8[] zv8VarArr7 = BottomSheetWidget.t;
                PlaybackSettingsBottomSheet playbackSettingsBottomSheet = new PlaybackSettingsBottomSheet(chatMediaViewerScreen.d, chatMediaViewerScreen.w0().l0());
                playbackSettingsBottomSheet.setTargetController(chatMediaViewerScreen);
                br4 parentController2 = chatMediaViewerScreen;
                while (parentController2.getParentController() != null) {
                    parentController2 = parentController2.getParentController();
                }
                RootController rootController2 = parentController2 instanceof RootController ? (RootController) parentController2 : null;
                hveVarU1 = rootController2 != null ? rootController2.u1() : null;
                if (hveVarU1 == null) {
                    return sbiVar;
                }
                lve lveVar2 = new lve(playbackSettingsBottomSheet, null, null, null, false, -1);
                p.k(false, lveVar2, true, "BottomSheetWidget");
                hveVarU1.I(lveVar2);
                return sbiVar;
            case 8:
                Object obj10 = this.f;
                ch3.d0(obj);
                if (((Boolean) obj10).booleanValue()) {
                    sgg sggVar2 = chatMediaViewerScreen.k;
                    if (sggVar2 != null) {
                        sggVar2.b(null);
                    }
                    zv8[] zv8VarArr8 = ChatMediaViewerScreen.Z;
                    chatMediaViewerScreen.R1().c((k53) chatMediaViewerScreen.U1().q1.a.getValue());
                    t5a t5aVar5 = chatMediaViewerScreen.m;
                    if (t5aVar5 != null) {
                        t5aVar5.c();
                    }
                    if (chatMediaViewerScreen.R1().getVisibility() == 0 && (t5aVar2 = chatMediaViewerScreen.m) != null) {
                        t5aVar2.e(true);
                    }
                    chatMediaViewerScreen.V1();
                    chatMediaViewerScreen.U1().A1.a(Boolean.FALSE);
                }
                return sbiVar;
            default:
                Object obj11 = this.f;
                ch3.d0(obj);
                int iOrdinal = ((wr4) obj11).ordinal();
                if (iOrdinal == 0) {
                    zv8[] zv8VarArr9 = ChatMediaViewerScreen.Z;
                    chatMediaViewerScreen.U1().Q();
                    chatMediaViewerScreen.W1(true, true);
                    return sbiVar;
                }
                if (iOrdinal == 1) {
                    zv8[] zv8VarArr10 = ChatMediaViewerScreen.Z;
                    chatMediaViewerScreen.U1().H();
                    chatMediaViewerScreen.W1(true, false);
                    return sbiVar;
                }
                if (iOrdinal != 2) {
                    if (iOrdinal != 3) {
                        ore.o();
                        return null;
                    }
                    zv8[] zv8VarArr11 = ChatMediaViewerScreen.Z;
                    chatMediaViewerScreen.U1().H();
                    chatMediaViewerScreen.W1(true, true);
                    return sbiVar;
                }
                if (!chatMediaViewerScreen.J1()) {
                    return sbiVar;
                }
                t5a t5aVar6 = chatMediaViewerScreen.m;
                if (t5aVar6 != null) {
                    t5aVar6.b();
                }
                chatMediaViewerScreen.U1().Q();
                return sbiVar;
        }
    }
}
