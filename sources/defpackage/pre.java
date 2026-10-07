package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class pre {
    public final sr3 a;
    public final Context b;
    public final String c;
    public Executor f;
    public Executor g;
    public cbh h;
    public boolean i;
    public boolean p;
    public boolean q;
    public final ArrayList d = new ArrayList();
    public final ArrayList e = new ArrayList();
    public int s = 1;
    public final long j = -1;
    public final t3a k = new t3a(17);
    public final LinkedHashSet l = new LinkedHashSet();
    public final LinkedHashSet m = new LinkedHashSet();
    public final ArrayList n = new ArrayList();
    public boolean o = true;
    public final boolean r = true;

    public pre(Context context, Class cls, String str) {
        this.a = zfe.a(cls);
        this.b = context;
        this.c = str;
    }

    public final void a(zxa... zxaVarArr) {
        for (zxa zxaVar : zxaVarArr) {
            Integer numValueOf = Integer.valueOf(zxaVar.a);
            LinkedHashSet linkedHashSet = this.m;
            linkedHashSet.add(numValueOf);
            linkedHashSet.add(Integer.valueOf(zxaVar.b));
        }
        zxa[] zxaVarArr2 = (zxa[]) Arrays.copyOf(zxaVarArr, zxaVarArr.length);
        t3a t3aVar = this.k;
        t3aVar.getClass();
        for (zxa zxaVar2 : zxaVarArr2) {
            t3aVar.k(zxaVar2);
        }
    }

    public final rre b() {
        String name;
        pic picVarE;
        int i;
        int i2;
        Object objB;
        dbh dbhVarL;
        dbh dbhVarL2;
        boolean zContainsKey;
        Executor executor = this.f;
        if (executor == null && this.g == null) {
            sv svVar = tv.m;
            this.g = svVar;
            this.f = svVar;
        } else if (executor != null && this.g == null) {
            this.g = executor;
        } else if (executor == null) {
            this.f = this.g;
        }
        LinkedHashSet linkedHashSet = this.m;
        boolean zIsEmpty = linkedHashSet.isEmpty();
        LinkedHashSet linkedHashSet2 = this.l;
        if (!zIsEmpty) {
            Iterator it = linkedHashSet.iterator();
            while (it.hasNext()) {
                int iIntValue = ((Number) it.next()).intValue();
                if (linkedHashSet2.contains(Integer.valueOf(iIntValue))) {
                    c.o(zo5.h(iIntValue, "Inconsistency detected. A Migration was supplied to addMigration() that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(). Start version is: "));
                    return null;
                }
            }
        }
        cbh xvcVar = this.h;
        if (xvcVar == null) {
            xvcVar = new xvc(18);
        }
        cbh cbhVar = xvcVar;
        int i3 = 0;
        if (this.j > 0) {
            if (this.c != null) {
                ore.p("Required value was null.");
                return null;
            }
            ore.p("Cannot create auto-closing database for an in-memory database.");
            return null;
        }
        boolean z = this.i;
        int i4 = this.s;
        qt4.c(i4);
        Context context = this.b;
        if (i4 == 1) {
            Object systemService = context.getSystemService("activity");
            ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
            i4 = (activityManager == null || activityManager.isLowRamDevice()) ? 2 : 3;
        }
        Executor executor2 = this.f;
        if (executor2 == null) {
            ore.p("Required value was null.");
            return null;
        }
        Executor executor3 = this.g;
        if (executor3 == null) {
            ore.p("Required value was null.");
            return null;
        }
        l35 l35Var = new l35(context, this.c, cbhVar, this.k, this.d, z, i4, executor2, executor3, null, this.o, this.p, linkedHashSet2, null, null, null, this.e, this.n, this.q, null, null);
        l35Var.r = this.r;
        Class clsD = this.a.d();
        Package r0 = clsD.getPackage();
        if (r0 == null || (name = r0.getName()) == null) {
            name = "";
        }
        String canonicalName = clsD.getCanonicalName();
        if (name.length() != 0) {
            canonicalName = canonicalName.substring(name.length() + 1);
        }
        String strConcat = z5h.I0(canonicalName, '.', '_', false).concat("_Impl");
        try {
            rre rreVar = (rre) Class.forName(name.length() == 0 ? strConcat : name + '.' + strConcat, true, clsD.getClassLoader()).getDeclaredConstructor(null).newInstance(null);
            rreVar.k = l35Var.r;
            try {
                picVarE = rreVar.e();
            } catch (jib unused) {
                picVarE = null;
            }
            List list = r66.a;
            List list2 = l35Var.e;
            if (picVarE == null) {
                new nre(i3, rreVar);
                new rea(rreVar);
                th5 th5Var = new th5();
                th5Var.c = l35Var;
                th5Var.d = new ire();
                th5Var.e = list2 == null ? list : list2;
                p7d p7dVar = new p7d(21, th5Var);
                if (list2 != null) {
                    list = list2;
                }
                ww3.H1(new kre(p7dVar), list);
                throw new jib();
            }
            bp bpVar = new bp(2, rreVar, tre.class, "compatTransactionCoroutineExecute", "compatTransactionCoroutineExecute(Landroidx/room/RoomDatabase;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 1, 9);
            th5 th5Var2 = new th5();
            th5Var2.c = l35Var;
            th5Var2.d = picVarE;
            if (list2 != null) {
                list = list2;
            }
            th5Var2.e = list;
            int i5 = l35Var.g;
            String str = l35Var.b;
            rxe rxeVar = l35Var.q;
            if (rxeVar == null) {
                cbh cbhVar2 = l35Var.c;
                if (cbhVar2 == null) {
                    ore.p("SQLiteManager was constructed with both null driver and open helper factory!");
                    throw null;
                }
                dbh dbhVarB = cbhVar2.b(new bbh(l35Var.a, str, new jre(th5Var2, picVarE.a), false, false));
                th5Var2.g = dbhVarB;
                th5Var2.f = new boc(new w4(dbhVarB), str != null ? str : ":memory:", bpVar);
            } else {
                th5Var2.g = null;
                if (rxeVar.k()) {
                    objB = new boc(new kzi(th5Var2, rxeVar), str != null ? str : ":memory:", bpVar);
                } else if (str == null) {
                    objB = qol.c(new kzi(th5Var2, rxeVar));
                } else {
                    kzi kziVar = new kzi(th5Var2, rxeVar);
                    int[] iArr = ms0.$EnumSwitchMapping$0;
                    int i6 = iArr[qt4.D(i5)];
                    if (i6 != 1) {
                        i = 2;
                        if (i6 != 2) {
                            throw new IllegalStateException(("Can't get max number of reader for journal mode '" + c0a.z(i5) + '\'').toString());
                        }
                        i2 = 4;
                    } else {
                        i = 2;
                        i2 = 1;
                    }
                    int i7 = iArr[qt4.D(i5)];
                    if (i7 != 1 && i7 != i) {
                        throw new IllegalStateException(("Can't get max number of writers for journal mode '" + c0a.z(i5) + '\'').toString());
                    }
                    objB = qol.b(kziVar, str, i2);
                }
                th5Var2.f = objB;
            }
            boolean z2 = i5 == 3;
            dbh dbhVar = (dbh) th5Var2.g;
            if (dbhVar != null) {
                dbhVar.setWriteAheadLoggingEnabled(z2);
            }
            rreVar.e = th5Var2;
            rreVar.f = rreVar.d();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Set setH = rreVar.h();
            List list3 = l35Var.o;
            int size = list3.size();
            boolean[] zArr = new boolean[size];
            Iterator it2 = setH.iterator();
            while (true) {
                int i8 = -1;
                if (!it2.hasNext()) {
                    int size2 = list3.size() - 1;
                    if (size2 >= 0) {
                        while (true) {
                            int i9 = size2 - 1;
                            if (size2 >= size || !zArr[size2]) {
                                ore.p("Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder.");
                                return null;
                            }
                            if (i9 < 0) {
                                break;
                            }
                            size2 = i9;
                        }
                    }
                    for (zxa zxaVar : rreVar.c(linkedHashMap)) {
                        int i10 = zxaVar.a;
                        int i11 = zxaVar.b;
                        t3a t3aVar = l35Var.d;
                        LinkedHashMap linkedHashMap2 = (LinkedHashMap) t3aVar.a;
                        if (linkedHashMap2.containsKey(Integer.valueOf(i10))) {
                            Map map = (Map) linkedHashMap2.get(Integer.valueOf(i10));
                            if (map == null) {
                                map = s66.a;
                            }
                            zContainsKey = map.containsKey(Integer.valueOf(i11));
                        } else {
                            zContainsKey = false;
                        }
                        if (!zContainsKey) {
                            t3aVar.k(zxaVar);
                        }
                    }
                    LinkedHashMap linkedHashMapI = rreVar.i();
                    List list4 = l35Var.n;
                    boolean[] zArr2 = new boolean[list4.size()];
                    for (Map.Entry entry : linkedHashMapI.entrySet()) {
                        rv8 rv8Var = (rv8) entry.getKey();
                        for (rv8 rv8Var2 : (List) entry.getValue()) {
                            int size3 = list4.size() - 1;
                            if (size3 < 0) {
                                size3 = -1;
                                break;
                            }
                            while (true) {
                                int i12 = size3 - 1;
                                if (((sr3) rv8Var2).i(list4.get(size3))) {
                                    zArr2[size3] = true;
                                    break;
                                }
                                if (i12 < 0) {
                                    size3 = -1;
                                    break;
                                }
                                size3 = i12;
                            }
                            if (size3 < 0) {
                                throw new IllegalArgumentException(("A required type converter (" + ((sr3) rv8Var2).g() + ") for " + ((sr3) rv8Var).g() + " is missing in the database configuration.").toString());
                            }
                            rreVar.j.put(rv8Var2, list4.get(size3));
                        }
                    }
                    int size4 = list4.size() - 1;
                    if (size4 >= 0) {
                        while (true) {
                            int i13 = size4 - 1;
                            if (!zArr2[size4]) {
                                qr7.i(list4.get(size4), ". Annotate TypeConverter class with @ProvidedTypeConverter annotation or remove this converter from the builder.", "Unexpected type converter ");
                                return null;
                            }
                            if (i13 < 0) {
                                break;
                            }
                            size4 = i13;
                        }
                    }
                    rreVar.c = l35Var.h;
                    rreVar.d = new iif(l35Var.i, 1);
                    Executor executor4 = rreVar.c;
                    if (executor4 == null) {
                        executor4 = null;
                    }
                    dq4 dq4VarA = cqk.a(lvb.x0(ch3.m(executor4), wk8.a()));
                    rreVar.a = dq4VarA;
                    vt4 vt4Var = dq4VarA.a;
                    iif iifVar = rreVar.d;
                    if (iifVar == null) {
                        iifVar = null;
                    }
                    rreVar.b = vt4Var.u0(ch3.m(iifVar));
                    rreVar.h = l35Var.f;
                    th5 th5Var3 = rreVar.e;
                    if (th5Var3 == null) {
                        th5Var3 = null;
                    }
                    dbh dbhVar2 = (dbh) th5Var3.g;
                    if (dbhVar2 == null) {
                        dbhVarL = null;
                        break;
                    }
                    dbhVarL = dbhVar2;
                    while (!(dbhVarL instanceof scd)) {
                        if (!(dbhVarL instanceof vg5)) {
                            dbhVarL = null;
                            break;
                        }
                        dbhVarL = ((vg5) dbhVarL).l();
                    }
                    th5 th5Var4 = rreVar.e;
                    if (th5Var4 == null) {
                        th5Var4 = null;
                    }
                    dbh dbhVar3 = (dbh) th5Var4.g;
                    if (dbhVar3 == null) {
                        dbhVarL2 = null;
                        break;
                    }
                    dbhVarL2 = dbhVar3;
                    while (!(dbhVarL2 instanceof cf0)) {
                        if (!(dbhVarL2 instanceof vg5)) {
                            dbhVarL2 = null;
                            break;
                        }
                        dbhVarL2 = ((vg5) dbhVarL2).l();
                    }
                    Intent intent = l35Var.j;
                    if (intent != null) {
                        String str2 = l35Var.b;
                        if (str2 == null) {
                            ore.p("Required value was null.");
                            return null;
                        }
                        jl8 jl8Var = rreVar.f;
                        if (jl8Var == null) {
                            jl8Var = null;
                        }
                        jl8Var.i = intent;
                        jl8Var.j = new i5b(l35Var.a, str2, jl8Var);
                    }
                    return rreVar;
                }
                rv8 rv8Var3 = (rv8) it2.next();
                int size5 = list3.size() - 1;
                if (size5 >= 0) {
                    while (true) {
                        int i14 = size5 - 1;
                        if (((sr3) rv8Var3).i(list3.get(size5))) {
                            zArr[size5] = true;
                            i8 = size5;
                            break;
                        }
                        if (i14 < 0) {
                            break;
                        }
                        size5 = i14;
                    }
                }
                if (i8 < 0) {
                    ore.d(((sr3) rv8Var3).g(), ") is missing in the database configuration.", "A required auto migration spec (");
                    return null;
                }
                linkedHashMap.put(rv8Var3, list3.get(i8));
            }
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("Cannot find implementation for " + clsD.getCanonicalName() + ". " + strConcat + " does not exist. Is Room annotation processor correctly configured?", e);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("Cannot access the constructor " + clsD.getCanonicalName(), e2);
        } catch (InstantiationException e3) {
            throw new RuntimeException("Failed to create an instance of " + clsD.getCanonicalName(), e3);
        }
    }
}
