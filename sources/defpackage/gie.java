package defpackage;

import android.app.DownloadManager;
import android.content.IntentFilter;
import android.database.Cursor;
import android.os.ParcelFileDescriptor;
import android.util.LongSparseArray;
import com.google.android.gms.tasks.Task;
import com.google.mlkit.common.MlKitException;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class gie {
    private static final bo7 m = new bo7("ModelDownloadManager", "");
    private static final Map n = new HashMap();
    private final LongSparseArray a = new LongSparseArray();
    private final LongSparseArray b = new LongSparseArray();
    private final j0b c;
    private final DownloadManager d;
    private final fie e;
    private final u0b f;
    private final s5m g;
    private final a0g h;
    private final p0b i;
    private final r0b j;
    private final hie k;
    private fq5 l;

    public gie(j0b j0bVar, fie fieVar, p0b p0bVar, hie hieVar, r0b r0bVar, s5m s5mVar) {
        this.c = j0bVar;
        this.f = fieVar.e();
        this.e = fieVar;
        DownloadManager downloadManager = (DownloadManager) j0bVar.b().getSystemService("download");
        this.d = downloadManager;
        this.g = s5mVar;
        if (downloadManager == null) {
            m.a("ModelDownloadManager", "Download manager service is not available in the service.");
        }
        this.i = p0bVar;
        this.h = a0g.g(j0bVar);
        this.j = r0bVar;
        this.k = hieVar;
    }

    private final synchronized Long A(q0b q0bVar, fq5 fq5Var) throws MlKitException {
        try {
            yab.t(fq5Var, "DownloadConditions can not be null");
            String strD = this.h.d(this.e);
            Integer numE = e();
            if (strD != null && strD.equals(q0bVar.a()) && numE != null) {
                Integer numE2 = e();
                if (numE2 == null || (numE2.intValue() != 8 && numE2.intValue() != 16)) {
                    s5m s5mVar = this.g;
                    fie fieVar = this.e;
                    s5mVar.c(wze.l(), fieVar, ytl.NO_ERROR, false, fieVar.e(), tul.DOWNLOADING);
                }
                m.a("ModelDownloadManager", "New model is already in downloading, do nothing.");
                return null;
            }
            bo7 bo7Var = m;
            bo7Var.a("ModelDownloadManager", "Need to download a new model.");
            j();
            DownloadManager.Request request = new DownloadManager.Request(q0bVar.d());
            if (this.i.i(q0bVar.b(), q0bVar.c())) {
                bo7Var.a("ModelDownloadManager", "Model update is enabled and have a previous downloaded model, use download condition");
                this.g.c(wze.l(), this.e, ytl.NO_ERROR, false, q0bVar.c(), tul.UPDATE_AVAILABLE);
            }
            request.setRequiresCharging(fq5Var.a());
            if (fq5Var.b()) {
                request.setAllowedNetworkTypes(2);
            }
            return z(request, q0bVar);
        } catch (Throwable th) {
            throw th;
        }
    }

    public static synchronized gie g(j0b j0bVar, fie fieVar, p0b p0bVar, hie hieVar, r0b r0bVar) {
        Map map;
        fie fieVar2;
        try {
            map = n;
            if (map.containsKey(fieVar)) {
                fieVar2 = fieVar;
            } else {
                fieVar2 = fieVar;
                map.put(fieVar2, new gie(j0bVar, fieVar2, p0bVar, hieVar, r0bVar, f6m.f()));
            }
        } catch (Throwable th) {
            throw th;
        }
        return (gie) map.get(fieVar2);
    }

    private final Task v(long j) throws Throwable {
        j0b j0bVar = this.c;
        np4.z(j0bVar.b(), y(j), new IntentFilter("android.intent.action.DOWNLOAD_COMPLETE"), null, zj9.b().a(), 2);
        return w(j).a;
    }

    private final synchronized qjh w(long j) {
        qjh qjhVar = (qjh) this.b.get(j);
        if (qjhVar != null) {
            return qjhVar;
        }
        qjh qjhVar2 = new qjh();
        this.b.put(j, qjhVar2);
        return qjhVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MlKitException x(Long l) {
        DownloadManager downloadManager = this.d;
        Cursor cursorQuery = null;
        if (downloadManager != null && l != null) {
            cursorQuery = downloadManager.query(new DownloadManager.Query().setFilterById(l.longValue()));
        }
        int i = 13;
        String strK = "Model downloading failed";
        if (cursorQuery != null && cursorQuery.moveToFirst()) {
            int i2 = cursorQuery.getInt(cursorQuery.getColumnIndex("reason"));
            if (i2 == 1006) {
                strK = "Model downloading failed due to insufficient space on the device.";
                i = 101;
            } else {
                strK = c0a.k(i2, "Model downloading failed due to error code: ", " from Android DownloadManager");
            }
        }
        return new MlKitException(strK, i);
    }

    private final synchronized utk y(long j) throws Throwable {
        try {
            try {
                utk utkVar = (utk) this.a.get(j);
                if (utkVar != null) {
                    return utkVar;
                }
                utk utkVar2 = new utk(this, j, w(j), null);
                this.a.put(j, utkVar2);
                return utkVar2;
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private final synchronized Long z(DownloadManager.Request request, q0b q0bVar) {
        DownloadManager downloadManager = this.d;
        if (downloadManager == null) {
            return null;
        }
        long jEnqueue = downloadManager.enqueue(request);
        m.a("ModelDownloadManager", "Schedule a new downloading task: " + jEnqueue);
        this.h.m(jEnqueue, q0bVar);
        this.g.c(wze.l(), this.e, ytl.NO_ERROR, false, q0bVar.c(), tul.SCHEDULED);
        return Long.valueOf(jEnqueue);
    }

    public Task a() {
        MlKitException mlKitException;
        q0b q0bVarS;
        s5m s5mVar = this.g;
        wze wzeVarL = wze.l();
        fie fieVar = this.e;
        u0b u0bVar = u0b.UNKNOWN;
        tul tulVar = tul.EXPLICITLY_REQUESTED;
        ytl ytlVar = ytl.NO_ERROR;
        s5mVar.c(wzeVarL, fieVar, ytlVar, false, u0bVar, tulVar);
        Long lA = null;
        try {
            q0bVarS = s();
            mlKitException = null;
        } catch (MlKitException e) {
            mlKitException = e;
            q0bVarS = null;
        }
        try {
            Integer numE = e();
            Long lC = c();
            if (!i() && (numE == null || numE.intValue() != 8)) {
                if (numE != null && numE.intValue() == 16) {
                    MlKitException mlKitExceptionX = x(lC);
                    j();
                    return gwl.d(mlKitExceptionX);
                }
                if (numE == null || (!(numE.intValue() == 4 || numE.intValue() == 2 || numE.intValue() == 1) || lC == null || d() == null)) {
                    if (q0bVarS != null) {
                        lA = A(q0bVarS, this.l);
                    }
                    return lA == null ? gwl.d(new MlKitException("Failed to schedule the download task", 13, mlKitException)) : v(lA.longValue());
                }
                s5m s5mVar2 = this.g;
                wze wzeVarL2 = wze.l();
                fie fieVar2 = this.e;
                s5mVar2.c(wzeVarL2, fieVar2, ytlVar, false, fieVar2.e(), tul.DOWNLOADING);
                return v(lC.longValue());
            }
            if (q0bVarS != null) {
                Long lA2 = A(q0bVarS, this.l);
                if (lA2 != null) {
                    return v(lA2.longValue());
                }
                m.d("ModelDownloadManager", "Didn't schedule download for the updated model");
            }
            return gwl.e(null);
        } catch (MlKitException e2) {
            return gwl.d(new MlKitException("Failed to ensure the model is downloaded.", 13, e2));
        }
    }

    public synchronized ParcelFileDescriptor b() {
        try {
            DownloadManager downloadManager = this.d;
            Long lC = c();
            ParcelFileDescriptor parcelFileDescriptorOpenDownloadedFile = null;
            if (downloadManager == null || lC == null) {
                return null;
            }
            try {
                parcelFileDescriptorOpenDownloadedFile = downloadManager.openDownloadedFile(lC.longValue());
            } catch (FileNotFoundException unused) {
                m.b("ModelDownloadManager", "Downloaded file is not found");
            }
            return parcelFileDescriptorOpenDownloadedFile;
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized Long c() {
        return this.h.e(this.e);
    }

    public synchronized String d() {
        return this.h.d(this.e);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0041 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:18:0x0043 A[Catch: all -> 0x0047, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:7:0x000e, B:18:0x0043, B:35:0x006f, B:42:0x007c, B:41:0x0079, B:38:0x0074, B:9:0x0027, B:11:0x002d, B:22:0x0049, B:24:0x0050, B:26:0x0057, B:28:0x005d, B:30:0x0065), top: B:47:0x0001, inners: #1, #2 }] */
    /* JADX WARN: Code duplicated, block: B:22:0x0049 A[Catch: all -> 0x003c, TRY_ENTER, TryCatch #2 {all -> 0x003c, blocks: (B:9:0x0027, B:11:0x002d, B:22:0x0049, B:24:0x0050, B:26:0x0057, B:28:0x005d, B:30:0x0065), top: B:50:0x0027, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x006e  */
    public synchronized Integer e() {
        Integer numValueOf;
        DownloadManager downloadManager = this.d;
        Long lC = c();
        if (downloadManager != null && lC != null) {
            Cursor cursorQuery = downloadManager.query(new DownloadManager.Query().setFilterById(lC.longValue()));
            if (cursorQuery != null) {
                try {
                    if (cursorQuery.moveToFirst()) {
                        numValueOf = Integer.valueOf(cursorQuery.getInt(cursorQuery.getColumnIndex("status")));
                    }
                    if (numValueOf == null) {
                        Integer num = (numValueOf.intValue() != 2 || numValueOf.intValue() == 4 || numValueOf.intValue() == 1 || numValueOf.intValue() == 8 || numValueOf.intValue() == 16) ? numValueOf : null;
                        cursorQuery.close();
                        return num;
                    }
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                } catch (Throwable th) {
                    try {
                        cursorQuery.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            numValueOf = null;
            if (numValueOf == null) {
                if (numValueOf.intValue() != 2) {
                }
                cursorQuery.close();
                return num;
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
        }
        return null;
    }

    public int f(Long l) {
        int columnIndex;
        DownloadManager downloadManager = this.d;
        Cursor cursorQuery = null;
        if (downloadManager != null && l != null) {
            cursorQuery = downloadManager.query(new DownloadManager.Query().setFilterById(l.longValue()));
        }
        if (cursorQuery == null || !cursorQuery.moveToFirst() || (columnIndex = cursorQuery.getColumnIndex("reason")) == -1) {
            return 0;
        }
        return cursorQuery.getInt(columnIndex);
    }

    public boolean h() throws MlKitException {
        try {
            if (i()) {
                return true;
            }
        } catch (MlKitException unused) {
            m.a("ModelDownloadManager", "Failed to check if the model exist locally.");
        }
        Long lC = c();
        String strD = d();
        if (lC == null || strD == null) {
            m.a("ModelDownloadManager", "No new model is downloading.");
            j();
            return false;
        }
        Integer numE = e();
        m.a("ModelDownloadManager", "Download Status code: ".concat(String.valueOf(numE)));
        if (numE != null) {
            return f55.h(numE, 8) && u(strD) != null;
        }
        j();
        return false;
    }

    public boolean i() throws MlKitException {
        return this.i.i(this.e.f(), this.f);
    }

    public synchronized void j() throws MlKitException {
        try {
            DownloadManager downloadManager = this.d;
            Long lC = c();
            if (downloadManager != null && lC != null) {
                m.a("ModelDownloadManager", "Cancel or remove existing downloading task: ".concat(lC.toString()));
                if (this.d.remove(lC.longValue()) <= 0) {
                    if (e() == null) {
                    }
                }
                p0b p0bVar = this.i;
                fie fieVar = this.e;
                p0bVar.c(fieVar.f(), fieVar.e());
                this.h.a(this.e);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public void k(fq5 fq5Var) {
        yab.t(fq5Var, "DownloadConditions can not be null");
        this.l = fq5Var;
    }

    public synchronized void l(String str) throws MlKitException {
        this.h.o(this.e, str);
        j();
    }

    public final synchronized q0b s() throws MlKitException {
        try {
            boolean zI = i();
            if (zI) {
                s5m s5mVar = this.g;
                fie fieVar = this.e;
                s5mVar.c(wze.l(), fieVar, ytl.NO_ERROR, false, fieVar.e(), tul.LIVE);
            }
            r0b r0bVar = this.j;
            if (r0bVar == null) {
                throw new MlKitException("Please include com.google.mlkit:linkfirebase sdk as your dependency when you try to download from Firebase.", 14);
            }
            q0b q0bVarA = r0bVar.a(this.e);
            if (q0bVarA == null) {
                return null;
            }
            j0b j0bVar = this.c;
            fie fieVar2 = this.e;
            String strA = q0bVarA.a();
            a0g a0gVarG = a0g.g(j0bVar);
            boolean zEquals = strA.equals(a0gVarG.f(fieVar2));
            boolean z = false;
            boolean z2 = true;
            if (zEquals && p44.a(j0bVar.b()).equals(a0gVarG.l())) {
                m.b("ModelDownloadManager", "The model is incompatible with TFLite and the app is not upgraded, do not download");
                z2 = false;
            }
            if (!zI) {
                this.h.c(this.e);
            }
            boolean zEquals2 = q0bVarA.a().equals(a0g.g(this.c).h(this.e));
            boolean z3 = !zEquals2;
            if (!z2) {
                z = z3;
            } else if (!zI || !zEquals2) {
                return q0bVarA;
            }
            if (zI && (z ^ z2)) {
                return null;
            }
            throw new MlKitException("The model " + this.e.c() + " is incompatible with TFLite runtime", 100);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final File u(String str) throws MlKitException {
        bo7 bo7Var = m;
        bo7Var.a("ModelDownloadManager", "Model downloaded successfully");
        this.g.c(wze.l(), this.e, ytl.NO_ERROR, true, this.f, tul.SUCCEEDED);
        ParcelFileDescriptor parcelFileDescriptorB = b();
        if (parcelFileDescriptorB == null) {
            j();
            return null;
        }
        bo7Var.a("ModelDownloadManager", "moving downloaded model from external storage to private folder.");
        try {
            return this.k.b(parcelFileDescriptorB, str, this.e);
        } finally {
            j();
        }
    }
}
