package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.EditText;
import android.widget.ImageView;
import androidx.biometric.FingerprintDialogFragment;
import androidx.fragment.app.DialogFragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.work.WorkRequest;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.text.DecimalFormat;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import one.me.chatmedia.viewer.ChatMediaViewerScreen;
import one.me.folders.list.FoldersListScreen;
import one.me.inviteactions.invitebyphone.InviteByPhoneScreen;
import one.me.mediapicker.MediaPickerScreen;
import one.me.sdk.gallery.MediaGalleryWidget;
import org.apache.http.conn.params.ConnManagerParams;
import ru.ok.android.externcalls.sdk.factory.internal.CidLogger;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class pi implements Runnable {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ pi(int i, View view, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:46:0x0129  */
    @Override // java.lang.Runnable
    public final void run() {
        ViewGroup viewGroup;
        int i;
        int iK;
        k2e k2eVar;
        pi piVar = this;
        int iK2 = 0;
        switch (piVar.a) {
            case 0:
                qi qiVar = (qi) piVar.b;
                qiVar.unscheduleSelf(piVar);
                qiVar.invalidateSelf();
                return;
            case 1:
                synchronized (((xj) piVar.b)) {
                    try {
                        xj xjVar = (xj) piVar.b;
                        xjVar.d = false;
                        boolean z = xjVar.b.now() - xjVar.e > 2000;
                        xj xjVar2 = (xj) piVar.b;
                        if (z) {
                            px0 px0Var = xjVar2.f;
                            if (px0Var.e) {
                                vx0 vx0Var = px0Var.f;
                                if (vx0Var != null) {
                                    vx0Var.b();
                                }
                            } else {
                                px0Var.a();
                            }
                        } else {
                            xjVar2.e();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return;
            case 2:
                vr vrVar = (vr) piVar.b;
                vrVar.v.showAtLocation(vrVar.u, 55, 0, 0);
                d9j d9jVar = vrVar.x;
                if (d9jVar != null) {
                    d9jVar.b();
                }
                if (!vrVar.z || (viewGroup = vrVar.A) == null || !viewGroup.isLaidOut()) {
                    vrVar.u.setAlpha(1.0f);
                    vrVar.u.setVisibility(0);
                    return;
                }
                vrVar.u.setAlpha(0.0f);
                d9j d9jVarA = i7j.a(vrVar.u);
                d9jVarA.a(1.0f);
                vrVar.x = d9jVarA;
                d9jVarA.d(new lr(0, piVar));
                return;
            case 3:
                b89 b89Var = (b89) piVar.b;
                kv5 kv5Var = b89Var.c;
                kg0 kg0Var = b89Var.a;
                if (b89Var.o) {
                    if (b89Var.m) {
                        b89Var.m = false;
                        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                        kg0Var.e = jCurrentAnimationTimeMillis;
                        kg0Var.g = -1L;
                        kg0Var.f = jCurrentAnimationTimeMillis;
                        kg0Var.h = 0.5f;
                    }
                    if ((kg0Var.g > 0 && AnimationUtils.currentAnimationTimeMillis() > kg0Var.g + ((long) kg0Var.i)) || !b89Var.e()) {
                        b89Var.o = false;
                        return;
                    }
                    if (b89Var.n) {
                        b89Var.n = false;
                        long jUptimeMillis = SystemClock.uptimeMillis();
                        MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                        kv5Var.onTouchEvent(motionEventObtain);
                        motionEventObtain.recycle();
                    }
                    if (kg0Var.f == 0) {
                        ore.q("Cannot compute scroll delta before calling start()");
                        return;
                    }
                    long jCurrentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                    float fA = kg0Var.a(jCurrentAnimationTimeMillis2);
                    long j = jCurrentAnimationTimeMillis2 - kg0Var.f;
                    kg0Var.f = jCurrentAnimationTimeMillis2;
                    b89Var.q.scrollListBy((int) (j * ((fA * 4.0f) + ((-4.0f) * fA * fA)) * kg0Var.d));
                    WeakHashMap weakHashMap = i7j.a;
                    kv5Var.postOnAnimation(piVar);
                    return;
                }
                return;
            case 4:
                ecd ecdVar = (ecd) piVar.b;
                int i2 = ecd.i;
                ecdVar.setHalfScreen(null);
                return;
            case 5:
                for (Thread thread : uy0.x.keySet()) {
                    if (!thread.isAlive()) {
                        uy0.x.remove(thread);
                    }
                }
                if (uy0.x.isEmpty()) {
                    uy0.y = false;
                    return;
                } else {
                    di.e(((uy0) piVar.b).p, 5000L);
                    return;
                }
            case 6:
                p11 p11Var = (p11) piVar.b;
                p11Var.c = false;
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) p11Var.e;
                j7j j7jVar = bottomSheetBehavior.Y;
                if (j7jVar != null && j7jVar.f()) {
                    p11Var.a(p11Var.b);
                    return;
                } else {
                    if (bottomSheetBehavior.X == 2) {
                        bottomSheetBehavior.D(p11Var.b);
                        return;
                    }
                    return;
                }
            case 7:
                qs1 qs1Var = (qs1) piVar.b;
                Iterator it = qs1Var.i.iterator();
                while (it.hasNext()) {
                    v52 v52VarA = ((ns1) it.next()).a();
                    CidLogger cidLogger = qs1Var.a;
                    AtomicInteger atomicInteger = v52VarA.d;
                    AtomicInteger atomicInteger2 = v52VarA.c;
                    DecimalFormat decimalFormat = new DecimalFormat("#.0");
                    long jNanoTime = System.nanoTime();
                    long j2 = jNanoTime - v52VarA.g;
                    if (j2 <= 0 || (((Boolean) v52VarA.b.invoke()).booleanValue() && atomicInteger2.get() == 0)) {
                        qs1Var = qs1Var;
                        i = iK2;
                    } else {
                        float f = (((long) v52VarA.f) * 1000000000) / j2;
                        long j3 = j2 / 1000000;
                        String str = v52VarA.e;
                        String str2 = v52VarA.a;
                        int i3 = atomicInteger2.get();
                        int i4 = atomicInteger.get();
                        int i5 = v52VarA.f;
                        String str3 = decimalFormat.format(f);
                        long j4 = v52VarA.h;
                        int i6 = v52VarA.f;
                        String str4 = i6 <= 0 ? "-" : ((j4 / ((long) i6)) / 1000) + " us";
                        long j5 = v52VarA.i;
                        int i7 = v52VarA.f;
                        String str5 = i7 <= 0 ? "-" : ((j5 / ((long) i7)) / 1000) + " us";
                        StringBuilder sb = new StringBuilder();
                        sb.append(str2);
                        sb.append(" -> Duration: ");
                        sb.append(j3);
                        sb.append(" ms. received: ");
                        qt4.x(i3, i4, ", dropped: ", ", rendered: ", sb);
                        sb.append(i5);
                        sb.append(", fps: ");
                        sb.append(str3);
                        sb.append(",avg render time: ");
                        cidLogger.log(str, nbh.y(sb, str4, ", avg swapBuffer time: ", str5, "."));
                        v52VarA.g = jNanoTime;
                        i = 0;
                        v52VarA.f = 0;
                        v52VarA.h = 0L;
                        v52VarA.i = 0L;
                        atomicInteger2.set(0);
                        atomicInteger.set(0);
                    }
                    iK2 = i;
                    it = it;
                    qs1Var = qs1Var;
                    piVar = this;
                }
                qs1Var.a(piVar);
                return;
            case 8:
                ((r6c) piVar.b).setAppearance(g6c.a);
                return;
            case 9:
                ChatMediaViewerScreen chatMediaViewerScreen = (ChatMediaViewerScreen) piVar.b;
                View view = chatMediaViewerScreen.getView();
                if (view == null) {
                    return;
                }
                fl2 fl2VarQ1 = chatMediaViewerScreen.Q1();
                if (fl2VarQ1 != null) {
                    fl2VarQ1.setMaxExpandedHeightPx((view.getMeasuredHeight() - chatMediaViewerScreen.S1().getMeasuredHeight()) - chatMediaViewerScreen.R1().getMeasuredHeight());
                }
                fl2 fl2VarQ2 = chatMediaViewerScreen.Q1();
                if (fl2VarQ2 != null) {
                    ViewGroup.LayoutParams layoutParams = fl2VarQ2.getLayoutParams();
                    if (layoutParams == null) {
                        ore.n("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                        return;
                    }
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    marginLayoutParams.bottomMargin = chatMediaViewerScreen.R1().getMeasuredHeight();
                    fl2VarQ2.setLayoutParams(marginLayoutParams);
                    return;
                }
                return;
            case 10:
                ((d2) piVar.b).invoke();
                return;
            case 11:
                DialogFragment dialogFragment = (DialogFragment) piVar.b;
                dialogFragment.x1.onDismiss(dialogFragment.F1);
                return;
            case 12:
                pn5 pn5Var = (pn5) piVar.b;
                if (!pn5Var.a.isEmpty()) {
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    int size = pn5Var.a.size();
                    int i8 = 0;
                    while (i8 < size) {
                        nn5 nn5Var = (nn5) pn5Var.a.get(i8);
                        if (nn5Var.c < jElapsedRealtime - WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS) {
                            nn5Var.a.getLooper().quit();
                            pn5Var.a.remove(i8);
                            pn5Var.e--;
                            i8--;
                            size--;
                        }
                        i8++;
                    }
                }
                if (pn5Var.a.isEmpty() && pn5Var.c.isEmpty()) {
                    pn5Var.h = false;
                    return;
                } else {
                    di.e(piVar, WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS);
                    pn5Var.h = true;
                    return;
                }
            case 13:
                rn5 rn5Var = (rn5) piVar.b;
                if (!rn5Var.a.isEmpty()) {
                    long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                    int i9 = 0;
                    while (i9 < rn5Var.a.size()) {
                        nn5 nn5Var2 = (nn5) rn5Var.a.get(i9);
                        if (nn5Var2.c < jElapsedRealtime2 - WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS) {
                            nn5Var2.a.getLooper().quit();
                            rn5Var.a.remove(i9);
                            rn5Var.e--;
                            i9--;
                        }
                        i9++;
                    }
                }
                if (rn5Var.a.isEmpty() && rn5Var.c.isEmpty()) {
                    rn5Var.h = false;
                    return;
                } else {
                    ((ScheduledExecutorService) cqk.e.j.a.getValue()).schedule(piVar, WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS, TimeUnit.MILLISECONDS);
                    rn5Var.h = true;
                    return;
                }
            case 14:
                qjg qjgVar = (qjg) piVar.b;
                qjgVar.b(true);
                qjgVar.invalidateSelf();
                return;
            case 15:
                kv5 kv5Var2 = (kv5) piVar.b;
                kv5Var2.l = null;
                kv5Var2.drawableStateChanged();
                return;
            case 16:
                nl6 nl6Var = (nl6) piVar.b;
                ValueAnimator valueAnimator = nl6Var.z;
                int i10 = nl6Var.A;
                if (i10 == 1) {
                    valueAnimator.cancel();
                } else if (i10 != 2) {
                    return;
                }
                nl6Var.A = 3;
                valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
                valueAnimator.setDuration(500L);
                valueAnimator.start();
                return;
            case 17:
                FingerprintDialogFragment fingerprintDialogFragment = (FingerprintDialogFragment) piVar.b;
                Context contextJ = fingerprintDialogFragment.j();
                if (contextJ == null) {
                    Log.w("FingerprintFragment", "Not resetting the dialog. Context is null.");
                    return;
                } else {
                    fingerprintDialogFragment.M1.f(1);
                    fingerprintDialogFragment.M1.e(contextJ.getString(R.string.fingerprint_dialog_touch_sensor));
                    return;
                }
            case 18:
                FoldersListScreen foldersListScreen = (FoldersListScreen) piVar.b;
                if (foldersListScreen.getView() != null) {
                    ((RecyclerView) foldersListScreen.g.m(foldersListScreen, FoldersListScreen.h[0])).X();
                    return;
                }
                return;
            case 19:
                ((e89) piVar.b).cancel(true);
                return;
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                dc9 dc9Var = (dc9) piVar.b;
                ts7 ts7Var = (ts7) dc9Var.d;
                if (ts7Var.a.getAndSet(null) != null) {
                    ((Handler) dc9Var.b).removeCallbacks(ts7Var);
                    return;
                }
                return;
            case 21:
                Drawable drawable = ((ImageView) piVar.b).getDrawable();
                AnimatedVectorDrawable animatedVectorDrawable = drawable instanceof AnimatedVectorDrawable ? (AnimatedVectorDrawable) drawable : null;
                if (animatedVectorDrawable != null) {
                    animatedVectorDrawable.start();
                    return;
                }
                return;
            case 22:
                InviteByPhoneScreen inviteByPhoneScreen = (InviteByPhoneScreen) piVar.b;
                if (inviteByPhoneScreen.getView() != null) {
                    zv8[] zv8VarArr = InviteByPhoneScreen.p;
                    r5c r5cVarQ1 = inviteByPhoneScreen.q1();
                    EditText editText = r5cVarQ1.i;
                    editText.requestFocus();
                    editText.post(new o90(r5cVarQ1, 20, editText));
                    return;
                }
                return;
            case 23:
                rn8 rn8Var = (rn8) piVar.b;
                if (rn8Var.c != null) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    long j6 = rn8Var.B;
                    long j7 = j6 == Long.MIN_VALUE ? 0L : jCurrentTimeMillis - j6;
                    vee layoutManager = rn8Var.r.getLayoutManager();
                    if (rn8Var.A == null) {
                        rn8Var.A = new Rect();
                    }
                    View view2 = rn8Var.c.a;
                    Rect rect = rn8Var.A;
                    RecyclerView recyclerView = layoutManager.b;
                    if (recyclerView == null) {
                        rect.set(0, 0, 0, 0);
                    } else {
                        rect.set(recyclerView.V(view2));
                    }
                    if (layoutManager.getE()) {
                        int i11 = (int) (rn8Var.j + rn8Var.h);
                        int paddingLeft = (i11 - rn8Var.A.left) - rn8Var.r.getPaddingLeft();
                        float f2 = rn8Var.h;
                        if ((f2 >= 0.0f || paddingLeft >= 0) && (f2 <= 0.0f || (paddingLeft = ((rn8Var.c.a.getWidth() + i11) + rn8Var.A.right) - (rn8Var.r.getWidth() - rn8Var.r.getPaddingRight())) <= 0)) {
                            iK = 0;
                        } else {
                            iK = paddingLeft;
                        }
                    } else {
                        iK = 0;
                    }
                    if (layoutManager.f()) {
                        int i12 = (int) (rn8Var.k + rn8Var.i);
                        int paddingTop = (i12 - rn8Var.A.top) - rn8Var.r.getPaddingTop();
                        float f3 = rn8Var.i;
                        if ((f3 < 0.0f && paddingTop < 0) || (f3 > 0.0f && (paddingTop = ((rn8Var.c.a.getHeight() + i12) + rn8Var.A.bottom) - (rn8Var.r.getHeight() - rn8Var.r.getPaddingBottom())) > 0)) {
                            iK2 = paddingTop;
                        }
                    }
                    if (iK != 0) {
                        qn8 qn8Var = rn8Var.m;
                        RecyclerView recyclerView2 = rn8Var.r;
                        int width = rn8Var.c.a.getWidth();
                        rn8Var.r.getWidth();
                        iK = qn8Var.k(recyclerView2, width, iK, j7);
                    }
                    int i13 = iK;
                    if (iK2 != 0) {
                        qn8 qn8Var2 = rn8Var.m;
                        RecyclerView recyclerView3 = rn8Var.r;
                        int height = rn8Var.c.a.getHeight();
                        rn8Var.r.getHeight();
                        iK2 = qn8Var2.k(recyclerView3, height, iK2, j7);
                    }
                    if (i13 == 0 && iK2 == 0) {
                        rn8Var.B = Long.MIN_VALUE;
                        return;
                    }
                    if (rn8Var.B == Long.MIN_VALUE) {
                        rn8Var.B = jCurrentTimeMillis;
                    }
                    rn8Var.r.scrollBy(i13, iK2);
                    lfe lfeVar = rn8Var.c;
                    if (lfeVar != null) {
                        rn8Var.q(lfeVar);
                    }
                    rn8Var.r.removeCallbacks(rn8Var.s);
                    RecyclerView recyclerView4 = rn8Var.r;
                    WeakHashMap weakHashMap2 = i7j.a;
                    recyclerView4.postOnAnimation(piVar);
                    return;
                }
                return;
            case 24:
                dx8 dx8Var = (dx8) piVar.b;
                dx8Var.getIndicatorDrawable().setSize(dx8Var.findViewById(R.id.oneme_tab_item_textview_id).getMeasuredWidth(), (dx8Var.getMeasuredHeight() - dx8Var.getPaddingTop()) - dx8Var.getPaddingBottom());
                return;
            case 25:
                j79 j79Var = (j79) piVar.b;
                j79Var.b = null;
                j79Var.a = null;
                return;
            case 26:
                ((z99) piVar.b).l();
                return;
            case 27:
                ms9 ms9Var = (ms9) piVar.b;
                mw mwVar = ms9Var.g.e;
                rs9 rs9Var = ms9Var.e;
                rs9Var.getClass();
                mwVar.remove(((ss9) rs9Var).a.getBinder());
                return;
            case 28:
                MediaGalleryWidget mediaGalleryWidget = (MediaGalleryWidget) piVar.b;
                if (mediaGalleryWidget.getView() != null) {
                    zv8[] zv8VarArr2 = MediaGalleryWidget.i;
                    a8j.x(mediaGalleryWidget.q1().d, new di7(MediaGalleryWidget.o1(mediaGalleryWidget)));
                    return;
                }
                return;
            default:
                MediaPickerScreen mediaPickerScreen = (MediaPickerScreen) piVar.b;
                zv8[] zv8VarArr3 = MediaPickerScreen.J;
                mediaPickerScreen.q1().d(true, false);
                if (!mediaPickerScreen.r1() || (k2eVar = mediaPickerScreen.q1().a) == null) {
                    return;
                }
                ((hj2) k2eVar.getCameraApi()).d();
                return;
        }
    }

    public /* synthetic */ pi(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }
}
