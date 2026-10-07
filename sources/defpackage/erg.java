package defpackage;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class erg {
    public final ifh a;
    public final ny8 b;
    public final ny8 c;
    public final String d = erg.class.getName();
    public final AtomicBoolean e = new AtomicBoolean(false);
    public final fz6 f;

    public erg(ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3) {
        this.a = new ifh(new fu(ny8Var, 14));
        this.b = ny8Var2;
        this.c = ny8Var3;
        this.f = new fz6(((twg) ny8Var3.getValue()).b, new t7f(this, null, 1));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public static final Object a(erg ergVar, nq4 nq4Var) {
        brg brgVar;
        sbi sbiVar = sbi.a;
        je9 je9Var = je9.e;
        if (nq4Var instanceof brg) {
            brgVar = (brg) nq4Var;
            int i = brgVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                brgVar.f = i - Integer.MIN_VALUE;
            } else {
                brgVar = new brg(ergVar, nq4Var);
            }
        } else {
            brgVar = new brg(ergVar, nq4Var);
        }
        Object objI = brgVar.d;
        hu4 hu4Var = hu4.a;
        int i2 = brgVar.f;
        if (i2 == 0) {
            ch3.d0(objI);
            String str = ergVar.d;
            a4c a4cVar = gm0.f;
            if (a4cVar != null && a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, "Start filling data from db", null);
            }
            qwg qwgVarE = ergVar.e();
            brgVar.f = 1;
            objI = ch3.I(brgVar, qwgVarE.a, true, false, new nre(8, qwgVarE));
            if (objI == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(objI);
        }
        Iterable iterable = (Iterable) objI;
        ArrayList arrayList = new ArrayList(yw3.W0(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(wrl.a((swg) it.next(), (zyg) ergVar.a.getValue()));
        }
        if (arrayList.isEmpty()) {
            String str2 = ergVar.d;
            a4c a4cVar2 = gm0.f;
            if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                a4cVar2.c(je9Var, str2, "No drafts in db, datasource stays empty", null);
                return sbiVar;
            }
        } else {
            twg twgVarF = ergVar.f();
            twgVarF.a(arrayList);
            String str3 = ergVar.d;
            a4c a4cVar3 = gm0.f;
            if (a4cVar3 != null && a4cVar3.b(je9Var)) {
                a4cVar3.c(je9Var, str3, c0a.k(arrayList.size(), "Start filling data from db (added items = ", ")"), null);
            }
        }
        return sbiVar;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0095  */
    /* JADX WARN: Code duplicated, block: B:40:0x00ae A[Catch: all -> 0x00b3, TryCatch #0 {all -> 0x00b3, blocks: (B:38:0x00a8, B:40:0x00ae, B:43:0x00b5), top: B:51:0x00a8 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(azg azgVar, long j, nq4 nq4Var) {
        zqg zqgVar;
        azg azgVar2;
        long j2;
        swg swgVar;
        String strG;
        Object poeVar;
        Object obj;
        if (nq4Var instanceof zqg) {
            zqgVar = (zqg) nq4Var;
            int i = zqgVar.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                zqgVar.i = i - Integer.MIN_VALUE;
            } else {
                zqgVar = new zqg(this, nq4Var);
            }
        } else {
            zqgVar = new zqg(this, nq4Var);
        }
        Object objI = zqgVar.g;
        int i2 = zqgVar.i;
        sbi sbiVar = sbi.a;
        hu4 hu4Var = hu4.a;
        if (i2 == 0) {
            ch3.d0(objI);
            qwg qwgVarE = e();
            zqgVar.d = azgVar;
            zqgVar.f = j;
            zqgVar.i = 1;
            objI = ch3.I(zqgVar, qwgVarE.a, true, true, new en3(j, qwgVarE, 8));
            if (objI != hu4Var) {
            }
            return hu4Var;
        }
        if (i2 == 1) {
            j = zqgVar.f;
            azgVar = zqgVar.d;
            ch3.d0(objI);
        } else {
            if (i2 != 2) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j2 = zqgVar.f;
            swgVar = zqgVar.e;
            azgVar2 = zqgVar.d;
            ch3.d0(objI);
        }
        f().b(j2, azgVar2);
        if ((swgVar != null ? swgVar.i() : null) == kxg.VIDEO && (strG = swgVar.g()) != null) {
            File file = new File(strG);
            try {
                poeVar = Boolean.valueOf(file.exists() ? file.delete() : false);
            } catch (Throwable th) {
                poeVar = new poe(th);
            }
            obj = Boolean.FALSE;
            if (poeVar instanceof poe) {
                poeVar = obj;
            }
        }
        return sbiVar;
        mxg mxgVar = (mxg) objI;
        swg swgVarA = mxgVar != null ? mxgVar.a() : null;
        qwg qwgVarE2 = e();
        zqgVar.d = azgVar;
        zqgVar.e = swgVarA;
        zqgVar.f = j;
        zqgVar.i = 2;
        Object objI2 = ch3.I(zqgVar, qwgVarE2.a, false, true, new aa2(j, 21));
        if (objI2 != hu4Var) {
            objI2 = sbiVar;
        }
        if (objI2 != hu4Var) {
            azgVar2 = azgVar;
            j2 = j;
            swgVar = swgVarA;
            f().b(j2, azgVar2);
            if ((swgVar != null ? swgVar.i() : null) == kxg.VIDEO) {
                File file2 = new File(strG);
                poeVar = Boolean.valueOf(file2.exists() ? file2.delete() : false);
                obj = Boolean.FALSE;
                if (poeVar instanceof poe) {
                    poeVar = obj;
                }
            }
            return sbiVar;
        }
        return hu4Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(long j, nq4 nq4Var) {
        arg argVar;
        Object poeVar;
        if (nq4Var instanceof arg) {
            argVar = (arg) nq4Var;
            int i = argVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                argVar.f = i - Integer.MIN_VALUE;
            } else {
                argVar = new arg(this, nq4Var);
            }
        } else {
            argVar = new arg(this, nq4Var);
        }
        Object objH = argVar.d;
        int i2 = argVar.f;
        if (i2 == 0) {
            ch3.d0(objH);
            qwg qwgVarE = e();
            argVar.f = 1;
            objH = ch3.H(argVar, new pwg(qwgVarE, j, null), qwgVarE.a);
            hu4 hu4Var = hu4.a;
            if (objH == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(objH);
        }
        List<swg> list = (List) objH;
        ArrayList arrayList = new ArrayList();
        for (swg swgVar : list) {
            String strG = swgVar.i() == kxg.VIDEO ? swgVar.g() : null;
            if (strG != null) {
                arrayList.add(strG);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            File file = new File((String) it.next());
            try {
                poeVar = Boolean.valueOf(file.exists() ? file.delete() : false);
            } catch (Throwable th) {
                poeVar = new poe(th);
            }
            Object obj = Boolean.FALSE;
            if (poeVar instanceof poe) {
                poeVar = obj;
            }
        }
        return list;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object d(long j, nq4 nq4Var) {
        drg drgVar;
        erg ergVar;
        long j2 = j;
        if (nq4Var instanceof drg) {
            drgVar = (drg) nq4Var;
            int i = drgVar.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                drgVar.g = i - Integer.MIN_VALUE;
                ergVar = this;
            } else {
                ergVar = this;
                drgVar = new drg(ergVar, nq4Var);
            }
        } else {
            ergVar = this;
            drgVar = new drg(ergVar, nq4Var);
        }
        Object objI = drgVar.e;
        hu4 hu4Var = hu4.a;
        int i2 = drgVar.g;
        if (i2 == 0) {
            ch3.d0(objI);
            qwg qwgVarE = ergVar.e();
            drgVar.d = j2;
            drgVar.g = 1;
            objI = ch3.I(drgVar, qwgVarE.a, true, true, new en3(j2, qwgVarE, 8));
            if (objI == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j2 = drgVar.d;
            ch3.d0(objI);
        }
        mxg mxgVar = (mxg) objI;
        if (mxgVar == null) {
            String name = erg.class.getName();
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.f;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, name, nbh.s(j2, "Didn't find the draft#", " in database"), null);
                }
            }
            return null;
        }
        swg swgVarA = mxgVar.a();
        lxg lxgVarF = mxgVar.f();
        ixg ixgVarD = mxgVar.d();
        ArrayList arrayList = new ArrayList(mxgVar.e().size() + mxgVar.b().size());
        for (rwg rwgVar : mxgVar.b()) {
            arrayList.add(new dd8(rwgVar.h(), new uwg(wrl.b(rwgVar))));
        }
        for (jxg jxgVar : mxgVar.e()) {
            arrayList.add(new dd8(jxgVar.e(), new vwg(wrl.d(jxgVar))));
        }
        if (arrayList.size() > 1) {
            bx3.Y0(arrayList, new crg(0));
        }
        ArrayList arrayList2 = new ArrayList(yw3.W0(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add((wwg) ((dd8) it.next()).b);
        }
        int iH = swgVarA.h();
        xwg xwgVarC = mxgVar.c();
        i6a i6aVarC = xwgVarC != null ? wrl.c(xwgVarC) : null;
        int iOrdinal = swgVarA.i().ordinal();
        if (iOrdinal == 0) {
            return new ywg(swgVarA.f(), iH, swgVarA.e(), arrayList2, swgVarA.b(), swgVarA.a(), i6aVarC, swgVarA.g());
        }
        if (iOrdinal == 1) {
            return new axg(swgVarA.f(), iH, swgVarA.e(), arrayList2, swgVarA.b(), swgVarA.a(), i6aVarC, swgVarA.g(), lxgVarF != null ? lxgVarF.b() : 0L, qx6.a(lxgVarF != null ? lxgVarF.d() : 0.0f, lxgVarF != null ? lxgVarF.c() : 1.0f), lxgVarF != null ? lxgVarF.e() : false);
        }
        if (iOrdinal == 2) {
            return new zwg(iH, swgVarA.e(), arrayList2, swgVarA.b(), swgVarA.a(), i6aVarC, swgVarA.g(), ixgVarD != null ? ixgVarD.a() : null, 1);
        }
        ore.o();
        return null;
    }

    public final qwg e() {
        return (qwg) this.b.getValue();
    }

    public final twg f() {
        return (twg) this.c.getValue();
    }
}
