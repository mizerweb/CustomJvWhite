package defpackage;

import androidx.datastore.core.CorruptionException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class m9g implements b35 {
    public static final LinkedHashSet i = new LinkedHashSet();
    public static final Object j = new Object();
    public final qv a;
    public final ex8 b;
    public final bye c = new bye(new a9g(this, null, 1));
    public final String d = ".tmp";
    public final ifh e = new ifh(new qv(8, this));
    public final mjg f = p90.a(uai.a);
    public List g;
    public final xde h;

    public m9g(qv qvVar, List list, ex8 ex8Var, gu4 gu4Var) {
        this.a = qvVar;
        this.b = ex8Var;
        this.g = ww3.T1(list);
        this.h = new xde(gu4Var, new ik5(3, this), new a9g(this, null, 0));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x009e, code lost:
    
        if (r9 == r6) goto L44;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(defpackage.m9g r9, defpackage.y8g r10, defpackage.nq4 r11) {
        /*
            Method dump skipped, instruction units count: 202
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m9g.b(m9g, y8g, nq4):java.lang.Object");
    }

    @Override // defpackage.b35
    public final Object a(qf7 qf7Var, lq4 lq4Var) throws Throwable {
        i64 i64Var = new i64();
        this.h.D(new y8g(qf7Var, i64Var, (fjg) this.f.getValue(), lq4Var.getContext()));
        return i64Var.p(lq4Var);
    }

    public final File c() {
        return (File) this.e.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:42:0x010b  */
    /* JADX WARN: Code duplicated, block: B:46:0x0119  */
    /* JADX WARN: Code duplicated, block: B:47:0x011e  */
    /* JADX WARN: Code duplicated, block: B:56:0x010a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:? A[LOOP:0: B:33:0x00cf->B:58:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(nq4 nq4Var) throws CorruptionException, IllegalAccessException, FileNotFoundException, InvocationTargetException {
        d9g d9gVar;
        j9b l9bVar;
        m9g m9gVar;
        wfe wfeVar;
        wfe wfeVar2;
        sfe sfeVar;
        Iterator it;
        j9b j9bVar;
        m9g m9gVar2;
        wfe wfeVar3;
        f9g f9gVar;
        m9g m9gVar3;
        sfe sfeVar2;
        j9b j9bVar2;
        wfe wfeVar4;
        qf7 qf7Var;
        Object obj;
        int iHashCode;
        if (nq4Var instanceof d9g) {
            d9gVar = (d9g) nq4Var;
            int i2 = d9gVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                d9gVar.l = i2 - Integer.MIN_VALUE;
            } else {
                d9gVar = new d9g(this, nq4Var);
            }
        } else {
            d9gVar = new d9g(this, nq4Var);
        }
        Object obj2 = d9gVar.j;
        int i3 = d9gVar.l;
        hu4 hu4Var = hu4.a;
        if (i3 == 0) {
            ch3.d0(obj2);
            mjg mjgVar = this.f;
            if (!cqk.d(mjgVar.getValue(), uai.a) && !(mjgVar.getValue() instanceof g8e)) {
                ore.k("Check failed.");
                return null;
            }
            l9bVar = new l9b();
            wfe wfeVar5 = new wfe();
            d9gVar.d = this;
            d9gVar.e = l9bVar;
            d9gVar.f = wfeVar5;
            d9gVar.g = wfeVar5;
            d9gVar.l = 1;
            Object objH = h(d9gVar);
            if (objH != hu4Var) {
                m9gVar = this;
                wfeVar = wfeVar5;
                obj2 = objH;
                wfeVar2 = wfeVar;
            }
            return hu4Var;
        }
        if (i3 == 1) {
            wfeVar = (wfe) d9gVar.g;
            wfeVar2 = (wfe) d9gVar.f;
            l9bVar = (j9b) d9gVar.e;
            m9gVar = d9gVar.d;
            ch3.d0(obj2);
        } else {
            if (i3 == 2) {
                it = d9gVar.i;
                f9gVar = d9gVar.h;
                sfeVar = (sfe) d9gVar.g;
                wfeVar3 = (wfe) d9gVar.f;
                j9bVar = (j9b) d9gVar.e;
                m9gVar2 = d9gVar.d;
                ch3.d0(obj2);
                while (it.hasNext()) {
                    qf7Var = (qf7) it.next();
                    d9gVar.d = m9gVar2;
                    d9gVar.e = j9bVar;
                    d9gVar.f = wfeVar3;
                    d9gVar.g = sfeVar;
                    d9gVar.h = f9gVar;
                    d9gVar.i = it;
                    d9gVar.l = 2;
                    if (qf7Var.invoke(f9gVar, d9gVar) == hu4Var) {
                        return hu4Var;
                    }
                }
                sfeVar2 = sfeVar;
                j9bVar2 = j9bVar;
                m9gVar3 = m9gVar2;
                m9gVar3.g = null;
                d9gVar.d = m9gVar3;
                d9gVar.e = wfeVar3;
                d9gVar.f = sfeVar2;
                d9gVar.g = j9bVar2;
                d9gVar.h = null;
                d9gVar.i = null;
                d9gVar.l = 3;
                if (j9bVar2.b(d9gVar) != hu4Var) {
                    wfeVar4 = wfeVar3;
                }
                return hu4Var;
            }
            if (i3 != 3) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j9bVar2 = (j9b) d9gVar.g;
            sfeVar2 = (sfe) d9gVar.f;
            wfeVar4 = (wfe) d9gVar.e;
            m9gVar3 = d9gVar.d;
            ch3.d0(obj2);
        }
        try {
            sfeVar2.a = true;
            j9bVar2.g(null);
            mjg mjgVar2 = m9gVar3.f;
            obj = wfeVar4.a;
            if (obj != null) {
                iHashCode = obj.hashCode();
            } else {
                iHashCode = 0;
            }
            e25 e25Var = new e25(iHashCode, obj);
            mjgVar2.getClass();
            mjgVar2.j(null, e25Var);
            return sbi.a;
        } catch (Throwable th) {
            j9bVar2.g(null);
            throw th;
        }
        wfeVar.a = obj2;
        sfe sfeVar3 = new sfe();
        f9g f9gVar2 = new f9g(l9bVar, sfeVar3, wfeVar2, m9gVar);
        List list = m9gVar.g;
        if (list == null) {
            m9gVar3 = m9gVar;
            wfeVar3 = wfeVar2;
            sfeVar2 = sfeVar3;
            j9bVar2 = l9bVar;
        } else {
            j9b j9bVar3 = l9bVar;
            sfeVar = sfeVar3;
            it = list.iterator();
            j9bVar = j9bVar3;
            m9gVar2 = m9gVar;
            wfeVar3 = wfeVar2;
            f9gVar = f9gVar2;
            while (it.hasNext()) {
                qf7Var = (qf7) it.next();
                d9gVar.d = m9gVar2;
                d9gVar.e = j9bVar;
                d9gVar.f = wfeVar3;
                d9gVar.g = sfeVar;
                d9gVar.h = f9gVar;
                d9gVar.i = it;
                d9gVar.l = 2;
                if (qf7Var.invoke(f9gVar, d9gVar) == hu4Var) {
                    return hu4Var;
                }
            }
            sfeVar2 = sfeVar;
            j9bVar2 = j9bVar;
            m9gVar3 = m9gVar2;
        }
        m9gVar3.g = null;
        d9gVar.d = m9gVar3;
        d9gVar.e = wfeVar3;
        d9gVar.f = sfeVar2;
        d9gVar.g = j9bVar2;
        d9gVar.h = null;
        d9gVar.i = null;
        d9gVar.l = 3;
        if (j9bVar2.b(d9gVar) != hu4Var) {
            wfeVar4 = wfeVar3;
            sfeVar2.a = true;
            j9bVar2.g(null);
            mjg mjgVar3 = m9gVar3.f;
            obj = wfeVar4.a;
            if (obj != null) {
                iHashCode = obj.hashCode();
            } else {
                iHashCode = 0;
            }
            e25 e25Var2 = new e25(iHashCode, obj);
            mjgVar3.getClass();
            mjgVar3.j(null, e25Var2);
            return sbi.a;
        }
        return hu4Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, sbi] */
    public final Object e(nq4 nq4Var) {
        g9g g9gVar;
        if (nq4Var instanceof g9g) {
            g9gVar = (g9g) nq4Var;
            int i2 = g9gVar.g;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                g9gVar.g = i2 - Integer.MIN_VALUE;
            } else {
                g9gVar = new g9g(this, nq4Var);
            }
        } else {
            g9gVar = new g9g(this, nq4Var);
        }
        Object obj = g9gVar.e;
        int i3 = g9gVar.g;
        try {
            if (i3 == 0) {
                ch3.d0(obj);
                g9gVar.d = this;
                g9gVar.g = 1;
                Object objD = d(g9gVar);
                hu4 hu4Var = hu4.a;
                if (objD == hu4Var) {
                    return hu4Var;
                }
            } else {
                if (i3 != 1) {
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                m9g m9gVar = g9gVar.d;
                ch3.d0(obj);
            }
            this = sbi.a;
            return this;
        } catch (Throwable th) {
            mjg mjgVar = this.f;
            g8e g8eVar = new g8e(th);
            mjgVar.getClass();
            mjgVar.j(null, g8eVar);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f(nq4 nq4Var) {
        h9g h9gVar;
        if (nq4Var instanceof h9g) {
            h9gVar = (h9g) nq4Var;
            int i2 = h9gVar.g;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                h9gVar.g = i2 - Integer.MIN_VALUE;
            } else {
                h9gVar = new h9g(this, nq4Var);
            }
        } else {
            h9gVar = new h9g(this, nq4Var);
        }
        Object obj = h9gVar.e;
        int i3 = h9gVar.g;
        try {
            if (i3 == 0) {
                ch3.d0(obj);
                h9gVar.d = this;
                h9gVar.g = 1;
                Object objD = d(h9gVar);
                hu4 hu4Var = hu4.a;
                this = objD;
                if (objD == hu4Var) {
                    return hu4Var;
                }
            } else {
                if (i3 != 1) {
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                m9g m9gVar = h9gVar.d;
                ch3.d0(obj);
                this = m9gVar;
            }
        } catch (Throwable th) {
            mjg mjgVar = this.f;
            g8e g8eVar = new g8e(th);
            mjgVar.getClass();
            mjgVar.j(null, g8eVar);
        }
        return sbi.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11, types: [m9g] */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v2, types: [i9g] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [m9g] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v7 */
    public final Object g(nq4 nq4Var) throws FileNotFoundException {
        ?? i9gVar;
        FileInputStream fileInputStream;
        Throwable th;
        if (nq4Var instanceof i9g) {
            i9g i9gVar2 = (i9g) nq4Var;
            int i2 = i9gVar2.h;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                i9gVar2.h = i2 - Integer.MIN_VALUE;
                i9gVar = i9gVar2;
            } else {
                i9gVar = new i9g(this, nq4Var);
            }
        } else {
            i9gVar = new i9g(this, nq4Var);
        }
        Object obj = i9gVar.f;
        int i3 = i9gVar.h;
        try {
            if (i3 != 0) {
                if (i3 != 1) {
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                fileInputStream = i9gVar.e;
                i9gVar = i9gVar.d;
                try {
                    ch3.d0(obj);
                    rx8.n(fileInputStream, null);
                    return obj;
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        throw th;
                    } catch (Throwable th3) {
                        rx8.n(fileInputStream, th);
                        throw th3;
                    }
                }
            }
            ch3.d0(obj);
            try {
                FileInputStream fileInputStream2 = new FileInputStream(c());
                try {
                    i9gVar.d = this;
                    i9gVar.e = fileInputStream2;
                    i9gVar.h = 1;
                    x8b x8bVarE = ou7.e(fileInputStream2);
                    hu4 hu4Var = hu4.a;
                    if (x8bVarE == hu4Var) {
                        return hu4Var;
                    }
                    fileInputStream = fileInputStream2;
                    obj = x8bVarE;
                    rx8.n(fileInputStream, null);
                    return obj;
                } catch (Throwable th4) {
                    i9gVar = this;
                    fileInputStream = fileInputStream2;
                    th = th4;
                    throw th;
                }
            } catch (FileNotFoundException e) {
                i9gVar = this;
                e = e;
                if (i9gVar.c().exists()) {
                    throw e;
                }
                return new x8b(true);
            }
        } catch (FileNotFoundException e2) {
            e = e2;
        }
    }

    @Override // defpackage.b35
    public final xx6 getData() {
        return this.c;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object h(nq4 nq4Var) throws CorruptionException, IllegalAccessException, FileNotFoundException, InvocationTargetException {
        j9g j9gVar;
        m9g m9gVar;
        CorruptionException corruptionException;
        CorruptionException corruptionException2;
        IOException e;
        if (nq4Var instanceof j9g) {
            j9gVar = (j9g) nq4Var;
            int i2 = j9gVar.h;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                j9gVar.h = i2 - Integer.MIN_VALUE;
            } else {
                j9gVar = new j9g(this, nq4Var);
            }
        } else {
            j9gVar = new j9g(this, nq4Var);
        }
        Object obj = j9gVar.f;
        int i3 = j9gVar.h;
        hu4 hu4Var = hu4.a;
        try {
            if (i3 != 0) {
                if (i3 == 1) {
                    ch3.d0(obj);
                    return obj;
                }
                if (i3 == 2) {
                    corruptionException = (CorruptionException) j9gVar.e;
                    m9gVar = (m9g) j9gVar.d;
                    ch3.d0(obj);
                    try {
                        j9gVar.d = corruptionException;
                        j9gVar.e = obj;
                        j9gVar.h = 3;
                        if (m9gVar.j(obj, j9gVar) != hu4Var) {
                            return obj;
                        }
                    } catch (IOException e2) {
                        corruptionException2 = corruptionException;
                        e = e2;
                    }
                } else {
                    if (i3 != 3) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    Object obj2 = j9gVar.e;
                    corruptionException2 = (CorruptionException) j9gVar.d;
                    try {
                        ch3.d0(obj);
                        return obj2;
                    } catch (IOException e3) {
                        e = e3;
                    }
                }
                gm0.b(corruptionException2, e);
                throw corruptionException2;
            }
            ch3.d0(obj);
            j9gVar.d = this;
            j9gVar.h = 1;
            Object objG = g(j9gVar);
            if (objG != hu4Var) {
                return objG;
            }
        } catch (CorruptionException e4) {
            ex8 ex8Var = this.b;
            j9gVar.d = this;
            j9gVar.e = e4;
            j9gVar.h = 2;
            Object objInvoke = ((cf7) ex8Var.b).invoke(e4);
            if (objInvoke != hu4Var) {
                m9gVar = this;
                corruptionException = e4;
                obj = objInvoke;
            }
            return hu4Var;
        }
        return hu4Var;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object i(qf7 qf7Var, vt4 vt4Var, nq4 nq4Var) {
        k9g k9gVar;
        e25 e25Var;
        m9g m9gVar;
        Object obj;
        m9g m9gVar2;
        Object obj2;
        if (nq4Var instanceof k9g) {
            k9gVar = (k9g) nq4Var;
            int i2 = k9gVar.i;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                k9gVar.i = i2 - Integer.MIN_VALUE;
            } else {
                k9gVar = new k9g(this, nq4Var);
            }
        } else {
            k9gVar = new k9g(this, nq4Var);
        }
        Object obj3 = k9gVar.g;
        int i3 = k9gVar.i;
        hu4 hu4Var = hu4.a;
        if (i3 != 0) {
            if (i3 == 1) {
                obj = k9gVar.f;
                e25Var = (e25) k9gVar.e;
                m9gVar = k9gVar.d;
                ch3.d0(obj3);
            } else {
                if (i3 != 2) {
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                obj2 = k9gVar.e;
                m9gVar2 = k9gVar.d;
                ch3.d0(obj3);
            }
            mjg mjgVar = m9gVar2.f;
            e25 e25Var2 = new e25(obj2 != null ? obj2.hashCode() : 0, obj2);
            mjgVar.getClass();
            mjgVar.j(null, e25Var2);
            return obj2;
        }
        ch3.d0(obj3);
        e25 e25Var3 = (e25) this.f.getValue();
        Object obj4 = e25Var3.a;
        if ((obj4 != null ? obj4.hashCode() : 0) != e25Var3.b) {
            ore.k("Data in DataStore was mutated but DataStore is only compatible with Immutable types.");
            return null;
        }
        Object obj5 = e25Var3.a;
        pdd pddVar = new pdd(qf7Var, obj5, (lq4) null);
        k9gVar.d = this;
        k9gVar.e = e25Var3;
        k9gVar.f = obj5;
        k9gVar.i = 1;
        Object objK0 = yab.K0(vt4Var, pddVar, k9gVar);
        if (objK0 != hu4Var) {
            obj3 = objK0;
            e25Var = e25Var3;
            m9gVar = this;
            obj = obj5;
        }
        return hu4Var;
        Object obj6 = e25Var.a;
        if ((obj6 != null ? obj6.hashCode() : 0) != e25Var.b) {
            ore.k("Data in DataStore was mutated but DataStore is only compatible with Immutable types.");
            return null;
        }
        if (cqk.d(obj, obj3)) {
            return obj;
        }
        k9gVar.d = m9gVar;
        k9gVar.e = obj3;
        k9gVar.f = null;
        k9gVar.i = 2;
        if (m9gVar.j(obj3, k9gVar) != hu4Var) {
            m9gVar2 = m9gVar;
            obj2 = obj3;
            mjg mjgVar2 = m9gVar2.f;
            e25 e25Var4 = new e25(obj2 != null ? obj2.hashCode() : 0, obj2);
            mjgVar2.getClass();
            mjgVar2.j(null, e25Var4);
            return obj2;
        }
        return hu4Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object j(Object obj, nq4 nq4Var) throws IOException {
        l9g l9gVar;
        File file;
        FileOutputStream fileOutputStream;
        m9g m9gVar;
        FileOutputStream fileOutputStream2;
        if (nq4Var instanceof l9g) {
            l9gVar = (l9g) nq4Var;
            int i2 = l9gVar.j;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                l9gVar.j = i2 - Integer.MIN_VALUE;
            } else {
                l9gVar = new l9g(this, nq4Var);
            }
        } else {
            l9gVar = new l9g(this, nq4Var);
        }
        Object obj2 = l9gVar.h;
        int i3 = l9gVar.j;
        sbi sbiVar = sbi.a;
        if (i3 == 0) {
            ch3.d0(obj2);
            File fileC = c();
            File parentFile = fileC.getCanonicalFile().getParentFile();
            if (parentFile != null) {
                parentFile.mkdirs();
                if (!parentFile.isDirectory()) {
                    qr7.k(cqk.M(fileC, "Unable to create parent directories of "));
                    return null;
                }
            }
            file = new File(cqk.M(this.d, c().getAbsolutePath()));
            try {
                FileOutputStream fileOutputStream3 = new FileOutputStream(file);
                try {
                    wki wkiVar = new wki(2, fileOutputStream3);
                    l9gVar.d = this;
                    l9gVar.e = file;
                    l9gVar.f = fileOutputStream3;
                    l9gVar.g = fileOutputStream3;
                    l9gVar.j = 1;
                    ou7.i(obj, wkiVar);
                    hu4 hu4Var = hu4.a;
                    if (sbiVar == hu4Var) {
                        return hu4Var;
                    }
                    m9gVar = this;
                    fileOutputStream2 = fileOutputStream3;
                    fileOutputStream = fileOutputStream2;
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream = fileOutputStream3;
                    throw th;
                }
            } catch (IOException e) {
                if (file.exists()) {
                    file.delete();
                }
                throw e;
            }
        } else {
            if (i3 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            fileOutputStream2 = l9gVar.g;
            fileOutputStream = l9gVar.f;
            file = l9gVar.e;
            m9gVar = l9gVar.d;
            try {
                ch3.d0(obj2);
            } catch (Throwable th2) {
                th = th2;
                try {
                    throw th;
                } catch (Throwable th3) {
                    rx8.n(fileOutputStream, th);
                    throw th3;
                }
            }
        }
        fileOutputStream2.getFD().sync();
        rx8.n(fileOutputStream, null);
        if (file.renameTo(m9gVar.c())) {
            return sbiVar;
        }
        throw new IOException("Unable to rename " + file + ".This likely means that there are multiple instances of DataStore for this file. Ensure that you are only creating a single instance of datastore for this file.");
    }
}
