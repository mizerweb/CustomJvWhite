package defpackage;

import android.content.Context;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.os.Build;
import android.util.Log;
import androidx.camera.camera2.pipe.DoNotDisturbException;
import androidx.camera.core.InitializationException;
import androidx.camera.core.impl.CameraUpdateException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class di2 implements xj8 {
    public final Context a;
    public final r05 b;
    public final Object c = new Object();
    public Map d = s66.a;

    public di2(Context context, r05 r05Var, Set set) throws InitializationException {
        this.a = context;
        this.b = r05Var;
        try {
            a(ww3.T1(set));
        } catch (CameraUpdateException e) {
            throw new InitializationException(e);
        }
    }

    @Override // defpackage.xj8
    public final void a(List list) throws CameraUpdateException {
        List<String> listF1;
        io6 eucVar;
        synchronized (this.c) {
            listF1 = ww3.F1(list, this.d.keySet());
        }
        if (!listF1.isEmpty() && tvj.f(3, "CXCP")) {
            Log.d("CXCP", "Creating new surface combinations for: " + listF1);
        }
        r05 r05Var = this.b;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (!listF1.isEmpty()) {
            try {
                for (String str : listF1) {
                    me2 me2VarA = r05Var.a();
                    ef2.a(str);
                    bg2 bg2VarD = me2VarA.c().c.d(str);
                    ch2 ch2Var = new ch2(bg2VarD, new a4h((StreamConfigurationMap) ((qb2) bg2VarD).c(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP), new sjc(bg2VarD)));
                    Context context = this.a;
                    q86 q86Var = new q86(str, ch2Var.a());
                    if (Build.VERSION.SDK_INT >= 35) {
                        lg2 lg2Var = (lg2) r05Var.a.c;
                        n1g.l(lg2Var);
                        eucVar = new euc(bg2VarD, lg2Var, ch2Var, 8);
                    } else {
                        eucVar = io6.p0;
                    }
                    linkedHashMap.put(str, new pbh(context, bg2VarD, q86Var, eucVar));
                }
            } catch (DoNotDisturbException e) {
                throw new CameraUpdateException("Failed to query camera metadata", e);
            } catch (Exception e2) {
                throw new CameraUpdateException("Failed to build surface combinations", e2);
            }
        }
        synchronized (this.c) {
            try {
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    String str2 = (String) it.next();
                    if (this.d.containsKey(str2)) {
                        linkedHashMap2.put(str2, this.d.get(str2));
                    }
                }
                linkedHashMap2.putAll(linkedHashMap);
                this.d = linkedHashMap2;
                if (tvj.f(3, "CXCP")) {
                    Log.d("CXCP", "Committed new surface combination map. Total cameras: " + linkedHashMap2.size());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
