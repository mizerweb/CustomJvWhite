package defpackage;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.media.AudioFormat;
import android.media.MediaCodec;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.Choreographer;
import androidx.fragment.app.a;
import androidx.fragment.app.b;
import androidx.fragment.app.c;
import androidx.media3.database.DatabaseIOException;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.InvalidRegistrarException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import one.me.android.media.service.OneMeMediaSessionService;
import org.apache.http.HttpStatus;
import ru.ok.android.externcalls.analytics.events.SdkMetricStatEvent;

/* JADX INFO: loaded from: classes.dex */
public final class v2a implements of8, xx0, iw7, pwa, qif, kmc, vs6 {
    public static final String[] d = {SdkMetricStatEvent.NAME_KEY, "length", "last_touch_timestamp"};
    public static final Object e = new Object();
    public static v2a f;
    public static int g;
    public final /* synthetic */ int a;
    public Object b;
    public Object c;

    public v2a(OneMeMediaSessionService oneMeMediaSessionService, String str, ComponentName componentName, PendingIntent pendingIntent, Bundle bundle) {
        this.a = 0;
        ComponentName componentName2 = null;
        if (TextUtils.isEmpty(str)) {
            ore.p("tag must not be null or empty");
            throw null;
        }
        if (componentName == null) {
            int i = ts9.a;
            Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
            intent.setPackage(oneMeMediaSessionService.getPackageName());
            List<ResolveInfo> listQueryBroadcastReceivers = oneMeMediaSessionService.getPackageManager().queryBroadcastReceivers(intent, 0);
            if (listQueryBroadcastReceivers.size() == 1) {
                ActivityInfo activityInfo = listQueryBroadcastReceivers.get(0).activityInfo;
                componentName2 = new ComponentName(activityInfo.packageName, activityInfo.name);
            } else if (listQueryBroadcastReceivers.size() > 1) {
                lvb.G0("MediaButtonReceiver", "More than one BroadcastReceiver that handles android.intent.action.MEDIA_BUTTON was found, returning null.");
            }
            componentName = componentName2;
            if (componentName == null) {
                lvb.r0("MediaSessionCompat", "Couldn't find a unique registered media button receiver in the given context.");
            }
        }
        if (componentName != null && pendingIntent == null) {
            Intent intent2 = new Intent("android.intent.action.MEDIA_BUTTON");
            intent2.setComponent(componentName);
            pendingIntent = PendingIntent.getBroadcast(oneMeMediaSessionService, 0, intent2, Build.VERSION.SDK_INT >= 31 ? 33554432 : 0);
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 29) {
            this.b = new s2a(oneMeMediaSessionService, str, bundle);
        } else if (i2 >= 28) {
            this.b = new r2a(oneMeMediaSessionService, str, bundle);
        } else {
            this.b = new q2a(oneMeMediaSessionService, str, bundle);
        }
        Looper looperMyLooper = Looper.myLooper();
        N(new l2a(), new Handler(looperMyLooper == null ? Looper.getMainLooper() : looperMyLooper));
        ((q2a) this.b).a.setMediaButtonReceiver(pendingIntent);
        this.c = new qg7(oneMeMediaSessionService, ((q2a) this.b).c);
    }

