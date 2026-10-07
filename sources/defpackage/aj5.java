package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class aj5 {
    public final String a = aj5.class.getName();
    public final ny8 b;
    public final ny8 c;
    public final ny8 d;
    public final ny8 e;
    public final ny8 f;
    public final r8e g;

    public aj5(ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4, ny8 ny8Var5) {
        this.b = ny8Var;
        this.c = ny8Var3;
        this.d = ny8Var4;
        this.e = ny8Var2;
        this.f = ny8Var5;
        this.g = ((asg) ny8Var2.getValue()).f;
    }

    /* JADX WARN: Code duplicated, block: B:70:0x0172 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v5, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r23v3, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r5v3, types: [a4c] */
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
    public final Object a(azg azgVar, long j, nq4 nq4Var) {
        ji5 ji5Var;
        aj5 aj5Var;
        Integer num;
        boolean z;
        Object objJ;
        azg azgVar2 = azgVar;
        long j2 = j;
        sbi sbiVar = sbi.a;
        if (nq4Var instanceof ji5) {
            ji5Var = (ji5) nq4Var;
            int i = ji5Var.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                ji5Var.h = i - Integer.MIN_VALUE;
                aj5Var = this;
            } else {
                aj5Var = this;
                ji5Var = new ji5(aj5Var, nq4Var);
            }
        } else {
            aj5Var = this;
            ji5Var = new ji5(aj5Var, nq4Var);
        }
        Object obj = ji5Var.f;
        hu4 hu4Var = hu4.a;
        int i2 = ji5Var.h;
        Integer num2 = null;
        boolean z2 = true;
        if (i2 == 0) {
            ch3.d0(obj);
            asg asgVarE = aj5Var.e();
            ji5Var.d = azgVar2;
            ji5Var.e = j2;
            ji5Var.h = 1;
            je9 je9Var = je9.f;
            ozg ozgVar = (ozg) ((Map) asgVarE.e.getValue()).get(new Long(azgVar2.a()));
            if (ozgVar == null) {
                String str = asgVarE.c;
                a4c a4cVar = gm0.f;
                if (a4cVar != null && a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, str, "removeStoryPreview: no preview for storyOwner=" + azgVar2, null);
                }
            } else {
                upc upcVar = (upc) ((Map) asgVarE.d.getValue()).get(azgVar2);
                if (upcVar == null) {
                    String str2 = asgVarE.c;
                    a4c a4cVar2 = gm0.f;
                    if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                        a4cVar2.c(je9Var, str2, "removeStoryPreview: no content cache for storyOwner=" + azgVar2, null);
                    }
                } else {
                    Iterator it = upcVar.d().values().iterator();
                    int i3 = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            num = num2;
                            z = z2;
                            i3 = -1;
                            break;
                        }
                        Object next = it.next();
                        if (i3 < 0) {
                            ?? r23 = num2;
                            xw3.V0();
                            throw r23;
                        }
                        num = num2;
                        z = z2;
                        if (((hyg) next).a == j2) {
                            break;
                        }
                        i3++;
                        num2 = num;
                        z2 = z;
                    }
                    Integer num3 = new Integer(i3);
                    if (num3.intValue() < 0) {
                        num3 = num;
                    }
                    if (num3 != null) {
                        int iIntValue = num3.intValue();
                        short s = ozgVar.d;
                        boolean z3 = s > iIntValue ? z : false;
                        int i4 = ozgVar.c - 1;
                        if (i4 <= 0) {
                            objJ = asgVarE.n(azgVar2, ji5Var);
                            if (objJ != hu4Var) {
                            }
                        } else {
                            objJ = asgVarE.j(cqb.c(ozg.a(ozgVar, (short) i4, (z3 ? new Integer(s - 1) : new Short(s)).shortValue(), 0, 51)), false, ji5Var);
                            if (objJ != hu4Var) {
                            }
                        }
                        if (objJ == hu4Var) {
                            return hu4Var;
                        }
                    } else {
                        String str3 = asgVarE.c;
                        ?? r5 = gm0.f;
                        if (r5 != 0 && r5.b(je9Var)) {
                            r5.c(je9Var, str3, "removeStoryPreview: no story in cache for storyOwner=" + azgVar2 + " storyId=" + j2, num);
                        }
                    }
                }
            }
            objJ = sbiVar;
            if (objJ == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            long j3 = ji5Var.e;
            azg azgVar3 = ji5Var.d;
            ch3.d0(obj);
            azgVar2 = azgVar3;
            j2 = j3;
        }
        aj5Var.e().p(j2, azgVar2);
        return sbiVar;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0096  */
    /* JADX WARN: Code duplicated, block: B:34:0x009b  */
    /* JADX WARN: Code duplicated, block: B:39:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:41:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:44:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:48:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:51:0x00e8 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(azg azgVar, long j, nq4 nq4Var) {
        ki5 ki5Var;
        yqg yqgVar;
        azg azgVar2;
        ysg ysgVarH;
        int i;
        asg asgVarE;
        int i2;
        asg asgVarE2;
        if (nq4Var instanceof ki5) {
            ki5Var = (ki5) nq4Var;
            int i3 = ki5Var.j;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                ki5Var.j = i3 - Integer.MIN_VALUE;
            } else {
                ki5Var = new ki5(this, nq4Var);
            }
        } else {
            ki5Var = new ki5(this, nq4Var);
        }
        Object objA = ki5Var.h;
        int i4 = ki5Var.j;
        sbi sbiVar = sbi.a;
        Object obj = hu4.a;
        if (i4 == 0) {
            ch3.d0(objA);
            ki5Var.d = azgVar;
            ki5Var.f = j;
            ki5Var.j = 1;
            objA = f().a(new long[]{j}, ki5Var);
            if (objA != obj) {
            }
            return obj;
        }
        if (i4 == 1) {
            j = ki5Var.f;
            azgVar = ki5Var.d;
            ch3.d0(objA);
        } else {
            if (i4 == 2) {
                long j2 = ki5Var.f;
                yqg yqgVar2 = ki5Var.e;
                azgVar2 = ki5Var.d;
                ch3.d0(objA);
                yqgVar = yqgVar2;
                j = j2;
                e().p(j, azgVar2);
                if (yqgVar != null) {
                    ysgVarH = yqgVar.h();
                } else {
                    ysgVarH = null;
                }
                i = (ysgVarH != null || ysgVarH.c <= 0) ? 0 : 1;
                if (i != 0) {
                    u8b u8bVarC = cqb.c(ysgVarH);
                    ki5Var.d = null;
                    ki5Var.e = null;
                    ki5Var.f = j;
                    ki5Var.g = i;
                    ki5Var.j = 3;
                    objA = n(u8bVarC, ki5Var);
                    if (objA != obj) {
                        i2 = i;
                    }
                } else {
                    asgVarE = e();
                    ki5Var.d = null;
                    ki5Var.e = null;
                    ki5Var.f = j;
                    ki5Var.g = i;
                    ki5Var.j = 5;
                    if (asgVarE.n(azgVar2, ki5Var) == obj) {
                        return sbiVar;
                    }
                }
                return obj;
            }
            if (i4 != 3) {
                if (i4 == 4) {
                    ch3.d0(objA);
                    return sbiVar;
                }
                if (i4 == 5) {
                    ch3.d0(objA);
                    return sbiVar;
                }
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i2 = ki5Var.g;
            j = ki5Var.f;
            ch3.d0(objA);
        }
        asgVarE2 = e();
        ki5Var.d = null;
        ki5Var.e = null;
        ki5Var.f = j;
        ki5Var.g = i2;
        ki5Var.j = 4;
        if (asgVarE2.j((u8b) objA, false, ki5Var) != obj) {
            return obj;
        }
        return sbiVar;
        yqgVar = (yqg) objA;
        i2h i2hVarG = g();
        ki5Var.d = azgVar;
        ki5Var.e = yqgVar;
        ki5Var.f = j;
        ki5Var.j = 2;
        if (i2hVarG.e(j, ki5Var) != obj) {
            azgVar2 = azgVar;
            e().p(j, azgVar2);
            if (yqgVar != null) {
                ysgVarH = yqgVar.h();
            } else {
                ysgVarH = null;
            }
            if (ysgVarH != null) {
            }
            if (i != 0) {
                u8b u8bVarC2 = cqb.c(ysgVarH);
                ki5Var.d = null;
                ki5Var.e = null;
                ki5Var.f = j;
                ki5Var.g = i;
                ki5Var.j = 3;
                objA = n(u8bVarC2, ki5Var);
                if (objA != obj) {
                    i2 = i;
                    asgVarE2 = e();
                    ki5Var.d = null;
                    ki5Var.e = null;
                    ki5Var.f = j;
                    ki5Var.g = i2;
                    ki5Var.j = 4;
                    if (asgVarE2.j((u8b) objA, false, ki5Var) != obj) {
                        return sbiVar;
                    }
                }
            } else {
                asgVarE = e();
                ki5Var.d = null;
                ki5Var.e = null;
                ki5Var.f = j;
                ki5Var.g = i;
                ki5Var.j = 5;
                if (asgVarE.n(azgVar2, ki5Var) == obj) {
                    return sbiVar;
                }
            }
        }
        return obj;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(long j, int i, nq4 nq4Var) {
        li5 li5Var;
        Object value;
        l8b l8bVar;
        if (nq4Var instanceof li5) {
            li5Var = (li5) nq4Var;
            int i2 = li5Var.h;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                li5Var.h = i2 - Integer.MIN_VALUE;
            } else {
                li5Var = new li5(this, nq4Var);
            }
        } else {
            li5Var = new li5(this, nq4Var);
        }
        Object objB = li5Var.f;
        int i3 = li5Var.h;
        if (i3 == 0) {
            ch3.d0(objB);
            ssg ssgVarF = f();
            li5Var.d = j;
            li5Var.e = i;
            li5Var.h = 1;
            objB = ssgVarF.b(j, i, li5Var);
            hu4 hu4Var = hu4.a;
            if (objB == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i3 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = li5Var.e;
            j = li5Var.d;
            ch3.d0(objB);
        }
        if (((frg) objB) == null) {
            return Boolean.FALSE;
        }
        mjg mjgVar = e().i;
        do {
            value = mjgVar.getValue();
            l8b l8bVar2 = (l8b) value;
            l8bVar = new l8b(l8bVar2.e + 1);
            l8bVar.j(l8bVar2);
            l8bVar.i(j, v1h.a(i));
        } while (!mjgVar.h(value, l8bVar));
        return Boolean.TRUE;
    }

    /* JADX WARN: Code duplicated, block: B:64:0x0215  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:92:0x02d7  */
    /* JADX WARN: Code duplicated, block: B:94:0x02e2  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v32, types: [h6g] */
    /* JADX WARN: Type inference failed for: r0v42 */
    /* JADX WARN: Type inference failed for: r10v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r27v10 */
    /* JADX WARN: Type inference failed for: r27v12 */
    /* JADX WARN: Type inference failed for: r27v14 */
    /* JADX WARN: Type inference failed for: r27v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r27v9 */
    /* JADX WARN: Type inference failed for: r28v12 */
    /* JADX WARN: Type inference failed for: r28v13 */
    /* JADX WARN: Type inference failed for: r28v14 */
    /* JADX WARN: Type inference failed for: r28v6 */
    /* JADX WARN: Type inference failed for: r28v7 */
    /* JADX WARN: Type inference failed for: r28v8 */
    /* JADX WARN: Type inference failed for: r28v9 */
    /* JADX WARN: Type inference failed for: r5v0, types: [int] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v19, types: [mw] */
    /* JADX WARN: Type inference failed for: r5v26 */
    /* JADX WARN: Type inference failed for: r5v33 */
    /* JADX WARN: Type inference failed for: r5v34 */
    /* JADX WARN: Type inference failed for: r5v35 */
    /* JADX WARN: Type inference failed for: r5v36 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x0106 -> B:50:0x01bd). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x0108 -> B:32:0x011e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x0163 -> B:39:0x016f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x019a -> B:45:0x01a1). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:64:0x0215 -> B:65:0x0225). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:71:0x0263 -> B:72:0x026a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:85:0x02b0 -> B:84:0x02ad). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:92:0x02d7 -> B:90:0x02d3). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object d(defpackage.m8b r35, defpackage.lq4 r36) {
        /*
            Method dump skipped, instruction units count: 756
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aj5.d(m8b, lq4):java.lang.Object");
    }

    public final asg e() {
        return (asg) this.e.getValue();
    }

    public final ssg f() {
        return (ssg) this.b.getValue();
    }

    public final i2h g() {
        return (i2h) this.f.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0118  */
    /* JADX WARN: Code duplicated, block: B:44:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Serializable h(List list, nq4 nq4Var) {
        ni5 ni5Var;
        ArrayList arrayList;
        m8b m8bVar;
        hu4 hu4Var;
        asg asgVar;
        ArrayList arrayList2;
        m8b m8bVar2;
        if (nq4Var instanceof ni5) {
            ni5Var = (ni5) nq4Var;
            int i = ni5Var.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                ni5Var.i = i - Integer.MIN_VALUE;
            } else {
                ni5Var = new ni5(this, nq4Var);
            }
        } else {
            ni5Var = new ni5(this, nq4Var);
        }
        Object objD = ni5Var.g;
        int i2 = ni5Var.i;
        hu4 hu4Var2 = hu4.a;
        if (i2 != 0) {
            if (i2 == 1) {
                ch3.d0(objD);
            } else if (i2 == 2) {
                asg asgVar2 = ni5Var.f;
                m8b m8bVar3 = ni5Var.e;
                ArrayList arrayList3 = ni5Var.d;
                ch3.d0(objD);
                m8bVar = m8bVar3;
                hu4Var = hu4Var2;
                asgVar = asgVar2;
                arrayList = arrayList3;
                ni5Var.d = arrayList;
                ni5Var.e = m8bVar;
                ni5Var.f = null;
                ni5Var.i = 3;
                if (asgVar.j((u8b) objD, true, ni5Var) == hu4Var) {
                    return hu4Var;
                }
                arrayList2 = arrayList;
                m8bVar2 = m8bVar;
            } else {
                if (i2 != 3) {
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                m8bVar2 = ni5Var.e;
                arrayList2 = ni5Var.d;
                ch3.d0(objD);
            }
            e().c(m8bVar2);
            return arrayList2;
        }
        ch3.d0(objD);
        List list2 = list;
        ArrayList arrayList4 = new ArrayList(yw3.W0(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList4.add(yab.E0((azg) it.next()));
        }
        ssg ssgVarF = f();
        ni5Var.i = 1;
        objD = ssgVarF.c().D(new h3b(arrayList4), ni5Var);
        if (objD == hu4Var2) {
            return hu4Var2;
        }
        jrg jrgVar = (jrg) objD;
        arrayList = new ArrayList();
        u8b u8bVarI = jrgVar.i();
        m8bVar = new m8b();
        u8b u8bVarH = jrgVar.h();
        Object[] objArr = u8bVarH.a;
        int i3 = u8bVarH.b;
        for (int i4 = 0; i4 < i3; i4++) {
            tpc tpcVar = (tpc) objArr[i4];
            upc upcVarE = gvk.e(tpcVar);
            u8b u8bVar = tpcVar.b;
            arrayList.add(upcVarE);
            e().s(yab.G0(tpcVar.a), u8bVar);
            Object[] objArr2 = u8bVar.a;
            int i5 = u8bVar.b;
            int i6 = 0;
            while (i6 < i5) {
                m8bVar.a(((gyg) objArr2[i6]).a);
                i6++;
                hu4Var2 = hu4Var2;
            }
        }
        asg asgVarE = e();
        ni5Var.d = arrayList;
        ni5Var.e = m8bVar;
        ni5Var.f = asgVarE;
        ni5Var.i = 2;
        Object objN = n(u8bVarI, ni5Var);
        hu4Var = hu4Var2;
        if (objN == hu4Var) {
            return hu4Var;
        }
        asgVar = asgVarE;
        objD = objN;
        ni5Var.d = arrayList;
        ni5Var.e = m8bVar;
        ni5Var.f = null;
        ni5Var.i = 3;
        if (asgVar.j((u8b) objD, true, ni5Var) == hu4Var) {
            return hu4Var;
        }
        arrayList2 = arrayList;
        m8bVar2 = m8bVar;
        e().c(m8bVar2);
        return arrayList2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object i(azg azgVar, long[] jArr, nq4 nq4Var) {
        oi5 oi5Var;
        if (nq4Var instanceof oi5) {
            oi5Var = (oi5) nq4Var;
            int i = oi5Var.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                oi5Var.g = i - Integer.MIN_VALUE;
            } else {
                oi5Var = new oi5(this, nq4Var);
            }
        } else {
            oi5Var = new oi5(this, nq4Var);
        }
        Object objD = oi5Var.e;
        int i2 = oi5Var.g;
        if (i2 == 0) {
            ch3.d0(objD);
            wyg wygVarE0 = yab.E0(azgVar);
            ssg ssgVarF = f();
            oi5Var.d = azgVar;
            oi5Var.g = 1;
            objD = ssgVarF.c().D(new h3b(wygVarE0, jArr), oi5Var);
            hu4 hu4Var = hu4.a;
            if (objD == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            azgVar = oi5Var.d;
            ch3.d0(objD);
        }
        krg krgVar = (krg) objD;
        if (krgVar.h().i()) {
            return null;
        }
        e().s(azgVar, krgVar.h());
        LinkedHashMap linkedHashMap = new LinkedHashMap(krgVar.h().b);
        m8b m8bVar = new m8b(krgVar.h().b);
        u8b u8bVarH = krgVar.h();
        Object[] objArr = u8bVarH.a;
        int i3 = u8bVarH.b;
        for (int i4 = 0; i4 < i3; i4++) {
            gyg gygVar = (gyg) objArr[i4];
            hyg hygVarF = gvk.f(gygVar);
            if (hygVarF != null) {
                linkedHashMap.put(new Long(hygVarF.a), hygVarF);
            }
            m8bVar.a(gygVar.a);
        }
        e().c(m8bVar);
        return new upc(azgVar, linkedHashMap);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:35:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:39:0x0102  */
    /* JADX WARN: Code duplicated, block: B:42:0x010f  */
    /* JADX WARN: Code duplicated, block: B:47:0x0140  */
    /* JADX WARN: Code duplicated, block: B:51:0x0165  */
    /* JADX WARN: Code duplicated, block: B:54:0x016f  */
    /* JADX WARN: Code duplicated, block: B:57:0x018e  */
    /* JADX WARN: Code duplicated, block: B:63:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:66:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [i2h] */
    /* JADX WARN: Type inference failed for: r11v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r11v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r1v11, types: [int] */
    /* JADX WARN: Type inference failed for: r1v13, types: [int] */
    /* JADX WARN: Type inference failed for: r1v15, types: [int] */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r3v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r8v1, types: [i2h] */
    /* JADX WARN: Type inference failed for: r8v2, types: [i2h] */
    public final Object j(long j, boolean z, long j2, nq4 nq4Var) {
        pi5 pi5Var;
        long j3;
        int i;
        int i2;
        ?? r3;
        long j4;
        ?? r5;
        boolean z2;
        boolean z3;
        long j5;
        u8b u8bVar;
        u8b u8bVar2;
        ?? r1;
        mrg mrgVar;
        Object objB;
        mrg mrgVar2;
        ?? r6;
        ?? r2;
        ?? r11;
        u8b u8bVar3;
        hu4 hu4Var;
        ?? G;
        long jH;
        ?? G2;
        long jH2;
        ?? r12;
        ?? r4;
        mrg mrgVar3;
        boolean z4 = z;
        long j6 = j2;
        if (nq4Var instanceof pi5) {
            pi5Var = (pi5) nq4Var;
            int i3 = pi5Var.l;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                pi5Var.l = i3 - Integer.MIN_VALUE;
            } else {
                pi5Var = new pi5(this, nq4Var);
            }
        } else {
            pi5Var = new pi5(this, nq4Var);
        }
        pi5 pi5Var2 = pi5Var;
        Object objD = pi5Var2.j;
        int i4 = pi5Var2.l;
        hu4 hu4Var2 = hu4.a;
        switch (i4) {
            case 0:
                ch3.d0(objD);
                int i5 = j6 == 0 ? 1 : 0;
                if (i5 != 0) {
                    i2h i2hVarG = g();
                    pi5Var2.d = j;
                    pi5Var2.f = z4;
                    pi5Var2.e = j6;
                    pi5Var2.g = i5;
                    pi5Var2.l = 1;
                    Object objG = i2hVarG.g(j, z4, pi5Var2);
                    if (objG != hu4Var2) {
                        j3 = j;
                        i2 = i5;
                        objD = objG;
                        z2 = z4;
                        if (((Boolean) objD).booleanValue()) {
                            i2h i2hVarG2 = g();
                            pi5Var2.d = j3;
                            pi5Var2.f = z2;
                            pi5Var2.e = j6;
                            pi5Var2.g = i2;
                            pi5Var2.l = 2;
                            objD = i2hVarG2.c(j3, z2, pi5Var2);
                            if (objD != hu4Var2) {
                                long j7 = j6;
                                z3 = z2 ? 1 : 0;
                                j5 = j7;
                                u8bVar = (u8b) objD;
                                i2h i2hVarG3 = g();
                                pi5Var2.i = u8bVar;
                                pi5Var2.d = j3;
                                pi5Var2.f = z3;
                                pi5Var2.e = j5;
                                pi5Var2.g = i2;
                                pi5Var2.l = 3;
                                objD = i2hVarG3.b(j3, z3, pi5Var2);
                                if (objD != hu4Var2) {
                                    u8bVar2 = u8bVar;
                                    return new kwg(u8bVar2, ((Number) objD).longValue());
                                }
                            }
                        } else {
                            i = i2;
                            r3 = z2;
                            ssg ssgVarF = f();
                            pi5Var2.d = j3;
                            pi5Var2.f = r3;
                            pi5Var2.e = j6;
                            pi5Var2.g = i;
                            pi5Var2.h = r3;
                            pi5Var2.l = 4;
                            objD = ssgVarF.c().D(new lrg((byte) r3, j3, j6), pi5Var2);
                            if (objD != hu4Var2) {
                                ?? r7 = r3;
                                j4 = j6;
                                r5 = r7;
                                r1 = r7;
                                mrgVar = (mrg) objD;
                                u8b u8bVarI = mrgVar.i();
                                m20 m20Var = new m20(this);
                                pi5Var2.i = mrgVar;
                                pi5Var2.d = j3;
                                pi5Var2.f = r5;
                                pi5Var2.e = j4;
                                pi5Var2.g = i;
                                pi5Var2.h = r1;
                                pi5Var2.l = 5;
                                objB = krl.b(u8bVarI, m20Var, pi5Var2);
                                if (objB != hu4Var2) {
                                    mrgVar2 = mrgVar;
                                    objD = objB;
                                    r2 = r1;
                                    r6 = r5;
                                    r11 = r6;
                                    u8bVar3 = (u8b) objD;
                                    if (i != 0) {
                                        hu4Var = hu4Var2;
                                        G2 = g();
                                        jH2 = mrgVar2.h();
                                        pi5Var2.i = mrgVar2;
                                        pi5Var2.d = j3;
                                        pi5Var2.f = r11;
                                        pi5Var2.e = j4;
                                        pi5Var2.g = i;
                                        pi5Var2.h = r2;
                                        pi5Var2.l = 6;
                                        if (G2.k(j3, r11, u8bVar3, jH2, pi5Var2) == hu4Var) {
                                            r4 = r2;
                                            r12 = r11;
                                            return hu4Var;
                                        }
                                    } else {
                                        hu4Var = hu4Var2;
                                        G = g();
                                        jH = mrgVar2.h();
                                        pi5Var2.i = mrgVar2;
                                        pi5Var2.d = j3;
                                        pi5Var2.f = r11;
                                        pi5Var2.e = j4;
                                        pi5Var2.g = i;
                                        pi5Var2.h = r2;
                                        pi5Var2.l = 7;
                                        if (G.a(j3, r11, u8bVar3, jH, pi5Var2) == hu4Var) {
                                            r4 = r2;
                                            r12 = r11;
                                            return hu4Var;
                                        }
                                    }
                                    r4 = r2;
                                    r12 = r11;
                                    r4 = r2;
                                    r12 = r11;
                                    ?? G3 = g();
                                    pi5Var2.i = mrgVar2;
                                    pi5Var2.d = j3;
                                    pi5Var2.f = r12;
                                    pi5Var2.e = j4;
                                    pi5Var2.g = i;
                                    pi5Var2.h = r4;
                                    pi5Var2.l = 8;
                                    objD = G3.c(j3, r12, pi5Var2);
                                    if (objD == hu4Var) {
                                        return hu4Var;
                                    }
                                    mrgVar3 = mrgVar2;
                                    return new kwg((u8b) objD, mrgVar3.h());
                                }
                            }
                        }
                    }
                } else {
                    j3 = j;
                    i = i5;
                    r3 = z4;
                    ssg ssgVarF2 = f();
                    pi5Var2.d = j3;
                    pi5Var2.f = r3;
                    pi5Var2.e = j6;
                    pi5Var2.g = i;
                    pi5Var2.h = r3;
                    pi5Var2.l = 4;
                    objD = ssgVarF2.c().D(new lrg((byte) r3, j3, j6), pi5Var2);
                    if (objD != hu4Var2) {
                        ?? r8 = r3;
                        j4 = j6;
                        r5 = r8;
                        r1 = r8;
                        mrgVar = (mrg) objD;
                        u8b u8bVarI2 = mrgVar.i();
                        m20 m20Var2 = new m20(this);
                        pi5Var2.i = mrgVar;
                        pi5Var2.d = j3;
                        pi5Var2.f = r5;
                        pi5Var2.e = j4;
                        pi5Var2.g = i;
                        pi5Var2.h = r1;
                        pi5Var2.l = 5;
                        objB = krl.b(u8bVarI2, m20Var2, pi5Var2);
                        if (objB != hu4Var2) {
                            mrgVar2 = mrgVar;
                            objD = objB;
                            r2 = r1;
                            r6 = r5;
                            r11 = r6;
                            u8bVar3 = (u8b) objD;
                            if (i != 0) {
                                hu4Var = hu4Var2;
                                G2 = g();
                                jH2 = mrgVar2.h();
                                pi5Var2.i = mrgVar2;
                                pi5Var2.d = j3;
                                pi5Var2.f = r11;
                                pi5Var2.e = j4;
                                pi5Var2.g = i;
                                pi5Var2.h = r2;
                                pi5Var2.l = 6;
                                if (G2.k(j3, r11, u8bVar3, jH2, pi5Var2) == hu4Var) {
                                    r4 = r2;
                                    r12 = r11;
                                    return hu4Var;
                                }
                            } else {
                                hu4Var = hu4Var2;
                                G = g();
                                jH = mrgVar2.h();
                                pi5Var2.i = mrgVar2;
                                pi5Var2.d = j3;
                                pi5Var2.f = r11;
                                pi5Var2.e = j4;
                                pi5Var2.g = i;
                                pi5Var2.h = r2;
                                pi5Var2.l = 7;
                                if (G.a(j3, r11, u8bVar3, jH, pi5Var2) == hu4Var) {
                                    r4 = r2;
                                    r12 = r11;
                                    return hu4Var;
                                }
                            }
                            r4 = r2;
                            r12 = r11;
                            r4 = r2;
                            r12 = r11;
                            ?? G4 = g();
                            pi5Var2.i = mrgVar2;
                            pi5Var2.d = j3;
                            pi5Var2.f = r12;
                            pi5Var2.e = j4;
                            pi5Var2.g = i;
                            pi5Var2.h = r4;
                            pi5Var2.l = 8;
                            objD = G4.c(j3, r12, pi5Var2);
                            if (objD == hu4Var) {
                                return hu4Var;
                            }
                            mrgVar3 = mrgVar2;
                            return new kwg((u8b) objD, mrgVar3.h());
                        }
                    }
                }
                return hu4Var2;
            case 1:
                i2 = pi5Var2.g;
                long j8 = pi5Var2.e;
                boolean z5 = pi5Var2.f;
                j3 = pi5Var2.d;
                ch3.d0(objD);
                z2 = z5;
                j6 = j8;
                if (((Boolean) objD).booleanValue()) {
                    i2h i2hVarG4 = g();
                    pi5Var2.d = j3;
                    pi5Var2.f = z2;
                    pi5Var2.e = j6;
                    pi5Var2.g = i2;
                    pi5Var2.l = 2;
                    objD = i2hVarG4.c(j3, z2, pi5Var2);
                    if (objD != hu4Var2) {
                        long j9 = j6;
                        z3 = z2 ? 1 : 0;
                        j5 = j9;
                        u8bVar = (u8b) objD;
                        i2h i2hVarG5 = g();
                        pi5Var2.i = u8bVar;
                        pi5Var2.d = j3;
                        pi5Var2.f = z3;
                        pi5Var2.e = j5;
                        pi5Var2.g = i2;
                        pi5Var2.l = 3;
                        objD = i2hVarG5.b(j3, z3, pi5Var2);
                        if (objD != hu4Var2) {
                            u8bVar2 = u8bVar;
                            return new kwg(u8bVar2, ((Number) objD).longValue());
                        }
                    }
                } else {
                    i = i2;
                    r3 = z2;
                    ssg ssgVarF3 = f();
                    pi5Var2.d = j3;
                    pi5Var2.f = r3;
                    pi5Var2.e = j6;
                    pi5Var2.g = i;
                    pi5Var2.h = r3;
                    pi5Var2.l = 4;
                    objD = ssgVarF3.c().D(new lrg((byte) r3, j3, j6), pi5Var2);
                    if (objD != hu4Var2) {
                        ?? r9 = r3;
                        j4 = j6;
                        r5 = r9;
                        r1 = r9;
                        mrgVar = (mrg) objD;
                        u8b u8bVarI3 = mrgVar.i();
                        m20 m20Var3 = new m20(this);
                        pi5Var2.i = mrgVar;
                        pi5Var2.d = j3;
                        pi5Var2.f = r5;
                        pi5Var2.e = j4;
                        pi5Var2.g = i;
                        pi5Var2.h = r1;
                        pi5Var2.l = 5;
                        objB = krl.b(u8bVarI3, m20Var3, pi5Var2);
                        if (objB != hu4Var2) {
                            mrgVar2 = mrgVar;
                            objD = objB;
                            r2 = r1;
                            r6 = r5;
                            r11 = r6;
                            u8bVar3 = (u8b) objD;
                            if (i != 0) {
                                hu4Var = hu4Var2;
                                G2 = g();
                                jH2 = mrgVar2.h();
                                pi5Var2.i = mrgVar2;
                                pi5Var2.d = j3;
                                pi5Var2.f = r11;
                                pi5Var2.e = j4;
                                pi5Var2.g = i;
                                pi5Var2.h = r2;
                                pi5Var2.l = 6;
                                if (G2.k(j3, r11, u8bVar3, jH2, pi5Var2) == hu4Var) {
                                    r4 = r2;
                                    r12 = r11;
                                    return hu4Var;
                                }
                            } else {
                                hu4Var = hu4Var2;
                                G = g();
                                jH = mrgVar2.h();
                                pi5Var2.i = mrgVar2;
                                pi5Var2.d = j3;
                                pi5Var2.f = r11;
                                pi5Var2.e = j4;
                                pi5Var2.g = i;
                                pi5Var2.h = r2;
                                pi5Var2.l = 7;
                                if (G.a(j3, r11, u8bVar3, jH, pi5Var2) == hu4Var) {
                                    r4 = r2;
                                    r12 = r11;
                                    return hu4Var;
                                }
                            }
                            r4 = r2;
                            r12 = r11;
                            r4 = r2;
                            r12 = r11;
                            ?? G5 = g();
                            pi5Var2.i = mrgVar2;
                            pi5Var2.d = j3;
                            pi5Var2.f = r12;
                            pi5Var2.e = j4;
                            pi5Var2.g = i;
                            pi5Var2.h = r4;
                            pi5Var2.l = 8;
                            objD = G5.c(j3, r12, pi5Var2);
                            if (objD == hu4Var) {
                                return hu4Var;
                            }
                            mrgVar3 = mrgVar2;
                            return new kwg((u8b) objD, mrgVar3.h());
                        }
                    }
                }
                return hu4Var2;
            case 2:
                i2 = pi5Var2.g;
                j5 = pi5Var2.e;
                z3 = pi5Var2.f;
                j3 = pi5Var2.d;
                ch3.d0(objD);
                u8bVar = (u8b) objD;
                i2h i2hVarG6 = g();
                pi5Var2.i = u8bVar;
                pi5Var2.d = j3;
                pi5Var2.f = z3;
                pi5Var2.e = j5;
                pi5Var2.g = i2;
                pi5Var2.l = 3;
                objD = i2hVarG6.b(j3, z3, pi5Var2);
                if (objD != hu4Var2) {
                    u8bVar2 = u8bVar;
                    return new kwg(u8bVar2, ((Number) objD).longValue());
                }
                return hu4Var2;
            case 3:
                u8bVar2 = (u8b) pi5Var2.i;
                ch3.d0(objD);
                return new kwg(u8bVar2, ((Number) objD).longValue());
            case 4:
                int i6 = pi5Var2.h;
                i = pi5Var2.g;
                j4 = pi5Var2.e;
                boolean z6 = pi5Var2.f;
                j3 = pi5Var2.d;
                ch3.d0(objD);
                r1 = i6;
                r5 = z6;
                mrgVar = (mrg) objD;
                u8b u8bVarI4 = mrgVar.i();
                m20 m20Var4 = new m20(this);
                pi5Var2.i = mrgVar;
                pi5Var2.d = j3;
                pi5Var2.f = r5;
                pi5Var2.e = j4;
                pi5Var2.g = i;
                pi5Var2.h = r1;
                pi5Var2.l = 5;
                objB = krl.b(u8bVarI4, m20Var4, pi5Var2);
                if (objB != hu4Var2) {
                    mrgVar2 = mrgVar;
                    objD = objB;
                    r2 = r1;
                    r6 = r5;
                    r11 = r6;
                    u8bVar3 = (u8b) objD;
                    if (i != 0) {
                        hu4Var = hu4Var2;
                        G2 = g();
                        jH2 = mrgVar2.h();
                        pi5Var2.i = mrgVar2;
                        pi5Var2.d = j3;
                        pi5Var2.f = r11;
                        pi5Var2.e = j4;
                        pi5Var2.g = i;
                        pi5Var2.h = r2;
                        pi5Var2.l = 6;
                        if (G2.k(j3, r11, u8bVar3, jH2, pi5Var2) == hu4Var) {
                            r4 = r2;
                            r12 = r11;
                            return hu4Var;
                        }
                    } else {
                        hu4Var = hu4Var2;
                        G = g();
                        jH = mrgVar2.h();
                        pi5Var2.i = mrgVar2;
                        pi5Var2.d = j3;
                        pi5Var2.f = r11;
                        pi5Var2.e = j4;
                        pi5Var2.g = i;
                        pi5Var2.h = r2;
                        pi5Var2.l = 7;
                        if (G.a(j3, r11, u8bVar3, jH, pi5Var2) == hu4Var) {
                            r4 = r2;
                            r12 = r11;
                            return hu4Var;
                        }
                    }
                    r4 = r2;
                    r12 = r11;
                    r4 = r2;
                    r12 = r11;
                    ?? G6 = g();
                    pi5Var2.i = mrgVar2;
                    pi5Var2.d = j3;
                    pi5Var2.f = r12;
                    pi5Var2.e = j4;
                    pi5Var2.g = i;
                    pi5Var2.h = r4;
                    pi5Var2.l = 8;
                    objD = G6.c(j3, r12, pi5Var2);
                    if (objD == hu4Var) {
                        return hu4Var;
                    }
                    mrgVar3 = mrgVar2;
                    return new kwg((u8b) objD, mrgVar3.h());
                }
                return hu4Var2;
            case 5:
                int i7 = pi5Var2.h;
                i = pi5Var2.g;
                j4 = pi5Var2.e;
                boolean z7 = pi5Var2.f;
                j3 = pi5Var2.d;
                mrgVar2 = (mrg) pi5Var2.i;
                ch3.d0(objD);
                r2 = i7;
                r6 = z7;
                r11 = r6;
                u8bVar3 = (u8b) objD;
                if (i != 0) {
                    hu4Var = hu4Var2;
                    G2 = g();
                    jH2 = mrgVar2.h();
                    pi5Var2.i = mrgVar2;
                    pi5Var2.d = j3;
                    pi5Var2.f = r11;
                    pi5Var2.e = j4;
                    pi5Var2.g = i;
                    pi5Var2.h = r2;
                    pi5Var2.l = 6;
                    if (G2.k(j3, r11, u8bVar3, jH2, pi5Var2) == hu4Var) {
                        r4 = r2;
                        r12 = r11;
                        return hu4Var;
                    }
                } else {
                    hu4Var = hu4Var2;
                    G = g();
                    jH = mrgVar2.h();
                    pi5Var2.i = mrgVar2;
                    pi5Var2.d = j3;
                    pi5Var2.f = r11;
                    pi5Var2.e = j4;
                    pi5Var2.g = i;
                    pi5Var2.h = r2;
                    pi5Var2.l = 7;
                    if (G.a(j3, r11, u8bVar3, jH, pi5Var2) == hu4Var) {
                        r4 = r2;
                        r12 = r11;
                        return hu4Var;
                    }
                }
                r4 = r2;
                r12 = r11;
                r4 = r2;
                r12 = r11;
                ?? G7 = g();
                pi5Var2.i = mrgVar2;
                pi5Var2.d = j3;
                pi5Var2.f = r12;
                pi5Var2.e = j4;
                pi5Var2.g = i;
                pi5Var2.h = r4;
                pi5Var2.l = 8;
                objD = G7.c(j3, r12, pi5Var2);
                if (objD == hu4Var) {
                    return hu4Var;
                }
                mrgVar3 = mrgVar2;
                return new kwg((u8b) objD, mrgVar3.h());
            case 6:
            case 7:
                int i8 = pi5Var2.h;
                i = pi5Var2.g;
                j4 = pi5Var2.e;
                boolean z8 = pi5Var2.f;
                j3 = pi5Var2.d;
                mrgVar2 = (mrg) pi5Var2.i;
                ch3.d0(objD);
                r12 = z8;
                hu4Var = hu4Var2;
                r4 = i8;
                r4 = r2;
                r12 = r11;
                r4 = r2;
                r12 = r11;
                ?? G8 = g();
                pi5Var2.i = mrgVar2;
                pi5Var2.d = j3;
                pi5Var2.f = r12;
                pi5Var2.e = j4;
                pi5Var2.g = i;
                pi5Var2.h = r4;
                pi5Var2.l = 8;
                objD = G8.c(j3, r12, pi5Var2);
                if (objD == hu4Var) {
                    return hu4Var;
                }
                mrgVar3 = mrgVar2;
                return new kwg((u8b) objD, mrgVar3.h());
            case 8:
                mrgVar3 = (mrg) pi5Var2.i;
                ch3.d0(objD);
                return new kwg((u8b) objD, mrgVar3.h());
            default:
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:32:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:35:0x00bb A[PHI: r1 r10 r11 r12
  0x00bb: PHI (r1v4 dsg) = (r1v3 dsg), (r1v3 dsg), (r1v6 dsg) binds: [B:28:0x009f, B:33:0x00b8, B:17:0x003c] A[DONT_GENERATE, DONT_INLINE]
  0x00bb: PHI (r10v6 boolean) = (r10v5 boolean), (r10v5 boolean), (r10v11 boolean) binds: [B:28:0x009f, B:33:0x00b8, B:17:0x003c] A[DONT_GENERATE, DONT_INLINE]
  0x00bb: PHI (r11v3 int) = (r11v2 int), (r11v2 int), (r11v8 int) binds: [B:28:0x009f, B:33:0x00b8, B:17:0x003c] A[DONT_GENERATE, DONT_INLINE]
  0x00bb: PHI (r12v4 u8b) = (r12v3 u8b), (r12v3 u8b), (r12v7 u8b) binds: [B:28:0x009f, B:33:0x00b8, B:17:0x003c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:38:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object k(String str, int i, boolean z, nq4 nq4Var) {
        qi5 qi5Var;
        dsg dsgVar;
        boolean z2;
        u8b u8bVar;
        Object objB;
        dsg dsgVar2;
        asg asgVarE;
        u8b u8bVar2;
        if (nq4Var instanceof qi5) {
            qi5Var = (qi5) nq4Var;
            int i2 = qi5Var.j;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                qi5Var.j = i2 - Integer.MIN_VALUE;
            } else {
                qi5Var = new qi5(this, nq4Var);
            }
        } else {
            qi5Var = new qi5(this, nq4Var);
        }
        Object objD = qi5Var.h;
        int i3 = qi5Var.j;
        Object obj = hu4.a;
        if (i3 == 0) {
            ch3.d0(objD);
            ssg ssgVarF = f();
            qi5Var.f = i;
            qi5Var.g = z;
            qi5Var.j = 1;
            pvb pvbVarC = ssgVarF.c();
            hih kyVar = new ky(kfc.X1, 7);
            kyVar.h("cursor", str);
            kyVar.c(i, "count");
            objD = pvbVarC.D(kyVar, qi5Var);
            if (objD != obj) {
            }
            return obj;
        }
        if (i3 == 1) {
            z = qi5Var.g;
            i = qi5Var.f;
            ch3.d0(objD);
        } else {
            if (i3 == 2) {
                z2 = qi5Var.g;
                i = qi5Var.f;
                dsg dsgVar3 = qi5Var.d;
                ch3.d0(objD);
                dsgVar = dsgVar3;
                u8bVar = (u8b) objD;
                if (z2) {
                    qi5Var.d = dsgVar;
                    qi5Var.e = u8bVar;
                    qi5Var.f = i;
                    qi5Var.g = z2;
                    qi5Var.j = 3;
                    objB = e().b(qi5Var);
                    if (objB != obj) {
                        objB = sbi.a;
                    }
                    if (objB != obj) {
                        int i4 = i;
                        boolean z3 = z2;
                        dsgVar2 = dsgVar;
                        asgVarE = e();
                        qi5Var.d = dsgVar2;
                        qi5Var.e = u8bVar;
                        qi5Var.f = i4;
                        qi5Var.g = z3;
                        qi5Var.j = 4;
                        if (asgVarE.j(u8bVar, true, qi5Var) != obj) {
                            u8bVar2 = u8bVar;
                        }
                    }
                } else {
                    int i5 = i;
                    boolean z4 = z2;
                    dsgVar2 = dsgVar;
                    asgVarE = e();
                    qi5Var.d = dsgVar2;
                    qi5Var.e = u8bVar;
                    qi5Var.f = i5;
                    qi5Var.g = z4;
                    qi5Var.j = 4;
                    if (asgVarE.j(u8bVar, true, qi5Var) != obj) {
                        u8bVar2 = u8bVar;
                    }
                }
                return obj;
            }
            if (i3 == 3) {
                z2 = qi5Var.g;
                i = qi5Var.f;
                u8bVar = qi5Var.e;
                dsgVar = qi5Var.d;
                ch3.d0(objD);
                int i6 = i;
                boolean z5 = z2;
                dsgVar2 = dsgVar;
                asgVarE = e();
                qi5Var.d = dsgVar2;
                qi5Var.e = u8bVar;
                qi5Var.f = i6;
                qi5Var.g = z5;
                qi5Var.j = 4;
                if (asgVarE.j(u8bVar, true, qi5Var) != obj) {
                    u8bVar2 = u8bVar;
                }
                return obj;
            }
            if (i3 != 4) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            u8bVar2 = qi5Var.e;
            dsgVar2 = qi5Var.d;
            ch3.d0(objD);
        }
        return new fzg(u8bVar2, dsgVar2.c);
        dsg dsgVar4 = (dsg) objD;
        u8b u8bVar3 = dsgVar4.d;
        qi5Var.d = dsgVar4;
        qi5Var.f = i;
        qi5Var.g = z;
        qi5Var.j = 2;
        Object objN = n(u8bVar3, qi5Var);
        if (objN != obj) {
            dsgVar = dsgVar4;
            objD = objN;
            z2 = z;
            u8bVar = (u8b) objD;
            if (z2) {
                qi5Var.d = dsgVar;
                qi5Var.e = u8bVar;
                qi5Var.f = i;
                qi5Var.g = z2;
                qi5Var.j = 3;
                objB = e().b(qi5Var);
                if (objB != obj) {
                    objB = sbi.a;
                }
                if (objB != obj) {
                    int i7 = i;
                    boolean z6 = z2;
                    dsgVar2 = dsgVar;
                    asgVarE = e();
                    qi5Var.d = dsgVar2;
                    qi5Var.e = u8bVar;
                    qi5Var.f = i7;
                    qi5Var.g = z6;
                    qi5Var.j = 4;
                    if (asgVarE.j(u8bVar, true, qi5Var) != obj) {
                        u8bVar2 = u8bVar;
                        return new fzg(u8bVar2, dsgVar2.c);
                    }
                }
            } else {
                int i8 = i;
                boolean z7 = z2;
                dsgVar2 = dsgVar;
                asgVarE = e();
                qi5Var.d = dsgVar2;
                qi5Var.e = u8bVar;
                qi5Var.f = i8;
                qi5Var.g = z7;
                qi5Var.j = 4;
                if (asgVarE.j(u8bVar, true, qi5Var) != obj) {
                    u8bVar2 = u8bVar;
                    return new fzg(u8bVar2, dsgVar2.c);
                }
            }
        }
        return obj;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00af A[PHI: r13 r15
  0x00af: PHI (r13v4 long) = (r13v2 long), (r13v7 long) binds: [B:35:0x00ac, B:20:0x004a] A[DONT_GENERATE, DONT_INLINE]
  0x00af: PHI (r15v13 java.lang.Object) = (r15v9 java.lang.Object), (r15v1 java.lang.Object) binds: [B:35:0x00ac, B:20:0x004a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:39:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:42:0x00c8 A[LOOP:0: B:38:0x00ba->B:42:0x00c8, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:46:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:54:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:57:0x0108 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:58:0x00cb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x00cc A[EDGE_INSN: B:59:0x00cc->B:44:0x00cc BREAK  A[LOOP:0: B:38:0x00ba->B:42:0x00c8], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0084, code lost:
    
        if (r15 == r9) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00de, code lost:
    
        if (r15 == r9) goto L56;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object l(long r13, defpackage.nq4 r15) {
        /*
            Method dump skipped, instruction units count: 265
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aj5.l(long, nq4):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:38:0x0121  */
    /* JADX WARN: Code duplicated, block: B:40:0x0132  */
    /* JADX WARN: Code duplicated, block: B:42:0x013c  */
    /* JADX WARN: Code duplicated, block: B:43:0x0143  */
    /* JADX WARN: Code duplicated, block: B:46:0x014c  */
    /* JADX WARN: Code duplicated, block: B:47:0x0150  */
    /* JADX WARN: Code duplicated, block: B:49:0x015a  */
    /* JADX WARN: Code duplicated, block: B:55:0x0181  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a3, code lost:
    
        if (r15 == r2) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0109, code lost:
    
        if (r15 == r2) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x010b, code lost:
    
        return r2;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0109 -> B:35:0x010c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m(defpackage.u8b r14, defpackage.nq4 r15) {
        /*
            Method dump skipped, instruction units count: 431
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aj5.m(u8b, nq4):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object n(u8b u8bVar, nq4 nq4Var) {
        ti5 ti5Var;
        je9 je9Var = je9.f;
        if (nq4Var instanceof ti5) {
            ti5Var = (ti5) nq4Var;
            int i = ti5Var.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                ti5Var.g = i - Integer.MIN_VALUE;
            } else {
                ti5Var = new ti5(this, nq4Var);
            }
        } else {
            ti5Var = new ti5(this, nq4Var);
        }
        Object objD = ti5Var.e;
        Object obj = hu4.a;
        int i2 = ti5Var.g;
        if (i2 == 0) {
            ch3.d0(objD);
            m8b m8bVar = new m8b(u8bVar.b);
            Object[] objArr = u8bVar.a;
            int i3 = u8bVar.b;
            for (int i4 = 0; i4 < i3; i4++) {
                m8bVar.m(((ysg) objArr[i4]).a.a);
            }
            ti5Var.d = u8bVar;
            ti5Var.g = 1;
            objD = d(m8bVar, ti5Var);
            if (objD == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            u8bVar = ti5Var.d;
            ch3.d0(objD);
        }
        Map map = (Map) objD;
        u8b u8bVar2 = new u8b(u8bVar.b);
        Object[] objArr2 = u8bVar.a;
        int i5 = u8bVar.b;
        for (int i6 = 0; i6 < i5; i6++) {
            ysg ysgVar = (ysg) objArr2[i6];
            ozg ozgVarH = gvk.h(ysgVar, map);
            Boolean boolValueOf = ozgVarH != null ? Boolean.valueOf(ozgVarH.g) : null;
            if (cqk.d(boolValueOf, Boolean.TRUE)) {
                u8bVar2.b(ozgVarH);
            } else {
                boolean zD = cqk.d(boolValueOf, Boolean.FALSE);
                String str = this.a;
                if (zD) {
                    a4c a4cVar = gm0.f;
                    if (a4cVar != null && a4cVar.b(je9Var)) {
                        a4cVar.c(je9Var, str, zo5.v(c0a.q(ysgVar.d, ysgVar.a.a, "Skip not valid model for owner = ", ". readCount = "), ", totalCount = ", ysgVar.c), null);
                    }
                } else {
                    a4c a4cVar2 = gm0.f;
                    if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                        wyg wygVar = ysgVar.a;
                        a4cVar2.c(je9Var, str, "We couldn't find contact with id = " + wygVar.a + ", type = " + wygVar.b, null);
                    }
                }
            }
        }
        return u8bVar2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0069, code lost:
    
        if (r10 == r5) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object o(defpackage.azg r7, long r8, defpackage.nq4 r10) {
        /*
            r6 = this;
            boolean r0 = r10 instanceof defpackage.ui5
            if (r0 == 0) goto L13
            r0 = r10
            ui5 r0 = (defpackage.ui5) r0
            int r1 = r0.h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.h = r1
            goto L18
        L13:
            ui5 r0 = new ui5
            r0.<init>(r6, r10)
        L18:
            java.lang.Object r10 = r0.f
            int r1 = r0.h
            r2 = 2
            r3 = 1
            r4 = 0
            hu4 r5 = defpackage.hu4.a
            if (r1 == 0) goto L39
            if (r1 == r3) goto L31
            if (r1 != r2) goto L2b
            defpackage.ch3.d0(r10)
            goto L6c
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ore.k(r6)
            return r4
        L31:
            long r8 = r0.e
            wyg r7 = r0.d
            defpackage.ch3.d0(r10)
            goto L52
        L39:
            defpackage.ch3.d0(r10)
            wyg r10 = defpackage.yab.E0(r7)
            asg r1 = r6.e()
            r0.d = r10
            r0.e = r8
            r0.h = r3
            java.lang.Object r7 = r1.h(r7, r0)
            if (r7 != r5) goto L51
            goto L6b
        L51:
            r7 = r10
        L52:
            ssg r6 = r6.f()
            r0.d = r4
            r0.e = r8
            r0.h = r2
            pvb r6 = r6.c()
            lrg r10 = new lrg
            r10.<init>(r7, r8)
            java.lang.Object r10 = r6.D(r10, r0)
            if (r10 != r5) goto L6c
        L6b:
            return r5
        L6c:
            gsg r10 = (defpackage.gsg) r10
            boolean r6 = r10.h()
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aj5.o(azg, long, nq4):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object p(azg azgVar, long j, k1h k1hVar, nq4 nq4Var) {
        vi5 vi5Var;
        k1h k1hVarE;
        Object objD;
        if (nq4Var instanceof vi5) {
            vi5Var = (vi5) nq4Var;
            int i = vi5Var.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                vi5Var.i = i - Integer.MIN_VALUE;
            } else {
                vi5Var = new vi5(this, nq4Var);
            }
        } else {
            vi5Var = new vi5(this, nq4Var);
        }
        Object obj = vi5Var.g;
        int i2 = vi5Var.i;
        if (i2 == 0) {
            ch3.d0(obj);
            k1hVarE = e().e(azgVar, j, k1hVar);
            wyg wygVarE0 = yab.E0(azgVar);
            cmf cmfVarD = gvk.d(k1hVar);
            ssg ssgVarF = f();
            vi5Var.d = azgVar;
            vi5Var.e = k1hVarE;
            vi5Var.f = j;
            vi5Var.i = 1;
            objD = ssgVarF.c().D(new lrg(wygVarE0, j, cmfVarD), vi5Var);
            hu4 hu4Var = hu4.a;
            if (objD == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j = vi5Var.f;
            k1h k1hVar2 = vi5Var.e;
            azg azgVar2 = vi5Var.d;
            ch3.d0(obj);
            k1hVarE = k1hVar2;
            azgVar = azgVar2;
            objD = obj;
        }
        boolean zH = ((mtg) objD).h();
        if (!zH) {
            e().r(azgVar, j, k1hVarE);
        }
        return Boolean.valueOf(zH);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x007f, code lost:
    
        if (r7.u(r10, r1, r0) == r6) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object q(long r8, defpackage.nq4 r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof defpackage.wi5
            if (r0 == 0) goto L13
            r0 = r10
            wi5 r0 = (defpackage.wi5) r0
            int r1 = r0.h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.h = r1
            goto L18
        L13:
            wi5 r0 = new wi5
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.f
            int r1 = r0.h
            r2 = 0
            r3 = 3
            r4 = 2
            r5 = 1
            hu4 r6 = defpackage.hu4.a
            if (r1 == 0) goto L42
            if (r1 == r5) goto L3c
            if (r1 == r4) goto L34
            if (r1 != r3) goto L2e
            defpackage.ch3.d0(r10)
            goto L82
        L2e:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ore.k(r7)
            return r2
        L34:
            long r8 = r0.d
            u8b r1 = r0.e
            defpackage.ch3.d0(r10)
            goto L6d
        L3c:
            long r8 = r0.d
            defpackage.ch3.d0(r10)
            goto L59
        L42:
            defpackage.ch3.d0(r10)
            zyg r10 = new zyg
            r10.<init>(r8)
            u8b r10 = defpackage.cqb.c(r10)
            r0.d = r8
            r0.h = r5
            java.lang.Object r10 = r7.m(r10, r0)
            if (r10 != r6) goto L59
            goto L81
        L59:
            r1 = r10
            u8b r1 = (defpackage.u8b) r1
            asg r10 = r7.e()
            r0.e = r1
            r0.d = r8
            r0.h = r4
            java.lang.Object r10 = r10.j(r1, r5, r0)
            if (r10 != r6) goto L6d
            goto L81
        L6d:
            asg r7 = r7.e()
            java.util.List r10 = defpackage.c0a.s(r8)
            r0.e = r2
            r0.d = r8
            r0.h = r3
            java.lang.Object r7 = r7.u(r10, r1, r0)
            if (r7 != r6) goto L82
        L81:
            return r6
        L82:
            sbi r7 = defpackage.sbi.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aj5.q(long, nq4):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object r(azg azgVar, long j, nq4 nq4Var) {
        xi5 xi5Var;
        k1h k1hVarE;
        Object objD;
        if (nq4Var instanceof xi5) {
            xi5Var = (xi5) nq4Var;
            int i = xi5Var.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                xi5Var.i = i - Integer.MIN_VALUE;
            } else {
                xi5Var = new xi5(this, nq4Var);
            }
        } else {
            xi5Var = new xi5(this, nq4Var);
        }
        Object obj = xi5Var.g;
        int i2 = xi5Var.i;
        if (i2 == 0) {
            ch3.d0(obj);
            k1hVarE = e().e(azgVar, j, null);
            wyg wygVarE0 = yab.E0(azgVar);
            ssg ssgVarF = f();
            xi5Var.d = azgVar;
            xi5Var.e = k1hVarE;
            xi5Var.f = j;
            xi5Var.i = 1;
            objD = ssgVarF.c().D(new lrg(wygVarE0, j, (cmf) null), xi5Var);
            hu4 hu4Var = hu4.a;
            if (objD == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j = xi5Var.f;
            k1h k1hVar = xi5Var.e;
            azg azgVar2 = xi5Var.d;
            ch3.d0(obj);
            k1hVarE = k1hVar;
            azgVar = azgVar2;
            objD = obj;
        }
        boolean zH = ((mtg) objD).h();
        if (!zH) {
            e().r(azgVar, j, k1hVarE);
        }
        return Boolean.valueOf(zH);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object s(long j, nq4 nq4Var) {
        yi5 yi5Var;
        sbi sbiVar = sbi.a;
        if (nq4Var instanceof yi5) {
            yi5Var = (yi5) nq4Var;
            int i = yi5Var.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                yi5Var.g = i - Integer.MIN_VALUE;
            } else {
                yi5Var = new yi5(this, nq4Var);
            }
        } else {
            yi5Var = new yi5(this, nq4Var);
        }
        Object objQ = yi5Var.e;
        Object obj = hu4.a;
        int i2 = yi5Var.g;
        try {
            if (i2 == 0) {
                ch3.d0(objQ);
                asg asgVarE = e();
                yi5Var.d = j;
                yi5Var.g = 1;
                objQ = asgVarE.q(j, yi5Var);
                if (objQ != obj) {
                }
                return obj;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                long j2 = yi5Var.d;
                ch3.d0(objQ);
                return sbiVar;
            }
            j = yi5Var.d;
            ch3.d0(objQ);
            if (!((Boolean) objQ).booleanValue()) {
                yi5Var.d = j;
                yi5Var.g = 2;
                if (q(j, yi5Var) == obj) {
                    return obj;
                }
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            String str = this.a;
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.f;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, str, nbh.s(j, "restorePreview: point refetch failed for ownerId=", ", will reconcile later"), th);
                }
            }
        }
        return sbiVar;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0266  */
    /* JADX WARN: Code duplicated, block: B:101:0x026b  */
    /* JADX WARN: Code duplicated, block: B:107:0x01a2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:0x018e  */
    /* JADX WARN: Code duplicated, block: B:69:0x0198  */
    /* JADX WARN: Code duplicated, block: B:73:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    /* JADX WARN: Code duplicated, block: B:80:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:83:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:84:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:86:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:91:0x0208  */
    /* JADX WARN: Code duplicated, block: B:94:0x022d  */
    /* JADX WARN: Code duplicated, block: B:96:0x023f  */
    /* JADX WARN: Code duplicated, block: B:97:0x0244  */
    /* JADX WARN: Code duplicated, block: B:98:0x024e  */
    public final Object t(azg azgVar, bxg bxgVar, List list, nq4 nq4Var) {
        zi5 zi5Var;
        Throwable th;
        azg azgVar2;
        Throwable th2;
        l40 l40VarA;
        int i;
        azg azgVar3;
        otg otgVar;
        LinkedHashMap linkedHashMap;
        Object[] objArr;
        int i2;
        int i3;
        asg asgVarE;
        mjg mjgVar;
        Object value;
        Map map;
        upc upcVar;
        String str;
        a4c a4cVar;
        je9 je9Var;
        Integer numValueOf;
        Map mapD;
        upc upcVarA;
        Map mapSingletonMap;
        upc upcVar2;
        String str2;
        a4c a4cVar2;
        hyg hygVarF;
        sbi sbiVar = sbi.a;
        je9 je9Var2 = je9.f;
        if (nq4Var instanceof zi5) {
            zi5Var = (zi5) nq4Var;
            int i4 = zi5Var.h;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                zi5Var.h = i4 - Integer.MIN_VALUE;
            } else {
                zi5Var = new zi5(this, nq4Var);
            }
        } else {
            zi5Var = new zi5(this, nq4Var);
        }
        Object obj = zi5Var.f;
        hu4 hu4Var = hu4.a;
        int i5 = zi5Var.h;
        Throwable th3 = null;
        if (i5 == 0) {
            ch3.d0(obj);
            List<zzg> list2 = list;
            ArrayList arrayList = new ArrayList(yw3.W0(list2, 10));
            for (zzg zzgVar : list2) {
                long jG = zzgVar.g();
                int iB = bxgVar.b();
                String strH = zzgVar.h();
                if (strH == null) {
                    Throwable th4 = th3;
                    ore.p("Required value was null.");
                    return th4;
                }
                if (bxgVar instanceof axg) {
                    k40 k40Var = new k40();
                    th2 = th3;
                    k40Var.a = w50.VIDEO;
                    k40Var.N = strH;
                    k40Var.u = 2;
                    axg axgVar = (axg) bxgVar;
                    if (axgVar.h() > 0) {
                        k40Var.v = Long.valueOf(axgVar.h());
                    }
                    l40VarA = k40Var.a();
                } else {
                    th2 = th3;
                    if (!(bxgVar instanceof ywg) && !(bxgVar instanceof zwg)) {
                        ore.o();
                        return th2;
                    }
                    k40 k40Var2 = new k40();
                    k40Var2.a = w50.PHOTO;
                    k40Var2.h = strH;
                    l40VarA = k40Var2.a();
                }
                arrayList.add(new cjc(jG, iB, l40VarA, (int) bxgVar.c()));
                th3 = th2;
            }
            th = th3;
            ssg ssgVarF = f();
            zi5Var.d = azgVar;
            zi5Var.h = 1;
            Object objD = ssgVarF.c().D(new lrg(arrayList), zi5Var);
            if (objD != hu4Var) {
                obj = objD;
                azgVar2 = azgVar;
            }
            return hu4Var;
        }
        if (i5 == 1) {
            azgVar2 = zi5Var.d;
            ch3.d0(obj);
            th = null;
        } else {
            if (i5 != 2) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            otgVar = zi5Var.e;
            azg azgVar4 = zi5Var.d;
            ch3.d0(obj);
            azgVar3 = azgVar4;
            i = 0;
        }
        linkedHashMap = new LinkedHashMap();
        u8b u8bVarH = otgVar.h();
        objArr = u8bVarH.a;
        i2 = u8bVarH.b;
        for (i3 = i; i3 < i2; i3++) {
            hygVarF = gvk.f((gyg) objArr[i3]);
            if (hygVarF != null) {
                linkedHashMap.put(new Long(hygVarF.a), hygVarF);
            }
        }
        asgVarE = e();
        asgVarE.getClass();
        if (linkedHashMap.isEmpty()) {
            str2 = asgVarE.c;
            a4cVar2 = gm0.f;
            if (a4cVar2 != null && a4cVar2.b(je9Var2)) {
                a4cVar2.c(je9Var2, str2, "We don't have new stories for " + azgVar3, null);
                return sbiVar;
            }
        } else {
            mjgVar = asgVarE.d;
            do {
                value = mjgVar.getValue();
                map = (Map) value;
                upcVar = (upc) map.get(azgVar3);
                str = asgVarE.c;
                a4cVar = gm0.f;
                if (a4cVar == null) {
                    je9Var = je9.e;
                    if (a4cVar.b(je9Var)) {
                        int size = linkedHashMap.size();
                        if (upcVar != null || (mapD = upcVar.d()) == null) {
                            numValueOf = null;
                        } else {
                            numValueOf = Integer.valueOf(mapD.size());
                        }
                        a4cVar.c(je9Var, str, "Owner: " + azgVar3 + ", new stories = " + size + ", cached stories = " + numValueOf, null);
                    }
                }
                if (upcVar == null) {
                    upcVar2 = new upc(azgVar3, linkedHashMap, asgVarE.b.getAsLong(), false);
                    if (map.isEmpty()) {
                        mapSingletonMap = Collections.singletonMap(azgVar3, upcVar2);
                    } else {
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap(map);
                        linkedHashMap2.put(azgVar3, upcVar2);
                        mapSingletonMap = linkedHashMap2;
                    }
                } else {
                    upcVarA = upc.a(upcVar, wm9.T0(upcVar.d(), linkedHashMap), 0L, false, 5);
                    if (map.isEmpty()) {
                        mapSingletonMap = Collections.singletonMap(azgVar3, upcVarA);
                    } else {
                        LinkedHashMap linkedHashMap3 = new LinkedHashMap(map);
                        linkedHashMap3.put(azgVar3, upcVarA);
                        mapSingletonMap = linkedHashMap3;
                    }
                }
            } while (!mjgVar.h(value, mapSingletonMap));
        }
        return sbiVar;
        otg otgVar2 = (otg) obj;
        ysg ysgVarI = otgVar2.i();
        if (ysgVarI == null) {
            String str3 = this.a;
            a4c a4cVar3 = gm0.f;
            if (a4cVar3 != null && a4cVar3.b(je9Var2)) {
                a4cVar3.c(je9Var2, str3, "Something went wrong, we cannot sent preview right now", th);
                return sbiVar;
            }
        } else {
            vg4 vg4Var = (vg4) ((no4) this.d.getValue()).j(ysgVarI.a.a).a.getValue();
            if (!f55.q(vg4Var)) {
                ozg ozgVarG = gvk.g(ysgVarI, vg4Var);
                asg asgVarE2 = e();
                u8b u8bVarC = cqb.c(ozgVarG);
                zi5Var.d = azgVar2;
                zi5Var.e = otgVar2;
                zi5Var.h = 2;
                i = 0;
                if (asgVarE2.j(u8bVarC, false, zi5Var) != hu4Var) {
                    azgVar3 = azgVar2;
                    otgVar = otgVar2;
                    linkedHashMap = new LinkedHashMap();
                    u8b u8bVarH2 = otgVar.h();
                    objArr = u8bVarH2.a;
                    i2 = u8bVarH2.b;
                    while (i3 < i2) {
                        hygVarF = gvk.f((gyg) objArr[i3]);
                        if (hygVarF != null) {
                            linkedHashMap.put(new Long(hygVarF.a), hygVarF);
                        }
                    }
                    asgVarE = e();
                    asgVarE.getClass();
                    if (linkedHashMap.isEmpty()) {
                        str2 = asgVarE.c;
                        a4cVar2 = gm0.f;
                        if (a4cVar2 != null) {
                            a4cVar2.c(je9Var2, str2, "We don't have new stories for " + azgVar3, null);
                            return sbiVar;
                        }
                    } else {
                        mjgVar = asgVarE.d;
                        do {
                            value = mjgVar.getValue();
                            map = (Map) value;
                            upcVar = (upc) map.get(azgVar3);
                            str = asgVarE.c;
                            a4cVar = gm0.f;
                            if (a4cVar == null) {
                                je9Var = je9.e;
                                if (a4cVar.b(je9Var)) {
                                    int size2 = linkedHashMap.size();
                                    if (upcVar != null) {
                                        numValueOf = null;
                                    } else {
                                        numValueOf = null;
                                    }
                                    a4cVar.c(je9Var, str, "Owner: " + azgVar3 + ", new stories = " + size2 + ", cached stories = " + numValueOf, null);
                                }
                            }
                            if (upcVar == null) {
                                upcVar2 = new upc(azgVar3, linkedHashMap, asgVarE.b.getAsLong(), false);
                                if (map.isEmpty()) {
                                    mapSingletonMap = Collections.singletonMap(azgVar3, upcVar2);
                                } else {
                                    LinkedHashMap linkedHashMap4 = new LinkedHashMap(map);
                                    linkedHashMap4.put(azgVar3, upcVar2);
                                    mapSingletonMap = linkedHashMap4;
                                }
                            } else {
                                upcVarA = upc.a(upcVar, wm9.T0(upcVar.d(), linkedHashMap), 0L, false, 5);
                                if (map.isEmpty()) {
                                    mapSingletonMap = Collections.singletonMap(azgVar3, upcVarA);
                                } else {
                                    LinkedHashMap linkedHashMap5 = new LinkedHashMap(map);
                                    linkedHashMap5.put(azgVar3, upcVarA);
                                    mapSingletonMap = linkedHashMap5;
                                }
                            }
                        } while (!mjgVar.h(value, mapSingletonMap));
                    }
                }
                return hu4Var;
            }
            String str4 = this.a;
            a4c a4cVar4 = gm0.f;
            if (a4cVar4 != null && a4cVar4.b(je9Var2)) {
                a4cVar4.c(je9Var2, str4, nbh.s(ysgVarI.a.a, "Couldn't find a contact(#", ") which try to post story"), null);
                return sbiVar;
            }
        }
        return sbiVar;
    }
}
