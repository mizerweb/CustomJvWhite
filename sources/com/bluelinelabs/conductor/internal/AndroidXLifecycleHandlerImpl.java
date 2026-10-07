package com.bluelinelabs.conductor.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import androidx.fragment.app.a;
import defpackage.a19;
import defpackage.b19;
import defpackage.p9;
import defpackage.pgk;
import defpackage.yab;
import java.util.Iterator;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/bluelinelabs/conductor/internal/AndroidXLifecycleHandlerImpl;", "Landroidx/fragment/app/a;", "<init>", "()V", "conductor_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AndroidXLifecycleHandlerImpl extends a implements Application.ActivityLifecycleCallbacks {
    public final a19 u1 = new a19(true);

    public AndroidXLifecycleHandlerImpl() {
        N();
        if (!this.E) {
            this.E = true;
            if (!p() || q()) {
                return;
            }
            this.u.k.invalidateOptionsMenu();
        }
    }

    @Override // androidx.fragment.app.a
    public final boolean C(MenuItem menuItem) {
        return yab.W(this, menuItem, new pgk(this, menuItem));
    }

    @Override // androidx.fragment.app.a
    public final void E(Menu menu) {
        Iterator it = yab.N(this).iterator();
        while (it.hasNext()) {
            ((p9) it.next()).y(menu);
        }
    }

    @Override // androidx.fragment.app.a
    public final void F(int i, String[] strArr, int[] iArr) {
        yab.X(this, i, strArr, iArr);
    }

    @Override // androidx.fragment.app.a
    public final void H(Bundle bundle) {
        yab.Y(this, bundle);
    }

    /* JADX INFO: renamed from: P, reason: from getter */
    public final a19 getU1() {
        return this.u1;
    }

    public final void Q(int i, String str) {
        getU1().h.put(i, str);
    }

    public final void R(Activity activity) {
        yab.Z(this, activity, this);
    }

    public final void S(String str, Intent intent, int i, Bundle bundle) {
        Q(i, str);
        O(intent, i, bundle);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        yab.r0(this, activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        b19.a.remove(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        yab.s0(this, activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPreDestroyed(Activity activity) {
        if (getU1().b != activity || activity.isChangingConfigurations()) {
            return;
        }
        yab.V(this);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        yab.t0(this, activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        yab.u0(this, activity, bundle);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        yab.v0(this, activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        yab.w0(this, activity);
    }

    @Override // androidx.fragment.app.a
    public final void t(int i, int i2, Intent intent) {
        super.t(i, i2, intent);
        yab.S(this, i, i2, intent);
    }

    @Override // androidx.fragment.app.a
    public final void u(Context context) {
        super.u(context);
        yab.T(this, context);
    }

    @Override // androidx.fragment.app.a
    public final void v(Bundle bundle) {
        super.v(bundle);
        yab.U(this, bundle);
    }

    @Override // androidx.fragment.app.a
    public final void w(Menu menu, MenuInflater menuInflater) {
        Iterator it = yab.N(this).iterator();
        while (it.hasNext()) {
            ((p9) it.next()).w(menu, menuInflater);
        }
    }

    @Override // androidx.fragment.app.a
    public final void x() {
        this.G = true;
        yab.V(this);
    }

    @Override // androidx.fragment.app.a
    public final void z() {
        this.G = true;
        getU1().e = false;
        Activity activity = getU1().b;
        if (activity != null) {
            yab.y(this, activity.isChangingConfigurations());
        }
    }
}
