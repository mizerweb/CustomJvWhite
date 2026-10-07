package defpackage;

import android.R;
import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.opengl.EGL14;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.os.Handler;
import android.util.SparseArray;
import androidx.media3.common.PlaybackException;
import androidx.media3.database.DatabaseIOException;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class gvb implements i81, l8e {
    public static final String[] e = {"id", "key", "metadata"};
    public Object a;
    public Object b;
    public Object c;
    public Object d;

    public gvb(int i) {
        switch (i) {
            case 7:
                this.c = new ArrayDeque();
                this.d = new ArrayDeque();
                this.a = new ArrayDeque();
                break;
            case 16:
                this.b = new mw(0);
                this.c = new SparseArray();
                this.d = new vi9((Object) null);
                this.a = new mw(0);
                break;
            default:
                this.b = new rbd(10);
                this.c = new h6g(0);
                this.d = new ArrayList();
                this.a = new HashSet();
                break;
        }
    }

    public static void k(m35 m35Var, String str) throws DatabaseIOException {
        try {
            String str2 = "ExoPlayerCacheIndex" + str;
            SQLiteDatabase writableDatabase = m35Var.getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            try {
                usi.b(writableDatabase, 1, str);
                writableDatabase.execSQL("DROP TABLE IF EXISTS ".concat(str2));
                writableDatabase.setTransactionSuccessful();
            } finally {
                writableDatabase.endTransaction();
            }
        } catch (SQLException e2) {
            throw new DatabaseIOException(e2);
        }
    }

    public ix2 A() {
        return (ix2) this.a;
    }

    @Override // defpackage.l8e
    public void B(Object obj, zv8 zv8Var, Object obj2) {
        SharedPreferences.Editor editorEdit = ((SharedPreferences) this.c).edit();
        d0g.e(editorEdit, (String) this.a, obj2);
        editorEdit.apply();
    }

    public sac C() {
        return (sac) this.d;
    }

    public sac D() {
        return (sac) this.c;
    }

    public pwa E(String str) {
        if (!((ConcurrentHashMap) this.a).containsKey(str)) {
            synchronized (this) {
                try {
                    if (!((ConcurrentHashMap) this.a).containsKey(str)) {
                        try {
                            InputStream inputStreamB = ((uwa) this.b).b(str);
                            ((wwa) this.c).getClass();
                            for (juc jucVar : wwa.a(inputStreamB)) {
                                v2a v2aVar = (v2a) this.d;
                                qg7 qg7Var = (qg7) v2aVar.c;
                                if (((String) ((pl9) qg7Var.c).h(jucVar)).equals("001")) {
                                    ((qg7) v2aVar.b).b(jucVar);
                                } else {
                                    qg7Var.b(jucVar);
                                }
                            }
                            ((ConcurrentHashMap) this.a).put(str, str);
                        } catch (IllegalArgumentException | IllegalStateException e2) {
                            throw new IllegalStateException("Failed to read file ".concat(str), e2);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return (v2a) this.d;
    }

    public sac F() {
        return (sac) this.b;
    }

    public PlaybackException G(i2a i2aVar) {
        synchronized (this.b) {
            try {
                return ((ad4) ((mw) this.d).get(i2aVar)) != null ? null : null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public c4d H(i2a i2aVar) {
        synchronized (this.b) {
            try {
                return ((ad4) ((mw) this.d).get(i2aVar)) != null ? null : null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public xhf I(i2a i2aVar) {
        ad4 ad4Var;
        synchronized (this.b) {
            ad4Var = (ad4) ((mw) this.d).get(i2aVar);
        }
        if (ad4Var != null) {
            return ad4Var.b;
        }
        return null;
    }

    public ix2 J() {
        return (ix2) this.b;
    }

    public fn8 K() {
        return (fn8) this.a;
    }

    public void L(SQLiteDatabase sQLiteDatabase) {
        String str = (String) this.a;
        str.getClass();
        usi.c(sQLiteDatabase, 1, str, 1);
        String str2 = (String) this.d;
        str2.getClass();
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS ".concat(str2));
        sQLiteDatabase.execSQL("CREATE TABLE " + ((String) this.d) + " (id INTEGER PRIMARY KEY NOT NULL,key TEXT NOT NULL,metadata BLOB NOT NULL)");
    }

    public boolean M(i2a i2aVar) {
        boolean z;
        synchronized (this.b) {
            z = ((mw) this.d).get(i2aVar) != null;
        }
        return z;
    }

    public boolean N(i2a i2aVar, int i) {
        ad4 ad4Var;
        synchronized (this.b) {
            ad4Var = (ad4) ((mw) this.d).get(i2aVar);
        }
        d3a d3aVar = (d3a) ((WeakReference) this.a).get();
        return ad4Var != null && ad4Var.e.a(i) && d3aVar != null && d3aVar.t.R().a(i);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x003c A[RETURN] */
    public boolean O(i2a i2aVar, int i) {
        ad4 ad4Var;
        boolean z;
        synchronized (this.b) {
            ad4Var = (ad4) ((mw) this.d).get(i2aVar);
        }
        if (ad4Var != null) {
            fmf fmfVar = ad4Var.d;
            fmfVar.getClass();
            lvb.O("Use contains(Command) for custom command", i != 0);
            Iterator<E> it = fmfVar.a.iterator();
            while (it.hasNext()) {
                if (((emf) it.next()).a == i) {
                    z = true;
                    if (z) {
                        return true;
                    }
                }
            }
            z = false;
            if (z) {
                return true;
            }
        }
        return false;
    }

    public boolean P(i2a i2aVar, emf emfVar) {
        ad4 ad4Var;
        synchronized (this.b) {
            ad4Var = (ad4) ((mw) this.d).get(i2aVar);
        }
        if (ad4Var == null) {
            return false;
        }
        u98 u98Var = ad4Var.d.a;
        emfVar.getClass();
        return u98Var.contains(emfVar) || by3.n(emfVar.b);
    }

    public void Q(af7 af7Var) {
        EGLDisplay eGLDisplay = (EGLDisplay) this.b;
        if (cqk.d((EGLContext) this.d, EGL14.EGL_NO_CONTEXT)) {
            return;
        }
        EGLSurface eGLSurface = (EGLSurface) this.a;
        boolean zEglMakeCurrent = EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, (EGLContext) this.d);
        wk8.g("eglMakeCurrent", 12291, 12297, 12299);
        if (zEglMakeCurrent) {
            try {
                af7Var.invoke();
                EGLSurface eGLSurface2 = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay, eGLSurface2, eGLSurface2, EGL14.EGL_NO_CONTEXT);
                wk8.g("eglMakeCurrent", new int[0]);
            } catch (Throwable th) {
                EGLSurface eGLSurface3 = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay, eGLSurface3, eGLSurface3, EGL14.EGL_NO_CONTEXT);
                wk8.g("eglMakeCurrent", new int[0]);
                throw th;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x005e  */
    public void R() {
        int size;
        int i;
        v8e v8eVar;
        byte[] bArr = uqi.a;
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            try {
                Iterator it = ((ArrayDeque) this.c).iterator();
                while (it.hasNext()) {
                    v8e v8eVar2 = (v8e) it.next();
                    if (((ArrayDeque) this.d).size() >= 64) {
                        break;
                    }
                    if (v8eVar2.b.get() < 5) {
                        it.remove();
                        v8eVar2.b.incrementAndGet();
                        arrayList.add(v8eVar2);
                        ((ArrayDeque) this.d).add(v8eVar2);
                    }
                }
                synchronized (this) {
                    ((ArrayDeque) this.d).size();
                    ((ArrayDeque) this.a).size();
                }
                size = arrayList.size();
                for (i = 0; i < size; i++) {
                    v8eVar = (v8e) arrayList.get(i);
                    ExecutorService executorServiceP = p();
                    y8e y8eVar = v8eVar.c;
                    byte[] bArr2 = uqi.a;
                    try {
                        try {
                            executorServiceP.execute(v8eVar);
                        } catch (RejectedExecutionException e2) {
                            InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                            interruptedIOException.initCause(e2);
                            y8eVar.j(interruptedIOException);
                            v8eVar.a.r(y8eVar, interruptedIOException);
                            y8eVar.a.a.s(v8eVar);
                        }
                    } catch (Throwable th) {
                        y8eVar.a.a.s(v8eVar);
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        size = arrayList.size();
        while (i < size) {
            v8eVar = (v8e) arrayList.get(i);
            ExecutorService executorServiceP2 = p();
            y8e y8eVar2 = v8eVar.c;
            byte[] bArr3 = uqi.a;
            executorServiceP2.execute(v8eVar);
        }
    }

    public void S(i2a i2aVar) {
        synchronized (this.b) {
            try {
                ad4 ad4Var = (ad4) ((mw) this.d).remove(i2aVar);
                if (ad4Var == null) {
                    return;
                }
                ((mw) this.c).remove(ad4Var.a);
                ad4Var.b.c();
                d3a d3aVar = (d3a) ((WeakReference) this.a).get();
                if (d3aVar == null || d3aVar.j()) {
                    return;
                }
                vqi.d0(d3aVar.l, new xc4(d3aVar, i2aVar, 0));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void T(kig kigVar) {
        o90 o90Var = new o90(this, 24, kigVar);
        synchronized (this.d) {
        }
        ((Handler) ((t3a) this.b).a).postDelayed(o90Var, 5400000L);
    }

    public void U() {
        int iL;
        v56 v56Var = (v56) this.c;
        p3c p3cVar = (p3c) this.b;
        y8j y8jVar = (y8j) this.a;
        int i = R.id.accessibilityActionPageLeft;
        i7j.i(y8jVar, R.id.accessibilityActionPageLeft);
        i7j.g(y8jVar, 0);
        i7j.i(y8jVar, R.id.accessibilityActionPageRight);
        i7j.g(y8jVar, 0);
        i7j.i(y8jVar, R.id.accessibilityActionPageUp);
        i7j.g(y8jVar, 0);
        i7j.i(y8jVar, R.id.accessibilityActionPageDown);
        i7j.g(y8jVar, 0);
        if (y8jVar.getAdapter() == null || (iL = y8jVar.getAdapter().l()) == 0 || !y8jVar.r) {
            return;
        }
        if (y8jVar.getOrientation() != 0) {
            if (y8jVar.d < iL - 1) {
                i7j.j(y8jVar, new s4(R.id.accessibilityActionPageDown), p3cVar);
            }
            if (y8jVar.d > 0) {
                i7j.j(y8jVar, new s4(R.id.accessibilityActionPageUp), v56Var);
                return;
            }
            return;
        }
        boolean z = y8jVar.g.H() == 1;
        int i2 = z ? 16908360 : 16908361;
        if (z) {
            i = 16908361;
        }
        if (y8jVar.d < iL - 1) {
            i7j.j(y8jVar, new s4(i2), p3cVar);
        }
        if (y8jVar.d > 0) {
            i7j.j(y8jVar, new s4(i), v56Var);
        }
    }

    public void a(Object obj, i2a i2aVar, fmf fmfVar, h3d h3dVar) {
        synchronized (this.b) {
            try {
                i2a i2aVarZ = z(obj);
                if (i2aVarZ == null) {
                    ((mw) this.c).put(obj, i2aVar);
                    ((mw) this.d).put(i2aVar, new ad4(obj, new xhf(), fmfVar, h3dVar));
                } else {
                    ad4 ad4Var = (ad4) ((mw) this.d).get(i2aVarZ);
                    ad4Var.getClass();
                    ad4Var.d = fmfVar;
                    ad4Var.e = h3dVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.i81
    public void b(g81 g81Var) {
        ((SparseArray) this.c).put(g81Var.a, g81Var);
    }

    @Override // defpackage.i81
    public boolean c() throws DatabaseIOException {
        try {
            SQLiteDatabase readableDatabase = ((m35) this.b).getReadableDatabase();
            String str = (String) this.a;
            str.getClass();
            return usi.a(readableDatabase, 1, str) != -1;
        } catch (SQLException e2) {
            throw new DatabaseIOException(e2);
        }
    }

    @Override // defpackage.i81
    public void d(HashMap map) throws DatabaseIOException {
        SparseArray sparseArray = (SparseArray) this.c;
        if (sparseArray.size() == 0) {
            return;
        }
        try {
            SQLiteDatabase writableDatabase = ((m35) this.b).getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            for (int i = 0; i < sparseArray.size(); i++) {
                try {
                    g81 g81Var = (g81) sparseArray.valueAt(i);
                    if (g81Var == null) {
                        int iKeyAt = sparseArray.keyAt(i);
                        String str = (String) this.d;
                        str.getClass();
                        writableDatabase.delete(str, "id = ?", new String[]{Integer.toString(iKeyAt)});
                    } else {
                        f(writableDatabase, g81Var);
                    }
                } catch (Throwable th) {
                    writableDatabase.endTransaction();
                    throw th;
                }
            }
            writableDatabase.setTransactionSuccessful();
            sparseArray.clear();
            writableDatabase.endTransaction();
        } catch (SQLException e2) {
            throw new DatabaseIOException(e2);
        }
    }

    @Override // defpackage.i81
    public void e(long j) {
        String hexString = Long.toHexString(j);
        this.a = hexString;
        this.d = qv1.k("ExoPlayerCacheIndex", hexString);
    }

    public void f(SQLiteDatabase sQLiteDatabase, g81 g81Var) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        s80.b(g81Var.d(), new DataOutputStream(byteArrayOutputStream));
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", Integer.valueOf(g81Var.a));
        contentValues.put("key", g81Var.b);
        contentValues.put("metadata", byteArray);
        String str = (String) this.d;
        str.getClass();
        sQLiteDatabase.replaceOrThrow(str, null, contentValues);
    }

    public void g(i2a i2aVar, int i, zc4 zc4Var) {
        synchronized (this.b) {
            try {
                ad4 ad4Var = (ad4) ((mw) this.d).get(i2aVar);
                if (ad4Var != null) {
                    h3d h3dVar = ad4Var.g;
                    h3dVar.getClass();
                    s74 s74Var = new s74(1);
                    s74Var.b(h3dVar.a);
                    s74Var.a(i);
                    ad4Var.g = new h3d(s74Var.d());
                    ad4Var.c.add(zc4Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void h(kig kigVar) {
        Runnable runnable;
        synchronized (this.d) {
            runnable = (Runnable) ((LinkedHashMap) this.a).remove(kigVar);
        }
        if (runnable != null) {
            ((Handler) ((t3a) this.b).a).removeCallbacks(runnable);
        }
    }

    @Override // defpackage.i81
    public void i(HashMap map) throws DatabaseIOException {
        try {
            SQLiteDatabase writableDatabase = ((m35) this.b).getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            try {
                L(writableDatabase);
                Iterator it = map.values().iterator();
                while (it.hasNext()) {
                    f(writableDatabase, (g81) it.next());
                }
                writableDatabase.setTransactionSuccessful();
                ((SparseArray) this.c).clear();
            } finally {
                writableDatabase.endTransaction();
            }
        } catch (SQLException e2) {
            throw new DatabaseIOException(e2);
        }
    }

    @Override // defpackage.i81
    public void j(g81 g81Var, boolean z) {
        SparseArray sparseArray = (SparseArray) this.c;
        int i = g81Var.a;
        if (z) {
            sparseArray.delete(i);
        } else {
            sparseArray.put(i, null);
        }
    }

    public void l(Object obj, ArrayList arrayList, HashSet hashSet) {
        if (arrayList.contains(obj)) {
            return;
        }
        if (hashSet.contains(obj)) {
            ore.q("This graph contains cyclic dependencies");
            return;
        }
        hashSet.add(obj);
        ArrayList arrayList2 = (ArrayList) ((h6g) this.c).get(obj);
        if (arrayList2 != null) {
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                l(arrayList2.get(i), arrayList, hashSet);
            }
        }
        hashSet.remove(obj);
        arrayList.add(obj);
    }

    @Override // defpackage.j8e
    public Object m(Object obj, zv8 zv8Var) {
        SharedPreferences sharedPreferences = (SharedPreferences) this.c;
        String str = (String) this.a;
        return d0g.d((sr3) this.d, sharedPreferences, this.b, str);
    }

    @Override // defpackage.i81
    public void n(HashMap map, SparseArray sparseArray) throws DatabaseIOException {
        m35 m35Var = (m35) this.b;
        lvb.b0(((SparseArray) this.c).size() == 0);
        try {
            SQLiteDatabase readableDatabase = m35Var.getReadableDatabase();
            String str = (String) this.a;
            str.getClass();
            if (usi.a(readableDatabase, 1, str) != 1) {
                SQLiteDatabase writableDatabase = m35Var.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                try {
                    L(writableDatabase);
                    writableDatabase.setTransactionSuccessful();
                    writableDatabase.endTransaction();
                } catch (Throwable th) {
                    writableDatabase.endTransaction();
                    throw th;
                }
            }
            SQLiteDatabase readableDatabase2 = m35Var.getReadableDatabase();
            String str2 = (String) this.d;
            str2.getClass();
            Cursor cursorQuery = readableDatabase2.query(str2, e, null, null, null, null, null);
            while (cursorQuery.moveToNext()) {
                try {
                    int i = cursorQuery.getInt(0);
                    String string = cursorQuery.getString(1);
                    string.getClass();
                    map.put(string, new g81(i, string, s80.a(new DataInputStream(new ByteArrayInputStream(cursorQuery.getBlob(2))))));
                    sparseArray.put(i, string);
                } catch (Throwable th2) {
                    if (cursorQuery == null) {
                        throw th2;
                    }
                    try {
                        cursorQuery.close();
                        throw th2;
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                        throw th2;
                    }
                }
            }
            cursorQuery.close();
        } catch (SQLiteException e2) {
            map.clear();
            sparseArray.clear();
            throw new DatabaseIOException(e2);
        }
    }

    @Override // defpackage.i81
    public void o() throws DatabaseIOException {
        m35 m35Var = (m35) this.b;
        String str = (String) this.a;
        str.getClass();
        k(m35Var, str);
    }

    public synchronized ExecutorService p() {
        try {
            if (((ExecutorService) this.b) == null) {
                this.b = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), new tqi(uqi.g + " Dispatcher", false));
            }
        } catch (Throwable th) {
            throw th;
        }
        return (ExecutorService) this.b;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Serializable q(String str, nq4 nq4Var) {
        zn7 zn7Var;
        if (nq4Var instanceof zn7) {
            zn7Var = (zn7) nq4Var;
            int i = zn7Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                zn7Var.f = i - Integer.MIN_VALUE;
            } else {
                zn7Var = new zn7(this, nq4Var);
            }
        } else {
            zn7Var = new zn7(this, nq4Var);
        }
        Object objF0 = zn7Var.d;
        int i2 = zn7Var.f;
        if (i2 == 0) {
            ch3.d0(objF0);
            j3 j3VarA = ((d9f) ((ny8) this.c).getValue()).a(str, 5, null);
            zn7Var.f = 1;
            objF0 = e9i.F0(j3VarA, zn7Var);
            hu4 hu4Var = hu4.a;
            if (objF0 == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(objF0);
        }
        List listA = ((j9f) objF0).a();
        ArrayList arrayList = new ArrayList();
        Iterator it = listA.iterator();
        while (it.hasNext()) {
            qn7 qn7VarA = zzl.a((zxd) it.next(), (Context) this.b, (p4c) ((ny8) this.d).getValue(), (j7c) ((ny8) this.a).getValue());
            if (qn7VarA != null) {
                arrayList.add(qn7VarA);
            }
        }
        return arrayList;
    }

    public void r(ArrayDeque arrayDeque, Object obj) {
        synchronized (this) {
            if (!arrayDeque.remove(obj)) {
                throw new AssertionError("Call wasn't in-flight!");
            }
        }
        R();
    }

    public void s(v8e v8eVar) {
        v8eVar.b.decrementAndGet();
        r((ArrayDeque) this.d, v8eVar);
    }

    public void t(ad4 ad4Var) {
        d3a d3aVar = (d3a) ((WeakReference) this.a).get();
        if (d3aVar == null) {
            return;
        }
        AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        while (atomicBoolean.get()) {
            atomicBoolean.set(false);
            zc4 zc4Var = (zc4) ad4Var.c.poll();
            if (zc4Var == null) {
                ad4Var.f = false;
                return;
            }
            AtomicBoolean atomicBoolean2 = new AtomicBoolean(true);
            gvb gvbVar = this;
            vqi.d0(d3aVar.l, new su6(d3aVar, this.z(ad4Var.a), new h82(gvbVar, zc4Var, atomicBoolean2, ad4Var, atomicBoolean, 1)));
            atomicBoolean2.set(false);
            this = gvbVar;
        }
    }

    public void u(final i2a i2aVar) {
        synchronized (this.b) {
            try {
                ad4 ad4Var = (ad4) ((mw) this.d).get(i2aVar);
                if (ad4Var == null) {
                    return;
                }
                final h3d h3dVar = ad4Var.g;
                ad4Var.g = h3d.b;
                ad4Var.c.add(new zc4(i2aVar, h3dVar) { // from class: yc4
                    public final /* synthetic */ i2a b;

                    @Override // defpackage.zc4
                    public final e89 run() {
                        d3a d3aVar = (d3a) ((WeakReference) this.a.a).get();
                        if (d3aVar != null) {
                            d3aVar.q(this.b);
                        }
                        return h88.b;
                    }
                });
                if (ad4Var.f) {
                    return;
                }
                ad4Var.f = true;
                t(ad4Var);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public ix2 v() {
        return (ix2) this.c;
    }

    public h3d w(i2a i2aVar) {
        synchronized (this.b) {
            try {
                ad4 ad4Var = (ad4) ((mw) this.d).get(i2aVar);
                if (ad4Var == null) {
                    return null;
                }
                return ad4Var.e;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public c98 x() {
        c98 c98VarN;
        synchronized (this.b) {
            c98VarN = c98.n(((mw) this.c).values());
        }
        return c98VarN;
    }

    public ix2 y() {
        return (ix2) this.d;
    }

    public i2a z(Object obj) {
        i2a i2aVar;
        synchronized (this.b) {
            i2aVar = (i2a) ((mw) this.c).get(obj);
        }
        return i2aVar;
    }

    public /* synthetic */ gvb(Object obj, Object obj2, Object obj3, Object obj4) {
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.a = obj4;
    }

    public gvb(d3a d3aVar) {
        this.c = new mw(0);
        this.d = new mw(0);
        this.b = new Object();
        this.a = new WeakReference(d3aVar);
    }

    public gvb(sr3 sr3Var, SharedPreferences sharedPreferences, Object obj, String str) {
        this.a = str;
        this.b = obj;
        this.c = sharedPreferences;
        this.d = sr3Var;
    }
}
