package defpackage;

import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.TimeoutCancellationException;
import ru.ok.tamtam.errors.TamErrorException;

/* JADX INFO: loaded from: classes3.dex */
public final class qp6 extends mdh implements qf7 {
    public sq6 e;
    public rp6 f;
    public String g;
    public String h;
    public long i;
    public long j;
    public long k;
    public int l;
    public int m;
    public final /* synthetic */ rp6 n;
    public final /* synthetic */ long o;
    public final /* synthetic */ long p;
    public final /* synthetic */ String q;
    public final /* synthetic */ long r;
    public final /* synthetic */ long s;
    public final /* synthetic */ long t;
    public final /* synthetic */ String u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qp6(rp6 rp6Var, long j, long j2, String str, long j3, long j4, long j5, String str2, lq4 lq4Var) {
        super(2, lq4Var);
        this.n = rp6Var;
        this.o = j;
        this.p = j2;
        this.q = str;
        this.r = j3;
        this.s = j4;
        this.t = j5;
        this.u = str2;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        return new qp6(this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, lq4Var);
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        return ((qp6) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbi.a);
    }

    /* JADX WARN: Code duplicated, block: B:44:0x0121  */
    /* JADX WARN: Code duplicated, block: B:47:0x014a  */
    /* JADX WARN: Code duplicated, block: B:50:0x0151  */
    /* JADX WARN: Code duplicated, block: B:53:0x017b  */
    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        zhg zhgVar;
        rp6 rp6Var;
        rp6 rp6Var2;
        rp6 rp6Var3;
        rp6 rp6Var4;
        Object objK0;
        sq6 sq6Var;
        rp6 rp6Var5;
        Object objI;
        sq6 sq6Var2;
        rt2 rt2Var;
        long j;
        String str;
        String str2;
        int i;
        Object objP;
        String str3;
        long j2;
        sfa sfaVar;
        long j3;
        ifi ifiVar;
        String str4;
        long j4;
        String str5;
        rp6 rp6Var6;
        sq6 sq6Var3;
        String str6;
        long j5;
        int i2 = this.m;
        zhg zhgVar2 = zhg.a;
        long j6 = this.p;
        rp6 rp6Var7 = this.n;
        hu4 hu4Var = hu4.a;
        try {
            try {
                if (i2 == 0) {
                    ch3.d0(obj);
                    gm0.n(rp6Var7.a, "File attach click. Start process download");
                    ((i50) rp6Var7.l.getValue()).a(new k5e(this.o, 0L, 0.0f, 0L, new Long(j6), new Long(0L), this.q, null));
                    ghb ghbVar = ew5.b;
                    long jO = qe7.O(10, lw5.SECONDS);
                    zhgVar = zhgVar2;
                    try {
                        rp6Var4 = rp6Var7;
                        try {
                            pp6 pp6Var = new pp6(this.n, this.p, this.s, this.t, null);
                            this.m = 1;
                            objK0 = lvb.K0(jO, pp6Var, this);
                            if (objK0 == hu4Var) {
                            }
                            return hu4Var;
                        } catch (TimeoutCancellationException unused) {
                            rp6Var3 = rp6Var4;
                            ((i50) rp6Var3.l.getValue()).a(new l5e(this.o, this.r, this.q, null));
                            gm0.n(rp6Var3.a, "File attach click. Failed by timeout");
                            return zhgVar;
                        } catch (CancellationException e) {
                            e = e;
                            rp6Var = rp6Var4;
                            ((i50) rp6Var.l.getValue()).a(new l5e(this.o, this.r, this.q, null));
                            gm0.n(rp6Var.a, "File attach click. Cancelled");
                            throw e;
                        } catch (TamErrorException e2) {
                            e = e2;
                            rp6Var2 = rp6Var4;
                            ((i50) rp6Var2.l.getValue()).a(new l5e(this.o, this.r, this.q, null));
                            gm0.V(rp6Var2.a, "File attach click. Api request FileDownloadCmd failed with exception", e);
                            return zhgVar;
                        }
                    } catch (TimeoutCancellationException unused2) {
                        rp6Var3 = rp6Var7;
                        ((i50) rp6Var3.l.getValue()).a(new l5e(this.o, this.r, this.q, null));
                        gm0.n(rp6Var3.a, "File attach click. Failed by timeout");
                        return zhgVar;
                    } catch (TamErrorException e3) {
                        e = e3;
                        rp6Var2 = rp6Var7;
                        ((i50) rp6Var2.l.getValue()).a(new l5e(this.o, this.r, this.q, null));
                        gm0.V(rp6Var2.a, "File attach click. Api request FileDownloadCmd failed with exception", e);
                        return zhgVar;
                    }
                }
                if (i2 == 1) {
                    ch3.d0(obj);
                    objK0 = obj;
                    zhgVar = zhgVar2;
                    rp6Var4 = rp6Var7;
                } else {
                    if (i2 == 2) {
                        sq6Var = this.e;
                        ch3.d0(obj);
                        objI = obj;
                        rp6Var5 = rp6Var7;
                        sq6Var2 = sq6Var;
                        rt2Var = (rt2) objI;
                        if (rt2Var != null) {
                            j = rt2Var.a;
                            sua suaVar = (sua) rp6Var5.k.getValue();
                            this.e = sq6Var2;
                            this.f = rp6Var5;
                            str = this.q;
                            this.g = str;
                            str2 = this.u;
                            this.h = str2;
                            this.i = j6;
                            this.j = j;
                            i = 0;
                            this.l = 0;
                            this.m = 3;
                            objP = suaVar.p(j, this.t, this);
                            if (objP != hu4Var) {
                                str3 = str;
                                j2 = j6;
                                sfaVar = (sfa) objP;
                                if (sfaVar != null) {
                                    j3 = sfaVar.a;
                                    ifiVar = (ifi) rp6Var5.e.getValue();
                                    this.e = sq6Var2;
                                    this.f = rp6Var5;
                                    this.g = str3;
                                    this.h = str2;
                                    this.i = j2;
                                    this.j = j;
                                    this.l = i;
                                    this.k = j3;
                                    this.m = 4;
                                    str4 = str3;
                                    if (ifiVar.a(j, j3, str4, u60.e, this) != hu4Var) {
                                        j4 = j3;
                                        str5 = str4;
                                        rp6Var6 = rp6Var5;
                                        sq6Var3 = sq6Var2;
                                        str6 = str2;
                                        j5 = j2;
                                    }
                                }
                            }
                            return hu4Var;
                        }
                        return big.a;
                    }
                    if (i2 == 3) {
                        int i3 = this.l;
                        j = this.j;
                        j6 = this.i;
                        String str7 = this.h;
                        str3 = this.g;
                        rp6 rp6Var8 = this.f;
                        sq6 sq6Var4 = this.e;
                        ch3.d0(obj);
                        i = i3;
                        str2 = str7;
                        rp6Var5 = rp6Var8;
                        sq6Var2 = sq6Var4;
                        objP = obj;
                        j2 = j6;
                        sfaVar = (sfa) objP;
                        if (sfaVar != null) {
                            j3 = sfaVar.a;
                            ifiVar = (ifi) rp6Var5.e.getValue();
                            this.e = sq6Var2;
                            this.f = rp6Var5;
                            this.g = str3;
                            this.h = str2;
                            this.i = j2;
                            this.j = j;
                            this.l = i;
                            this.k = j3;
                            this.m = 4;
                            str4 = str3;
                            if (ifiVar.a(j, j3, str4, u60.e, this) != hu4Var) {
                                j4 = j3;
                                str5 = str4;
                                rp6Var6 = rp6Var5;
                                sq6Var3 = sq6Var2;
                                str6 = str2;
                                j5 = j2;
                            }
                            return hu4Var;
                        }
                        return big.a;
                    }
                    if (i2 != 4) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    long j7 = this.k;
                    long j8 = this.i;
                    String str8 = this.h;
                    String str9 = this.g;
                    rp6Var6 = this.f;
                    sq6Var3 = this.e;
                    ch3.d0(obj);
                    j4 = j7;
                    j5 = j8;
                    str6 = str8;
                    str5 = str9;
                }
                ((wp6) rp6Var6.i.getValue()).b(new pjh(j4, str5, 0L, 0L, 0L, 0L, sq6Var3.c, true, false, j5, str6, 0, false, false, ns5.CHAT, ixl.b(sq6Var3.c, (Map) ((e5d) rp6Var6.n.getValue()).g().i())));
                return big.a;
                sq6Var = (sq6) objK0;
                rp6Var5 = rp6Var4;
                if (cqk.d(sq6Var.d, Boolean.TRUE) && ((nni) rp6Var5.h.getValue()).d.getBoolean("app.privacy.unsafe.files.default", true)) {
                    return new aig(sq6Var.c, this.r);
                }
                xn3 xn3Var = (xn3) rp6Var5.j.getValue();
                this.e = sq6Var;
                this.m = 2;
                objI = xn3Var.i(this.s, this);
                if (objI != hu4Var) {
                    sq6Var2 = sq6Var;
                    rt2Var = (rt2) objI;
                    if (rt2Var != null) {
                        j = rt2Var.a;
                        sua suaVar2 = (sua) rp6Var5.k.getValue();
                        this.e = sq6Var2;
                        this.f = rp6Var5;
                        str = this.q;
                        this.g = str;
                        str2 = this.u;
                        this.h = str2;
                        this.i = j6;
                        this.j = j;
                        i = 0;
                        this.l = 0;
                        this.m = 3;
                        objP = suaVar2.p(j, this.t, this);
                        if (objP != hu4Var) {
                            str3 = str;
                            j2 = j6;
                            sfaVar = (sfa) objP;
                            if (sfaVar != null) {
                                j3 = sfaVar.a;
                                ifiVar = (ifi) rp6Var5.e.getValue();
                                this.e = sq6Var2;
                                this.f = rp6Var5;
                                this.g = str3;
                                this.h = str2;
                                this.i = j2;
                                this.j = j;
                                this.l = i;
                                this.k = j3;
                                this.m = 4;
                                str4 = str3;
                                if (ifiVar.a(j, j3, str4, u60.e, this) != hu4Var) {
                                    j4 = j3;
                                    str5 = str4;
                                    rp6Var6 = rp6Var5;
                                    sq6Var3 = sq6Var2;
                                    str6 = str2;
                                    j5 = j2;
                                    ((wp6) rp6Var6.i.getValue()).b(new pjh(j4, str5, 0L, 0L, 0L, 0L, sq6Var3.c, true, false, j5, str6, 0, false, false, ns5.CHAT, ixl.b(sq6Var3.c, (Map) ((e5d) rp6Var6.n.getValue()).g().i())));
                                }
                            }
                        }
                    }
                    return big.a;
                }
                return hu4Var;
            } catch (TimeoutCancellationException unused3) {
                zhgVar = zhgVar2;
            } catch (TamErrorException e4) {
                e = e4;
                zhgVar = zhgVar2;
            }
        } catch (CancellationException e5) {
            e = e5;
            rp6Var = rp6Var7;
        }
    }
}
