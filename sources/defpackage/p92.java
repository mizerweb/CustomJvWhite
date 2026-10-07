package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class p92 extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public int f;
    public final /* synthetic */ be1 g;
    public final /* synthetic */ u92 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p92(be1 be1Var, u92 u92Var, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = be1Var;
        this.h = u92Var;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        u92 u92Var = this.h;
        be1 be1Var = this.g;
        switch (i) {
            case 0:
                return new p92(be1Var, u92Var, lq4Var, 0);
            default:
                return new p92(be1Var, u92Var, lq4Var, 1);
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
        return ((p92) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v4, types: [flb] */
    /* JADX WARN: Type inference failed for: r7v0, types: [lq4] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        int i2 = 0;
        u92 u92Var = this.h;
        be1 be1Var = this.g;
        hu4 hu4Var = hu4.a;
        ?? string = 0;
        string = 0;
        switch (i) {
            case 0:
                int i3 = this.f;
                if (i3 != 0) {
                    if (i3 == 1) {
                        ch3.d0(obj);
                        return obj;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj);
                CharSequence charSequence = be1Var.g;
                if (charSequence != null && charSequence.length() != 0) {
                    string = charSequence;
                }
                if (string == 0) {
                    CharSequence charSequence2 = be1Var.d;
                    StringBuilder sb = new StringBuilder(2);
                    if (charSequence2 != null) {
                        while (i2 < charSequence2.length()) {
                            char cCharAt = charSequence2.charAt(i2);
                            if (Character.isLetter(cCharAt)) {
                                sb.append(Character.toUpperCase(cCharAt));
                                if (sb.length() != 2) {
                                }
                            }
                            i2++;
                        }
                    }
                    string = sb.toString();
                }
                ?? r11 = (flb) u92Var.e.getValue();
                String str = be1Var.e;
                Long l = be1Var.f;
                this.f = 1;
                Object objD = r11.d(str, string, l, this);
                return objD == hu4Var ? hu4Var : objD;
            default:
                int i4 = this.f;
                if (i4 != 0) {
                    if (i4 == 1) {
                        ch3.d0(obj);
                        return obj;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj);
                ghb ghbVar = ew5.b;
                long jP = qe7.P(200L, lw5.MILLISECONDS);
                p92 p92Var = new p92(be1Var, u92Var, string, i2);
                this.f = 1;
                Object objM0 = lvb.M0(jP, p92Var, this);
                return objM0 == hu4Var ? hu4Var : objM0;
        }
    }
}
