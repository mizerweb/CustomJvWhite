package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class jk4 extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public int f;
    public /* synthetic */ Object g;
    public final /* synthetic */ pk4 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jk4(pk4 pk4Var, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.h = pk4Var;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        pk4 pk4Var = this.h;
        switch (i) {
            case 0:
                jk4 jk4Var = new jk4(pk4Var, lq4Var, 0);
                jk4Var.g = obj;
                return jk4Var;
            default:
                jk4 jk4Var2 = new jk4(pk4Var, lq4Var, 1);
                jk4Var2.g = obj;
                return jk4Var2;
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                return ((jk4) create((m8b) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            default:
                return ((jk4) create((ej4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0095 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:33:0x0097 A[LOOP:0: B:21:0x005c->B:33:0x0097, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:71:0x0093 A[SYNTHETIC] */
    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        switch (this.e) {
            case 0:
                pk4 pk4Var = this.h;
                m8b m8bVar = (m8b) this.g;
                hu4 hu4Var = hu4.a;
                int i = this.f;
                if (i != 0) {
                    if (i == 1) {
                        ch3.d0(obj);
                    } else {
                        if (i != 2) {
                            ore.k("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ch3.d0(obj);
                    }
                    return sbi.a;
                }
                ch3.d0(obj);
                zv8[] zv8VarArr = pk4.r;
                vo8 vo8Var = (vo8) pk4Var.p.m(pk4Var, pk4.r[0]);
                if (vo8Var != null) {
                    this.g = m8bVar;
                    this.f = 1;
                    if (vo8Var.g(this) == hu4Var) {
                        return hu4Var;
                    }
                }
                this.g = null;
                this.f = 2;
                if (pk4.c(pk4Var, m8bVar, this) == hu4Var) {
                    return hu4Var;
                }
                return sbi.a;
            default:
                ej4 ej4Var = (ej4) this.g;
                hu4 hu4Var2 = hu4.a;
                int i2 = this.f;
                if (i2 != 0) {
                    if (i2 == 1) {
                        ch3.d0(obj);
                        return sbi.a;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj);
                if (cqk.d(ej4Var, aj4.a) || (ej4Var instanceof dj4)) {
                    this.h.a();
                } else if (ej4Var instanceof cj4) {
                    pzf pzfVar = this.h.q;
                    l8b l8bVar = ((cj4) ej4Var).a;
                    m8b m8bVar2 = new m8b(l8bVar.e);
                    long[] jArr = l8bVar.b;
                    long[] jArr2 = l8bVar.a;
                    int length = jArr2.length - 2;
                    if (length >= 0) {
                        int i3 = 0;
                        while (true) {
                            long j = jArr2[i3];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i4 = 8 - ((~(i3 - length)) >>> 31);
                                for (int i5 = 0; i5 < i4; i5++) {
                                    if ((j & 255) < 128) {
                                        m8bVar2.a(jArr[(i3 << 3) + i5]);
                                    }
                                    j >>= 8;
                                }
                                if (i4 == 8) {
                                    if (i3 != length) {
                                        i3++;
                                    }
                                }
                            } else if (i3 != length) {
                                i3++;
                            }
                        }
                    }
                    this.g = null;
                    this.f = 1;
                    if (pzfVar.emit(m8bVar2, this) == hu4Var2) {
                        return hu4Var2;
                    }
                } else if (ej4Var instanceof bj4) {
                    String str = this.h.o;
                    a4c a4cVar = gm0.f;
                    if (a4cVar != null) {
                        je9 je9Var = je9.e;
                        if (a4cVar.b(je9Var)) {
                            a4cVar.c(je9Var, str, zo5.j(((bj4) ej4Var).a(), "contact not found #"), null);
                        }
                    }
                } else if (!(ej4Var instanceof zi4) && !(ej4Var instanceof yi4)) {
                    ore.o();
                    return null;
                }
                return sbi.a;
        }
    }
}
