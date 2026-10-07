package defpackage;

import android.os.Environment;
import android.util.SparseArray;
import com.facebook.common.file.FileUtils$CreateDirectoryException;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes.dex */
public final class h81 implements i81, en5 {
    public boolean a;
    public final Object b;
    public final Object c;
    public final Object d;
    public Object e;

    public h81(File file, int i, ghb ghbVar) {
        this.b = file;
        boolean zContains = false;
        try {
            File externalStorageDirectory = Environment.getExternalStorageDirectory();
            if (externalStorageDirectory != null) {
                try {
                    zContains = file.getCanonicalPath().contains(externalStorageDirectory.toString());
                } catch (IOException unused) {
                    ghbVar.getClass();
                }
            }
        } catch (Exception unused2) {
            ghbVar.getClass();
        }
        this.a = zContains;
        File file2 = new File((File) this.b, zo5.h(i, "v2.ols100."));
        this.c = file2;
        this.d = ghbVar;
        File file3 = (File) this.b;
        if (!file3.exists()) {
            wk8.y(file2);
        } else if (!file2.exists()) {
            qe7.o(file3);
            try {
                wk8.y(file2);
            } catch (FileUtils$CreateDirectoryException unused3) {
                ghb ghbVar2 = (ghb) this.d;
                Objects.toString(file2);
                ghbVar2.getClass();
            }
        }
        this.e = j85.n;
    }

    /* JADX WARN: Code duplicated, block: B:4:0x000d  */
    public static v2a p(h81 h81Var, File file) {
        v2a v2aVar;
        String name = file.getName();
        int iLastIndexOf = name.lastIndexOf(46);
        if (iLastIndexOf <= 0) {
            v2aVar = null;
        } else {
            String strSubstring = name.substring(iLastIndexOf);
            String str = ".cnt";
            if (!".cnt".equals(strSubstring)) {
                str = ".tmp".equals(strSubstring) ? ".tmp" : null;
            }
            if (str == null) {
                v2aVar = null;
            } else {
                String strSubstring2 = name.substring(0, iLastIndexOf);
                if (str.equals(".tmp")) {
                    int iLastIndexOf2 = strSubstring2.lastIndexOf(46);
                    if (iLastIndexOf2 <= 0) {
                        v2aVar = null;
                    } else {
                        strSubstring2 = strSubstring2.substring(0, iLastIndexOf2);
                    }
                }
                v2aVar = new v2a(str, 23, strSubstring2);
            }
        }
        if (v2aVar != null && new File(h81Var.t((String) v2aVar.c)).equals(file.getParentFile())) {
            return v2aVar;
        }
        return null;
    }

    public static int u(g81 g81Var, int i) {
        int iHashCode = g81Var.b.hashCode() + (g81Var.a * 31);
        if (i < 2) {
            long jA = bp4.a(g81Var.d());
            return (iHashCode * 31) + ((int) (jA ^ (jA >>> 32)));
        }
        return g81Var.d().hashCode() + (iHashCode * 31);
    }

    public static g81 w(int i, DataInputStream dataInputStream) throws IOException {
        k95 k95VarA;
        int i2 = dataInputStream.readInt();
        String utf = dataInputStream.readUTF();
        if (i < 2) {
            long j = dataInputStream.readLong();
            xp9 xp9Var = new xp9(12);
            xp9.T(xp9Var, j);
            k95VarA = k95.c.b(xp9Var);
        } else {
            k95VarA = s80.a(dataInputStream);
        }
        return new g81(i2, utf, k95VarA);
    }

    @Override // defpackage.en5
    public void a() {
        qe7.X((File) this.b, new n11(6, this));
    }

    @Override // defpackage.i81
    public void b(g81 g81Var) {
        this.a = true;
    }

    @Override // defpackage.i81
    public boolean c() {
        v2a v2aVar = (v2a) this.d;
        return ((File) v2aVar.b).exists() || ((File) v2aVar.c).exists();
    }

