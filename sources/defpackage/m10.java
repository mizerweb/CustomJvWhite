package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class m10 extends mdh implements qf7 {
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public final /* synthetic */ yf5 k;
    public final /* synthetic */ yf5 l;
    public final /* synthetic */ y10 m;
    public final /* synthetic */ long n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m10(yf5 yf5Var, yf5 yf5Var2, y10 y10Var, long j, lq4 lq4Var) {
        super(2, lq4Var);
        this.k = yf5Var;
        this.l = yf5Var2;
        this.m = y10Var;
        this.n = j;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        return new m10(this.k, this.l, this.m, this.n, lq4Var);
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        return ((m10) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbi.a);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0082  */
    /* JADX WARN: Code duplicated, block: B:26:0x0084  */
    /* JADX WARN: Code duplicated, block: B:28:0x0087  */
    /* JADX WARN: Code duplicated, block: B:29:0x0089  */
    /* JADX WARN: Code duplicated, block: B:34:0x0091  */
    /* JADX WARN: Code duplicated, block: B:43:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:49:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:51:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:53:0x0106  */
    /* JADX WARN: Code duplicated, block: B:55:0x010c  */
    /* JADX WARN: Code duplicated, block: B:56:0x010e  */
    /* JADX WARN: Code duplicated, block: B:59:0x0113  */
    /* JADX WARN: Code duplicated, block: B:63:0x012b  */
    /* JADX WARN: Code duplicated, block: B:66:0x0137  */
    /* JADX WARN: Code duplicated, block: B:68:0x0145  */
    /* JADX WARN: Code duplicated, block: B:70:0x0153  */
    /* JADX WARN: Code duplicated, block: B:73:0x015d  */
    /* JADX WARN: Code duplicated, block: B:76:0x0167  */
    /* JADX WARN: Code duplicated, block: B:79:0x0172  */
    /* JADX WARN: Code duplicated, block: B:82:0x017f  */
    /* JADX WARN: Code duplicated, block: B:87:0x019f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:90:0x01a0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:91:? A[LOOP:0: B:74:0x0161->B:91:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v5, types: [int] */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objP;
        int iIntValue;
        Object objP2;
        int i;
        int iIntValue2;
        int i2;
        int i3;
        boolean z;
        y10 y10Var;
        long j;
        String str;
        a4c a4cVar;
        boolean z2;
        boolean z3;
        int i4;
        int i5;
        int i6;
        ?? r14;
        int i7;
        long jE;
        boolean z4;
        long j2;
        y10 y10Var2;
        boolean z5;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        ?? r15;
        String str2;
        a4c a4cVar2;
        List listE;
        Iterator it;
        je9 je9Var = je9.d;
        sbi sbiVar = sbi.a;
        hu4 hu4Var = hu4.a;
        int i13 = this.j;
        if (i13 == 0) {
            ch3.d0(obj);
            yf5 yf5Var = this.k;
            this.j = 1;
            objP = yf5Var.p(this);
            if (objP != hu4Var) {
            }
            return hu4Var;
        }
        if (i13 == 1) {
            ch3.d0(obj);
            objP = obj;
        } else {
            if (i13 == 2) {
                iIntValue = this.e;
                ch3.d0(obj);
                objP2 = obj;
                i = iIntValue;
                iIntValue2 = ((Number) objP2).intValue();
                if (i > 0) {
                    i2 = 1;
                } else {
                    i2 = 0;
                }
                if (iIntValue2 > 0) {
                    i3 = 1;
                } else {
                    i3 = 0;
                }
                if (i2 == 0 || i3 != 0) {
                    z = true;
                } else {
                    z = false;
                }
                y10Var = this.m;
                qg7 qg7Var = y10Var.b;
                j = this.n;
                str = (String) qg7Var.b;
                a4cVar = gm0.f;
                if (a4cVar != null && a4cVar.b(je9Var)) {
                    long jE2 = y10Var.e();
                    StringBuilder sb = new StringBuilder("loadAroundSync: finish remote fetch, hasNew:");
                    sb.append(z);
                    sb.append(", aroundT:");
                    sb.append(jE2);
                    je9Var = je9Var;
                    a4cVar.c(je9Var, str, qt4.k(j, ", requestT:", sb), null);
                }
                z2 = false;
                z3 = true;
                if (!this.m.y.compareAndSet(false, true)) {
                    y10 y10Var3 = this.m;
                    this.e = i;
                    this.f = iIntValue2;
                    this.g = i2;
                    this.h = i3;
                    this.i = z ? 1 : 0;
                    this.j = 3;
                    y10Var3.d(z);
                    if (sbiVar != hu4Var) {
                        i5 = i3;
                        i6 = z ? 1 : 0;
                        r14 = i6;
                        i4 = i5;
                        i7 = i2;
                        r15 = r14;
                        if (r14 != 0) {
                            jE = this.m.e();
                            z4 = z2;
                            j2 = this.n;
                            if (jE == j2) {
                                y10Var2 = this.m;
                                if (i7 != 0) {
                                    z5 = z3;
                                } else {
                                    z5 = z4;
                                }
                                if (i4 == 0) {
                                    r15 = r14;
                                    r15 = r14;
                                    z3 = z4;
                                }
                                r15 = r14;
                                r15 = r14;
                                this.e = i;
                                this.f = iIntValue2;
                                this.g = i7;
                                this.h = i4;
                                this.i = r14 == true ? 1 : 0;
                                this.j = 4;
                                if (y10.o(y10Var2, j2, z5, z3, this, 2) != hu4Var) {
                                    i8 = i4;
                                    i9 = i7;
                                    i10 = iIntValue2;
                                    i11 = i;
                                    i12 = r14 == true ? 1 : 0;
                                    r15 = i12;
                                    i4 = i8;
                                    i7 = i9;
                                    iIntValue2 = i10;
                                    i = i11;
                                }
                            }
                        }
                        if (r15 == 0) {
                            if (this.m.p.e().isEmpty()) {
                                str2 = (String) this.m.b.b;
                                a4cVar2 = gm0.f;
                                if (a4cVar2 != null) {
                                    a4cVar2.c(je9Var, str2, "loadAroundSync: process emptyData", null);
                                }
                                y10 y10Var4 = this.m;
                                this.e = i;
                                this.f = iIntValue2;
                                this.g = i7;
                                this.h = i4;
                                this.i = r15;
                                this.j = 5;
                                y10Var4.C();
                                if (sbiVar == hu4Var) {
                                }
                            } else {
                                listE = this.m.p.e();
                                if (listE instanceof Collection) {
                                    it = listE.iterator();
                                    while (it.hasNext()) {
                                        if (!(((kw7) it.next()) instanceof jw7)) {
                                        }
                                    }
                                    str2 = (String) this.m.b.b;
                                    a4cVar2 = gm0.f;
                                    if (a4cVar2 != null) {
                                        a4cVar2.c(je9Var, str2, "loadAroundSync: process emptyData", null);
                                    }
                                    y10 y10Var5 = this.m;
                                    this.e = i;
                                    this.f = iIntValue2;
                                    this.g = i7;
                                    this.h = i4;
                                    this.i = r15;
                                    this.j = 5;
                                    y10Var5.C();
                                    if (sbiVar == hu4Var) {
                                    }
                                } else {
                                    it = listE.iterator();
                                    while (it.hasNext()) {
                                        if (!(((kw7) it.next()) instanceof jw7)) {
                                        }
                                    }
                                    str2 = (String) this.m.b.b;
                                    a4cVar2 = gm0.f;
                                    if (a4cVar2 != null) {
                                        a4cVar2.c(je9Var, str2, "loadAroundSync: process emptyData", null);
                                    }
                                    y10 y10Var6 = this.m;
                                    this.e = i;
                                    this.f = iIntValue2;
                                    this.g = i7;
                                    this.h = i4;
                                    this.i = r15;
                                    this.j = 5;
                                    y10Var6.C();
                                    if (sbiVar == hu4Var) {
                                    }
                                }
                            }
                        }
                    }
                } else {
                    i4 = i3;
                    r14 = z;
                    i7 = i2;
                    r15 = r14;
                    if (r14 != 0) {
                        jE = this.m.e();
                        z4 = z2;
                        j2 = this.n;
                        if (jE == j2) {
                            y10Var2 = this.m;
                            if (i7 != 0) {
                                z5 = z3;
                            } else {
                                z5 = z4;
                            }
                            if (i4 == 0) {
                                r15 = r14;
                                r15 = r14;
                                z3 = z4;
                            }
                            r15 = r14;
                            r15 = r14;
                            this.e = i;
                            this.f = iIntValue2;
                            this.g = i7;
                            this.h = i4;
                            this.i = r14 == true ? 1 : 0;
                            this.j = 4;
                            if (y10.o(y10Var2, j2, z5, z3, this, 2) != hu4Var) {
                                i8 = i4;
                                i9 = i7;
                                i10 = iIntValue2;
                                i11 = i;
                                i12 = r14 == true ? 1 : 0;
                                r15 = i12;
                                i4 = i8;
                                i7 = i9;
                                iIntValue2 = i10;
                                i = i11;
                            }
                        }
                    }
                    if (r15 == 0) {
                        if (this.m.p.e().isEmpty()) {
                            listE = this.m.p.e();
                            if (listE instanceof Collection) {
                                it = listE.iterator();
                                while (it.hasNext()) {
                                    if (!(((kw7) it.next()) instanceof jw7)) {
                                    }
                                }
                                str2 = (String) this.m.b.b;
                                a4cVar2 = gm0.f;
                                if (a4cVar2 != null) {
                                    a4cVar2.c(je9Var, str2, "loadAroundSync: process emptyData", null);
                                }
                                y10 y10Var7 = this.m;
                                this.e = i;
                                this.f = iIntValue2;
                                this.g = i7;
                                this.h = i4;
                                this.i = r15;
                                this.j = 5;
                                y10Var7.C();
                                if (sbiVar == hu4Var) {
                                }
                            } else {
                                it = listE.iterator();
                                while (it.hasNext()) {
                                    if (!(((kw7) it.next()) instanceof jw7)) {
                                    }
                                }
                                str2 = (String) this.m.b.b;
                                a4cVar2 = gm0.f;
                                if (a4cVar2 != null) {
                                    a4cVar2.c(je9Var, str2, "loadAroundSync: process emptyData", null);
                                }
                                y10 y10Var8 = this.m;
                                this.e = i;
                                this.f = iIntValue2;
                                this.g = i7;
                                this.h = i4;
                                this.i = r15;
                                this.j = 5;
                                y10Var8.C();
                                if (sbiVar == hu4Var) {
                                }
                            }
                        } else {
                            str2 = (String) this.m.b.b;
                            a4cVar2 = gm0.f;
                            if (a4cVar2 != null) {
                                a4cVar2.c(je9Var, str2, "loadAroundSync: process emptyData", null);
                            }
                            y10 y10Var9 = this.m;
                            this.e = i;
                            this.f = iIntValue2;
                            this.g = i7;
                            this.h = i4;
                            this.i = r15;
                            this.j = 5;
                            y10Var9.C();
                            if (sbiVar == hu4Var) {
                            }
                        }
                    }
                }
                return hu4Var;
            }
            if (i13 == 3) {
                i6 = this.i;
                int i14 = this.h;
                i2 = this.g;
                iIntValue2 = this.f;
                i = this.e;
                ch3.d0(obj);
                i5 = i14;
                z3 = true;
                z2 = false;
                r14 = i6;
                i4 = i5;
                i7 = i2;
                r15 = r14;
                if (r14 != 0) {
                    jE = this.m.e();
                    z4 = z2;
                    j2 = this.n;
                    if (jE == j2) {
                        y10Var2 = this.m;
                        if (i7 != 0) {
                            z5 = z3;
                        } else {
                            z5 = z4;
                        }
                        if (i4 == 0) {
                            r15 = r14;
                            r15 = r14;
                            z3 = z4;
                        }
                        r15 = r14;
                        r15 = r14;
                        this.e = i;
                        this.f = iIntValue2;
                        this.g = i7;
                        this.h = i4;
                        this.i = r14 == true ? 1 : 0;
                        this.j = 4;
                        if (y10.o(y10Var2, j2, z5, z3, this, 2) != hu4Var) {
                            i8 = i4;
                            i9 = i7;
                            i10 = iIntValue2;
                            i11 = i;
                            i12 = r14 == true ? 1 : 0;
                            r15 = i12;
                            i4 = i8;
                            i7 = i9;
                            iIntValue2 = i10;
                            i = i11;
                        }
                    }
                    return hu4Var;
                }
                if (r15 == 0) {
                    if (this.m.p.e().isEmpty()) {
                        listE = this.m.p.e();
                        if (listE instanceof Collection) {
                            it = listE.iterator();
                            while (it.hasNext()) {
                                if (!(((kw7) it.next()) instanceof jw7)) {
                                }
                            }
                            str2 = (String) this.m.b.b;
                            a4cVar2 = gm0.f;
                            if (a4cVar2 != null) {
                                a4cVar2.c(je9Var, str2, "loadAroundSync: process emptyData", null);
                            }
                            y10 y10Var10 = this.m;
                            this.e = i;
                            this.f = iIntValue2;
                            this.g = i7;
                            this.h = i4;
                            this.i = r15;
                            this.j = 5;
                            y10Var10.C();
                            if (sbiVar == hu4Var) {
                                return hu4Var;
                            }
                        } else {
                            it = listE.iterator();
                            while (it.hasNext()) {
                                if (!(((kw7) it.next()) instanceof jw7)) {
                                }
                            }
                            str2 = (String) this.m.b.b;
                            a4cVar2 = gm0.f;
                            if (a4cVar2 != null) {
                                a4cVar2.c(je9Var, str2, "loadAroundSync: process emptyData", null);
                            }
                            y10 y10Var11 = this.m;
                            this.e = i;
                            this.f = iIntValue2;
                            this.g = i7;
                            this.h = i4;
                            this.i = r15;
                            this.j = 5;
                            y10Var11.C();
                            if (sbiVar == hu4Var) {
                                return hu4Var;
                            }
                        }
                    } else {
                        str2 = (String) this.m.b.b;
                        a4cVar2 = gm0.f;
                        if (a4cVar2 != null) {
                            a4cVar2.c(je9Var, str2, "loadAroundSync: process emptyData", null);
                        }
                        y10 y10Var12 = this.m;
                        this.e = i;
                        this.f = iIntValue2;
                        this.g = i7;
                        this.h = i4;
                        this.i = r15;
                        this.j = 5;
                        y10Var12.C();
                        if (sbiVar == hu4Var) {
                            return hu4Var;
                        }
                    }
                }
            } else if (i13 == 4) {
                i12 = this.i;
                i8 = this.h;
                i9 = this.g;
                i10 = this.f;
                i11 = this.e;
                ch3.d0(obj);
                r15 = i12;
                i4 = i8;
                i7 = i9;
                iIntValue2 = i10;
                i = i11;
                if (r15 == 0) {
                    if (this.m.p.e().isEmpty()) {
                        listE = this.m.p.e();
                        if ((listE instanceof Collection) || !listE.isEmpty()) {
                            it = listE.iterator();
                            while (it.hasNext()) {
                                if (!(((kw7) it.next()) instanceof jw7)) {
                                }
                            }
                            str2 = (String) this.m.b.b;
                            a4cVar2 = gm0.f;
                            if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                                a4cVar2.c(je9Var, str2, "loadAroundSync: process emptyData", null);
                            }
                            y10 y10Var13 = this.m;
                            this.e = i;
                            this.f = iIntValue2;
                            this.g = i7;
                            this.h = i4;
                            this.i = r15;
                            this.j = 5;
                            y10Var13.C();
                            if (sbiVar == hu4Var) {
                                return hu4Var;
                            }
                        } else {
                            str2 = (String) this.m.b.b;
                            a4cVar2 = gm0.f;
                            if (a4cVar2 != null) {
                                a4cVar2.c(je9Var, str2, "loadAroundSync: process emptyData", null);
                            }
                            y10 y10Var14 = this.m;
                            this.e = i;
                            this.f = iIntValue2;
                            this.g = i7;
                            this.h = i4;
                            this.i = r15;
                            this.j = 5;
                            y10Var14.C();
                            if (sbiVar == hu4Var) {
                                return hu4Var;
                            }
                        }
                    } else {
                        str2 = (String) this.m.b.b;
                        a4cVar2 = gm0.f;
                        if (a4cVar2 != null) {
                            a4cVar2.c(je9Var, str2, "loadAroundSync: process emptyData", null);
                        }
                        y10 y10Var15 = this.m;
                        this.e = i;
                        this.f = iIntValue2;
                        this.g = i7;
                        this.h = i4;
                        this.i = r15;
                        this.j = 5;
                        y10Var15.C();
                        if (sbiVar == hu4Var) {
                            return hu4Var;
                        }
                    }
                }
            } else {
                if (i13 != 5) {
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj);
            }
        }
        return sbiVar;
        iIntValue = ((Number) objP).intValue();
        yf5 yf5Var2 = this.l;
        this.e = iIntValue;
        this.j = 2;
        objP2 = yf5Var2.p(this);
        if (objP2 != hu4Var) {
            i = iIntValue;
            iIntValue2 = ((Number) objP2).intValue();
            if (i > 0) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            if (iIntValue2 > 0) {
                i3 = 1;
            } else {
                i3 = 0;
            }
            if (i2 == 0) {
                z = true;
            } else {
                z = true;
            }
            y10Var = this.m;
            qg7 qg7Var2 = y10Var.b;
            j = this.n;
            str = (String) qg7Var2.b;
            a4cVar = gm0.f;
            if (a4cVar != null) {
                long jE3 = y10Var.e();
                StringBuilder sb2 = new StringBuilder("loadAroundSync: finish remote fetch, hasNew:");
                sb2.append(z);
                sb2.append(", aroundT:");
                sb2.append(jE3);
                je9Var = je9Var;
                a4cVar.c(je9Var, str, qt4.k(j, ", requestT:", sb2), null);
            }
            z2 = false;
            z3 = true;
            if (!this.m.y.compareAndSet(false, true)) {
                i4 = i3;
                r14 = z;
                i7 = i2;
                r15 = r14;
                if (r14 != 0) {
                    jE = this.m.e();
                    z4 = z2;
                    j2 = this.n;
                    if (jE == j2) {
                        y10Var2 = this.m;
                        if (i7 != 0) {
                            z5 = z3;
                        } else {
                            z5 = z4;
                        }
                        if (i4 == 0) {
                            r15 = r14;
                            r15 = r14;
                            z3 = z4;
                        }
                        r15 = r14;
                        r15 = r14;
                        this.e = i;
                        this.f = iIntValue2;
                        this.g = i7;
                        this.h = i4;
                        this.i = r14 == true ? 1 : 0;
                        this.j = 4;
                        if (y10.o(y10Var2, j2, z5, z3, this, 2) != hu4Var) {
                            i8 = i4;
                            i9 = i7;
                            i10 = iIntValue2;
                            i11 = i;
                            i12 = r14 == true ? 1 : 0;
                            r15 = i12;
                            i4 = i8;
                            i7 = i9;
                            iIntValue2 = i10;
                            i = i11;
                        }
                    }
                }
                if (r15 == 0) {
                    if (this.m.p.e().isEmpty()) {
                        listE = this.m.p.e();
                        if (listE instanceof Collection) {
                            it = listE.iterator();
                            while (it.hasNext()) {
                                if (!(((kw7) it.next()) instanceof jw7)) {
                                }
                            }
                            str2 = (String) this.m.b.b;
                            a4cVar2 = gm0.f;
                            if (a4cVar2 != null) {
                                a4cVar2.c(je9Var, str2, "loadAroundSync: process emptyData", null);
                            }
                            y10 y10Var16 = this.m;
                            this.e = i;
                            this.f = iIntValue2;
                            this.g = i7;
                            this.h = i4;
                            this.i = r15;
                            this.j = 5;
                            y10Var16.C();
                            if (sbiVar == hu4Var) {
                            }
                        } else {
                            it = listE.iterator();
                            while (it.hasNext()) {
                                if (!(((kw7) it.next()) instanceof jw7)) {
                                }
                            }
                            str2 = (String) this.m.b.b;
                            a4cVar2 = gm0.f;
                            if (a4cVar2 != null) {
                                a4cVar2.c(je9Var, str2, "loadAroundSync: process emptyData", null);
                            }
                            y10 y10Var17 = this.m;
                            this.e = i;
                            this.f = iIntValue2;
                            this.g = i7;
                            this.h = i4;
                            this.i = r15;
                            this.j = 5;
                            y10Var17.C();
                            if (sbiVar == hu4Var) {
                            }
                        }
                    } else {
                        str2 = (String) this.m.b.b;
                        a4cVar2 = gm0.f;
                        if (a4cVar2 != null) {
                            a4cVar2.c(je9Var, str2, "loadAroundSync: process emptyData", null);
                        }
                        y10 y10Var18 = this.m;
                        this.e = i;
                        this.f = iIntValue2;
                        this.g = i7;
                        this.h = i4;
                        this.i = r15;
                        this.j = 5;
                        y10Var18.C();
                        if (sbiVar == hu4Var) {
                        }
                    }
                }
                return sbiVar;
            }
            y10 y10Var19 = this.m;
            this.e = i;
            this.f = iIntValue2;
            this.g = i2;
            this.h = i3;
            this.i = z ? 1 : 0;
            this.j = 3;
            y10Var19.d(z);
            if (sbiVar != hu4Var) {
                i5 = i3;
                i6 = z ? 1 : 0;
                r14 = i6;
                i4 = i5;
                i7 = i2;
                r15 = r14;
                if (r14 != 0) {
                    jE = this.m.e();
                    z4 = z2;
                    j2 = this.n;
                    if (jE == j2) {
                        y10Var2 = this.m;
                        if (i7 != 0) {
                            z5 = z3;
                        } else {
                            z5 = z4;
                        }
                        if (i4 == 0) {
                            r15 = r14;
                            r15 = r14;
                            z3 = z4;
                        }
                        r15 = r14;
                        r15 = r14;
                        this.e = i;
                        this.f = iIntValue2;
                        this.g = i7;
                        this.h = i4;
                        this.i = r14 == true ? 1 : 0;
                        this.j = 4;
                        if (y10.o(y10Var2, j2, z5, z3, this, 2) != hu4Var) {
                            i8 = i4;
                            i9 = i7;
                            i10 = iIntValue2;
                            i11 = i;
                            i12 = r14 == true ? 1 : 0;
                            r15 = i12;
                            i4 = i8;
                            i7 = i9;
                            iIntValue2 = i10;
                            i = i11;
                        }
                    }
                }
                if (r15 == 0) {
                    if (this.m.p.e().isEmpty()) {
                        listE = this.m.p.e();
                        if (listE instanceof Collection) {
                            it = listE.iterator();
                            while (it.hasNext()) {
                                if (!(((kw7) it.next()) instanceof jw7)) {
                                }
                            }
                            str2 = (String) this.m.b.b;
                            a4cVar2 = gm0.f;
                            if (a4cVar2 != null) {
                                a4cVar2.c(je9Var, str2, "loadAroundSync: process emptyData", null);
                            }
                            y10 y10Var110 = this.m;
                            this.e = i;
                            this.f = iIntValue2;
                            this.g = i7;
                            this.h = i4;
                            this.i = r15;
                            this.j = 5;
                            y10Var110.C();
                            if (sbiVar == hu4Var) {
                            }
                        } else {
                            it = listE.iterator();
                            while (it.hasNext()) {
                                if (!(((kw7) it.next()) instanceof jw7)) {
                                }
                            }
                            str2 = (String) this.m.b.b;
                            a4cVar2 = gm0.f;
                            if (a4cVar2 != null) {
                                a4cVar2.c(je9Var, str2, "loadAroundSync: process emptyData", null);
                            }
                            y10 y10Var111 = this.m;
                            this.e = i;
                            this.f = iIntValue2;
                            this.g = i7;
                            this.h = i4;
                            this.i = r15;
                            this.j = 5;
                            y10Var111.C();
                            if (sbiVar == hu4Var) {
                            }
                        }
                    } else {
                        str2 = (String) this.m.b.b;
                        a4cVar2 = gm0.f;
                        if (a4cVar2 != null) {
                            a4cVar2.c(je9Var, str2, "loadAroundSync: process emptyData", null);
                        }
                        y10 y10Var112 = this.m;
                        this.e = i;
                        this.f = iIntValue2;
                        this.g = i7;
                        this.h = i4;
                        this.i = r15;
                        this.j = 5;
                        y10Var112.C();
                        if (sbiVar == hu4Var) {
                        }
                    }
                }
                return sbiVar;
            }
        }
        return hu4Var;
    }
}
