package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class i2h {
    public final af7 a;
    public final af7 b;
    public final l9b c;
    public final l8b d;

    static {
        ghb ghbVar = ew5.b;
        qe7.O(5, lw5.MINUTES);
    }

    public i2h(t2g t2gVar) {
        yvg yvgVar = new yvg(5);
        this.a = t2gVar;
        this.b = yvgVar;
        this.c = new l9b();
        this.d = new l8b();
    }

    public static y1h i(y1h y1hVar) {
        if (y1hVar != null) {
            return y1hVar;
        }
        u8b u8bVar = cqb.b;
        return new y1h(null, 0L, u8bVar, 0L, 0L, u8bVar, 0L, 0L);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    public final Object a(long j, boolean z, u8b u8bVar, long j2, nq4 nq4Var) {
        z1h z1hVar;
        l9b l9bVar;
        u8b u8bVar2;
        long j3;
        boolean z2;
        long j4;
        y1h y1hVarA;
        sbi sbiVar = sbi.a;
        if (nq4Var instanceof z1h) {
            z1hVar = (z1h) nq4Var;
            int i = z1hVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                z1hVar.k = i - Integer.MIN_VALUE;
            } else {
                z1hVar = new z1h(this, nq4Var);
            }
        } else {
            z1hVar = new z1h(this, nq4Var);
        }
        Object obj = z1hVar.i;
        hu4 hu4Var = hu4.a;
        int i2 = z1hVar.k;
        if (i2 == 0) {
            ch3.d0(obj);
            l9bVar = this.c;
            u8bVar2 = u8bVar;
            z1hVar.g = u8bVar2;
            z1hVar.h = l9bVar;
            j3 = j;
            z1hVar.d = j3;
            z2 = z;
            z1hVar.f = z2;
            z1hVar.e = j2;
            z1hVar.k = 1;
            if (l9bVar.b(z1hVar) == hu4Var) {
                return hu4Var;
            }
            j4 = j2;
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            long j5 = z1hVar.e;
            boolean z3 = z1hVar.f;
            j3 = z1hVar.d;
            l9bVar = z1hVar.h;
            u8b u8bVar3 = z1hVar.g;
            ch3.d0(obj);
            u8bVar2 = u8bVar3;
            j4 = j5;
            z2 = z3;
        }
        l9b l9bVar2 = l9bVar;
        try {
            y1h y1hVar = (y1h) this.d.f(j3);
            if (y1hVar == null) {
                String name = i2h.class.getName();
                a4c a4cVar = gm0.f;
                if (a4cVar != null) {
                    je9 je9Var = je9.d;
                    if (a4cVar.b(je9Var)) {
                        a4cVar.c(je9Var, name, "appendPage: no entry for storyId=" + j3 + ", skip", null);
                    }
                }
                return sbiVar;
            }
            l8b l8bVar = this.d;
            if (z2) {
                u8b u8bVar4 = y1hVar.f;
                u8b u8bVar5 = new u8b(u8bVar4.b);
                u8bVar5.c(u8bVar4);
                u8bVar5.c(u8bVar2);
                y1hVarA = y1h.a(y1hVar, null, 0L, null, 0L, 0L, u8bVar5, j4, 0L, 159);
            } else {
                u8b u8bVar6 = y1hVar.c;
                u8b u8bVar7 = new u8b(u8bVar6.b);
                u8bVar7.c(u8bVar6);
                u8bVar7.c(u8bVar2);
                y1hVarA = y1h.a(y1hVar, null, 0L, u8bVar7, j4, 0L, null, 0L, 0L, 243);
            }
            l8bVar.l(j3, y1hVarA);
            return sbiVar;
        } finally {
            l9bVar2.g(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(long j, boolean z, nq4 nq4Var) {
        a2h a2hVar;
        l9b l9bVar;
        if (nq4Var instanceof a2h) {
            a2hVar = (a2h) nq4Var;
            int i = a2hVar.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                a2hVar.i = i - Integer.MIN_VALUE;
            } else {
                a2hVar = new a2h(this, nq4Var);
            }
        } else {
            a2hVar = new a2h(this, nq4Var);
        }
        Object obj = a2hVar.g;
        int i2 = a2hVar.i;
        if (i2 == 0) {
            ch3.d0(obj);
            l9b l9bVar2 = this.c;
            a2hVar.f = l9bVar2;
            a2hVar.d = j;
            a2hVar.e = z;
            a2hVar.i = 1;
            Object objB = l9bVar2.b(a2hVar);
            hu4 hu4Var = hu4.a;
            if (objB == hu4Var) {
                return hu4Var;
            }
            l9bVar = l9bVar2;
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z = a2hVar.e;
            j = a2hVar.d;
            l9bVar = a2hVar.f;
            ch3.d0(obj);
        }
        try {
            y1h y1hVar = (y1h) this.d.f(j);
            if (y1hVar == null) {
                return new Long(0L);
            }
            return new Long(z ? y1hVar.g : y1hVar.d);
        } finally {
            l9bVar.g(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(long j, boolean z, nq4 nq4Var) {
        b2h b2hVar;
        l9b l9bVar;
        if (nq4Var instanceof b2h) {
            b2hVar = (b2h) nq4Var;
            int i = b2hVar.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                b2hVar.i = i - Integer.MIN_VALUE;
            } else {
                b2hVar = new b2h(this, nq4Var);
            }
        } else {
            b2hVar = new b2h(this, nq4Var);
        }
        Object obj = b2hVar.g;
        int i2 = b2hVar.i;
        if (i2 == 0) {
            ch3.d0(obj);
            l9b l9bVar2 = this.c;
            b2hVar.f = l9bVar2;
            b2hVar.d = j;
            b2hVar.e = z;
            b2hVar.i = 1;
            Object objB = l9bVar2.b(b2hVar);
            hu4 hu4Var = hu4.a;
            if (objB == hu4Var) {
                return hu4Var;
            }
            l9bVar = l9bVar2;
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z = b2hVar.e;
            j = b2hVar.d;
            l9bVar = b2hVar.f;
            ch3.d0(obj);
        }
        try {
            y1h y1hVar = (y1h) this.d.f(j);
            if (y1hVar == null) {
                return cqb.b;
            }
            return z ? y1hVar.f : y1hVar.c;
        } finally {
            l9bVar.g(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(long j, nq4 nq4Var) {
        c2h c2hVar;
        l9b l9bVar;
        if (nq4Var instanceof c2h) {
            c2hVar = (c2h) nq4Var;
            int i = c2hVar.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                c2hVar.h = i - Integer.MIN_VALUE;
            } else {
                c2hVar = new c2h(this, nq4Var);
            }
        } else {
            c2hVar = new c2h(this, nq4Var);
        }
        Object obj = c2hVar.f;
        int i2 = c2hVar.h;
        if (i2 == 0) {
            ch3.d0(obj);
            l9b l9bVar2 = this.c;
            c2hVar.e = l9bVar2;
            c2hVar.d = j;
            c2hVar.h = 1;
            Object objB = l9bVar2.b(c2hVar);
            hu4 hu4Var = hu4.a;
            if (objB == hu4Var) {
                return hu4Var;
            }
            l9bVar = l9bVar2;
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j = c2hVar.d;
            l9bVar = c2hVar.e;
            ch3.d0(obj);
        }
        try {
            y1h y1hVar = (y1h) this.d.f(j);
            return y1hVar != null ? y1hVar.a : null;
        } finally {
            l9bVar.g(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(long j, nq4 nq4Var) {
        d2h d2hVar;
        l9b l9bVar;
        if (nq4Var instanceof d2h) {
            d2hVar = (d2h) nq4Var;
            int i = d2hVar.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                d2hVar.h = i - Integer.MIN_VALUE;
            } else {
                d2hVar = new d2h(this, nq4Var);
            }
        } else {
            d2hVar = new d2h(this, nq4Var);
        }
        Object obj = d2hVar.f;
        int i2 = d2hVar.h;
        if (i2 == 0) {
            ch3.d0(obj);
            l9b l9bVar2 = this.c;
            d2hVar.e = l9bVar2;
            d2hVar.d = j;
            d2hVar.h = 1;
            Object objB = l9bVar2.b(d2hVar);
            hu4 hu4Var = hu4.a;
            if (objB == hu4Var) {
                return hu4Var;
            }
            l9bVar = l9bVar2;
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j = d2hVar.d;
            l9bVar = d2hVar.e;
            ch3.d0(obj);
        }
        try {
            this.d.k(j);
            return sbi.a;
        } finally {
            l9bVar.g(null);
        }
    }

    public final boolean f(long j) {
        return ((Number) this.b.invoke()).longValue() - j < ew5.g(((ew5) this.a.invoke()).a);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object g(long j, boolean z, nq4 nq4Var) {
        e2h e2hVar;
        l9b l9bVar;
        if (nq4Var instanceof e2h) {
            e2hVar = (e2h) nq4Var;
            int i = e2hVar.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                e2hVar.i = i - Integer.MIN_VALUE;
            } else {
                e2hVar = new e2h(this, nq4Var);
            }
        } else {
            e2hVar = new e2h(this, nq4Var);
        }
        Object obj = e2hVar.g;
        int i2 = e2hVar.i;
        boolean z2 = true;
        if (i2 == 0) {
            ch3.d0(obj);
            l9b l9bVar2 = this.c;
            e2hVar.f = l9bVar2;
            e2hVar.d = j;
            e2hVar.e = z;
            e2hVar.i = 1;
            Object objB = l9bVar2.b(e2hVar);
            hu4 hu4Var = hu4.a;
            if (objB == hu4Var) {
                return hu4Var;
            }
            l9bVar = l9bVar2;
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z = e2hVar.e;
            j = e2hVar.d;
            l9bVar = e2hVar.f;
            ch3.d0(obj);
        }
        try {
            y1h y1hVar = (y1h) this.d.f(j);
            if (y1hVar == null) {
                return Boolean.FALSE;
            }
            long j2 = z ? y1hVar.h : y1hVar.e;
            if (!(z ? y1hVar.f : y1hVar.c).j() || !f(j2)) {
                z2 = false;
            }
            return Boolean.valueOf(z2);
        } finally {
            l9bVar.g(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object h(long j, nq4 nq4Var) {
        f2h f2hVar;
        l9b l9bVar;
        if (nq4Var instanceof f2h) {
            f2hVar = (f2h) nq4Var;
            int i = f2hVar.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                f2hVar.h = i - Integer.MIN_VALUE;
            } else {
                f2hVar = new f2h(this, nq4Var);
            }
        } else {
            f2hVar = new f2h(this, nq4Var);
        }
        Object obj = f2hVar.f;
        int i2 = f2hVar.h;
        boolean z = true;
        if (i2 == 0) {
            ch3.d0(obj);
            l9b l9bVar2 = this.c;
            f2hVar.e = l9bVar2;
            f2hVar.d = j;
            f2hVar.h = 1;
            Object objB = l9bVar2.b(f2hVar);
            hu4 hu4Var = hu4.a;
            if (objB == hu4Var) {
                return hu4Var;
            }
            l9bVar = l9bVar2;
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j = f2hVar.d;
            l9bVar = f2hVar.e;
            ch3.d0(obj);
        }
        try {
            y1h y1hVar = (y1h) this.d.f(j);
            if (y1hVar == null) {
                return Boolean.FALSE;
            }
            if (y1hVar.a == null || !f(y1hVar.b)) {
                z = false;
            }
            return Boolean.valueOf(z);
        } finally {
            l9bVar.g(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object j(long j, q2h q2hVar, nq4 nq4Var) {
        g2h g2hVar;
        l9b l9bVar;
        long j2;
        q2h q2hVar2;
        if (nq4Var instanceof g2h) {
            g2hVar = (g2h) nq4Var;
            int i = g2hVar.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                g2hVar.i = i - Integer.MIN_VALUE;
            } else {
                g2hVar = new g2h(this, nq4Var);
            }
        } else {
            g2hVar = new g2h(this, nq4Var);
        }
        Object obj = g2hVar.g;
        int i2 = g2hVar.i;
        if (i2 == 0) {
            ch3.d0(obj);
            g2hVar.e = q2hVar;
            l9bVar = this.c;
            g2hVar.f = l9bVar;
            g2hVar.d = j;
            g2hVar.i = 1;
            Object objB = l9bVar.b(g2hVar);
            hu4 hu4Var = hu4.a;
            if (objB == hu4Var) {
                return hu4Var;
            }
            j2 = j;
            q2hVar2 = q2hVar;
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j2 = g2hVar.d;
            l9bVar = g2hVar.f;
            q2h q2hVar3 = g2hVar.e;
            ch3.d0(obj);
            q2hVar2 = q2hVar3;
        }
        l9b l9bVar2 = l9bVar;
        try {
            l8b l8bVar = this.d;
            l8bVar.l(j2, y1h.a(i((y1h) l8bVar.f(j2)), q2hVar2, ((Number) this.b.invoke()).longValue(), null, 0L, 0L, null, 0L, 0L, 252));
            return sbi.a;
        } finally {
            l9bVar2.g(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object k(long j, boolean z, u8b u8bVar, long j2, nq4 nq4Var) {
        h2h h2hVar;
        l9b l9bVar;
        long j3;
        boolean z2;
        u8b u8bVar2;
        long j4;
        y1h y1hVarA;
        if (nq4Var instanceof h2h) {
            h2hVar = (h2h) nq4Var;
            int i = h2hVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                h2hVar.k = i - Integer.MIN_VALUE;
            } else {
                h2hVar = new h2h(this, nq4Var);
            }
        } else {
            h2hVar = new h2h(this, nq4Var);
        }
        Object obj = h2hVar.i;
        int i2 = h2hVar.k;
        if (i2 == 0) {
            ch3.d0(obj);
            h2hVar.g = u8bVar;
            l9bVar = this.c;
            h2hVar.h = l9bVar;
            j3 = j;
            h2hVar.d = j3;
            z2 = z;
            h2hVar.f = z2;
            h2hVar.e = j2;
            h2hVar.k = 1;
            Object objB = l9bVar.b(h2hVar);
            hu4 hu4Var = hu4.a;
            if (objB == hu4Var) {
                return hu4Var;
            }
            u8bVar2 = u8bVar;
            j4 = j2;
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            long j5 = h2hVar.e;
            boolean z3 = h2hVar.f;
            long j6 = h2hVar.d;
            l9bVar = h2hVar.h;
            u8b u8bVar3 = h2hVar.g;
            ch3.d0(obj);
            u8bVar2 = u8bVar3;
            j4 = j5;
            z2 = z3;
            j3 = j6;
        }
        l9b l9bVar2 = l9bVar;
        try {
            long jLongValue = ((Number) this.b.invoke()).longValue();
            l8b l8bVar = this.d;
            if (z2) {
                y1hVarA = y1h.a(i((y1h) l8bVar.f(j3)), null, 0L, null, 0L, 0L, u8bVar2, j4, jLongValue, 31);
            } else {
                y1hVarA = y1h.a(i((y1h) l8bVar.f(j3)), null, 0L, u8bVar2, j4, jLongValue, null, 0L, 0L, 227);
            }
            l8bVar.l(j3, y1hVarA);
            return sbi.a;
        } finally {
            l9bVar2.g(null);
        }
    }
}
