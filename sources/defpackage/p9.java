package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.view.ViewParent;
import com.bluelinelabs.conductor.internal.AndroidXLifecycleHandlerImpl;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class p9 extends hve {
    public AndroidXLifecycleHandlerImpl j;
    public final x3f k = new x3f();

    public p9() {
        this.e = 1;
    }

    @Override // defpackage.hve
    public final void L(int i, String str) {
        this.j.Q(i, str);
    }

    @Override // defpackage.hve
    public final void O(String str, String[] strArr, int i) {
        AndroidXLifecycleHandlerImpl androidXLifecycleHandlerImpl = this.j;
        androidXLifecycleHandlerImpl.getClass();
        yab.a0(androidXLifecycleHandlerImpl, str, strArr, i);
    }

    @Override // defpackage.hve
    public final void P(Bundle bundle) {
        super.P(bundle);
        x3f x3fVar = this.k;
        x3fVar.getClass();
        x3fVar.a = bundle.getInt("TransactionIndexer.currentIndex");
    }

    @Override // defpackage.hve
    public final void Q(Bundle bundle) {
        super.Q(bundle);
        bundle.putInt("TransactionIndexer.currentIndex", this.k.a);
    }

    @Override // defpackage.hve
    public final void V(Intent intent) {
        AndroidXLifecycleHandlerImpl androidXLifecycleHandlerImpl = this.j;
        va7 va7Var = androidXLifecycleHandlerImpl.u;
        if (va7Var != null) {
            va7Var.h.startActivity(intent, null);
        } else {
            ore.k(zo5.n("Fragment ", androidXLifecycleHandlerImpl, " not attached to Activity"));
        }
    }

    @Override // defpackage.hve
    public final void W(String str, Intent intent, int i) {
        this.j.S(str, intent, i, null);
    }

    @Override // defpackage.hve
    public final void X(String str, Intent intent, int i, Bundle bundle) {
        this.j.S(str, intent, i, bundle);
    }

    @Override // defpackage.hve
    public final void Y(String str, IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws IntentSender.SendIntentException {
        AndroidXLifecycleHandlerImpl androidXLifecycleHandlerImpl = this.j;
        androidXLifecycleHandlerImpl.getClass();
        ei eiVar = new ei(androidXLifecycleHandlerImpl, intentSender, i, intent, i2, i3, i4, bundle);
        androidXLifecycleHandlerImpl.Q(i, str);
        eiVar.invoke();
    }

    @Override // defpackage.hve
    public final void a0(String str) {
        AndroidXLifecycleHandlerImpl androidXLifecycleHandlerImpl = this.j;
        androidXLifecycleHandlerImpl.getClass();
        yab.b0(androidXLifecycleHandlerImpl, str);
    }

    public final void b0(AndroidXLifecycleHandlerImpl androidXLifecycleHandlerImpl, tp2 tp2Var) {
        if (this.j == androidXLifecycleHandlerImpl && this.i == tp2Var) {
            return;
        }
        ViewParent viewParent = this.i;
        if (viewParent != null && (viewParent instanceof fr4)) {
            M((fr4) viewParent);
        }
        a(tp2Var);
        this.j = androidXLifecycleHandlerImpl;
        this.i = tp2Var;
        tp2Var.post(new zn(12, this));
    }

    @Override // defpackage.hve
    public final Activity d() {
        AndroidXLifecycleHandlerImpl androidXLifecycleHandlerImpl = this.j;
        if (androidXLifecycleHandlerImpl != null) {
            return androidXLifecycleHandlerImpl.u1.b;
        }
        return null;
    }

    @Override // defpackage.hve
    public final hve i() {
        return this;
    }

    @Override // defpackage.hve
    public final List j() {
        return ww3.T1(this.j.u1.j.values());
    }

    @Override // defpackage.hve
    public final x3f k() {
        return this.k;
    }

    @Override // defpackage.hve
    public final boolean n() {
        return this.j != null;
    }

    @Override // defpackage.hve
    public final void p() {
        if (this.j == null || d() == null) {
            return;
        }
        d().invalidateOptionsMenu();
    }

    @Override // defpackage.hve
    public final void q(Activity activity, boolean z) {
        super.q(activity, z);
        if (z) {
            return;
        }
        this.j = null;
    }
}
