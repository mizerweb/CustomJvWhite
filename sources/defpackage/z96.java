package defpackage;

import android.text.TextUtils;
import androidx.work.WorkRequest;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class z96 {
    public static final String a = n1g.Z("EnqueueRunnable");

    public static void a(cyj cyjVar) {
        boolean z;
        oyj oyjVar = cyjVar.n;
        HashSet hashSet = new HashSet();
        hashSet.addAll(cyjVar.r);
        HashSet hashSetP = cyj.P(cyjVar);
        Iterator it = hashSet.iterator();
        while (true) {
            if (!it.hasNext()) {
                hashSet.removeAll(cyjVar.r);
                z = false;
                break;
            } else if (hashSetP.contains((String) it.next())) {
                z = true;
                break;
            }
        }
        if (z) {
            c.u(cyjVar, ")", "WorkContinuation has cycles (");
            return;
        }
        WorkDatabase workDatabase = oyjVar.c;
        ja4 ja4Var = oyjVar.b;
        workDatabase.b();
        try {
            e9i.t(workDatabase, ja4Var, cyjVar);
            boolean zB = b(cyjVar);
            workDatabase.p();
            workDatabase.f();
            if (zB) {
                j3f.b(ja4Var, oyjVar.c, oyjVar.e);
            }
        } catch (Throwable th) {
            workDatabase.f();
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:82:0x01a6  */
    public static boolean b(cyj cyjVar) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        WorkDatabase workDatabase;
        boolean z5;
        boolean z6;
        boolean z7;
        cyj cyjVar2 = cyjVar;
        HashSet hashSetP = cyj.P(cyjVar2);
        oyj oyjVar = cyjVar2.n;
        List list = cyjVar2.q;
        String[] strArr = (String[]) hashSetP.toArray(new String[0]);
        String str = cyjVar2.o;
        ve6 ve6Var = cyjVar2.p;
        oyjVar.b.d.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        WorkDatabase workDatabase2 = oyjVar.c;
        boolean z8 = strArr != null && strArr.length > 0;
        kyj kyjVar = kyj.c;
        kyj kyjVar2 = kyj.f;
        kyj kyjVar3 = kyj.d;
        if (z8) {
            int length = strArr.length;
            int i = 0;
            z2 = false;
            z3 = false;
            z = true;
            while (true) {
                if (i < length) {
                    String str2 = strArr[i];
                    List list2 = list;
                    mzj mzjVarD = workDatabase2.x().d(str2);
                    if (mzjVarD == null) {
                        n1g.x().s(a, "Prerequisite " + str2 + " doesn't exist; not enqueuing");
                    } else {
                        kyj kyjVar4 = mzjVarD.b;
                        z &= kyjVar4 == kyjVar;
                        if (kyjVar4 == kyjVar3) {
                            z3 = true;
                        } else if (kyjVar4 == kyjVar2) {
                            z2 = true;
                        }
                        i++;
                        list = list2;
                    }
                }
                z7 = true;
                z6 = false;
                cyjVar2.t = z7;
                return z6;
            }
        }
        z = true;
        z2 = false;
        z3 = false;
        List<WorkRequest> list3 = list;
        boolean zIsEmpty = TextUtils.isEmpty(str);
        kyj kyjVar5 = kyj.a;
        if (zIsEmpty || z8) {
            z4 = zIsEmpty;
            workDatabase = workDatabase2;
            z5 = false;
        } else {
            List listE = workDatabase2.x().e(str);
            if (listE.isEmpty()) {
                z4 = zIsEmpty;
                workDatabase = workDatabase2;
            } else {
                ve6 ve6Var2 = ve6.c;
                z4 = zIsEmpty;
                ve6 ve6Var3 = ve6.d;
                if (ve6Var == ve6Var2 || ve6Var == ve6Var3) {
                    sh5 sh5VarR = workDatabase2.r();
                    ArrayList arrayList = new ArrayList();
                    Iterator it = listE.iterator();
                    while (it.hasNext()) {
                        kzj kzjVar = (kzj) it.next();
                        WorkDatabase workDatabase3 = workDatabase2;
                        Iterator it2 = it;
                        sh5 sh5Var = sh5VarR;
                        if (!((Boolean) ch3.G(sh5VarR.a, true, false, new qo1(kzjVar.a, 6))).booleanValue()) {
                            kyj kyjVar6 = kzjVar.b;
                            boolean z9 = z & (kyjVar6 == kyjVar);
                            if (kyjVar6 == kyjVar3) {
                                z3 = true;
                            } else if (kyjVar6 == kyjVar2) {
                                z2 = true;
                            }
                            arrayList.add(kzjVar.a);
                            z = z9;
                        }
                        workDatabase2 = workDatabase3;
                        it = it2;
                        sh5VarR = sh5Var;
                    }
                    workDatabase = workDatabase2;
                    List list4 = arrayList;
                    list4 = arrayList;
                    if (ve6Var == ve6Var3 && (z2 || z3)) {
                        qzj qzjVarX = workDatabase.x();
                        Iterator it3 = qzjVarX.e(str).iterator();
                        while (it3.hasNext()) {
                            ch3.G(qzjVarX.a, false, true, new rh5(((kzj) it3.next()).a, 13));
                        }
                        z2 = false;
                        z3 = false;
                        list4 = Collections.EMPTY_LIST;
                    }
                    strArr = (String[]) list4.toArray(strArr);
                    z8 = strArr.length > 0;
                } else {
                    if (ve6Var == ve6.b) {
                        Iterator it4 = listE.iterator();
                        while (true) {
                            if (it4.hasNext()) {
                                kyj kyjVar7 = ((kzj) it4.next()).b;
                                if (kyjVar7 == kyjVar5 || kyjVar7 == kyj.b) {
                                    z7 = true;
                                    z6 = false;
                                    cyjVar2.t = z7;
                                    return z6;
                                }
                            }
                        }
                    }
                    workDatabase2.n(new x1c(new xj2(workDatabase2, str, oyjVar, 0), 1));
                    qzj qzjVarX2 = workDatabase2.x();
                    Iterator it5 = listE.iterator();
                    while (it5.hasNext()) {
                        ch3.G(qzjVarX2.a, false, true, new rh5(((kzj) it5.next()).a, 13));
                    }
                    workDatabase = workDatabase2;
                    z5 = true;
                }
            }
            z5 = false;
        }
        z6 = z5;
        for (WorkRequest workRequest : list3) {
            mzj workSpec = workRequest.getWorkSpec();
            if (!z8 || z) {
                workSpec.n = jCurrentTimeMillis;
            } else if (z3) {
                workSpec.b = kyjVar3;
            } else if (z2) {
                workSpec.b = kyjVar2;
            } else {
                workSpec.b = kyj.e;
            }
            if (workSpec.b == kyjVar5) {
                z6 = true;
            }
            qzj qzjVarX3 = workDatabase.x();
            ch3.G(qzjVarX3.a, false, true, new ozj(qzjVarX3, e9i.N0(workSpec), 0));
            if (z8) {
                int length2 = strArr.length;
                int i2 = 0;
                while (i2 < length2) {
                    oh5 oh5Var = new oh5(workRequest.getStringId(), strArr[i2]);
                    sh5 sh5VarR2 = workDatabase.r();
                    ch3.G(sh5VarR2.a, false, true, new w14(sh5VarR2, 13, oh5Var));
                    i2++;
                    workRequest = workRequest;
                    strArr = strArr;
                }
            }
            WorkRequest workRequest2 = workRequest;
            String[] strArr2 = strArr;
            workDatabase.y().a(workRequest2.getStringId(), workRequest2.getTags());
            if (!z4) {
                czj czjVarV = workDatabase.v();
                ch3.G(czjVarV.a, false, true, new ol(czjVarV, 25, new bzj(str, workRequest2.getStringId())));
            }
            strArr = strArr2;
        }
        z7 = true;
        cyjVar2 = cyjVar;
        cyjVar2.t = z7;
        return z6;
    }
}
