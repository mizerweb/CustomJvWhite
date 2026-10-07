package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.a;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class cr7 {
    public static final long i;
    public static final ylc j;
    public final gjg a;
    public final ny8 b;
    public final ny8 c;
    public final ny8 d;
    public final mjg e;
    public final r8e f;
    public final pzf g;
    public final q8e h;

    static {
        ghb ghbVar = ew5.b;
        i = qe7.O(5, lw5.SECONDS);
        j = new ylc(gm0.a("", Long.MIN_VALUE), rki.c(R.drawable.saved_group_call_avatar).toString());
    }

    public cr7(dq4 dq4Var, xhh xhhVar, gjg gjgVar, ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3) {
        this.a = gjgVar;
        this.b = ny8Var2;
        this.c = ny8Var3;
        this.d = ny8Var;
        mjg mjgVarA = p90.a(er7.a);
        this.e = mjgVarA;
        this.f = new r8e(mjgVarA);
        pzf pzfVarB = e9i.b(0, Integer.MAX_VALUE, 4);
        this.g = pzfVarB;
        this.h = new q8e(pzfVarB);
        int i2 = 3;
        e9i.j0(e9i.T(new fz6(new r07(new jz(gjgVar, 13), e9i.M0(((b95) ny8Var2.getValue()).i, new sh1(i2, null, 9)), yq7.h, 0), new m20(2, this, cr7.class, "handleChat", "handleChat(Lkotlin/Pair;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 23), i2), ((n0c) xhhVar).b()), dq4Var);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0071  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public static final Object a(cr7 cr7Var, ylc ylcVar, lq4 lq4Var) {
        zq7 zq7Var;
        boolean z;
        mx2 mx2Var;
        pnh pnhVar;
        String str;
        mjg mjgVar = cr7Var.e;
        if (lq4Var instanceof zq7) {
            zq7Var = (zq7) lq4Var;
            int i2 = zq7Var.i;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zq7Var.i = i2 - Integer.MIN_VALUE;
            } else {
                zq7Var = new zq7(cr7Var, lq4Var);
            }
        } else {
            zq7Var = new zq7(cr7Var, lq4Var);
        }
        Object obj = zq7Var.g;
        int i3 = zq7Var.i;
        if (i3 == 0) {
            ch3.d0(obj);
            rt2 rt2Var = (rt2) ylcVar.a;
            dz4 dz4Var = (dz4) ylcVar.b;
            mx2 mx2VarG = rt2Var.G();
            String strA = ns4.a(dz4Var.c);
            if (((x02) ((b95) cr7Var.b.getValue()).i.a.getValue()).C()) {
                if (cqk.d(strA, mx2VarG != null ? mx2VarG.a : null)) {
                    z = false;
                } else {
                    z = true;
                }
            } else {
                z = true;
            }
            nx2 nx2Var = rt2Var.b;
            if (nx2Var == null || (mx2Var = nx2Var.V) == null || !ch3.s(mx2Var.c) || mx2Var.d <= 0 || rt2Var.h0() || mx2VarG == null || !z) {
                mjgVar.getClass();
                mjgVar.j(null, er7.a);
            } else {
                int i4 = mx2VarG.d;
                pnh pnhVar2 = new pnh(R.plurals.pinbars_group_call_participants_count, i4);
                String str2 = mx2VarG.a;
                List list = mx2VarG.e;
                zq7Var.d = mjgVar;
                zq7Var.e = str2;
                zq7Var.f = pnhVar2;
                zq7Var.i = 1;
                Serializable serializableD = cr7Var.d(list, i4, zq7Var);
                Serializable serializable = hu4.a;
                if (serializableD == serializable) {
                    return serializable;
                }
                obj = serializableD;
                pnhVar = pnhVar2;
                str = str2;
            }
            return sbi.a;
        }
        if (i3 != 1) {
            ore.k("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        pnhVar = zq7Var.f;
        str = zq7Var.e;
        mjgVar = zq7Var.d;
        ch3.d0(obj);
        mjgVar.setValue(new dr7(str, pnhVar, (List) obj));
        return sbi.a;
    }

    public final q8e b() {
        return this.h;
    }

    public final r8e c() {
        return this.f;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.io.Serializable, r66] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.util.List] */
    public final Serializable d(List list, int i2, nq4 nq4Var) {
        br7 br7Var;
        if (nq4Var instanceof br7) {
            br7Var = (br7) nq4Var;
            int i3 = br7Var.g;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                br7Var.g = i3 - Integer.MIN_VALUE;
            } else {
                br7Var = new br7(this, nq4Var);
            }
        } else {
            br7Var = new br7(this, nq4Var);
        }
        Object objN = br7Var.e;
        int i4 = br7Var.g;
        int length = 2;
        ?? arrayList = r66.a;
        lq4 lq4Var = null;
        if (i4 == 0) {
            ch3.d0(objN);
            if (!list.isEmpty()) {
                List list2 = list;
                ArrayList arrayList2 = new ArrayList(yw3.W0(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((no4) this.d.getValue()).j(((Number) it.next()).longValue()));
                }
                j3 j3VarX = tre.X(new l7((xx6[]) ww3.T1(arrayList2).toArray(new xx6[0]), list, this, 6), ew5.g(i), new c9(length, lq4Var, 11));
                br7Var.d = i2;
                br7Var.g = 1;
                objN = e9i.N(j3VarX, br7Var);
                hu4 hu4Var = hu4.a;
                if (objN == hu4Var) {
                    return hu4Var;
                }
            }
            return arrayList;
        }
        if (i4 != 1) {
            ore.k("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        i2 = br7Var.d;
        ch3.d0(objN);
        Object obj = ((roe) objN).a;
        if (obj instanceof poe) {
            obj = null;
        }
        vg4[] vg4VarArr = (vg4[]) obj;
        if (vg4VarArr != null) {
            boolean z = i2 > vg4VarArr.length;
            length = z ? 2 : vg4VarArr.length;
            if (length < 0) {
                c.o(c0a.k(length, "Requested element count ", " is less than zero."));
                return null;
            }
            if (length != 0) {
                if (length >= vg4VarArr.length) {
                    arrayList = a.n1(vg4VarArr);
                } else if (length == 1) {
                    arrayList = Collections.singletonList(vg4VarArr[0]);
                } else {
                    arrayList = new ArrayList(length);
                    int i5 = 0;
                    for (vg4 vg4Var : vg4VarArr) {
                        arrayList.add(vg4Var);
                        i5++;
                        if (i5 == length) {
                            break;
                        }
                    }
                }
            }
            ArrayList arrayList3 = new ArrayList();
            for (vg4 vg4Var2 : (Iterable) arrayList) {
                ylc ylcVar = vg4Var2 == null ? null : new ylc(gm0.a(vg4Var2.u(), new Long(vg4Var2.v())), vg4Var2.z(us0.a));
                if (ylcVar != null) {
                    arrayList3.add(ylcVar);
                }
            }
            if (z) {
                arrayList3.add(j);
            }
            return arrayList3;
        }
        return arrayList;
    }
}
