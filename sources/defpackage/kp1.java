package defpackage;

import java.util.concurrent.CancellationException;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class kp1 extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public int f;
    public final /* synthetic */ op1 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kp1(op1 op1Var, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = op1Var;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        op1 op1Var = this.g;
        switch (i) {
            case 0:
                return new kp1(op1Var, lq4Var, 0);
            default:
                return new kp1(op1Var, lq4Var, 1);
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        gu4 gu4Var = (gu4) obj;
        lq4 lq4Var = (lq4) obj2;
        switch (i) {
            case 0:
                break;
        }
        return ((kp1) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        Object value;
        lp1 lp1Var;
        msc mscVar;
        tj0 tj0VarA;
        int iK;
        Object value2;
        lp1 lp1Var2;
        String str;
        a4c a4cVar;
        switch (this.e) {
            case 0:
                op1 op1Var = this.g;
                phf phfVar = op1Var.d;
                hu4 hu4Var = hu4.a;
                int i = this.f;
                if (i == 0) {
                    ch3.d0(obj);
                    this.f = 1;
                    obj = phfVar.w(this);
                    if (obj == hu4Var) {
                        return hu4Var;
                    }
                } else {
                    if (i != 1) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ch3.d0(obj);
                }
                vg4 vg4Var = (vg4) obj;
                mjg mjgVar = op1Var.n;
                do {
                    value = mjgVar.getValue();
                    lp1Var = (lp1) value;
                    ny8 ny8Var = op1Var.m;
                    mscVar = op1Var.f;
                    tj0VarA = gm0.a(vg4Var.u(), new Long(((Number) ny8Var.getValue()).longValue()));
                    iK = gm0.K(216.0f * yl5.d().getDisplayMetrics().density);
                    phfVar.getClass();
                } while (!mjgVar.h(value, lp1.a(lp1Var, new ok0(tj0VarA, vg4Var.x(iK)), !mscVar.b().c(wsc.i) ? yp9.e : yp9.a, mscVar.a(op1Var.g), false, null, null, null, 120)));
                return sbi.a;
            default:
                hu4 hu4Var2 = hu4.a;
                int i2 = this.f;
                try {
                    if (i2 == 0) {
                        ch3.d0(obj);
                        op1 op1Var2 = this.g;
                        gm0.n("CallJoinLinkPreviewTag", "start loading call link info");
                        pvb pvbVar = (pvb) op1Var2.h.getValue();
                        wy2 wy2Var = new wy2(v3e.c(op1Var2.c));
                        this.f = 1;
                        obj = pvbVar.D(wy2Var, this);
                        if (obj == hu4Var2) {
                            return hu4Var2;
                        }
                    } else {
                        if (i2 != 1) {
                            ore.k("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ch3.d0(obj);
                    }
                    break;
                } catch (CancellationException e) {
                    throw e;
                } catch (Throwable th) {
                    obj = new poe(th);
                }
                Throwable thA = roe.a(obj);
                if (thA != null && (a4cVar = gm0.f) != null) {
                    je9 je9Var = je9.f;
                    if (a4cVar.b(je9Var)) {
                        a4cVar.c(je9Var, "CallJoinLinkPreviewTag", qv1.k("fail when loading call link info due to: ", thA.getMessage()), thA);
                    }
                }
                op1 op1Var3 = this.g;
                if (!(obj instanceof poe)) {
                    n29 n29Var = (n29) obj;
                    gm0.n("CallJoinLinkPreviewTag", "call link info loaded success");
                    mjg mjgVar2 = op1Var3.n;
                    do {
                        value2 = mjgVar2.getValue();
                        lp1Var2 = (lp1) value2;
                        ir7 ir7Var = n29Var.g;
                        if (ir7Var == null || (str = ir7Var.e) == null) {
                            oui ouiVar = n29Var.h;
                            str = ouiVar != null ? ouiVar.d : null;
                        }
                    } while (!mjgVar2.h(value2, lp1.a(lp1Var2, null, null, null, false, str != null ? new xnh(str) : new tnh(R.string.call_join_by_link_ask_start_title), null, null, 111)));
                    oui ouiVar2 = n29Var.h;
                    if (ouiVar2 != null) {
                        op1Var3.p.B(op1Var3, op1.s[0], yab.h0(op1Var3.b, ((n0c) ((xhh) op1Var3.l.getValue())).b(), 2, new wd9(ouiVar2.i, ouiVar2.e, op1Var3, (lq4) null)));
                    }
                }
                return sbi.a;
        }
    }
}
