package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import org.apache.http.conn.params.ConnManagerParams;
import ru.ok.android.externcalls.analytics.internal.storage.DatabaseHelper;

/* JADX INFO: loaded from: classes2.dex */
public final class c59 {
    public final ny8 a;
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
    public final ny8 n;
    public final ny8 o;
    public final ny8 p;
    public final ny8 q;
    public final ny8 r;
    public final String s = c59.class.getName();

    public c59(ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4, ny8 ny8Var5, ny8 ny8Var6, ny8 ny8Var7, ny8 ny8Var8, ny8 ny8Var9, ny8 ny8Var10, ny8 ny8Var11, ny8 ny8Var12, ny8 ny8Var13, ny8 ny8Var14, ny8 ny8Var15, ny8 ny8Var16, ny8 ny8Var17, ny8 ny8Var18) {
        this.a = ny8Var;
        this.b = ny8Var2;
        this.c = ny8Var6;
        this.d = ny8Var4;
        this.e = ny8Var7;
        this.f = ny8Var3;
        this.g = ny8Var8;
        this.h = ny8Var9;
        this.i = ny8Var10;
        this.j = ny8Var5;
        this.k = ny8Var11;
        this.l = ny8Var12;
        this.m = ny8Var13;
        this.n = ny8Var14;
        this.o = ny8Var15;
        this.p = ny8Var16;
        this.q = ny8Var17;
        this.r = ny8Var18;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0270  */
    /* JADX WARN: Code duplicated, block: B:125:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:136:0x0317  */
    /* JADX WARN: Code duplicated, block: B:138:0x031b  */
    /* JADX WARN: Code duplicated, block: B:140:0x0327  */
    /* JADX WARN: Code duplicated, block: B:144:0x033c  */
    /* JADX WARN: Code duplicated, block: B:146:0x0350  */
    /* JADX WARN: Code duplicated, block: B:147:0x0359  */
    /* JADX WARN: Code duplicated, block: B:151:0x0362 A[LOOP:0: B:142:0x0336->B:151:0x0362, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:154:0x0369  */
    /* JADX WARN: Code duplicated, block: B:155:0x0372 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:156:0x0374  */
    /* JADX WARN: Code duplicated, block: B:157:0x0387  */
    /* JADX WARN: Code duplicated, block: B:159:0x0391  */
    /* JADX WARN: Code duplicated, block: B:160:0x0395  */
    /* JADX WARN: Code duplicated, block: B:167:0x03b2  */
    /* JADX WARN: Code duplicated, block: B:171:0x03c6  */
    /* JADX WARN: Code duplicated, block: B:179:0x03de  */
    /* JADX WARN: Code duplicated, block: B:181:0x03e4  */
    /* JADX WARN: Code duplicated, block: B:183:0x03f2  */
    /* JADX WARN: Code duplicated, block: B:184:0x03f4  */
    /* JADX WARN: Code duplicated, block: B:186:0x0403  */
    /* JADX WARN: Code duplicated, block: B:189:0x0410  */
    /* JADX WARN: Code duplicated, block: B:196:0x0449  */
    /* JADX WARN: Code duplicated, block: B:197:0x044f  */
    /* JADX WARN: Code duplicated, block: B:200:0x0461  */
    /* JADX WARN: Code duplicated, block: B:202:0x0475  */
    /* JADX WARN: Code duplicated, block: B:203:0x048c  */
    /* JADX WARN: Code duplicated, block: B:205:0x0493 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:206:0x0495  */
    /* JADX WARN: Code duplicated, block: B:207:0x049b  */
    /* JADX WARN: Code duplicated, block: B:209:0x04a1  */
    /* JADX WARN: Code duplicated, block: B:213:0x04ae  */
    /* JADX WARN: Code duplicated, block: B:214:0x04b1  */
    /* JADX WARN: Code duplicated, block: B:217:0x04b9  */
    /* JADX WARN: Code duplicated, block: B:218:0x04ca  */
    /* JADX WARN: Code duplicated, block: B:220:0x04d2  */
    /* JADX WARN: Code duplicated, block: B:222:0x04e1  */
    /* JADX WARN: Code duplicated, block: B:223:0x04e3  */
    /* JADX WARN: Code duplicated, block: B:228:0x04fe A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:229:0x0500  */
    /* JADX WARN: Code duplicated, block: B:238:0x0553  */
    /* JADX WARN: Code duplicated, block: B:241:0x055a  */
    /* JADX WARN: Code duplicated, block: B:257:0x05ba  */
    /* JADX WARN: Code duplicated, block: B:258:0x05bc  */
    /* JADX WARN: Code duplicated, block: B:271:0x0604  */
    /* JADX WARN: Code duplicated, block: B:274:0x0627  */
    /* JADX WARN: Code duplicated, block: B:277:0x0637  */
    /* JADX WARN: Code duplicated, block: B:278:0x063a A[Catch: Exception -> 0x065d, TRY_LEAVE, TryCatch #1 {Exception -> 0x065d, blocks: (B:275:0x062d, B:278:0x063a), top: B:419:0x062d }] */
    /* JADX WARN: Code duplicated, block: B:292:0x0671  */
    /* JADX WARN: Code duplicated, block: B:295:0x0679  */
    /* JADX WARN: Code duplicated, block: B:296:0x0688  */
    /* JADX WARN: Code duplicated, block: B:298:0x0695  */
    /* JADX WARN: Code duplicated, block: B:302:0x06b6 A[ADDED_TO_REGION, REMOVE] */
    /* JADX WARN: Code duplicated, block: B:386:0x0871  */
    /* JADX WARN: Code duplicated, block: B:389:0x0890  */
    /* JADX WARN: Code duplicated, block: B:392:0x0895  */
    /* JADX WARN: Code duplicated, block: B:395:0x08b7  */
    /* JADX WARN: Code duplicated, block: B:421:0x03d3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:425:0x0650 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:429:0x03a3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:435:0x0367 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:436:0x0365 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:438:0x064e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:439:0x0659 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:442:0x0621 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:464:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:465:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:466:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    public static final Object a(c59 c59Var, njd njdVar, Uri uri, nq4 nq4Var) {
        x49 x49Var;
        Uri uriF;
        Object obj;
        u69 r69Var;
        Uri uri2;
        u69 o69Var;
        String queryParameter;
        long j;
        vg4 vg4VarF;
        u69 u69VarB;
        String queryParameter2;
        long j2;
        rt2 rt2VarK;
        ConcurrentHashMap concurrentHashMap;
        rt2 rt2Var;
        String string;
        v69 v69VarC;
        Iterator it;
        ArrayList arrayList;
        ArrayList arrayList2;
        List list;
        vg4 vg4Var;
        String str;
        boolean zEquals;
        long jE;
        String str2;
        String strReplace;
        v69 v69VarC2;
        List arrayList3;
        rt2 rt2Var2;
        u69 u69VarA;
        Long lA;
        String str3;
        boolean zEquals2;
        long j3;
        long j4;
        int i;
        boolean zStartsWith;
        int i2;
        String strSubstring;
        Iterator it2;
        vg4 vg4Var2;
        Iterator it3;
        String str4;
        String lastPathSegment;
        m65 m65Var;
        Uri uri3;
        Object poeVar;
        njd njdVar2;
        u69 u69Var;
        Throwable thA;
        int i3;
        long j5;
        njd njdVar3 = njdVar;
        Object obj2 = hu4.a;
        k39 k39Var = k39.a;
        Object obj3 = sbi.a;
        if (nq4Var instanceof x49) {
            x49Var = (x49) nq4Var;
            int i4 = x49Var.l;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                x49Var.l = i4 - Integer.MIN_VALUE;
            } else {
                x49Var = new x49(c59Var, nq4Var);
            }
        } else {
            x49Var = new x49(c59Var, nq4Var);
        }
        x49 x49Var2 = x49Var;
        Object objH = x49Var2.j;
        boolean zContainsAll = false;
        switch (x49Var2.l) {
            case 0:
                ch3.d0(objH);
                if (((cxb) c59Var.m.getValue()).a()) {
                    u39 u39Var = new u39(null);
                    x49Var2.d = null;
                    x49Var2.l = 1;
                    if (njdVar3.f.a(x49Var2, u39Var) == obj2) {
                        return obj2;
                    }
                } else {
                    c59Var.e().getClass();
                    List<String> pathSegments = uri.getPathSegments();
                    boolean z = "https".equalsIgnoreCase(uri.getScheme()) && "max.ru".equalsIgnoreCase(uri.getHost());
                    boolean z2 = !pathSegments.isEmpty() && ":auth".equalsIgnoreCase(pathSegments.get(0));
                    if (z && z2) {
                        c59Var.e().getClass();
                        uriF = new Uri.Builder().scheme("https").authority("max.ru").path(":auth").build();
                    } else {
                        uriF = c59Var.e().f(uri);
                    }
                    Uri uri4 = uriF;
                    if (!((svb) c59Var.q.getValue()).b()) {
                        u39 u39Var2 = new u39(uri4);
                        x49Var2.d = null;
                        x49Var2.e = null;
                        x49Var2.l = 2;
                        if (njdVar3.f.a(x49Var2, u39Var2) == obj2) {
                            return obj2;
                        }
                    } else if (v65.a(uri4).equals(":current")) {
                        y39 y39Var = new y39(c59Var.d(uri4));
                        x49Var2.d = null;
                        x49Var2.e = null;
                        x49Var2.l = 3;
                        if (njdVar3.f.a(x49Var2, y39Var) == obj2) {
                            return obj2;
                        }
                    } else {
                        ((o65) c59Var.n.getValue()).getClass();
                        ba baVar = ba.c;
                        ha9 ha9Var = ha9.b;
                        ylc ylcVarA = ((x65) baVar.invoke(ha9Var)).a.a(uri4);
                        if (!(ylcVarA == null ? false : !((m65) ylcVarA.a).b.c(gp0.h))) {
                            w69 w69VarE = c59Var.e();
                            qw2 qw2Var = (qw2) c59Var.b.getValue();
                            bi4 bi4Var = (bi4) c59Var.a.getValue();
                            sy4 sy4Var = (sy4) c59Var.p.getValue();
                            w69VarE.getClass();
                            String string2 = uri4.toString();
                            if (string2.equalsIgnoreCase("max.ru") || string2.equalsIgnoreCase("http://max.ru") || string2.equalsIgnoreCase("https://max.ru")) {
                                obj = obj3;
                                r69Var = null;
                            } else {
                                String string3 = uri4.toString();
                                if (string3.equalsIgnoreCase("max://max.ru") || string3.equalsIgnoreCase("max://max.ru/")) {
                                    k39Var = k39Var;
                                    obj = obj3;
                                    o69Var = new o69(0L, 0L, 0L, 0L);
                                } else if (uri4.toString().equalsIgnoreCase("https://max.ru/:share-self-out")) {
                                    k39Var = k39Var;
                                    obj = obj3;
                                    r69Var = new p69(0L, 0L, 0L, 0L);
                                } else {
                                    String host = uri4.getHost();
                                    if (TextUtils.isEmpty(host) || host.equalsIgnoreCase("max.ru")) {
                                        List<String> pathSegments2 = uri4.getPathSegments();
                                        obj = obj3;
                                        if (pathSegments2 != null && pathSegments2.size() == 1) {
                                            String queryParameter3 = uri4.getQueryParameter("startapp");
                                            if (queryParameter3 != null) {
                                                int iIndexOf = queryParameter3.indexOf(38);
                                                if (iIndexOf != -1) {
                                                    queryParameter3 = queryParameter3.substring(0, iIndexOf);
                                                }
                                                k39Var = k39Var;
                                                r69Var = new q69(uri4.buildUpon().clearQuery().build(), queryParameter3);
                                            } else {
                                                String str5 = pathSegments2.get(0);
                                                if (":folder".equalsIgnoreCase(str5)) {
                                                    String queryParameter4 = uri4.getQueryParameter("id");
                                                    if (TextUtils.isEmpty(queryParameter4)) {
                                                        zStartsWith = str5.startsWith("@");
                                                        if (zStartsWith && (str5.equals("join") || str5.equals("joincall") || str5.equals("join"))) {
                                                            i2 = -1;
                                                        } else {
                                                            i2 = 0;
                                                        }
                                                        if (i2 != -1) {
                                                            strSubstring = pathSegments2.get(i2);
                                                            if (strSubstring.startsWith("@")) {
                                                                strSubstring = strSubstring.substring(1);
                                                            }
                                                            it2 = bi4Var.b.values().iterator();
                                                            while (true) {
                                                                if (it2.hasNext()) {
                                                                    vg4Var2 = (vg4) it2.next();
                                                                    it3 = it2;
                                                                    str4 = vg4Var2.a.b.o;
                                                                    if (TextUtils.isEmpty(str4)) {
                                                                        lastPathSegment = null;
                                                                    } else {
                                                                        lastPathSegment = Uri.parse(str4).getLastPathSegment();
                                                                    }
                                                                    if (Objects.equals(lastPathSegment, strSubstring)) {
                                                                        it2 = it3;
                                                                    }
                                                                } else {
                                                                    vg4Var2 = null;
                                                                }
                                                            }
                                                            if (vg4Var2 != null) {
                                                                u69VarA = u69.b(vg4Var2.v());
                                                                k39Var = k39Var;
                                                                r69Var = u69VarA;
                                                            } else if (zStartsWith) {
                                                                k39Var = k39Var;
                                                                r69Var = new s69(0L, 0L, 0L, 0L);
                                                            } else if (Objects.equals(uri4.getHost(), "max.ru")) {
                                                                queryParameter = uri4.getQueryParameter("uid");
                                                                if (TextUtils.isEmpty(queryParameter)) {
                                                                    k39Var = k39Var;
                                                                } else {
                                                                    j = Long.parseLong(queryParameter);
                                                                    if (j == -1) {
                                                                    }
                                                                }
                                                                queryParameter2 = uri4.getQueryParameter("cid");
                                                                if (!TextUtils.isEmpty(queryParameter2)) {
                                                                    j2 = Long.parseLong(queryParameter2);
                                                                    if (j2 != 0) {
                                                                        rt2VarK = qw2Var.K(j2);
                                                                        if (rt2VarK == null) {
                                                                            concurrentHashMap = qw2Var.f;
                                                                            rt2Var = (rt2) concurrentHashMap.get(Long.valueOf(j2));
                                                                            if (rt2Var != null) {
                                                                                rt2VarK = rt2Var;
                                                                            } else {
                                                                                qw2Var.t();
                                                                                rt2VarK = (rt2) concurrentHashMap.get(Long.valueOf(j2));
                                                                            }
                                                                        }
                                                                        if (rt2VarK != null) {
                                                                            u69VarB = u69.a(rt2VarK.a);
                                                                            r69Var = u69VarB;
                                                                            k39Var = k39Var;
                                                                        }
                                                                    }
                                                                }
                                                                string = uri4.toString();
                                                                if (pathSegments2 == null) {
                                                                }
                                                                v69VarC = w69VarE.c(uri4, new kn3(w69VarE, 2));
                                                                if (TextUtils.isEmpty(null)) {
                                                                    it = bi4Var.b.values().iterator();
                                                                    arrayList = null;
                                                                    while (it.hasNext()) {
                                                                        vg4Var = (vg4) it.next();
                                                                        Iterator it4 = it;
                                                                        str = vg4Var.a.b.o;
                                                                        if (TextUtils.isEmpty(str)) {
                                                                            zEquals = false;
                                                                        } else {
                                                                            zEquals = v69VarC.equals(w69VarE.c(Uri.parse(str), new kn3(w69VarE, 2)));
                                                                        }
                                                                        if (zEquals) {
                                                                            if (arrayList == 0) {
                                                                                arrayList = new ArrayList();
                                                                            } else {
                                                                                arrayList = arrayList;
                                                                            }
                                                                            arrayList.add(vg4Var);
                                                                        } else {
                                                                            arrayList = arrayList;
                                                                        }
                                                                        it = it4;
                                                                        k39Var = k39Var;
                                                                    }
                                                                    arrayList2 = arrayList;
                                                                    k39Var = k39Var;
                                                                    if (arrayList2 == null) {
                                                                        list = Collections.EMPTY_LIST;
                                                                    } else {
                                                                        list = arrayList2;
                                                                    }
                                                                } else {
                                                                    list = Collections.EMPTY_LIST;
                                                                    k39Var = k39Var;
                                                                }
                                                                if (list.isEmpty()) {
                                                                    jE = w69.e(string);
                                                                    if (jE > 0) {
                                                                        if (pathSegments2 != null) {
                                                                            if (pathSegments2 == null) {
                                                                                str2 = null;
                                                                                strReplace = string;
                                                                                if (pathSegments2 == null) {
                                                                                    if (pathSegments2 == null) {
                                                                                        v69VarC2 = w69VarE.c(Uri.parse(strReplace), new kn3(w69VarE, 1));
                                                                                        qw2Var.t();
                                                                                        arrayList3 = null;
                                                                                        for (rt2 rt2Var3 : qw2Var.k.values()) {
                                                                                            str3 = rt2Var3.b.J;
                                                                                            if (TextUtils.isEmpty(str3)) {
                                                                                                zEquals2 = false;
                                                                                            } else {
                                                                                                zEquals2 = v69VarC2.equals(w69VarE.c(Uri.parse(str3), new kn3(w69VarE, 1)));
                                                                                            }
                                                                                            if (!zEquals2) {
                                                                                                if (arrayList3 == null) {
                                                                                                    arrayList3 = new ArrayList();
                                                                                                }
                                                                                                arrayList3.add(rt2Var3);
                                                                                            }
                                                                                        }
                                                                                        if (arrayList3 == null) {
                                                                                            arrayList3 = Collections.EMPTY_LIST;
                                                                                        }
                                                                                        if (arrayList3.isEmpty()) {
                                                                                            o69Var = new m69(0L, 0L, 0L, 0L);
                                                                                        } else {
                                                                                            rt2Var2 = (rt2) arrayList3.get(0);
                                                                                            if (ch3.r(str2)) {
                                                                                                u69VarA = u69.a(rt2Var2.a);
                                                                                            } else {
                                                                                                u69VarA = u69.a(rt2Var2.a);
                                                                                            }
                                                                                        }
                                                                                    } else {
                                                                                        v69VarC2 = w69VarE.c(Uri.parse(strReplace), new kn3(w69VarE, 1));
                                                                                        qw2Var.t();
                                                                                        arrayList3 = null;
                                                                                        while (r5.hasNext()) {
                                                                                            str3 = rt2Var3.b.J;
                                                                                            if (TextUtils.isEmpty(str3)) {
                                                                                                zEquals2 = false;
                                                                                            } else {
                                                                                                zEquals2 = v69VarC2.equals(w69VarE.c(Uri.parse(str3), new kn3(w69VarE, 1)));
                                                                                            }
                                                                                            if (!zEquals2) {
                                                                                                if (arrayList3 == null) {
                                                                                                    arrayList3 = new ArrayList();
                                                                                                }
                                                                                                arrayList3.add(rt2Var3);
                                                                                            }
                                                                                        }
                                                                                        if (arrayList3 == null) {
                                                                                            arrayList3 = Collections.EMPTY_LIST;
                                                                                        }
                                                                                        if (arrayList3.isEmpty()) {
                                                                                            o69Var = new m69(0L, 0L, 0L, 0L);
                                                                                        } else {
                                                                                            rt2Var2 = (rt2) arrayList3.get(0);
                                                                                            if (ch3.r(str2)) {
                                                                                                u69VarA = u69.a(rt2Var2.a);
                                                                                            } else {
                                                                                                u69VarA = u69.a(rt2Var2.a);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                } else if (pathSegments2 == null) {
                                                                                    v69VarC2 = w69VarE.c(Uri.parse(strReplace), new kn3(w69VarE, 1));
                                                                                    qw2Var.t();
                                                                                    arrayList3 = null;
                                                                                    while (r5.hasNext()) {
                                                                                        str3 = rt2Var3.b.J;
                                                                                        if (TextUtils.isEmpty(str3)) {
                                                                                            zEquals2 = false;
                                                                                        } else {
                                                                                            zEquals2 = v69VarC2.equals(w69VarE.c(Uri.parse(str3), new kn3(w69VarE, 1)));
                                                                                        }
                                                                                        if (!zEquals2) {
                                                                                            if (arrayList3 == null) {
                                                                                                arrayList3 = new ArrayList();
                                                                                            }
                                                                                            arrayList3.add(rt2Var3);
                                                                                        }
                                                                                    }
                                                                                    if (arrayList3 == null) {
                                                                                        arrayList3 = Collections.EMPTY_LIST;
                                                                                    }
                                                                                    if (arrayList3.isEmpty()) {
                                                                                        o69Var = new m69(0L, 0L, 0L, 0L);
                                                                                    } else {
                                                                                        rt2Var2 = (rt2) arrayList3.get(0);
                                                                                        if (ch3.r(str2)) {
                                                                                            u69VarA = u69.a(rt2Var2.a);
                                                                                        } else {
                                                                                            u69VarA = u69.a(rt2Var2.a);
                                                                                        }
                                                                                    }
                                                                                } else {
                                                                                    v69VarC2 = w69VarE.c(Uri.parse(strReplace), new kn3(w69VarE, 1));
                                                                                    qw2Var.t();
                                                                                    arrayList3 = null;
                                                                                    while (r5.hasNext()) {
                                                                                        str3 = rt2Var3.b.J;
                                                                                        if (TextUtils.isEmpty(str3)) {
                                                                                            zEquals2 = false;
                                                                                        } else {
                                                                                            zEquals2 = v69VarC2.equals(w69VarE.c(Uri.parse(str3), new kn3(w69VarE, 1)));
                                                                                        }
                                                                                        if (!zEquals2) {
                                                                                            if (arrayList3 == null) {
                                                                                                arrayList3 = new ArrayList();
                                                                                            }
                                                                                            arrayList3.add(rt2Var3);
                                                                                        }
                                                                                    }
                                                                                    if (arrayList3 == null) {
                                                                                        arrayList3 = Collections.EMPTY_LIST;
                                                                                    }
                                                                                    if (arrayList3.isEmpty()) {
                                                                                        o69Var = new m69(0L, 0L, 0L, 0L);
                                                                                    } else {
                                                                                        rt2Var2 = (rt2) arrayList3.get(0);
                                                                                        if (ch3.r(str2)) {
                                                                                            u69VarA = u69.a(rt2Var2.a);
                                                                                        } else {
                                                                                            u69VarA = u69.a(rt2Var2.a);
                                                                                        }
                                                                                    }
                                                                                }
                                                                            } else {
                                                                                str2 = null;
                                                                                strReplace = string;
                                                                                if (pathSegments2 == null) {
                                                                                    if (pathSegments2 == null) {
                                                                                        v69VarC2 = w69VarE.c(Uri.parse(strReplace), new kn3(w69VarE, 1));
                                                                                        qw2Var.t();
                                                                                        arrayList3 = null;
                                                                                        while (r5.hasNext()) {
                                                                                            str3 = rt2Var3.b.J;
                                                                                            if (TextUtils.isEmpty(str3)) {
                                                                                                zEquals2 = false;
                                                                                            } else {
                                                                                                zEquals2 = v69VarC2.equals(w69VarE.c(Uri.parse(str3), new kn3(w69VarE, 1)));
                                                                                            }
                                                                                            if (!zEquals2) {
                                                                                                if (arrayList3 == null) {
                                                                                                    arrayList3 = new ArrayList();
                                                                                                }
                                                                                                arrayList3.add(rt2Var3);
                                                                                            }
                                                                                        }
                                                                                        if (arrayList3 == null) {
                                                                                            arrayList3 = Collections.EMPTY_LIST;
                                                                                        }
                                                                                        if (arrayList3.isEmpty()) {
                                                                                            o69Var = new m69(0L, 0L, 0L, 0L);
                                                                                        } else {
                                                                                            rt2Var2 = (rt2) arrayList3.get(0);
                                                                                            if (ch3.r(str2)) {
                                                                                                u69VarA = u69.a(rt2Var2.a);
                                                                                            } else {
                                                                                                u69VarA = u69.a(rt2Var2.a);
                                                                                            }
                                                                                        }
                                                                                    } else {
                                                                                        v69VarC2 = w69VarE.c(Uri.parse(strReplace), new kn3(w69VarE, 1));
                                                                                        qw2Var.t();
                                                                                        arrayList3 = null;
                                                                                        while (r5.hasNext()) {
                                                                                            str3 = rt2Var3.b.J;
                                                                                            if (TextUtils.isEmpty(str3)) {
                                                                                                zEquals2 = false;
                                                                                            } else {
                                                                                                zEquals2 = v69VarC2.equals(w69VarE.c(Uri.parse(str3), new kn3(w69VarE, 1)));
                                                                                            }
                                                                                            if (!zEquals2) {
                                                                                                if (arrayList3 == null) {
                                                                                                    arrayList3 = new ArrayList();
                                                                                                }
                                                                                                arrayList3.add(rt2Var3);
                                                                                            }
                                                                                        }
                                                                                        if (arrayList3 == null) {
                                                                                            arrayList3 = Collections.EMPTY_LIST;
                                                                                        }
                                                                                        if (arrayList3.isEmpty()) {
                                                                                            o69Var = new m69(0L, 0L, 0L, 0L);
                                                                                        } else {
                                                                                            rt2Var2 = (rt2) arrayList3.get(0);
                                                                                            if (ch3.r(str2)) {
                                                                                                u69VarA = u69.a(rt2Var2.a);
                                                                                            } else {
                                                                                                u69VarA = u69.a(rt2Var2.a);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                } else if (pathSegments2 == null) {
                                                                                    v69VarC2 = w69VarE.c(Uri.parse(strReplace), new kn3(w69VarE, 1));
                                                                                    qw2Var.t();
                                                                                    arrayList3 = null;
                                                                                    while (r5.hasNext()) {
                                                                                        str3 = rt2Var3.b.J;
                                                                                        if (TextUtils.isEmpty(str3)) {
                                                                                            zEquals2 = false;
                                                                                        } else {
                                                                                            zEquals2 = v69VarC2.equals(w69VarE.c(Uri.parse(str3), new kn3(w69VarE, 1)));
                                                                                        }
                                                                                        if (!zEquals2) {
                                                                                            if (arrayList3 == null) {
                                                                                                arrayList3 = new ArrayList();
                                                                                            }
                                                                                            arrayList3.add(rt2Var3);
                                                                                        }
                                                                                    }
                                                                                    if (arrayList3 == null) {
                                                                                        arrayList3 = Collections.EMPTY_LIST;
                                                                                    }
                                                                                    if (arrayList3.isEmpty()) {
                                                                                        o69Var = new m69(0L, 0L, 0L, 0L);
                                                                                    } else {
                                                                                        rt2Var2 = (rt2) arrayList3.get(0);
                                                                                        if (ch3.r(str2)) {
                                                                                            u69VarA = u69.a(rt2Var2.a);
                                                                                        } else {
                                                                                            u69VarA = u69.a(rt2Var2.a);
                                                                                        }
                                                                                    }
                                                                                } else {
                                                                                    v69VarC2 = w69VarE.c(Uri.parse(strReplace), new kn3(w69VarE, 1));
                                                                                    qw2Var.t();
                                                                                    arrayList3 = null;
                                                                                    while (r5.hasNext()) {
                                                                                        str3 = rt2Var3.b.J;
                                                                                        if (TextUtils.isEmpty(str3)) {
                                                                                            zEquals2 = false;
                                                                                        } else {
                                                                                            zEquals2 = v69VarC2.equals(w69VarE.c(Uri.parse(str3), new kn3(w69VarE, 1)));
                                                                                        }
                                                                                        if (!zEquals2) {
                                                                                            if (arrayList3 == null) {
                                                                                                arrayList3 = new ArrayList();
                                                                                            }
                                                                                            arrayList3.add(rt2Var3);
                                                                                        }
                                                                                    }
                                                                                    if (arrayList3 == null) {
                                                                                        arrayList3 = Collections.EMPTY_LIST;
                                                                                    }
                                                                                    if (arrayList3.isEmpty()) {
                                                                                        o69Var = new m69(0L, 0L, 0L, 0L);
                                                                                    } else {
                                                                                        rt2Var2 = (rt2) arrayList3.get(0);
                                                                                        if (ch3.r(str2)) {
                                                                                            u69VarA = u69.a(rt2Var2.a);
                                                                                        } else {
                                                                                            u69VarA = u69.a(rt2Var2.a);
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        } else if (pathSegments2 == null) {
                                                                            str2 = null;
                                                                            strReplace = string;
                                                                            if (pathSegments2 == null) {
                                                                                if (pathSegments2 == null) {
                                                                                    v69VarC2 = w69VarE.c(Uri.parse(strReplace), new kn3(w69VarE, 1));
                                                                                    qw2Var.t();
                                                                                    arrayList3 = null;
                                                                                    while (r5.hasNext()) {
                                                                                        str3 = rt2Var3.b.J;
                                                                                        if (TextUtils.isEmpty(str3)) {
                                                                                            zEquals2 = false;
                                                                                        } else {
                                                                                            zEquals2 = v69VarC2.equals(w69VarE.c(Uri.parse(str3), new kn3(w69VarE, 1)));
                                                                                        }
                                                                                        if (!zEquals2) {
                                                                                            if (arrayList3 == null) {
                                                                                                arrayList3 = new ArrayList();
                                                                                            }
                                                                                            arrayList3.add(rt2Var3);
                                                                                        }
                                                                                    }
                                                                                    if (arrayList3 == null) {
                                                                                        arrayList3 = Collections.EMPTY_LIST;
                                                                                    }
                                                                                    if (arrayList3.isEmpty()) {
                                                                                        o69Var = new m69(0L, 0L, 0L, 0L);
                                                                                    } else {
                                                                                        rt2Var2 = (rt2) arrayList3.get(0);
                                                                                        if (ch3.r(str2)) {
                                                                                            u69VarA = u69.a(rt2Var2.a);
                                                                                        } else {
                                                                                            u69VarA = u69.a(rt2Var2.a);
                                                                                        }
                                                                                    }
                                                                                } else {
                                                                                    v69VarC2 = w69VarE.c(Uri.parse(strReplace), new kn3(w69VarE, 1));
                                                                                    qw2Var.t();
                                                                                    arrayList3 = null;
                                                                                    while (r5.hasNext()) {
                                                                                        str3 = rt2Var3.b.J;
                                                                                        if (TextUtils.isEmpty(str3)) {
                                                                                            zEquals2 = false;
                                                                                        } else {
                                                                                            zEquals2 = v69VarC2.equals(w69VarE.c(Uri.parse(str3), new kn3(w69VarE, 1)));
                                                                                        }
                                                                                        if (!zEquals2) {
                                                                                            if (arrayList3 == null) {
                                                                                                arrayList3 = new ArrayList();
                                                                                            }
                                                                                            arrayList3.add(rt2Var3);
                                                                                        }
                                                                                    }
                                                                                    if (arrayList3 == null) {
                                                                                        arrayList3 = Collections.EMPTY_LIST;
                                                                                    }
                                                                                    if (arrayList3.isEmpty()) {
                                                                                        o69Var = new m69(0L, 0L, 0L, 0L);
                                                                                    } else {
                                                                                        rt2Var2 = (rt2) arrayList3.get(0);
                                                                                        if (ch3.r(str2)) {
                                                                                            u69VarA = u69.a(rt2Var2.a);
                                                                                        } else {
                                                                                            u69VarA = u69.a(rt2Var2.a);
                                                                                        }
                                                                                    }
                                                                                }
                                                                            } else if (pathSegments2 == null) {
                                                                                v69VarC2 = w69VarE.c(Uri.parse(strReplace), new kn3(w69VarE, 1));
                                                                                qw2Var.t();
                                                                                arrayList3 = null;
                                                                                while (r5.hasNext()) {
                                                                                    str3 = rt2Var3.b.J;
                                                                                    if (TextUtils.isEmpty(str3)) {
                                                                                        zEquals2 = false;
                                                                                    } else {
                                                                                        zEquals2 = v69VarC2.equals(w69VarE.c(Uri.parse(str3), new kn3(w69VarE, 1)));
                                                                                    }
                                                                                    if (!zEquals2) {
                                                                                        if (arrayList3 == null) {
                                                                                            arrayList3 = new ArrayList();
                                                                                        }
                                                                                        arrayList3.add(rt2Var3);
                                                                                    }
                                                                                }
                                                                                if (arrayList3 == null) {
                                                                                    arrayList3 = Collections.EMPTY_LIST;
                                                                                }
                                                                                if (arrayList3.isEmpty()) {
                                                                                    o69Var = new m69(0L, 0L, 0L, 0L);
                                                                                } else {
                                                                                    rt2Var2 = (rt2) arrayList3.get(0);
                                                                                    if (ch3.r(str2)) {
                                                                                        u69VarA = u69.a(rt2Var2.a);
                                                                                    } else {
                                                                                        u69VarA = u69.a(rt2Var2.a);
                                                                                    }
                                                                                }
                                                                            } else {
                                                                                v69VarC2 = w69VarE.c(Uri.parse(strReplace), new kn3(w69VarE, 1));
                                                                                qw2Var.t();
                                                                                arrayList3 = null;
                                                                                while (r5.hasNext()) {
                                                                                    str3 = rt2Var3.b.J;
                                                                                    if (TextUtils.isEmpty(str3)) {
                                                                                        zEquals2 = false;
                                                                                    } else {
                                                                                        zEquals2 = v69VarC2.equals(w69VarE.c(Uri.parse(str3), new kn3(w69VarE, 1)));
                                                                                    }
                                                                                    if (!zEquals2) {
                                                                                        if (arrayList3 == null) {
                                                                                            arrayList3 = new ArrayList();
                                                                                        }
                                                                                        arrayList3.add(rt2Var3);
                                                                                    }
                                                                                }
                                                                                if (arrayList3 == null) {
                                                                                    arrayList3 = Collections.EMPTY_LIST;
                                                                                }
                                                                                if (arrayList3.isEmpty()) {
                                                                                    o69Var = new m69(0L, 0L, 0L, 0L);
                                                                                } else {
                                                                                    rt2Var2 = (rt2) arrayList3.get(0);
                                                                                    if (ch3.r(str2)) {
                                                                                        u69VarA = u69.a(rt2Var2.a);
                                                                                    } else {
                                                                                        u69VarA = u69.a(rt2Var2.a);
                                                                                    }
                                                                                }
                                                                            }
                                                                        } else {
                                                                            str2 = null;
                                                                            strReplace = string;
                                                                            if (pathSegments2 == null) {
                                                                                if (pathSegments2 == null) {
                                                                                    v69VarC2 = w69VarE.c(Uri.parse(strReplace), new kn3(w69VarE, 1));
                                                                                    qw2Var.t();
                                                                                    arrayList3 = null;
                                                                                    while (r5.hasNext()) {
                                                                                        str3 = rt2Var3.b.J;
                                                                                        if (TextUtils.isEmpty(str3)) {
                                                                                            zEquals2 = false;
                                                                                        } else {
                                                                                            zEquals2 = v69VarC2.equals(w69VarE.c(Uri.parse(str3), new kn3(w69VarE, 1)));
                                                                                        }
                                                                                        if (!zEquals2) {
                                                                                            if (arrayList3 == null) {
                                                                                                arrayList3 = new ArrayList();
                                                                                            }
                                                                                            arrayList3.add(rt2Var3);
                                                                                        }
                                                                                    }
                                                                                    if (arrayList3 == null) {
                                                                                        arrayList3 = Collections.EMPTY_LIST;
                                                                                    }
                                                                                    if (arrayList3.isEmpty()) {
                                                                                        o69Var = new m69(0L, 0L, 0L, 0L);
                                                                                    } else {
                                                                                        rt2Var2 = (rt2) arrayList3.get(0);
                                                                                        if (ch3.r(str2)) {
                                                                                            u69VarA = u69.a(rt2Var2.a);
                                                                                        } else {
                                                                                            u69VarA = u69.a(rt2Var2.a);
                                                                                        }
                                                                                    }
                                                                                } else {
                                                                                    v69VarC2 = w69VarE.c(Uri.parse(strReplace), new kn3(w69VarE, 1));
                                                                                    qw2Var.t();
                                                                                    arrayList3 = null;
                                                                                    while (r5.hasNext()) {
                                                                                        str3 = rt2Var3.b.J;
                                                                                        if (TextUtils.isEmpty(str3)) {
                                                                                            zEquals2 = false;
                                                                                        } else {
                                                                                            zEquals2 = v69VarC2.equals(w69VarE.c(Uri.parse(str3), new kn3(w69VarE, 1)));
                                                                                        }
                                                                                        if (!zEquals2) {
                                                                                            if (arrayList3 == null) {
                                                                                                arrayList3 = new ArrayList();
                                                                                            }
                                                                                            arrayList3.add(rt2Var3);
                                                                                        }
                                                                                    }
                                                                                    if (arrayList3 == null) {
                                                                                        arrayList3 = Collections.EMPTY_LIST;
                                                                                    }
                                                                                    if (arrayList3.isEmpty()) {
                                                                                        o69Var = new m69(0L, 0L, 0L, 0L);
                                                                                    } else {
                                                                                        rt2Var2 = (rt2) arrayList3.get(0);
                                                                                        if (ch3.r(str2)) {
                                                                                            u69VarA = u69.a(rt2Var2.a);
                                                                                        } else {
                                                                                            u69VarA = u69.a(rt2Var2.a);
                                                                                        }
                                                                                    }
                                                                                }
                                                                            } else if (pathSegments2 == null) {
                                                                                v69VarC2 = w69VarE.c(Uri.parse(strReplace), new kn3(w69VarE, 1));
                                                                                qw2Var.t();
                                                                                arrayList3 = null;
                                                                                while (r5.hasNext()) {
                                                                                    str3 = rt2Var3.b.J;
                                                                                    if (TextUtils.isEmpty(str3)) {
                                                                                        zEquals2 = false;
                                                                                    } else {
                                                                                        zEquals2 = v69VarC2.equals(w69VarE.c(Uri.parse(str3), new kn3(w69VarE, 1)));
                                                                                    }
                                                                                    if (!zEquals2) {
                                                                                        if (arrayList3 == null) {
                                                                                            arrayList3 = new ArrayList();
                                                                                        }
                                                                                        arrayList3.add(rt2Var3);
                                                                                    }
                                                                                }
                                                                                if (arrayList3 == null) {
                                                                                    arrayList3 = Collections.EMPTY_LIST;
                                                                                }
                                                                                if (arrayList3.isEmpty()) {
                                                                                    o69Var = new m69(0L, 0L, 0L, 0L);
                                                                                } else {
                                                                                    rt2Var2 = (rt2) arrayList3.get(0);
                                                                                    if (ch3.r(str2)) {
                                                                                        u69VarA = u69.a(rt2Var2.a);
                                                                                    } else {
                                                                                        u69VarA = u69.a(rt2Var2.a);
                                                                                    }
                                                                                }
                                                                            } else {
                                                                                v69VarC2 = w69VarE.c(Uri.parse(strReplace), new kn3(w69VarE, 1));
                                                                                qw2Var.t();
                                                                                arrayList3 = null;
                                                                                while (r5.hasNext()) {
                                                                                    str3 = rt2Var3.b.J;
                                                                                    if (TextUtils.isEmpty(str3)) {
                                                                                        zEquals2 = false;
                                                                                    } else {
                                                                                        zEquals2 = v69VarC2.equals(w69VarE.c(Uri.parse(str3), new kn3(w69VarE, 1)));
                                                                                    }
                                                                                    if (!zEquals2) {
                                                                                        if (arrayList3 == null) {
                                                                                            arrayList3 = new ArrayList();
                                                                                        }
                                                                                        arrayList3.add(rt2Var3);
                                                                                    }
                                                                                }
                                                                                if (arrayList3 == null) {
                                                                                    arrayList3 = Collections.EMPTY_LIST;
                                                                                }
                                                                                if (arrayList3.isEmpty()) {
                                                                                    o69Var = new m69(0L, 0L, 0L, 0L);
                                                                                } else {
                                                                                    rt2Var2 = (rt2) arrayList3.get(0);
                                                                                    if (ch3.r(str2)) {
                                                                                        u69VarA = u69.a(rt2Var2.a);
                                                                                    } else {
                                                                                        u69VarA = u69.a(rt2Var2.a);
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                        return obj;
                                                                    }
                                                                    o69Var = new u69(0L, 0L, 0L, jE);
                                                                } else {
                                                                    u69VarA = u69.b(((vg4) list.get(0)).v());
                                                                }
                                                                r69Var = u69VarA;
                                                            }
                                                        } else if (Objects.equals(uri4.getHost(), "max.ru")) {
                                                            queryParameter = uri4.getQueryParameter("uid");
                                                            if (TextUtils.isEmpty(queryParameter)) {
                                                                j = Long.parseLong(queryParameter);
                                                                if (j == -1) {
                                                                }
                                                            } else {
                                                                k39Var = k39Var;
                                                            }
                                                            queryParameter2 = uri4.getQueryParameter("cid");
                                                            if (!TextUtils.isEmpty(queryParameter2)) {
                                                                j2 = Long.parseLong(queryParameter2);
                                                                if (j2 != 0) {
                                                                    rt2VarK = qw2Var.K(j2);
                                                                    if (rt2VarK == null) {
                                                                        concurrentHashMap = qw2Var.f;
                                                                        rt2Var = (rt2) concurrentHashMap.get(Long.valueOf(j2));
                                                                        if (rt2Var != null) {
                                                                            rt2VarK = rt2Var;
                                                                        } else {
                                                                            qw2Var.t();
                                                                            rt2VarK = (rt2) concurrentHashMap.get(Long.valueOf(j2));
                                                                        }
                                                                    }
                                                                    if (rt2VarK != null) {
                                                                        u69VarB = u69.a(rt2VarK.a);
                                                                        r69Var = u69VarB;
                                                                        k39Var = k39Var;
                                                                    }
                                                                }
                                                            }
                                                            string = uri4.toString();
                                                            if (pathSegments2 == null) {
                                                            }
                                                            v69VarC = w69VarE.c(uri4, new kn3(w69VarE, 2));
                                                            if (TextUtils.isEmpty(null)) {
                                                                list = Collections.EMPTY_LIST;
                                                                k39Var = k39Var;
                                                            } else {
                                                                it = bi4Var.b.values().iterator();
                                                                arrayList = null;
                                                                while (it.hasNext()) {
                                                                    vg4Var = (vg4) it.next();
                                                                    Iterator it5 = it;
                                                                    str = vg4Var.a.b.o;
                                                                    if (TextUtils.isEmpty(str)) {
                                                                        zEquals = v69VarC.equals(w69VarE.c(Uri.parse(str), new kn3(w69VarE, 2)));
                                                                    } else {
                                                                        zEquals = false;
                                                                    }
                                                                    if (zEquals) {
                                                                        if (arrayList == 0) {
                                                                            arrayList = new ArrayList();
                                                                        } else {
                                                                            arrayList = arrayList;
                                                                        }
                                                                        arrayList.add(vg4Var);
                                                                    } else {
                                                                        arrayList = arrayList;
                                                                    }
                                                                    it = it5;
                                                                    k39Var = k39Var;
                                                                }
                                                                arrayList2 = arrayList;
                                                                k39Var = k39Var;
                                                                if (arrayList2 == null) {
                                                                    list = Collections.EMPTY_LIST;
                                                                } else {
                                                                    list = arrayList2;
                                                                }
                                                            }
                                                            if (list.isEmpty()) {
                                                                u69VarA = u69.b(((vg4) list.get(0)).v());
                                                            } else {
                                                                jE = w69.e(string);
                                                                if (jE > 0) {
                                                                    if (pathSegments2 != null) {
                                                                        if (pathSegments2 == null) {
                                                                            str2 = null;
                                                                            strReplace = string;
                                                                            if (pathSegments2 == null) {
                                                                                if (pathSegments2 == null) {
                                                                                    v69VarC2 = w69VarE.c(Uri.parse(strReplace), new kn3(w69VarE, 1));
                                                                                    qw2Var.t();
                                                                                    arrayList3 = null;
                                                                                    while (r5.hasNext()) {
                                                                                        str3 = rt2Var3.b.J;
                                                                                        if (TextUtils.isEmpty(str3)) {
                                                                                            zEquals2 = false;
                                                                                        } else {
                                                                                            zEquals2 = v69VarC2.equals(w69VarE.c(Uri.parse(str3), new kn3(w69VarE, 1)));
                                                                                        }
                                                                                        if (!zEquals2) {
                                                                                            if (arrayList3 == null) {
                                                                                                arrayList3 = new ArrayList();
                                                                                            }
                                                                                            arrayList3.add(rt2Var3);
                                                                                        }
                                                                                    }
                                                                                    if (arrayList3 == null) {
                                                                                        arrayList3 = Collections.EMPTY_LIST;
                                                                                    }
                                                                                    if (arrayList3.isEmpty()) {
                                                                                        o69Var = new m69(0L, 0L, 0L, 0L);
                                                                                    } else {
                                                                                        rt2Var2 = (rt2) arrayList3.get(0);
                                                                                        if (ch3.r(str2)) {
                                                                                            u69VarA = u69.a(rt2Var2.a);
                                                                                        } else {
                                                                                            u69VarA = u69.a(rt2Var2.a);
                                                                                        }
                                                                                    }
                                                                                } else {
                                                                                    v69VarC2 = w69VarE.c(Uri.parse(strReplace), new kn3(w69VarE, 1));
                                                                                    qw2Var.t();
                                                                                    arrayList3 = null;
                                                                                    while (r5.hasNext()) {
                                                                                        str3 = rt2Var3.b.J;
                                                                                        if (TextUtils.isEmpty(str3)) {
                                                                                            zEquals2 = false;
                                                                                        } else {
                                                                                            zEquals2 = v69VarC2.equals(w69VarE.c(Uri.parse(str3), new kn3(w69VarE, 1)));
                                                                                        }
                                                                                        if (!zEquals2) {
                                                                                            if (arrayList3 == null) {
                                                                                                arrayList3 = new ArrayList();
                                                                                            }
                                                                                            arrayList3.add(rt2Var3);
                                                                                        }
                                                                                    }
                                                                                    if (arrayList3 == null) {
                                                                                        arrayList3 = Collections.EMPTY_LIST;
                                                                                    }
                                                                                    if (arrayList3.isEmpty()) {
                                                                                        o69Var = new m69(0L, 0L, 0L, 0L);
                                                                                    } else {
                                                                                        rt2Var2 = (rt2) arrayList3.get(0);
                                                                                        if (ch3.r(str2)) {
                                                                                            u69VarA = u69.a(rt2Var2.a);
                                                                                        } else {
                                                                                            u69VarA = u69.a(rt2Var2.a);
                                                                                        }
                                                                                    }
                                                                                }
                                                                            } else if (pathSegments2 == null) {
                                                                                v69VarC2 = w69VarE.c(Uri.parse(strReplace), new kn3(w69VarE, 1));
                                                                                qw2Var.t();
                                                                                arrayList3 = null;
                                                                                while (r5.hasNext()) {
                                                                                    str3 = rt2Var3.b.J;
                                                                                    if (TextUtils.isEmpty(str3)) {
                                                                                        zEquals2 = false;
                                                                                    } else {
                                                                                        zEquals2 = v69VarC2.equals(w69VarE.c(Uri.parse(str3), new kn3(w69VarE, 1)));
                                                                                    }
                                                                                    if (!zEquals2) {
                                                                                        if (arrayList3 == null) {
                                                                                            arrayList3 = new ArrayList();
                                                                                        }
                                                                                        arrayList3.add(rt2Var3);
                                                                                    }
                                                                                }
                                                                                if (arrayList3 == null) {
                                                                                    arrayList3 = Collections.EMPTY_LIST;
                                                                                }
                                                                                if (arrayList3.isEmpty()) {
                                                                                    o69Var = new m69(0L, 0L, 0L, 0L);
                                                                                } else {
                                                                                    rt2Var2 = (rt2) arrayList3.get(0);
                                                                                    if (ch3.r(str2)) {
                                                                                        u69VarA = u69.a(rt2Var2.a);
                                                                                    } else {
                                                                                        u69VarA = u69.a(rt2Var2.a);
                                                                                    }
                                                                                }
                                                                            } else {
                                                                                v69VarC2 = w69VarE.c(Uri.parse(strReplace), new kn3(w69VarE, 1));
                                                                                qw2Var.t();
                                                                                arrayList3 = null;
                                                                                while (r5.hasNext()) {
                                                                                    str3 = rt2Var3.b.J;
                                                                                    if (TextUtils.isEmpty(str3)) {
                                                                                        zEquals2 = false;
                                                                                    } else {
                                                                                        zEquals2 = v69VarC2.equals(w69VarE.c(Uri.parse(str3), new kn3(w69VarE, 1)));
                                                                                    }
                                                                                    if (!zEquals2) {
                                                                                        if (arrayList3 == null) {
                                                                                            arrayList3 = new ArrayList();
                                                                                        }
                                                                                        arrayList3.add(rt2Var3);
                                                                                    }
                                                                                }
                                                                                if (arrayList3 == null) {
                                                                                    arrayList3 = Collections.EMPTY_LIST;
                                                                                }
                                                                                if (arrayList3.isEmpty()) {
                                                                                    o69Var = new m69(0L, 0L, 0L, 0L);
                                                                                } else {
                                                                                    rt2Var2 = (rt2) arrayList3.get(0);
                                                                                    if (ch3.r(str2)) {
                                                                                        u69VarA = u69.a(rt2Var2.a);
                                                                                    } else {
                                                                                        u69VarA = u69.a(rt2Var2.a);
                                                                                    }
                                                                                }
                                                                            }
                                                                        } else {
                                                                            str2 = null;
                                                                            strReplace = string;
                                                                            if (pathSegments2 == null) {
                                                                                if (pathSegments2 == null) {
                                                                                    v69VarC2 = w69VarE.c(Uri.parse(strReplace), new kn3(w69VarE, 1));
                                                                                    qw2Var.t();
                                                                                    arrayList3 = null;
                                                                                    while (r5.hasNext()) {
                                                                                        str3 = rt2Var3.b.J;
                                                                                        if (TextUtils.isEmpty(str3)) {
                                                                                            zEquals2 = false;
                                                                                        } else {
                                                                                            zEquals2 = v69VarC2.equals(w69VarE.c(Uri.parse(str3), new kn3(w69VarE, 1)));
                                                                                        }
                                                                                        if (!zEquals2) {
                                                                                            if (arrayList3 == null) {
                                                                                                arrayList3 = new ArrayList();
                                                                                            }
                                                                                            arrayList3.add(rt2Var3);
                                                                                        }
                                                                                    }
                                                                                    if (arrayList3 == null) {
                                                                                        arrayList3 = Collections.EMPTY_LIST;
                                                                                    }
                                                                                    if (arrayList3.isEmpty()) {
                                                                                        o69Var = new m69(0L, 0L, 0L, 0L);
                                                                                    } else {
                                                                                        rt2Var2 = (rt2) arrayList3.get(0);
                                                                                        if (ch3.r(str2)) {
                                                                                            u69VarA = u69.a(rt2Var2.a);
                                                                                        } else {
                                                                                            u69VarA = u69.a(rt2Var2.a);
                                                                                        }
                                                                                    }
                                                                                } else {
                                                                                    v69VarC2 = w69VarE.c(Uri.parse(strReplace), new kn3(w69VarE, 1));
                                                                                    qw2Var.t();
                                                                                    arrayList3 = null;
                                                                                    while (r5.hasNext()) {
                                                                                        str3 = rt2Var3.b.J;
                                                                                        if (TextUtils.isEmpty(str3)) {
                                                                                            zEquals2 = false;
                                                                                        } else {
                                                                                            zEquals2 = v69VarC2.equals(w69VarE.c(Uri.parse(str3), new kn3(w69VarE, 1)));
                                                                                        }
                                                                                        if (!zEquals2) {
                                                                                            if (arrayList3 == null) {
                                                                                                arrayList3 = new ArrayList();
                                                                                            }
                                                                                            arrayList3.add(rt2Var3);
                                                                                        }
                                                                                    }
                                                                                    if (arrayList3 == null) {
                                                                                        arrayList3 = Collections.EMPTY_LIST;
                                                                                    }
                                                                                    if (arrayList3.isEmpty()) {
                                                                                        o69Var = new m69(0L, 0L, 0L, 0L);
                                                                                    } else {
                                                                                        rt2Var2 = (rt2) arrayList3.get(0);
                                                                                        if (ch3.r(str2)) {
                                                                                            u69VarA = u69.a(rt2Var2.a);
                                                                                        } else {
                                                                                            u69VarA = u69.a(rt2Var2.a);
                                                                                        }
                                                                                    }
                                                                                }
                                                                            } else if (pathSegments2 == null) {
                                                                                v69VarC2 = w69VarE.c(Uri.parse(strReplace), new kn3(w69VarE, 1));
                                                                                qw2Var.t();
                                                                                arrayList3 = null;
                                                                                while (r5.hasNext()) {
                                                                                    str3 = rt2Var3.b.J;
                                                                                    if (TextUtils.isEmpty(str3)) {
                                                                                        zEquals2 = false;
                                                                                    } else {
                                                                                        zEquals2 = v69VarC2.equals(w69VarE.c(Uri.parse(str3), new kn3(w69VarE, 1)));
                                                                                    }
                                                                                    if (!zEquals2) {
                                                                                        if (arrayList3 == null) {
                                                                                            arrayList3 = new ArrayList();
                                                                                        }
                                                                                        arrayList3.add(rt2Var3);
                                                                                    }
                                                                                }
                                                                                if (arrayList3 == null) {
                                                                                    arrayList3 = Collections.EMPTY_LIST;
                                                                                }
                                                                                if (arrayList3.isEmpty()) {
                                                                                    o69Var = new m69(0L, 0L, 0L, 0L);
                                                                                } else {
                                                                                    rt2Var2 = (rt2) arrayList3.get(0);
                                                                                    if (ch3.r(str2)) {
                                                                                        u69VarA = u69.a(rt2Var2.a);
                                                                                    } else {
                                                                                        u69VarA = u69.a(rt2Var2.a);
                                                                                    }
                                                                                }
                                                                            } else {
                                                                                v69VarC2 = w69VarE.c(Uri.parse(strReplace), new kn3(w69VarE, 1));
                                                                                qw2Var.t();
                                                                                arrayList3 = null;
                                                                                while (r5.hasNext()) {
                                                                                    str3 = rt2Var3.b.J;
                                                                                    if (TextUtils.isEmpty(str3)) {
                                                                                        zEquals2 = false;
                                                                                    } else {
                                                                                        zEquals2 = v69VarC2.equals(w69VarE.c(Uri.parse(str3), new kn3(w69VarE, 1)));
                                                                                    }
                                                                                    if (!zEquals2) {
                                                                                        if (arrayList3 == null) {
                                                                                            arrayList3 = new ArrayList();
                                                                                        }
                                                                                        arrayList3.add(rt2Var3);
                                                                                    }
                                                                                }
                                                                                if (arrayList3 == null) {
                                                                                    arrayList3 = Collections.EMPTY_LIST;
                                                                                }
                                                                                if (arrayList3.isEmpty()) {
                                                                                    o69Var = new m69(0L, 0L, 0L, 0L);
                                                                                } else {
                                                                                    rt2Var2 = (rt2) arrayList3.get(0);
                                                                                    if (ch3.r(str2)) {
                                                                                        u69VarA = u69.a(rt2Var2.a);
                                                                                    } else {
                                                                                        u69VarA = u69.a(rt2Var2.a);
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    } else if (pathSegments2 == null) {
                                                                        str2 = null;
                                                                        strReplace = string;
                                                                        if (pathSegments2 == null) {
                                                                            if (pathSegments2 == null) {
                                                                                v69VarC2 = w69VarE.c(Uri.parse(strReplace), new kn3(w69VarE, 1));
                                                                                qw2Var.t();
                                                                                arrayList3 = null;
                                                                                while (r5.hasNext()) {
                                                                                    str3 = rt2Var3.b.J;
                                                                                    if (TextUtils.isEmpty(str3)) {
                                                                                        zEquals2 = false;
                                                                                    } else {
                                                                                        zEquals2 = v69VarC2.equals(w69VarE.c(Uri.parse(str3), new kn3(w69VarE, 1)));
                                                                                    }
                                                                                    if (!zEquals2) {
                                                                                        if (arrayList3 == null) {
                                                                                            arrayList3 = new ArrayList();
                                                                                        }
                                                                                        arrayList3.add(rt2Var3);
                                                                                    }
                                                                                }
                                                                                if (arrayList3 == null) {
                                                                                    arrayList3 = Collections.EMPTY_LIST;
                                                                                }
                                                                                if (arrayList3.isEmpty()) {
                                                                                    o69Var = new m69(0L, 0L, 0L, 0L);
                                                                                } else {
                                                                                    rt2Var2 = (rt2) arrayList3.get(0);
                                                                                    if (ch3.r(str2)) {
                                                                                        u69VarA = u69.a(rt2Var2.a);
                                                                                    } else {
                                                                                        u69VarA = u69.a(rt2Var2.a);
                                                                                    }
                                                                                }
                                                                            } else {
                                                                                v69VarC2 = w69VarE.c(Uri.parse(strReplace), new kn3(w69VarE, 1));
                                                                                qw2Var.t();
                                                                                arrayList3 = null;
                                                                                while (r5.hasNext()) {
                                                                                    str3 = rt2Var3.b.J;
                                                                                    if (TextUtils.isEmpty(str3)) {
                                                                                        zEquals2 = false;
                                                                                    } else {
                                                                                        zEquals2 = v69VarC2.equals(w69VarE.c(Uri.parse(str3), new kn3(w69VarE, 1)));
                                                                                    }
                                                                                    if (!zEquals2) {
                                                                                        if (arrayList3 == null) {
                                                                                            arrayList3 = new ArrayList();
                                                                                        }
                                                                                        arrayList3.add(rt2Var3);
                                                                                    }
                                                                                }
                                                                                if (arrayList3 == null) {
                                                                                    arrayList3 = Collections.EMPTY_LIST;
                                                                                }
                                                                                if (arrayList3.isEmpty()) {
                                                                                    o69Var = new m69(0L, 0L, 0L, 0L);
                                                                                } else {
                                                                                    rt2Var2 = (rt2) arrayList3.get(0);
                                                                                    if (ch3.r(str2)) {
                                                                                        u69VarA = u69.a(rt2Var2.a);
                                                                                    } else {
                                                                                        u69VarA = u69.a(rt2Var2.a);
                                                                                    }
                                                                                }
                                                                            }
                                                                        } else if (pathSegments2 == null) {
                                                                            v69VarC2 = w69VarE.c(Uri.parse(strReplace), new kn3(w69VarE, 1));
                                                                            qw2Var.t();
                                                                            arrayList3 = null;
                                                                            while (r5.hasNext()) {
                                                                                str3 = rt2Var3.b.J;
                                                                                if (TextUtils.isEmpty(str3)) {
                                                                                    zEquals2 = false;
                                                                                } else {
                                                                                    zEquals2 = v69VarC2.equals(w69VarE.c(Uri.parse(str3), new kn3(w69VarE, 1)));
                                                                                }
                                                                                if (!zEquals2) {
                                                                                    if (arrayList3 == null) {
                                                                                        arrayList3 = new ArrayList();
                                                                                    }
                                                                                    arrayList3.add(rt2Var3);
                                                                                }
                                                                            }
                                                                            if (arrayList3 == null) {
                                                                                arrayList3 = Collections.EMPTY_LIST;
                                                                            }
                                                                            if (arrayList3.isEmpty()) {
                                                                                o69Var = new m69(0L, 0L, 0L, 0L);
                                                                            } else {
                                                                                rt2Var2 = (rt2) arrayList3.get(0);
                                                                                if (ch3.r(str2)) {
                                                                                    u69VarA = u69.a(rt2Var2.a);
                                                                                } else {
                                                                                    u69VarA = u69.a(rt2Var2.a);
                                                                                }
                                                                            }
                                                                        } else {
                                                                            v69VarC2 = w69VarE.c(Uri.parse(strReplace), new kn3(w69VarE, 1));
                                                                            qw2Var.t();
                                                                            arrayList3 = null;
                                                                            while (r5.hasNext()) {
                                                                                str3 = rt2Var3.b.J;
                                                                                if (TextUtils.isEmpty(str3)) {
                                                                                    zEquals2 = false;
                                                                                } else {
                                                                                    zEquals2 = v69VarC2.equals(w69VarE.c(Uri.parse(str3), new kn3(w69VarE, 1)));
                                                                                }
                                                                                if (!zEquals2) {
                                                                                    if (arrayList3 == null) {
                                                                                        arrayList3 = new ArrayList();
                                                                                    }
                                                                                    arrayList3.add(rt2Var3);
                                                                                }
                                                                            }
                                                                            if (arrayList3 == null) {
                                                                                arrayList3 = Collections.EMPTY_LIST;
                                                                            }
                                                                            if (arrayList3.isEmpty()) {
                                                                                o69Var = new m69(0L, 0L, 0L, 0L);
                                                                            } else {
                                                                                rt2Var2 = (rt2) arrayList3.get(0);
                                                                                if (ch3.r(str2)) {
                                                                                    u69VarA = u69.a(rt2Var2.a);
                                                                                } else {
                                                                                    u69VarA = u69.a(rt2Var2.a);
                                                                                }
                                                                            }
                                                                        }
                                                                    } else {
                                                                        str2 = null;
                                                                        strReplace = string;
                                                                        if (pathSegments2 == null) {
                                                                            if (pathSegments2 == null) {
                                                                                v69VarC2 = w69VarE.c(Uri.parse(strReplace), new kn3(w69VarE, 1));
                                                                                qw2Var.t();
                                                                                arrayList3 = null;
                                                                                while (r5.hasNext()) {
                                                                                    str3 = rt2Var3.b.J;
                                                                                    if (TextUtils.isEmpty(str3)) {
                                                                                        zEquals2 = false;
                                                                                    } else {
                                                                                        zEquals2 = v69VarC2.equals(w69VarE.c(Uri.parse(str3), new kn3(w69VarE, 1)));
                                                                                    }
                                                                                    if (!zEquals2) {
                                                                                        if (arrayList3 == null) {
                                                                                            arrayList3 = new ArrayList();
                                                                                        }
                                                                                        arrayList3.add(rt2Var3);
                                                                                    }
                                                                                }
                                                                                if (arrayList3 == null) {
                                                                                    arrayList3 = Collections.EMPTY_LIST;
                                                                                }
                                                                                if (arrayList3.isEmpty()) {
                                                                                    o69Var = new m69(0L, 0L, 0L, 0L);
                                                                                } else {
                                                                                    rt2Var2 = (rt2) arrayList3.get(0);
                                                                                    if (ch3.r(str2)) {
                                                                                        u69VarA = u69.a(rt2Var2.a);
                                                                                    } else {
                                                                                        u69VarA = u69.a(rt2Var2.a);
                                                                                    }
                                                                                }
                                                                            } else {
                                                                                v69VarC2 = w69VarE.c(Uri.parse(strReplace), new kn3(w69VarE, 1));
                                                                                qw2Var.t();
                                                                                arrayList3 = null;
                                                                                while (r5.hasNext()) {
                                                                                    str3 = rt2Var3.b.J;
                                                                                    if (TextUtils.isEmpty(str3)) {
                                                                                        zEquals2 = false;
                                                                                    } else {
                                                                                        zEquals2 = v69VarC2.equals(w69VarE.c(Uri.parse(str3), new kn3(w69VarE, 1)));
                                                                                    }
                                                                                    if (!zEquals2) {
                                                                                        if (arrayList3 == null) {
                                                                                            arrayList3 = new ArrayList();
                                                                                        }
                                                                                        arrayList3.add(rt2Var3);
                                                                                    }
                                                                                }
                                                                                if (arrayList3 == null) {
                                                                                    arrayList3 = Collections.EMPTY_LIST;
                                                                                }
                                                                                if (arrayList3.isEmpty()) {
                                                                                    o69Var = new m69(0L, 0L, 0L, 0L);
                                                                                } else {
                                                                                    rt2Var2 = (rt2) arrayList3.get(0);
                                                                                    if (ch3.r(str2)) {
                                                                                        u69VarA = u69.a(rt2Var2.a);
                                                                                    } else {
                                                                                        u69VarA = u69.a(rt2Var2.a);
                                                                                    }
                                                                                }
                                                                            }
                                                                        } else if (pathSegments2 == null) {
                                                                            v69VarC2 = w69VarE.c(Uri.parse(strReplace), new kn3(w69VarE, 1));
                                                                            qw2Var.t();
                                                                            arrayList3 = null;
                                                                            while (r5.hasNext()) {
                                                                                str3 = rt2Var3.b.J;
                                                                                if (TextUtils.isEmpty(str3)) {
                                                                                    zEquals2 = false;
                                                                                } else {
                                                                                    zEquals2 = v69VarC2.equals(w69VarE.c(Uri.parse(str3), new kn3(w69VarE, 1)));
                                                                                }
                                                                                if (!zEquals2) {
                                                                                    if (arrayList3 == null) {
                                                                                        arrayList3 = new ArrayList();
                                                                                    }
                                                                                    arrayList3.add(rt2Var3);
                                                                                }
                                                                            }
                                                                            if (arrayList3 == null) {
                                                                                arrayList3 = Collections.EMPTY_LIST;
                                                                            }
                                                                            if (arrayList3.isEmpty()) {
                                                                                o69Var = new m69(0L, 0L, 0L, 0L);
                                                                            } else {
                                                                                rt2Var2 = (rt2) arrayList3.get(0);
                                                                                if (ch3.r(str2)) {
                                                                                    u69VarA = u69.a(rt2Var2.a);
                                                                                } else {
                                                                                    u69VarA = u69.a(rt2Var2.a);
                                                                                }
                                                                            }
                                                                        } else {
                                                                            v69VarC2 = w69VarE.c(Uri.parse(strReplace), new kn3(w69VarE, 1));
                                                                            qw2Var.t();
                                                                            arrayList3 = null;
                                                                            while (r5.hasNext()) {
                                                                                str3 = rt2Var3.b.J;
                                                                                if (TextUtils.isEmpty(str3)) {
                                                                                    zEquals2 = false;
                                                                                } else {
                                                                                    zEquals2 = v69VarC2.equals(w69VarE.c(Uri.parse(str3), new kn3(w69VarE, 1)));
                                                                                }
                                                                                if (!zEquals2) {
                                                                                    if (arrayList3 == null) {
                                                                                        arrayList3 = new ArrayList();
                                                                                    }
                                                                                    arrayList3.add(rt2Var3);
                                                                                }
                                                                            }
                                                                            if (arrayList3 == null) {
                                                                                arrayList3 = Collections.EMPTY_LIST;
                                                                            }
                                                                            if (arrayList3.isEmpty()) {
                                                                                o69Var = new m69(0L, 0L, 0L, 0L);
                                                                            } else {
                                                                                rt2Var2 = (rt2) arrayList3.get(0);
                                                                                if (ch3.r(str2)) {
                                                                                    u69VarA = u69.a(rt2Var2.a);
                                                                                } else {
                                                                                    u69VarA = u69.a(rt2Var2.a);
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    return obj;
                                                                }
                                                                o69Var = new u69(0L, 0L, 0L, jE);
                                                            }
                                                            r69Var = u69VarA;
                                                        }
                                                    } else {
                                                        r17 r17Var = (r17) sy4Var.j(queryParameter4).getValue();
                                                        if (r17Var != null) {
                                                            k39Var = k39Var;
                                                            r69Var = new l69(r17Var.a);
                                                        } else {
                                                            u69VarA = new t69(queryParameter4);
                                                            k39Var = k39Var;
                                                            r69Var = u69VarA;
                                                        }
                                                    }
                                                } else {
                                                    zStartsWith = str5.startsWith("@");
                                                    if (zStartsWith) {
                                                        i2 = 0;
                                                    } else {
                                                        i2 = 0;
                                                    }
                                                    if (i2 != -1) {
                                                        strSubstring = pathSegments2.get(i2);
                                                        if (strSubstring.startsWith("@")) {
                                                            strSubstring = strSubstring.substring(1);
                                                        }
                                                        it2 = bi4Var.b.values().iterator();
                                                        while (true) {
                                                            if (it2.hasNext()) {
                                                                vg4Var2 = (vg4) it2.next();
                                                                it3 = it2;
                                                                str4 = vg4Var2.a.b.o;
                                                                if (TextUtils.isEmpty(str4)) {
                                                                    lastPathSegment = Uri.parse(str4).getLastPathSegment();
                                                                } else {
                                                                    lastPathSegment = null;
                                                                }
                                                                if (Objects.equals(lastPathSegment, strSubstring)) {
                                                                    it2 = it3;
                                                                }
                                                            } else {
                                                                vg4Var2 = null;
                                                            }
                                                        }
                                                        if (vg4Var2 != null) {
                                                            u69VarA = u69.b(vg4Var2.v());
                                                            k39Var = k39Var;
                                                            r69Var = u69VarA;
                                                        } else if (zStartsWith) {
                                                            k39Var = k39Var;
                                                            r69Var = new s69(0L, 0L, 0L, 0L);
                                                        } else if (Objects.equals(uri4.getHost(), "max.ru")) {
                                                            queryParameter = uri4.getQueryParameter("uid");
                                                            if (TextUtils.isEmpty(queryParameter)) {
                                                                j = Long.parseLong(queryParameter);
                                                                if (j == -1) {
                                                                }
                                                            } else {
                                                                k39Var = k39Var;
                                                            }
                                                            queryParameter2 = uri4.getQueryParameter("cid");
                                                            if (!TextUtils.isEmpty(queryParameter2)) {
                                                                j2 = Long.parseLong(queryParameter2);
                                                                if (j2 != 0) {
                                                                    rt2VarK = qw2Var.K(j2);
                                                                    if (rt2VarK == null) {
                                                                        concurrentHashMap = qw2Var.f;
                                                                        rt2Var = (rt2) concurrentHashMap.get(Long.valueOf(j2));
                                                                        if (rt2Var != null) {
                                                                            rt2VarK = rt2Var;
                                                                        } else {
                                                                            qw2Var.t();
                                                                            rt2VarK = (rt2) concurrentHashMap.get(Long.valueOf(j2));
                                                                        }
                                                                    }
                                                                    if (rt2VarK != null) {
                                                                        u69VarB = u69.a(rt2VarK.a);
                                                                        r69Var = u69VarB;
                                                                        k39Var = k39Var;
                                                                    }
                                                                }
                                                            }
                                                            string = uri4.toString();
                                                            if (pathSegments2 == null) {
                                                            }
                                                            v69VarC = w69VarE.c(uri4, new kn3(w69VarE, 2));
                                                            if (TextUtils.isEmpty(null)) {
                                                                list = Collections.EMPTY_LIST;
                                                                k39Var = k39Var;
                                                            } else {
                                                                it = bi4Var.b.values().iterator();
                                                                arrayList = null;
                                                                while (it.hasNext()) {
                                                                    vg4Var = (vg4) it.next();
                                                                    Iterator it6 = it;
                                                                    str = vg4Var.a.b.o;
                                                                    if (TextUtils.isEmpty(str)) {
                                                                        zEquals = v69VarC.equals(w69VarE.c(Uri.parse(str), new kn3(w69VarE, 2)));
                                                                    } else {
                                                                        zEquals = false;
                                                                    }
                                                                    if (zEquals) {
                                                                        if (arrayList == 0) {
                                                                            arrayList = new ArrayList();
                                                                        } else {
                                                                            arrayList = arrayList;
                                                                        }
                                                                        arrayList.add(vg4Var);
                                                                    } else {
                                                                        arrayList = arrayList;
                                                                    }
                                                                    it = it6;
                                                                    k39Var = k39Var;
                                                                }
                                                                arrayList2 = arrayList;
                                                                k39Var = k39Var;
                                                                if (arrayList2 == null) {
                                                                    list = Collections.EMPTY_LIST;
                                                                } else {
                                                                    list = arrayList2;
                                                                }
                                                            }
                                                            if (list.isEmpty()) {
                                                                u69VarA = u69.b(((vg4) list.get(0)).v());
                                                            } else {
                                                                jE = w69.e(string);
                                                                if (jE > 0) {
                                                                    if (pathSegments2 != null) {
                                                                        if (pathSegments2 == null) {
                                                                            str2 = null;
                                                                            strReplace = string;
                                                                            if (pathSegments2 == null) {
                                                                                if (pathSegments2 == null) {
                                                                                    v69VarC2 = w69VarE.c(Uri.parse(strReplace), new kn3(w69VarE, 1));
                                                                                    qw2Var.t();
                                                                                    arrayList3 = null;
                                                                                    while (r5.hasNext()) {
                                                                                        str3 = rt2Var3.b.J;
                                                                                        if (TextUtils.isEmpty(str3)) {
                                                                                            zEquals2 = false;
                                                                                        } else {
                                                                                            zEquals2 = v69VarC2.equals(w69VarE.c(Uri.parse(str3), new kn3(w69VarE, 1)));
                                                                                        }
                                                                                        if (!zEquals2) {
                                                                                            if (arrayList3 == null) {
                                                                                                arrayList3 = new ArrayList();
                                                                                            }
                                                                                            arrayList3.add(rt2Var3);
                                                                                        }
                                                                                    }
                                                                                    if (arrayList3 == null) {
                                                                                        arrayList3 = Collections.EMPTY_LIST;
                                                                                    }
                                                                                    if (arrayList3.isEmpty()) {
                                                                                        o69Var = new m69(0L, 0L, 0L, 0L);
                                                                                    } else {
                                                                                        rt2Var2 = (rt2) arrayList3.get(0);
                                                                                        if (ch3.r(str2)) {
                                                                                            u69VarA = u69.a(rt2Var2.a);
                                                                                        } else {
                                                                                            u69VarA = u69.a(rt2Var2.a);
                                                                                        }
                                                                                    }
                                                                                } else {
                                                                                    v69VarC2 = w69VarE.c(Uri.parse(strReplace), new kn3(w69VarE, 1));
                                                                                    qw2Var.t();
                                                                                    arrayList3 = null;
                                                                                    while (r5.hasNext()) {
                                                                                        str3 = rt2Var3.b.J;
                                                                                        if (TextUtils.isEmpty(str3)) {
                                                                                            zEquals2 = false;
                                                                                        } else {
                                                                                            zEquals2 = v69VarC2.equals(w69VarE.c(Uri.parse(str3), new kn3(w69VarE, 1)));
                                                                                        }
                                                                                        if (!zEquals2) {
                                                                                            if (arrayList3 == null) {
                                                                                                arrayList3 = new ArrayList();
                                                                                            }
                                                                                            arrayList3.add(rt2Var3);
                                                                                        }
                                                                                    }
                                                                                    if (arrayList3 == null) {
                                                                                        arrayList3 = Collections.EMPTY_LIST;
                                                                                    }
                                                                                    if (arrayList3.isEmpty()) {
                                                                                        o69Var = new m69(0L, 0L, 0L, 0L);
                                                                                    } else {
                                                                                        rt2Var2 = (rt2) arrayList3.get(0);
                                                                                        if (ch3.r(str2)) {
                                                                                            u69VarA = u69.a(rt2Var2.a);
                                                                                        } else {
                                                                                            u69VarA = u69.a(rt2Var2.a);
                                                                                        }
                                                                                    }
                                                                                }
                                                                            } else if (pathSegments2 == null) {
                                                                                v69VarC2 = w69VarE.c(Uri.parse(strReplace), new kn3(w69VarE, 1));
                                                                                qw2Var.t();
                                                                                arrayList3 = null;
                                                                                while (r5.hasNext()) {
                                                                                    str3 = rt2Var3.b.J;
                                                                                    if (TextUtils.isEmpty(str3)) {
                                                                                        zEquals2 = false;
                                                                                    } else {
                                                                                        zEquals2 = v69VarC2.equals(w69VarE.c(Uri.parse(str3), new kn3(w69VarE, 1)));
                                                                                    }
                                                                                    if (!zEquals2) {
                                                                                        if (arrayList3 == null) {
                                                                                            arrayList3 = new ArrayList();
                                                                                        }
                                                                                        arrayList3.add(rt2Var3);
                                                                                    }
                                                                                }
                                                                                if (arrayList3 == null) {
                                                                                    arrayList3 = Collections.EMPTY_LIST;
                                                                                }
                                                                                if (arrayList3.isEmpty()) {
                                                                                    o69Var = new m69(0L, 0L, 0L, 0L);
                                                                                } else {
                                                                                    rt2Var2 = (rt2) arrayList3.get(0);
                                                                                    if (ch3.r(str2)) {
                                                                                        u69VarA = u69.a(rt2Var2.a);
                                                                                    } else {
                                                                                        u69VarA = u69.a(rt2Var2.a);
                                                                                    }
                                                                                }
                                                                            } else {
                                                                                v69VarC2 = w69VarE.c(Uri.parse(strReplace), new kn3(w69VarE, 1));
                                                                                qw2Var.t();
                                                                                arrayList3 = null;
                                                                                while (r5.hasNext()) {
                                                                                    str3 = rt2Var3.b.J;
                                                                                    if (TextUtils.isEmpty(str3)) {
                                                                                        zEquals2 = false;
                                                                                    } else {
                                                                                        zEquals2 = v69VarC2.equals(w69VarE.c(Uri.parse(str3), new kn3(w69VarE, 1)));
                                                                                    }
                                                                                    if (!zEquals2) {
                                                                                        if (arrayList3 == null) {
                                                                                            arrayList3 = new ArrayList();
                                                                                        }
                                                                                        arrayList3.add(rt2Var3);
                                                                                    }
                                                                                }
                                                                                if (arrayList3 == null) {
                                                                                    arrayList3 = Collections.EMPTY_LIST;
                                                                                }
                                                                                if (arrayList3.isEmpty()) {
                                                                                    o69Var = new m69(0L, 0L, 0L, 0L);
                                                                                } else {
                                                                                    rt2Var2 = (rt2) arrayList3.get(0);
                                                                                    if (ch3.r(str2)) {
                                                                                        u69VarA = u69.a(rt2Var2.a);
                                                                                    } else {
                                                                                        u69VarA = u69.a(rt2Var2.a);
                                                                                    }
                                                                                }
                                                                            }
                                                                        } else {
                                                                            str2 = null;
                                                                            strReplace = string;
                                                                            if (pathSegments2 == null) {
                                                                                if (pathSegments2 == null) {
                                                                                    v69VarC2 = w69VarE.c(Uri.parse(strReplace), new kn3(w69VarE, 1));
                                                                                    qw2Var.t();
                                                                                    arrayList3 = null;
                                                                                    while (r5.hasNext()) {
                                                                                        str3 = rt2Var3.b.J;
                                                                                        if (TextUtils.isEmpty(str3)) {
                                                                                            zEquals2 = false;
                                                                                        } else {
                                                                                            zEquals2 = v69VarC2.equals(w69VarE.c(Uri.parse(str3), new kn3(w69VarE, 1)));
                                                                                        }
                                                                                        if (!zEquals2) {
                                                                                            if (arrayList3 == null) {
                                                                                                arrayList3 = new ArrayList();
                                                                                            }
                                                                                            arrayList3.add(rt2Var3);
                                                                                        }
                                                                                    }
                                                                                    if (arrayList3 == null) {
                                                                                        arrayList3 = Collections.EMPTY_LIST;
                                                                                    }
                                                                                    if (arrayList3.isEmpty()) {
                                                                                        o69Var = new m69(0L, 0L, 0L, 0L);
                                                                                    } else {
                                                                                        rt2Var2 = (rt2) arrayList3.get(0);
                                                                                        if (ch3.r(str2)) {
                                                                                            u69VarA = u69.a(rt2Var2.a);
                                                                                        } else {
                                                                                            u69VarA = u69.a(rt2Var2.a);
                                                                                        }
                                                                                    }
                                                                                } else {
                                                                                    v69VarC2 = w69VarE.c(Uri.parse(strReplace), new kn3(w69VarE, 1));
                                                                                    qw2Var.t();
                                                                                    arrayList3 = null;
                                                                                    while (r5.hasNext()) {
                                                                                        str3 = rt2Var3.b.J;
                                                                                        if (TextUtils.isEmpty(str3)) {
                                                                                            zEquals2 = false;
                                                                                        } else {
                                                                                            zEquals2 = v69VarC2.equals(w69VarE.c(Uri.parse(str3), new kn3(w69VarE, 1)));
                                                                                        }
                                                                                        if (!zEquals2) {
                                                                                            if (arrayList3 == null) {
                                                                                                arrayList3 = new ArrayList();
                                                                                            }
                                                                                            arrayList3.add(rt2Var3);
                                                                                        }
                                                                                    }
                                                                                    if (arrayList3 == null) {
                                                                                        arrayList3 = Collections.EMPTY_LIST;
                                                                                    }
                                                                                    if (arrayList3.isEmpty()) {
                                                                                        o69Var = new m69(0L, 0L, 0L, 0L);
                                                                                    } else {
                                                                                        rt2Var2 = (rt2) arrayList3.get(0);
                                                                                        if (ch3.r(str2)) {
                                                                                            u69VarA = u69.a(rt2Var2.a);
                                                                                        } else {
                                                                                            u69VarA = u69.a(rt2Var2.a);
                                                                                        }
                                                                                    }
                                                                                }
                                                                            } else if (pathSegments2 == null) {
                                                                                v69VarC2 = w69VarE.c(Uri.parse(strReplace), new kn3(w69VarE, 1));
                                                                                qw2Var.t();
                                                                                arrayList3 = null;
                                                                                while (r5.hasNext()) {
                                                                                    str3 = rt2Var3.b.J;
                                                                                    if (TextUtils.isEmpty(str3)) {
                                                                                        zEquals2 = false;
                                                                                    } else {
                                                                                        zEquals2 = v69VarC2.equals(w69VarE.c(Uri.parse(str3), new kn3(w69VarE, 1)));
                                                                                    }
                                                                                    if (!zEquals2) {
                                                                                        if (arrayList3 == null) {
                                                                                            arrayList3 = new ArrayList();
                                                                                        }
                                                                                        arrayList3.add(rt2Var3);
                                                                                    }
                                                                                }
                                                                                if (arrayList3 == null) {
                                                                                    arrayList3 = Collections.EMPTY_LIST;
                                                                                }
                                                                                if (arrayList3.isEmpty()) {
                                                                                    o69Var = new m69(0L, 0L, 0L, 0L);
                                                                                } else {
                                                                                    rt2Var2 = (rt2) arrayList3.get(0);
                                                                                    if (ch3.r(str2)) {
                                                                                        u69VarA = u69.a(rt2Var2.a);
                                                                                    } else {
                                                                                        u69VarA = u69.a(rt2Var2.a);
                                                                                    }
                                                                                }
                                                                            } else {
                                                                                v69VarC2 = w69VarE.c(Uri.parse(strReplace), new kn3(w69VarE, 1));
                                                                                qw2Var.t();
                                                                                arrayList3 = null;
                                                                                while (r5.hasNext()) {
                                                                                    str3 = rt2Var3.b.J;
                                                                                    if (TextUtils.isEmpty(str3)) {
                                                                                        zEquals2 = false;
                                                                                    } else {
                                                                                        zEquals2 = v69VarC2.equals(w69VarE.c(Uri.parse(str3), new kn3(w69VarE, 1)));
                                                                                    }
                                                                                    if (!zEquals2) {
                                                                                        if (arrayList3 == null) {
                                                                                            arrayList3 = new ArrayList();
                                                                                        }
                                                                                        arrayList3.add(rt2Var3);
                                                                                    }
                                                                                }
                                                                                if (arrayList3 == null) {
                                                                                    arrayList3 = Collections.EMPTY_LIST;
                                                                                }
                                                                                if (arrayList3.isEmpty()) {
                                                                                    o69Var = new m69(0L, 0L, 0L, 0L);
                                                                                } else {
                                                                                    rt2Var2 = (rt2) arrayList3.get(0);
                                                                                    if (ch3.r(str2)) {
                                                                                        u69VarA = u69.a(rt2Var2.a);
                                                                                    } else {
                                                                                        u69VarA = u69.a(rt2Var2.a);
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    } else if (pathSegments2 == null) {
                                                                        str2 = null;
                                                                        strReplace = string;
                                                                        if (pathSegments2 == null) {
                                                                            if (pathSegments2 == null) {
                                                                                v69VarC2 = w69VarE.c(Uri.parse(strReplace), new kn3(w69VarE, 1));
                                                                                qw2Var.t();
                                                                                arrayList3 = null;
                                                                                while (r5.hasNext()) {
                                                                                    str3 = rt2Var3.b.J;
                                                                                    if (TextUtils.isEmpty(str3)) {
                                                                                        zEquals2 = false;
                                                                                    } else {
                                                                                        zEquals2 = v69VarC2.equals(w69VarE.c(Uri.parse(str3), new kn3(w69VarE, 1)));
                                                                                    }
                                                                                    if (!zEquals2) {
                                                                                        if (arrayList3 == null) {
                                                                                            arrayList3 = new ArrayList();
                                                                                        }
                                                                                        arrayList3.add(rt2Var3);
                                                                                    }
                                                                                }
                                                                                if (arrayList3 == null) {
                                                                                    arrayList3 = Collections.EMPTY_LIST;
                                                                                }
                                                                                if (arrayList3.isEmpty()) {
                                                                                    o69Var = new m69(0L, 0L, 0L, 0L);
                                                                                } else {
                                                                                    rt2Var2 = (rt2) arrayList3.get(0);
                                                                                    if (ch3.r(str2)) {
                                                                                        u69VarA = u69.a(rt2Var2.a);
                                                                                    } else {
                                                                                        u69VarA = u69.a(rt2Var2.a);
                                                                                    }
                                                                                }
                                                                            } else {
                                                                                v69VarC2 = w69VarE.c(Uri.parse(strReplace), new kn3(w69VarE, 1));
                                                                                qw2Var.t();
                                                                                arrayList3 = null;
                                                                                while (r5.hasNext()) {
                                                                                    str3 = rt2Var3.b.J;
                                                                                    if (TextUtils.isEmpty(str3)) {
                                                                                        zEquals2 = false;
                                                                                    } else {
                                                                                        zEquals2 = v69VarC2.equals(w69VarE.c(Uri.parse(str3), new kn3(w69VarE, 1)));
                                                                                    }
                                                                                    if (!zEquals2) {
                                                                                        if (arrayList3 == null) {
                                                                                            arrayList3 = new ArrayList();
                                                                                        }
                                                                                        arrayList3.add(rt2Var3);
                                                                                    }
                                                                                }
                                                                                if (arrayList3 == null) {
                                                                                    arrayList3 = Collections.EMPTY_LIST;
                                                                                }
                                                                                if (arrayList3.isEmpty()) {
                                                                                    o69Var = new m69(0L, 0L, 0L, 0L);
                                                                                } else {
                                                                                    rt2Var2 = (rt2) arrayList3.get(0);
                                                                                    if (ch3.r(str2)) {
                                                                                        u69VarA = u69.a(rt2Var2.a);
                                                                                    } else {
                                                                                        u69VarA = u69.a(rt2Var2.a);
                                                                                    }
                                                                                }
                                                                            }
                                                                        } else if (pathSegments2 == null) {
                                                                            v69VarC2 = w69VarE.c(Uri.parse(strReplace), new kn3(w69VarE, 1));
                                                                            qw2Var.t();
                                                                            arrayList3 = null;
                                                                            while (r5.hasNext()) {
                                                                                str3 = rt2Var3.b.J;
                                                                                if (TextUtils.isEmpty(str3)) {
                                                                                    zEquals2 = false;
                                                                                } else {
                                                                                    zEquals2 = v69VarC2.equals(w69VarE.c(Uri.parse(str3), new kn3(w69VarE, 1)));
                                                                                }
                                                                                if (!zEquals2) {
                                                                                    if (arrayList3 == null) {
                                                                                        arrayList3 = new ArrayList();
                                                                                    }
                                                                                    arrayList3.add(rt2Var3);
                                                                                }
                                                                            }
                                                                            if (arrayList3 == null) {
                                                                                arrayList3 = Collections.EMPTY_LIST;
                                                                            }
                                                                            if (arrayList3.isEmpty()) {
                                                                                o69Var = new m69(0L, 0L, 0L, 0L);
                                                                            } else {
                                                                                rt2Var2 = (rt2) arrayList3.get(0);
                                                                                if (ch3.r(str2)) {
                                                                                    u69VarA = u69.a(rt2Var2.a);
                                                                                } else {
                                                                                    u69VarA = u69.a(rt2Var2.a);
                                                                                }
                                                                            }
                                                                        } else {
                                                                            v69VarC2 = w69VarE.c(Uri.parse(strReplace), new kn3(w69VarE, 1));
                                                                            qw2Var.t();
                                                                            arrayList3 = null;
                                                                            while (r5.hasNext()) {
                                                                                str3 = rt2Var3.b.J;
                                                                                if (TextUtils.isEmpty(str3)) {
                                                                                    zEquals2 = false;
                                                                                } else {
                                                                                    zEquals2 = v69VarC2.equals(w69VarE.c(Uri.parse(str3), new kn3(w69VarE, 1)));
                                                                                }
                                                                                if (!zEquals2) {
                                                                                    if (arrayList3 == null) {
                                                                                        arrayList3 = new ArrayList();
                                                                                    }
                                                                                    arrayList3.add(rt2Var3);
                                                                                }
                                                                            }
                                                                            if (arrayList3 == null) {
                                                                                arrayList3 = Collections.EMPTY_LIST;
                                                                            }
                                                                            if (arrayList3.isEmpty()) {
                                                                                o69Var = new m69(0L, 0L, 0L, 0L);
                                                                            } else {
                                                                                rt2Var2 = (rt2) arrayList3.get(0);
                                                                                if (ch3.r(str2)) {
                                                                                    u69VarA = u69.a(rt2Var2.a);
                                                                                } else {
                                                                                    u69VarA = u69.a(rt2Var2.a);
                                                                                }
                                                                            }
                                                                        }
                                                                    } else {
                                                                        str2 = null;
                                                                        strReplace = string;
                                                                        if (pathSegments2 == null) {
                                                                            if (pathSegments2 == null) {
                                                                                v69VarC2 = w69VarE.c(Uri.parse(strReplace), new kn3(w69VarE, 1));
                                                                                qw2Var.t();
                                                                                arrayList3 = null;
                                                                                while (r5.hasNext()) {
                                                                                    str3 = rt2Var3.b.J;
                                                                                    if (TextUtils.isEmpty(str3)) {
                                                                                        zEquals2 = false;
                                                                                    } else {
                                                                                        zEquals2 = v69VarC2.equals(w69VarE.c(Uri.parse(str3), new kn3(w69VarE, 1)));
                                                                                    }
                                                                                    if (!zEquals2) {
                                                                                        if (arrayList3 == null) {
                                                                                            arrayList3 = new ArrayList();
                                                                                        }
                                                                                        arrayList3.add(rt2Var3);
                                                                                    }
                                                                                }
                                                                                if (arrayList3 == null) {
                                                                                    arrayList3 = Collections.EMPTY_LIST;
                                                                                }
                                                                                if (arrayList3.isEmpty()) {
                                                                                    o69Var = new m69(0L, 0L, 0L, 0L);
                                                                                } else {
                                                                                    rt2Var2 = (rt2) arrayList3.get(0);
                                                                                    if (ch3.r(str2)) {
                                                                                        u69VarA = u69.a(rt2Var2.a);
                                                                                    } else {
                                                                                        u69VarA = u69.a(rt2Var2.a);
                                                                                    }
                                                                                }
                                                                            } else {
                                                                                v69VarC2 = w69VarE.c(Uri.parse(strReplace), new kn3(w69VarE, 1));
                                                                                qw2Var.t();
                                                                                arrayList3 = null;
                                                                                while (r5.hasNext()) {
                                                                                    str3 = rt2Var3.b.J;
                                                                                    if (TextUtils.isEmpty(str3)) {
                                                                                        zEquals2 = false;
                                                                                    } else {
                                                                                        zEquals2 = v69VarC2.equals(w69VarE.c(Uri.parse(str3), new kn3(w69VarE, 1)));
                                                                                    }
                                                                                    if (!zEquals2) {
                                                                                        if (arrayList3 == null) {
                                                                                            arrayList3 = new ArrayList();
                                                                                        }
                                                                                        arrayList3.add(rt2Var3);
                                                                                    }
                                                                                }
                                                                                if (arrayList3 == null) {
                                                                                    arrayList3 = Collections.EMPTY_LIST;
                                                                                }
                                                                                if (arrayList3.isEmpty()) {
                                                                                    o69Var = new m69(0L, 0L, 0L, 0L);
                                                                                } else {
                                                                                    rt2Var2 = (rt2) arrayList3.get(0);
                                                                                    if (ch3.r(str2)) {
                                                                                        u69VarA = u69.a(rt2Var2.a);
                                                                                    } else {
                                                                                        u69VarA = u69.a(rt2Var2.a);
                                                                                    }
                                                                                }
                                                                            }
                                                                        } else if (pathSegments2 == null) {
                                                                            v69VarC2 = w69VarE.c(Uri.parse(strReplace), new kn3(w69VarE, 1));
                                                                            qw2Var.t();
                                                                            arrayList3 = null;
                                                                            while (r5.hasNext()) {
                                                                                str3 = rt2Var3.b.J;
                                                                                if (TextUtils.isEmpty(str3)) {
                                                                                    zEquals2 = false;
                                                                                } else {
                                                                                    zEquals2 = v69VarC2.equals(w69VarE.c(Uri.parse(str3), new kn3(w69VarE, 1)));
                                                                                }
                                                                                if (!zEquals2) {
                                                                                    if (arrayList3 == null) {
                                                                                        arrayList3 = new ArrayList();
                                                                                    }
                                                                                    arrayList3.add(rt2Var3);
                                                                                }
                                                                            }
                                                                            if (arrayList3 == null) {
                                                                                arrayList3 = Collections.EMPTY_LIST;
                                                                            }
                                                                            if (arrayList3.isEmpty()) {
                                                                                o69Var = new m69(0L, 0L, 0L, 0L);
                                                                            } else {
                                                                                rt2Var2 = (rt2) arrayList3.get(0);
                                                                                if (ch3.r(str2)) {
                                                                                    u69VarA = u69.a(rt2Var2.a);
                                                                                } else {
                                                                                    u69VarA = u69.a(rt2Var2.a);
                                                                                }
                                                                            }
                                                                        } else {
                                                                            v69VarC2 = w69VarE.c(Uri.parse(strReplace), new kn3(w69VarE, 1));
                                                                            qw2Var.t();
                                                                            arrayList3 = null;
                                                                            while (r5.hasNext()) {
                                                                                str3 = rt2Var3.b.J;
                                                                                if (TextUtils.isEmpty(str3)) {
                                                                                    zEquals2 = false;
                                                                                } else {
                                                                                    zEquals2 = v69VarC2.equals(w69VarE.c(Uri.parse(str3), new kn3(w69VarE, 1)));
                                                                                }
                                                                                if (!zEquals2) {
                                                                                    if (arrayList3 == null) {
                                                                                        arrayList3 = new ArrayList();
                                                                                    }
                                                                                    arrayList3.add(rt2Var3);
                                                                                }
                                                                            }
                                                                            if (arrayList3 == null) {
                                                                                arrayList3 = Collections.EMPTY_LIST;
                                                                            }
                                                                            if (arrayList3.isEmpty()) {
                                                                                o69Var = new m69(0L, 0L, 0L, 0L);
                                                                            } else {
                                                                                rt2Var2 = (rt2) arrayList3.get(0);
                                                                                if (ch3.r(str2)) {
                                                                                    u69VarA = u69.a(rt2Var2.a);
                                                                                } else {
                                                                                    u69VarA = u69.a(rt2Var2.a);
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    return obj;
                                                                }
                                                                o69Var = new u69(0L, 0L, 0L, jE);
                                                            }
                                                            r69Var = u69VarA;
                                                        }
                                                    } else if (Objects.equals(uri4.getHost(), "max.ru")) {
                                                        queryParameter = uri4.getQueryParameter("uid");
                                                        if (TextUtils.isEmpty(queryParameter)) {
                                                            j = Long.parseLong(queryParameter);
                                                            if (j == -1) {
                                                            }
                                                        } else {
                                                            k39Var = k39Var;
                                                        }
                                                        queryParameter2 = uri4.getQueryParameter("cid");
                                                        if (!TextUtils.isEmpty(queryParameter2)) {
                                                            j2 = Long.parseLong(queryParameter2);
                                                            if (j2 != 0) {
                                                                rt2VarK = qw2Var.K(j2);
                                                                if (rt2VarK == null) {
                                                                    concurrentHashMap = qw2Var.f;
                                                                    rt2Var = (rt2) concurrentHashMap.get(Long.valueOf(j2));
                                                                    if (rt2Var != null) {
                                                                        rt2VarK = rt2Var;
                                                                    } else {
                                                                        qw2Var.t();
                                                                        rt2VarK = (rt2) concurrentHashMap.get(Long.valueOf(j2));
                                                                    }
                                                                }
                                                                if (rt2VarK != null) {
                                                                    u69VarB = u69.a(rt2VarK.a);
                                                                    r69Var = u69VarB;
                                                                    k39Var = k39Var;
                                                                }
                                                            }
                                                        }
                                                        string = uri4.toString();
                                                        if (pathSegments2 == null) {
                                                        }
                                                        v69VarC = w69VarE.c(uri4, new kn3(w69VarE, 2));
                                                        if (TextUtils.isEmpty(null)) {
                                                            list = Collections.EMPTY_LIST;
                                                            k39Var = k39Var;
                                                        } else {
                                                            it = bi4Var.b.values().iterator();
                                                            arrayList = null;
                                                            while (it.hasNext()) {
                                                                vg4Var = (vg4) it.next();
                                                                Iterator it7 = it;
                                                                str = vg4Var.a.b.o;
                                                                if (TextUtils.isEmpty(str)) {
                                                                    zEquals = v69VarC.equals(w69VarE.c(Uri.parse(str), new kn3(w69VarE, 2)));
                                                                } else {
                                                                    zEquals = false;
                                                                }
                                                                if (zEquals) {
                                                                    if (arrayList == 0) {
                                                                        arrayList = new ArrayList();
                                                                    } else {
                                                                        arrayList = arrayList;
                                                                    }
                                                                    arrayList.add(vg4Var);
                                                                } else {
                                                                    arrayList = arrayList;
                                                                }
                                                                it = it7;
                                                                k39Var = k39Var;
                                                            }
                                                            arrayList2 = arrayList;
                                                            k39Var = k39Var;
                                                            if (arrayList2 == null) {
                                                                list = Collections.EMPTY_LIST;
                                                            } else {
                                                                list = arrayList2;
                                                            }
                                                        }
                                                        if (list.isEmpty()) {
                                                            u69VarA = u69.b(((vg4) list.get(0)).v());
                                                        } else {
                                                            jE = w69.e(string);
                                                            if (jE > 0) {
                                                                if (pathSegments2 != null) {
                                                                    if (pathSegments2 == null) {
                                                                        str2 = null;
                                                                        strReplace = string;
                                                                        if (pathSegments2 == null) {
                                                                            if (pathSegments2 == null) {
                                                                                v69VarC2 = w69VarE.c(Uri.parse(strReplace), new kn3(w69VarE, 1));
                                                                                qw2Var.t();
                                                                                arrayList3 = null;
                                                                                while (r5.hasNext()) {
                                                                                    str3 = rt2Var3.b.J;
                                                                                    if (TextUtils.isEmpty(str3)) {
                                                                                        zEquals2 = false;
                                                                                    } else {
                                                                                        zEquals2 = v69VarC2.equals(w69VarE.c(Uri.parse(str3), new kn3(w69VarE, 1)));
                                                                                    }
                                                                                    if (!zEquals2) {
                                                                                        if (arrayList3 == null) {
                                                                                            arrayList3 = new ArrayList();
                                                                                        }
                                                                                        arrayList3.add(rt2Var3);
                                                                                    }
                                                                                }
                                                                                if (arrayList3 == null) {
                                                                                    arrayList3 = Collections.EMPTY_LIST;
                                                                                }
                                                                                if (arrayList3.isEmpty()) {
                                                                                    o69Var = new m69(0L, 0L, 0L, 0L);
                                                                                } else {
                                                                                    rt2Var2 = (rt2) arrayList3.get(0);
                                                                                    if (ch3.r(str2)) {
                                                                                        u69VarA = u69.a(rt2Var2.a);
                                                                                    } else {
                                                                                        u69VarA = u69.a(rt2Var2.a);
                                                                                    }
                                                                                }
                                                                            } else {
                                                                                v69VarC2 = w69VarE.c(Uri.parse(strReplace), new kn3(w69VarE, 1));
                                                                                qw2Var.t();
                                                                                arrayList3 = null;
                                                                                while (r5.hasNext()) {
                                                                                    str3 = rt2Var3.b.J;
                                                                                    if (TextUtils.isEmpty(str3)) {
                                                                                        zEquals2 = false;
                                                                                    } else {
                                                                                        zEquals2 = v69VarC2.equals(w69VarE.c(Uri.parse(str3), new kn3(w69VarE, 1)));
                                                                                    }
                                                                                    if (!zEquals2) {
                                                                                        if (arrayList3 == null) {
                                                                                            arrayList3 = new ArrayList();
                                                                                        }
                                                                                        arrayList3.add(rt2Var3);
                                                                                    }
                                                                                }
                                                                                if (arrayList3 == null) {
                                                                                    arrayList3 = Collections.EMPTY_LIST;
                                                                                }
                                                                                if (arrayList3.isEmpty()) {
                                                                                    o69Var = new m69(0L, 0L, 0L, 0L);
                                                                                } else {
                                                                                    rt2Var2 = (rt2) arrayList3.get(0);
                                                                                    if (ch3.r(str2)) {
                                                                                        u69VarA = u69.a(rt2Var2.a);
                                                                                    } else {
                                                                                        u69VarA = u69.a(rt2Var2.a);
                                                                                    }
                                                                                }
                                                                            }
                                                                        } else if (pathSegments2 == null) {
                                                                            v69VarC2 = w69VarE.c(Uri.parse(strReplace), new kn3(w69VarE, 1));
                                                                            qw2Var.t();
                                                                            arrayList3 = null;
                                                                            while (r5.hasNext()) {
                                                                                str3 = rt2Var3.b.J;
                                                                                if (TextUtils.isEmpty(str3)) {
                                                                                    zEquals2 = false;
                                                                                } else {
                                                                                    zEquals2 = v69VarC2.equals(w69VarE.c(Uri.parse(str3), new kn3(w69VarE, 1)));
                                                                                }
                                                                                if (!zEquals2) {
                                                                                    if (arrayList3 == null) {
                                                                                        arrayList3 = new ArrayList();
                                                                                    }
                                                                                    arrayList3.add(rt2Var3);
                                                                                }
                                                                            }
                                                                            if (arrayList3 == null) {
                                                                                arrayList3 = Collections.EMPTY_LIST;
                                                                            }
                                                                            if (arrayList3.isEmpty()) {
                                                                                o69Var = new m69(0L, 0L, 0L, 0L);
                                                                            } else {
                                                                                rt2Var2 = (rt2) arrayList3.get(0);
                                                                                if (ch3.r(str2)) {
                                                                                    u69VarA = u69.a(rt2Var2.a);
                                                                                } else {
                                                                                    u69VarA = u69.a(rt2Var2.a);
                                                                                }
                                                                            }
                                                                        } else {
                                                                            v69VarC2 = w69VarE.c(Uri.parse(strReplace), new kn3(w69VarE, 1));
                                                                            qw2Var.t();
                                                                            arrayList3 = null;
                                                                            while (r5.hasNext()) {
                                                                                str3 = rt2Var3.b.J;
                                                                                if (TextUtils.isEmpty(str3)) {
                                                                                    zEquals2 = false;
                                                                                } else {
                                                                                    zEquals2 = v69VarC2.equals(w69VarE.c(Uri.parse(str3), new kn3(w69VarE, 1)));
                                                                                }
                                                                                if (!zEquals2) {
                                                                                    if (arrayList3 == null) {
                                                                                        arrayList3 = new ArrayList();
                                                                                    }
                                                                                    arrayList3.add(rt2Var3);
                                                                                }
                                                                            }
                                                                            if (arrayList3 == null) {
                                                                                arrayList3 = Collections.EMPTY_LIST;
                                                                            }
                                                                            if (arrayList3.isEmpty()) {
                                                                                o69Var = new m69(0L, 0L, 0L, 0L);
                                                                            } else {
                                                                                rt2Var2 = (rt2) arrayList3.get(0);
                                                                                if (ch3.r(str2)) {
                                                                                    u69VarA = u69.a(rt2Var2.a);
                                                                                } else {
                                                                                    u69VarA = u69.a(rt2Var2.a);
                                                                                }
                                                                            }
                                                                        }
                                                                    } else {
                                                                        str2 = null;
                                                                        strReplace = string;
                                                                        if (pathSegments2 == null) {
                                                                            if (pathSegments2 == null) {
                                                                                v69VarC2 = w69VarE.c(Uri.parse(strReplace), new kn3(w69VarE, 1));
                                                                                qw2Var.t();
                                                                                arrayList3 = null;
                                                                                while (r5.hasNext()) {
                                                                                    str3 = rt2Var3.b.J;
                                                                                    if (TextUtils.isEmpty(str3)) {
                                                                                        zEquals2 = false;
                                                                                    } else {
                                                                                        zEquals2 = v69VarC2.equals(w69VarE.c(Uri.parse(str3), new kn3(w69VarE, 1)));
                                                                                    }
                                                                                    if (!zEquals2) {
                                                                                        if (arrayList3 == null) {
                                                                                            arrayList3 = new ArrayList();
                                                                                        }
                                                                                        arrayList3.add(rt2Var3);
                                                                                    }
                                                                                }
                                                                                if (arrayList3 == null) {
                                                                                    arrayList3 = Collections.EMPTY_LIST;
                                                                                }
                                                                                if (arrayList3.isEmpty()) {
                                                                                    o69Var = new m69(0L, 0L, 0L, 0L);
                                                                                } else {
                                                                                    rt2Var2 = (rt2) arrayList3.get(0);
                                                                                    if (ch3.r(str2)) {
                                                                                        u69VarA = u69.a(rt2Var2.a);
                                                                                    } else {
                                                                                        u69VarA = u69.a(rt2Var2.a);
                                                                                    }
                                                                                }
                                                                            } else {
                                                                                v69VarC2 = w69VarE.c(Uri.parse(strReplace), new kn3(w69VarE, 1));
                                                                                qw2Var.t();
                                                                                arrayList3 = null;
                                                                                while (r5.hasNext()) {
                                                                                    str3 = rt2Var3.b.J;
                                                                                    if (TextUtils.isEmpty(str3)) {
                                                                                        zEquals2 = false;
                                                                                    } else {
                                                                                        zEquals2 = v69VarC2.equals(w69VarE.c(Uri.parse(str3), new kn3(w69VarE, 1)));
                                                                                    }
                                                                                    if (!zEquals2) {
                                                                                        if (arrayList3 == null) {
                                                                                            arrayList3 = new ArrayList();
                                                                                        }
                                                                                        arrayList3.add(rt2Var3);
                                                                                    }
                                                                                }
                                                                                if (arrayList3 == null) {
                                                                                    arrayList3 = Collections.EMPTY_LIST;
                                                                                }
                                                                                if (arrayList3.isEmpty()) {
                                                                                    o69Var = new m69(0L, 0L, 0L, 0L);
                                                                                } else {
                                                                                    rt2Var2 = (rt2) arrayList3.get(0);
                                                                                    if (ch3.r(str2)) {
                                                                                        u69VarA = u69.a(rt2Var2.a);
                                                                                    } else {
                                                                                        u69VarA = u69.a(rt2Var2.a);
                                                                                    }
                                                                                }
                                                                            }
                                                                        } else if (pathSegments2 == null) {
                                                                            v69VarC2 = w69VarE.c(Uri.parse(strReplace), new kn3(w69VarE, 1));
                                                                            qw2Var.t();
                                                                            arrayList3 = null;
                                                                            while (r5.hasNext()) {
                                                                                str3 = rt2Var3.b.J;
                                                                                if (TextUtils.isEmpty(str3)) {
                                                                                    zEquals2 = false;
                                                                                } else {
                                                                                    zEquals2 = v69VarC2.equals(w69VarE.c(Uri.parse(str3), new kn3(w69VarE, 1)));
                                                                                }
                                                                                if (!zEquals2) {
                                                                                    if (arrayList3 == null) {
                                                                                        arrayList3 = new ArrayList();
                                                                                    }
                                                                                    arrayList3.add(rt2Var3);
                                                                                }
                                                                            }
                                                                            if (arrayList3 == null) {
                                                                                arrayList3 = Collections.EMPTY_LIST;
                                                                            }
                                                                            if (arrayList3.isEmpty()) {
                                                                                o69Var = new m69(0L, 0L, 0L, 0L);
                                                                            } else {
                                                                                rt2Var2 = (rt2) arrayList3.get(0);
                                                                                if (ch3.r(str2)) {
                                                                                    u69VarA = u69.a(rt2Var2.a);
                                                                                } else {
                                                                                    u69VarA = u69.a(rt2Var2.a);
                                                                                }
                                                                            }
                                                                        } else {
                                                                            v69VarC2 = w69VarE.c(Uri.parse(strReplace), new kn3(w69VarE, 1));
                                                                            qw2Var.t();
                                                                            arrayList3 = null;
                                                                            while (r5.hasNext()) {
                                                                                str3 = rt2Var3.b.J;
                                                                                if (TextUtils.isEmpty(str3)) {
                                                                                    zEquals2 = false;
                                                                                } else {
                                                                                    zEquals2 = v69VarC2.equals(w69VarE.c(Uri.parse(str3), new kn3(w69VarE, 1)));
                                                                                }
                                                                                if (!zEquals2) {
                                                                                    if (arrayList3 == null) {
                                                                                        arrayList3 = new ArrayList();
                                                                                    }
                                                                                    arrayList3.add(rt2Var3);
                                                                                }
                                                                            }
                                                                            if (arrayList3 == null) {
                                                                                arrayList3 = Collections.EMPTY_LIST;
                                                                            }
                                                                            if (arrayList3.isEmpty()) {
                                                                                o69Var = new m69(0L, 0L, 0L, 0L);
                                                                            } else {
                                                                                rt2Var2 = (rt2) arrayList3.get(0);
                                                                                if (ch3.r(str2)) {
                                                                                    u69VarA = u69.a(rt2Var2.a);
                                                                                } else {
                                                                                    u69VarA = u69.a(rt2Var2.a);
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                } else if (pathSegments2 == null) {
                                                                    str2 = null;
                                                                    strReplace = string;
                                                                    if (pathSegments2 == null) {
                                                                        if (pathSegments2 == null) {
                                                                            v69VarC2 = w69VarE.c(Uri.parse(strReplace), new kn3(w69VarE, 1));
                                                                            qw2Var.t();
                                                                            arrayList3 = null;
                                                                            while (r5.hasNext()) {
                                                                                str3 = rt2Var3.b.J;
                                                                                if (TextUtils.isEmpty(str3)) {
                                                                                    zEquals2 = false;
                                                                                } else {
                                                                                    zEquals2 = v69VarC2.equals(w69VarE.c(Uri.parse(str3), new kn3(w69VarE, 1)));
                                                                                }
                                                                                if (!zEquals2) {
                                                                                    if (arrayList3 == null) {
                                                                                        arrayList3 = new ArrayList();
                                                                                    }
                                                                                    arrayList3.add(rt2Var3);
                                                                                }
                                                                            }
                                                                            if (arrayList3 == null) {
                                                                                arrayList3 = Collections.EMPTY_LIST;
                                                                            }
                                                                            if (arrayList3.isEmpty()) {
                                                                                o69Var = new m69(0L, 0L, 0L, 0L);
                                                                            } else {
                                                                                rt2Var2 = (rt2) arrayList3.get(0);
                                                                                if (ch3.r(str2)) {
                                                                                    u69VarA = u69.a(rt2Var2.a);
                                                                                } else {
                                                                                    u69VarA = u69.a(rt2Var2.a);
                                                                                }
                                                                            }
                                                                        } else {
                                                                            v69VarC2 = w69VarE.c(Uri.parse(strReplace), new kn3(w69VarE, 1));
                                                                            qw2Var.t();
                                                                            arrayList3 = null;
                                                                            while (r5.hasNext()) {
                                                                                str3 = rt2Var3.b.J;
                                                                                if (TextUtils.isEmpty(str3)) {
                                                                                    zEquals2 = false;
                                                                                } else {
                                                                                    zEquals2 = v69VarC2.equals(w69VarE.c(Uri.parse(str3), new kn3(w69VarE, 1)));
                                                                                }
                                                                                if (!zEquals2) {
                                                                                    if (arrayList3 == null) {
                                                                                        arrayList3 = new ArrayList();
                                                                                    }
                                                                                    arrayList3.add(rt2Var3);
                                                                                }
                                                                            }
                                                                            if (arrayList3 == null) {
                                                                                arrayList3 = Collections.EMPTY_LIST;
                                                                            }
                                                                            if (arrayList3.isEmpty()) {
                                                                                o69Var = new m69(0L, 0L, 0L, 0L);
                                                                            } else {
                                                                                rt2Var2 = (rt2) arrayList3.get(0);
                                                                                if (ch3.r(str2)) {
                                                                                    u69VarA = u69.a(rt2Var2.a);
                                                                                } else {
                                                                                    u69VarA = u69.a(rt2Var2.a);
                                                                                }
                                                                            }
                                                                        }
                                                                    } else if (pathSegments2 == null) {
                                                                        v69VarC2 = w69VarE.c(Uri.parse(strReplace), new kn3(w69VarE, 1));
                                                                        qw2Var.t();
                                                                        arrayList3 = null;
                                                                        while (r5.hasNext()) {
                                                                            str3 = rt2Var3.b.J;
                                                                            if (TextUtils.isEmpty(str3)) {
                                                                                zEquals2 = false;
                                                                            } else {
                                                                                zEquals2 = v69VarC2.equals(w69VarE.c(Uri.parse(str3), new kn3(w69VarE, 1)));
                                                                            }
                                                                            if (!zEquals2) {
                                                                                if (arrayList3 == null) {
                                                                                    arrayList3 = new ArrayList();
                                                                                }
                                                                                arrayList3.add(rt2Var3);
                                                                            }
                                                                        }
                                                                        if (arrayList3 == null) {
                                                                            arrayList3 = Collections.EMPTY_LIST;
                                                                        }
                                                                        if (arrayList3.isEmpty()) {
                                                                            o69Var = new m69(0L, 0L, 0L, 0L);
                                                                        } else {
                                                                            rt2Var2 = (rt2) arrayList3.get(0);
                                                                            if (ch3.r(str2)) {
                                                                                u69VarA = u69.a(rt2Var2.a);
                                                                            } else {
                                                                                u69VarA = u69.a(rt2Var2.a);
                                                                            }
                                                                        }
                                                                    } else {
                                                                        v69VarC2 = w69VarE.c(Uri.parse(strReplace), new kn3(w69VarE, 1));
                                                                        qw2Var.t();
                                                                        arrayList3 = null;
                                                                        while (r5.hasNext()) {
                                                                            str3 = rt2Var3.b.J;
                                                                            if (TextUtils.isEmpty(str3)) {
                                                                                zEquals2 = false;
                                                                            } else {
                                                                                zEquals2 = v69VarC2.equals(w69VarE.c(Uri.parse(str3), new kn3(w69VarE, 1)));
                                                                            }
                                                                            if (!zEquals2) {
                                                                                if (arrayList3 == null) {
                                                                                    arrayList3 = new ArrayList();
                                                                                }
                                                                                arrayList3.add(rt2Var3);
                                                                            }
                                                                        }
                                                                        if (arrayList3 == null) {
                                                                            arrayList3 = Collections.EMPTY_LIST;
                                                                        }
                                                                        if (arrayList3.isEmpty()) {
                                                                            o69Var = new m69(0L, 0L, 0L, 0L);
                                                                        } else {
                                                                            rt2Var2 = (rt2) arrayList3.get(0);
                                                                            if (ch3.r(str2)) {
                                                                                u69VarA = u69.a(rt2Var2.a);
                                                                            } else {
                                                                                u69VarA = u69.a(rt2Var2.a);
                                                                            }
                                                                        }
                                                                    }
                                                                } else {
                                                                    str2 = null;
                                                                    strReplace = string;
                                                                    if (pathSegments2 == null) {
                                                                        if (pathSegments2 == null) {
                                                                            v69VarC2 = w69VarE.c(Uri.parse(strReplace), new kn3(w69VarE, 1));
                                                                            qw2Var.t();
                                                                            arrayList3 = null;
                                                                            while (r5.hasNext()) {
                                                                                str3 = rt2Var3.b.J;
                                                                                if (TextUtils.isEmpty(str3)) {
                                                                                    zEquals2 = false;
                                                                                } else {
                                                                                    zEquals2 = v69VarC2.equals(w69VarE.c(Uri.parse(str3), new kn3(w69VarE, 1)));
                                                                                }
                                                                                if (!zEquals2) {
                                                                                    if (arrayList3 == null) {
                                                                                        arrayList3 = new ArrayList();
                                                                                    }
                                                                                    arrayList3.add(rt2Var3);
                                                                                }
                                                                            }
                                                                            if (arrayList3 == null) {
                                                                                arrayList3 = Collections.EMPTY_LIST;
                                                                            }
                                                                            if (arrayList3.isEmpty()) {
                                                                                o69Var = new m69(0L, 0L, 0L, 0L);
                                                                            } else {
                                                                                rt2Var2 = (rt2) arrayList3.get(0);
                                                                                if (ch3.r(str2)) {
                                                                                    u69VarA = u69.a(rt2Var2.a);
                                                                                } else {
                                                                                    u69VarA = u69.a(rt2Var2.a);
                                                                                }
                                                                            }
                                                                        } else {
                                                                            v69VarC2 = w69VarE.c(Uri.parse(strReplace), new kn3(w69VarE, 1));
                                                                            qw2Var.t();
                                                                            arrayList3 = null;
                                                                            while (r5.hasNext()) {
                                                                                str3 = rt2Var3.b.J;
                                                                                if (TextUtils.isEmpty(str3)) {
                                                                                    zEquals2 = false;
                                                                                } else {
                                                                                    zEquals2 = v69VarC2.equals(w69VarE.c(Uri.parse(str3), new kn3(w69VarE, 1)));
                                                                                }
                                                                                if (!zEquals2) {
                                                                                    if (arrayList3 == null) {
                                                                                        arrayList3 = new ArrayList();
                                                                                    }
                                                                                    arrayList3.add(rt2Var3);
                                                                                }
                                                                            }
                                                                            if (arrayList3 == null) {
                                                                                arrayList3 = Collections.EMPTY_LIST;
                                                                            }
                                                                            if (arrayList3.isEmpty()) {
                                                                                o69Var = new m69(0L, 0L, 0L, 0L);
                                                                            } else {
                                                                                rt2Var2 = (rt2) arrayList3.get(0);
                                                                                if (ch3.r(str2)) {
                                                                                    u69VarA = u69.a(rt2Var2.a);
                                                                                } else {
                                                                                    u69VarA = u69.a(rt2Var2.a);
                                                                                }
                                                                            }
                                                                        }
                                                                    } else if (pathSegments2 == null) {
                                                                        v69VarC2 = w69VarE.c(Uri.parse(strReplace), new kn3(w69VarE, 1));
                                                                        qw2Var.t();
                                                                        arrayList3 = null;
                                                                        while (r5.hasNext()) {
                                                                            str3 = rt2Var3.b.J;
                                                                            if (TextUtils.isEmpty(str3)) {
                                                                                zEquals2 = false;
                                                                            } else {
                                                                                zEquals2 = v69VarC2.equals(w69VarE.c(Uri.parse(str3), new kn3(w69VarE, 1)));
                                                                            }
                                                                            if (!zEquals2) {
                                                                                if (arrayList3 == null) {
                                                                                    arrayList3 = new ArrayList();
                                                                                }
                                                                                arrayList3.add(rt2Var3);
                                                                            }
                                                                        }
                                                                        if (arrayList3 == null) {
                                                                            arrayList3 = Collections.EMPTY_LIST;
                                                                        }
                                                                        if (arrayList3.isEmpty()) {
                                                                            o69Var = new m69(0L, 0L, 0L, 0L);
                                                                        } else {
                                                                            rt2Var2 = (rt2) arrayList3.get(0);
                                                                            if (ch3.r(str2)) {
                                                                                u69VarA = u69.a(rt2Var2.a);
                                                                            } else {
                                                                                u69VarA = u69.a(rt2Var2.a);
                                                                            }
                                                                        }
                                                                    } else {
                                                                        v69VarC2 = w69VarE.c(Uri.parse(strReplace), new kn3(w69VarE, 1));
                                                                        qw2Var.t();
                                                                        arrayList3 = null;
                                                                        while (r5.hasNext()) {
                                                                            str3 = rt2Var3.b.J;
                                                                            if (TextUtils.isEmpty(str3)) {
                                                                                zEquals2 = false;
                                                                            } else {
                                                                                zEquals2 = v69VarC2.equals(w69VarE.c(Uri.parse(str3), new kn3(w69VarE, 1)));
                                                                            }
                                                                            if (!zEquals2) {
                                                                                if (arrayList3 == null) {
                                                                                    arrayList3 = new ArrayList();
                                                                                }
                                                                                arrayList3.add(rt2Var3);
                                                                            }
                                                                        }
                                                                        if (arrayList3 == null) {
                                                                            arrayList3 = Collections.EMPTY_LIST;
                                                                        }
                                                                        if (arrayList3.isEmpty()) {
                                                                            o69Var = new m69(0L, 0L, 0L, 0L);
                                                                        } else {
                                                                            rt2Var2 = (rt2) arrayList3.get(0);
                                                                            if (ch3.r(str2)) {
                                                                                u69VarA = u69.a(rt2Var2.a);
                                                                            } else {
                                                                                u69VarA = u69.a(rt2Var2.a);
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                return obj;
                                                            }
                                                            o69Var = new u69(0L, 0L, 0L, jE);
                                                        }
                                                        r69Var = u69VarA;
                                                    }
                                                }
                                            }
                                        } else if (Objects.equals(uri4.getHost(), "max.ru")) {
                                            queryParameter = uri4.getQueryParameter("uid");
                                            if (TextUtils.isEmpty(queryParameter)) {
                                                try {
                                                    j = Long.parseLong(queryParameter);
                                                } catch (NumberFormatException unused) {
                                                    j = -1;
                                                }
                                                if (j == -1 && (vg4VarF = bi4Var.f(j, false)) != null) {
                                                    u69VarB = u69.b(vg4VarF.v());
                                                }
                                                r69Var = u69VarB;
                                                k39Var = k39Var;
                                            } else {
                                                k39Var = k39Var;
                                            }
                                            queryParameter2 = uri4.getQueryParameter("cid");
                                            if (!TextUtils.isEmpty(queryParameter2)) {
                                                try {
                                                    j2 = Long.parseLong(queryParameter2);
                                                } catch (NumberFormatException unused2) {
                                                    j2 = 0;
                                                }
                                                if (j2 != 0) {
                                                    rt2VarK = qw2Var.K(j2);
                                                    if (rt2VarK == null) {
                                                        concurrentHashMap = qw2Var.f;
                                                        rt2Var = (rt2) concurrentHashMap.get(Long.valueOf(j2));
                                                        if (rt2Var != null) {
                                                            rt2VarK = rt2Var;
                                                        } else {
                                                            qw2Var.t();
                                                            rt2VarK = (rt2) concurrentHashMap.get(Long.valueOf(j2));
                                                        }
                                                    }
                                                    if (rt2VarK != null) {
                                                        u69VarB = u69.a(rt2VarK.a);
                                                        r69Var = u69VarB;
                                                        k39Var = k39Var;
                                                    }
                                                }
                                            }
                                            string = uri4.toString();
                                            if (pathSegments2 == null && pathSegments2.size() == 2 && "stickerset".equalsIgnoreCase(pathSegments2.get(0))) {
                                                k39Var = k39Var;
                                                r69Var = new r69(0L, 0L, 0L, 0L);
                                            } else {
                                                v69VarC = w69VarE.c(uri4, new kn3(w69VarE, 2));
                                                if (TextUtils.isEmpty(null)) {
                                                    list = Collections.EMPTY_LIST;
                                                    k39Var = k39Var;
                                                } else {
                                                    it = bi4Var.b.values().iterator();
                                                    arrayList = null;
                                                    while (it.hasNext()) {
                                                        vg4Var = (vg4) it.next();
                                                        Iterator it8 = it;
                                                        str = vg4Var.a.b.o;
                                                        if (TextUtils.isEmpty(str)) {
                                                            zEquals = v69VarC.equals(w69VarE.c(Uri.parse(str), new kn3(w69VarE, 2)));
                                                        } else {
                                                            zEquals = false;
                                                        }
                                                        if (zEquals) {
                                                            if (arrayList == 0) {
                                                                arrayList = new ArrayList();
                                                            } else {
                                                                arrayList = arrayList;
                                                            }
                                                            arrayList.add(vg4Var);
                                                        } else {
                                                            arrayList = arrayList;
                                                        }
                                                        it = it8;
                                                        k39Var = k39Var;
                                                    }
                                                    arrayList2 = arrayList;
                                                    k39Var = k39Var;
                                                    if (arrayList2 == null) {
                                                        list = Collections.EMPTY_LIST;
                                                    } else {
                                                        list = arrayList2;
                                                    }
                                                }
                                                if (list.isEmpty()) {
                                                    u69VarA = u69.b(((vg4) list.get(0)).v());
                                                } else {
                                                    jE = w69.e(string);
                                                    if (jE > 0) {
                                                        o69Var = new u69(0L, 0L, 0L, jE);
                                                    } else {
                                                        if (pathSegments2 != null || pathSegments2.size() != 2 || !pathSegments2.get(0).equalsIgnoreCase("joincall")) {
                                                            if (pathSegments2 == null && pathSegments2.size() == 2) {
                                                                if ("join".equalsIgnoreCase(pathSegments2.get(0))) {
                                                                    i = 1;
                                                                    str2 = null;
                                                                    strReplace = string;
                                                                } else {
                                                                    strReplace = string.replace(uri4.getPath(), "/" + pathSegments2.get(0));
                                                                    i = 1;
                                                                    str2 = pathSegments2.get(1);
                                                                }
                                                                Long lA2 = fda.a(pathSegments2.get(i));
                                                                if (lA2 != null) {
                                                                    u69VarA = new n69(lA2.longValue(), string);
                                                                }
                                                            } else {
                                                                str2 = null;
                                                                strReplace = string;
                                                            }
                                                            if (pathSegments2 == null && pathSegments2.size() == 3) {
                                                                if (pathSegments2.get(0).equals(DatabaseHelper.COMPRESSED_COLUMN_NAME)) {
                                                                    try {
                                                                        j4 = Long.parseLong(pathSegments2.get(1));
                                                                    } catch (NumberFormatException unused3) {
                                                                        j4 = -1;
                                                                    }
                                                                    Long lA3 = fda.a(pathSegments2.get(2));
                                                                    if (j4 != -1 && lA3 != null) {
                                                                        u69VarA = new n69(lA3.longValue(), string);
                                                                    } else if (pathSegments2 == null) {
                                                                        v69VarC2 = w69VarE.c(Uri.parse(strReplace), new kn3(w69VarE, 1));
                                                                        qw2Var.t();
                                                                        arrayList3 = null;
                                                                        while (r5.hasNext()) {
                                                                            str3 = rt2Var3.b.J;
                                                                            if (TextUtils.isEmpty(str3)) {
                                                                                zEquals2 = false;
                                                                            } else {
                                                                                zEquals2 = v69VarC2.equals(w69VarE.c(Uri.parse(str3), new kn3(w69VarE, 1)));
                                                                            }
                                                                            if (!zEquals2) {
                                                                                if (arrayList3 == null) {
                                                                                    arrayList3 = new ArrayList();
                                                                                }
                                                                                arrayList3.add(rt2Var3);
                                                                            }
                                                                        }
                                                                        if (arrayList3 == null) {
                                                                            arrayList3 = Collections.EMPTY_LIST;
                                                                        }
                                                                        if (arrayList3.isEmpty()) {
                                                                            o69Var = new m69(0L, 0L, 0L, 0L);
                                                                        } else {
                                                                            rt2Var2 = (rt2) arrayList3.get(0);
                                                                            if (ch3.r(str2)) {
                                                                                u69VarA = u69.a(rt2Var2.a);
                                                                            } else {
                                                                                u69VarA = u69.a(rt2Var2.a);
                                                                            }
                                                                        }
                                                                    } else {
                                                                        v69VarC2 = w69VarE.c(Uri.parse(strReplace), new kn3(w69VarE, 1));
                                                                        qw2Var.t();
                                                                        arrayList3 = null;
                                                                        while (r5.hasNext()) {
                                                                            str3 = rt2Var3.b.J;
                                                                            if (TextUtils.isEmpty(str3)) {
                                                                                zEquals2 = false;
                                                                            } else {
                                                                                zEquals2 = v69VarC2.equals(w69VarE.c(Uri.parse(str3), new kn3(w69VarE, 1)));
                                                                            }
                                                                            if (!zEquals2) {
                                                                                if (arrayList3 == null) {
                                                                                    arrayList3 = new ArrayList();
                                                                                }
                                                                                arrayList3.add(rt2Var3);
                                                                            }
                                                                        }
                                                                        if (arrayList3 == null) {
                                                                            arrayList3 = Collections.EMPTY_LIST;
                                                                        }
                                                                        if (arrayList3.isEmpty()) {
                                                                            o69Var = new m69(0L, 0L, 0L, 0L);
                                                                        } else {
                                                                            rt2Var2 = (rt2) arrayList3.get(0);
                                                                            if (ch3.r(str2)) {
                                                                                u69VarA = u69.a(rt2Var2.a);
                                                                            } else {
                                                                                u69VarA = u69.a(rt2Var2.a);
                                                                            }
                                                                        }
                                                                    }
                                                                    break;
                                                                } else {
                                                                    Long lA4 = fda.a(pathSegments2.get(1));
                                                                    Long lA5 = fda.a(pathSegments2.get(2));
                                                                    if (lA4 != null && lA5 != null) {
                                                                        u69VarA = new k69(string);
                                                                    } else if (pathSegments2 == null) {
                                                                        v69VarC2 = w69VarE.c(Uri.parse(strReplace), new kn3(w69VarE, 1));
                                                                        qw2Var.t();
                                                                        arrayList3 = null;
                                                                        while (r5.hasNext()) {
                                                                            str3 = rt2Var3.b.J;
                                                                            if (TextUtils.isEmpty(str3)) {
                                                                                zEquals2 = false;
                                                                            } else {
                                                                                zEquals2 = v69VarC2.equals(w69VarE.c(Uri.parse(str3), new kn3(w69VarE, 1)));
                                                                            }
                                                                            if (!zEquals2) {
                                                                                if (arrayList3 == null) {
                                                                                    arrayList3 = new ArrayList();
                                                                                }
                                                                                arrayList3.add(rt2Var3);
                                                                            }
                                                                        }
                                                                        if (arrayList3 == null) {
                                                                            arrayList3 = Collections.EMPTY_LIST;
                                                                        }
                                                                        if (arrayList3.isEmpty()) {
                                                                            o69Var = new m69(0L, 0L, 0L, 0L);
                                                                        } else {
                                                                            rt2Var2 = (rt2) arrayList3.get(0);
                                                                            if (ch3.r(str2)) {
                                                                                u69VarA = u69.a(rt2Var2.a);
                                                                            } else {
                                                                                u69VarA = u69.a(rt2Var2.a);
                                                                            }
                                                                        }
                                                                    } else {
                                                                        v69VarC2 = w69VarE.c(Uri.parse(strReplace), new kn3(w69VarE, 1));
                                                                        qw2Var.t();
                                                                        arrayList3 = null;
                                                                        while (r5.hasNext()) {
                                                                            str3 = rt2Var3.b.J;
                                                                            if (TextUtils.isEmpty(str3)) {
                                                                                zEquals2 = false;
                                                                            } else {
                                                                                zEquals2 = v69VarC2.equals(w69VarE.c(Uri.parse(str3), new kn3(w69VarE, 1)));
                                                                            }
                                                                            if (!zEquals2) {
                                                                                if (arrayList3 == null) {
                                                                                    arrayList3 = new ArrayList();
                                                                                }
                                                                                arrayList3.add(rt2Var3);
                                                                            }
                                                                        }
                                                                        if (arrayList3 == null) {
                                                                            arrayList3 = Collections.EMPTY_LIST;
                                                                        }
                                                                        if (arrayList3.isEmpty()) {
                                                                            o69Var = new m69(0L, 0L, 0L, 0L);
                                                                        } else {
                                                                            rt2Var2 = (rt2) arrayList3.get(0);
                                                                            if (ch3.r(str2)) {
                                                                                u69VarA = u69.a(rt2Var2.a);
                                                                            } else {
                                                                                u69VarA = u69.a(rt2Var2.a);
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            } else if (pathSegments2 == null && pathSegments2.size() == 4 && pathSegments2.get(0).equals(DatabaseHelper.COMPRESSED_COLUMN_NAME)) {
                                                                try {
                                                                    j3 = Long.parseLong(pathSegments2.get(1));
                                                                } catch (NumberFormatException unused4) {
                                                                    j3 = -1;
                                                                }
                                                                Long lA6 = fda.a(pathSegments2.get(2));
                                                                Long lA7 = fda.a(pathSegments2.get(3));
                                                                if (j3 == -1 || lA6 == null || lA7 == null) {
                                                                    v69VarC2 = w69VarE.c(Uri.parse(strReplace), new kn3(w69VarE, 1));
                                                                    qw2Var.t();
                                                                    arrayList3 = null;
                                                                    while (r5.hasNext()) {
                                                                        str3 = rt2Var3.b.J;
                                                                        if (TextUtils.isEmpty(str3)) {
                                                                            zEquals2 = false;
                                                                        } else {
                                                                            zEquals2 = v69VarC2.equals(w69VarE.c(Uri.parse(str3), new kn3(w69VarE, 1)));
                                                                        }
                                                                        if (!zEquals2) {
                                                                            if (arrayList3 == null) {
                                                                                arrayList3 = new ArrayList();
                                                                            }
                                                                            arrayList3.add(rt2Var3);
                                                                        }
                                                                    }
                                                                    if (arrayList3 == null) {
                                                                        arrayList3 = Collections.EMPTY_LIST;
                                                                    }
                                                                    if (arrayList3.isEmpty()) {
                                                                        o69Var = new m69(0L, 0L, 0L, 0L);
                                                                    } else {
                                                                        rt2Var2 = (rt2) arrayList3.get(0);
                                                                        if (ch3.r(str2)) {
                                                                            u69VarA = u69.a(rt2Var2.a);
                                                                        } else {
                                                                            u69VarA = u69.a(rt2Var2.a);
                                                                        }
                                                                    }
                                                                } else {
                                                                    u69VarA = new k69(string);
                                                                }
                                                                break;
                                                            } else {
                                                                v69VarC2 = w69VarE.c(Uri.parse(strReplace), new kn3(w69VarE, 1));
                                                                qw2Var.t();
                                                                arrayList3 = null;
                                                                while (r5.hasNext()) {
                                                                    try {
                                                                        str3 = rt2Var3.b.J;
                                                                        if (TextUtils.isEmpty(str3)) {
                                                                            zEquals2 = false;
                                                                        } else {
                                                                            zEquals2 = v69VarC2.equals(w69VarE.c(Uri.parse(str3), new kn3(w69VarE, 1)));
                                                                        }
                                                                        if (!zEquals2) {
                                                                            if (arrayList3 == null) {
                                                                                try {
                                                                                    arrayList3 = new ArrayList();
                                                                                } catch (Exception e) {
                                                                                    e = e;
                                                                                    gm0.s("qw2", "exception in traverse predicate: %s", e.getMessage());
                                                                                }
                                                                            }
                                                                            arrayList3.add(rt2Var3);
                                                                        }
                                                                    } catch (Exception e2) {
                                                                        e = e2;
                                                                    }
                                                                }
                                                                if (arrayList3 == null) {
                                                                    arrayList3 = Collections.EMPTY_LIST;
                                                                }
                                                                if (arrayList3.isEmpty()) {
                                                                    o69Var = new m69(0L, 0L, 0L, 0L);
                                                                } else {
                                                                    rt2Var2 = (rt2) arrayList3.get(0);
                                                                    if (ch3.r(str2) || (lA = fda.a(str2)) == null) {
                                                                        u69VarA = u69.a(rt2Var2.a);
                                                                    } else {
                                                                        o69Var = new u69(rt2Var2.a, lA.longValue(), 0L, 0L);
                                                                    }
                                                                }
                                                            }
                                                            return obj;
                                                        }
                                                        u69VarA = new j69(string);
                                                    }
                                                }
                                                r69Var = u69VarA;
                                            }
                                            break;
                                        }
                                    } else {
                                        obj = obj3;
                                    }
                                    r69Var = null;
                                }
                                r69Var = o69Var;
                            }
                            String str6 = c59Var.s;
                            a4c a4cVar = gm0.f;
                            if (a4cVar != null) {
                                je9 je9Var = je9.d;
                                if (a4cVar.b(je9Var)) {
                                    a4cVar.c(je9Var, str6, "parse " + uri4 + ", deeplinkdata = " + r69Var, null);
                                }
                            }
                            if (r69Var == null) {
                                gm0.Y(c59Var.s, "parse deeplink openBrowser: " + uri4);
                                w39 w39Var = new w39(uri4);
                                x49Var2.d = null;
                                x49Var2.e = null;
                                x49Var2.f = null;
                                x49Var2.l = 6;
                                if (njdVar3.f.a(x49Var2, w39Var) == obj2) {
                                    return obj2;
                                }
                            } else if (r69Var instanceof j69) {
                                String str7 = ((j69) r69Var).e;
                                x49Var2.d = null;
                                x49Var2.e = null;
                                x49Var2.f = null;
                                x49Var2.l = 7;
                                Object objA = njdVar3.f.a(x49Var2, new h49(str7));
                                if (objA != obj2) {
                                    objA = obj;
                                }
                                if (objA == obj2) {
                                    return obj2;
                                }
                            } else if (r69Var instanceof o69) {
                                u39 u39Var3 = new u39(null);
                                x49Var2.d = null;
                                x49Var2.e = null;
                                x49Var2.f = null;
                                x49Var2.l = 8;
                                if (njdVar3.f.a(x49Var2, u39Var3) == obj2) {
                                    return obj2;
                                }
                            } else if (r69Var instanceof p69) {
                                z39 z39Var = z39.a;
                                x49Var2.d = null;
                                x49Var2.e = null;
                                x49Var2.f = null;
                                x49Var2.l = 9;
                                if (njdVar3.f.a(x49Var2, z39Var) == obj2) {
                                    return obj2;
                                }
                            } else if (r69Var instanceof q69) {
                                Uri uri5 = ((q69) r69Var).e;
                                x49Var2.d = null;
                                x49Var2.e = null;
                                x49Var2.f = null;
                                x49Var2.l = 10;
                                if (c59Var.l(njdVar3, r69Var, uri5, x49Var2) == obj2) {
                                    return obj2;
                                }
                            } else if (r69Var instanceof l69) {
                                x39 x39Var = new x39(((l69) r69Var).e);
                                x49Var2.d = null;
                                x49Var2.e = null;
                                x49Var2.f = null;
                                x49Var2.l = 11;
                                if (njdVar3.f.a(x49Var2, x39Var) == obj2) {
                                    return obj2;
                                }
                            } else if (r69Var instanceof t69) {
                                x49Var2.d = null;
                                x49Var2.e = null;
                                x49Var2.f = null;
                                x49Var2.l = 12;
                                if (c59Var.i(njdVar3, (t69) r69Var, x49Var2) == obj2) {
                                    return obj2;
                                }
                            } else if (r69Var instanceof n69) {
                                String str8 = ((n69) r69Var).e;
                                x49Var2.d = null;
                                x49Var2.e = null;
                                x49Var2.f = null;
                                x49Var2.l = 13;
                                if (c59Var.j(njdVar3, str8, x49Var2) == obj2) {
                                    return obj2;
                                }
                            } else if (r69Var instanceof k69) {
                                String str9 = ((k69) r69Var).e;
                                x49Var2.d = null;
                                x49Var2.e = null;
                                x49Var2.f = null;
                                x49Var2.l = 14;
                                if (c59Var.j(njdVar3, str9, x49Var2) == obj2) {
                                    return obj2;
                                }
                            } else {
                                long j6 = r69Var.a;
                                if (j6 == 0 && r69Var.b <= 0 && r69Var.c <= 0 && r69Var.d <= 0) {
                                    x49Var2.d = null;
                                    x49Var2.e = null;
                                    x49Var2.f = null;
                                    x49Var2.l = 15;
                                    if (c59Var.l(njdVar3, r69Var, uri4, x49Var2) == obj2) {
                                        return obj2;
                                    }
                                } else {
                                    long j7 = r69Var.b;
                                    if (j7 > 0) {
                                        try {
                                            x49Var2.d = njdVar3;
                                            x49Var2.e = uri4;
                                            x49Var2.f = r69Var;
                                            x49Var2.g = null;
                                            x49Var2.i = 0;
                                            x49Var2.l = 16;
                                            uri2 = uri4;
                                            try {
                                                Object objB = c59Var.b(njdVar3, uri2, j6, 0L, j7, x49Var2);
                                                x49Var2 = x49Var2;
                                                if (objB == obj2) {
                                                    return obj2;
                                                }
                                                uri3 = uri2;
                                                poeVar = obj;
                                            } catch (Throwable th) {
                                                th = th;
                                                x49Var2 = x49Var2;
                                                uri3 = uri2;
                                                poeVar = new poe(th);
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                            uri2 = uri4;
                                        }
                                        njdVar2 = njdVar3;
                                        u69Var = r69Var;
                                        thA = roe.a(poeVar);
                                        if (thA != null) {
                                            xn3 xn3VarC = c59Var.c();
                                            long j8 = u69Var.a;
                                            x49Var2.d = njdVar2;
                                            x49Var2.e = uri3;
                                            x49Var2.f = u69Var;
                                            x49Var2.g = poeVar;
                                            x49Var2.h = thA;
                                            x49Var2.i = 0;
                                            x49Var2.l = 17;
                                            objH = xn3VarC.h(j8);
                                            if (objH == obj2) {
                                                return obj2;
                                            }
                                            i3 = 0;
                                            if (((rt2) objH) != null) {
                                                j5 = u69Var.a;
                                                x49Var2.d = null;
                                                x49Var2.e = null;
                                                x49Var2.f = null;
                                                x49Var2.g = poeVar;
                                                x49Var2.h = null;
                                                x49Var2.i = i3;
                                                x49Var2.l = 18;
                                                if (c59Var.n(njdVar2, uri3, j5, 0L, x49Var2) == obj2) {
                                                    return obj2;
                                                }
                                            } else {
                                                gm0.V(c59Var.s, "chat not found", thA);
                                                x49Var2.d = null;
                                                x49Var2.e = null;
                                                x49Var2.f = null;
                                                x49Var2.g = poeVar;
                                                x49Var2.h = null;
                                                x49Var2.i = i3;
                                                x49Var2.l = 19;
                                                if (njdVar2.f.a(x49Var2, k39Var) == obj2) {
                                                    return obj2;
                                                }
                                            }
                                        }
                                    } else {
                                        long j9 = r69Var.d;
                                        if (j9 > 0) {
                                            x49Var2.d = null;
                                            x49Var2.e = null;
                                            x49Var2.f = null;
                                            x49Var2.l = 20;
                                            Object objA2 = njdVar3.f.a(x49Var2, new i49(j9));
                                            if (objA2 != obj2) {
                                                objA2 = obj;
                                            }
                                            if (objA2 == obj2) {
                                                return obj2;
                                            }
                                        } else {
                                            long j10 = r69Var.c;
                                            if (j10 > 0) {
                                                x49Var2.d = null;
                                                x49Var2.e = null;
                                                x49Var2.f = null;
                                                x49Var2.l = 21;
                                                if (c59Var.m(njdVar3, uri4, j10, null, x49Var2) == obj2) {
                                                    return obj2;
                                                }
                                            } else {
                                                x49Var2.d = null;
                                                x49Var2.e = null;
                                                x49Var2.f = null;
                                                x49Var2.l = 22;
                                                if (c59Var.n(njdVar, uri4, j6, 0L, x49Var2) == obj2) {
                                                    return obj2;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            return obj;
                        }
                        ((o65) c59Var.n.getValue()).getClass();
                        ylc ylcVarA2 = ((x65) baVar.invoke(ha9Var)).a.a(uri4);
                        if (ylcVarA2 != null && (m65Var = (m65) ylcVarA2.a) != null) {
                            zContainsAll = qe7.D(uri4).keySet().containsAll(m65Var.c);
                        }
                        if (zContainsAll) {
                            s39 s39Var = new s39(uri4, c59Var.d(uri4));
                            x49Var2.d = null;
                            x49Var2.e = null;
                            x49Var2.l = 4;
                            if (njdVar3.f.a(x49Var2, s39Var) == obj2) {
                                return obj2;
                            }
                        } else {
                            x49Var2.d = null;
                            x49Var2.e = null;
                            x49Var2.l = 5;
                            if (njdVar3.f.a(x49Var2, k39Var) == obj2) {
                                return obj2;
                            }
                        }
                    }
                }
                return obj3;
            case 1:
                ch3.d0(objH);
                return obj3;
            case 2:
                ch3.d0(objH);
                return obj3;
            case 3:
                ch3.d0(objH);
                return obj3;
            case 4:
                ch3.d0(objH);
                return obj3;
            case 5:
                ch3.d0(objH);
                return obj3;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 18:
            case 19:
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
            case 21:
            case 22:
                ch3.d0(objH);
                obj = obj3;
                return obj;
            case 16:
                u69 u69Var2 = x49Var2.f;
                uri2 = x49Var2.e;
                njd njdVar4 = x49Var2.d;
                try {
                    ch3.d0(objH);
                    k39Var = k39Var;
                    obj = obj3;
                    r69Var = u69Var2;
                    njdVar3 = njdVar4;
                    uri3 = uri2;
                    poeVar = obj;
                } catch (Throwable th3) {
                    th = th3;
                    k39Var = k39Var;
                    obj = obj3;
                    r69Var = u69Var2;
                    njdVar3 = njdVar4;
                    uri3 = uri2;
                    poeVar = new poe(th);
                }
                njdVar2 = njdVar3;
                u69Var = r69Var;
                thA = roe.a(poeVar);
                if (thA != null) {
                    xn3 xn3VarC2 = c59Var.c();
                    long j11 = u69Var.a;
                    x49Var2.d = njdVar2;
                    x49Var2.e = uri3;
                    x49Var2.f = u69Var;
                    x49Var2.g = poeVar;
                    x49Var2.h = thA;
                    x49Var2.i = 0;
                    x49Var2.l = 17;
                    objH = xn3VarC2.h(j11);
                    if (objH == obj2) {
                        return obj2;
                    }
                    i3 = 0;
                    if (((rt2) objH) != null) {
                        j5 = u69Var.a;
                        x49Var2.d = null;
                        x49Var2.e = null;
                        x49Var2.f = null;
                        x49Var2.g = poeVar;
                        x49Var2.h = null;
                        x49Var2.i = i3;
                        x49Var2.l = 18;
                        if (c59Var.n(njdVar2, uri3, j5, 0L, x49Var2) == obj2) {
                            return obj2;
                        }
                    } else {
                        gm0.V(c59Var.s, "chat not found", thA);
                        x49Var2.d = null;
                        x49Var2.e = null;
                        x49Var2.f = null;
                        x49Var2.g = poeVar;
                        x49Var2.h = null;
                        x49Var2.i = i3;
                        x49Var2.l = 19;
                        if (njdVar2.f.a(x49Var2, k39Var) == obj2) {
                            return obj2;
                        }
                    }
                }
                return obj;
            case 17:
                i3 = x49Var2.i;
                thA = x49Var2.h;
                poeVar = x49Var2.g;
                u69Var = x49Var2.f;
                uri3 = x49Var2.e;
                njdVar2 = x49Var2.d;
                ch3.d0(objH);
                k39Var = k39Var;
                obj = obj3;
                if (((rt2) objH) != null) {
                    j5 = u69Var.a;
                    x49Var2.d = null;
                    x49Var2.e = null;
                    x49Var2.f = null;
                    x49Var2.g = poeVar;
                    x49Var2.h = null;
                    x49Var2.i = i3;
                    x49Var2.l = 18;
                    if (c59Var.n(njdVar2, uri3, j5, 0L, x49Var2) == obj2) {
                        return obj2;
                    }
                } else {
                    gm0.V(c59Var.s, "chat not found", thA);
                    x49Var2.d = null;
                    x49Var2.e = null;
                    x49Var2.f = null;
                    x49Var2.g = poeVar;
                    x49Var2.h = null;
                    x49Var2.i = i3;
                    x49Var2.l = 19;
                    if (njdVar2.f.a(x49Var2, k39Var) == obj2) {
                        return obj2;
                    }
                }
                return obj;
            default:
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:33:0x00de  */
    /* JADX WARN: Code duplicated, block: B:36:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:39:0x0100  */
    /* JADX WARN: Code duplicated, block: B:42:0x0121  */
    /* JADX WARN: Code duplicated, block: B:44:0x0137  */
    /* JADX WARN: Code duplicated, block: B:47:0x0160  */
    /* JADX WARN: Code duplicated, block: B:50:0x017f  */
    /* JADX WARN: Code duplicated, block: B:53:0x01aa A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:54:0x01ab A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    public final Object b(njd njdVar, Uri uri, long j, long j2, long j3, nq4 nq4Var) {
        o49 o49Var;
        long j4;
        Uri uri2;
        long j5;
        njd njdVar2;
        long j6;
        sfa sfaVar;
        rt2 rt2VarH;
        Uri uri3;
        sfa sfaVar2;
        rt2 rt2Var;
        o49 o49Var2;
        Uri uri4;
        njd njdVar3;
        rt2 rt2Var2;
        sfa sfaVar3;
        long j7;
        long j8;
        long j9;
        mg5 mg5Var;
        if (nq4Var instanceof o49) {
            o49Var = (o49) nq4Var;
            int i = o49Var.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                o49Var.m = i - Integer.MIN_VALUE;
            } else {
                o49Var = new o49(this, nq4Var);
            }
        } else {
            o49Var = new o49(this, nq4Var);
        }
        o49 o49Var3 = o49Var;
        Object obj = o49Var3.k;
        int i2 = o49Var3.m;
        k39 k39Var = k39.a;
        String str = this.s;
        sbi sbiVar = sbi.a;
        Object obj2 = hu4.a;
        switch (i2) {
            case 0:
                ch3.d0(obj);
                xt4 xt4VarB = ((n0c) ((xhh) this.e.getValue())).b();
                j4 = j;
                p49 p49Var = new p49(j2, this, j3, j4, null);
                o49Var3.d = njdVar;
                o49Var3.e = uri;
                o49Var3.h = j4;
                o49Var3.i = j2;
                o49Var3.j = j3;
                o49Var3.m = 1;
                Object objK0 = yab.K0(xt4VarB, p49Var, o49Var3);
                if (objK0 != obj2) {
                    uri2 = uri;
                    j5 = j2;
                    njdVar2 = njdVar;
                    obj = objK0;
                    j6 = j3;
                    sfaVar = (sfa) obj;
                    if (sfaVar == null) {
                        gm0.Y(str, "message not found!");
                        o49Var3.d = null;
                        o49Var3.e = null;
                        o49Var3.f = null;
                        o49Var3.h = j4;
                        o49Var3.i = j5;
                        o49Var3.j = j6;
                        o49Var3.m = 2;
                        if (njdVar2.f.a(o49Var3, k39Var) == obj2) {
                            return sbiVar;
                        }
                    } else {
                        xn3 xn3VarC = c();
                        o49Var3.d = njdVar2;
                        o49Var3.e = uri2;
                        o49Var3.f = sfaVar;
                        o49Var3.h = j4;
                        o49Var3.i = j5;
                        o49Var3.j = j6;
                        o49Var3.m = 3;
                        rt2VarH = xn3VarC.h(j4);
                        if (rt2VarH != obj2) {
                            uri3 = uri2;
                            sfaVar2 = sfaVar;
                            obj = rt2VarH;
                            rt2Var = (rt2) obj;
                            if (rt2Var == null) {
                                gm0.Y(str, "chat not found");
                                o49Var3.d = null;
                                o49Var3.e = null;
                                o49Var3.f = null;
                                o49Var3.g = null;
                                o49Var3.h = j4;
                                o49Var3.i = j5;
                                o49Var3.j = j6;
                                o49Var3.m = 4;
                                if (njdVar2.f.a(o49Var3, k39Var) == obj2) {
                                    return sbiVar;
                                }
                            } else {
                                if (((ex2) sb8.w(sfaVar2.c, rt2Var.b.n.e(sfaVar2.H)).b) != null) {
                                    j7 = rt2Var.a;
                                    j8 = sfaVar2.c;
                                    o49Var3.d = null;
                                    o49Var3.e = null;
                                    o49Var3.f = null;
                                    o49Var3.g = null;
                                    o49Var3.h = j4;
                                    o49Var3.i = j5;
                                    o49Var3.j = j6;
                                    o49Var3.m = 5;
                                    if (n(njdVar2, uri3, j7, j8, o49Var3) != obj2) {
                                        return sbiVar;
                                    }
                                } else {
                                    o49Var2 = o49Var3;
                                    uri4 = uri3;
                                    njdVar3 = njdVar2;
                                    o49Var2.d = njdVar3;
                                    o49Var2.e = uri4;
                                    o49Var2.f = sfaVar2;
                                    o49Var2.g = rt2Var;
                                    o49Var2.h = j4;
                                    o49Var2.i = j5;
                                    o49Var2.j = j6;
                                    o49Var2.m = 6;
                                    if (njdVar3.f.a(o49Var2, b49.a) != obj2) {
                                        rt2Var2 = rt2Var;
                                        sfaVar3 = sfaVar2;
                                        j9 = sfaVar3.c;
                                        mg5Var = sfaVar3.H;
                                        o49Var2.d = null;
                                        o49Var2.e = null;
                                        o49Var2.f = null;
                                        o49Var2.g = null;
                                        o49Var2.h = j4;
                                        o49Var2.i = j5;
                                        o49Var2.j = j6;
                                        o49Var2.m = 7;
                                        if (h(njdVar3, uri4, rt2Var2, j9, mg5Var, o49Var2) != obj2) {
                                            return sbiVar;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return obj2;
            case 1:
                j6 = o49Var3.j;
                j5 = o49Var3.i;
                j4 = o49Var3.h;
                uri2 = o49Var3.e;
                njdVar2 = o49Var3.d;
                ch3.d0(obj);
                sfaVar = (sfa) obj;
                if (sfaVar == null) {
                    gm0.Y(str, "message not found!");
                    o49Var3.d = null;
                    o49Var3.e = null;
                    o49Var3.f = null;
                    o49Var3.h = j4;
                    o49Var3.i = j5;
                    o49Var3.j = j6;
                    o49Var3.m = 2;
                    if (njdVar2.f.a(o49Var3, k39Var) == obj2) {
                        return sbiVar;
                    }
                } else {
                    xn3 xn3VarC2 = c();
                    o49Var3.d = njdVar2;
                    o49Var3.e = uri2;
                    o49Var3.f = sfaVar;
                    o49Var3.h = j4;
                    o49Var3.i = j5;
                    o49Var3.j = j6;
                    o49Var3.m = 3;
                    rt2VarH = xn3VarC2.h(j4);
                    if (rt2VarH != obj2) {
                        uri3 = uri2;
                        sfaVar2 = sfaVar;
                        obj = rt2VarH;
                        rt2Var = (rt2) obj;
                        if (rt2Var == null) {
                            gm0.Y(str, "chat not found");
                            o49Var3.d = null;
                            o49Var3.e = null;
                            o49Var3.f = null;
                            o49Var3.g = null;
                            o49Var3.h = j4;
                            o49Var3.i = j5;
                            o49Var3.j = j6;
                            o49Var3.m = 4;
                            if (njdVar2.f.a(o49Var3, k39Var) == obj2) {
                                return sbiVar;
                            }
                        } else {
                            if (((ex2) sb8.w(sfaVar2.c, rt2Var.b.n.e(sfaVar2.H)).b) != null) {
                                j7 = rt2Var.a;
                                j8 = sfaVar2.c;
                                o49Var3.d = null;
                                o49Var3.e = null;
                                o49Var3.f = null;
                                o49Var3.g = null;
                                o49Var3.h = j4;
                                o49Var3.i = j5;
                                o49Var3.j = j6;
                                o49Var3.m = 5;
                                if (n(njdVar2, uri3, j7, j8, o49Var3) != obj2) {
                                    return sbiVar;
                                }
                            } else {
                                o49Var2 = o49Var3;
                                uri4 = uri3;
                                njdVar3 = njdVar2;
                                o49Var2.d = njdVar3;
                                o49Var2.e = uri4;
                                o49Var2.f = sfaVar2;
                                o49Var2.g = rt2Var;
                                o49Var2.h = j4;
                                o49Var2.i = j5;
                                o49Var2.j = j6;
                                o49Var2.m = 6;
                                if (njdVar3.f.a(o49Var2, b49.a) != obj2) {
                                    rt2Var2 = rt2Var;
                                    sfaVar3 = sfaVar2;
                                    j9 = sfaVar3.c;
                                    mg5Var = sfaVar3.H;
                                    o49Var2.d = null;
                                    o49Var2.e = null;
                                    o49Var2.f = null;
                                    o49Var2.g = null;
                                    o49Var2.h = j4;
                                    o49Var2.i = j5;
                                    o49Var2.j = j6;
                                    o49Var2.m = 7;
                                    if (h(njdVar3, uri4, rt2Var2, j9, mg5Var, o49Var2) != obj2) {
                                        return sbiVar;
                                    }
                                }
                            }
                        }
                    }
                }
                return obj2;
            case 2:
                ch3.d0(obj);
                return sbiVar;
            case 3:
                j6 = o49Var3.j;
                j5 = o49Var3.i;
                j4 = o49Var3.h;
                sfaVar2 = o49Var3.f;
                uri3 = o49Var3.e;
                njdVar2 = o49Var3.d;
                ch3.d0(obj);
                rt2Var = (rt2) obj;
                if (rt2Var == null) {
                    gm0.Y(str, "chat not found");
                    o49Var3.d = null;
                    o49Var3.e = null;
                    o49Var3.f = null;
                    o49Var3.g = null;
                    o49Var3.h = j4;
                    o49Var3.i = j5;
                    o49Var3.j = j6;
                    o49Var3.m = 4;
                    if (njdVar2.f.a(o49Var3, k39Var) == obj2) {
                        return obj2;
                    }
                    return sbiVar;
                }
                if (((ex2) sb8.w(sfaVar2.c, rt2Var.b.n.e(sfaVar2.H)).b) != null) {
                    j7 = rt2Var.a;
                    j8 = sfaVar2.c;
                    o49Var3.d = null;
                    o49Var3.e = null;
                    o49Var3.f = null;
                    o49Var3.g = null;
                    o49Var3.h = j4;
                    o49Var3.i = j5;
                    o49Var3.j = j6;
                    o49Var3.m = 5;
                    if (n(njdVar2, uri3, j7, j8, o49Var3) != obj2) {
                        return sbiVar;
                    }
                } else {
                    o49Var2 = o49Var3;
                    uri4 = uri3;
                    njdVar3 = njdVar2;
                    o49Var2.d = njdVar3;
                    o49Var2.e = uri4;
                    o49Var2.f = sfaVar2;
                    o49Var2.g = rt2Var;
                    o49Var2.h = j4;
                    o49Var2.i = j5;
                    o49Var2.j = j6;
                    o49Var2.m = 6;
                    if (njdVar3.f.a(o49Var2, b49.a) != obj2) {
                        rt2Var2 = rt2Var;
                        sfaVar3 = sfaVar2;
                        j9 = sfaVar3.c;
                        mg5Var = sfaVar3.H;
                        o49Var2.d = null;
                        o49Var2.e = null;
                        o49Var2.f = null;
                        o49Var2.g = null;
                        o49Var2.h = j4;
                        o49Var2.i = j5;
                        o49Var2.j = j6;
                        o49Var2.m = 7;
                        if (h(njdVar3, uri4, rt2Var2, j9, mg5Var, o49Var2) != obj2) {
                            return sbiVar;
                        }
                    }
                }
                return obj2;
            case 4:
                ch3.d0(obj);
                return sbiVar;
            case 5:
                ch3.d0(obj);
                return sbiVar;
            case 6:
                j6 = o49Var3.j;
                j5 = o49Var3.i;
                j4 = o49Var3.h;
                rt2 rt2Var3 = o49Var3.g;
                sfaVar3 = o49Var3.f;
                uri4 = o49Var3.e;
                njdVar3 = o49Var3.d;
                ch3.d0(obj);
                rt2Var2 = rt2Var3;
                o49Var2 = o49Var3;
                j9 = sfaVar3.c;
                mg5Var = sfaVar3.H;
                o49Var2.d = null;
                o49Var2.e = null;
                o49Var2.f = null;
                o49Var2.g = null;
                o49Var2.h = j4;
                o49Var2.i = j5;
                o49Var2.j = j6;
                o49Var2.m = 7;
                if (h(njdVar3, uri4, rt2Var2, j9, mg5Var, o49Var2) != obj2) {
                    return obj2;
                }
                return sbiVar;
            case 7:
                ch3.d0(obj);
                return sbiVar;
            default:
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }

    public final xn3 c() {
        return (xn3) this.f.getValue();
    }

    public final String d(Uri uri) {
        if (uri != null) {
            e().getClass();
            String queryParameter = uri.getQueryParameter("externalCallback");
            if (queryParameter != null && queryParameter.equals("1")) {
                return uri.toString();
            }
        }
        return null;
    }

    public final w69 e() {
        return (w69) this.d.getValue();
    }

    public final xx6 f(Uri uri) {
        lq4 lq4Var = null;
        return e9i.T(new j3(e9i.r(new wz6(this, uri, lq4Var, 9)), 14, new rgi(this, lq4Var, 5)), ((n0c) ((xhh) this.e.getValue())).a());
    }

    public final xx6 g(String str) {
        return f(Uri.parse(str));
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00ab, code lost:
    
        if (n(r1, r2, r13, r11, r7) == r8) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object h(defpackage.njd r23, android.net.Uri r24, defpackage.rt2 r25, long r26, defpackage.mg5 r28, defpackage.nq4 r29) {
        /*
            r22 = this;
            r0 = r22
            r1 = r25
            r2 = r29
            boolean r3 = r2 instanceof defpackage.r49
            if (r3 == 0) goto L1a
            r3 = r2
            r49 r3 = (defpackage.r49) r3
            int r4 = r3.k
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L1a
            int r4 = r4 - r5
            r3.k = r4
        L18:
            r7 = r3
            goto L20
        L1a:
            r49 r3 = new r49
            r3.<init>(r0, r2)
            goto L18
        L20:
            java.lang.Object r2 = r7.i
            int r3 = r7.k
            r4 = 2
            r5 = 1
            r6 = 0
            hu4 r8 = defpackage.hu4.a
            if (r3 == 0) goto L4b
            if (r3 == r5) goto L3a
            if (r3 != r4) goto L34
            defpackage.ch3.d0(r2)
            goto Lae
        L34:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ore.k(r0)
            return r6
        L3a:
            long r9 = r7.h
            long r11 = r7.g
            rt2 r1 = r7.f
            android.net.Uri r3 = r7.e
            njd r5 = r7.d
            defpackage.ch3.d0(r2)
            r2 = r3
            r3 = r1
            r1 = r5
            goto L97
        L4b:
            defpackage.ch3.d0(r2)
            ny8 r2 = r0.g
            java.lang.Object r2 = r2.getValue()
            r9 = r2
            iz2 r9 = (defpackage.iz2) r9
            long r10 = r1.a
            nx2 r2 = r1.b
            long r12 = r2.a
            long r16 = r25.t(r26, r28)
            r18 = 0
            r21 = 1
            r14 = r26
            r20 = r28
            long r9 = defpackage.iz2.b(r9, r10, r12, r14, r16, r18, r20, r21)
            ny8 r2 = r0.h
            java.lang.Object r2 = r2.getValue()
            hz2 r2 = (defpackage.hz2) r2
            pzf r2 = r2.a
            n50 r3 = new n50
            r3.<init>(r2, r9, r5)
            r2 = r23
            r7.d = r2
            r11 = r24
            r7.e = r11
            r7.f = r1
            r7.g = r14
            r7.h = r9
            r7.k = r5
            java.lang.Object r3 = defpackage.e9i.N(r3, r7)
            if (r3 != r8) goto L93
            goto Lad
        L93:
            r3 = r1
            r1 = r2
            r2 = r11
            r11 = r14
        L97:
            long r13 = r3.a
            r7.d = r6
            r7.e = r6
            r7.f = r6
            r7.g = r11
            r7.h = r9
            r7.k = r4
            r5 = r11
            r3 = r13
            java.lang.Object r0 = r0.n(r1, r2, r3, r5, r7)
            if (r0 != r8) goto Lae
        Lad:
            return r8
        Lae:
            sbi r0 = defpackage.sbi.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c59.h(njd, android.net.Uri, rt2, long, mg5, nq4):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0084 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:31:0x0085 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object i(njd njdVar, t69 t69Var, nq4 nq4Var) {
        s49 s49Var;
        if (nq4Var instanceof s49) {
            s49Var = (s49) nq4Var;
            int i = s49Var.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                s49Var.g = i - Integer.MIN_VALUE;
            } else {
                s49Var = new s49(this, nq4Var);
            }
        } else {
            s49Var = new s49(this, nq4Var);
        }
        Object objM0 = s49Var.e;
        int i2 = s49Var.g;
        sbi sbiVar = sbi.a;
        lq4 lq4Var = null;
        hu4 hu4Var = hu4.a;
        if (i2 == 0) {
            ch3.d0(objM0);
            String str = t69Var.e;
            ghb ghbVar = ew5.b;
            long jO = qe7.O(3, lw5.SECONDS);
            v49 v49Var = new v49(this, str, lq4Var, 0);
            s49Var.d = njdVar;
            s49Var.g = 1;
            objM0 = lvb.M0(jO, v49Var, s49Var);
            if (objM0 != hu4Var) {
            }
            return hu4Var;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                ch3.d0(objM0);
                return sbiVar;
            }
            if (i2 == 3) {
                ch3.d0(objM0);
                return sbiVar;
            }
            ore.k("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        njdVar = s49Var.d;
        ch3.d0(objM0);
        r17 r17Var = (r17) objM0;
        if (r17Var == null) {
            s49Var.d = null;
            s49Var.g = 3;
            if (njdVar.f.a(s49Var, k49.a) == hu4Var) {
                return hu4Var;
            }
            return sbiVar;
        }
        x39 x39Var = new x39(r17Var.a);
        s49Var.d = null;
        s49Var.g = 2;
        if (njdVar.f.a(s49Var, x39Var) == hu4Var) {
            return hu4Var;
        }
        return sbiVar;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x023e  */
    /* JADX WARN: Code duplicated, block: B:42:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:45:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:48:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:50:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:53:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:55:0x0105  */
    /* JADX WARN: Code duplicated, block: B:58:0x0118  */
    /* JADX WARN: Code duplicated, block: B:60:0x0120  */
    /* JADX WARN: Code duplicated, block: B:63:0x0133  */
    /* JADX WARN: Code duplicated, block: B:65:0x013b  */
    /* JADX WARN: Code duplicated, block: B:68:0x014e  */
    /* JADX WARN: Code duplicated, block: B:70:0x0152  */
    /* JADX WARN: Code duplicated, block: B:73:0x0173 A[PHI: r0
  0x0173: PHI (r0v21 njd) = (r0v3 njd), (r0v24 njd) binds: [B:71:0x016f, B:23:0x004c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:76:0x0187  */
    /* JADX WARN: Code duplicated, block: B:78:0x018b  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:81:0x01ac A[PHI: r0
  0x01ac: PHI (r0v25 njd) = (r0v3 njd), (r0v28 njd) binds: [B:79:0x01a8, B:20:0x0041] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:84:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:86:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:89:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:91:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:94:0x0214  */
    /* JADX WARN: Code duplicated, block: B:96:0x0218  */
    /* JADX WARN: Code duplicated, block: B:98:0x023c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:99:0x023d A[RETURN] */
    public final Object j(njd njdVar, String str, nq4 nq4Var) {
        w49 w49Var;
        String str2;
        njd njdVar2;
        sl7 sl7Var;
        d49 d49Var;
        c49 c49Var;
        c49 c49Var2;
        c49 c49Var3;
        c49 c49Var4;
        njd njdVar3 = njdVar;
        if (nq4Var instanceof w49) {
            w49Var = (w49) nq4Var;
            int i = w49Var.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                w49Var.h = i - Integer.MIN_VALUE;
            } else {
                w49Var = new w49(this, nq4Var);
            }
        } else {
            w49Var = new w49(this, nq4Var);
        }
        Object objK0 = w49Var.f;
        int i2 = w49Var.h;
        int i3 = 1;
        sbi sbiVar = sbi.a;
        lq4 lq4Var = null;
        hu4 hu4Var = hu4.a;
        switch (i2) {
            case 0:
                ch3.d0(objK0);
                w49Var.d = njdVar3;
                str2 = str;
                w49Var.e = str2;
                w49Var.h = 1;
                if (njdVar3.f.a(w49Var, b49.a) != hu4Var) {
                    String string = r5h.y1(k(Uri.parse(str2)).toString()).toString();
                    xt4 xt4VarB = ((n0c) ((xhh) this.e.getValue())).b();
                    v49 v49Var = new v49(this, string, lq4Var, i3);
                    w49Var.d = njdVar3;
                    w49Var.e = null;
                    w49Var.h = 2;
                    objK0 = yab.K0(xt4VarB, v49Var, w49Var);
                    if (objK0 != hu4Var) {
                        njdVar2 = njdVar3;
                        sl7Var = (sl7) objK0;
                        if (cqk.d(sl7Var, ol7.d)) {
                            w49Var.d = null;
                            w49Var.e = null;
                            w49Var.h = 3;
                            if (njdVar2.f.a(w49Var, k39.a) == hu4Var) {
                                return sbiVar;
                            }
                        } else if (cqk.d(sl7Var, ol7.a)) {
                            w49Var.d = null;
                            w49Var.e = null;
                            w49Var.h = 4;
                            if (njdVar2.f.a(w49Var, l39.a) == hu4Var) {
                                return sbiVar;
                            }
                        } else if (cqk.d(sl7Var, ol7.b)) {
                            w49Var.d = null;
                            w49Var.e = null;
                            w49Var.h = 5;
                            if (njdVar2.f.a(w49Var, p39.a) == hu4Var) {
                                return sbiVar;
                            }
                        } else if (cqk.d(sl7Var, ol7.c)) {
                            w49Var.d = null;
                            w49Var.e = null;
                            w49Var.h = 6;
                            if (njdVar2.f.a(w49Var, q39.a) == hu4Var) {
                                return sbiVar;
                            }
                        } else if (cqk.d(sl7Var, ol7.e)) {
                            w49Var.d = null;
                            w49Var.e = null;
                            w49Var.h = 7;
                            if (njdVar2.f.a(w49Var, j39.a) == hu4Var) {
                                return sbiVar;
                            }
                        } else if (sl7Var instanceof ql7) {
                            c49Var4 = new c49(((ql7) sl7Var).a, 0L, null, null, 12);
                            w49Var.d = njdVar2;
                            w49Var.e = null;
                            w49Var.h = 8;
                            if (njdVar2.f.a(w49Var, c49Var4) != hu4Var) {
                                w49Var.d = null;
                                w49Var.e = null;
                                w49Var.h = 9;
                                if (njdVar2.f.a(w49Var, o39.a) != hu4Var) {
                                    return sbiVar;
                                }
                            }
                        } else if (sl7Var instanceof pl7) {
                            c49Var3 = new c49(((pl7) sl7Var).a, 0L, null, null, 12);
                            w49Var.d = njdVar2;
                            w49Var.e = null;
                            w49Var.h = 10;
                            if (njdVar2.f.a(w49Var, c49Var3) != hu4Var) {
                                w49Var.d = null;
                                w49Var.e = null;
                                w49Var.h = 11;
                                if (njdVar2.f.a(w49Var, n39.a) != hu4Var) {
                                    return sbiVar;
                                }
                            }
                        } else if (sl7Var instanceof rl7) {
                            rl7 rl7Var = (rl7) sl7Var;
                            c49Var2 = new c49(rl7Var.a, rl7Var.b, new Long(rl7Var.c), null, 16);
                            w49Var.d = null;
                            w49Var.e = null;
                            w49Var.h = 12;
                            if (njdVar2.f.a(w49Var, c49Var2) != hu4Var) {
                                return sbiVar;
                            }
                        } else if (sl7Var instanceof ml7) {
                            ml7 ml7Var = (ml7) sl7Var;
                            c49Var = new c49(ml7Var.a, ml7Var.b, new Long(ml7Var.c), null, 16);
                            w49Var.d = null;
                            w49Var.e = null;
                            w49Var.h = 13;
                            if (njdVar2.f.a(w49Var, c49Var) != hu4Var) {
                                return sbiVar;
                            }
                        } else {
                            if (!(sl7Var instanceof nl7)) {
                                ore.o();
                                return null;
                            }
                            nl7 nl7Var = (nl7) sl7Var;
                            d49Var = new d49(nl7Var.a, nl7Var.b, nl7Var.c, nl7Var.d, true, null);
                            w49Var.d = null;
                            w49Var.e = null;
                            w49Var.h = 14;
                            if (njdVar2.f.a(w49Var, d49Var) != hu4Var) {
                                return sbiVar;
                            }
                        }
                    }
                }
                return hu4Var;
            case 1:
                String str3 = w49Var.e;
                njd njdVar4 = w49Var.d;
                ch3.d0(objK0);
                str2 = str3;
                njdVar3 = njdVar4;
                String string2 = r5h.y1(k(Uri.parse(str2)).toString()).toString();
                xt4 xt4VarB2 = ((n0c) ((xhh) this.e.getValue())).b();
                v49 v49Var2 = new v49(this, string2, lq4Var, i3);
                w49Var.d = njdVar3;
                w49Var.e = null;
                w49Var.h = 2;
                objK0 = yab.K0(xt4VarB2, v49Var2, w49Var);
                if (objK0 != hu4Var) {
                    njdVar2 = njdVar3;
                    sl7Var = (sl7) objK0;
                    if (cqk.d(sl7Var, ol7.d)) {
                        w49Var.d = null;
                        w49Var.e = null;
                        w49Var.h = 3;
                        if (njdVar2.f.a(w49Var, k39.a) == hu4Var) {
                            return sbiVar;
                        }
                    } else if (cqk.d(sl7Var, ol7.a)) {
                        w49Var.d = null;
                        w49Var.e = null;
                        w49Var.h = 4;
                        if (njdVar2.f.a(w49Var, l39.a) == hu4Var) {
                            return sbiVar;
                        }
                    } else if (cqk.d(sl7Var, ol7.b)) {
                        w49Var.d = null;
                        w49Var.e = null;
                        w49Var.h = 5;
                        if (njdVar2.f.a(w49Var, p39.a) == hu4Var) {
                            return sbiVar;
                        }
                    } else if (cqk.d(sl7Var, ol7.c)) {
                        w49Var.d = null;
                        w49Var.e = null;
                        w49Var.h = 6;
                        if (njdVar2.f.a(w49Var, q39.a) == hu4Var) {
                            return sbiVar;
                        }
                    } else if (cqk.d(sl7Var, ol7.e)) {
                        w49Var.d = null;
                        w49Var.e = null;
                        w49Var.h = 7;
                        if (njdVar2.f.a(w49Var, j39.a) == hu4Var) {
                            return sbiVar;
                        }
                    } else if (sl7Var instanceof ql7) {
                        c49Var4 = new c49(((ql7) sl7Var).a, 0L, null, null, 12);
                        w49Var.d = njdVar2;
                        w49Var.e = null;
                        w49Var.h = 8;
                        if (njdVar2.f.a(w49Var, c49Var4) != hu4Var) {
                            w49Var.d = null;
                            w49Var.e = null;
                            w49Var.h = 9;
                            if (njdVar2.f.a(w49Var, o39.a) != hu4Var) {
                                return sbiVar;
                            }
                        }
                    } else if (sl7Var instanceof pl7) {
                        c49Var3 = new c49(((pl7) sl7Var).a, 0L, null, null, 12);
                        w49Var.d = njdVar2;
                        w49Var.e = null;
                        w49Var.h = 10;
                        if (njdVar2.f.a(w49Var, c49Var3) != hu4Var) {
                            w49Var.d = null;
                            w49Var.e = null;
                            w49Var.h = 11;
                            if (njdVar2.f.a(w49Var, n39.a) != hu4Var) {
                                return sbiVar;
                            }
                        }
                    } else if (sl7Var instanceof rl7) {
                        rl7 rl7Var2 = (rl7) sl7Var;
                        c49Var2 = new c49(rl7Var2.a, rl7Var2.b, new Long(rl7Var2.c), null, 16);
                        w49Var.d = null;
                        w49Var.e = null;
                        w49Var.h = 12;
                        if (njdVar2.f.a(w49Var, c49Var2) != hu4Var) {
                            return sbiVar;
                        }
                    } else if (sl7Var instanceof ml7) {
                        ml7 ml7Var2 = (ml7) sl7Var;
                        c49Var = new c49(ml7Var2.a, ml7Var2.b, new Long(ml7Var2.c), null, 16);
                        w49Var.d = null;
                        w49Var.e = null;
                        w49Var.h = 13;
                        if (njdVar2.f.a(w49Var, c49Var) != hu4Var) {
                            return sbiVar;
                        }
                    } else {
                        if (!(sl7Var instanceof nl7)) {
                            ore.o();
                            return null;
                        }
                        nl7 nl7Var2 = (nl7) sl7Var;
                        d49Var = new d49(nl7Var2.a, nl7Var2.b, nl7Var2.c, nl7Var2.d, true, null);
                        w49Var.d = null;
                        w49Var.e = null;
                        w49Var.h = 14;
                        if (njdVar2.f.a(w49Var, d49Var) != hu4Var) {
                            return sbiVar;
                        }
                    }
                }
                return hu4Var;
            case 2:
                njdVar2 = w49Var.d;
                ch3.d0(objK0);
                sl7Var = (sl7) objK0;
                if (cqk.d(sl7Var, ol7.d)) {
                    w49Var.d = null;
                    w49Var.e = null;
                    w49Var.h = 3;
                    if (njdVar2.f.a(w49Var, k39.a) == hu4Var) {
                        return hu4Var;
                    }
                    return sbiVar;
                }
                if (cqk.d(sl7Var, ol7.a)) {
                    w49Var.d = null;
                    w49Var.e = null;
                    w49Var.h = 4;
                    if (njdVar2.f.a(w49Var, l39.a) == hu4Var) {
                        return hu4Var;
                    }
                    return sbiVar;
                }
                if (cqk.d(sl7Var, ol7.b)) {
                    w49Var.d = null;
                    w49Var.e = null;
                    w49Var.h = 5;
                    if (njdVar2.f.a(w49Var, p39.a) == hu4Var) {
                        return hu4Var;
                    }
                    return sbiVar;
                }
                if (cqk.d(sl7Var, ol7.c)) {
                    w49Var.d = null;
                    w49Var.e = null;
                    w49Var.h = 6;
                    if (njdVar2.f.a(w49Var, q39.a) == hu4Var) {
                        return hu4Var;
                    }
                    return sbiVar;
                }
                if (cqk.d(sl7Var, ol7.e)) {
                    w49Var.d = null;
                    w49Var.e = null;
                    w49Var.h = 7;
                    if (njdVar2.f.a(w49Var, j39.a) == hu4Var) {
                        return hu4Var;
                    }
                    return sbiVar;
                }
                if (sl7Var instanceof ql7) {
                    c49Var4 = new c49(((ql7) sl7Var).a, 0L, null, null, 12);
                    w49Var.d = njdVar2;
                    w49Var.e = null;
                    w49Var.h = 8;
                    if (njdVar2.f.a(w49Var, c49Var4) != hu4Var) {
                        w49Var.d = null;
                        w49Var.e = null;
                        w49Var.h = 9;
                        if (njdVar2.f.a(w49Var, o39.a) != hu4Var) {
                            return sbiVar;
                        }
                    }
                } else if (sl7Var instanceof pl7) {
                    c49Var3 = new c49(((pl7) sl7Var).a, 0L, null, null, 12);
                    w49Var.d = njdVar2;
                    w49Var.e = null;
                    w49Var.h = 10;
                    if (njdVar2.f.a(w49Var, c49Var3) != hu4Var) {
                        w49Var.d = null;
                        w49Var.e = null;
                        w49Var.h = 11;
                        if (njdVar2.f.a(w49Var, n39.a) != hu4Var) {
                            return sbiVar;
                        }
                    }
                } else if (sl7Var instanceof rl7) {
                    rl7 rl7Var3 = (rl7) sl7Var;
                    c49Var2 = new c49(rl7Var3.a, rl7Var3.b, new Long(rl7Var3.c), null, 16);
                    w49Var.d = null;
                    w49Var.e = null;
                    w49Var.h = 12;
                    if (njdVar2.f.a(w49Var, c49Var2) != hu4Var) {
                        return sbiVar;
                    }
                } else if (sl7Var instanceof ml7) {
                    ml7 ml7Var3 = (ml7) sl7Var;
                    c49Var = new c49(ml7Var3.a, ml7Var3.b, new Long(ml7Var3.c), null, 16);
                    w49Var.d = null;
                    w49Var.e = null;
                    w49Var.h = 13;
                    if (njdVar2.f.a(w49Var, c49Var) != hu4Var) {
                        return sbiVar;
                    }
                } else {
                    if (!(sl7Var instanceof nl7)) {
                        ore.o();
                        return null;
                    }
                    nl7 nl7Var3 = (nl7) sl7Var;
                    d49Var = new d49(nl7Var3.a, nl7Var3.b, nl7Var3.c, nl7Var3.d, true, null);
                    w49Var.d = null;
                    w49Var.e = null;
                    w49Var.h = 14;
                    if (njdVar2.f.a(w49Var, d49Var) != hu4Var) {
                        return sbiVar;
                    }
                }
                return hu4Var;
            case 3:
                ch3.d0(objK0);
                return sbiVar;
            case 4:
                ch3.d0(objK0);
                return sbiVar;
            case 5:
                ch3.d0(objK0);
                return sbiVar;
            case 6:
                ch3.d0(objK0);
                return sbiVar;
            case 7:
                ch3.d0(objK0);
                return sbiVar;
            case 8:
                njdVar2 = w49Var.d;
                ch3.d0(objK0);
                w49Var.d = null;
                w49Var.e = null;
                w49Var.h = 9;
                if (njdVar2.f.a(w49Var, o39.a) != hu4Var) {
                    return hu4Var;
                }
                return sbiVar;
            case 9:
                ch3.d0(objK0);
                return sbiVar;
            case 10:
                njdVar2 = w49Var.d;
                ch3.d0(objK0);
                w49Var.d = null;
                w49Var.e = null;
                w49Var.h = 11;
                if (njdVar2.f.a(w49Var, n39.a) != hu4Var) {
                    return hu4Var;
                }
                return sbiVar;
            case 11:
                ch3.d0(objK0);
                return sbiVar;
            case 12:
                ch3.d0(objK0);
                return sbiVar;
            case 13:
                ch3.d0(objK0);
                return sbiVar;
            case 14:
                ch3.d0(objK0);
                return sbiVar;
            default:
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }

    public final Uri k(Uri uri) {
        String scheme = uri.getScheme();
        e().getClass();
        if (!z5h.G0(scheme, "max", false)) {
            return uri;
        }
        Uri.Builder builderBuildUpon = uri.buildUpon();
        e().getClass();
        return builderBuildUpon.scheme("https").build();
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:101:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:106:0x020d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:107:0x020f  */
    /* JADX WARN: Code duplicated, block: B:113:0x0227  */
    /* JADX WARN: Code duplicated, block: B:117:0x0233  */
    /* JADX WARN: Code duplicated, block: B:120:0x0250  */
    /* JADX WARN: Code duplicated, block: B:121:0x0252  */
    /* JADX WARN: Code duplicated, block: B:130:0x0282  */
    /* JADX WARN: Code duplicated, block: B:140:0x02ad  */
    /* JADX WARN: Code duplicated, block: B:152:0x0325 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:153:0x0326 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:154:0x0327  */
    /* JADX WARN: Code duplicated, block: B:43:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:46:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:49:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:55:0x0122  */
    /* JADX WARN: Code duplicated, block: B:57:0x0126  */
    /* JADX WARN: Code duplicated, block: B:60:0x012d  */
    /* JADX WARN: Code duplicated, block: B:65:0x0144  */
    /* JADX WARN: Code duplicated, block: B:78:0x0184  */
    /* JADX WARN: Code duplicated, block: B:80:0x0188  */
    /* JADX WARN: Code duplicated, block: B:82:0x018e  */
    /* JADX WARN: Code duplicated, block: B:85:0x0197  */
    /* JADX WARN: Code duplicated, block: B:88:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:89:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    /* JADX WARN: Code duplicated, block: B:92:0x01af  */
    /* JADX WARN: Code duplicated, block: B:94:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:96:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:99:0x01ef  */
    public final Object l(njd njdVar, u69 u69Var, Uri uri, nq4 nq4Var) {
        y49 y49Var;
        u69 u69Var2;
        njd njdVar2;
        Uri uri2;
        u69 u69Var3;
        Uri uriK;
        long jV;
        y49 y49Var2;
        Object objM0;
        long j;
        u69 u69Var4;
        Uri uri3;
        i29 i29Var;
        h29 h29Var;
        gm4 gm4Var;
        long j2;
        long j3;
        Long l;
        Long l2;
        Uri uri4;
        oui ouiVar;
        String str;
        String str2;
        vg4 vg4VarF;
        Object objA;
        pj4 pj4Var;
        String str3;
        a4c a4cVar;
        String str4;
        a4c a4cVar2;
        w39 w39Var;
        c59 c59Var = this;
        je9 je9Var = je9.f;
        k39 k39Var = k39.a;
        sbi sbiVar = sbi.a;
        if (nq4Var instanceof y49) {
            y49Var = (y49) nq4Var;
            int i = y49Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                y49Var.k = i - Integer.MIN_VALUE;
            } else {
                y49Var = new y49(c59Var, nq4Var);
            }
        } else {
            y49Var = new y49(c59Var, nq4Var);
        }
        y49 y49Var3 = y49Var;
        Object obj = y49Var3.i;
        hu4 hu4Var = hu4.a;
        lq4 lq4Var = null;
        switch (y49Var3.k) {
            case 0:
                ch3.d0(obj);
                b49 b49Var = b49.a;
                y49Var3.d = njdVar;
                u69Var2 = u69Var;
                y49Var3.e = u69Var2;
                y49Var3.f = uri;
                y49Var3.k = 1;
                if (njdVar.f.a(y49Var3, b49Var) != hu4Var) {
                    njdVar2 = njdVar;
                    uri2 = uri;
                    u69Var3 = u69Var2;
                    uriK = c59Var.k(uri2);
                    jV = ((pvb) c59Var.j.getValue()).v(r5h.y1(uriK.toString()).toString());
                    ghb ghbVar = ew5.b;
                    long jO = qe7.O(10, lw5.SECONDS);
                    i20 i20Var = new i20(this, jV, lq4Var, 17);
                    c59Var = this;
                    y49Var2 = y49Var3;
                    y49Var2.d = njdVar2;
                    y49Var2.e = u69Var3;
                    y49Var2.f = null;
                    y49Var2.g = uriK;
                    y49Var2.h = jV;
                    y49Var2.k = 2;
                    objM0 = lvb.M0(jO, i20Var, y49Var2);
                    if (objM0 != hu4Var) {
                        j = jV;
                        u69Var4 = u69Var3;
                        uri3 = uriK;
                        i29Var = (i29) objM0;
                        if (i29Var == null) {
                            str4 = c59Var.s;
                            a4cVar2 = gm0.f;
                            if (a4cVar2 != null && a4cVar2.b(je9Var)) {
                                a4cVar2.c(je9Var, str4, "link info timeout error", null);
                            }
                            w39Var = new w39(uri3);
                            y49Var2.d = null;
                            y49Var2.e = null;
                            y49Var2.f = null;
                            y49Var2.g = null;
                            y49Var2.h = j;
                            y49Var2.k = 3;
                            if (njdVar2.f.a(y49Var2, w39Var) == hu4Var) {
                                return sbiVar;
                            }
                        } else if (i29Var instanceof g29) {
                            str3 = c59Var.s;
                            a4cVar = gm0.f;
                            if (a4cVar != null && a4cVar.b(je9Var)) {
                                a4cVar.c(je9Var, str3, qv1.k("link info error: ", ((g29) i29Var).b), null);
                            }
                            if (!(u69Var4 instanceof s69) || (u69Var4 instanceof m69) || (u69Var4 instanceof q69) || (u69Var4 instanceof r69)) {
                                y49Var2.d = null;
                                y49Var2.e = null;
                                y49Var2.f = null;
                                y49Var2.g = null;
                                y49Var2.h = j;
                                y49Var2.k = 4;
                                if (njdVar2.f.a(y49Var2, k39Var) == hu4Var) {
                                    return sbiVar;
                                }
                            } else {
                                w39 w39Var2 = new w39(uri3);
                                y49Var2.d = null;
                                y49Var2.e = null;
                                y49Var2.f = null;
                                y49Var2.g = null;
                                y49Var2.h = j;
                                y49Var2.k = 5;
                                if (njdVar2.f.a(y49Var2, w39Var2) != hu4Var) {
                                    return sbiVar;
                                }
                            }
                        } else {
                            if (!(i29Var instanceof h29)) {
                                ore.o();
                                return 0;
                            }
                            h29Var = (h29) i29Var;
                            gm4Var = h29Var.d;
                            if (gm4Var != null || (pj4Var = gm4Var.a) == null) {
                                j2 = 0;
                                j3 = 0;
                            } else {
                                j2 = 0;
                                j3 = pj4Var.a;
                            }
                            l = h29Var.b;
                            Long l3 = h29Var.c;
                            l2 = h29Var.g;
                            uri4 = uri3;
                            ouiVar = h29Var.f;
                            if (ouiVar != null) {
                                str = ouiVar.b;
                            } else {
                                str = null;
                            }
                            if (j3 > j2) {
                                if (!(u69Var4 instanceof q69)) {
                                    String str5 = ((q69) u69Var4).f;
                                    y49Var2.d = null;
                                    y49Var2.e = null;
                                    y49Var2.f = null;
                                    y49Var2.g = null;
                                    y49Var2.h = j;
                                    y49Var2.k = 6;
                                    vg4VarF = ((bi4) c59Var.a.getValue()).f(j3, false);
                                    if (j3 == ((s7f) ((et3) c59Var.k.getValue())).t()) {
                                        objA = njdVar2.f.a(y49Var2, t39.a);
                                        if (objA != hu4Var) {
                                            objA = sbiVar;
                                        }
                                    } else if (vg4VarF == null && (vg4VarF.a.b.z.b & 16) != 0) {
                                        objA = njdVar2.f.a(y49Var2, new a49(j3, str5));
                                        if (objA != hu4Var) {
                                            objA = sbiVar;
                                        }
                                    } else if (vg4VarF == null && (vg4VarF.a.b.z.b & 16) == 0) {
                                        objA = njdVar2.f.a(y49Var2, r39.a);
                                        if (objA != hu4Var) {
                                            objA = sbiVar;
                                        }
                                    } else {
                                        objA = njdVar2.f.a(y49Var2, k39Var);
                                        if (objA != hu4Var) {
                                            objA = sbiVar;
                                        }
                                    }
                                    if (objA == hu4Var) {
                                        return sbiVar;
                                    }
                                } else {
                                    str2 = h29Var.h;
                                    y49Var2.d = null;
                                    y49Var2.e = null;
                                    y49Var2.f = null;
                                    y49Var2.g = null;
                                    y49Var2.h = j;
                                    y49Var2.k = 7;
                                    if (c59Var.m(njdVar2, uri4, j3, str2, y49Var2) == hu4Var) {
                                        return sbiVar;
                                    }
                                }
                            } else if (l2 == null && l2.longValue() > j2) {
                                long jLongValue = l2.longValue();
                                y49Var2.d = null;
                                y49Var2.e = null;
                                y49Var2.f = null;
                                y49Var2.g = null;
                                y49Var2.h = j;
                                y49Var2.k = 8;
                                Object objA2 = njdVar2.f.a(y49Var2, new i49(jLongValue));
                                if (objA2 != hu4Var) {
                                    objA2 = sbiVar;
                                }
                                if (objA2 != hu4Var) {
                                    return sbiVar;
                                }
                            } else if (str == null && str.length() != 0) {
                                y49Var2.d = null;
                                y49Var2.e = null;
                                y49Var2.f = null;
                                y49Var2.g = null;
                                y49Var2.h = j;
                                y49Var2.k = 9;
                                Object objA3 = njdVar2.f.a(y49Var2, new h49(str));
                                if (objA3 != hu4Var) {
                                    objA3 = sbiVar;
                                }
                                if (objA3 != hu4Var) {
                                    return sbiVar;
                                }
                            } else if (l != null || l.longValue() == j2) {
                                gm0.Y(this.s, "link info failed");
                                y49Var2.d = null;
                                y49Var2.e = null;
                                y49Var2.f = null;
                                y49Var2.g = null;
                                y49Var2.h = j;
                                y49Var2.k = 12;
                                if (njdVar2.f.a(y49Var2, k39Var) == hu4Var) {
                                    return sbiVar;
                                }
                            } else if (l3.longValue() > j2) {
                                long jLongValue2 = l.longValue();
                                long jLongValue3 = l3.longValue();
                                y49Var2.d = null;
                                y49Var2.e = null;
                                y49Var2.f = null;
                                y49Var2.g = null;
                                y49Var2.h = j;
                                y49Var2.k = 10;
                                if (b(njdVar2, uri4, jLongValue2, jLongValue3, 0L, y49Var2) != hu4Var) {
                                    return sbiVar;
                                }
                            } else {
                                long jLongValue4 = l.longValue();
                                y49Var2.d = null;
                                y49Var2.e = null;
                                y49Var2.f = null;
                                y49Var2.g = null;
                                y49Var2.h = j;
                                y49Var2.k = 11;
                                if (n(njdVar2, uri4, jLongValue4, 0L, y49Var2) != hu4Var) {
                                    return sbiVar;
                                }
                            }
                        }
                    }
                }
                return hu4Var;
            case 1:
                uri2 = y49Var3.f;
                u69Var2 = y49Var3.e;
                njd njdVar3 = y49Var3.d;
                ch3.d0(obj);
                njdVar2 = njdVar3;
                u69Var3 = u69Var2;
                uriK = c59Var.k(uri2);
                jV = ((pvb) c59Var.j.getValue()).v(r5h.y1(uriK.toString()).toString());
                ghb ghbVar2 = ew5.b;
                long jO2 = qe7.O(10, lw5.SECONDS);
                i20 i20Var2 = new i20(this, jV, lq4Var, 17);
                c59Var = this;
                y49Var2 = y49Var3;
                y49Var2.d = njdVar2;
                y49Var2.e = u69Var3;
                y49Var2.f = null;
                y49Var2.g = uriK;
                y49Var2.h = jV;
                y49Var2.k = 2;
                objM0 = lvb.M0(jO2, i20Var2, y49Var2);
                if (objM0 != hu4Var) {
                    j = jV;
                    u69Var4 = u69Var3;
                    uri3 = uriK;
                    i29Var = (i29) objM0;
                    if (i29Var == null) {
                        str4 = c59Var.s;
                        a4cVar2 = gm0.f;
                        if (a4cVar2 != null) {
                            a4cVar2.c(je9Var, str4, "link info timeout error", null);
                        }
                        w39Var = new w39(uri3);
                        y49Var2.d = null;
                        y49Var2.e = null;
                        y49Var2.f = null;
                        y49Var2.g = null;
                        y49Var2.h = j;
                        y49Var2.k = 3;
                        if (njdVar2.f.a(y49Var2, w39Var) == hu4Var) {
                            return sbiVar;
                        }
                    } else if (i29Var instanceof g29) {
                        str3 = c59Var.s;
                        a4cVar = gm0.f;
                        if (a4cVar != null) {
                            a4cVar.c(je9Var, str3, qv1.k("link info error: ", ((g29) i29Var).b), null);
                        }
                        if (u69Var4 instanceof s69) {
                        }
                        y49Var2.d = null;
                        y49Var2.e = null;
                        y49Var2.f = null;
                        y49Var2.g = null;
                        y49Var2.h = j;
                        y49Var2.k = 4;
                        if (njdVar2.f.a(y49Var2, k39Var) == hu4Var) {
                            return sbiVar;
                        }
                        break;
                    } else {
                        if (!(i29Var instanceof h29)) {
                            ore.o();
                            return 0;
                        }
                        h29Var = (h29) i29Var;
                        gm4Var = h29Var.d;
                        if (gm4Var != null) {
                            j2 = 0;
                            j3 = 0;
                        } else {
                            j2 = 0;
                            j3 = 0;
                        }
                        l = h29Var.b;
                        Long l4 = h29Var.c;
                        l2 = h29Var.g;
                        uri4 = uri3;
                        ouiVar = h29Var.f;
                        if (ouiVar != null) {
                            str = ouiVar.b;
                        } else {
                            str = null;
                        }
                        if (j3 > j2) {
                            if (l2 == null) {
                            }
                            if (str == null) {
                            }
                            if (l != null) {
                            }
                            gm0.Y(this.s, "link info failed");
                            y49Var2.d = null;
                            y49Var2.e = null;
                            y49Var2.f = null;
                            y49Var2.g = null;
                            y49Var2.h = j;
                            y49Var2.k = 12;
                            if (njdVar2.f.a(y49Var2, k39Var) == hu4Var) {
                                return sbiVar;
                            }
                            break;
                        } else if (!(u69Var4 instanceof q69)) {
                            String str6 = ((q69) u69Var4).f;
                            y49Var2.d = null;
                            y49Var2.e = null;
                            y49Var2.f = null;
                            y49Var2.g = null;
                            y49Var2.h = j;
                            y49Var2.k = 6;
                            vg4VarF = ((bi4) c59Var.a.getValue()).f(j3, false);
                            if (j3 == ((s7f) ((et3) c59Var.k.getValue())).t()) {
                                objA = njdVar2.f.a(y49Var2, t39.a);
                                if (objA != hu4Var) {
                                    objA = sbiVar;
                                }
                            } else if (vg4VarF == null) {
                                if (vg4VarF == null) {
                                    objA = njdVar2.f.a(y49Var2, k39Var);
                                    if (objA != hu4Var) {
                                        objA = sbiVar;
                                    }
                                } else {
                                    objA = njdVar2.f.a(y49Var2, k39Var);
                                    if (objA != hu4Var) {
                                        objA = sbiVar;
                                    }
                                }
                            } else if (vg4VarF == null) {
                                objA = njdVar2.f.a(y49Var2, k39Var);
                                if (objA != hu4Var) {
                                    objA = sbiVar;
                                }
                            } else {
                                objA = njdVar2.f.a(y49Var2, k39Var);
                                if (objA != hu4Var) {
                                    objA = sbiVar;
                                }
                            }
                            if (objA == hu4Var) {
                                return sbiVar;
                            }
                        } else {
                            str2 = h29Var.h;
                            y49Var2.d = null;
                            y49Var2.e = null;
                            y49Var2.f = null;
                            y49Var2.g = null;
                            y49Var2.h = j;
                            y49Var2.k = 7;
                            if (c59Var.m(njdVar2, uri4, j3, str2, y49Var2) == hu4Var) {
                                return sbiVar;
                            }
                        }
                    }
                }
                return hu4Var;
            case 2:
                long j4 = y49Var3.h;
                Uri uri5 = y49Var3.g;
                u69Var4 = y49Var3.e;
                njd njdVar4 = y49Var3.d;
                ch3.d0(obj);
                uri3 = uri5;
                y49Var2 = y49Var3;
                j = j4;
                njdVar2 = njdVar4;
                objM0 = obj;
                i29Var = (i29) objM0;
                if (i29Var == null) {
                    str4 = c59Var.s;
                    a4cVar2 = gm0.f;
                    if (a4cVar2 != null) {
                        a4cVar2.c(je9Var, str4, "link info timeout error", null);
                    }
                    w39Var = new w39(uri3);
                    y49Var2.d = null;
                    y49Var2.e = null;
                    y49Var2.f = null;
                    y49Var2.g = null;
                    y49Var2.h = j;
                    y49Var2.k = 3;
                    if (njdVar2.f.a(y49Var2, w39Var) == hu4Var) {
                        return hu4Var;
                    }
                    return sbiVar;
                }
                if (i29Var instanceof g29) {
                    str3 = c59Var.s;
                    a4cVar = gm0.f;
                    if (a4cVar != null) {
                        a4cVar.c(je9Var, str3, qv1.k("link info error: ", ((g29) i29Var).b), null);
                    }
                    if (u69Var4 instanceof s69) {
                        break;
                    }
                    y49Var2.d = null;
                    y49Var2.e = null;
                    y49Var2.f = null;
                    y49Var2.g = null;
                    y49Var2.h = j;
                    y49Var2.k = 4;
                    if (njdVar2.f.a(y49Var2, k39Var) == hu4Var) {
                        return hu4Var;
                    }
                    return sbiVar;
                }
                if (!(i29Var instanceof h29)) {
                    ore.o();
                    return 0;
                }
                h29Var = (h29) i29Var;
                gm4Var = h29Var.d;
                if (gm4Var != null) {
                    j2 = 0;
                    j3 = 0;
                } else {
                    j2 = 0;
                    j3 = 0;
                }
                l = h29Var.b;
                Long l5 = h29Var.c;
                l2 = h29Var.g;
                uri4 = uri3;
                ouiVar = h29Var.f;
                if (ouiVar != null) {
                    str = ouiVar.b;
                } else {
                    str = null;
                }
                if (j3 > j2) {
                    if (l2 == null) {
                        break;
                    }
                    if (str == null) {
                        break;
                    }
                    if (l != null) {
                        break;
                    }
                    gm0.Y(this.s, "link info failed");
                    y49Var2.d = null;
                    y49Var2.e = null;
                    y49Var2.f = null;
                    y49Var2.g = null;
                    y49Var2.h = j;
                    y49Var2.k = 12;
                    if (njdVar2.f.a(y49Var2, k39Var) == hu4Var) {
                        return hu4Var;
                    }
                    return sbiVar;
                }
                if (!(u69Var4 instanceof q69)) {
                    str2 = h29Var.h;
                    y49Var2.d = null;
                    y49Var2.e = null;
                    y49Var2.f = null;
                    y49Var2.g = null;
                    y49Var2.h = j;
                    y49Var2.k = 7;
                    if (c59Var.m(njdVar2, uri4, j3, str2, y49Var2) == hu4Var) {
                        return hu4Var;
                    }
                    return sbiVar;
                }
                String str7 = ((q69) u69Var4).f;
                y49Var2.d = null;
                y49Var2.e = null;
                y49Var2.f = null;
                y49Var2.g = null;
                y49Var2.h = j;
                y49Var2.k = 6;
                vg4VarF = ((bi4) c59Var.a.getValue()).f(j3, false);
                if (j3 == ((s7f) ((et3) c59Var.k.getValue())).t()) {
                    objA = njdVar2.f.a(y49Var2, t39.a);
                    if (objA != hu4Var) {
                        objA = sbiVar;
                    }
                } else if (vg4VarF == null) {
                    if (vg4VarF == null) {
                        objA = njdVar2.f.a(y49Var2, k39Var);
                        if (objA != hu4Var) {
                            objA = sbiVar;
                        }
                    } else {
                        objA = njdVar2.f.a(y49Var2, k39Var);
                        if (objA != hu4Var) {
                            objA = sbiVar;
                        }
                    }
                } else if (vg4VarF == null) {
                    objA = njdVar2.f.a(y49Var2, k39Var);
                    if (objA != hu4Var) {
                        objA = sbiVar;
                    }
                } else {
                    objA = njdVar2.f.a(y49Var2, k39Var);
                    if (objA != hu4Var) {
                        objA = sbiVar;
                    }
                }
                if (objA == hu4Var) {
                    return hu4Var;
                }
                return sbiVar;
            case 3:
                ch3.d0(obj);
                return sbiVar;
            case 4:
                ch3.d0(obj);
                return sbiVar;
            case 5:
                ch3.d0(obj);
                return sbiVar;
            case 6:
                ch3.d0(obj);
                return sbiVar;
            case 7:
                ch3.d0(obj);
                return sbiVar;
            case 8:
                ch3.d0(obj);
                return sbiVar;
            case 9:
                ch3.d0(obj);
                return sbiVar;
            case 10:
                ch3.d0(obj);
                return sbiVar;
            case 11:
                ch3.d0(obj);
                return sbiVar;
            case 12:
                ch3.d0(obj);
                return sbiVar;
            default:
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:111:0x023c  */
    /* JADX WARN: Code duplicated, block: B:123:0x025b  */
    /* JADX WARN: Code duplicated, block: B:158:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:159:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:160:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:162:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:163:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:50:0x0103  */
    /* JADX WARN: Code duplicated, block: B:53:0x0119  */
    /* JADX WARN: Code duplicated, block: B:55:0x011d  */
    /* JADX WARN: Code duplicated, block: B:58:0x0131  */
    /* JADX WARN: Code duplicated, block: B:62:0x013d  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:85:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:94:0x01bd  */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0116, code lost:
    
        if (r13.f.a(r4, defpackage.t39.a) == r11) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x012e, code lost:
    
        if (r13.f.a(r4, r14) == r11) goto L46;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m(defpackage.njd r21, android.net.Uri r22, long r23, java.lang.String r25, defpackage.nq4 r26) {
        /*
            Method dump skipped, instruction units count: 766
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c59.m(njd, android.net.Uri, long, java.lang.String, nq4):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0079  */
    /* JADX WARN: Code duplicated, block: B:33:0x009b  */
    /* JADX WARN: Code duplicated, block: B:57:0x0116  */
    /* JADX WARN: Code duplicated, block: B:59:0x011c  */
    /* JADX WARN: Code duplicated, block: B:61:0x0122  */
    /* JADX WARN: Code duplicated, block: B:62:0x0125  */
    /* JADX WARN: Code duplicated, block: B:64:0x012d  */
    /* JADX WARN: Code duplicated, block: B:68:0x0176  */
    /* JADX WARN: Code duplicated, block: B:72:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:73:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0093, code lost:
    
        if (r11.f.a(r5, r0) == r6) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00ca, code lost:
    
        if (r11.f.a(r5, r0) == r6) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0112, code lost:
    
        if (r0 == r6) goto L70;
     */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5, types: [android.net.Uri, njd] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object n(defpackage.njd r19, android.net.Uri r20, long r21, long r23, defpackage.nq4 r25) {
        /*
            Method dump skipped, instruction units count: 446
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c59.n(njd, android.net.Uri, long, long, nq4):java.lang.Object");
    }
}
