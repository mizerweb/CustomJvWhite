package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class fi3 implements af7 {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public /* synthetic */ fi3(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        char c = 1;
        int i = 0;
        switch (this.a) {
            case 0:
                ei3 ei3Var = new ei3(i, (ki3) this.c);
                h5 h5Var = (h5) this.b;
                ifh ifhVarD = h5Var.d(85);
                h5Var.d(97);
                return new pi3(ei3Var, ifhVarD, h5Var.d(54), h5Var.d(377), h5Var.d(480), h5Var.d(670), h5Var.d(485));
            case 1:
                gm0.j = true;
                x3f x3fVar = new x3f();
                x3fVar.a = 2;
                ch3.h = x3fVar;
                gm0.D(je9.e, "[Scout]", "Key decoding enabled", new Object[0]);
                np4.k = new cy5(23);
                mte mteVar = new mte(this, i);
                gdi gdiVar = new gdi("root-scope");
                mteVar.invoke(gdiVar);
                wk8.e = gdiVar.a();
                return sbi.a;
            default:
                int iIntValue = ((Number) ((e5d) ((ny8) this.b).getValue()).z().i()).intValue();
                if (iIntValue != 1) {
                    c = iIntValue == 2 ? (char) 2 : (char) 0;
                }
                String strH = c == 0 ? null : ((hgh) ((ny8) this.c).getValue()).h(false);
                ah9 ah9Var = new ah9(kfc.p);
                if (strH != null && strH.length() != 0) {
                    ah9Var.h("pushToken", strH);
                }
                return ah9Var;
        }
    }
}
