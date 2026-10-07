package defpackage;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.text.method.LinkMovementMethod;
import android.view.GestureDetector;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import one.me.messages.list.loader.MessageModel;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class qpa extends g6g implements rpa {
    public final ata f;
    public final fz7 g;
    public final bw7 h;
    public final due i;
    public final ft0 j;
    public final dk2 k;
    public final osa l;
    public final msa m;
    public final msa n;
    public final msa o;
    public final msa p;
    public final lsa q;
    public final ny8 r;
    public final ny8 s;
    public final e5d t;
    public final c8b u;
    public final ArrayList v;

    public qpa(ExecutorService executorService, ata ataVar, fz7 fz7Var, bw7 bw7Var, due dueVar, ft0 ft0Var, dk2 dk2Var, osa osaVar, msa msaVar, msa msaVar2, msa msaVar3, msa msaVar4, lsa lsaVar, ny8 ny8Var, ny8 ny8Var2, e5d e5dVar) {
        super(executorService);
        this.f = ataVar;
        this.g = fz7Var;
        this.h = bw7Var;
        this.i = dueVar;
        this.j = ft0Var;
        this.k = dk2Var;
        this.l = osaVar;
        this.m = msaVar;
        this.n = msaVar2;
        this.o = msaVar3;
        this.p = msaVar4;
        this.q = lsaVar;
        this.r = ny8Var;
        this.s = ny8Var2;
        this.t = e5dVar;
        this.u = new c8b(20);
        this.v = new ArrayList(20);
    }

    @Override // defpackage.y69
    public final void I(List list, Runnable runnable) {
        super.I(list, new d86(this, list, runnable, 17));
    }

    @Override // defpackage.g6g, defpackage.nee
    /* JADX INFO: renamed from: L */
    public final void z(s7g s7gVar) {
        int iL;
        MessageModel messageModelQ;
        s7gVar.E();
        if (!(s7gVar instanceof tea) || (iL = s7gVar.l()) == -1 || (messageModelQ = Q(iL)) == null) {
            return;
        }
        tea teaVar = (tea) s7gVar;
        teaVar.D = this.n;
        teaVar.M(messageModelQ);
        teaVar.J(messageModelQ);
    }

    @Override // defpackage.g6g, defpackage.nee
    /* JADX INFO: renamed from: M */
    public final void B(s7g s7gVar) {
        s7gVar.G();
        tea teaVar = s7gVar instanceof tea ? (tea) s7gVar : null;
        if (teaVar != null) {
            bw7 bw7Var = this.h;
            bw7Var.getClass();
            teaVar.T(null, null);
            bw7Var.b.remove(teaVar);
        }
    }

    public final long N(long j) {
        int i;
        ArrayList arrayList = this.v;
        boolean zIsEmpty = arrayList.isEmpty();
        long j2 = rsk.a;
        if (!zIsEmpty) {
            c8b c8bVar = this.u;
            if (c8bVar.e != 0) {
                int size = arrayList.size();
                xw3.T0(arrayList.size(), size);
                int i2 = size - 1;
                int i3 = 0;
                while (true) {
                    if (i3 > i2) {
                        i = -(i3 + 1);
                        break;
                    }
                    i = (i3 + i2) >>> 1;
                    int iJ = cqk.j(((MessageModel) arrayList.get(i)).c, j);
                    if (iJ >= 0) {
                        if (iJ <= 0) {
                            break;
                        }
                        i2 = i - 1;
                    } else {
                        i3 = i + 1;
                    }
                }
                if (i < 0) {
                    return (((long) i) << 32) | 4294967295L;
                }
                int iB = c8bVar.b(i);
                int i4 = iB >= 0 ? c8bVar.c[iB] : -1;
                if (i4 >= 0) {
                    return (((long) i4) & 4294967295L) | (((long) i) << 32);
                }
            }
        }
        return j2;
    }

    public final int O(long j) {
        long jN = N(j);
        int i = (int) (jN >> 32);
        if (i >= 0) {
            return (int) (jN & 4294967295L);
        }
        if (jN == rsk.a) {
            return l();
        }
        int iAbs = Math.abs(i) - 1;
        c8b c8bVar = this.u;
        int iB = c8bVar.b(iAbs);
        int i2 = iB >= 0 ? c8bVar.c[iB] : -1;
        return i2 >= 0 ? i2 : l();
    }

    public final MessageModel P() {
        d20 d20Var = this.d;
        k79 k79Var = d20Var.f.size() > 0 ? (k79) F(xw3.O0(d20Var.f)) : null;
        if (k79Var instanceof MessageModel) {
            return (MessageModel) k79Var;
        }
        return null;
    }

    public final MessageModel Q(int i) {
        k79 k79VarJ = J(i);
        if (k79VarJ instanceof MessageModel) {
            return (MessageModel) k79VarJ;
        }
        return null;
    }

    @Override // defpackage.rpa
    public final List b() {
        return this.v;
    }

    @Override // defpackage.rpa
    public final int d(long j) {
        long jN = N(j);
        if (((int) (jN >> 32)) < 0) {
            return -1;
        }
        return (int) (jN & 4294967295L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.nee
    public final void v(lfe lfeVar, int i, List list) {
        CharSequence charSequenceA;
        s7g s7gVar = (s7g) lfeVar;
        k79 k79Var = (k79) F(i);
        if (!(s7gVar instanceof uka)) {
            if (s7gVar instanceof xx2) {
                ((xx2) s7gVar).B((yx2) k79Var);
                return;
            }
            if (s7gVar instanceof fk6) {
                View view = ((fk6) s7gVar).a;
                ((ek6) view).setState((zj6) k79Var);
                ((ek6) view).setShowContactProfileListener(this.q);
                return;
            } else {
                if (s7gVar instanceof hic) {
                    hic hicVar = (hic) s7gVar;
                    ny8 ny8Var = hicVar.u;
                    hicVar.B((eic) k79Var);
                    ((r59) ny8Var.getValue()).a = new ppa(this);
                    CharSequence charSequence = hicVar.v;
                    if (charSequence != null) {
                        ((r59) ny8Var.getValue()).c(charSequence);
                        return;
                    }
                    return;
                }
                return;
            }
        }
        MessageModel messageModel = (MessageModel) k79Var;
        uka ukaVar = (uka) s7gVar;
        boolean z = ukaVar instanceof tea;
        tea teaVar = z ? (tea) ukaVar : null;
        if (teaVar != null) {
            ViewGroup viewGroup = teaVar.y;
            boolean zBooleanValue = ((Boolean) this.p.invoke()).booleanValue();
            View view2 = teaVar.a;
            ata ataVar = this.f;
            if (zBooleanValue) {
                z7g z7gVar = viewGroup instanceof z7g ? (z7g) viewGroup : null;
                if (z7gVar != null) {
                    z7gVar.setOnSingleClick(new pea(ataVar, teaVar, 2));
                }
                jp5 jp5Var = viewGroup instanceof jp5 ? (jp5) viewGroup : null;
                if (jp5Var != null) {
                    jp5Var.setOnDoubleTap(new pea(ataVar, teaVar, 3));
                }
                iea ieaVar = (iea) view2;
                ieaVar.setOnTouchListener(new ek7(new GestureDetector(ieaVar.getContext(), new gk7(ataVar, 1, teaVar)), 2));
                teaVar.N(ataVar, true);
                if (viewGroup instanceof kfa) {
                    qe7.H(viewGroup, 300L, new oea(ataVar, teaVar, 1));
                }
            } else {
                qe7.H(view2, 300L, new oea(ataVar, teaVar, 2));
                teaVar.N(ataVar, false);
            }
        }
        tea teaVar2 = z ? (tea) ukaVar : null;
        if (teaVar2 != null) {
            teaVar2.D = this.n;
        }
        pq4 pq4Var = ukaVar instanceof pq4 ? (pq4) ukaVar : null;
        if (pq4Var != null) {
            pq4Var.y = this.i;
        }
        vfb vfbVar = ukaVar instanceof vfb ? (vfb) ukaVar : null;
        if (vfbVar != null) {
            vfbVar.n1 = this.j;
        }
        tea teaVar3 = z ? (tea) ukaVar : null;
        ViewParent viewParent = teaVar3 != null ? teaVar3.y : null;
        b8e b8eVar = viewParent instanceof b8e ? (b8e) viewParent : null;
        if (b8eVar != null) {
            b8eVar.setChipObserver(new fv9(this, 15, ukaVar));
        }
        tea teaVar4 = z ? (tea) ukaVar : null;
        ViewParent viewParent2 = teaVar4 != null ? teaVar4.y : null;
        b8e b8eVar2 = viewParent2 instanceof b8e ? (b8e) viewParent2 : null;
        if (b8eVar2 != null) {
            b8eVar2.setMaxReactionsCount(((Number) this.o.invoke()).intValue());
        }
        ukaVar.H(messageModel, list);
        tea teaVar5 = z ? (tea) ukaVar : null;
        if (teaVar5 != null) {
            bw7 bw7Var = this.h;
            bw7Var.b.add(teaVar5);
            if (bw7Var.c) {
                bw7Var.c = !teaVar5.T(bw7Var.d, new m20(2, bw7Var, bw7.class, "processText", "processText(Ljava/lang/String;Ljava/util/List;)Ljava/util/List;", 0, 24));
            }
            ((tea) ukaVar).T(bw7Var.d, new rea(2, this.h, aw7.class, "processText", "processText(Ljava/lang/String;Ljava/util/List;)Ljava/util/List;", 0, 2));
        }
        tea teaVar6 = z ? (tea) ukaVar : null;
        osa osaVar = this.l;
        if (teaVar6 != null) {
            ny8 ny8Var2 = teaVar6.G;
            if (ny8Var2.d()) {
                ((ng8) ny8Var2.getValue()).setClickListener(osaVar);
            }
        }
        yvj yvjVar = ukaVar instanceof yvj ? (yvj) ukaVar : null;
        if (yvjVar != null) {
            sea seaVar = new sea(this, 1, messageModel);
            r59 r59Var = yvjVar.y;
            r59Var.a = seaVar;
            ewj ewjVar = yvjVar.z;
            if (ewjVar != null && (charSequenceA = ewjVar.a()) != null) {
                r59Var.c(charSequenceA);
            }
            ((xvj) yvjVar.a).setKeyboardListener(osaVar);
        }
    }

    @Override // defpackage.nee
    public final lfe w(ViewGroup viewGroup, int i) {
        if (i == R.id.messages_list_chat_description_view_type) {
            wx2 wx2Var = new wx2(viewGroup.getContext());
            xx2 xx2Var = new xx2(wx2Var);
            ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
            int iK = gm0.K(24.0f * yl5.d().getDisplayMetrics().density);
            marginLayoutParams.setMargins(iK, iK, iK, iK);
            wx2Var.setLayoutParams(marginLayoutParams);
            return xx2Var;
        }
        if (i == R.id.messages_list_fake_boss_view_type) {
            ek6 ek6Var = new ek6(viewGroup.getContext());
            fk6 fk6Var = new fk6(ek6Var);
            ViewGroup.MarginLayoutParams marginLayoutParams2 = new ViewGroup.MarginLayoutParams(-1, -2);
            marginLayoutParams2.setMargins(gm0.K(yl5.d().getDisplayMetrics().density * 30.0f), gm0.K(yl5.d().getDisplayMetrics().density * 24.0f), gm0.K(30.0f * yl5.d().getDisplayMetrics().density), gm0.K(24.0f * yl5.d().getDisplayMetrics().density));
            ek6Var.setLayoutParams(marginLayoutParams2);
            return fk6Var;
        }
        if (i == R.id.messages_list_organization_placeholder_view_type) {
            return new hic(viewGroup.getContext());
        }
        int i2 = (-2013265921) & i;
        int i3 = (-2130706433) & i;
        ny8 ny8Var = this.s;
        if (i3 == -2147483635) {
            Context context = viewGroup.getContext();
            return new ma0(context, ny8Var, new ap4(context), 4);
        }
        if (i3 == -2147483647) {
            Context context2 = viewGroup.getContext();
            return new ma0(context2, ny8Var, new cr1(context2), 2);
        }
        if (i2 == 0) {
            sw6 sw6Var = new sw6(viewGroup.getContext());
            pq4 pq4Var = new pq4(sw6Var);
            sw6Var.setMaxWidth(gm0.K(276.0f * yl5.d().getDisplayMetrics().density));
            sw6Var.setMinHeight(gm0.K(20.0f * yl5.d().getDisplayMetrics().density));
            ViewGroup.MarginLayoutParams marginLayoutParams3 = new ViewGroup.MarginLayoutParams(-2, -2);
            marginLayoutParams3.setMarginStart(gm0.K(yl5.d().getDisplayMetrics().density * 24.0f));
            marginLayoutParams3.setMarginEnd(gm0.K(24.0f * yl5.d().getDisplayMetrics().density));
            sw6Var.setGravity(17);
            sw6Var.setLayoutParams(marginLayoutParams3);
            q9i.a(q9i.t.h(), sw6Var);
            sw6Var.setTextAlignment(4);
            sw6Var.setGravity(17);
            sw6Var.setMovementMethod(LinkMovementMethod.getInstance());
            sw6Var.setPaddingRelative(gm0.K(yl5.d().getDisplayMetrics().density * 6.0f), gm0.K(yl5.d().getDisplayMetrics().density * 1.0f), gm0.K(6.0f * yl5.d().getDisplayMetrics().density), gm0.K(1.0f * yl5.d().getDisplayMetrics().density));
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            float f = yl5.d().getDisplayMetrics().density * 10.0f;
            float[] fArr = new float[8];
            for (int i4 = 0; i4 < 8; i4++) {
                fArr[i4] = f;
            }
            gradientDrawable.setCornerRadii(fArr);
            sw6Var.setBackground(gradientDrawable);
            return pq4Var;
        }
        if (vka.e(i2)) {
            return new yvj(viewGroup.getContext());
        }
        fz7 fz7Var = this.g;
        if (i3 == -2147483638) {
            Context context3 = viewGroup.getContext();
            return new ma0(context3, ny8Var, new jl4(context3, fz7Var), 3);
        }
        if (i3 == -2147483640) {
            Context context4 = viewGroup.getContext();
            return new ma0(context4, ny8Var, new bk7(context4), 6);
        }
        if (i3 == -2147483636) {
            Context context5 = viewGroup.getContext();
            return new vfb(ny8Var, context5, new ufb(context5));
        }
        ny8 ny8Var2 = this.r;
        if (i3 == -2147483637) {
            Context context6 = viewGroup.getContext();
            return new ma0(context6, ny8Var, new zyf(context6, ny8Var2, fz7Var), 7);
        }
        if (i3 == -2147483639) {
            Context context7 = viewGroup.getContext();
            return new ma0(context7, ny8Var, new wr6(context7), 5);
        }
        boolean zC = vka.c(i2);
        e5d e5dVar = this.t;
        if (!zC && vka.b(i2) && !vka.a(i2)) {
            return new ew3(viewGroup.getContext(), ny8Var, e5dVar, fz7Var, 2);
        }
        if (vka.c(i2) && vka.b(i2) && !vka.a(i2)) {
            return new ew3(viewGroup.getContext(), ny8Var, e5dVar, fz7Var, 3);
        }
        if (!vka.c(i2) && vka.a(i2)) {
            return new ew3(viewGroup.getContext(), ny8Var, ny8Var2, fz7Var, 0);
        }
        if (vka.c(i2) && vka.a(i2)) {
            return new ew3(viewGroup.getContext(), ny8Var, ny8Var2, fz7Var, 1);
        }
        if (!vka.c(i2) && vka.d(i2) && !vka.a(i2)) {
            Context context8 = viewGroup.getContext();
            return new ma0(context8, ny8Var, new gag(context8), 13);
        }
        if (vka.c(i2) && vka.d(i2) && !vka.a(i2)) {
            Context context9 = viewGroup.getContext();
            return new ma0(context9, ny8Var, new hag(context9), 10);
        }
        if (vka.c(i2)) {
            Context context10 = viewGroup.getContext();
            return new ma0(context10, ny8Var, new gnh(context10), 9);
        }
        if (i3 == -2147483645) {
            Context context11 = viewGroup.getContext();
            return new ma0(context11, ny8Var, new dw0(context11), 1);
        }
        if (i3 == -2147483641) {
            return new ma0(viewGroup.getContext(), ny8Var, new rlg(viewGroup.getContext(), new hj9(viewGroup.getContext(), 1)), 8);
        }
        if (i3 == -2147483644) {
            return new ma0(viewGroup.getContext(), ny8Var, new rlg(viewGroup.getContext(), new hj9(viewGroup.getContext(), 0)), 8);
        }
        if (i3 == -2147483643) {
            return new ma0(viewGroup.getContext(), ny8Var, new rlg(viewGroup.getContext(), new hj9(viewGroup.getContext(), 2)), 8);
        }
        if (i2 >= 0 && (i & 8) != 0) {
            Context context12 = viewGroup.getContext();
            return new ma0(context12, ny8Var, new ha0(context12, fz7Var, this.m), 0);
        }
        if (i3 == -2147483642) {
            Context context13 = viewGroup.getContext();
            return new ma0(context13, ny8Var, new izi(context13, fz7Var), 12);
        }
        if (i3 != -2147483633) {
            return i3 == -2147483634 ? new ma0(viewGroup.getContext(), ny8Var, fz7Var) : new ma0(viewGroup.getContext(), ny8Var, fz7Var);
        }
        Context context14 = viewGroup.getContext();
        return new w8d(ny8Var, context14, new q8d(context14, fz7Var));
    }
}
