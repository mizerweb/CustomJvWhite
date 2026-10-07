package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.fragment.app.b;
import androidx.fragment.app.c;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.collections.a;

/* JADX INFO: loaded from: classes.dex */
public final class v9 extends p90 {
    public final /* synthetic */ int i;

    public /* synthetic */ v9(int i) {
        this.i = i;
    }

    @Override // defpackage.p90
    public final Object J(Intent intent, int i) {
        switch (this.i) {
            case 0:
                if (i == -1 && intent != null) {
                    String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                    int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
                    if (intArrayExtra != null && stringArrayExtra != null) {
                        ArrayList arrayList = new ArrayList(intArrayExtra.length);
                        for (int i2 : intArrayExtra) {
                            arrayList.add(Boolean.valueOf(i2 == 0));
                        }
                        return wm9.W0(ww3.Z1(a.Y0(stringArrayExtra), arrayList));
                    }
                }
                return s66.a;
            case 1:
                return new t9(intent, i);
            default:
                return new t9(intent, i);
        }
    }

    @Override // defpackage.p90
    public final Intent k(Object obj) {
        Bundle bundleExtra;
        switch (this.i) {
            case 0:
                return new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", (String[]) obj);
            case 1:
                return (Intent) obj;
            default:
                rj8 rj8VarA = (rj8) obj;
                Intent intent = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
                Intent intentA = rj8VarA.a();
                if (intentA != null && (bundleExtra = intentA.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
                    intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                    intentA.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                    if (intentA.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                        p21 p21Var = new p21(rj8VarA.d());
                        p21Var.f(null);
                        p21Var.g(rj8VarA.c(), rj8VarA.b());
                        rj8VarA = p21Var.a();
                    }
                }
                intent.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", rj8VarA);
                if (c.K(2)) {
                    Log.v("FragmentManager", "CreateIntent created the following intent: " + intent);
                }
                return intent;
        }
    }

    @Override // defpackage.p90
    public uik y(b bVar, Object obj) {
        switch (this.i) {
            case 0:
                String[] strArr = (String[]) obj;
                int i = 1;
                if (strArr.length == 0) {
                    return new uik(i, s66.a);
                }
                for (String str : strArr) {
                    if (np4.c(bVar, str) != 0) {
                        return null;
                    }
                }
                int iP0 = wm9.P0(strArr.length);
                if (iP0 < 16) {
                    iP0 = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iP0);
                for (String str2 : strArr) {
                    linkedHashMap.put(str2, Boolean.TRUE);
                }
                return new uik(i, linkedHashMap);
            default:
                return super.y(bVar, obj);
        }
    }
}