    public static v2a J() {
        synchronized (e) {
            try {
                v2a v2aVar = f;
                if (v2aVar == null) {
                    return new v2a(2, false);
                }
                f = (v2a) v2aVar.c;
                v2aVar.c = null;
                g--;
                return v2aVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void i(v2a v2aVar, pu3 pu3Var) {
        v2aVar.getClass();
        for (Map.Entry entry : new HashMap((HashMap) v2aVar.b).entrySet()) {
            qt4.A(entry.getKey());
            List list = (List) entry.getValue();
            if (!m(pu3Var, list).equals(m((pu3) v2aVar.c, list))) {
                throw null;
            }
        }
        v2aVar.c = pu3Var;
    }

    public static pu3 m(pu3 pu3Var, List list) {
        pu3Var.getClass();
        Map map = pu3Var.a;
        HashMap map2 = new HashMap(map);
        HashSet hashSet = new HashSet(list);
        for (String str : map.keySet()) {
            if (!hashSet.contains(str)) {
                map2.remove(str);
            }
        }
        return new pu3(map2);
    }

    public void A(a aVar, boolean z) {
        a aVar2 = ((c) this.b).x;
        if (aVar2 != null) {
            aVar2.l().n.A(aVar, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.c).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                ore.m();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    public void B(a aVar, Bundle bundle, boolean z) {
        a aVar2 = ((c) this.b).x;
        if (aVar2 != null) {
            aVar2.l().n.B(aVar, bundle, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.c).iterator();
        if (it.hasNext()) {
            qt4.A(it.next());
            if (!z) {
                throw null;
            }
            throw null;
        }
    }

    public void C(a aVar, boolean z) {
        a aVar2 = ((c) this.b).x;
        if (aVar2 != null) {
            aVar2.l().n.C(aVar, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.c).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                ore.m();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    public void D(a aVar, boolean z) {
        a aVar2 = ((c) this.b).x;
        if (aVar2 != null) {
            aVar2.l().n.D(aVar, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.c).iterator();
        if (it.hasNext()) {
            qt4.A(it.next());
            if (!z) {
                throw null;
            }
            throw null;
        }
    }

    public void E(a aVar, boolean z) {
        a aVar2 = ((c) this.b).x;
        if (aVar2 != null) {
            aVar2.l().n.E(aVar, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.c).iterator();
        if (it.hasNext()) {
            qt4.A(it.next());
            if (!z) {
                throw null;
            }
            throw null;
        }
    }

    public HashMap F() throws DatabaseIOException {
        try {
            ((String) this.c).getClass();
            Cursor cursorQuery = ((m35) this.b).getReadableDatabase().query((String) this.c, d, null, null, null, null, null);
            try {
                HashMap map = new HashMap(cursorQuery.getCount());
                while (cursorQuery.moveToNext()) {
                    String string = cursorQuery.getString(0);
                    string.getClass();
                    map.put(string, new p71(cursorQuery.getLong(1), cursorQuery.getLong(2)));
                }
                cursorQuery.close();
                return map;
            } catch (Throwable th) {
                if (cursorQuery == null) {
                    throw th;
                }
                try {
                    cursorQuery.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        } catch (SQLException e2) {
            throw new DatabaseIOException(e2);
        }
    }

    public oa0 G(b87 b87Var, p70 p70Var) {
        boolean zBooleanValue;
        b87Var.getClass();
        int i = b87Var.G;
        p70Var.getClass();
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 29 || i == -1) {
            return oa0.d;
        }
        Context context = (Context) this.b;
        Boolean bool = (Boolean) this.c;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            if (context != null) {
                String parameters = p90.q(context).getParameters("offloadVariableRateSupported");
                this.c = Boolean.valueOf(parameters != null && parameters.equals("offloadVariableRateSupported=1"));
            } else {
                this.c = Boolean.FALSE;
            }
            zBooleanValue = ((Boolean) this.c).booleanValue();
        }
        String str = b87Var.n;
        str.getClass();
        int iC = uya.c(str, b87Var.k);
        if (iC == 0 || i2 < vqi.t(iC)) {
            return oa0.d;
        }
        int iU = vqi.u(b87Var.F);
        if (iU == 0) {
            return oa0.d;
        }
        try {
            AudioFormat audioFormatBuild = new AudioFormat.Builder().setSampleRate(i).setChannelMask(iU).setEncoding(iC).build();
            return i2 >= 31 ? erl.c(audioFormatBuild, p70Var.c(), zBooleanValue) : drl.a(audioFormatBuild, p70Var.c(), zBooleanValue);
        } catch (IllegalArgumentException unused) {
            return oa0.d;
        }
    }

    public jj6 H(Object... objArr) {
        Constructor constructorB;
        synchronized (((AtomicBoolean) this.c)) {
            if (!((AtomicBoolean) this.c).get()) {
                try {
                    constructorB = ((c) this.b).b();
                } catch (ClassNotFoundException unused) {
                    ((AtomicBoolean) this.c).set(true);
                    constructorB = null;
                } catch (Exception e2) {
                    throw new RuntimeException("Error instantiating extension", e2);
                }
            }
            constructorB = null;
        }
        if (constructorB == null) {
            return null;
        }
        try {
            return (jj6) constructorB.newInstance(objArr);
        } catch (Exception e3) {
            ore.l("Unexpected error creating extractor", e3);
            return null;
        }
    }

    public void I(long j) throws DatabaseIOException {
        m35 m35Var = (m35) this.b;
        try {
            String hexString = Long.toHexString(j);
            this.c = "ExoPlayerCacheFileMetadata" + hexString;
            if (usi.a(m35Var.getReadableDatabase(), 2, hexString) != 1) {
                SQLiteDatabase writableDatabase = m35Var.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                try {
                    usi.c(writableDatabase, 2, hexString, 1);
                    writableDatabase.execSQL("DROP TABLE IF EXISTS " + ((String) this.c));
                    writableDatabase.execSQL("CREATE TABLE " + ((String) this.c) + " (name TEXT PRIMARY KEY NOT NULL,length INTEGER NOT NULL,last_touch_timestamp INTEGER NOT NULL)");
                    writableDatabase.setTransactionSuccessful();
                } finally {
                    writableDatabase.endTransaction();
                }
            }
        } catch (SQLException e2) {
            throw new DatabaseIOException(e2);
        }
    }

    public void K() {
        synchronized (e) {
            try {
                int i = g;
                if (i < 5) {
                    this.b = null;
                    g = i + 1;
                    v2a v2aVar = f;
                    if (v2aVar != null) {
                        this.c = v2aVar;
                    }
                    f = this;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void L(Set set) throws DatabaseIOException {
        ((String) this.c).getClass();
        try {
            SQLiteDatabase writableDatabase = ((m35) this.b).getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            try {
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    writableDatabase.delete((String) this.c, "name = ?", new String[]{(String) it.next()});
                }
                writableDatabase.setTransactionSuccessful();
            } finally {
                writableDatabase.endTransaction();
            }
        } catch (SQLException e2) {
            throw new DatabaseIOException(e2);
        }
    }

    public void M(long j, long j2, String str) throws DatabaseIOException {
        ((String) this.c).getClass();
        try {
            SQLiteDatabase writableDatabase = ((m35) this.b).getWritableDatabase();
            ContentValues contentValues = new ContentValues();
            contentValues.put(SdkMetricStatEvent.NAME_KEY, str);
            contentValues.put("length", Long.valueOf(j));
            contentValues.put("last_touch_timestamp", Long.valueOf(j2));
            writableDatabase.replaceOrThrow((String) this.c, null, contentValues);
        } catch (SQLException e2) {
            throw new DatabaseIOException(e2);
        }
    }

    public void N(o2a o2aVar, Handler handler) {
        q2a q2aVar = (q2a) this.b;
        synchronized (q2aVar.d) {
            q2aVar.l = o2aVar;
            q2aVar.a.setCallback(o2aVar.b, handler);
            synchronized (o2aVar.a) {
                try {
                    o2aVar.d = new WeakReference(q2aVar);
                    m2a m2aVar = o2aVar.e;
                    if (m2aVar != null) {
                        m2aVar.removeCallbacksAndMessages(null);
                    }
                    o2aVar.e = new m2a(o2aVar, handler.getLooper());
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public void O(x2d x2dVar) {
        RemoteCallbackList remoteCallbackList;
        q2a q2aVar = (q2a) this.b;
        q2aVar.g = x2dVar;
        synchronized (q2aVar.d) {
            int iBeginBroadcast = q2aVar.f.beginBroadcast() - 1;
            while (true) {
                remoteCallbackList = q2aVar.f;
                if (iBeginBroadcast < 0) {
                    break;
                }
                try {
                    ((a38) remoteCallbackList.getBroadcastItem(iBeginBroadcast)).e(x2dVar);
                } catch (RemoteException | SecurityException e2) {
                    lvb.l0("MediaSessionCompat", "Dead object in setPlaybackState.", e2);
                }
                iBeginBroadcast--;
            }
            remoteCallbackList.finishBroadcast();
        }
        MediaSession mediaSession = q2aVar.a;
        if (x2dVar.l == null) {
            PlaybackState.Builder builder = new PlaybackState.Builder();
            builder.setState(x2dVar.a, x2dVar.b, x2dVar.d, x2dVar.h);
            builder.setBufferedPosition(x2dVar.c);
            builder.setActions(x2dVar.e);
            builder.setErrorMessage(x2dVar.g);
            Iterator it = x2dVar.i.iterator();
            while (it.hasNext()) {
                PlaybackState.CustomAction customActionB = ((w2d) it.next()).b();
                if (customActionB != null) {
                    builder.addCustomAction(customActionB);
                }
            }
            builder.setActiveQueueItemId(x2dVar.j);
            builder.setExtras(x2dVar.k);
            x2dVar.l = builder.build();
        }
        mediaSession.setPlaybackState(x2dVar.l);
    }

    public d40 P() throws IOException {
        File file = (File) this.c;
        File file2 = (File) this.b;
        if (file2.exists()) {
            if (file.exists()) {
                file2.delete();
            } else if (!file2.renameTo(file)) {
                lvb.G0("AtomicFile", "Couldn't rename file " + file2 + " to backup file " + file);
            }
        }
        try {
            return new d40(file2);
        } catch (FileNotFoundException e2) {
            File parentFile = file2.getParentFile();
            if (parentFile == null || !parentFile.mkdirs()) {
                throw new IOException(zo5.m(file2, "Couldn't create "), e2);
            }
            try {
                return new d40(file2);
            } catch (FileNotFoundException e3) {
                throw new IOException(zo5.m(file2, "Couldn't create "), e3);
            }
        }
    }

    @Override // defpackage.of8
    public wh3 a() {
        v2a v2aVar = this;
        List list = (List) ((zya) ((l3c) v2aVar.b).b.getValue()).b.get();
        ArrayList arrayList = new ArrayList(yw3.W0(list, 10));
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                return new wh3(arrayList, true);
            }
            yya yyaVar = (yya) it.next();
            boolean z = ((f5d) ((wo6) ((ny8) v2aVar.c).getValue())).b() == 0;
            long j = yyaVar.a;
            String str = yyaVar.r;
            arrayList.add(new w73(j, str != null ? Uri.parse(str) : null, yyaVar.b, yyaVar.c, yyaVar.t, yyaVar.f, null, z, yyaVar.g, yyaVar.h, (v73) v73.g.get(yyaVar.i), yyaVar.j, yyaVar.n, yyaVar.o, yyaVar.p, yyaVar.q, p90.o(false, yyaVar.u, yyaVar.k, yyaVar.l, yyaVar.m, true, false, false, false, false, false, false, false, false, false, false, false), null, null, null, 31458448));
            v2aVar = this;
            it = it;
        }
    }

    @Override // defpackage.qif
    public aw8 b(rv8 rv8Var) {
        Object objPutIfAbsent;
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.c;
        Class clsD = ((qr3) rv8Var).d();
        Object m71Var = concurrentHashMap.get(clsD);
        if (m71Var == null && (objPutIfAbsent = concurrentHashMap.putIfAbsent(clsD, (m71Var = new m71((aw8) ((cf7) this.b).invoke(rv8Var))))) != null) {
            m71Var = objPutIfAbsent;
        }
        return ((m71) m71Var).a;
    }

    @Override // defpackage.xx0
    public boolean c(String str) {
        return ((xx0) this.b).c(str);
    }

    @Override // defpackage.vs6
    public void d(File file) {
    }

    @Override // defpackage.vs6
    public void e(File file) {
        v2a v2aVarP = h81.p((h81) this.c, file);
        if (v2aVarP == null || ((String) v2aVarP.b) != ".cnt") {
            return;
        }
        ((ArrayList) this.b).add(new u95(file, (String) v2aVarP.c));
    }

    @Override // defpackage.vs6
    public void f(File file) {
    }

    @Override // defpackage.iw7
    public hw7 g() {
        return new vh3((ki3) this.b, ((h5) this.c).d(HttpStatus.SC_HTTP_VERSION_NOT_SUPPORTED));
    }

    @Override // defpackage.kmc
    public Object h(rv8 rv8Var, ArrayList arrayList) {
        Object poeVar;
        Object objPutIfAbsent;
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.c;
        Class clsD = ((qr3) rv8Var).d();
        Object jmcVar = concurrentHashMap.get(clsD);
        if (jmcVar == null && (objPutIfAbsent = concurrentHashMap.putIfAbsent(clsD, (jmcVar = new jmc()))) != null) {
            jmcVar = objPutIfAbsent;
        }
        jmc jmcVar2 = (jmc) jmcVar;
        ArrayList arrayList2 = new ArrayList(yw3.W0(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new ew8((bw8) it.next()));
        }
        ConcurrentHashMap concurrentHashMap2 = jmcVar2.a;
        Object obj = concurrentHashMap2.get(arrayList2);
        if (obj == null) {
            try {
                poeVar = (aw8) ((qf7) this.b).invoke(rv8Var, arrayList);
            } catch (Throwable th) {
                poeVar = new poe(th);
            }
            roe roeVar = new roe(poeVar);
            Object objPutIfAbsent2 = concurrentHashMap2.putIfAbsent(arrayList2, roeVar);
            obj = objPutIfAbsent2 == null ? roeVar : objPutIfAbsent2;
        }
        return ((roe) obj).a;
    }

    public lt4 j() {
        return new lt4(this);
    }

    public void k() {
        this.b = null;
        this.c = null;
    }

    public boolean l(int i) {
        return ((cx6) this.b).a.get(i);
    }

    @Override // defpackage.xx0
    public e89 n(Uri uri) {
        kr6 kr6Var = (kr6) this.c;
        if (kr6Var != null && kr6.u(kr6Var, uri)) {
            return kr6.t((kr6) this.c);
        }
        e89 e89VarN = ((xx0) this.b).n(uri);
        this.c = new kr6(uri, e89VarN);
        return e89VarN;
    }

    @Override // defpackage.xx0
    public e89 o(b0a b0aVar) {
        kr6 kr6Var = (kr6) this.c;
        if (kr6Var != null && kr6.v(kr6Var, b0aVar)) {
            return kr6.t((kr6) this.c);
        }
        e89 e89VarO = ((xx0) this.b).o(b0aVar);
        if (e89VarO == null) {
            return null;
        }
        this.c = new kr6(b0aVar, e89VarO);
        return e89VarO;
    }

    @Override // defpackage.xx0
    public e89 p(byte[] bArr) {
        kr6 kr6Var = (kr6) this.c;
        if (kr6Var != null && kr6.s(kr6Var, bArr)) {
            return kr6.t((kr6) this.c);
        }
        e89 e89VarP = ((xx0) this.b).p(bArr);
        this.c = new kr6(bArr, e89VarP);
        return e89VarP;
    }

    public void q(t55 t55Var) {
        synchronized (t55Var) {
        }
        Handler handler = (Handler) this.b;
        if (handler != null) {
            handler.post(new ib0(this, t55Var, 0));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v8, types: [java.util.List] */
    public ArrayList r() {
        ?? arrayList;
        ArrayList arrayList2 = new ArrayList();
        pgg pggVar = (pgg) this.c;
        Context context = (Context) this.b;
        Class cls = (Class) pggVar.a;
        Bundle bundle = null;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                Log.w("ComponentDiscovery", "Context has no PackageManager.");
            } else {
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) cls), np0.m);
                if (serviceInfo == null) {
                    Log.w("ComponentDiscovery", cls + " has no service info.");
                } else {
                    bundle = serviceInfo.metaData;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
            Log.w("ComponentDiscovery", "Application info not found.");
        }
        if (bundle == null) {
            Log.w("ComponentDiscovery", "Could not retrieve metadata, returning empty list of registrars.");
            arrayList = Collections.EMPTY_LIST;
        } else {
            arrayList = new ArrayList();
            for (String str : bundle.keySet()) {
                if ("com.google.firebase.components.ComponentRegistrar".equals(bundle.get(str)) && str.startsWith("com.google.firebase.components:")) {
                    arrayList.add(str.substring(31));
                }
            }
        }
        for (final String str2 : arrayList) {
            arrayList2.add(new xwd() { // from class: j74
                @Override // defpackage.xwd
                public final Object get() {
                    String str3 = str2;
                    try {
                        Class<?> cls2 = Class.forName(str3);
                        if (ComponentRegistrar.class.isAssignableFrom(cls2)) {
                            return (ComponentRegistrar) cls2.getDeclaredConstructor(null).newInstance(null);
                        }
                        throw new InvalidRegistrarException("Class " + str3 + " is not an instance of com.google.firebase.components.ComponentRegistrar");
                    } catch (ClassNotFoundException unused2) {
                        Log.w("ComponentDiscovery", "Class " + str3 + " is not an found.");
                        return null;
                    } catch (IllegalAccessException e2) {
                        throw new InvalidRegistrarException(c0a.o("Could not instantiate ", str3, "."), e2);
                    } catch (InstantiationException e3) {
                        throw new InvalidRegistrarException(c0a.o("Could not instantiate ", str3, "."), e3);
                    } catch (NoSuchMethodException e4) {
                        throw new InvalidRegistrarException(qv1.k("Could not instantiate ", str3), e4);
                    } catch (InvocationTargetException e5) {
                        throw new InvalidRegistrarException(qv1.k("Could not instantiate ", str3), e5);
                    }
                }
            });
        }
        return arrayList2;
    }

    public void s(a aVar, boolean z) {
        a aVar2 = ((c) this.b).x;
        if (aVar2 != null) {
            aVar2.l().n.s(aVar, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.c).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                ore.m();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    public void t(a aVar, boolean z) {
        c cVar = (c) this.b;
        b bVar = cVar.v.h;
        a aVar2 = cVar.x;
        if (aVar2 != null) {
            aVar2.l().n.t(aVar, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.c).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                ore.m();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    public String toString() {
        switch (this.a) {
            case 23:
                StringBuilder sb = new StringBuilder();
                sb.append((String) this.b);
                sb.append("(");
                return zo5.w(sb, (String) this.c, ")");
            default:
                return super.toString();
        }
    }

    public void u(a aVar, boolean z) {
        a aVar2 = ((c) this.b).x;
        if (aVar2 != null) {
            aVar2.l().n.u(aVar, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.c).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                ore.m();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    public void v(a aVar, boolean z) {
        a aVar2 = ((c) this.b).x;
        if (aVar2 != null) {
            aVar2.l().n.v(aVar, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.c).iterator();
        if (it.hasNext()) {
            qt4.A(it.next());
            if (!z) {
                throw null;
            }
            throw null;
        }
    }

    public void w(a aVar, boolean z) {
        a aVar2 = ((c) this.b).x;
        if (aVar2 != null) {
            aVar2.l().n.w(aVar, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.c).iterator();
        if (it.hasNext()) {
            qt4.A(it.next());
            if (!z) {
                throw null;
            }
            throw null;
        }
    }

    public void x(a aVar, boolean z) {
        a aVar2 = ((c) this.b).x;
        if (aVar2 != null) {
            aVar2.l().n.x(aVar, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.c).iterator();
        if (it.hasNext()) {
            qt4.A(it.next());
            if (!z) {
                throw null;
            }
            throw null;
        }
    }

    public void y(a aVar, boolean z) {
        c cVar = (c) this.b;
        b bVar = cVar.v.h;
        a aVar2 = cVar.x;
        if (aVar2 != null) {
            aVar2.l().n.y(aVar, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.c).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                ore.m();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    public void z(a aVar, boolean z) {
        a aVar2 = ((c) this.b).x;
        if (aVar2 != null) {
            aVar2.l().n.z(aVar, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.c).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                ore.m();
            } else {
                if (!z) {
                    throw null;
                }
                throw null;
            }
        }
    }

    public /* synthetic */ v2a(int i, boolean z) {
        this.a = i;
    }

    public /* synthetic */ v2a(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public v2a(String str, f55 f55Var, xvc xvcVar) {
        this.a = 7;
        this.c = str;
        this.b = f55Var;
    }

    public v2a(String str) {
        this.a = 20;
        this.b = str;
        this.c = new ifh(new d2(17, this));
    }

    public v2a(c cVar) {
        this.a = 29;
        this.b = cVar;
        this.c = new CopyOnWriteArrayList();
    }

    public v2a(Context context, int i) {
        this.a = i;
        switch (i) {
            case 21:
                this.b = context == null ? null : context.getApplicationContext();
                break;
            default:
                this.b = context.getApplicationContext();
                this.c = "ActivityThemer";
                break;
        }
    }

    public v2a(h81 h81Var, File file) {
        this.a = 25;
        this.b = h81Var;
        this.c = file;
    }

    public v2a(File file) {
        this.a = 9;
        this.b = file;
        this.c = new File(file.getPath() + ".bak");
    }

    public v2a(cx6 cx6Var, SparseArray sparseArray) {
        this.a = 5;
        this.b = cx6Var;
        SparseBooleanArray sparseBooleanArray = cx6Var.a;
        SparseArray sparseArray2 = new SparseArray(sparseBooleanArray.size());
        for (int i = 0; i < sparseBooleanArray.size(); i++) {
            int iB = cx6Var.b(i);
            wf wfVar = (wf) sparseArray.get(iB);
            wfVar.getClass();
            sparseArray2.append(iB, wfVar);
        }
        this.c = sparseArray2;
    }

    public v2a(cf7 cf7Var) {
        this.a = 16;
        this.b = cf7Var;
        this.c = new ConcurrentHashMap();
    }

    public v2a(qf7 qf7Var) {
        this.a = 17;
        this.b = qf7Var;
        this.c = new ConcurrentHashMap();
    }

    public v2a(MediaCodec.CryptoInfo cryptoInfo) {
        this.a = 19;
        this.b = cryptoInfo;
        this.c = new MediaCodec.CryptoInfo.Pattern(0, 0);
    }

    public v2a(int i) {
        this.a = i;
        switch (i) {
            case 15:
                this.b = new qg7((pl9) new cy5(19));
                this.c = new qg7((pl9) new j85(19));
                break;
            case 18:
                this.b = new LinkedHashMap();
                break;
            case 27:
                this.b = new HashMap();
                this.c = pu3.b;
                break;
            default:
                this.b = Choreographer.getInstance();
                this.c = Looper.myLooper();
                break;
        }
    }

    public v2a(h81 h81Var) {
        this.a = 22;
        this.c = h81Var;
        this.b = new ArrayList();
    }

    public /* synthetic */ v2a(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public v2a(c cVar) {
        this.a = 24;
        this.b = cVar;
        this.c = new AtomicBoolean(false);
    }
}
