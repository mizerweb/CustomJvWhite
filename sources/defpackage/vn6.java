package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes4.dex */
public final class vn6 implements Application.ActivityLifecycleCallbacks {
    public final /* synthetic */ int a;
    public final Object b;

    public vn6() {
        this.a = 0;
        this.b = new ArrayDeque(10);
    }

    private final void a(Activity activity, Bundle bundle) {
    }

    private final void b(Activity activity) {
    }

    private final void c(Activity activity) {
    }

    private final void d(Activity activity) {
    }

    private final void e(Activity activity) {
    }

    private final void f(Activity activity) {
    }

    private final void g(Activity activity) {
    }

    private final void h(Activity activity) {
    }

    private final void i(Activity activity) {
    }

    private final void j(Activity activity, Bundle bundle) {
    }

    private final void k(Activity activity, Bundle bundle) {
    }

    private final void l(Activity activity, Bundle bundle) {
    }

    private final void m(Activity activity) {
    }

    private final void n(Activity activity) {
    }

    private final void o(Activity activity) {
    }

    private final void p(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                Intent intent = activity.getIntent();
                if (intent != null) {
                    ArrayDeque arrayDeque = (ArrayDeque) obj;
                    Bundle bundle2 = null;
                    try {
                        Bundle extras = intent.getExtras();
                        if (extras != null) {
                            String string = extras.getString("google.message_id");
                            if (string == null) {
                                string = extras.getString("message_id");
                            }
                            if (!TextUtils.isEmpty(string)) {
                                if (!arrayDeque.contains(string)) {
                                    arrayDeque.add(string);
                                }
                            }
                            bundle2 = extras.getBundle("gcm.n.analytics_data");
                        }
                    } catch (RuntimeException e) {
                        Log.w("FirebaseMessaging", "Failed trying to get analytics data from Intent extras.", e);
                    }
                    if (bundle2 == null ? false : "1".equals(bundle2.getString("google.c.a.e"))) {
                        if (bundle2 != null) {
                            if ("1".equals(bundle2.getString("google.c.a.tc"))) {
                                ov6 ov6VarB = ov6.b();
                                ov6VarB.a();
                                if (ov6VarB.d.a(tf.class) != null) {
                                    ore.m();
                                } else {
                                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                                        Log.d("FirebaseMessaging", "Received event with track-conversion=true. Setting user property and reengagement event");
                                    }
                                    Log.w("FirebaseMessaging", "Unable to set user property for conversion tracking:  analytics library is missing");
                                }
                            } else if (Log.isLoggable("FirebaseMessaging", 3)) {
                                Log.d("FirebaseMessaging", "Received event with track-conversion=false. Do not set user property");
                            }
                        }
                        ouk.d(bundle2, "_no");
                    }
                    break;
                }
                break;
            case 1:
                ((rea) obj).invoke(activity, bundle);
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        int i = this.a;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        int i = this.a;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        switch (this.a) {
            case 0:
            case 1:
                break;
            default:
                boolean z = ((ljk) this.b).h;
                boolean z2 = ((ljk) this.b).i;
                ((ljk) this.b).h = true;
                ((ljk) this.b).i = true;
                if (!z || !z2) {
                    ljk ljkVar = (ljk) this.b;
                    s2f.b(ljkVar.b, null, ljkVar.e, new bdk(5), 1);
                    ((ljk) this.b).b();
                }
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        int i = this.a;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        switch (this.a) {
            case 0:
            case 1:
                break;
            default:
                ((ljk) this.b).g++;
                break;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        switch (this.a) {
            case 0:
            case 1:
                break;
            default:
                ljk ljkVar = (ljk) this.b;
                ljkVar.g--;
                if (ljkVar.h) {
                    ljk ljkVar2 = (ljk) this.b;
                    if (ljkVar2.g == 0) {
                        ljkVar2.h = false;
                        if (((ljk) this.b).i) {
                            ((ljk) this.b).a();
                        }
                    }
                }
                break;
        }
    }

    public /* synthetic */ vn6(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }
}
