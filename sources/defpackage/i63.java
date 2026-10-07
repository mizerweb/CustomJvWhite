package defpackage;

import java.util.List;
import one.me.messages.list.loader.MessageModel;

/* JADX INFO: loaded from: classes2.dex */
public final class i63 implements yx6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ yx6 b;
    public final /* synthetic */ l63 c;

    public /* synthetic */ i63(yx6 yx6Var, l63 l63Var, int i) {
        this.a = i;
        this.b = yx6Var;
        this.c = l63Var;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:9:0x001c  */
    @Override // defpackage.yx6
    public final Object emit(Object obj, lq4 lq4Var) {
        h63 h63Var;
        j63 j63Var;
        switch (this.a) {
            case 0:
                if (lq4Var instanceof h63) {
                    h63Var = (h63) lq4Var;
                    int i = h63Var.e;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        h63Var.e = i - Integer.MIN_VALUE;
                    } else {
                        h63Var = new h63(this, lq4Var);
                    }
                } else {
                    h63Var = new h63(this, lq4Var);
                }
                Object obj2 = h63Var.d;
                hu4 hu4Var = hu4.a;
                int i2 = h63Var.e;
                if (i2 == 0) {
                    ch3.d0(obj2);
                    yx6 yx6Var = this.b;
                    if (l63.F(this.c, (wz9) obj)) {
                        h63Var.e = 1;
                        if (yx6Var.emit(obj, h63Var) == hu4Var) {
                            return hu4Var;
                        }
                    }
                } else {
                    if (i2 != 1) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ch3.d0(obj2);
                }
                return sbi.a;
            default:
                if (lq4Var instanceof j63) {
                    j63Var = (j63) lq4Var;
                    int i3 = j63Var.e;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        j63Var.e = i3 - Integer.MIN_VALUE;
                    } else {
                        j63Var = new j63(this, lq4Var);
                    }
                } else {
                    j63Var = new j63(this, lq4Var);
                }
                Object obj3 = j63Var.d;
                hu4 hu4Var2 = hu4.a;
                int i4 = j63Var.e;
                if (i4 == 0) {
                    ch3.d0(obj3);
                    yx6 yx6Var2 = this.b;
                    opa opaVar = (opa) obj;
                    List listJ1 = this.c.g ? ww3.J1(opaVar.a) : opaVar.a;
                    l53 l53Var = (l53) this.c.I.updateAndGet(new k63(opaVar));
                    String str = this.c.p;
                    a4c a4cVar = gm0.f;
                    if (a4cVar != null) {
                        je9 je9Var = je9.d;
                        if (a4cVar.b(je9Var)) {
                            a4cVar.c(je9Var, str, "Media viewer. Map result from loader, loadingState:" + l53Var, null);
                        }
                    }
                    c79 c79VarW = yab.w();
                    int size = listJ1.size();
                    int i5 = 0;
                    for (int i6 = 0; i6 < size; i6++) {
                        List listC = npk.c((MessageModel) listJ1.get(i6));
                        if (listC.isEmpty()) {
                            i5++;
                        } else {
                            c79VarW.addAll(listC);
                        }
                    }
                    ylc ylcVar = new ylc(yab.j(c79VarW), Integer.valueOf(i5));
                    j63Var.e = 1;
                    if (yx6Var2.emit(ylcVar, j63Var) == hu4Var2) {
                        return hu4Var2;
                    }
                } else {
                    if (i4 != 1) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ch3.d0(obj3);
                }
                return sbi.a;
        }
    }
}
