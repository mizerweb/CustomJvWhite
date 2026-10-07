package defpackage;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.regex.Pattern;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class pe1 {
    public static final /* synthetic */ zv8[] u = {new z8b(pe1.class, "observeJob", "getObserveJob()Lkotlinx/coroutines/Job;"), zo5.e(zfe.a, pe1.class, "loadMembersJob", "getLoadMembersJob()Lkotlinx/coroutines/Job;")};
    public static final long v;
    public final y82 a;
    public final ny8 b;
    public final ny8 c;
    public final ny8 d;
    public final ny8 e;
    public final ny8 f;
    public final ny8 g;
    public final ny8 h;
    public final ny8 i;
    public final ny8 j;
    public final ny8 k;
    public final ny8 l;
    public final ny8 m;
    public final mjg n;
    public final mjg o;
    public final ifh p;
    public final p3c q;
    public sgg r;
    public sgg s;
    public final p3c t;

    static {
        ghb ghbVar = ew5.b;
        v = qe7.O(3, lw5.SECONDS);
    }

    public pe1(y82 y82Var, ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4, ny8 ny8Var5, ny8 ny8Var6, ny8 ny8Var7, ny8 ny8Var8, ny8 ny8Var9, ny8 ny8Var10, ny8 ny8Var11, ny8 ny8Var12) {
        this.a = y82Var;
        this.b = ny8Var;
        this.c = ny8Var2;
        this.d = ny8Var3;
        this.e = ny8Var4;
        this.f = ny8Var5;
        this.g = ny8Var6;
        this.h = ny8Var7;
        this.i = ny8Var8;
        this.j = ny8Var9;
        this.k = ny8Var10;
        this.l = ny8Var11;
        this.m = ny8Var12;
        mjg mjgVarA = p90.a(be1.n);
        this.n = mjgVarA;
        this.o = mjgVarA;
        this.p = new ifh(new w40(ny8Var4, 1));
        this.q = qyj.S();
        this.t = qyj.S();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object a(pe1 pe1Var, long j, nq4 nq4Var) {
        fe1 fe1Var;
        List listS;
        Long l;
        if (nq4Var instanceof fe1) {
            fe1Var = (fe1) nq4Var;
            int i = fe1Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                fe1Var.f = i - Integer.MIN_VALUE;
            } else {
                fe1Var = new fe1(pe1Var, nq4Var);
            }
        } else {
            fe1Var = new fe1(pe1Var, nq4Var);
        }
        Object objM0 = fe1Var.d;
        int i2 = fe1Var.f;
        if (i2 == 0) {
            ch3.d0(objM0);
            vg4 vg4Var = (vg4) ((no4) pe1Var.f.getValue()).j(j).a.getValue();
            if (vg4Var != null && (listS = vg4Var.s()) != null && (l = (Long) ww3.t1(listS)) != null) {
                long jLongValue = l.longValue();
                fe1Var.f = 1;
                objM0 = lvb.M0(v, new i20(pe1Var, jLongValue, (lq4) null, 3), fe1Var);
                hu4 hu4Var = hu4.a;
                if (objM0 == hu4Var) {
                    return hu4Var;
                }
            }
            return null;
        }
        if (i2 != 1) {
            ore.k("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ch3.d0(objM0);
        yhc yhcVar = (yhc) objM0;
        if (yhcVar != null) {
            return yhcVar.b;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:54:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:55:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:57:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:58:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:61:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:62:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:66:0x0105  */
    /* JADX WARN: Code duplicated, block: B:7:0x001c  */
    public static final Object b(pe1 pe1Var, n29 n29Var, nq4 nq4Var) {
        oe1 oe1Var;
        int i;
        String str;
        CharSequence charSequence;
        Long l;
        rt2 rt2Var;
        String str2;
        CharSequence charSequence2;
        int i2;
        Long l2;
        String str3;
        String str4;
        mjg mjgVar;
        Object value;
        Long l3;
        long jLongValue;
        Long l4;
        boolean z;
        pe1Var.getClass();
        if (nq4Var instanceof oe1) {
            oe1Var = (oe1) nq4Var;
            int i3 = oe1Var.k;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                oe1Var.k = i3 - Integer.MIN_VALUE;
            } else {
                oe1Var = new oe1(pe1Var, nq4Var);
            }
        } else {
            oe1Var = new oe1(pe1Var, nq4Var);
        }
        Object obj = oe1Var.i;
        int i4 = oe1Var.k;
        if (i4 == 0) {
            ch3.d0(obj);
            oui ouiVar = n29Var.h;
            i = ((ouiVar != null ? new Integer(ouiVar.h) : null) != null && (ouiVar == null || ouiVar.h != 0)) ? 0 : 1;
            String str5 = ouiVar != null ? ouiVar.d : null;
            ir7 ir7Var = n29Var.g;
            str = ir7Var != null ? ir7Var.f : null;
            CharSequence charSequenceA = "";
            if (i == 0) {
                Pattern pattern = m3c.a;
                charSequenceA = m3c.a(str5 != null ? str5 : "", (p4c) pe1Var.d.getValue());
            }
            Long l5 = ouiVar != null ? new Long(ouiVar.g) : null;
            if (l5 != null) {
                long jLongValue2 = l5.longValue();
                xn3 xn3VarD = pe1Var.d();
                oe1Var.d = str5;
                oe1Var.e = str;
                oe1Var.f = charSequenceA;
                oe1Var.g = l5;
                oe1Var.h = i;
                oe1Var.k = 1;
                Object objI = xn3VarD.i(jLongValue2, oe1Var);
                hu4 hu4Var = hu4.a;
                if (objI == hu4Var) {
                    return hu4Var;
                }
                String str6 = str5;
                charSequence2 = charSequenceA;
                i2 = i;
                l2 = l5;
                obj = objI;
                str3 = str6;
            } else {
                charSequence = charSequenceA;
                l = l5;
                rt2Var = null;
                str2 = str5;
            }
            str4 = str;
            mjgVar = pe1Var.n;
            do {
                value = mjgVar.getValue();
                if (rt2Var != null) {
                    l3 = new Long(rt2Var.a);
                } else {
                    l3 = null;
                }
                if (l != null) {
                    jLongValue = l.longValue();
                } else {
                    jLongValue = Long.MIN_VALUE;
                }
                l4 = new Long(jLongValue);
                if (i != 0) {
                    z = true;
                } else {
                    z = false;
                }
            } while (!mjgVar.h(value, new be1(l3, l, str2, str2, str4, l4, charSequence, z, 1792)));
            return Boolean.valueOf(i != 0);
        }
        if (i4 != 1) {
            ore.k("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        i2 = oe1Var.h;
        l2 = oe1Var.g;
        charSequence2 = oe1Var.f;
        str = oe1Var.e;
        str3 = oe1Var.d;
        ch3.d0(obj);
        rt2Var = (rt2) obj;
        str2 = str3;
        l = l2;
        charSequence = charSequence2;
        i = i2;
        str4 = str;
        mjgVar = pe1Var.n;
        do {
            value = mjgVar.getValue();
            if (rt2Var != null) {
                l3 = new Long(rt2Var.a);
            } else {
                l3 = null;
            }
            if (l != null) {
                jLongValue = l.longValue();
            } else {
                jLongValue = Long.MIN_VALUE;
            }
            l4 = new Long(jLongValue);
            if (i != 0) {
                z = true;
            } else {
                z = false;
            }
        } while (!mjgVar.h(value, new be1(l3, l, str2, str2, str4, l4, charSequence, z, 1792)));
        return Boolean.valueOf(i != 0);
    }

    public final CharSequence c(CharSequence charSequence, boolean z) {
        if (charSequence == null) {
            return charSequence;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append(charSequence);
        if (z) {
            sb8.b(spannableStringBuilder, (char) 8203, new qsi((Context) this.l.getValue(), 3, false, ldf.d));
            spannableStringBuilder.append((char) 8202);
        }
        return new SpannedString(spannableStringBuilder);
    }

    public final xn3 d() {
        return (xn3) this.b.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(be1 be1Var, sv1 sv1Var, nq4 nq4Var) {
        ge1 ge1Var;
        pe1 pe1Var;
        String str;
        if (nq4Var instanceof ge1) {
            ge1Var = (ge1) nq4Var;
            int i = ge1Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                ge1Var.f = i - Integer.MIN_VALUE;
            } else {
                ge1Var = new ge1(this, nq4Var);
            }
        } else {
            ge1Var = new ge1(this, nq4Var);
        }
        Object objM0 = ge1Var.d;
        int i2 = ge1Var.f;
        if (i2 == 0) {
            ch3.d0(objM0);
            CharSequence charSequence = be1Var.m;
            if (charSequence != null && !r5h.X0(charSequence)) {
                return be1Var.m;
            }
            Long lK = sv1Var.k();
            if (lK == null) {
                return null;
            }
            long jLongValue = lK.longValue();
            ge1Var.f = 1;
            pe1Var = this;
            objM0 = lvb.M0(v, new i20(pe1Var, jLongValue, (lq4) null, 3), ge1Var);
            hu4 hu4Var = hu4.a;
            if (objM0 == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(objM0);
            pe1Var = this;
        }
        yhc yhcVar = (yhc) objM0;
        return (yhcVar == null || (str = yhcVar.b) == null) ? ((Context) pe1Var.l.getValue()).getString(R.string.call_incoming_from_organization) : str;
    }

    public final sgg f(xx6 xx6Var, boolean z) {
        ghb ghbVar = ew5.b;
        return yab.i0(this.a, null, 2, new ky6(e9i.T(new j3(new fz6(new fz6(new jz(tre.G0(xx6Var, qe7.O(1, lw5.SECONDS)), 13), new sfd(this, (lq4) null, 25), 3), new wo0(this, z, (lq4) null, 1), 3), 14, new ie1(3, null, 0)), (xt4) this.p.getValue()), null, 0), 1);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:102:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:104:0x02c9  */
    /* JADX WARN: Code duplicated, block: B:107:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:110:0x02e2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:111:0x02e4  */
    /* JADX WARN: Code duplicated, block: B:112:0x02e6 A[PHI: r11
  0x02e6: PHI (r11v2 java.lang.String) = (r11v1 java.lang.String), (r11v5 java.lang.String) binds: [B:109:0x02e0, B:111:0x02e4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:113:0x02e9  */
    /* JADX WARN: Code duplicated, block: B:116:0x02f0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:117:0x02f2  */
    /* JADX WARN: Code duplicated, block: B:118:0x02f5  */
    /* JADX WARN: Code duplicated, block: B:122:0x0335  */
    /* JADX WARN: Code duplicated, block: B:126:0x0372  */
    /* JADX WARN: Code duplicated, block: B:129:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:27:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:30:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:37:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:39:0x0117  */
    /* JADX WARN: Code duplicated, block: B:40:0x011c  */
    /* JADX WARN: Code duplicated, block: B:43:0x0120  */
    /* JADX WARN: Code duplicated, block: B:47:0x0153  */
    /* JADX WARN: Code duplicated, block: B:51:0x0166  */
    /* JADX WARN: Code duplicated, block: B:53:0x0184  */
    /* JADX WARN: Code duplicated, block: B:55:0x018a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:56:0x018c  */
    /* JADX WARN: Code duplicated, block: B:57:0x0191  */
    /* JADX WARN: Code duplicated, block: B:60:0x0198  */
    /* JADX WARN: Code duplicated, block: B:61:0x019a  */
    /* JADX WARN: Code duplicated, block: B:67:0x01ae A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:84:0x025e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:85:0x0260  */
    /* JADX WARN: Code duplicated, block: B:87:0x0271  */
    /* JADX WARN: Code duplicated, block: B:89:0x027a  */
    /* JADX WARN: Code duplicated, block: B:91:0x0280  */
    /* JADX WARN: Code duplicated, block: B:93:0x0293  */
    /* JADX WARN: Code duplicated, block: B:95:0x029d  */
    /* JADX WARN: Code duplicated, block: B:96:0x02a0  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:122:0x0335 -> B:123:0x034b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object g(defpackage.sv1 r42, defpackage.nq4 r43) {
        /*
            Method dump skipped, instruction units count: 894
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pe1.g(sv1, nq4):java.lang.Object");
    }

    public final void h(long j, boolean z, Integer num) {
        sgg sggVarF = f(new bye(new me1(new jz(d().l(j), 13), (lq4) null, this, j, num)), z);
        this.q.B(this, u[0], sggVarF);
    }

    public final void i(String str) throws IllegalAccessException, InvocationTargetException {
        sgg sggVar = this.s;
        if (sggVar != null) {
            sggVar.b(null);
        }
        sgg sggVar2 = this.r;
        if (sggVar2 == null || !sggVar2.isActive()) {
            this.r = yab.i0(this.a, ((n0c) ((xhh) this.e.getValue())).b(), 0, new t20(this, str, (lq4) null, 3), 2);
        }
    }
}
