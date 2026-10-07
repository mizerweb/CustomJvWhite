package defpackage;

import android.database.SQLException;
import android.os.ConditionVariable;
import androidx.media3.database.DatabaseIOException;
import androidx.media3.datasource.cache.Cache$CacheException;
import java.io.File;
import java.io.IOException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.TreeSet;
import ru.ok.android.onelog.impl.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public final class j6g {
    public static final HashSet l = new HashSet();
    public final File a;
    public final o71 b;
    public final s80 c;
    public final v2a d;
    public final HashMap e;
    public final Random f;
    public final boolean g;
    public long h;
    public long i;
    public boolean j;
    public Cache$CacheException k;

    public j6g(File file, o71 o71Var, m35 m35Var, boolean z) {
        boolean zAdd;
        s80 s80Var = new s80(m35Var, file, z);
        v2a v2aVar = (m35Var == null || z) ? null : new v2a(1, m35Var);
        synchronized (j6g.class) {
            zAdd = l.add(file.getAbsoluteFile());
        }
        if (!zAdd) {
            ore.k(zo5.m(file, "Another SimpleCache instance uses the folder: "));
            throw null;
        }
        this.a = file;
        this.b = o71Var;
        this.c = s80Var;
        this.d = v2aVar;
        this.e = new HashMap();
        this.f = new Random();
        this.g = true;
        this.h = -1L;
        ConditionVariable conditionVariable = new ConditionVariable();
        new i6g(this, conditionVariable).start();
        conditionVariable.block();
    }

    public static void a(j6g j6gVar) {
        v2a v2aVar = j6gVar.d;
        s80 s80Var = j6gVar.c;
        File file = j6gVar.a;
        if (!file.exists()) {
            try {
                e(file);
            } catch (Cache$CacheException e) {
                j6gVar.k = e;
                return;
            }
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            String str = "Failed to list cache directory files: " + file;
            lvb.k0("SimpleCache", str);
            j6gVar.k = new Cache$CacheException(str);
            return;
        }
        long jK = k(fileArrListFiles);
        j6gVar.h = jK;
        if (jK == -1) {
            try {
                long jNextLong = new SecureRandom().nextLong();
                long j = 0;
                long jAbs = jNextLong == Long.MIN_VALUE ? 0L : Math.abs(jNextLong);
                File file2 = new File(file, zo5.o(Long.toString(jAbs, 16), ".uid"));
                if (file2.createNewFile()) {
                    j = jAbs;
                } else {
                    qr7.k(zo5.m(file2, "Failed to create UID file: "));
                }
                j6gVar.h = j;
            } catch (IOException e2) {
                String str2 = "Failed to create cache UID: " + file;
                lvb.l0("SimpleCache", str2, e2);
                j6gVar.k = new Cache$CacheException(str2, e2);
                return;
            }
        }
        try {
            s80Var.q(j6gVar.h);
            if (v2aVar != null) {
                v2aVar.I(j6gVar.h);
                HashMap mapF = v2aVar.F();
                j6gVar.j(file, true, fileArrListFiles, mapF);
                v2aVar.L(mapF.keySet());
            } else {
                j6gVar.j(file, true, fileArrListFiles, null);
            }
            pci it = u98.m(((HashMap) s80Var.a).keySet()).iterator();
            while (it.hasNext()) {
                s80Var.s((String) it.next());
            }
            try {
                s80Var.x();
            } catch (IOException e3) {
                lvb.l0("SimpleCache", "Storing index file failed", e3);
            }
        } catch (IOException e4) {
            String str3 = "Failed to initialize cache indices: " + file;
            lvb.l0("SimpleCache", str3, e4);
            j6gVar.k = new Cache$CacheException(str3, e4);
        }
    }

    public static void e(File file) throws Cache$CacheException {
        if (file.mkdirs() || file.isDirectory()) {
            return;
        }
        String str = "Failed to create cache directory: " + file;
        lvb.k0("SimpleCache", str);
        throw new Cache$CacheException(str);
    }

    public static long k(File[] fileArr) {
        int length = fileArr.length;
        for (int i = 0; i < length; i++) {
            File file = fileArr[i];
            String name = file.getName();
            if (name.endsWith(".uid")) {
                try {
                    return Long.parseLong(name.substring(0, name.indexOf(46)), 16);
                } catch (NumberFormatException unused) {
                    lvb.k0("SimpleCache", "Malformed UID file: " + file);
                    file.delete();
                }
            }
        }
        return -1L;
    }

    public static synchronized void s(File file) {
        l.remove(file.getAbsoluteFile());
    }

    public final void b(m6g m6gVar) {
        String str = m6gVar.a;
        this.c.l(str).a(m6gVar);
        this.i += m6gVar.c;
        ArrayList arrayList = (ArrayList) this.e.get(str);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((o71) arrayList.get(size)).a(this, m6gVar);
            }
        }
        this.b.a(this, m6gVar);
    }

    public final synchronized void c(String str, xp9 xp9Var) {
        lvb.b0(!this.j);
        d();
        s80 s80Var = this.c;
        g81 g81VarL = s80Var.l(str);
        if (g81VarL.b(xp9Var)) {
            ((i81) s80Var.e).b(g81VarL);
        }
        try {
            this.c.x();
        } catch (IOException e) {
            throw new Cache$CacheException(e);
        }
    }

    public final synchronized void d() {
        Cache$CacheException cache$CacheException = this.k;
        if (cache$CacheException != null) {
            throw cache$CacheException;
        }
    }

    public final synchronized long f(long j, long j2, String str) {
        long j3;
        long j4 = BuildConfig.MAX_TIME_TO_UPLOAD;
        long j5 = j2 == -1 ? Long.MAX_VALUE : j2 + j;
        if (j5 >= 0) {
            j4 = j5;
        }
        j3 = 0;
        while (j < j4) {
            long jG = g(j, j4 - j, str);
            if (jG > 0) {
                j3 += jG;
            } else {
                jG = -jG;
            }
            j += jG;
        }
        return j3;
    }

    public final synchronized long g(long j, long j2, String str) {
        g81 g81VarG;
        lvb.b0(!this.j);
        if (j2 == -1) {
            j2 = BuildConfig.MAX_TIME_TO_UPLOAD;
        }
        g81VarG = this.c.g(str);
        return g81VarG != null ? g81VarG.c(j, j2) : -j2;
    }

    public final synchronized k95 h(String str) {
        g81 g81VarG;
        lvb.b0(!this.j);
        g81VarG = this.c.g(str);
        return g81VarG != null ? g81VarG.d() : k95.c;
    }

    public final synchronized boolean i(long j, long j2, String str) {
        g81 g81VarG;
        lvb.b0(!this.j);
        g81VarG = this.c.g(str);
        return g81VarG != null && g81VarG.c(j, j2) >= j2;
    }

    public final void j(File file, boolean z, File[] fileArr, Map map) {
        long j;
        long j2;
        if (fileArr == null || fileArr.length == 0) {
            if (z) {
                return;
            }
            file.delete();
            return;
        }
        for (File file2 : fileArr) {
            String name = file2.getName();
            if (z && name.indexOf(46) == -1) {
                j(file2, false, file2.listFiles(), map);
            } else if (!z || (!name.startsWith("cached_content_index.exi") && !name.endsWith(".uid"))) {
                p71 p71Var = map != null ? (p71) map.remove(name) : null;
                if (p71Var != null) {
                    j = p71Var.a;
                    j2 = p71Var.b;
                } else {
                    j = -1;
                    j2 = -9223372036854775807L;
                }
                m6g m6gVarB = m6g.b(file2, j, j2, this.c);
                if (m6gVarB != null) {
                    b(m6gVarB);
                } else {
                    file2.delete();
                }
            }
        }
    }

    public final synchronized void l() {
        File file;
        if (this.j) {
            return;
        }
        this.e.clear();
        p();
        try {
            try {
                this.c.x();
                file = this.a;
            } catch (Throwable th) {
                s(this.a);
                this.j = true;
                throw th;
            }
        } catch (IOException e) {
            lvb.l0("SimpleCache", "Storing index file failed", e);
            file = this.a;
        }
        s(file);
        this.j = true;
    }

    public final synchronized void m(m6g m6gVar) {
        lvb.b0(!this.j);
        g81 g81VarG = this.c.g(m6gVar.a);
        g81VarG.getClass();
        g81VarG.m(m6gVar.b);
        this.c.s(g81VarG.b);
        notifyAll();
    }

    public final synchronized void n(String str) {
        g81 g81VarG;
        lvb.b0(!this.j);
        synchronized (this) {
            try {
                lvb.b0(!this.j);
                g81VarG = this.c.g(str);
            } catch (Throwable th) {
                throw th;
            }
        }
        Iterator it = ((g81VarG == null || g81VarG.g()) ? new TreeSet() : new TreeSet((Collection) g81VarG.f())).iterator();
        while (it.hasNext()) {
            o((m6g) it.next());
        }
    }

    public final void o(m6g m6gVar) {
        String str = m6gVar.a;
        s80 s80Var = this.c;
        g81 g81VarG = s80Var.g(str);
        if (g81VarG == null || !g81VarG.k(m6gVar)) {
            return;
        }
        this.i -= m6gVar.c;
        v2a v2aVar = this.d;
        if (v2aVar != null) {
            File file = m6gVar.e;
            file.getClass();
            String name = file.getName();
            try {
                ((String) v2aVar.c).getClass();
                try {
                    ((m35) v2aVar.b).getWritableDatabase().delete((String) v2aVar.c, "name = ?", new String[]{name});
                } catch (SQLException e) {
                    throw new DatabaseIOException(e);
                }
            } catch (IOException unused) {
                tt2.f("Failed to remove file index entry for: ", name, "SimpleCache");
            }
        }
        s80Var.s(g81VarG.b);
        ArrayList arrayList = (ArrayList) this.e.get(m6gVar.a);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((o71) arrayList.get(size)).b(this, m6gVar);
            }
        }
        this.b.b(this, m6gVar);
    }

    public final void p() {
        ArrayList arrayList = new ArrayList();
        Iterator it = Collections.unmodifiableCollection(((HashMap) this.c.a).values()).iterator();
        while (it.hasNext()) {
            for (m6g m6gVar : ((g81) it.next()).f()) {
                File file = m6gVar.e;
                file.getClass();
                if (file.length() != m6gVar.c) {
                    arrayList.add(m6gVar);
                }
            }
        }
        for (int i = 0; i < arrayList.size(); i++) {
            o((m6g) arrayList.get(i));
        }
    }

    public final synchronized m6g q(long j, long j2, String str) {
        m6g m6gVarE;
        m6g m6gVarE2;
        lvb.b0(!this.j);
        d();
        g81 g81VarG = this.c.g(str);
        if (g81VarG == null) {
            m6gVarE2 = m6g.e(j, j2, str);
        } else {
            while (true) {
                m6gVarE = g81VarG.e(j, j2);
                if (!m6gVarE.d) {
                    break;
                }
                File file = m6gVarE.e;
                file.getClass();
                if (file.length() == m6gVarE.c) {
                    break;
                }
                p();
            }
            m6gVarE2 = m6gVarE;
        }
        if (m6gVarE2.d) {
            return r(str, m6gVarE2);
        }
        if (this.c.l(str).j(j, m6gVarE2.c)) {
            return m6gVarE2;
        }
        return null;
    }

    public final m6g r(String str, m6g m6gVar) {
        boolean z;
        if (!this.g) {
            return m6gVar;
        }
        File file = m6gVar.e;
        file.getClass();
        String name = file.getName();
        long j = m6gVar.c;
        long jCurrentTimeMillis = System.currentTimeMillis();
        v2a v2aVar = this.d;
        if (v2aVar != null) {
            try {
                v2aVar.M(j, jCurrentTimeMillis, name);
            } catch (IOException unused) {
                lvb.G0("SimpleCache", "Failed to update index with new touch timestamp.");
            }
            z = false;
        } else {
            z = true;
        }
        g81 g81VarG = this.c.g(str);
        g81VarG.getClass();
        m6g m6gVarL = g81VarG.l(m6gVar, jCurrentTimeMillis, z);
        ArrayList arrayList = (ArrayList) this.e.get(m6gVar.a);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((o71) arrayList.get(size)).c(this, m6gVar, m6gVarL);
            }
        }
        this.b.c(this, m6gVar, m6gVarL);
        return m6gVarL;
    }
}
