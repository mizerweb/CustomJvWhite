package defpackage;

import java.util.Collection;
import java.util.List;
import ru.ok.android.onelog.impl.BuildConfig;

/* JADX INFO: loaded from: classes4.dex */
public final class w20 implements s00 {
    public static final /* synthetic */ zv8[] p = {new z8b(w20.class, "getReactionsJob", "getGetReactionsJob()Lkotlinx/coroutines/Job;"), zo5.e(zfe.a, w20.class, "getCommentsJob", "getGetCommentsJob()Lkotlinx/coroutines/Job;")};
    public final long a;
    public final xhh b;
    public final mg5 c;
    public final c7k d;
    public final String e;
    public final ny8 f;
    public final ny8 g;
    public final ny8 h;
    public final ny8 i;
    public final ny8 j;
    public final ny8 k;
    public final ny8 l;
    public final ny8 m;
    public final p3c n = qyj.S();
    public final p3c o = qyj.S();

    public w20(long j, xhh xhhVar, mg5 mg5Var, c7k c7kVar, ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4, ny8 ny8Var5, ny8 ny8Var6, ny8 ny8Var7, ny8 ny8Var8) {
        this.a = j;
        this.b = xhhVar;
        this.c = mg5Var;
        this.d = c7kVar;
        this.e = zo5.j(j, "AsyncMessagesLocalDataSource#");
        this.f = ny8Var3;
        this.g = ny8Var;
        this.h = ny8Var2;
        this.i = ny8Var4;
        this.j = ny8Var5;
        this.k = ny8Var6;
        this.l = ny8Var7;
        this.m = ny8Var8;
    }