    @Override // defpackage.i81
    public void d(HashMap map) throws Throwable {
        if (this.a) {
            i(map);
        }
    }

    @Override // defpackage.i81
    public void e(long j) {
    }

    @Override // defpackage.en5
    public vbf f(String str, l6g l6gVar) throws IOException {
        ghb ghbVar = (ghb) this.d;
        File file = new File(t(str));
        if (!file.exists()) {
            try {
                wk8.y(file);
            } catch (FileUtils$CreateDirectoryException e) {
                ghbVar.getClass();
                throw e;
            }
        }
        try {
            File fileCreateTempFile = File.createTempFile(str.concat("."), ".tmp", file);
            vbf vbfVar = new vbf();
            vbfVar.c = this;
            vbfVar.b = str;
            vbfVar.a = fileCreateTempFile;
            return vbfVar;
        } catch (IOException e2) {
            ghbVar.getClass();
            throw e2;
        }
    }

    @Override // defpackage.en5
    public dq6 g(Object obj, String str) {
        File fileQ = q(str);
        if (!fileQ.exists()) {
            return null;
        }
        ((j85) this.e).getClass();
        fileQ.setLastModified(System.currentTimeMillis());
        return new dq6(fileQ);
    }

    @Override // defpackage.en5
    public boolean h(String str, l6g l6gVar) {
        return q(str).exists();
    }

