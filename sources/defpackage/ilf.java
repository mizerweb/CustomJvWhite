package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ilf extends mjf {
    public final long c;
    public final eia d;
    public final long e;
    public final boolean f;
    public final String g;
    public long h;
    public ng5 i;
    public g4b j;
    public final String b = getClass().getName();
    public String k = "";

    public ilf(hlf hlfVar) {
        this.c = hlfVar.a;
        this.d = hlfVar.b;
        this.e = hlfVar.c;
        this.f = hlfVar.d;
        this.g = hlfVar.e;
        this.i = hlfVar.f;
        this.j = hlfVar.g;
    }

    /* JADX WARN: Failed to calculate best type for var: r19v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r19v2 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r19v3 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r19v3 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r19v4 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r19v4 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r5v20 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v20 ??, new type: xb9
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r8v15 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r8v15 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r8v3 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r8v3 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r8v4 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r8v4 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r19v1 ??, new type: long
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException
        */
    @Override // defpackage.mjf
    public void B() {
        /*
            Method dump skipped, instruction units count: 771
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ilf.B():void");
    }

    public abstract rfa C();

    public abstract String D();

    /* JADX WARN: Code duplicated, block: B:30:0x00af A[PHI: r6 r7 r8
  0x00af: PHI (r6v3 java.lang.String) = (r6v0 java.lang.String), (r6v5 java.lang.String) binds: [B:33:0x00bd, B:28:0x00ac] A[DONT_GENERATE, DONT_INLINE]
  0x00af: PHI (r7v2 c46) = (r7v0 c46), (r7v6 c46) binds: [B:33:0x00bd, B:28:0x00ac] A[DONT_GENERATE, DONT_INLINE]
  0x00af: PHI (r8v3 java.util.List) = (r8v0 java.util.List), (r8v4 java.util.List) binds: [B:33:0x00bd, B:28:0x00ac] A[DONT_GENERATE, DONT_INLINE]] */
    public long E(sfa sfaVar) {
        String str;
        c46 c46VarC;
        List list;
        ose oseVar = (ose) r().b.c();
        oseVar.getClass();
        sfa sfaVar2 = sfaVar.q;
        ng5 ng5Var = sfaVar.G;
        List list2 = r66.a;
        if (sfaVar2 == null || sfaVar.o != 2) {
            str = sfaVar.g;
            c46VarC = sfaVar.n;
            list = sfaVar.D;
            if (list != null) {
                list2 = list;
            }
        } else {
            str = sfaVar2.g;
            c46VarC = sfaVar2.n;
            if (c46VarC != null) {
                List list3 = (List) c46VarC.a;
                if (list3 != null) {
                    List list4 = list3;
                    ArrayList arrayList = new ArrayList(yw3.W0(list4, 10));
                    Iterator it = list4.iterator();
                    while (it.hasNext()) {
                        c60 c60VarJ = ((e70) it.next()).j();
                        c60VarJ.l = UUID.randomUUID().toString();
                        arrayList.add(c60VarJ.a());
                    }
                    f70 f70VarP = c46VarC.p();
                    f70VarP.a = arrayList;
                    f70VarP.c();
                }
                if (list3 != null) {
                    List<e70> list5 = list3;
                    ArrayList arrayList2 = new ArrayList(yw3.W0(list5, 10));
                    for (e70 e70VarA : list5) {
                        if (e70VarA.q.i()) {
                            c60 c60VarJ2 = e70VarA.j();
                            c60VarJ2.i = u60.a;
                            e70VarA = c60VarJ2.a();
                        }
                        arrayList2.add(e70VarA);
                    }
                    f70 f70VarP2 = c46VarC.p();
                    f70VarP2.a = arrayList2;
                    c46VarC = f70VarP2.c();
                }
            } else {
                c46VarC = null;
            }
            list = sfaVar2.D;
            if (list != null) {
                list2 = list;
            }
        }
        List list6 = list2;
        String str2 = str;
        c46 c46Var = c46VarC;
        long j = sfaVar.f;
        int iA = pm9.a(c46Var);
        boolean z = sfaVar.u;
        long j2 = sfaVar.A;
        int i = sfaVar.B;
        long j3 = sfaVar.C;
        long j4 = sfaVar2 != null ? sfaVar2.a : 0L;
        int i2 = sfaVar.o;
        long j5 = sfaVar.p;
        String str3 = sfaVar.r;
        String str4 = sfaVar.s;
        String str5 = sfaVar.t;
        int i3 = sfaVar.I;
        long j6 = sfaVar.x;
        long j7 = sfaVar.y;
        kja kjaVar = sfaVar.E;
        Long lValueOf = ng5Var != null ? Long.valueOf(ng5Var.b()) : null;
        Boolean boolValueOf = ng5Var != null ? Boolean.valueOf(ng5Var.a()) : null;
        long j8 = sfaVar.c;
        long j9 = sfaVar.k;
        long j10 = sfaVar.e;
        long j11 = sfaVar.h;
        gga ggaVar = new gga(0L, 0L, j8, 0L, j10, j, str2, xfa.SENDING, wja.ACTIVE, j9, c46Var, iA, z, i2, j4, false, j5, str3, str4, str5, i3, j6, j7, sfaVar.J, j11, sfaVar.v, 0, j2, i, j3, list6, kjaVar, lValueOf, boolValueOf, sfaVar.F);
        toa toaVar = (toa) oseVar.h();
        return ((Number) ch3.G(toaVar.a, false, true, new iaa(toaVar, 7, ggaVar))).longValue();
    }

    public final void F(wzj wzjVar) {
        wzjVar.c(this);
    }

    public long G(rt2 rt2Var, long j, String str) {
        long j2;
        long j3;
        long j4 = rt2Var.b.a;
        long jT = ((s7f) m()).t();
        long j5 = 0;
        if (rt2Var.h0()) {
            if (!rt2Var.y0()) {
                vg4 vg4VarW = rt2Var.w();
                jT = vg4VarW != null ? vg4VarW.v() : 0L;
            }
            if (jT != 0) {
                j2 = 0;
                j3 = 0;
            } else {
                j2 = j4;
                j3 = 0;
            }
            j5 = jT;
        } else {
            j2 = j4;
            j3 = 0;
        }
        long j6 = rt2Var.a;
        njf njfVar = this.a;
        if (njfVar == null) {
            njfVar = null;
        }
        wmi wmiVarI = njfVar.i();
        njf njfVar2 = this.a;
        if (njfVar2 == null) {
            njfVar2 = null;
        }
        long j7 = j3;
        yab.i0(wmiVarI, ((n0c) njfVar2.f()).b(), 0, new i20(this, j6, (lq4) null, 26), 2);
        if (!rt2Var.y0()) {
            qw2 qw2VarC = c();
            long j8 = this.c;
            qw2VarC.getClass();
            qw2VarC.v(j8, false, new hw2(false, 0));
        }
        String str2 = this.b;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str2, zo5.j(j, "Service task finish process and call msgSend, msgId = "), null);
            }
        }
        pvb pvbVarB = b();
        long j9 = rt2Var.a;
        long j10 = this.e;
        boolean z = this.f;
        if (pvbVarB.k(j)) {
            return ((sih) pvbVarB.b.getValue()).c(new n4b(pvbVarB.u().a.g(), j, j9, j2, j5, z, str), false, j10, 1);
        }
        return j7;
    }

    public ilf(long j, eia eiaVar, long j2, boolean z, String str, ng5 ng5Var, g4b g4bVar) {
        this.c = j;
        this.d = eiaVar;
        this.e = j2;
        this.f = z;
        this.g = str;
        this.i = ng5Var;
        this.j = g4bVar;
    }
}
