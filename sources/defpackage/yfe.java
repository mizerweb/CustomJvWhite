package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: loaded from: classes.dex */
public final class yfe extends t97 {
    public final ReentrantReadWriteLock e;
    public final ReentrantReadWriteLock f;
    public volatile au3 g;
    public final Handler h;
    public final Object i;
    public volatile hed j;

    public yfe(Drawable drawable, au3 au3Var) {
        super(drawable);
        this.e = new ReentrantReadWriteLock();
        this.f = new ReentrantReadWriteLock();
        this.g = au3Var;
        this.h = new Handler(Looper.getMainLooper());
        this.i = new Object();
    }

    @Override // defpackage.t97, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        ReentrantReadWriteLock.ReadLock lock = this.e.readLock();
        lock.lock();
        try {
            au3 au3Var = this.g;
            if (au3Var != null && au3Var.P()) {
                super.draw(canvas);
            }
        } finally {
            lock.unlock();
        }
    }

    @Override // defpackage.t97, defpackage.w1i
    public final void f(x1i x1iVar) {
        ReentrantReadWriteLock.WriteLock writeLock = this.f.writeLock();
        writeLock.lock();
        try {
            this.c = x1iVar;
            writeLock.unlock();
            synchronized (this.i) {
                try {
                    hed hedVar = this.j;
                    if (hedVar != null) {
                        this.h.removeCallbacks(hedVar);
                    }
                    if (x1iVar == null) {
                        hed hedVar2 = new hed(3, this);
                        this.j = hedVar2;
                        this.h.post(hedVar2);
                    } else {
                        this.j = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (Throwable th2) {
            writeLock.unlock();
            throw th2;
        }
    }

    public final void finalize() {
        if (this.g != null) {
            p();
        }
    }

    @Override // defpackage.t97, defpackage.x1i
    public final void i(RectF rectF) {
        ReentrantReadWriteLock.ReadLock lock = this.f.readLock();
        lock.lock();
        try {
            super.i(rectF);
        } finally {
            lock.unlock();
        }
    }

    @Override // defpackage.t97
    public final void n(Matrix matrix) {
        ReentrantReadWriteLock.ReadLock lock = this.f.readLock();
        lock.lock();
        try {
            super.n(matrix);
        } finally {
            lock.unlock();
        }
    }

    public final void p() {
        ReentrantReadWriteLock.WriteLock writeLock = this.e.writeLock();
        writeLock.lock();
        try {
            au3 au3Var = this.g;
            if (au3Var != null) {
                au3Var.close();
            }
            this.g = null;
        } finally {
            writeLock.unlock();
        }
    }
}
