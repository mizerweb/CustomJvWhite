package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class oz5 {
    public final ny8 a;
    public final ny8 b;
    public final ny8 c;
    public final ny8 d;

    public oz5(ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4) {
        this.a = ny8Var;
        this.b = ny8Var2;
        this.c = ny8Var3;
        this.d = ny8Var4;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    public final Object a(q24 q24Var, long j, CharSequence charSequence, nq4 nq4Var) {
        nz5 nz5Var;
        CharSequence charSequence2;
        q24 q24Var2;
        long j2;
        s04 s04Var;
        je9 je9Var = je9.f;
        sbi sbiVar = sbi.a;
        if (nq4Var instanceof nz5) {
            nz5Var = (nz5) nq4Var;
            int i = nz5Var.j;
            if ((i & Integer.MIN_VALUE) != 0) {
                nz5Var.j = i - Integer.MIN_VALUE;
            } else {
                nz5Var = new nz5(this, nq4Var);
            }
        } else {
            nz5Var = new nz5(this, nq4Var);
        }
        Object obj = nz5Var.h;
        hu4 hu4Var = hu4.a;
        int i2 = nz5Var.j;
        if (i2 == 0) {
            ch3.d0(obj);
            gm0.x(oz5.class.getName(), "Edit message.", null);
            s04 s04Var2 = (s04) ((r8e) ((xn3) this.b.getValue()).c.i(q24Var)).a.getValue();
            if (s04Var2 == null) {
                String name = oz5.class.getName();
                a4c a4cVar = gm0.f;
                if (a4cVar != null && a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, name, "comments chat " + q24Var + " is null", null);
                    return sbiVar;
                }
            } else {
                l34 l34Var = (l34) this.c.getValue();
                nz5Var.d = q24Var;
                nz5Var.e = charSequence;
                nz5Var.f = s04Var2;
                nz5Var.g = j;
                nz5Var.j = 1;
                Object objR = l34Var.r(j, nz5Var);
                if (objR == hu4Var) {
                    return hu4Var;
                }
                charSequence2 = charSequence;
                q24Var2 = q24Var;
                j2 = j;
                s04Var = s04Var2;
                obj = objR;
            }
            return sbiVar;
        }
        if (i2 != 1) {
            ore.k("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        long j3 = nz5Var.g;
        s04Var = nz5Var.f;
        charSequence2 = nz5Var.e;
        q24 q24Var3 = nz5Var.d;
        ch3.d0(obj);
        j2 = j3;
        q24Var2 = q24Var3;
        ky3 ky3Var = (ky3) obj;
        if (ky3Var == null) {
            String name2 = oz5.class.getName();
            a4c a4cVar2 = gm0.f;
            if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                a4cVar2.c(je9Var, name2, zo5.j(j2, "comment not found "), null);
                return sbiVar;
            }
        } else {
            List listA = ((xl7) this.a.getValue()).a(s04Var, charSequence2);
            if (charSequence2 == null) {
                charSequence2 = "";
            }
            String string = charSequence2.toString();
            if (string.length() != 0 && !string.equals(ky3Var.g)) {
                ((wzj) this.d.getValue()).c(new ikf(new hkf(j2, r5h.y1(string).toString(), listA, q24Var2)));
                return sbiVar;
            }
            String name3 = oz5.class.getName();
            a4c a4cVar3 = gm0.f;
            if (a4cVar3 != null) {
                je9 je9Var2 = je9.d;
                if (a4cVar3.b(je9Var2)) {
                    a4cVar3.c(je9Var2, name3, "text not changed or empty", null);
                }
            }
        }
        return sbiVar;
    }
}
