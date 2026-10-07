package defpackage;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Iterator;
import java.util.List;
import one.me.android.root.RootController;
import one.me.profile.screens.media.ChatMediaListWidget;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;

/* JADX INFO: loaded from: classes3.dex */
public final class z23 extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ ChatMediaListWidget g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z23(ChatMediaListWidget chatMediaListWidget, lq4 lq4Var) {
        super(2, lq4Var);
        this.e = 0;
        this.g = chatMediaListWidget;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        ChatMediaListWidget chatMediaListWidget = this.g;
        switch (i) {
            case 0:
                z23 z23Var = new z23(chatMediaListWidget, lq4Var);
                z23Var.f = obj;
                return z23Var;
            case 1:
                z23 z23Var2 = new z23(lq4Var, chatMediaListWidget, 1);
                z23Var2.f = obj;
                return z23Var2;
            default:
                z23 z23Var3 = new z23(lq4Var, chatMediaListWidget, 2);
                z23Var3.f = obj;
                return z23Var3;
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                ((z23) create((m43) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
            case 1:
                ((z23) create(obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
            default:
                ((z23) create(obj, (lq4) obj2)).invokeSuspend(sbiVar);
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
        int i = this.e;
        sbi sbiVar = sbi.a;
        ChatMediaListWidget chatMediaListWidget = this.g;
        Object obj2 = this.f;
        switch (i) {
            case 0:
                ch3.d0(obj);
                chatMediaListWidget.k.H(((m43) obj2).a);
                break;
            case 1:
                ch3.d0(obj);
                j8e j8eVar = chatMediaListWidget.i;
                zv8[] zv8VarArr = ChatMediaListWidget.m;
                ((k96) j8eVar.m(chatMediaListWidget, zv8VarArr[2])).setRefreshingNext(false);
                vee layoutManager = ((k96) chatMediaListWidget.i.m(chatMediaListWidget, zv8VarArr[2])).getLayoutManager();
                LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
                Integer num = linearLayoutManager != null ? new Integer(linearLayoutManager.U0()) : null;
                if (num != null && num.intValue() == 0) {
                    ((k96) chatMediaListWidget.i.m(chatMediaListWidget, zv8VarArr[2])).A0(0);
                }
                break;
            default:
                ch3.d0(obj);
                rbb rbbVar = (rbb) obj2;
                if (rbbVar instanceof gk8) {
                    trd.b.d(((v65) ((gk8) rbbVar).a).a);
                } else if (rbbVar instanceof i65) {
                    trd.b.e((i65) rbbVar);
                } else if (rbbVar instanceof j33) {
                    trd trdVar = trd.b;
                    j33 j33Var = (j33) rbbVar;
                    long j = j33Var.b;
                    String str = j33Var.d;
                    long j2 = j33Var.c;
                    boolean z = j33Var.e;
                    o65 o65VarB = trdVar.b();
                    StringBuilder sbT = qt4.t(j, ":attach/viewer?chat_id=", "&attach_id=", str);
                    qt4.z(j2, "&msg_id=", "&single=", sbT);
                    o65.c(o65VarB, qt4.r(sbT, z, "&desc=true"), null, null, 6);
                } else if (rbbVar instanceof k33) {
                    zv8[] zv8VarArr2 = ChatMediaListWidget.m;
                    x43 x43VarO1 = chatMediaListWidget.o1();
                    x43VarO1.F.B(x43VarO1, x43.q1[3], yab.h0(x43VarO1.b, ((n0c) x43VarO1.H()).b(), 2, new dn0(x43VarO1, ((k33) rbbVar).b, (lq4) null, 23)));
                } else if (rbbVar instanceof l33) {
                    trd trdVar2 = trd.b;
                    l33 l33Var = (l33) rbbVar;
                    long j3 = l33Var.b;
                    long j4 = l33Var.c;
                    o65 o65VarB2 = trdVar2.b();
                    StringBuilder sbS = qt4.s(j3, ":chats?id=", "&type=local&message_id=");
                    sbS.append(j4);
                    o65.c(o65VarB2, sbS.toString(), null, null, 6);
                } else if (rbbVar instanceof o33) {
                    String str2 = sj8.a;
                    sj8.j(chatMediaListWidget.getContext(), ((o33) rbbVar).b, null);
                } else if (rbbVar instanceof g33) {
                    it3.a(chatMediaListWidget.getContext(), ((g33) rbbVar).b);
                } else if (rbbVar instanceof n33) {
                    trd trdVar3 = trd.b;
                    n33 n33Var = (n33) rbbVar;
                    Long l = n33Var.b;
                    List listS = c0a.s(n33Var.c);
                    boolean z2 = n33Var.d;
                    o65.c(trdVar3.b(), ":chats/forward?messages_ids=" + ww3.z1(listS, ",", null, null, null, 62) + "&attach_id=" + l + "&is_forward_attach=" + z2, null, null, 6);
                } else if (rbbVar instanceof i33) {
                    try {
                        chatMediaListWidget.getContext().startActivity(((i33) rbbVar).b);
                    } catch (Exception unused) {
                        i33 i33Var = (i33) rbbVar;
                        Intent intent = i33Var.b;
                        intent.setDataAndType(i33Var.c, "*/*");
                        chatMediaListWidget.getContext().startActivity(intent);
                    }
                } else if (rbbVar instanceof p33) {
                    zv8[] zv8VarArr3 = BottomSheetWidget.t;
                    p33 p33Var = (p33) rbbVar;
                    x7a x7aVar = p33Var.b;
                    jc4 jc4VarA = mol.a(p33Var.c, n1g.i(new ylc("selected_message_id", new Long(x7aVar.l())), new ylc("selected_attach_id", new Long(x7aVar.k()))), null, 4);
                    jc4VarA.g(p33Var.d);
                    Iterator it = p33Var.e.iterator();
                    while (it.hasNext()) {
                        jc4VarA.a((kc4) it.next());
                    }
                    ConfirmationBottomSheet confirmationBottomSheetF = jc4VarA.f(chatMediaListWidget);
                    confirmationBottomSheetF.setTargetController(chatMediaListWidget);
                    br4 parentController = chatMediaListWidget;
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
                } else if (rbbVar instanceof q33) {
                    trd trdVar4 = trd.b;
                    q33 q33Var = (q33) rbbVar;
                    long j5 = q33Var.b;
                    long j6 = q33Var.c;
                    String str3 = q33Var.d;
                    long j7 = q33Var.e;
                    String str4 = q33Var.h;
                    String str5 = q33Var.f;
                    long j8 = q33Var.g;
                    trdVar4.getClass();
                    Uri uri = Uri.parse(str4);
                    o65 o65VarB3 = trdVar4.b();
                    Bundle bundleI = n1g.i(new ylc("file_url", uri));
                    n65 n65Var = new n65();
                    n65Var.a = ":dialogs/file-download-warning";
                    n65Var.d(Long.valueOf(j5), "chat_id");
                    n65Var.d(Long.valueOf(j6), "message_id");
                    if (str3 != null) {
                        n65Var.d(str3, "attach_id");
                    }
                    n65Var.d(Long.valueOf(j7), "file_id");
                    n65Var.d(str5, "file_name");
                    n65Var.d(Long.valueOf(j8), "file_size");
                    o65.e(o65VarB3, n65Var.a(), bundleI, null, 4);
                } else if (rbbVar instanceof s33) {
                    h8c h8cVar = new h8c(chatMediaListWidget);
                    s33 s33Var = (s33) rbbVar;
                    Integer num2 = s33Var.c;
                    if (num2 != null) {
                        h8cVar.h(new w8c(num2.intValue()));
                    }
                    h8cVar.m(s33Var.b);
                    h8cVar.a(s33Var.d);
                    h8cVar.p();
                } else if (rbbVar instanceof h33) {
                    sb8.P(new qq2(5, chatMediaListWidget), chatMediaListWidget.getContext(), ((h33) rbbVar).b);
                } else if (rbbVar instanceof r33) {
                    o65.c(trd.b.b(), ":call-join-preview?link=".concat(((r33) rbbVar).b), null, null, 6);
                } else if (cqk.d(rbbVar, m33.b)) {
                    zv8[] zv8VarArr4 = ChatMediaListWidget.m;
                    ((wsc) chatMediaListWidget.j.getValue()).o(new svj(chatMediaListWidget, 1));
                }
                break;
        }
        return sbiVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z23(lq4 lq4Var, ChatMediaListWidget chatMediaListWidget, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = chatMediaListWidget;
    }
}
