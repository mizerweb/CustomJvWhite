package defpackage;

import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes3.dex */
public final class yie extends cr0 {
    public final ny8 e;
    public final ny8 f;
    public final String g;

    public yie(ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ed6 ed6Var) {
        super(ny8Var, ny8Var2, ed6Var);
        this.e = ny8Var;
        this.f = ny8Var3;
        this.g = yie.class.getName();
    }

    /* JADX WARN: Code duplicated, block: B:50:0x0124  */
    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    public final Object h(long j, nq4 nq4Var, String str) {
        xie xieVar;
        rt2 rt2Var;
        Object objV;
        long j2 = j;
        String str2 = str;
        Object obj = sbi.a;
        if (nq4Var instanceof xie) {
            xieVar = (xie) nq4Var;
            int i = xieVar.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                xieVar.h = i - Integer.MIN_VALUE;
            } else {
                xieVar = new xie(this, nq4Var);
            }
        } else {
            xieVar = new xie(this, nq4Var);
        }
        Object objP = xieVar.f;
        Object obj2 = hu4.a;
        int i2 = xieVar.h;
        boolean z = true;
        if (i2 != 0) {
            if (i2 == 1) {
                j2 = xieVar.e;
                str2 = xieVar.d;
                ch3.d0(objP);
            } else {
                if (i2 != 2) {
                    if (i2 == 3) {
                        ch3.d0(objP);
                        return obj;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                j2 = xieVar.e;
                ch3.d0(objP);
            }
            rt2Var = (rt2) objP;
            if (rt2Var != null && rt2Var.y0()) {
                z = false;
            }
            xn3 xn3Var = (xn3) this.f.getValue();
            xieVar.d = null;
            xieVar.e = j2;
            xieVar.h = 3;
            xn3Var.getClass();
            objV = qyj.V(k66.a, new jn3(xn3Var, j2, z, 1), xieVar);
            if (objV != obj2) {
                objV = obj;
            }
            return objV == obj2 ? obj2 : obj;
        }
        ch3.d0(objP);
        String str3 = this.g;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str3, "Remove favorite in folder=" + str2 + " chatId=" + j2, null);
            }
        }
        r17 r17Var = (r17) ((sy4) this.e.getValue()).j(str2).getValue();
        if (r17Var == null) {
            gm0.Y(yie.class.getName(), "Early return in execute cuz of folderFlow is null");
            return obj;
        }
        if (!r17Var.j.contains(new Long(j2))) {
            gm0.Y(yie.class.getName(), "Early return in execute cuz of !folder.favorites.contains(chatId)");
            return obj;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(r17Var.j);
        linkedHashSet.remove(new Long(j2));
        o67 o67VarF = cr0.f(this, r17Var, null, linkedHashSet, 11);
        xieVar.d = str2;
        xieVar.e = j2;
        xieVar.h = 1;
        if (g(o67VarF, xieVar) != obj2) {
        }
        if (cqk.d(str2, "all.chat.folder")) {
            r8e r8eVarL = ((xn3) this.f.getValue()).l(j2);
            xieVar.d = null;
            xieVar.e = j2;
            xieVar.h = 2;
            objP = e9i.P(r8eVarL, xieVar);
            if (objP != obj2) {
                rt2Var = (rt2) objP;
                if (rt2Var != null) {
                    z = false;
                }
                xn3 xn3Var2 = (xn3) this.f.getValue();
                xieVar.d = null;
                xieVar.e = j2;
                xieVar.h = 3;
                xn3Var2.getClass();
                objV = qyj.V(k66.a, new jn3(xn3Var2, j2, z, 1), xieVar);
                if (objV != obj2) {
                    objV = obj;
                }
                if (objV == obj2) {
                }
            }
        }
    }
}
