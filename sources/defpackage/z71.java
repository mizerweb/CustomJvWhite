package defpackage;

import android.net.Uri;
import android.os.SystemClock;
import androidx.media3.datasource.HttpDataSource$InvalidResponseCodeException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.a;

/* JADX INFO: loaded from: classes3.dex */
public final class z71 extends yke {
    public final /* synthetic */ int o;
    public final j6g p;
    public final w71 q;
    public final k15 r;
    public final int s;
    public final rg6 t;
    public final int u;
    public final u25 v;
    public final long w;
    public final pgg x;
    public final w3d y;
    public boolean z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z71(j6g j6gVar, w71 w71Var, aa9 aa9Var, k15 k15Var, ljf ljfVar, int i, int[] iArr, rg6 rg6Var, int i2, u25 u25Var, long j, pgg pggVar, boolean z, ArrayList arrayList, w3d w3dVar, z3d z3dVar, int i3) {
        super(aa9Var, k15Var, ljfVar, i, iArr, rg6Var, i2, u25Var, j, pggVar, z, arrayList, w3dVar, z3dVar);
        this.o = i3;
        this.p = j6gVar;
        this.q = w71Var;
        this.r = k15Var;
        this.s = i;
        this.t = rg6Var;
        this.u = i2;
        this.v = u25Var;
        this.w = j;
        this.x = pggVar;
        this.y = w3dVar;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:103:0x01c0 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:106:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:109:0x01da  */
    /* JADX WARN: Code duplicated, block: B:112:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:115:0x021a  */
    /* JADX WARN: Code duplicated, block: B:117:0x021d  */
    /* JADX WARN: Code duplicated, block: B:121:0x0230  */
    /* JADX WARN: Code duplicated, block: B:123:0x0256  */
    /* JADX WARN: Code duplicated, block: B:12:0x0037  */
    /* JADX WARN: Code duplicated, block: B:169:0x0337  */
    /* JADX WARN: Code duplicated, block: B:178:0x0358  */
    /* JADX WARN: Code duplicated, block: B:181:0x035f  */
    /* JADX WARN: Code duplicated, block: B:182:0x0364  */
    /* JADX WARN: Code duplicated, block: B:184:0x0376  */
    /* JADX WARN: Code duplicated, block: B:188:0x0384 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:189:0x0386 A[LOOP:4: B:185:0x0377->B:189:0x0386, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:190:0x0389  */
    /* JADX WARN: Code duplicated, block: B:192:0x038d  */
    /* JADX WARN: Code duplicated, block: B:193:0x0392  */
    /* JADX WARN: Code duplicated, block: B:194:0x0394  */
    /* JADX WARN: Code duplicated, block: B:196:0x0398  */
    /* JADX WARN: Code duplicated, block: B:197:0x039b  */
    /* JADX WARN: Code duplicated, block: B:200:0x03a0  */
    /* JADX WARN: Code duplicated, block: B:201:0x03a5  */
    /* JADX WARN: Code duplicated, block: B:206:0x03b1  */
    /* JADX WARN: Code duplicated, block: B:209:0x03c1  */
    /* JADX WARN: Code duplicated, block: B:210:0x03c3  */
    /* JADX WARN: Code duplicated, block: B:213:0x03cf  */
    /* JADX WARN: Code duplicated, block: B:214:0x03d1  */
    /* JADX WARN: Code duplicated, block: B:218:0x03f0  */
    /* JADX WARN: Code duplicated, block: B:219:0x03f5  */
    /* JADX WARN: Code duplicated, block: B:221:0x0404  */
    /* JADX WARN: Code duplicated, block: B:222:0x0409  */
    /* JADX WARN: Code duplicated, block: B:224:0x041a  */
    /* JADX WARN: Code duplicated, block: B:225:0x041f  */
    /* JADX WARN: Code duplicated, block: B:228:0x042d  */
    /* JADX WARN: Code duplicated, block: B:230:0x0431  */
    /* JADX WARN: Code duplicated, block: B:233:0x043c  */
    /* JADX WARN: Code duplicated, block: B:267:0x012d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:268:0x0127 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:278:0x0381 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:279:0x0389 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:53:0x0107  */
    /* JADX WARN: Code duplicated, block: B:57:0x0110  */
    /* JADX WARN: Code duplicated, block: B:59:0x011d  */
    /* JADX WARN: Code duplicated, block: B:62:0x012a A[LOOP:1: B:58:0x011b->B:62:0x012a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:66:0x0133  */
    /* JADX WARN: Code duplicated, block: B:68:0x0138  */
    /* JADX WARN: Code duplicated, block: B:70:0x013c  */
    /* JADX WARN: Code duplicated, block: B:71:0x0141  */
    /* JADX WARN: Code duplicated, block: B:74:0x0147  */
    /* JADX WARN: Code duplicated, block: B:75:0x014e  */
    /* JADX WARN: Code duplicated, block: B:83:0x0171  */
    /* JADX WARN: Code duplicated, block: B:85:0x0179  */
    /* JADX WARN: Code duplicated, block: B:86:0x0183  */
    /* JADX WARN: Code duplicated, block: B:88:0x0193  */
    /* JADX WARN: Code duplicated, block: B:89:0x0198  */
    /* JADX WARN: Code duplicated, block: B:92:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:94:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:97:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:98:0x01b7  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.yke, defpackage.e15
    public final void d(fa9 fa9Var, long j, List list, n11 n11Var) {
        q51 q51Var;
        ble bleVar;
        b87 b87Var;
        c98 c98Var;
        int i;
        b87 b87Var2;
        long jB;
        long jD;
        List list2;
        ft9 ft9Var;
        long jK;
        long j2;
        boolean z;
        l4e l4eVar;
        l4e l4eVarE;
        Object obj;
        int i2;
        String str;
        dg8 dg8Var;
        l4e l4eVarA;
        int i3;
        b87 b87VarD;
        Iterator it;
        ble bleVar2;
        ble bleVar3;
        b87 b87Var3;
        int i4;
        int i5;
        b87 b87Var4;
        q51 q51Var2;
        int i6;
        long jB2;
        long jD2;
        ft9 ft9Var2;
        long jK2;
        long j3;
        long jE;
        boolean z2;
        int i7;
        n11 n11Var2;
        int i8;
        int iMin;
        int i9;
        int i10;
        l4e l4eVar2;
        l4e l4eVarE2;
        dg8 dg8VarK;
        b87 b87VarD2;
        Iterator it2;
        ble bleVar4;
        int i11 = this.o;
        pgg pggVar = this.x;
        w71 w71Var = this.q;
        o95[] o95VarArr = this.i;
        w3d w3dVar = this.y;
        long j4 = this.w;
        rg6 rg6Var = this.t;
        k15 k15Var = this.r;
        long jX = -9223372036854775807L;
        int i12 = this.s;
        switch (i11) {
            case 0:
                ve5 ve5Var = rg6Var instanceof ve5 ? (ve5) rg6Var : null;
                if ((ve5Var != null ? ve5Var.g() : null) != null) {
                    super.d(fa9Var, j, list, n11Var);
                } else {
                    long jX2 = vqi.X(j4 != 0 ? SystemClock.elapsedRealtime() + j4 : System.currentTimeMillis());
                    long jX3 = vqi.X(k15Var.b(i12).b) + vqi.X(k15Var.a) + j;
                    if (w3dVar == null || !w3dVar.h(jX3)) {
                        Iterator it3 = a.k1(o95VarArr, new lv5(10)).iterator();
                        o95 o95Var = null;
                        while (it3.hasNext()) {
                            o95 o95Var2 = (o95) it3.next();
                            String strC = w71Var.c(new a35(Uri.parse((o95Var2 == null || (bleVar2 = o95Var2.b) == null) ? null : ((ws0) bleVar2.b.get(0)).a)));
                            if (!this.p.i(0L, 0L, strC)) {
                                it = it3;
                            } else if ((o95Var2 != null ? o95Var2.d : null) == null || o95Var2.d.s(j) <= 0) {
                                it = it3;
                                if (o95Var == null) {
                                    o95Var = o95Var2;
                                } else if ((o95Var2 != null ? o95Var2.b : null) != null && cqk.i(o95Var2.b.a.j, o95Var.b.a.j) > 0) {
                                    o95Var = o95Var2;
                                }
                            } else {
                                l4e l4eVarJ = o95Var2.d.j(o95Var2.g(j));
                                long j5 = l4eVarJ.b;
                                if (j5 >= 0) {
                                    it = it3;
                                    if (this.p.i(l4eVarJ.a, j5, strC)) {
                                        o95Var = o95Var2;
                                        if (o95Var == null) {
                                            super.d(fa9Var, j, list, n11Var);
                                        } else {
                                            q51Var = o95Var.a;
                                            bleVar = o95Var.b;
                                            b87Var = bleVar.a;
                                            c98Var = bleVar.b;
                                            i = rg6Var.m().a;
                                            if (i >= 0) {
                                                i3 = 0;
                                                while (true) {
                                                    b87VarD = rg6Var.d(i3);
                                                    if (b87VarD.equals(b87Var)) {
                                                        b87Var2 = b87VarD;
                                                    } else if (i3 != i) {
                                                        i3++;
                                                    } else {
                                                        b87Var2 = null;
                                                    }
                                                }
                                            } else {
                                                b87Var2 = null;
                                            }
                                            if (b87Var2 == null) {
                                                super.d(fa9Var, j, list, n11Var);
                                            } else {
                                                if (q51Var != null) {
                                                    if (q51Var.j == null) {
                                                        l4eVar = bleVar.e;
                                                    } else {
                                                        l4eVar = null;
                                                    }
                                                    if (o95Var.d == null) {
                                                        l4eVarE = bleVar.e();
                                                    } else {
                                                        l4eVarE = null;
                                                    }
                                                    if (l4eVar == null || l4eVarE != null) {
                                                        obj = new Object();
                                                        if (l4eVar != null) {
                                                            i2 = 0;
                                                            l4eVarA = l4eVar.a(l4eVarE, ((ws0) c98Var.get(0)).a);
                                                            if (l4eVarA != null) {
                                                                l4eVar = l4eVarA;
                                                            }
                                                        } else {
                                                            i2 = 0;
                                                            l4eVar = l4eVarE;
                                                        }
                                                        str = ((ws0) c98Var.get(i2)).a;
                                                        if (l4eVar == null) {
                                                            dg8Var = null;
                                                        } else {
                                                            dg8Var = new dg8(this.v, bql.a(bleVar, str, l4eVar, i2), b87Var2, 2, obj, q51Var);
                                                        }
                                                        n11Var.c = dg8Var;
                                                    }
                                                }
                                                if (o95Var.e() == 0) {
                                                    n11Var.b = true;
                                                } else {
                                                    jB = o95Var.b(jX2);
                                                    jD = o95Var.d(jX2);
                                                    if (list.isEmpty()) {
                                                        list2 = list;
                                                        ft9Var = null;
                                                    } else {
                                                        list2 = list;
                                                        ft9Var = (ft9) list2.get(list.size() - 1);
                                                    }
                                                    if (ft9Var != null) {
                                                        jK = ft9Var.a();
                                                    } else {
                                                        jK = vqi.k(o95Var.g(j), jB, jD);
                                                    }
                                                    if (list2.isEmpty()) {
                                                        j2 = j;
                                                    } else {
                                                        j2 = -9223372036854775807L;
                                                    }
                                                    long jE2 = k15Var.e(0);
                                                    z = jE2 != -9223372036854775807L;
                                                    if (jK <= jD || (this.z && jK >= jD)) {
                                                        n11Var.b = z;
                                                    } else if (!z || o95Var.h(jK) < jE2) {
                                                        o95 o95Var3 = o95Var;
                                                        long j6 = k15Var.a;
                                                        if (j6 != -9223372036854775807L) {
                                                            jX = jX2 - vqi.X(j6 + k15Var.b(i12).b);
                                                        }
                                                        long j7 = jX;
                                                        o95Var3.f(jK);
                                                        o95Var3.h(jK);
                                                        String str2 = vqi.a;
                                                        srk.c(rg6Var.m().c, bleVar.a);
                                                        pggVar.getClass();
                                                        int iMin2 = Math.min(1, (int) ((jD - jK) + 1));
                                                        if (jE2 != -9223372036854775807L) {
                                                            while (iMin2 > 1 && o95Var3.h((((long) iMin2) + jK) - 1) >= jE2) {
                                                                iMin2--;
                                                            }
                                                        }
                                                        n11Var.c = yke.l(o95Var3, this.v, this.u, b87Var2, rg6Var.t(), new Object(), jK, iMin2, j2, j7);
                                                    } else {
                                                        n11Var.b = true;
                                                    }
                                                }
                                            }
                                        }
                                        break;
                                    }
                                } else {
                                    it = it3;
                                }
                            }
                            it3 = it;
                        }
                        if (o95Var == null) {
                            super.d(fa9Var, j, list, n11Var);
                        } else {
                            q51Var = o95Var.a;
                            bleVar = o95Var.b;
                            b87Var = bleVar.a;
                            c98Var = bleVar.b;
                            i = rg6Var.m().a;
                            if (i >= 0) {
                                i3 = 0;
                                while (true) {
                                    b87VarD = rg6Var.d(i3);
                                    if (b87VarD.equals(b87Var)) {
                                        b87Var2 = b87VarD;
                                    } else if (i3 != i) {
                                        i3++;
                                    } else {
                                        b87Var2 = null;
                                    }
                                }
                            } else {
                                b87Var2 = null;
                            }
                            if (b87Var2 == null) {
                                super.d(fa9Var, j, list, n11Var);
                            } else {
                                if (q51Var != null) {
                                    if (q51Var.j == null) {
                                        l4eVar = bleVar.e;
                                    } else {
                                        l4eVar = null;
                                    }
                                    if (o95Var.d == null) {
                                        l4eVarE = bleVar.e();
                                    } else {
                                        l4eVarE = null;
                                    }
                                    if (l4eVar == null) {
                                    }
                                    obj = new Object();
                                    if (l4eVar != null) {
                                        i2 = 0;
                                        l4eVarA = l4eVar.a(l4eVarE, ((ws0) c98Var.get(0)).a);
                                        if (l4eVarA != null) {
                                            l4eVar = l4eVarA;
                                        }
                                    } else {
                                        i2 = 0;
                                        l4eVar = l4eVarE;
                                    }
                                    str = ((ws0) c98Var.get(i2)).a;
                                    if (l4eVar == null) {
                                        dg8Var = null;
                                    } else {
                                        dg8Var = new dg8(this.v, bql.a(bleVar, str, l4eVar, i2), b87Var2, 2, obj, q51Var);
                                    }
                                    n11Var.c = dg8Var;
                                }
                                if (o95Var.e() == 0) {
                                    n11Var.b = true;
                                } else {
                                    jB = o95Var.b(jX2);
                                    jD = o95Var.d(jX2);
                                    if (list.isEmpty()) {
                                        list2 = list;
                                        ft9Var = null;
                                    } else {
                                        list2 = list;
                                        ft9Var = (ft9) list2.get(list.size() - 1);
                                    }
                                    if (ft9Var != null) {
                                        jK = ft9Var.a();
                                    } else {
                                        jK = vqi.k(o95Var.g(j), jB, jD);
                                    }
                                    if (list2.isEmpty()) {
                                        j2 = j;
                                    } else {
                                        j2 = -9223372036854775807L;
                                    }
                                    long jE3 = k15Var.e(0);
                                    if (jE3 != -9223372036854775807L) {
                                    }
                                    if (jK <= jD) {
                                    }
                                    n11Var.b = z;
                                }
                            }
                        }
                    }
                }
                break;
            default:
                ve5 ve5Var2 = rg6Var instanceof ve5 ? (ve5) rg6Var : null;
                if ((ve5Var2 != null ? ve5Var2.g() : null) == null) {
                    long jX4 = vqi.X(j4 != 0 ? SystemClock.elapsedRealtime() + j4 : System.currentTimeMillis());
                    long jX5 = vqi.X(k15Var.b(i12).b) + vqi.X(k15Var.a) + j;
                    if (w3dVar == null || !w3dVar.h(jX5)) {
                        Iterator it4 = a.k1(o95VarArr, new xa8(12)).iterator();
                        o95 o95Var4 = null;
                        while (it4.hasNext()) {
                            o95 o95Var5 = (o95) it4.next();
                            String strC2 = w71Var.c(new a35(Uri.parse((o95Var5 == null || (bleVar4 = o95Var5.b) == null) ? null : ((ws0) bleVar4.b.get(0)).a)));
                            if (!this.p.i(0L, 0L, strC2)) {
                                it2 = it4;
                            } else if ((o95Var5 != null ? o95Var5.d : null) == null || o95Var5.d.s(j) <= 0) {
                                it2 = it4;
                                if (o95Var4 == null) {
                                    o95Var4 = o95Var5;
                                } else if ((o95Var5 != null ? o95Var5.b : null) != null && o95Var5.b.a.j > o95Var4.b.a.j) {
                                    o95Var4 = o95Var5;
                                }
                            } else {
                                l4e l4eVarJ2 = o95Var5.d.j(o95Var5.g(j));
                                long j8 = l4eVarJ2.b;
                                if (j8 >= 0) {
                                    it2 = it4;
                                    if (this.p.i(l4eVarJ2.a, j8, strC2)) {
                                        o95Var4 = o95Var5;
                                        if (o95Var4 == null) {
                                            n11Var2 = null;
                                        } else {
                                            bleVar3 = o95Var4.b;
                                            b87Var3 = bleVar3.a;
                                            i4 = rg6Var.m().a;
                                            i5 = 0;
                                            while (true) {
                                                if (i5 < i4) {
                                                    b87VarD2 = rg6Var.d(i5);
                                                    if (b87VarD2.equals(b87Var3)) {
                                                        b87Var4 = b87VarD2;
                                                    } else {
                                                        i5++;
                                                    }
                                                } else {
                                                    b87Var4 = null;
                                                }
                                            }
                                            if (b87Var4 == null) {
                                                n11Var2 = null;
                                            } else {
                                                q51Var2 = o95Var4.a;
                                                i6 = 4;
                                                if (q51Var2 == null) {
                                                    if (q51Var2.j == null) {
                                                        l4eVar2 = bleVar3.e;
                                                    } else {
                                                        l4eVar2 = null;
                                                    }
                                                    if (o95Var4.d == null) {
                                                        l4eVarE2 = bleVar3.e();
                                                    } else {
                                                        l4eVarE2 = null;
                                                    }
                                                    if (l4eVar2 == null || l4eVarE2 != null) {
                                                        try {
                                                            dg8VarK = yke.k(o95Var4, this.v, b87Var4, 2, new Object(), l4eVar2, l4eVarE2);
                                                        } catch (Exception unused) {
                                                            dg8VarK = null;
                                                        }
                                                        n11 n11Var3 = new n11(i6);
                                                        n11Var3.c = dg8VarK;
                                                        n11Var2 = n11Var3;
                                                        break;
                                                    } else if (o95Var4.e() == 0) {
                                                        n11Var2 = new n11(i6);
                                                        n11Var2.b = true;
                                                    } else {
                                                        jB2 = o95Var4.b(jX4);
                                                        jD2 = o95Var4.d(jX4);
                                                        ft9Var2 = (ft9) ww3.D1(list);
                                                        if (ft9Var2 != null) {
                                                            jK2 = ft9Var2.a();
                                                        } else {
                                                            jK2 = vqi.k(o95Var4.g(j), jB2, jD2);
                                                        }
                                                        if (list.isEmpty()) {
                                                            j3 = j;
                                                        } else {
                                                            j3 = -9223372036854775807L;
                                                        }
                                                        jE = k15Var.e(0);
                                                        if (jE != -9223372036854775807L) {
                                                            z2 = true;
                                                        } else {
                                                            z2 = false;
                                                        }
                                                        if (jK2 > jD2) {
                                                            if (!this.z) {
                                                            }
                                                            if (z2) {
                                                                o95 o95Var6 = o95Var4;
                                                                long j9 = k15Var.a;
                                                                long jX6 = j9 != -9223372036854775807L ? jX4 - vqi.X(j9 + k15Var.b(i12).b) : -9223372036854775807L;
                                                                o95Var6.f(jK2);
                                                                o95Var6.h(jK2);
                                                                String str3 = vqi.a;
                                                                srk.c(rg6Var.m().c, bleVar3.a);
                                                                pggVar.getClass();
                                                                iMin = Math.min(1, (int) ((jD2 - jK2) + 1));
                                                                if (jE != -9223372036854775807L) {
                                                                    i10 = iMin;
                                                                    for (i8 = 1; i10 > i8; i8 = 1) {
                                                                        i10--;
                                                                    }
                                                                    i9 = i10;
                                                                } else {
                                                                    i9 = iMin;
                                                                }
                                                                qr0 qr0VarL = yke.l(o95Var6, this.v, this.u, b87Var4, rg6Var.t(), new Object(), jK2, i9, j3, jX6);
                                                                n11Var2 = new n11(4);
                                                                n11Var2.c = qr0VarL;
                                                            } else {
                                                                o95 o95Var7 = o95Var4;
                                                                long j10 = k15Var.a;
                                                                long jX7 = j10 != -9223372036854775807L ? jX4 - vqi.X(j10 + k15Var.b(i12).b) : -9223372036854775807L;
                                                                o95Var7.f(jK2);
                                                                o95Var7.h(jK2);
                                                                String str4 = vqi.a;
                                                                srk.c(rg6Var.m().c, bleVar3.a);
                                                                pggVar.getClass();
                                                                iMin = Math.min(1, (int) ((jD2 - jK2) + 1));
                                                                if (jE != -9223372036854775807L) {
                                                                    i10 = iMin;
                                                                    while (i10 > i8) {
                                                                        i10--;
                                                                    }
                                                                    i9 = i10;
                                                                } else {
                                                                    i9 = iMin;
                                                                }
                                                                qr0 qr0VarL2 = yke.l(o95Var7, this.v, this.u, b87Var4, rg6Var.t(), new Object(), jK2, i9, j3, jX7);
                                                                n11Var2 = new n11(4);
                                                                n11Var2.c = qr0VarL2;
                                                            }
                                                        } else {
                                                            i7 = 4;
                                                        }
                                                        n11Var2 = new n11(i7);
                                                        n11Var2.b = z2;
                                                    }
                                                } else if (o95Var4.e() == 0) {
                                                    n11Var2 = new n11(i6);
                                                    n11Var2.b = true;
                                                } else {
                                                    jB2 = o95Var4.b(jX4);
                                                    jD2 = o95Var4.d(jX4);
                                                    ft9Var2 = (ft9) ww3.D1(list);
                                                    if (ft9Var2 != null) {
                                                        jK2 = ft9Var2.a();
                                                    } else {
                                                        jK2 = vqi.k(o95Var4.g(j), jB2, jD2);
                                                    }
                                                    if (list.isEmpty()) {
                                                        j3 = j;
                                                    } else {
                                                        j3 = -9223372036854775807L;
                                                    }
                                                    jE = k15Var.e(0);
                                                    if (jE != -9223372036854775807L) {
                                                        z2 = true;
                                                    } else {
                                                        z2 = false;
                                                    }
                                                    if (jK2 > jD2) {
                                                        i7 = 4;
                                                    } else if (!this.z && jK2 >= jD2) {
                                                        i7 = 4;
                                                    } else if (z2 || o95Var4.h(jK2) < jE) {
                                                        o95 o95Var8 = o95Var4;
                                                        long j11 = k15Var.a;
                                                        long jX8 = j11 != -9223372036854775807L ? jX4 - vqi.X(j11 + k15Var.b(i12).b) : -9223372036854775807L;
                                                        o95Var8.f(jK2);
                                                        o95Var8.h(jK2);
                                                        String str5 = vqi.a;
                                                        srk.c(rg6Var.m().c, bleVar3.a);
                                                        pggVar.getClass();
                                                        iMin = Math.min(1, (int) ((jD2 - jK2) + 1));
                                                        if (jE != -9223372036854775807L) {
                                                            i10 = iMin;
                                                            while (i10 > i8 && o95Var8.h((((long) i10) + jK2) - 1) >= jE) {
                                                                i10--;
                                                            }
                                                            i9 = i10;
                                                        } else {
                                                            i9 = iMin;
                                                        }
                                                        qr0 qr0VarL3 = yke.l(o95Var8, this.v, this.u, b87Var4, rg6Var.t(), new Object(), jK2, i9, j3, jX8);
                                                        n11Var2 = new n11(4);
                                                        n11Var2.c = qr0VarL3;
                                                    } else {
                                                        n11Var2 = new n11(4);
                                                        n11Var2.b = true;
                                                    }
                                                    n11Var2 = new n11(i7);
                                                    n11Var2.b = z2;
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    it2 = it4;
                                }
                            }
                            it4 = it2;
                        }
                        if (o95Var4 == null) {
                            n11Var2 = null;
                        } else {
                            bleVar3 = o95Var4.b;
                            b87Var3 = bleVar3.a;
                            i4 = rg6Var.m().a;
                            i5 = 0;
                            while (true) {
                                if (i5 < i4) {
                                    b87VarD2 = rg6Var.d(i5);
                                    if (b87VarD2.equals(b87Var3)) {
                                        b87Var4 = b87VarD2;
                                    } else {
                                        i5++;
                                    }
                                } else {
                                    b87Var4 = null;
                                }
                            }
                            if (b87Var4 == null) {
                                n11Var2 = null;
                            } else {
                                q51Var2 = o95Var4.a;
                                i6 = 4;
                                if (q51Var2 == null) {
                                    if (q51Var2.j == null) {
                                        l4eVar2 = bleVar3.e;
                                    } else {
                                        l4eVar2 = null;
                                    }
                                    if (o95Var4.d == null) {
                                        l4eVarE2 = bleVar3.e();
                                    } else {
                                        l4eVarE2 = null;
                                    }
                                    if (l4eVar2 == null) {
                                    }
                                    dg8VarK = yke.k(o95Var4, this.v, b87Var4, 2, new Object(), l4eVar2, l4eVarE2);
                                    n11 n11Var4 = new n11(i6);
                                    n11Var4.c = dg8VarK;
                                    n11Var2 = n11Var4;
                                } else if (o95Var4.e() == 0) {
                                    n11Var2 = new n11(i6);
                                    n11Var2.b = true;
                                } else {
                                    jB2 = o95Var4.b(jX4);
                                    jD2 = o95Var4.d(jX4);
                                    ft9Var2 = (ft9) ww3.D1(list);
                                    if (ft9Var2 != null) {
                                        jK2 = ft9Var2.a();
                                    } else {
                                        jK2 = vqi.k(o95Var4.g(j), jB2, jD2);
                                    }
                                    if (list.isEmpty()) {
                                        j3 = j;
                                    } else {
                                        j3 = -9223372036854775807L;
                                    }
                                    jE = k15Var.e(0);
                                    if (jE != -9223372036854775807L) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                    if (jK2 > jD2) {
                                        if (!this.z) {
                                        }
                                        if (z2) {
                                            o95 o95Var9 = o95Var4;
                                            long j12 = k15Var.a;
                                            long jX9 = j12 != -9223372036854775807L ? jX4 - vqi.X(j12 + k15Var.b(i12).b) : -9223372036854775807L;
                                            o95Var9.f(jK2);
                                            o95Var9.h(jK2);
                                            String str6 = vqi.a;
                                            srk.c(rg6Var.m().c, bleVar3.a);
                                            pggVar.getClass();
                                            iMin = Math.min(1, (int) ((jD2 - jK2) + 1));
                                            if (jE != -9223372036854775807L) {
                                                i10 = iMin;
                                                while (i10 > i8) {
                                                    i10--;
                                                }
                                                i9 = i10;
                                            } else {
                                                i9 = iMin;
                                            }
                                            qr0 qr0VarL4 = yke.l(o95Var9, this.v, this.u, b87Var4, rg6Var.t(), new Object(), jK2, i9, j3, jX9);
                                            n11Var2 = new n11(4);
                                            n11Var2.c = qr0VarL4;
                                        } else {
                                            o95 o95Var10 = o95Var4;
                                            long j13 = k15Var.a;
                                            long jX10 = j13 != -9223372036854775807L ? jX4 - vqi.X(j13 + k15Var.b(i12).b) : -9223372036854775807L;
                                            o95Var10.f(jK2);
                                            o95Var10.h(jK2);
                                            String str7 = vqi.a;
                                            srk.c(rg6Var.m().c, bleVar3.a);
                                            pggVar.getClass();
                                            iMin = Math.min(1, (int) ((jD2 - jK2) + 1));
                                            if (jE != -9223372036854775807L) {
                                                i10 = iMin;
                                                while (i10 > i8) {
                                                    i10--;
                                                }
                                                i9 = i10;
                                            } else {
                                                i9 = iMin;
                                            }
                                            qr0 qr0VarL5 = yke.l(o95Var10, this.v, this.u, b87Var4, rg6Var.t(), new Object(), jK2, i9, j3, jX10);
                                            n11Var2 = new n11(4);
                                            n11Var2.c = qr0VarL5;
                                        }
                                    } else {
                                        i7 = 4;
                                    }
                                    n11Var2 = new n11(i7);
                                    n11Var2.b = z2;
                                }
                            }
                        }
                    } else {
                        n11Var2 = null;
                    }
                } else {
                    n11Var2 = null;
                }
                if (n11Var2 != null) {
                    n11Var.c = (uq3) n11Var2.c;
                    n11Var.b = n11Var2.b;
                } else {
                    super.d(fa9Var, j, list, n11Var);
                }
                break;
        }
    }

    @Override // defpackage.yke, defpackage.e15
    public final boolean j(uq3 uq3Var, boolean z, mf mfVar, l6m l6mVar) {
        Long lValueOf;
        int i = this.o;
        rg6 rg6Var = this.t;
        o95[] o95VarArr = this.i;
        k15 k15Var = this.r;
        switch (i) {
            case 0:
                IOException iOException = (IOException) mfVar.c;
                if (!k15Var.d && (uq3Var instanceof ft9)) {
                    HttpDataSource$InvalidResponseCodeException httpDataSource$InvalidResponseCodeException = iOException instanceof HttpDataSource$InvalidResponseCodeException ? (HttpDataSource$InvalidResponseCodeException) iOException : null;
                    if (httpDataSource$InvalidResponseCodeException != null && httpDataSource$InvalidResponseCodeException.c == 404) {
                        o95 o95Var = o95VarArr[rg6Var.n(uq3Var.d)];
                        lValueOf = o95Var != null ? Long.valueOf(o95Var.e()) : null;
                        if (lValueOf != null) {
                            long jLongValue = lValueOf.longValue();
                            if (jLongValue != -1 && jLongValue != 0) {
                                if (((ft9) uq3Var).a() > (o95Var.c() + jLongValue) - 1) {
                                    this.z = true;
                                    return true;
                                }
                            }
                        }
                    }
                }
                return super.j(uq3Var, z, mfVar, l6mVar);
            default:
                IOException iOException2 = (IOException) mfVar.c;
                if (!k15Var.d && (uq3Var instanceof ft9)) {
                    HttpDataSource$InvalidResponseCodeException httpDataSource$InvalidResponseCodeException2 = iOException2 instanceof HttpDataSource$InvalidResponseCodeException ? (HttpDataSource$InvalidResponseCodeException) iOException2 : null;
                    if (httpDataSource$InvalidResponseCodeException2 != null && httpDataSource$InvalidResponseCodeException2.c == 404) {
                        o95 o95Var2 = o95VarArr[rg6Var.n(uq3Var.d)];
                        lValueOf = o95Var2 != null ? Long.valueOf(o95Var2.e()) : null;
                        if (lValueOf != null) {
                            long jLongValue2 = lValueOf.longValue();
                            if (jLongValue2 != -1 && jLongValue2 != 0) {
                                if (((ft9) uq3Var).a() > (o95Var2.c() + jLongValue2) - 1) {
                                    this.z = true;
                                    return true;
                                }
                            }
                        }
                    }
                }
                return super.j(uq3Var, z, mfVar, l6mVar);
        }
    }
}
