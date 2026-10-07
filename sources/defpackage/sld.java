package defpackage;

import android.content.Context;
import android.content.Intent;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.List;
import one.me.android.root.RootController;
import one.me.profileedit.screens.changelink.ProfileChangeLinkScreen;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;
import org.apache.http.protocol.HTTP;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class sld extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ ProfileChangeLinkScreen g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sld(lq4 lq4Var, ProfileChangeLinkScreen profileChangeLinkScreen, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = profileChangeLinkScreen;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        ProfileChangeLinkScreen profileChangeLinkScreen = this.g;
        switch (i) {
            case 0:
                sld sldVar = new sld(profileChangeLinkScreen, lq4Var, 0);
                sldVar.f = obj;
                return sldVar;
            case 1:
                sld sldVar2 = new sld(profileChangeLinkScreen, lq4Var, 1);
                sldVar2.f = obj;
                return sldVar2;
            case 2:
                sld sldVar3 = new sld(lq4Var, profileChangeLinkScreen, 2);
                sldVar3.f = obj;
                return sldVar3;
            default:
                sld sldVar4 = new sld(lq4Var, profileChangeLinkScreen, 3);
                sldVar4.f = obj;
                return sldVar4;
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                ((sld) create((List) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
            case 1:
                ((sld) create((cmd) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
            case 2:
                ((sld) create(obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
            default:
                ((sld) create(obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
        }
        return sbiVar;
    }

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
        CharSequence charSequenceB;
        int i = this.e;
        sbi sbiVar = sbi.a;
        ProfileChangeLinkScreen profileChangeLinkScreen = this.g;
        Object obj2 = this.f;
        switch (i) {
            case 0:
                ch3.d0(obj);
                profileChangeLinkScreen.g.H((List) obj2);
                return sbiVar;
            case 1:
                cmd cmdVar = (cmd) obj2;
                ch3.d0(obj);
                if (cmdVar instanceof zld) {
                    ml9.b(profileChangeLinkScreen);
                    opl.b(profileChangeLinkScreen, 1).l(((zld) cmdVar).b).f((ImageView) profileChangeLinkScreen.h.m(profileChangeLinkScreen, ProfileChangeLinkScreen.t[2])).build().u(profileChangeLinkScreen);
                } else {
                    int i2 = 11;
                    if (cmdVar instanceof bmd) {
                        bmd bmdVar = (bmd) cmdVar;
                        ynh ynhVar = bmdVar.b;
                        if (ynhVar != null && (charSequenceB = ynhVar.b(profileChangeLinkScreen.getContext())) != null) {
                            ynh ynhVar2 = bmdVar.c;
                            CharSequence charSequenceB2 = ynhVar2 != null ? ynhVar2.b(profileChangeLinkScreen.getContext()) : null;
                            g8c g8cVar = profileChangeLinkScreen.o;
                            if (g8cVar != null) {
                                g8cVar.b();
                            }
                            h8c h8cVar = new h8c(profileChangeLinkScreen);
                            h8cVar.n(charSequenceB);
                            h8cVar.b(charSequenceB2);
                            int i3 = bmdVar.d ? 1 : 2;
                            h9c h9cVar = h8cVar.b;
                            h8cVar.b = h9c.a(h9cVar, null, null, null, null, o8c.a(h9cVar.e, i3, 0, 0, 14), null, null, 111);
                            h8cVar.c(new o8c(0, 0, ProfileChangeLinkScreen.o1(profileChangeLinkScreen).getVisibility() == 0 ? bc1.g(12.0f, yl5.d().getDisplayMetrics().density, 2, ProfileChangeLinkScreen.o1(profileChangeLinkScreen).getMeasuredHeight()) : 0, 11));
                            Integer num = bmdVar.e;
                            h8cVar.h(num != null ? new w8c(num.intValue()) : x8c.a);
                            profileChangeLinkScreen.o = h8cVar.p();
                        }
                    } else if (cmdVar instanceof xld) {
                        Intent intent = new Intent();
                        intent.setAction("android.intent.action.SEND");
                        intent.putExtra("android.intent.extra.TEXT", ((xld) cmdVar).b.b(profileChangeLinkScreen.getContext()));
                        intent.setType(HTTP.PLAIN_TEXT_TYPE);
                        o65.c(wnd.b.b(), ":chats/share", n1g.i(new ylc("oneme:share:data", intent), new ylc("oneme:share:title", np4.q(profileChangeLinkScreen.getContext(), R.string.share_to_max)), new ylc("tag", ProfileChangeLinkScreen.class.getName())), null, 4);
                    } else if (cmdVar instanceof amd) {
                        wnd wndVar = wnd.b;
                        amd amdVar = (amd) cmdVar;
                        long j = amdVar.b;
                        int i4 = amdVar.c;
                        o65 o65VarB = wndVar.b();
                        StringBuilder sbX = zo5.x(i4, j, ":invite/qr?height=", "&id=");
                        sbX.append("&type=chat&push_if_absent=true");
                        o65.c(o65VarB, sbX.toString(), null, null, 6);
                    } else if (cmdVar instanceof uld) {
                        it3.a(profileChangeLinkScreen.getContext(), ((uld) cmdVar).b);
                    } else if (cmdVar instanceof yld) {
                        zv8[] zv8VarArr = BottomSheetWidget.t;
                        yld yldVar = (yld) cmdVar;
                        jc4 jc4VarA = mol.a(yldVar.b, null, yldVar.f, 2);
                        jc4VarA.g(yldVar.c);
                        yldVar.e.forEach(new o01(i2, new t63(1, jc4VarA, jc4.class, "addButton", "addButton([Lone/me/sdk/bottomsheet/ConfirmationBottomSheet$Button;)Lone/me/sdk/bottomsheet/ConfirmationBottomSheet$Builder;", 8, 14)));
                        Integer num2 = yldVar.d;
                        if (num2 != null) {
                            int iIntValue = num2.intValue();
                            zv8[] zv8VarArr2 = ProfileChangeLinkScreen.t;
                            Context context = profileChangeLinkScreen.getContext();
                            a8g a8gVar = pq3.j;
                            jc4VarA.h(new oc4(iIntValue, 2, 3, Integer.valueOf(tre.I0(a8gVar.e(profileChangeLinkScreen.getContext()).m().h().a, 0.16f)), Integer.valueOf(a8gVar.e(context).m().getIcon().h)));
                        }
                        ConfirmationBottomSheet confirmationBottomSheetF = jc4VarA.f(profileChangeLinkScreen);
                        confirmationBottomSheetF.setTargetController(profileChangeLinkScreen);
                        br4 parentController = profileChangeLinkScreen;
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
                    } else if (cmdVar instanceof vld) {
                        String str = sj8.a;
                        Context context2 = profileChangeLinkScreen.getContext();
                        CharSequence charSequenceB3 = ((vld) cmdVar).b.b(profileChangeLinkScreen.getContext());
                        if (charSequenceB3 == null) {
                            charSequenceB3 = "";
                        }
                        sj8.j(context2, charSequenceB3, null);
                    } else {
                        if (!(cmdVar instanceof wld)) {
                            ore.o();
                            return null;
                        }
                        wnd.b.b().g(new a8d(13, new p7d(profileChangeLinkScreen, cmdVar)));
                    }
                }
                return sbiVar;
            case 2:
                ch3.d0(obj);
                jq2 jq2Var = (jq2) obj2;
                j8e j8eVar = profileChangeLinkScreen.i;
                zv8[] zv8VarArr3 = ProfileChangeLinkScreen.t;
                ((rcc) j8eVar.m(profileChangeLinkScreen, zv8VarArr3[3])).setTitle(jq2Var.a);
                ProfileChangeLinkScreen.o1(profileChangeLinkScreen).setEnabled(jq2Var.c);
                ProfileChangeLinkScreen.o1(profileChangeLinkScreen).setLoading(jq2Var.d);
                iq2 iq2Var = jq2Var.e;
                if (iq2Var != null) {
                    profileChangeLinkScreen.p1().setVisibility(0);
                    profileChangeLinkScreen.q.B(profileChangeLinkScreen, zv8VarArr3[9], iq2Var.a);
                    TextView textView = (TextView) profileChangeLinkScreen.n.m(profileChangeLinkScreen, zv8VarArr3[8]);
                    iq2Var.getClass();
                    textView.setText(R.string.profile_edit_shortlink_private_channel_created_title);
                } else {
                    profileChangeLinkScreen.p1().setVisibility(8);
                }
                int iOrdinal = profileChangeLinkScreen.q1().ordinal();
                if (iOrdinal == 0) {
                    ProfileChangeLinkScreen.o1(profileChangeLinkScreen).setVisibility(0);
                } else {
                    if (iOrdinal != 1) {
                        ore.o();
                        return null;
                    }
                    ProfileChangeLinkScreen.o1(profileChangeLinkScreen).setVisibility(jq2Var.b ? 0 : 8);
                }
                return sbiVar;
            default:
                ch3.d0(obj);
                rbb rbbVar = (rbb) obj2;
                if (rbbVar instanceof rt3) {
                    ml9.b(profileChangeLinkScreen);
                    profileChangeLinkScreen.getRouter().C(profileChangeLinkScreen);
                } else if (rbbVar instanceof i65) {
                    ml9.b(profileChangeLinkScreen);
                    wnd.b.e((i65) rbbVar);
                }
                return sbiVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sld(ProfileChangeLinkScreen profileChangeLinkScreen, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = profileChangeLinkScreen;
    }
}
