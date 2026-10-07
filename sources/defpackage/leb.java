package defpackage;

import android.content.ActivityNotFoundException;
import java.util.List;
import one.me.login.neuroavatars.NeuroAvatarsScreen;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class leb extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ NeuroAvatarsScreen g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public leb(NeuroAvatarsScreen neuroAvatarsScreen, lq4 lq4Var) {
        super(2, lq4Var);
        this.e = 0;
        this.g = neuroAvatarsScreen;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        NeuroAvatarsScreen neuroAvatarsScreen = this.g;
        switch (i) {
            case 0:
                leb lebVar = new leb(neuroAvatarsScreen, lq4Var);
                lebVar.f = obj;
                return lebVar;
            case 1:
                leb lebVar2 = new leb(lq4Var, neuroAvatarsScreen, 1);
                lebVar2.f = obj;
                return lebVar2;
            case 2:
                leb lebVar3 = new leb(lq4Var, neuroAvatarsScreen, 2);
                lebVar3.f = obj;
                return lebVar3;
            case 3:
                leb lebVar4 = new leb(lq4Var, neuroAvatarsScreen, 3);
                lebVar4.f = obj;
                return lebVar4;
            case 4:
                leb lebVar5 = new leb(lq4Var, neuroAvatarsScreen, 4);
                lebVar5.f = obj;
                return lebVar5;
            default:
                leb lebVar6 = new leb(lq4Var, neuroAvatarsScreen, 5);
                lebVar6.f = obj;
                return lebVar6;
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                ((leb) create((List) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
            case 1:
                ((leb) create(obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
            case 2:
                ((leb) create(obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
            case 3:
                ((leb) create(obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
            case 4:
                ((leb) create(obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
            default:
                ((leb) create(obj, (lq4) obj2)).invokeSuspend(sbiVar);
                break;
        }
        return sbiVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        Object obj2 = null;
        byte b = 0;
        byte b2 = 0;
        switch (this.e) {
            case 0:
                List list = (List) this.f;
                ch3.d0(obj);
                this.g.x.H(list);
                return sbi.a;
            case 1:
                Object obj3 = this.f;
                ch3.d0(obj);
                List list2 = (List) obj3;
                NeuroAvatarsScreen neuroAvatarsScreen = this.g;
                ((seb) neuroAvatarsScreen.m.m(neuroAvatarsScreen, NeuroAvatarsScreen.B[7])).setVisibility(list2.isEmpty() ? 0 : 8);
                neuroAvatarsScreen.r1().setVisibility(list2.isEmpty() ? 8 : 0);
                yr8 yr8Var = neuroAvatarsScreen.z;
                aac aacVarR1 = neuroAvatarsScreen.r1();
                yr8Var.getClass();
                yr8.l(aacVarR1, list2);
                return sbi.a;
            case 2:
                Object obj4 = this.f;
                ch3.d0(obj);
                hk0 hk0Var = (hk0) obj4;
                if (!cqk.d(hk0Var, ek0.a)) {
                    if (hk0Var instanceof fk0) {
                        try {
                            this.g.startActivityForResult(((fk0) hk0Var).a, 555);
                            tbb.g((tbb) this.g.p.getValue(), y3f.AVATAR_PICKER_CAMERA);
                        } catch (ActivityNotFoundException unused) {
                            String name = NeuroAvatarsScreen.class.getName();
                            a4c a4cVar = gm0.f;
                            if (a4cVar != null) {
                                a4c.f(a4cVar, je9.g, name, "failed open camera", null, null, 8);
                            }
                            qdb qdbVar = this.g.s1().c;
                            qdbVar.n = null;
                            h8c h8cVar = (h8c) qdbVar.e.getValue();
                            h8cVar.m(new tnh(R.string.cant_open_camera));
                            h8cVar.h(new w8c(R.drawable.icon_warning));
                            h8cVar.p();
                        }
                    } else {
                        if (!(hk0Var instanceof gk0)) {
                            ore.o();
                            return null;
                        }
                        gk0 gk0Var = (gk0) hk0Var;
                        c1a.b.j(gk0Var.a, gk0Var.b, false);
                    }
                    break;
                } else {
                    NeuroAvatarsScreen neuroAvatarsScreen2 = this.g;
                    zv8[] zv8VarArr = NeuroAvatarsScreen.B;
                    ((wsc) neuroAvatarsScreen2.o.getValue()).n(new svj(this.g, 1));
                }
                return sbi.a;
            case 3:
                NeuroAvatarsScreen neuroAvatarsScreen3 = this.g;
                Object obj5 = this.f;
                ch3.d0(obj);
                if (obj5 instanceof yf9) {
                    kzi kziVar = new kzi(((yf9) obj5).c, obj2, b2 == true ? 1 : 0);
                    neuroAvatarsScreen3.a.getClass();
                    ku6.C(neuroAvatarsScreen3, kziVar);
                } else if (obj5 instanceof zf9) {
                    zf9 zf9Var = (zf9) obj5;
                    int i = zf9Var.e;
                    zv8[] zv8VarArr2 = NeuroAvatarsScreen.B;
                    if (neuroAvatarsScreen3.q1() != null) {
                        ((pd0) neuroAvatarsScreen3.e.getValue()).a(new nd0(i));
                    }
                    kzi kziVar2 = new kzi(zf9Var.c, zf9Var.d, b == true ? 1 : 0);
                    neuroAvatarsScreen3.a.getClass();
                    ku6.C(neuroAvatarsScreen3, kziVar2);
                }
                zv8[] zv8VarArr3 = NeuroAvatarsScreen.B;
                cyb cybVar = (cyb) neuroAvatarsScreen3.l.m(neuroAvatarsScreen3, NeuroAvatarsScreen.B[6]);
                cybVar.setLoading(false);
                cybVar.setClickable(true);
                return sbi.a;
            case 4:
                sbi sbiVar = sbi.a;
                Object obj6 = this.f;
                ch3.d0(obj);
                rbb rbbVar = (rbb) obj6;
                if (rbbVar instanceof feb) {
                    lg9 lg9Var = lg9.b;
                    lg9Var.getClass();
                    o65.c(lg9Var.b(), ":chat-list", null, null, 6);
                } else if (rbbVar instanceof i65) {
                    lg9.b.e((i65) rbbVar);
                } else if (rbbVar instanceof rt3) {
                    this.g.getRouter().D();
                }
                return sbiVar;
            default:
                NeuroAvatarsScreen neuroAvatarsScreen4 = this.g;
                Object obj7 = this.f;
                ch3.d0(obj);
                zdb zdbVar = (zdb) obj7;
                Integer num = zdbVar.b;
                if (num != null && num.intValue() >= 0) {
                    zv8[] zv8VarArr4 = NeuroAvatarsScreen.B;
                    neuroAvatarsScreen4.p1().E0();
                    neuroAvatarsScreen4.y.c = true;
                    dn2 dn2Var = new dn2(neuroAvatarsScreen4.getContext(), 2);
                    dn2Var.a = num.intValue();
                    vee layoutManager = neuroAvatarsScreen4.p1().getLayoutManager();
                    if (layoutManager != null) {
                        layoutManager.K0(dn2Var);
                    }
                }
                int i2 = zdbVar.a;
                if (i2 >= 0) {
                    zv8[] zv8VarArr5 = NeuroAvatarsScreen.B;
                    if (neuroAvatarsScreen4.r1().getSelectedTabPosition() != i2) {
                        neuroAvatarsScreen4.r1().stopNestedScroll();
                        ugh ughVarH = neuroAvatarsScreen4.r1().h(i2);
                        if (ughVarH != null) {
                            ughVarH.a();
                        }
                    }
                }
                return sbi.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ leb(lq4 lq4Var, NeuroAvatarsScreen neuroAvatarsScreen, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = neuroAvatarsScreen;
    }
}
