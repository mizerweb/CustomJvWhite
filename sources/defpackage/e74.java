package defpackage;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.fragment.app.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class e74 {
    public final LinkedHashMap a = new LinkedHashMap();
    public final LinkedHashMap b = new LinkedHashMap();
    public final LinkedHashMap c = new LinkedHashMap();
    public final ArrayList d = new ArrayList();
    public final transient LinkedHashMap e = new LinkedHashMap();
    public final LinkedHashMap f = new LinkedHashMap();
    public final Bundle g = new Bundle();
    public final /* synthetic */ b h;

    public e74(b bVar) {
        this.h = bVar;
    }

    public final boolean a(int i, int i2, Intent intent) {
        String str = (String) this.a.get(Integer.valueOf(i));
        if (str == null) {
            return false;
        }
        w9 w9Var = (w9) this.e.get(str);
        if ((w9Var != null ? w9Var.a : null) != null) {
            ArrayList arrayList = this.d;
            if (arrayList.contains(str)) {
                w9Var.a.c(w9Var.b.J(intent, i2));
                arrayList.remove(str);
                return true;
            }
        }
        this.f.remove(str);
        this.g.putParcelable(str, new t9(intent, i2));
        return true;
    }

    public final void b(int i, p90 p90Var, Object obj) {
        Bundle bundleExtra;
        int i2;
        b bVar = this.h;
        uik uikVarY = p90Var.y(bVar, obj);
        if (uikVarY != null) {
            new Handler(Looper.getMainLooper()).post(new uc2(this, i, uikVarY, 1));
            return;
        }
        Intent intentK = p90Var.k(obj);
        if (intentK.getExtras() != null && intentK.getExtras().getClassLoader() == null) {
            intentK.setExtrasClassLoader(bVar.getClassLoader());
        }
        if (intentK.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
            bundleExtra = intentK.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            intentK.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
        } else {
            bundleExtra = null;
        }
        Bundle bundle = bundleExtra;
        if ("androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(intentK.getAction())) {
            String[] stringArrayExtra = intentK.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
            if (stringArrayExtra == null) {
                stringArrayExtra = new String[0];
            }
            n9.P(bVar, stringArrayExtra, i);
            return;
        }
        if (!"androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(intentK.getAction())) {
            n9.Q(bVar, intentK, i, bundle);
            return;
        }
        rj8 rj8Var = (rj8) intentK.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
        try {
            i2 = i;
            try {
                n9.R(bVar, rj8Var.d(), i2, rj8Var.a(), rj8Var.b(), rj8Var.c(), 0, bundle);
            } catch (IntentSender.SendIntentException e) {
                e = e;
                new Handler(Looper.getMainLooper()).post(new uc2(this, i2, e, 2));
            }
        } catch (IntentSender.SendIntentException e2) {
            e = e2;
            i2 = i;
        }
    }

    public final c46 c(String str, p90 p90Var, u9 u9Var) {
        Number number;
        Integer numValueOf;
        LinkedHashMap linkedHashMap;
        LinkedHashMap linkedHashMap2 = this.b;
        if (((Integer) linkedHashMap2.get(str)) == null) {
            Iterator it = new nf4(new rj7(x9.b, 0, new nre(1))).iterator();
            do {
                if (!it.hasNext()) {
                    ore.f("Sequence contains no element matching the predicate.");
                    return null;
                }
                number = (Number) it.next();
                numValueOf = Integer.valueOf(number.intValue());
                linkedHashMap = this.a;
            } while (linkedHashMap.containsKey(numValueOf));
            int iIntValue = number.intValue();
            linkedHashMap.put(Integer.valueOf(iIntValue), str);
            linkedHashMap2.put(str, Integer.valueOf(iIntValue));
        }
        this.e.put(str, new w9(u9Var, p90Var));
        LinkedHashMap linkedHashMap3 = this.f;
        if (linkedHashMap3.containsKey(str)) {
            Object obj = linkedHashMap3.get(str);
            linkedHashMap3.remove(str);
            u9Var.c(obj);
        }
        Bundle bundle = this.g;
        t9 t9Var = (t9) tre.f0(bundle, str, t9.class);
        if (t9Var != null) {
            bundle.remove(str);
            u9Var.c(p90Var.J(t9Var.b, t9Var.a));
        }
        return new c46(this, str, p90Var);
    }
}