    public final rt2 a() {
        xn3 xn3Var = (xn3) this.g.getValue();
        long j = this.a;
        rt2 rt2Var = (rt2) xn3Var.k(j).a.getValue();
        if (rt2Var != null) {
            return rt2Var;
        }
        gm0.Y(this.e, "No chat=" + j + " in cache for loaded messages!");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:62:0x0193  */
    /* JADX WARN: Code duplicated, block: B:66:0x01b0 A[LOOP:0: B:64:0x01aa->B:66:0x01b0, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01d3, code lost:
    
        if (r0 == r8) goto L69;
     */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v5, types: [java.util.List, rt2, vt4] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(defpackage.rt2 r19, java.util.List r20, defpackage.nq4 r21) {
        /*
            Method dump skipped, instruction units count: 477
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w20.b(rt2, java.util.List, nq4):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00b8 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.s00
    public final Object j(Collection collection, nq4 nq4Var) {
        q20 q20Var;
        rt2 rt2Var;
        Object objB;
        if (nq4Var instanceof q20) {
            q20Var = (q20) nq4Var;
            int i = q20Var.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                q20Var.h = i - Integer.MIN_VALUE;
            } else {
                q20Var = new q20(this, nq4Var);
            }
        } else {
            q20Var = new q20(this, nq4Var);
        }
        Object objA = q20Var.f;
        Object obj = hu4.a;
        int i2 = q20Var.h;
        if (i2 == 0) {
            ch3.d0(objA);
            q20Var.d = collection;
            q20Var.h = 1;
            objA = a();
            if (objA != obj) {
            }
            return obj;
        }
        if (i2 == 1) {
            collection = q20Var.d;
            ch3.d0(objA);
        } else {
            if (i2 != 2) {
                if (i2 != 3) {
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                Collection collection2 = q20Var.d;
                ch3.d0(objA);
                return objA;
            }
            rt2Var = q20Var.e;
            Collection collection3 = q20Var.d;
            ch3.d0(objA);
        }
        q20Var.d = null;
        q20Var.e = null;
        q20Var.h = 3;
        objB = b(rt2Var, (List) objA, q20Var);
        if (objB != obj) {
            return obj;
        }
        return objB;
        rt2 rt2Var2 = (rt2) objA;
        if (rt2Var2 == null) {
            return r66.a;
        }
        String str = this.e;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, "getHistoryItems(ids: " + collection + ", itemType: " + this.c + ")", null);
            }
        }
        sua suaVar = (sua) this.i.getValue();
        q20Var.d = null;
        q20Var.e = rt2Var2;
        q20Var.h = 2;
        Object objJ = suaVar.j(collection, q20Var);
        if (objJ != obj) {
            objA = objJ;
            rt2Var = rt2Var2;
            q20Var.d = null;
            q20Var.e = null;
            q20Var.h = 3;
            objB = b(rt2Var, (List) objA, q20Var);
            if (objB != obj) {
                return objB;
            }
        }
        return obj;
    }

    /* JADX WARN: Code duplicated, block: B:57:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v11, types: [java.lang.Throwable, rt2] */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v9 */
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
    @Override // defpackage.s00
    public final Object m(long j, int i, long j2, nq4 nq4Var) {
        s20 s20Var;
        long j3;
        long j4;
        int i2;
        ?? r4;
        Object obj;
        rt2 rt2Var;
        long j5;
        long j6;
        long j7;
        List list;
        String str;
        a4c a4cVar;
        je9 je9Var = je9.d;
        r66 r66Var = r66.a;
        if (nq4Var instanceof s20) {
            s20Var = (s20) nq4Var;
            int i3 = s20Var.k;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                s20Var.k = i3 - Integer.MIN_VALUE;
            } else {
                s20Var = new s20(this, nq4Var);
            }
        } else {
            s20Var = new s20(this, nq4Var);
        }
        s20 s20Var2 = s20Var;
        Object objB = s20Var2.i;
        hu4 hu4Var = hu4.a;
        int i4 = s20Var2.k;
        if (i4 != 0) {
            if (i4 == 1) {
                long j8 = s20Var2.e;
                int i5 = s20Var2.g;
                long j9 = s20Var2.d;
                ch3.d0(objB);
                j4 = j8;
                j3 = j9;
                i2 = i5;
            } else if (i4 == 2) {
                j6 = s20Var2.f;
                j7 = s20Var2.e;
                int i6 = s20Var2.g;
                long j10 = s20Var2.d;
                rt2Var = s20Var2.h;
                ch3.d0(objB);
                j5 = j10;
                i2 = i6;
                obj = hu4Var;
                r4 = 0;
                list = (List) objB;
                str = this.e;
                a4cVar = gm0.f;
                if (a4cVar != 0 && a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, str, zo5.h(list.size(), "getHistoryItemsForward: size="), r4);
                }
                s20Var2.h = r4;
                s20Var2.d = j5;
                s20Var2.g = i2;
                s20Var2.e = j7;
                s20Var2.f = j6;
                s20Var2.k = 3;
                objB = b(rt2Var, list, s20Var2);
                if (objB == obj) {
                    return obj;
                }
            } else {
                if (i4 != 3) {
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(objB);
            }
            return (List) objB;
        }
        ch3.d0(objB);
        j3 = j;
        s20Var2.d = j3;
        s20Var2.g = i;
        s20Var2.e = j2;
        s20Var2.k = 1;
        rt2 rt2VarA = a();
        if (rt2VarA == hu4Var) {
            return hu4Var;
        }
        j4 = j2;
        i2 = i;
        objB = rt2VarA;
        rt2 rt2Var2 = (rt2) objB;
        if (rt2Var2 == null) {
            return r66Var;
        }
        Long l = new Long(j4);
        if (l.longValue() <= 0) {
            l = null;
        }
        long j11 = j4;
        long jLongValue = l != null ? l.longValue() : BuildConfig.MAX_TIME_TO_UPLOAD;
        String str2 = this.e;
        a4c a4cVar2 = gm0.f;
        if (a4cVar2 != null && a4cVar2.b(je9Var)) {
            String strK = vd7.K(new Long(j3));
            mg5 mg5Var = this.c;
            StringBuilder sbR = c0a.r(i2, "getHistoryItemsForward: ", strK, ", \n                |count: ", ", \n                |forwardTimeTo: ");
            sbR.append(jLongValue);
            sbR.append(", \n                |itemType: ");
            sbR.append(mg5Var);
            sbR.append("\n                |");
            a4cVar2.c(je9Var, str2, s5h.y0(sbR.toString()), null);
        }
        if (i2 <= 0) {
            return r66Var;
        }
        sua suaVar = (sua) this.i.getValue();
        long j12 = this.a;
        mg5 mg5Var2 = this.c;
        s20Var2.h = rt2Var2;
        s20Var2.d = j3;
        s20Var2.g = i2;
        s20Var2.e = j11;
        s20Var2.f = jLongValue;
        s20Var2.k = 2;
        long j13 = j3;
        r4 = 0;
        Object objQ = suaVar.q(j12, j13, jLongValue, false, i2, mg5Var2, s20Var2);
        obj = hu4Var;
        if (objQ == obj) {
            return obj;
        }
        rt2Var = rt2Var2;
        objB = objQ;
        j5 = j13;
        j6 = jLongValue;
        j7 = j11;
        list = (List) objB;
        str = this.e;
        a4cVar = gm0.f;
        if (a4cVar != 0) {
            a4cVar.c(je9Var, str, zo5.h(list.size(), "getHistoryItemsForward: size="), r4);
        }
        s20Var2.h = r4;
        s20Var2.d = j5;
        s20Var2.g = i2;
        s20Var2.e = j7;
        s20Var2.f = j6;
        s20Var2.k = 3;
        objB = b(rt2Var, list, s20Var2);
        if (objB == obj) {
            return obj;
        }
        return (List) objB;
    }

    /* JADX WARN: Code duplicated, block: B:57:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v11, types: [java.lang.Throwable, rt2] */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v9 */
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
    @Override // defpackage.s00
    public final Object q(long j, int i, long j2, nq4 nq4Var) {
        r20 r20Var;
        long j3;
        long j4;
        int i2;
        ?? r4;
        Object obj;
        rt2 rt2Var;
        long j5;
        long j6;
        long j7;
        List list;
        String str;
        a4c a4cVar;
        je9 je9Var = je9.d;
        r66 r66Var = r66.a;
        if (nq4Var instanceof r20) {
            r20Var = (r20) nq4Var;
            int i3 = r20Var.k;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                r20Var.k = i3 - Integer.MIN_VALUE;
            } else {
                r20Var = new r20(this, nq4Var);
            }
        } else {
            r20Var = new r20(this, nq4Var);
        }
        r20 r20Var2 = r20Var;
        Object objB = r20Var2.i;
        hu4 hu4Var = hu4.a;
        int i4 = r20Var2.k;
        if (i4 != 0) {
            if (i4 == 1) {
                long j8 = r20Var2.e;
                int i5 = r20Var2.g;
                long j9 = r20Var2.d;
                ch3.d0(objB);
                j4 = j8;
                j3 = j9;
                i2 = i5;
            } else if (i4 == 2) {
                j5 = r20Var2.f;
                j7 = r20Var2.e;
                int i6 = r20Var2.g;
                long j10 = r20Var2.d;
                rt2Var = r20Var2.h;
                ch3.d0(objB);
                j6 = j10;
                i2 = i6;
                obj = hu4Var;
                r4 = 0;
                list = (List) objB;
                str = this.e;
                a4cVar = gm0.f;
                if (a4cVar != 0 && a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, str, zo5.h(list.size(), "getHistoryItemsBackward: size="), r4);
                }
                r20Var2.h = r4;
                r20Var2.d = j6;
                r20Var2.g = i2;
                r20Var2.e = j7;
                r20Var2.f = j5;
                r20Var2.k = 3;
                objB = b(rt2Var, list, r20Var2);
                if (objB == obj) {
                    return obj;
                }
            } else {
                if (i4 != 3) {
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(objB);
            }
            return (List) objB;
        }
        ch3.d0(objB);
        j3 = j;
        r20Var2.d = j3;
        r20Var2.g = i;
        r20Var2.e = j2;
        r20Var2.k = 1;
        rt2 rt2VarA = a();
        if (rt2VarA == hu4Var) {
            return hu4Var;
        }
        j4 = j2;
        i2 = i;
        objB = rt2VarA;
        rt2 rt2Var2 = (rt2) objB;
        if (rt2Var2 == null) {
            return r66Var;
        }
        Long l = new Long(j4);
        if (l.longValue() <= 0) {
            l = null;
        }
        long j11 = j4;
        long jLongValue = l != null ? l.longValue() : Long.MIN_VALUE;
        String str2 = this.e;
        a4c a4cVar2 = gm0.f;
        if (a4cVar2 != null && a4cVar2.b(je9Var)) {
            String strK = vd7.K(new Long(j3));
            mg5 mg5Var = this.c;
            StringBuilder sbR = c0a.r(i2, "getHistoryItemsBackward: ", strK, ", \n                |count: ", ", \n                |backwardTimeFrom: ");
            sbR.append(jLongValue);
            sbR.append(", \n                |itemType: ");
            sbR.append(mg5Var);
            sbR.append("\n                |");
            a4cVar2.c(je9Var, str2, s5h.y0(sbR.toString()), null);
        }
        if (i2 <= 0) {
            return r66Var;
        }
        sua suaVar = (sua) this.i.getValue();
        long j12 = this.a;
        mg5 mg5Var2 = this.c;
        r20Var2.h = rt2Var2;
        r20Var2.d = j3;
        r20Var2.g = i2;
        r20Var2.e = j11;
        r20Var2.f = jLongValue;
        r20Var2.k = 2;
        r4 = 0;
        Object objQ = suaVar.q(j12, jLongValue, j3, true, i2, mg5Var2, r20Var2);
        obj = hu4Var;
        if (objQ == obj) {
            return obj;
        }
        rt2Var = rt2Var2;
        objB = objQ;
        j5 = jLongValue;
        j6 = j3;
        j7 = j11;
        list = (List) objB;
        str = this.e;
        a4cVar = gm0.f;
        if (a4cVar != 0) {
            a4cVar.c(je9Var, str, zo5.h(list.size(), "getHistoryItemsBackward: size="), r4);
        }
        r20Var2.h = r4;
        r20Var2.d = j6;
        r20Var2.g = i2;
        r20Var2.e = j7;
        r20Var2.f = j5;
        r20Var2.k = 3;
        objB = b(rt2Var, list, r20Var2);
        if (objB == obj) {
            return obj;
        }
        return (List) objB;
    }
}
