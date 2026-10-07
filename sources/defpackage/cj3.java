package defpackage;

import android.view.View;
import java.util.Collections;
import java.util.List;
import one.me.android.root.RootController;
import one.me.chats.search.ChatsListSearchScreen;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class cj3 extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ ChatsListSearchScreen g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cj3(lq4 lq4Var, ChatsListSearchScreen chatsListSearchScreen, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = chatsListSearchScreen;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        ChatsListSearchScreen chatsListSearchScreen = this.g;
        switch (i) {
            case 0:
                cj3 cj3Var = new cj3(lq4Var, chatsListSearchScreen, 0);
                cj3Var.f = obj;
                return cj3Var;
            case 1:
                cj3 cj3Var2 = new cj3(lq4Var, chatsListSearchScreen, 1);
                cj3Var2.f = obj;
                return cj3Var2;
            case 2:
                cj3 cj3Var3 = new cj3(lq4Var, chatsListSearchScreen, 2);
                cj3Var3.f = obj;
                return cj3Var3;
            case 3:
                cj3 cj3Var4 = new cj3(lq4Var, chatsListSearchScreen, 3);
                cj3Var4.f = obj;
                return cj3Var4;
            case 4:
                cj3 cj3Var5 = new cj3(lq4Var, chatsListSearchScreen, 4);
                cj3Var5.f = obj;
                return cj3Var5;
            default:
                cj3 cj3Var6 = new cj3(lq4Var, chatsListSearchScreen, 5);
                cj3Var6.f = obj;
                return cj3Var6;
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        lq4 lq4Var = (lq4) obj2;
        switch (i) {
            case 0:
                ((cj3) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            case 1:
                ((cj3) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            case 2:
                ((cj3) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            case 3:
                ((cj3) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            case 4:
                ((cj3) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            default:
                ((cj3) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
        }
        return sbiVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        View view;
        ia8 ia8Var;
        int i = 3;
        int i2 = 4;
        switch (this.e) {
            case 0:
                List listSingletonList = r66.a;
                Object obj2 = this.f;
                ch3.d0(obj);
                ylc ylcVar = (ylc) obj2;
                jj3 jj3Var = (jj3) ylcVar.a;
                List list = (List) ylcVar.b;
                ChatsListSearchScreen chatsListSearchScreen = this.g;
                zv8[] zv8VarArr = ChatsListSearchScreen.F;
                y3f y3fVar = y3f.CHATS_LIST_SEARCH_RESULT;
                je9 je9Var = je9.d;
                String name = ChatsListSearchScreen.class.getName();
                a4c a4cVar = gm0.f;
                if (a4cVar != null && a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, name, "updateState " + jj3Var, null);
                }
                int iOrdinal = jj3Var.a.ordinal();
                if (iOrdinal == 0) {
                    chatsListSearchScreen.p.H(listSingletonList);
                    chatsListSearchScreen.p1();
                    chatsListSearchScreen.w.H(listSingletonList);
                    chatsListSearchScreen.y.H(listSingletonList);
                    chatsListSearchScreen.x.H(Collections.singletonList(ga9.a));
                } else if (iOrdinal == 2) {
                    l48 l48Var = jj3Var.c;
                    boolean z = jj3Var.e;
                    chatsListSearchScreen.p.H(listSingletonList);
                    chatsListSearchScreen.x.H(listSingletonList);
                    chatsListSearchScreen.w.H(listSingletonList);
                    chatsListSearchScreen.y.H(listSingletonList);
                    String name2 = ChatsListSearchScreen.class.getName();
                    a4c a4cVar2 = gm0.f;
                    if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                        a4cVar2.c(je9Var, name2, "idleSearchData.recentContacts = ".concat(ww3.z1(l48Var.a, null, null, null, null, 63)), null);
                    }
                    if (!l48Var.a.isEmpty()) {
                        listSingletonList = Collections.singletonList(l48Var.a);
                    }
                    chatsListSearchScreen.q.I(listSingletonList, new jm(z, chatsListSearchScreen, l48Var, 2));
                    tbb.g((tbb) chatsListSearchScreen.d.getValue(), y3f.CHATS_LIST_SEARCH_INITIAL);
                } else if (iOrdinal == 3) {
                    List list2 = jj3Var.d;
                    boolean z2 = jj3Var.e;
                    boolean z3 = jj3Var.f;
                    chatsListSearchScreen.x.H(listSingletonList);
                    chatsListSearchScreen.p1();
                    chatsListSearchScreen.y.H(listSingletonList);
                    chatsListSearchScreen.p.H(list);
                    chatsListSearchScreen.w.I(list2, new xi3(z2, chatsListSearchScreen, z3));
                    tbb.g((tbb) chatsListSearchScreen.d.getValue(), y3fVar);
                } else if (iOrdinal == 4) {
                    if (list.isEmpty()) {
                        chatsListSearchScreen.p.H(listSingletonList);
                        chatsListSearchScreen.x.H(listSingletonList);
                        chatsListSearchScreen.p1();
                        chatsListSearchScreen.w.H(listSingletonList);
                        chatsListSearchScreen.y.I(Collections.singletonList(z66.a), new jj2(i2, chatsListSearchScreen));
                    } else {
                        chatsListSearchScreen.x.H(listSingletonList);
                        chatsListSearchScreen.p1();
                        chatsListSearchScreen.y.H(listSingletonList);
                        chatsListSearchScreen.p.H(list);
                    }
                    tbb.g((tbb) chatsListSearchScreen.d.getValue(), y3fVar);
                }
                return sbi.a;
            case 1:
                Object obj3 = this.f;
                ch3.d0(obj);
                this.g.z.H((List) obj3);
                return sbi.a;
            case 2:
                Object obj4 = this.f;
                ch3.d0(obj);
                xl8 xl8Var = (xl8) obj4;
                if ((xl8Var instanceof tl8) || cqk.d(xl8Var, vl8.a) || cqk.d(xl8Var, wl8.a)) {
                    gm0.Y(ChatsListSearchScreen.class.getName(), "Contact not found");
                    tol.b(this.g);
                } else if (xl8Var instanceof ul8) {
                    gm0.Y(ChatsListSearchScreen.class.getName(), "No internet");
                    ul8 ul8Var = (ul8) xl8Var;
                    ChatsListSearchScreen.o1(this.g, ul8Var.a, ul8Var.b, new Integer(R.drawable.icon_warning_fill));
                } else {
                    if (xl8Var != null) {
                        ore.o();
                        return null;
                    }
                    String name3 = ChatsListSearchScreen.class.getName();
                    a4c a4cVar3 = gm0.f;
                    if (a4cVar3 != null) {
                        je9 je9Var2 = je9.f;
                        if (a4cVar3.b(je9Var2)) {
                            a4cVar3.c(je9Var2, name3, "Invite By Phone Error: " + xl8Var, null);
                        }
                    }
                }
                return sbi.a;
            case 3:
                Object obj5 = this.f;
                ch3.d0(obj);
                rbb rbbVar = (rbb) obj5;
                ml9.b(this.g);
                if (rbbVar instanceof qfc) {
                    zm3.b.l(((Number) ((qfc) rbbVar).a).longValue());
                } else if (rbbVar instanceof q1b) {
                    zm3.b.w(((Number) ((q1b) rbbVar).a).longValue());
                } else if (rbbVar instanceof i65) {
                    zm3.b.e((i65) rbbVar);
                }
                return sbi.a;
            case 4:
                Object obj6 = this.f;
                ch3.d0(obj);
                if (obj6 instanceof o6f) {
                    ChatsListSearchScreen chatsListSearchScreen2 = this.g;
                    zv8[] zv8VarArr2 = ChatsListSearchScreen.F;
                    chatsListSearchScreen2.u1();
                    if (((o6f) obj6).a && (ia8Var = (ia8) this.g.a.getAccessor().f()) != null) {
                        ia8Var.f(Collections.singleton(new ha8(fa8.MADE_2_PIN, 1)), y3f.CHATS_LIST_SEARCH_RESULT);
                    }
                } else if (obj6 instanceof r3g) {
                    r3g r3gVar = (r3g) obj6;
                    ChatsListSearchScreen.o1(this.g, r3gVar.a, r3gVar.c, r3gVar.b);
                } else if (obj6 instanceof y1g) {
                    ChatsListSearchScreen chatsListSearchScreen3 = this.g;
                    y1g y1gVar = (y1g) obj6;
                    zv8[] zv8VarArr3 = ChatsListSearchScreen.F;
                    zv8[] zv8VarArr4 = BottomSheetWidget.t;
                    jc4 jc4VarA = mol.a(y1gVar.b, n1g.i(new ylc("selected.chatId.Action", Long.valueOf(y1gVar.a))), null, 4);
                    jc4VarA.g(y1gVar.c);
                    y1gVar.d.forEach(new o01(i, new t63(1, jc4VarA, jc4.class, "addButton", "addButton([Lone/me/sdk/bottomsheet/ConfirmationBottomSheet$Button;)Lone/me/sdk/bottomsheet/ConfirmationBottomSheet$Builder;", 8, 3)));
                    ConfirmationBottomSheet confirmationBottomSheetF = jc4VarA.f(chatsListSearchScreen3);
                    confirmationBottomSheetF.setTargetController(chatsListSearchScreen3);
                    br4 parentController = chatsListSearchScreen3;
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
                } else {
                    boolean z4 = obj6 instanceof r1g;
                    ChatsListSearchScreen chatsListSearchScreen4 = this.g;
                    if (z4) {
                        ynh ynhVar = ((r1g) obj6).a;
                        ol0 ol0Var = new ol0(8, obj6);
                        zv8[] zv8VarArr5 = ChatsListSearchScreen.F;
                        CharSequence charSequenceB = ynhVar.b(chatsListSearchScreen4.getContext());
                        if (charSequenceB != null) {
                            h8c h8cVar = new h8c(chatsListSearchScreen4);
                            h8cVar.h(z8c.a);
                            h8cVar.n(charSequenceB);
                            h8cVar.j(b9c.a);
                            br4 parentController2 = chatsListSearchScreen4.getParentController();
                            h8cVar.c(new o8c(0, 0, (parentController2 == null || (view = parentController2.getView()) == null) ? 0 : view.getPaddingBottom(), 11));
                            h8cVar.e(new s63(i, ol0Var));
                            h8cVar.p();
                        }
                    } else if (obj6 instanceof zl8) {
                        ((uj4) chatsListSearchScreen4.e.getValue()).a(this.g.getContext(), ((zl8) obj6).a);
                    } else {
                        String name4 = ChatsListSearchScreen.class.getName();
                        a4c a4cVar4 = gm0.f;
                        if (a4cVar4 != null) {
                            je9 je9Var3 = je9.f;
                            if (a4cVar4.b(je9Var3)) {
                                a4cVar4.c(je9Var3, name4, c0a.n(obj6, "Unidentified event: "), null);
                            }
                        }
                    }
                }
                return sbi.a;
            default:
                ChatsListSearchScreen chatsListSearchScreen5 = this.g;
                Object obj7 = this.f;
                ch3.d0(obj);
                h8f h8fVar = (h8f) obj7;
                if (h8fVar instanceof f8f) {
                    zv8[] zv8VarArr6 = ChatsListSearchScreen.F;
                    f8f f8fVar = (f8f) h8fVar;
                    chatsListSearchScreen5.q1().D(f8fVar.a, f8fVar.b);
                } else {
                    if (!(h8fVar instanceof g8f)) {
                        ore.o();
                        return null;
                    }
                    zv8[] zv8VarArr7 = ChatsListSearchScreen.F;
                    chatsListSearchScreen5.q1().E();
                }
                return sbi.a;
        }
    }
}
