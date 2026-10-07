package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.util.SparseIntArray;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import org.apache.http.conn.params.ConnManagerParams;
import org.webrtc.PeerConnection;

/* JADX INFO: loaded from: classes.dex */
public final class l65 extends o8g {
    public final /* synthetic */ int b;

    public /* synthetic */ l65(int i) {
        this.b = i;
    }

    @Override // defpackage.o8g
    public final Object b(h5 h5Var) {
        int i;
        boolean z = true;
        switch (this.b) {
            case 0:
                return new o65(h5Var.d(45));
            case 1:
                return new yj5(h5Var.d(1));
            case 2:
                return new gl5(h5Var.d(161), h5Var.d(146), h5Var.d(23));
            case 3:
                return new q26(h5Var.d(23), h5Var.d(7), h5Var.d(944), (rb8) h5Var.c(782), h5Var.d(138), h5Var.d(97), h5Var.d(958), h5Var.d(959), (e5d) h5Var.c(26), h5Var.d(np0.o), h5Var.d(189), h5Var.d(960), (z26) h5Var.c(961), (xk2) h5Var.c(962));
            case 4:
                return new i56((pk5) h5Var.c(88));
            case 5:
                return new f66((yt4) h5Var.c(48), (i56) h5Var.c(253), h5Var.d(23), (Context) h5Var.c(7));
            case 6:
                return (w46) h5Var.c(254);
            case 7:
                return new fa6(h5Var.d(85), h5Var.d(23), h5Var.d(48));
            case 8:
                return new br6(h5Var.d(23), h5Var.d(294), h5Var.d(296), h5Var.d(144), h5Var.d(295), h5Var.d(26));
            case 9:
                return new b47(h5Var.d(139), h5Var.d(665));
            case 10:
                return new g37((xhh) h5Var.c(23), (sy4) h5Var.c(226), (c27) h5Var.c(1029), (sfi) h5Var.c(1030), (f27) h5Var.c(997), h5Var.d(316), h5Var.d(670), h5Var.d(144), h5Var.d(673));
            case 11:
                f27 f27Var = (f27) h5Var.c(997);
                return new l57((sy4) h5Var.c(226), (xhh) h5Var.c(23), h5Var.d(673), (c27) h5Var.c(1029), (d47) h5Var.c(1024), f27Var, h5Var.d(316));
            case 12:
                return new e67((sy4) h5Var.c(226), (xhh) h5Var.c(23), (ffi) h5Var.c(1008), h5Var.d(144), h5Var.d(316), h5Var.d(673));
            case 13:
                return new o97(h5Var.d(85), h5Var.d(132), (t40) h5Var.c(805), h5Var.d(144), h5Var.d(1012));
            case 14:
                return new k87(h5Var);
            case 15:
                return ((f78) h5Var.c(1019)).h();
            case 16:
                return new ige(h5Var.d(146), h5Var.d(144), h5Var.d(136), h5Var.d(300), h5Var.d(116));
            case 17:
                e5d e5dVar = (e5d) h5Var.c(26);
                ifh ifhVarD = h5Var.d(139);
                ifh ifhVarD2 = h5Var.d(1101);
                ifh ifhVarD3 = h5Var.d(85);
                ifh ifhVarD4 = h5Var.d(702);
                b5d b5dVar = e5dVar.N;
                zv8[] zv8VarArr = e5d.S6;
                return new dge(ifhVarD, ifhVarD2, ifhVarD3, ifhVarD4, ((Number) b5dVar.a(zv8VarArr[32]).i()).intValue(), ((Number) e5dVar.a6.a(zv8VarArr[366]).i()).intValue(), ((Boolean) e5dVar.Z5.a(zv8VarArr[365]).i()).booleanValue());
            case 18:
                return new t68(h5Var.d(122), h5Var.d(26));
            case 19:
                pk5 pk5Var = (pk5) h5Var.c(88);
                int iL0 = e9i.l0(1, ((od6) m94.d.getValue()).c, ((od6) m94.e.getValue()).c, m94.f.c);
                int iOrdinal = pk5Var.ordinal();
                if (iOrdinal == 0) {
                    iL0 /= 2;
                    if (iL0 < 2) {
                        iL0 = 2;
                    }
                } else if (iOrdinal != 1 && iOrdinal != 2) {
                    ore.o();
                    return null;
                }
                SparseIntArray sparseIntArray = new SparseIntArray(1);
                sparseIntArray.put(16384, iL0);
                int i2 = 2097152;
                cbd cbdVar = new cbd(iL0 * 16384, 2097152, sparseIntArray, -1);
                int iOrdinal2 = pk5Var.ordinal();
                if (iOrdinal2 == 0) {
                    i = PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS;
                } else if (iOrdinal2 == 1) {
                    i = 65536;
                } else {
                    if (iOrdinal2 != 2) {
                        ore.o();
                        return null;
                    }
                    i = 131072;
                }
                int iOrdinal3 = pk5Var.ordinal();
                if (iOrdinal3 != 0) {
                    if (iOrdinal3 == 1) {
                        i2 = 3145728;
                    } else {
                        if (iOrdinal3 != 2) {
                            ore.o();
                            return null;
                        }
                        i2 = 4194304;
                    }
                }
                int i3 = iL0 * i2;
                SparseIntArray sparseIntArray2 = new SparseIntArray(8);
                while (i <= i2) {
                    sparseIntArray2.put(i, iL0);
                    i *= 2;
                }
                cbd cbdVar2 = new cbd(i2, i3, sparseIntArray2, iL0);
                gvb gvbVar = new gvb();
                gvbVar.a = "legacy";
                gvbVar.c = (uba) h5Var.c(1103);
                gvbVar.d = cbdVar;
                gvbVar.b = cbdVar2;
                return new bbd(new abd(gvbVar));
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                return ((bbd) h5Var.c(975)).a();
            case 21:
                c78 c78Var = (c78) h5Var.c(1098);
                c78Var.getClass();
                return new d78(c78Var);
            case 22:
                Context context = (Context) h5Var.c(7);
                ifh ifhVarD5 = h5Var.d(179);
                rm5 rm5Var = new rm5(context);
                rm5Var.a = "fresco";
                rm5Var.b = new h85(1, ifhVarD5);
                rm5Var.c = 314572800L;
                rm5Var.d = 104857600L;
                rm5Var.e = 52428800L;
                rm5Var.g = (n71) h5Var.c(31);
                sm5 sm5Var = new sm5(rm5Var);
                c78 c78Var2 = new c78(context);
                ifh ifhVarD6 = h5Var.d(1102);
                ifh ifhVarD7 = h5Var.d(928);
                ifh ifhVarD8 = h5Var.d(139);
                b5d b5dVar2 = ((e5d) h5Var.c(26)).Z5;
                zv8[] zv8VarArr2 = e5d.S6;
                c78Var2.f = new gge(ifhVarD6, ifhVarD7, ifhVarD8, ((Boolean) b5dVar2.a(zv8VarArr2[365]).i()).booleanValue());
                c78Var2.g = (bbd) h5Var.c(975);
                c78Var2.e = sm5Var;
                c78Var2.j = sm5Var;
                f68 f68Var = new f68();
                f68Var.a(wk8.b, oe7.a, new ne7(h5Var.d(975), h5Var.d(973)));
                f68Var.a(yab.d, ra9.a, new sa9((Context) h5Var.c(7), ((n0c) ((xhh) h5Var.c(23))).c()));
                f68Var.a(f55.d, nrh.a, new mrh((fy0) h5Var.c(927)));
                if (((Boolean) ((e5d) h5Var.c(26)).P1.a(zv8VarArr2[144]).i()).booleanValue() && Build.VERSION.SDK_INT <= 29) {
                    jbb jbbVar = new jbb(h5Var.d(973));
                    f68Var.b(kb5.f, jbbVar);
                    f68Var.b(kb5.g, jbbVar);
                    f68Var.b(kb5.h, jbbVar);
                    f68Var.b(kb5.i, jbbVar);
                }
                f68 f68Var2 = new f68();
                f68Var2.a = f68Var.a;
                f68Var2.b = f68Var.b;
                c78Var2.k = f68Var2;
                c78Var2.c = at5.a;
                ss3.e.getClass();
                c78Var2.a = ss3.f;
                c78Var2.h = Collections.singleton(new ime());
                c78Var2.i = Collections.singleton(new le7((gue) h5Var.c(69), h5Var.d(92), h5Var.d(22), h5Var.d(26)));
                c78Var2.d = new qu(h5Var.d(27));
                if (((Boolean) ((e5d) h5Var.c(26)).O1.a(zv8VarArr2[143]).i()).booleanValue()) {
                    new dx4(c78Var2.l, 20, new c4h(1, new tqh(c78Var2.m))).invoke();
                }
                return c78Var2;
            case 23:
                return new qf8(new ifh(new ic1(h5Var, 7)));
            case 24:
                Context context2 = (Context) h5Var.c(7);
                d78 d78Var = (d78) h5Var.c(948);
                qf8 qf8Var = (qf8) h5Var.c(1010);
                xb9 xb9Var = ((zed) h5Var.c(101)).a;
                final AtomicBoolean atomicBoolean = new AtomicBoolean(((Boolean) xb9Var.C0.m(xb9Var, xb9.g1[19])).booleanValue());
                List<ot5> listSingletonList = Collections.singletonList(new qa9());
                fe7 fe7Var = new fe7();
                pj6.a = new be7();
                pj6.a.i(atomicBoolean.get() ? 2 : 6);
                qe7.a = new a8g(18);
                x5c x5cVar = new x5c();
                u50 u50Var = new u50();
                u50Var.b = new oah() { // from class: de7
                    @Override // defpackage.oah
                    public final Object get() {
                        return Boolean.valueOf(atomicBoolean.get());
                    }
                };
                u50Var.c = x5cVar;
                for (ot5 ot5Var : listSingletonList) {
                    if (((ArrayList) u50Var.a) == null) {
                        u50Var.a = new ArrayList();
                    }
                    ((ArrayList) u50Var.a).add(ot5Var);
                }
                ki3 ki3Var = new ki3();
                ArrayList arrayList = (ArrayList) u50Var.a;
                ki3Var.a = arrayList != null ? new b50(arrayList) : null;
                Object h85Var = (de7) u50Var.b;
                if (h85Var == null) {
                    h85Var = new h85(2, Boolean.FALSE);
                }
                ki3Var.c = h85Var;
                ki3Var.b = (x5c) u50Var.c;
                qe7.v();
                if (!vd7.b) {
                    vd7.b = true;
                } else if (pj6.a.h(5)) {
                    pj6.a.w(vd7.class.getSimpleName(), "Fresco has already been initialized! `Fresco.initialize(...)` should only be called 1 single time to avoid memory leaks!");
                }
                synchronized (yab.class) {
                    if (yab.a == null) {
                        z = false;
                    }
                    break;
                }
                if (!z) {
                    qe7.v();
                    try {
                        try {
                            try {
                                try {
                                    try {
                                        Class.forName("com.facebook.imagepipeline.nativecode.NativeCodeInitializer").getMethod("init", Context.class).invoke(null, context2);
                                    } catch (IllegalAccessException unused) {
                                        yab.d0(new nhb(24));
                                    }
                                } catch (NoSuchMethodException unused2) {
                                    yab.d0(new nhb(24));
                                }
                            } catch (InvocationTargetException unused3) {
                                yab.d0(new nhb(24));
                            }
                        } catch (ClassNotFoundException unused4) {
                            yab.d0(new nhb(24));
                        }
                        qe7.v();
                    } catch (Throwable th) {
                        qe7.v();
                        throw th;
                    }
                    break;
                }
                Context applicationContext = context2.getApplicationContext();
                synchronized (f78.class) {
                    try {
                        if (f78.p != null && pj6.a.h(5)) {
                            pj6.a.w(f78.class.getSimpleName(), "ImagePipelineFactory has already been initialized! `ImagePipelineFactory.initialize(...)` should only be called once to avoid unexpected behavior.");
                        }
                        f78.p = new f78(d78Var);
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                qe7.v();
                u1d u1dVar = new u1d(applicationContext, ki3Var);
                vd7.a = u1dVar;
                t6g.i = u1dVar;
                qe7.v();
                qe7.v();
                f78 f78VarG = f78.g();
                ExecutorService executorService = (ExecutorService) qf8Var.a.getValue();
                Resources resources = context2.getResources();
                ag5 ag5VarC = ag5.c();
                e85 e85VarA = f78VarG.a();
                f78VarG.b.w.getClass();
                vi8 vi8VarD = f78VarG.d();
                b50 b50Var = (b50) ki3Var.a;
                oah oahVar = new oah() { // from class: de7
                    @Override // defpackage.oah
                    public final Object get() {
                        return Boolean.valueOf(atomicBoolean.get());
                    }
                };
                x5cVar.a = resources;
                x5cVar.b = ag5VarC;
                x5cVar.c = e85VarA;
                x5cVar.d = executorService;
                x5cVar.e = vi8VarD;
                x5cVar.f = b50Var;
                x5cVar.g = oahVar;
                return fe7Var;
            case 25:
                h5Var.c(1099);
                return f78.g();
            case 26:
                return ((f78) h5Var.c(1019)).f();
            case 27:
                return ((f78) h5Var.c(1019)).i();
            case 28:
                return new wd7();
            default:
                return new fj7((rb8) h5Var.c(782), (yt4) h5Var.c(48), (ib9) h5Var.c(783), h5Var.d(157), h5Var.d(34), h5Var.d(23), h5Var.d(97), h5Var.d(54));
        }
    }
}
