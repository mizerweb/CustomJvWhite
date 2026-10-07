package defpackage;

import android.util.Size;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import one.me.messages.list.loader.MessageModel;
import ru.ok.tamtam.messages.a;
import ru.ok.tamtam.messages.c;

/* JADX INFO: loaded from: classes2.dex */
public final class k0c extends mdh implements qf7 {
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public CharSequence j;
    public Object k;
    public aka l;
    public qia m;
    public xfa n;
    public CharSequence o;
    public String p;
    public String q;
    public boolean r;
    public boolean s;
    public int t;
    public final /* synthetic */ mm9 u;
    public final /* synthetic */ l0c v;
    public final /* synthetic */ n11 w;
    public final /* synthetic */ c7k x;
    public final /* synthetic */ boolean y;
    public final /* synthetic */ h8b z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0c(mm9 mm9Var, l0c l0cVar, n11 n11Var, c7k c7kVar, boolean z, h8b h8bVar, lq4 lq4Var) {
        super(2, lq4Var);
        this.u = mm9Var;
        this.v = l0cVar;
        this.w = n11Var;
        this.x = c7kVar;
        this.y = z;
        this.z = h8bVar;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        return new k0c(this.u, this.v, this.w, this.x, this.y, this.z, lq4Var);
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        return ((k0c) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbi.a);
    }

