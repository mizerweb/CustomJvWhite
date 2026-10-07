package defpackage;

import android.content.Context;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class hq6 {
    public final ps0 a = new ps0(14);
    public final qw2 b;
    public final qfa c;
    public final qki d;
    public final nka e;
    public final mvi f;
    public final iq6 g;
    public final kz8 h;
    public final fq6 i;
    public final gq6 j;

    public hq6(qw2 qw2Var, qfa qfaVar, qki qkiVar, nka nkaVar, mvi mviVar, iq6 iq6Var, kz8 kz8Var, fq6 fq6Var, gq6 gq6Var) {
        this.b = qw2Var;
        this.c = qfaVar;
        this.d = qkiVar;
        this.e = nkaVar;
        this.f = mviVar;
        this.g = iq6Var;
        this.h = kz8Var;
        this.i = fq6Var;
        this.j = gq6Var;
    }

    public final dc9 a() {
        List<vfi> listA;
        List listC;
        qki qkiVar = this.d;
        nka nkaVar = this.e;
        oki okiVar = new oki();
        HashSet hashSet = new HashSet();
        okiVar.a = hashSet;
        try {
            jji jjiVar = jji.UNKNOWN;
            listA = qkiVar.a();
        } catch (Throwable th) {
            gm0.V("oki", "getUploadsFromRepository: failed", th);
            listA = Collections.EMPTY_LIST;
        }
        for (vfi vfiVar : listA) {
            oki.c(hashSet, vfiVar.a.a);
            oki.c(hashSet, vfiVar.b);
        }
        HashSet hashSet2 = (HashSet) okiVar.a;
        try {
            listC = nkaVar.c();
        } catch (Throwable th2) {
            gm0.V("oki", "getMessageUploads: failed", th2);
            listC = Collections.EMPTY_LIST;
        }
        Iterator it = listC.iterator();
        while (it.hasNext()) {
            oki.c(hashSet2, ((gka) it.next()).b);
        }
        Iterator it2 = this.b.P(qw2.I).iterator();
        while (it2.hasNext()) {
            h1c h1cVar = ((rt2) it2.next()).b.e0;
        }
        HashSet hashSet3 = (HashSet) okiVar.a;
        List list = xfa.b;
        for (sfa sfaVar : this.c.m()) {
            if (sfaVar.C()) {
                for (int i = 0; i < sfaVar.m(); i++) {
                    c46 c46Var = sfaVar.n;
                    oki.c(hashSet3, ((e70) (c46Var != null ? (List) c46Var.a : null).get(i)).u);
                }
            }
        }
        HashSet hashSet4 = (HashSet) okiVar.a;
        Iterator it3 = ww3.X1(this.f.d.keySet()).iterator();
        while (it3.hasNext()) {
            oki.c(hashSet4, ((xui) it3.next()).a);
        }
        this.j.getClass();
        return b(new ft0(okiVar));
    }

    public final dc9 b(ft0 ft0Var) {
        b81 b81Var = b81.a;
        iq6 iq6Var = this.g;
        ArrayList arrayListC = c(iq6Var.a(b81Var), null, ft0Var);
        arrayListC.addAll(c(iq6Var.a(b81.b), null, ft0Var));
        if (iq6Var.o == null) {
            Context context = ((ju6) iq6Var.a).c;
            iq6Var.o = Arrays.asList(context.getExternalCacheDir(), context.getFilesDir());
        }
        List list = iq6Var.o;
        if (list != null && !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayListC.addAll(c((File) it.next(), null, ft0Var));
            }
        }
        Collections.sort(arrayListC, this.a);
        return new dc9(arrayListC, iq6Var, this.h, this.i);
    }

    /* JADX WARN: Code duplicated, block: B:74:0x019e  */
    public final ArrayList c(File file, b81 b81Var, ft0 ft0Var) {
        b81 b81Var2;
        if (file == null || !file.isDirectory()) {
            return new ArrayList();
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null || fileArrListFiles.length == 0) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList(fileArrListFiles.length);
        int length = fileArrListFiles.length;
        boolean z = false;
        int i = 0;
        while (i < length) {
            File file2 = fileArrListFiles[i];
            boolean z2 = true;
            b81 b81Var3 = b81.k;
            b81 b81Var4 = b81.j;
            b81 b81Var5 = b81.g;
            if (b81Var != null) {
                b81Var2 = b81Var;
            } else {
                iq6 iq6Var = this.g;
                iq6Var.getClass();
                rs6 rs6Var = iq6Var.a;
                String absolutePath = file2.getAbsolutePath();
                if (iq6Var.f == null) {
                    iq6Var.f = ((ju6) rs6Var).n();
                }
                if (absolutePath.startsWith(iq6Var.f.getAbsolutePath())) {
                    b81Var2 = b81.c;
                } else {
                    String absolutePath2 = file2.getAbsolutePath();
                    if (iq6Var.g == null) {
                        iq6Var.g = ((ju6) rs6Var).e(z);
                    }
                    if (absolutePath2.startsWith(iq6Var.g.getAbsolutePath())) {
                        b81Var2 = b81.d;
                    } else {
                        String absolutePath3 = file2.getAbsolutePath();
                        if (iq6Var.h == null) {
                            iq6Var.h = ((ju6) rs6Var).e(true);
                        }
                        if (absolutePath3.startsWith(iq6Var.h.getAbsolutePath())) {
                            b81Var2 = b81.d;
                        } else {
                            String absolutePath4 = file2.getAbsolutePath();
                            if (iq6Var.i == null) {
                                ju6 ju6Var = (ju6) rs6Var;
                                ju6Var.getClass();
                                iq6Var.i = ju6.j(ju6Var.b(), "stickerCache");
                            }
                            if (absolutePath4.startsWith(iq6Var.i.getAbsolutePath())) {
                                b81Var2 = b81.f;
                            } else {
                                String absolutePath5 = file2.getAbsolutePath();
                                if (iq6Var.j == null) {
                                    ju6 ju6Var2 = (ju6) rs6Var;
                                    ju6Var2.getClass();
                                    iq6Var.j = ju6.j(ju6Var2.b(), "gifCache");
                                }
                                if (absolutePath5.startsWith(iq6Var.j.getAbsolutePath())) {
                                    b81Var2 = b81.e;
                                } else {
                                    if (((ju6) rs6Var).w(file2.getPath())) {
                                        b81Var2 = b81Var5;
                                    } else {
                                        String absolutePath6 = file2.getAbsolutePath();
                                        if (iq6Var.k == null) {
                                            ju6 ju6Var3 = (ju6) rs6Var;
                                            ju6Var3.getClass();
                                            iq6Var.k = ju6.j(ju6Var3.b(), "exo_files_cache");
                                        }
                                        if (absolutePath6.startsWith(iq6Var.k.getAbsolutePath())) {
                                            b81Var2 = b81.h;
                                        } else {
                                            String absolutePath7 = file2.getAbsolutePath();
                                            if (iq6Var.l == null) {
                                                ju6 ju6Var4 = (ju6) rs6Var;
                                                ju6Var4.getClass();
                                                iq6Var.l = ju6.j(ju6Var4.b(), "videoCache");
                                            }
                                            if (absolutePath7.startsWith(iq6Var.l.getAbsolutePath())) {
                                                b81Var2 = b81.i;
                                            } else {
                                                String absolutePath8 = file2.getAbsolutePath();
                                                if (iq6Var.m == null) {
                                                    ju6 ju6Var5 = (ju6) rs6Var;
                                                    ju6Var5.getClass();
                                                    iq6Var.m = ju6.j(ju6Var5.b(), "ringtones");
                                                }
                                                if (absolutePath8.startsWith(iq6Var.m.getAbsolutePath())) {
                                                    b81Var2 = b81Var4;
                                                } else {
                                                    String absolutePath9 = file2.getAbsolutePath();
                                                    if (iq6Var.n == null) {
                                                        ju6 ju6Var6 = (ju6) rs6Var;
                                                        ju6Var6.getClass();
                                                        iq6Var.n = ju6.j(ju6Var6.c(), "ringtones");
                                                    }
                                                    b81Var2 = absolutePath9.startsWith(iq6Var.n.getAbsolutePath()) ? b81Var3 : b81.l;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (file2.isDirectory()) {
                arrayList.addAll(c(file2, b81Var2, ft0Var));
            } else {
                if (b81Var2 != b81Var5) {
                    if (b81Var2 == b81Var4 || b81Var2 == b81Var3) {
                        z2 = false;
                        break;
                    }
                } else {
                    oki okiVar = (oki) ft0Var.a;
                    if (okiVar != null) {
                        Iterator it = ((HashSet) okiVar.a).iterator();
                        while (it.hasNext()) {
                            if (((File) it.next()).equals(file2)) {
                                gm0.m("oki", "canBeRemoved: skip file: %s", file2);
                                z2 = false;
                                break;
                            }
                        }
                    }
                }
                if (z2) {
                    arrayList.add(new l71(file2, b81Var2));
                }
            }
            i++;
            z = false;
        }
        return arrayList;
    }
}
