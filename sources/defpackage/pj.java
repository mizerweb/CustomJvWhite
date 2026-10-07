package defpackage;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes3.dex */
public final class pj implements Drawable.Callback {
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ pj(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    private final void a(Drawable drawable) {
    }

    private final void b(Drawable drawable, Runnable runnable, long j) {
    }

    private final void c(Drawable drawable, Runnable runnable) {
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        switch (this.a) {
            case 0:
                ((sj) this.b).invalidateSelf();
                break;
            case 1:
                Drawable.Callback callback = ((qn) this.b).getCallback();
                if (callback != null) {
                    callback.invalidateDrawable(drawable);
                }
                break;
            case 2:
                break;
            case 3:
                ((x96) this.b).invalidateSelf();
                break;
            case 4:
                ((tvb) this.b).invalidateSelf();
                break;
            case 5:
                q9c q9cVar = (q9c) this.b;
                if (!Looper.getMainLooper().isCurrentThread()) {
                    Handler handler = q9cVar.getHandler();
                    if (handler == null) {
                        q9cVar.post(new p9c(q9cVar, 1));
                    } else {
                        handler.postAtFrontOfQueue(new p9c(q9cVar, 0));
                    }
                } else {
                    q9cVar.invalidate();
                }
                break;
            case 6:
                kwb kwbVar = (kwb) ((WeakReference) this.b).get();
                if (kwbVar != null) {
                    kwbVar.invalidate();
                }
                break;
            default:
                ((vki) this.b).invalidateSelf();
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        switch (this.a) {
            case 0:
                ((sj) this.b).scheduleSelf(runnable, j);
                break;
            case 1:
                Drawable.Callback callback = ((qn) this.b).getCallback();
                if (callback != null) {
                    callback.scheduleDrawable(drawable, runnable, j);
                }
                break;
            case 2:
                Drawable.Callback callback2 = (Drawable.Callback) this.b;
                if (callback2 != null) {
                    callback2.scheduleDrawable(drawable, runnable, j);
                }
                break;
            case 3:
                ((x96) this.b).scheduleSelf(runnable, j);
                break;
            case 4:
                ((tvb) this.b).scheduleSelf(runnable, j);
                break;
            case 5:
                ((q9c) this.b).postDelayed(runnable, j);
                break;
            case 6:
                break;
            default:
                ((vki) this.b).scheduleSelf(runnable, j);
                break;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        switch (this.a) {
            case 0:
                ((sj) this.b).unscheduleSelf(runnable);
                break;
            case 1:
                Drawable.Callback callback = ((qn) this.b).getCallback();
                if (callback != null) {
                    callback.unscheduleDrawable(drawable, runnable);
                }
                break;
            case 2:
                Drawable.Callback callback2 = (Drawable.Callback) this.b;
                if (callback2 != null) {
                    callback2.unscheduleDrawable(drawable, runnable);
                }
                break;
            case 3:
                ((x96) this.b).unscheduleSelf(runnable);
                break;
            case 4:
                ((tvb) this.b).unscheduleSelf(runnable);
                break;
            case 5:
                q9c q9cVar = (q9c) this.b;
                if (!Looper.getMainLooper().isCurrentThread()) {
                    Handler handler = q9cVar.getHandler();
                    if (handler == null) {
                        q9cVar.post(new ng7(q9cVar, 18, runnable));
                    } else {
                        handler.postAtFrontOfQueue(new og7(q9cVar, 17, runnable));
                    }
                } else {
                    q9cVar.removeCallbacks(runnable);
                }
                break;
            case 6:
                break;
            default:
                ((vki) this.b).unscheduleSelf(runnable);
                break;
        }
    }

    public /* synthetic */ pj() {
        this.a = 2;
    }
}
