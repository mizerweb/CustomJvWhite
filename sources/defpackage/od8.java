package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collection;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicLong;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class od8 implements dk5 {
    public final ny8 a;
    public final long b;
    public final mjg c;

    public od8(ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4) {
        Object poeVar;
        ArrayList arrayListG1;
        String strZ1;
        this.a = ny8Var;
        AtomicLong atomicLong = ej5.b;
        long jIncrementAndGet = atomicLong.incrementAndGet();
        long jIncrementAndGet2 = atomicLong.incrementAndGet();
        long jIncrementAndGet3 = atomicLong.incrementAndGet();
        this.b = atomicLong.incrementAndGet();
        c79 c79VarW = yab.w();
        ((wxb) ny8Var4.getValue()).getClass();
        ((wxb) ny8Var4.getValue()).getClass();
        c79VarW.add(new e55(jIncrementAndGet3, new xnh("26.28.0(6804)"), 0, new tnh(R.string.oneme_settings_app_version), null, 20));
        c79VarW.add(new e55(jIncrementAndGet, new xnh(String.valueOf(((s7f) ((et3) ny8Var2.getValue())).t())), 0, new tnh(R.string.oneme_settings_user_id), null, 20));
        c79VarW.add(new e55(jIncrementAndGet2, new xnh(((ek5) ny8Var3.getValue()).a()), 0, new xnh(ApiProtocol.PARAM_DEVICE_ID), null, 20));
        String str = (String) ((ek5) ny8Var3.getValue()).f.get();
        UUID uuid = null;
        if (str != null) {
            try {
                poeVar = UUID.fromString(str);
            } catch (Throwable th) {
                poeVar = new poe(th);
            }
            uuid = (UUID) (poeVar instanceof poe ? null : poeVar);
        }
        if (uuid == null || (strZ1 = uuid.toString()) == null) {
            int iCurrentTimeMillis = (int) (System.currentTimeMillis() % 100);
            Iterable it2Var = new it2('a', 'z');
            it2 it2Var2 = new it2('A', 'Z');
            if (it2Var instanceof Collection) {
                arrayListG1 = ww3.G1(it2Var2, (Collection) it2Var);
            } else {
                ArrayList arrayList = new ArrayList();
                cx3.Z0(it2Var, arrayList);
                cx3.Z0(it2Var2, arrayList);
                arrayListG1 = arrayList;
            }
            ArrayList arrayListG2 = ww3.G1(new it2('0', '9'), arrayListG1);
            ArrayList arrayList2 = new ArrayList(iCurrentTimeMillis);
            for (int i = 0; i < iCurrentTimeMillis; i++) {
                h4e h4eVar = i4e.a;
                Character ch = (Character) ww3.I1(arrayListG2);
                ch.getClass();
                arrayList2.add(ch);
            }
            strZ1 = ww3.z1(arrayList2, "", null, null, null, 62);
        }
        c79VarW.add(new e55(this.b, new xnh(strZ1), 0, new xnh(""), null, 20));
        this.c = p90.a(yab.j(c79VarW));
    }

    @Override // defpackage.dk5
    public final gjg a() {
        return this.c;
    }

    @Override // defpackage.dk5
    public final void b(e55 e55Var) {
        ny8 ny8Var = this.a;
        Context context = (Context) ny8Var.getValue();
        CharSequence charSequenceB = e55Var.b.b((Context) ny8Var.getValue());
        it3.a(context, charSequenceB != null ? charSequenceB.toString() : null);
    }
}
