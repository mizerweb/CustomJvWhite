package defpackage;

import android.net.Uri;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class pa7 {
    public final /* synthetic */ int a;
    public final Object b;

    public pa7() {
        this.a = 0;
        this.b = new CopyOnWriteArrayList();
    }

    private final void c(aec aecVar, String str, String str2) {
    }

    private final void e(ldc ldcVar, Uri uri, long j, boolean z) {
    }

    private final void g(ldc ldcVar, Uri uri, long j, boolean z) {
    }

    private final void i(ldc ldcVar, Uri uri, long j, boolean z) {
    }

    public final void a(ldc ldcVar, Uri uri, long j, boolean z, int i) {
        int i2 = this.a;
        Object obj = this.b;
        switch (i2) {
            case 0:
                Iterator it = ((CopyOnWriteArrayList) obj).iterator();
                while (it.hasNext()) {
                    ((pa7) it.next()).a(ldcVar, uri, j, z, i);
                }
                break;
            default:
                ((ivb) obj).g.addAndGet(i);
                break;
        }
    }

    public final void b(aec aecVar, String str, String str2) {
        switch (this.a) {
            case 0:
                Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
                while (it.hasNext()) {
                    ((pa7) it.next()).b(aecVar, str, str2);
                }
                break;
        }
    }

    public final void d(ldc ldcVar, Uri uri, long j, boolean z) {
        switch (this.a) {
            case 0:
                Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
                while (it.hasNext()) {
                    ((pa7) it.next()).d(ldcVar, uri, j, z);
                }
                break;
        }
    }

    public final void f(ldc ldcVar, Uri uri, long j, boolean z) {
        switch (this.a) {
            case 0:
                Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
                while (it.hasNext()) {
                    ((pa7) it.next()).f(ldcVar, uri, j, z);
                }
                break;
        }
    }

    public final void h(ldc ldcVar, Uri uri, long j, boolean z) {
        switch (this.a) {
            case 0:
                Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
                while (it.hasNext()) {
                    ((pa7) it.next()).h(ldcVar, uri, j, z);
                }
                break;
        }
    }

    public pa7(ivb ivbVar) {
        this.a = 1;
        this.b = ivbVar;
    }
}
