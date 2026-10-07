package defpackage;

import android.graphics.Canvas;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.IBinder;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.behavior.SwipeDismissBehavior;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import one.me.polls.screens.create.PollCreateScreen;
import one.me.profileedit.screens.adminpermissions.ProfileEditAdminPermissionsWidget;
import one.me.sdk.uikit.common.span.FitFontImageSpan;
import one.me.stickerssearch.StickersSearchScreen;
import one.me.stickerssettings.stickersscreen.StickersScreen;
import org.apache.http.conn.params.ConnManagerParams;

/* JADX INFO: loaded from: classes2.dex */
public final class og7 implements Runnable {
    public final /* synthetic */ int a;
    public Object b;
    public final Object c;

    public og7(SwipeDismissBehavior swipeDismissBehavior, View view, boolean z) {
        this.a = 28;
        this.c = swipeDismissBehavior;
        this.b = view;
    }

    /* JADX WARN: Code duplicated, block: B:47:0x003c A[SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0043, code lost:
    
        if (r1 == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004c, code lost:
    
        r1 = r1 | java.lang.Thread.interrupted();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004e, code lost:
    
        ((java.lang.Runnable) r10.b).run();
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x005a, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x005c, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x005d, code lost:
    
        defpackage.dif.f.log(java.util.logging.Level.SEVERE, "Exception while executing runnable " + ((java.lang.Runnable) r10.b), (java.lang.Throwable) r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007a, code lost:
    
        r10.b = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x007c, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a() {
        /*
            r10 = this;
            r0 = 0
            r1 = r0
        L2:
            java.lang.Object r2 = r10.c     // Catch: java.lang.Throwable -> L58
            dif r2 = (defpackage.dif) r2     // Catch: java.lang.Throwable -> L58
            java.util.ArrayDeque r2 = r2.b     // Catch: java.lang.Throwable -> L58
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L58
            r3 = 1
            if (r0 != 0) goto L2c
            java.lang.Object r0 = r10.c     // Catch: java.lang.Throwable -> L20
            dif r0 = (defpackage.dif) r0     // Catch: java.lang.Throwable -> L20
            int r4 = r0.c     // Catch: java.lang.Throwable -> L20
            r5 = 4
            if (r4 != r5) goto L22
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            if (r1 == 0) goto L46
        L18:
            java.lang.Thread r10 = java.lang.Thread.currentThread()
            r10.interrupt()
            goto L46
        L20:
            r10 = move-exception
            goto L7d
        L22:
            long r6 = r0.d     // Catch: java.lang.Throwable -> L20
            r8 = 1
            long r6 = r6 + r8
            r0.d = r6     // Catch: java.lang.Throwable -> L20
            r0.c = r5     // Catch: java.lang.Throwable -> L20
            r0 = r3
        L2c:
            java.lang.Object r4 = r10.c     // Catch: java.lang.Throwable -> L20
            dif r4 = (defpackage.dif) r4     // Catch: java.lang.Throwable -> L20
            java.util.ArrayDeque r4 = r4.b     // Catch: java.lang.Throwable -> L20
            java.lang.Object r4 = r4.poll()     // Catch: java.lang.Throwable -> L20
            java.lang.Runnable r4 = (java.lang.Runnable) r4     // Catch: java.lang.Throwable -> L20
            r10.b = r4     // Catch: java.lang.Throwable -> L20
            if (r4 != 0) goto L47
            java.lang.Object r10 = r10.c     // Catch: java.lang.Throwable -> L20
            dif r10 = (defpackage.dif) r10     // Catch: java.lang.Throwable -> L20
            r10.c = r3     // Catch: java.lang.Throwable -> L20
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            if (r1 == 0) goto L46
            goto L18
        L46:
            return
        L47:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            boolean r2 = java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> L58
            r1 = r1 | r2
            r2 = 0
            java.lang.Object r3 = r10.b     // Catch: java.lang.Throwable -> L5a java.lang.RuntimeException -> L5c
            java.lang.Runnable r3 = (java.lang.Runnable) r3     // Catch: java.lang.Throwable -> L5a java.lang.RuntimeException -> L5c
            r3.run()     // Catch: java.lang.Throwable -> L5a java.lang.RuntimeException -> L5c
        L55:
            r10.b = r2     // Catch: java.lang.Throwable -> L58
            goto L2
        L58:
            r10 = move-exception
            goto L7f
        L5a:
            r0 = move-exception
            goto L7a
        L5c:
            r3 = move-exception
            java.util.logging.Logger r4 = defpackage.dif.f     // Catch: java.lang.Throwable -> L5a
            java.util.logging.Level r5 = java.util.logging.Level.SEVERE     // Catch: java.lang.Throwable -> L5a
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5a
            r6.<init>()     // Catch: java.lang.Throwable -> L5a
            java.lang.String r7 = "Exception while executing runnable "
            r6.append(r7)     // Catch: java.lang.Throwable -> L5a
            java.lang.Object r7 = r10.b     // Catch: java.lang.Throwable -> L5a
            java.lang.Runnable r7 = (java.lang.Runnable) r7     // Catch: java.lang.Throwable -> L5a
            r6.append(r7)     // Catch: java.lang.Throwable -> L5a
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L5a
            r4.log(r5, r6, r3)     // Catch: java.lang.Throwable -> L5a
            goto L55
        L7a:
            r10.b = r2     // Catch: java.lang.Throwable -> L58
            throw r0     // Catch: java.lang.Throwable -> L58
        L7d:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
            throw r10     // Catch: java.lang.Throwable -> L58
        L7f:
            if (r1 == 0) goto L88
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L88:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.og7.a():void");
    }

    @Override // java.lang.Runnable
    public final void run() {
        Drawable downloadDrawable;
        int iO0;
        int i = 0;
        switch (this.a) {
            case 0:
                kg7 kg7Var = (kg7) this.c;
                try {
                    kg7Var.a(o9b.b((Future) this.b));
                    return;
                } catch (Error e) {
                    e = e;
                    kg7Var.onFailure(e);
                    return;
                } catch (RuntimeException e2) {
                    e = e2;
                    kg7Var.onFailure(e);
                    return;
                } catch (ExecutionException e3) {
                    Throwable cause = e3.getCause();
                    if (cause == null) {
                        kg7Var.onFailure(e3);
                        return;
                    } else {
                        kg7Var.onFailure(cause);
                        return;
                    }
                }
            case 1:
                ((q9) this.b).a = this.c;
                return;
            case 2:
                Object obj = this.c;
                Object obj2 = this.b;
                try {
                    Method method = r9.d;
                    if (method != null) {
                        method.invoke(obj2, obj, Boolean.FALSE, "AppCompat recreation");
                    } else {
                        r9.e.invoke(obj2, obj, Boolean.FALSE);
                    }
                    return;
                } catch (RuntimeException e4) {
                    if (e4.getClass() == RuntimeException.class && e4.getMessage() != null && e4.getMessage().startsWith("Unable to stop")) {
                        throw e4;
                    }
                    return;
                } catch (Throwable th) {
                    Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th);
                    return;
                }
            case 3:
                g9i g9iVar = (g9i) this.b;
                Typeface typeface = (Typeface) this.c;
                gm0 gm0Var = (gm0) g9iVar.a;
                if (gm0Var != null) {
                    gm0Var.H(typeface);
                    return;
                }
                return;
            case 4:
                rb5 rb5Var = (rb5) this.c;
                ArrayList<qb5> arrayList = (ArrayList) this.b;
                for (qb5 qb5Var : arrayList) {
                    lfe lfeVar = qb5Var.a;
                    int i2 = qb5Var.b;
                    int i3 = qb5Var.c;
                    int i4 = qb5Var.d;
                    int i5 = qb5Var.e;
                    View view = lfeVar.a;
                    int i6 = i4 - i2;
                    int i7 = i5 - i3;
                    if (i6 != 0) {
                        view.animate().translationX(0.0f);
                    }
                    if (i7 != 0) {
                        view.animate().translationY(0.0f);
                    }
                    ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
                    rb5Var.p.add(lfeVar);
                    viewPropertyAnimatorAnimate.setDuration(rb5Var.f()).setListener(new nb5(rb5Var, lfeVar, i6, view, i7, viewPropertyAnimatorAnimate)).start();
                }
                arrayList.clear();
                rb5Var.m.remove(arrayList);
                return;
            case 5:
                rd6 rd6Var = (rd6) this.b;
                j66 j66Var = rd6Var.b;
                ko5 ko5VarB = ((vd6) this.c).b(rd6Var);
                j66Var.getClass();
                oo5.d(j66Var, ko5VarB);
                return;
            case 6:
                FitFontImageSpan fitFontImageSpan = (FitFontImageSpan) this.c;
                View view2 = (View) this.b;
                if (view2 instanceof TextView) {
                    soh.b((TextView) view2, fitFontImageSpan);
                    return;
                } else {
                    if (view2 instanceof trb) {
                        l8j.b((trb) view2, fitFontImageSpan);
                        return;
                    }
                    return;
                }
            case 7:
                td8 td8Var = (td8) this.b;
                ji0 ji0Var = (ji0) this.c;
                fl2 fl2Var = (fl2) ji0Var.d;
                ImageView imageViewB = ji0Var.b();
                ViewGroup.LayoutParams layoutParams = imageViewB.getLayoutParams();
                if (layoutParams == null) {
                    ore.n("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    return;
                }
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.bottomMargin = td8Var.getMeasuredHeight() + ji0Var.a + (fl2Var.getVisibility() == 0 ? fl2Var.getCollapsedPanelHeight() : 0);
                imageViewB.setLayoutParams(marginLayoutParams);
                return;
            case 8:
                t58 t58Var = (t58) this.b;
                ny8 ny8Var = t58Var.z;
                if (t58Var.u) {
                    downloadDrawable = (Drawable) ny8Var.getValue();
                } else {
                    l58 l58Var = (l58) this.c;
                    if (l58Var instanceof j58) {
                        downloadDrawable = (Drawable) ny8Var.getValue();
                    } else if (l58Var instanceof i58) {
                        downloadDrawable = t58Var.getOverlayDrawable();
                    } else {
                        if (!(l58Var instanceof k58)) {
                            ore.o();
                            return;
                        }
                        downloadDrawable = t58Var.getDownloadDrawable();
                    }
                }
                ((wj7) t58Var.getHierarchy()).k(downloadDrawable);
                return;
            case 9:
                nn8 nn8Var = (nn8) this.b;
                rn8 rn8Var = (rn8) this.c;
                RecyclerView recyclerView = rn8Var.r;
                if (recyclerView == null || !recyclerView.s || nn8Var.k || nn8Var.e.k() == -1) {
                    return;
                }
                see itemAnimator = rn8Var.r.getItemAnimator();
                if (itemAnimator == null || !itemAnimator.g()) {
                    ArrayList arrayList2 = rn8Var.p;
                    int size = arrayList2.size();
                    while (i < size) {
                        if (((nn8) arrayList2.get(i)).l) {
                            i++;
                        }
                    }
                    rn8Var.m.getClass();
                    return;
                }
                rn8Var.r.post(this);
                return;
            case 10:
                ((dp9) this.c).a((o72) this.b);
                return;
            case 11:
                IBinder binder = ((ss9) this.b).a.getBinder();
                ms9 ms9Var = (ms9) ((y3a) ((i1m) this.c).a).e.remove(binder);
                if (ms9Var != null) {
                    binder.unlinkToDeath(ms9Var, 0);
                    return;
                }
                return;
            case 12:
                ((dka) this.b).setLayout((aka) this.c);
                return;
            case 13:
                ((jqb) this.c).a.f((o72) this.b);
                return;
            case 14:
                ote oteVarD = ((kwb) this.b).b.d();
                if (oteVarD != null) {
                    oteVarD.draw((Canvas) this.c);
                    return;
                }
                return;
            case 15:
                super/*android.view.View*/.draw((Canvas) this.c);
                return;
            case 16:
                super/*android.view.View*/.invalidateDrawable((Drawable) this.c);
                return;
            case 17:
                ((q9c) this.b).removeCallbacks((Runnable) this.c);
                return;
            case 18:
                PollCreateScreen pollCreateScreen = (PollCreateScreen) this.b;
                zv8[] zv8VarArr = PollCreateScreen.n;
                if (!pollCreateScreen.p1().i || (iO0 = xw3.O0((List) this.c) - 1) <= 0) {
                    return;
                }
                pollCreateScreen.p1().i = false;
                n1g.Q(pollCreateScreen.o1(), new v72(pollCreateScreen, iO0, 2), null, 4);
                return;
            case 19:
                rcc rccVar = (rcc) this.b;
                ScrollView scrollView = (ScrollView) this.c;
                ViewGroup.LayoutParams layoutParams2 = rccVar.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
                scrollView.setPadding(scrollView.getPaddingLeft(), rccVar.getMeasuredHeight() + (marginLayoutParams2 != null ? marginLayoutParams2.topMargin : 0), scrollView.getPaddingRight(), scrollView.getPaddingBottom());
                return;
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                View view3 = (View) this.b;
                ProfileEditAdminPermissionsWidget profileEditAdminPermissionsWidget = (ProfileEditAdminPermissionsWidget) this.c;
                RecyclerView recyclerView2 = (RecyclerView) profileEditAdminPermissionsWidget.i.m(profileEditAdminPermissionsWidget, ProfileEditAdminPermissionsWidget.n[4]);
                recyclerView2.setPadding(recyclerView2.getPaddingLeft(), view3.getMeasuredHeight(), recyclerView2.getPaddingRight(), recyclerView2.getPaddingBottom());
                return;
            case 21:
                r6e r6eVar = (r6e) this.b;
                if (r6eVar != null) {
                    r6eVar.a();
                }
                if (r6eVar != null) {
                    t6e t6eVar = (t6e) this.c;
                    if (t6eVar.k == r6eVar) {
                        t6eVar.k = null;
                        return;
                    }
                    return;
                }
                return;
            case 22:
                ((ux5) this.b).accept(this.c);
                return;
            case 23:
                ((ek2) this.c).E((qd6) this.b);
                return;
            case 24:
                try {
                    a();
                    return;
                } catch (Error e5) {
                    synchronized (((dif) this.c).b) {
                        ((dif) this.c).c = 1;
                        throw e5;
                    }
                }
            case 25:
                ArrayList arrayList3 = (ArrayList) this.b;
                int size2 = arrayList3.size();
                while (i < size2) {
                    View view4 = (View) arrayList3.get(i);
                    WeakHashMap weakHashMap = i7j.a;
                    y6j.m(view4, (String) ((kzf) this.c).g.get(y6j.f(view4)));
                    i++;
                }
                return;
            case 26:
                View view5 = (View) this.b;
                StickersScreen stickersScreen = (StickersScreen) this.c;
                zv8[] zv8VarArr2 = StickersScreen.m;
                RecyclerView recyclerViewP1 = stickersScreen.p1();
                recyclerViewP1.setPadding(recyclerViewP1.getPaddingLeft(), view5.getMeasuredHeight(), recyclerViewP1.getPaddingRight(), recyclerViewP1.getPaddingBottom());
                return;
            case 27:
                k96 k96Var = (k96) this.b;
                ViewGroup.LayoutParams layoutParams3 = k96Var.getLayoutParams();
                if (layoutParams3 == null) {
                    ore.n("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    return;
                }
                ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams3;
                StickersSearchScreen stickersSearchScreen = (StickersSearchScreen) this.c;
                zv8[] zv8VarArr3 = StickersSearchScreen.l;
                marginLayoutParams3.topMargin = ((t7c) stickersSearchScreen.h.m(stickersSearchScreen, StickersSearchScreen.l[2])).getMeasuredHeight();
                k96Var.setLayoutParams(marginLayoutParams3);
                return;
            case 28:
                j7j j7jVar = ((SwipeDismissBehavior) this.c).a;
                if (j7jVar == null || !j7jVar.f()) {
                    return;
                }
                View view6 = (View) this.b;
                WeakHashMap weakHashMap2 = i7j.a;
                view6.postOnAnimation(this);
                return;
            default:
                ((ScheduledFuture) this.b).cancel(true);
                ((rjh) this.c).a.trySetCancelled();
                return;
        }
    }

    public String toString() {
        String str;
        int i = this.a;
        Object obj = this.c;
        switch (i) {
            case 0:
                return og7.class.getSimpleName() + "," + ((kg7) obj);
            case 24:
                Runnable runnable = (Runnable) this.b;
                if (runnable != null) {
                    return "SequentialExecutorWorker{running=" + runnable + "}";
                }
                StringBuilder sb = new StringBuilder("SequentialExecutorWorker{state=");
                int i2 = ((dif) obj).c;
                if (i2 == 1) {
                    str = "IDLE";
                } else if (i2 == 2) {
                    str = "QUEUING";
                } else if (i2 != 3) {
                    str = i2 != 4 ? "null" : "RUNNING";
                } else {
                    str = "QUEUED";
                }
                sb.append(str);
                sb.append("}");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ og7(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public /* synthetic */ og7(Object obj, Object obj2, boolean z, int i) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }

    public og7(dif difVar) {
        this.a = 24;
        this.c = difVar;
    }

    public /* synthetic */ og7(ViewGroup viewGroup, Object obj, Object obj2, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public og7(rn8 rn8Var, nn8 nn8Var, int i) {
        this.a = 9;
        this.c = rn8Var;
        this.b = nn8Var;
    }
}
