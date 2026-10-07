package defpackage;

import android.os.Bundle;
import androidx.fragment.app.b;
import androidx.fragment.app.c;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class y64 implements a1f {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ y64(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.a1f
    public final Bundle a() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                Bundle bundle = new Bundle();
                e74 e74Var = ((b) obj).h;
                e74Var.getClass();
                LinkedHashMap linkedHashMap = e74Var.b;
                bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(linkedHashMap.values()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(linkedHashMap.keySet()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(e74Var.d));
                bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", new Bundle(e74Var.g));
                return bundle;
            case 1:
                b bVar = (b) obj;
                while (b.q(bVar.p())) {
                }
                bVar.t.d(m09.ON_STOP);
                return new Bundle();
            default:
                return ((c) obj).Y();
        }
    }
}
