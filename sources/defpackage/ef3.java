package defpackage;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes.dex */
public final class ef3 {
    public final dp5 a;
    public final dp5 b;
    public final dp5 c;
    public final dp5 d;
    public final dp5 e;

    public ef3(dp5 dp5Var, dp5 dp5Var2, dp5 dp5Var3, dp5 dp5Var4, dp5 dp5Var5) {
        this.a = dp5Var;
        this.b = dp5Var2;
        this.c = dp5Var3;
        this.d = dp5Var4;
        this.e = dp5Var5;
    }

    public final CharSequence a(rt2 rt2Var) {
        nx2 nx2Var;
        gx2 gx2Var;
        vg4 vg4Var;
        List list;
        if (rt2Var.D0()) {
            return ((p4c) this.b.get()).a.getString(R.string.service_notifications);
        }
        if (rt2Var.b0()) {
            return ((p4c) this.b.get()).a.getString(R.string.bot);
        }
        vg4 vg4VarW = rt2Var.w();
        if (vg4VarW != null) {
            return ((yfd) this.d.get()).y(vg4VarW);
        }
        if (!rt2Var.e0()) {
            if (rt2Var.d0()) {
                return ldf.j.h(((p4c) this.b.get()).a, rt2Var.b.b());
            }
            if (rt2Var.Z()) {
                if (rt2Var.b.L.f()) {
                    synchronized (rt2Var.g) {
                        try {
                            vg4Var = (!rt2Var.Z() || rt2Var.g.isEmpty()) ? null : (vg4) rt2Var.g.get(0);
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    if (vg4Var != null) {
                        return vg4Var.k();
                    }
                } else if (!ch3.r(rt2Var.b.L.k())) {
                    return String.format(((p4c) this.b.get()).a.getString(R.string.tt_chat_admin_group_name_subtitle), rt2Var.b.L.k());
                }
            } else if (rt2Var.n0() && (nx2Var = rt2Var.b) != null && (gx2Var = nx2Var.L) != null) {
                if (!gx2Var.f()) {
                    p4c p4cVar = (p4c) this.b.get();
                    p4cVar.getClass();
                    boolean zIsEmpty = TextUtils.isEmpty(null);
                    Context context = p4cVar.a;
                    return !zIsEmpty ? String.format(context.getString(R.string.tt_chat_group_name_subtitle), null) : context.getString(R.string.tt_chat_group_subtitle);
                }
                if (!ch3.r(rt2Var.b.L.k())) {
                    p4c p4cVar2 = (p4c) this.b.get();
                    String strK = rt2Var.b.L.k();
                    p4cVar2.getClass();
                    boolean zIsEmpty2 = TextUtils.isEmpty(strK);
                    Context context2 = p4cVar2.a;
                    return !zIsEmpty2 ? String.format(context2.getString(R.string.tt_chat_group_name_subtitle), strK) : context2.getString(R.string.tt_chat_group_subtitle);
                }
            }
            return null;
        }
        List list2 = rt2Var.g;
        boolean zIsEmpty3 = list2.isEmpty();
        nx2 nx2Var2 = rt2Var.b;
        if (zIsEmpty3) {
            if (nx2Var2.b() == 0) {
                return "";
            }
            return (rt2Var.C0() && rt2Var.b.b() == 1) ? ((p4c) this.b.get()).a.getString(R.string.tt_chat_participants_empty__subtitle) : woh.q(R.plurals.tt_chat_subtitle_count, rt2Var.b.b(), ((p4c) this.b.get()).a);
        }
        int iB = nx2Var2.b();
        if (!((od4) this.a.get()).d() || !rt2Var.C0() || rt2Var.b.e.size() < rt2Var.b.b()) {
            return woh.q(R.plurals.tt_chat_subtitle_count, iB, ((p4c) this.b.get()).a);
        }
        yfd yfdVar = (yfd) this.c.get();
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            list = Collections.EMPTY_LIST;
        } else {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list2) {
                try {
                    if (yfdVar.B(((vg4) obj).v()).b == agd.ONLINE) {
                        arrayList.add(obj);
                    }
                } catch (Throwable th2) {
                    qr7.o(th2);
                    return null;
                }
            }
            list = arrayList;
        }
        int size = list.size();
        p4c p4cVar3 = (p4c) this.b.get();
        p4cVar3.getClass();
        return (size + 1) + " " + p4cVar3.a.getString(R.string.tt_of) + " " + iB + " " + p4cVar3.a.getString(R.string.tt_contact_status_online).toLowerCase();
    }
}
