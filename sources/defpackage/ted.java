package defpackage;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes.dex */
public final class ted implements yx6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ yx6 b;
    public final /* synthetic */ wed c;

    public /* synthetic */ ted(yx6 yx6Var, wed wedVar, int i) {
        this.a = i;
        this.b = yx6Var;
        this.c = wedVar;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x006e  */
    /* JADX WARN: Code duplicated, block: B:50:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:9:0x001c  */
    @Override // defpackage.yx6
    public final Object emit(Object obj, lq4 lq4Var) {
        sed sedVar;
        ued uedVar;
        ved vedVar;
        switch (this.a) {
            case 0:
                if (lq4Var instanceof sed) {
                    sedVar = (sed) lq4Var;
                    int i = sedVar.e;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        sedVar.e = i - Integer.MIN_VALUE;
                    } else {
                        sedVar = new sed(this, lq4Var);
                    }
                } else {
                    sedVar = new sed(this, lq4Var);
                }
                Object obj2 = sedVar.d;
                hu4 hu4Var = hu4.a;
                int i2 = sedVar.e;
                if (i2 == 0) {
                    ch3.d0(obj2);
                    yx6 yx6Var = this.b;
                    if (!this.c.e.contains(((ned) obj).a)) {
                        sedVar.e = 1;
                        if (yx6Var.emit(obj, sedVar) == hu4Var) {
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
            case 1:
                if (lq4Var instanceof ued) {
                    uedVar = (ued) lq4Var;
                    int i3 = uedVar.e;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        uedVar.e = i3 - Integer.MIN_VALUE;
                    } else {
                        uedVar = new ued(this, lq4Var);
                    }
                } else {
                    uedVar = new ued(this, lq4Var);
                }
                Object obj3 = uedVar.d;
                hu4 hu4Var2 = hu4.a;
                int i4 = uedVar.e;
                if (i4 == 0) {
                    ch3.d0(obj3);
                    yx6 yx6Var2 = this.b;
                    long jG = this.c.g() - this.c.c.get();
                    if (jG < 0) {
                        String str = this.c.g;
                        a4c a4cVar = gm0.f;
                        if (a4cVar != null) {
                            je9 je9Var = je9.e;
                            if (a4cVar.b(je9Var)) {
                                ghb ghbVar = ew5.b;
                                a4cVar.c(je9Var, str, "ignore requests for ".concat(ew5.t(qe7.P(jG, lw5.MILLISECONDS))), null);
                            }
                        }
                    }
                    if (jG >= 0) {
                        uedVar.e = 1;
                        if (yx6Var2.emit(obj, uedVar) == hu4Var2) {
                            return hu4Var2;
                        }
                    }
                } else {
                    if (i4 != 1) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ch3.d0(obj3);
                }
                return sbi.a;
            default:
                if (lq4Var instanceof ved) {
                    vedVar = (ved) lq4Var;
                    int i5 = vedVar.e;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        vedVar.e = i5 - Integer.MIN_VALUE;
                    } else {
                        vedVar = new ved(this, lq4Var);
                    }
                } else {
                    vedVar = new ved(this, lq4Var);
                }
                Object obj4 = vedVar.d;
                hu4 hu4Var3 = hu4.a;
                int i6 = vedVar.e;
                if (i6 == 0) {
                    ch3.d0(obj4);
                    yx6 yx6Var3 = this.b;
                    ned nedVar = (ned) obj;
                    LinkedHashMap linkedHashMap = new LinkedHashMap(1);
                    Object obj5 = nedVar.a;
                    LinkedHashSet linkedHashSet = new LinkedHashSet(nedVar.b);
                    this.c.f(linkedHashSet);
                    linkedHashMap.put(obj5, linkedHashSet);
                    vedVar.e = 1;
                    if (yx6Var3.emit(linkedHashMap, vedVar) == hu4Var3) {
                        return hu4Var3;
                    }
                } else {
                    if (i6 != 1) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ch3.d0(obj4);
                }
                return sbi.a;
        }
    }
}
