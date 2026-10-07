package defpackage;

import android.content.Context;
import android.net.Uri;
import android.text.SpannableString;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class i9f {
    public final Context a;
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

    public i9f(Context context, ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4, ny8 ny8Var5, ny8 ny8Var6, ny8 ny8Var7, ny8 ny8Var8, ny8 ny8Var9, ny8 ny8Var10) {
        this.a = context;
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
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0071  */
    /* JADX WARN: Code duplicated, block: B:33:0x0079  */
    /* JADX WARN: Code duplicated, block: B:34:0x007c  */
    /* JADX WARN: Code duplicated, block: B:37:0x0080 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:38:0x0082  */
    /* JADX WARN: Code duplicated, block: B:39:0x0085  */
    /* JADX WARN: Code duplicated, block: B:42:0x008d  */
    /* JADX WARN: Code duplicated, block: B:47:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:50:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:53:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:55:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:56:0x0107  */
    /* JADX WARN: Code duplicated, block: B:59:0x0110  */
    /* JADX WARN: Code duplicated, block: B:62:0x011a  */
    /* JADX WARN: Code duplicated, block: B:64:0x0124  */
    /* JADX WARN: Code duplicated, block: B:65:0x0126  */
    /* JADX WARN: Code duplicated, block: B:67:0x0130  */
    /* JADX WARN: Code duplicated, block: B:69:0x0133 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:71:0x0136  */
    /* JADX WARN: Code duplicated, block: B:72:0x0147  */
    /* JADX WARN: Code duplicated, block: B:73:0x015a  */
    /* JADX WARN: Code duplicated, block: B:79:0x0175  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:81:0x017c  */
    /* JADX WARN: Code duplicated, block: B:84:0x016e A[EDGE_INSN: B:84:0x016e->B:76:0x016e BREAK  A[LOOP:0: B:60:0x0114->B:86:?], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:86:? A[LOOP:0: B:60:0x0114->B:86:?, LOOP_END, SYNTHETIC] */
    public final Object a(f9f f9fVar, nq4 nq4Var) {
        h9f h9fVar;
        rt2 rt2Var;
        rt2 rt2Var2;
        Uri uriK;
        gda gdaVar;
        dia diaVar;
        int i;
        ArrayList arrayListR;
        String str;
        CharSequence charSequenceA;
        String strD;
        xcd xcdVarL;
        v2c v2cVar;
        List list;
        String[] strArr;
        List listA;
        b50<l40> b50Var;
        w50 w50Var;
        int i2;
        String strS;
        f9f f9fVar2 = f9fVar;
        if (nq4Var instanceof h9f) {
            h9fVar = (h9f) nq4Var;
            int i3 = h9fVar.g;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                h9fVar.g = i3 - Integer.MIN_VALUE;
            } else {
                h9fVar = new h9f(this, nq4Var);
            }
        } else {
            h9fVar = new h9f(this, nq4Var);
        }
        Object objI = h9fVar.e;
        hu4 hu4Var = hu4.a;
        int i4 = h9fVar.g;
        CharSequence charSequence = null;
        if (i4 == 0) {
            ch3.d0(objI);
            rt2Var = f9fVar2.d;
            if (rt2Var == null) {
                xn3 xn3Var = (xn3) this.e.getValue();
                long j = f9fVar2.g;
                h9fVar.d = f9fVar2;
                h9fVar.g = 1;
                objI = xn3Var.i(j, h9fVar);
                if (objI == hu4Var) {
                    return hu4Var;
                }
            }
            rt2Var2 = rt2Var;
            if (rt2Var2 != null || (strS = rt2Var2.s(us0.c, rs0.a)) == null) {
                uriK = null;
            } else {
                if (r5h.X0(strS)) {
                    strS = null;
                }
                if (strS != null) {
                    uriK = sb8.K(strS);
                } else {
                    uriK = null;
                }
            }
            gdaVar = f9fVar2.f;
            diaVar = gdaVar.i;
            if (diaVar != null) {
                i = diaVar.a;
            } else {
                i = 0;
            }
            if (i == 3) {
                if (diaVar != null) {
                    ore.p("Required value was null.");
                    return null;
                }
                gdaVar = diaVar.c;
            }
            if (rt2Var2 != null) {
                rt2Var2.K0();
                charSequence = rt2Var2.j;
            }
            CharSequence charSequence2 = charSequence;
            arrayListR = pm9.r(gdaVar.p);
            str = gdaVar.g;
            charSequenceA = "";
            if (str != null || (strD = xoh.d(str)) == null) {
                strD = "";
            }
            if (f9fVar2.c.isEmpty()) {
                xcdVarL = b().l(strD, arrayListR);
            } else {
                v2cVar = (v2c) this.d.getValue();
                xcdVarL = b().l(strD, arrayListR);
                list = f9fVar2.c;
                v2cVar.getClass();
                strArr = xcdVarL.b;
                if (!list.isEmpty()) {
                    listA = v2cVar.b().a(xcdVarL.a.toString(), list);
                    if (listA.isEmpty()) {
                        b50Var = gdaVar.h;
                        if (!b50Var.isEmpty()) {
                            for (l40 l40Var : b50Var) {
                                w50Var = l40Var.a;
                                if (w50Var == null) {
                                    i2 = -1;
                                } else {
                                    i2 = u2c.$EnumSwitchMapping$0[w50Var.ordinal()];
                                }
                                if (i2 != 1) {
                                    charSequenceA = v2cVar.a("📄", list, true, ((mp6) l40Var).f);
                                } else if (i2 != 2) {
                                    lxf lxfVar = (lxf) l40Var;
                                    charSequenceA = v2cVar.a("🔗", list, false, lxfVar.h, lxfVar.f, lxfVar.g);
                                } else if (i2 == 3) {
                                    hh4 hh4Var = (hh4) l40Var;
                                    charSequenceA = v2cVar.a("👤", list, false, hh4Var.g, hh4Var.h);
                                }
                                if (charSequenceA.length() > 0) {
                                    break;
                                }
                            }
                            if (charSequenceA.length() != 0) {
                                xcdVarL = new xcd(charSequenceA, strArr);
                            }
                        }
                    } else {
                        j7c j7cVarB = v2cVar.b();
                        CharSequence charSequence3 = xcdVarL.a;
                        kbc kbcVarM = pq3.j.e(v2cVar.a).m();
                        j7cVarB.getClass();
                        xcdVarL = new xcd(j7c.d(charSequence3, listA, kbcVarM), strArr);
                    }
                }
            }
            return new sja(uriK, f9fVar2.c, f9fVar2.f, rt2Var2, f9fVar2.b, xcdVarL, charSequence2, f9fVar2.g, f9fVar2.i);
        }
        if (i4 != 1) {
            ore.k("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        f9fVar2 = h9fVar.d;
        ch3.d0(objI);
        rt2Var = (rt2) objI;
        rt2Var2 = rt2Var;
        if (rt2Var2 != null) {
            uriK = null;
        } else {
            uriK = null;
        }
        gdaVar = f9fVar2.f;
        diaVar = gdaVar.i;
        if (diaVar != null) {
            i = diaVar.a;
        } else {
            i = 0;
        }
        if (i == 3) {
            if (diaVar != null) {
                ore.p("Required value was null.");
                return null;
            }
            gdaVar = diaVar.c;
        }
        if (rt2Var2 != null) {
            rt2Var2.K0();
            charSequence = rt2Var2.j;
        }
        CharSequence charSequence4 = charSequence;
        arrayListR = pm9.r(gdaVar.p);
        str = gdaVar.g;
        charSequenceA = "";
        if (str != null) {
            strD = "";
        } else {
            strD = "";
        }
        if (f9fVar2.c.isEmpty()) {
            v2cVar = (v2c) this.d.getValue();
            xcdVarL = b().l(strD, arrayListR);
            list = f9fVar2.c;
            v2cVar.getClass();
            strArr = xcdVarL.b;
            if (!list.isEmpty()) {
                listA = v2cVar.b().a(xcdVarL.a.toString(), list);
                if (listA.isEmpty()) {
                    j7c j7cVarB2 = v2cVar.b();
                    CharSequence charSequence5 = xcdVarL.a;
                    kbc kbcVarM2 = pq3.j.e(v2cVar.a).m();
                    j7cVarB2.getClass();
                    xcdVarL = new xcd(j7c.d(charSequence5, listA, kbcVarM2), strArr);
                } else {
                    b50Var = gdaVar.h;
                    if (!b50Var.isEmpty()) {
                        while (r2.hasNext()) {
                            w50Var = l40Var.a;
                            if (w50Var == null) {
                                i2 = -1;
                            } else {
                                i2 = u2c.$EnumSwitchMapping$0[w50Var.ordinal()];
                            }
                            if (i2 != 1) {
                                charSequenceA = v2cVar.a("📄", list, true, ((mp6) l40Var).f);
                            } else if (i2 != 2) {
                                lxf lxfVar2 = (lxf) l40Var;
                                charSequenceA = v2cVar.a("🔗", list, false, lxfVar2.h, lxfVar2.f, lxfVar2.g);
                            } else if (i2 == 3) {
                                hh4 hh4Var2 = (hh4) l40Var;
                                charSequenceA = v2cVar.a("👤", list, false, hh4Var2.g, hh4Var2.h);
                            }
                            if (charSequenceA.length() > 0) {
                                break;
                                break;
                            }
                        }
                        if (charSequenceA.length() != 0) {
                            xcdVarL = new xcd(charSequenceA, strArr);
                        }
                    }
                }
            }
        } else {
            xcdVarL = b().l(strD, arrayListR);
        }
        return new sja(uriK, f9fVar2.c, f9fVar2.f, rt2Var2, f9fVar2.b, xcdVarL, charSequence4, f9fVar2.g, f9fVar2.i);
    }

    public final p4c b() {
        return (p4c) this.b.getValue();
    }

    public final j7c c() {
        return (j7c) this.j.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:121:0x0251  */
    /* JADX WARN: Code duplicated, block: B:146:0x030b  */
    /* JADX WARN: Code duplicated, block: B:163:0x0347  */
    /* JADX WARN: Code duplicated, block: B:208:0x0443  */
    /* JADX WARN: Code duplicated, block: B:317:0x06a7  */
    /* JADX WARN: Code duplicated, block: B:320:0x06b4  */
    /* JADX WARN: Code duplicated, block: B:323:0x06be  */
    /* JADX WARN: Code duplicated, block: B:324:0x06c9  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v28 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7, types: [st2] */
    /* JADX WARN: Type inference failed for: r21v2 */
    /* JADX WARN: Type inference failed for: r21v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r21v4 */
    /* JADX WARN: Type inference failed for: r22v1 */
    /* JADX WARN: Type inference failed for: r22v2, types: [android.net.Uri] */
    /* JADX WARN: Type inference failed for: r22v3 */
    /* JADX WARN: Type inference failed for: r2v55 */
    /* JADX WARN: Type inference failed for: r2v56, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r2v74, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v76 */
    /* JADX WARN: Type inference failed for: r2v89 */
    /* JADX WARN: Type inference failed for: r2v90 */
    public final Object d(f9f f9fVar, nq4 nq4Var) {
        Uri uriK;
        boolean z;
        CharSequence charSequenceB;
        vg4 vg4VarW;
        vu2 vu2Var;
        String str;
        boolean z2;
        boolean z3;
        boolean z4;
        vg4 vg4VarW2;
        Long lValueOf;
        vg4 vg4VarW3;
        xfa xfaVar;
        boolean z5;
        List list;
        ?? r10;
        ?? r2;
        ?? K;
        Object objD;
        boolean z6;
        xcd xcdVarK;
        xcd xcdVarK2;
        ?? r3;
        String strD;
        st2 st2Var;
        xcd xcdVar;
        gm4 gm4Var;
        rs0 rs0Var = rs0.a;
        us0 us0Var = us0.c;
        a8g a8gVar = pq3.j;
        int i = f9fVar.a;
        CharSequence string = null;
        if (i == 1 || i == 2) {
            String strS = f9fVar.d.s(us0Var, rs0Var);
            if (strS == null) {
                uriK = null;
            } else {
                if (r5h.X0(strS)) {
                    strS = null;
                }
                if (strS != null) {
                    uriK = sb8.K(strS);
                } else {
                    uriK = null;
                }
            }
            p4c p4cVarB = b();
            rt2 rt2Var = f9fVar.d;
            rt2Var.K0();
            xcd xcdVarK3 = p4cVarB.k(rt2Var.j);
            v2c v2cVar = (v2c) this.d.getValue();
            List list2 = f9fVar.c;
            rt2 rt2Var2 = f9fVar.d;
            Context context = v2cVar.a;
            j7c j7cVarB = v2cVar.b();
            nx2 nx2Var = rt2Var2.b;
            boolean zF = j7cVarB.f(xoh.b(nx2Var.J), list2);
            boolean z7 = !zF && v2cVar.b().f(rt2Var2.F(), list2);
            List listA = v2cVar.b().a(xcdVarK3.a.toString(), list2);
            j7c j7cVarB2 = v2cVar.b();
            kbc kbcVarM = a8gVar.e(context).m();
            j7cVarB2.getClass();
            SpannableString spannableStringE = j7c.e(kbcVarM, xcdVarK3, listA);
            String strB = xoh.b(nx2Var.J);
            if (zF) {
                List listA2 = v2cVar.b().a(strB, list2);
                j7c j7cVarB3 = v2cVar.b();
                kbc kbcVarM2 = a8gVar.e(context).m();
                j7cVarB3.getClass();
                charSequenceB = j7c.d(strB, listA2, kbcVarM2);
                z = false;
            } else if (z7 || list2.isEmpty() || (vg4VarW = rt2Var2.w()) == null) {
                z = false;
                charSequenceB = null;
            } else {
                String str2 = (String) list2.get(0);
                Collections.singletonList(str2);
                charSequenceB = v2cVar.b().b(a8gVar.e(context).m(), vg4VarW, str2);
                z = charSequenceB.length() > 0;
            }
            xcd xcdVar2 = new xcd(spannableStringE, xcdVarK3.b);
            if (charSequenceB != null) {
                p4c p4cVar = v2cVar.b;
                String string2 = charSequenceB.toString();
                p4cVar.getClass();
                xoh.c(string2, p4cVar);
            }
            rt2 rt2Var3 = f9fVar.d;
            v73 v73Var = v73.a;
            fda fdaVar = rt2Var3.c;
            boolean z8 = fdaVar != null && fdaVar.b.v() == ((s7f) ((et3) this.h.getValue())).t();
            fda fdaVar2 = rt2Var3.c;
            if (fdaVar2 != null && z8 && (xfaVar = fdaVar2.a.i) != xfa.SENT) {
                int i2 = xfaVar == null ? -1 : g9f.$EnumSwitchMapping$1[xfaVar.ordinal()];
                if (i2 != 1) {
                    if (i2 == 2) {
                        v73Var = v73.b;
                    } else if (i2 == 3) {
                        v73Var = v73.c;
                    } else if (i2 == 4) {
                        v73Var = v73.d;
                    } else {
                        if (i2 != 5) {
                            ore.o();
                            return null;
                        }
                        v73Var = v73.e;
                    }
                }
            }
            int iOrdinal = v73Var.ordinal();
            if (iOrdinal == 0) {
                vu2Var = vu2.a;
            } else if (iOrdinal == 1) {
                vu2Var = vu2.b;
            } else if (iOrdinal == 2) {
                vu2Var = vu2.c;
            } else if (iOrdinal == 3) {
                vu2Var = vu2.d;
            } else {
                if (iOrdinal != 4) {
                    ore.o();
                    return null;
                }
                vu2Var = vu2.e;
            }
            vu2 vu2Var2 = vu2Var;
            String strQ = (!((Boolean) ((e5d) this.k.getValue()).w6.a(e5d.S6[388]).i()).booleanValue() || (vg4VarW3 = f9fVar.d.w()) == null || (vg4VarW3.a.b.z.b & 16) == 0) ? null : np4.q(this.a, R.string.chat_list_bot_button_open);
            rt2 rt2Var4 = f9fVar.d;
            long j = rt2Var4.a;
            boolean zJ0 = rt2Var4.j0();
            boolean zS0 = f9fVar.d.s0((et3) this.h.getValue());
            boolean zU = f9fVar.d.U();
            nx2 nx2Var2 = f9fVar.d.b;
            boolean z9 = nx2Var2 != null && ch3.s(nx2Var2.k0);
            rt2 rt2Var5 = f9fVar.d;
            long jX = rt2Var5.x();
            if (jX == 0) {
                str = null;
            } else {
                if (rt2Var5.o == null) {
                    p4c p4cVar2 = (p4c) rt2Var5.q.b.get();
                    rt2Var5.o = oc9.E(p4cVar2.a, p4cVar2.f, jX, p4cVar2.c.f(), false, false, true);
                }
                str = rt2Var5.o;
            }
            rt2 rt2Var6 = f9fVar.d;
            int i3 = rt2Var6.b.m;
            long jQ = rt2Var6.q();
            CharSequence charSequenceE = ((e13) this.c.getValue()).e(f9fVar.d);
            List list3 = f9fVar.c;
            boolean z10 = f9fVar.a == 2;
            rt2 rt2Var7 = f9fVar.d;
            rt2Var7.L0();
            CharSequence charSequence = rt2Var7.m;
            if (!f9fVar.d.u0()) {
                vg4 vg4VarW4 = f9fVar.d.w();
                if (vg4VarW4 != null) {
                    z2 = true;
                    if (vg4VarW4.G()) {
                    }
                    if (((f5d) ((wo6) this.i.getValue())).g() || f9fVar.d.b.t0 <= 0) {
                        z4 = false;
                    } else {
                        z4 = z2;
                    }
                    vg4VarW2 = f9fVar.d.w();
                    if (vg4VarW2 != null) {
                        lValueOf = Long.valueOf(vg4VarW2.v());
                    } else {
                        lValueOf = null;
                    }
                    return new be3(j, zJ0, zS0, zU, z9, str, i3, vu2Var2, uriK, jQ, xcdVar2, charSequenceE, list3, z10, z7, zF, z, charSequence, z3, z4, lValueOf, strQ);
                }
                z2 = true;
                z3 = false;
                if (((f5d) ((wo6) this.i.getValue())).g()) {
                    z4 = false;
                } else {
                    z4 = false;
                }
                vg4VarW2 = f9fVar.d.w();
                if (vg4VarW2 != null) {
                    lValueOf = Long.valueOf(vg4VarW2.v());
                } else {
                    lValueOf = null;
                }
                return new be3(j, zJ0, zS0, zU, z9, str, i3, vu2Var2, uriK, jQ, xcdVar2, charSequenceE, list3, z10, z7, zF, z, charSequence, z3, z4, lValueOf, strQ);
            }
            z2 = true;
            z3 = z2;
            if (((f5d) ((wo6) this.i.getValue())).g()) {
                z4 = false;
            } else {
                z4 = false;
            }
            vg4VarW2 = f9fVar.d.w();
            if (vg4VarW2 != null) {
                lValueOf = Long.valueOf(vg4VarW2.v());
            } else {
                lValueOf = null;
            }
            return new be3(j, zJ0, zS0, zU, z9, str, i3, vu2Var2, uriK, jQ, xcdVar2, charSequenceE, list3, z10, z7, zF, z, charSequence, z3, z4, lValueOf, strQ);
        }
        if (i == 4) {
            boolean zD = jcd.d((jcd) this.g.getValue(), f9fVar.e, null, 2);
            j7c j7cVarC = c();
            Context context2 = this.a;
            kbc kbcVarM3 = a8gVar.e(context2).m();
            vg4 vg4Var = f9fVar.e;
            List list4 = f9fVar.c;
            CharSequence charSequenceB2 = j7cVarC.b(kbcVarM3, vg4Var, (String) ww3.t1(list4));
            if (list4.isEmpty()) {
                charSequenceB2 = vg4Var.t(b());
            } else if (charSequenceB2.length() <= 0 || !cqk.d(charSequenceB2.toString(), vg4Var.k())) {
                charSequenceB2 = vg4Var.k();
            }
            CharSequence charSequence2 = charSequenceB2;
            if (zD) {
                string = context2.getString(jcd.b((jcd) this.g.getValue(), null, 3));
            } else if (vg4Var.B() && !vg4Var.I()) {
                if (vg4Var.f) {
                    string = context2.getString(R.string.tt_you_in_subtitle);
                } else if (vg4Var.E() && vg4Var.H()) {
                    string = context2.getString(R.string.service_notifications);
                } else {
                    string = vg4Var.E() ? context2.getString(R.string.bot) : ((yfd) this.f.getValue()).y(vg4Var);
                }
            }
            return new fm4(vg4Var.v(), charSequence2, string, zD ? false : ((yfd) this.f.getValue()).B(vg4Var.v()).b(), vg4Var.G(), list4, zD ? ((jcd) this.g.getValue()).a() : sb8.K(vg4Var.A(((s7f) ((et3) this.h.getValue())).k())), vg4Var.u());
        }
        if (i == 5) {
            list = null;
            zxd zxdVar = f9fVar.h;
            z5 = true;
            if (((zxdVar == null || (gm4Var = zxdVar.c) == null) ? null : gm4Var.a) != null) {
                Context context3 = this.a;
                List list5 = f9fVar.c;
                gm4 gm4Var2 = zxdVar != null ? zxdVar.c : null;
                if (gm4Var2 == null) {
                    ore.p("Required value was null.");
                    return null;
                }
                pj4 pj4Var = gm4Var2.a;
                if (pj4Var == null) {
                    ore.p("Required value was null.");
                    return null;
                }
                ix2 ix2Var = pj4Var.s;
                bad badVar = new bad(this, 6, f9fVar);
                String strA = pj4Var.a();
                xcd xcdVar3 = (strA == null || strA.length() == 0) ? new xcd("", new String[0]) : (xcd) badVar.invoke(pj4Var.a());
                Pattern pattern = m3c.a;
                String strB2 = pj4Var.b();
                if (strB2 == null) {
                    strB2 = "";
                }
                String strB3 = m3c.b(strB2, pj4Var.c());
                String strB4 = xoh.b(pj4Var.l);
                if (ix2Var.h() && ix2Var.j()) {
                    xcdVar = new xcd(context3.getString(R.string.service_notifications), new String[0]);
                } else if (ix2Var.h()) {
                    xcdVar = new xcd(context3.getString(R.string.bot), new String[0]);
                } else {
                    xcdVar = c().f(strB4, list5) ? (xcd) badVar.invoke(strB4) : new xcd("", new String[0]);
                }
                return new sn7(pj4Var.a, strB3, xcdVar3, xcdVar, (ix2Var.b & 1) != 0, sb8.K(pj4Var.d(us0Var)), gm4Var2.c, pj4Var, list5, f9fVar.i);
            }
        } else {
            z5 = true;
            list = null;
        }
        if (i == 5) {
            zxd zxdVar2 = f9fVar.h;
            if ((zxdVar2 != null ? zxdVar2.a : list) != null) {
                List list6 = f9fVar.c;
                if (zxdVar2 != null) {
                    st2Var = zxdVar2.a;
                } else {
                    r10 = list;
                }
                if (r10 == 0) {
                    r10 = st2Var;
                    ore.p("Required value was null.");
                    return list;
                }
                int i4 = r10.u1;
                String str3 = r10.t;
                String str4 = r10.f;
                String str5 = r10.g;
                if (ch3.r(str5)) {
                    r2 = list;
                } else {
                    strD = vs0.d(str5, us0Var, rs0Var);
                }
                if (r2 != 0) {
                    r10 = st2Var;
                    if (r5h.X0(r2)) {
                        r10 = st2Var;
                        r2 = strD;
                        r3 = r2;
                        r3 = list;
                    }
                    if (r3 != 0) {
                        K = sb8.K(r3);
                    } else {
                        r10 = st2Var;
                        r10 = st2Var;
                        r2 = strD;
                        K = list;
                    }
                } else {
                    r10 = st2Var;
                    r10 = st2Var;
                    r2 = strD;
                    K = list;
                }
                xcd xcdVarK4 = b().k(str4);
                v2c v2cVar2 = (v2c) this.d.getValue();
                Context context4 = v2cVar2.a;
                boolean zF2 = v2cVar2.b().f(xoh.b(str3), list6);
                if (!zF2) {
                    v2cVar2.b().f(str4, list6);
                }
                List listA3 = v2cVar2.b().a(xcdVarK4.a.toString(), list6);
                j7c j7cVarB4 = v2cVar2.b();
                kbc kbcVarM4 = a8gVar.e(context4).m();
                j7cVarB4.getClass();
                SpannableString spannableStringE2 = j7c.e(kbcVarM4, xcdVarK4, listA3);
                String strB5 = xoh.b(str3);
                if (zF2) {
                    List listA4 = v2cVar2.b().a(strB5, list6);
                    j7c j7cVarB5 = v2cVar2.b();
                    kbc kbcVarM5 = a8gVar.e(context4).m();
                    j7cVarB5.getClass();
                    objD = j7c.d(strB5, listA4, kbcVarM5);
                } else {
                    objD = list;
                }
                xcd xcdVar4 = new xcd(spannableStringE2, xcdVarK4.b);
                if (objD != null) {
                    p4c p4cVar3 = v2cVar2.b;
                    String string3 = objD.toString();
                    p4cVar3.getClass();
                    xoh.c(string3, p4cVar3);
                }
                Pattern pattern2 = m3c.a;
                CharSequence charSequenceA = m3c.a(str4, b());
                String strB6 = xoh.b(str3);
                boolean zF3 = c().f(strB6, zxdVar2 != null ? zxdVar2.b : list);
                if (zF3) {
                    z6 = false;
                } else {
                    if (c().f(str4, zxdVar2 != null ? zxdVar2.b : list)) {
                        z6 = z5;
                    } else {
                        z6 = false;
                    }
                }
                String str6 = r10.o;
                if (i4 == 4 || i4 == 3) {
                    if (zF3) {
                        xcdVarK = b().k(strB6);
                    } else if (z6) {
                        xcdVarK = list;
                    } else {
                        if (c().f(str6, zxdVar2 != null ? zxdVar2.b : list)) {
                            xcdVarK = b().k(str6);
                        } else {
                            xcdVarK = list;
                        }
                    }
                    if (xcdVarK == null || xcdVarK.a.length() == 0) {
                        xcdVarK2 = (str6 == null || str6.length() == 0) ? b().k(strB6) : b().k(str6);
                    } else {
                        xcdVarK2 = xcdVarK;
                    }
                    String string4 = xcdVarK2.a.toString();
                    List listA5 = c().a(string4, list6);
                    j7c j7cVarC2 = c();
                    kbc kbcVarM6 = a8gVar.e(this.a).m();
                    j7cVarC2.getClass();
                    SpannableString spannableStringD = j7c.d(string4, listA5, kbcVarM6);
                    if (spannableStringD.length() > 0) {
                        p4c p4cVarB2 = b();
                        String string5 = spannableStringD.toString();
                        p4cVarB2.getClass();
                        xcdVarK2 = new xcd(spannableStringD, xoh.c(string5, p4cVarB2));
                    }
                } else {
                    xcdVarK2 = new xcd("", new String[0]);
                }
                xcd xcdVar5 = xcdVarK2;
                gda gdaVar = r10.i;
                return new nn7(r10.a, gdaVar != null ? oc9.E(this.a, ((s7f) ((et3) this.h.getValue())).v(), gdaVar.b, ((s7f) ((et3) this.h.getValue())).f(), false, false, false) : list, K, xcdVar4, xcdVar5, list6, i4 == 4 ? z5 : false, charSequenceA, r10.r.c, f9fVar.i);
            }
        }
        if (i == 3) {
            Object objA = a(f9fVar, nq4Var);
            return objA == hu4.a ? objA : (y8f) objA;
        }
        ore.p("Unsupported search result type: ".concat(pye.p(i)));
        return list;
    }
}
