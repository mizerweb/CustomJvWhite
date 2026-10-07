package com.google.android.gms.common.api.internal;

import android.os.Looper;
import com.google.android.gms.common.api.Status;
import defpackage.h45;
import defpackage.nkk;
import defpackage.ukk;
import defpackage.voe;
import defpackage.yab;
import defpackage.zr0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public abstract class BasePendingResult<R extends voe> {
    public static final h45 j = new h45(6);
    public voe e;
    public Status f;
    public volatile boolean g;
    public boolean h;
    public final Object a = new Object();
    public final CountDownLatch b = new CountDownLatch(1);
    public final ArrayList c = new ArrayList();
    public final AtomicReference d = new AtomicReference();
    public boolean i = false;

    public BasePendingResult(ukk ukkVar) {
        new zr0(ukkVar != null ? ukkVar.a.f : Looper.getMainLooper(), 0);
        new WeakReference(ukkVar);
    }

    public final void a(nkk nkkVar) {
        synchronized (this.a) {
            try {
                if (d()) {
                    nkkVar.a(this.f);
                } else {
                    this.c.add(nkkVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract voe b(Status status);

    public final void c(Status status) {
        synchronized (this.a) {
            try {
                if (!d()) {
                    e(b(status));
                    this.h = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean d() {
        return this.b.getCount() == 0;
    }

    public final void e(voe voeVar) {
        synchronized (this.a) {
            try {
                if (this.h) {
                    return;
                }
                d();
                yab.u("Results have already been set", !d());
                yab.u("Result has already been consumed", !this.g);
                this.e = voeVar;
                this.f = voeVar.a();
                this.b.countDown();
                ArrayList arrayList = this.c;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((nkk) arrayList.get(i)).a(this.f);
                }
                arrayList.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void f() {
        boolean z = true;
        if (!this.i && !((Boolean) j.get()).booleanValue()) {
            z = false;
        }
        this.i = z;
    }
}
