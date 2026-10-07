package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class lei {
    public final l7f a;
    public final ny8 b;
    public final ny8 c;
    public final String d = lei.class.getName();

    public lei(ny8 ny8Var, ny8 ny8Var2, l7f l7fVar) {
        this.a = l7fVar;
        this.b = ny8Var;
        this.c = ny8Var2;
    }

    /* JADX WARN: Code duplicated, block: B:59:0x0150  */
    /* JADX WARN: Code duplicated, block: B:61:0x015b  */
    /* JADX WARN: Code duplicated, block: B:8:0x0026  */
    public final Comparable a(long j, long j2, long j3, int i, boolean z, boolean z2, nq4 nq4Var) {
        jei jeiVar;
        rt2 rt2Var;
        int i2;
        long j4;
        rt2 rt2Var2;
        long j5;
        int i3;
        aob aobVar;
        a4c a4cVar;
        je9 je9Var;
        boolean z3 = z;
        je9 je9Var2 = je9.d;
        if (nq4Var instanceof jei) {
            jeiVar = (jei) nq4Var;
            int i4 = jeiVar.j;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                jeiVar.j = i4 - Integer.MIN_VALUE;
            } else {
                jeiVar = new jei(this, nq4Var);
            }
        } else {
            jeiVar = new jei(this, nq4Var);
        }
        jei jeiVar2 = jeiVar;
        Object objD = jeiVar2.h;
        hu4 hu4Var = hu4.a;
        int i5 = jeiVar2.j;
        if (i5 == 0) {
            ch3.d0(objD);
            String str = this.d;
            a4c a4cVar2 = gm0.f;
            if (a4cVar2 != null && a4cVar2.b(je9Var2)) {
                StringBuilder sbS = qt4.s(j, "execute: chatId=", ", userId=");
                sbS.append(j2);
                qt4.z(j3, ",newReadmark=", ",newMessagesCount=", sbS);
                sbS.append(i);
                sbS.append(",notifySelfReadMarkChangedListener=");
                sbS.append(z3);
                sbS.append(",setAsUnread=");
                sbS.append(z2);
                a4cVar2.c(je9Var2, str, sbS.toString(), null);
            }
            rt2Var = (rt2) ((xn3) this.b.getValue()).k(j).a.getValue();
            if (rt2Var == null) {
                gm0.Y(this.d, "chat is null!");
                return null;
            }
            Long l = (Long) rt2Var.b.e.getOrDefault(new Long(j2), new Long(-1L));
            if (l != null && l.longValue() == -1) {
                gm0.Y(this.d, "user deleted from chat");
                return rt2Var;
            }
            i2 = (this.a.a() != j2 || j3 < 0) ? 0 : 1;
            boolean z4 = j3 >= l.longValue();
            if ((this.a.a() == j2 && z2) || z4 || i >= 0) {
                xn3 xn3Var = (xn3) this.b.getValue();
                j5 = j3;
                kei keiVar = new kei(j5, z2, i, z4, j2, null);
                jeiVar2.d = j;
                jeiVar2.e = j5;
                jeiVar2.g = z3;
                jeiVar2.f = i2;
                jeiVar2.j = 1;
                objD = xn3Var.d(j, keiVar, jeiVar2);
                if (objD == hu4Var) {
                    return hu4Var;
                }
                j4 = j;
                i3 = i2;
            } else {
                j4 = j;
                je9Var2 = je9Var2;
                j5 = j3;
            }
            if (z3 && i2 != 0) {
                aobVar = (aob) this.c.getValue();
                a4cVar = gm0.f;
                if (a4cVar != null) {
                    aobVar.getClass();
                    je9Var = je9Var2;
                    if (a4cVar.b(je9Var)) {
                        StringBuilder sbS2 = qt4.s(j4, "onSelfReadMarkChanged: chatId=", ", mark=");
                        sbS2.append(j5);
                        a4cVar.c(je9Var, "aob", sbS2.toString(), null);
                    }
                }
                yab.i0((wmi) aobVar.h.getValue(), (xt4) aobVar.g.getValue(), 0, new h01(aobVar, j4, j5, (lq4) null, 7), 2);
            }
            rt2Var2 = rt2Var;
            return rt2Var2;
        }
        if (i5 != 1) {
            ore.k("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        i3 = jeiVar2.f;
        boolean z5 = jeiVar2.g;
        j5 = jeiVar2.e;
        j4 = jeiVar2.d;
        ch3.d0(objD);
        z3 = z5;
        rt2Var2 = (rt2) objD;
        i2 = i3;
        if (z3) {
            aobVar = (aob) this.c.getValue();
            a4cVar = gm0.f;
            if (a4cVar != null) {
                aobVar.getClass();
                je9Var = je9Var2;
                if (a4cVar.b(je9Var)) {
                    StringBuilder sbS3 = qt4.s(j4, "onSelfReadMarkChanged: chatId=", ", mark=");
                    sbS3.append(j5);
                    a4cVar.c(je9Var, "aob", sbS3.toString(), null);
                }
            }
            yab.i0((wmi) aobVar.h.getValue(), (xt4) aobVar.g.getValue(), 0, new h01(aobVar, j4, j5, (lq4) null, 7), 2);
        }
        rt2Var2 = rt2Var;
        return rt2Var2;
    }
}
