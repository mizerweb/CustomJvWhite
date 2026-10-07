package defpackage;

import android.os.StatFs;
import android.os.SystemClock;
import android.util.Base64;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes.dex */
public final class hn5 {
    public final long a;
    public final long b;
    public long c;
    public final n71 d;
    public final HashSet e;
    public long f;
    public final tig g;
    public final ax5 h;
    public final ghb i;
    public final ghb j;
    public final fn5 k;
    public final j85 l;
    public final Object m = new Object();

    public hn5(ax5 ax5Var, ghb ghbVar, gn5 gn5Var, n71 n71Var, ghb ghbVar2, ExecutorService executorService) {
        tig tigVar;
        this.a = gn5Var.a;
        long j = gn5Var.b;
        this.b = j;
        this.c = j;
        synchronized (tig.class) {
            try {
                if (tig.h == null) {
                    tig.h = new tig();
                }
                tigVar = tig.h;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.g = tigVar;
        this.h = ax5Var;
        this.i = ghbVar;
        this.f = -1L;
        this.d = n71Var;
        this.j = ghbVar2;
        fn5 fn5Var = new fn5();
        fn5Var.a = false;
        fn5Var.b = -1L;
        fn5Var.c = -1L;
        this.k = fn5Var;
        this.l = j85.n;
        this.e = new HashSet();
        new CountDownLatch(0);
    }

    public final void a(long j) throws IOException {
        ax5 ax5Var = this.h;
        try {
            ArrayList<u95> arrayListC = c(ax5Var.l());
            fn5 fn5Var = this.k;
            long jA = fn5Var.a() - j;
            int i = 0;
            long j2 = 0;
            for (u95 u95Var : arrayListC) {
                if (j2 > jA) {
                    break;
                }
                long jK = ax5Var.k(u95Var);
                this.e.remove(u95Var.a);
                if (jK > 0) {
                    i++;
                    j2 += jK;
                    v2a.J().K();
                }
            }
            fn5Var.b(-j2, -i);
            ax5Var.a();
        } catch (IOException e) {
            e.getMessage();
            this.j.getClass();
            throw e;
        }
    }

    public final dq6 b(v71 v71Var) {
        dq6 dq6VarG;
        v2a v2aVarJ = v2a.J();
        v2aVarJ.b = v71Var;
        try {
            try {
                synchronized (this.m) {
                    try {
                        ArrayList arrayListX = p90.x(v71Var);
                        String str = null;
                        dq6VarG = null;
                        for (int i = 0; i < arrayListX.size() && (dq6VarG = this.h.g(v71Var, (str = (String) arrayListX.get(i)))) == null; i++) {
                        }
                        if (dq6VarG == null) {
                            this.e.remove(str);
                        } else {
                            str.getClass();
                            this.e.add(str);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                v2aVarJ.K();
                return dq6VarG;
            } catch (IOException unused) {
                this.j.getClass();
                v2aVarJ.K();
                return null;
            }
        } catch (Throwable th2) {
            v2aVarJ.K();
            throw th2;
        }
    }

    public final ArrayList c(Collection collection) {
        this.l.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis() + 7200000;
        ArrayList arrayList = new ArrayList(collection.size());
        ArrayList arrayList2 = new ArrayList(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            u95 u95Var = (u95) it.next();
            if (u95Var.a() > jCurrentTimeMillis) {
                arrayList.add(u95Var);
            } else {
                arrayList2.add(u95Var);
            }
        }
        this.i.getClass();
        Collections.sort(arrayList2, new lv5(22));
        arrayList.addAll(arrayList2);
        return arrayList;
    }

    public final boolean d(l6g l6gVar) {
        synchronized (this.m) {
            if (e(l6gVar)) {
                return true;
            }
            try {
                ArrayList arrayListX = p90.x(l6gVar);
                for (int i = 0; i < arrayListX.size(); i++) {
                    String str = (String) arrayListX.get(i);
                    if (this.h.h(str, l6gVar)) {
                        this.e.add(str);
                        return true;
                    }
                }
                return false;
            } catch (IOException unused) {
                return false;
            }
        }
    }

    public final boolean e(l6g l6gVar) {
        synchronized (this.m) {
            try {
                ArrayList arrayListX = p90.x(l6gVar);
                for (int i = 0; i < arrayListX.size(); i++) {
                    if (this.e.contains((String) arrayListX.get(i))) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void f(l6g l6gVar, t41 t41Var) {
        String strEncodeToString;
        dq6 dq6VarA;
        v2a v2aVarJ = v2a.J();
        v2aVarJ.b = l6gVar;
        synchronized (this.m) {
            try {
                byte[] bytes = l6gVar.a.getBytes(Charset.forName("UTF-8"));
                try {
                    MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
                    messageDigest.update(bytes, 0, bytes.length);
                    strEncodeToString = Base64.encodeToString(messageDigest.digest(), 11);
                } catch (NoSuchAlgorithmException e) {
                    throw new RuntimeException(e);
                }
            } catch (UnsupportedEncodingException e2) {
                throw new RuntimeException(e2);
            }
        }
        try {
            try {
                vbf vbfVarH = h(strEncodeToString, l6gVar);
                try {
                    vbfVarH.n(t41Var);
                    synchronized (this.m) {
                        dq6VarA = vbfVarH.a();
                        this.e.add(strEncodeToString);
                        this.k.b(dq6VarA.a.length(), 1L);
                    }
                    dq6VarA.a.length();
                    this.k.a();
                    n71 n71Var = this.d;
                    if (n71Var != null) {
                        n71Var.a(v2aVarJ);
                    }
                    File file = (File) vbfVarH.a;
                    if (!(!file.exists() || file.delete())) {
                        pj6.b("Failed to delete temp file", hn5.class);
                    }
                    v2aVarJ.K();
                } catch (Throwable th) {
                    File file2 = (File) vbfVarH.a;
                    if (!(!file2.exists() || file2.delete())) {
                        pj6.b("Failed to delete temp file", hn5.class);
                    }
                    throw th;
                }
            } catch (IOException e3) {
                if (pj6.a.h(6)) {
                    pj6.a.e(hn5.class.getSimpleName(), "Failed inserting a file into the cache", e3);
                }
                throw e3;
            }
        } catch (Throwable th2) {
            v2aVarJ.K();
            throw th2;
        }
    }

    public final boolean g() {
        boolean z;
        boolean z2;
        long j;
        this.l.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        fn5 fn5Var = this.k;
        synchronized (fn5Var) {
            z = fn5Var.a;
        }
        boolean z3 = false;
        long jMax = -1;
        if (z) {
            long j2 = this.f;
            if (j2 != -1 && jCurrentTimeMillis - j2 <= 1800000) {
                return false;
            }
        }
        this.l.getClass();
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        long j3 = 7200000 + jCurrentTimeMillis2;
        try {
            Iterator it = this.h.l().iterator();
            boolean z4 = false;
            int i = 0;
            long j4 = 0;
            while (true) {
                z2 = z3;
                if (!it.hasNext()) {
                    break;
                }
                try {
                    u95 u95Var = (u95) it.next();
                    i++;
                    if (u95Var.c < 0) {
                        u95Var.c = u95Var.b.a.length();
                    }
                    j4 += u95Var.c;
                    if (u95Var.a() > j3) {
                        if (u95Var.c < 0) {
                            u95Var.c = u95Var.b.a.length();
                        }
                        jMax = Math.max(u95Var.a() - jCurrentTimeMillis2, jMax);
                        z4 = true;
                    }
                    z3 = z2;
                } catch (IOException e) {
                    e = e;
                }
                e = e;
                ghb ghbVar = this.j;
                e.getMessage();
                ghbVar.getClass();
                return z2;
            }
            if (z4) {
                this.j.getClass();
            }
            fn5 fn5Var2 = this.k;
            synchronized (fn5Var2) {
                j = fn5Var2.c;
            }
            long j5 = i;
            if (j != j5 || this.k.a() != j4) {
                fn5 fn5Var3 = this.k;
                synchronized (fn5Var3) {
                    fn5Var3.c = j5;
                    fn5Var3.b = j4;
                    fn5Var3.a = true;
                }
            }
            this.f = jCurrentTimeMillis2;
            return true;
        } catch (IOException e2) {
            e = e2;
            z2 = z3;
        }
    }

    public final vbf h(String str, l6g l6gVar) {
        synchronized (this.m) {
            boolean zG = g();
            i();
            long jA = this.k.a();
            if (jA > this.c && !zG) {
                fn5 fn5Var = this.k;
                synchronized (fn5Var) {
                    fn5Var.a = false;
                    fn5Var.c = -1L;
                    fn5Var.b = -1L;
                }
                g();
            }
            long j = this.c;
            if (jA > j) {
                a((j * 9) / 10);
            }
        }
        return this.h.f(str, l6gVar);
    }

    public final void i() {
        long availableBlocksLong;
        char c = this.h.isExternal() ? (char) 2 : (char) 1;
        tig tigVar = this.g;
        long jA = this.b - this.k.a();
        tigVar.a();
        tigVar.a();
        ReentrantLock reentrantLock = tigVar.f;
        if (reentrantLock.tryLock()) {
            try {
                if (SystemClock.uptimeMillis() - tigVar.e > 120000) {
                    tigVar.a = tig.b(tigVar.a, tigVar.b);
                    tigVar.c = tig.b(tigVar.c, tigVar.d);
                    tigVar.e = SystemClock.uptimeMillis();
                }
                reentrantLock.unlock();
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
        StatFs statFs = c == 1 ? tigVar.a : tigVar.c;
        if (statFs != null) {
            availableBlocksLong = statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong();
        } else {
            availableBlocksLong = 0;
        }
        if (availableBlocksLong <= 0 || availableBlocksLong < jA) {
            this.c = this.a;
        } else {
            this.c = this.b;
        }
    }
}
