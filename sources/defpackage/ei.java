package defpackage;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.util.Log;
import androidx.fragment.app.b;
import androidx.fragment.app.c;
import com.bluelinelabs.conductor.internal.AndroidXLifecycleHandlerImpl;

/* JADX INFO: loaded from: classes2.dex */
public final class ei extends ux8 implements af7 {
    public final /* synthetic */ AndroidXLifecycleHandlerImpl a;
    public final /* synthetic */ IntentSender b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Intent d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ int g;
    public final /* synthetic */ Bundle h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ei(AndroidXLifecycleHandlerImpl androidXLifecycleHandlerImpl, IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        super(0);
        this.a = androidXLifecycleHandlerImpl;
        this.b = intentSender;
        this.c = i;
        this.d = intent;
        this.e = i2;
        this.f = i3;
        this.g = i4;
        this.h = bundle;
    }

    @Override // defpackage.af7
    public final Object invoke() throws IntentSender.SendIntentException {
        AndroidXLifecycleHandlerImpl androidXLifecycleHandlerImpl = this.a;
        if (androidXLifecycleHandlerImpl.u == null) {
            c.u(androidXLifecycleHandlerImpl, " not attached to Activity", "Fragment ");
            return null;
        }
        boolean zK = c.K(2);
        IntentSender intentSender = this.b;
        int i = this.c;
        Intent intent = this.d;
        Bundle bundle = this.h;
        if (zK) {
            Log.v("FragmentManager", "Fragment " + androidXLifecycleHandlerImpl + " received the following in startIntentSenderForResult() requestCode: " + i + " IntentSender: " + intentSender + " fillInIntent: " + intent + " options: " + bundle);
        }
        c cVarL = androidXLifecycleHandlerImpl.l();
        c46 c46Var = cVarL.C;
        int i2 = this.e;
        int i3 = this.f;
        if (c46Var != null) {
            if (bundle != null) {
                if (intent == null) {
                    Intent intent2 = new Intent();
                    intent2.putExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", true);
                    intent = intent2;
                }
                if (c.K(2)) {
                    Log.v("FragmentManager", "ActivityOptions " + bundle + " were added to fillInIntent " + intent + " for fragment " + androidXLifecycleHandlerImpl);
                }
                intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
            }
            rj8 rj8Var = new rj8(intentSender, intent, i2, i3);
            cVarL.E.addLast(new db7(androidXLifecycleHandlerImpl.e, i));
            if (c.K(2)) {
                Log.v("FragmentManager", "Fragment " + androidXLifecycleHandlerImpl + "is launching an IntentSender for result ");
            }
            cVarL.C.n(rj8Var);
        } else {
            va7 va7Var = cVarL.v;
            if (i != -1) {
                va7Var.getClass();
                ore.k("Starting intent sender with a requestCode requires a FragmentActivity host");
                return null;
            }
            b bVar = va7Var.g;
            if (bVar == null) {
                ore.k("Starting intent sender with a requestCode requires a FragmentActivity host");
                return null;
            }
            bVar.startIntentSenderForResult(intentSender, i, intent, i2, i3, this.g, bundle);
        }
        return sbi.a;
    }
}
