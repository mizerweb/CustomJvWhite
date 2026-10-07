package defpackage;

import java.util.Iterator;
import java.util.List;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class r40 extends mdh implements qf7 {
    public final /* synthetic */ int e = 1;
    public final /* synthetic */ boolean f;
    public /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r40(t40 t40Var, sfa sfaVar, Long l, boolean z, lq4 lq4Var) {
        super(2, lq4Var);
        this.g = t40Var;
        this.h = sfaVar;
        this.i = l;
        this.f = z;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        Object obj2 = this.i;
        Object obj3 = this.h;
        switch (i) {
            case 0:
                return new r40((t40) this.g, (sfa) obj3, (Long) obj2, this.f, lq4Var);
            default:
                r40 r40Var = new r40((String) obj3, this.f, (pg3) obj2, lq4Var);
                r40Var.g = obj;
                return r40Var;
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                return ((r40) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            default:
                ((r40) create((tw2) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
        }
    }

    /* JADX WARN: Code duplicated, block: B:106:0x0189  */
    /* JADX WARN: Code duplicated, block: B:161:0x025d  */
    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        e70 e70VarH;
        String strA;
        String strD;
        o60 o60Var;
        o40 o40Var;
        Object next;
        switch (this.e) {
            case 0:
                ch3.d0(obj);
                t40 t40Var = (t40) this.g;
                sfa sfaVar = (sfa) this.h;
                Long l = (Long) this.i;
                boolean z = this.f;
                t40Var.getClass();
                ny8 ny8Var = t40Var.g;
                Integer numValueOf = Integer.valueOf(R.drawable.icon_image_add);
                us0 us0Var = us0.e;
                c46 c46Var = (sfaVar.E() ? sfaVar.q : sfaVar).n;
                if (c46Var == null || c46Var.i() <= 0) {
                    c46Var = null;
                }
                if (c46Var == null) {
                    if (!z || (sfaVar instanceof ky3)) {
                        numValueOf = null;
                    }
                    o40Var = new o40(null, null, numValueOf);
                } else {
                    if (l != null) {
                        Iterator it = ((List) c46Var.a).iterator();
                        while (true) {
                            if (it.hasNext()) {
                                next = it.next();
                                e70 e70Var = (e70) next;
                                y60 y60Var = e70Var.a;
                                int i = y60Var == null ? -1 : p40.$EnumSwitchMapping$0[y60Var.ordinal()];
                                if (i == 1) {
                                    o60 o60Var2 = e70Var.b;
                                    if (o60Var2 == null || o60Var2.i != l.longValue()) {
                                    }
                                } else if (i == 2) {
                                    d70 d70Var = e70Var.d;
                                    if (d70Var == null || d70Var.a != l.longValue()) {
                                    }
                                } else if (i == 3) {
                                    t60 t60Var = e70Var.g;
                                    if (t60Var == null || t60Var.a != l.longValue()) {
                                    }
                                } else if (i == 4) {
                                    j60 j60Var = e70Var.j;
                                    if (j60Var == null || j60Var.a != l.longValue()) {
                                    }
                                } else {
                                    if (i != 5) {
                                        ore.j(l, " not found", "Attach with given id = ");
                                        return null;
                                    }
                                    b60 b60Var = e70Var.e;
                                    if (b60Var == null || b60Var.a != l.longValue()) {
                                    }
                                }
                            } else {
                                next = null;
                            }
                        }
                        if (next == null) {
                            ore.p("Required value was null.");
                            return null;
                        }
                        e70VarH = (e70) next;
                    } else {
                        e70VarH = c46Var.h(0);
                        if (e70VarH == null) {
                            ore.p("Required value was null.");
                            return null;
                        }
                    }
                    o5d o5dVar = e70VarH.o;
                    ntg ntgVar = e70VarH.p;
                    j60 j60Var2 = e70VarH.j;
                    t60 t60Var2 = e70VarH.g;
                    if (e70VarH.e()) {
                        o60 o60Var3 = e70VarH.b;
                        if (!o60Var3.e || (strA = o60Var3.k) == null) {
                            strA = o60Var3.b(us0Var);
                        }
                    } else if (e70VarH.h()) {
                        strA = e70VarH.d.e;
                    } else {
                        w60 w60Var = e70VarH.f;
                        if (w60Var != null) {
                            strA = w60Var.f();
                        } else if (e70VarH.g()) {
                            if (!t60Var2.i() || (o60Var = t60Var2.f) == null) {
                                strA = null;
                            } else {
                                strA = o60Var.b(us0Var);
                            }
                        } else if (e70VarH.c()) {
                            e70 e70Var2 = j60Var2.d;
                            if (e70Var2 != null) {
                                y60 y60Var2 = e70Var2.a;
                                int i2 = y60Var2 != null ? p40.$EnumSwitchMapping$0[y60Var2.ordinal()] : -1;
                                if (i2 == 1) {
                                    o60 o60Var4 = e70Var2.b;
                                    boolean z2 = o60Var4.e;
                                    String str = o60Var4.a;
                                    strD = o60Var4.b;
                                    if (!z2) {
                                        if (strD == null || strD.length() == 0) {
                                            if (str != null && str.length() != 0) {
                                                strD = vs0.d(str, us0.b, rs0.a);
                                            }
                                        }
                                        strA = strD;
                                    }
                                    strA = null;
                                } else if (i2 != 2) {
                                    strA = null;
                                } else {
                                    strD = e70Var2.d.e;
                                    strA = strD;
                                }
                            } else {
                                strA = null;
                            }
                        } else if (e70VarH.b()) {
                            f60 f60Var = e70VarH.k;
                            strA = ((ih4) ny8Var.getValue()).a(((ih4) ny8Var.getValue()).b(f60Var), f60Var);
                        } else if (ntgVar == null || ((ntgVar != null && (((s7f) ((et3) t40Var.c.getValue())).f() > ntgVar.d || ntgVar.c == null)) || ntgVar == null)) {
                            strA = null;
                        } else {
                            strA = ntgVar.c;
                        }
                    }
                    if (e70VarH.m != null) {
                        numValueOf = Integer.valueOf(R.drawable.icon_geolocation_fill);
                    } else if (e70VarH.c()) {
                        numValueOf = Integer.valueOf(R.drawable.icon_file);
                    } else if (e70VarH.a()) {
                        numValueOf = Integer.valueOf(R.drawable.icon_microphone);
                    } else if (o5dVar != null) {
                        if (((e5d) t40Var.j.getValue()).v(o5dVar != null ? Integer.valueOf(o5dVar.f) : null)) {
                            numValueOf = Integer.valueOf(R.drawable.icon_poll_fill);
                        } else {
                            numValueOf = null;
                        }
                    } else if (ntgVar != null) {
                        numValueOf = Integer.valueOf(R.drawable.icon_clock_expired);
                    } else if (!z) {
                        numValueOf = null;
                    }
                    o40Var = new o40(e70VarH.c() ? j60Var2.c : null, strA, numValueOf);
                }
                return o40Var;
            default:
                tw2 tw2Var = (tw2) this.g;
                ch3.d0(obj);
                if (tw2Var.L == null) {
                    tw2Var.L = zw2.q;
                }
                yw2 yw2VarA = tw2Var.L.a();
                if (cqk.d((String) this.h, "DISABLE_FORWARD")) {
                    yw2VarA.p = this.f;
                } else {
                    String str2 = ((pg3) this.i).a;
                    String str3 = (String) this.h;
                    a4c a4cVar = gm0.f;
                    if (a4cVar != null) {
                        je9 je9Var = je9.e;
                        if (a4cVar.b(je9Var)) {
                            a4cVar.c(je9Var, str2, c0a.o("Don't support this option: ", str3, " for local update"), null);
                        }
                    }
                }
                return sbi.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r40(String str, boolean z, pg3 pg3Var, lq4 lq4Var) {
        super(2, lq4Var);
        this.h = str;
        this.f = z;
        this.i = pg3Var;
    }
}