    @Override // defpackage.i81
    public void i(HashMap map) throws Throwable {
        v2a v2aVar = (v2a) this.d;
        DataOutputStream dataOutputStream = null;
        try {
            d40 d40VarP = v2aVar.P();
            jpe jpeVar = (jpe) this.e;
            if (jpeVar == null) {
                this.e = new jpe(d40VarP);
            } else {
                jpeVar.b(d40VarP);
            }
            DataOutputStream dataOutputStream2 = new DataOutputStream((jpe) this.e);
            try {
                dataOutputStream2.writeInt(2);
                dataOutputStream2.writeInt(0);
                dataOutputStream2.writeInt(map.size());
                int iU = 0;
                for (g81 g81Var : map.values()) {
                    dataOutputStream2.writeInt(g81Var.a);
                    dataOutputStream2.writeUTF(g81Var.b);
                    s80.b(g81Var.d(), dataOutputStream2);
                    iU += u(g81Var, 2);
                }
                dataOutputStream2.writeInt(iU);
                dataOutputStream2.close();
                ((File) v2aVar.c).delete();
                String str = vqi.a;
                this.a = false;
            } catch (Throwable th) {
                th = th;
                dataOutputStream = dataOutputStream2;
                vqi.h(dataOutputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // defpackage.en5
    public boolean isExternal() {
        return this.a;
    }

    @Override // defpackage.i81
    public void j(g81 g81Var, boolean z) {
        this.a = true;
    }

    @Override // defpackage.en5
    public long k(u95 u95Var) {
        File file = u95Var.b.a;
        if (!file.exists()) {
            return 0L;
        }
        long length = file.length();
        if (file.delete()) {
            return length;
        }
        return -1L;
    }

    @Override // defpackage.en5
    public Collection l() {
        v2a v2aVar = new v2a(this);
        qe7.X((File) this.c, v2aVar);
        return Collections.unmodifiableList((ArrayList) v2aVar.b);
    }

    @Override // defpackage.en5
    public void m() {
        File[] fileArrListFiles = ((File) this.b).listFiles();
        if (fileArrListFiles != null) {
            for (File file : fileArrListFiles) {
                qe7.o(file);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0058  */
    @Override // defpackage.i81
    public void n(HashMap map, SparseArray sparseArray) throws Throwable {
        DataInputStream dataInputStream;
        lvb.b0(!this.a);
        Cipher cipher = (Cipher) this.b;
        v2a v2aVar = (v2a) this.d;
        File file = (File) v2aVar.b;
        File file2 = (File) v2aVar.b;
        File file3 = (File) v2aVar.c;
        if (file.exists() || file3.exists()) {
            DataInputStream dataInputStream2 = null;
            try {
                if (file3.exists()) {
                    file2.delete();
                    file3.renameTo(file2);
                }
                BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file2));
                DataInputStream dataInputStream3 = new DataInputStream(bufferedInputStream);
                try {
                    int i = dataInputStream3.readInt();
                    if (i < 0 || i > 2) {
                        vqi.h(dataInputStream3);
                    } else {
                        if ((dataInputStream3.readInt() & 1) == 0) {
                            dataInputStream = dataInputStream3;
                        } else if (cipher == null) {
                            vqi.h(dataInputStream3);
                        } else {
                            byte[] bArr = new byte[16];
                            dataInputStream3.readFully(bArr);
                            IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr);
                            try {
                                SecretKeySpec secretKeySpec = (SecretKeySpec) this.c;
                                String str = vqi.a;
                                cipher.init(2, secretKeySpec, ivParameterSpec);
                                dataInputStream = new DataInputStream(new CipherInputStream(bufferedInputStream, cipher));
                            } catch (InvalidAlgorithmParameterException e) {
                                e = e;
                                throw new IllegalStateException(e);
                            } catch (InvalidKeyException e2) {
                                e = e2;
                                throw new IllegalStateException(e);
                            }
                        }
                        try {
                            int i2 = dataInputStream.readInt();
                            int iU = 0;
                            for (int i3 = 0; i3 < i2; i3++) {
                                g81 g81VarW = w(i, dataInputStream);
                                String str2 = g81VarW.b;
                                map.put(str2, g81VarW);
                                sparseArray.put(g81VarW.a, str2);
                                iU += u(g81VarW, i);
                            }
                            int i4 = dataInputStream.readInt();
                            boolean z = dataInputStream.read() == -1;
                            if (i4 == iU && z) {
                                vqi.h(dataInputStream);
                                return;
                            }
                            vqi.h(dataInputStream);
                        } catch (IOException unused) {
                            dataInputStream2 = dataInputStream;
                            if (dataInputStream2 != null) {
                                vqi.h(dataInputStream2);
                            }
                        } catch (Throwable th) {
                            dataInputStream2 = dataInputStream;
                            th = th;
                            if (dataInputStream2 != null) {
                                vqi.h(dataInputStream2);
                            }
                            throw th;
                        }
                    }
                } catch (IOException unused2) {
                    dataInputStream2 = dataInputStream3;
                } catch (Throwable th2) {
                    th = th2;
                    dataInputStream2 = dataInputStream3;
                }
            } catch (IOException unused3) {
            } catch (Throwable th3) {
                th = th3;
            }
            map.clear();
            sparseArray.clear();
            file2.delete();
            file3.delete();
        }
    }

    @Override // defpackage.i81
    public void o() {
        v2a v2aVar = (v2a) this.d;
        ((File) v2aVar.b).delete();
        ((File) v2aVar.c).delete();
    }

    public File q(String str) {
        return new File(qt4.q(nbh.C(t(str)), File.separator, str, ".cnt"));
    }

    public hw7 r() {
        return (hw7) ((i10) this.d).get();
    }

    @Override // defpackage.en5
    public long remove(String str) {
        File fileQ = q(str);
        if (!fileQ.exists()) {
            return 0L;
        }
        long length = fileQ.length();
        if (fileQ.delete()) {
            return length;
        }
        return -1L;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:102:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:105:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:110:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:112:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:113:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:116:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:119:0x0206  */
    /* JADX WARN: Code duplicated, block: B:124:0x0214  */
    /* JADX WARN: Code duplicated, block: B:150:0x02bd  */
    /* JADX WARN: Code duplicated, block: B:204:0x01d1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:206:0x01bd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:20:0x0060  */
    /* JADX WARN: Code duplicated, block: B:21:0x0062  */
    /* JADX WARN: Code duplicated, block: B:66:0x011b  */
    public List s(final int i, final long j, boolean z) {
        Long lValueOf;
        List list;
        Iterator it;
        long jC;
        boolean z2;
        final Long lValueOf2;
        Iterator it2;
        Object next;
        long jC2;
        Object next2;
        long jC3;
        tq3 tq3Var;
        long jC4;
        Object next3;
        Object objPrevious;
        tq3 tq3Var2;
        boolean zB;
        boolean z3 = this.a;
        qg7 qg7Var = (qg7) this.b;
        final List listE = ((m3) this.c).e();
        List listL = r().l();
        if (listL.isEmpty()) {
            return listE;
        }
        tq3 tq3VarT = qe7.t(j, listL);
        boolean z4 = false;
        if (tq3VarT != null) {
            kw7 kw7Var = (kw7) ww3.t1(listE);
            kw7 kw7Var2 = (kw7) ww3.D1(listE);
            List list2 = listE;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                Iterator it3 = list2.iterator();
                while (true) {
                    if (it3.hasNext()) {
                        kw7 kw7Var3 = (kw7) it3.next();
                        if (kw7Var3 instanceof jw7) {
                            if (kw7Var3 == kw7Var || kw7Var3 == kw7Var2) {
                                zB = true;
                            } else {
                                zB = false;
                            }
                        } else if (r().a() && z) {
                            zB = tq3VarT.b(kw7Var3.getC());
                        } else if (((Boolean) ((g3) this.e).invoke(kw7Var3)).booleanValue() || tq3VarT.b(kw7Var3.getC())) {
                            zB = true;
                        } else {
                            zB = false;
                        }
                        if (!zB) {
                        }
                    }
                }
            }
            List listSingletonList = listE;
            if (listSingletonList.isEmpty()) {
                listSingletonList = r().k() == r().e() ? r66.a : Collections.singletonList(new jw7());
            }
            return listSingletonList;
        }
        if (tq3VarT == null && !z) {
            boolean z5 = i == 2;
            if (z5) {
                ListIterator listIterator = listL.listIterator(listL.size());
                do {
                    if (!listIterator.hasPrevious()) {
                        objPrevious = null;
                        break;
                    }
                    objPrevious = listIterator.previous();
                    tq3Var2 = (tq3) objPrevious;
                    if (j > tq3Var2.c()) {
                        break;
                    }
                } while (j <= tq3Var2.a());
                tq3 tq3Var3 = (tq3) objPrevious;
                if (tq3Var3 != null && j > tq3Var3.c()) {
                    lValueOf = Long.valueOf(tq3Var3.c());
                } else if (tq3Var3 != null) {
                    lValueOf = Long.valueOf(tq3Var3.a());
                } else {
                    lValueOf = null;
                }
            } else {
                lValueOf = null;
            }
            if (z5 && lValueOf != null) {
                lValueOf2 = lValueOf;
                z2 = false;
            } else if (z5) {
                list = listL;
                it = list.iterator();
                if (it.hasNext()) {
                    qr7.d();
                    return null;
                }
                jC = ((tq3) it.next()).c();
                while (it.hasNext()) {
                    jC4 = ((tq3) it.next()).c();
                    if (jC < jC4) {
                        jC = jC4;
                    }
                }
                if (j > jC) {
                    it2 = list.iterator();
                    if (it2.hasNext()) {
                        next = it2.next();
                        if (it2.hasNext()) {
                            jC2 = ((tq3) next).c();
                            do {
                                next2 = it2.next();
                                jC3 = ((tq3) next2).c();
                                if (jC2 < jC3) {
                                    next = next2;
                                    jC2 = jC3;
                                }
                            } while (it2.hasNext());
                        }
                    } else {
                        next = null;
                    }
                    tq3Var = (tq3) next;
                    if (tq3Var != null) {
                        lValueOf = Long.valueOf(tq3Var.c());
                        lValueOf2 = lValueOf;
                        z2 = false;
                    }
                }
                z2 = false;
                lValueOf2 = null;
            } else {
                List list3 = listL;
                Iterator it4 = list3.iterator();
                if (!it4.hasNext()) {
                    qr7.d();
                    return null;
                }
                long jA = ((tq3) it4.next()).a();
                while (it4.hasNext()) {
                    long jA2 = ((tq3) it4.next()).a();
                    if (jA > jA2) {
                        jA = jA2;
                    }
                }
                if (j < jA) {
                    Iterator it5 = list3.iterator();
                    if (it5.hasNext()) {
                        next3 = it5.next();
                        if (it5.hasNext()) {
                            long jA3 = ((tq3) next3).a();
                            do {
                                Object next4 = it5.next();
                                long jA4 = ((tq3) next4).a();
                                if (jA3 > jA4) {
                                    next3 = next4;
                                    jA3 = jA4;
                                }
                            } while (it5.hasNext());
                        }
                    } else {
                        next3 = null;
                    }
                    tq3 tq3Var4 = (tq3) next3;
                    lValueOf2 = tq3Var4 != null ? Long.valueOf(tq3Var4.a()) : null;
                    z2 = true;
                } else {
                    list = listL;
                    it = list.iterator();
                    if (it.hasNext()) {
                        qr7.d();
                        return null;
                    }
                    jC = ((tq3) it.next()).c();
                    while (it.hasNext()) {
                        jC4 = ((tq3) it.next()).c();
                        if (jC < jC4) {
                            jC = jC4;
                        }
                    }
                    if (j > jC) {
                        it2 = list.iterator();
                        if (it2.hasNext()) {
                            next = null;
                        } else {
                            next = it2.next();
                            if (it2.hasNext()) {
                                jC2 = ((tq3) next).c();
                                do {
                                    next2 = it2.next();
                                    jC3 = ((tq3) next2).c();
                                    if (jC2 < jC3) {
                                        next = next2;
                                        jC2 = jC3;
                                    }
                                } while (it2.hasNext());
                            }
                        }
                        tq3Var = (tq3) next;
                        if (tq3Var != null) {
                            lValueOf = Long.valueOf(tq3Var.c());
                            lValueOf2 = lValueOf;
                            z2 = false;
                        }
                    }
                    z2 = false;
                    lValueOf2 = null;
                }
            }
            if (lValueOf2 != null) {
                qg7Var.q(new af7() { // from class: zw7
                    @Override // defpackage.af7
                    public final Object invoke() {
                        return "getHistoryItems, nearestChunk " + lValueOf2 + ", time " + j + ", data " + listE.size() + ", nearestType:" + tt2.n(i);
                    }
                });
                List listH = gm0.h(listE, lValueOf2.longValue(), z3);
                qg7Var.q(new y00(2, listH));
                if (listH.size() == 1 && (ww3.r1(listH) instanceof jw7)) {
                    return v(listH, false);
                }
                if (listH.size() > 1) {
                    if (z2 && !(ww3.r1(listH) instanceof jw7) && ((kw7) ww3.r1(listH)).getA() != r().d()) {
                        ArrayList arrayListR0 = xw3.R0(new jw7());
                        arrayListR0.addAll(listH);
                        listH = arrayListR0;
                    } else if (!z2 && !(ww3.B1(listH) instanceof jw7) && ((kw7) ww3.B1(listH)).getA() != r().k()) {
                        qg7Var.r("getHistoryItems: insert last GAP because wasn't last in bounds");
                        listH = ww3.H1(new jw7(), listH);
                    }
                    return v(listH, false);
                }
            }
        }
        String str = (String) qg7Var.b;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                int size = listE.size();
                StringBuilder sb = new StringBuilder("getHistoryItems, chunk ");
                sb.append(tq3VarT);
                sb.append(", time ");
                sb.append(j);
                a4cVar.c(je9Var, str, zo5.v(sb, ", data ", size), null);
            }
        }
        List listH2 = gm0.h(listE, j, z3);
        qg7Var.q(new y00(3, listH2));
        if (!listH2.isEmpty() && z) {
            if (tq3VarT == null) {
                listH2 = Collections.singletonList(new jw7());
            } else if (listH2.size() != 1 || !(ww3.r1(listH2) instanceof jw7)) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : listH2) {
                    kw7 kw7Var4 = (kw7) obj;
                    if (tq3VarT.b(kw7Var4.getC()) || (kw7Var4 instanceof jw7)) {
                        arrayList.add(obj);
                    }
                }
                boolean zIsEmpty = arrayList.isEmpty();
                List listSingletonList2 = arrayList;
                if (zIsEmpty) {
                    listSingletonList2 = Collections.singletonList(new jw7());
                }
                listH2 = listSingletonList2;
            }
        }
        if (r().a() && z) {
            z4 = true;
        }
        return v(listH2, z4);
    }

