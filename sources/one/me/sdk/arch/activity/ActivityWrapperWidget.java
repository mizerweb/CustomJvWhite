package one.me.sdk.arch.activity;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import defpackage.cf7;
import defpackage.cqk;
import defpackage.zfe;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004B%\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0004\b\u0003\u0010\u000b¨\u0006\f"}, d2 = {"Lone/me/sdk/arch/activity/ActivityWrapperWidget;", "Lone/me/sdk/arch/Widget;", "Landroid/app/Application$ActivityLifecycleCallbacks;", "<init>", "()V", "", "activityName", "Lkotlin/Function1;", "Landroid/content/Context;", "Lsbi;", "startActivity", "(Ljava/lang/String;Lcf7;)V", "arch"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ActivityWrapperWidget extends Widget implements Application.ActivityLifecycleCallbacks {
    public final String a;
    public final cf7 b;

    public ActivityWrapperWidget(String str, cf7 cf7Var) {
        this();
        this.a = str;
        this.b = cf7Var;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        if (cqk.d(zfe.a(activity.getClass()).h(), this.a)) {
            getRouter().C(this);
        }
    }

    @Override // one.me.sdk.arch.Widget, defpackage.br4
    public final void onActivityPaused(Activity activity) {
    }

    @Override // one.me.sdk.arch.Widget, defpackage.br4
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // defpackage.br4
    public final void onActivityStarted(Activity activity) {
    }

    @Override // defpackage.br4
    public final void onActivityStopped(Activity activity) {
    }

    @Override // defpackage.br4
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ((Application) viewGroup.getContext().getApplicationContext()).registerActivityLifecycleCallbacks(this);
        cf7 cf7Var = this.b;
        if (cf7Var != null) {
            cf7Var.invoke(viewGroup.getContext());
        }
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        frameLayout.setId(R.id.arch_activity_wrapper_view_id);
        return frameLayout;
    }

    @Override // defpackage.br4
    public final void onDestroyView(View view) {
        ((Application) view.getContext().getApplicationContext()).unregisterActivityLifecycleCallbacks(this);
        super.onDestroyView(view);
    }

    public ActivityWrapperWidget() {
        super(null, 1, 0 == true ? 1 : 0);
    }
}
