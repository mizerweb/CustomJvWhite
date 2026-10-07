package defpackage;

import android.content.Context;
import java.io.Serializable;
import ru.ok.tamtam.messages.b;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class s9d extends a8j {
    public static final /* synthetic */ zv8[] v;
    public final long c;
    public final long d;
    public final long e;
    public final xn3 f;
    public final sua g;
    public final et3 h;
    public final Context i;
    public final b j;
    public final ny8 k;
    public final ny8 l;
    public final ny8 m;
    public final mjg n;
    public final r8e o;
    public final mjg p;
    public final r8e q;
    public final int r;
    public final p3c s;
    public final ic6 t;
    public final ic6 u;

    static {
        z8b z8bVar = new z8b(s9d.class, "showAllVotersJob", "getShowAllVotersJob()Lkotlinx/coroutines/Job;");
        zfe.a.getClass();
        v = new zv8[]{z8bVar};
    }

    public s9d(long j, long j2, long j3, xn3 xn3Var, sua suaVar, et3 et3Var, Context context, b bVar, ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3) {
        this.c = j;
        this.d = j2;
        this.e = j3;
        this.f = xn3Var;
        this.g = suaVar;
        this.h = et3Var;
        this.i = context;
        this.j = bVar;
        this.k = ny8Var;
        this.l = ny8Var2;
        this.m = ny8Var3;
        mjg mjgVarA = p90.a("");
        this.n = mjgVarA;
        this.o = new r8e(mjgVarA);
        mjg mjgVarA2 = p90.a(r66.a);
        this.p = mjgVarA2;
        this.q = new r8e(mjgVarA2);
        this.r = gm0.K(40.0f * yl5.d().getDisplayMetrics().density);
        this.s = qyj.S();
        this.t = new ic6(null);
        this.u = new ic6(null);
        yab.i0(this.b, null, 0, new xra(this, null, 10), 3);
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:78:0x017a  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    public static final Serializable B(s9d s9dVar, o5d o5dVar, boolean z, wcd wcdVar, boolean z2, nq4 nq4Var) {
        q9d q9dVar;
        c79 c79VarW;
        boolean z3;
        c79 c79Var;
        c79 c79Var2;
        Object obj;
        CharSequence charSequence;
        int i;
        if (nq4Var instanceof q9d) {
            q9dVar = (q9d) nq4Var;
            int i2 = q9dVar.i;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                q9dVar.i = i2 - Integer.MIN_VALUE;
            } else {
                q9dVar = new q9d(s9dVar, nq4Var);
            }
        } else {
            q9dVar = new q9d(s9dVar, nq4Var);
        }
        Object obj2 = q9dVar.g;
        hu4 hu4Var = hu4.a;
        int i3 = q9dVar.i;
        if (i3 == 0) {
            ch3.d0(obj2);
            c79VarW = yab.w();
            if (z2) {
                n5d n5dVar = o5dVar.e;
                if (n5dVar == null) {
                    ore.p("Required value was null.");
                    return null;
                }
                Integer numD = n5dVar.d();
                u8b u8bVar = n5dVar.b;
                Object[] objArr = u8bVar.a;
                int i4 = u8bVar.b;
                int i5 = 0;
                for (int i6 = 0; i6 < i4; i6++) {
                    if (((m5d) objArr[i6]).b > 0) {
                        i5++;
                    }
                }
                u8b u8bVar2 = o5dVar.c;
                Object[] objArr2 = u8bVar2.a;
                int i7 = u8bVar2.b;
                int i8 = 0;
                int i9 = 0;
                while (i8 < i7) {
                    k5d k5dVar = (k5d) objArr2[i8];
                    int i10 = k5dVar.b;
                    u8b u8bVar3 = n5dVar.b;
                    Object[] objArr3 = u8bVar3.a;
                    int i11 = u8bVar3.b;
                    int i12 = 0;
                    while (true) {
                        if (i12 >= i11) {
                            obj = null;
                            break;
                        }
                        obj = objArr3[i12];
                        if (((m5d) obj).a == i10) {
                            break;
                        }
                        i12++;
                    }
                    m5d m5dVar = (m5d) obj;
                    if (m5dVar == null || m5dVar.b <= 0) {
                        i7 = i7;
                        n5dVar = n5dVar;
                        numD = numD;
                        objArr2 = objArr2;
                        i8 = i8;
                    } else {
                        if (wcdVar == 0 || (charSequence = (CharSequence) wcdVar.b.c(i10)) == null) {
                            String name = c79.class.getName();
                            a4c a4cVar = gm0.f;
                            if (a4cVar != null) {
                                je9 je9Var = je9.f;
                                if (a4cVar.b(je9Var)) {
                                    a4cVar.c(je9Var, name, c0a.m(s9dVar.e, ") is null", qt4.s(s9dVar.d, "preProcessedPoll for message(", ") poll(")), null);
                                }
                            }
                            charSequence = k5dVar.a;
                        } else {
                            i7 = i7;
                            n5dVar = n5dVar;
                            numD = numD;
                            objArr2 = objArr2;
                            i8 = i8;
                        }
                        CharSequence charSequence2 = charSequence;
                        if (i5 == 1) {
                            i = 16;
                        } else if (i9 == 0) {
                            i = 536870928;
                        } else {
                            i = i9 == i5 + (-1) ? -2147483632 : 1073741840;
                        }
                        c79VarW.add(new a9d(((long) i10) - 9223372036854775806L, i, charSequence2, s9dVar.D(m5dVar.b, m5dVar.d, true), numD != null && i10 == numD.intValue()));
                        i9++;
                    }
                    i8++;
                    i7 = i7;
                    n5dVar = n5dVar;
                    numD = numD;
                    objArr2 = objArr2;
                }
                z3 = z;
                c79Var2 = c79VarW;
            } else {
                q9dVar.d = c79VarW;
                q9dVar.e = c79VarW;
                q9dVar.f = z;
                q9dVar.i = 1;
                if (s9dVar.C(c79VarW, o5dVar, wcdVar, q9dVar) == hu4Var) {
                    return hu4Var;
                }
                z3 = z;
                c79Var = c79VarW;
                c79Var2 = c79Var;
            }
            if (z3) {
                c79VarW.add(new hv6());
            }
            return yab.j(c79Var2);
        }
        if (i3 != 1) {
            ore.k("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        z3 = q9dVar.f;
        c79Var = q9dVar.e;
        c79Var2 = q9dVar.d;
        ch3.d0(obj2);
        c79VarW = c79Var;
        if (z3) {
            c79VarW.add(new hv6());
        }
        return yab.j(c79Var2);
    }

    /* JADX WARN: Code duplicated, block: B:102:0x00d3 A[EDGE_INSN: B:102:0x00d3->B:25:0x00d3 BREAK  A[LOOP:0: B:19:0x00bf->B:23:0x00ce], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:20:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:23:0x00ce A[LOOP:0: B:19:0x00bf->B:23:0x00ce, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:60:0x0205 -> B:61:0x0215). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:94:0x031e -> B:93:0x031c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object C(defpackage.c79 r43, defpackage.o5d r44, defpackage.wcd r45, defpackage.nq4 r46) {
        /*
            Method dump skipped, instruction units count: 833
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s9d.C(c79, o5d, wcd, nq4):java.lang.Object");
    }

    public final String D(int i, int i2, boolean z) {
        return this.i.getResources().getQuantityString(z ? R.plurals.oneme_poll_result__anonymous_answer_vote_count : R.plurals.oneme_poll_result__vote_count, i, Integer.valueOf(i)) + " · " + i2 + "%";
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object E(lq4 lq4Var) {
        r9d r9dVar;
        if (lq4Var instanceof r9d) {
            r9dVar = (r9d) lq4Var;
            int i = r9dVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                r9dVar.f = i - Integer.MIN_VALUE;
            } else {
                r9dVar = new r9d(this, (nq4) lq4Var);
            }
        } else {
            r9dVar = new r9d(this, (nq4) lq4Var);
        }
        Object objV = r9dVar.d;
        int i2 = r9dVar.f;
        if (i2 == 0) {
            ch3.d0(objV);
            r9dVar.f = 1;
            objV = this.f.v(this.c, r9dVar);
            hu4 hu4Var = hu4.a;
            if (objV == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(objV);
        }
        return Boolean.valueOf(((rt2) objV).k0((e5d) this.m.getValue()));
    }
}
