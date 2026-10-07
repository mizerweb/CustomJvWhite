package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class r11 extends mdh implements vf7 {
    public /* synthetic */ hwg e;
    public /* synthetic */ Integer f;
    public /* synthetic */ boolean g;
    public final /* synthetic */ w11 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r11(w11 w11Var, lq4 lq4Var) {
        super(4, lq4Var);
        this.h = w11Var;
    }

    @Override // defpackage.vf7
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        r11 r11Var = new r11(this.h, (lq4) obj4);
        r11Var.e = (hwg) obj;
        r11Var.f = (Integer) obj2;
        r11Var.g = zBooleanValue;
        sbi sbiVar = sbi.a;
        r11Var.invokeSuspend(sbiVar);
        return sbiVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        String str;
        Object a21Var;
        hwg hwgVar = this.e;
        Integer num = this.f;
        boolean z = this.g;
        ch3.d0(obj);
        mjg mjgVar = this.h.l;
        if (z) {
            a21Var = b21.a;
        } else {
            Integer num2 = hwgVar.a;
            Integer num3 = hwgVar.b;
            if (num != null) {
                long jIntValue = ((long) num.intValue()) * 60000;
                ghb ghbVar = ew5.b;
                long jP = qe7.P(jIntValue, lw5.MILLISECONDS);
                str = String.format(ew5.s(jP, lw5.HOURS) + ":%02d", Arrays.copyOf(new Object[]{Long.valueOf(ew5.s(jP, lw5.MINUTES) % 60)}, 1));
            } else {
                str = null;
            }
            a21Var = new a21(num2, num3, str);
        }
        mjgVar.getClass();
        mjgVar.j(null, a21Var);
        return sbi.a;
    }
}
