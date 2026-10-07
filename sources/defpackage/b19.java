package defpackage;

import android.app.Activity;
import androidx.fragment.app.a;
import androidx.fragment.app.b;
import com.bluelinelabs.conductor.internal.AndroidXLifecycleHandlerImpl;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class b19 {
    public static final LinkedHashMap a = new LinkedHashMap();

    public static final AndroidXLifecycleHandlerImpl a(Activity activity, boolean z) {
        AndroidXLifecycleHandlerImpl androidXLifecycleHandlerImpl = (AndroidXLifecycleHandlerImpl) a.get(activity);
        if (androidXLifecycleHandlerImpl == null) {
            androidXLifecycleHandlerImpl = null;
            if (z && (activity instanceof b)) {
                a aVarE = ((b) activity).p().E("LifecycleHandler");
                if (aVarE instanceof AndroidXLifecycleHandlerImpl) {
                    androidXLifecycleHandlerImpl = (AndroidXLifecycleHandlerImpl) aVarE;
                }
            } else {
                activity.getFragmentManager().findFragmentByTag("LifecycleHandler");
            }
        }
        if (androidXLifecycleHandlerImpl != null) {
            androidXLifecycleHandlerImpl.R(activity);
        }
        return androidXLifecycleHandlerImpl;
    }
}