    /* JADX WARN: Code duplicated, block: B:129:0x03f4  */
    /* JADX WARN: Code duplicated, block: B:131:0x0414  */
    /* JADX WARN: Code duplicated, block: B:134:0x041c  */
    /* JADX WARN: Code duplicated, block: B:135:0x041f  */
    /* JADX WARN: Code duplicated, block: B:139:0x0435  */
    /* JADX WARN: Code duplicated, block: B:145:0x044c  */
    /* JADX WARN: Code duplicated, block: B:151:0x0462  */
    /* JADX WARN: Code duplicated, block: B:154:0x0469  */
    /* JADX WARN: Code duplicated, block: B:160:0x047a  */
    /* JADX WARN: Code duplicated, block: B:164:0x0482  */
    /* JADX WARN: Code duplicated, block: B:165:0x0486  */
    /* JADX WARN: Code duplicated, block: B:167:0x0489  */
    /* JADX WARN: Code duplicated, block: B:175:0x04c7  */
    /* JADX WARN: Code duplicated, block: B:176:0x04d2  */
    /* JADX WARN: Code duplicated, block: B:181:0x0508  */
    /* JADX WARN: Code duplicated, block: B:183:0x0518  */
    /* JADX WARN: Code duplicated, block: B:186:0x0544  */
    /* JADX WARN: Code duplicated, block: B:189:0x0565  */
    /* JADX WARN: Code duplicated, block: B:191:0x056b  */
    /* JADX WARN: Code duplicated, block: B:195:0x05a7  */
    /* JADX WARN: Code duplicated, block: B:198:0x05ce  */
    /* JADX WARN: Code duplicated, block: B:202:0x05dc  */
    /* JADX WARN: Code duplicated, block: B:205:0x05fc  */
    /* JADX WARN: Code duplicated, block: B:207:0x0601  */
    /* JADX WARN: Code duplicated, block: B:210:0x0616 A[PHI: r0 r1
  0x0616: PHI (r0v95 boolean) = (r0v60 boolean), (r0v61 boolean) binds: [B:209:0x0614, B:341:0x0616] A[DONT_GENERATE, DONT_INLINE]
  0x0616: PHI (r1v23 mm9) = (r1v8 mm9), (r1v9 mm9) binds: [B:209:0x0614, B:341:0x0616] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:211:0x061c  */
    /* JADX WARN: Code duplicated, block: B:214:0x062a  */
    /* JADX WARN: Code duplicated, block: B:216:0x064c  */
    /* JADX WARN: Code duplicated, block: B:217:0x064f  */
    /* JADX WARN: Code duplicated, block: B:220:0x0655  */
    /* JADX WARN: Code duplicated, block: B:223:0x0660  */
    /* JADX WARN: Code duplicated, block: B:229:0x0679  */
    /* JADX WARN: Code duplicated, block: B:233:0x0686  */
    /* JADX WARN: Code duplicated, block: B:236:0x0691  */
    /* JADX WARN: Code duplicated, block: B:238:0x0697 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:239:0x0699  */
    /* JADX WARN: Code duplicated, block: B:240:0x069c  */
    /* JADX WARN: Code duplicated, block: B:241:0x069e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:247:0x06b3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:248:0x06b5 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:256:0x06ce  */
    /* JADX WARN: Code duplicated, block: B:258:0x06d8  */
    /* JADX WARN: Code duplicated, block: B:268:0x06f4  */
    /* JADX WARN: Code duplicated, block: B:271:0x06fd  */
    /* JADX WARN: Code duplicated, block: B:273:0x0703  */
    /* JADX WARN: Code duplicated, block: B:275:0x0706  */
    /* JADX WARN: Code duplicated, block: B:277:0x0709  */
    /* JADX WARN: Code duplicated, block: B:279:0x070c  */
    /* JADX WARN: Code duplicated, block: B:284:0x0716  */
    /* JADX WARN: Code duplicated, block: B:285:0x071a  */
    /* JADX WARN: Code duplicated, block: B:286:0x071d  */
    /* JADX WARN: Code duplicated, block: B:289:0x072e  */
    /* JADX WARN: Code duplicated, block: B:291:0x0738  */
    /* JADX WARN: Code duplicated, block: B:297:0x074f  */
    /* JADX WARN: Code duplicated, block: B:300:0x0754  */
    /* JADX WARN: Code duplicated, block: B:314:0x0781  */
    /* JADX WARN: Code duplicated, block: B:316:0x0785  */
    /* JADX WARN: Code duplicated, block: B:319:0x078d  */
    /* JADX WARN: Code duplicated, block: B:325:0x07ae  */
    /* JADX WARN: Code duplicated, block: B:328:0x07bc  */
    /* JADX WARN: Code duplicated, block: B:329:0x07bf  */
    /* JADX WARN: Code duplicated, block: B:331:0x07c3  */
    /* JADX WARN: Code duplicated, block: B:332:0x07c6  */
    /* JADX WARN: Code duplicated, block: B:334:0x07ca  */
    /* JADX WARN: Code duplicated, block: B:335:0x07cd  */
    /* JADX WARN: Code duplicated, block: B:338:0x07e8  */
    /* JADX WARN: Code duplicated, block: B:341:0x0616 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:342:0x0668 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:343:0x066a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:367:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:0x0291  */
    /* JADX WARN: Code duplicated, block: B:92:0x02ad  */
    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        int i;
        Object objI;
        CharSequence charSequence;
        mm9 mm9Var;
        ria riaVar;
        int i2;
        hu4 hu4Var;
        boolean z;
        Object objA;
        u40 u40Var;
        boolean z2;
        aka akaVarD;
        int i3;
        int i4;
        ny8 ny8Var;
        int i5;
        ny8 ny8Var2;
        s04 s04Var;
        CharSequence charSequence2;
        q24 q24Var;
        Object objI2;
        int i6;
        int i7;
        u40 u40Var2;
        CharSequence charSequence3;
        sfa sfaVarB;
        String str;
        int i8;
        int i9;
        aka akaVar;
        u40 u40Var3;
        rt2 rt2Var;
        boolean zK0;
        vg4 vg4VarE;
        CharSequence charSequence4;
        String strA;
        qia qiaVar;
        xfa xfaVar;
        String str2;
        String strE;
        String str3;
        int i10;
        boolean z3;
        boolean z4;
        Object objA2;
        CharSequence charSequence5;
        u40 u40Var4;
        int i11;
        aka akaVar2;
        int i12;
        int i13;
        String str4;
        xfa xfaVar2;
        String str5;
        boolean z5;
        rt2 rt2Var2;
        qia qiaVar2;
        boolean z6;
        fia fiaVar;
        long j;
        boolean z7;
        long j2;
        long j3;
        boolean zB;
        sfa sfaVarB2;
        ng5 ng5Var;
        long j4;
        long j5;
        boolean z8;
        Map map;
        Iterator it;
        Long l;
        long jLongValue;
        sfa sfaVarB3;
        boolean z9;
        ng5 ng5Var2;
        mm9 mm9Var2;
        long j6;
        boolean z10;
        boolean z11;
        sfa sfaVarB4;
        f9j f9jVar;
        f9j f9jVar2;
        lx2 lx2Var;
        int iOrdinal;
        boolean z12;
        int i14;
        Integer num;
        String strA2;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        h8b h8bVar;
        Integer numValueOf;
        k0c k0cVar = this;
        l0c l0cVar = k0cVar.v;
        ny8 ny8Var3 = l0cVar.r;
        ny8 ny8Var4 = l0cVar.s;
        ny8 ny8Var5 = l0cVar.p;
        mm9 mm9Var3 = k0cVar.u;
        c cVar = mm9Var3.c;
        rt2 rt2Var3 = mm9Var3.a;
        int i15 = k0cVar.t;
        int i16 = 2;
        int i17 = 1;
        String str6 = "Required value was null.";
        hu4 hu4Var2 = hu4.a;
        if (i15 != 0) {
            if (i15 == 1) {
                i = k0cVar.e;
                mm9Var = (mm9) k0cVar.k;
                CharSequence charSequence6 = k0cVar.j;
                ch3.d0(obj);
                objI = obj;
                charSequence = charSequence6;
            } else if (i15 == 2) {
                int i18 = k0cVar.e;
                CharSequence charSequence7 = k0cVar.j;
                ch3.d0(obj);
                i2 = i18;
                hu4Var = hu4Var2;
                charSequence = charSequence7;
                z = true;
                objA = obj;
                u40Var = (u40) objA;
                if (u40Var.b == null && ((str = mm9Var3.b().g) == null || str.length() == 0)) {
                    akaVarD = null;
                } else {
                    sfa sfaVarB5 = mm9Var3.b();
                    npa npaVar = (npa) l0cVar.g.getValue();
                    rt2 rt2Var4 = mm9Var3.a;
                    fda fdaVarA = a.a((a) l0cVar.f.getValue(), sfaVarB5);
                    if (k0cVar.y) {
                        z2 = z;
                    } else {
                        rt2Var3.getClass();
                        if (rt2Var3 instanceof s04) {
                            z2 = z;
                        } else {
                            z2 = false;
                        }
                    }
                    akaVarD = npa.d(npaVar, rt2Var4, fdaVarA, false, z2, 8);
                }
                if (mm9Var3.b().j == wja.EDITED) {
                    sfaVarB = mm9Var3.b();
                    if ((sfaVarB.B & 1) != z || sfaVarB.N()) {
                        i3 = 0;
                    } else {
                        i3 = 1;
                    }
                } else {
                    i3 = 0;
                }
                rt2Var3.getClass();
                if ((rt2Var3 instanceof s04) || !r5a.b(mm9Var3.b().J)) {
                    i4 = 0;
                } else {
                    i4 = 1;
                }
                if (rt2Var3.d0()) {
                    ny8Var = ny8Var3;
                } else {
                    ny8Var = ny8Var3;
                    if (!mm9Var3.e().f && i4 == 0) {
                        i5 = 0;
                    }
                    ny8Var2 = ny8Var4;
                    if (rt2Var3 instanceof s04) {
                        s04Var = (s04) rt2Var3;
                    } else {
                        s04Var = null;
                    }
                    if (s04Var != null || (q24Var = s04Var.r) == null) {
                        ny8Var5 = ny8Var5;
                        str6 = "Required value was null.";
                        charSequence2 = charSequence;
                    } else {
                        long j7 = q24Var.a;
                        xn3 xn3Var = (xn3) l0cVar.m.getValue();
                        CharSequence charSequence8 = charSequence;
                        k0cVar.j = charSequence8;
                        k0cVar.k = u40Var;
                        k0cVar.l = akaVarD;
                        k0cVar.e = i2;
                        k0cVar.f = i3;
                        k0cVar.g = i4;
                        k0cVar.h = i5;
                        k0cVar.i = 0;
                        k0cVar.t = 3;
                        objI2 = xn3Var.i(j7, k0cVar);
                        if (objI2 == hu4Var) {
                            return hu4Var;
                        }
                        int i19 = i4;
                        i6 = i3;
                        i7 = i19;
                        u40Var2 = u40Var;
                        charSequence3 = charSequence8;
                        rt2Var2 = (rt2) objI2;
                        if (rt2Var2 == null) {
                            u40 u40Var5 = u40Var2;
                            charSequence2 = charSequence3;
                            u40Var = u40Var5;
                            int i20 = i6;
                            i4 = i7;
                            i3 = i20;
                        } else {
                            u40 u40Var6 = u40Var2;
                            charSequence2 = charSequence3;
                            rt2Var = rt2Var2;
                            i9 = i5;
                            akaVar = akaVarD;
                            u40Var3 = u40Var6;
                            i8 = i6;
                        }
                        zK0 = rt2Var.k0((e5d) ny8Var2.getValue());
                        vg4VarE = mm9Var3.e();
                        charSequence4 = charSequence2;
                        if (jcd.d((jcd) ny8Var.getValue(), vg4VarE, null, 2)) {
                            strA = ((jcd) ny8Var.getValue()).a().toString();
                        } else {
                            strA = kh4.a(vg4VarE, us0.b);
                        }
                        qiaVar = new qia(vg4VarE.v(), vg4VarE.u(), strA);
                        xfaVar = mm9Var3.b().i;
                        cVar.j();
                        str2 = cVar.k;
                        cVar.i();
                        strE = woh.e(cVar.l);
                        if (strE == null) {
                            strE = "";
                        }
                        str3 = strE;
                        i10 = !l0cVar.i(mm9Var3) ? 1 : 0;
                        boolean zA = ((tt7) ny8Var5.getValue()).a(mm9Var3.b());
                        int iA = mm9Var3.a();
                        if (i9 != 0) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        k0cVar.j = null;
                        k0cVar.k = u40Var3;
                        k0cVar.l = akaVar;
                        k0cVar.m = qiaVar;
                        k0cVar.n = xfaVar;
                        k0cVar.o = charSequence4;
                        k0cVar.p = str2;
                        k0cVar.q = str3;
                        k0cVar.e = i2;
                        k0cVar.f = i8;
                        k0cVar.g = i7;
                        k0cVar.h = i9;
                        k0cVar.r = zK0;
                        k0cVar.i = i10;
                        k0cVar.s = zA;
                        k0cVar.t = 4;
                        z4 = zA;
                        mm9Var3 = mm9Var3;
                        objA2 = l0c.a(l0cVar, mm9Var3, u40Var3, iA, z3, k0cVar);
                        if (objA2 == hu4Var) {
                            return hu4Var;
                        }
                        charSequence5 = charSequence4;
                        u40Var4 = u40Var3;
                        i11 = i10;
                        akaVar2 = akaVar;
                        i12 = i9;
                        i13 = i8;
                        str4 = str3;
                        xfaVar2 = xfaVar;
                        str5 = str2;
                        z5 = zK0;
                    }
                    i8 = i3;
                    i7 = i4;
                    i9 = i5;
                    akaVar = akaVarD;
                    u40Var3 = u40Var;
                    rt2Var = rt2Var3;
                    zK0 = rt2Var.k0((e5d) ny8Var2.getValue());
                    vg4VarE = mm9Var3.e();
                    charSequence4 = charSequence2;
                    if (jcd.d((jcd) ny8Var.getValue(), vg4VarE, null, 2)) {
                        strA = ((jcd) ny8Var.getValue()).a().toString();
                    } else {
                        strA = kh4.a(vg4VarE, us0.b);
                    }
                    qiaVar = new qia(vg4VarE.v(), vg4VarE.u(), strA);
                    xfaVar = mm9Var3.b().i;
                    cVar.j();
                    str2 = cVar.k;
                    cVar.i();
                    strE = woh.e(cVar.l);
                    if (strE == null) {
                        strE = "";
                    }
                    str3 = strE;
                    i10 = !l0cVar.i(mm9Var3) ? 1 : 0;
                    boolean zA2 = ((tt7) ny8Var5.getValue()).a(mm9Var3.b());
                    int iA2 = mm9Var3.a();
                    if (i9 != 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    k0cVar.j = null;
                    k0cVar.k = u40Var3;
                    k0cVar.l = akaVar;
                    k0cVar.m = qiaVar;
                    k0cVar.n = xfaVar;
                    k0cVar.o = charSequence4;
                    k0cVar.p = str2;
                    k0cVar.q = str3;
                    k0cVar.e = i2;
                    k0cVar.f = i8;
                    k0cVar.g = i7;
                    k0cVar.h = i9;
                    k0cVar.r = zK0;
                    k0cVar.i = i10;
                    k0cVar.s = zA2;
                    k0cVar.t = 4;
                    z4 = zA2;
                    mm9Var3 = mm9Var3;
                    objA2 = l0c.a(l0cVar, mm9Var3, u40Var3, iA2, z3, k0cVar);
                    if (objA2 == hu4Var) {
                        return hu4Var;
                    }
                    charSequence5 = charSequence4;
                    u40Var4 = u40Var3;
                    i11 = i10;
                    akaVar2 = akaVar;
                    i12 = i9;
                    i13 = i8;
                    str4 = str3;
                    xfaVar2 = xfaVar;
                    str5 = str2;
                    z5 = zK0;
                }
                i5 = 1;
                ny8Var2 = ny8Var4;
                if (rt2Var3 instanceof s04) {
                    s04Var = (s04) rt2Var3;
                } else {
                    s04Var = null;
                }
                if (s04Var != null) {
                }
                ny8Var5 = ny8Var5;
                str6 = "Required value was null.";
                charSequence2 = charSequence;
                i8 = i3;
                i7 = i4;
                i9 = i5;
                akaVar = akaVarD;
                u40Var3 = u40Var;
                rt2Var = rt2Var3;
                zK0 = rt2Var.k0((e5d) ny8Var2.getValue());
                vg4VarE = mm9Var3.e();
                charSequence4 = charSequence2;
                if (jcd.d((jcd) ny8Var.getValue(), vg4VarE, null, 2)) {
                    strA = ((jcd) ny8Var.getValue()).a().toString();
                } else {
                    strA = kh4.a(vg4VarE, us0.b);
                }
                qiaVar = new qia(vg4VarE.v(), vg4VarE.u(), strA);
                xfaVar = mm9Var3.b().i;
                cVar.j();
                str2 = cVar.k;
                cVar.i();
                strE = woh.e(cVar.l);
                if (strE == null) {
                    strE = "";
                }
                str3 = strE;
                i10 = !l0cVar.i(mm9Var3) ? 1 : 0;
                boolean zA3 = ((tt7) ny8Var5.getValue()).a(mm9Var3.b());
                int iA3 = mm9Var3.a();
                if (i9 != 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                k0cVar.j = null;
                k0cVar.k = u40Var3;
                k0cVar.l = akaVar;
                k0cVar.m = qiaVar;
                k0cVar.n = xfaVar;
                k0cVar.o = charSequence4;
                k0cVar.p = str2;
                k0cVar.q = str3;
                k0cVar.e = i2;
                k0cVar.f = i8;
                k0cVar.g = i7;
                k0cVar.h = i9;
                k0cVar.r = zK0;
                k0cVar.i = i10;
                k0cVar.s = zA3;
                k0cVar.t = 4;
                z4 = zA3;
                mm9Var3 = mm9Var3;
                objA2 = l0c.a(l0cVar, mm9Var3, u40Var3, iA3, z3, k0cVar);
                if (objA2 == hu4Var) {
                    return hu4Var;
                }
                charSequence5 = charSequence4;
                u40Var4 = u40Var3;
                i11 = i10;
                akaVar2 = akaVar;
                i12 = i9;
                i13 = i8;
                str4 = str3;
                xfaVar2 = xfaVar;
                str5 = str2;
                z5 = zK0;
            } else if (i15 == 3) {
                int i21 = k0cVar.h;
                i7 = k0cVar.g;
                i6 = k0cVar.f;
                int i22 = k0cVar.e;
                aka akaVar3 = k0cVar.l;
                u40Var2 = (u40) k0cVar.k;
                charSequence3 = k0cVar.j;
                ch3.d0(obj);
                hu4Var = hu4Var2;
                akaVarD = akaVar3;
                i2 = i22;
                ny8Var = ny8Var3;
                i5 = i21;
                ny8Var2 = ny8Var4;
                objI2 = obj;
                rt2Var2 = (rt2) objI2;
                if (rt2Var2 == null) {
                    u40 u40Var7 = u40Var2;
                    charSequence2 = charSequence3;
                    u40Var = u40Var7;
                    int i23 = i6;
                    i4 = i7;
                    i3 = i23;
                    i8 = i3;
                    i7 = i4;
                    i9 = i5;
                    akaVar = akaVarD;
                    u40Var3 = u40Var;
                    rt2Var = rt2Var3;
                } else {
                    u40 u40Var8 = u40Var2;
                    charSequence2 = charSequence3;
                    rt2Var = rt2Var2;
                    i9 = i5;
                    akaVar = akaVarD;
                    u40Var3 = u40Var8;
                    i8 = i6;
                }
                zK0 = rt2Var.k0((e5d) ny8Var2.getValue());
                vg4VarE = mm9Var3.e();
                charSequence4 = charSequence2;
                if (jcd.d((jcd) ny8Var.getValue(), vg4VarE, null, 2)) {
                    strA = ((jcd) ny8Var.getValue()).a().toString();
                } else {
                    strA = kh4.a(vg4VarE, us0.b);
                }
                qiaVar = new qia(vg4VarE.v(), vg4VarE.u(), strA);
                xfaVar = mm9Var3.b().i;
                cVar.j();
                str2 = cVar.k;
                cVar.i();
                strE = woh.e(cVar.l);
                if (strE == null) {
                    strE = "";
                }
                str3 = strE;
                i10 = !l0cVar.i(mm9Var3) ? 1 : 0;
                boolean zA4 = ((tt7) ny8Var5.getValue()).a(mm9Var3.b());
                int iA4 = mm9Var3.a();
                if (i9 != 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                k0cVar.j = null;
                k0cVar.k = u40Var3;
                k0cVar.l = akaVar;
                k0cVar.m = qiaVar;
                k0cVar.n = xfaVar;
                k0cVar.o = charSequence4;
                k0cVar.p = str2;
                k0cVar.q = str3;
                k0cVar.e = i2;
                k0cVar.f = i8;
                k0cVar.g = i7;
                k0cVar.h = i9;
                k0cVar.r = zK0;
                k0cVar.i = i10;
                k0cVar.s = zA4;
                k0cVar.t = 4;
                z4 = zA4;
                mm9Var3 = mm9Var3;
                objA2 = l0c.a(l0cVar, mm9Var3, u40Var3, iA4, z3, k0cVar);
                if (objA2 == hu4Var) {
                    return hu4Var;
                }
                charSequence5 = charSequence4;
                u40Var4 = u40Var3;
                i11 = i10;
                akaVar2 = akaVar;
                i12 = i9;
                i13 = i8;
                str4 = str3;
                xfaVar2 = xfaVar;
                str5 = str2;
                z5 = zK0;
            } else {
                if (i15 != 4) {
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                boolean z17 = k0cVar.s;
                i11 = k0cVar.i;
                boolean z18 = k0cVar.r;
                i12 = k0cVar.h;
                i13 = k0cVar.f;
                String str7 = k0cVar.q;
                String str8 = k0cVar.p;
                CharSequence charSequence9 = k0cVar.o;
                xfa xfaVar3 = k0cVar.n;
                qiaVar = k0cVar.m;
                aka akaVar4 = k0cVar.l;
                u40 u40Var9 = (u40) k0cVar.k;
                z4 = z17;
                CharSequence charSequence10 = k0cVar.j;
                ch3.d0(obj);
                objA2 = obj;
                u40Var4 = u40Var9;
                akaVar2 = akaVar4;
                z5 = z18;
                str4 = str7;
                str5 = str8;
                str6 = "Required value was null.";
                charSequence5 = charSequence9;
                xfaVar2 = xfaVar3;
            }
            qiaVar2 = qiaVar;
            z6 = z4;
            fiaVar = (fia) objA2;
            j = mm9Var3.b().a;
            if (mm9Var3.b().w() == null && mm9Var3.b().H()) {
                z7 = false;
            } else {
                z7 = true;
            }
            j2 = mm9Var3.b().b;
            j3 = mm9Var3.b().e;
            zB = r5a.b(mm9Var3.b().J);
            sfaVarB2 = mm9Var3.b();
            ng5Var = sfaVarB2.G;
            if (ng5Var != null) {
                j4 = ng5Var.a;
            } else {
                j4 = sfaVarB2.c;
            }
            j5 = j4;
            z8 = mm9Var3.e().f;
            map = rt2Var3.b.e;
            if (map.isEmpty()) {
                z9 = z8;
                mm9Var2 = mm9Var3;
                z10 = false;
            } else {
                it = map.entrySet().iterator();
                while (true) {
                    if (it.hasNext()) {
                        Map.Entry entry = (Map.Entry) it.next();
                        l = (Long) entry.getKey();
                        jLongValue = ((Long) entry.getValue()).longValue();
                        sfaVarB3 = mm9Var3.b();
                        z9 = z8;
                        ng5Var2 = sfaVarB3.G;
                        mm9Var2 = mm9Var3;
                        if (ng5Var2 != null) {
                            j6 = ng5Var2.a;
                        } else {
                            j6 = sfaVarB3.c;
                        }
                        if (jLongValue >= j6) {
                            long jV = mm9Var2.e().v();
                            if (l != null || jV != l.longValue()) {
                                z10 = true;
                            }
                        }
                        mm9Var3 = mm9Var2;
                        z8 = z9;
                    } else {
                        z9 = z8;
                        mm9Var2 = mm9Var3;
                        z10 = false;
                    }
                }
            }
            if (mm9Var2.b().i != xfa.SENT || mm9Var2.b().i == xfa.READ) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (mm9Var2.b().i == xfa.SENDING) {
                f9jVar = f9j.Timer;
            } else if (!z9) {
                f9jVar = f9j.None;
            } else if (!z10 && z11 && !rt2Var3.d0() && !mm9Var2.b().N()) {
                f9jVar = f9j.Seen;
            } else if (!z10 || !z11 || rt2Var3.d0() || (rt2Var3 instanceof s04) || mm9Var2.b().N()) {
                sfaVarB4 = mm9Var2.b();
                if (sfaVarB4.i != xfa.ERROR || sfaVarB4.j == wja.DELAYED_FIRE_ERROR) {
                    f9jVar = f9j.Error;
                } else {
                    f9jVar = (z9 && (rt2Var3 instanceof s04) && mm9Var2.b().J == 2) ? f9j.Seen : f9j.None;
                }
            } else {
                f9jVar = f9j.Send;
            }
            f9jVar2 = f9jVar;
            lx2Var = rt2Var3.b.b;
            if (lx2Var == null) {
                ore.p(str6);
                return null;
            }
            iOrdinal = lx2Var.ordinal();
            if (iOrdinal != 0) {
                z12 = true;
                if (iOrdinal == 1) {
                    i14 = 2;
                } else if (iOrdinal != 2) {
                    if (iOrdinal != 3 && iOrdinal != 4) {
                        ore.o();
                        return null;
                    }
                    i14 = 2;
                } else {
                    i14 = 3;
                }
            } else {
                z12 = true;
                i14 = 1;
            }
            mg5 mg5Var = mm9Var2.b().H;
            kja kjaVar = mm9Var2.b().E;
            if (i12 != 0) {
                if (!mm9Var2.b().M() || mm9Var2.b().a0() || mm9Var2.b().N()) {
                    z16 = z12;
                } else {
                    z16 = false;
                }
                h8bVar = k0cVar.z;
                if (h8bVar == null && rt2Var3.d0() && !z16) {
                    int iB = h8bVar.b(mm9Var2.b().a);
                    int i24 = iB >= 0 ? h8bVar.c[iB] : 0;
                    if (i24 < 0) {
                        i24 = 0;
                    }
                    if (rt2Var3.b.I.m || i24 > 0) {
                        numValueOf = Integer.valueOf(i24);
                    } else {
                        numValueOf = null;
                    }
                } else {
                    numValueOf = null;
                }
                num = numValueOf;
            } else {
                num = null;
            }
            if (rt2Var3.d0() || mm9Var2.b().v == 0 || mm9Var2.b().N()) {
                strA2 = null;
            } else {
                strA2 = l5h.a(mm9Var2.b().v);
            }
            boolean zY = mm9Var2.b().Y();
            if (i11 != 0) {
                z13 = z12;
            } else {
                z13 = false;
            }
            if (i13 != 0) {
                z14 = z12;
            } else {
                z14 = false;
            }
            if (i12 != 0) {
                z15 = z12;
            } else {
                z15 = false;
            }
            return new MessageModel(j, j2, j5, charSequence5, str5, str4, f9jVar2, z13, z7, u40Var4, z14, z6, akaVar2, fiaVar, null, null, i14, mg5Var, strA2, zY, num, z5, kjaVar, j3, zB, z15, xfaVar2, qiaVar2, 0, -1340030976, 1);
        }
        ch3.d0(obj);
        if (mm9Var3.b().a0()) {
            qvj qvjVarA = mm9Var3.b().A();
            if (qvjVarA == null) {
                ore.p("Required value was null.");
                return null;
            }
            ArrayList<kvj> arrayList = qvjVarA.a;
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            for (kvj kvjVar : arrayList) {
                d dVar = kvjVar.d;
                kzi kziVar = kvjVar.b;
                jvj jvjVar = kvjVar.a;
                if (dVar != null) {
                    int i25 = dVar.c;
                    int i26 = dVar.b;
                    arrayList2.add(new cwj((i26 <= 0 || i25 <= 0) ? cwj.d : new Size(i26, i25), dVar.a, kvjVar.d != null && jvjVar == jvj.a));
                } else {
                    jvj jvjVar2 = jvj.c;
                    if ((jvjVar == jvjVar2 && kziVar != null && ((String) kziVar.b).length() > 0) || (jvjVar == jvj.d && kziVar != null && ((String) kziVar.b).length() > 0)) {
                        arrayList2.add(new dwj(kvjVar.d(), (jvjVar != jvjVar2 || kziVar == null || ((String) kziVar.b).length() <= 0) ? q9i.d : q9i.c, false));
                    } else if (jvjVar == jvj.e && kziVar != null && ((String) kziVar.b).length() > 0) {
                        CharSequence charSequenceA = ((al7) l0cVar.n.getValue()).a(kvjVar.d(), kvjVar.a());
                        if (charSequenceA.length() != 0) {
                            arrayList2.add(new dwj(charSequenceA, q9i.i, true));
                        }
                    } else if (kvjVar.f()) {
                        kg8 kg8Var = kvjVar.c;
                        if (kg8Var == null) {
                            ore.p("Required value was null.");
                            return null;
                        }
                        arrayList2.add(new bwj(kg8Var));
                    } else {
                        continue;
                    }
                }
            }
            ewj ewjVar = new ewj(mm9Var3.b().a, arrayList2);
            u40 u40Var10 = u40.d;
            xfa xfaVar4 = mm9Var3.b().i;
            cVar.i();
            String str9 = cVar.l;
            if (str9.length() > 0) {
                str9 = Character.toUpperCase(str9.charAt(0)) + str9.substring(1);
            }
            return new MessageModel(mm9Var3.b().a, mm9Var3.b().b, mm9Var3.b().c, "", "", str9, f9j.None, true, true, u40Var10, false, ((tt7) ny8Var5.getValue()).a(mm9Var3.b()), null, null, null, ewjVar, i17, null, null, false, null, false, null, 0L, r5a.b(mm9Var3.b().J), true, xfaVar4, null, -2147483646, -528583680, 0);
        }
        if (mm9Var3.b().S()) {
            e5d e5dVar = (e5d) ny8Var4.getValue();
            o5d o5dVarU = mm9Var3.b().u();
            if (!e5dVar.v(o5dVarU != null ? new Integer(o5dVarU.f) : null)) {
                i = 1;
            } else if (mm9Var3.b().B(y60.p) || ((f5d) ((wo6) l0cVar.o.getValue())).C()) {
                i = 0;
            } else {
                i = 1;
            }
        } else {
            if (mm9Var3.b().B(y60.p)) {
            }
            i = 0;
        }
        CharSequence charSequenceR = i != 0 ? woh.r(l0cVar.a) : cVar.e(rt2Var3, true);
        if (mm9Var3.b().M()) {
            u40 u40Var11 = u40.d;
            xfa xfaVar5 = mm9Var3.b().i;
            cVar.i();
            String str10 = cVar.l;
            if (str10.length() > 0) {
                str10 = Character.toUpperCase(str10.charAt(0)) + str10.substring(1);
            }
            String str11 = str10;
            if (mm9Var3.b().q() != null) {
                sfa sfaVar = mm9Var3.b().z;
                riaVar = new ria(sfaVar != null ? sfaVar.b : 0L);
            } else {
                riaVar = null;
            }
            return new MessageModel(mm9Var3.b().a, mm9Var3.b().b, mm9Var3.b().c, charSequenceR, "", str11, f9j.None, true, true, u40Var11, false, ((tt7) ny8Var5.getValue()).a(mm9Var3.b()), null, null, riaVar, null, i16, null, null, false, null, false, null, 0L, r5a.b(mm9Var3.b().J), true, xfaVar5, null, 0, -528567296, 0);
        }
        no4 no4VarG = l0cVar.g();
        long j8 = mm9Var3.b().e;
        k0cVar.j = charSequenceR;
        k0cVar.k = mm9Var3;
        k0cVar.e = i;
        k0cVar.t = 1;
        objI = no4VarG.i(j8);
        if (objI == hu4Var2) {
            return hu4Var2;
        }
        charSequence = charSequenceR;
        mm9Var = mm9Var3;
        i2 = i;
        vg4 vg4VarG = (vg4) objI;
        if (vg4VarG == null) {
            vg4VarG = l0cVar.g().g(mm9Var3.b().e);
        }
        v56 v56Var = mm9Var.g;
        zv8 zv8Var = mm9.i[r15];
        v56Var.b = vg4VarG;
        a50 a50Var = l0cVar.b;
        c cVar2 = mm9Var3.c;
        k0cVar = this;
        k0cVar.j = charSequence;
        k0cVar.k = null;
        k0cVar.e = i2;
        k0cVar.t = 2;
        hu4Var = hu4Var2;
        z = true;
        objA = a50Var.a(mm9Var3, k0cVar.w, cVar2, k0cVar.x, k0cVar);
        if (objA == hu4Var) {
            return hu4Var;
        }
        u40Var = (u40) objA;
        if (u40Var.b == null) {
            sfa sfaVarB6 = mm9Var3.b();
            npa npaVar2 = (npa) l0cVar.g.getValue();
            rt2 rt2Var5 = mm9Var3.a;
            fda fdaVarA2 = a.a((a) l0cVar.f.getValue(), sfaVarB6);
            if (k0cVar.y) {
                rt2Var3.getClass();
                if (rt2Var3 instanceof s04) {
                    z2 = z;
                } else {
                    z2 = false;
                }
            } else {
                z2 = z;
            }
            akaVarD = npa.d(npaVar2, rt2Var5, fdaVarA2, false, z2, 8);
        } else {
            sfa sfaVarB7 = mm9Var3.b();
            npa npaVar3 = (npa) l0cVar.g.getValue();
            rt2 rt2Var6 = mm9Var3.a;
            fda fdaVarA3 = a.a((a) l0cVar.f.getValue(), sfaVarB7);
            if (k0cVar.y) {
                rt2Var3.getClass();
                if (rt2Var3 instanceof s04) {
                    z2 = z;
                } else {
                    z2 = false;
                }
            } else {
                z2 = z;
            }
            akaVarD = npa.d(npaVar3, rt2Var6, fdaVarA3, false, z2, 8);
        }
        if (mm9Var3.b().j == wja.EDITED) {
            sfaVarB = mm9Var3.b();
            if ((sfaVarB.B & 1) != z) {
                i3 = 0;
            } else {
                i3 = 0;
            }
        } else {
            i3 = 0;
        }
        rt2Var3.getClass();
        if (rt2Var3 instanceof s04) {
            i4 = 0;
        } else {
            i4 = 0;
        }
        if (rt2Var3.d0()) {
            ny8Var = ny8Var3;
            if (!mm9Var3.e().f) {
            }
            ny8Var2 = ny8Var4;
            if (rt2Var3 instanceof s04) {
                s04Var = (s04) rt2Var3;
            } else {
                s04Var = null;
            }
            if (s04Var != null) {
            }
            ny8Var5 = ny8Var5;
            str6 = "Required value was null.";
            charSequence2 = charSequence;
            i8 = i3;
            i7 = i4;
            i9 = i5;
            akaVar = akaVarD;
            u40Var3 = u40Var;
            rt2Var = rt2Var3;
            zK0 = rt2Var.k0((e5d) ny8Var2.getValue());
            vg4VarE = mm9Var3.e();
            charSequence4 = charSequence2;
            if (jcd.d((jcd) ny8Var.getValue(), vg4VarE, null, 2)) {
                strA = ((jcd) ny8Var.getValue()).a().toString();
            } else {
                strA = kh4.a(vg4VarE, us0.b);
            }
            qiaVar = new qia(vg4VarE.v(), vg4VarE.u(), strA);
            xfaVar = mm9Var3.b().i;
            cVar.j();
            str2 = cVar.k;
            cVar.i();
            strE = woh.e(cVar.l);
            if (strE == null) {
                strE = "";
            }
            str3 = strE;
            i10 = !l0cVar.i(mm9Var3) ? 1 : 0;
            boolean zA5 = ((tt7) ny8Var5.getValue()).a(mm9Var3.b());
            int iA5 = mm9Var3.a();
            if (i9 != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            k0cVar.j = null;
            k0cVar.k = u40Var3;
            k0cVar.l = akaVar;
            k0cVar.m = qiaVar;
            k0cVar.n = xfaVar;
            k0cVar.o = charSequence4;
            k0cVar.p = str2;
            k0cVar.q = str3;
            k0cVar.e = i2;
            k0cVar.f = i8;
            k0cVar.g = i7;
            k0cVar.h = i9;
            k0cVar.r = zK0;
            k0cVar.i = i10;
            k0cVar.s = zA5;
            k0cVar.t = 4;
            z4 = zA5;
            mm9Var3 = mm9Var3;
            objA2 = l0c.a(l0cVar, mm9Var3, u40Var3, iA5, z3, k0cVar);
            if (objA2 == hu4Var) {
                return hu4Var;
            }
            charSequence5 = charSequence4;
            u40Var4 = u40Var3;
            i11 = i10;
            akaVar2 = akaVar;
            i12 = i9;
            i13 = i8;
            str4 = str3;
            xfaVar2 = xfaVar;
            str5 = str2;
            z5 = zK0;
            qiaVar2 = qiaVar;
            z6 = z4;
            fiaVar = (fia) objA2;
            j = mm9Var3.b().a;
            if (mm9Var3.b().w() == null) {
                z7 = true;
            } else {
                z7 = true;
            }
            j2 = mm9Var3.b().b;
            j3 = mm9Var3.b().e;
            zB = r5a.b(mm9Var3.b().J);
            sfaVarB2 = mm9Var3.b();
            ng5Var = sfaVarB2.G;
            if (ng5Var != null) {
                j4 = ng5Var.a;
            } else {
                j4 = sfaVarB2.c;
            }
            j5 = j4;
            z8 = mm9Var3.e().f;
            map = rt2Var3.b.e;
            if (map.isEmpty()) {
                z9 = z8;
                mm9Var2 = mm9Var3;
                z10 = false;
            } else {
                it = map.entrySet().iterator();
                while (true) {
                    if (it.hasNext()) {
                        Map.Entry entry2 = (Map.Entry) it.next();
                        l = (Long) entry2.getKey();
                        jLongValue = ((Long) entry2.getValue()).longValue();
                        sfaVarB3 = mm9Var3.b();
                        z9 = z8;
                        ng5Var2 = sfaVarB3.G;
                        mm9Var2 = mm9Var3;
                        if (ng5Var2 != null) {
                            j6 = ng5Var2.a;
                        } else {
                            j6 = sfaVarB3.c;
                        }
                        if (jLongValue >= j6) {
                            long jV2 = mm9Var2.e().v();
                            if (l != null) {
                            }
                            z10 = true;
                        }
                        mm9Var3 = mm9Var2;
                        z8 = z9;
                    } else {
                        z9 = z8;
                        mm9Var2 = mm9Var3;
                        z10 = false;
                    }
                }
            }
            if (mm9Var2.b().i != xfa.SENT) {
                z11 = true;
            } else {
                z11 = true;
            }
            if (mm9Var2.b().i == xfa.SENDING) {
                f9jVar = f9j.Timer;
            } else if (!z9) {
                f9jVar = f9j.None;
            } else if (!z10) {
                if (z10) {
                    sfaVarB4 = mm9Var2.b();
                    if (sfaVarB4.i != xfa.ERROR) {
                        f9jVar = f9j.Error;
                    } else {
                        f9jVar = f9j.Error;
                    }
                } else {
                    sfaVarB4 = mm9Var2.b();
                    if (sfaVarB4.i != xfa.ERROR) {
                        f9jVar = f9j.Error;
                    } else {
                        f9jVar = f9j.Error;
                    }
                }
            } else if (z10) {
                sfaVarB4 = mm9Var2.b();
                if (sfaVarB4.i != xfa.ERROR) {
                    f9jVar = f9j.Error;
                } else {
                    f9jVar = f9j.Error;
                }
            } else {
                sfaVarB4 = mm9Var2.b();
                if (sfaVarB4.i != xfa.ERROR) {
                    f9jVar = f9j.Error;
                } else {
                    f9jVar = f9j.Error;
                }
            }
            f9jVar2 = f9jVar;
            lx2Var = rt2Var3.b.b;
            if (lx2Var == null) {
                ore.p(str6);
                return null;
            }
            iOrdinal = lx2Var.ordinal();
            if (iOrdinal != 0) {
                z12 = true;
                if (iOrdinal == 1) {
                    i14 = 2;
                } else if (iOrdinal != 2) {
                    if (iOrdinal != 3) {
                        ore.o();
                        return null;
                    }
                    i14 = 2;
                } else {
                    i14 = 3;
                }
            } else {
                z12 = true;
                i14 = 1;
            }
            mg5 mg5Var2 = mm9Var2.b().H;
            kja kjaVar2 = mm9Var2.b().E;
            if (i12 != 0) {
                if (mm9Var2.b().M()) {
                    z16 = z12;
                } else {
                    z16 = z12;
                }
                h8bVar = k0cVar.z;
                if (h8bVar == null) {
                    numValueOf = null;
                } else {
                    numValueOf = null;
                }
                num = numValueOf;
            } else {
                num = null;
            }
            if (rt2Var3.d0()) {
                strA2 = null;
            } else {
                strA2 = null;
            }
            boolean zY2 = mm9Var2.b().Y();
            if (i11 != 0) {
                z13 = z12;
            } else {
                z13 = false;
            }
            if (i13 != 0) {
                z14 = z12;
            } else {
                z14 = false;
            }
            if (i12 != 0) {
                z15 = z12;
            } else {
                z15 = false;
            }
            return new MessageModel(j, j2, j5, charSequence5, str5, str4, f9jVar2, z13, z7, u40Var4, z14, z6, akaVar2, fiaVar, null, null, i14, mg5Var2, strA2, zY2, num, z5, kjaVar2, j3, zB, z15, xfaVar2, qiaVar2, 0, -1340030976, 1);
        }
        ny8Var = ny8Var3;
        i5 = 1;
        ny8Var2 = ny8Var4;
        if (rt2Var3 instanceof s04) {
            s04Var = (s04) rt2Var3;
        } else {
            s04Var = null;
        }
        if (s04Var != null) {
        }
        ny8Var5 = ny8Var5;
        str6 = "Required value was null.";
        charSequence2 = charSequence;
        i8 = i3;
        i7 = i4;
        i9 = i5;
        akaVar = akaVarD;
        u40Var3 = u40Var;
        rt2Var = rt2Var3;
        zK0 = rt2Var.k0((e5d) ny8Var2.getValue());
        vg4VarE = mm9Var3.e();
        charSequence4 = charSequence2;
        if (jcd.d((jcd) ny8Var.getValue(), vg4VarE, null, 2)) {
            strA = ((jcd) ny8Var.getValue()).a().toString();
        } else {
            strA = kh4.a(vg4VarE, us0.b);
        }
        qiaVar = new qia(vg4VarE.v(), vg4VarE.u(), strA);
        xfaVar = mm9Var3.b().i;
        cVar.j();
        str2 = cVar.k;
        cVar.i();
        strE = woh.e(cVar.l);
        if (strE == null) {
            strE = "";
        }
        str3 = strE;
        i10 = !l0cVar.i(mm9Var3) ? 1 : 0;
        boolean zA6 = ((tt7) ny8Var5.getValue()).a(mm9Var3.b());
        int iA6 = mm9Var3.a();
        if (i9 != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        k0cVar.j = null;
        k0cVar.k = u40Var3;
        k0cVar.l = akaVar;
        k0cVar.m = qiaVar;
        k0cVar.n = xfaVar;
        k0cVar.o = charSequence4;
        k0cVar.p = str2;
        k0cVar.q = str3;
        k0cVar.e = i2;
        k0cVar.f = i8;
        k0cVar.g = i7;
        k0cVar.h = i9;
        k0cVar.r = zK0;
        k0cVar.i = i10;
        k0cVar.s = zA6;
        k0cVar.t = 4;
        z4 = zA6;
        mm9Var3 = mm9Var3;
        objA2 = l0c.a(l0cVar, mm9Var3, u40Var3, iA6, z3, k0cVar);
        if (objA2 == hu4Var) {
            return hu4Var;
        }
        charSequence5 = charSequence4;
        u40Var4 = u40Var3;
        i11 = i10;
        akaVar2 = akaVar;
        i12 = i9;
        i13 = i8;
        str4 = str3;
        xfaVar2 = xfaVar;
        str5 = str2;
        z5 = zK0;
        qiaVar2 = qiaVar;
        z6 = z4;
        fiaVar = (fia) objA2;
        j = mm9Var3.b().a;
        if (mm9Var3.b().w() == null) {
            z7 = true;
        } else {
            z7 = true;
        }
        j2 = mm9Var3.b().b;
        j3 = mm9Var3.b().e;
        zB = r5a.b(mm9Var3.b().J);
        sfaVarB2 = mm9Var3.b();
        ng5Var = sfaVarB2.G;
        if (ng5Var != null) {
            j4 = ng5Var.a;
        } else {
            j4 = sfaVarB2.c;
        }
        j5 = j4;
        z8 = mm9Var3.e().f;
        map = rt2Var3.b.e;
        if (map.isEmpty()) {
            z9 = z8;
            mm9Var2 = mm9Var3;
            z10 = false;
        } else {
            it = map.entrySet().iterator();
            while (true) {
                if (it.hasNext()) {
                    Map.Entry entry3 = (Map.Entry) it.next();
                    l = (Long) entry3.getKey();
                    jLongValue = ((Long) entry3.getValue()).longValue();
                    sfaVarB3 = mm9Var3.b();
                    z9 = z8;
                    ng5Var2 = sfaVarB3.G;
                    mm9Var2 = mm9Var3;
                    if (ng5Var2 != null) {
                        j6 = ng5Var2.a;
                    } else {
                        j6 = sfaVarB3.c;
                    }
                    if (jLongValue >= j6) {
                        long jV3 = mm9Var2.e().v();
                        if (l != null) {
                        }
                        z10 = true;
                    }
                    mm9Var3 = mm9Var2;
                    z8 = z9;
                } else {
                    z9 = z8;
                    mm9Var2 = mm9Var3;
                    z10 = false;
                }
            }
        }
        if (mm9Var2.b().i != xfa.SENT) {
            z11 = true;
        } else {
            z11 = true;
        }
        if (mm9Var2.b().i == xfa.SENDING) {
            f9jVar = f9j.Timer;
        } else if (!z9) {
            f9jVar = f9j.None;
        } else if (!z10) {
            if (z10) {
                sfaVarB4 = mm9Var2.b();
                if (sfaVarB4.i != xfa.ERROR) {
                    f9jVar = f9j.Error;
                } else {
                    f9jVar = f9j.Error;
                }
            } else {
                sfaVarB4 = mm9Var2.b();
                if (sfaVarB4.i != xfa.ERROR) {
                    f9jVar = f9j.Error;
                } else {
                    f9jVar = f9j.Error;
                }
            }
        } else if (z10) {
            sfaVarB4 = mm9Var2.b();
            if (sfaVarB4.i != xfa.ERROR) {
                f9jVar = f9j.Error;
            } else {
                f9jVar = f9j.Error;
            }
        } else {
            sfaVarB4 = mm9Var2.b();
            if (sfaVarB4.i != xfa.ERROR) {
                f9jVar = f9j.Error;
            } else {
                f9jVar = f9j.Error;
            }
        }
        f9jVar2 = f9jVar;
        lx2Var = rt2Var3.b.b;
        if (lx2Var == null) {
            ore.p(str6);
            return null;
        }
        iOrdinal = lx2Var.ordinal();
        if (iOrdinal != 0) {
            z12 = true;
            if (iOrdinal == 1) {
                i14 = 2;
            } else if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    ore.o();
                    return null;
                }
                i14 = 2;
            } else {
                i14 = 3;
            }
        } else {
            z12 = true;
            i14 = 1;
        }
        mg5 mg5Var3 = mm9Var2.b().H;
        kja kjaVar3 = mm9Var2.b().E;
        if (i12 != 0) {
            if (mm9Var2.b().M()) {
                z16 = z12;
            } else {
                z16 = z12;
            }
            h8bVar = k0cVar.z;
            if (h8bVar == null) {
                numValueOf = null;
            } else {
                numValueOf = null;
            }
            num = numValueOf;
        } else {
            num = null;
        }
        if (rt2Var3.d0()) {
            strA2 = null;
        } else {
            strA2 = null;
        }
        boolean zY3 = mm9Var2.b().Y();
        if (i11 != 0) {
            z13 = z12;
        } else {
            z13 = false;
        }
        if (i13 != 0) {
            z14 = z12;
        } else {
            z14 = false;
        }
        if (i12 != 0) {
            z15 = z12;
        } else {
            z15 = false;
        }
        return new MessageModel(j, j2, j5, charSequence5, str5, str4, f9jVar2, z13, z7, u40Var4, z14, z6, akaVar2, fiaVar, null, null, i14, mg5Var3, strA2, zY3, num, z5, kjaVar3, j3, zB, z15, xfaVar2, qiaVar2, 0, -1340030976, 1);
    }
}