    public String t(String str) {
        String strValueOf = String.valueOf(Math.abs(str.hashCode() % 100));
        StringBuilder sb = new StringBuilder();
        sb.append((File) this.c);
        return zo5.w(sb, File.separator, strValueOf);
    }

    /* JADX WARN: Code duplicated, block: B:91:0x019c  */
    public List v(List list, boolean z) {
        int i;
        boolean z2;
        List list2;
        Comparator comparator;
        Comparator comparator2;
        List listK1;
        qg7 qg7Var = (qg7) this.b;
        List listE = ((m3) this.c).e();
        List listL = r().l();
        ArrayList arrayList = new ArrayList();
        Iterator it = listE.iterator();
        while (true) {
            boolean z3 = true;
            i = 0;
            if (!it.hasNext()) {
                break;
            }
            kw7 kw7Var = (kw7) it.next();
            if (!(kw7Var instanceof jw7)) {
                boolean zBooleanValue = ((Boolean) ((g3) this.e).invoke(kw7Var)).booleanValue();
                if (!zBooleanValue) {
                    Iterator it2 = listL.iterator();
                    do {
                        if (!it2.hasNext()) {
                            z3 = false;
                            break;
                        }
                    } while (!((tq3) it2.next()).b(kw7Var.getC()));
                } else {
                    z3 = false;
                    break;
                }
                if (z) {
                    if (!zBooleanValue && !z3) {
                        arrayList.add(kw7Var);
                    }
                } else if (zBooleanValue || !z3) {
                    arrayList.add(kw7Var);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return list;
        }
        ArrayList arrayList2 = new ArrayList(list.size());
        Iterator it3 = list.iterator();
        boolean z4 = false;
        int i2 = 0;
        boolean z5 = false;
        while (it3.hasNext()) {
            int i3 = i2 + 1;
            kw7 kw7Var2 = (kw7) it3.next();
            if (kw7Var2 instanceof jw7) {
                if (i2 == 0) {
                    z4 = true;
                }
                if (i2 == xw3.O0(list)) {
                    z5 = true;
                }
            } else {
                arrayList2.add(kw7Var2);
            }
            i2 = i3;
        }
        Comparator comparatorC = r().c();
        o75 o75Var = er3.g;
        ThreadLocal threadLocal = vw3.a;
        o75 o75Var2 = er3.f;
        if (arrayList2.isEmpty()) {
            listK1 = ww3.k1(ww3.M1(arrayList, comparatorC));
        } else if (!arrayList.isEmpty()) {
            List listM1 = ww3.M1(arrayList, comparatorC);
            if (o75Var == o75Var2) {
                list2 = arrayList2;
                z2 = true;
            } else {
                list2 = arrayList2;
                z2 = false;
            }
            LinkedHashSet linkedHashSet = new LinkedHashSet(arrayList.size() + arrayList2.size());
            Set setNewSetFromMap = z2 ? Collections.newSetFromMap(new IdentityHashMap()) : null;
            Iterator it4 = arrayList2.iterator();
            while (it4.hasNext()) {
                linkedHashSet.add(it4.next());
            }
            ArrayList arrayList3 = new ArrayList(arrayList.size() + arrayList2.size());
            Object objR1 = ww3.r1(arrayList2);
            int i4 = 0;
            while (i4 < listM1.size()) {
                Object obj = listM1.get(i4);
                if (comparatorC.compare(obj, objR1) > 0) {
                    break;
                }
                if (!o75Var.d(obj, objR1) && vw3.a(true, linkedHashSet, z2, setNewSetFromMap, obj)) {
                    arrayList3.add(obj);
                }
                i4++;
            }
            int size = arrayList2.size();
            ArrayList arrayList4 = arrayList2;
            while (i < size) {
                Object obj2 = arrayList4.get(i);
                arrayList3.add(obj2);
                if (i < xw3.O0(arrayList4)) {
                    Object obj3 = arrayList4.get(i + 1);
                    if (comparatorC.compare(obj2, obj3) <= 0) {
                        while (i4 < listM1.size()) {
                            Object obj4 = listM1.get(i4);
                            if (comparatorC.compare(obj4, obj2) >= 0) {
                                if (comparatorC.compare(obj4, obj3) > 0) {
                                    break;
                                }
                                if (o75Var.d(obj4, obj2) || o75Var.d(obj4, obj3)) {
                                    comparator2 = comparatorC;
                                } else {
                                    comparator2 = comparatorC;
                                    if (vw3.a(true, linkedHashSet, z2, setNewSetFromMap, obj4)) {
                                        arrayList3.add(obj4);
                                    }
                                }
                                i4++;
                                comparatorC = comparator2;
                            } else {
                                i4++;
                            }
                        }
                        comparator = comparatorC;
                    } else {
                        comparator = comparatorC;
                    }
                } else {
                    comparator = comparatorC;
                }
                i++;
                comparatorC = comparator;
                arrayList4 = arrayList4;
            }
            while (i4 < listM1.size()) {
                int i5 = i4 + 1;
                Object obj5 = listM1.get(i4);
                if (vw3.a(true, linkedHashSet, z2, setNewSetFromMap, obj5)) {
                    arrayList3.add(obj5);
                }
                i4 = i5;
            }
            list2 = arrayList3;
        }
        if (!z4 && !z5) {
            return list2;
        }
        if (z4 && z5) {
            ArrayList arrayList5 = new ArrayList(list2.size() + 2);
            qg7Var.r("mergeVisibleWithOutliersPreservingEdges: insert first and last GAP");
            arrayList5.add(new jw7());
            arrayList5.addAll(list2);
            arrayList5.add(new jw7());
            return arrayList5;
        }
        if (!z4) {
            qg7Var.r("mergeVisibleWithOutliersPreservingEdges: insert last GAP");
            return ww3.H1(new jw7(), list2);
        }
        ArrayList arrayList6 = new ArrayList(list2.size() + 1);
        qg7Var.r("mergeVisibleWithOutliersPreservingEdges: insert first GAP");
        arrayList6.add(new jw7());
        arrayList6.addAll(list2);
        return arrayList6;
    }

    public h81(qg7 qg7Var, m3 m3Var, boolean z, i10 i10Var, g3 g3Var) {
        this.b = qg7Var;
        this.c = m3Var;
        this.a = z;
        this.d = i10Var;
        this.e = g3Var;
    }

    public h81(File file) {
        this.b = null;
        this.c = null;
        this.d = new v2a(file);
    }
}
