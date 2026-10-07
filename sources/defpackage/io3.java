package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import one.me.chats.list.ChatsListWidget;
import one.me.chats.tab.ChatsTabWidget;
import one.me.chats.tab.StoriesAppBarBehavior;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes.dex */
public final class io3 extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ ChatsTabWidget g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ io3(lq4 lq4Var, ChatsTabWidget chatsTabWidget, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = chatsTabWidget;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        ChatsTabWidget chatsTabWidget = this.g;
        switch (i) {
            case 0:
                io3 io3Var = new io3(chatsTabWidget, lq4Var, 0);
                io3Var.f = obj;
                return io3Var;
            case 1:
                io3 io3Var2 = new io3(chatsTabWidget, lq4Var, 1);
                io3Var2.f = obj;
                return io3Var2;
            case 2:
                io3 io3Var3 = new io3(lq4Var, chatsTabWidget, 2);
                io3Var3.f = obj;
                return io3Var3;
            case 3:
                io3 io3Var4 = new io3(lq4Var, chatsTabWidget, 3);
                io3Var4.f = obj;
                return io3Var4;
            case 4:
                io3 io3Var5 = new io3(lq4Var, chatsTabWidget, 4);
                io3Var5.f = obj;
                return io3Var5;
            case 5:
                io3 io3Var6 = new io3(lq4Var, chatsTabWidget, 5);
                io3Var6.f = obj;
                return io3Var6;
            case 6:
                io3 io3Var7 = new io3(lq4Var, chatsTabWidget, 6);
                io3Var7.f = obj;
                return io3Var7;
            case 7:
                io3 io3Var8 = new io3(lq4Var, chatsTabWidget, 7);
                io3Var8.f = obj;
                return io3Var8;
            case 8:
                io3 io3Var9 = new io3(lq4Var, chatsTabWidget, 8);
                io3Var9.f = obj;
                return io3Var9;
            case 9:
                io3 io3Var10 = new io3(lq4Var, chatsTabWidget, 9);
                io3Var10.f = obj;
                return io3Var10;
            case 10:
                io3 io3Var11 = new io3(lq4Var, chatsTabWidget, 10);
                io3Var11.f = obj;
                return io3Var11;
            case 11:
                io3 io3Var12 = new io3(lq4Var, chatsTabWidget, 11);
                io3Var12.f = obj;
                return io3Var12;
            case 12:
                io3 io3Var13 = new io3(lq4Var, chatsTabWidget, 12);
                io3Var13.f = obj;
                return io3Var13;
            case 13:
                io3 io3Var14 = new io3(lq4Var, chatsTabWidget, 13);
                io3Var14.f = obj;
                return io3Var14;
            case 14:
                io3 io3Var15 = new io3(lq4Var, chatsTabWidget, 14);
                io3Var15.f = obj;
                return io3Var15;
            default:
                io3 io3Var16 = new io3(lq4Var, chatsTabWidget, 15);
                io3Var16.f = obj;
                return io3Var16;
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        int i = this.e;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                ((io3) create((List) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
            case 1:
                ((io3) create((List) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
            case 2:
                ((io3) create(obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
            case 3:
                ((io3) create(obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
            case 4:
                ((io3) create(obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
            case 5:
                ((io3) create(obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
            case 6:
                ((io3) create(obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
            case 7:
                ((io3) create(obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
            case 8:
                ((io3) create(obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
            case 9:
                ((io3) create(obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
            case 10:
                ((io3) create(obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
            case 11:
                ((io3) create(obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
            case 12:
                ((io3) create(obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
            case 13:
                ((io3) create(obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
            case 14:
                ((io3) create(obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
            default:
                ((io3) create(obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
        }
        return sbiVar;
    }

    /* JADX WARN: Code duplicated, block: B:148:0x0340  */
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
    public final Object invokeSuspend(Object obj) throws Throwable {
        mjg mjgVar;
        Integer num;
        int iIntValue;
        lve lveVar;
        rs2 rs2Var;
        rs2 rs2Var2;
        z = false;
        boolean z = false;
        int i = 0;
        pqg pqgVar = null;
        w73VarR1 = null;
        w73 w73VarR1 = null;
        pqgVar = null;
        switch (this.e) {
            case 0:
                List list = (List) this.f;
                ch3.d0(obj);
                ChatsTabWidget chatsTabWidget = this.g;
                chatsTabWidget.Y.j(list);
                chatsTabWidget.u1().M(list);
                qp4 qp4Var = chatsTabWidget.h;
                if (qp4Var != null) {
                    qp4Var.dismiss();
                }
                chatsTabWidget.h = null;
                rs2 rs2Var3 = chatsTabWidget.X;
                if (rs2Var3 != null && rs2Var3.h()) {
                    ((ps2) rs2Var3.a).getClass();
                    List list2 = list;
                    if ((list2 instanceof Collection) && list2.isEmpty()) {
                        rs2Var3.b(true);
                    } else {
                        Iterator it = list2.iterator();
                        while (it.hasNext()) {
                            if (cqk.d(((q37) it.next()).a, "chat.channel.folder")) {
                            }
                        }
                        rs2Var3.b(true);
                    }
                }
                return sbi.a;
            case 1:
                List list3 = (List) this.f;
                ch3.d0(obj);
                this.g.F.H(list3);
                return sbi.a;
            case 2:
                Object obj2 = this.f;
                ch3.d0(obj);
                gu7 gu7Var = (gu7) obj2;
                ChatsTabWidget chatsTabWidget2 = this.g;
                zv8[] zv8VarArr = ChatsTabWidget.B1;
                String name = ChatsTabWidget.class.getName();
                a4c a4cVar = gm0.f;
                if (a4cVar != null) {
                    je9 je9Var = je9.d;
                    if (a4cVar.b(je9Var)) {
                        a4cVar.c(je9Var, name, "handleHeaderStateUpdate: state=" + gu7Var, null);
                    }
                }
                chatsTabWidget2.z1 = gu7Var;
                chatsTabWidget2.F1(chatsTabWidget2.C1(), false);
                mg0 mg0Var = new mg0();
                mg0Var.S(0);
                x2i.a(mg0Var, chatsTabWidget2.C1());
                rcc rccVarC1 = chatsTabWidget2.C1();
                CharSequence charSequenceB = gu7Var.a.b(chatsTabWidget2.getContext());
                if (charSequenceB == null) {
                    charSequenceB = "";
                }
                rccVarC1.setTitle(charSequenceB);
                rcc rccVarC2 = chatsTabWidget2.C1();
                ynh ynhVar = gu7Var.b;
                rccVarC2.s(ynhVar != null ? ynhVar.b(chatsTabWidget2.getContext()) : null, false);
                chatsTabWidget2.C1().setTextShimmerEnabled(gu7Var.b != null);
                if (chatsTabWidget2.E1()) {
                    StoriesAppBarBehavior storiesAppBarBehaviorZ1 = chatsTabWidget2.z1();
                    if (storiesAppBarBehaviorZ1 != null && (mjgVar = storiesAppBarBehaviorZ1.x) != null) {
                        pqgVar = (pqg) mjgVar.getValue();
                    }
                    chatsTabWidget2.J1(pqgVar);
                    chatsTabWidget2.I1();
                }
                return sbi.a;
            case 3:
                Object obj3 = this.f;
                ch3.d0(obj);
                boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                ChatsTabWidget chatsTabWidget3 = this.g;
                zv8[] zv8VarArr2 = ChatsTabWidget.B1;
                chatsTabWidget3.A1().setRefreshingNext(zBooleanValue);
                return sbi.a;
            case 4:
                Object obj4 = this.f;
                ch3.d0(obj);
                rbb rbbVar = (rbb) obj4;
                if (rbbVar instanceof yug) {
                    yug yugVar = (yug) rbbVar;
                    zm3.b.u(yugVar.b(), yugVar.a(), avg.USER, yugVar.c());
                } else if (rbbVar instanceof zug) {
                    zm3.o(zm3.b, ((zug) rbbVar).a(), "local", null, null, null, null, 252);
                } else if (rbbVar instanceof xug) {
                    zm3 zm3Var = zm3.b;
                    zm3Var.e(zm3Var.x(((xug) rbbVar).a()));
                } else if (rbbVar instanceof i65) {
                    zm3.b.e((i65) rbbVar);
                }
                return sbi.a;
            case 5:
                ChatsTabWidget chatsTabWidget4 = this.g;
                Object obj5 = this.f;
                ch3.d0(obj);
                irg irgVar = (irg) obj5;
                if (irgVar instanceof hrg) {
                    g8c g8cVar = chatsTabWidget4.s;
                    if (g8cVar != null) {
                        g8cVar.a();
                    }
                    h8c h8cVar = new h8c(chatsTabWidget4);
                    hrg hrgVar = (hrg) irgVar;
                    h8cVar.m(hrgVar.b());
                    Integer numA = hrgVar.a();
                    if (numA != null) {
                        h8cVar.i(new w8c(numA.intValue()));
                    }
                    chatsTabWidget4.s = h8cVar.p();
                } else {
                    if (!(irgVar instanceof grg)) {
                        ore.o();
                        return null;
                    }
                    j0m.d(chatsTabWidget4, ((grg) irgVar).a(), new o8c(0, 0, 0, 15), new ol0(10, irgVar));
                }
                return sbi.a;
            case 6:
                Object obj6 = this.f;
                ch3.d0(obj);
                ChatsTabWidget chatsTabWidget5 = this.g;
                g8c g8cVar2 = chatsTabWidget5.s;
                if (g8cVar2 != null) {
                    g8cVar2.a();
                }
                h8c h8cVar2 = new h8c(chatsTabWidget5);
                h8cVar2.m(new tnh(R.string.oneme_stories_publish_max_count));
                h8cVar2.i(new w8c(R.drawable.icon_info_fill));
                chatsTabWidget5.s = h8cVar2.p();
                return sbi.a;
            case 7:
                Object obj7 = this.f;
                ch3.d0(obj);
                long jLongValue = ((Number) obj7).longValue();
                ChatsTabWidget chatsTabWidget6 = this.g;
                zv8[] zv8VarArr3 = ChatsTabWidget.B1;
                vee layoutManager = chatsTabWidget6.A1().getLayoutManager();
                LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
                if (linearLayoutManager != null) {
                    int iU0 = linearLayoutManager.U0();
                    int iY0 = linearLayoutManager.Y0();
                    int i2 = -1;
                    if (iU0 != -1 && iY0 != -1) {
                        Iterator it2 = chatsTabWidget6.F.d.f.iterator();
                        while (it2.hasNext()) {
                            if (((osg) it2.next()).i == jLongValue) {
                                i2 = i;
                                Integer num2 = new Integer(i2);
                                num = num2.intValue() >= 0 ? num2 : null;
                                if (num != null && (iU0 > (iIntValue = num.intValue()) || iIntValue > iY0)) {
                                    chatsTabWidget6.A1().w0(iIntValue);
                                }
                            } else {
                                i++;
                            }
                        }
                        Integer num3 = new Integer(i2);
                        if (num3.intValue() >= 0) {
                        }
                        if (num != null) {
                            chatsTabWidget6.A1().w0(iIntValue);
                        }
                    }
                }
                return sbi.a;
            case 8:
                Object obj8 = this.f;
                ch3.d0(obj);
                int size = ((List) obj8).size();
                ChatsTabWidget chatsTabWidget7 = this.g;
                if (size > 1) {
                    zv8[] zv8VarArr4 = ChatsTabWidget.B1;
                    chatsTabWidget7.v1().setVisibility(0);
                    chatsTabWidget7.w1().setUserInputEnabled(!chatsTabWidget7.I);
                } else {
                    zv8[] zv8VarArr5 = ChatsTabWidget.B1;
                    chatsTabWidget7.v1().setVisibility(8);
                    chatsTabWidget7.w1().setUserInputEnabled(false);
                }
                return sbi.a;
            case 9:
                Object obj9 = this.f;
                ch3.d0(obj);
                int iIntValue2 = ((Number) obj9).intValue();
                ChatsTabWidget chatsTabWidget8 = this.g;
                zv8[] zv8VarArr6 = ChatsTabWidget.B1;
                if (chatsTabWidget8.w1().getCurrentItem() != iIntValue2 || chatsTabWidget8.v1().getSelectedTabPosition() != iIntValue2) {
                    chatsTabWidget8.w1().h(iIntValue2, false);
                    chatsTabWidget8.v1().o(iIntValue2, 0.0f, true, true, true);
                }
                hve hveVarI = chatsTabWidget8.u1().I(iIntValue2);
                br4 br4Var = (hveVarI == null || (lveVar = (lve) ww3.t1(hveVarI.e())) == null) ? null : lveVar.a;
                ChatsListWidget chatsListWidget = br4Var instanceof ChatsListWidget ? (ChatsListWidget) br4Var : null;
                if (chatsListWidget != null && chatsListWidget.isAttached()) {
                    w73VarR1 = chatsListWidget.r1(chatsListWidget.s1());
                }
                gve gveVar = chatsTabWidget8.x1;
                if (gveVar != null) {
                    if (w73VarR1 != null && w73VarR1.C()) {
                        z = true;
                    }
                    gveVar.f(z);
                }
                return sbi.a;
            case 10:
                Object obj10 = this.f;
                ch3.d0(obj);
                lm3 lm3Var = (lm3) obj10;
                ChatsTabWidget chatsTabWidget9 = this.g;
                zv8[] zv8VarArr7 = ChatsTabWidget.B1;
                boolean z2 = lm3Var.a > 0;
                chatsTabWidget9.d.f(z2);
                chatsTabWidget9.I = z2;
                boolean z3 = !z2;
                chatsTabWidget9.w1().setUserInputEnabled(z3);
                qz4 qz4Var = chatsTabWidget9.J;
                if (qz4Var != null) {
                    View childAt = ((xgh) qz4Var.b).getChildAt(0);
                    ViewGroup viewGroup = childAt instanceof ViewGroup ? (ViewGroup) childAt : null;
                    if (viewGroup == null) {
                        gm0.Y(qz4.class.getName(), "didn't find viewgroup");
                    } else {
                        int childCount = viewGroup.getChildCount();
                        for (int i3 = 0; i3 < childCount; i3++) {
                            View childAt2 = viewGroup.getChildAt(i3);
                            childAt2.setEnabled(z3);
                            childAt2.setClickable(z3);
                            childAt2.setFocusable(z3);
                        }
                    }
                }
                n67 n67Var = chatsTabWidget9.Y;
                if (n67Var.k != z2) {
                    n67Var.k = z2;
                    if (!n67Var.g.isEmpty()) {
                        n67Var.j(n67Var.g);
                    }
                }
                if (chatsTabWidget9.E1()) {
                    chatsTabWidget9.I1();
                }
                if (z2 && (rs2Var = chatsTabWidget9.X) != null) {
                    rs2Var.b(true);
                }
                if (z2) {
                    chatsTabWidget9.C1().c(String.valueOf(lm3Var.a), r66.a, new go3(chatsTabWidget9, 3), new c6(25));
                    km3 km3VarT1 = chatsTabWidget9.t1();
                    List list4 = lm3Var.b;
                    mjg mjgVar2 = km3VarT1.d;
                    List<rp4> list5 = list4;
                    ArrayList arrayList = new ArrayList(yw3.W0(list5, 10));
                    for (rp4 rp4Var : list5) {
                        Integer numA2 = rp4Var.a();
                        arrayList.add(new mxb(new rxb(null, new pxb(numA2 != null ? numA2.intValue() : 0), rp4Var.c(), zo5.h(rp4Var.c(), "chat_multiselect_action_"), rp4Var.c()), rp4Var.d(), rp4Var.b(), 6));
                    }
                    hm3 hm3Var = new hm3(arrayList, true);
                    mjgVar2.getClass();
                    mjgVar2.j(null, hm3Var);
                } else if (chatsTabWidget9.C1().b()) {
                    chatsTabWidget9.C1().a();
                    chatsTabWidget9.t1().B();
                } else {
                    chatsTabWidget9.t1().B();
                }
                return sbi.a;
            case 11:
                Object obj11 = this.f;
                ch3.d0(obj);
                ChatsTabWidget chatsTabWidget10 = this.g;
                zv8[] zv8VarArr8 = ChatsTabWidget.B1;
                a8j.x(chatsTabWidget10.s1().e, new ti3(((im3) obj11).a()));
                return sbi.a;
            case 12:
                Object obj12 = this.f;
                ch3.d0(obj);
                rbb rbbVar2 = (rbb) obj12;
                if (rbbVar2 instanceof i65) {
                    zm3.b.e((i65) rbbVar2);
                }
                return sbi.a;
            case 13:
                Object obj13 = this.f;
                ch3.d0(obj);
                g6h g6hVar = (g6h) obj13;
                ChatsTabWidget chatsTabWidget11 = this.g;
                zv8[] zv8VarArr9 = ChatsTabWidget.B1;
                org orgVarQ1 = chatsTabWidget11.q1();
                fsg fsgVar = orgVarQ1.c;
                boolean z4 = g6hVar.h;
                orgVarQ1.f = g6hVar.a;
                orgVarQ1.h = g6hVar.c;
                boolean z5 = g6hVar.d;
                orgVarQ1.i = z5;
                if (g6hVar.e) {
                    List list6 = g6hVar.b;
                    fsgVar.setCollapsedShiftEnabled(false);
                    orgVarQ1.a(list6, true);
                    fsgVar.setOffsetLeft(orgVarQ1.g);
                    fsgVar.setFirstItemPartiallyVisible(z4);
                } else {
                    fsgVar.setCollapsedShiftEnabled(z4);
                    fsgVar.setFirstItemPartiallyVisible(false);
                    orgVarQ1.a(orgVarQ1.f, false);
                }
                orgVarQ1.e.setVisibility(z5 ? 0 : 8);
                return sbi.a;
            case 14:
                Object obj14 = this.f;
                ch3.d0(obj);
                boolean zBooleanValue2 = ((Boolean) obj14).booleanValue();
                ChatsTabWidget chatsTabWidget12 = this.g;
                zv8[] zv8VarArr10 = ChatsTabWidget.B1;
                StoriesAppBarBehavior storiesAppBarBehaviorZ2 = chatsTabWidget12.z1();
                if (storiesAppBarBehaviorZ2 != null) {
                    storiesAppBarBehaviorZ2.F = zBooleanValue2;
                }
                return sbi.a;
            default:
                Object obj15 = this.f;
                ch3.d0(obj);
                pqg pqgVar2 = (pqg) obj15;
                ChatsTabWidget chatsTabWidget13 = this.g;
                zv8[] zv8VarArr11 = ChatsTabWidget.B1;
                iug iugVarB1 = chatsTabWidget13.B1();
                bsg bsgVar = bsg.d;
                int iOrdinal = pqgVar2.ordinal();
                if (iOrdinal == 0) {
                    bsgVar = bsg.a;
                } else if (iOrdinal == 1) {
                    bsgVar = bsg.c;
                } else if (iOrdinal != 2) {
                    if (iOrdinal == 3) {
                        bsgVar = bsg.e;
                    } else if (iOrdinal != 4) {
                        if (iOrdinal != 5) {
                            ore.o();
                            return null;
                        }
                        bsgVar = bsg.b;
                    }
                }
                mjg mjgVar3 = iugVarB1.l.e;
                mjgVar3.getClass();
                mjgVar3.j(null, bsgVar);
                if (pqgVar2 != pqg.a) {
                    chatsTabWidget13.A1().E0();
                    rs2 rs2Var4 = chatsTabWidget13.X;
                    if (rs2Var4 != null && rs2Var4.h() && (rs2Var2 = chatsTabWidget13.X) != null) {
                        rs2Var2.b(false);
                    }
                }
                chatsTabWidget13.J1(pqgVar2);
                return sbi.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ io3(ChatsTabWidget chatsTabWidget, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = chatsTabWidget;
    }
}
