package defpackage;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class b8k extends n86 {
    public final /* synthetic */ int b;
    public final Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b8k(h8k h8kVar) {
        super(h8kVar);
        this.b = 3;
        int[] iArr = {32, 32, 1024};
        this.c = new bi9[y4k.values().length];
        for (y4k y4kVar : y4k.values()) {
            ((bi9[]) this.c)[y4kVar.ordinal()] = new bi9(iArr[y4kVar.ordinal()], 1);
        }
    }

    @Override // defpackage.obk
    public final void c(pbk pbkVar, c4h c4hVar) {
        switch (this.b) {
            case 0:
                z7k z7kVar = (z7k) this.c;
                byte[] bArrV = pbkVar.v();
                if (!z7kVar.G.d.b().stream().anyMatch(new q4k(1, bArrV))) {
                    nl9.a(bArrV);
                    Objects.toString(pbkVar);
                } else {
                    l(pbkVar, c4hVar);
                }
                break;
            case 1:
                if (!ewi.a(((z7k) this.c).p)) {
                    l(pbkVar, c4hVar);
                } else if (((z7k) this.c).p != 4) {
                    Objects.toString(pbkVar);
                } else {
                    z7k z7kVar2 = (z7k) this.c;
                    if (!pbkVar.c.stream().filter(new e05(21)).findAny().isPresent()) {
                        jbk jbkVar = z7kVar2.q;
                        int i = jbkVar.b + 1;
                        jbkVar.b = i;
                        if (i == jbkVar.a) {
                            z7kVar2.B.d(z7kVar2.r, pbkVar.n(), hak.y);
                            jbkVar.a <<= 1;
                        }
                    } else {
                        z7kVar2.p = 5;
                    }
                }
                break;
            case 2:
                l(pbkVar, c4hVar);
                ((z7k) this.c).B.h();
                break;
            default:
                if (pbkVar.o() != null) {
                    bi9 bi9Var = ((bi9[]) this.c)[pbkVar.o().ordinal()];
                    Long lP = pbkVar.p();
                    int iLongValue = (int) (lP.longValue() % ((long) bi9Var.a));
                    long jLongValue = lP.longValue();
                    long[] jArr = bi9Var.b;
                    if (jLongValue <= jArr[iLongValue]) {
                        Objects.toString(pbkVar);
                    } else {
                        jArr[iLongValue] = lP.longValue();
                    }
                }
                l(pbkVar, c4hVar);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b8k(z7k z7kVar, n86 n86Var, int i) {
        super(n86Var);
        this.b = i;
        this.c = z7kVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b8k(z7k z7kVar, z7k z7kVar2, ku8 ku8Var) {
        super(z7kVar2, ku8Var);
        this.b = 1;
        this.c = z7kVar;
    }
}
