package defpackage;

import android.os.Bundle;
import androidx.fragment.app.b;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class z64 implements rtb {
    public final /* synthetic */ int a;
    public final /* synthetic */ b b;

    public /* synthetic */ z64(b bVar, int i) {
        this.a = i;
        this.b = bVar;
    }

    @Override // defpackage.rtb
    public final void a() {
        int i = this.a;
        b bVar = this.b;
        switch (i) {
            case 0:
                Bundle bundleA = ((b1f) bVar.d.c).a("android:support:activity-result");
                if (bundleA != null) {
                    e74 e74Var = bVar.h;
                    LinkedHashMap linkedHashMap = e74Var.b;
                    LinkedHashMap linkedHashMap2 = e74Var.a;
                    Bundle bundle = e74Var.g;
                    ArrayList<Integer> integerArrayList = bundleA.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
                    ArrayList<String> stringArrayList = bundleA.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
                    if (stringArrayList != null && integerArrayList != null) {
                        ArrayList<String> stringArrayList2 = bundleA.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
                        if (stringArrayList2 != null) {
                            e74Var.d.addAll(stringArrayList2);
                        }
                        Bundle bundle2 = bundleA.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
                        if (bundle2 != null) {
                            bundle.putAll(bundle2);
                        }
                        int size = stringArrayList.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            String str = stringArrayList.get(i2);
                            if (linkedHashMap.containsKey(str)) {
                                Integer num = (Integer) linkedHashMap.remove(str);
                                if (!bundle.containsKey(str)) {
                                    e9i.j(linkedHashMap2);
                                    linkedHashMap2.remove(num);
                                }
                            }
                            int iIntValue = integerArrayList.get(i2).intValue();
                            String str2 = stringArrayList.get(i2);
                            linkedHashMap2.put(Integer.valueOf(iIntValue), str2);
                            e74Var.b.put(str2, Integer.valueOf(iIntValue));
                        }
                        break;
                    }
                }
                break;
            default:
                va7 va7Var = (va7) bVar.s.a;
                va7Var.j.b(va7Var, va7Var, null);
                break;
        }
    }
}
