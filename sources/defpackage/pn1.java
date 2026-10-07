package defpackage;

import one.me.calls.ui.ui.indicator.CallIndicatorWidget;

/* JADX INFO: loaded from: classes2.dex */
public final class pn1 extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ CallIndicatorWidget g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pn1(lq4 lq4Var, CallIndicatorWidget callIndicatorWidget, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = callIndicatorWidget;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        CallIndicatorWidget callIndicatorWidget = this.g;
        switch (i) {
            case 0:
                pn1 pn1Var = new pn1(lq4Var, callIndicatorWidget, 0);
                pn1Var.f = obj;
                return pn1Var;
            case 1:
                pn1 pn1Var2 = new pn1(lq4Var, callIndicatorWidget, 1);
                pn1Var2.f = obj;
                return pn1Var2;
            case 2:
                pn1 pn1Var3 = new pn1(lq4Var, callIndicatorWidget, 2);
                pn1Var3.f = obj;
                return pn1Var3;
            default:
                pn1 pn1Var4 = new pn1(lq4Var, callIndicatorWidget, 3);
                pn1Var4.f = obj;
                return pn1Var4;
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        lq4 lq4Var = (lq4) obj2;
        switch (i) {
            case 0:
                ((pn1) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            case 1:
                ((pn1) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            case 2:
                ((pn1) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
            default:
                ((pn1) create(obj, lq4Var)).invokeSuspend(sbiVar);
                break;
        }
        return sbiVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        CallIndicatorWidget callIndicatorWidget = this.g;
        Object obj2 = this.f;
        switch (i) {
            case 0:
                ch3.d0(obj);
                rbb rbbVar = (rbb) obj2;
                if (rbbVar instanceof zm1) {
                    ym1 ym1Var = callIndicatorWidget.c;
                    String str = ((zm1) rbbVar).b;
                    if (!m92.a(ym1Var.k().w1())) {
                        kk9.m(kk9.b, str, false, null, ((f62) ((n42) ym1Var.a).f.a.getValue()).h, 6);
                    }
                } else if (rbbVar instanceof an1) {
                    ym1 ym1Var2 = callIndicatorWidget.c;
                    an1 an1Var = (an1) rbbVar;
                    be1 be1Var = an1Var.b;
                    boolean z = an1Var.c;
                    String str2 = an1Var.d;
                    if (!m92.b(ym1Var2.k().w1())) {
                        kk9 kk9Var = kk9.b;
                        Long l = be1Var.a;
                        long jLongValue = l != null ? l.longValue() : 0L;
                        CharSequence charSequence = be1Var.c;
                        String string = charSequence != null ? charSequence.toString() : null;
                        if (string == null) {
                            string = "";
                        }
                        String str3 = string;
                        String str4 = be1Var.e;
                        kk9Var.n(jLongValue, str3, str4 != null ? p2m.b(str4) : null, z, str2, true, null);
                    }
                }
                break;
            case 1:
                ch3.d0(obj);
                cn1 cn1Var = (cn1) obj2;
                if (!cqk.d(cn1Var, cn1.e)) {
                    zv8[] zv8VarArr = CallIndicatorWidget.g;
                    hn1 hn1VarP1 = callIndicatorWidget.p1();
                    hn1VarP1.setTitle(cn1Var.a);
                    hn1VarP1.setIndicatorState(cn1Var.b);
                    hn1VarP1.setTalking(cn1Var.d);
                    hn1VarP1.setActionsVisibility(cn1Var.c);
                }
                break;
            case 2:
                ch3.d0(obj);
                zv8[] zv8VarArr2 = CallIndicatorWidget.g;
                callIndicatorWidget.p1().setTime((String) obj2);
                break;
            default:
                ch3.d0(obj);
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                zv8[] zv8VarArr3 = CallIndicatorWidget.g;
                callIndicatorWidget.p1().setMicrophoneEnabled(zBooleanValue);
                break;
        }
        return sbiVar;
    }
}
