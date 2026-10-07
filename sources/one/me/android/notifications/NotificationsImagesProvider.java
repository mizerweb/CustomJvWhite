package one.me.android.notifications;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.UriMatcher;
import android.database.Cursor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import defpackage.a4c;
import defpackage.ch3;
import defpackage.cn5;
import defpackage.cqk;
import defpackage.dq6;
import defpackage.ek2;
import defpackage.f78;
import defpackage.gm0;
import defpackage.gu4;
import defpackage.hn5;
import defpackage.hu4;
import defpackage.je9;
import defpackage.k66;
import defpackage.l21;
import defpackage.l6g;
import defpackage.lq4;
import defpackage.nl0;
import defpackage.nq4;
import defpackage.ore;
import defpackage.p90;
import defpackage.poe;
import defpackage.q0;
import defpackage.qnb;
import defpackage.qs3;
import defpackage.rnb;
import defpackage.rx8;
import defpackage.sb8;
import defpackage.sbi;
import defpackage.ss3;
import defpackage.sya;
import defpackage.u78;
import defpackage.v71;
import defpackage.v78;
import defpackage.vd7;
import defpackage.w78;
import defpackage.wz6;
import defpackage.x72;
import defpackage.xra;
import defpackage.yab;
import defpackage.z5h;
import defpackage.zo5;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class NotificationsImagesProvider extends ContentProvider {
    public static final UriMatcher a;

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        uriMatcher.addURI("ru.oneme.app.notifications", "message_image/*/*", 1);
        a = uriMatcher;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object a(NotificationsImagesProvider notificationsImagesProvider, gu4 gu4Var, l6g l6gVar, nq4 nq4Var) {
        qnb qnbVar;
        v71 v71Var;
        if (nq4Var instanceof qnb) {
            qnbVar = (qnb) nq4Var;
            int i = qnbVar.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                qnbVar.h = i - Integer.MIN_VALUE;
            } else {
                qnbVar = new qnb(notificationsImagesProvider, nq4Var);
            }
        } else {
            qnbVar = new qnb(notificationsImagesProvider, nq4Var);
        }
        Object obj = qnbVar.f;
        int i2 = qnbVar.h;
        if (i2 == 0) {
            ch3.d0(obj);
            v71Var = l6gVar;
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            v71 v71Var2 = qnbVar.e;
            gu4 gu4Var2 = qnbVar.d;
            ch3.d0(obj);
            v71Var = v71Var2;
            gu4Var = gu4Var2;
        }
        while (cqk.x(gu4Var)) {
            dq6 dq6VarB = ((hn5) ((cn5) f78.g().d.get()).a.getValue()).b(v71Var);
            if (dq6VarB == null) {
                dq6VarB = null;
            }
            File file = dq6VarB != null ? dq6VarB.a : null;
            if (file != null && file.exists()) {
                return file;
            }
            qnbVar.d = gu4Var;
            qnbVar.e = v71Var;
            qnbVar.h = 1;
            Object objT = rx8.t(100L, qnbVar);
            hu4 hu4Var = hu4.a;
            if (objT == hu4Var) {
                return hu4Var;
            }
        }
        return null;
    }

    public static final Object b(NotificationsImagesProvider notificationsImagesProvider, Uri uri, xra xraVar) {
        ek2 ek2Var = new ek2(1, p90.B(xraVar));
        ek2Var.u();
        q0 q0VarE = vd7.A().e(v78.a(uri));
        ek2Var.w(new rnb(q0VarE, 0));
        q0VarE.l(new nl0(ek2Var, 1), x72.a);
        Object objS = ek2Var.s();
        return objS == hu4.a ? objS : sbi.a;
    }

    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    public final String[] getStreamTypes(Uri uri, String str) {
        if (z5h.K0(str, "*/", false) || z5h.K0(str, "image/", false)) {
            return sya.b;
        }
        return null;
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00d6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:49:0x00d8  */
    @Override // android.content.ContentProvider
    public final ParcelFileDescriptor openFile(Uri uri, String str) throws FileNotFoundException {
        List<String> pathSegments;
        Object poeVar;
        if (!"r".equals(str)) {
            throw new SecurityException("Only read mode is supported");
        }
        boolean z = true;
        if (a.match(uri) != 1 || (pathSegments = uri.getPathSegments()) == null || pathSegments.isEmpty()) {
            FileNotFoundException fileNotFoundException = new FileNotFoundException("wrong uri");
            gm0.V("one.me.android.notifications.NotificationsImagesProvider", "wrong uri", fileNotFoundException);
            throw fileNotFoundException;
        }
        List<String> pathSegments2 = uri.getPathSegments();
        String str2 = pathSegments2.get(1);
        if (str2 == null || str2.length() == 0) {
            FileNotFoundException fileNotFoundException2 = new FileNotFoundException("no uri");
            gm0.V("one.me.android.notifications.NotificationsImagesProvider", "no uri", fileNotFoundException2);
            throw fileNotFoundException2;
        }
        String str3 = pathSegments2.get(2);
        if (str3 == null) {
            FileNotFoundException fileNotFoundException3 = new FileNotFoundException("no load from network");
            gm0.V("one.me.android.notifications.NotificationsImagesProvider", "no load from network", fileNotFoundException3);
            throw fileNotFoundException3;
        }
        boolean z2 = Boolean.parseBoolean(str3);
        Uri uriK = sb8.K(str2);
        if (l21.k(getContext(), uriK)) {
            SecurityException securityException = new SecurityException("Internal uri detected");
            a4c a4cVar = gm0.f;
            if (a4cVar == null) {
                throw securityException;
            }
            je9 je9Var = je9.f;
            if (!a4cVar.b(je9Var)) {
                throw securityException;
            }
            a4cVar.c(je9Var, "one.me.android.notifications.NotificationsImagesProvider", zo5.l(uri, "openFile: failed, internal uri="), securityException);
            throw securityException;
        }
        w78 w78VarD = w78.d(uriK);
        w78VarD.b = u78.DISK_CACHE;
        v78 v78VarA = w78VarD.a();
        ss3.e.getClass();
        qs3 qs3Var = ss3.f;
        qs3Var.getClass();
        l6g l6gVarO = qs3Var.o(v78VarA.b);
        dq6 dq6VarB = ((hn5) ((cn5) f78.g().d.get()).a.getValue()).b(l6gVarO);
        lq4 lq4Var = null;
        if (dq6VarB == null) {
            dq6VarB = null;
        }
        File file = dq6VarB != null ? dq6VarB.a : null;
        if (file != null) {
            try {
                if (!file.exists() || !file.canRead()) {
                    z = false;
                }
                poeVar = Boolean.valueOf(z);
            } catch (Throwable th) {
                poeVar = new poe(th);
            }
            Object obj = Boolean.FALSE;
            if (poeVar instanceof poe) {
                poeVar = obj;
            }
            if (!((Boolean) poeVar).booleanValue()) {
                if (z2) {
                    file = (File) yab.A0(k66.a, new wz6(this, uriK, l6gVarO, lq4Var, 25));
                }
            }
        } else if (z2) {
            file = (File) yab.A0(k66.a, new wz6(this, uriK, l6gVarO, lq4Var, 25));
        }
        if (file != null) {
            return ParcelFileDescriptor.open(file, 268435456);
        }
        String strS = zo5.s("openFile: no image in cache, loadFromNetwork=", z2);
        FileNotFoundException fileNotFoundException4 = new FileNotFoundException(strS);
        gm0.V("one.me.android.notifications.NotificationsImagesProvider", strS, fileNotFoundException4);
        throw fileNotFoundException4;
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}
