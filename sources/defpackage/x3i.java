package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import one.me.android.root.RootController;
import one.me.informer.InformerBottomSheet;
import one.me.sdk.arch.Widget;
import one.me.sdk.bottomsheet.BaseBottomSheetWidget;
import one.me.transparent.TransparentActivity;
import one.me.transparent.TransparentWidget;
import ru.ok.android.onelog.impl.BuildConfig;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class x3i implements ou {
    public static final /* synthetic */ zv8[] w;
    public final Context a;
    public final long b;
    public final ny8 c;
    public final gu4 d;
    public final ny8 e;
    public final ny8 f;
    public final ny8 g;
    public final ny8 h;
    public final ny8 i;
    public final ny8 j;
    public final ny8 k;
    public final ny8 l;
    public final ny8 m;
    public final ny8 n;
    public final ny8 o;
    public final ny8 p;
    public final ny8 q;
    public final ny8 r;
    public final p41 s = yab.b(1, 0, null, 6);
    public final p3c t = qyj.S();
    public final vt3 u = new vt3(6, this);
    public volatile Long v;

    static {
        z8b z8bVar = new z8b(x3i.class, "foregroundJob", "getForegroundJob()Lkotlinx/coroutines/Job;");
        zfe.a.getClass();
        w = new zv8[]{z8bVar};
    }

    public x3i(Context context, ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4, ny8 ny8Var5, ny8 ny8Var6, ny8 ny8Var7, ny8 ny8Var8, long j, ny8 ny8Var9, ny8 ny8Var10, ny8 ny8Var11, gu4 gu4Var, ny8 ny8Var12, ny8 ny8Var13, ny8 ny8Var14, ny8 ny8Var15) {
        this.a = context;
        this.b = j;
        this.c = ny8Var11;
        this.d = gu4Var;
        this.e = ny8Var15;
        this.f = ny8Var;
        this.g = ny8Var2;
        this.h = ny8Var3;
        this.i = ny8Var4;
        this.j = ny8Var5;
        this.k = ny8Var6;
        this.l = ny8Var7;
        this.m = ny8Var8;
        this.n = ny8Var10;
        this.o = ny8Var9;
        this.p = ny8Var12;
        this.q = ny8Var14;
        this.r = ny8Var13;
        int i = 1;
        int i2 = 0;
        lq4 lq4Var = null;
        int i3 = 3;
        if (((Boolean) ((e5d) ny8Var11.getValue()).O5.a(e5d.S6[354]).i()).booleanValue()) {
            tre.m0(new fz6(((bf8) ny8Var13.getValue()).i, new n3i(this, lq4Var, i2), i3), gu4Var);
            tre.m0(e9i.T(new fz6(((bf8) ny8Var13.getValue()).k, new n3i(this, lq4Var, i), i3), ((n0c) ((xhh) ny8Var10.getValue())).c().S0()), gu4Var);
        }
        yab.i0(gu4Var, null, 0, new o3i(this, ny8Var13, null), 3);
    }

    public static final Object a(x3i x3iVar, String str, o3i o3iVar) {
        yr8 yr8Var = TransparentWidget.m;
        ha9 ha9Var = (ha9) x3iVar.q.getValue();
        yr8Var.getClass();
        Object objK0 = yab.K0(((n0c) ((xhh) x3iVar.n.getValue())).c().S0(), new w3i(x3iVar, n1g.i(new ylc("informer_id", str), new ylc(Widget.ARG_ACCOUNT_ID_OVERRIDE, Integer.valueOf(ha9Var.a))), true, false, null), o3iVar);
        sbi sbiVar = sbi.a;
        hu4 hu4Var = hu4.a;
        if (objK0 != hu4Var) {
            objK0 = sbiVar;
        }
        return objK0 == hu4Var ? objK0 : sbiVar;
    }

    public static final void b(x3i x3iVar, sfa sfaVar) {
        y60 y60Var = y60.j;
        e70 e70VarK = sfaVar.k(y60Var);
        if (e70VarK != null) {
            u60 u60Var = e70VarK.q;
            if (e70VarK.j != null) {
                u60Var.getClass();
                if (u60Var != u60.a || u60Var.i()) {
                    return;
                }
                e70 e70VarK2 = sfaVar.k(y60Var);
                if (e70VarK2 == null) {
                    ore.p("Required value was null.");
                    return;
                }
                pvb pvbVar = (pvb) x3iVar.k.getValue();
                j60 j60Var = e70VarK2.j;
                pvb.t(pvbVar, new qq6(pvbVar.u().a.g(), j60Var.a, j60Var.c, sfaVar.h, sfaVar.a, e70VarK2.t));
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0077  */
    /* JADX WARN: Code duplicated, block: B:27:0x0097  */
    /* JADX WARN: Code duplicated, block: B:28:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:31:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:32:0x00db  */
    /* JADX WARN: Code duplicated, block: B:38:0x00fa A[EDGE_INSN: B:38:0x00fa->B:52:0x0169 BREAK  A[LOOP:0: B:42:0x0118->B:51:0x0165], PHI: r4
  0x00fa: PHI (r4v17 java.io.File) = (r4v8 java.io.File), (r4v9 java.io.File), (r4v6 java.io.File) binds: [B:40:0x010f, B:79:0x00fa, B:37:0x00f8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:39:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:41:0x0111  */
    /* JADX WARN: Code duplicated, block: B:44:0x011c  */
    /* JADX WARN: Code duplicated, block: B:46:0x0123  */
    /* JADX WARN: Code duplicated, block: B:47:0x0147  */
    /* JADX WARN: Code duplicated, block: B:51:0x0165 A[LOOP:0: B:42:0x0118->B:51:0x0165, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:78:0x0163 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x00fa A[SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:27:0x0097, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:28:0x00ba, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:46:0x0123, please report this as an issue */
    public static final void c(x3i x3iVar, sfa sfaVar) {
        j60 j60Var;
        e70 e70VarK;
        long j;
        String strA;
        String strA2;
        File fileL;
        int iLastIndexOf;
        File file;
        File file2;
        File fileL2;
        String strA3;
        int iLastIndexOf2;
        int i;
        String string;
        File file3;
        File file4;
        je9 je9Var = je9.d;
        a4c a4cVar = gm0.f;
        if (a4cVar != null && a4cVar.b(je9Var)) {
            a4cVar.c(je9Var, "TransparentLogic", "update " + sfaVar, null);
        }
        y60 y60Var = y60.j;
        e70 e70VarK2 = sfaVar.k(y60Var);
        if (e70VarK2 == null || (e70VarK = sfaVar.k(y60Var)) == null || e70VarK.j == null || !e70VarK.q.h()) {
            a4c a4cVar2 = gm0.f;
            if (a4cVar2 == null) {
                return;
            }
            je9 je9Var2 = je9.f;
            if (a4cVar2.b(je9Var2)) {
                a4cVar2.c(je9Var2, "TransparentLogic", "update: " + (e70VarK2 != null ? Long.valueOf(e70VarK2.x) : null) + "/" + (e70VarK2 != null ? Long.valueOf(e70VarK2.w) : null) + ", " + ((e70VarK2 == null || (j60Var = e70VarK2.j) == null) ? null : j60Var.c), null);
                return;
            }
            return;
        }
        ju6 ju6Var = (ju6) x3iVar.m.getValue();
        ju6Var.getClass();
        String str = e70VarK2.u;
        long j2 = e70VarK2.y;
        j60 j60Var2 = e70VarK2.j;
        if (!ch3.r(str)) {
            file4 = new File(e70VarK2.u);
            if (!file4.exists() || file4.length() != j60Var2.b || file4.lastModified() != j2) {
                j = j60Var2.a;
                String str2 = j60Var2.c;
                long j3 = j60Var2.b;
                strA = l21.a(str2);
                strA2 = l21.a(strA);
                fileL = ju6Var.l();
                iLastIndexOf = strA2.lastIndexOf(46);
                if (iLastIndexOf != -1) {
                    file = new File(fileL, strA2.substring(0, iLastIndexOf) + "_" + j + strA2.substring(iLastIndexOf));
                } else {
                    file = new File(fileL, strA2 + "_" + j);
                }
                if (file.exists()) {
                    file2 = new File(ju6Var.l(), strA);
                    if (!file2.exists() || file2.length() != j3 || file2.lastModified() != j2) {
                        fileL2 = ju6Var.l();
                        strA3 = l21.a(strA);
                        int i2 = rx8.p;
                        file2 = new File(fileL2, strA3);
                        if (!file2.exists()) {
                            file4 = file2;
                            break;
                        }
                        iLastIndexOf2 = strA3.lastIndexOf(46);
                        i = 0;
                        while (true) {
                            if (i >= 100) {
                                file4 = file2;
                                break;
                            }
                            if (iLastIndexOf2 != -1) {
                                string = strA3.substring(0, iLastIndexOf2) + "(" + (i + 1) + ")" + strA3.substring(iLastIndexOf2);
                            } else {
                                StringBuilder sbZ = zo5.z(strA3, "(");
                                sbZ.append(i + 1);
                                sbZ.append(")");
                                string = sbZ.toString();
                            }
                            file3 = new File(fileL2, string);
                            if (!file3.exists()) {
                                file4 = file3;
                                break;
                            } else {
                                i++;
                                file2 = file3;
                            }
                        }
                    } else {
                        file4 = file2;
                        break;
                    }
                } else {
                    file4 = file;
                }
            }
        } else {
            j = j60Var2.a;
            String str3 = j60Var2.c;
            long j4 = j60Var2.b;
            strA = l21.a(str3);
            strA2 = l21.a(strA);
            fileL = ju6Var.l();
            iLastIndexOf = strA2.lastIndexOf(46);
            if (iLastIndexOf != -1) {
                file = new File(fileL, strA2.substring(0, iLastIndexOf) + "_" + j + strA2.substring(iLastIndexOf));
            } else {
                file = new File(fileL, strA2 + "_" + j);
            }
            if (file.exists()) {
                file2 = new File(ju6Var.l(), strA);
                if (!file2.exists()) {
                    fileL2 = ju6Var.l();
                    strA3 = l21.a(strA);
                    int i3 = rx8.p;
                    file2 = new File(fileL2, strA3);
                    if (!file2.exists()) {
                        file4 = file2;
                        break;
                    }
                    iLastIndexOf2 = strA3.lastIndexOf(46);
                    i = 0;
                    while (true) {
                        if (i >= 100) {
                            file4 = file2;
                            break;
                        }
                        if (iLastIndexOf2 != -1) {
                            string = strA3.substring(0, iLastIndexOf2) + "(" + (i + 1) + ")" + strA3.substring(iLastIndexOf2);
                        } else {
                            StringBuilder sbZ2 = zo5.z(strA3, "(");
                            sbZ2.append(i + 1);
                            sbZ2.append(")");
                            string = sbZ2.toString();
                        }
                        file3 = new File(fileL2, string);
                        if (!file3.exists()) {
                            file4 = file3;
                            break;
                        } else {
                            i++;
                            file2 = file3;
                        }
                    }
                } else {
                    fileL2 = ju6Var.l();
                    strA3 = l21.a(strA);
                    int i4 = rx8.p;
                    file2 = new File(fileL2, strA3);
                    if (!file2.exists()) {
                        file4 = file2;
                        break;
                    }
                    iLastIndexOf2 = strA3.lastIndexOf(46);
                    i = 0;
                    while (true) {
                        if (i >= 100) {
                            file4 = file2;
                            break;
                        }
                        if (iLastIndexOf2 != -1) {
                            string = strA3.substring(0, iLastIndexOf2) + "(" + (i + 1) + ")" + strA3.substring(iLastIndexOf2);
                        } else {
                            StringBuilder sbZ3 = zo5.z(strA3, "(");
                            sbZ3.append(i + 1);
                            sbZ3.append(")");
                            string = sbZ3.toString();
                        }
                        file3 = new File(fileL2, string);
                        if (!file3.exists()) {
                            file4 = file3;
                            break;
                        } else {
                            i++;
                            file2 = file3;
                        }
                    }
                }
            } else {
                file4 = file;
            }
        }
        File absoluteFile = file4.getAbsoluteFile();
        a4c a4cVar3 = gm0.f;
        if (a4cVar3 != null && a4cVar3.b(je9Var)) {
            a4cVar3.c(je9Var, "TransparentLogic", zo5.m(absoluteFile, "update: downloadedFile="), null);
        }
        new kr6(x3iVar.a, (ju6) x3iVar.m.getValue(), (lsi) x3iVar.e.getValue()).O(absoluteFile);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0169 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:102:0x0169 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:103:0x0169 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:19:0x0074  */
    /* JADX WARN: Code duplicated, block: B:20:0x007b  */
    /* JADX WARN: Code duplicated, block: B:23:0x0095  */
    /* JADX WARN: Code duplicated, block: B:24:0x0097  */
    /* JADX WARN: Code duplicated, block: B:30:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:33:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:36:0x00db  */
    /* JADX WARN: Code duplicated, block: B:40:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:45:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:46:0x0101  */
    /* JADX WARN: Code duplicated, block: B:50:0x0124  */
    /* JADX WARN: Code duplicated, block: B:54:0x0136  */
    /* JADX WARN: Code duplicated, block: B:56:0x013e  */
    /* JADX WARN: Code duplicated, block: B:58:0x0148  */
    /* JADX WARN: Code duplicated, block: B:59:0x014b  */
    /* JADX WARN: Code duplicated, block: B:64:0x0170  */
    /* JADX WARN: Code duplicated, block: B:73:0x019c  */
    /* JADX WARN: Code duplicated, block: B:74:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:76:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:77:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:96:0x017d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:97:0x01d3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:98:0x01c3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:99:0x01d4 A[EDGE_INSN: B:99:0x01d4->B:90:0x01d4 BREAK  A[LOOP:0: B:62:0x0169->B:100:0x0169], SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v2, types: [int] */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x0124 -> B:51:0x0128). Please report as a decompilation issue!!! */
    public final Object d(boolean z, nq4 nq4Var) {
        t3i t3iVar;
        wfe wfeVarP;
        ?? r0;
        long jLongValue;
        wfe wfeVar;
        ?? r1;
        rt2 rt2Var;
        fda fdaVar;
        long j;
        t3i t3iVar2;
        Object objQ;
        fda fdaVar2;
        ny8 ny8Var;
        zv8[] zv8VarArr;
        vhe vheVar;
        Long lValueOf;
        int iOrdinal;
        Object objI;
        vhe vheVar2;
        Long l;
        ?? r2;
        Object next;
        j60 j60VarR;
        String str;
        String str2;
        Integer numB0;
        int iIntValue;
        tn9 tn9VarA;
        List listA;
        int size;
        String str3;
        je9 je9Var;
        j60 j60VarR2;
        String str4;
        if (nq4Var instanceof t3i) {
            t3iVar = (t3i) nq4Var;
            int i = t3iVar.j;
            if ((i & Integer.MIN_VALUE) != 0) {
                t3iVar.j = i - Integer.MIN_VALUE;
            } else {
                t3iVar = new t3i(this, nq4Var);
            }
        } else {
            t3iVar = new t3i(this, nq4Var);
        }
        Object obj = t3iVar.h;
        hu4 hu4Var = hu4.a;
        int i2 = t3iVar.j;
        if (i2 == 0) {
            wfeVarP = nbh.p(obj);
            wfeVarP.a = this;
            r0 = z;
            x3i x3iVar = (x3i) wfeVarP.a;
            ny8Var = x3iVar.c;
            b5d b5dVar = ((e5d) ny8Var.getValue()).h6;
            zv8VarArr = e5d.S6;
            vheVar = (vhe) b5dVar.a(zv8VarArr[373]).i();
            if (vheVar != null) {
                lValueOf = Long.valueOf(vheVar.c);
            } else {
                lValueOf = null;
            }
            ((wxb) x3iVar.p.getValue()).getClass();
            iOrdinal = ((j51) wxb.b.getValue()).ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal != 1) {
                    ore.o();
                    return null;
                }
                vheVar2 = (vhe) ((e5d) ny8Var.getValue()).h6.a(zv8VarArr[373]).i();
                if (vheVar2 != null && (l = vheVar2.h) != null) {
                    lValueOf = l;
                }
            }
            if (lValueOf != null) {
                jLongValue = lValueOf.longValue();
                xn3 xn3Var = (xn3) ((x3i) wfeVarP.a).g.getValue();
                t3iVar.e = wfeVarP;
                t3iVar.f = null;
                t3iVar.d = r0;
                t3iVar.g = jLongValue;
                t3iVar.j = 1;
                objI = xn3Var.i(jLongValue, t3iVar);
                if (objI != hu4Var) {
                    wfeVar = wfeVarP;
                    obj = objI;
                    r1 = r0;
                    rt2Var = (rt2) obj;
                    if (rt2Var != null) {
                        sua suaVar = (sua) ((x3i) wfeVar.a).f.getValue();
                        long j2 = rt2Var.a;
                        if (r1 != 0) {
                            j = fdaVar.a.c;
                        } else {
                            j = BuildConfig.MAX_TIME_TO_UPLOAD;
                        }
                        mg5 mg5Var = mg5.REGULAR;
                        t3iVar.e = wfeVar;
                        t3iVar.f = fdaVar;
                        t3iVar.d = r1;
                        t3iVar.g = jLongValue;
                        t3iVar.j = 2;
                        t3iVar2 = t3iVar;
                        objQ = suaVar.q(j2, 0L, j, true, 40, mg5Var, t3iVar2);
                        if (objQ != hu4Var) {
                            fdaVar2 = fdaVar;
                            obj = objQ;
                            t3iVar = t3iVar2;
                            r2 = r1;
                        }
                    }
                }
                return hu4Var;
            }
            return null;
        }
        if (i2 == 1) {
            jLongValue = t3iVar.g;
            int i3 = t3iVar.d;
            wfeVar = t3iVar.e;
            ch3.d0(obj);
            r1 = i3;
            rt2Var = (rt2) obj;
            if (rt2Var != null && (fdaVar = rt2Var.c) != null) {
                sua suaVar2 = (sua) ((x3i) wfeVar.a).f.getValue();
                long j3 = rt2Var.a;
                if (r1 != 0) {
                    j = fdaVar.a.c;
                } else {
                    j = BuildConfig.MAX_TIME_TO_UPLOAD;
                }
                mg5 mg5Var2 = mg5.REGULAR;
                t3iVar.e = wfeVar;
                t3iVar.f = fdaVar;
                t3iVar.d = r1;
                t3iVar.g = jLongValue;
                t3iVar.j = 2;
                t3iVar2 = t3iVar;
                objQ = suaVar2.q(j3, 0L, j, true, 40, mg5Var2, t3iVar2);
                if (objQ != hu4Var) {
                    fdaVar2 = fdaVar;
                    obj = objQ;
                    t3iVar = t3iVar2;
                    r2 = r1;
                }
                return hu4Var;
            }
            return null;
        }
        if (i2 != 2) {
            ore.k("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        int i4 = t3iVar.d;
        fda fdaVar3 = t3iVar.f;
        wfe wfeVar2 = t3iVar.e;
        ch3.d0(obj);
        fdaVar2 = fdaVar3;
        wfeVar = wfeVar2;
        r2 = i4;
        List list = (List) obj;
        ((x3i) wfeVar.a).getClass();
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                sfa sfaVar = fdaVar2.a;
                long j4 = sfaVar.c;
                j60VarR2 = sfaVar.r();
                if (j60VarR2 != null) {
                    str4 = j60VarR2.c;
                } else {
                    str4 = null;
                }
                a4cVar.c(je9Var, "TransparentLogic", zo5.v(qt4.t(j4, "findMessage: lastMessage.data.time=", ", lastMessage.data.file=", str4), ", messages.count=", list.size()), null);
            }
        }
        Iterator it = list.iterator();
        while (true) {
            if (it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            j60VarR = ((sfa) next).r();
            if (j60VarR != null) {
                str = j60VarR.c;
                str2 = "0";
                if (str != null && str.endsWith(".apk")) {
                    tn9VarA = pnl.a(Pattern.compile("\\(([0-9]+)\\)").matcher(str), 0, str);
                    if (tn9VarA != null) {
                        listA = tn9VarA.a();
                    } else {
                        listA = null;
                    }
                    if (listA != null) {
                        size = ((b2) listA).getSize();
                    } else {
                        size = 0;
                    }
                    if (size > 1 && listA != null && (str3 = (String) ((sn9) listA).get(1)) != null) {
                        str2 = str3;
                    }
                }
                numB0 = y5h.B0(str2);
                if (numB0 != null) {
                    iIntValue = numB0.intValue();
                    ((x3i) wfeVar.a).getClass();
                    if (iIntValue > 6804) {
                        break;
                    }
                } else {
                    continue;
                }
            }
        }
        sfa sfaVar2 = (sfa) next;
        if (sfaVar2 == null || r2 == 0) {
            return sfaVar2;
        }
        wfeVar.a = (x3i) wfeVar.a;
        wfeVarP = wfeVar;
        r0 = 0;
        x3i x3iVar2 = (x3i) wfeVarP.a;
        ny8Var = x3iVar2.c;
        b5d b5dVar2 = ((e5d) ny8Var.getValue()).h6;
        zv8VarArr = e5d.S6;
        vheVar = (vhe) b5dVar2.a(zv8VarArr[373]).i();
        if (vheVar != null) {
            lValueOf = Long.valueOf(vheVar.c);
        } else {
            lValueOf = null;
        }
        ((wxb) x3iVar2.p.getValue()).getClass();
        iOrdinal = ((j51) wxb.b.getValue()).ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                ore.o();
                return null;
            }
            vheVar2 = (vhe) ((e5d) ny8Var.getValue()).h6.a(zv8VarArr[373]).i();
            if (vheVar2 != null) {
                lValueOf = l;
            }
        }
        if (lValueOf != null) {
            jLongValue = lValueOf.longValue();
            xn3 xn3Var2 = (xn3) ((x3i) wfeVarP.a).g.getValue();
            t3iVar.e = wfeVarP;
            t3iVar.f = null;
            t3iVar.d = r0;
            t3iVar.g = jLongValue;
            t3iVar.j = 1;
            objI = xn3Var2.i(jLongValue, t3iVar);
            if (objI != hu4Var) {
                wfeVar = wfeVarP;
                obj = objI;
                r1 = r0;
                rt2Var = (rt2) obj;
                if (rt2Var != null) {
                    sua suaVar3 = (sua) ((x3i) wfeVar.a).f.getValue();
                    long j5 = rt2Var.a;
                    if (r1 != 0) {
                        j = fdaVar.a.c;
                    } else {
                        j = BuildConfig.MAX_TIME_TO_UPLOAD;
                    }
                    mg5 mg5Var3 = mg5.REGULAR;
                    t3iVar.e = wfeVar;
                    t3iVar.f = fdaVar;
                    t3iVar.d = r1;
                    t3iVar.g = jLongValue;
                    t3iVar.j = 2;
                    t3iVar2 = t3iVar;
                    objQ = suaVar3.q(j5, 0L, j, true, 40, mg5Var3, t3iVar2);
                    if (objQ != hu4Var) {
                        fdaVar2 = fdaVar;
                        obj = objQ;
                        t3iVar = t3iVar2;
                        r2 = r1;
                        List list2 = (List) obj;
                        ((x3i) wfeVar.a).getClass();
                        a4c a4cVar2 = gm0.f;
                        if (a4cVar2 != null) {
                            je9Var = je9.d;
                            if (a4cVar2.b(je9Var)) {
                                sfa sfaVar3 = fdaVar2.a;
                                long j6 = sfaVar3.c;
                                j60VarR2 = sfaVar3.r();
                                if (j60VarR2 != null) {
                                    str4 = j60VarR2.c;
                                } else {
                                    str4 = null;
                                }
                                a4cVar2.c(je9Var, "TransparentLogic", zo5.v(qt4.t(j6, "findMessage: lastMessage.data.time=", ", lastMessage.data.file=", str4), ", messages.count=", list2.size()), null);
                            }
                        }
                        Iterator it2 = list2.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it2.next();
                            j60VarR = ((sfa) next).r();
                            if (j60VarR != null) {
                                str = j60VarR.c;
                                str2 = "0";
                                if (str != null) {
                                    tn9VarA = pnl.a(Pattern.compile("\\(([0-9]+)\\)").matcher(str), 0, str);
                                    if (tn9VarA != null) {
                                        listA = tn9VarA.a();
                                    } else {
                                        listA = null;
                                    }
                                    if (listA != null) {
                                        size = ((b2) listA).getSize();
                                    } else {
                                        size = 0;
                                    }
                                    if (size > 1) {
                                        str2 = str3;
                                    }
                                }
                                numB0 = y5h.B0(str2);
                                if (numB0 != null) {
                                    iIntValue = numB0.intValue();
                                    ((x3i) wfeVar.a).getClass();
                                    if (iIntValue > 6804) {
                                        break;
                                        break;
                                    }
                                } else {
                                    continue;
                                }
                            }
                        }
                        sfa sfaVar4 = (sfa) next;
                        if (sfaVar4 == null) {
                        }
                        return sfaVar4;
                    }
                }
            }
            return hu4Var;
        }
        return null;
    }

    public final RootController e() {
        return (RootController) this.o.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object f(te8 te8Var, nq4 nq4Var) {
        v3i v3iVar;
        Object next;
        TransparentWidget transparentWidget;
        Object next2;
        Object next3;
        if (nq4Var instanceof v3i) {
            v3iVar = (v3i) nq4Var;
            int i = v3iVar.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                v3iVar.g = i - Integer.MIN_VALUE;
            } else {
                v3iVar = new v3i(this, nq4Var);
            }
        } else {
            v3iVar = new v3i(this, nq4Var);
        }
        v3i v3iVar2 = v3iVar;
        Object obj = v3iVar2.e;
        int i2 = v3iVar2.g;
        sbi sbiVar = sbi.a;
        lq4 lq4Var = null;
        if (i2 == 0) {
            ch3.d0(obj);
            if (!cqk.d(te8Var, oe8.a)) {
                if (te8Var instanceof pe8) {
                    Iterator it = e().w1().e().iterator();
                    do {
                        if (!it.hasNext()) {
                            next3 = null;
                            break;
                        }
                        next3 = it.next();
                    } while (!(((lve) next3).a instanceof TransparentWidget));
                    lve lveVar = (lve) next3;
                    br4 br4Var = lveVar != null ? lveVar.a : null;
                    TransparentWidget transparentWidget2 = br4Var instanceof TransparentWidget ? (TransparentWidget) br4Var : null;
                    if (transparentWidget2 == null) {
                        gm0.Y("TransparentLogic", "Can't close informer after start download when selfUpdate because widget is null");
                        return sbiVar;
                    }
                    transparentWidget2.j = new bpg(24, te8Var);
                    InformerBottomSheet informerBottomSheet = transparentWidget2.i;
                    if (informerBottomSheet != null) {
                        zpe zpeVar = BaseBottomSheetWidget.i;
                        informerBottomSheet.v1(true);
                    }
                    transparentWidget2.i = null;
                    return sbiVar;
                }
                boolean z = te8Var instanceof qe8;
                ny8 ny8Var = this.n;
                hu4 hu4Var = hu4.a;
                if (z) {
                    Iterator it2 = e().w1().e().iterator();
                    do {
                        if (!it2.hasNext()) {
                            next2 = null;
                            break;
                        }
                        next2 = it2.next();
                    } while (!(((lve) next2).a instanceof TransparentWidget));
                    lve lveVar2 = (lve) next2;
                    br4 br4Var2 = lveVar2 != null ? lveVar2.a : null;
                    TransparentWidget transparentWidget3 = br4Var2 instanceof TransparentWidget ? (TransparentWidget) br4Var2 : null;
                    if (transparentWidget3 == null) {
                        gm0.Y("TransparentLogic", "Can't close informer after start download when selfUpdate because widget is null");
                        return sbiVar;
                    }
                    yr8 yr8Var = TransparentWidget.m;
                    transparentWidget3.j = null;
                    InformerBottomSheet informerBottomSheet2 = transparentWidget3.i;
                    if (informerBottomSheet2 != null) {
                        zpe zpeVar2 = BaseBottomSheetWidget.i;
                        informerBottomSheet2.v1(true);
                    }
                    transparentWidget3.i = null;
                    qe8 qe8Var = (qe8) te8Var;
                    tnh tnhVar = qe8Var.c;
                    Context context = this.a;
                    CharSequence charSequenceB = tnhVar.b(context);
                    if (charSequenceB == null) {
                        charSequenceB = "";
                    }
                    CharSequence charSequenceB2 = qe8Var.b.b(context);
                    Integer num = new Integer(R.drawable.icon_download_round_fill);
                    v3iVar2.d = null;
                    v3iVar2.g = 1;
                    Object objK0 = yab.K0(((n0c) ((xhh) ny8Var.getValue())).c().S0(), new uf3(8, null, this, charSequenceB2, charSequenceB, num), v3iVar2);
                    if (objK0 != hu4Var) {
                        objK0 = sbiVar;
                    }
                    if (objK0 == hu4Var) {
                        return hu4Var;
                    }
                } else {
                    if (!(te8Var instanceof re8)) {
                        ore.o();
                        return null;
                    }
                    Iterator it3 = e().w1().e().iterator();
                    do {
                        if (!it3.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it3.next();
                    } while (!(((lve) next).a instanceof TransparentWidget));
                    lve lveVar3 = (lve) next;
                    br4 br4Var3 = lveVar3 != null ? lveVar3.a : null;
                    TransparentWidget transparentWidget4 = br4Var3 instanceof TransparentWidget ? (TransparentWidget) br4Var3 : null;
                    if (transparentWidget4 == null) {
                        gm0.Y("TransparentLogic", "Can't update when selfUpdate because widget is null");
                        return sbiVar;
                    }
                    if (!transparentWidget4.p1() && !transparentWidget4.q1()) {
                        xt4 xt4VarB = ((n0c) ((xhh) ny8Var.getValue())).b();
                        j8g j8gVar = new j8g(this, te8Var, lq4Var, 16);
                        v3iVar2.d = transparentWidget4;
                        v3iVar2.g = 2;
                        if (yab.K0(xt4VarB, j8gVar, v3iVar2) != hu4Var) {
                            transparentWidget = transparentWidget4;
                        }
                        return hu4Var;
                    }
                }
            }
            return sbiVar;
        }
        if (i2 == 1) {
            ch3.d0(obj);
            return sbiVar;
        }
        if (i2 != 2) {
            ore.k("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        transparentWidget = v3iVar2.d;
        ch3.d0(obj);
        transparentWidget.j = new bpg(25, this);
        InformerBottomSheet informerBottomSheet3 = transparentWidget.i;
        if (informerBottomSheet3 != null) {
            zpe zpeVar3 = BaseBottomSheetWidget.i;
            informerBottomSheet3.v1(true);
        }
        transparentWidget.i = null;
        return sbiVar;
    }

    public final boolean g(TransparentActivity transparentActivity, Intent intent) {
        boolean z;
        if (cqk.d(intent != null ? intent.getAction() : null, transparentActivity.getApplicationInfo().packageName + ".INTERCEPT_LINK_ACTION")) {
            Bundle extras = intent.getExtras();
            if (extras == null) {
                z = false;
            } else {
                if (extras.getInt("android.content.pm.extra.STATUS") == -1) {
                    transparentActivity.startActivity((Intent) extras.get("android.intent.extra.INTENT"));
                }
                z = true;
            }
        } else {
            z = true;
        }
        if (z) {
            xb9 xb9Var = (xb9) this.j.getValue();
            xb9Var.c1.B(xb9Var, xb9.g1[47], Long.valueOf(System.currentTimeMillis()));
        }
        return z;
    }

    @Override // defpackage.ou
    public final void h(long j) {
        gm0.n("TransparentLogic", "onAppGoesForeground");
        e().w1().a(this.u);
        sgg sggVarI0 = yab.i0(this.d, null, 2, new u3i(this, null, 1), 1);
        this.t.B(this, w[0], sggVarI0);
    }

    public final void i() {
        ny8 ny8Var = this.i;
        ((gue) ny8Var.getValue()).c(this);
        if (((gue) ny8Var.getValue()).e()) {
            h(SystemClock.elapsedRealtime());
        }
        ((t51) this.l.getValue()).d(this);
    }

    @l7h
    public final void onEvent(eq5 eq5Var) {
        Long l = this.v;
        long j = eq5Var.e;
        if (l != null && l.longValue() == j) {
            this.s.c(new p3i(false, 3));
        }
    }

    @Override // defpackage.ou
    public final void w(long j) {
        gm0.n("TransparentLogic", "onAppGoesBackground");
        e().w1().M(this.u);
        vo8 vo8Var = (vo8) this.t.m(this, w[0]);
        if (vo8Var != null) {
            vo8Var.b(null);
        }
    }
}
