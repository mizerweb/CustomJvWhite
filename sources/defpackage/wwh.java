package defpackage;

import android.app.ApplicationExitInfo;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class wwh implements Runnable {
    public final /* synthetic */ wfe a;
    public final /* synthetic */ snf b;
    public final /* synthetic */ khh c;
    public final /* synthetic */ oe9 d;
    public final /* synthetic */ jv4 e;
    public final /* synthetic */ yn f;
    public final /* synthetic */ sfe g;
    public final /* synthetic */ Context h;
    public final /* synthetic */ ev4 i;
    public final /* synthetic */ uy8 j;

    public /* synthetic */ wwh(wfe wfeVar, snf snfVar, khh khhVar, oe9 oe9Var, jv4 jv4Var, yn ynVar, sfe sfeVar, Context context, ev4 ev4Var, uy8 uy8Var, fv4 fv4Var, j85 j85Var) {
        this.a = wfeVar;
        this.b = snfVar;
        this.c = khhVar;
        this.d = oe9Var;
        this.e = jv4Var;
        this.f = ynVar;
        this.g = sfeVar;
        this.h = context;
        this.i = ev4Var;
        this.j = uy8Var;
    }

    /* JADX WARN: Code duplicated, block: B:126:0x032f  */
    /* JADX WARN: Code duplicated, block: B:129:0x0334  */
    /* JADX WARN: Code duplicated, block: B:162:0x03f8  */
    /* JADX WARN: Code duplicated, block: B:223:0x0244 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:0x019d  */
    /* JADX WARN: Code duplicated, block: B:75:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:81:0x01ba A[LOOP:2: B:79:0x01b4->B:81:0x01ba, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:85:0x0200  */
    @Override // java.lang.Runnable
    public final void run() {
        String str;
        int i;
        File[] fileArrListFiles;
        List list;
        boolean z;
        List list2;
        String str2;
        String str3;
        igh ighVar;
        String string;
        String str4;
        jv4 jv4Var;
        List<xn> listJ;
        int iB;
        StringBuilder sb;
        byte[] bytes;
        List list3;
        File file;
        s66 s66Var = s66.a;
        wfe wfeVar = this.a;
        snf snfVar = this.b;
        khh khhVar = this.c;
        oe9 oe9Var = this.d;
        jv4 jv4Var2 = this.e;
        yn ynVar = this.f;
        sfe sfeVar = this.g;
        Context context = this.h;
        ev4 ev4Var = this.i;
        uy8 uy8Var = this.j;
        r66 r66Var = r66.a;
        jv4 jv4Var3 = jv4Var2;
        int i2 = 2;
        String str5 = "tracer-";
        String str6 = "tracer";
        if (!((Collection) wfeVar.a).isEmpty()) {
            List list4 = (List) wfeVar.a;
            if (Build.VERSION.SDK_INT >= 30) {
                Iterator it = list4.iterator();
                while (it.hasNext()) {
                    ApplicationExitInfo applicationExitInfoD = r4.d(it.next());
                    try {
                        InputStream traceInputStream = applicationExitInfoD.getTraceInputStream();
                        if (traceInputStream != null) {
                            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(traceInputStream, pt2.a), 8192);
                            try {
                                String strI = gm0.I(bufferedReader);
                                bufferedReader.close();
                                string = strI;
                            } catch (Throwable th) {
                                try {
                                    throw th;
                                } catch (Throwable th2) {
                                    rx8.n(bufferedReader, th);
                                    throw th2;
                                }
                            }
                        } else {
                            string = null;
                        }
                    } catch (Exception unused) {
                        string = null;
                    }
                    if (string == null || string.length() == 0) {
                        str4 = str5;
                        jv4Var = jv4Var3;
                        applicationExitInfoD.getDescription();
                        r66Var = r66Var;
                        context = context;
                        ynVar = ynVar;
                        str5 = str4;
                        i2 = 2;
                        jv4Var3 = jv4Var;
                    } else {
                        applicationExitInfoD.getTimestamp();
                        snfVar.b();
                        igh ighVar2 = snfVar.h;
                        if (ighVar2 == null) {
                            continue;
                        } else {
                            long timestamp = applicationExitInfoD.getTimestamp();
                            Context context2 = ynVar.a;
                            String strP = ch3.p();
                            File fileQ0 = lu6.q0(new File(context2.getCacheDir(), strP.equals(context2.getPackageName()) ? "tracer" : str5 + ((Object) Uri.encode(z5h.I0(strP, ':', '-', false)))), "main_snapshots");
                            if (fileQ0.exists() && fileQ0.isDirectory()) {
                                try {
                                    File[] fileArrListFiles2 = fileQ0.listFiles();
                                    if (fileArrListFiles2 == null) {
                                        file = fileQ0;
                                        str5 = str5;
                                        throw new IllegalArgumentException("Required value was null.");
                                    }
                                    File[] fileArr = fileArrListFiles2;
                                    if (fileArr.length > 1) {
                                        Arrays.sort(fileArr);
                                    }
                                    int length = (fileArrListFiles2.length / 2) - 1;
                                    if (length >= 0) {
                                        int length2 = fileArrListFiles2.length - 1;
                                        if (length >= 0) {
                                            int i3 = length2;
                                            int i4 = 0;
                                            while (true) {
                                                File file2 = fileArrListFiles2[i4];
                                                fileArrListFiles2[i4] = fileArrListFiles2[i3];
                                                fileArrListFiles2[i3] = file2;
                                                i3--;
                                                if (i4 == length) {
                                                    break;
                                                } else {
                                                    i4++;
                                                }
                                            }
                                        }
                                    }
                                    c79 c79VarW = yab.w();
                                    int length3 = fileArrListFiles2.length;
                                    int i5 = 0;
                                    while (i5 < length3) {
                                        file = fileQ0;
                                        try {
                                            File file3 = fileArrListFiles2[i5];
                                            int i6 = length3;
                                            String name = file3.getName();
                                            File[] fileArr2 = fileArrListFiles2;
                                            tn9 tn9VarB = pnl.b(yn.b.a.matcher(name), name);
                                            if (tn9VarB != null) {
                                                c79VarW.add(new xn(Long.parseLong((String) ((sn9) tn9VarB.a()).get(1)), lu6.p0(file3, pt2.a)));
                                            }
                                            try {
                                                i5++;
                                                fileQ0 = file;
                                                length3 = i6;
                                                fileArrListFiles2 = fileArr2;
                                                str5 = str5;
                                            } catch (Throwable unused2) {
                                            }
                                        } catch (Throwable unused3) {
                                            str5 = str5;
                                            lu6.l0(file);
                                            listJ = r66Var;
                                            if (listJ.isEmpty()) {
                                                sb = new StringBuilder();
                                                sb.append((CharSequence) string, 0, iB);
                                                for (xn xnVar : listJ) {
                                                    sb.append("\"SNAPSHOT main\" tid=1 (");
                                                    sb.append(timestamp - xnVar.b());
                                                    sb.append("ms before)\n");
                                                    sb.append(xnVar.a());
                                                    sb.append('\n');
                                                }
                                                sb.append('\n');
                                                sb.append((CharSequence) string, iB, string.length());
                                                string = sb.toString();
                                            }
                                            bytes = string.getBytes(pt2.a);
                                            khhVar.a(i2);
                                            list3 = khhVar.d;
                                            if (list3 == null) {
                                                ore.k("Cannot get prev tags after clear");
                                                return;
                                            }
                                            jv4Var = jv4Var3;
                                            s66Var = s66Var;
                                            str4 = str5;
                                            jv4Var.b(10, bytes, xvc.j(ighVar2, list3, new Date(applicationExitInfoD.getTimestamp()), null, 0L, 0L, 244), s66Var, oe9Var.b());
                                            r66Var = r66Var;
                                            context = context;
                                            ynVar = ynVar;
                                            str5 = str4;
                                            i2 = 2;
                                            jv4Var3 = jv4Var;
                                        }
                                    }
                                    str5 = str5;
                                    listJ = yab.j(c79VarW);
                                    if (listJ.isEmpty() && (iB = vsk.b(string)) >= 0) {
                                        sb = new StringBuilder();
                                        sb.append((CharSequence) string, 0, iB);
                                        while (r0.hasNext()) {
                                            sb.append("\"SNAPSHOT main\" tid=1 (");
                                            sb.append(timestamp - xnVar.b());
                                            sb.append("ms before)\n");
                                            sb.append(xnVar.a());
                                            sb.append('\n');
                                        }
                                        sb.append('\n');
                                        sb.append((CharSequence) string, iB, string.length());
                                        string = sb.toString();
                                    }
                                    bytes = string.getBytes(pt2.a);
                                    khhVar.a(i2);
                                    list3 = khhVar.d;
                                    if (list3 == null) {
                                        ore.k("Cannot get prev tags after clear");
                                        return;
                                    }
                                    jv4Var = jv4Var3;
                                    s66Var = s66Var;
                                    str4 = str5;
                                    jv4Var.b(10, bytes, xvc.j(ighVar2, list3, new Date(applicationExitInfoD.getTimestamp()), null, 0L, 0L, 244), s66Var, oe9Var.b());
                                    r66Var = r66Var;
                                    context = context;
                                    ynVar = ynVar;
                                    str5 = str4;
                                    i2 = 2;
                                    jv4Var3 = jv4Var;
                                } catch (Throwable unused4) {
                                    file = fileQ0;
                                }
                                lu6.l0(file);
                            } else {
                                str5 = str5;
                            }
                            listJ = r66Var;
                            if (listJ.isEmpty()) {
                                sb = new StringBuilder();
                                sb.append((CharSequence) string, 0, iB);
                                while (r0.hasNext()) {
                                    sb.append("\"SNAPSHOT main\" tid=1 (");
                                    sb.append(timestamp - xnVar.b());
                                    sb.append("ms before)\n");
                                    sb.append(xnVar.a());
                                    sb.append('\n');
                                }
                                sb.append('\n');
                                sb.append((CharSequence) string, iB, string.length());
                                string = sb.toString();
                            }
                            bytes = string.getBytes(pt2.a);
                            khhVar.a(i2);
                            list3 = khhVar.d;
                            if (list3 == null) {
                                ore.k("Cannot get prev tags after clear");
                                return;
                            }
                            jv4Var = jv4Var3;
                            s66Var = s66Var;
                            str4 = str5;
                            jv4Var.b(10, bytes, xvc.j(ighVar2, list3, new Date(applicationExitInfoD.getTimestamp()), null, 0L, 0L, 244), s66Var, oe9Var.b());
                            r66Var = r66Var;
                            context = context;
                            ynVar = ynVar;
                            str5 = str4;
                            i2 = 2;
                            jv4Var3 = jv4Var;
                        }
                    }
                }
            }
        }
        String str7 = str5;
        r66 r66Var2 = r66Var;
        jv4 jv4Var4 = jv4Var3;
        Context context3 = context;
        if (sfeVar.a) {
            String strP2 = ch3.p();
            if (strP2.equals(context3.getPackageName())) {
                str3 = "tracer";
                str2 = str7;
            } else {
                str2 = str7;
                str3 = str2 + ((Object) Uri.encode(z5h.I0(strP2, ':', '-', false)));
            }
            File[] fileArrListFiles3 = lu6.q0(new File(context3.getCacheDir(), str3), "minidump").listFiles();
            if (fileArrListFiles3 != null) {
                snfVar.b();
                igh ighVar3 = snfVar.h;
                if (ighVar3 != null) {
                    int length4 = fileArrListFiles3.length;
                    int i7 = 0;
                    while (i7 < length4) {
                        File file4 = fileArrListFiles3[i7];
                        String str8 = str2;
                        long jLastModified = file4.lastModified();
                        int i8 = i7;
                        try {
                            byte[] bArrN0 = lu6.n0(file4);
                            sb8.o(file4);
                            if (bArrN0.length == 0) {
                                file4.toString();
                                ighVar = ighVar3;
                            } else {
                                khhVar.a(2);
                                List list5 = khhVar.d;
                                if (list5 == null) {
                                    ore.k("Cannot get prev tags after clear");
                                    return;
                                } else {
                                    ighVar = ighVar3;
                                    jv4Var4.b(9, bArrN0, xvc.j(ighVar, list5, new Date(jLastModified), null, 0L, 0L, 244), s66Var, oe9Var.b());
                                }
                            }
                        } catch (Exception unused5) {
                        }
                        i7 = i8 + 1;
                        ighVar3 = ighVar;
                        str2 = str8;
                    }
                }
            }
            str = str2;
        } else {
            str = str7;
        }
        if (ev4Var.a) {
            snf snfVar2 = (snf) uy8Var.a;
            fbc fbcVar = a8g.g;
            if (fbcVar == null) {
                ore.k("Tracer settings are not initialized.");
                return;
            }
            if (gol.a(fbcVar, "system.shutdown.until.ts")) {
                z = true;
            } else {
                if (gol.a(fbcVar, "system.CRASH_FREE.shutdown.until.ts")) {
                    z = true;
                } else {
                    z = false;
                }
            }
            if (z) {
                list2 = r66Var2;
            } else {
                snfVar2.b();
                list2 = snfVar2.j;
                if (!list2.isEmpty() && list2.size() < 4) {
                    snfVar2.b();
                    if (snfVar2.i + 1800000 > System.currentTimeMillis()) {
                        list2 = r66Var2;
                    }
                }
            }
            if (!list2.isEmpty()) {
                try {
                    uy8Var.b(list2);
                } catch (Exception unused6) {
                }
            }
        }
        boolean z2 = swh.b;
        Context context4 = jv4Var4.a;
        if (z2) {
            String strP3 = ch3.p();
            File fileQ1 = lu6.q0(new File(context4.getCacheDir(), strP3.equals(context4.getPackageName()) ? "tracer" : str + ((Object) Uri.encode(z5h.I0(strP3, ':', '-', false)))), "crashes");
            if (fileQ1.exists()) {
                lu6.l0(fileQ1);
                return;
            }
            return;
        }
        String str9 = str;
        String strP4 = ch3.p();
        if (strP4.equals(context4.getPackageName())) {
            i = 0;
        } else {
            i = 0;
            str6 = str9 + ((Object) Uri.encode(z5h.I0(strP4, ':', '-', false)));
        }
        File fileQ2 = lu6.q0(new File(context4.getCacheDir(), str6), "crashes");
        if (!fileQ2.exists() || (fileArrListFiles = fileQ2.listFiles()) == null || fileArrListFiles.length == 0) {
            list = r66Var2;
        } else {
            ArrayList arrayList = new ArrayList();
            int length5 = fileArrListFiles.length;
            while (i < length5) {
                try {
                    arrayList.add(jv4.a(fileArrListFiles[i]));
                } catch (Exception unused7) {
                }
                i++;
            }
            if (arrayList.isEmpty()) {
                list = r66Var2;
            } else {
                long jCurrentTimeMillis = System.currentTimeMillis() - 14400000;
                if (arrayList.size() > 1) {
                    bx3.Y0(arrayList, new lv5(18));
                }
                while (arrayList.size() > 10) {
                    ((cv4) cx3.e1(arrayList)).a();
                }
                while (((cv4) ww3.r1(arrayList)).g() < jCurrentTimeMillis) {
                    ((cv4) cx3.e1(arrayList)).a();
                    if (arrayList.isEmpty()) {
                        break;
                    }
                }
                list = arrayList;
            }
        }
        if (!list.isEmpty()) {
            j85.z(list);
        }
        oe9Var.d();
        oe9Var.a(4);
        khhVar.a(3);
    }
}
