package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class hyi {
    public final ny8 a;
    public final ny8 b;
    public final ny8 c;
    public final ny8 d;
    public final ny8 e;
    public final ny8 f;

    public hyi(ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4, ny8 ny8Var5, ny8 ny8Var6) {
        this.a = ny8Var;
        this.b = ny8Var2;
        this.c = ny8Var3;
        this.d = ny8Var5;
        this.e = ny8Var4;
        this.f = ny8Var6;
    }

    public static final d0j a(hyi hyiVar) {
        return (d0j) hyiVar.b.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:62:0x0185 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:8:0x0022  */
    public final Object b(rt2 rt2Var, long j, mg5 mg5Var, String str, l1j l1jVar, d3j d3jVar, Float f, boolean z, nq4 nq4Var) {
        eyi eyiVar;
        int i;
        mg5 mg5Var2;
        rt2 rt2Var2;
        String str2;
        boolean z2;
        d3j d3jVar2;
        long j2 = j;
        l1j l1jVar2 = l1jVar;
        if (nq4Var instanceof eyi) {
            eyiVar = (eyi) nq4Var;
            int i2 = eyiVar.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                eyiVar.n = i2 - Integer.MIN_VALUE;
            } else {
                eyiVar = new eyi(this, nq4Var);
            }
        } else {
            eyiVar = new eyi(this, nq4Var);
        }
        eyi eyiVar2 = eyiVar;
        Object obj = eyiVar2.l;
        int i3 = eyiVar2.n;
        sbi sbiVar = sbi.a;
        lq4 lq4Var = null;
        Object obj2 = hu4.a;
        if (i3 == 0) {
            ch3.d0(obj);
            i = (l1jVar2 == null || j2 == l1jVar2.b) ? 0 : 1;
            ny8 ny8Var = this.d;
            if (i == 0) {
                k1j k1jVar = l1jVar2 != null ? l1jVar2.f : null;
                switch (k1jVar == null ? -1 : dyi.$EnumSwitchMapping$0[k1jVar.ordinal()]) {
                    case -1:
                    case 5:
                    case 6:
                        long j3 = rt2Var.a;
                        eyiVar2.d = null;
                        eyiVar2.e = null;
                        eyiVar2.f = null;
                        eyiVar2.g = null;
                        eyiVar2.h = null;
                        eyiVar2.i = j2;
                        eyiVar2.j = z;
                        eyiVar2.k = i;
                        eyiVar2.n = 5;
                        if (d(j3, j2, mg5Var, str, l1jVar2, d3jVar, eyiVar2) != obj2) {
                            return sbiVar;
                        }
                        break;
                    case 0:
                    default:
                        ore.o();
                        return null;
                    case 1:
                    case 2:
                        lk9 lk9VarC = ((n0c) ((xhh) ny8Var.getValue())).c();
                        wo0 wo0Var = new wo0(z, this, f, (lq4) null);
                        eyiVar2.d = null;
                        eyiVar2.e = null;
                        eyiVar2.f = null;
                        eyiVar2.g = null;
                        eyiVar2.h = null;
                        eyiVar2.i = j2;
                        eyiVar2.j = z;
                        eyiVar2.k = i;
                        eyiVar2.n = 3;
                        if (yab.K0(lk9VarC, wo0Var, eyiVar2) != obj2) {
                            return sbiVar;
                        }
                        break;
                    case 3:
                    case 4:
                        lk9 lk9VarC2 = ((n0c) ((xhh) ny8Var.getValue())).c();
                        j8g j8gVar = new j8g(f, this, (lq4) null, 26);
                        eyiVar2.d = null;
                        eyiVar2.e = null;
                        eyiVar2.f = null;
                        eyiVar2.g = null;
                        eyiVar2.h = null;
                        eyiVar2.i = j2;
                        eyiVar2.j = z;
                        eyiVar2.k = i;
                        eyiVar2.n = 4;
                        if (yab.K0(lk9VarC2, j8gVar, eyiVar2) != obj2) {
                            return sbiVar;
                        }
                        break;
                }
            } else {
                lk9 lk9VarC3 = ((n0c) ((xhh) ny8Var.getValue())).c();
                hpf hpfVar = new hpf(this, lq4Var, 19);
                eyiVar2.d = rt2Var;
                mg5Var2 = mg5Var;
                eyiVar2.e = mg5Var2;
                eyiVar2.f = str;
                eyiVar2.g = l1jVar2;
                eyiVar2.h = d3jVar;
                eyiVar2.i = j2;
                eyiVar2.j = z;
                eyiVar2.k = i;
                eyiVar2.n = 1;
                if (yab.K0(lk9VarC3, hpfVar, eyiVar2) != obj2) {
                    rt2Var2 = rt2Var;
                    str2 = str;
                    z2 = z;
                    d3jVar2 = d3jVar;
                }
            }
            return obj2;
        }
        if (i3 != 1) {
            if (i3 == 2) {
                ch3.d0(obj);
                return sbiVar;
            }
            if (i3 == 3) {
                ch3.d0(obj);
                return sbiVar;
            }
            if (i3 == 4) {
                ch3.d0(obj);
                return sbiVar;
            }
            if (i3 == 5) {
                ch3.d0(obj);
                return sbiVar;
            }
            ore.k("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        int i4 = eyiVar2.k;
        z2 = eyiVar2.j;
        j2 = eyiVar2.i;
        d3jVar2 = eyiVar2.h;
        l1jVar2 = eyiVar2.g;
        String str3 = eyiVar2.f;
        mg5 mg5Var3 = eyiVar2.e;
        rt2Var2 = eyiVar2.d;
        ch3.d0(obj);
        i = i4;
        str2 = str3;
        mg5Var2 = mg5Var3;
        long j4 = rt2Var2.a;
        eyiVar2.d = null;
        eyiVar2.e = null;
        eyiVar2.f = null;
        eyiVar2.g = null;
        eyiVar2.h = null;
        eyiVar2.i = j2;
        eyiVar2.j = z2;
        eyiVar2.k = i;
        eyiVar2.n = 2;
        if (d(j4, j2, mg5Var2, str2, l1jVar2, d3jVar2, eyiVar2) == obj2) {
            return obj2;
        }
        return sbiVar;
    }

    public final Object c(long j, long j2, d3j d3jVar, nq4 nq4Var) {
        tyi tyiVar = (tyi) this.e.getValue();
        int iOrdinal = d3jVar.ordinal();
        Object objC = tyiVar.c(j, j2, (iOrdinal == 3 || iOrdinal == 4) ? ns5.MEDIA_PLAYLIST : ns5.UNKNOWN, nq4Var);
        return objC == hu4.a ? objC : sbi.a;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    public final Object d(long j, long j2, mg5 mg5Var, String str, l1j l1jVar, d3j d3jVar, nq4 nq4Var) {
        fyi fyiVar;
        ns5 ns5Var;
        long j3;
        d3j d3jVar2;
        mg5 mg5Var2;
        String str2;
        long j4;
        sbi sbiVar = sbi.a;
        if (nq4Var instanceof fyi) {
            fyiVar = (fyi) nq4Var;
            int i = fyiVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                fyiVar.k = i - Integer.MIN_VALUE;
            } else {
                fyiVar = new fyi(this, nq4Var);
            }
        } else {
            fyiVar = new fyi(this, nq4Var);
        }
        fyi fyiVar2 = fyiVar;
        Object obj = fyiVar2.i;
        hu4 hu4Var = hu4.a;
        int i2 = fyiVar2.k;
        if (i2 == 0) {
            ch3.d0(obj);
            if ((l1jVar != null ? l1jVar.f : null) == k1j.a) {
                gm0.Y(hyi.class.getName(), "Early return in fetchAndPrepare cuz of latestVideoMessageState?.state == VideoMessageState.State.PREPARE");
                return sbiVar;
            }
            tyi tyiVar = (tyi) this.e.getValue();
            int iOrdinal = d3jVar.ordinal();
            if (iOrdinal == 0) {
                ns5Var = ns5.CHAT_MEDIA;
            } else if (iOrdinal != 1) {
                ns5Var = (iOrdinal == 3 || iOrdinal == 4) ? ns5.MEDIA_PLAYLIST : ns5.UNKNOWN;
            } else {
                ns5Var = ns5.CHAT;
            }
            ns5 ns5Var2 = ns5Var;
            fyiVar2.f = mg5Var;
            fyiVar2.g = str;
            fyiVar2.h = d3jVar;
            fyiVar2.d = j;
            fyiVar2.e = j2;
            fyiVar2.k = 1;
            if (tyiVar.c(j, j2, ns5Var2, fyiVar2) != hu4Var) {
                j3 = j2;
                d3jVar2 = d3jVar;
                mg5Var2 = mg5Var;
                str2 = str;
                j4 = j;
            }
            return hu4Var;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                ch3.d0(obj);
                return sbiVar;
            }
            ore.k("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        long j5 = fyiVar2.e;
        long j6 = fyiVar2.d;
        d3j d3jVar3 = fyiVar2.h;
        str2 = fyiVar2.g;
        mg5 mg5Var3 = fyiVar2.f;
        ch3.d0(obj);
        j3 = j5;
        j4 = j6;
        d3jVar2 = d3jVar3;
        mg5Var2 = mg5Var3;
        rui ruiVarA = ((n5j) this.c.getValue()).e.a(str2);
        if (ruiVarA == null) {
            String name = hyi.class.getName();
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.g;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, name, nbh.s(j3, "We don't have a video cache after fetching (msgId = ", ")"), null);
                    return sbiVar;
                }
            }
        } else {
            lk9 lk9VarC = ((n0c) ((xhh) this.d.getValue())).c();
            gyi gyiVar = new gyi(this, j4, j3, mg5Var2, str2, ruiVarA, d3jVar2, null);
            fyiVar2.f = null;
            fyiVar2.g = null;
            fyiVar2.h = null;
            fyiVar2.d = j4;
            fyiVar2.e = j3;
            fyiVar2.k = 2;
            if (yab.K0(lk9VarC, gyiVar, fyiVar2) == hu4Var) {
                return hu4Var;
            }
        }
        return sbiVar;
    }
}
